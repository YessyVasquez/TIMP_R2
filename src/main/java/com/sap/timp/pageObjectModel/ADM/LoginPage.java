package com.sap.timp.pageObjectModel.ADM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class LoginPage extends TestBaseSteven{
	 
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	WebDriverWait wait = new WebDriverWait(driver, 15000);
	
	
	@FindBy(xpath = "//*[@id=\"login-username\"]/div/div/input")
	public WebElement usuario;
	
	@FindBy(xpath = "//*[@id=\"password\"]/div/div/input")
	public WebElement senha;
	
	@FindBy(xpath = "//*[@id=\"login-btn\"]")
	public WebElement botao;
	
	public LoginPage() {
		//PageFactory.initElements(driver, this);
		PageFactory.initElements(driver, this);
	}
	
	public void login() {

		
		waitExpectElement(botao);
		
		//Usuario Incorreto e Senha Incorreto
		usuario.sendKeys("TESTEUTOMATIZADO");
		senha.sendKeys("Alltax2");
		sleep(1000);
		botao.click();
		usuario.clear();
		senha.clear();
		sleep(1000);
		
		//Usuario Incorreto e Senha Correta
		usuario.sendKeys("TESTEUTOMATIZADO");
		senha.sendKeys("Alltax20");
		sleep(1000);
		botao.click();
		usuario.clear();
		senha.clear();
		sleep(1000);
		
		//Usuario Correto e Senha Incorreta
		usuario.sendKeys("TESTEAUTOMATIZADO");
		senha.sendKeys("Alltax2");
		sleep(1000);
		botao.click();
		usuario.clear();
		senha.clear();
		sleep(1000);
		
		//Usuario Correto e Senha Correta
		usuario.sendKeys("TESTEAUTOMATIZADO");
		senha.sendKeys("Alltax20");
		sleep(1000);
		botao.click();
		waitExpectXpath("//*[@id=\"home-icon\"]");

	
		
	}
	

}
