package com.sap.timp.pageObjectModel.MDR.Centralizacao.Saldos;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class SaldosFiltrarIdPO extends TestBaseKenssy{
	@FindBy(xpath = "//span[text()=\"Centralização\"]")
	public WebElement centralizacao;
	
	@FindBy(xpath = "//span[text()=\"Saldos\"]")
	public WebElement saldos;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement inputBuscar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id][1]/div[3]/div")
	public WebElement resultadoBusqueda;
	
	@FindBy(xpath = "//div[@class=\"tr\"]/div[3]")
	public WebElement trOrdenarMayMen;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idBuscado;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idBuscadoEjemplo;
	
	public SaldosFiltrarIdPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean FiltrarSaldosId() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		centralizacao.click();
		sleep(2000);
		saldos.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		inputBuscar.sendKeys(idBuscado.getText());
		inputBuscar.sendKeys(Keys.ENTER);
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String success = idBuscado.getText();
		boolean dato= success.contains(idBuscado.getText());
		System.out.println(success);
		
		return dato;
	}
}
