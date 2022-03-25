package com.sap.timp.pageObjectModel.BRE.Estruturas.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class EstruturasFiltrosAvançadosLimpaFiltrosPO extends TestBaseSteven {

	
	@FindBy(xpath = "//span[@class=\"baseTabs-title\"]/span[text()=\"Estruturas\"]")
	public WebElement estruturas;

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
	
	@FindBy(xpath = "//li[text()=\"18 - Ajustes Fiscais\"]")
	public WebElement filtrosEstructuraopc;
	
	@FindBy(xpath = "//li[text()=\"18 - Ajustes Fiscais\"]")
	public WebElement filtrosEstructuraopc1;
	
	@FindBy(xpath = "//div[@class=\"advanced-filter-container\"]/div[3]/div/div/div[2]")
	public WebElement filtrosTributo;
	
	@FindBy(xpath = "//li[@id=\"option-17\"]")
	public WebElement filtrosTributoopc;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	public EstruturasFiltrosAvançadosLimpaFiltrosPO() {
		PageFactory.initElements(driver, this);
	}
	

	
	public ArrayList<Boolean> Estructura() {

		String url = driver.getCurrentUrl();
		
		sleep(2000);
		estruturas.click();
		sleep(2000);
		//sleep(2000);
		//limpar.click();
		//sleep(2000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//sleep(2000);	
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);

	//	waitExpectElement(filtrosEstructura);
		sleep(6000);
		
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
								+ rows + "]/div[5]/div"))
						.getText();
				System.out.println(textFiltroestructura + " estructura Filtro");
				System.out.println(estructuraText);
				
				sucesso.add(( estructuraText).equals(textFiltroestructura));

				f = f + 1;
			}
			
			sleep(2000);
			limpar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);	
			System.out.println(sucesso);

			return sucesso;
		
	}
	

	
}
