package com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class UtilizacaoDosCreditosNaApuracaoVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Controle de Crédito Tributário\"]")
	public WebElement controledecreditotributario;

	@FindBy(xpath = "//span[text()=\"Utilização dos Créditos na Apuração\"]")
	public WebElement utilizacaodoscreditosnaapuracao;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[1]")
	public WebElement empresa;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Utilização\"]")
	public WebElement utilizacao;

	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div[1]")
	public WebElement filial;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Ind. Desc. Cred\"]")
	public WebElement inddesccred;

	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div/div/div/div[1]")
	public WebElement tributo;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement datainicial;

	@FindBy(xpath = "//span[@id=\"companyCode\"]")
	public WebElement empresavi;

	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialvi;

	@FindBy(xpath = "//span[@id=\"TAX\"]")
	public WebElement tributovi;

	@FindBy(xpath = "//span[@id=\"utilization\"]")
	public WebElement utilizacaovi;

	@FindBy(xpath = "//span[@id=\"indDescCred\"]")
	public WebElement indesccredvi;

	@FindBy(xpath = "//span[@id=\"validityOf\"]")
	public WebElement datavi;

	public UtilizacaoDosCreditosNaApuracaoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		String url = driver.getCurrentUrl();

		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;

		if (url.contains("tc2")) {
			tc2 = true;
		} else if (url.contains("tp1")) {
			tp1 = true;
		} else if (url.contains("tq1")) {
			tq1 = true;
		} else {
			td1 = true;
		}

		sleep(2000);
		controledecreditotributario.click();
		sleep(2000);

		utilizacaodoscreditosnaapuracao.click();

		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		// pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("UtilizacaoDosCreditosNaApuracao");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);

		visualizar.click();
		sleep(2000);
		// visualizar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		// visualizar
		// attributeToBeXpath("//table[@class=\"edit\"]", "class", "edit");
		// sleep(2000);
		waitExpectElement(empresavi);
		sleep(2000);
		String empresavisualizar = empresavi.getText();
		String filialvisualizar = filialvi.getText();
		String tributovisualizar = tributovi.getText();
		String utilizacaovisualizar = utilizacaovi.getText();
		String inddesccredvisualizar = indesccredvi.getText();
		String datavisualizar = datavi.getText();

		System.out.println(empresavisualizar);
		System.out.println(filialvisualizar);
		System.out.println(tributovisualizar);
		System.out.println(utilizacaovisualizar);
		System.out.println(inddesccredvisualizar);
		System.out.println(datavisualizar);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		// pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("UtilizacaoDosCreditosNaApuracao");

		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro1 + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro1 + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);

		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		// editar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		String empresaeditar = empresa.getText();
		String utilizacaoeditar = utilizacao.getAttribute("value");
		String filialeditar = filial.getText();
		String inddesccrededitar = inddesccred.getAttribute("value");
		String tributoeditar = tributo.getText();
		String dataeditar = datainicial.getAttribute("value");

		System.out.println(empresaeditar);
		System.out.println(utilizacaoeditar);
		System.out.println(filialeditar);
		System.out.println(inddesccrededitar);
		System.out.println(tributoeditar);
		System.out.println(dataeditar);

		sucesso.add(empresavisualizar.equals(empresaeditar));
		sucesso.add(utilizacaovisualizar.equals(utilizacaoeditar));
		sucesso.add(filialvisualizar.equals(filialeditar));
		sucesso.add(inddesccredvisualizar.equals(inddesccrededitar));
		sucesso.add(tributovisualizar.equals(tributoeditar));
		sucesso.add(datavisualizar.equals(dataeditar));

		return sucesso;

	}

}
