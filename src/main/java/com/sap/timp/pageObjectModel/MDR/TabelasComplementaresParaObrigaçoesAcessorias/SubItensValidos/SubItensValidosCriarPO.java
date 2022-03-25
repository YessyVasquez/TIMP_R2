package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.SubItensValidos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class SubItensValidosCriarPO extends TestBaseSteven{
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement tabelacomplementares;
	
	@FindBy(xpath = "//span[text()=\"SubItens Válidos\"]")
	public WebElement subitensvalidos;
	
	@FindBy(xpath = "//span[text()=\"Novo SubIten Válido\"]")
	public WebElement novosubiten;
	
	@FindBy(xpath = "//div[@id=\"obligation\"]/div/div[2]")
	public WebElement obrigacao;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoobrigacao;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  um Código de SubItem\"]")
	public WebElement codigosubitem;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  uma  Ocorrência\"]")
	public WebElement ocorrencia;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  uma  Base Legal\"]")
	public WebElement baselegal;
	
	@FindBy(xpath = "//div[@id=\"operation\"]/div/div/div[2]")
	public WebElement operacao;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaooperacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  uma  Vigência de\"]")
	public WebElement datainicial;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  uma  Vigência até\"]")
	public WebElement dataate;
	
	
	public SubItensValidosCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		tabelacomplementares.click();
		sleep(8000);
		
		subitensvalidos.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println(id);
		}	
		
//		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
//		
//		System.out.println(id);
		
		sleep(2000);
		//criaçao
		novosubiten.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		obrigacao.click();
		
		sleep(2000);
		
		opcaoobrigacao.click();
		
		sleep(2000);
		codigosubitem.sendKeys("66937");
		
		sleep(2000);
		
		ocorrencia.sendKeys("Ocorrencia");
		
		sleep(2000);
		
		baselegal.sendKeys("Base Legal");
		
		sleep(2000);
		
		operacao.click();
		
		sleep(2000);
		
		opcaooperacao.click();
		
		sleep(2000);
		
		String data=fechaActual();
		datainicial.sendKeys(data);
		
		sleep(2000);
		
		String data1= fechaActual();
		dataate.sendKeys(data1);
		
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
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir("SubItensValidos", id2);
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
