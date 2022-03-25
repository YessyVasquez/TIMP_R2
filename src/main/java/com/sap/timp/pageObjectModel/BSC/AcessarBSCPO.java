package com.sap.timp.pageObjectModel.BSC;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class AcessarBSCPO extends TestBaseMassiel {

	@FindBy(xpath = "//div[text()=\"BSC\"]")
	public WebElement bSC;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;

	
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[2]/div/div/div/div/div[3]/ul/li[1]/div[1]/div[2]")
	public WebElement mostrar;
	
	public AcessarBSCPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean acessarBSC() {

		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!bSC.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		bSC.click();
		
		waitExpectElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		System.out.println(sucesso);
		return sucesso;
		
	}


}
