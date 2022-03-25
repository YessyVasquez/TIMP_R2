package com.sap.timp.pageObjectModel.MDR.LimiteCompetencia;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class LimiteCompetenciaFiltrosAvansadosPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Limite de Competência\"]")
	public WebElement limiteCompetencia;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;

	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por Empresa\"]")
	public WebElement opcEmpresa;

	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por UF\"]")
	public WebElement opcUf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por Filial\"]")
	public WebElement opcFilial;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por Tributo\"]")
	public WebElement opcTributo;
	
	@FindBy(xpath = "//div[@id=\"approval-level\"]/div/div/div[2]")
	public WebElement nivel;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por Nível de Aprovação\"]")
	public WebElement opcNivel;
	
	public LimiteCompetenciaFiltrosAvansadosPO() {

		PageFactory.initElements(driver, this);
	}
	
	public  String  Filtros() {
		
		limiteCompetencia.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("LimiteCompetencia");
		System.out.println(idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]"));
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
	
		
		String textEmpresa1 = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[3]/div"))
				.getText();
		
		System.out.println(textEmpresa1);

		return textEmpresa1;
	}
	
	
	public  String  Filtros1() {
		
		String idRegistro = idObter("LimiteCompetencia");
		System.out.println(idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]"));
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
	
		
		String textuf1 = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[4]/div"))
				.getText();
		
		System.out.println(textuf1);

		return textuf1;
	}
	
	
	public  String  Filtros2() {
		
		String idRegistro = idObter("LimiteCompetencia");
		System.out.println(idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]"));
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
	
		
		String textFilial = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[5]/div"))
				.getText();
		
		System.out.println(textFilial);

		return textFilial;
	}
	
	public  String  Filtros3() {
		
		String idRegistro = idObter("LimiteCompetencia");
		System.out.println(idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]"));
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
	
		
		String textTributo = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[6]/div"))
				.getText();
		
		System.out.println(textTributo);

		return textTributo;
	}
	
	
	public  String  Filtros4() {
		
		String idRegistro = idObter("LimiteCompetencia");
		System.out.println(idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]"));
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
	
		
		String textNivel = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[9]/div"))
				.getText();
		
		System.out.println( textNivel );

		return  textNivel ;
	}

	public ArrayList<Boolean> Empresa() {
		
		String empresa1 = Filtros();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcEmpresa1 = driver
				.findElement(By.xpath("//li[text()=\""+ empresa1 + "\"]"));
		
		opcEmpresa1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textopcEmpresa = opcEmpresa.getAttribute("value");
		System.out.println(textopcEmpresa);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[3]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " empresa Filtro");
			sucesso.add(textopcEmpresa.equals(textFiltroEmpresa));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> Uf() {
		
		String uf1 = Filtros1();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		uf.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcUF1 = driver
				.findElement(By.xpath("//li[text()=\""+ uf1 + "\"]"));
		
		opcUF1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textOpcUf = opcUf.getAttribute("value");
		System.out.println(textOpcUf );

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[4]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " Uf Filtro");
			sucesso.add(textOpcUf.equals(textFiltroEmpresa));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> Filial() {
		
		String filial1 = Filtros2();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcFilial1 = driver
				.findElement(By.xpath("//li[text()=\""+ filial1  + "\"]"));
		
		opcFilial1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textOpcFilial = opcFilial.getAttribute("value");
		System.out.println(textOpcFilial );

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[5]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " Filial Filtro");
			sucesso.add(textOpcFilial.equals(textFiltroEmpresa));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> Tributo() {
		
		String tributo1 = Filtros3();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tributo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcTributo1 = driver
				.findElement(By.xpath("//li[text()=\""+ tributo1  + "\"]"));
		
		opcTributo1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textOpcTributo = opcTributo.getAttribute("value");
		System.out.println(textOpcTributo );

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[6]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " Tributo Filtro");
			sucesso.add(textOpcTributo.equals(textFiltroEmpresa));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> Nivel() {
		
		String nivel1 = Filtros4();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nivel.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcNivel1 = driver
				.findElement(By.xpath("//li[text()=\""+ nivel1  + "\"]"));
		
		opcNivel1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textOpcNivel = opcNivel.getAttribute("value");
		System.out.println(textOpcNivel );

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[9]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " Nivel Filtro");
			sucesso.add(textOpcNivel.equals(textFiltroEmpresa));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
}
