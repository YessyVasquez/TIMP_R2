package com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.TabelaDeApoioECF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class TabelaDeApoioECFTabelaPO extends TestBaseFernando{
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Cadastros IRPJ/CSLL\"]")
	public WebElement cadastroIRPJCSLL;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-supportParameterECF\"]")
	public WebElement tabelaDeApoioECF;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcao;
	
	
	@FindBy(xpath = "//div[@id=\"version\"]/div/div[2]")
	public WebElement versao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Tabela\")]")
	public WebElement tabela;
	
	@FindBy(xpath = "//textarea[contains(@placeholder,\"Descrição\")]")
	public WebElement descricao;

	
	@FindBy(xpath = "//span[contains(text(),\"Nova\")]")
	public WebElement nova;

	@FindBy(xpath = "//button[not(contains(@class,\"highlighted\"))]/span[contains(@class,\"plussign\")]")
	public WebElement mais;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	public TabelaDeApoioECFTabelaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(cadastroIRPJCSLL);
		cadastroIRPJCSLL.click();
		sleep(1000);
		
		tabelaDeApoioECF.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		mais.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[@class=\"dialog-content big\"]/div/div[2]/div/div/div/div[3]/div[@class=\"tr\" and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[@class=\"dialog-content big\"]/div/div[2]/div/div/div/div[3]/div[@class=\"tr\" and @data-id]["+rows+"]/div[2]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		
		nova.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		versao.click();
		sleep(1000);
		opcao.click();
		
		
		tabela.sendKeys("teste");
		
		descricao.sendKeys("Teste Nova Tabela ECF");
		
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[@class=\"dialog-content big\"]/div/div[2]/div/div/div/div[3]/div[@class=\"tr\" and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[@class=\"dialog-content big\"]/div/div[2]/div/div/div/div[3]/div[@class=\"tr\" and @data-id]["+rows+"]/div[2]/div")).getText();
		
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
		String Rows3 = String.valueOf(rows);
		
		idInserir("TabelaDeApoioECFTabela", Rows3);
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
		
		
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	public boolean Excluir() {

		System.out.println("--------------EXCLUIR---------------");
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("TabelaDeApoioECFTabela");
		
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
		
		mais.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
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
