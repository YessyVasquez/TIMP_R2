package com.sap.timp.pageObjectModel.BCB.ExecucoesSalvas.HierarquiaConfiguracoesExecucoesSalvas;

import java.util.ArrayList;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ExecuçõesSalvasFiltrosPO extends TestBaseKenssy{

	@FindBy(xpath = "//span[text()=\"Execuções\"]")
	public WebElement execucoes;
	
	
	@FindBy(xpath = "//span[text()=\"Execução da Consolidação\"]")
	public WebElement cosolidacaoExecucoes;

	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpiarfiltros;
	@FindBy(xpath = "//div[@id=\"search-input\"]/div/div/input")
	public WebElement pesquisar;
	
	
	@FindBy(xpath = "//div[@id=\"hierarchy-name-filter\"]/div/div[2]")
	public WebElement hierarquiaS;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opcHierarquia;
	
	@FindBy(xpath = "//div[@id=\"company-filter\"]/div/div[1]/div[2]")
	public WebElement empresaS;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement opc;
	
	@FindBy(xpath = "//div[@id=\"uf-filter\"]/div/div[2]")
	public WebElement ufS;
	@FindBy(xpath = "//div[@id=\"branch-filter\"]/div/div[2]")
	public WebElement filialS;
	@FindBy(xpath = "//div[@id=\"tax-filter\"]/div/div[2]")
	public WebElement tributoS;
	@FindBy(xpath = "//div[@id=\"creation-user\"]/div/div/div[2]")
	public WebElement usuarioCriacaoS;
	@FindBy(xpath = "//div[@id=\"creation-filter\"]/div/div/input")
	public WebElement dataCriacaoS;
	
//	String Empresa = "";
//	String UF = "";
//	String Filial = "";
//	
	public ExecuçõesSalvasFiltrosPO() {
		PageFactory.initElements(driver, this);
	}

	public void Filtros() {
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
		
		execucoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		cosolidacaoExecucoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idBuscar = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]/div")).getText();
		
		pesquisar.sendKeys(idBuscar);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String hierarquia = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[5]/div")).getText();
		String empresa = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[7]/div")).getText();
		String uf = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[8]/div")).getText();
		String filial = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[9]/div")).getText();
		String tributo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[10]/div")).getText();
		String subperiodo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[11]/div")).getText();
		String usuarioCriacao = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[12]/div")).getText();
		String dataCriacao = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[13]/div")).getText();
		//div[contains(@class,"tbody")]/div[contains(@class,"tr") and @data-id][1]/div[4]/div
		
		System.out.println("******Datos a Comparar*****");
		System.out.println(hierarquia);
		System.out.println(empresa);
		System.out.println(uf);
		System.out.println(filial);
		System.out.println(tributo);
		System.out.println(subperiodo);
		System.out.println(usuarioCriacao);
		System.out.println(dataCriacao);
		
		limpiarfiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		hierarquiaS.click();
//		sleep(2000);
//		
//		WebElement hierarquiaOPC = driver.findElement(By.xpath("//li[contains(@class,\"list-item\") and text()="+hierarquia+"]"));
//		hierarquiaOPC.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
	}
	
	public ArrayList<Boolean> filtroHierarquia() {
		
		hierarquiaS.click();
		sleep(2000);
		//waitExpectElement(opcHierarquia);
		String text = opcHierarquia.getText();
		System.out.println(text);
		opcHierarquia.click();
		//dobleClickElement(opcHierarquia);
		//opcHierarquia.;
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroData = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[6]/div"))
					.getText();
			System.out.println(textFiltroData + " data Filtro");
			sucesso.add(textFiltroData.contains(text));

			f = f + 1;
		}
		System.out.println(sucesso);
		
		limpiarfiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);
		
		return sucesso;
	}
	
	public ArrayList<Boolean> filtroEmpresa() {
		
		limpiarfiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);

		empresaS.click();
		sleep(2000);
		//waitExpectElement(opcHierarquia);
		String text = opc.getText();
		System.out.println(text);
		opc.click();
		//dobleClickElement(opcHierarquia);
		//opcHierarquia.;
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(16000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroData = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[8]/div"))
					.getText();
			System.out.println(textFiltroData + " data Filtro");
			sucesso.add(textFiltroData.contains(text));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
}
