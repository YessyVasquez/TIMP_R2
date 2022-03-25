package com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.FatosContabeis;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class FatosContabeisFiltrarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\" Tabelas de Apoio ECD\"]")
	public WebElement tabelaECDE;
	
	@FindBy(xpath = "//span[text()=\" Fatos Contábeis \"]")
	public WebElement opcionFatosContabeis;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idBusqueda;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	public FatosContabeisFiltrarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean filtrarFatosContabeis() {
		sleep(2000);
		tabelaECDE.click();
		
		sleep(2000);
		opcionFatosContabeis.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistroBuscar = idBusqueda.getText();
		System.out.println(idRegistroBuscar);

		pesquisar.sendKeys(idRegistroBuscar);
		pesquisar.sendKeys(Keys.ENTER);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idBusquedaResultado = idBusqueda.getText();
		System.out.println(idBusquedaResultado);
		
		boolean sucesso = false;
		sucesso = idBusquedaResultado.equals(idRegistroBuscar);
		
		return sucesso;
	}
}
