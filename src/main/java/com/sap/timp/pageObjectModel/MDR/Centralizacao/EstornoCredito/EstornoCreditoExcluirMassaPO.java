package com.sap.timp.pageObjectModel.MDR.Centralizacao.EstornoCredito;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class EstornoCreditoExcluirMassaPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Centralização\"]")
	public WebElement centralizacao;
	
	@FindBy(xpath = "//span[text()=\"Estorno de Crédito de Insumos\"]")
	public WebElement estornocredito;
	
	@FindBy(xpath = "//span[text()=\"Novo Estorno de Crédito de Insumos\"]")
	public WebElement novoestorno;
	

	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	//@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoempresa;

	
	@FindBy(xpath ="//div[@id=\"UF\"]/div/div[1]/div[2]")
	public WebElement ufFilial; 
	
	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div/label/span")
	public WebElement opcaouffilial;
	

	@FindBy(xpath = "//div[@id=\"branches\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao1filial;
	

	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div/label/span")
	public WebElement opcao2filial;
	
	
	@FindBy(xpath="//div[@id=\"centralizedBranch\"]/div/div/div[2]")
	public WebElement filialcentralizadora;
	
	@FindBy(xpath="//li[@id][1]")
	public WebElement opcaofialcentralizadora;
	
	@FindBy(xpath="//li[text()=\"0008\"]")
	public WebElement opcaofialcentralizadoraTC2;
	

	@FindBy(xpath = "//input[@placeholder=\"Preencher Numérico\"]")
	public WebElement preechernumerico;
	
	@FindBy(xpath = "//*[@id=\"validity\"]/div/div[1]/input")
	public WebElement datainicio;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//span[text()=\"Salvar e Novo\"]")
	public WebElement salvarNovo;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	

	//BOTON EXCLUIR EN MASA
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement aceitar;
	
	public EstornoCreditoExcluirMassaPO() {

		PageFactory.initElements(driver, this);
	}
	

	public boolean CriarEstornoCredito() {
		
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
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		centralizacao.click();
		sleep(2000);
		estornocredito.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);
		//gera um novo arquivo
		novoestorno.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//Preenchimento 
		empresa.click();
		sleep(1000);
		opcaoempresa.click();
		sleep(1000);
		
		closeSelectTypeCheckbox(empresa);
		
		ufFilial.click();
		sleep(1000);
		
		if (tq1 == true) {

			WebElement opcaouffilial = driver.findElement(By.xpath("//div[@class=\"list-option\"][1]/div/div/label/span"));
			sleep(1000);
			
			opcaouffilial.click();
			sleep(1000);
			closeSelectTypeCheckbox(ufFilial);

		}else if (tp1==true ) {
			WebElement opcaouffilial = driver.findElement(By.xpath("//div[@class=\"list-option\"][2]/div/div/label/span"));
			sleep(1000);
	
			opcaouffilial.click();
			sleep(1000);
			closeSelectTypeCheckbox(ufFilial);
			
		}else {
			WebElement opcaouffilial = driver.findElement(By.xpath("//div[@class=\"list-option\"][1]/div/div/label/span"));
			sleep(1000);
			
			opcaouffilial.click();
			sleep(1000);
			closeSelectTypeCheckbox(ufFilial);
		}
		
		
		
		sleep(2000);
		filial.click();
		sleep(2000);
		opcao1filial.click();
		sleep(1000);
		opcao2filial.click();
		sleep(1000);
		closeSelectTypeCheckbox(filial);

		sleep(1000);
		filialcentralizadora.click();
		sleep(1000);
		opcaofialcentralizadora.click();
		sleep(1000);

		//pega a data atual
		String dataatual = fechaActual();
		datainicio.sendKeys(dataatual);
		
		//fim do preenchiminto
		salvarNovo.click();
		
		butaosim.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(10000);
		
		
		//Preenchimento 
		empresa.click();
		sleep(1000);
		opcaoempresa.click();
		sleep(1000);
		
		closeSelectTypeCheckbox(empresa);
		
		ufFilial.click();
		sleep(1000);
		
		if (tq1 == true) {

			WebElement opcaouffilial = driver.findElement(By.xpath("//div[@class=\"list-option\"][1]/div/div/label/span"));
			sleep(1000);
			
			opcaouffilial.click();
			sleep(1000);
			closeSelectTypeCheckbox(ufFilial);

		}else if (tp1==true ) {
			WebElement opcaouffilial = driver.findElement(By.xpath("//div[@class=\"list-option\"][2]/div/div/label/span"));
			sleep(1000);
			
			opcaouffilial.click();
			sleep(1000);
			closeSelectTypeCheckbox(ufFilial);
			
		}else {
			WebElement opcaouffilial = driver.findElement(By.xpath("//div[@class=\"list-option\"][1]/div/div/label/span"));
			sleep(1000);
			
			opcaouffilial.click();
			sleep(1000);
			closeSelectTypeCheckbox(ufFilial);
		}
		sleep(2000);
		filial.click();
		sleep(2000);
		opcao1filial.click();
		sleep(1000);
		opcao2filial.click();
		sleep(1000);
		closeSelectTypeCheckbox(filial);

		sleep(1000);
		filialcentralizadora.click();
		sleep(1000);
		opcaofialcentralizadora.click();
		sleep(1000);

		//pega a data atual
		String dataatual1 = fechaActual();
		datainicio.sendKeys(dataatual1);
		
		//fim do preenchiminto
		gravar.click();
		
		butaosim.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//Pega o ultimo id depois do preenchimento
		siguiente.click();
		
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
	
	public boolean ExcluirMasas() {
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
		sleep(2000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		
		aceitar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectElement(siguiente);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
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
