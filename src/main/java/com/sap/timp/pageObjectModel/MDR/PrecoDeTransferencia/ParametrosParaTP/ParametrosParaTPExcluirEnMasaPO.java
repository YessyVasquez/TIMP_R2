package com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ParametrosParaTP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ParametrosParaTPExcluirEnMasaPO extends TestBaseKenssy {
	
	@FindBy(xpath = "//span[text()=\"Preço de Transferência\"]")
	public WebElement precodetransferencia;
	
	@FindBy(xpath = "//span[text()=\"Parâmetros para TP\"]")
	public WebElement parametrosparatp;
	
	@FindBy(xpath = "//span[text()=\"Novo Parâmetro\"]")
	public WebElement novoparametro;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"clientCode\"]/div/div[2]")
	public WebElement codigodecliente;
	
	@FindBy(xpath = "//div[@id=\"tpDefault\"]/div/div/div[2]")
	public WebElement tpdefault;
	
	
	@FindBy(xpath = "//div[@id=\"related\"]/div/div/div[2]")
	public WebElement coligada;
	
	@FindBy(xpath = "//div[@id=\"outdoorOperation\"]/div/div/div[2]")
	public WebElement operacaoexterior;
	
	@FindBy(xpath = "//div[@id=\"interposedOperation\"]/div/div/div[2]")
	public WebElement operacaointerposta;
	
	@FindBy(xpath = "//div[@id=\"exclusiveOperation\"]/div/div/div[2]")
	public WebElement operacaoexclusiva;
	
	@FindBy(xpath = "//div[@id=\"exemptIROperation\"]/div/div/div[2]")
	public WebElement opercaoisentas;
	
	@FindBy(xpath = "//div[@id=\"taxHavensOperation\"]/div/div/div[2]")
	public WebElement operacaoparaisofiscais;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Inicio de validade\"]")
	public WebElement datainicial;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	
	//BOTON EXCLUIR EN MASA
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement gravareNovo;
	
	public ParametrosParaTPExcluirEnMasaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		precodetransferencia.click();
		sleep(2000);
		
		parametrosparatp.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistroInicial = "0";
		
		if(rows > 0) {
			//conta o numero de linhas
			idRegistroInicial = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
			System.out.println("Primer registro de la tabla: "+idRegistroInicial);
		}
		
		novoparametro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		codigodecliente.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		tpdefault.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		coligada.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		operacaoexterior.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		operacaointerposta.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		operacaoexclusiva.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		opercaoisentas.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		operacaoparaisofiscais.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		
		String data = fechaActual();
		datainicial.sendKeys(data);
		
		gravareNovo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sim.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gravareNovo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[3]/div")).getText();
		
		sleep(2000);
		System.out.println(idRegistroInicial);
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(idRegistroInicial);
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
	
	public boolean excluirEmMasaParametrosParaTP() {
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistroInicial3 = "0";
		
		if(rows > 0) {
			//conta o numero de linhas
			idRegistroInicial3 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][3]/div[3]/div")).getText();
			System.out.println("Primer registro de la tabla: "+idRegistroInicial3);
		}
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/label/span"));
		check1.click();
		sleep(1000);
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[3]/div")).getText();
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[2]/label/span"));
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
		waitExpectElement(primeira);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int id1 = convertToInt(idRegistroInicial3);
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
