package com.sap.timp.pageObjectModel.MDR.SCANC.SCANCDistribuidoras;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class SCANCDistribuidorasEditarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"SCANC Distribuidoras\"]")
	public WebElement scancDistribuidoras;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Nome\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"action-button\"]")
	public WebElement botonMenu;
	
	@FindBy(xpath = "//div[@class=\"popover active\"]/ul/li/span[text()=\"Editar\"]")
	public WebElement botonEditar;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\")]")
	public WebElement dataVigencia;
	
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement Sim;
	
	
	public SCANCDistribuidorasEditarPO() {

		PageFactory.initElements(driver, this);
		
	}

        public boolean Editar() {

		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		scanc.click();
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		scancDistribuidoras.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("SCANCDistribuidora");
		System.out.println(idRegistro);
		
        sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		
		attributoNotToBeEmptyElement(empresa, "value");
	  	sleep(2000);
	  	
	  	
		
		String valor = empresa.getAttribute("value");
		System.out.println(valor);
		String enviar = "Test25";
		

		sleep(1000);
		empresa.clear();

		sleep(1000);
	    empresa.sendKeys(enviar);
        
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
		attributoNotToBeEmptyElement(empresa, "value");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String nuevoTexto = empresa.getAttribute("value");
		System.out.println(valor);
		System.out.println(nuevoTexto);
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);
		
		empresa.clear();
		sleep(2000);
		
		sleep(1000);
		empresa.sendKeys(valor);

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