package com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegradeAbasCriarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Atribuições de Regras\"]")
	public WebElement AtribuiçõesdeRegras;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[2]/div/ul/li[1]/div/span[2]")
	public WebElement ICMS;
	
	@FindBy(xpath = "//span[text()=\"Regras de Abas\"]")
	public WebElement RegrasdeAbas;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Nova Atribuição Regra\"]")
	public WebElement btnNovoRegra;
	
	@FindBy(xpath = "//input[@placeholder=\"SelecionarTributo\"]")
	public WebElement cboTributo;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @id and @class=\"list-item\" and text()=\"ICMS\"]")
	public WebElement opcionTributo;
	
	@FindBy(xpath = "//div[@id=\"rule-company\"]/div/div/div[2]")
	public WebElement cboEmpresa;
	
	@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	public WebElement opcionEmpresa;
	
	@FindBy(xpath = "//input[@placeholder=\"SelecionarUF Origem\"]")
	public WebElement cboUf;
	
	@FindBy(xpath = "//*[@id=\"SP\"]/div[1]/label/span")
	public WebElement opcionUf;
	
	@FindBy(xpath = "//*[@id=\"AL\"]/div[1]/label/span")
	public WebElement opcionUfTC2;
	
	@FindBy(xpath = "//input[@placeholder=\"SelecionarFilial\"]")
	public WebElement cboFilial;
	
	@FindBy(xpath = "//*[@id=\"1000_SP_0001\"]/div[1]/label/span")
	public WebElement opcionFilial;
	
	@FindBy(xpath = "//*[@id=\"1000_AL_0008\"]/div[1]/label/span")
	public WebElement opcionFilialTC2;
	
	@FindBy(xpath = "//*[@id=\"main-icon\"]")
	public WebElement cboRegra;
	
	@FindBy(xpath = "//li[@id=\"1000\"]")
	public WebElement opcionRegra;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement opcionRegraTC2;
	
	@FindBy(xpath = "//*[@id=\"rule-valid-from\"]/div/div[1]/input")
	public WebElement validaDe;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	public RegradeAbasCriarPO() { 
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;
		boolean tq2  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}else if(url.contains("tq2")){
			tq2 = true;
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		AtribuiçõesdeRegras.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ICMS.click();
		sleep(2000);
		
		RegrasdeAbas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Primer ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
			System.out.println("ID Primer Registro: " + id);
		}
		
		btnNovoRegra.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboTributo.click();
		sleep(1000);
		opcionTributo.click();
		sleep(1000);
		
		cboEmpresa.click();
		sleep(1000);
		opcionEmpresa.click();
		sleep(1000);
		closeSelectTypeCheckbox(cboEmpresa);
	//	opcionEmpresa.sendKeys(Keys. ESCAPE);
		sleep(1000);
		
		
		if (tq1 == true || tp1 == true || tq2 == true) {
			
			cboUf.click();
			sleep(1000);
			opcionUf.click();
			sleep(1000);
			opcionUf.sendKeys(Keys. ESCAPE);
			sleep(1000);
			
			cboFilial.click();
			sleep(1000);
			opcionFilial.click();
			sleep(1000);
			opcionFilial.sendKeys(Keys. ESCAPE);
			sleep(1000);
			
			cboRegra.click();
			sleep(1000);
			opcionRegra.click();
			sleep(1000);

		}else {
		
			cboUf.click();
			sleep(1000);
			opcionUfTC2.click();
			sleep(1000);
			opcionUfTC2.sendKeys(Keys. ESCAPE);
			sleep(1000);
			
			cboFilial.click();
			sleep(1000);
			opcionFilialTC2.click();
			sleep(1000);
			opcionFilialTC2.sendKeys(Keys. ESCAPE);
			sleep(1000);
			
			cboRegra.click();
			sleep(1000);
			opcionRegraTC2.click();
			sleep(1000);
			
		}
		

		
		
	
		validaDe.sendKeys("11/01/2021");
		sleep(1000);

	
		btnGravar.click();
		sleep(2000);

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		System.out.println("Rows:" +rows);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("RegradeAbas",idultimo);

		System.out.println(id);
		System.out.println(idultimo);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idultimo);
		
		boolean sucesso = false;
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		return sucesso;
	}

}
