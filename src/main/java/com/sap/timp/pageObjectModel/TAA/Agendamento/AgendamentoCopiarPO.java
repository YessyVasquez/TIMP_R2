package com.sap.timp.pageObjectModel.TAA.Agendamento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class AgendamentoCopiarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Agendamento\"]")
	public WebElement abaAgendamento;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-s_tax_00\"]")
	public WebElement menuIcms;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	public AgendamentoCopiarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criarCopiar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		abaAgendamento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menuIcms.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Primer ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
			System.out.println("ID Primer Registro: " + id);
		}
		
		String idRegistro = idObter("Agendamento");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Cópia\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(btnSim);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimeraPagina.click();		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		boolean sucesso = false;
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		
		// Se obtiene el primer registro de la tabla
		String idPrimerRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText(); 
		System.out.println("");
		System.out.println("ID Primer nuevo registro: " + idPrimerRegistro);
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idPrimerRegistro);
		
		//compara pra ver se o novo id criado é realmente o ultimo		  
		if (id2 > id1) { 
			sucesso = true; 
			System.out.println("Registro copiado satisfactoriamente...");
		}else {
			System.out.println("No se pudo copiar el registro...");
			return sucesso;
		}
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idPrimerRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idPrimerRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnAceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		btnPrimeraPagina.click();		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		
		// Se obtiene el primer registro de la tabla
		String idPrimerRegistroAlExcluir = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText(); 
		System.out.println("");
		System.out.println("ID Primer nuevo registro al excluir: " + idPrimerRegistro);
		
		int id3 = convertToInt(idPrimerRegistro);
		int id4 = convertToInt(idPrimerRegistroAlExcluir);
		
		//compara pra ver se o novo id criado é realmente o ultimo		  
		if (id4 != id3) { 
			sucesso = true; 
			System.out.println("Registro excluido satisfactoriamente...");
		}else {
			System.out.println("No se pudo excluir el registro...");
			sucesso = false;
		}
		
		return sucesso;
	}
}
