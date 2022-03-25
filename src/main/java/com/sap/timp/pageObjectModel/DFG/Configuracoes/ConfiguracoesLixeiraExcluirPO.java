package com.sap.timp.pageObjectModel.DFG.Configuracoes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ConfiguracoesLixeiraExcluirPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[2]/span/span")
	public WebElement aba;
	
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[2]/div/div[2]/div/div[1]/div/div/div[1]/div/div[3]/span")
	public WebElement raizAba;
	
	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement filtrosAbansados;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement idFiltro;
	
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[2]/div/div[2]/div/ul/li[4]/div/span[2]")
	public WebElement lixeria;
	
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[1]/span/span")
	public WebElement visualizarLeiautes;
	
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div/div[1]/div/div/div[1]/div[3]/div[3]")
	public WebElement raiz1;
	
	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement limpiar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement no;
	
	public ConfiguracoesLixeiraExcluirPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean LixeriaExcluir() {
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		boolean tq1 = false;
		boolean tp1 = false;
		boolean tc2 = false;
		boolean tq2 = false;


		if (url.contains("tq1")) {
			tq1 = true;
		}else if (url.contains("tc2")) {
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}else {
			tq2 = true;
		}
		
		aba.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		raizAba.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		/*filtrosAbansados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);*/

		idFiltro.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro =  idObter2();
		
	
		
		System.out.println(" Id Registro Busqueda :" + idRegistro  );
		
		idFiltro.sendKeys(idRegistro);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		idFiltro.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement lixeira1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
	
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		lixeira1.click();
		sleep(3000);
		sleep(9000);
		
		no.click();
		sleep(9000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
	//	String idUltimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		
	//	int id1 = convertToInt(idUltimo);
		int id2 = convertToInt(idRegistro);
	//	System.out.println(id1);
		System.out.println(id2);
		
		System.out.println(rows + "datos"); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
		
		boolean sucesso = false;
		
		if (rows == 0) {
			sucesso= true;
		}
		System.out.println(sucesso);
		
		lixeria.click();
		sleep(5000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		limpiar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		System.out.println(" Id Registro Busqueda :" + idRegistro  );
		
		idFiltro.sendKeys(idRegistro);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		idFiltro.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
	
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		excluir.click();
		sleep(3000);
		sleep(12000);
		
	/*	no.click();
		sleep(3000);*/
		
		limpiar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		idFiltro.sendKeys(idRegistro);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		idFiltro.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		System.out.println(" numero de filas :" +  rows1  );
		 int valor = 0;
		
		boolean sucesso2 = rows1 == valor;
		System.out.println(sucesso2 + " las filas son igual a cero");
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		visualizarLeiautes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		

		if (tq1 == true || tq2 == true){
			WebElement raiz1 = driver.findElement(By.xpath("//div[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div/div[1]/div/div[1]"));
														  
			raiz1.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		}else if (tc2 == true) {

			WebElement raiz1 = driver.findElement(By.xpath("//div[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div/div[1]/div/div[1]"));



			raiz1.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(9000);			
		}else {
			WebElement raiz1 = driver.findElement(By.xpath("//div[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div/div[1]/div/div[1]/div[1]/div[2]/div[3]"));
			
			raiz1.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		
		
		String idRegistro2 =  idObter1();
		
		System.out.println(" Id Registro Busqueda de Leiautes :" + idRegistro2  );
		
	/*	filtrosAbansados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);*/
		
		limpiar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		System.out.println(" Id Registro Busqueda :" + idRegistro2  );
		
		idFiltro.sendKeys(idRegistro2);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		idFiltro.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro2+"\"]/div[1]/div"));
		WebElement lixeira2= driver.findElement(By.xpath("//div[@data-id=\""+idRegistro2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
	
		actionsMoveToElementElement(menu2);
		sleep(2000);
		menu2.click();
		sleep(1000);
		
		lixeira2.click();
		sleep(3000);
		//sleep(9000);
		
		no.click();
		sleep(3000);
		
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idUltimo1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[5]/div")).getText();
		
		int id1U = convertToInt(idUltimo1);
		int id2U = convertToInt(idRegistro2);
		System.out.println(id1U);
		System.out.println(id2U);
		
		System.out.println(idUltimo1); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
		
		boolean sucesso1 = false;
		
		if (id1U != id2U) {
			sucesso1= true;
		}
		System.out.println(sucesso1);
		return sucesso;
	}

}
