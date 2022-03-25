package com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.DeXParaContraPartida;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class DeXParaContraPartidaCriarPO extends TestBaseFernando{
	@FindBy(xpath = "//li[@identifier=\"accordion-item-ecdSupportingTables\"]")
	public WebElement tabelaDeApoioECD;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-fromXToCounterpart\"]")
	public WebElement deXParaContraPartida;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Novo De X para Contra-Partida\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//div[@id=\"field-item-1\"]/div/div/div[2]")
	public WebElement cboItem;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and text()=\"103031\"]")
	public WebElement opcItem;
	
	@FindBy(xpath = "//div[@id=\"field-item-counterpart-1\"]/div/div/div[2]")
	public WebElement cboContraPartida;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"103031\"]")
	public WebElement opcContraPartida;
	
	@FindBy(xpath = "//div[@id=\"field-item-documentType-1\"]/div/div/div[2]")
	public WebElement cboTipoDocumento;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and text()=\"XG\"]")
	public WebElement opcTipoDocumento;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	public DeXParaContraPartidaCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tabelaDeApoioECD.click();
		sleep(1000);
		
		deXParaContraPartida.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		}
		
		System.out.println("Ultimo registro: " + id);			
		sleep(2000);	
		
		btnNovo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboItem.click();
		sleep(1000);
		opcItem.click();
		sleep(1000);
		
		cboContraPartida.click();
		sleep(1000);
		opcContraPartida.click();
		sleep(1000);
		closeSelectTypeCheckbox(cboContraPartida);
		
		cboTipoDocumento.click();
		sleep(1000);
		opcTipoDocumento.click();
		sleep(1000);
		
		btnGravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnSim.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		boolean sucesso = false;
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		  
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		
		  
		sleep(2000); 
		System.out.println(id); 
		System.out.println(idB);
		  
		double idD = Integer.valueOf(id); 
		double idBD = Integer.valueOf(idB);
		  
		//compara pra ver se o novo id criado é realmente o ultimo
		  
		if (idBD > idD) { 
			sucesso = true; 
			idInserir("DeXParaContraPartida", idB);
		}else { 
			sucesso = false; 
		}
		  
		return sucesso;	
	}
}
