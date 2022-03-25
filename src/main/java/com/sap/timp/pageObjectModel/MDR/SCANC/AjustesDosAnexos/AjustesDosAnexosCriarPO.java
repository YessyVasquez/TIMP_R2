package com.sap.timp.pageObjectModel.MDR.SCANC.AjustesDosAnexos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AjustesDosAnexosCriarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"Ajustes dos Anexos\"]")
	public WebElement ajustesdosanexos;
	
	@FindBy(xpath = "//span[text()=\"Novo Ajuste de Anexo\"]")
	public WebElement novoajuste;
	
	@FindBy(xpath = "//div[@id=\"company-annexes\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"1000\"]/div/label/span")
	public WebElement opcaoempresa;
	
	
	@FindBy(xpath = "//div[@id=\"tax-annexes\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id][text()=\"ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@id=\"tax-type-annexes\"]/div/div/div[2]")
	public WebElement tipodetributo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaotipodetributo;
	
	@FindBy(xpath = "//div[@id=\"tax-details-annexes\"]/div/div[2]")
	public WebElement detalhe;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaodetalhe;
	
	@FindBy(xpath = "//div[@id=\"annexe-annexes\"]/div/div/div[2]")
	public WebElement anexo;
	
	@FindBy(xpath = "//li[@id][2]")
	public WebElement opcaoanexo;
	
	@FindBy(xpath = "//div[@id=\"status-annexes\"]/div/div/div[2]")
	public WebElement status;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaostatus;
	
	@FindBy(xpath = "//div[@id=\"square-annexes\"]/div/div/div[2]")
	public WebElement quadro;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoquadro;
	
	@FindBy(xpath = "//div[@id=\"square-line-annexes\"]/div/div/div[2]")
	public WebElement linhaquadro;
	
	@FindBy(xpath = "//div[@id=\"1,7,8,9\"]/div/label/span")
	public WebElement opcaolinhaquadro;
	
	@FindBy(xpath = "//div[@id=\"validity-start-annexes\"]/div/div[1]/input")
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
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	
	
	public AjustesDosAnexosCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		
		sleep(2000);
		scanc.click();
		sleep(2000);
		
		ajustesdosanexos.click();
		
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
		novoajuste.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		
		sleep(2000);
		
		opcaoempresa.click();
		sleep(2000);
		/*
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		action.sendKeys(Keys.ESCAPE).build().perform();
		*/
		body.click();
		sleep(2000);
		
		tributo.click();
		
		sleep(2000);
		
		opcaotributo.click();
		
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"tax-type-annexes\"]/div", "class", "base-select required");
		sleep(2000);
		
		tipodetributo.click();
		
		sleep(2000);
		
		opcaotipodetributo.click();
		
		sleep(2000);
		
		detalhe.click();
		
		sleep(2000);
		
		opcaodetalhe.click();
		
		sleep(2000);
		
		anexo.click();
		
		sleep(2000);
		
		opcaoanexo.click();
		
		sleep(2000);
		
		status.click();
		
		sleep(2000);
		
		opcaostatus.click();
		
		sleep(2000);
		
		quadro.click();
		
		sleep(2000);
		
		opcaoquadro.click();
		
		sleep(2000);
		
		linhaquadro.click();
		
		sleep(2000);
		
		opcaolinhaquadro.click();
		
		sleep(2000);
		body.click();
		//action.sendKeys(Keys.ESCAPE).build().perform();
		//action.sendKeys(Keys.ESCAPE).build().perform();
		
		sleep(2000);
		
		String data=fechaActual();
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
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir("AjustesDosAnexos",id2);
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
