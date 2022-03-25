package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigosEAliqDeFPRASCriarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 04 - Códigos e Alíq. de FPAS\"]")
	public WebElement tabela04;
	
	@FindBy(xpath = "//span[text()=\"Novo Código e Alíq. de FPAS\"]")
	public WebElement novo;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Codigo FPAS\"]")
	public WebElement codigo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Base de Cálculo\"]")
										
	public WebElement base;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Descrição das Atividades\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Entidade\"]")
	public WebElement entidade;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Situação do Contribuinte\"]")
	public WebElement contribuinte;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Combinação de dos Códigos de Terceiros\"]")
	public WebElement combinacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código de Terceiros\"]")
	public WebElement codigodeterceiros;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Alíquota\"]")
	public WebElement aliquota;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement datainicio;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	public CodigosEAliqDeFPRASCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		tabelaApoio.click();
		sleep(2000);
		tabela04.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		//criação
		
		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		codigo.sendKeys("07");
		sleep(1000);
	
		descricao.sendKeys("Teste da Descrição");
		sleep(1000);
		
		base.sendKeys("7");
		
		sleep(1000);
		
		entidade.sendKeys("entidade");
		
		sleep(1000);
		
		contribuinte.sendKeys("situação");
		
		sleep(1000);
		
		combinacao.sendKeys("combinação");
		
		sleep(1000);
		
		codigodeterceiros.sendKeys("7");
		
		sleep(1000);
		
		aliquota.sendKeys("aliquota");
		
		sleep(1000);
		
		
		String data = fechaActual();
		datainicio.sendKeys(data);
	
		
		sleep(2000);
		gravar.click();
		sleep(2000);
	//	waitExpectElement(sim);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		sleep(7000);
	
		siguiente.click();
		
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("CodigosEAliqDeFPRAS",idB);
		
		
		System.out.println(id);
		System.out.println(idB);
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		
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
