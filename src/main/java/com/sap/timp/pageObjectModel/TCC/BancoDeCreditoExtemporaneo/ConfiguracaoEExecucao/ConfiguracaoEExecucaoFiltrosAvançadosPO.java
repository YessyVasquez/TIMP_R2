package com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.ConfiguracaoEExecucao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ConfiguracaoEExecucaoFiltrosAvançadosPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bce\"]")
	public WebElement bancoCreditoExtemporaneo;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-bceConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;

	@FindBy(xpath = "//div[@class=\"advanced-filter-container\"]/div[1]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"advanced-filter-container\"]/div[1]/div/div/div/input")
	public WebElement empresaInput;
	
	@FindBy(xpath = "//div[@class=\"advanced-filter-container\"]/div[2]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@class=\"advanced-filter-container\"]/div[2]/div/div/div/input")
	public WebElement ufInput;
	
	@FindBy(xpath = "//div[@class=\"advanced-filter-container\"]/div[3]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"advanced-filter-container\"]/div[3]/div/div/div/input")
	public WebElement filialInput;
	
	@FindBy(xpath = "//button/span[text()=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement opc;
	
	String Empresa = "";
	String UF = "";
	String Filial = "";
	
	public ConfiguracaoEExecucaoFiltrosAvançadosPO() {

		PageFactory.initElements(driver, this);
	}

	public void filtro() {
		
		bancoCreditoExtemporaneo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracaoEExecucao.click();
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
		
		opc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		
		this.Empresa = empresaInput.getAttribute("value");
		System.out.println(this.Empresa );
		
		uf.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(10000);
		
		opc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		
		this.UF = ufInput.getAttribute("value");
		System.out.println(this.UF );
		sleep(6000);
		filial.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		opc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		this.Filial = filialInput.getAttribute("value");
		System.out.println(this.Filial);
		
		pesquisar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	}
	
	public ArrayList<Boolean> Empresa() {
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();


		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][\"+ rows	\"]/div	[3]/div"))
					.getText();
			System.out.println(textEmpresa + " Empresa");

			sucesso.add((this.Empresa).equals(textEmpresa));

			f = f + 1;
			System.out.println(sucesso);
		}


		return sucesso;
	}
	
	public ArrayList<Boolean> uF() {
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();


		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][\"+ rows	\"]/div	[4]/div"))
					.getText();
			System.out.println(textEmpresa + " uf");

			sucesso.add((this.UF).equals(textEmpresa));

			f = f + 1;
			System.out.println(sucesso);
		}


		return sucesso;
	}
	
	public ArrayList<Boolean> filial() {
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();


		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][\"+ rows	\"]/div	[5]/div"))
					.getText();
			System.out.println(textEmpresa + " filial");

			sucesso.add((this.Filial).equals(textEmpresa));

			f = f + 1;
			System.out.println(sucesso);
		}


		return sucesso;
	}
}
