package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.Registro1102;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class Registro1102CriarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS\"]")
	public WebElement gestaocreditopis;
	

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//*[@id=\"left-content\"]/div[2]/ul/li[6]/ul/li[1]/ul/li[1]/ul/li[3]/div/span[2]")
	public WebElement registro1102;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//div[@class=\"tr\" and @data-id][1]/div[2]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//span[text()=\"Novo Registro 1102\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div[2]/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[text()=\"ICMS\"]")
	public WebElement tributoO;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div/input")
	public WebElement empresa;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement empresaO;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//label[@for=\"check-SP\"]/span")
	public WebElement ufO;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement filialO;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data de referência\"]")
	public WebElement data;
	
	@FindBy(xpath = "//div[@id=\"vlOper\"]/div/div[2]")
	public WebElement valordaoperacao;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"vlBcPis\"]/div/div[2]")
	public WebElement base;
	
	@FindBy(xpath = "//div[@id=\"aliqPis\"]/div/div[2]")
	public WebElement aliquota;
	
	@FindBy(xpath = "//div[@id=\"vlPis\"]/div/div[2]")
	public WebElement valordopispasep;
	
	@FindBy(xpath = "//div[@class=\"list-option\"]/div/div[text()=\"SP\"]")
	public WebElement ufOrigemO;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//span[text()=\"Cálculos de fórmula\"]")
	public WebElement calculoFormula;
	
	@FindBy(xpath = "//button[text()=\"Adicionar Fórmula\"]")
	public WebElement adicionarFormula;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Nome\"]")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@id=\"formula-Box\"]/div/textarea")
	public WebElement caixaFormula;
	
	@FindBy(xpath = "//div[@id=\"totalSuitableCreditInMonth\"]/div/div[1]/div[2]")
	public WebElement mesApropiado;
	
	@FindBy(xpath = "//div[@id=\"totalCreditReceivedByTransfer\"]/div/div[1]/div[2]")
	public WebElement recebidosPorTransferencia;
	
	@FindBy(xpath = "//div[@id=\"totalCreditUsedInPeriod\"]/div/div[1]/div[2]")
	public WebElement utilizadosNoPeriodo;
	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar2;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	public Registro1102CriarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean criar() {

		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		gestaocreditopis.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registro1102.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id ultimo registro: " +idRegistro);
		
		novo.click();
		sleep(2000);
		waitExpectElement(empresa);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		sleep(9000);
		
		uf.click();
		sleep(4000);
		actionsMoveToElementElement(ufO);
		sleep(1000);
		ufO.click();
		sleep(1000);
		closeSelectTypeCheckbox(uf);
		sleep(6000);
	
	
		sleep(3000);
		filial.click();
		sleep(1000);
		filialO.click();
		sleep(1000);
		closeSelectTypeCheckbox(filial);
		sleep(1000);
		
	
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(biblioteca);
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectElement(nao);
		sleep(2000);
		//nao.click();
		sleep(2000);
		//waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("GestaoCréditoTributárioPISRegistro1102",id2);
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
