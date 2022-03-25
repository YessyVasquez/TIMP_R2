package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.ObservaçoesdoDocumentoFiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;

public class ObservaçoesdoDocumentoFiscalCriarPO extends TestBaseMassiel {
	
	
	

	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"Observações do Documento Fiscal - Registro 0460\"]")
	public WebElement observacoesdocumento;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"thead\"]/div/div[3]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")
	public WebElement idR;
	
	@FindBy(xpath = "//span[text()=\"Nova Observação do Documento Fiscal\"]")
	public WebElement novoobservacoes;
	
	
	@FindBy(xpath = "//div[@id=\"UF\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaouf;
	
	@FindBy(xpath = "//div[@id=\"MessageRule\"]/div/div/div[2]")
	public WebElement idregrademensagem;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoid;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher a descrição do Observações do Documento Fiscal - Registro 0460\"]")
	public WebElement descricaosped;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Início de Vigência \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public ObservaçoesdoDocumentoFiscalCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		observacoesdocumento.click();
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		/*
		idC.click();
		sleep(1000);
		
		dobleClickElement(idC);
			
		String id = idR.getText();
		System.out.println(id);
		
		sleep(2000);
		*/
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);
		

		
		novoobservacoes.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		uf.click();
		sleep(2000);
		opcaouf.click();
		sleep(2000);
		
		idregrademensagem.click();
		sleep(2000);
		opcaoid.click();
		sleep(2000);
		descricaosped.sendKeys("Descrição SPED987");
		
		String data = dataanterior();
		
		datavigencia.sendKeys(data);
		
		sleep(2000);
		
		gravar.click();
		
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
			
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("obsercacoesdodocumentofiscal", id2);
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
