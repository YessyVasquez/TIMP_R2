package com.sap.timp.pageObjectModel.MDR.RegistroECAC;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class RegistroECACFiltrosAvanPO extends TestBaseKenssy{
	@FindBy(xpath = "//span[text()=\"Registro ECAC\"]")
	public WebElement registroecac;
	

	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;
	
	@FindBy(xpath = "//button/span[text()=\"Aplicar filtros\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	//FILTROS
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
	public WebElement opcEmpresa1;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[2]")
	public WebElement opcEmpresa;
	
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
	public WebElement opcfilial;
	
	@FindBy(xpath="//body")
	public WebElement clickFuera;
	
	
	
	public RegistroECACFiltrosAvanPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtroEmpresa() {
		sleep(2000);
		registroecac.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		empresa.click();
		sleep(2000);
		opcEmpresa.click();
		sleep(2000);
		String empresaText = opcEmpresa.getText();
		System.out.println("VIENE EN EL SELECT: "+ empresaText);
		
		
		clickFuera.click();
		sleep(1000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[4]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " empresa Filtro");
			sucesso.add(empresaText.equals(textFiltroEmpresa));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> filtroFilial() {
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		filtros.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		filial.click();
		sleep(1000);
		
		opcEmpresa.click();
		sleep(1000);
		
		String filialText = opcEmpresa.getText();
		System.out.println("VIENE EN EL SELECT filial: "+ filialText);
		closeSelectTypeCheckbox(filial);
		 sleep(6000);
		 
		 
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroFilial = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[6]/div"))
					.getText();
			System.out.println(textFiltroFilial + " filial Filtro");
			sucesso.add(filialText.equals(textFiltroFilial));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}

}
