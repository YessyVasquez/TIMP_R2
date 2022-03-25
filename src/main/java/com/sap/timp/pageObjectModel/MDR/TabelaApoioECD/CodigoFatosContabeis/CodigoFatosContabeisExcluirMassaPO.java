package com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.CodigoFatosContabeis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class CodigoFatosContabeisExcluirMassaPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\" Tabelas de Apoio ECD\"]")
	public WebElement tabelaECDE;
	
	@FindBy(xpath = "//span[text()=\" Código dos Fatos Contábeis\"]")
	public WebElement opcionCodigoFatosContabeis;
	
	@FindBy(xpath = "//span[text()=\"Novo  Código do Fato Contábil\"]")
	public WebElement btnNovoCodigoFatoContabeisElement;
	
	@FindBy(xpath = "//div[@id=\"accountingFactCode-1\"]/div/div/input")
	public WebElement inputCodigoFatoContabil;
	
	@FindBy(xpath = "//div[@id=\"accountingFact-1\"]/div/div/input")
	public WebElement inputDescricaoFatoContabil;
	
	@FindBy(xpath = "//div[@id=\"startDate-1\"]/div/div/input")
	public WebElement inputDataInicio;
	
	@FindBy(xpath = "//div[@id=\"endDate-1\"]/div/div/input")
	public WebElement inputDataFinal;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	//BOTON EXCLUIR EN MASA
		@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
		public WebElement excluirMassa;

		@FindBy(xpath = "//button[text()=\"Aceitar\"]")
		public WebElement aceitar;
	
	public CodigoFatosContabeisExcluirMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		tabelaECDE.click();
		
		sleep(2000);
		opcionCodigoFatosContabeis.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		btnNovoCodigoFatoContabeisElement.click();
		
		sleep(2000);
		waitExpectElement(inputCodigoFatoContabil);
		inputCodigoFatoContabil.sendKeys("110");
		
		sleep(2000);
		waitExpectElement(inputDescricaoFatoContabil);
		inputDescricaoFatoContabil.sendKeys("Prueba de tester = verificar5M");
		
		sleep(2000);
		waitExpectElement(inputDataInicio);
		inputDataInicio.sendKeys(fechaAyer());
		
		sleep(2000);
		waitExpectElement(inputDataFinal);
		inputDataFinal.sendKeys(fechaActual());
		
		sleep(2000);
		
		btnGravar.click();
		
		waitExpectElement(btnSim);
		btnSim.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		btnBiblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(2000);
		waitExpectElement(btnUltimaPagina);
		sleep(2000);
		
		//conta o numero de linhas
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[3]/div")).getText();
		
		System.out.println(id1);
		
		
		sleep(2000);
		btnNovoCodigoFatoContabeisElement.click();
		
		sleep(2000);
		waitExpectElement(inputCodigoFatoContabil);
		inputCodigoFatoContabil.sendKeys("111");
		
		sleep(2000);
		waitExpectElement(inputDescricaoFatoContabil);
		inputDescricaoFatoContabil.sendKeys("Prueba de tester");
		
		sleep(2000);
		waitExpectElement(inputDataInicio);
		inputDataInicio.sendKeys(fechaManana());
		
		sleep(2000);
		waitExpectElement(inputDataFinal);
		inputDataFinal.sendKeys(fechaPasadoManana());
		
		sleep(2000);
		
		btnGravar.click();
		
		waitExpectElement(btnSim);
		btnSim.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		btnBiblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
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
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		aceitar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectElement(	btnUltimaPagina);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		btnUltimaPagina.click();
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
