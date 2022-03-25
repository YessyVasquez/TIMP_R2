package com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RelacionamentoEstruturasFiltroPorIdMasLimpiarFiltrosPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Relacionamentos de Estruturas\"]")
	public WebElement relacionamentoEstruturas;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement inputPesquisar;
	
	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement btnLimpiarFiltros;
	
	public RelacionamentoEstruturasFiltroPorIdMasLimpiarFiltrosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean filtrarPorIdMasLimpiarFiltros() {
		invisibilityOfElementOverlay();
		relacionamentoEstruturas.click();
		invisibilityOfElementOverlay();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		String id = "0";
		
		boolean sucesso = false;
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id][1]/div[3]/div")).getText();
		}else {
			return sucesso;
		}
		
		System.out.println("Id Registro: " + id);
		System.out.println("");
		
		inputPesquisar.sendKeys(id);
		inputPesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElementOverlay();
		
		int rowsResultados = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		String idResultado = "0";
		
		System.out.println("Rows resultado de busqueda: " + rowsResultados);
		
		if(rowsResultados == 0) {
			System.out.println("No se encontraron resultado con el ID de busqueda...");			
			return sucesso;
		}
		
		idResultado = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id][1]/div[3]/div")).getText();
		
		if(idResultado.equals(id)) {
			System.out.println("Busqueda realizada con sucesso...");
			sucesso = true;
		}else {
			System.out.println("El id de busqueda con el resultado no son iguales...");
			return sucesso;
		}
		
		sleep(2000);
		btnLimpiarFiltros.click();
		invisibilityOfElementOverlay();
		
		rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		System.out.println("Rows al limpiar filtros: " + rows);
		
		if(rows > rowsResultados) {
			System.out.println("Filtros limpiados...");
			sucesso = true;
		}else {
			sucesso = false;
			System.out.println("No se limpio el filtro...");
		}
		
		return sucesso;
	}
}
