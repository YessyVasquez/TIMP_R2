package com.sap.timp.pageObjectModel.ADM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class AcessarADMPO extends TestBaseMassiel{

	@FindBy(xpath = "//div[text()=\"ADM\"]")
	public WebElement adm;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[1]")
	public WebElement mostrar;
	
	public AcessarADMPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean acessarADM() {
		
		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!adm.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		adm.click();
		waitExpectElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		return sucesso;
	}
}
