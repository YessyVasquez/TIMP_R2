package com.sap.timp.pageObjectModel.MDR.CEP.Logradouro;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class LogradouroCriarPO extends TestBaseSteven{

	@FindBy(xpath = "//li/div/span[text()=\"cep\"]")
	public WebElement cep;
	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep2;
	
	@FindBy(xpath = "//li/div/span[text()=\"Logradouro\"]")
	public WebElement logradouro;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[2]/div/div[9]")
	public WebElement siguiente;
		
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Novo logradouro\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//*[@id=\"form-container\"]/div/div[2]/table/tr[1]/td/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement fieldCEP;
	
	@FindBy(xpath = "//*[@id=\"form-container\"]/div/div[2]/table/tr[2]/td/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement fieldUF;
	
	@FindBy(xpath = "//*[@id=\"form-container\"]/div/div[2]/table/tr[3]/td/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement numeroLocalizaçao;
	
	@FindBy(xpath = "//*[@id=\"form-container\"]/div/div[2]/table/tr[4]/td/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement numeroBairro;
	
	@FindBy(xpath = "//*[@id=\"form-container\"]/div/div[2]/table/tr[5]/td/div/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nombreLogradouro;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div/div[3]/div")
	public WebElement id;
	
	public LogradouroCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean logradouroCriar() {
		String url = driver.getCurrentUrl();
		
		if (url.contains("tq1")) {
			cep2.click();
			sleep(1000);

		} else {
			cep2.click();

			sleep(1000);
		}
		logradouro.click();
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);
		
		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String numEnviar = "11112222";
		
		fieldCEP.sendKeys(numEnviar);
		sleep(1000);
		fieldUF.sendKeys("RS");
		sleep(1000);
		numeroLocalizaçao.sendKeys("1111111111");
		sleep(1000);
		numeroBairro.sendKeys("1001010");
		sleep(1000);
		nombreLogradouro.sendKeys("TesteAutomatizado");
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
		sleep(6000);
		String idRegistro = id.getText();
		
		idInserir("CEP-Logradouro",idRegistro);
		System.out.println("IdLogradouro: "+ idRegistro);
		
		boolean sucesso = idRegistro.equals(numEnviar);
	
		return sucesso;
	}
}
