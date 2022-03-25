package com.sap.timp.pageObjectModel.TFP;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class AcessarTFPPO extends TestBaseMassiel{
	@FindBy(xpath = "//div[text()=\"TFP\"]")
	public WebElement tFP;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;

	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//span[text()=\"Períodos\"]")
	public WebElement mostrar;
	
	public AcessarTFPPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean acessarTFP() {

		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!tFP.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		tFP.click();
		
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
