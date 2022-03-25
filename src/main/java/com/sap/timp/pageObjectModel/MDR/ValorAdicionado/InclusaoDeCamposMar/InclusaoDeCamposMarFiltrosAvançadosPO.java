package com.sap.timp.pageObjectModel.MDR.ValorAdicionado.InclusaoDeCamposMar;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class InclusaoDeCamposMarFiltrosAvançadosPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Valor Adicionado\"]")
	public WebElement valoradicionado;
	
	@FindBy(xpath = "//span[text()=\"Inclusão de Campos Mar\"]")
	public WebElement inclusaocamposmar;
	
	@FindBy(xpath = "//span[text()=\"Nova Inclusão de Campos Mar\"]")
	public WebElement novoinclusaocamposmar;
	
	@FindBy(xpath = "//div[@id=\"select\" and @class=\"base-select-wrapper\"]/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//li[@id][2]")
	public WebElement opcaouf;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
	public WebElement datainiciovigencia;
	
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
	
	@FindBy(xpath = "//*[@id=\"advanced-filters-btn\"]/span[2]")
	public WebElement filtrosavancados;
	
	@FindBy(xpath = "//*[@id=\"reset-filters-btn\"]")
	public WebElement limparfiltros;
	
	@FindBy(xpath = "//div[@id=\"select\" and @class=\"base-select-wrapper\"]/div[2]")
	public WebElement filtrousuario1;
	
	@FindBy(xpath = "//li[text()=\"Teste  Automatizado\"]")
	public WebElement usuariotd1;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar pela Data de Criação\"]")
	public WebElement filtrodatacriaçao;
	
	@FindBy(xpath = "//div[@class=\"library-advanced-filter-item\" and @id=\"modificationUser\"]/div/div/div[2]")
	public WebElement filtrousuario2;
	
	@FindBy(xpath = "//li[text()=\"Teste  Automatizado\"]")
	public WebElement usuariotd12;
	
	@FindBy(xpath = "//li[text()=\"TESTE AUTOMATIZADO\"]")
	public WebElement usuariotq1;

	@FindBy(xpath = "//li[text()=\"TESTEAUTOMATIZADO TESTEAUTOMATIZADO\"]")
	public WebElement usuariotp1;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar pela Data de Modificação\"]")
	public WebElement filtrodatamodificaçao;
	
	public InclusaoDeCamposMarFiltrosAvançadosPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtrosusuario() {
		
		
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
		valoradicionado.click();
		sleep(2000);
		inclusaocamposmar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			
		filtrosavancados.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtrousuario1.click();
		
		sleep(2000);
		
		if (  tq1 == true) {
			usuariotq1.click();
		}else if(tc2 == true || tp1 == true ) {
			usuariotp1.click();
		}else {
			usuariotd1.click();
		}
		
		
		//usuariotd1.click();
		//dobleClickElement(filtroempresa);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		for (int i = 0; i < rows; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[17]/div")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}
		
		
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String usuario = "";
		j=1;
		for (int i = 0; i < rows; i++) {
			usuario = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[17]/div")).getText();
			sucesso.add(data.get(0).equals(usuario));
			j=j+1;
		}
		
		return sucesso;
	
	}
	
	public ArrayList<Boolean> filtrodatacriacao() {
		sleep(2000);
		limparfiltros.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String data1=fechaActual();
		
		sleep(2000);
		filtrodatacriaçao.sendKeys(data1);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		filtrodatacriaçao.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		for (int i = 0; i < rows; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[18]/div")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}
		
		
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String datac = "";
		j=1;
		for (int i = 0; i < rows; i++) {
			datac = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[18]/div")).getText();
			sucesso.add(data.get(0).equals(datac));
			j=j+1;
		}
		
		return sucesso;
		
			
	}
	
	
	public ArrayList<Boolean> filtrousuariomodificacao() {
		
		
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
		limparfiltros.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		filtrousuario2.click();
		sleep(2000);
		
		if (  tq1 == true) {
			usuariotq1.click();
		}else if(tc2 == true || tp1 == true) {
			usuariotp1.click();
		}else {
			usuariotd1.click();
		}
		
		//usuariotd1.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		for (int i = 0; i < rows; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[19]/div")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}
		
		
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String usuario = "";
		j=1;
		for (int i = 0; i < rows; i++) {
			usuario = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[19]/div")).getText();
			sucesso.add(data.get(0).equals(usuario));
			j=j+1;
		}
		
		return sucesso;
		
			
	}
		
	public ArrayList<Boolean> filtrodatamodificacao() {
		sleep(2000);
		limparfiltros.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String data1=fechaActual();
		
		sleep(2000);
		filtrodatamodificaçao.sendKeys(data1);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		filtrodatamodificaçao.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		for (int i = 0; i < rows; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[20]/div")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}
		
		
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String datam = "";
		j=1;
		for (int i = 0; i < rows; i++) {
			datam = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[20]/div")).getText();
			sucesso.add(data.get(0).equals(datam));
			j=j+1;
		}
		limparfiltros.click();
		return sucesso;
		
			
	}
	
	
	
}
