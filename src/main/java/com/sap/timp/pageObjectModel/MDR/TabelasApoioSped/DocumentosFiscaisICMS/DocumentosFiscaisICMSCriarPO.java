package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DocumentosFiscaisICMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DocumentosFiscaisICMSCriarPO extends TestBaseSteven {
	
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"4.1.1 Documentos Fiscais - ICMS\"]")
	public WebElement documentosfiscaisicms;
	
	@FindBy(xpath = "//span[text()=\"Novo Documento Fiscal\"]")
	public WebElement novodocumentofiscal;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Código de Documento Fiscal\"]")
	public WebElement codigodedocumentofiscal;
	
	@FindBy(xpath = "//div[@id=\"taxDocSpecie\" and @class=\"element\"]/div/div/div[2]")
	public WebElement especie;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoespecie;
	
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
	
	
	
	public DocumentosFiscaisICMSCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		
		documentosfiscaisicms.click();
		
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
		novodocumentofiscal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		codigodedocumentofiscal.sendKeys("09879");
		sleep(2000);
		
		especie.click();
		
		sleep(2000);
		
		opcaoespecie.click();
		
		sleep(2000);
		
		String data = fechaActual();
		datavigencia.sendKeys(data);
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		

//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	int botaoNao = rows("//button[text()=\"Não\"]");
		
		if (botaoNao > 0) {
			nao.click();
		}
		
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir("documentosfiscaisicms", id2);
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
