package com.sap.timp.pageObjectModel.BRB;

import java.lang.reflect.Constructor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CampoOutputPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	

	@FindBy(xpath = "//*[@id=\"draggable-66\"]/div/div/div")
	public WebElement coluna;
	@FindBy(xpath = "//span[text()=\"Adicionar campo output\"]")
	public WebElement colunaO;
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement aplicar;
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravar;


	@FindBy(xpath = "//*[@id=\"draggable-66\"]/div/div/div/div[4]/span[contains(@class, \"output\")]")
	public WebElement mostrado;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	
	
	
	public CampoOutputPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public boolean agregarOutput() {
		
	    String url = driver.getCurrentUrl();
		
		
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");
		
		

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectElement(menu);
		//sleep(menuT);
	
		
		menu.click();
		sleep(1000);
		opcao.click();

		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		actionsMoveToElementXpath("//*[@id=\"draggable-66\"]");
		
		coluna.click();
		
		colunaO.click();
		
		waitExpectXpath("//*[@id=\"fixed-field\"]/div/label/span");
		sleep(2000);
		aplicar.click();
		
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		gravar.click();
		
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		driver.navigate().refresh();
		

		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		boolean sucesso = false;
		sucesso = mostrado.isDisplayed();
		
		System.out.println(sucesso);
		return sucesso;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
