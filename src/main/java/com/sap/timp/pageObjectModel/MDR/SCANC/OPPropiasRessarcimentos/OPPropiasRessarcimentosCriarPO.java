package com.sap.timp.pageObjectModel.MDR.SCANC.OPPropiasRessarcimentos;

import javax.swing.text.AbstractDocument.LeafElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.errorprone.annotations.FormatMethod;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class OPPropiasRessarcimentosCriarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"Op. Próprias e Ressarcimentos\"]")
	public WebElement opProprias;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"company-repayments\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"ufbranch-repayments\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"annexe-repayments\"]/div/div/div[2]")
	public WebElement anexo;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao2;
		
	@FindBy(xpath = "//div[@id=\"square-repayments\"]/div/div/div[2]")
	public WebElement tipoCuadro;
	
	@FindBy(xpath = "//div[@id=\"nf-status-repayments\"]/div/div/div[2]")
	public WebElement codSituacao;
	
	@FindBy(xpath = "//div[@id=\"report-repayments\"]/div/div/div[2]")
	public WebElement modeloRelatorio;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"início\")]")
	public WebElement dataVigencia;
	
	public OPPropiasRessarcimentosCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		scanc.click();
		sleep(2000);
		
		opProprias.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	
		
		empresa.click();
		sleep(1000);
		opcao.click();
		
		attributeToBeXpath("//div[@id=\"ufbranch-repayments\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		uf.click();
		sleep(1000);
		opcao2.click();
		opcao2.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		
		anexo.click();
		sleep(1000);
		opcao.click();
		sleep(1000);

		attributeToBeXpath("//div[@id=\"square-repayments\"]/div", "class", "base-select required");
		sleep(2000);
		
		tipoCuadro.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		
		waitExpectElement(codSituacao);
		sleep(2000);
		
		codSituacao.click();
		sleep(1000);
		opcao2.click();
		opcao2.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		modeloRelatorio.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		
		dataVigencia.sendKeys(fechaActual());
		
		
		
		
	
		
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
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		
		
		idInserir("OPPropiasRessarcimentos",id2);
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
