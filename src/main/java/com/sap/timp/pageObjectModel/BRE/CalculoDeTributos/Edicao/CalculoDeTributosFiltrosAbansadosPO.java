package com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.Edicao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class CalculoDeTributosFiltrosAbansadosPO extends TestBaseMassiel {
	
	@FindBy(xpath = "//span[text()=\"Cálculo de Tributos\"]")
	public WebElement calculodetributos;

	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;
	
	@FindBy(xpath = "//div[@class=\"regulation-select\"]/div/div/div[2]")
	public WebElement filtrosRegulamento;
	
	@FindBy(xpath = "//li[@id=\"option-46\"]")
	public WebElement filtrosRegulamentoopc;
	
	@FindBy(xpath = "//li[@id=\"option-9\"]")
	public WebElement filtrosRegulamentoopc1;
	
	@FindBy(xpath = "//div[@class=\"structure-select\"]/div/div/div[2]")
	public WebElement filtrosEstructura;
	
	@FindBy(xpath = "//li[@id=\"option-27\"]")
	public WebElement filtrosEstructuraopc;
	
	@FindBy(xpath = "//li[@id=\"option-22\"]")
	public WebElement filtrosEstructuraopc1;
	
	@FindBy(xpath = "//div[@class=\"advanced-filter-container\"]/div[3]/div/div/div[2]")
	public WebElement filtrosTributo;
	
	@FindBy(xpath = "//li[@id=\"option-17\"]")
	public WebElement filtrosTributoopc;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	public CalculoDeTributosFiltrosAbansadosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtrosRegulamento() {
		
		String url = driver.getCurrentUrl();
		
		sleep(2000);
		calculodetributos.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		waitExpectElement(filtrosRegulamento);
		sleep(2000);
		
		filtrosRegulamento.click();
		sleep(1000);
		
		String empresaText;
		if (url.contains("tc2")==true || url.contains("tp1")==true) {
			
			empresaText = filtrosRegulamentoopc1.getText();
			filtrosRegulamentoopc1.click();
			sleep(1000);
			
		}else {
			 empresaText = filtrosRegulamentoopc.getText();
			filtrosRegulamentoopc.click();
			sleep(1000);
		}
		
		
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {
			
			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][\"+ rows + \"]/div[4]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " Regulamiento Filtro");
			
			sucesso.add(( empresaText).equals(textFiltroEmpresa));

			f = f + 1;
			System.out.println(sucesso);
		}
		

		return sucesso;
		
		}
	
	public ArrayList<Boolean> Estructura() {

		String url = driver.getCurrentUrl();
		//sleep(2000);
		//limpar.click();
		//sleep(2000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//sleep(2000);	
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		waitExpectElement(filtrosEstructura);
		sleep(2000);
		
		 filtrosEstructura.click();
		 sleep(2000);
	
		 String estructuraText;
		 
		 if (url.contains("tc2")==true || url.contains("tp1")==true) {
				
			 estructuraText = filtrosEstructuraopc1.getText();
			 filtrosEstructuraopc1.click();
			 sleep(2000);	
			 
			}else {
				estructuraText = filtrosEstructuraopc.getText();
				filtrosEstructuraopc.click();
				sleep(2000);

			}
		 
		 
		 
		 	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			
			
			int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
			int f = 1;
			for (int i = 0; i < rows; i++) {

				String textFiltroestructura = driver
						.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
								+ rows + "]/div[11]/div"))
						.getText();
				System.out.println(textFiltroestructura + " estructura Filtro");
				System.out.println(estructuraText);
				
				sucesso.add(( estructuraText).equals(textFiltroestructura));

				f = f + 1;
			}
			System.out.println(sucesso);

			return sucesso;
		
	}
	
	public ArrayList<Boolean> tributo() {

		String url = driver.getCurrentUrl();
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		
		String  tributoText;
		 
		 if (url.contains("tq1")==true) {
			 	filtrosTributo.click();
			 	sleep(2000);
			 	tributoText =  filtrosTributoopc.getText();
			 	filtrosTributoopc.click();
			 	sleep(2000);
		
			 
			}else {
				
				 tributoText = "no existe";
			}
		 
		 
		 invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			
			if (url.contains("tq1")==true) {
				
			int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
			int f = 1;
			for (int i = 0; i < rows; i++) {

				String textFiltrotributo = driver
						.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
								+ rows + "]/div[7]/div"))
						.getText();
				System.out.println(textFiltrotributo + " tributo Filtro");
				System.out.println(tributoText);
				
				sucesso.add(( tributoText).equals(textFiltrotributo));

				f = f + 1;
			}
			
			System.out.println(sucesso);
			
			}
			
			return sucesso;
		
	}
}
