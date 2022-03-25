package com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTributo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguracaoDeTributosFiltrosAvançadosPO extends TestBaseSteven{
	
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Tributos\"]")
	public WebElement configuracaotributos;
	

	@FindBy(xpath = "//span[text()=\"Configuração de tributo\"]")
	public WebElement configuracaotributo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	@FindBy(xpath = "//div[@class=\"calendar-wrapper\"][1]/div[1]")
	public WebElement anoinicio;
	
	@FindBy(xpath = "//div[@class=\"calendar-wrapper\"][2]/div[1]")
	public WebElement anofim;
	
	@FindBy(xpath = "//div[@class=\"calendar-wrapper\"][1]/div[1]/div[1]")
	public WebElement arinicio;
	
	@FindBy(xpath = "//div[@class=\"calendar-wrapper\"][2]/div[1]/div[1]")
	public WebElement arfim;

	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	public ConfiguracaoDeTributosFiltrosAvançadosPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> filtro() {

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaotributos.click();
		sleep(2000);
		configuracaotributo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//Filtrar pelo id
		String idregistro= id.getText();
		System.out.println("Id:"+idregistro);
		pesquisar.sendKeys(idregistro);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int j = 1;
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		for (int i = 0; i < rows; i++) {

			String idfiltrado = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+j+"]/div[3]/div")).getText();
			System.out.println("Id Filtrado:"+idfiltrado);
			sucesso.add(idregistro.contains(idfiltrado));
			j = j + 1;
		}
		pesquisar.clear();
		sleep(2000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		if (rows1 > rows) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		//Filtro codigo de tributo
		
		String descricaocodigotributo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[5]/div")).getText();
		
		System.out.println("Descrição codigo tributo:"+descricaocodigotributo);
		pesquisar.sendKeys(descricaocodigotributo);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int k = 1;
		
		for (int i = 0; i < rows2; i++) {

			String descricaocodigotributofiltrado = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+k+"]/div[5]/div")).getText();
			System.out.println("Id:"+descricaocodigotributofiltrado);
			sucesso.add(descricaocodigotributo.contains(descricaocodigotributofiltrado));
			k = k + 1;
		}
		pesquisar.clear();
		sleep(2000);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		int rows3 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		if (rows3 > rows2) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		System.out.println(sucesso);
		
		

		return sucesso;

	}


}
