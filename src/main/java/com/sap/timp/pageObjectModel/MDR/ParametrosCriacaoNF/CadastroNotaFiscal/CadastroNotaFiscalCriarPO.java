package com.sap.timp.pageObjectModel.MDR.ParametrosCriacaoNF.CadastroNotaFiscal;

import java.lang.invoke.StringConcatFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CadastroNotaFiscalCriarPO extends TestBaseSteven{

	
	@FindBy(xpath = "//span[text()=\"Parâmetros de Criação de Nota Fiscal\"]")
	public WebElement parametrosCriacaoNotaFiscal;
	
	@FindBy(xpath = "//span[text()=\"Cadastro de Nota Fiscal\"]")
	public WebElement cadastroNotaFiscal;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[contains(@class,\"companies\")]/div/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[contains(@class,\"ufs\")]/div/div/div/div[2]")
	public WebElement ufFilial;
	
	@FindBy(xpath = "//div[contains(@class,\"branch\")]/div/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[contains(@class,\"taxes\")]/div/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Taxa de Imposto\")]")
	public WebElement taxa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	
	
	public CadastroNotaFiscalCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		String url = driver.getCurrentUrl();
		
	
		
		sleep(2000);
		parametrosCriacaoNotaFiscal.click();
		sleep(2000);


		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		}
		
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		attributeToBeXpath("//div[contains(@class,\"uf\")]/div", "class", "input-element-wrapper");
		sleep(2000);

		ufFilial.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);

		sleep(1000);
		
		attributeToBeXpath("//div[contains(@class,\"branch\")]/div", "class", "input-element-wrapper");
		sleep(1000);
		
		filial.click();
		sleep(1000);
		opcao.click();
		//opcao.sendKeys(Keys.ESCAPE);
		body.click();
		//opcao.sendKeys(Keys.ESCAPE);
		sleep(1000);
		


		tributo.click();
		sleep(1000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		taxa.sendKeys("20");
		
		
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
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("CadastroNotaFiscal",idB);
		
		sleep(2000);
		System.out.println(id);
		System.out.println(idB);
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;
		
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		return sucesso;
		
		
	}	
}
