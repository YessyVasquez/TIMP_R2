package com.sap.timp.pageObjectModel.ATR.Arquivos.CarregamentoDeArquivos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CarregamentoDeArquivosFiltroPorIDPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Arquivos\"]")
	public WebElement arquivos;
	
	@FindBy(xpath = "//span[text()=\"Carregamento de Arquivos\"]")
	public WebElement carregamentodearquivos;
	
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar; 
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	

	public CarregamentoDeArquivosFiltroPorIDPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> filtro() {

		sleep(2000);
		arquivos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		carregamentodearquivos.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		String idRegistro = id.getText();
		System.out.println(idRegistro + " Id Registro");
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String idBusqueda = id.getText();
		System.out.println(idBusqueda + " Id Busqueda");
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		System.out.println(rows1 + " Numeros de Filas");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(idRegistro.equals(idBusqueda));
		//waitExpectElement(limpar);
		sleep(24000);
		
		limpar.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(15000);
		
		
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		System.out.println(rows2 + " Numeros de Filas");
		
		if (rows2 != rows1) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		
		System.out.println(sucesso);

		return sucesso;

	}


}
