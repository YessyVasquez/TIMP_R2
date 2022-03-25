package com.sap.timp.pageObjectModel.SCANC;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class AcessarSCANCPO extends TestBaseFernando{
	@FindBy(xpath = "//div[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;

	
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//span[text()=\"Arquivos Importados\"]")
	public WebElement mostrar;
	
	public AcessarSCANCPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean acessarSCANC() {
		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!scanc.isDisplayed()) {
			flecha.click();
		}
		
		sleep(1000);
		
		scanc.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
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
