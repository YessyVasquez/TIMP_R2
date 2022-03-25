package com.sap.timp.pageObjectModel.BRB;


import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AcessarBrbPO extends TestBaseSteven{

					 
	@FindBy(xpath = "//div[text()=\"BRB\"]")
	public WebElement brb;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement ar;
	
	@FindBy(xpath = "//*[@id=\"login-btn\"]")
	public WebElement botao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-output\"]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]")
	public WebElement mostrar;
	
	public AcessarBrbPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean acessar() {
		


		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(3000);
		
		while(brb.isDisplayed() == false) {
			ar.click();
		}		
	
		brb.click();
		sleep(12000);
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");
		waitExpectXpath("//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[1]/div");
		cadastro.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = mostrar.isDisplayed();
		
		
		return sucesso;
		
		
		
	}
	
	
	
	
	
}
