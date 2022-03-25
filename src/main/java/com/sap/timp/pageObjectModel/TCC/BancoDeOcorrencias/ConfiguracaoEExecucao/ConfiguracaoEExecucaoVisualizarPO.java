package com.sap.timp.pageObjectModel.TCC.BancoDeOcorrencias.ConfiguracaoEExecucao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguracaoEExecucaoVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//li[@identifier=\"accordion-item-boc\"]")
	public WebElement bancoOcorrencia;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-bocConfiguration\"]")
	public WebElement configuracaoEExecucao;


	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[2]/div/div[1]/div[1]/div/div[1]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[2]/div/div[1]/div[1]/div/div[1]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[2]/div/div[1]/div[1]/div/div[1]")
	public WebElement filial;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Tipo de Ocorrência\"]")
	public WebElement tipoOcorrencia;
	
	@FindBy(xpath = "//div[@id=\"object-type\"]/div/div[2]/div/div[1]/div[1]/div/div[1]")
	public WebElement tipoObjeto;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar ID tipo de objeto de Ocorrência MDR\"]")
	public WebElement idTipoObjeto;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Associação Código de ajuste de Crédito\"]")
	public WebElement associacaoCodigoCredito;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Associação Código de ajuste\"]")
	public WebElement associacaoCodigoDebito;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Associação Código de ajuste de Pagamento\"]")
	public WebElement associacaoCodigoPagamento;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Observação\"]")
	public WebElement observacao;
	
	@FindBy(xpath = "//div[@id=\"credit-adjustment-code-description\"]/div/div/input")
	public WebElement descricaoPadrao1;
	
	@FindBy(xpath = "//div[@id=\"debit-adjustment-code-description\"]/div/div/input")
	public WebElement descricaoPadrao2;
	
	@FindBy(xpath = "//div[@id=\"pagamento-adjustment-code-description\"]/div/div/input")
	public WebElement descricaoPadrao3;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	public ConfiguracaoEExecucaoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		
		bancoOcorrencia.click();
		sleep(2000);
		configuracaoEExecucao.click();
		
		invisibilityOfElementOverlay();
		
		String idRegistro = idObter("idBOConfiguracaoEExecucaco");
		
		siguiente.click();
		waitExpectXpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div");
		invisibilityOfElementOverlay();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));


		menu.click();
		sleep(1000);
		acao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String tributoV = tributo.getAttribute("value");
		String empresaV = empresa.getText();
		String ufV = uf.getText();
		String filialV = filial.getText();
		String tipoOcorrenciaV = tipoOcorrencia.getAttribute("value");
		String tipoObjetov = tipoObjeto.getText();
		String idTipoObjetoV = idTipoObjeto.getAttribute("value");
		String associacaoCodigoCreditoV = associacaoCodigoCredito.getAttribute("value");
		String associacaoCodigoDebitoV = associacaoCodigoDebito.getAttribute("value");
		String associacaoCodigoPagamentoV = associacaoCodigoPagamento.getAttribute("value");
		String observacaoV = observacao.getAttribute("value");
		String descricaoV1 = descricaoPadrao1.getAttribute("value");
		String descricaoV2 = descricaoPadrao2.getAttribute("value");
		String descricaoV3 = descricaoPadrao3.getAttribute("value");
		
		System.out.println("---------------Informação no Visualizar-----------------");
		System.out.println(tributoV);
		System.out.println(empresaV);
		System.out.println(ufV);
		System.out.println(filialV);
		System.out.println(tipoOcorrenciaV);
		System.out.println(tipoObjetov);
		System.out.println(idTipoObjetoV);
		System.out.println(associacaoCodigoCreditoV);
		System.out.println(associacaoCodigoDebitoV);
		System.out.println(associacaoCodigoPagamentoV);
		System.out.println(observacaoV);
		System.out.println(descricaoV1);
		System.out.println(descricaoV2);
		System.out.println(descricaoV3);
		
		
		biblioteca.click();
		
		invisibilityOfElementOverlay();
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));


		menu.click();
		sleep(1000);
		acao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String tributoE = tributo.getAttribute("value");
		String empresaE = empresa.getText();
		String ufE = uf.getText();
		String filialE = filial.getText();
		String tipoOcorrenciaE = tipoOcorrencia.getAttribute("value");
		String tipoObjetoE = tipoObjeto.getText();
		String idTipoObjetoE = idTipoObjeto.getAttribute("value");
		String associacaoCodigoCreditoE = associacaoCodigoCredito.getAttribute("value");
		String associacaoCodigoDebitoE = associacaoCodigoDebito.getAttribute("value");
		String associacaoCodigoPagamentoE = associacaoCodigoPagamento.getAttribute("value");
		String observacaoE = observacao.getAttribute("value");
		String descricaoE1 = descricaoPadrao1.getAttribute("value");
		String descricaoE2 = descricaoPadrao2.getAttribute("value");
		String descricaoE3 = descricaoPadrao3.getAttribute("value");
		
		
		System.out.println("---------------Informação na Edição-----------------");
		System.out.println(tributoE);
		System.out.println(empresaE);
		System.out.println(ufE);
		System.out.println(filialE);
		System.out.println(tipoOcorrenciaE);
		System.out.println(tipoObjetoE);
		System.out.println(idTipoObjetoE);
		System.out.println(associacaoCodigoCreditoE);
		System.out.println(associacaoCodigoDebitoE);
		System.out.println(associacaoCodigoPagamentoE);
		System.out.println(observacaoE);
		System.out.println(descricaoE1);
		System.out.println(descricaoE2);
		System.out.println(descricaoE3);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(tributoE.equals(tributoV));
		sucesso.add(empresaE.equals(empresaV));
		sucesso.add(ufE.equals(ufV));
		sucesso.add(filialE.equals(filialV));
		sucesso.add(tipoOcorrenciaE.equals(tipoOcorrenciaV));
		sucesso.add(tipoObjetoE.equals(tipoObjetov));
		sucesso.add(idTipoObjetoE.equals(idTipoObjetoV));
		sucesso.add(associacaoCodigoCreditoE.equals(associacaoCodigoCreditoV));
		sucesso.add(associacaoCodigoDebitoE.equals(associacaoCodigoDebitoV));
		sucesso.add(associacaoCodigoPagamentoE.equals(associacaoCodigoPagamentoV));
		sucesso.add(observacaoE.equals(observacaoV));
		sucesso.add(descricaoE1.equals(descricaoV1));
		sucesso.add(descricaoE2.equals(descricaoV2));
		sucesso.add(descricaoE3.equals(descricaoV3));
		
		System.out.println(sucesso);
		return sucesso;

	}

}
