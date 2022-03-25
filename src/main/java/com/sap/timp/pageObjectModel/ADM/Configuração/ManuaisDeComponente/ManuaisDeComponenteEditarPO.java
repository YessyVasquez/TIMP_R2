package com.sap.timp.pageObjectModel.ADM.Configuração.ManuaisDeComponente;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ManuaisDeComponenteEditarPO extends TestBaseSteven {
	

	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;
	
	@FindBy(xpath = "//span[text()=\"Manuais de Componente\"]")
	public WebElement ManuaisDeComponente;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Manual de Componente\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Componente\"]")
	public WebElement componente;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement componenteOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Idioma\"]")
	public WebElement idioma;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement idiomaOpc;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Data de Início de Vigência\"]")
	public WebElement fecha;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca; 
	
	public ManuaisDeComponenteEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 

		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ManuaisDeComponente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		String idRegistro = idObter("ManuaisDeComponente");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valorOriginal = fecha.getAttribute("value");
		System.out.println("");
		System.out.println("fecha original: " + valorOriginal);
		
		String valorAEnviar = fechaManana();
		System.out.println("");
		System.out.println("Inicio de Vigencia valor a enviar: " + valorAEnviar);
		
		fecha.clear();
		sleep(4000);
		fecha.sendKeys(valorAEnviar);
		sleep(4000);
		
		btnGravar.click();
		sleep(2000);
		
		btnSim.click();
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		attributoNotToBeEmptyElement(fecha, "value");
		String valorEditado = fecha.getAttribute("value");
		System.out.println("");
		System.out.println("Inicio de Vigencia valor editado: " + valorEditado);
		
		boolean sucesso = false;
		
		if(valorEditado.equals(valorAEnviar)) {
			System.out.println("Registro editado correctamente...");
			sucesso = true;
		}else {
			System.out.println("No se pudo editar el registro...");
		}
		
		return sucesso;

	}

}
