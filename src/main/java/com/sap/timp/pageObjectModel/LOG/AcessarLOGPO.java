package com.sap.timp.pageObjectModel.LOG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class AcessarLOGPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//div[text()=\"LOG\"]")
	public WebElement log;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;
	
	@FindBy(xpath = "//div[@class=\"left-content\"]/div[2]/ul/li[1]")
	public WebElement mostrar;

	public AcessarLOGPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean acessarLOG() {
		
		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!log.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		log.click();
		waitExpectElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		return sucesso;
	}
}
