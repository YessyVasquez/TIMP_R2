package com.sap.timp.pageObjectModel.MDR.Filiais;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class FiliaisVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[2]")
	public WebElement visualizar;
	
	@FindBy(xpath = "//span[text()=\"Filiais\"]")
	public WebElement filiais;


	public FiliaisVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public String visualizar() {
		
		filiais.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div");

		sleep(2000);
		
		menu.click();
		visualizar.click();
		sleep(5000);
		invisibilityOfElement("//*[@id=\"right-content\"]/div/div[4]/div/div/div/img");
		
		String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		System.out.println(sucesso);
		return sucesso;
	}
	

}
