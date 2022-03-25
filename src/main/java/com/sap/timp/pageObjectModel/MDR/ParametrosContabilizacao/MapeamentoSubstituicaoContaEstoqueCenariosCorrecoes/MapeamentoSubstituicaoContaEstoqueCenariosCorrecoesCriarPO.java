package com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesCriarPO extends TestBaseSteven{
	 
	
	
	

	@FindBy(xpath = "//span[text()=\"Parâmetros de Contabilização\"]")
	public WebElement parametro;
	
	@FindBy(xpath = "//li/div/span[contains(text(),\"Mapeamento para Substituição\")]")
	public WebElement contabil;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	

	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement empresaO;
	

	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement filialO;

	
	@FindBy(xpath = "//input[contains(@placeholder,\"IVA\")]")
	public WebElement iva;
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	

	
	/*
	@FindBy(xpath = "")
	public WebElement ;
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
	
	
	public MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean criar() {
		sleep(2000);
		parametro.click();
		sleep(1000);
		contabil.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		empresaO.click();
		empresaO.sendKeys(Keys.ESCAPE);
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
	
		filial.click();
		sleep(1000);
		filialO.click();
		filialO.sendKeys(Keys.ESCAPE);
		
		sleep(1000);

		iva.sendKeys("15");
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);

		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		sleep(2000);
		idInserir("MapeamentoSubstituicaoContaEstoqueCenariosCorrecoes",id2);
		
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
