package com.sap.timp.pageObjectModel.BRB;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class VisualizarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[2]")
	public WebElement opcao;

	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;

	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[4]/button")
	public WebElement biblioteca;


	
	
	public VisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	
	
	public boolean visualizar() {
		
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);
		
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		//waitExpectElement(menu);
		//sleep(menuT);

		menu.click();

		opcao.click();
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		
		boolean sucesso = driver.findElement(By.xpath("//li[contains(@class,\"add-column\")]")).isDisplayed();
		sleep(3000);

		
		
		return sucesso;

		
	}
	

}
