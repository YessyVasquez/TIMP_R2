package com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN3.ParametrosGerais;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RegrasDeAuditoriaN3CriarMasCriarComCopiaPO extends TestBaseFernando{
	@FindBy(xpath = "//li[@identifier=\"accordion-item-a_rules\"]/div/span[text()=\"Regras de Auditoria N3\"]")
	public WebElement regraAuditoriaN3;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash_rules\"]")
	public WebElement lixeira;
	
	public RegrasDeAuditoriaN3CriarMasCriarComCopiaPO() {
		PageFactory.initElements(driver, this); 
	}
	
	public boolean criarComCopia() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		regraAuditoriaN3.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//String idRegistro = idObter2();
		String idRegistro = idObter("An3");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Copiar\"]"));
		System.out.println("ID ultimo registro: " + idRegistro);
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(aplicar);
		sleep(9000);
		aplicar.click();
		
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader transp\"]");
		invisibilityOfElement("//div[@class=\"overlay loader transp\"]");
		sleep(2000);	
		
		btnBiblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		regraAuditoriaN3.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = false;
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistroCopia = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("ID Registro copia: " + idRegistroCopia);
		
		if(idRegistroCopia != idRegistro) {
			//idInserir2(idB);
			System.out.println("Copia creada...");
			System.out.println("ID Registro copia: " + idRegistroCopia);	
			
			sucesso = true;
		}else {
			System.out.println("No se creo la copia...");			
			return sucesso;
		}
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopia+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopia+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(btnSim);
		btnSim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//li[@class=\"base-toast  toast-success         \"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//li[@class=\"base-toast  toast-success   \"]");
		sleep(2000);
		
		lixeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistroCopiaLixeira = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("ID Registro Copia en Lixeira: " + idRegistroCopiaLixeira);
		
		if(idRegistroCopiaLixeira != idRegistroCopia) {
			//idInserir2(idB);
			System.out.println("Copia existe en lixeira...");
			System.out.println("ID Registro Copia en Lixeira: " + idRegistroCopiaLixeira);
			
			sucesso = true;
		}else {
			System.out.println("No esta la copia en lixeira...");			
			return sucesso = false;
		}
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopiaLixeira+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopiaLixeira+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(btnSim);
		btnSim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//li[@class=\"base-toast  toast-success         \"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//li[@class=\"base-toast  toast-success   \"]");
		sleep(2000);
		
		regraAuditoriaN3.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idUltimoRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("ID ultimo registro despues de lixeira: " + idUltimoRegistro);
		
		if(idUltimoRegistro.equals(idRegistro)) {
			System.out.println("Es el mismo registro del cual se hizo copia...");			
			return sucesso = true;			
		}else {
			System.out.println("No fue eliminado la copia...");
			System.out.println("ID ultimo registro despues de lixeira: " + idUltimoRegistro);
			sucesso = false;
		}
		
		return sucesso;
	}
}
