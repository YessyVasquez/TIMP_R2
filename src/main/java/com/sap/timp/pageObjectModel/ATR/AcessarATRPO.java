package com.sap.timp.pageObjectModel.ATR;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class AcessarATRPO extends TestBaseSteven{

					 
	@FindBy(xpath = "//div[text()=\"ATR\"]")
	public WebElement atr;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement ar;
	
	@FindBy(xpath = "//*[@id=\"login-btn\"]")
	public WebElement botao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-output\"]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view -view-wrapper  selected\"]")
	public WebElement mostrar;
	
	public AcessarATRPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean acessarATR() {
		


		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(3000);
		
		while(atr.isDisplayed() == false) {
			ar.click();
		}		
	
		atr.click();
		/*waitExpectXpath("//span[text()=\"Hierarquia de Configuração\"]");
		waitExpectXpath("//div[contains(@class,\"icon-right\")][2]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		*/
		waitExpectElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		boolean sucesso = mostrar.isDisplayed();
		
		
		return sucesso;
		
		
		
	}
	
	
	
	
	
}
