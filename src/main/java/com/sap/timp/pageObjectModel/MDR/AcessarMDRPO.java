package com.sap.timp.pageObjectModel.MDR;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AcessarMDRPO extends TestBaseSteven{

	@FindBy(xpath = "//div[text()=\"MDR\"]")
	public WebElement mdr;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement ar;

	
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-adjustments\"]")
	public WebElement mostrar;
	

	public AcessarMDRPO() {

		PageFactory.initElements(driver, this);
	}

	
	public boolean acessarMDR() {

		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!mdr.isDisplayed()) {
			ar.click();
		}
		sleep(1000);
		
		mdr.click();
		
		waitExpectElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		
		return sucesso;
		
		
	}
	
}
