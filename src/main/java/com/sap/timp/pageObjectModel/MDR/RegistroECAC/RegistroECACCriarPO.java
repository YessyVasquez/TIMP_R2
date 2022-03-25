package com.sap.timp.pageObjectModel.MDR.RegistroECAC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;

public class RegistroECACCriarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Registro ECAC\"]")
	public WebElement registroecac;
	
	@FindBy(xpath = "//button[@class=\"library-toolbar-button btn trans highlighted\"]")
	public WebElement novoregistro;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Tipo\"]")
	public WebElement tipo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Código da Receita\"]")
	public WebElement codigodareceita;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Data de Arrecadação\"]")
	public WebElement dataarrecadacao;
	
	@FindBy(xpath = "//div[@id=\"documentNumber\"]/div/div/input")
	public WebElement numerodocumento;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Período de Apuração\"]")
	public WebElement periododeapuracao;
	
	@FindBy(xpath = "//div[@id=\"totalValue\"]/div/div/input")
	public WebElement valortotal;
	
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
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Data de Vencimento\"]")
	public WebElement datavencimento;
	
	public RegistroECACCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		sleep(2000);
		registroecac.click();
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
		}
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		if (tc2 == true || tp1 == true ) {
		novoregistro.click();
		
		attributeToBeXpath("//div[@id=\"company\"]/div", "class", "base-select required");
		sleep(3000);
		empresa.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		uf.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		filial.click();
		
		sleep(2000);
		
		opcao.click();
		
		
		sleep(2000);
		
		tributo.click();
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		tipo.sendKeys("tipo");
		
		sleep(2000);
		
		codigodareceita.sendKeys("777");
		
		sleep(2000);
		
		String data=fechaActual();
		dataarrecadacao.sendKeys(data);
		
		sleep(2000);
		
		numerodocumento.sendKeys("777");
		sleep(2000);
		
		periododeapuracao.sendKeys(data);
		
		sleep(2000);
		
		datavencimento.sendKeys(data);
		
		sleep(2000);
		
		valortotal.sendKeys("1000");
		
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
		
		
		idInserir("RegistroECAC",id2);
		
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
		
		}else {
		novoregistro.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		uf.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		filial.click();
		
		sleep(2000);
		
		opcao.click();
		
		
		sleep(2000);
		
		tributo.click();
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		tipo.sendKeys("tipo");
		
		sleep(2000);
		
		codigodareceita.sendKeys("777");
		
		sleep(2000);
		
		String data=fechaActual();
		dataarrecadacao.sendKeys(data);
		
		sleep(2000);
		
		numerodocumento.sendKeys("777");
		sleep(2000);
		
		periododeapuracao.sendKeys(data);
		
		sleep(2000);
		
		datavencimento.sendKeys(data);
		
		sleep(2000);
		
		valortotal.sendKeys("1000");
		
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
		
		

		idInserir("RegistroECAC", id2);

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

}
