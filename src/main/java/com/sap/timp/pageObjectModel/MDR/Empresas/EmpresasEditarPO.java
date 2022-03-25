package com.sap.timp.pageObjectModel.MDR.Empresas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class EmpresasEditarPO extends TestBaseSteven{
	

	@FindBy(xpath = "//li/div/span[text()=\"Empresas\"]")
	public WebElement empresa;
	

	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li/button")
	public WebElement gravar;
	
	@FindBy(xpath = "//div[@id=\"municipalInscription\"]/div/div/input")
	public WebElement campo;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement sim;
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	
	public EmpresasEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		
		empresa.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div");

		String idRegistro = "1000";
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		
		menu.click();
		editar.click();
		
		waitExpectElement(campo);
		sleep(10000);
		

	
		String 	valor = campo.getAttribute("value");
		System.out.println(valor);
		
		String enviar = "Prueba 10";
		System.out.println(enviar);
		campo.clear();
		campo.sendKeys(enviar);
		sleep(12000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		nao.click();
		sleep(3000);
		sleep(2000);
		sim.click();
		sleep(3000);		 

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		
		waitExpectElement(campo);

		sleep(2000);
		
		String nuevoTexto = campo.getAttribute("value");
		System.out.println(nuevoTexto);
		boolean sucesso = nuevoTexto.equals(enviar);
		
		sleep(1000);
		campo.clear();
		sleep(1000);
		campo.sendKeys(valor);
		
		gravar.click();
		
		sleep(2000);
		nao.click();
		sleep(3000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
		System.out.println(sucesso);
		return sucesso;
		
		
		
		
	}
	
	
}
