package com.sap.timp.pageObjectModel.MDR.Centralizacao.Tributos;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class TributosFiltrarPO extends TestBaseFernando{
	@FindBy(xpath = "//li/div/span[text()=\"Centralização\"]")
	public WebElement centralização;
	
	@FindBy(xpath = "//li/div/span[text()=\"Tributos\"]")
	public WebElement tributos;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idBusqueda;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	public TributosFiltrarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean filtrar() {
		centralização.click();
		sleep(2000);
		
		tributos.click();
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
