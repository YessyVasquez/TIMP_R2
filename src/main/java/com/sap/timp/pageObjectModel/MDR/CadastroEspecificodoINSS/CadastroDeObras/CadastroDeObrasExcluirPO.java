package com.sap.timp.pageObjectModel.MDR.CadastroEspecificodoINSS.CadastroDeObras;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class CadastroDeObrasExcluirPO extends TestBaseMassiel {

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
	
	@FindBy(xpath = "//div[@class=\"popover active\"]/ul/li/span[text()=\"Excluir\"]")
	public WebElement botoExcluir;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement Aceptar;
	
	
	public CadastroDeObrasExcluirPO() {
		PageFactory.initElements(driver, this);
	}
	

	public boolean Excluir() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	    cadastro.click();
	    sleep(2000);
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		obras.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro =idObter("CadastroDeObras");
		System.out.println(idRegistro);
		
		botonMenu.click();
		sleep(2000);
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	  	sleep(2000);
	  	
	  	//atribute es para que espere que cargue todo el formulario
	  	botoExcluir.click(); 
	    sleep(5000);
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		Aceptar.click(); 
	    sleep(5000);
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idUltimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		int id1 = convertToInt(idUltimo);
		int id2 = convertToInt(idRegistro);
		System.out.println(id1);
		System.out.println(id2);
		
		System.out.println(idUltimo); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
		
		boolean sucesso = false;
		
		if (id1 != id2) {
			sucesso= true;
		}
		System.out.println(sucesso);
		return sucesso;
	  	
	}
	
}
