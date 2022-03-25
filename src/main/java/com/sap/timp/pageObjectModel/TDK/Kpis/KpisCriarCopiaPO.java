package com.sap.timp.pageObjectModel.TDK.Kpis;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class KpisCriarCopiaPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement kpis;
	
	@FindBy(xpath = "//span[text()=\"KPI's Públicos\"]")
	public WebElement kpispublicos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@id=\"accessClassification\"]/div/div[2]")
	public WebElement clasificacionAcceso;
	
	@FindBy(xpath = "//li[@id=\"1\"]")
	public WebElement clasificacionAccesoOPC;
	
	@FindBy(xpath = "//div[@id=\"name\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement clasificacionOPC;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view -view-wrapper  selected\"]/div/div[3]/ul/li[3]")
	public WebElement lixeira;
	
	@FindBy(xpath = "//li[@id=\"1\"]")
	public WebElement clasificacionOPCTQ2;
	
	@FindBy(xpath = "//div[@id=\"classification\"]/div/div/div[2]")
	public WebElement clasificacion;
	
	public KpisCriarCopiaPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> Criar() {
		
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
		
		String idRegistro = idObter("KpisCriar");
		//String idRegistro = idObter2();
		
		System.out.println("Ultimo registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement copiar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Copiar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(4000);

		menu.click();
		sleep(1000);
		copiar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		waitExpectElement(nome);
		sleep(3000);
		
		String valor = nome.getAttribute("value");
		System.out.println("nombre de copia: " + valor);
		
		clasificacion.click();
		sleep(2000);
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
			
		}else if (tq2==true ) {
			clasificacionOPCTQ2.click();
			sleep(2000);
			
		}else {
			clasificacionOPC.click();
			sleep(2000);
		}
		
		Gravar.click();
		sleep(2000);
		
		//waitExpectElement(biblioteca);
		sleep(18000);
		
		biblioteca.click();
		sleep(2000);
		
		sim.click();
		sleep(12000);

		//waitExpectElement(kpispublicos);
		sleep(2000);
		
		kpis.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		kpispublicos.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		idInserir("kpisCriarCopia",id);
		
		String nome1 = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[6]/div"))
				.getText();
		
		System.out.println(nome1);
		System.out.println("nuevo Copia: "+id);
	
		sucesso.add(nome1.contains(valor));
		
		int id1I = convertToInt(idRegistro);
		int id2I = convertToInt(id);
		
		if (id2I > id1I) {
			sucesso.add(true);
		} else {
			sucesso.add(false);
		}
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	
	public boolean Excluir() {
		
		System.out.println("Excluir valor copia ");
		String idRegistro =idObter("kpisCriarCopia");
		System.out.println(idRegistro);
	    
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		excluir.click();
		sleep(2000);
	  	sleep(2000);
	  	
	  	sim.click(); 
	    sleep(5000);
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(2000);
		waitExpectElement(kpis);
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
		String idUltimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		
		int id1 = convertToInt(idUltimo);
		int id2 = convertToInt(idRegistro);
		System.out.println(id1);
		System.out.println(id2);
		
		System.out.println(idUltimo); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
		
		boolean sucesso = false;
		
		if (id1 != id2) {
			sucesso= true;
		}
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	public ArrayList<Boolean> comparar() {
		System.out.println("compara  valor copiado ");
		String idRegistro11 =idObter("kpisCriarCopia");
		
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
			
			
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		double idRegistroD1 = convertToDouble(idRegistro1);


		double idRegistroD11 = convertToDouble(idRegistro11);
		
		if (idRegistroD1 == idRegistroD11 ) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro11+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro11+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		excluir.click();
		sleep(2000);
	  	sleep(2000);
	  	
	  	sim.click(); 
	    sleep(5000);
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		System.out.println(sucesso);
		
		driver.navigate().refresh();
		sleep(2000);
		waitExpectElement(kpis);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		kpis.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		lixeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro = "0";
		if(rows > 0) {
			idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[5]/div")).getText();
		} 
		
		int id1 = convertToInt(idRegistro);
		int id2 = convertToInt(idRegistro11);
		System.out.println(id1);
		System.out.println(id2);
		
		//System.out.println(idRegistro); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
		
		
		if (id1 != id2) {
			sucesso.add(true);
		}
		System.out.println(sucesso);
		return sucesso;
	}

}
