package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoContribuiçaoSocialApurada;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.sap.timp.base.TestBaseSteven;

public class CodigoContribuicaoSocialApuradaCriarPO extends TestBaseSteven{
	
	@FindBy(xpath = " //li/div/span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelas;
	
	@FindBy(xpath = " //li/div/span[contains(text() ,\"4.3.5\")]")
	public WebElement codigoContri;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @id][1]")
	public WebElement tributoO;
	
	@FindBy(xpath = "//div[@id=\"socialContributionCode\"]/div/div/input")
	public WebElement codigo;
	
	@FindBy(xpath = "//div[@id=\"description\"]/div/div/input")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"validityFrom\"]/div/div/input")
	public WebElement validFrom;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	*/
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public CodigoContribuicaoSocialApuradaCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		tabelas.click();
		sleep(2000);
		codigoContri.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		attributeToBeXpath("//div[@id=\"tax\"]/div", "class", "base-select required");
		sleep(2000);
		
		tributo.click();
		sleep(2000);
		tributoO.click();
		sleep(2000);
		
		codigo.sendKeys("987");
		descricao.sendKeys("Teste codigo de Contribuição Social Apurada 987");

		codigo.sendKeys("987");
		descricao.sendKeys("Teste codigo de Contribuição 987");

		
		validFrom.sendKeys(fechaActual());
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("codigocontribucaosocialapurada", idB);
		sleep(2000);
		System.out.println(id);
		System.out.println(idB);
		
		int idD = convertToInt(id);
		int idBD = convertToInt(idB);
		System.out.println(idD);
		System.out.println(idBD);
		
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;
		
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		return sucesso;
		
		
		
		
		
		
		
			
		
		
		
	}
	

}
