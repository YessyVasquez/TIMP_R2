package com.sap.timp.pageObjectModel.TDK.Execucoes.ExecucoesPublicas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ExecucoesExecucoesPublicasFiltrosAvaPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement kpis;
	
	@FindBy(xpath = "//span[text()=\"KPI's Públicos\"]")
	public WebElement kpispublicos;
	
	@FindBy(xpath = "//span[text()=\"Execuções\"]")
	public WebElement execucoes;
	
	@FindBy(xpath = "//span[text()=\"Execuções Públicas\"]")
	public WebElement execucoespublicas;
	
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
	
	@FindBy(xpath = "//div[@id=\"creationUser\"]/div/div/div[2]")
	public WebElement usuarioCreador;
	
	@FindBy(xpath = "//div[@id=\"modificationUser\"]/div/div/div[2]")
	public WebElement usuarioModificador;
	
	@FindBy(xpath = "//li[text()=\"TESTEAUTOMATIZADO TESTEAUTOMATIZADO\"]")
	public WebElement opcUsuariosTC2;
	
	@FindBy(xpath = "//li[text()=\"TESTE AUTOMATIZADO\"]")
	public WebElement opcUsuariosTQ1;
	
	@FindBy(xpath = "//li[text()=\"FVERO FVERO\"]")
	public WebElement opcUsuariosTP1;
	

	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//*[@id=\"advanced-filters-btn\"]/span[2]")
	public WebElement filtrar;
	
	@FindBy(xpath = "//*[@id=\"reset-filters-btn\"]/span[2]")
	public WebElement limparFiltros;
	
	@FindBy(xpath = "//div[@id=\"idModel\"]/div/div/div[@class=\"icon icon-font-Sign-and-Symbols icon-downmenu\"]")
	public WebElement filModelo;
	
	@FindBy(xpath = "//li[text()=\"Kpi's\"]")
	public WebElement filModeloOpc;
	
	@FindBy(xpath = "//div[@id=\"creationUser\"]/div/div/div[@class=\"icon icon-font-Sign-and-Symbols icon-downmenu\"]")
	public WebElement filUsuario;
	
	public ExecucoesExecucoesPublicasFiltrosAvaPO() {
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
		waitExpectElement(execucoes);
		sleep(2000);
		execucoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		execucoespublicas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		filtrar.click();
		sleep(7000);
		filModelo.click();
		sleep(2000);
		filModeloOpc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		System.out.println("111");
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		

		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		System.out.println("111");
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		detalhes.click();
		sleep(2000);
		System.out.println("111");
		
		String modelodetalhes1 =modelo1.getText();
	
		
		System.out.println(modelodetalhes1);
		
		fechar.click();
		sleep(2000);
		limparFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1==true) {
			
			usuarioCreador.click();
			sleep(2000);
			actionsMoveToElementElement(opcUsuariosTQ1);
			sleep(2000);
			opcUsuariosTQ1.click();
			sleep(6000);
			
			usuarioModificador.click();
			sleep(2000);
			actionsMoveToElementElement(opcUsuariosTQ1);
			sleep(2000);
			opcUsuariosTQ1.click();
			sleep(6000);
			
		}else if (tc2== true) {
			usuarioCreador.click();
			sleep(2000);
			actionsMoveToElementElement(opcUsuariosTC2);
			sleep(2000);
			opcUsuariosTC2.click();
			sleep(6000);
			
			usuarioModificador.click();
			sleep(2000);
			actionsMoveToElementElement(opcUsuariosTC2);
			sleep(2000);
			opcUsuariosTC2.click();
			sleep(6000);
		}else {
			usuarioCreador.click();
			sleep(2000);
			actionsMoveToElementElement(opcUsuariosTP1);
			sleep(2000);
			opcUsuariosTP1.click();
			sleep(6000);
			
			usuarioModificador.click();
			sleep(2000);
			actionsMoveToElementElement(opcUsuariosTP1);
			sleep(2000);
			opcUsuariosTP1.click();
		}
		
		
		
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows1 = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

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
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows1 = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String datos = "";
		j=1;
		for (int i = 0; i < rows; i++) {
			datos = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")][1]/div[5]")).getText();
			sucesso.add(data.get(0).equals(datos));
		}
		
		return sucesso;
		
	
	}

}
