package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaMunicipiosIBGE;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaMunicipioIBGEDetalhesPO extends TestBaseSteven {

	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement obrigacoes;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Municípios IBGE\"]")
	public WebElement tabelaMunicipios;

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
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement descricaoMunicipioD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement codigoIBGED;
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement ativoD;


	@FindBy(xpath = "//span[@id=\"ufIbge\"]")
	public WebElement codigoUFV;
	@FindBy(xpath = "//span[@id=\"descriptionIbge\"]")
	public WebElement descricaoMunicipioV;
	@FindBy(xpath = "//span[@id=\"codeIbge\"]")
	public WebElement codigoIBGEV;
	@FindBy(xpath = "//span[@id=\"active\"]")
	public WebElement ativoV;


	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	public TabelaMunicipioIBGEDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {
		
		sleep(2000);
		obrigacoes.click();
		sleep(2000);
		tabelaMunicipios.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("TabelaMunicipioIBGE");

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
		String descricaoMunicipioD1 = descricaoMunicipioD.getText();
		String codigoIBGED1 = codigoIBGED.getText();
		String ativoD1 = ativoD.getText();


		System.out.println(codigoUFD1);
		System.out.println(descricaoMunicipioD1);
		System.out.println(codigoIBGED1);
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
		String descricaoMunicipioV1 = descricaoMunicipioV.getText();
		String codigoIBGEV1 = codigoIBGEV.getText();
		String ativoV1 = ativoV.getText();


		System.out.println(codigoUFV1);
		System.out.println(descricaoMunicipioV1);
		System.out.println(codigoIBGEV1);
		System.out.println(ativoV1);


		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(codigoUFV1.contains(codigoUFD1));
		sucesso.add(descricaoMunicipioV1.contains(descricaoMunicipioD1));
		sucesso.add(codigoIBGEV1.contains(codigoIBGED1));
		sucesso.add(ativoV1.contains(ativoD1));


		System.out.println(sucesso);

		return sucesso;

	}

}
