package com.sap.timp.pageObjectModel.TPC;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AcessarTPCPO extends TestBaseSteven {
	

	@FindBy(xpath = "//div[text()=\"TPC\"]")
	public WebElement tpc;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement ar;

	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-balanceConsolidation\"]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-00\"]")
	public WebElement mostrar;
	

	public AcessarTPCPO() {

		PageFactory.initElements(driver, this);
	}

	
	public boolean acessarTPC() {

		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!tpc.isDisplayed()) {
			ar.click();
		}
		sleep(1000);
		
		tpc.click();
		
		waitExpectElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		
		return sucesso;
		
		
	}

}
