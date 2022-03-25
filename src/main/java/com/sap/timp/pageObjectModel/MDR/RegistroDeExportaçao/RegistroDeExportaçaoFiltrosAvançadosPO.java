package com.sap.timp.pageObjectModel.MDR.RegistroDeExportaçao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegistroDeExportaçaoFiltrosAvançadosPO extends TestBaseSteven {

	
	
	@FindBy(xpath = "//span[text()=\"Registro de Exportação\"]")
	public WebElement registroexportacao;
	

	
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
	
	@FindBy(xpath = "//div[@class=\"library-advanced-filter-item\" and @id=\"company\"]/div/div/div[2]")
	public WebElement filtroempresa;
	
	@FindBy(xpath = "//*[@id=\"reset-filters-btn\"]")
	public WebElement limparfiltros;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"library-advanced-filter-item\" and @id=\"branch\"]/div/div/div[2]")
	public WebElement filtrocodigofilial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement codigofilial;
	
	@FindBy(xpath = "//div[@class=\"library-advanced-filter-item\" and @id=\"docnumSap\"][1]/div/div/div[2]")
	public WebElement filtrodocnum;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement docnum;
	
	@FindBy(xpath = "//div[@class=\"library-advanced-filter-item\" and @id=\"codItem\"]/div/div/div[2]")
	public WebElement filtrocodigoitem;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement codigoitem;
	
	@FindBy(xpath = "//div[@class=\"library-advanced-filter-item\" and @id=\"invoice\"]/div/div/div[2]")
	public WebElement filtronotafiscal;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement notafiscal;
	
	@FindBy(xpath = "//div[@class=\"library-advanced-filter-item\" and @id=\"keyNfe\"]/div/div/div[2]")
	public WebElement filtrochavenfe;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement chavenfe;
	
	public RegistroDeExportaçaoFiltrosAvançadosPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> codigoempresa() {
		sleep(2000);
		registroexportacao.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		

		filtrosavancados.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtroempresa.click();
		
		sleep(2000);
		empresa.click();
		//dobleClickElement(filtroempresa);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//funçao para ter o scape
	     Actions action = new Actions(driver);
		 action.sendKeys(Keys.ESCAPE).build().perform();
		//filtroempresa.sendKeys(Keys.ESCAPE);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		for (int i = 0; i < rows; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[3]/div")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}
		
		
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String empresa = "";
		j=1;
		for (int i = 0; i < rows; i++) {
			empresa = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[3]/div")).getText();
			sucesso.add(data.get(0).equals(empresa));
			j=j+1;
		}
		System.out.println(sucesso);
		return sucesso;
		
			
	}	
	
	public ArrayList<Boolean> codigofilial() {
		sleep(2000);
		limparfiltros.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		filtrocodigofilial.click();
		sleep(2000);
		codigofilial.click();
		//dobleClickElement(filtrocodigofilial);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		for (int i = 0; i < rows; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[4]/div")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}
		
		
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String filial = "";
		j=1;
		for (int i = 0; i < rows; i++) {
			filial = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[4]/div")).getText();
			sucesso.add(data.get(0).equals(filial));
			j=j+1;
		}
		System.out.println(sucesso);
		return sucesso;
		
			
	}
	
	
	public ArrayList<Boolean> codigodocnum() {
		sleep(2000);
		limparfiltros.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		filtrodocnum.click();
		sleep(2000);
		docnum.click();
		//dobleClickElement(filtrocodigofilial);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		for (int i = 0; i < rows; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[5]/div")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}
		
		
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String docnum = "";
		j=1;
		for (int i = 0; i < rows; i++) {
			docnum = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[5]/div")).getText();
			sucesso.add(data.get(0).equals(docnum));
			j=j+1;
		}
		System.out.println(sucesso);
		return sucesso;
		
			
	}
	
	public ArrayList<Boolean> codigocodigoitem() {
		sleep(2000);
		limparfiltros.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		filtrocodigoitem.click();
		sleep(2000);
		codigoitem.click();
		//dobleClickElement(filtrocodigofilial);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		for (int i = 0; i < rows; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[7]/div")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}
		
		
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String codigoitem = "";
		j=1;
		for (int i = 0; i < rows; i++) {
			codigoitem = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[7]/div")).getText();
			sucesso.add(data.get(0).equals(codigoitem));
			j=j+1;
		}
		System.out.println(sucesso);
		return sucesso;
		
			
	}
	
	public ArrayList<Boolean> codigonotafiscal() {
		sleep(2000);
		limparfiltros.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		filtronotafiscal.click();
		sleep(2000);
		notafiscal.click();
		//dobleClickElement(filtrocodigofilial);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		for (int i = 0; i < rows; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[8]/div")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}
		
		
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String notafiscal = "";
		j=1;
		for (int i = 0; i < rows; i++) {
			notafiscal = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[8]/div")).getText();
			sucesso.add(data.get(0).equals(notafiscal));
			j=j+1;
		}
		System.out.println(sucesso);
		return sucesso;
		
			
	}
	
	
	public ArrayList<Boolean> codigochavenfe() {
		sleep(2000);
		limparfiltros.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		filtrochavenfe.click();
		sleep(2000);
		chavenfe.click();
		//dobleClickElement(filtrocodigofilial);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		for (int i = 0; i < rows; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[6]/div")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}
		
		
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String chavenfe = "";
		j=1;
		for (int i = 0; i < rows; i++) {
			chavenfe = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[6]/div")).getText();
			sucesso.add(data.get(0).equals(chavenfe));
			j=j+1;
		}
		System.out.println(sucesso);
		return sucesso;
		
			
	}
	
	
}
