package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaServicos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaServicosDetalhesPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement obrigacoes;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Serviços\"]")
	public WebElement tabelaServicos;

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

	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement codigoUFD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement obrigacaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement codigoServicoSistemaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement descricaoServicoSistemaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement codigoServicoObrigacaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][7]/div[2]/div")
	public WebElement descricaoServicoObrigacaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][8]/div[2]/div")
	public WebElement ativoD;


	@FindBy(xpath = "//span[@id=\"ufIbge\"]")
	public WebElement codigoUFV;
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaoV;
	@FindBy(xpath = "//span[@id=\"servicesCode\"]")
	public WebElement codigoServicoSistemaV;
	@FindBy(xpath = "//span[@id=\"servicesDescription\"]")
	public WebElement descricaoServicoSistemaV;
	@FindBy(xpath = "//span[@id=\"serviceObligationCode\"]")
	public WebElement codigoServicoObrigacaoV;
	@FindBy(xpath = "//span[@id=\"serviceObligationDescription\"]")
	public WebElement descricaoServicoObrigacaoV;
	@FindBy(xpath = "//span[@id=\"active\"]")
	public WebElement ativoV;


	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	public TabelaServicosDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {

		sleep(2000);
		obrigacoes.click();
		sleep(2000);
		tabelaServicos.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("TabelaServicos");

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

		String codigoUFD1 = codigoUFD.getText();
		String obrigacaoD1 = obrigacaoD.getText();
		String codigoServicoSistemaD1 = codigoServicoSistemaD.getText();
		String descricaoServicoSistemaD1 = descricaoServicoSistemaD.getText();
		String codigoServicoObrigacaoD1 = codigoServicoObrigacaoD.getText();
		String descricaoServicoObrigacaoD1 = descricaoServicoObrigacaoD.getText();
		String ativoD1 = ativoD.getText();


		System.out.println(codigoUFD1);
		System.out.println(obrigacaoD1);
		System.out.println(codigoServicoSistemaD1);
		System.out.println(descricaoServicoSistemaD1);
		System.out.println(codigoServicoObrigacaoD1);
		System.out.println(descricaoServicoObrigacaoD1);
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

		String codigoUFV1 = codigoUFV.getText();
		String obrigacaoV1 = obrigacaoV.getText();
		String codigoServicoSistemaV1 = codigoServicoSistemaV.getText();
		String descricaoServicoSistemaV1 = descricaoServicoSistemaV.getText();
		String codigoServicoObrigacaoV1 = codigoServicoObrigacaoV.getText();
		String descricaoServicoObrigacaoV1 = descricaoServicoObrigacaoV.getText();
		String ativoV1 = ativoV.getText();


		System.out.println(codigoUFV1);
		System.out.println(obrigacaoV1);
		System.out.println(codigoServicoSistemaV1);
		System.out.println(descricaoServicoSistemaV1);
		System.out.println(codigoServicoObrigacaoV1);
		System.out.println(descricaoServicoObrigacaoV1);
		System.out.println(ativoV1);


		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(codigoUFV1.contains(codigoUFD1));
		sucesso.add(obrigacaoV1.contains(obrigacaoD1));
		sucesso.add(codigoServicoSistemaV1.contains(codigoServicoSistemaD1));
		sucesso.add(descricaoServicoSistemaV1.contains(descricaoServicoSistemaD1));
		sucesso.add(codigoServicoObrigacaoV1.contains(codigoServicoObrigacaoD1));
		sucesso.add(descricaoServicoObrigacaoV1.contains(descricaoServicoObrigacaoD1));
		sucesso.add(ativoV1.contains(ativoD1));


		System.out.println(sucesso);

		return sucesso;

	}

}
