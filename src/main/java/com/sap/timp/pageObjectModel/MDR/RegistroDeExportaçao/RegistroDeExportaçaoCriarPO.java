package com.sap.timp.pageObjectModel.MDR.RegistroDeExportaçao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class RegistroDeExportaçaoCriarPO extends TestBaseSteven {

	
	@FindBy(xpath = "//span[text()=\"Registro de Exportação\"]")
	public WebElement registroexportacao;
	
	@FindBy(xpath = "//li[@class=\"leftButton library-toolbar-item  first \"]/button/span[2]")
	public WebElement novoregistro;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[text()=\"3000\"]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//li[text()=\"0031\"]")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Docnum SAP\"]")
	public WebElement docnum;

	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Chave da NFe\"]")
	public WebElement chavenfe;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Código do item\"]")
	public WebElement codigoitem;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Cod país destino\"]")
	public WebElement codpais;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Data lançamento\"]")
	public WebElement datalancamento;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Nº Declaração\"]")
	public WebElement numerodeclaracao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Data declaração\"]")
	public WebElement datadeclaracao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Tipo de doc. exportação\"]")
	public WebElement tipodocexportacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Natureza da exportação\"]")
	public WebElement naturezadaexportacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Data averbação decla. exp\"]")
	public WebElement dataaverbacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Tipo de conhec. embarque\"]")
	public WebElement tipodeconhecembarque;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Modelo\"]")
	public WebElement preenchamodelo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Nº Nota fiscal\"]")
	public WebElement notafiscal;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Data emissão NF exportação\"]")
	public WebElement dataemissaonf;
	
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
	
	
	
	public RegistroDeExportaçaoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		registroexportacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		//String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		String id = driver.findElement(By.xpath("//div[@data-id]["+rows+"]")).getAttribute("data-id");
		System.out.println(id);
		
		sleep(2000);
		novoregistro.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		attributeToBeXpath("//div[@class=\"element\" and @id=\"company\"]/div", "class", "base-select required");
		empresa.click();
		
		sleep(2000);
		
		opcaoempresa.click();
		
		sleep(2000);
		
		filial.click();
		
		sleep(2000);
		
		opcaofilial.click();
		
		docnum.sendKeys("0123456789");
		
		chavenfe.sendKeys("12345");
		
		codigoitem.sendKeys("1234");
		
		codpais.sendKeys("001");
		
		String  data = "01/01/2013";
		
		datalancamento.sendKeys(data);
		
		numerodeclaracao.sendKeys("12");
		
		datadeclaracao.sendKeys(data);
		
		tipodocexportacao.sendKeys("1");
		
		naturezadaexportacao.sendKeys("2");
		
		dataaverbacao.sendKeys(data);
		
		tipodeconhecembarque.sendKeys("21");
		
		preenchamodelo.sendKeys("12");
		
		notafiscal.sendKeys("123456789");
		
		dataemissaonf.sendKeys(data);
		
		gravar.click();
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(10000);
		
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
	//	String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		String id2 = driver.findElement(By.xpath("//div[@data-id]["+rows+"]")).getAttribute("data-id");
		System.out.println(id2);
		
		idInserir("RegistroDeExportaçao",id2);
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
