package com.sap.timp.pageObjectModel.BFB;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseMassiel;

public class AcessarBFBPO extends TestBaseFernando {	
	@FindBy(xpath = "//div[text()=\"BFB\"]")
	public WebElement bfb;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement ar;
	
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-my-layout\"]")
	public WebElement mostrar;

	public AcessarBFBPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean acessarBFB() {
		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);

		while (!bfb.isDisplayed()) {
			ar.click();
		}
		sleep(1000);

		bfb.click();
	
		waitExpectElement(mostrar);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		waitExpectElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		return sucesso;	
	}

}
