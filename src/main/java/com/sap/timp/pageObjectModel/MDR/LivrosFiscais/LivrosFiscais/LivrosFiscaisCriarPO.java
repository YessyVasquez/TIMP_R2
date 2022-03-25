package com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.errorprone.annotations.FormatMethod;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class LivrosFiscaisCriarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Livros Fiscais\"]")
	public WebElement livrosfiscais;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-fiscalBooks\"]")
	public WebElement livrosFiscaisO;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	

	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement dataincial;
	
	
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
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Tipo do Livro\")]")
	public WebElement tipodolivro;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @id][2]")
	public WebElement opcao;

	@FindBy(xpath = "//input[contains(@placeholder,\"Empresa\")]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao2;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"UF\")]")
	public WebElement ufFilial;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Filial\")]")
	public WebElement filial;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Modelo de Livro\")]")
	public WebElement modelo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Quantidade\")]")
	public WebElement quantidade;
	
	@FindBy(xpath = "//div[@class=\"field-element taxCode_0_2\"]/div/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicial\")]")
	public WebElement dataVigencia;
	
	
	
	
	public LivrosFiscaisCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		livrosfiscais.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		livrosFiscaisO.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tipodolivro.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		opcao2.click();
		opcao2.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		ufFilial.click();
		sleep(1000);
		opcao2.click();
		opcao2.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		filial.click();
		sleep(1000);
		opcao2.click();
		opcao2.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		modelo.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		
		quantidade.sendKeys("123");
		
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
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir("LivrosFiscais",id2);
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
