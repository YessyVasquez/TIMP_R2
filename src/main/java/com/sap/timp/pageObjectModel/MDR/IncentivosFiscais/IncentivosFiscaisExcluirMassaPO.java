package com.sap.timp.pageObjectModel.MDR.IncentivosFiscais;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class IncentivosFiscaisExcluirMassaPO extends TestBaseSteven {
	
	@FindBy(xpath = "//ul[@class=\"accordion\"]/li[contains(@identifier,\"accordion-item-incentivosFiscais\")]/div/span[2]")
	public WebElement incentivosFiscais;
	
	@FindBy(xpath = "//span[text()=\"Projetos Patrocinados\"]")
	public WebElement subIncentivosFiscais;
	
	@FindBy(xpath = "//span[text()=\"Novo Projeto Patrocinado\"]")
	public WebElement novoIncentivo;
	

	
	@FindBy(xpath="//input[@placeholder=\"Preencher Tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath="//li[@id=\"option-1\"]")
	public WebElement opcTributo;
	
	//SELECT CON CHECKBOX	
		
	@FindBy(xpath = "//*[@id=\"company\"]/div/div[1]/div[1]/div[2]/input")
	public WebElement empresa;
	
		@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
		public WebElement opcempresa;
	
	@FindBy(xpath ="//*[@id=\"uf\"]/div/div[1]/div[1]")
	public WebElement selecionarUfFilial; 
	
		@FindBy(xpath ="//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
		public WebElement opcselecionarUfFilial; 
		
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[1]")
	public WebElement filial;
	
		@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
		public WebElement opcfilial;	
		
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Título do Projeto\"]")
	public WebElement titulo;
		
	@FindBy(xpath = "//*[@id=\"CNPJPatrocinado\"]/div/div/input")
	public WebElement CNPJ;
		
	@FindBy(xpath = "//*[@id=\"nomePatrocinado\"]/div/div/input")
	public WebElement patrocinado;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione uma Opção\"]")
	public WebElement centralizacao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecionar o Data de Inicio de Vigência\")]")
	public WebElement validade;
	
	
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
	
	@FindBy(xpath = "//span[contains(text(),\"Salvar e Novo\")]")
	public WebElement novo1;
	
	@FindBy(xpath="//body")
	public WebElement clickFuera;
	
	public IncentivosFiscaisExcluirMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		incentivosFiscais.click();
		sleep(2000);
		
		subIncentivosFiscais.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novoIncentivo.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//Primeiro Registro
		tributo.click();
		sleep(2000);
		opcTributo.click();
		
		
		sleep(3000);
		empresa.click();
		sleep(2000);
		opcempresa.click();
		sleep(2000);
		clickFuera.click();
		
		sleep(2000);
		titulo.sendKeys("teste QA 02");
		
		sleep(2000);
		CNPJ.sendKeys("33.795.055/0001-94");
		clickFuera.click();
		sleep(3000);
		sleep(3000);
		sleep(3000);
		
		centralizacao.click();
		sleep(2000);
		opcTributo.click();
		sleep(3000);
		
		String data = fechaActual();
		validade.sendKeys(data);
		sleep(1000);
		
		novo1.click();
		
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		//Segundo Registro
		waitExpectElement(tributo);
		//sleep(2000);
		tributo.click();
		sleep(2000);
		opcTributo.click();
		
		
		sleep(3000);
		empresa.click();
		sleep(2000);
		opcempresa.click();
		sleep(2000);
		clickFuera.click();
		
		sleep(2000);
		titulo.sendKeys("teste QA 03");
		
		sleep(2000);
		CNPJ.sendKeys("33.795.055/0001-94");
		clickFuera.click();
		sleep(3000);
		sleep(3000);
		sleep(3000);
		
		centralizacao.click();
		sleep(2000);
		opcTributo.click();
		sleep(3000);
		
		String data1 = fechaActual();
		validade.sendKeys(data1);
		sleep(1000);
		
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

		siguiente.click();
		
		sleep(3000);
		
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
	
	
	public boolean excluir() {
		
		
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
		waitExpectElement(sim);
		sleep(1000);
		sim.click();
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
