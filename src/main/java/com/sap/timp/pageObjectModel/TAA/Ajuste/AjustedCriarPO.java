package com.sap.timp.pageObjectModel.TAA.Ajuste;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;

public class AjustedCriarPO extends TestBaseMassiel{

	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[1]")
	public WebElement ajuste;
	
	@FindBy(xpath = "//div[@class=\"adjustment-accordion accordion-adjustments\"]/ul/li[7]")
	public WebElement iCMS;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[text()=\"Novo Ajuste\"]")
	public WebElement nueva;
	
	@FindBy(xpath = "//div[@id=\"labelTributo\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"codEmpresa\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"ufOrigem\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"codFilial\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//li[text()=\"ICMS\"]")
	public WebElement tributoOPC;
	
	@FindBy(xpath = "//li[text()=\"1000\"]")
	public WebElement empresaOPC;
	
	@FindBy(xpath = "//div[@id=\"subPeriod\"]/div/div/span")
	public WebElement subPeriodo;
	
	@FindBy(xpath = "//div[@class=\"title-wrapper\"]/div[1]")
	public WebElement flechacalendario;
	
	@FindBy(xpath = "//div[text()=\"2016\"]")
	public WebElement anio;
	
	@FindBy(xpath = "//div[text()=\"Jan\"]")
	public WebElement mes;
	
	@FindBy(xpath = "//div[@class=\"dates-wrapper\"]/div[1]/span")
	public WebElement periodo;
	
	@FindBy(xpath = "//span[text()=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//span[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"ajusteValue\"]/div/div/input")
	public WebElement valorAjuste;
	
	@FindBy(xpath = "//div[@id=\"dtLanc\"]/div/div/input")
	public WebElement fechaLancamento;
	
	@FindBy(xpath = "//body/div[@class=\"overlay dark\"][2]/div/div[3]/button[1]")
	public WebElement no;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Confirmar\"]")
	public WebElement confirmar;
	
	public   AjustedCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;
		boolean tq2  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}else if(url.contains("tq2")){
			tq2 = true;
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ajuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true || tq2 == true) {

			WebElement icms = driver.findElement(By.xpath("//div[@class=\"adjustment-accordion accordion-adjustments\"]/ul/li[1]"));
			
			icms.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true ) {
			
			WebElement icms = driver.findElement(By.xpath("//div[@class=\"adjustment-accordion accordion-adjustments\"]/ul/li[15]"));
			
			icms.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		}else {
			
			WebElement icms = driver.findElement(By.xpath("//div[@class=\"adjustment-accordion accordion-adjustments\"]/ul/li[7]"));
			
			icms.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		
		}
		
		
		waitExpectElement(primeira);
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id ="0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		} 
		
		System.out.println("Id Anterior"+id);
		
		nueva.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(tributo);
		sleep(2000);
		
		tributo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		actionsMoveToElementXpath("//li[text()=\"ICMS\"]");
		sleep(2000);
		
		tributoOPC.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresaOPC.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		uf.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true|| tq2 == true) {

			WebElement ufOPC = driver.findElement(By.xpath("//li[text()=\"SP\"]"));
			
			ufOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true ) {
			WebElement ufOPC = driver.findElement(By.xpath("//li[text()=\"SP\"]"));
			
			ufOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		}else {
		
			WebElement ufOPC = driver.findElement(By.xpath("//li[text()=\"AL\"]"));
			
			ufOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		filial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		 
		if (tq1 == true|| tq2 == true){

			WebElement filialOPC = driver.findElement(By.xpath("//li[text()=\"0001\"]"));
			
			filialOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true ) {
			
			
			
			WebElement filialOPC = driver.findElement(By.xpath("//li[text()=\"0001\"]"));
			
			filialOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		}else {
		
			WebElement filialOPC = driver.findElement(By.xpath("//li[text()=\"0008\"]"));
			
			filialOPC.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		subPeriodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		flechacalendario.click();
		sleep(3000);
		
		anio.click();
		sleep(3000);
		
		mes.click();
		sleep(4000);
		
		periodo.click();
		sleep(3000);
		
		pesquisar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectXpath("//div[contains(@class,\"tr\") and @data-id]/div[2]/div");
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tr\") and @data-id]/div[2]/div")).getText();
		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tr\") and @data-id]/div[1]/label/span"));
		check1.click();
		
		sleep(1000);
		
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(biblioteca);
		sleep(2000);
		
		
		//sleep(10000);
		sleep(2000);
		
		valorAjuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		valorAjuste.sendKeys("23");
		sleep(2000);
		
		fechaLancamento.sendKeys(fechaActual());
		sleep(2000);
		
		gravar.click();
		sleep(4000);
		
		confirmar.click();
		sleep(4000);
		
		no.click();
		sleep(4000);
		
		confirmar.click();
		sleep(4000);
		
		waitExpectElement(nueva);
		sleep(2000);
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idN = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		idInserir("Ajuste",idN);
		System.out.println("Id Nuevo"+id);
		

		  
		sleep(2000); 
		System.out.println(id); 
		System.out.println(idN);
		  
		boolean sucesso = false;
		double idD = Integer.valueOf(id); 
		double idBD = Integer.valueOf(idN);
		
		if (idBD > idD) { 
			sucesso = true; 
		}else { 
			sucesso = false; 
		}
		  
		return sucesso;	
		
		
	}
}
