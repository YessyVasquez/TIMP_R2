package com.sap.timp.pageObjectModel.MDR.CadastroEspecificodoINSS.CadastroDeObras;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class CadastroDeObrasExcluirEmMassaPO extends TestBaseKenssy {

	
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
	
	
	
	//BOTON EXCLUIR EN MASA
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement gravareNovo;
	
	public CadastroDeObrasExcluirEmMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
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
		
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println(id);
		}
		
		//NUEVO REGISTRO
		sleep(2000);
	    nuevo.click();
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//for (int i = 0; i < 2; i++) {
			
			
			Tipos.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			Tipos.sendKeys(Keys.ENTER);
			
			NuTipos.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			CEI.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			CEI.sendKeys(Keys.ENTER);
			CEI.sendKeys("12865854");
			sleep(2000);
			
			Descripcion.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			Descripcion.sendKeys(Keys.ENTER);
			Descripcion.sendKeys("tipo de cadastro");
			
			inpuEmpresa.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			inpuEmpresa.sendKeys(Keys.ENTER);
			sleep(2000);
			
			Empresa.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			Filial.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			Filial.sendKeys(Keys.ENTER);
			sleep(2000);
			
			NumeroFilial.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			Filtro.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			BotonCodigo.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			NumeroCodigo.sendKeys("73");
			sleep(4000);
			
			sim.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			fornecedor.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			fornecedor.sendKeys(Keys.ENTER);
			sleep(2000);
			
			numfornecedor.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			CNPJ.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			CNPJ.sendKeys(Keys.ENTER);
			sleep(2000);
			
			numCNPJ.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			Nome.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			Nome.sendKeys(Keys.ENTER);
			sleep(2000);
			
			numNome.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			DataInicial.sendKeys(fechaActual());
			
			status.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			status.sendKeys(Keys.ENTER);
			sleep(2000);
			
			nuevostatus.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			Gravar.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			Sim.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			Gravar.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			Sim.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		
		//}
		
		Biblioteca.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
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

	public boolean cadastroDeObrasExcluirEmMassa() {
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
		waitExpectElement(ultimaPagina);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		ultimaPagina.click();
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
