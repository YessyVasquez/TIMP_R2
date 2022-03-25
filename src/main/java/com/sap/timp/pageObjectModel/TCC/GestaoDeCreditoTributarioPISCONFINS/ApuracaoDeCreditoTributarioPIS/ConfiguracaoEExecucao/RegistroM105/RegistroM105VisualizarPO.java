package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.RegistroM105;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class RegistroM105VisualizarPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário PIS\"]")
	public WebElement apuraçãoCrédito;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisCalculationConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM105\"]")
	public WebElement registroM105;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[1]/input")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[1]/div[1]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[1]/div[1]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"natBcCred\"]/div[1]/div[1]/input")
	public WebElement CódigoBaseCálculoCréditoApuradoPeríodo;
	
	@FindBy(xpath = "//div[@id=\"cstPis\"]/div/div/input")
	public WebElement CódigoSituaçãoTributáriaReferenteAOPIS;
	
	@FindBy(xpath = "//div[@id=\"vlBcPisTot\"]/div[1]/div[1]/input")
	public WebElement ValorTotalBaseCálculoEscrituradaDocumentosOperações;
	
	@FindBy(xpath = "//div[@id=\"vlBcPisCum\"]/div[1]/div[1]/input")
	public WebElement ParcelaValorTotalBaseCálculoInformada;
	
	@FindBy(xpath = "//div[@id=\"vlBcPisNc\"]/div[1]/div[1]/input")
	public WebElement ValorTotalBaseCálculoCréditoVinculadaReceitasIncidênciaCumulativa;
	
	@FindBy(xpath = "//div[@id=\"vlBcPis\"]/div[1]/div[1]/input")
	public WebElement ValorBaseCálculoCréditoVinculadaTipoCreditoEscrituraM500;
	
	@FindBy(xpath = "//div[@id=\"quantBcPisTot\"]/div[1]/div[1]/input")
	public WebElement QuantidadeTotalBaseCálculoCréditoApuradoUnidadeMedidaProduto;
	
	@FindBy(xpath = "//div[@id=\"quantBcPis\"]/div[1]/div[1]/input")
	public WebElement ParcelaBaseCálculoCréditoQuantidadeVinculadaTipoCréditoEscrituradoM500;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement no;
	
	public RegistroM105VisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> Visualizar() {
		
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
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		apuraçãoCrédito.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registroM105.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		
		String idRegistro = idObter("ApuraçãodeCréditoTributárioPISRegistroM105");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(19000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectElement(filial);
		sleep(2000);
		
		String empresavisualizar = empresa.getAttribute("value");
		String ufvisualizar = uf.getText();
		String filialvisualizar = filial.getText();
		String CódigoBaseCálculoCréditoApuradoPeríodovisualizar = CódigoBaseCálculoCréditoApuradoPeríodo.getAttribute("value");
		String CódigoSituaçãoTributáriaReferenteAOPISvisualizar = CódigoSituaçãoTributáriaReferenteAOPIS.getAttribute("value");
		String ValorTotalBaseCálculoEscrituradaDocumentosOperaçõesvisualizar = ValorTotalBaseCálculoEscrituradaDocumentosOperações.getAttribute("value");
		String ParcelaValorTotalBaseCálculoInformadavisualizar = ParcelaValorTotalBaseCálculoInformada.getAttribute("value");
		String ValorTotalBaseCálculoCréditoVinculadaReceitasIncidênciaCumulativavisualizar = ValorTotalBaseCálculoCréditoVinculadaReceitasIncidênciaCumulativa.getAttribute("value");
		String ValorBaseCálculoCréditoVinculadaTipoCreditoEscrituraM500visualizar = ValorBaseCálculoCréditoVinculadaTipoCreditoEscrituraM500.getAttribute("value");
		String QuantidadeTotalBaseCálculoCréditoApuradoUnidadeMedidaProdutovisualizar = QuantidadeTotalBaseCálculoCréditoApuradoUnidadeMedidaProduto.getAttribute("value");
		String ParcelaBaseCálculoCréditoQuantidadeVinculadaTipoCréditoEscrituradoM500visualizar = ParcelaBaseCálculoCréditoQuantidadeVinculadaTipoCréditoEscrituradoM500.getAttribute("value");
		
		System.out.println(empresavisualizar);
		System.out.println(ufvisualizar);
		System.out.println(filialvisualizar);
		System.out.println(CódigoBaseCálculoCréditoApuradoPeríodovisualizar);
		System.out.println(CódigoSituaçãoTributáriaReferenteAOPISvisualizar);
		System.out.println(ValorTotalBaseCálculoEscrituradaDocumentosOperaçõesvisualizar);
		System.out.println(ParcelaValorTotalBaseCálculoInformadavisualizar);
		System.out.println(ValorTotalBaseCálculoCréditoVinculadaReceitasIncidênciaCumulativavisualizar);
		System.out.println(ValorBaseCálculoCréditoVinculadaTipoCreditoEscrituraM500visualizar);
		System.out.println(QuantidadeTotalBaseCálculoCréditoApuradoUnidadeMedidaProdutovisualizar);
		System.out.println(ParcelaBaseCálculoCréditoQuantidadeVinculadaTipoCréditoEscrituradoM500visualizar);
		
		biblioteca.click();
		sleep(4000);
		
		no.click();
		sleep(8000);
			
	
		sleep(4000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu1.click();
		sleep(1000);
		editar.click();
		sleep(26000);
		
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(filial);
		sleep(2000);
		
		String empresaEditar = empresa.getAttribute("value");
		String ufEditar = uf.getText();
		String filialEditar = filial.getText();
		String CódigoBaseCálculoCréditoApuradoPeríodoEditar = CódigoBaseCálculoCréditoApuradoPeríodo.getAttribute("value");
		String CódigoSituaçãoTributáriaReferenteAOPISEditar= CódigoSituaçãoTributáriaReferenteAOPIS.getAttribute("value");
		String ValorTotalBaseCálculoEscrituradaDocumentosOperaçõesEditar = ValorTotalBaseCálculoEscrituradaDocumentosOperações.getAttribute("value");
		String ParcelaValorTotalBaseCálculoInformadaEditar = ParcelaValorTotalBaseCálculoInformada.getAttribute("value");
		String ValorTotalBaseCálculoCréditoVinculadaReceitasIncidênciaCumulativaEditar = ValorTotalBaseCálculoCréditoVinculadaReceitasIncidênciaCumulativa.getAttribute("value");
		String ValorBaseCálculoCréditoVinculadaTipoCreditoEscrituraM500Editar = ValorBaseCálculoCréditoVinculadaTipoCreditoEscrituraM500.getAttribute("value");
		String QuantidadeTotalBaseCálculoCréditoApuradoUnidadeMedidaProdutoEditar = QuantidadeTotalBaseCálculoCréditoApuradoUnidadeMedidaProduto.getAttribute("value");
		String ParcelaBaseCálculoCréditoQuantidadeVinculadaTipoCréditoEscrituradoM500Editar = ParcelaBaseCálculoCréditoQuantidadeVinculadaTipoCréditoEscrituradoM500.getAttribute("value");
		
		System.out.println("------------------------------");
		
		System.out.println(empresaEditar);
		System.out.println(ufEditar);
		System.out.println(filialEditar);
		System.out.println(CódigoBaseCálculoCréditoApuradoPeríodoEditar);
		System.out.println(CódigoSituaçãoTributáriaReferenteAOPISEditar);
		System.out.println(ValorTotalBaseCálculoEscrituradaDocumentosOperaçõesEditar);
		System.out.println(ParcelaValorTotalBaseCálculoInformadaEditar);
		System.out.println(ValorTotalBaseCálculoCréditoVinculadaReceitasIncidênciaCumulativaEditar);
		System.out.println(ValorBaseCálculoCréditoVinculadaTipoCreditoEscrituraM500Editar);
		System.out.println(QuantidadeTotalBaseCálculoCréditoApuradoUnidadeMedidaProdutoEditar);
		System.out.println(ParcelaBaseCálculoCréditoQuantidadeVinculadaTipoCréditoEscrituradoM500Editar);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaEditar.contains(empresavisualizar));
		sucesso.add(ufEditar.contains(ufvisualizar));
		sucesso.add(filialEditar.contains(filialvisualizar));
		sucesso.add(CódigoBaseCálculoCréditoApuradoPeríodoEditar.contains(CódigoBaseCálculoCréditoApuradoPeríodovisualizar));
		sucesso.add(CódigoSituaçãoTributáriaReferenteAOPISEditar.contains(CódigoSituaçãoTributáriaReferenteAOPISvisualizar));
		sucesso.add(ValorTotalBaseCálculoEscrituradaDocumentosOperaçõesEditar.contains(ValorTotalBaseCálculoEscrituradaDocumentosOperaçõesvisualizar));
		sucesso.add(ParcelaValorTotalBaseCálculoInformadaEditar.contains(ParcelaValorTotalBaseCálculoInformadavisualizar));
		sucesso.add(ValorTotalBaseCálculoCréditoVinculadaReceitasIncidênciaCumulativaEditar.contains(ValorTotalBaseCálculoCréditoVinculadaReceitasIncidênciaCumulativavisualizar));
		sucesso.add(ValorBaseCálculoCréditoVinculadaTipoCreditoEscrituraM500Editar.contains(ValorBaseCálculoCréditoVinculadaTipoCreditoEscrituraM500visualizar));
		sucesso.add(QuantidadeTotalBaseCálculoCréditoApuradoUnidadeMedidaProdutoEditar.contains(QuantidadeTotalBaseCálculoCréditoApuradoUnidadeMedidaProdutovisualizar));
		sucesso.add(ParcelaBaseCálculoCréditoQuantidadeVinculadaTipoCréditoEscrituradoM500Editar.contains(ParcelaBaseCálculoCréditoQuantidadeVinculadaTipoCréditoEscrituradoM500visualizar));
		System.out.println(sucesso);
		
		return sucesso;
	}
}
