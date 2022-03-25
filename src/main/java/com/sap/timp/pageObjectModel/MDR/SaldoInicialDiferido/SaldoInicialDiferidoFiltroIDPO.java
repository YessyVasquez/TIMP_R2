package com.sap.timp.pageObjectModel.MDR.SaldoInicialDiferido;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class SaldoInicialDiferidoFiltroIDPO extends TestBaseSteven{
	

	@FindBy(xpath = "//span[text()=\"Saldo Inicial Diferido\"]")
	public WebElement saldoinicialdiferido;

	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	


	
	public SaldoInicialDiferidoFiltroIDPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean filtro() {
		
		sleep(2000);
		saldoinicialdiferido.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = id.getText();
		System.out.println(idRegistro + " ID obtido");
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idBusqueda = id.getText();
		System.out.println(idBusqueda + " ID da Búsqueda");
		
		boolean sucesso = idBusqueda.equals(idRegistro);
		System.out.println(sucesso);
		
		return sucesso;
	
		
		
		
		
		
		
		
	}
	
	
	
	
}
