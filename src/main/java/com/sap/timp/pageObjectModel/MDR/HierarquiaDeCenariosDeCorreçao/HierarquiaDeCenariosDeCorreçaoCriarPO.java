package com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorreçao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;

public class HierarquiaDeCenariosDeCorreçaoCriarPO extends TestBaseSteven {
	
	
	
	@FindBy(xpath = "//span[text()=\"Hierarquias de Cenários de Correção\"]")
	public WebElement hiearquiasdecenariosdecorrecao;
	
	
	@FindBy(xpath = "//span[text()=\"Nova Hierarquia de Cenários de Correção\"]")
	public WebElement novahierarquia;
	
	@FindBy(xpath = "//div[@class=\"field\" and @id=\"tax\"]/div/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-3\"]")
	public WebElement opcaotributoTP1;
	
	
	@FindBy(xpath = "//div[@class=\"field\" and @id=\"correction-object\"]/div/div/div/div[2]")
	public WebElement objetodecorrecao;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]")
	public WebElement opcaoobjetodecorrecao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher a descrição do Código da Situação Tributária referente ao PIS/PASEP e COFINS\"]")
	public WebElement descricao;
	
	
	@FindBy(xpath = "//div[@class=\"field\" and @id=\"valid-from\"]/div/div/input")
	public WebElement datadeiniciodevigencia;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Cenário de Correção\"]")
	public WebElement adicionacenariodecorreçao;
	
	@FindBy(xpath = "//div[@class=\"field element-2\" and @id=\"scenario-2\"]/div/div/div/div[2]")
	public WebElement cenariodecorrecao;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]")
	public WebElement opcaocenariodecorrecao;
	
	
	public HierarquiaDeCenariosDeCorreçaoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		String url = driver.getCurrentUrl();

		
		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
			
		}else if(url.contains("tc2")){
			tc2 = true;
			
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		
		sleep(2000);
		hiearquiasdecenariosdecorrecao.click();
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
		novahierarquia.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tributo.click();
		sleep(2000);

		if (tp1 == true)   {

			opcaotributoTP1.click();
			sleep(2000);
			
		}else {
			opcaotributo.click();
			sleep(2000);
		}
		
		objetodecorrecao.click();
		sleep(2000);
		opcaoobjetodecorrecao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String data = fechaAyer();
		datadeiniciodevigencia.sendKeys(data);
		
		sleep(2000);
		
		adicionacenariodecorreçao.click();
		sleep(2000);
		
		cenariodecorrecao.click();
		sleep(2000);
		
		opcaocenariodecorrecao.click();
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir("HierarquiaDeCenariosDeCorreçao",id2);
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
