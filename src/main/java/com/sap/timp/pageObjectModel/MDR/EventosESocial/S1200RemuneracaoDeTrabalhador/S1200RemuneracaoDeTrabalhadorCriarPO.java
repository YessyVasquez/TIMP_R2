package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1200RemuneracaoDeTrabalhador;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class S1200RemuneracaoDeTrabalhadorCriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Eventos e-Social\"]")
	public WebElement eventosesocial;
	
	@FindBy(xpath = "//span[text()=\"S1200 - Remuneração de Trabalhador Vinculado ao Regime Geral de Previdência Social\"]")
	public WebElement s1200;
	
	@FindBy(xpath = "//button[@class=\"library-toolbar-button btn trans highlighted\"]")
	public WebElement dadosbasicos;
	
	@FindBy(xpath = "//div[@class=\"field-element company_0_0\"]/div/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"option-1\"]/div")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"option-2\"]/div")
	public WebElement opcao2;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Tipo de Evento\"]")
	public WebElement tipodeevento;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Versão:\"]")
	public WebElement versao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Status\"]")
	public WebElement status;

	@FindBy(xpath = "//div[@class=\"field-element tpAmb_0_5\"]/div/div/div/div[2]")
	public WebElement tipodeambiente;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Versão do processo\"]")
	public WebElement versaodoprocesso;

	@FindBy(xpath = "//div[@class=\"field-element tpInscEvt_0_7\"]/div/div/div/div[2]")
	public WebElement tipodeinscricao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Numero de Inscrição\"]")
	public WebElement numerodeinscricao;
	
	@FindBy(xpath = "//div[@class=\"field-element indApur_0_10\"]/div/div/div/div[2]")
	public WebElement indicativoapuracao;
	
	//@FindBy(xpath = "//input[@placeholder=\"Preencher Período de apuração\"]")
	//public WebElement datainicial;
	@FindBy(xpath = "//div[@class=\"perApur_0_11 date-picker\"]/div/div/div/div[2]")
	public WebElement data;
	
	@FindBy(xpath = "//div[@class=\"field-element procEmi_0_12\"]/div/div/div/div[2]")
	public WebElement processodeemissao;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public S1200RemuneracaoDeTrabalhadorCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		eventosesocial.click();
		sleep(2000);
		
		s1200.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		dadosbasicos.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		tipodeevento.sendKeys("evento");
		
		
		sleep(2000);
		
		versao.sendKeys("versao");
		
		sleep(2000);
		
		status.sendKeys("st");
		
		sleep(2000);
		
		tipodeambiente.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		versaodoprocesso.sendKeys("processo");
		
		sleep(2000);
		
		tipodeinscricao.click();

		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		numerodeinscricao.sendKeys("7");
		
		sleep(2000);
		
		indicativoapuracao.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		/*
		String data=fechaActual();
		datainicial.sendKeys(data);
		*/
		data.click();
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		processodeemissao.click();
		
		sleep(2000);
		
		opcao.click();
		
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
		
		
		idInserir("S1200RemuneracaoDeTrabalhador",id2);
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
