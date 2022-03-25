package com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AssociacaoAtividadeFiscal;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class AssociaçãoFiltrosAvancadosPO extends TestBaseKenssy{

	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement menuActividadesFiscais;
	
	@FindBy(xpath = "//div[contains(@class, \"accordion-container\")]/ul/li/ul/li/div/span[text()=\"Associação de Atividade Fiscal\"]")
	public WebElement subMenuAssociaçãoActividadesFiscais;
	
	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	
	@FindBy(xpath = "//div[@id=\"codEmpresa\"]/div/div/div[2]")
	public WebElement empresa;
	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div[2]")
	public WebElement empresaOPC;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement uf;
	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div[2]")
	public WebElement ufOPC;
	
	@FindBy(xpath = "//div[@id=\"codFilial\"]/div/div/div[2]")
	public WebElement filial;
	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div[2]")
	public WebElement filialOPC;
	
	@FindBy(xpath = "//div[@id=\"descrCodTributoLabel\"]/div/div/div[2]")
	public WebElement tributo;
	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div[2]")
	public WebElement tributoOPC;
	
	public AssociaçãoFiltrosAvancadosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtroEmpresa() {
		sleep(2000);
		menuActividadesFiscais.click();
		
		sleep(2000);
		subMenuAssociaçãoActividadesFiscais.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		String empresaText = empresaOPC.getText();
		empresaOPC.click();
		sleep(1000);
		closeSelectTypeCheckbox(empresa);
		
		System.out.println("VIENE EN EL SELECT EMPRESA: "+ empresaText);
	
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
			System.out.println(textFiltroEmpresa + " empresa Filtro");
			sucesso.add(empresaText.equals(textFiltroEmpresa));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public  ArrayList<Boolean> filtroUF() {
		
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		uf.click();
		sleep(1000);
		String ufText = ufOPC.getText();
		ufOPC.click();
		sleep(1000);
		closeSelectTypeCheckbox(uf);
		//String empresaText = opcEmpresa.getText();
		System.out.println("VIENE EN EL SELECT UF: "+ ufText);
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroUF = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[7]/div"))
					.getText();
			System.out.println(textFiltroUF + " data Filtro");
			sucesso.add(ufText.equals(textFiltroUF));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public  ArrayList<Boolean> filtroFilial() {
		
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filial.click();
		sleep(1000);
		String filialText = filialOPC.getText();
		filialOPC.click();
		sleep(1000);
		closeSelectTypeCheckbox(filial);
		//String empresaText = opcEmpresa.getText();
		System.out.println("VIENE EN EL SELECT FILIAL: "+ filialText);
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroFilial = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[6]/div"))
					.getText();
			System.out.println(textFiltroFilial + " data Filtro");
			sucesso.add(textFiltroFilial.contains(filialText));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public  ArrayList<Boolean> filtroTributo() {
		
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tributo.click();
		sleep(1000);
		String tributoText = tributoOPC.getText();
		tributoOPC.click();
		sleep(1000);
		closeSelectTypeCheckbox(tributo);
		//String empresaText = opcEmpresa.getText();
		System.out.println("VIENE EN EL SELECT TRIBUTO: "+ tributoText);
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroTributo = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[9]/div"))
					.getText();
			System.out.println(textFiltroTributo + " data Filtro");
			sucesso.add(tributoText.contains(textFiltroTributo));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}

}
