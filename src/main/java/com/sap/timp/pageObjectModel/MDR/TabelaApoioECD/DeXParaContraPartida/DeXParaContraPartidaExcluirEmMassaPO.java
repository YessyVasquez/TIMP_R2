package com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.DeXParaContraPartida;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class DeXParaContraPartidaExcluirEmMassaPO extends TestBaseFernando{
	@FindBy(xpath = "//li[@identifier=\"accordion-item-ecdSupportingTables\"]")
	public WebElement tabelaDeApoioECD;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-fromXToCounterpart\"]")
	public WebElement dXParaContraPartida;
	
	@FindBy(xpath = "//span[text()=\"Novo De X para Contra-Partida\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//div[@id=\"field-item-1\"]/div/div/div[2]")
	public WebElement cboItem1;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @tabindex=\"0\" and @id=\"option-2\"]")
	public WebElement opcionItem1;
	
	@FindBy(xpath = "//div[@id=\"field-item-counterpart-1\"]/div/div/div[2]")
	public WebElement cboItemContraPartida1;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"103031\"]")
	public WebElement opcionItemContraPartida1;
	
	@FindBy(xpath = "//div[@id=\"field-item-documentType-1\"]/div/div/div[2]")
	public WebElement cboTipoDocumento;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and text()=\"XG\"]")
	public WebElement opcionTipoDocumento;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[@class = \"button-icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement btnExcluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	public DeXParaContraPartidaExcluirEmMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		tabelaDeApoioECD.click();
		
		sleep(2000);
		dXParaContraPartida.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");		
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		System.out.println("");
		System.out.println("Rows: " + rows);
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println(id);
		}	
		
		btnNovo.click();		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboItem1.click();
		sleep(1000);
		opcionItem1.click();
		sleep(1000);
		
		cboItemContraPartida1.click();
		sleep(1000);
		opcionItemContraPartida1.click();
		closeSelectTypeCheckbox(cboItemContraPartida1);
		sleep(1000);
		
		cboTipoDocumento.click();
		sleep(1000);
		opcionTipoDocumento.click();
		sleep(1000);
		
		btnGravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		waitExpectElement(btnSim);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		btnNovo.click();		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboItem1.click();
		sleep(1000);
		opcionItem1.click();
		sleep(1000);
		
		cboItemContraPartida1.click();
		sleep(1000);
		opcionItemContraPartida1.click();
		closeSelectTypeCheckbox(cboItemContraPartida1);
		sleep(1000);
		
		cboTipoDocumento.click();
		sleep(1000);
		opcionTipoDocumento.click();
		sleep(1000);
		
		btnGravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		waitExpectElement(btnSim);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	

		btnUltimaPagina.click();		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		boolean sucesso = false;
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		  
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		idInserir("DeXParaContraPartidaExcluirEmMassa",idB);
		  
		sleep(2000); 
		System.out.println(id); 
		System.out.println(idB);
		  
		double idD = Integer.valueOf(id); 
		double idBD = Integer.valueOf(idB);
		  
		//compara pra ver se o novo id criado é realmente o ultimo
		  
		if (idBD > idD) { 
			sucesso = true; 
		}else { 
			sucesso = false; 
		}
		  
		return sucesso;
	}
	
	public boolean exluirMassa() {
		sleep(1000);
		if(!btnNovo.isDisplayed()) {
			return false;
		}
		sleep(2000);
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		int idUltimoRegistro = convertToInt(idObter("DeXParaContraPartidaExcluirEmMassa"));
		WebElement marcarCheckbox = driver.findElement(By.xpath("//div[@data-id=\""+idUltimoRegistro+"\"]/div[2]/label/span"));
		System.out.println("Id Ultimo registro: " + idUltimoRegistro); // Ultimo registro que es el que se crea con la automatizacion
		
		sleep(2000);
		marcarCheckbox.click();
		sleep(2000);
		
		int idPenultimoUltimoRegistro = idUltimoRegistro - 1;
		marcarCheckbox = driver.findElement(By.xpath("//div[@data-id=\""+idPenultimoUltimoRegistro+"\"]/div[2]/label/span"));
		System.out.println("Id Penultimo registro: " + idPenultimoUltimoRegistro); // Penultimo registro que es el que se crea con la automatizacion
		
		sleep(2000);
		marcarCheckbox.click();
		sleep(2000);
		
		btnExcluirMassa.click();
		sleep(2000);
		waitExpectElement(btnAceitar);
		btnAceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		System.out.println("");
		System.out.println("Rows: " + rows);
		
		String idUltimoRegistroDespuesDeEliminar = "0";
		
		if(rows > 0) {
			idUltimoRegistroDespuesDeEliminar = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		}
		
		int id1 = convertToInt(idUltimoRegistroDespuesDeEliminar);
		int id2 = idUltimoRegistro;
		int id3 = idPenultimoUltimoRegistro;
		
		System.out.println("Ultimo registro al eliminar en massa: " + id1); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
		System.out.println("Ultimo registro: " + id2);
		System.out.println("Penultimo registro:" + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1 != id3) {
			sucesso= true;
		}
		System.out.println(sucesso);
		return sucesso;
	}
}
