package com.sap.timp.pageObjectModel.TBD.Configuracao.RangeDeNumeracao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RangeDeNumeracaoCriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Configuração de TBD\"]")
	public WebElement configuracao;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Range de Numeração\"]")
	public WebElement configuracaodereangedenumeracao;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Configuração de Range de Numeração\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Intervalo Numérico\"]")
	public WebElement intervalornumerico;
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Range De\"]")
	public WebElement rangede;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Range Até\"]")
	public WebElement rangeate;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Numeração Atual\"]")
	public WebElement numeracaoatual;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement validadede;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade Até\"]")
	public WebElement validadeate;
	

	


	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	public RangeDeNumeracaoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracao.click();
		
		sleep(2000);
		
		configuracaodereangedenumeracao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		
		System.out.println("Ultimo registro: " + id);
		
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		intervalornumerico.sendKeys("2400");
		sleep(1000);
		rangede.sendKeys("896606821");
		sleep(1000);
		rangeate.sendKeys("896606822");
		sleep(1000);
		numeracaoatual.sendKeys("896606823");
		sleep(1000);
		validadede.sendKeys("01/01/2013");
		sleep(2000);
		validadeate.sendKeys("16/12/2060");
		sleep(2000);
		Gravar.click();
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracao.click();
		sleep(2000);
		configuracaodereangedenumeracao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		System.out.println("Rows:" +rows);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		
		idInserir1(idultimo);

		System.out.println(id);
		System.out.println(idultimo);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idultimo);
		
		boolean sucesso = false;
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		return sucesso;
	}

}
