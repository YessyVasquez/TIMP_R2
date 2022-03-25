package com.sap.timp.pageObjectModel.MDR.SaldoInicial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class SaldoInicialCriarPO extends TestBaseKenssy {
	
	@FindBy(xpath = "//ul[@class=\"accordion\"]/li[contains(@identifier,\"accordion-item-saldos\")]/div/span[2]")
	public WebElement saldoInicial;
	
	@FindBy(xpath = "//span[text()=\"Novo Saldo Inicial\"]")
	public WebElement novoSaldoInicial;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	
	//SELECT SIN CHECKBOS
	@FindBy(xpath="//div[@id=\"empresa\"]/div/div/div[2]")
	public WebElement empresa;
	
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcEmpresa;
	
	//select con CHECKBOX
	@FindBy(xpath = "//div[@id=\"filial\"]/div/div/div[1]")
	public WebElement filial;
	
		@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
		public WebElement opcfilial;

	@FindBy(xpath="//div[@id=\"tributo\"]/div/div/div[2]")
	public WebElement tributo;
	
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcTributo;
		
		
	@FindBy(xpath="//div[@id=\"taxType\"]/div/div/div[2]")
	public WebElement tipoImpuesto;
	
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcTipoImpuesto;
		
	@FindBy(xpath="//div[@id=\"REFERENCIA_SALDO\"]/div/div/div[2]")
	public WebElement referencia;
	
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcReferencia;	
		
	@FindBy(xpath="//div[@id=\"UF_ORIGIN\"]/div/div/div[2]")
	public WebElement ufOrigen;
	
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcUfOrigen;		
	
	@FindBy(xpath="//div[@id=\"MES\"]/div/div/div[2]")
	public WebElement mes;
	
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcMes;
		
	@FindBy(xpath="//div[@id=\"YEAR\"]/div/div/div[2]")
	public WebElement year;
	
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcYear;
		
	
	@FindBy(xpath="//div[@id=\"DEBITO_CREDITO\"]/div/div/div[2]")
	public WebElement seleccionarDC;
	
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcDC;
	

	@FindBy(xpath="//div[@id=\"saldo\"]/div/div/input")
	public WebElement saldo;
	
		
		
	@FindBy(xpath="//body")
	public WebElement clickFuera;

	
	@FindBy(xpath="//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	
	@FindBy(xpath="//button[text()=\"Sim\"]")
	public WebElement simGravar;
	
	
	@FindBy(xpath="//span[text()=\"Biblioteca\"]")
	public WebElement irBiblioteca;
	
	@FindBy(xpath="//div[contains(@class,\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\")][2]")
	public WebElement irFinalPagina;
	
	
	

	
	
	
	public SaldoInicialCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean CriarSaldoInicial() {
		sleep(2000);
		saldoInicial.click();
		
		
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		irFinalPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		System.out.println("cantidad de rows: " + rows);
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);
		
		
		novoSaldoInicial.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		opcEmpresa.click();
		opcEmpresa.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		filial.click();
		sleep(2000);
		opcfilial.click();
		sleep(2000);
		clickFuera.click();
		
		
		tributo.click();
		opcTributo.click();
		opcTributo.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		
		
		tipoImpuesto.click();
		opcTipoImpuesto.click();
		opcTipoImpuesto.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		referencia.click();
		opcReferencia.click();
		opcReferencia.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		
		ufOrigen.click();
		opcUfOrigen.click();
		opcUfOrigen.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		
		mes.click();
		opcMes.click();
		opcMes.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		
		year.click();
		opcYear.click();
		opcYear.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		
		
		seleccionarDC.click();
		opcDC.click();
		opcDC.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		
		saldo.sendKeys("1.000,00");
		sleep(2000);
		
		
		gravar.click();
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		simGravar.click();
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		irBiblioteca.click();
	
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		irFinalPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("SaldoInicial",idB);
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
