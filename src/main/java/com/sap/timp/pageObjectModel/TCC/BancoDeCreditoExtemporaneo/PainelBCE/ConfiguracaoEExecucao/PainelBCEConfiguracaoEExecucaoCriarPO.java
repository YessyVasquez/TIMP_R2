package com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.PainelBCE.ConfiguracaoEExecucao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseKenssy;

public class PainelBCEConfiguracaoEExecucaoCriarPO extends TestBaseKenssy{
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bce\"]")
	public WebElement bancoCreditoExtemporaneo;

	@FindBy(xpath = "//span[text()=\"Painel BCE\"]")
	public WebElement painelbce;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bcePanelConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Painel BCE\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[2]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement cboUf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id][text()=\"ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@id=\"layout\"]/div/div[2]")
	public WebElement leiaute;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoleiaute;
	
	@FindBy(xpath = "//div[@id=\"component\"]/div/div/div[2]")
	public WebElement componente;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaocomponente;
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	String URL = driver.getCurrentUrl();
	
	public PainelBCEConfiguracaoEExecucaoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		bancoCreditoExtemporaneo.click();
		sleep(2000);
		painelbce.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		//ultimo id
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		System.out.println("ID Ultimo Registro: " + id);
		
		
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(empresa);
		empresa.click();
		sleep(1000);
		opcao.click();
		closeSelectTypeCheckbox(empresa);
		sleep(1000);
		
		
		
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		filial.click();
		sleep(1000);
		opcao.click();
		closeSelectTypeCheckbox(filial);
		sleep(1000);
		
		tributo.click();
		sleep(1000);
		opcaotributo.click();
		sleep(1000);
		
		leiaute.click();
		sleep(1000);
		opcaoleiaute.click();
		sleep(1000);
		
		componente.click();
		sleep(1000);
		opcaocomponente.click();
		sleep(1000);
		
		salvar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idRegistronovo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
			System.out.println("ID Ultimo Registro despues de crear: " + idRegistronovo);
			idInserir("idBCEPainelBCEConfiguracaoEExecucaco",idRegistronovo);
		//idInserir1(idRegistronovo);
		
		boolean sucesso = false;
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistronovo);
		
		if(id2 > id1) {
			System.out.println("Registro criado");
			sucesso = true;
		}else {
			System.out.println("Não pode criar o registro..");
			sucesso=false;
		}
		System.out.println(sucesso);
		return sucesso;
	}

}
