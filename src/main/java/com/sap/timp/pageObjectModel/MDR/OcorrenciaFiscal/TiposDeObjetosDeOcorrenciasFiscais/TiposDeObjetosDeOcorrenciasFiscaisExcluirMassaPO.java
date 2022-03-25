package com.sap.timp.pageObjectModel.MDR.OcorrenciaFiscal.TiposDeObjetosDeOcorrenciasFiscais;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TiposDeObjetosDeOcorrenciasFiscaisExcluirMassaPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Ocorrência Fiscal\"]")
	public WebElement ocorrenciafiscal;
	
	@FindBy(xpath = "//span[text()=\"Tipos de Objetos de Ocorrências Fiscais\"]")
	public WebElement tiposdeobjetosdeocorrenciasfiscais;
	
	@FindBy(xpath = "//span[text()=\"Novos Tipos de Objetos de Ocorrências Fiscais\"]")
	public WebElement novo;
	
	
	
	@FindBy(xpath = "//div[@id=\"occurrence\"]/div/div/div[2]")
	public WebElement ocorrencia;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
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
	
	
	
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo1;
	
	@FindBy(xpath = "//div[@id=\"mdrWrapper\"]")
	public WebElement clicl;
	
	public TiposDeObjetosDeOcorrenciasFiscaisExcluirMassaPO() {

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
		/*
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		*/
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//Primeiro Registro
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
		sleep(8000);
		sleep(8000);
		sleep(8000);
		sleep(8000);
		sleep(8000);
		
		codigocredito.click();
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
		
		
		novo1.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		//Segundo Registro
		clicl.click();
		sleep(3000);
		
		ocorrencia.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		objetos.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		
		String data1 = fechaActual();
		dataincio.sendKeys(data1);
		sleep(2000);
		
		datafim.sendKeys(data1);
		sleep(2000);
		
		idfluxo.click();
		sleep(2000);
		opcaoid.click();
		sleep(2000);
		
		classificacao.click();
		sleep(2000);
		opcao1.click();
		sleep(8000);
		sleep(8000);
		sleep(8000);
		sleep(16000);		
		codigocredito.click();
		sleep(2000);
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

	/*	siguiente.click();
		
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
*/
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
		
		int rows2 = 2;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[3]/div")).getText();
		
		
		
	
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
		
		
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();

		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[2]/label/span"));
		check1.click();
		sleep(1000);
		
		int rows = 2;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check2.click();
		
		sleep(1000);
		
		excluirMassa.click();
		sleep(1000);
		waitExpectElement(aceitar);
		sleep(1000);
		aceitar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectElement(siguiente);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	/*	siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);*/
		
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
