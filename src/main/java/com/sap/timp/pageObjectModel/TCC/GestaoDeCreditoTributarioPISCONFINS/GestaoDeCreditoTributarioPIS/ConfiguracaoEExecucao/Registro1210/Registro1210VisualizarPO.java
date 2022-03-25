package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.Registro1210;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class Registro1210VisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS\"]")
	public WebElement gestaocreditopis;

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]")
	public WebElement configuracaoEExecucao;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisRegister1210\"]")
	public WebElement registro1210;

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

	@FindBy(xpath = "//div[@id=\"componentToSearchId-1000_SP_0014\"]")
	public WebElement filialtc2;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo\"]")
	public WebElement tributo;

	@FindBy(xpath = "//div[@id=\"reg\"]/div/div/input")
	public WebElement registro;

	@FindBy(xpath = "//input[@placeholder=\"Preencher CNPJ Cedente\"]")
	public WebElement cnpj;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data de referência\"]")
	public WebElement data;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor da operação \"]")
	public WebElement valor;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Base de cálculo do PIS/PASEP \"]")
	public WebElement base;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Alíquota da PIS \"]")
	public WebElement aliquota;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar valor do PIS/PASEP \"]")
	public WebElement valorpispasep;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;

	String URL = driver.getCurrentUrl();

	public Registro1210VisualizarPO() {
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

		gestaocreditopis.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registro1210.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("GestaoCréditoTributárioPISRegistro1210");
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

		/*
		 * attributeToBeXpath("//div[@id=\"uf\"]/div", "class",
		 * "base-MultipleSelect3 required"); sleep(3000);
		 * attributeToBeXpath("//div[@id=\"branch\"]/div", "class",
		 * "base-MultipleSelect3 required"); sleep(3000);
		 */
		/*
		 * attributoNotToBeEmptyXpath("//div[@id=\"uf\"]/div", "value"); sleep(2000);
		 * attributoNotToBeEmptyXpath("//div[@id=\"branch\"]/div", "value");
		 * sleep(2000);
		 */

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
			String cnpjvisualizar = cnpj.getAttribute("value");
			String datavisualizar = data.getAttribute("value");
			String valorvisualizar = valor.getAttribute("value");
			String basevisualizar = base.getAttribute("value");
			String aliquotavisualizar = aliquota.getAttribute("value");
			String valorpispasepvisualizar = valorpispasep.getAttribute("value");

			System.out.println(empresavisualizar);
			System.out.println(ufvisualizar);
			System.out.println(filialvisualizar);
			System.out.println(tributovisualizar);
			System.out.println(registrovisualizar);
			System.out.println(cnpjvisualizar);
			System.out.println(datavisualizar);
			System.out.println(valorvisualizar);
			System.out.println(basevisualizar);
			System.out.println(aliquotavisualizar);
			System.out.println(valorpispasepvisualizar);

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
			String cnpjeditar = cnpj.getAttribute("value");
			String dataeditar = data.getAttribute("value");
			String valoreditar = valor.getAttribute("value");
			String baseeditar = base.getAttribute("value");
			String aliquotaeditar = aliquota.getAttribute("value");
			String valorpispasepeditar = valorpispasep.getAttribute("value");

			System.out.println(empresaeditar);
			System.out.println(ufeditar);
			System.out.println(filialeditar);
			System.out.println(tributoeditar);
			System.out.println(registroeditar);
			System.out.println(cnpjeditar);
			System.out.println(dataeditar);
			System.out.println(valoreditar);
			System.out.println(baseeditar);
			System.out.println(aliquotaeditar);
			System.out.println(valorpispasepeditar);

			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

			sucesso.add(empresaeditar.contains(empresavisualizar));
			sucesso.add(ufeditar.contains(ufvisualizar));
			sucesso.add(filialeditar.contains(filialvisualizar));
			sucesso.add(tributoeditar.contains(tributovisualizar));
			sucesso.add(registroeditar.contains(registrovisualizar));
			sucesso.add(cnpjeditar.contains(cnpjvisualizar));
			sucesso.add(dataeditar.contains(datavisualizar));
			sucesso.add(valoreditar.contains(valorvisualizar));
			sucesso.add(baseeditar.contains(basevisualizar));
			sucesso.add(aliquotaeditar.contains(aliquotavisualizar));
			sucesso.add(valorpispasepeditar.contains(valorpispasepvisualizar));
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
			String cnpjvisualizar = cnpj.getAttribute("value");
			String datavisualizar = data.getAttribute("value");
			String valorvisualizar = valor.getAttribute("value");
			String basevisualizar = base.getAttribute("value");
			String aliquotavisualizar = aliquota.getAttribute("value");
			String valorpispasepvisualizar = valorpispasep.getAttribute("value");

			System.out.println(empresavisualizar);
			System.out.println(ufvisualizar);
			System.out.println(filialvisualizar);
			System.out.println(tributovisualizar);
			System.out.println(registrovisualizar);
			System.out.println(cnpjvisualizar);
			System.out.println(datavisualizar);
			System.out.println(valorvisualizar);
			System.out.println(basevisualizar);
			System.out.println(aliquotavisualizar);
			System.out.println(valorpispasepvisualizar);

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
			String cnpjeditar = cnpj.getAttribute("value");
			String dataeditar = data.getAttribute("value");
			String valoreditar = valor.getAttribute("value");
			String baseeditar = base.getAttribute("value");
			String aliquotaeditar = aliquota.getAttribute("value");
			String valorpispasepeditar = valorpispasep.getAttribute("value");

			System.out.println(empresaeditar);
			System.out.println(ufeditar);
			System.out.println(filialeditar);
			System.out.println(tributoeditar);
			System.out.println(registroeditar);
			System.out.println(cnpjeditar);
			System.out.println(dataeditar);
			System.out.println(valoreditar);
			System.out.println(baseeditar);
			System.out.println(aliquotaeditar);
			System.out.println(valorpispasepeditar);

			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

			sucesso.add(empresaeditar.contains(empresavisualizar));
			sucesso.add(ufeditar.contains(ufvisualizar));
			sucesso.add(filialeditar.contains(filialvisualizar));
			sucesso.add(tributoeditar.contains(tributovisualizar));
			sucesso.add(registroeditar.contains(registrovisualizar));
			sucesso.add(cnpjeditar.contains(cnpjvisualizar));
			sucesso.add(dataeditar.contains(datavisualizar));
			sucesso.add(valoreditar.contains(valorvisualizar));
			sucesso.add(baseeditar.contains(basevisualizar));
			sucesso.add(aliquotaeditar.contains(aliquotavisualizar));
			sucesso.add(valorpispasepeditar.contains(valorpispasepvisualizar));
			System.out.println(sucesso);
			return sucesso;

		}

	}

}
