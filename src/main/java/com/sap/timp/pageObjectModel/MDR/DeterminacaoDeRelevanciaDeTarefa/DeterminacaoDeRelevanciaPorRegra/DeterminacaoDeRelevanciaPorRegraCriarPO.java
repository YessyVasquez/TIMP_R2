package com.sap.timp.pageObjectModel.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sap.timp.base.TestBaseSteven;

public class DeterminacaoDeRelevanciaPorRegraCriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Determinação de Relevância de Tarefa\"]")
	public WebElement determinacaoderelevanciadetarefa;
	
	@FindBy(xpath = "//span[text()=\"Determinação de Relevância por Regra\"]")
	public WebElement determinacaoderelevanciaporregra;
	
	@FindBy(xpath = "//span[text()=\"Nova Determinação de Relevância por Regra\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement opcaouf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"1000_SP_0001\"]/div/label/span")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//div[@id=\"1000_SP_0014\"]/div/label/span")
	public WebElement opcaofilialtc2;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"00\"]/div/label/span")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@id=\"ruleCode\"]/div/div/div[2]")
	public WebElement codigoderegra;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"output\"]/div/div/div[2]")
	public WebElement saida;
	
	@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement datainiciovigencia;
	
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
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	public DeterminacaoDeRelevanciaPorRegraCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		
	String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		
		sleep(2000);
		determinacaoderelevanciadetarefa.click();
		sleep(2000);
		determinacaoderelevanciaporregra.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		novo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		opcaoempresa.click();
		sleep(2000);
		body.click();
		sleep(2000);
	
		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		
		uf.click();
		
		sleep(2000);
		
		opcaouf.click();
		
		sleep(2000);
		
		body.click();
		
		sleep(2000);
		if(tc2==true) {
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		filial.click();
		sleep(2000);
		opcaofilialtc2.click();
		sleep(2000);
		body.click();
		sleep(2000);
		}else {
			
			attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
			sleep(3000);
			filial.click();
			sleep(2000);
			opcaofilial.click();
			sleep(2000);
			body.click();
			sleep(2000);
			
		}
		
		tributo.click();
		
		sleep(2000);
		
		opcaotributo.click();
		
		sleep(2000);
		
		body.click();
		
		sleep(2000);
		
		codigoderegra.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		saida.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		
		
		String data = fechaActual();
	
		datainiciovigencia.sendKeys(data);
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir("DeterminacaoDeRelevanciaPorRegra",id2);
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
