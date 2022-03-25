package com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParametrosGeraisConfiguraçãoConfiguraçãoFiltrosAvancadosPO extends TestBaseSteven {
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][2]")
	public WebElement hierarquias;

	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[2]/div/div[2]/ul/li[1]/div/span[2]")
	public WebElement hierarquiaConfiguracao;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimo;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][1]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement nomeHerarquia;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement empresa;
	
	@FindBy(xpath = "//*[@id=\"advanced-filters-btn\"]/span[2]")
	public WebElement filtrosA;
	
	@FindBy(xpath = "//*[@id=\"company-filter\"]")
	public WebElement empresaImput;
	
	@FindBy(xpath = "//*[@id=\"hierarchy-name-filter\"]/div/div[1]/input")
	public WebElement nomeHerarquiaImput;
	
//	@FindBy(xpath = "//*[@id=\"option-266\"]")
//	public WebElement nomeHerarquiaImputSelccion;
	
	@FindBy(xpath = "//*[@id=\"detail-close-button\"]")
	public WebElement equis;
	
	
	public ParametrosGeraisConfiguraçãoConfiguraçãoFiltrosAvancadosPO() {
		PageFactory.initElements(driver, this);
	}
	
public ArrayList<Boolean> Filtros() {
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sleep(2000);
		hierarquias.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		hierarquiaConfiguracao.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		String idRegistro = idObter3();

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalle = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		
		detalle.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		String nomeHerarquiaText = nomeHerarquia.getText();
		String empresaText = empresa.getText();

		
		System.out.println("Visualizar");
		System.out.println(nomeHerarquiaText);
		System.out.println(empresaText);

		System.out.println("-------------------------");
		sleep(3000);
		equis.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		filtrosA.click();

		sleep(17000);

		sleep(26000);

		

		nomeHerarquiaImput.sendKeys(nomeHerarquiaText);
		sleep(1000);
		WebElement nomeHerarquiaImputSelccion = driver.findElement(By.xpath("//li[text()=\""+nomeHerarquiaText+"\"]"));
		nomeHerarquiaImputSelccion.click();
		sleep(1000);

//		nomeHerarquiaImput.sendKeys(Keys.ENTER);
//		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		ultimo.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		
		rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String id2 = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[4]/div"))
				.getText();
		String nome = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[5]/div"))
				.getText();
		
		System.out.println("ID: "+id2);
		System.out.println("none: "+nome);
		
		sucesso.add(nome.contains(nomeHerarquiaText));
		sucesso.add(id2.contains(idRegistro));
//		empresaImput.click();
//		sleep(2000);
//		WebElement seleccionEmpresaInput = driver.findElement(By.xpath("//li[text()=\""+empresaText+"\"]"));
//		sleep(2000);
//		seleccionEmpresaInput.click();
//		sleep(1000);
		
		
		return sucesso;
		
		
	}

}
