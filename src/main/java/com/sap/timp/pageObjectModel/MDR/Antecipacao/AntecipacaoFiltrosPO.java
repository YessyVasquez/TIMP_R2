package com.sap.timp.pageObjectModel.MDR.Antecipacao;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AntecipacaoFiltrosPO extends TestBaseSteven{

	@FindBy(xpath = "//span[text()=\" Antecipação\"]")
	public WebElement antecipacao;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[1]/div[3]/div")
	public WebElement id;
	
	
	@FindBy(xpath = "//*[@id=\"content-list\"]/div[1]/div/div/div/input")
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
	public AntecipacaoFiltrosPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public String filtro() {
		
		antecipacao.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"list\"]/div/div/div[1]/div/div[1]/div");

		sleep(2000);
		
		String idRegistro = id.getText();
		
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String sucesso = id.getText();
		
		
		
		return sucesso;
		
		
	}
	
	
	
	
}
