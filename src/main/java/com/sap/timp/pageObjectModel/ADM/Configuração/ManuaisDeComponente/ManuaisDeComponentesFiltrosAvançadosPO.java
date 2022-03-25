package com.sap.timp.pageObjectModel.ADM.Configuração.ManuaisDeComponente;

import java.awt.Component;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ManuaisDeComponentesFiltrosAvançadosPO extends TestBaseSteven {

	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;
	
	@FindBy(xpath = "//span[text()=\"Manuais de Componente\"]")
	public WebElement ManuaisDeComponente;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@id=\"detail-history\"]/div[2]/div[1]/span")
	public WebElement datacriado1;
	
	@FindBy(xpath = "//div[@id=\"detail-history\"]/div[2]/div[2]/span")
	public WebElement dataeditar1;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div[2]/div")
	public WebElement modelo1;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div[2]/div")
	public WebElement classificacao1;
	
	
	@FindBy(xpath = "//div[@id=\"detail-history\"]/div[2]/div[1]/span")
	public WebElement datacriado2;
	
	@FindBy(xpath = "//div[@id=\"detail-history\"]/div[2]/div[2]/span")
	public WebElement dataeditar2;
	
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div[2]/div")
	public WebElement modelo2;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div[2]/div")
	public WebElement classificacao2;
	
	@FindBy(xpath = "//div[@class=\"icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement fechar;
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement Aceitar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por Componente\"]")
	public WebElement componente;
	
	@FindBy(xpath = "//li[text()=\"BRB\"]")
	public WebElement componenteOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por Idioma\"]")
	public WebElement idioma;
	
	@FindBy(xpath = "//li[text()=\"Português\"]")
	public WebElement idiomaOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por Usuário de Criação\"]")
	public WebElement usuarioCreador;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por Usuário de Modificação\"]")
	public WebElement usuarioModificador;
	
	@FindBy(xpath = "//li[text()=\"TESTEAUTOMATIZADO TESTEAUTOMATIZADO\"]")
	public WebElement opcUsuarios;
	

	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//*[@id=\"advanced-filters-btn\"]/span[2]")
	public WebElement filtrar;
	
	@FindBy(xpath = "//*[@id=\"reset-filters-btn\"]/span[2]")
	public WebElement limparFiltros;
	
	
	@FindBy(xpath = "//div[@id=\"creationUser\"]/div/div/div[@class=\"icon icon-font-Sign-and-Symbols icon-downmenu\"]")
	public WebElement filUsuario;
	
	public ManuaisDeComponentesFiltrosAvançadosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		
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

		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ManuaisDeComponente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtrar.click();
		sleep(7000);
		
		//componente
		
		componente.click();
		sleep(2000);
		componenteOpc.click();
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows1 = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		for (int i = 0; i < rows1; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]//div[4]")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String datos = "";
		
		j=1;
		for (int i = 0; i < rows; i++) {
			datos = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")][1]/div[4]")).getText();
			sucesso.add(data.get(0).equals(datos));
		}
		
		System.out.println(datos);
		System.out.println(sucesso);
		//IDIOMA
		limparFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		idioma.click();
		sleep(2000);
		idiomaOpc.click();
		sleep(2000);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		j=1;
		rows1 = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		for (int i = 0; i < rows1; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]//div[5]")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}

		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		j=1;
		for (int i = 0; i < rows; i++) {
			datos = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")][1]/div[5]")).getText();
			sucesso.add(data.get(0).equals(datos));
		}
		System.out.println(datos);
		System.out.println(sucesso);
		//usuario creador
		limparFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		usuarioCreador.click();
		sleep(2000);
		opcUsuarios.click();
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		j=1;
		rows1 = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		for (int i = 0; i < rows1; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]//div[8]")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}

		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		j=1;
		for (int i = 0; i < rows; i++) {
			datos = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")][1]/div[8]")).getText();
			sucesso.add(data.get(0).equals(datos));
		}
		System.out.println(datos);
		System.out.println(sucesso);
		//usuario modificador
		limparFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		usuarioModificador.click();
		sleep(2000);
		opcUsuarios.click();
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		j=1;
		rows1 = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		for (int i = 0; i < rows1; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]//div[10]")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}

		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		j=1;
		for (int i = 0; i < rows; i++) {
			datos = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")][1]/div[10]")).getText();
			sucesso.add(data.get(0).equals(datos));
		}
		
		System.out.println(datos);
		System.out.println(sucesso);
		
		
		return sucesso;
		
	
	}
	
	
}
