package com.sap.timp.pageObjectModel.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TiposDeObjetosDeOcorrenciasFiscaisCriarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Ocorrência Fiscal\"]")
	public WebElement ocorrenciafiscal;
	
	@FindBy(xpath = "//span[text()=\"Tipos de Objetos de Ocorrências Fiscais\"]")
	public WebElement tiposdeobjetosdeocorrenciasfiscais;
	
	@FindBy(xpath = "//span[text()=\"Novos Tipos de Objetos de Ocorrências Fiscais\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//div[@id=\"occurrence\"]/div/div/div[2]")
	public WebElement ocorrencia;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//li[@id][2]")
	public WebElement opcao1;
	
	@FindBy(xpath = "//div[@id=\"occurrenceObject\"]/div/div/div[2]")
	public WebElement objetos;
	
	@FindBy(xpath = "//div[@id=\"idFluxBPMA\"]/div/div/div/div[2]")
	public WebElement idfluxo;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoid;
	
	@FindBy(xpath = "//div[@id=\"accessClassification\"]/div/div/div[2]")
	public WebElement classificacao;
	
		
	@FindBy(xpath = "//div[@id=\"credit-adjustment-code\"]/div/div/div[2]")
	public WebElement codigocredito;
	
	@FindBy(xpath = "//div[@id=\"debit-adjustment-code\"]/div/div/div[2]")
	public WebElement codigodebito;
	
	@FindBy(xpath = "//div[@id=\"pagamento-adjustment-code\"]/div/div/div[2]")
	public WebElement codigopagamento;
	
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Data de Início de Vigência\"]")
	public WebElement dataincio;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Data de Fim de Vigência\"]")
	public WebElement datafim;
	
	public TiposDeObjetosDeOcorrenciasFiscaisCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		ocorrenciafiscal.click();
		sleep(2000);
		
		tiposdeobjetosdeocorrenciasfiscais.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ocorrencia.click();
		sleep(2000);
		opcao.click();
		
		sleep(2000);
		
		objetos.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		
		String data = fechaActual();
		dataincio.sendKeys(data);
		
		sleep(2000);
		
		datafim.sendKeys(data);
		
		sleep(2000);
		
		idfluxo.click();
		
		sleep(2000);
		
		opcaoid.click();
		
		sleep(2000);
		
		classificacao.click();
		
		sleep(2000);
		
		opcao1.click();
		
		sleep(30000);
		
		actionsMoveToElementElement(codigocredito);
		sleep(13000);
		
		codigocredito.click();
		
		sleep(3000);
		
	//	codigocredito.click();
		
		sleep(3000);
		
		opcao.click();
		
		sleep(2000);
		
		codigodebito.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		codigopagamento.click();
		
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
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		
		
		idInserir("TiposDeObjetosDeOcorrenciasFiscais",id2);
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
