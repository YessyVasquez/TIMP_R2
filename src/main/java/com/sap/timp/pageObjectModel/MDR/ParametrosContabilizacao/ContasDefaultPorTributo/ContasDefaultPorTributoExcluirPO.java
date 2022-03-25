package com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.ContasDefaultPorTributo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ContasDefaultPorTributoExcluirPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Parâmetros de Contabilização\"]")
	public WebElement parametrosdecontabilizacao;
	
	
	@FindBy(xpath = "//span[text()=\"Contas Default por Tributo (Substituir Conta Estoque)\"]")
	public WebElement contasdefaultportributo;
	
	@FindBy(xpath = "//span[text()=\"Nova Conta Default por Tributo\"]")
	public WebElement novacontadefaultportributo;
	
	@FindBy(xpath = "//div[@class=\"field-element companyId_0_0\"]/div/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@class=\"field-element branchId_0_0\"]/div/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaofilial;
	
	
	@FindBy(xpath = "//div[@class=\"field-element adjustmentCode_0_1\"]/div/div/div/div[2]")
	public WebElement codigodeajuste;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]")
	public WebElement opcaocodigodeajuste;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Conta de Débito\"]")
	public WebElement contadebito;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Conta de Crédito\"]")
	public WebElement contacredito;

	
	public ContasDefaultPorTributoExcluirPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean excluir() {
		
		sleep(2000);
		parametrosdecontabilizacao.click();
		sleep(2000);
		contasdefaultportributo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("ContasDefaultPorTributo");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		excluir.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(1000);
		sim.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = false;
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idinserido = idObter1();
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
	
		if(idinserido != idultimo) {
			
			sucesso = true;
		}else {
			sucesso =false;
		}
		System.out.println(sucesso);
		return sucesso;

		
	}

}
