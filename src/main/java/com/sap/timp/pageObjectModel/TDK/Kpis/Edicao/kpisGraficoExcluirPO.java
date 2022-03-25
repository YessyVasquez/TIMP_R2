package com.sap.timp.pageObjectModel.TDK.Kpis.Edicao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class kpisGraficoExcluirPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement kpis;
	
	@FindBy(xpath = "//span[text()=\"KPI's Públicos\"]")
	public WebElement kpispublicos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	
	@FindBy(xpath = "//div[@id=\"tdk-Wrapper\"]/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[1]/div/div//*[1]/*[8]/*[1]/*/*/*[2]/*/*[5]")
	public WebElement quartacolunagrafico;

	@FindBy(xpath = "//div[@class=\"edit-icon\"]/span")
	public WebElement icone;

	@FindBy(xpath = "//div[@class=\"edit-options\"]/ul/li[2]/span[@class=\"symbol icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement iconeexcluir;
	
	
	@FindBy(xpath = "//div[@id=\"title\"]/div[2]/div/div/input")
	public WebElement titulo;

	@FindBy(xpath = "//div[@id=\"separator\"]/div/div/div/div/div/div/*[1]/*[6]/*[2]")
	public WebElement titulografico;
	
	@FindBy(xpath = "//div[contains(@id,\"UIComp_\")]/*[1]/*[6]/*[2]")
	public WebElement titulograficotc2;

	@FindBy(xpath = "//div[@id=\"dimensionField\"]/div/div[2]")
	public WebElement dimensao;

	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;


	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[text()=\"Cartão Indicador\"]")
	public WebElement cartaoindicador;
	
	
	@FindBy(xpath = "//div[@id=\"tdk-Wrapper\"]/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div/div[2]/div/div/div[1]/div/div//*[1]/*[8]/*[1]/*/*/*[2]/*/*[5]")
	public WebElement quartocolunagraficotc2;
	
	public kpisGraficoExcluirPO () {
		PageFactory.initElements(driver, this);
	}

	public boolean GraficoExcluir() {
		
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
		waitExpectElement(kpis);
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
		
	
		String idRegistro =idObter("KpisCriar");

		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		waitExpectElement(gravar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if(tc2==true)
		{
			quartocolunagraficotc2.click();
			sleep(2000);
		}
		else {
			quartacolunagrafico.click();
			sleep(2000);
		}
		
		
		icone.click();
		sleep(2000);
		iconeexcluir.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
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
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);

		menu1.click();
		sleep(1000);
		editar1.click();
		sleep(2000);
		waitExpectElement(gravar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = false;
		int graficoexcluido = driver.findElements(By.xpath("//div[@id=\"tdk-Wrapper\"]/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div/div[1]/div[1]/div/div[2]/div/div/div/div[1]/div/div/*[1]/*[8]/*[1]/*[3]")).size();
		
		if (graficoexcluido == 0) {
			System.out.println("Grafico foi excluido");
			sucesso=true;
			
		}else {
			System.out.println("Grafico não foi excluido");
		}
		
		System.out.println(sucesso);
		return sucesso;
	
	}
		
	

}
