package com.sap.timp.pageObjectModel.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.DeterminacionRelevanciaPorMotivo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DeterminacionRelevanciaPorMotivoCriarPO extends TestBaseSteven{

	
	@FindBy(xpath = "//span[text()=\"Determinação de Relevância de Tarefa por Motivo de Reabertura\"]")
	public WebElement determinacaoRelevancia;
	
	@FindBy(xpath = "//span[text()=\"Determinação de Relevância por Motivo\"]")
	public WebElement motivoReabertura;
	
	@FindBy(xpath = "//span[contains(text(),\"Nova Determinação de Relevância por Motivo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//*[@id=\"company\"]/div/div[1]/div[1]/div[2]/input")
	public WebElement empresa;
	
	@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	public WebElement empresaSeleccion;
	
	@FindBy(xpath = "//*[@id=\"company\"]/div/div[1]/div[2]")
	public WebElement empresaI;
	
	@FindBy(xpath = "//*[@id=\"uf\"]/div/div[1]/div[1]/div[2]/input")
	public WebElement uf;
	
	@FindBy(xpath = "//div/div[@id=\"AL\"]/div[1]/label/span")
	public WebElement ufSeleccion;
	
	@FindBy(xpath = "//*[@id=\"branch\"]/div/div[1]/div[1]/div[2]/input")
	public WebElement filial;
	
	@FindBy(xpath = "//div/div[@id=\"1000_AL_0805\"]/div[1]/label/span")
	public WebElement filialSeleccion;
	
	@FindBy(xpath = "//*[@id=\"tax\"]/div/div[1]/div[1]/div[2]/input")
	public WebElement tributo;
	
	@FindBy(xpath = "//div/div[@id=\"05\"]/div[1]/label/span")
	public WebElement tributoSeleccion;
	
	@FindBy(xpath = "//*[@id=\"motiveCode\"]/div")
	public WebElement codMotivo;
	
	@FindBy(xpath = "//*[@id=\"option-2\"]")
	public WebElement codMotivoSeleccion;
	
	@FindBy(xpath = "//*[@id=\"ruleCode\"]/div")
	public WebElement codRegra;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement codRegraSeleccion;
	
	@FindBy(xpath = "//*[@id=\"output\"]/div")
	public WebElement chaveReavertura;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement chaveReaverturaSeleccion;
	
	@FindBy(xpath = "//*[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement fecha;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public DeterminacionRelevanciaPorMotivoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		determinacaoRelevancia.click();
		sleep(2000);
		motivoReabertura.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		empresaSeleccion.click();
		empresaSeleccion.sendKeys(Keys.ESCAPE);
		sleep(3000);
		attributeToBeXpath("//*[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000); 
		
		uf.click();
		sleep(3000);
		ufSeleccion.click();
		ufSeleccion.sendKeys(Keys.ESCAPE);
		sleep(3000);
		//attributeToBeXpath("//*[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		
		filial.click();
		sleep(3000);
		filialSeleccion.click();
		filialSeleccion.sendKeys(Keys.ESCAPE);
		sleep(3000);

		
		tributo.click();
		sleep(3000);
		tributoSeleccion.click();
		tributoSeleccion.sendKeys(Keys.ESCAPE);
		sleep(3000);

		
		codMotivo.click();
		sleep(3000);
		codMotivoSeleccion.click();
		sleep(3000);

		
		codRegra.click();
		sleep(3000);
		codRegraSeleccion.click();
		sleep(3000);
		
		
		chaveReavertura.click();
		sleep(3000);
		chaveReaverturaSeleccion.click();
		sleep(3000);
		
		fecha.sendKeys(fechaActual());
		
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
		idInserir("DeterminacaoRelevanciaPorMotivo",idB);
		sleep(2000);
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
