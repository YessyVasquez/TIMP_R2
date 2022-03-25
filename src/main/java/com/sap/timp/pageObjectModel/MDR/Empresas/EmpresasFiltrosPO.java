package com.sap.timp.pageObjectModel.MDR.Empresas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class EmpresasFiltrosPO extends TestBaseSteven{
	
	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[1]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//li/div/span[text()=\"Empresas\"]")
	public WebElement empresa;
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[2]/div/div[8]")
	public WebElement siguiente;
	@FindBy(xpath = "//*[@id=\"advanced-filters-btn\"]")
	public WebElement filtros;
	
	@FindBy(xpath = "//*[@id=\"razaoSocial\"]/div/div[1]/input")
	public WebElement razaoSocial;
	
	@FindBy(xpath = "//*[@id=\"reset-filters-btn\"]")
	public WebElement limpiar;
	
	@FindBy(xpath = "//*[@id=\"municipio\"]/div/div[1]/input")
	public WebElement municipio;
	
	@FindBy(xpath = "//*[@id=\"dataFimVigencia\"]/div/div[1]/input")
	public WebElement dataFinal;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	
	public EmpresasFiltrosPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> razaoSocial() {
		
		empresa.click();
		
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div");

		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		
		for (int i = 0; i < rows; i++) {

			String razao1 ="";
			razao1 = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[3]/div")).getText();
			
			if (data.size()==0) {
				
				if (razao1.isEmpty()==false) {
					
					data.add(razao1);
				}
			}
			
			j = j+1;
		}
			
		
		while (data.size() == 0) {
			
			siguiente.click();
			waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
			sleep(2000);
			j=1;
			
			rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
			
			for (int i = 0; i < rows; i++) {

				String razao ="";
				razao = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[3]/div")).getText();
				
				if (data.size()==0) {
					
					if (razao.isEmpty()==false) {
						
						data.add(razao);
					}
				}
				
				j = j+1;
			}
						
		}
		
		filtros.click();
		waitExpectXpath("//*[@id=\"main-icon\"]");
		sleep(2000);

		razaoSocial.sendKeys(data.get(0));
		razaoSocial.sendKeys(Keys.ENTER);
		
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div");
		sleep(8000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String empresa = "";
		j=1;
		for (int i = 0; i < rows; i++) {
			empresa = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[3]/div")).getText();
			sucesso.add(data.get(0).equals(empresa));
			j= j+1;
		}
		System.out.println(sucesso);
		return sucesso;
		
		
	}
	
	
	public ArrayList<Boolean> municipio() {
		
		sleep(3000);
		limpiar.click();
		
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div");

		sleep(9000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		
		for (int i = 0; i < rows; i++) {

			String municipio ="";
			municipio = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[5]/div")).getText();
			
			if (data.size()==0) {
				
				if (municipio.isEmpty()==false) {
					
					data.add(municipio);
				}
			}
			
			j = j+1;
		}
			
		
		while (data.size() == 0) {
			sleep(9000);
			siguiente.click();
			waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
			sleep(2000);
			j=1;
			
			rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
			
			for (int i = 0; i < rows; i++) {

				String municipio1 ="";
				municipio1 = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[5]/div")).getText();
				
				if (data.size()==0) {
					
					if (municipio1.isEmpty()==false) {
						
						data.add(municipio1);
					}
				}
				
				j = j+1;
			}
						
		}
		
	

		municipio.sendKeys(data.get(0));
		municipio.sendKeys(Keys.ENTER);
		
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div");
		sleep(3000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String municipio = "";
		j=1;
		for (int i = 0; i < rows; i++) {
			municipio = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")][1]/div[5]/div")).getText();
			System.out.println(municipio);
			sucesso.add(data.get(0).equals(municipio));
		}
		System.out.println(sucesso);
		return sucesso;
		
		
	}
	
	
	public ArrayList<Boolean> dataFinal() {
		
		sleep(3000);
		limpiar.click();
		
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div");

		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		
		for (int i = 0; i < rows; i++) {

			String dataFinal ="";
			dataFinal = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[7]/div")).getText();
			
			if (data.size()==0) {
				
				if (dataFinal.isEmpty()==false) {
					
					data.add(dataFinal);
				}
			}
			
			j = j+1;
		}
			
		
		while (data.size() == 0) {
			
			siguiente.click();
			waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
			sleep(2000);
			j=1;
			
			rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
			
			for (int i = 0; i < rows; i++) {

				String dataFinal1 ="";
				dataFinal1 = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[7]/div")).getText();
				
				if (data.size()==0) {
					
					if (dataFinal1.isEmpty()==false) {
						
						data.add(dataFinal1);
					}
				}
				
				j = j+1;
			}
						
		}
		
	

		dataFinal.sendKeys(data.get(0));
		dataFinal.sendKeys(Keys.ENTER);
		sleep(1000);
		dataFinal.sendKeys(Keys.ENTER);

		
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div");
		sleep(3000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String dataFinal = "";
		j=1;
		for (int i = 0; i < rows; i++) {
			dataFinal = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")][1]/div[7]/div")).getText();
			System.out.println(dataFinal);
			sucesso.add(data.get(0).equals(dataFinal));
		}
		System.out.println(sucesso);
		return sucesso;
		
		
	}
	
	
	
	
}
