package com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.TabelaDeApoioECF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class TabelaDeApoioECFEditarPO extends TestBaseFernando{
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Cadastros IRPJ/CSLL\"]")
	public WebElement cadastroIRPJCSLL;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-supportParameterECF\"]")
	public WebElement tabelaDeApoioECF;
	
	@FindBy(xpath = "//div[contains(@class, \"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\")][1]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//div[@id=\"end-date\"]/div/div[1]/input")
	public WebElement fecha;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement Sim;
	

	
	public TabelaDeApoioECFEditarPO () {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Editar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(cadastroIRPJCSLL);
		cadastroIRPJCSLL.click();
		sleep(1000);
		
		tabelaDeApoioECF.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro =idObter("TabelaDeApoioECF");
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
	//	sleep(2000);
	  	sleep(44000);
	  	
	  	
	  	
	  	String valor = fecha.getAttribute("value");
		System.out.println(valor);
		
		fecha.clear();
	  	sleep(2000);
	  	
	  	String enviar = fechaActual();
	  	System.out.println("Fecha enviada: "+enviar);
	  	
		
	  	fecha.sendKeys(enviar);
	  	sleep(3000);
	  	
	  	Gravar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		Sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		driver.navigate().refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(64000);

		
		String nuevoTexto = fecha.getAttribute("value");
		
		System.out.println("Fecha que tenia el registro antes de editar: "+valor);
		System.out.println("Fecha que muestra despues de editar y recargar"+nuevoTexto);
		
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);
		
		fecha.clear();
		sleep(2000);
		
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
