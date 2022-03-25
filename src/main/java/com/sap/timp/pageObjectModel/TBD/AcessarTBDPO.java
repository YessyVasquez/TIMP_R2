package com.sap.timp.pageObjectModel.TBD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;

public class AcessarTBDPO extends TestBaseSteven{
	@FindBy(xpath = "//div[text()=\"TBD\"]")
	public WebElement tbd;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;

	
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//div[@class=\"accordion-container\"]")
	public WebElement mostrar;
	
	
	
	public AcessarTBDPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean acessarTBD() {

		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!tbd.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		tbd.click();
		
		waitExpectElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		return sucesso;		
	}
}
