package com.sap.timp.pageObjectModel.MDR.Filiais;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class FiliaisEditarPO extends TestBaseSteven {

	@FindBy(xpath = "//li/div/span[text()=\"Filiais\"]")
	public WebElement filiais;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement editar;
	
	@FindBy(xpath = "//span[text()=\"Dados Complementares\"]")
	public WebElement dados;
	
	@FindBy(xpath = "//*[@id=\"CNAEAdministrativo\"]/div/div/input")
	public WebElement campo;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li/button")
	public WebElement gravar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement sim;
	
	
	
	public FiliaisEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	

	public boolean editar() {

		WebDriverWait wait = new WebDriverWait(driver, 15000);
		
		filiais.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div");

		sleep(2000);

		menu.click();
		editar.click();
;
		
		waitExpectXpath("//*[@id=\"toolbar\"]/div/ul/li[3]/button");
		invisibilityOfElement("//*[@id=\"right-content\"]/div/div[4]/div/div/div/img");
		sleep(3000);
		dados.click();
		
		String texto = campo.getAttribute("value");
		
		String enviar = "8888888";
		sleep(3000);
		campo.clear();
		sleep(1000);
	
		campo.sendKeys(enviar);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		//waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");

		
		driver.navigate().refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		waitExpectXpath("//*[@id=\"toolbar\"]/div/ul/li[3]/button");
		invisibilityOfElement("//*[@id=\"right-content\"]/div/div[4]/div/div/div/img");
		sleep(3000);
		dados.click();
		
		String textoNuevo = campo.getAttribute("value");
		
		boolean sucesso = textoNuevo.equals(enviar);
		
		sleep(1000);
		campo.clear();
		sleep(1000);
		campo.sendKeys(texto);
		
		gravar.click();
		
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
		System.out.println(sucesso);
		return sucesso;
		
		
		
		
		


	}
	
	

}
