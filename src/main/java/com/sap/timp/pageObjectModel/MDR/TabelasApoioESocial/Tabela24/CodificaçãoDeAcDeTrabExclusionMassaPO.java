package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodificaçãoDeAcDeTrabExclusionMassaPO extends TestBaseSteven{

	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 24 - Codificação de Ac. de Trab.\"]")
	public WebElement tabela24;
	
	@FindBy(xpath = "//button/span[contains(text(),\"Nova Codificação de Ac. De Trab.\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Código\")]")
	public WebElement codigo;
	
	@FindBy(xpath = "//textarea[contains(@placeholder,\"Descrição\")]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\")]")
	public WebElement validade;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement gravarNovo;
	
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
	
	
	public CodificaçãoDeAcDeTrabExclusionMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	String idR1 = "";
	String idR2 = "";
	
	public boolean criar() {
		sleep(2000);
		tabelaApoio.click();
		sleep(2000);
		tabela24.click();
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
		
		codigo.sendKeys("111");
		sleep(1000);
		descricao.sendKeys("Descripcion Test de QA");
		sleep(1000);
		
		String data = fechaActual();
		validade.sendKeys(data);
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
		
		codigo.sendKeys("112");
		sleep(1000);
		descricao.sendKeys("Descripcion Test de QA 1");
		sleep(1000);
		
		String data1 = fechaActual();
		validade.sendKeys(data1);
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

		
		WebElement selecccionuno = driver.findElement(By.xpath("//div[@data-id=\""+idR1+"\"]/div[2]/label/span"));
		selecccionuno.click();
		WebElement selecccionDos = driver.findElement(By.xpath("//div[@data-id=\""+idR2+"\"]/div[2]/label/span"));
		selecccionDos.click();
		
		WebElement excluirmassa = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Sign-and-Symbols icon-persign\"]"));
		excluirmassa.click();
		
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		
		
		invisibilityOfElementOverlay();
		
		refresh();
		
		sleep(2000);
		waitExpectElement(tabelaApoio);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tabela24.click();
		
		invisibilityOfElementOverlay();

		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		
		
		
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
