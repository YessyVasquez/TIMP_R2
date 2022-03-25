package com.sap.timp.pageObjectModel.MDR.CEP.Municipio;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class MunicipioEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"cep\"]")
	public WebElement cep;
	
	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep2;
	
	@FindBy(xpath = "//li/div/span[text()=\"Município\"]")
	public WebElement municipio;
	

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	public WebElement menu;
	
	@FindBy(xpath = "//li/span[text()=\"Editar\"]")
	public WebElement editar;
	
	@FindBy(xpath = "//div[contains(@class,\"locNo_0_1\")]/div/div/div/div/div/input")
	public WebElement campo;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	public MunicipioEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean editar() {
		
		String url = driver.getCurrentUrl();
		
		if (url.contains("tq1")) {
			cep2.click();
			sleep(1000);

		} else {
			cep2.click();

			sleep(1000);
		}
		
		municipio.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("CEP-Municipio");
	    System.out.println("idEditar: "+ idRegistro);
	    
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(campo);
		sleep(2000);
		String valor = campo.getAttribute("value");
		System.out.println(valor);
		
		String enviar = "Prueba editar";
		
		campo.clear();
		campo.sendKeys(enviar);
		

		sleep(1000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);		
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		driver.navigate().refresh();
		

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(campo);
		sleep(2000);
		
		String nuevoTexto = campo.getAttribute("value");
		System.out.println(nuevoTexto);

		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);
		
		return sucesso;
		
		
		
		
	}

}
