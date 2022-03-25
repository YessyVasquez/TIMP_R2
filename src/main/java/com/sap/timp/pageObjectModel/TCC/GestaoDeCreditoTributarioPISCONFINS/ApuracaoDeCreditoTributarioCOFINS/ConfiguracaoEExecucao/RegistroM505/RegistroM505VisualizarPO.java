package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.RegistroM505;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegistroM505VisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário COFINS\"]")
	public WebElement apuracaocreditocofins;
	

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[4]/ul/li[1]/div/span[2]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM505\"]")
	public WebElement registrom505;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement ultimaPagina;

	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement empresa;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-SP\"]")
	public WebElement uf;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000_SP_0001\"]")
	public WebElement filial;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo\"]")
	public WebElement tributo;

	@FindBy(xpath = "//div[@id=\"reg\"]/div/div/input")
	public WebElement registro;


	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;

	@FindBy(xpath = "//div[@id=\"componentToSearchId-1000_SP_0014\"]")
	public WebElement filialtc2;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Código de Base de Cálculo do Crédito Apurado no Período  \"]")
	public WebElement codigobase;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código de Situação Tributária referente ao COFINS\"]")
	public WebElement codigosituacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor Total da Base de Cálculo escriturada nos documentos e operações \"]")
	public WebElement valortoalcalculoescritura;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Parcela do Valor Total da base de Cálculo Informada \"]")
	public WebElement parcelvalortotal;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor total da Base de Cálculo do Crédito vinculada a Receitas com Incidência não cumulativa \"]")
	public WebElement valortotalcalculocredito;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor da Base de Cálculo de Crédito vinculada ao tipo de Credito Escritura em M500 \"]")
	public WebElement valorbase;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Quantidade total da base de Cálculo do Crédito apurado em Unidade de Medida do Produto \"]")
	public WebElement quantidadetotal;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Parcela da base de cálculo do crédito em quantidade vinculada ao tipo de crédito escriturado em M500 \"]")
	public WebElement parcelabase;
	

	public RegistroM505VisualizarPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {
		String url = driver.getCurrentUrl();

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
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);

		apuracaocreditocofins.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registrom505.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("id-GCTPISCOFINS-ACTCOFINSConfiguracaoEExecucacoRegistroM505");
		System.out.println("ID Registro: " + idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		if (tc2 == true) {

			waitExpectElement(uf);
			sleep(2000);
			waitExpectElement(filialtc2);
			sleep(2000);
			String empresavisualizar = empresa.getAttribute("value");
			String ufvisualizar = uf.getText();
			String filialvisualizar = filialtc2.getText();
			String tributovisualizar = tributo.getAttribute("value");
			String registrovisualizar = registro.getAttribute("value");
			String codigobasevisualizar = codigobase.getAttribute("value");
			String codigosituacaovisualizar = codigosituacao.getAttribute("value");
			String valortoalcalculoescrituravisualizar = valortoalcalculoescritura.getAttribute("value");
			String parcelvalortotalvisualizar = parcelvalortotal.getAttribute("value");
			String valortotalcalculocreditovisualizar = valortotalcalculocredito.getAttribute("value");
			String valorbasevisualizar = valorbase.getAttribute("value");
			String quantidadetotalvisualizar = quantidadetotal.getAttribute("value");
			String parcelabasevisualizar = parcelabase.getAttribute("value");
			
			System.out.println(empresavisualizar);
			System.out.println(ufvisualizar);
			System.out.println(filialvisualizar);
			System.out.println(tributovisualizar);
			System.out.println(registrovisualizar);
			System.out.println(codigobasevisualizar);
			System.out.println(codigosituacaovisualizar);
			System.out.println(valortoalcalculoescrituravisualizar);
			System.out.println(parcelvalortotalvisualizar);
			System.out.println(valortotalcalculocreditovisualizar);
			System.out.println(valorbasevisualizar);
			System.out.println(quantidadetotalvisualizar);
			System.out.println(parcelabasevisualizar);
			
			
			

			biblioteca.click();

			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			waitExpectElement(nao);
			nao.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			waitExpectElement(ultimaPagina);
			sleep(2000);

			ultimaPagina.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
			WebElement editar = driver.findElement(
					By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			actionsMoveToElementElement(menu1);
			sleep(2000);
			menu1.click();
			sleep(1000);
			editar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			waitExpectElement(uf);
			sleep(2000);
			waitExpectElement(filialtc2);
			sleep(2000);

			String empresaeditar = empresa.getAttribute("value");
			String ufeditar = uf.getText();
			String filialeditar = filialtc2.getText();
			String tributoeditar = tributo.getAttribute("value");
			String registroeditar = registro.getAttribute("value");
			String codigobaseeditar = codigobase.getAttribute("value");
			String codigosituacaoeditar = codigosituacao.getAttribute("value");
			String valortoalcalculoescrituraeditar = valortoalcalculoescritura.getAttribute("value");
			String parcelvalortotaleditar = parcelvalortotal.getAttribute("value");
			String valortotalcalculocreditoeditar = valortotalcalculocredito.getAttribute("value");
			String valorbaseeditar = valorbase.getAttribute("value");
			String quantidadetotaleditar = quantidadetotal.getAttribute("value");
			String parcelabaseeditar = parcelabase.getAttribute("value");
			

			System.out.println(empresaeditar);
			System.out.println(ufeditar);
			System.out.println(filialeditar);
			System.out.println(tributoeditar);
			System.out.println(registroeditar);
			System.out.println(codigobaseeditar);
			System.out.println(codigosituacaoeditar);
			System.out.println(valortoalcalculoescrituraeditar);
			System.out.println(parcelvalortotaleditar);
			System.out.println(valortotalcalculocreditoeditar);
			System.out.println(valorbaseeditar);
			System.out.println(quantidadetotaleditar);
			System.out.println(parcelabaseeditar);
			

			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

			sucesso.add(empresaeditar.contains(empresavisualizar));
			sucesso.add(ufeditar.contains(ufvisualizar));
			sucesso.add(filialeditar.contains(filialvisualizar));
			sucesso.add(tributoeditar.contains(tributovisualizar));
			sucesso.add(registroeditar.contains(registrovisualizar));
			sucesso.add(codigobaseeditar.contains(codigobasevisualizar));
			sucesso.add(codigosituacaoeditar.contains(codigosituacaovisualizar));
			sucesso.add(valortoalcalculoescrituraeditar.contains(valortoalcalculoescrituravisualizar));
			sucesso.add(parcelvalortotaleditar.contains(parcelvalortotalvisualizar));
			sucesso.add(valortotalcalculocreditoeditar.contains(valortotalcalculocreditovisualizar));
			sucesso.add(valorbaseeditar.contains(valorbasevisualizar));
			sucesso.add(quantidadetotaleditar.contains(quantidadetotalvisualizar));
			sucesso.add(parcelabaseeditar.contains(parcelabasevisualizar));
			
			
			
			System.out.println(sucesso);
			return sucesso;

		} else {

			waitExpectElement(uf);
			sleep(2000);
			waitExpectElement(filial);
			sleep(2000);
			String empresavisualizar = empresa.getAttribute("value");
			String ufvisualizar = uf.getText();
			String filialvisualizar = filial.getText();
			String tributovisualizar = tributo.getAttribute("value");
			String registrovisualizar = registro.getAttribute("value");
			String codigobasevisualizar = codigobase.getAttribute("value");
			String codigosituacaovisualizar = codigosituacao.getAttribute("value");
			String valortoalcalculoescrituravisualizar = valortoalcalculoescritura.getAttribute("value");
			String parcelvalortotalvisualizar = parcelvalortotal.getAttribute("value");
			String valortotalcalculocreditovisualizar = valortotalcalculocredito.getAttribute("value");
			String valorbasevisualizar = valorbase.getAttribute("value");
			String quantidadetotalvisualizar = quantidadetotal.getAttribute("value");
			String parcelabasevisualizar = parcelabase.getAttribute("value");
			
			System.out.println(empresavisualizar);
			System.out.println(ufvisualizar);
			System.out.println(filialvisualizar);
			System.out.println(tributovisualizar);
			System.out.println(registrovisualizar);
			System.out.println(codigobasevisualizar);
			System.out.println(codigosituacaovisualizar);
			System.out.println(valortoalcalculoescrituravisualizar);
			System.out.println(parcelvalortotalvisualizar);
			System.out.println(valortotalcalculocreditovisualizar);
			System.out.println(valorbasevisualizar);
			System.out.println(quantidadetotalvisualizar);
			System.out.println(parcelabasevisualizar);
			biblioteca.click();

			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			waitExpectElement(nao);
			nao.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			waitExpectElement(ultimaPagina);
			sleep(2000);

			ultimaPagina.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
			WebElement editar = driver.findElement(
					By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			actionsMoveToElementElement(menu1);
			sleep(2000);
			menu1.click();
			sleep(1000);
			editar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			waitExpectElement(uf);
			sleep(2000);
			waitExpectElement(filial);
			sleep(2000);

			String empresaeditar = empresa.getAttribute("value");
			String ufeditar = uf.getText();
			String filialeditar = filial.getText();
			String tributoeditar = tributo.getAttribute("value");
			String registroeditar = registro.getAttribute("value");
			String codigobaseeditar = codigobase.getAttribute("value");
			String codigosituacaoeditar = codigosituacao.getAttribute("value");
			String valortoalcalculoescrituraeditar = valortoalcalculoescritura.getAttribute("value");
			String parcelvalortotaleditar = parcelvalortotal.getAttribute("value");
			String valortotalcalculocreditoeditar = valortotalcalculocredito.getAttribute("value");
			String valorbaseeditar = valorbase.getAttribute("value");
			String quantidadetotaleditar = quantidadetotal.getAttribute("value");
			String parcelabaseeditar = parcelabase.getAttribute("value");
			

			System.out.println(empresaeditar);
			System.out.println(ufeditar);
			System.out.println(filialeditar);
			System.out.println(tributoeditar);
			System.out.println(registroeditar);
			System.out.println(codigobaseeditar);
			System.out.println(codigosituacaoeditar);
			System.out.println(valortoalcalculoescrituraeditar);
			System.out.println(parcelvalortotaleditar);
			System.out.println(valortotalcalculocreditoeditar);
			System.out.println(valorbaseeditar);
			System.out.println(quantidadetotaleditar);
			System.out.println(parcelabaseeditar);
			

			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

			sucesso.add(empresaeditar.contains(empresavisualizar));
			sucesso.add(ufeditar.contains(ufvisualizar));
			sucesso.add(filialeditar.contains(filialvisualizar));
			sucesso.add(tributoeditar.contains(tributovisualizar));
			sucesso.add(registroeditar.contains(registrovisualizar));
			sucesso.add(codigobaseeditar.contains(codigobasevisualizar));
			sucesso.add(codigosituacaoeditar.contains(codigosituacaovisualizar));
			sucesso.add(valortoalcalculoescrituraeditar.contains(valortoalcalculoescrituravisualizar));
			sucesso.add(parcelvalortotaleditar.contains(parcelvalortotalvisualizar));
			sucesso.add(valortotalcalculocreditoeditar.contains(valortotalcalculocreditovisualizar));
			sucesso.add(valorbaseeditar.contains(valorbasevisualizar));
			sucesso.add(quantidadetotaleditar.contains(quantidadetotalvisualizar));
			sucesso.add(parcelabaseeditar.contains(parcelabasevisualizar));
			
			

			
			System.out.println(sucesso);
			return sucesso;
		}

	}


}
