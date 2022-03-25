package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.AjusteEInformaçoesDeValores;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AjusteEInformaçoesDeValoresDetalhesPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;

	@FindBy(xpath = "//span[text()=\"5.3 Ajustes e Informação de Valores Provenientes de Documento Fiscal\"]")
	public WebElement ajusteeinformacao;

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

	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div")
	public WebElement codigoAjusteD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement descricaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement ufD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement tipoApuracaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement responsabilidadeD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement influenciaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][7]/div[2]/div")
	public WebElement origemD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][8]/div[2]/div")
	public WebElement ativoD;

	@FindBy(xpath = "//span[@id=\"Code\"]")
	public WebElement codigoAjusteV;
	@FindBy(xpath = "//span[@id=\"Description\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"UF\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"Calculation\"]")
	public WebElement tipoApuracaoV;
	@FindBy(xpath = "//span[@id=\"Responsability\"]")
	public WebElement responsabilidadeV;
	@FindBy(xpath = "//span[@id=\"Pickup\"]")
	public WebElement influienciaV;
	@FindBy(xpath = "//span[@id=\"Origin\"]")
	public WebElement origemV;
	@FindBy(xpath = "//span[@id=\"Inactive\"]")
	public WebElement ativoV;

	public AjusteEInformaçoesDeValoresDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);

		ajusteeinformacao.click();

		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		// pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("ajusteeinformacoesdevalores");

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

		String codigoAjusteD1 = codigoAjusteD.getText();
		String descricaoD1 = descricaoD.getText();
		String ufD1 = ufD.getText();
		String tipoApuracaoD1 = tipoApuracaoD.getText();
		String responsabilidadeD1 = responsabilidadeD.getText();
		String influenciaD1 = influenciaD.getText();
		String origemD1 = origemD.getText();
		String ativoD1 = ativoD.getText();

		System.out.println(codigoAjusteD1);
		System.out.println(descricaoD1);
		System.out.println(ufD1);
		System.out.println(tipoApuracaoD1);
		System.out.println(responsabilidadeD1);
		System.out.println(influenciaD1);
		System.out.println(origemD1);
		System.out.println(ativoD1);

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

		String codigoAjusteV1 = codigoAjusteV.getText();
		String descricaoV1 = descricaoV.getText();
		String ufV1 = ufV.getText();
		String tipoApuracaoV1 = tipoApuracaoV.getText();
		String responsabilidadeV1 = responsabilidadeV.getText();
		String influenciaV1 = influienciaV.getText();
		String origemV1 = origemV.getText();
		String ativoV1 = ativoV.getText();

		System.out.println(codigoAjusteV1);
		System.out.println(descricaoV1);
		System.out.println(ufV1);
		System.out.println(tipoApuracaoV1);
		System.out.println(responsabilidadeV1);
		System.out.println(influenciaV1);
		System.out.println(origemV1);
		System.out.println(ativoV1);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(codigoAjusteV1.contains(codigoAjusteD1));
		sucesso.add(descricaoV1.contains(descricaoD1));
		sucesso.add(ufV1.contains(ufD1));
		sucesso.add(tipoApuracaoV1.contains(tipoApuracaoD1));
		sucesso.add(responsabilidadeV1.contains(responsabilidadeD1));
		sucesso.add(influenciaV1.contains(influenciaD1));
		sucesso.add(origemV1.contains(origemD1));
		sucesso.add(ativoV1.contains(ativoD1));

		System.out.println(sucesso);

		return sucesso;

	}

}
