package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.ConfiguraçãoeExecução;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguraçãoeExecuçãoFiltrosAvaPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Painel Crédito\"]")
	public WebElement painelCredito;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div[2]/ul/li[6]/ul/li[5]/ul/li[1]/div/span[2]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"thead\"]/div/div[3]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")
	public WebElement idR;
	
	@FindBy(xpath = "//button/span[text()=\"Novo Código de Tipo de Crédito\"]")
	public WebElement novo;
	
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	@FindBy(xpath = "//li[text()=\"ICMS\" and @id]")
	public WebElement tributoO;
	@FindBy(xpath = "//div[@id=\"creditTypeCode\"]/div/div/input")
	public WebElement codigo;
	@FindBy(xpath = "//div[@id=\"description\"]/div/div/input")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"validityFrom\"]/div/div/input")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[1]/div")
	public WebElement engrenagem;
	
	@FindBy(xpath ="//*[@id=\"list\"]/div/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/ul/li[3]")
	public WebElement editar;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/ul/li[2]")
	public WebElement visualizar;
	
	@FindBy(xpath = "//*[@id=\"advanced-filters\"]/span[2]")
	public WebElement filtrosavancados;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione uma Empresa\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[text()=\"1000\"]")
	public WebElement opcEmpresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione uma UF\"]")
	public WebElement uf;
	
	@FindBy(xpath = "//li[text()=\"BA\"]")
	public WebElement opcUfTC2;
	
	@FindBy(xpath = "//li[text()=\"SP\"]")
	public WebElement opcUfTP1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione uma Filial\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//li[text()=\"0143\"]")
	public WebElement opcFilialTC2;
	
	@FindBy(xpath = "//li[text()=\"0001\"]")
	public WebElement opcFilialTP1;
	
	
	@FindBy(xpath = "//*[@id=\"right-content\"]/div/div[3]/div[4]/button/span[2]")
	public WebElement aplicar;
	
	
	public ConfiguraçãoeExecuçãoFiltrosAvaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtros() {
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}
	
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		actionsMoveToElementElement(gestaoCredito);
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		painelCredito.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtrosavancados.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		
		opcEmpresa.click();
		sleep(9000);
		
		uf.click();
		sleep(6000);
		
		
		if (tc2==true) {
			opcUfTC2.click();
			sleep(9000);

		}else {
			opcUfTP1.click();
			sleep(7000);

		}
		
		
		filial.click();
		sleep(2000);
		
		if (tc2==true) {
			opcFilialTC2.click();
			sleep(9000);

		}else {
			opcFilialTP1.click();
			sleep(7000);
	
		}
		
		
		aplicar.click();
		sleep(1000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		for (int i = 0; i < rows; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[2]/div")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}
		
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String icms = "";
		j=1;
		for (int i = 0; i < rows; i++) {
			icms = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")][1]/div[2]/div")).getText();
			sucesso.add(data.get(0).equals(icms));
		}
		
		return sucesso;
		
		
	}

}
