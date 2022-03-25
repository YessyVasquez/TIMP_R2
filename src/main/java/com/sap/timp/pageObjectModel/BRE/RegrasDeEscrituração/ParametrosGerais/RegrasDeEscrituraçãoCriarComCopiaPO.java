package com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais;

import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RegrasDeEscrituraçãoCriarComCopiaPO extends TestBaseFernando {
	@FindBy(xpath = "//li[@identifier=\"accordion-item-b_rules\"]")
	public WebElement regraDeEscrituracao;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;

	@FindBy(xpath = "//td[contains(@class, \"title-field\")]/div/div/input")
	public WebElement nome;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash_rules\"]")
	public WebElement lixeiraM;

	@FindBy(xpath = "//td[contains(@class, \"tribute-field\")]/div/div/div[2]")
	public WebElement tipoTributo;

	@FindBy(xpath = "//div[@class=\"list-option\"]/div/div[text()=\"ICMS\"]")
	public WebElement opcionTipoTributo;

	@FindBy(xpath = "//td[contains(@class, \"datastructureCategory-field\")]/div/div/div[2]")
	public WebElement grupoDeEstrutura;

	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Ajuste\"][1]")
	public WebElement opcionGrupoDeEstrutura;

	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Ajustes\"][1]")
	public WebElement opcionGrupoDeEstruturaTP1;

	@FindBy(xpath = "//td[contains(@class, \"datastructure-field\")]/div/div/div[2]")
	public WebElement estruturaDeDatos;

	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Ajustes Fiscais\"][1]")
	public WebElement opcionEstruturaDeDatos;

	@FindBy(xpath = "//td[contains(@class, \"regulation-field\")]/div/div/div[2]")
	public WebElement regulamento;

	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"TA-TESTE\"][1]")
	public WebElement opcionRegulamento;

	@FindBy(xpath = "//td[contains(@class, \"EffectiveDateFrom\")]/div/div/input")
	public WebElement dataValidadeDe;

	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;

	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarCaminho;

	@FindBy(xpath = "//div[@class=\"select-one\"]/div/div[2]")
	public WebElement cboCondicoes;

	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Alíquota ICMS (ED)\"][1]")
	public WebElement opcionCondicoes;

	@FindBy(xpath = "//div[@class=\"select-three\"]/div/div/div[2]/div/div[2]")
	public WebElement cboCondicoesOperador;

	@FindBy(xpath = "//div[contains(@class,\"list-item\") and @id]/div[text()=\"<\"]")
	public WebElement opcionCondicoesOperador;

	@FindBy(xpath = "//div[@class=\"value-one\"]/div/div[2]")
	public WebElement cboNomeDoValor;

	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"BC ICMS (ED)\"][1]")
	public WebElement opcioncboNomeDoValor;

	@FindBy(xpath = "//div[@class=\"action-section\"]/div/div/div/div/input")
	public WebElement acoes;

	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement btnJustificactiva;

	@FindBy(xpath = "//div[@id=\"justification\"]/div/textarea")
	public WebElement justificativa;

	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;

	@FindBy(xpath = "//div[@id=\"graph\"]")
	public WebElement regla;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;

	public RegrasDeEscrituraçãoCriarComCopiaPO() {
		PageFactory.initElements(driver, this);
	}

	public boolean criar() {

		String url = driver.getCurrentUrl();

		boolean tp1 = false;

		if (url.contains("tp1")) {
			tp1 = true;
		}

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(2000);
		regraDeEscrituracao.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(26000);

		String idRegistro = idObter("RegraDeEscrituracao");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement copiar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Copiar\"]"));

		menu.click();
		sleep(1000);
		copiar.click();
		sleep(3000);
		waitExpectElement(nome);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		nome.clear();
		sleep(1000);
		nome.sendKeys("TA-TESTE - NÃO MEXER CÓPIA");
		sleep(2000);

		aplicar.click();
		sleep(2000);
		waitExpectElement(adicionarCaminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnBiblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(2000);
		regraDeEscrituracao.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();

		String idB = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[3]/div"))
				.getText();
		idInserir3(idB);

		System.out.println(idRegistro);
		System.out.println(idB);
		double idD = convertToDouble(idRegistro);
		double idBD = convertToDouble(idB);

		boolean sucesso = false;

		if (idBD > idD) {
			sucesso = true;
		} else {
			sucesso = false;
		}

		System.out.println(sucesso + " Cricação da Cópia");

		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idObter3() + "\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\"" + idObter3() + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));

		menu.click();
		sleep(1000);
		excluir.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//li[contains(@class,\"toast-success\")]/div/span[3]");
		sleep(1000);

		return sucesso;
	}

	public ArrayList<Boolean> excluir() {

		String idRegistro = idObter3();

		lixeiraM.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();

		String idB = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[3]/div"))
				.getText();

		System.out.println(idRegistro + " Excluido");
		System.out.println(idB + " Último Registro");

		double idD = convertToDouble(idRegistro);
		double idBD = convertToDouble(idB);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		if (idBD == idD) {
			sucesso.add(true);
		} else {
			sucesso.add(false);
		}

		System.out.println(sucesso + " Cópia Enviada à Lixeira");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement excluir = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));

		menu.click();
		sleep(1000);
		excluir.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//li[contains(@class,\"toast-success\")]/div/span[3]");
		sleep(1000);

		lixeiraM.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();

		idB = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[3]/div"))
				.getText();

		idBD = convertToDouble(idB);

		System.out.println(idD + " Excluido");
		System.out.println(idB + " Último Registro");
		if (idBD != idD) {
			sucesso.add(true);
		} else {
			sucesso.add(false);
		}

		System.out.println(sucesso + " Cópia Excluida");

		return sucesso;
	}

}
