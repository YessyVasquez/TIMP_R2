package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucao.Registro1210;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class Registro1210CriarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário ICMS\"]")
	public WebElement gestaoCreditoTributarioICMS;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"]/div/span[text()=\"Configuração e Execução\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"][1]/ul/li/ul/li/div/span[text()=\"Registro 1210\"]")
	public WebElement registro1210;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Registro 1210\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement cboEmpresa;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and text()=\"1000\"]")
	public WebElement opcEmpresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement cboUF;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"SP\"]")
	public WebElement opcUF;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement cboFilial;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and not(contains(text(), \"Todos\"))]")
	public WebElement opcFilial;
	
	@FindBy(xpath = "//div[@id=\"taxType\"]/div/div/div[2]")
	public WebElement cboTipoImposto;
	
	@FindBy(xpath = "//li[@class=\"list-item\"][1]")
	public WebElement opcTipoImposto;
	
	@FindBy(xpath = "//div[@id=\"taxTypeDetail\"]/div/div/div[2]")
	public WebElement cboDetalheTipoTributo;
	
	@FindBy(xpath = "//li[@class=\"list-item\"][1]")
	public WebElement opcDetalheTipoTributo;
	
	@FindBy(xpath = "//div[@id=\"creditControl\"]/div/div/div[2]")
	public WebElement cboControleDeCreditoTributario;
	
	@FindBy(xpath = "//li[@class=\"list-item\"][9]")
	public WebElement opcControleDeCreditoTributario;
	
	@FindBy(xpath = "//button[@class=\"btn button-icon icon-font-Display-and-Setting icon-orderedlist-28\"]")
	public WebElement btnSeguir;
	
	@FindBy(xpath = "//div[@class=\"tbody\"]/div[@class=\"tr\"][1]/div/label/span")
	public WebElement seleccionarFlag;
	
	@FindBy(xpath = "//button[text()=\"Selecionar\"]")
	public WebElement btnSeleccionar;
	
	@FindBy(xpath = "//button/span[text()=\"Cálculos de fórmula\"]")
	public WebElement btnCalculoDeFormulas;
	
	@FindBy(xpath = "//button[text()=\"Adicionar Fórmula\"]")
	public WebElement btnAdicionarFormula;
	
	@FindBy(xpath = "//div[@id=\"formula-name\"]/div/div/input")
	public WebElement inputNomeFormula;
	
	@FindBy(xpath = "//div[@id=\"formula-Box\"]/div/textarea")
	public WebElement inputCaixaFormula;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement btnFechar;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement btnGravar2;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	public Registro1210CriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gestaoCreditoTributarioICMS.click();
		sleep(1000);
		
		configuracaoEExecucao.click();
		sleep(1000);
		
		registro1210.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idRegistro = "0";
		
		if(rows > 0) {
			idRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[2]/div")).getText();
		}

		System.out.println("Id ultimo registro: " + idRegistro);
		System.out.println("");
		
		btnNovo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboEmpresa.click();
		opcEmpresa.click();
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		cboUF.click();
		sleep(1000);
		opcUF.click();
		sleep(1000);
		closeSelectTypeCheckbox(cboUF);
		
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		cboFilial.click();
		sleep(1000);
		opcFilial.click();
		sleep(1000);
		closeSelectTypeCheckbox(cboFilial);
		sleep(1000);
		
		cboTipoImposto.click();
		sleep(1000);
		opcTipoImposto.click();
		sleep(1000);
		
		cboDetalheTipoTributo.click();
		sleep(1000);
		opcDetalheTipoTributo.click();
		sleep(1000);
		
		cboControleDeCreditoTributario.click();
		sleep(1000);
		opcControleDeCreditoTributario.click();
		sleep(1000);
		
		btnSeguir.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		seleccionarFlag.click();
		sleep(1000);
		
		btnSeleccionar.click();
		sleep(3000);
		
		btnCalculoDeFormulas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnAdicionarFormula.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(inputNomeFormula);
		inputNomeFormula.sendKeys("QA Formula");
		sleep(1000);
		
		inputCaixaFormula.sendKeys("1");
		sleep(3000);
		
		btnGravar.click();
		sleep(5000);
		
		btnFechar.click();
		sleep(2000);
		
		btnGravar2.click();
		sleep(1000);
		
		waitExpectElement(btnSim);
		btnSim.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		
		int idD = convertToInt(idRegistro);
		int id2D = convertToInt(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			idInserir("Registro1210", id2);
			sucesso = true;
		}
		
		System.out.println(sucesso);
		
		return sucesso;
	}
}
