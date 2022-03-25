package com.sap.timp.pageObjectModel.TCC.TransferenciaDeSaldosCredores;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class TransferenciaDeSaldosCredoresFiltrosAvancadosPO extends TestBaseKenssy{

	@FindBy(xpath = "//li[contains(@identifier,\"accordion-item-balanceTransfer\")]")
	public WebElement transferenciaSaldos;
	
	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	//DATOS A FILTRAR
	//EMPRESA
	@FindBy(xpath = "//div[@id=\"companyFilter\"]/div/div/div[2]")
	public WebElement empresa;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement opcEmpresa;
	
	//ESTADO
	@FindBy(xpath = "//div[@id=\"ufFilter\"]/div/div/div[2]")
	public WebElement estado;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement opcEstado;

	
	//Filial Origem
	@FindBy(xpath = "//div[@id=\"branchOrigimFilter\"]/div/div/div[2]")
	public WebElement filialO;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement opcFilialO;
	
	//Filial Destino
	@FindBy(xpath = "//div[@id=\"branchDestinationFilter\"]/div/div/div[2]")
	public WebElement filialD;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement opcFilialD;
	
	//Tributo
	@FindBy(xpath = "//div[@id=\"taxFilter\"]/div/div/div[2]")
	public WebElement tributo;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement opcTributo;
	
	
	
	public TransferenciaDeSaldosCredoresFiltrosAvancadosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtroEmpresa() {
		sleep(2000);
		transferenciaSaldos.click();
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
		//String empresaText = opcEmpresa.getText();
		System.out.println("VIENE EN EL SELECT EMPRESA: "+ empresaText);
		
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
							+ rows + "]/div[3]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " empresa Filtro");
			sucesso.add(textFiltroEmpresa.contains(empresaText));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	

	public ArrayList<Boolean> filtroEstado() {
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		estado.click();
		sleep(1000);
		String empresaText = opcEmpresa.getText();
		opcEstado.click();
		sleep(1000);
		//String empresaText = opcEmpresa.getText();
		System.out.println("VIENE EN EL SELECT ESTADO: "+ empresaText);
		
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
							+ rows + "]/div[6]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " estado Filtro");
			sucesso.add(textFiltroEmpresa.contains(empresaText));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}


	
	public ArrayList<Boolean> filtroFilialOrigem() {
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filialO.click();
		sleep(1000);
		String empresaText = opcEmpresa.getText();
		opcFilialO.click();
		sleep(1000);
		//String empresaText = opcEmpresa.getText();
		System.out.println("VIENE EN EL SELECT Filial Origem: "+ empresaText);
		
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
			System.out.println(textFiltroEmpresa + " Filial Origem Filtro");
			sucesso.add(textFiltroEmpresa.contains(empresaText));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}



	public ArrayList<Boolean> filtroFilialDestino() {
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filialD.click();
		sleep(1000);
		String empresaText = opcEmpresa.getText();
		opcFilialD.click();
		sleep(1000);
		//String empresaText = opcEmpresa.getText();
		System.out.println("VIENE EN EL SELECT FILIAL DESTINO: "+ empresaText);
		
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
							+ rows + "]/div[5]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " Filial Destino Filtro");
			sucesso.add(textFiltroEmpresa.contains(empresaText));

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
		
		tributo.click();
		sleep(1000);
		String empresaText = opcEmpresa.getText();
		opcTributo.click();
		sleep(1000);
		//String empresaText = opcEmpresa.getText();
		System.out.println("VIENE EN EL SELECT TRIBUTO: "+ empresaText);
		
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
							+ rows + "]/div[7]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " tributo Filtro");
			sucesso.add(textFiltroEmpresa.contains(empresaText));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}


}
