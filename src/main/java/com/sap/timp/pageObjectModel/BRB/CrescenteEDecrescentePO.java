package com.sap.timp.pageObjectModel.BRB;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CrescenteEDecrescentePO extends TestBaseSteven {

	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[4]")
	public WebElement opcao;

	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;

	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;

	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button")
	public WebElement executar;

	@FindBy(xpath = "//div[@data-column=\"66\"]/span")
	public WebElement menuC;

	@FindBy(xpath = "//*[@id=\"basePopover-wrapper\"]/div/div/div/div[1]/div")
	public WebElement crescente;
	
	@FindBy(xpath = "//*[@id=\"basePopover-wrapper\"]/div/div/div/div[8]/div[1]/label")
	public WebElement primera;
	
	@FindBy(xpath = "//*[@id=\"column-filters-apply\"]")
	public WebElement aplicar;
	

	@FindBy(xpath = "//div[@class=\"option option-filters\"]/div/input")
	public WebElement pnumero;
	

	@FindBy(xpath = "//*[@id=\"basePopover-wrapper\"]/div/div/div/div[2]/div")
	public WebElement decrescente;
	
	public CrescenteEDecrescentePO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> crescente() {

		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//waitExpectElement(menu);
		//sleep(menuT);

		menu.click();

		opcao.click();

		waitExpectXpath("//*[@id=\"variant-toolbar\"]/div/ul/li[6]/button");

		executar.click();
		sleep(5000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

	//	actionsMoveToElementXpath("//div[@data-column=\"66\"]/span");

		menuC.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valorPrimeiro = driver.findElement(By.xpath("//div[@class=\"column-filter visible\"][1]/input")).getAttribute("value");
		System.out.println(valorPrimeiro);
		
		double valorPrimeroI =  Double.valueOf(valorPrimeiro);
		WebElement valorPrimeiroE = driver.findElement(By.xpath("//div[@class=\"column-filter visible\"][1]/label/span"));
		WebElement aplicar = driver.findElement(By.xpath("//button[text()=\"Aplicar\"]"));
		if (valorPrimeroI == 0) {
			sleep(25000);
			valorPrimeiroE.click();
			sleep(2000);
			aplicar.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			//actionsMoveToElementXpath("//div[@data-column=\"66\"]/span");

			menuC.click();
			waitExpectXpath("//*[@id=\"column-filters-apply\"]");
			sleep(6000);
			
		}
		
		
		crescente.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");
		

		int rows = driver.findElements(By.xpath("//div[@data-column=\"66\" and contains(@aria-label, \"Linha: \")]")).size();

		for (int i = 0; i < 25; i++) {
			rows = driver.findElements(By.xpath("//div[@data-column=\"66\" and contains(@aria-label, \"Linha: \")]")).size();
			actionsMoveToElementXpath("//div[@data-column=\"66\" and contains(@aria-label, \"Linha: "+rows+"\")]");
			waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");

		}
		
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		//waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");

		
	//	actionsMoveToElementXpath("//*[@id=\"table-report-container\"]/div[1]/div[15]");
		
		rows = driver.findElements(By.xpath("//div[@data-column=\"66\" and contains(@aria-label, \"Linha: \")]")).size();
		
		ArrayList<Double> datos = new ArrayList<Double>();
		
		int n1 = 1;
		int n2 = 2;
		for (int i = 0; i < rows; i++) {

			if (n2 < rows) {

				String n1C = driver.findElement(By.xpath("//div[@class=\"row visible\"]["+n1+"]/div[@data-column=\"66\" and @data-path]/div[2]")).getText();
				String n2C = driver.findElement(By.xpath("//div[@class=\"row visible\"]["+n2+"]/div[@data-column=\"66\" and @data-path]/div[2]")).getText();
				n1C = n1C.replace(".", "");
				n1C = n1C.replace(",", ".");

				n2C = n2C.replace(".", "");
				n2C = n2C.replace(",", ".");
				Double n1CD = new Double(n1C);
				Double n2CD = new Double(n2C);
				

				if (n1CD.equals(n2CD) == true) {
								
				}else {
					datos.add(n2CD);
				}
				

			}

			n1 = n1+1;
			n2 = n2+1;
		}

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
	
		for (int i = 0; i < datos.size()-1; i++) {
			int menor = 0;
			int j = i+1;
	
		
				menor = datos.get(i).compareTo(datos.get(j));
				
				if (menor <  0) {
					sucesso.add(true);
				}else {
					sucesso.add(false);
				}
	
			
		}
		
		System.out.println(datos);
		return sucesso;
	}
	
	public ArrayList<Boolean> decrescente() {
		sleep(2000);
		actionsMoveToElementXpath("//div[@id=\"table-report-container\"]/div[1]/div[14]");
		sleep(10000);
	
		System.out.println("Recargo");
		
		actionsMoveToElementXpath("//div[@data-column=\"66\"]/span");
		
		menuC.click();
		decrescente.click();
		
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");
		

		int rows = driver.findElements(By.xpath("//div[@data-column=\"66\" and contains(@aria-label, \"Linha: \")]")).size();

		for (int i = 0; i < 10; i++) {
			rows = driver.findElements(By.xpath("//div[@data-column=\"66\" and contains(@aria-label, \"Linha: \")]")).size();
	//		actionsMoveToElementXpath("//div[@data-column=\"66\" and contains(@aria-label, \"Linha: "+rows+"\")]");
		//	waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");
			sleep(5000);
		}
		
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");

		
	//	actionsMoveToElementXpath("//*[@data-column=\"126\"]");
		
		rows = driver.findElements(By.xpath("//div[@data-column=\"66\" and contains(@aria-label, \"Linha: \")]")).size();
		
		ArrayList<Double> datos = new ArrayList<Double>();
		
		int n1 = 1;
		int n2 = 2;
		for (int i = 0; i < rows; i++) {

			if (n2 < rows) {

				String n1C = driver.findElement(By.xpath("//div[@class=\"row visible\"]["+n1+"]/div[@data-column=\"66\" and @data-path]/div[2]")).getText();
				String n2C = driver.findElement(By.xpath("//div[@class=\"row visible\"]["+n2+"]/div[@data-column=\"66\" and @data-path]/div[2]")).getText();

				n1C = n1C.replace(".", "");
				n1C = n1C.replace(",", ".");

				n2C = n2C.replace(".", "");
				n2C = n2C.replace(",", ".");
				Double n1CD = new Double(n1C);
				Double n2CD = new Double(n2C);

				if (n1CD.equals(n2CD) == true) {
								
				}else {
					datos.add(n2CD);
				}
				

			}
			
			n1 = n1+1;
			n2 = n2+1;
		}
		System.out.println(datos);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
	
		for (int i = 0; i < datos.size()-1; i++) {
			int menor = 0;
			int j = i+1;
		
				menor = datos.get(i).compareTo(datos.get(j));
					
				if (menor >  0) {
					sucesso.add(true);
				}else {
					
					sucesso.add(false);
				}
			
			
		}
		return sucesso;
	}

}
