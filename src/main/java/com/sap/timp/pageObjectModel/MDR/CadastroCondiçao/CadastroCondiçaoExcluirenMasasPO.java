package com.sap.timp.pageObjectModel.MDR.CadastroCondiçao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sap.timp.base.TestBaseMassiel;

public class CadastroCondiçaoExcluirenMasasPO extends TestBaseMassiel{


	@FindBy(xpath = "//span[text()=\"Cadastro da Condição\"]")
	public WebElement cadastrocondicao;
		
	@FindBy(xpath = "//span[text()=\"Novo Cadastro da Condição\"]")
	public WebElement novocadastrocondicao;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[1]/span/span")
	public WebElement campoconfiguracao;


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

	@FindBy(xpath = "//span[text()=\"Salvar e Novo\"]")
	public WebElement salvar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[2]/span/span")
	public WebElement camposestrutura;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Bairro da empresa\"]")
	public WebElement atribuicao;
	

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement setafinal;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	//BOTON EXCLUIR EN MASA
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement aceitar;
	
	public CadastroCondiçaoExcluirenMasasPO()  {
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
			sleep(2000);
			opcaoempresatc2tq1tp1.sendKeys(Keys.ESCAPE);
		}else {
			opcaoempresa.click();
			sleep(2000);
			opcaoempresa.sendKeys(Keys.ESCAPE);
		}
		sleep(2000);
		
		attributeToBeXpath("//*[@id=\"uf\"]/div/div[1]/div[1]/div[2]", "class", "new-tag");
		sleep(2000);
		
		uf.click();
		sleep(2000);
		opcaouf.click();
		sleep(2000);
		
		opcaouf.sendKeys(Keys.ESCAPE);
		
		attributeToBeXpath("//*[@id=\"branch\"]/div/div[1]/div[1]/div[2]", "class", "new-tag");
		sleep(2000);
		
		filial.click();
		sleep(2000);
		opcaofilial.click();
		sleep(2000);
		
		opcaofilial.sendKeys(Keys.ESCAPE);
		
		sleep(2000);
		
		tributo.click();
		
		opcaotributo.click();
		sleep(2000);
		opcaotributo.sendKeys(Keys.ESCAPE);
		sleep(2000);


		attributeToBeXpath("//div[@class=\"element\" and @id=\"accessSeq\"]/div", "class", "base-select required");
		sleep(2000);
		
		sequenciaacesso.click();
		
		opcaosequenciaacesso.click();

		sleep(2000);
		
		//pega a data atual
		String dataatual = fechaActual();
		vigenciade.sendKeys(dataatual);		
				
		camposestrutura.click();
		sleep(2000);
		waitExpectElement(atribuicao);
		atribuicao.sendKeys("teste");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		salvar.click();
		sleep(2000);
		butaosim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		campoconfiguracao.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		empresa.click();
		sleep(2000);
		
		if (tc2 == true || tp1 == true || tq1 == true) {
			opcaoempresatc2tq1tp1.click();
			sleep(200);
			opcaoempresatc2tq1tp1.sendKeys(Keys.ESCAPE);
		}else {
			opcaoempresa.click();
			sleep(200);
			opcaoempresa.sendKeys(Keys.ESCAPE);
		}
		sleep(200);
		attributeToBeXpath("//*[@id=\"uf\"]/div/div[1]/div[1]/div[2]", "class", "new-tag");
		sleep(2000);
		
		uf.click();
		sleep(2000);
		opcaouf.click();
		sleep(200);
		opcaouf.sendKeys(Keys.ESCAPE);
		
		
		attributeToBeXpath("//*[@id=\"branch\"]/div/div[1]/div[1]/div[2]", "class", "new-tag");
		sleep(2000);
		
		filial.click();
		sleep(200);
		opcaofilial.click();
		sleep(200);
		opcaofilial.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		tributo.click();
		sleep(200);
		opcaotributo.click();
		sleep(200);
		opcaotributo.sendKeys(Keys.ESCAPE);
		sleep(200);
		
		attributeToBeXpath("//div[@class=\"element\" and @id=\"accessSeq\"]/div", "class", "base-select required");
		sleep(2000);
		
		sequenciaacesso.click();
		
		opcaosequenciaacesso.click();

		sleep(2000);
		
		//pega a data atual
		String dataatual1 = fechaActual();
		vigenciade.sendKeys(dataatual1);		
				
		camposestrutura.click();
		sleep(2000);

		atribuicao.sendKeys("teste");

		
		sleep(2000);

		
		gravar.click();
		sleep(2000);
		butaosim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
	
		biblioteca.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//Pega o ultimo id depois do preenchimento

		setafinal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		rows = rows-1;
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
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
	
	public boolean HierarquiaDeCenariosDeCorreçaoExcluirMasas() {
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check1.click();
		sleep(1000);
		rows = rows-1;
		
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
		waitExpectElement(setafinal);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		setafinal.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println(id);
		}
			
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro1);
		int id3 = convertToInt(idRegistro2);
		
		System.out.println("Id Ultimo Registro: "+ id1);
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
