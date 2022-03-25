package com.sap.timp.pageObjectModel.MDR.CodigoContabilizacao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class CodigoContabilizacaoFiltrosAvanPO extends TestBaseKenssy {
	@FindBy(xpath = "//span[text()=\"Códigos de Contabilização\"]")
	public WebElement codigoscontabilizacao;

	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;
	
	@FindBy(xpath = "//button/span[text()=\"Aplicar filtros\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	//DATOS A FILTRAR
	
	@FindBy(xpath = "//div[@id=\"codEmpresa\"]/div/div/div[2]")
	public WebElement empresa;
	@FindBy(xpath = "//li[text()=\"6911\"]")
	public WebElement opcEmpresa;
	
	@FindBy(xpath = "//*[@id=\"dataIniVigencia\"]/div/div[1]/input")
	public WebElement data;
	
	
	public CodigoContabilizacaoFiltrosAvanPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> filtroEmpresa() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		codigoscontabilizacao.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		String empresaText = opcEmpresa.getText();
		opcEmpresa.click();
		sleep(1000);
		//String empresaText = opcEmpresa.getText();
		System.out.println("VIENE EN EL SELECT EMPRESA: "+ empresaText);
		
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
							+ rows + "]/div[4]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " empresa Filtro");
			sucesso.add(textFiltroEmpresa.contains(empresaText));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> filtroDataIniVigencia() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		codigoscontabilizacao.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		sleep(2000);
//		limpar.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
//		filtros.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		String dataV = dataanterior();
		data.sendKeys("30/10/2020");
		sleep(1000);
		
		String dataText = data.getText();
		//opcEmpresa.click();
		sleep(1000);
		aplicar.click();
//		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroData = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[7]/div"))
					.getText();
			System.out.println(textFiltroData + " data Filtro");
			sucesso.add(dataText.equals(textFiltroData));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
}
