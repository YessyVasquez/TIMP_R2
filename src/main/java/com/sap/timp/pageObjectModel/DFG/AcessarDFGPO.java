package com.sap.timp.pageObjectModel.DFG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class AcessarDFGPO extends TestBaseMassiel{
	@FindBy(xpath = "//div[text()=\"DFG\"]")
	public WebElement dfg;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;

	
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div/ul/li[1]")
	public WebElement mostrar;
	
	
	
	public AcessarDFGPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean acessarDFG() {

		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!dfg.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		dfg.click();
		
		waitExpectElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		return sucesso;
		
	}
}
