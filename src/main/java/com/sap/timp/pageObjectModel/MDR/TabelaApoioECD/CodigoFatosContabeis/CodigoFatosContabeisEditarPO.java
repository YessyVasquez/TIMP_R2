package com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.CodigoFatosContabeis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class CodigoFatosContabeisEditarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\" Tabelas de Apoio ECD\"]")
	public WebElement tabelaECDE;
	
	@FindBy(xpath = "//span[text()=\" Código dos Fatos Contábeis\"]")
	public WebElement opcionCodigoFatosContabeis;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@id=\"endDate-1\"]/div/div/input")
	public WebElement inputDataFinal;
	
	public CodigoFatosContabeisEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editarCodigoFatosContabeis() {
		sleep(2000);
		tabelaECDE.click();
		
		sleep(2000);
		opcionCodigoFatosContabeis.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String idRegistro = idObter("CodigoFatosContabeis");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		inputDataFinal.clear();
		inputDataFinal.sendKeys(fechaActual());
		System.out.println(fechaActual());
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		btnSim.click();
		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Recargo la pagina
		driver.navigate().refresh();
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(inputDataFinal);
		String fechaEditada = inputDataFinal.getAttribute("value");
		System.out.println(fechaEditada);
		
		boolean sucesso = false;
		sucesso = fechaEditada.equals(fechaActual()); // Si es igual significa que si fue editado y que se mantiene el valor al actualizar la pagina
		
		return sucesso;
	}
}
