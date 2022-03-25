package com.sap.timp.pageObjectModel.MDR.SaldoInicialDiferido;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class SaldoInicialDiferidoExcluirMassaPO extends TestBaseSteven {
	
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
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravarNovo;
	
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
	
	
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public SaldoInicialDiferidoExcluirMassaPO() {

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
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
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
		gravarNovo.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		novosaldo.click();
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		empresa.click();
//		
//		sleep(2000);
//		
//		opcaoempresa.click();
//		
//		sleep(2000);
//		
//		
//		tributo.click();
//		
//		sleep(2000);
//		
//		opcaotributo.click();
//		
//		sleep(2000);
//		
//		codigo.click();
//		
//		sleep(2000);
//		
//		opcaocodigo.click();
//		
//		
//		sleep(2000);
//		
//		
//		referencia.click();
//		sleep(2000);
//		
//		opcaoreferencia.click();
//		sleep(2000);
//		
//		mes.click();
//		
//		sleep(2000);
//		
//		opcaomes.click();
//		
//		sleep(2000);
//		
//		ano.click();
//		
//		sleep(2000);
//		
//		opcaoano.click();
//		
//		sleep(2000);
//		
//		saldo.sendKeys("1000");
//		
		sleep(2000);
		waitExpectElement(empresa);
		gravarNovo.click();
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
		Integer fila1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		Integer fila2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		fila2 = fila2 - 1; 
		
		WebElement selecccionuno = driver.findElement(By.xpath("//div[@data-id]["+fila1+"]/div[2]/label/span"));
		selecccionuno.click();
		WebElement selecccionDos = driver.findElement(By.xpath("//div[@data-id]["+fila2+"]/div[2]/label/span"));
		selecccionDos.click();
		
		WebElement excluirmassa = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Sign-and-Symbols icon-persign\"]"));
		excluirmassa.click();
		
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

		idInserir("SaldoInicialDiferidoExcluirMassa",idB);

		sleep(2000);
		System.out.println("ID: "+id);
		System.out.println("IDB: "+idB);
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		//compara pra ver se o novo id criado é realmente o ultimo
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
