package com.sap.timp.pageObjectModel.MDR.TaxasDeActualizacao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AliquotasDeTaxaActualizarDetalhesPO extends TestBaseSteven {
	

	@FindBy(xpath = "//span[text()=\"Taxas de Atualização\"]")
	public WebElement taxa;

	@FindBy(xpath = "//span[text()=\"Alíquotas de Taxa de Atualização\"]")
	public WebElement aliquota;

	@FindBy(xpath = "//span[text()=\"Novas configurações e informações de Valores  \"]")
	public WebElement novo;

	@FindBy(xpath = "//input[@placeholder=\"Preencher o Código Ajuste de Informações de Valores\"]")
	public WebElement codigo;

	@FindBy(xpath = "//textarea[@placeholder=\"Preencher a descrição do Ajustes e Informações de Valores Provenientes de Documento Fiscal\"]")
	public WebElement descricao;

	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
	public WebElement datadeiniciodevigencia;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;

	@FindBy(xpath = "//span[text()=\"Novo Valor Declaratório\"]")
	public WebElement novovalor;

	@FindBy(xpath = "//input[@placeholder=\"Preencher o Código de Valores Declaratórios\"]")
	public WebElement codigodevalores;

	@FindBy(xpath = "//input[@placeholder=\"Preencher o Reflexo na Apuração ICMS\"]")
	public WebElement icms;

	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
	public WebElement datavigencia;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement codigoIndiceD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement valorD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement fatorAcumuladoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement taxaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement valorPeriodoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][7]/div[2]/div")
	public WebElement incioTaxaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][8]/div[2]/div")
	public WebElement fimTaxaD;


	@FindBy(xpath = "//span[@id=\"indexCode\"]")
	public WebElement codigoIndiceV;
	@FindBy(xpath = "//span[@id=\"value\"]")
	public WebElement valorV;
	@FindBy(xpath = "//span[@id=\"accumulatedFactor\"]")
	public WebElement fatorAcumuladoV;
	@FindBy(xpath = "//span[@id=\"rate\"]")
	public WebElement taxaV;
	@FindBy(xpath = "//span[@id=\"periodValue\"]")
	public WebElement valorPeriodoV;
	@FindBy(xpath = "//span[@id=\"rateStartDate\"]")
	public WebElement inicioTaxaV;
	@FindBy(xpath = "//span[@id=\"rateEndDate\"]")
	public WebElement fimTaxaV;


	public AliquotasDeTaxaActualizarDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		taxa.click();
		sleep(2000);

		aliquota.click();

		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		// pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("taxasdeactualizacao");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);

		String codigoIndiceD1 = codigoIndiceD.getText();
		String valorD1 = valorD.getText();
		String fatorAcumuladoD1 = fatorAcumuladoD.getText();
		String taxaD1 = taxaD.getText();
		String valorPeriodoD1 = valorPeriodoD.getText();
		String inicioTaxaD1 = incioTaxaD.getText();
		String fimTaxaD1 = fimTaxaD.getText();


		System.out.println(codigoIndiceD1);
		System.out.println(valorD1);
		System.out.println(fatorAcumuladoD1);
		System.out.println(taxaD1);
		System.out.println(valorPeriodoD1);
		System.out.println(inicioTaxaD1);
		System.out.println(fimTaxaD1);


		sleep(2000);
		fechar.click();

		actionsMoveToElementElement(menu);

		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String codigoIndiceV1 = codigoIndiceV.getText();
		String valorV1 = valorV.getText();
		String fatorAcumuladoV1 = fatorAcumuladoV.getText();
		String taxaV1 = taxaV.getText();
		String valorPeriodoV1 = valorPeriodoV.getText();
		String inicioTaxaV1 = inicioTaxaV.getText();
		String fimTaxaV1 = fimTaxaV.getText();


		System.out.println(codigoIndiceV1);
		System.out.println(valorV1);
		System.out.println(fatorAcumuladoV1);
		System.out.println(taxaV1);
		System.out.println(valorPeriodoV1);
		System.out.println(inicioTaxaV1);
		System.out.println(fimTaxaV1);


		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(codigoIndiceV1.contains(codigoIndiceD1));
		sucesso.add(valorV1.contains(valorD1));
		sucesso.add(fatorAcumuladoV1.contains(fatorAcumuladoD1));
		sucesso.add(taxaV1.contains(taxaD1));
		sucesso.add(valorPeriodoV1.contains(valorPeriodoD1));
		sucesso.add(inicioTaxaV1.contains(inicioTaxaD1));
		sucesso.add(fimTaxaV1.contains(fimTaxaD1));

		System.out.println(sucesso);

		return sucesso;

	}

}
