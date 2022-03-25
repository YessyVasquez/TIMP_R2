package com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.ContasDefaultPorTributo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ContasDefaultPorTributoVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Parâmetros de Contabilização\"]")
	public WebElement parametrosdecontabilizacao;
	
	
	@FindBy(xpath = "//span[text()=\"Contas Default por Tributo (Substituir Conta Estoque)\"]")
	public WebElement contasdefaultportributo;
	
	@FindBy(xpath = "//span[text()=\"Nova Conta Default por Tributo\"]")
	public WebElement novacontadefaultportributo;

	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoempresa;

	
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
	
	

	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"adjustmentCode\"]")
	public WebElement codigoAjusteV;
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"adjustmentType\"]")
	public WebElement tipoAjustV;
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributoV;
	@FindBy(xpath = "//span[@id=\"taxType\"]")
	public WebElement tipoImpostoV;
	@FindBy(xpath = "//span[@id=\"taxTypeDetail\"]")
	public WebElement detalheTipoTributoV;
	@FindBy(xpath = "//span[@id=\"utilization\"]")
	public WebElement utilizacaoV;
	@FindBy(xpath = "//span[@id=\"bookLine\"]")
	public WebElement linhaLivroV;
	@FindBy(xpath = "//span[@id=\"debitAccount\"]")
	public WebElement contaDebitoV;
	@FindBy(xpath = "//span[@id=\"creditAccount\"]")
	public WebElement contaCreditoV;
	
	
	@FindBy(xpath = "//div[contains(@class,\"companyId\")]/div/div/div/div/div/div/div[1]")
	public WebElement empresaE;
	@FindBy(xpath = "//div[contains(@class,\"branchId\")]/div/div/div/div/div/div/div[1]")
	public WebElement filialE;
	@FindBy(xpath = "//input[contains(@placeholder,\"um Código\")]")
	public WebElement codigoAjusteE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Descrição\")]")
	public WebElement descricaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Tipo de Ajuste\")]")
	public WebElement tipoAjusteE;
	@FindBy(xpath = "//input[@placeholder=\"Tributo\"]")
	public WebElement tributoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Tipo de Imposto\")]")
	public WebElement tipoImpostoE;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Detalhe\")]")
	public WebElement detalheTipoTributoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Utilização\")]")
	public WebElement utilizacaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Linha do Livro\")]")
	public WebElement linhaLivroE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Conta de Débito\")]")
	public WebElement contaDebitoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Conta de Crédito\")]")
	public WebElement contaCreditoE;


	
	
	public ContasDefaultPorTributoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		parametrosdecontabilizacao.click();
		sleep(2000);
		contasdefaultportributo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("ContasDefaultPorTributo");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		visibilityOfElementXpath("//span[@id=\"creditAccount\"]");
		sleep(2000);
		
		String empresaV1 = empresaV.getText();
		String filialV1 = filialV.getText();
		filialV1= filialV1.replace("_", " - ");
		String codigoAjusteV1 = codigoAjusteV.getText();
		String descricaoV1 = descricaoV.getText();
		String tipoAjusteV1 = tipoAjustV.getText();
		String tributoV1 = tributoV.getText();
		String tipoImpostoV1 = tipoImpostoV.getText();
		String detalheTipoTributoV1 = detalheTipoTributoV.getText();
		String utilizacaoV1 = utilizacaoV.getText();
		String linhaLivroV1 = linhaLivroV.getText();
		String contaDebitoV1 = contaDebitoV.getText();
		String contaCreditoV1 = contaCreditoV.getText();

	
		System.out.println(empresaV1);
		System.out.println(filialV1);
		System.out.println(codigoAjusteV1);
		System.out.println(descricaoV1);
		System.out.println(tipoAjusteV1);
		System.out.println(tributoV1);
		System.out.println(tipoImpostoV1);
		System.out.println(detalheTipoTributoV1);
		System.out.println(utilizacaoV1);
		System.out.println(linhaLivroV1);
		System.out.println(contaDebitoV1);
		System.out.println(contaCreditoV1);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("ContasDefaultPorTributo");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		attributeToBeXpath("//div[@class=\"field-element adjustmentCode_0_1\"]/div","class", "input-element-wrapper");
		sleep(2000);
		
		String empresaE1 = empresaE.getText();
		String filialE1 = filialE.getText().trim();
		String codigoAjusteE1 = codigoAjusteE.getAttribute("value");
		String descricaoE1 = descricaoE.getAttribute("value");
		String tipoAjusteE1 = tipoAjusteE.getAttribute("value");
		String tributoE1 = tributoE.getAttribute("value");
		String tipoImpostoE1 = tipoImpostoE.getAttribute("value");
		String detalheTipoTributoE1= detalheTipoTributoE.getAttribute("value");
		String utiliacaoE1 = utilizacaoE.getAttribute("value");
		String linhaLivroE1 = linhaLivroE.getAttribute("value");
		String contaDebitoE1 = contaDebitoE.getAttribute("value");
		String contaCreditoE1 = contaCreditoE.getAttribute("value");

		
		
		
		System.out.println(empresaE1);
		System.out.println(filialE1);
		System.out.println(codigoAjusteE1);
		System.out.println(descricaoE1);
		System.out.println(tipoAjusteE1);
		System.out.println(tributoE1);
		System.out.println(tipoImpostoE1);
		System.out.println(detalheTipoTributoE1);
		System.out.println(utiliacaoE1);
		System.out.println(linhaLivroE1);
		System.out.println(contaDebitoE1);
		System.out.println(contaCreditoE1);
	
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaV1.contains(empresaE1));
		sucesso.add(filialV1.contains(filialE1));
		sucesso.add(codigoAjusteV1.contains(codigoAjusteE1));
		sucesso.add(descricaoV1.contains(descricaoE1));
		sucesso.add(tributoE1.contains(tributoV1));
		sucesso.add(tipoImpostoE1.contains(tipoImpostoE1));
		sucesso.add(contaDebitoV1.contains(contaDebitoE1));
		sucesso.add(contaCreditoV1.contains(contaCreditoE1));

		
		System.out.println(sucesso);
		
		
		return sucesso;
	
			
	}
}
