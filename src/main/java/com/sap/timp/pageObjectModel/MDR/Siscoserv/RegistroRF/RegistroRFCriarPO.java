package com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;

public class RegistroRFCriarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Siscoserv\"]")
	public WebElement siscoserv;
	
	@FindBy(xpath = "//span[text()=\"Registro RF\"]")
	public WebElement registrorp;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Serv Vendido\")]")
	public WebElement numeroservico;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Período\")]")
	public WebElement periodo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Exportação\")]")
	public WebElement exportacao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Recebido/Mantido\")]")
	public WebElement recebidoMantido;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Importação\")]")
	public WebElement declaracaoImportacao;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public RegistroRFCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		siscoserv.click();
		sleep(2000);
		
		registrorp.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		
		novo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		opcao.click();
		
		sleep(2000);
		
		numeroservico.sendKeys("001");
		sleep(1000);
		String dataAtual = fechaActual();
		dataAtual = dataAtual.substring(3);
		periodo.sendKeys(dataAtual);
		sleep(1000);
		exportacao.sendKeys("12345");
		sleep(1000);
		recebidoMantido.sendKeys("490");
		sleep(1000);
		declaracaoImportacao.sendKeys("78910");
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir("RegistroRF",id2);
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
		
		
		System.out.println(sucesso);
		return sucesso;
		
	}	

}
