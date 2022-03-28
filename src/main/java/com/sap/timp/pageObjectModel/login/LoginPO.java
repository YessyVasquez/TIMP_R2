package com.sap.timp.pageObjectModel.login;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.assertTrue;
import com.sap.timp.base.TestBase;

public class LoginPO extends TestBase{
	
	
	@FindBy(xpath = "//*[@id=\"login-username\"]/div/div/input")
	public WebElement txtUsuario;
	
	@FindBy(xpath = "//*[@id=\"password\"]/div/div/input")
	public WebElement txtSenha;
	
	@FindBy(xpath = "//*[@id=\"login-btn\"]")
	public WebElement btnLogin;
	
	public void LoginPO() {

		PageFactory.initElements(driver, this);
	}
	
	String usuario1 ="Teste";
	String senha1 ="Senha1";
	
	public void inserirUsuario(String usuario) {
		sendKeys(txtUsuario,usuario);
		
	}
	
	public void inserirSenha(String senha) {
		sendKeys(txtSenha,senha);
		
	}
	
	public void cliclarLogin() {
		click(btnLogin);
		
	}
	
	public void verificarLogin() {
		 
		
		waitExpectedElement(btnLogin);
			
		
		//Usuario Correto e Senha Correta
		
		inserirUsuario(usuario1);
		inserirSenha(senha1);
		cliclarLogin();
		
		 int rows = rows("//span[@id=\"wrong-user\"]");
		 
		 boolean acessar = false;
		 
		 if (rows == 1) {
			acessar = true;
		}
		 
		 assertTrue(acessar,semAcesso);
		
		
		
	}
	
}
