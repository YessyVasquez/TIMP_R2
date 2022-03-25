package com.sap.timp.pageObjectModel.ADM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class LoginTC extends TestBaseSteven{
	
	
	
	@FindBy(xpath = "//*[@id=\"login-username\"]/div/div/input")
	public WebElement usuario;
	
	@FindBy(xpath = "//*[@id=\"password\"]/div/div/input")
	public WebElement senha;
	
	@FindBy(xpath = "//*[@id=\"login-btn\"]")
	public WebElement botao;
	
	public LoginTC() {
		PageFactory.initElements(driver, this);
	}
	
	public void login() {
		 
		
		waitExpectElement(botao);
			
		
		//Usuario Correto e Senha Correta
		usuario.sendKeys(usuarioL);
		senha.sendKeys(senhaL);
		sleep(1000);
		botao.click();
		waitExpectXpath("//*[@id=\"home-icon\"]");

	
		
	}
	

}
