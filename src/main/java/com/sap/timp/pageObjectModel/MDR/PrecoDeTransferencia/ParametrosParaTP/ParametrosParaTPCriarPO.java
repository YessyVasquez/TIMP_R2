package com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ParametrosParaTP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParametrosParaTPCriarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Preço de Transferência\"]")
	public WebElement precodetransferencia;
	
	@FindBy(xpath = "//span[text()=\"Parâmetros para TP\"]")
	public WebElement parametrosparatp;
	
	@FindBy(xpath = "//span[text()=\"Novo Parâmetro\"]")
	public WebElement novoparametro;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"clientCode\"]/div/div[2]")
	public WebElement codigodecliente;
	
	@FindBy(xpath = "//div[@id=\"tpDefault\"]/div/div/div[2]")
	public WebElement tpdefault;
	
	
	@FindBy(xpath = "//div[@id=\"related\"]/div/div/div[2]")
	public WebElement coligada;
	
	@FindBy(xpath = "//div[@id=\"outdoorOperation\"]/div/div/div[2]")
	public WebElement operacaoexterior;
	
	@FindBy(xpath = "//div[@id=\"interposedOperation\"]/div/div/div[2]")
	public WebElement operacaointerposta;
	
	@FindBy(xpath = "//div[@id=\"exclusiveOperation\"]/div/div/div[2]")
	public WebElement operacaoexclusiva;
	
	@FindBy(xpath = "//div[@id=\"exemptIROperation\"]/div/div/div[2]")
	public WebElement opercaoisentas;
	
	@FindBy(xpath = "//div[@id=\"taxHavensOperation\"]/div/div/div[2]")
	public WebElement operacaoparaisofiscais;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Inicio de validade\"]")
	public WebElement datainicial;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	public ParametrosParaTPCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		precodetransferencia.click();
		sleep(2000);
		
		parametrosparatp.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		novoparametro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		codigodecliente.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		tpdefault.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		coligada.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		operacaoexterior.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		operacaointerposta.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		operacaoexclusiva.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		opercaoisentas.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		operacaoparaisofiscais.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		
		String data = fechaActual();
		datainicial.sendKeys(data);
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		
		
		idInserir("ParametrosParaTP",id2);
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
