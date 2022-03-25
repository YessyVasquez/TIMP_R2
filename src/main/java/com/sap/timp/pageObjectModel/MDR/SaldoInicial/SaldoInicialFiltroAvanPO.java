package com.sap.timp.pageObjectModel.MDR.SaldoInicial;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class SaldoInicialFiltroAvanPO extends TestBaseKenssy {

	@FindBy(xpath = "//ul[@class=\"accordion\"]/li[contains(@identifier,\"accordion-item-saldos\")]/div/span[2]")
	public WebElement saldoInicial;
	
	
	@FindBy(xpath="//div[contains(@class,\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\")][2]")
	public WebElement irFinalPagina;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;
	
	@FindBy(xpath = "//button/span[text()=\"Aplicar filtros\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	//datos a filtrar
	@FindBy(xpath = "//div[@id=\"idCompany\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"idBranch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"tribute\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"launchDate\"]/div/div/div[2]")
	public WebElement data;
	
	@FindBy(xpath = "//div[@id=\"reference\"]/div/div/div[2]")
	public WebElement referencia;
	
	@FindBy(xpath = "//div[@id=\"dc\"]/div/div/div[2]")
	public WebElement dc;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement opcEmpresa;
	
	
	public SaldoInicialFiltroAvanPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtroEmpresa() {
		sleep(2000);
		saldoInicial.click();
		
		sleep(2000);
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
//		aplicar.click();
		sleep(2000);
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
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filial.click();
		sleep(1000);
		String filialText = opcEmpresa.getText();
		opcEmpresa.click();
		sleep(1000);
//		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(16000);

		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroFilial = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[5]/div"))
					.getText();
			System.out.println(textFiltroFilial + " filial Filtro");
			sucesso.add(filialText.equals(textFiltroFilial));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> filtroTributo() {
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tributo.click();
		sleep(1000);
		String tributoText = opcEmpresa.getText();
		opcEmpresa.click();
		sleep(1000);
//		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(10000);

		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroTributo = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[6]/div"))
					.getText();
			System.out.println(textFiltroTributo + " tributo Filtro");
			sucesso.add(tributoText.equals(textFiltroTributo));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> filtroData() {
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		data.click();
		sleep(1000);
		String dataText = opcEmpresa.getText();
		opcEmpresa.click();
		sleep(2000);
		//aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(7000);

		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroData = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[8]/div"))
					.getText();
			System.out.println(textFiltroData + " data Filtro");
			sucesso.add(dataText.contains(textFiltroData));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> filtroReferencia() {
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		referencia.click();
		sleep(1000);
		String referenciaText = opcEmpresa.getText();
		opcEmpresa.click();
		sleep(1000);
//		aplicar.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(20000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroReferencia = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[7]/div"))
					.getText();
			System.out.println(textFiltroReferencia + " referencia Filtro");
			sucesso.add(referenciaText.equals(textFiltroReferencia));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> filtroDC() {
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		dc.click();
		sleep(1000);
		String dcText = opcEmpresa.getText();
		opcEmpresa.click();
		sleep(1000);
//		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(20000);
		
	
//		limpar.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroDC = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[9]/div"))
					.getText();
			System.out.println(textFiltroDC + " DC Filtro");
			sucesso.add(dcText.equals(textFiltroDC));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
}
