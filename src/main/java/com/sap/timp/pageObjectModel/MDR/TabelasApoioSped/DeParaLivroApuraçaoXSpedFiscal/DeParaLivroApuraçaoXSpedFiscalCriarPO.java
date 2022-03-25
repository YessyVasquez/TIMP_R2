package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DeParaLivroApuraçaoXSpedFiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DeParaLivroApuraçaoXSpedFiscalCriarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"DE-PARA Livro Apuração X SPED-Fiscal\"]")
	public WebElement livroapuracao;
	
	@FindBy(xpath = "//span[text()=\"Novo DE-PARA Livro Apuração X SPED-Fiscal\"]")
	public WebElement novolivroapuracao;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"tribute\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id][text()=\"ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"tipoTributo\"]/div/div/div[2]")
	public WebElement tipotributo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaotipotributo;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"line\"]/div/div/div[2]")
	public WebElement linha;

	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaolinha;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Início de Vigência \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public DeParaLivroApuraçaoXSpedFiscalCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		
		livroapuracao.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		novolivroapuracao.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tributo.click();
		
		sleep(2000);
		
		opcaotributo.click();
		
		sleep(2000);
		//attributoNotToBeEmptyXpath("//div[@class=\"element\" and @id=\"tribute\"]/div", "value");
		attributeToBeXpath("//div[@class=\"element\" and @id=\"tipoTributo\"]/div", "class", "base-select required");
		sleep(2000);
		tipotributo.click();
		sleep(2000);
		opcaotipotributo.click();
		sleep(2000);
		linha.click();
		sleep(2000);
		opcaolinha.click();
		sleep(2000);
		
		
		String data = fechaActual();
		datavigencia.sendKeys(data);
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		biblioteca.click();
		
		sleep(2000);
		

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectElement(siguiente);
		sleep(4000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir("deparalivroapuracaoxspedfiscal", id2);
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
