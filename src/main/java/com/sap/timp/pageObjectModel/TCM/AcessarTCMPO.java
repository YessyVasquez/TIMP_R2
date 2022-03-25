package com.sap.timp.pageObjectModel.TCM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class AcessarTCMPO extends TestBaseKenssy{
	@FindBy(xpath = "//div[text()=\"TCM\"]")
	public WebElement tcm;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement ar;

	@FindBy(xpath = "//li/div/span[@class=\"icon icon-font-DataManager icon-upload\"]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//span[text()=\"Pacotes Importados\"]")
	public WebElement mostrar;
	

	public AcessarTCMPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean acessarTCM() {

		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!tcm.isDisplayed()) {
			ar.click();
		}
		sleep(1000);
		
		tcm.click();
		
		waitExpectElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		
		return sucesso;
		
		
	}
}
