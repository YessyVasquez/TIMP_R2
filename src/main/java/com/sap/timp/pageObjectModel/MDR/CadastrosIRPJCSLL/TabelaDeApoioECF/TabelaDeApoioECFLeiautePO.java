package com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.TabelaDeApoioECF;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

import net.bytebuddy.asm.Advice.Return;

public class TabelaDeApoioECFLeiautePO extends TestBaseMassiel{

	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Cadastros IRPJ/CSLL\"]")
	public WebElement cadastroIRPJCSLL;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-supportParameterECF\"]")
	public WebElement tabelaDeApoioECF;

	@FindBy(xpath = "//div[@class=\"left-toolbar-items\"]/ul/li[6]")
	public WebElement leiaute;

	@FindBy(xpath = "//Span[text()=\"Novo Versão:\"]")
	public WebElement nuevoVersao;

	@FindBy(xpath = "//input[@placeholder=\"Preencher Versão:\"]")
	public WebElement versao;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data Inicial\"]")
	public WebElement dataInicial;

	@FindBy(xpath = "/html/body/div[6]/div[2]/div[2]/div[1]/div[2]/div[20]")
	public WebElement dataInicial1;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data Final\"]")
	public WebElement dataFinal;

	@FindBy(xpath = "/html/body/div[6]/div[2]/div[2]/div[1]/div[2]/div[33]")
	public WebElement dataFinal1;

	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath="//li[@id][1]")
	public WebElement opcTipoImposto;


	public TabelaDeApoioECFLeiautePO() {
		PageFactory.initElements(driver, this);
	}

	public Boolean Leiaute() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		cadastroIRPJCSLL.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		tabelaDeApoioECF.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		leiaute.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows1 = driver.findElements(By.xpath("//div[@class = \"tr\" and @data-id and @tabindex=\"0\"]")).size(); 
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[2]/div")).getText();
		System.out.println(id);	

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		nuevoVersao.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		versao.sendKeys("02");
		versao.sendKeys(Keys.ENTER);
		sleep(2000);
		sleep(2000);

		dataInicial.sendKeys("18/12/2020");
		versao.sendKeys(Keys.ENTER);
		
		closeSelectTypeCheckbox(dataInicial);
		sleep(2000);

		dataFinal.sendKeys("31/12/2020");
		versao.sendKeys(Keys.ENTER);

		closeSelectTypeCheckbox(dataFinal);
		sleep(2000);

		aceitar.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(16000);

		boolean sucesso = false;
		int rows2 = driver.findElements(By.xpath("//div[@id=\"id-version-list\"]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size(); 
		String idB = driver.findElement(By.xpath("//div[@id=\"id-version-list\"]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[2]/div")).getText();
	
		System.out.println(id);

		System.out.println("-----------------------------");
		System.out.println(id); 
		System.out.println(idB);

		double idD = Integer.valueOf(id); 
		double idBD = Integer.valueOf(idB);
		
		String Rows3 = String.valueOf(rows2);
		
		idInserir("TabelaDeApoioECFLeiute", Rows3);

		if (idBD > idD) { 
			sucesso = true; 
		}else { 
			sucesso = false; 
		}

		System.out.println(sucesso);
		
		return sucesso;
	}
	
	public boolean Excluir() {

		System.out.println("--------------EXCLUIR---------------");
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("TabelaDeApoioECFLeiute");
		
		WebElement menu = driver.findElement(By.xpath("//div[@id=\"id-version-list\"]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+idRegistro+"]/div[1]"));
	
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		WebElement Excluir = driver.findElement(By.xpath("//div[@class=\"popover active\"]/ul/li/span[text()=\"Excluir\"]"));
		
		Excluir.click();
		sleep(6000);
		
	
		
		driver.navigate().refresh();
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		leiaute.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		
		
		int rows = driver.findElements(By.xpath("//div[@id=\"id-version-list\"]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size(); 
		
		double rows3 = Integer.valueOf(idRegistro);
		
		
		
		System.out.println( rows); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
		
		boolean sucesso = false;
		
		if (rows != rows3 ) {
			sucesso= true;
		}
		System.out.println(sucesso);
		return sucesso;
	  	
		
		
	}
}
