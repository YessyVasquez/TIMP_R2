package com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.ContasDefaultPorTributo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ContasDefaultPorTributoCriarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Parâmetros de Contabilização\"]")
	public WebElement parametrosdecontabilizacao;
	
	
	@FindBy(xpath = "//span[text()=\"Contas Default por Tributo (Substituir Conta Estoque)\"]")
	public WebElement contasdefaultportributo;
	
	@FindBy(xpath = "//span[text()=\"Nova Conta Default por Tributo\"]")
	public WebElement novacontadefaultportributo;
	
	@FindBy(xpath = "//div[@class=\"field-element companyId_0_0\"]/div/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@class=\"field-element branchId_0_0\"]/div/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaofilial;
	
	
	@FindBy(xpath = "//div[@class=\"field-element adjustmentCode_0_1\"]/div/div/div/div[2]")
	public WebElement codigodeajuste;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]")
	public WebElement opcaocodigodeajuste;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Conta de Débito\"]")
	public WebElement contadebito;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Conta de Crédito\"]")
	public WebElement contacredito;
	
	
	public ContasDefaultPorTributoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		parametrosdecontabilizacao.click();
		sleep(2000);
		contasdefaultportributo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		novacontadefaultportributo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		
		sleep(2000);
		
		opcaoempresa.click();
		
		sleep(2000);
		Actions action = new Actions(driver); 
		action.sendKeys(Keys.ESCAPE).build().perform(); 
		sleep(6000);
		
		filial.click();
		
		sleep(2000);
		
		opcaofilial.click();
		
		sleep(2000);
		
		//Actions action1 = new Actions(driver); 
		action.sendKeys(Keys.ESCAPE).build().perform();
		action.sendKeys(Keys.ESCAPE).build().perform();
		//filial.sendKeys(Keys.ESCAPE);
		//dobleClickElement(filial);
		attributeToBeXpath("//div[@class=\"field-element adjustmentCode_0_1\"]/div","class", "input-element-wrapper");
		sleep(2000);

		codigodeajuste.click();
		
		sleep(2000);
		
		opcaocodigodeajuste.click();
		
		sleep(2000);
		contadebito.sendKeys("1234567890");
		sleep(2000);
		contacredito.sendKeys("9876543210");
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir("ContasDefaultPorTributo",id2);
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
		
		
		System.out.println(sucesso);
		return sucesso;
	}		

}
