package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoPainelCreditoICMS;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ConfiguracaoEExecucaoPainelCreditoICMSFiltrosAvansadosPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário ICMS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"]/div/span[text()=\"Configuração e Execução\"]")
	public WebElement configuracaoEExecucao;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-creditPanelIcmsConfiguration\"]")
	public WebElement painelCréditoICMS;

	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;

	@FindBy(xpath = "//div[@id=\"company-filter\"]/div/div/div[2]")
	public WebElement empresa;

	@FindBy(xpath = "//div[@id=\"company-filter\"]/div/div/div/input")
	public WebElement empresaOPC;

	@FindBy(xpath = "//div[@id=\"uf-filter\"]/div/div/div[2]")
	public WebElement uf;

	@FindBy(xpath = "//div[@id=\"uf-filter\"]/div/div/div/input")
	public WebElement ufOPC;

	@FindBy(xpath = "//div[@id=\"branch-filter\"]/div/div/div[2]")
	public WebElement filial;

	@FindBy(xpath = "//div[@id=\"branch-filter\"]/div/div/div/input")
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

	public ConfiguracaoEExecucaoPainelCreditoICMSFiltrosAvansadosPO() {

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
		
		gestaoCredito.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		configuracaoEExecucao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);

		painelCréditoICMS.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);

		String idRegistro = idObter("id-GCT-ICMS-PainelCreditoICMSConfiguracaoEExecucaco");
		System.out.println("Id a Pesquisar: "+idRegistro);

		pesquisarID.sendKeys(idRegistro);
		sleep(1000);

		this.textEmpresa = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[3]/div"))
				.getText();

		System.out.println(this.textEmpresa);


		this.textFilial = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[4]/div"))
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

		sleep(8000);
//		attributeToBeXpath("//div[@id=\"uf-filter\"]/div", "class", "base-select  disabled");
//		sleep(1000);
		
		uf.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		if (tq1 == true) {

			WebElement opcUf = driver
					.findElement(By.xpath("//li[text()=\"SP\"]"));

			opcUf.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);
		

		}else if (tc2==true ) {
			
			WebElement opcUf = driver
					.findElement(By.xpath("//li[text()=\"RJ\"]"));

			opcUf.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);

		
		}else {
			WebElement opcUf = driver
					.findElement(By.xpath("//li[text()=\"SP\"]"));

			opcUf.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			
		}
		
		
		sleep(7000);

		filial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		WebElement opcfilial = driver
				.findElement(By.xpath("//li[text()=\""+ this.textFilial + "\"]"));

		opcfilial.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

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
			sucesso.add(textopcEmpresa.equals(this.textEmpresa));

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
							+ rows + "]/div[4]/div"))
					.getText();
			System.out.println(textFiltroFilial + " Filial Filtro");
			sucesso.add(textopcFilial.equals(this.textFilial));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}


}
	
