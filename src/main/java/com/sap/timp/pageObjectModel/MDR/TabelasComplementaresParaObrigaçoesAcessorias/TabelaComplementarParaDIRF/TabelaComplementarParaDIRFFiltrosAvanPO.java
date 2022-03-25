package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class TabelaComplementarParaDIRFFiltrosAvanPO extends TestBaseKenssy {
	String URL = driver.getCurrentUrl();
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement tabelacomplementares;
	
	@FindBy(xpath = "//span[text()=\"Tabela Complementar para DIRF\"]")
	public WebElement tabeladecomplementarparadirf;
	
	
	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;
	
	@FindBy(xpath = "//button/span[text()=\"Aplicar filtros\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	//DATOS PARA FILTRAR
	
	@FindBy(xpath = "//div[@id=\"idCompany\"]/div/div/div[2]")
	public WebElement empresa;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement opcEmpresa;
	
	@FindBy(xpath = "//div[@id=\"idState\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"idBranch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"creationUser\"]/div/div/div[2]")
	public WebElement usuarioCriacao;
	
	@FindBy(xpath = "//*[@id=\"creationDate\"]/div/div[1]/input")
	public WebElement dataCriacao;
	
	@FindBy(xpath = "//div[@id=\"modificationUser\"]/div/div/div[2]")
	public WebElement usuarioModificao;
	
	@FindBy(xpath = "//*[@id=\"modificationDate\"]/div/div[1]/input")
	public WebElement dataModificao;
	
	@FindBy(xpath="//body")
	public WebElement clickFuera;
		
	public TabelaComplementarParaDIRFFiltrosAvanPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtroEmpresa() {
		sleep(2000);
		tabelacomplementares.click();
		sleep(2000);
		
		tabeladecomplementarparadirf.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		String empresaText = opcEmpresa.getText();
		opcEmpresa.click();
		System.out.println("EMPRESA A BUSCAR:"+empresaText);
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[4]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " empresa Filtro");
			sucesso.add(textFiltroEmpresa.contains(empresaText));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> filtroUF() {
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		uf.click();
		sleep(1000);
		String empresaText = opcEmpresa.getText();
		opcEmpresa.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[5]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " uf Filtro");
			sucesso.add(empresaText.equals(textFiltroEmpresa));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> filtroFilial() {
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filial.click();
		sleep(1000);
		String empresaText = opcEmpresa.getText();
		opcEmpresa.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[6]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " Filial Filtro");
			//textFiltroEmpresa = textFiltroEmpresa.replace("1000-", "");
			sucesso.add(textFiltroEmpresa.contains(empresaText));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	
	public ArrayList<Boolean> filtroUsuarioCriacao() {
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		usuarioCriacao.click();
		sleep(1000);
		String empresaText = opcEmpresa.getText();
		opcEmpresa.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[11]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " Filial Filtro");
			textFiltroEmpresa = textFiltroEmpresa.replace("1000-", "");
			sucesso.add(empresaText.equals(textFiltroEmpresa));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	
	public ArrayList<Boolean> filtroDataCriacao() {
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String dataText1 = "";
		if(URL.contains("tq1")) {
			dataCriacao.sendKeys("02/10/2020");
			sleep(1000);
			dataText1 = dataCriacao.getAttribute("value");
			System.out.println("fecha criacao a buscar" + dataText1);
			System.out.println("");
			dataCriacao.sendKeys(Keys.ENTER);
			sleep(2000);
			//opcEmpresa.click();
			clickFuera.click();
			sleep(2000);
			
		}else if (URL.contains("tc2")) {
			dataCriacao.sendKeys("18/11/2020");
			//sleep(1000);
			dataText1 = dataCriacao.getAttribute("value");
			System.out.println("fecha criacao a buscar" + dataText1);
			System.out.println("");
			dataCriacao.sendKeys(Keys.ENTER);
			sleep(2000);
			//opcEmpresa.click();
			clickFuera.click();
			sleep(2000);
			
		}else {
			//aplica SOLO PARA TP1
			dataCriacao.sendKeys("12/03/2018");
			sleep(1000);
			dataText1 = dataCriacao.getAttribute("value");
			System.out.println("fecha criacao a buscar" + dataText1);
			System.out.println("");
			dataCriacao.sendKeys(Keys.ENTER);
			sleep(2000);
			//opcEmpresa.click();
			clickFuera.click();
			sleep(2000);
		}
		
//		dataCriacao.sendKeys("18/09/2020");
//		sleep(1000);
//		String dataText = dataCriacao.getAttribute("value");
//		System.out.println("fecha criacao a buscar" + dataText1);
//		System.out.println("");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String filtroDataCriacao = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[12]/div")).getText();
			System.out.println(filtroDataCriacao + " DataCriacao Filtro");
			sucesso.add(dataText1.equals(filtroDataCriacao));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	
	public ArrayList<Boolean> filtroUsuarioModificao() {
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		usuarioModificao.click();
		sleep(1000);
		String empresaText = opcEmpresa.getText();
		opcEmpresa.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[13]/div"))
					.getText();
			System.out.println(textFiltroEmpresa+"-usuarioModificao Filtro");
			sucesso.add(empresaText.equals(textFiltroEmpresa));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> filtroDataModificao() {
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String dataText1 = "";
		if(URL.contains("tq1")) {
			dataModificao.sendKeys("02/10/2020");
			sleep(1000);
			dataText1 = dataModificao.getAttribute("value");
			System.out.println("fecha criacao a buscar" + dataText1);
			System.out.println("");
			dataModificao.sendKeys(Keys.ENTER);
			sleep(2000);
			//opcEmpresa.click();
			clickFuera.click();
			sleep(2000);
			
		}else if (URL.contains("tc2")) {
			dataModificao.sendKeys("18/09/2020");
			sleep(1000);
			dataText1 = dataModificao.getAttribute("value");
			System.out.println("fecha criacao a buscar" + dataText1);
			System.out.println("");
			dataModificao.sendKeys(Keys.ENTER);
			sleep(2000);
			//opcEmpresa.click();
			clickFuera.click();
			sleep(2000);
			
		}else {
			//aplica SOLO PARA TP1
			dataModificao.sendKeys("12/03/2018");
			sleep(1000);
			dataText1 = dataModificao.getAttribute("value");
			System.out.println("fecha criacao a buscar" + dataText1);
			System.out.println("");
			dataModificao.sendKeys(Keys.ENTER);
			sleep(2000);
			//opcEmpresa.click();
			clickFuera.click();
			sleep(2000);
			
		}
		
//		dataModificao.sendKeys("18/09/2020");
//		sleep(1000);
//		String dataText = dataModificao.getAttribute("value");
//		System.out.println("fecha modificao a buscar" + dataText);
//		System.out.println("");
		
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

		String filtroDataModificao = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[14]/div")).getText();
		System.out.println(filtroDataModificao + " Data Modificao Filtro");
		sucesso.add(dataText1.equals(filtroDataModificao));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	
}
