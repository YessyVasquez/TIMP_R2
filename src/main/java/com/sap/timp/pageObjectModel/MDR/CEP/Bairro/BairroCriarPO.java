package com.sap.timp.pageObjectModel.MDR.CEP.Bairro;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class BairroCriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"cep\"]")
	public WebElement cep;
	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep2;
	
	@FindBy(xpath = "//li/div/span[text()=\"Bairro\"]")
	public WebElement bairro;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[2]/div/div[9]")
	public WebElement siguiente;
		
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Novo bairro\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"thead\"]/div/div[3]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div/div[3]/div")
	public WebElement id;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	
	@FindBy(xpath = "//div[contains(@aria-label,\"Mostrar\")]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Número de bairro\")]")
	public WebElement numBairro;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"UF\")]")
	public WebElement uf;
	@FindBy(xpath = "//input[contains(@placeholder,\"localização\")]")
	public WebElement localizacao;
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome do bairro\")]")
	public WebElement nome;
	

	
	
	
	
	
	public BairroCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean criarBairro() {
		
		
		String url = driver.getCurrentUrl();
		
		if (url.contains("tq1")) {
			cep2.click();
			sleep(1000);

		} else {
			cep2.click();
			sleep(1000);
		}
		bairro.click();
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);
		
		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String numEnviar = "99999";
		
		numBairro.sendKeys(numEnviar);
		sleep(1000);
		uf.sendKeys("12");
		sleep(1000);
		localizacao.sendKeys("1020");
		sleep(1000);
		nome.sendKeys("Prueba");
		sleep(2000);
		
		gravar.click();
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		pesquisar.sendKeys(numEnviar);
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		String idRegistro = id.getText();
		
		idInserir("CEP-Bairro",idRegistro);
		System.out.println("IdBairro: "+ idRegistro);
		
		boolean sucesso = idRegistro.equals(numEnviar);
	
		return sucesso;
		
		
	}
	
}
