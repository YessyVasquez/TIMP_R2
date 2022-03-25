package com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentoDeEstruturasCriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Mapeamento de Estruturas\"]")
	public WebElement mapeamentodeestruturas;
	
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Mapeamento\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"input structureMap\"]/div/div[2]")
	public WebElement estruturadedados;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes Fiscais\"]")
	public WebElement opcaoestrutura;
	
	@FindBy(xpath = "//div[@class=\"input companyMap\"]/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][text()=\"Código da empresa\"]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@class=\"input ufMap\"]/div/div[2]")
	public WebElement ufdafilial;
	
	@FindBy(xpath = "//li[@id][text()=\"UF da filial\"]")
	public WebElement opcaoufdafilial;
	
	
	@FindBy(xpath = "//div[@class=\"input branchMap\"]/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//li[@id][text()=\"Código da filial\"]")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//div[@class=\"input dataMap\"]/div/div/div[2]")
	public WebElement data;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"Data de lançamento\"]")
	public WebElement opcaodata;
	
	@FindBy(xpath = "//div[@class=\"input taxMap\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência\"]")
	public WebElement datainicio;

	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Fim de Vigência\"]")
	public WebElement datafim;
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	public MapeamentoDeEstruturasCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		mapeamentodeestruturas.click();
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println("Ultimo registro: " + id);
		
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		estruturadedados.click();
		sleep(2000);
		opcaoestrutura.click();
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		opcaoempresa.click();
		sleep(2000);
		ufdafilial.click();
		sleep(2000);
		opcaoufdafilial.click();
		sleep(2000);
		filial.click();
		sleep(2000);
		opcaofilial.click();
		sleep(2000);
		data.click();
		sleep(2000);
		opcaodata.click();
		closeSelectTypeCheckbox(data);
		sleep(2000);
		actionsMoveToElementXpath("//input[@placeholder=\"Selecione a Data de Inicio de Vigência\"]");
		tributo.click();
		sleep(2000);
		opcaotributo.click();
		closeSelectTypeCheckbox(tributo);
		sleep(2000);
		datainicio.sendKeys("02/01/1978");
		datafim.sendKeys("01/01/1979");
		gravar.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		mapeamentodeestruturas.click();
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
	//	System.out.println("Rows:" +rows);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("MapeamentoDeEstruturasCriar",idultimo);

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
