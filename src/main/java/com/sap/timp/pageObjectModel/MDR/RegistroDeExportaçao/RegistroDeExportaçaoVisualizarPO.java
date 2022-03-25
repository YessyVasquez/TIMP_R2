package com.sap.timp.pageObjectModel.MDR.RegistroDeExportaçao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegistroDeExportaçaoVisualizarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Registro de Exportação\"]")
	public WebElement registroexportacao;
	
	@FindBy(xpath = "//li[@class=\"leftButton library-toolbar-item  first \"]/button/span[2]")
	public WebElement novoregistro;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;

	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"docnum-sap\"]")
	public WebElement docnumSapV;
	@FindBy(xpath = "//span[@id=\"key-nf\"]")
	public WebElement chaveV;
	@FindBy(xpath = "//span[@id=\"cod-item\"]")
	public WebElement codigoItemV;
	@FindBy(xpath = "//span[@id=\"cod-country-destiny\"]")
	public WebElement codPaisDestinoV;
	@FindBy(xpath = "//span[@id=\"date-launch\"]")
	public WebElement dataLancamentoV;
	@FindBy(xpath = "//span[@id=\"num-declaration\"]")
	public WebElement numeroDeclaracaoV;
	@FindBy(xpath = "//span[@id=\"date-declaration\"]")
	public WebElement dataDeclaracaoV;
	@FindBy(xpath = "//span[@id=\"type-doc-export\"]")
	public WebElement tipoDocumentoV;
	@FindBy(xpath = "//span[@id=\"nature-export\"]")
	public WebElement naturezaExportacaoV;
	@FindBy(xpath = "//span[@id=\"date-averbation-declaration-export\"]")
	public WebElement dataAbreviacaoV;
	@FindBy(xpath = "//span[@id=\"type-knowledge-boarding\"]")
	public WebElement tipoConhecEmbarqueV;
	@FindBy(xpath = "//span[@id=\"model\"]")
	public WebElement modeloV;
	@FindBy(xpath = "//span[@id=\"num-invoice\"]")
	public WebElement notaFiscalV;
	@FindBy(xpath = "//span[@id=\"date-emission-nf-export\"]")
	public WebElement dataEmissaoV;
	
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Empresa\")]")
	public WebElement empresaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Filial\")]")
	public WebElement filialE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Docnum SAP\")]")
	public WebElement docnumSapE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Chave\")]")
	public WebElement chaveE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Código do item\")]")
	public WebElement codigoItemE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Cod país\")]")
	public WebElement codPaisDestinoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Data lançamento\")]")
	public WebElement dataLancamentoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Nº Declaração\")]")
	public WebElement numeroDeclaracaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Data declaração\")]")
	public WebElement dataDeclaracaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Tipo de doc\")]")
	public WebElement tipoDocumentoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Natureza\")]")
	public WebElement naturezaExportacaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Data averbação\")]")
	public WebElement dataAbreviacaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Tipo de conhec\")]")
	public WebElement tipoConhecEmbarqueE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Modelo\")]")
	public WebElement modeloE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Nº Nota fiscal\")]")
	public WebElement notaFiscalE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Data emissão NF\")]")
	public WebElement dataEmissaoE;
	
	public RegistroDeExportaçaoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		registroexportacao.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("RegistroDeExportaçao");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		açao.click();
		sleep(5000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresaV1 = empresaV.getText();
		String filialV1 = filialV.getText();
		String docnumSapV1 = docnumSapV.getText();
		String chaveV1 = chaveV.getText();
		String codigoItemV1 = codigoItemV.getText();
		String dataLancamentoV1 = dataLancamentoV.getText();
		String numeroDeclaracaoV1 = numeroDeclaracaoV.getText();
		String dataDeclaracaoV1= dataDeclaracaoV.getText();
		String tipoDocumentoV1= tipoDocumentoV.getText();
		String naturezaExportacaoV1 = naturezaExportacaoV.getText();
		String dataAbreviacaoV1 = dataAbreviacaoV.getText();
		String tipoConhecEmbarqueV1 = tipoConhecEmbarqueV.getText();
		String modeloV1 = modeloV.getText();
		String notaFiscalV1 = notaFiscalV.getText();
		String dataEmissaoV1 = dataEmissaoV.getText();
		String codigoPaisDestinoV1 = codPaisDestinoV.getText();
		
		System.out.println(empresaV1);
		System.out.println(filialV1);
		System.out.println(docnumSapV1);
		System.out.println(chaveV1);
		System.out.println(codigoItemV1);
		System.out.println(dataLancamentoV1);
		System.out.println(numeroDeclaracaoV1);
		System.out.println(dataDeclaracaoV1);
		System.out.println(tipoDocumentoV1);
		System.out.println(naturezaExportacaoV1);
		System.out.println(dataAbreviacaoV1);
		System.out.println(tipoConhecEmbarqueV1);
		System.out.println(modeloV1);
		System.out.println(notaFiscalV1);
		System.out.println(dataEmissaoV1);
		System.out.println(codigoPaisDestinoV1);
		
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("RegistroDeExportaçao");
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		açao =driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String empresaE1 = empresaE.getAttribute("value");
		String filialE1 = filialE.getAttribute("value");
		String docnumSapE1 = docnumSapE.getAttribute("value");
		String chaveE1 = chaveE.getAttribute("value");
		String codigoItemE1 = codigoItemE.getAttribute("value");
		String codigoPaisDestinoE1 = codPaisDestinoE.getAttribute("value");
		String dataLancamentoE1 = dataLancamentoE.getAttribute("value");
		String numeroDeclaracaoE1= numeroDeclaracaoE.getAttribute("value");
		String dataDeclaracaoE1 = dataDeclaracaoE.getAttribute("value");
		String tipoDocumentoE1 = tipoDocumentoE.getAttribute("value");
		String naturezaExportacaoE1 = naturezaExportacaoE.getAttribute("value");
		String dataAbreviacaoE1 = dataAbreviacaoE.getAttribute("value");
		String tipoConhecEmbarqueE1 = tipoConhecEmbarqueE.getAttribute("value");
		String modeloE1 = modeloE.getAttribute("value");
		String notaFiscalE1 = notaFiscalE.getAttribute("value");
		String dataEmissaoE1 = dataEmissaoE.getAttribute("value");
		

		System.out.println(empresaE1);
		System.out.println(filialE1);
		System.out.println(docnumSapE1);
		System.out.println(chaveE1);
		System.out.println(codigoItemE1);
		System.out.println(codigoPaisDestinoE1);
		System.out.println(dataLancamentoE1);
		
		System.out.println(numeroDeclaracaoE1);
		System.out.println(dataDeclaracaoE1);
		System.out.println(tipoDocumentoE1);
		System.out.println(naturezaExportacaoE1);
		System.out.println(dataAbreviacaoE1);
		System.out.println(tipoConhecEmbarqueE1);
		System.out.println(modeloE1);
		System.out.println(notaFiscalE1);
		System.out.println(dataEmissaoE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaV1.contains(empresaE1));
		sucesso.add(filialV1.contains(filialE1));
		sucesso.add(docnumSapV1.contains(docnumSapE1));
		sucesso.add(chaveV1.contains(chaveE1));
		sucesso.add(codigoItemV1.contains(codigoItemE1));
		sucesso.add(codigoPaisDestinoV1.contains(codigoPaisDestinoE1));
		sucesso.add(dataLancamentoV1.contains(dataLancamentoE1));
		sucesso.add(numeroDeclaracaoV1.contains(numeroDeclaracaoE1));
		sucesso.add(dataDeclaracaoV1.contains(dataDeclaracaoE1));
		sucesso.add(tipoDocumentoV1.contains(tipoDocumentoE1));
		sucesso.add(naturezaExportacaoV1.contains(naturezaExportacaoE1));
		sucesso.add(dataAbreviacaoV1.contains(dataAbreviacaoE1));
		sucesso.add(tipoConhecEmbarqueV1.contains(tipoConhecEmbarqueE1));
		sucesso.add(modeloV1.contains(modeloE1));
		sucesso.add(notaFiscalV1.contains(notaFiscalE1));
		sucesso.add(dataEmissaoV1.contains(dataEmissaoE1));

		
		
		System.out.println(sucesso);

		return sucesso;	
	}
	
	
	

}
