package com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.StatusParaBancoIndébitos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class StatusParaBancoIndébitosExcluirMassaPO extends TestBaseSteven {
	@FindBy(xpath = "//span[text()=\"Controle de Crédito Tributário\"]")
	public WebElement obrigacoes;

	@FindBy(xpath = "//span[text()=\"Status para Banco de Indébitos\"]")
	public WebElement tabelaMunicipios;

	
	@FindBy(xpath = "//button/span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;

	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement uf;

	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;

	@FindBy(xpath = "//input[contains(@placeholder,\"Início\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement opcaoF;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoFuni;
	
	@FindBy(xpath = "//div[@id=\"initial-status\"]/div/div/div[2]")
	public WebElement statusInicial;
	
	@FindBy(xpath = "//div[@id=\"final-status\"]/div/div/div[2]")
	public WebElement statusFinal;
	
	@FindBy(xpath = "//textarea")
	public WebElement descricao;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo1;
	
	@FindBy(xpath = "//*[@id=\"btn-status-undue-bank\"]/span[1]")
	public WebElement status;
	
	public StatusParaBancoIndébitosExcluirMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
public boolean criar() {
		
		sleep(2000);
		obrigacoes.click();
		sleep(2000);
		
		tabelaMunicipios.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		Integer rows3 = rows - 1;
		rows = rows - rows3;
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		empresa.click();
		sleep(1000);
		opcaoF.click();
		opcaoF.sendKeys(Keys.ESCAPE);
		sleep(1000);
		

		status.click();
		sleep(1000);
		waitExpectElement(aceitar);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		statusInicial.click();
		sleep(1000);
		opcaoFuni.click();
		opcaoFuni.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		statusFinal.click();
		sleep(1000);
		opcaoFuni.click();
		opcaoFuni.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		aceitar.click();
		sleep(2000);
		
		descricao.sendKeys("Teste de Status para Banco Indebitos 1");
		
		//dataVigencia.sendKeys(fechaActual());


		sleep(2000);
		novo1.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		//Segundo Registro
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		empresa.click();
		sleep(1000);
		opcaoF.click();
		opcaoF.sendKeys(Keys.ESCAPE);
		sleep(1000);
		

		status.click();
		sleep(1000);
		waitExpectElement(aceitar);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		statusInicial.click();
		sleep(1000);
		opcaoFuni.click();
		opcaoFuni.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		statusFinal.click();
		sleep(1000);
		opcaoFuni.click();
		opcaoFuni.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		aceitar.click();
		sleep(2000);
		
		descricao.sendKeys("Teste de Status para Banco Indebitos 2");
		
		//dataVigencia.sendKeys(fechaActual());


		sleep(2000);
		
		sleep(2000);
		novo1.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		Integer rows2 = rows - 1;
		rows = rows - rows2;
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		
	
		sleep(2000);
		System.out.println(id);
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(id);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		boolean sucesso = false;
		
		if (idRegistroD1 > idD && idRegistroD2 > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		
		
		return sucesso;
		
		
	}	
	
	
	public boolean excluir() {
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check1.click();
		sleep(1000);
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check2.click();
		
		sleep(1000);
		
		excluirMassa.click();
		sleep(1000);
		waitExpectElement(sim);
		sleep(1000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectElement(siguiente);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro1);
		int id3 = convertToInt(idRegistro2);
		
		System.out.println(" Id Ultimo Registro: "+ id1);
		System.out.println("Id Excluir Registro 1: " + id2);
		System.out.println("Id Excluir Registro 2: " + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1!=id3) {
			sucesso = true;
		}else {
			sucesso=false;
		}
		
		
		
		return sucesso;
	}
	
}
