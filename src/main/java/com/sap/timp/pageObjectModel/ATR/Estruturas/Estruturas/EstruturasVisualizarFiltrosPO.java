package com.sap.timp.pageObjectModel.ATR.Estruturas.Estruturas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;


public class EstruturasVisualizarFiltrosPO extends TestBaseFernando{
	@FindBy(xpath = "//div[@class=\"baseTabs-view-container\"]/div[1]/ul/li/div/span[text()=\"Estruturas\"]")
	public WebElement estruturas;

	@FindBy(xpath = "//div[@id=\"struc-cont\"]/ul/li[1]/ul/li[1]/div/div/div[1]/span[1]")
	public WebElement abrirTab;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement inputPesquisar;

	public EstruturasVisualizarFiltrosPO() {
		PageFactory.initElements(driver, this);
	}

	public boolean visualizar() {
		invisibilityOfElementOverlay();
		estruturas.click();
		invisibilityOfElementOverlay();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		

		String idRegistro = "0"; // Id Registro

		if(rows > 0) {
			idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
			System.out.println("ID Registro: " + idRegistro);
		}

		WebElement menu = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: "+idRegistro+ "\")]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[contains(@aria-label, \"ID: "+idRegistro+ "\")]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		abrirTab.click();
		invisibilityOfElementOverlay();

		String cantidadRegistro = driver.findElement(By.xpath("//div[@id=\"struc-cont\"]/ul/li[1]/ul/li[1]/div/div/div[2]/span")).getText().trim();
		System.out.println("");
		System.out.println("Cantidad de registros: " + cantidadRegistro);

		String valorBuscar = driver.findElement(By.xpath("//div[@id=\"struc-cont\"]/ul/li[1]/ul/li[1]/ul/li[2]/div/div/div/div[2]/span")).getText().trim();
		System.out.println("");
		System.out.println("Valor a buscar: " + valorBuscar);

		inputPesquisar.sendKeys(valorBuscar);
		inputPesquisar.sendKeys(Keys.ENTER);

		sleep(3000);
		String cantidadRegistroResultadoBusqueda = driver.findElement(By.xpath("//div[@id=\"struc-cont\"]/ul/li[1]/ul/li[1]/div/div/div[2]/span")).getText().trim();
		System.out.println("");
		System.out.println("Cantidad de registros resultados busqueda: " + cantidadRegistroResultadoBusqueda);

		boolean sucesso = false;

		if(convertToInt(cantidadRegistroResultadoBusqueda) > 0) {
			System.out.println("Se encontraron resultados...");
			sucesso = true;
		}else {
			System.out.println("No se encontraron resultados de la busqueda...");
			return sucesso;
		}

		sleep(2000);

		inputPesquisar.clear();
		inputPesquisar.sendKeys(Keys.ENTER);


		String cantidadRegistroAlBorrar = driver.findElement(By.xpath("//div[@id=\"struc-cont\"]/ul/li[1]/ul/li[1]/div/div/div[2]/span")).getText().trim();
		System.out.println("");
		System.out.println("Total registros al borrar la busqueda: " + cantidadRegistroAlBorrar);

		if(convertToInt(cantidadRegistroAlBorrar) > 1) {
			System.out.println("Busqueda borrada");
			sucesso = true;
		}else {
			System.out.println("Al borrar la busqueda no hay datos...");
			return sucesso = false;
		}

		return sucesso;
	}
}