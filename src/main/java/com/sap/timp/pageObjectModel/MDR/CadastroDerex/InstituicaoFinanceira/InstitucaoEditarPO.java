package com.sap.timp.pageObjectModel.MDR.CadastroDerex.InstituicaoFinanceira;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class InstitucaoEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"Cadastro DEREX\"]")
	public WebElement derex;
	@FindBy(xpath = "//li/div/span[text()=\"Instituição Financeira\"]")
	public WebElement instituicaoF;
	
	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"financialInstitution\"]/div/div/input")
	public WebElement campo;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	

	

	public InstitucaoEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean editar() {
		
		derex.click();
		sleep(1000);
		instituicaoF.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("InstituicaoFinanceira");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		
		menu.click();
		sleep(2000);
		editar.click();
		sleep(13000);
		//attributeToBeXpath("//div[@id=\"company\"]/div", "class", "base-select required");
		

		String valor = campo.getAttribute("value");
		System.out.println(valor);
		
		String enviar = "Prueba";
		
		campo.clear();
		campo.sendKeys(enviar);
		sleep(9000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(9000);		 
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");

		
		driver.navigate().refresh();
		
		attributeToBeXpath("//div[@id=\"company\"]/div", "class", "base-select required");
		sleep(1000);
		
		String nuevoTexto = campo.getAttribute("value");
		
		System.out.println(nuevoTexto);

		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);
		
		sleep(1000);
		campo.clear();
		sleep(1000);
		campo.sendKeys(valor);
		
		gravar.click();
		
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		
		return sucesso;
		
	}

}
