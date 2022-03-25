package com.sap.timp.pageObjectModel.SCANC.OficiosExtemporaneos;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class OficiosExtemporaneosFiltrosAvancadosPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Ofícios extemporâneos\"]")
	public WebElement oficiosExtemporaneos;
	
	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement btnFiltrosAvanzados;
	
	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement btnLimpiarFiltros;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por Subperíodo\"]")
	public WebElement inputFiltrar;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	public OficiosExtemporaneosFiltrosAvancadosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean filtrosAvancados() {
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		oficiosExtemporaneos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		boolean sucesso = false;
		
		if(rows == 0) {
			System.out.println("No hay registros");
			return sucesso;
		}else {
			sucesso = true;
		}
		
		String subperiodo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]/div")).getText();
		
		
	//	String subperiodoFormatString = "01/" + subperiodo;
		System.out.println("Subperiodo: " + subperiodo);
//		System.out.println("Subperiodo formateado: " + subperiodoFormatString);
		
		btnFiltrosAvanzados.click();
		sleep(2000);
		
		waitExpectElement(inputFiltrar);
		inputFiltrar.sendKeys(subperiodo);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(inputFiltrar);
		inputFiltrar.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		body.click();
		
		waitExpectElement(btnLimpiarFiltros);
		btnLimpiarFiltros.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
	
		
		return sucesso;
	}
}
