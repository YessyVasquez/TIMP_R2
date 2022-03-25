package com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AtividadeFiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AtividadeCriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li[@tabindex=\"0\"]/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividades1;

	@FindBy(xpath = "//li[@tabindex=\"0\"][1]/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividadesO1;

	@FindBy(xpath = "//li[@tabindex=\"0\"]/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividades2;

	@FindBy(xpath = "//li[@tabindex=\"0\"][1]/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividadesO2;

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"thead\"]/div/div[3]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button/span[text()=\"Nova Atividade Fiscal\"]")
	public WebElement nova;
	
	
	@FindBy(xpath = "//div[@id=\"name-activities\"]/div/div/input")
	public WebElement name;
	
	@FindBy(xpath = "//div[@id=\"description-activities\"]/div/textarea")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"diaEspecifico\"]/div/div/div[2]")
	public WebElement diaE;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement diaO;
	

	@FindBy(xpath = "//div[@id=\"diaOrdinal\"]/div/div/div[2]")
	public WebElement diaOr;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement diaOrO;
	
	@FindBy(xpath = "//div[@id=\"municipio\"]/div/div/div[2]")
	public WebElement municipio;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement municipioOpc;
	
	@FindBy(xpath = "//div[@id=\"mes\"]/div/div/div[2]")
	public WebElement mes;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement mesO;
	
	@FindBy(xpath = "//div[@id=\"recorrenciaFeriado\"]/div/div/div[2]")
	public WebElement recorrencia;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement recorrenciaO;
	
	@FindBy(xpath = "//*[@id=\"vigencia1-activities\"]/div/div[1]/input")
	public WebElement data;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	@FindBy(xpath = "//li[@tabindex=\"0\"]/div[@class=\"title\"]/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividades;
	
	@FindBy(xpath = "//ul[@class=\"accordion\" and @style]/li/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividadesO;

	

	public AtividadeCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean criar() {
		
		String url = driver.getCurrentUrl();

		if (url.contains("tc2") || url.contains("tp1")) {
			atividades2.click();
			sleep(2000);
			atividadesO2.click();
			sleep(2000);
		} else {

			atividades1.click();
			sleep(2000);
			atividadesO1.click();
			sleep(2000);
		}
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);
		
		nova.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		name.sendKeys("Teste Atividade");
		sleep(1000);
		descricao.sendKeys("Teste de Atividade Fiscal");
		sleep(9000);
		
		municipio.click();
		sleep(1000);
		municipioOpc.click();
		
		diaE.click();
		sleep(1000);
		diaO.click();
		
		sleep(1000);
		diaOr.click();
		sleep(1000);
		diaOrO.click();
		
		sleep(1000);
		mes.click();
		sleep(1000);
		mesO.click();
		sleep(1000);
		
		recorrencia.click();
		sleep(1000);
		recorrenciaO.click();
		sleep(1000);
		
		String date = fechaActual();
		
		data.sendKeys(date);
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		//waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(8000);
	

		biblioteca.click();
		waitExpectElement(sim);
		sleep(2000);
		nao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(10000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("AtividadeFiscal",idB);

		System.out.println(id);
		System.out.println(idB);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		
		boolean sucesso = false;
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		return sucesso;
		
	}
	
	
}
