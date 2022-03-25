package com.sap.timp.pageObjectModel.MDR.CEP.Bairro;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class BairroFiltrosPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"cep\"]")
	public WebElement cep;
	
	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep2;
	
	@FindBy(xpath = "//li/div/span[text()=\"Bairro\"]")
	public WebElement bairro;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[3]/div")
	public WebElement id;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
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
	*/
	


	
	public BairroFiltrosPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean filtro() {
		
		String url = driver.getCurrentUrl();
		
		if (url.contains("tq1")) {
			cep2.click();
			sleep(1000);

		} else {
			cep2.click();

			sleep(1000);
		}
		bairro.click();
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
		
		String idRegistro = id.getText();
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[2]/label/span");
		
		String idBusqueda = id.getText();
		
		boolean sucesso = idBusqueda.equals(idRegistro);
		
		return sucesso;
	
		
		
		
		
		
		
		
	}
	
	
	
	
}
