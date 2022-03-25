package com.sap.timp.pageObjectModel.MDR.LimiteCompetencia;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class LimiteCompetenciaVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Limite de Competência\"]")
	public WebElement limiteCompetencia;

	@FindBy(xpath = "//span[text()=\"Códigos de Ajustes\"]")
	public WebElement codigo;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//textarea[contains(@placeholder,\"Descrição Padrão\")]")
	public WebElement campo;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[@id]")
	public WebElement empresaE;
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div/div/div/div[@id]")
	public WebElement ufE;
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div[@id]")
	public WebElement filialE;
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div/div/div/div[@id]")
	public WebElement tributoE;
	@FindBy(xpath = "//div[@id=\"tax-type\"]/div/div/div/div/div/div[@id]")
	public WebElement tipoImpostoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Tipo de Processo\")]")
	public WebElement tipoProcessoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Preencher Característica de Aprovação\")]")
	public WebElement caracteristicaAprovacaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Nível de Aprovação\")]")
	public WebElement nivelAprovacaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Valor de\")]")
	public WebElement valorDEE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Valor até\")]")
	public WebElement valorAteE;

	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement companyV;
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributoV;
	@FindBy(xpath = "//span[@id=\"taxType\"]")
	public WebElement tipoImpostoV;
	@FindBy(xpath = "//span[@id=\"process-type\"]")
	public WebElement tipoProcessoV;
	@FindBy(xpath = "//span[@id=\"approval-characteristic\"]")
	public WebElement caracteristicaAprovacaoV;
	@FindBy(xpath = "//span[@id=\"approval-level\"]")
	public WebElement nivelAprovacaoV;
	@FindBy(xpath = "//span[@id=\"value-from\"]")
	public WebElement valorDeV;
	@FindBy(xpath = "//span[@id=\"value-to\"]")
	public WebElement valorAteV;

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	public LimiteCompetenciaVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		limiteCompetencia.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("LimiteCompetencia");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);

		String empresaV1 = companyV.getText();
		String ufV1 = ufV.getText();
		String filialV1 = filialV.getText();
		String tributoV1 = tributoV.getText();
		String tipoImpostoV1 = tipoImpostoV.getText();
		String tipoProcessoV1 = tipoProcessoV.getText();
		String caracteristicaAprovacaoV1 = caracteristicaAprovacaoV.getText();
		String nivelAprovacaoV1 = nivelAprovacaoV.getText();
		String valorDeV1 = valorDeV.getText();
		valorDeV1 = valorDeV1.replace("R$ ", "").trim();
		String valorAteV1 = valorAteV.getText();
		valorAteV1 = valorAteV1.replace("R$ ", "").trim();

		System.out.println(empresaV1);
		System.out.println(ufV1);
		System.out.println(filialV1);
		System.out.println(tributoV1);
		System.out.println(tipoImpostoV1);
		System.out.println(tipoProcessoV1);
		System.out.println(caracteristicaAprovacaoV1);
		System.out.println(nivelAprovacaoV1);
		System.out.println(valorDeV1);
		System.out.println(valorAteV1);

		sleep(2000);

		biblioteca.click();

		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		attributeToBeXpath("//div[@id=\"tax-type\"]/div", "class", "base-MultipleSelect3 required");
		attributeToBeXpath("//div[@id=\"approval-level\"]/div", "class", "base-select required");
		sleep(5000);

		String empresaE1 = empresaE.getAttribute("textContent");
		String ufE1 = ufE.getAttribute("textContent");
		String filialE1 = filialE.getAttribute("textContent");
		String tributoE1 = tributoE.getAttribute("textContent");
		String tipoImpostoE1 = tipoImpostoE.getAttribute("textContent");
		String tipoProcessoE1 = tipoProcessoE.getAttribute("value");
		String caracteristicaAprovacaoE1 = caracteristicaAprovacaoE.getAttribute("value");
		String nivelAprovacaoE1 = nivelAprovacaoE.getAttribute("value");
		String valorDEE1 = valorDEE.getAttribute("value");
		String valorAteE1 = valorAteE.getAttribute("value");

		System.out.println(empresaE1);
		System.out.println(ufE1);
		System.out.println(filialE1);
		System.out.println(tributoE1);
		System.out.println(tipoImpostoE1);
		System.out.println(tipoProcessoE1);
		System.out.println(caracteristicaAprovacaoE1);
		System.out.println(nivelAprovacaoE1);
		System.out.println(valorDEE1);
		System.out.println(valorAteE1);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(empresaE1.contains(empresaV1));
		sucesso.add(ufE1.contains(ufV1));
		sucesso.add(filialE1.contains(filialV1));
		sucesso.add(tributoE1.contains(tributoV1));
		sucesso.add(tipoImpostoE1.contains(tipoImpostoV1));
		sucesso.add(tipoProcessoE1.contains(tipoProcessoV1));
		sucesso.add(caracteristicaAprovacaoE1.contains(caracteristicaAprovacaoV1));
		sucesso.add(nivelAprovacaoE1.contains(nivelAprovacaoV1));
		sucesso.add(valorDEE1.contains(valorDeV1));
		sucesso.add(valorAteE1.contains(valorAteV1));

		System.out.println(sucesso);
		return sucesso;

	}

}
