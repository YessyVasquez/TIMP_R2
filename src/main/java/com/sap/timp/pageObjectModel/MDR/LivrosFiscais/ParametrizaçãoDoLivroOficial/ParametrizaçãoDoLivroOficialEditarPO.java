package com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrizaçãoDoLivroOficial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ParametrizaçãoDoLivroOficialEditarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Ajustes\"]")
	public WebElement menuAjustesCerrar;
	
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Livros Fiscais\"]")
	public WebElement menuLivrosFiscais;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-officialFiscalBook\"]")
	public WebElement submenoParametrizacaoDoLivroOficial;

	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement Sim;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[1]/div[1]/div/div[1]")
	public WebElement tipoDoLibro;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement tipoDoLibroenviar;
	
	@FindBy(xpath = "//div[@class=\"list\"][2]/div[1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[1]/div[1]/div[1]/div[2]")
	public WebElement eliminar;
	@FindBy(xpath = "//div[@class=\"list\"][2]/div[2]")
	public WebElement opcionComboenviar;
	
	public ParametrizaçãoDoLivroOficialEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Editar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menuLivrosFiscais.click();
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		submenoParametrizacaoDoLivroOficial.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("ParametrizaçãoDoLivroOficial");

		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(24000);
	
		
	  	String valor = tipoDoLibro.getText();
		System.out.println(valor);
		sleep(2000);
		
		eliminar.click();
		sleep(2000);
		
		tipoDoLibroenviar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		opcionComboenviar.click();
		sleep(2000);	
		
		closeSelectTypeCheckbox(tipoDoLibroenviar);
		sleep(2000);
		
		String enviar = tipoDoLibro.getText();
		System.out.println(enviar);
		
		Gravar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		editar1.click();
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(3000);
	//	attributoNotToBeEmptyElement(tipoDoLibro, "value");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(22000);
		
		String nuevoTexto = tipoDoLibro.getText();
		System.out.println(valor);
		System.out.println(nuevoTexto);
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);
		
		eliminar.click();
		sleep(2000);
		
		tipoDoLibroenviar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		opcionCombo.click();
		sleep(2000);	
		closeSelectTypeCheckbox(tipoDoLibroenviar);
		sleep(2000);
		Gravar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
			 
		
		return sucesso;
	}
}
