package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.RegistroM600;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegistroM600VisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário COFINS\"]")
	public WebElement apuracaocreditocofins;
	

	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisCalculationConfiguration\" and @tabindex=\"0\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM600\"]")
	public WebElement registroM600;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Indicador de natureza da retenção na Fonte \"]")
	public WebElement indicador1;
	
	@FindBy(xpath = "//div[@id=\"indNatRet\"]/div/div[2]")
	public WebElement indicador;
	

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div/div/div/div[@class=\"componentName\"]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div/div/div/div[@class=\"componentName\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"reg\"]/div/div/input")
	public WebElement registro;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor Total da Contribuição Não Cumulativa do Período \"]")
	public WebElement valorTotalContribuicao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor do Crédito Descontado Apurado no próprio Período da Escrituração \"]")
	public WebElement valorApuradoPropioPeriodo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor do Crédito Descontado Apurado no Período Anterior da Escrituração \"]")
	public WebElement valorApuradoPeriodoAnterior;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor Total da Contribuição Não Cumulativa Devida \"]")
	public WebElement valorTotalContribuicaoNaoAcumulativa;
	
	@FindBy(xpath = "//div[@id=\"vlRetNc\"]/div/div/input")
	public WebElement valorRetidoNaFonteDeduzido;
	
	@FindBy(xpath = "//div[@id=\"vlOutDedNc\"]/div/div/input")
	public WebElement outrasDeducoesNoPeriodo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor da Contribuição Não Cumulativa a Recolher/Pagar \"]")
	public WebElement valorTotalContribuicaoNaoAcumulativaARecolher;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor Total da Contribuição Cumulativa do Período \"]")
	public WebElement valorTotalContribuicaoCumulativa;
	
	@FindBy(xpath = "//div[@id=\"vlRetCum\"]/div/div/input")
	public WebElement valorRetidoNaFonteDeduzido2;
	
	@FindBy(xpath = "//div[@id=\"vlOutDedCum\"]/div/div/input")
	public WebElement outrasDeducoesNoPeriodo2;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor da Contribuição Cumulativa a Recolher/Pagar \"]")
	public WebElement valorTotalContribuicaoCumulativaARecolher;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor Total da Contribuição a Recolher/Pagar no Período \"]")
	public WebElement valorTotalContribuicaoARecolher;

	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código de Situação Tributária referente ao COFINS\"]")
	public WebElement codigosituacao;
	

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public RegistroM600VisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		String url = driver.getCurrentUrl();
/*
		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		if (url.contains("tc2")) {
			tc2 = true;
		} else if (url.contains("tp1")) {
			tp1 = true;
		} else {
			tq1 = true;
		}
*/
		sleep(300);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		apuracaocreditocofins.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registroM600.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("GestaoCreditoTributarioCOFINSRegistroM600");
		System.out.println("ID Registro: " + idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectXpath("//div[@id=\"branch\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		waitExpectXpath("//div[@id=\"uf\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresaV = empresa.getAttribute("value");
		String ufV = uf.getText();
		String filialV = filial.getText();
		String tributoV = tributo.getAttribute("value");
		String registroV = registro.getAttribute("value");
		String valorTotalContribuicaoV = valorTotalContribuicao.getAttribute("value");
		String valorApuradoProprioPeriodoV = valorApuradoPropioPeriodo.getAttribute("value");
		String valorApuradoPeriodoAnteriorV = valorApuradoPeriodoAnterior.getAttribute("value");
		String valorTotalContribuicaoNaoAcumulativaV = valorTotalContribuicaoNaoAcumulativa.getAttribute("value");
		String valorRetidoNaFonteDeduzidoV = valorRetidoNaFonteDeduzido.getAttribute("value");
		String outrasDeducoesNoPeriodoV = outrasDeducoesNoPeriodo.getAttribute("value");
		String valorTotalContribuicaoNaoAcumulativaARecolherV = valorTotalContribuicaoNaoAcumulativaARecolher.getAttribute("value");
		String valorTotalContribuicaoCumulativaV = valorTotalContribuicaoCumulativa.getAttribute("value");
		String valorRetidoNaFonteDeduzido2V = valorRetidoNaFonteDeduzido2.getAttribute("value");
		String outrasDeducoesNoPeriodo2V = outrasDeducoesNoPeriodo2.getAttribute("value");
		String valorTotalContribuicaoCumulativaARecolheV = valorTotalContribuicaoCumulativaARecolher.getAttribute("value");
		String valorTotalContribuicaoARecolherV = valorTotalContribuicaoARecolher.getAttribute("value");

		
		System.out.println("-----------Visualizar------------");
		System.out.println(empresaV);
		System.out.println(ufV);
		System.out.println(filialV);
		System.out.println(tributoV);
		System.out.println(registroV);
		System.out.println(valorTotalContribuicaoV);
		System.out.println(valorApuradoProprioPeriodoV);
		System.out.println(valorApuradoPeriodoAnteriorV);
		System.out.println(valorTotalContribuicaoNaoAcumulativaV);
		System.out.println(valorRetidoNaFonteDeduzidoV);
		System.out.println(outrasDeducoesNoPeriodoV);
		System.out.println(valorTotalContribuicaoNaoAcumulativaARecolherV);
		System.out.println(valorTotalContribuicaoCumulativaV);
		System.out.println(valorRetidoNaFonteDeduzido2V);
		System.out.println(outrasDeducoesNoPeriodo2V);
		System.out.println(valorTotalContribuicaoCumulativaARecolheV);
		System.out.println(valorTotalContribuicaoARecolherV);
		
		sleep(3000);
		
		biblioteca.click();
		
		sleep(6000);
		

		int botaoNao = rows("//button[text()=\"Não\"]");
		
		if (botaoNao > 0) {
			nao.click();
		}
		
		sleep(5000);
		waitExpectElement(siguiente);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);


		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		editar = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectXpath("//div[@id=\"branch\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		waitExpectXpath("//div[@id=\"uf\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String empresaE = empresa.getAttribute("value");
		String ufE = uf.getText();
		String filialE = filial.getText();
		String tributoE = tributo.getAttribute("value");
		String registroE = registro.getAttribute("value");
		String valorTotalContribuicaoE = valorTotalContribuicao.getAttribute("value");
		String valorApuradoProprioPeriodoE = valorApuradoPropioPeriodo.getAttribute("value");
		String valorApuradoPeriodoAnteriorE = valorApuradoPeriodoAnterior.getAttribute("value");
		String valorTotalContribuicaoNaoAcumulativaE = valorTotalContribuicaoNaoAcumulativa.getAttribute("value");
		String valorRetidoNaFonteDeduzidoE = valorRetidoNaFonteDeduzido.getAttribute("value");
		String outrasDeducoesNoPeriodoE = outrasDeducoesNoPeriodo.getAttribute("value");
		String valorTotalContribuicaoNaoAcumulativaARecolherE = valorTotalContribuicaoNaoAcumulativaARecolher.getAttribute("value");
		String valorTotalContribuicaoCumulativaE = valorTotalContribuicaoCumulativa.getAttribute("value");
		String valorRetidoNaFonteDeduzido2E = valorRetidoNaFonteDeduzido2.getAttribute("value");
		String outrasDeducoesNoPeriodo2E = outrasDeducoesNoPeriodo2.getAttribute("value");
		String valorTotalContribuicaoCumulativaARecolheE = valorTotalContribuicaoCumulativaARecolher.getAttribute("value");
		String valorTotalContribuicaoARecolherE = valorTotalContribuicaoARecolher.getAttribute("value");

		
		System.out.println("-----------Detalhes------------");
		System.out.println(empresaE);
		System.out.println(ufE);
		System.out.println(filialE);
		System.out.println(tributoE);
		System.out.println(registroE);
		System.out.println(valorTotalContribuicaoE);
		System.out.println(valorApuradoProprioPeriodoE);
		System.out.println(valorApuradoPeriodoAnteriorE);
		System.out.println(valorTotalContribuicaoNaoAcumulativaE);
		System.out.println(valorRetidoNaFonteDeduzidoE);
		System.out.println(outrasDeducoesNoPeriodoE);
		System.out.println(valorTotalContribuicaoNaoAcumulativaARecolherE);
		System.out.println(valorTotalContribuicaoCumulativaE);
		System.out.println(valorRetidoNaFonteDeduzido2E);
		System.out.println(outrasDeducoesNoPeriodo2E);
		System.out.println(valorTotalContribuicaoCumulativaARecolheE);
		System.out.println(valorTotalContribuicaoARecolherE);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaE.equals(empresaV));
		sucesso.add(ufE.equals(ufV));
		sucesso.add(filialE.equals(filialV));
		sucesso.add(tributoE.equals(tributoV));
		sucesso.add(registroE.equals(registroV));
		sucesso.add(valorTotalContribuicaoE.equals(valorTotalContribuicaoV));
		sucesso.add(valorApuradoProprioPeriodoE.equals(valorApuradoProprioPeriodoV));
		sucesso.add(valorApuradoPeriodoAnteriorE.equals(valorApuradoPeriodoAnteriorV));
		sucesso.add(valorTotalContribuicaoNaoAcumulativaE.equals(valorTotalContribuicaoNaoAcumulativaV));
		sucesso.add(valorRetidoNaFonteDeduzidoE.equals(valorRetidoNaFonteDeduzidoV));
		sucesso.add(outrasDeducoesNoPeriodoE.equals(outrasDeducoesNoPeriodoV));
		sucesso.add(valorTotalContribuicaoNaoAcumulativaARecolherE.equals(valorTotalContribuicaoNaoAcumulativaARecolherV));
		sucesso.add(valorTotalContribuicaoCumulativaE.equals(valorTotalContribuicaoCumulativaV));
		sucesso.add(valorRetidoNaFonteDeduzido2E.equals(valorRetidoNaFonteDeduzido2V));
		sucesso.add(outrasDeducoesNoPeriodo2E.equals(outrasDeducoesNoPeriodo2V));
		sucesso.add(valorTotalContribuicaoCumulativaARecolheE.equals(valorTotalContribuicaoCumulativaARecolheV));
		sucesso.add(valorTotalContribuicaoARecolherE.equals(valorTotalContribuicaoARecolherV));
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}

}
