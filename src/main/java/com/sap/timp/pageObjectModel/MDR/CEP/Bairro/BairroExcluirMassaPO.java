package com.sap.timp.pageObjectModel.MDR.CEP.Bairro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class BairroExcluirMassaPO extends TestBaseFernando{
	@FindBy(xpath = "//li/div/span[text()=\"cep\"]")
	public WebElement cep;
	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep2;
	
	@FindBy(xpath = "//li/div/span[text()=\"cep\"]")
	public WebElement cepTQ1;
	
	@FindBy(xpath = "//li/div/span[text()=\"Bairro\"]")
	public WebElement bairro;
	
	@FindBy(xpath = "//button/span[text()=\"Novo bairro\"]")
	public WebElement novo;

	@FindBy(xpath = "//input[contains(@placeholder,\"Número de bairro\")]")
	public WebElement numBairro;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"UF\")]")
	public WebElement uf;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"localização\")]")
	public WebElement localizacao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome do bairro\")]")
	public WebElement nome;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[@class = \"button-icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement btnExcluirMassa;
	
	@FindBy(xpath = "//span[text()=\"Salvar e Novo\"]")
	public WebElement salvarENovo;
	
	public BairroExcluirMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void llenarDatos1() {
		String numEnviar = "9986779696";		
		numBairro.clear();
		numBairro.sendKeys(numEnviar);
		sleep(1000);
		
		llenarDatos();
	}
	
	public void llenarDatos2() {
		String numEnviar = "89660682";		
		numBairro.clear();
		numBairro.sendKeys(numEnviar);
		sleep(1000);
		
		llenarDatos();
	}
	
	public void llenarDatos() {
		uf.clear();
		uf.sendKeys("12");
		sleep(1000);
		
		localizacao.clear();
		localizacao.sendKeys("1020");
		sleep(1000);
		
		nome.clear();
		nome.sendKeys("Prueba");
		sleep(2000);
	}

	String idG = "";
	public boolean criar() {
		boolean tq1 = false;
		boolean tc2 = false;
		boolean tp1 = false;
		String url = driver.getCurrentUrl();
		
		if (url.contains("tq1")) {
			tq1 = true;
		}
		
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		if (url.contains("tp1")) {
			tp1 = true;
		}
		
		
		if (url.contains("tq1")) {
			cep2.click();
			sleep(1000);

		} else {
			cep2.click();

			sleep(1000);
		}
		
		
		
		sleep(2000);
		bairro.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id ="0";
				
		if (rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			idG = id;
			System.out.println("Último id antes da criação: "+id);
		}
 
	
		
		// Crear primer registro
		novo.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Se llenan los datos
		llenarDatos1();
		
		salvarENovo.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		// Crear segundo registro
		// Se llenan los datos
		llenarDatos2();
		
		salvarENovo.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = false;

		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		 
		String id1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[3]/div")).getText();
		System.out.println("id 1: "+id1);
		
		rows1 = rows1 - 1;
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[3]/div")).getText();
		System.out.println("id 2: "+id2);
		
		System.out.println("++++++++++++++++++++++");
		System.out.println("Penultimo id após da criação: " +id1);
		System.out.println("Último id após da criação: " +id2);
		
		if (id1 != id && id2 != id) {
			sucesso = true;
		}
//		if (id1.contains("9986779696") && id2.contains("99867796")) {
//			sucesso = true;
//		}else {
//			sucesso = false;
//		}

		return sucesso;
	} 
	
	public boolean exluirMassa() {


		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		WebElement marcarCheckbox = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));

		sleep(2000);
		marcarCheckbox.click();
		sleep(2000);
		
		rows = rows - 1;
		marcarCheckbox = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));

		sleep(2000);
		marcarCheckbox.click();
		sleep(2000);
		
		btnExcluirMassa.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		waitExpectXpath("//li[contains(@class,\"toast-success\")]/div/span[3]");
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id ="0";
		
		if (rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			idG = id;
			System.out.println("Último id antes da criação: "+id);
		}
 
		

		int id1 = convertToInt(idG);
		int id2 = 99998;
		int id3 = 99997;
		
		System.out.println("Ultimo registro al eliminar en massa: " + id1); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
		System.out.println("Ultimo registro: " + id2);
		System.out.println("Penultimo registro:" + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1 != id3) {
			sucesso= true;
		}
		System.out.println(sucesso);
		return sucesso;
	}
}
