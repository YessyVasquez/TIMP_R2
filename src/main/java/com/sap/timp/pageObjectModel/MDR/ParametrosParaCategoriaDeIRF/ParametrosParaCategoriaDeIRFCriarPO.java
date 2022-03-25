package com.sap.timp.pageObjectModel.MDR.ParametrosParaCategoriaDeIRF;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.errorprone.annotations.FormatMethod;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;

public class ParametrosParaCategoriaDeIRFCriarPO extends TestBaseMassiel{
	
	
	@FindBy(xpath = "//span[text()=\"Parâmetros para Categoria de IRF \"]")
	public WebElement parametros;
	
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
	
	
	@FindBy(xpath = "//div[@id=\"irf-category\"]/div/div/div[2]")
	public WebElement categoriaIRF;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao2;

	@FindBy(xpath = "//div[@id=\"irf-code\"]/div/div/div[2]")
	public WebElement codigoIRF;
	
	@FindBy(xpath = "//div[@id=\"irf-key\"]/div/div/div[2]")
	public WebElement chaveIRF;
	
	@FindBy(xpath = "//div[@id=\"structure\"]/div/div[2]")
	public WebElement estrutura;
	
	@FindBy(xpath = "//div[@id=\"values-fields\"]/div/div/div[2]")
	public WebElement camposValor;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Descrição\")]")
	public WebElement descricao;
	
	
	
	public ParametrosParaCategoriaDeIRFCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		parametros.click();
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
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		categoriaIRF.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		attributeToBeXpath("//div[@id=\"irf-code\"]/div", "class", "base-MultipleSelect3 required");
		sleep(1000);
	
		
		codigoIRF.click();
		sleep(1000);
		opcao2.click();
		opcao2.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"irf-key\"]/div", "class", "base-select ");
		
		chaveIRF.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		
		descricao.sendKeys("Teste Categoria IRF");
		sleep(1000);
		
		estrutura.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		
		camposValor.click();
		sleep(1000);
		opcao.click();
		sleep(2000);

		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
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
		
		
		idInserir("ParametrosParaCategoriaDeIRF",id2);
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
