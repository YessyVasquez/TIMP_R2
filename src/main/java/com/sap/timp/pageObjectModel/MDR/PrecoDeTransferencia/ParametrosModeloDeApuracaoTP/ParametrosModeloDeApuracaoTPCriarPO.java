package com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ParametrosModeloDeApuracaoTP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParametrosModeloDeApuracaoTPCriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Preço de Transferência\"]")
	public WebElement precodetransferencia;
	
	@FindBy(xpath = "//span[text()=\"Parâmetros Modelos de Apuração TP\"]")
	public WebElement parametrosmodelodeapuracao;
	
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
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@id=\"model\"]/div/div/div[2]")
	public WebElement modelo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"calcMoment\"]/div/div/div[2]")
	public WebElement momentodocalculo;
	
	
	@FindBy(xpath = "//div[@id=\"adjustOption\"]/div/div/div[2]")
	public WebElement opcaodoajuste;
	
	
	
	@FindBy(xpath = "//div[@id=\"priceCheck\"]/div/div/div[2]")
	public WebElement comprovacaodosprecos;
	
	@FindBy(xpath = "//div[@id=\"1\"]/div/label/span")
	public WebElement opcaocomprovacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Inicio de validade\"]")
	public WebElement dataincial;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	public ParametrosModeloDeApuracaoTPCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		precodetransferencia.click();
		sleep(2000);
		
		parametrosmodelodeapuracao.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		}
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		novoparametro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		
		sleep(2000);
		
		opcaoempresa.click();
		
		sleep(2000);
		
		body.click();
		
		sleep(2000);
		
		modelo.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		momentodocalculo.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		opcaodoajuste.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		comprovacaodosprecos.click();
		
		sleep(2000);
		
		opcaocomprovacao.click();
		
		sleep(2000);
		
		body.click();
		
		sleep(2000);
		
		
		
		
		String data = fechaActual();
		dataincial.sendKeys(data);
		
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
		
		
		idInserir("ParametrosModeloDeApuracaoTP",id2);
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
