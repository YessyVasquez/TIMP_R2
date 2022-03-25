package com.sap.timp.pageObjectModel.TFP.Configurações.Status.Periodo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ConfiguracoesStatusPeriodoCriarPO extends TestBaseKenssy {
	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement configuracoe;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-Status\"]/div/span[2]")
	public WebElement status;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-PeriodStatusList\"]/div/span[text()=\"Período\"]")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[text()=\"Nova Configuração de Status de Períodos\"]")
	public WebElement nova;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	@FindBy(xpath = "//div[@id=\"3000\"]")
	public WebElement empresaOpc;
	
	@FindBy(xpath = "//div[@id=\"state\"]/div/div/div[2]")
	public WebElement estado;
	@FindBy(xpath = "//div[@id=\"BA\"]")
	public WebElement estadoOPC;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	@FindBy(xpath = "//div[@id=\"0031-BA-3000\"]")
	public WebElement filialOpc;
	
	
	@FindBy(xpath = "//div[@id=\"input-100\"]/div/div/div[2]")
	public WebElement aberto100;
	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div[@class]/label/span")
	public WebElement aberto100Opc;
	
	
	@FindBy(xpath = "//div[@id=\"input-200\"]/div/div/div[2]")
	public WebElement aberto200;
	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div[@class]/label/span")
	public WebElement aberto200Opc1;
	@FindBy(xpath = "//div[@class=\"list-option\"][3]/div/div[@class]/label/span")
	public WebElement aberto200Opc2;
	
	@FindBy(xpath = "//div[@id=\"input-300\"]/div/div/div[2]")
	public WebElement aberto300;
	@FindBy(xpath = "//div[@class=\"list-option\"][4]/div/div[@class]/label/span")
	public WebElement aberto300Opc;
	
	
	@FindBy(xpath = "//div[@id=\"input-400\"]/div/div/div[2]")
	public WebElement aberto400;
	@FindBy(xpath = "//div[@class=\"list-option\"][5]/div/div[@class]/label/span")
	public WebElement aberto400Opc;
	
	
	@FindBy(xpath = "//div[@id=\"input-500\"]/div/div/div[2]")
	public WebElement aberto500;
	@FindBy(xpath = "//div[@class=\"list-option\"][6]/div/div[@class]/label/span")
	public WebElement aberto500Opc;
	
	
	@FindBy(xpath = "//div[@id=\"input-600\"]/div/div/div[2]")
	public WebElement aberto600;
	@FindBy(xpath = "//div[@class=\"list-option\"][4]/div/div[@class]/label/span")
	public WebElement aberto600Opc;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data inicial\"]")
	public WebElement dataincial;

	@FindBy(xpath="//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath="//body")
	public WebElement clickFuera;
	
	
	public ConfiguracoesStatusPeriodoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		configuracoe.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		status.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		periodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
		
		System.out.println(id);
		
		nova.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		empresaOpc.click();
		sleep(2000);
		closeSelectTypeCheckbox(empresa);
		sleep(2000);
		
		
		estado.click();
		sleep(2000);	
		estadoOPC.click();
		sleep(2000);
		closeSelectTypeCheckbox(estado);
		sleep(2000);
		
		
		filial.click();
		sleep(2000);
		filialOpc.click();
		sleep(2000);
		closeSelectTypeCheckbox(filial);
		sleep(2000);
		
		
		
		aberto100.click();
		sleep(2000);
		aberto100Opc.click();
		sleep(2000);
		clickFuera.click();
		sleep(2000);
		
		aberto200.click();
		sleep(2000);
		aberto200Opc1.click();
		sleep(2000);
		aberto200Opc2.click();
		sleep(2000);
		clickFuera.click();
		sleep(2000);
		
		aberto300.click();
		sleep(2000);
		aberto300Opc.click();
		sleep(2000);
		clickFuera.click();
		sleep(2000);
		
		
		aberto400.click();
		sleep(2000);
		aberto400Opc.click();
		sleep(2000);
		clickFuera.click();
		sleep(2000);
		
		aberto500.click();
		sleep(2000);
		aberto500Opc.click();
		sleep(2000);
		clickFuera.click();
		sleep(2000);
		
		aberto600.click();
		sleep(2000);
		aberto600Opc.click();
		sleep(2000);
		clickFuera.click();
		sleep(2000);
		
		
		dataincial.sendKeys("01/01/2014");
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
		
		System.out.println(id);
		sleep(2000);
		idInserir1(id2);
		System.out.println(id2);
		
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(id2);
		
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
