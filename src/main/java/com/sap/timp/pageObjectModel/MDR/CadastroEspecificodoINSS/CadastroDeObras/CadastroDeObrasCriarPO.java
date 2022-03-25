package com.sap.timp.pageObjectModel.MDR.CadastroEspecificodoINSS.CadastroDeObras;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class CadastroDeObrasCriarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\" Cadastro Especifico do INSS (CEI)\"]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//span[text()=\" Cadastro de Obras\"]")
	public WebElement obras;

	@FindBy(xpath = "//span[text()=\" Novo Cadastro de Obras\"]")
	public WebElement nuevo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Tipos CEI\"]")
	public WebElement Tipos;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement NuTipos;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher CEI\"]")
	public WebElement CEI;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição\"]")
	public WebElement Descripcion;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Empresa \"]")
	public WebElement inpuEmpresa;
	
	@FindBy(xpath = "//li[contains(@class, \"list-item\")][2]")
	public WebElement Empresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Filial \"]")
	public WebElement Filial;
	
	@FindBy(xpath = "//li[contains(@class, \"list-item\")][2]")
	public WebElement NumeroFilial;
	
	@FindBy(xpath = "//button[@id=\"filterButtonStr\"]")
	public WebElement Filtro;
	
	@FindBy(xpath = "//div[@id=\"rbtCode\"]/div/label/span")
	public WebElement BotonCodigo;
	
	@FindBy(xpath = "//span[text()=\"Selecionar Código\"]")
	public WebElement Codigo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Código\"]")
	public WebElement NumeroCodigo;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Fornecedor \"]")
	public WebElement fornecedor;
	
	@FindBy(xpath = "//li[contains(@class, \"list-item\")][2]")
	public WebElement numfornecedor;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher CNPJ \"]")
	public WebElement CNPJ;
	
	@FindBy(xpath = "//li[contains(@class, \"list-item\")][2]")
	public WebElement numCNPJ;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Nome \"]")
	public WebElement Nome;
	
	@FindBy(xpath = "//li[@id=\"Fornecedor nacional 07-Subcon.\"]")
	public WebElement numNome;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Data Inicial\"]")
	public WebElement DataInicial;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Status da Obra\"]")
	public WebElement status;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement nuevostatus;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement Sim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement Biblioteca;
	
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	public CadastroDeObrasCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Criar() {
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	    cadastro.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		obras.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//ultimo id de la tablas
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Ultimo ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("ID Ultimo Registro: " + id);
		}
		sleep(2000);
//		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
//		System.out.println(rows);	
//		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
//		System.out.println(id);			
//	    sleep(2000);
		
	    nuevo.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Tipos.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Tipos.sendKeys(Keys.ENTER);
		
		NuTipos.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		CEI.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		CEI.sendKeys(Keys.ENTER);
		CEI.sendKeys("993855");
		sleep(2000);
		
		Descripcion.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		Descripcion.sendKeys(Keys.ENTER);
		Descripcion.sendKeys("tipo de cadastros9");
		
		inpuEmpresa.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		inpuEmpresa.sendKeys(Keys.ENTER);
		sleep(2000);
		
		Empresa.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Filial.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		Filial.sendKeys(Keys.ENTER);
		sleep(2000);
		
		NumeroFilial.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Filtro.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		BotonCodigo.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		NumeroCodigo.sendKeys("9");
		sleep(4000);
		
		sim.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		fornecedor.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		fornecedor.sendKeys(Keys.ENTER);
		sleep(2000);
		
		numfornecedor.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		CNPJ.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		CNPJ.sendKeys(Keys.ENTER);
		sleep(2000);
		
		numCNPJ.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Nome.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		Nome.sendKeys(Keys.ENTER);
		sleep(2000);
		
		numNome.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		DataInicial.sendKeys(fechaActual());
		
		status.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		status.sendKeys(Keys.ENTER);
		sleep(2000);
		
		nuevostatus.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Gravar.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Sim.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Biblioteca.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//revisando si fue le ultimo que se creo 
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		boolean sucesso = false;
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		  
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		idInserir("CadastroDeObras",idB);
		  
		sleep(2000); 
		System.out.println(id); 
		System.out.println(idB);
		  
		double idD = Integer.valueOf(id); 
		double idBD = Integer.valueOf(idB);
		
		if (idBD > idD) { 
			sucesso = true; 
		}else { 
			sucesso = false; 
		}
		  
		return sucesso;	
	
		
	}
}
