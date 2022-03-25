package com.sap.timp.pageObjectModel.MDR.CadastroEspecificodoINSS.CadastroDeObras;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

import junit.extensions.TestSetup;

public class CadastroDeObrasEditarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\" Cadastro Especifico do INSS (CEI)\"]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//span[text()=\" Cadastro de Obras\"]")
	public WebElement obras;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][\"+rows+\"]/div[3]/div")
	public WebElement ultimoId;
	
	@FindBy(xpath = "//div[@class=\"action-button\"]")
	public WebElement botonMenu;
	
	@FindBy(xpath = "//div[@class=\"popover active\"]/ul/li/span[text()=\"Editar\"]")
	public WebElement botonEditar;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher CEI\"]")
	public WebElement CEI;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement Sim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	public CadastroDeObrasEditarPO() {
		PageFactory.initElements(driver, this);
	}
	

	public boolean  Editar() {

		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	    cadastro.click();
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		obras.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro =idObter("CadastroDeObras");
		
	    sleep(2000);
	    
	    botonMenu.click();
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	  	sleep(2000);
	  	
	  	//atribute es para que espere que cargue todo el formulario
	    botonEditar.click(); 
	    sleep(5000);
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	    
	    attributoNotToBeEmptyElement(CEI, "value");
	  	sleep(2000);
	  	
	  	
		
		String valor = CEI.getAttribute("value");

		String enviar = "125";
		
		sleep(1000);
		CEI.clear();

		sleep(1000);
		CEI.sendKeys(enviar);

		Gravar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		Sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
			
		driver.navigate().refresh();
		sleep(3000);
		attributoNotToBeEmptyElement(CEI, "value");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String nuevoTexto = CEI.getAttribute("value");
		System.out.println(valor);
		System.out.println(nuevoTexto);
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);
		
		CEI.clear();
		sleep(2000);
		
		sleep(1000);
		CEI.sendKeys(valor);

		Gravar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
			 
		Sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
			
		return sucesso;
	    
	}
}
