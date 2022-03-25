package com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesPublicas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ExecucoesFiltroPorIDMasLimpiarFiltrosPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Execuções\"]")
	public WebElement abaExecucoes;
	
	@FindBy(xpath = "//span[text()=\"Execuções Públicas\"]")
	public WebElement execucoesPublicas;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement inputPesquisar;
	
	@FindBy(xpath = "//span[text() = \"Limpar Filtros\"]")
	public WebElement btnLimpiarFiltro;
	
	public ExecucoesFiltroPorIDMasLimpiarFiltrosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtroPorID() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		abaExecucoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		execucoesPublicas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistro = "0";
		
		if(rows > 0) {
			idRegistro = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @data-id][1]/div[5]/div")).getText();
		}
		
		System.out.println("Id Registro a buscar: " + idRegistro);
		
		inputPesquisar.click();
		inputPesquisar.sendKeys(idRegistro);
		inputPesquisar.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idResultado = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @data-id][1]/div[5]/div")).getText();
		System.out.println("Id Resultado: " + idResultado);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if(idResultado.equals(idRegistro)) {
			sucesso.add(true);
			System.out.println("Registro encontrado...");
		}else {
			System.out.println("No se encontro el registro de la busqueda...");
			sucesso.add(false);
		}
		
		btnLimpiarFiltro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		if(rows2 >= rows) {
			sucesso.add(true);
			System.out.println("Filtro limpiado satisfactoriamente...");
		}else {
			sucesso.add(false);
			System.out.println("No se pudo limpiar el filtro...");
		}
		
		return sucesso;
	}
}
