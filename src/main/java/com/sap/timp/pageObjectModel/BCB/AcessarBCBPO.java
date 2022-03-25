package com.sap.timp.pageObjectModel.BCB;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AcessarBCBPO extends TestBaseSteven{

					 
	@FindBy(xpath = "//div[text()=\"BCB\"]")
	public WebElement bcb;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement ar;
	
	@FindBy(xpath = "//*[@id=\"login-btn\"]")
	public WebElement botao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-output\"]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//div[@class=\"component-title\"]")
	public WebElement mostrar;
	
	public AcessarBCBPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean acessar() {
		


		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(3000);
		
		while(bcb.isDisplayed() == false) {
			ar.click();
		}		
	
		bcb.click();
		waitExpectXpath("//span[text()=\"Hierarquia de Configuração\"]");
		waitExpectXpath("//div[contains(@class,\"icon-right\")][2]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = mostrar.isDisplayed();
		
		
		return sucesso;
		
		
		
	}
	
	
	
	
	
}
