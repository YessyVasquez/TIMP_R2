package com.sap.timp.pageObjectModel.MDR.CadastroDerex.InstituicaoFinanceira;

import javax.swing.text.AbstractDocument.LeafElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class InstitucaoCriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"Cadastro DEREX\"]")
	public WebElement derex;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"thead\"]/div/div[3]")
	public WebElement idC;
	
	@FindBy(xpath = "//li/div/span[text()=\"Instituição Financeira\"]")
	public WebElement instituicaoF;
	
	@FindBy(xpath = "//button/span[text()=\"Nova Instituição Financeira\"]")
	public WebElement nova;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/input")
	public WebElement empresa;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id]")
	public WebElement empresaO;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/input")
	public WebElement filial;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id]")
	public WebElement filialO;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement tributoO;
	
	@FindBy(xpath = "//div[@id=\"financialInstitution\"]/div/div/input")
	public WebElement instituicao;
	
	@FindBy(xpath = "//div[@id=\"country\"]/div/div[2]")
	public WebElement pais;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id]")
	public WebElement paisO;
	
	@FindBy(xpath = "//div[@id=\"options\"]/div/div/div[2]")
	public WebElement moedaOrdem;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id]")
	public WebElement moedaOrdemO;
	
	@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div/input")
	public WebElement validF;
	
	@FindBy(xpath = "//div[@id=\"coin\"]/div/div[2]")
	public WebElement moeda;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id]")
	public WebElement moedaO;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	*/
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	public InstitucaoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	

	public boolean criar() {
		
		derex.click();
		sleep(1000);
		instituicaoF.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		
		nova.click();
		sleep(2000);
		attributeToBeXpath("//div[@id=\"company\"]/div", "class", "base-select required");
		//waitExpectElement(biblioteca);
		//waitExpectXpath("//*[@id=\"Editcontainer\"]/div[4]/div/div/div/img");
		sleep(2000);
		empresa.click();
		sleep(1000);
		empresaO.click();
		sleep(2000);
	//	attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-select required");
		sleep(9000);
		
		filial.click();
		sleep(1000);
		filialO.click();
		
		sleep(2000);
		tributo.click();
		sleep(2000);
		tributoO.click();
		tributoO.sendKeys(Keys.ESCAPE);
		
		sleep(2000);
		
		instituicao.sendKeys("TA Instituição Financeira");
		
		sleep(2000);
		
		pais.click();
		sleep(1000);
		paisO.click();
		sleep(1000);
		
		actionsMoveToElementXpath("//input[@placeholder=\"Selecionar Validade Até\"]");
		sleep(2000);
		moedaOrdem.click();
		sleep(1000);
		moedaOrdemO.click();
		sleep(1000);
		attributeToBeXpath("//div[@id=\"coin\"]/div", "class", "base-autocomplete required");
		
		sleep(2000);
		moeda.click();
		sleep(1000);
		actionsMoveToElementElement(moedaO);
		sleep(1000);
		moedaO.click();
		
		
		String validFrom = fechaActual();
		
		validF.sendKeys(validFrom);
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(3000);
		waitExpectElement(siguiente);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("InstituicaoFinanceira",idB);
		sleep(2000);
	
		double idbD = convertToDouble(idB);
		double idD = convertToDouble(id);
		System.out.println(idD);
		System.out.println(idbD);

		
		boolean sucesso = false;
		
		if (idbD>idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		return sucesso;	
		
	}
	
}
