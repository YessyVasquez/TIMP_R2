package com.sap.timp.pageObjectModel.TFP.Configurações.Bloqueios.SubPeriodo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class BloqueioSubPeríodoCriarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement configuracoe;
	
	@FindBy(xpath = "//span[text()=\"Sub-Período\"]")
	public WebElement subPeriodo;
	
	@FindBy(xpath = "//span[text()=\"Bloqueios\"]")
	public WebElement bloqueio;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[text()=\"Nova Configuração de Bloqueios de Subperíodo\"]")
	public WebElement nova;
	
	@FindBy(xpath = "//div[@id=\"dialogContentWraper\"]")
	public WebElement empresaFlecha;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Status\"]")
	public WebElement status;
	
	@FindBy(xpath = "//*[@id=\"000\"]/div[1]/label/span")
	public WebElement statusOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	public WebElement empresaOpc;
	
	@FindBy(xpath = "//*[@id=\"3000\"]/div[1]/label/span")
	public WebElement empresaOpcTQ1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar UF\"]")
	public WebElement uf;
	
	@FindBy(xpath = "//*[@id=\"BA\"]/div[1]/label/span")
	public WebElement ufOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Filial\"]")
	public WebElement Filial;
	
	@FindBy(xpath = "//*[@id=\"0143\"]/div[1]/label/span")
	public WebElement FilialOpc;
	
	@FindBy(xpath = "//*[@id=\"0031\"]/div[1]/label/span")
	public WebElement FilialOpcTQ1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//*[@id=\"00\"]/div[1]/label/span")
	public WebElement tributoOpctq1;
	
	@FindBy(xpath = "//div[@id=\"state\"]/div/div/div[2]")
	public WebElement estado;
	
	@FindBy(xpath = "//div[@id=\"BA\"]")
	public WebElement estadoOpc;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	

	

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
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement diaOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement validadeDE;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data final\"]")
	public WebElement validadeAte;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement criar;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//*[@id=\"list-l-elements-wrapper\"]/div[1]/div/div[2]/div[1]")
	public WebElement BFB;
	

	@FindBy(xpath = "//*[@id=\"table\"]/div/div/div/div[2]/div[1]/div[1]/label/span")
	public WebElement accesarFlagBFB;
	public BloqueioSubPeríodoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criar() {
		
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
		
		bloqueio.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		subPeriodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		
		//ultimo id de la tablas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		

		
		
		System.out.println(id);
		
		nova.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		status.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		statusOpc.click();
		sleep(2000);
		
		statusOpc.sendKeys(Keys. ESCAPE);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println(tc2);
		System.out.println(tq1);
		System.out.println(tp1);
		
		if (tc2 == true) {
			empresaOpc.click();
			sleep(2000);
			empresaOpc.sendKeys(Keys. ESCAPE);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(6000);
		}else {
			empresaOpcTQ1.click();
			sleep(2000);
			empresaOpcTQ1.sendKeys(Keys. ESCAPE);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(6000);
		}
		
			
		
		uf.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ufOpc.click();
		sleep(2000);
		ufOpc.sendKeys(Keys. ESCAPE);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(18000);
		

		
		Filial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		if (tc2 == true) {
			FilialOpc.click();
			sleep(2000);
			FilialOpc.sendKeys(Keys. ESCAPE);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}else {
			FilialOpcTQ1.click();
			sleep(2000);
			FilialOpcTQ1.sendKeys(Keys. ESCAPE);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		
	
		
		tributo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tributoOpctq1.click();
		sleep(2000);
		tributoOpctq1.sendKeys(Keys. ESCAPE);
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
//		if (tq1 == true) {
//			WebElement tributoOpc = driver.findElement(By.xpath( "//li[@id=\"option-13\"]"));
//			
//			tributoOpc.click();
//			sleep(2000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
//			
//			
//		}else if (tc2 == true) {
//			
//			WebElement tributoOpc = driver.findElement(By.xpath( "//li[@id=\"option-7\"]"));
//			
//			tributoOpc.click();
//			sleep(2000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
//			
//		
//		}else {
//			
//			WebElement tributoOpc = driver.findElement(By.xpath( "//li[@id=\"option-17\"]"));
//			
//			tributoOpc.click();
//			sleep(2000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
//			
//		}
		

		
		validadeDE.sendKeys("01/01/2014");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(BFB, driver.findElement(By.xpath("//*[@id=\"list-r\"]")));
		sleep(4000);
		
		accesarFlagBFB.click();
		sleep(3000);
		
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(20000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		System.out.println(idB);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		double idD = Integer.valueOf(id); 
		double idBD = Integer.valueOf(idB);
		
		System.out.println(idB);
		//boolean sucesso1 = (Boolean) null;
		if (idBD > idD) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		
		return sucesso;
	}
	
}
