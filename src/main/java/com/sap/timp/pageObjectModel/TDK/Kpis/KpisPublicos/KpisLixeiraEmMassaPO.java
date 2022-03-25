package com.sap.timp.pageObjectModel.TDK.Kpis.KpisPublicos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class KpisLixeiraEmMassaPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement kpis;
	
	@FindBy(xpath = "//span[text()=\"KPI's Públicos\"]")
	public WebElement kpispublicos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Kpi\"]")
	public WebElement novoKip;
	
	@FindBy(xpath = "//div[@id=\"name\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@id=\"classification\"]/div/div/div[2]")
	public WebElement clasificacion;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement clasificacionOPC;
	
	@FindBy(xpath = "//div[@id=\"accessClassification\"]/div/div[2]")
	public WebElement clasificacionAcceso;
	
	@FindBy(xpath = "//li[@id=\"1\"]")
	public WebElement clasificacionAccesoOPC;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//li[@class=\"leftButton library-toolbar-item   \"][3]/button/span")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view -view-wrapper  selected\"]/div/div[3]/ul/li[3]")
	public WebElement lixeira;
	
	public  KpisLixeiraEmMassaPO() {
		PageFactory.initElements(driver, this);
	}

	public boolean Criar() {
		System.out.println("---------- Criar --------- " );
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		kpis.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		kpispublicos.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		
		System.out.println("Ultimo registro: " + id);
		
		novoKip.click();
		sleep(4000);

		
		nome.click();
		sleep(3000);
		
		nome.sendKeys("TESTEAUTOMATIZADO MASSIEL");
		sleep(4000);
		
		clasificacion.click();
		sleep(6000);
		
		clasificacionOPC.click();
		sleep(2000);
		
		clasificacionAcceso.click();
		sleep(2000);
		
		
		
		if (tq1 == true) {

			clasificacionAccesoOPC.click();
			sleep(2000);
			
		}else if (tp1==true ) {
			clasificacionOPC.click();
			sleep(2000);
			
		}else {
			clasificacionOPC.click();
			sleep(2000);
		}
		
		Gravar.click();
		sleep(2000);
		
		waitExpectElement(biblioteca);
		sleep(8000);
		
		biblioteca.click();
		sleep(2000);
		
		sim.click();
		sleep(2000);

		waitExpectElement(kpispublicos);
		sleep(12000);
		
		kpis.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		kpispublicos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		novoKip.click();
		sleep(4000);

		
		nome.click();
		sleep(3000);
		
		nome.sendKeys("TESTEAUTOMATIZADO MASSIEL 2");
		sleep(4000);
		
		clasificacion.click();
		sleep(6000);
		
		clasificacionOPC.click();
		sleep(2000);
		
		clasificacionAcceso.click();
		sleep(2000);
		
		
		
		if (tq1 == true) {

			clasificacionAccesoOPC.click();
			sleep(2000);
			
		}else if (tp1==true ) {
			clasificacionOPC.click();
			sleep(2000);
			
		}else {
			clasificacionOPC.click();
			sleep(2000);
		}
		
		Gravar.click();
		sleep(2000);
		
		waitExpectElement(biblioteca);
		sleep(4000);
		
		biblioteca.click();
		sleep(2000);
		
		sim.click();
		sleep(2000);

		waitExpectElement(kpispublicos);
		sleep(2000);
		
		kpis.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		kpispublicos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		
		rows = rows-1;
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		
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
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		
		idInserir("KpisLixeiraEmMassa1",idRegistro1);
		
		check1.click();
		sleep(1000);
		
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		
		idInserir("KpisLixeiraEmMassa2",idRegistro2);
		
		check2.click();
		
		sleep(1000);
		
		excluirMassa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(5000);
		waitExpectElement(kpis);
		sleep(8000);
		
		kpis.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		kpispublicos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
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
	
	public boolean comparar() {
		
		String idRegistro11 =idObter("KpisLixeiraEmMassa1");
		String idRegistro22 =idObter("KpisLixeiraEmMassa2");
		
		lixeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
			
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
	
		
		boolean sucesso = false;
		
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		double idRegistroD11 = convertToDouble(idRegistro11);
		double idRegistroD22 = convertToDouble(idRegistro22);
		
		if (idRegistroD1 == idRegistroD11 && idRegistroD2 == idRegistroD22) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		
		
		return sucesso;
	}
		
		
}
