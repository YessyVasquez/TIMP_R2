package com.sap.timp.pageObjectModel.MDR.MapeamentoDeRelevanciaParaPisCofins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentoDeRelevanciaParaPisCofinsCriarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Mapeamento de Relevância para PIS/COFINS\"]")
	public WebElement mapeamentoderelevancia;
	
	@FindBy(xpath = "//span[text()=\"Novo Mapeamento de Relevância para PIS/COFINS\"]")
	public WebElement novomapeamentoderelevancia;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Relevância\"]")
	public WebElement relevancia;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código da Conta\"]")
	public WebElement codigoconta;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Data de Inicio de Vigência\"]")
	public WebElement dataincio;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Data de Fim de Vigência\"]")
	public WebElement datafinal;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public MapeamentoDeRelevanciaParaPisCofinsCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		mapeamentoderelevancia.click();
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		novomapeamentoderelevancia.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		
		sleep(2000);
		
		opcaoempresa.click();
		
		sleep(2000);
		
		/*tributo.click();
		
		sleep(2000);
		
		opcaotributo.click();
		
		sleep(2000);*/
		
		relevancia.sendKeys("Teste");
		
		sleep(2000);
		
		codigoconta.sendKeys("123");
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		descricao.sendKeys("Teste");
		
		sleep(2000);
		
		String dataini = fechaActual();
		String datafin= "30/08/2020";
		
		dataincio.sendKeys(dataini);
		
		sleep(2000);
		
		datafinal.sendKeys(datafin);
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir("MapeamentoDeRelevanciaParaPisCofins",id2);
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
		
		
		System.out.println(sucesso);
		return sucesso;
	}	
	

}
