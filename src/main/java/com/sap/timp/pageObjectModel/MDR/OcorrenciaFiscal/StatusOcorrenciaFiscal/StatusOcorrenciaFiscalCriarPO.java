package com.sap.timp.pageObjectModel.MDR.OcorrenciaFiscal.StatusOcorrenciaFiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.escape.Escaper;
import com.sap.timp.base.TestBaseSteven;

public class StatusOcorrenciaFiscalCriarPO extends TestBaseSteven{

	
	@FindBy(xpath = "//span[text()=\"Ocorrência Fiscal\"]")
	public WebElement ocorrenciaFiscal;
	
	@FindBy(xpath = "//span[text()=\"Status de Ocorrência Fiscal\"]")
	public WebElement statusOcorrencia;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"state\"]/div/div/div/div[2]")
	public WebElement ufFilial;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//button[@id=\"statusButton\"]")
	public WebElement status;
	
	@FindBy(xpath = "//div[@id=\"firstStatus\"]/div/div/div[2]")
	public WebElement statusInicial;
	
	@FindBy(xpath = "//div[@id=\"lastStatus\"]/div/div/div[2]")
	public WebElement statusFinal;
	
	@FindBy(xpath = "//textarea")
	public WebElement descricao;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Data Inicial\")]")
	public WebElement dataVigencia;
	
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;	
	
	@FindBy(xpath = "//body")
	public WebElement body;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public StatusOcorrenciaFiscalCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		ocorrenciaFiscal.click();
		sleep(2000);
		statusOcorrencia.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		opcao.click();
		new Actions(driver).moveToElement(empresa).click().perform();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"state\"]/div", "class", "input-element-wrapper");
		
		ufFilial.click();
		sleep(1000);
		opcao.click();
		new Actions(driver).moveToElement(ufFilial).click().perform();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "input-element-wrapper");
		
		filial.click();
		sleep(1000);
		opcao.click();
		new Actions(driver).moveToElement(filial).click().perform();
		sleep(1000);
		
		status.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		statusInicial.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		new Actions(driver).moveToElement(statusInicial).click().perform();
		sleep(1000);
		
		statusFinal.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		new Actions(driver).moveToElement(statusFinal).click().perform();
		sleep(1000);
		
		fechar.click();
		sleep(2000);
		
		descricao.sendKeys("Teste de Status da Ocorrência Fiscal");

		dataVigencia.sendKeys(fechaActual());
		sleep(1000);
		
		sleep(2000);
	//	gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("StatusOcorrenciaFiscal",idB);
		
		sleep(2000);
		System.out.println(id);
		System.out.println(idB);
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);

		boolean sucesso = false;
		
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		return sucesso;
		
		
	}	
}
