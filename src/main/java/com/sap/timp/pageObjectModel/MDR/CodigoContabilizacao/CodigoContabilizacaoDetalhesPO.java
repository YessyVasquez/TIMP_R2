package com.sap.timp.pageObjectModel.MDR.CodigoContabilizacao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigoContabilizacaoDetalhesPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Códigos de Contabilização\"]")
	public WebElement codigoContabilizacao;

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

	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div")
	public WebElement codigoContabilizacaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement descricaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement empresaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement contabilizarD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement tipoLancamentoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][8]/div[2]/div")
	public WebElement documentoContabilD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][9]/div[2]/div")
	public WebElement tributoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][11]/div[2]/div")
	public WebElement tipoTributoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][14]/div[2]/div")
	public WebElement dataVigenciaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][15]/div[2]/div")
	public WebElement ativoD;

	@FindBy(xpath = "//span[@id=\"accounting\"]")
	public WebElement codigoContabilizacaoV;
	@FindBy(xpath = "//span[@id=\"padrao\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"naccount\"]")
	public WebElement contabilizarV;
	@FindBy(xpath = "//span[@id=\"release\"]")
	public WebElement tipoLancamentoV;
	@FindBy(xpath = "//span[@id=\"segDoc\"]")
	public WebElement documentoContabilV;
	@FindBy(xpath = "//span[@id=\"tribute\"]")
	public WebElement tributoV;
	@FindBy(xpath = "//span[@id=\"typeTribute\"]")
	public WebElement tipoTributoV;
	@FindBy(xpath = "//span[@id=\"validity\"]")
	public WebElement dataVigenciaV;
	@FindBy(xpath = "//span[@id=\"ativo\"]")
	public WebElement ativoV;

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	public CodigoContabilizacaoDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {

		codigoContabilizacao.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("CodigoContabilizacao");

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


		String codigoContabilizacaoD1 = codigoContabilizacaoD.getText();
		String descricaoD1 = descricaoD.getText();
		String empresaD1 = empresaD.getText();
		String contabilizarD1 = contabilizarD.getText();
		String tipoLancamentoD1 = tipoLancamentoD.getText();
		String documentoContabilD1 = documentoContabilD.getText();
		String tributoD1 = tributoD.getText();
		String tipoTributoD1 = tipoTributoD.getText();
		String dataVigenciaD1 = dataVigenciaD.getText();
		String ativoD1 = ativoD.getText();


		System.out.println(codigoContabilizacaoD1);
		System.out.println(descricaoD1);
		System.out.println(empresaD1);
		System.out.println(contabilizarD1);
		System.out.println(tipoLancamentoD1);
		System.out.println(documentoContabilD1);
		System.out.println(tributoD1);
		System.out.println(tipoTributoD1);
		System.out.println(dataVigenciaD1);
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
		waitExpectElement(empresaV);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		String codigoContabilizacaoV1 = codigoContabilizacaoV.getText();
		String descricaoV1 = descricaoV.getText();
		String empresaV1 = empresaV.getText();
		String contabilizarV1 = contabilizarV.getText();
		String tipoLancamentoV1 = tipoLancamentoV.getText();
		String documentoContabilV1 = documentoContabilV.getText();
		String tributoV1 = tributoV.getText();
		String tipoTributoV1 = tipoTributoV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();
		String ativoV1 = ativoV.getText();



		System.out.println(codigoContabilizacaoV1);
		System.out.println(descricaoV1);
		System.out.println(empresaV1);
		System.out.println(contabilizarV1);
		System.out.println(tipoLancamentoV1);
		System.out.println(documentoContabilV1);
		System.out.println(tributoV1);
		System.out.println(tipoTributoV1);
		System.out.println(dataVigenciaV1);
		System.out.println(ativoV1);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();


		sucesso.add(codigoContabilizacaoV1.contains(codigoContabilizacaoD1));
		sucesso.add(descricaoV1.contains(descricaoD1));
		sucesso.add(empresaV1.contains(empresaD1));
		sucesso.add(contabilizarV1.contains(contabilizarD1));
		sucesso.add(tipoLancamentoV1.contains(tipoLancamentoD1));
		sucesso.add(documentoContabilV1.contains(documentoContabilD1));
		sucesso.add(tributoV1.contains(tributoD1));
		sucesso.add(tipoTributoV1.contains(tipoTributoD1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaD1));
		sucesso.add(ativoV1.contains(ativoD1));

		System.out.println(sucesso);

		return sucesso;

	}

}
