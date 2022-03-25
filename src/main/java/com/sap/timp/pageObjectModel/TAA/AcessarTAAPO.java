package com.sap.timp.pageObjectModel.TAA;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class AcessarTAAPO extends TestBaseMassiel{
	@FindBy(xpath = "//div[text()=\"TAA\"]")
	public WebElement taa;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;

	
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]")
	public WebElement mostrar;
	
	
	
	public AcessarTAAPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean acessarTAA() {

		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!taa.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		taa.click();
		
		waitExpectElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		return sucesso;		
	}
}
