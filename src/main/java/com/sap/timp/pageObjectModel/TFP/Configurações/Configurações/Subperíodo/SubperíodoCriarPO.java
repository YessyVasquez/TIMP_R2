package com.sap.timp.pageObjectModel.TFP.Configurações.Configurações.Subperíodo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class SubperíodoCriarPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement configuracoe;
	
	@FindBy(xpath = "//span[text()=\"Subperíodo\"]")
	public WebElement subPeriodo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[text()=\"Nova Configuração de Subperíodo\"]")
	public WebElement nova;
	
	@FindBy(xpath = "//div[@id=\"dialogContentWraper\"]")
	public WebElement empresaFlecha;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"3000\"]")
	public WebElement empresaOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id=\"option-13\"]")
	public WebElement tributoOpctq1;
	
	@FindBy(xpath = "//div[@id=\"state\"]/div/div/div[2]")
	public WebElement estado;
	
	@FindBy(xpath = "//div[@id=\"BA\"]")
	public WebElement estadoOpc;
	

	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement Filial;
	
	@FindBy(xpath = "//div[@id=\"3000-0031-BA\"]")
	public WebElement FilialOpc;

	@FindBy(xpath = "//input[@placeholder=\" Selecionar Periodicidade\"]")
	public WebElement periodicidade;
	
	@FindBy(xpath = "//li[@id=\"option-5\"]")
	public WebElement periodicidadeOpc;
	
	@FindBy(xpath = "//div[@id=\"impact\"]/div/div/div[2]")
	public WebElement impacto;
	
	@FindBy(xpath = "//div[text()=\"BCB\"]")
	public WebElement impactoOpc;
	
	@FindBy(xpath = "//div[@id=\"opening\"]/div/div/div[2]")
	public WebElement abertura;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement aberturaOpc;
	
	@FindBy(xpath = "//div[@id=\"day-type\"]/div/div/div[2]")
	public WebElement tipoDia;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement tipoDiaOpc;
	
	@FindBy(xpath = "//div[@id=\"day\"]/div/div/div[2]")
	public WebElement dia;
	
	@FindBy(xpath = "//li[@id=\"option-2\"]")
	public WebElement diaOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data inicial\"]")
	public WebElement validadeDE;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data final\"]")
	public WebElement validadeAte;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement criar;
	
	public SubperíodoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		String url = driver.getCurrentUrl();
		
		boolean tq1 = false;
		boolean tp1 = false;
		boolean tc2 = false;
		
		if (url.contains("tq1")) {
			tq1 = true;
		}else if (url.contains("tc2")) {
			tc2 = true;
		}else {
			tp1 = true;
		}
		
		
		configuracoe.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		subPeriodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
		
		System.out.println(id);
		
		nova.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	
		
		if (tq1 == true) {
			
			WebElement empresaOpc = driver.findElement(By.xpath( "//div[@id=\"3000\"]"));
			
			empresaOpc.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(empresa);
			
		}else if (tc2 == true) {
			
			
			WebElement empresaOpc = driver.findElement(By.xpath( "//div[@id=\"6000\"]"));
			
		
			empresaOpc.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(empresa);
			
		}else {
			
			WebElement empresaOpc = driver.findElement(By.xpath( "//div[@id=\"3000\"]"));
			
			empresaOpc.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(empresa);
		}
		
		
	
		
		
		tributo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {
			WebElement tributoOpc = driver.findElement(By.xpath( "//li[@id=\"option-17\"]"));
			
			tributoOpc.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			
		}else if (tc2 == true) {
			
			WebElement tributoOpc = driver.findElement(By.xpath( "//li[@id=\"option-7\"]"));
			
			tributoOpc.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		
		}else {
			
			WebElement tributoOpc = driver.findElement(By.xpath( "//li[@id=\"option-17\"]"));
			
			tributoOpc.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		}
		
		
		estado.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {
			WebElement estadoOpc = driver.findElement(By.xpath( "//div[@id=\"BA\"]"));
			
			estadoOpc.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(estado);
			
		}else if (tc2 == true) {
			
			WebElement estadoOpc = driver.findElement(By.xpath( "//div[@id=\"RJ\"]"));
			
			estadoOpc.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(estado);
		
		}else {
			
			WebElement estadoOpc = driver.findElement(By.xpath( "//div[@id=\"BA\"]"));
			
			estadoOpc.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(estado);
			
		}

		
		Filial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		
		if (tq1 == true) {
			WebElement FilialOpc = driver.findElement(By.xpath( "//div[@id=\"3000-0031-BA\"]"));
			
			FilialOpc.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(Filial);
			
		}else if (tc2 == true) {
			
			WebElement FilialOpc = driver.findElement(By.xpath( "//div[@id=\"6000-0001-RJ\"]"));
			
			FilialOpc.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(Filial);
		
		}else {
			
			WebElement FilialOpc = driver.findElement(By.xpath( "//div[@id=\"3000-0031-BA\"]"));
			
			FilialOpc.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(Filial);
			
		}
				
		periodicidade.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		periodicidadeOpc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		impacto.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		impactoOpc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		closeSelectTypeCheckbox(impacto);
		
		abertura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		aberturaOpc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tipoDia.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		tipoDiaOpc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		dia.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		diaOpc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		validadeDE.sendKeys("01/01/1975");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		validadeAte.sendKeys("31/12/1976");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		criar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
		
		System.out.println(id);
		sleep(2000);
		idInserir("ConfiguraçõesSubperíodo",id2);
		System.out.println(id2);
		
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(id2);
		
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
