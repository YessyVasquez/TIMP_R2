package com.sap.timp.pageObjectModel.BRE;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;

public class AcessarBREPO extends TestBaseMassiel {
	

	@FindBy(xpath = "//div[text()=\"BRE\"]")
	public WebElement bre;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement ar;

	
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-root\"]")
	public WebElement mostrar;
	

	public AcessarBREPO() {

		PageFactory.initElements(driver, this);
	}

	
	public boolean acessarBRE() {

		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);

		while (!bre.isDisplayed()) {
			ar.click();
		}
		sleep(1000);

		bre.click();
	
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
