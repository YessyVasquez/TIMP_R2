package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoRegistro1200;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ConfiguracaoEExecucaoRegistro1200FiltrosAvansadosPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário ICMS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"]/div/span[text()=\"Configuração e Execução\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-register1200Configuration\"]")
	public WebElement registro1200;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;
	
	@FindBy(xpath = "//div[@class=\"company-filter\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"company-filter\"]/div/div/div/input")
	public WebElement empresaOPC;
	
	@FindBy(xpath = "//div[@class=\"uf-filter\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@class=\"uf-filter\"]/div/div/div/input")
	public WebElement ufOPC;
	
	@FindBy(xpath = "//div[@class=\"branch-filter\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"branch-filter\"]/div/div/div/input")
	public WebElement filialOPC;
	
	@FindBy(xpath = "//span[text()=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@id=\"search-container\"]/div/div/input")
	public WebElement pesquisarID;
	
	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement limpiar;
	
	String textEmpresa = "";
	String textUf = "";
	String textFilial = "";
	
	public ConfiguracaoEExecucaoRegistro1200FiltrosAvansadosPO() {

		PageFactory.initElements(driver, this);
	}

	public void filtros() {
		gestaoCredito.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		registro1200.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("id-GCT-ICMS-ConfiguracaoEExecucacoRegistro1200");
		System.out.println(idRegistro);
		
		pesquisarID.sendKeys(idRegistro);
		sleep(1000);
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]"));
		
		this.textEmpresa = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[3]/div"))
				.getText();
		
		System.out.println(this.textEmpresa);
		
		
		this.textUf = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[4]/div"))
				.getText();
		
		System.out.println(this.textUf);
		
		this.textFilial = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[5]/div"))
				.getText();
		
		System.out.println(this.textFilial);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		limpiar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		WebElement opcEmpresa = driver
				.findElement(By.xpath("//li[text()=\""+ this.textEmpresa + "\"]"));
		
		opcEmpresa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(13000);
		
		uf.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement opcUf = driver
				.findElement(By.xpath("//li[text()=\""+ this.textUf + "\"]"));
		
		opcUf.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(14000);
		
		filial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		WebElement opcfilial = driver
				.findElement(By.xpath("//li[text()=\""+ this.textFilial + "\"]"));
		
		opcfilial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		pesquisar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	}
	
	public ArrayList<Boolean> Empresa() {
		
		
		
		
		
		String textopcEmpresa = empresaOPC.getAttribute("value");
		System.out.println(textopcEmpresa);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[3]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " empresa Filtro");
			sucesso.add(textopcEmpresa.equals(textFiltroEmpresa));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> Uf() {
		
		String textopcUf = ufOPC.getAttribute("value");
		System.out.println(textopcUf);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroUf = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[4]/div"))
					.getText();
			System.out.println(textFiltroUf + " uf Filtro");
			sucesso.add(textopcUf.equals(textFiltroUf));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	public ArrayList<Boolean> Filial() {
		
		
	
		
		
		String textopcFilial = filialOPC.getAttribute("value");
		System.out.println(textopcFilial);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroFilial = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[5]/div"))
					.getText();
			System.out.println(textFiltroFilial + " Filial Filtro");
			sucesso.add(textopcFilial.equals(textFiltroFilial));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
}
