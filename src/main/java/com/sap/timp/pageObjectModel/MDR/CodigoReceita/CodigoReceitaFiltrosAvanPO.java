package com.sap.timp.pageObjectModel.MDR.CodigoReceita;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class CodigoReceitaFiltrosAvanPO extends TestBaseKenssy {
	@FindBy(xpath = "//span[text()=\"Código da Receita\"]")
	public WebElement codigoReceita;
	
	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;
	
	@FindBy(xpath = "//button/span[text()=\"Aplicar filtros\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	//FILTROS
	@FindBy(xpath = "//div[@id=\"idTax\"]/div/div/div[2]")
	public WebElement tributo;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement opcTributo;
	
	@FindBy(xpath = "//*[@id=\"dataIniVigencia\"]/div/div[1]/input")
	public WebElement filtroDataInicialVigencia;
	
	@FindBy(xpath="//body")
	public WebElement clickFuera;
	
	public CodigoReceitaFiltrosAvanPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtroTributo() {
		sleep(2000);
		codigoReceita.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tributo.click();
		sleep(1000);
		String tributoText = opcTributo.getText();
		opcTributo.click();
		sleep(1000);
		//String empresaText = opcEmpresa.getText();
		System.out.println("VIENE EN EL SELECT TRIBUTO: "+ tributoText);
		
//		aplicar.click();
//		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[6]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " empresa Filtro");
			sucesso.add(tributoText.equals(textFiltroEmpresa));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> filtroDataInicialVigencia() {
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		filtros.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		String dataV = dataanterior();
		filtroDataInicialVigencia.sendKeys(fechaActual());
		sleep(1000);
		
		String dataText = filtroDataInicialVigencia.getAttribute("value");
		System.out.println("filtro a buscar fecha: "+dataText);
		//opcEmpresa.click();
		sleep(2000);
		//aplicar.click();
//		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroData = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[11]/div"))
					.getText();
			System.out.println(textFiltroData + " data Filtro");
			sucesso.add(dataText.equals(textFiltroData));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
}
