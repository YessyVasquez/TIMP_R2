package com.sap.timp.pageObjectModel.MDR.SaldoInicialDiferido;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class SaldoInicialDiferidoCriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Saldo Inicial Diferido\"]")
	public WebElement saldoinicialdiferido;
	
	@FindBy(xpath = "//span[text()=\"Novo Saldo Inicial Diferido\"]")
	public WebElement novosaldo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoempresa;
	
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id][text()=\"ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@id=\"m010-code\"]/div/div/div[2]")
	public WebElement codigo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaocodigo;
	
	@FindBy(xpath = "//div[@id=\"reference\"]/div/div/div[2]")
	public WebElement referencia;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoreferencia;
	
	@FindBy(xpath = "//div[@id=\"month\"]/div/div/div[2]")
	public WebElement mes;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaomes;
	
	@FindBy(xpath = "//div[@id=\"year\"]/div/div/div[2]")
	public WebElement ano;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoano;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Saldo\"]")
	public WebElement saldo;
	
	
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
	
	
	
	public SaldoInicialDiferidoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		saldoinicialdiferido.click();
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
		novosaldo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		
		sleep(2000);
		
		opcaoempresa.click();
		
		sleep(2000);
		
		
		tributo.click();
		
		sleep(2000);
		
		opcaotributo.click();
		
		sleep(2000);
		
		codigo.click();
		
		sleep(2000);
		
		opcaocodigo.click();
		
		
		sleep(2000);
		
		
		referencia.click();
		sleep(2000);
		
		opcaoreferencia.click();
		sleep(2000);
		
		mes.click();
		
		sleep(2000);
		
		opcaomes.click();
		
		sleep(2000);
		
		ano.click();
		
		sleep(2000);
		
		opcaoano.click();
		
		sleep(2000);
		
		saldo.sendKeys("1000");
		
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
		
		
		idInserir("SaldoInicialDiferido",id2);
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
