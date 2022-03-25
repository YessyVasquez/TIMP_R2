package com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ParametrizaçãoDoLivroOficial extends TestBaseFernando{
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Eventos e-Social\"]")
	public WebElement menuLivrosFiscais;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-paymentsIncomeFromWork\"]")
	public WebElement submenoParametrizacaoDoLivroOficial;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Nova configuração livro oficial\"]")
	public WebElement btnNovaConfigurazacaoDoLivroOficial;
	
	@FindBy(xpath = "//div[@id=\"bookType\"]/div/div/div[2]")
	public WebElement tipoDoLibro;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[2]")
	public WebElement opcionCheckbox;
	
	public ParametrizaçãoDoLivroOficial() {
		PageFactory.initElements(driver, this);
	}
	
	public void criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(menuLivrosFiscais);
		menuLivrosFiscais.click();
		sleep(1000);
		
		submenoParametrizacaoDoLivroOficial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println("Ultimo ID: " + id);
		
		sleep(2000);
		btnNovaConfigurazacaoDoLivroOficial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tipoDoLibro.click();
		sleep(2000);
		opcionCombo.click();
		sleep(2000);		
	}
}
