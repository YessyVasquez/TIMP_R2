package com.sap.timp.pageObjectModel.MDR.SPCBFederaisRetidos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class SPCBFederaisRetidosExcluirMassaPO extends TestBaseSteven{

	@FindBy(xpath = "//span[text()=\"SPCB - Federais Retidos\"]")
	public WebElement SPGB;
	
	@FindBy(xpath = "//span[text()=\"Tabela 15 - Agente Causador de SGDP\"]")
	public WebElement tabela15;
	
	@FindBy(xpath = "//button/span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement empresa;
	@FindBy(xpath = "//li[text()=\"1000\"]")
	public WebElement empresaO;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Més/Ano\"]")
	public WebElement ano;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Área\"]")
	public WebElement area;
	
	@FindBy(xpath = "//*[@id=\"nomeBenefic\"]/div/div/input")
	public WebElement beneficiario;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement gravarNovo;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
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
	
	
	public SPCBFederaisRetidosExcluirMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	String idR1 = "";
	String idR2 = "";
	
	public boolean criar() {
		sleep(2000);
		SPGB.click();
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
		sleep(1000);
		empresaO.click(); 
		sleep(1000);
		
		ano.sendKeys("2020");
		sleep(1000);
		
		area.sendKeys("Area Test QA 1");
		sleep(1000);
		
		beneficiario.sendKeys("Tester QA 1");
		sleep(1000);
		
		sleep(2000);
		gravarNovo.click();
		sleep(2000);
		waitExpectElement(sim);
		
		sleep(2000);
		sim.click();
		sleep(2000);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(empresa);
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		empresaO.click(); 
		sleep(1000);
		
		ano.sendKeys("2020");
		sleep(1000);
		
		area.sendKeys("Area Test QA 2");
		sleep(1000);
		
		beneficiario.sendKeys("Tester QA 2");
		sleep(1000);
		
		sleep(2000);
		gravarNovo.click();
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
		
		rows = rows("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]");
		
		String idU = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idR1 = idU;
		sleep(1000);
		System.out.println("Último ID após a criação: " +idU);
		
		rows = rows-1;
		String idP = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idR2 = idP;
		sleep(1000);
		System.out.println("Penultimo ID após a criação: " +idP);
		
		
		int idI = convertToInt(id);
		int idUI = convertToInt(idU);
		int idPI = convertToInt(idP);
		

		boolean sucesso = false;
		
		if (idI < idUI && idI < idPI) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		return sucesso;
		
		
		
		
		
	}
	
	
	public boolean excluir() {
		
		sleep(2000);
		Integer fila1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		Integer fila2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		fila2 = fila2 - 1; 
		
		WebElement selecccionuno = driver.findElement(By.xpath("//div[@data-id=\""+idR1+"\"]/div[2]/label/span"));
		selecccionuno.click();
		WebElement selecccionDos = driver.findElement(By.xpath("//div[@data-id=\""+idR2+"\"]/div[2]/label/span"));
		selecccionDos.click();
		
		WebElement excluirmassa = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Sign-and-Symbols icon-persign\"]"));
		excluirmassa.click();
		
		sleep(2000);
		waitExpectElement(aceitar);
		sleep(2000);
		
		aceitar.click();
		
		
		invisibilityOfElementOverlay();
		
		refresh();
		
		sleep(2000);
		waitExpectElement(SPGB);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		SPGB.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);

		System.out.println("Ultimo Registro: "+idR1);
		System.out.println("Penultimo Registro: "+idR2);
		
		double idD = convertToDouble(idB);
		double idU = convertToDouble(idR1);
		double idP = convertToDouble(idR2);
		
		
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;
		
		if (idU > idD && idP > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		return sucesso;
		
		
		
		
		
		
	}
}
