package com.sap.timp.pageObjectModel.TDK;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;

public class AcessarTDKPO extends TestBaseSteven{
	@FindBy(xpath = "//div[text()=\"TDK\"]")
	public WebElement tdk;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;

	
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]")
	public WebElement mostrar;
	
	
	
	public AcessarTDKPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean acessarTDK() {

		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!tdk.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		tdk.click();
		
		waitExpectElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		return sucesso;		
	}
}
