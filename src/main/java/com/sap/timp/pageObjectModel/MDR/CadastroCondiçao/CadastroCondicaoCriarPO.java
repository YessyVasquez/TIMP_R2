package com.sap.timp.pageObjectModel.MDR.CadastroCondiçao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;

public class CadastroCondicaoCriarPO extends TestBaseMassiel{
	
	
	@FindBy(xpath = "//span[text()=\"Cadastro da Condição\"]")
	public WebElement cadastrocondicao;
		
	@FindBy(xpath = "//span[text()=\"Novo Cadastro da Condição\"]")
	public WebElement novocadastrocondicao;
	

	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar  uma  Empresa\"]")
	public WebElement empresa;
	
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoempresa;
	

	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoempresatc2tq1tp1;
	
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@class=\"list-option\"]/div/div/label/span")
	public WebElement opcaouf;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath ="//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaotributo;
	
	@FindBy(xpath ="//div[@class=\"element\" and @id=\"accessSeq\"]/div/div/div[2]")
	public WebElement sequenciaacesso;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaosequenciaacesso;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"validFrom\"]/div/div/input")
	public WebElement vigenciade;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[2]/span/span")
	public WebElement camposestrutura;
	
	@FindBy(xpath = "//div[contains(@class,\"iconLeft\")]/input[@placeholder]")
	public WebElement atribuicao;
	

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement setafinal;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	
	public CadastroCondicaoCriarPO() {
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
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		cadastrocondicao.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//Pega o ultimo id
		setafinal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);
				
		novocadastrocondicao.click();
		attributeToBeXpath("//*[@id=\"company\"]/div/div[1]/div[1]/div[2]", "class", "new-tag");
		sleep(2000);
		empresa.click();
		sleep(2000);
		if (tc2 == true || tp1 == true || tq1 == true) {
			opcaoempresatc2tq1tp1.click();
			opcaoempresatc2tq1tp1.sendKeys(Keys.ESCAPE);
		}else {
			opcaoempresa.click();
			opcaoempresa.sendKeys(Keys.ESCAPE);
		}
		
		attributeToBeXpath("//*[@id=\"uf\"]/div/div[1]/div[1]/div[2]", "class", "new-tag");
		sleep(2000);
		
		uf.click();
		sleep(2000);
		opcaouf.click();
		
		opcaouf.sendKeys(Keys.ESCAPE);
		
		attributeToBeXpath("//*[@id=\"branch\"]/div/div[1]/div[1]/div[2]", "class", "new-tag");
		sleep(2000);
		
		filial.click();
		
		opcaofilial.click();
		
		opcaofilial.sendKeys(Keys.ESCAPE);
		
		sleep(2000);
		
		tributo.click();
		
		opcaotributo.click();
		
		opcaotributo.sendKeys(Keys.ESCAPE);
		
	
		attributeToBeXpath("//div[@class=\"element\" and @id=\"accessSeq\"]/div", "class", "base-select required");
		sleep(2000);
		
		sequenciaacesso.click();
		sleep(2000);
		opcaosequenciaacesso.click();

		sleep(2000);
		
		//pega a data atual
		String dataatual = fechaActual();
		vigenciade.sendKeys(dataatual);		
				
		camposestrutura.click();
		sleep(2000);
		waitExpectElement(atribuicao);
		atribuicao.sendKeys("teste");
		
		gravar.click();
		sleep(2000);
		butaosim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	//	waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
	
		biblioteca.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//Pega o ultimo id depois do preenchimento

		setafinal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("CadastroCondicao",idB);
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
		
		System.out.println( sucesso);


		return sucesso;

	}
	

}
