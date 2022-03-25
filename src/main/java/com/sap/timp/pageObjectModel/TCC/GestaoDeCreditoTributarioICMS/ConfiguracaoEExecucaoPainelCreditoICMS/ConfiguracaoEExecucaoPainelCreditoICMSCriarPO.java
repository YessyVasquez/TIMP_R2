package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoPainelCreditoICMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ConfiguracaoEExecucaoPainelCreditoICMSCriarPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário ICMS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"]/div/span[text()=\"Configuração e Execução\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-creditPanelIcmsConfiguration\"]")
	public WebElement painelCréditoICMS;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[text()=\"Novo Painel Crédito ICMS\"]")
	public WebElement nuevo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"1000\"]")
	public WebElement empresaOPC;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"1000_SP_0001\"]")
	public WebElement filialOPC;
	
	@FindBy(xpath = "//div[@id=\"1000_RJ_0001\"]")
	public WebElement filialOPC1;
	
	@FindBy(xpath = "//div[@id=\"layout\"]/div[1]/div[2]")
	public WebElement leiaute;
	
	@FindBy(xpath = "//li[@id=\"1000\"]")
	public WebElement leiauteOPC;
	
	@FindBy(xpath = "//li[@id=\"option-2\"]")
	public WebElement leiauteOPC2;
	
	@FindBy(xpath = "//div[@id=\"component\"]/div/div[1]/div[2]")
	public WebElement componente;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement componenteOPC;
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	
	public ConfiguracaoEExecucaoPainelCreditoICMSCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		System.out.println("---------- Criar --------- " );
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
		sleep(2000);
		painelCréditoICMS.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[2]/div")).getText();
		System.out.println("Id ultimo registro: " +idRegistro);
		
		nuevo.click();
		sleep(2000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(13000);
		
		empresa.click();
		sleep(2000);
		
		empresaOPC.click();
		sleep(2000);
		
		closeSelectTypeCheckbox(empresa);
		sleep(12000);
		

		filial.click();
		sleep(2000);
		
		if (tq1 == true) {

			
			filialOPC.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(filial);
			sleep(2000);
			
			leiaute.click();
			sleep(2000);
			
			leiauteOPC.click();
			sleep(2000);

		}else if (tc2==true ) {
			

			filialOPC1.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(filial);
			sleep(2000);
			
			leiaute.click();
			sleep(4000);
			
			leiauteOPC2.click();
			sleep(2000);
			
		}else {
			
			filialOPC.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(filial);
			sleep(2000);
			
			leiaute.click();
			sleep(2000);
			
			leiauteOPC2.click();
			sleep(2000);
			
		}
		
		
		
		componente.click();
		sleep(2000);
		
		componenteOPC.click();
		sleep(2000);
		
		salvar.click();
		sleep(8000);
		
		waitExpectElement(siguiente);
		sleep(19000);
		siguiente.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);

		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		
		idInserir("id-GCT-ICMS-PainelCreditoICMSConfiguracaoEExecucaco",id2);
		
		int idD = convertToInt(idRegistro);
		int id2D = convertToInt(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
}
