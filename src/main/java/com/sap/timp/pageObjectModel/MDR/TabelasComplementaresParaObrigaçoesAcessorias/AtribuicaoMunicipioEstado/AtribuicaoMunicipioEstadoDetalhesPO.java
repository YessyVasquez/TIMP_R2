package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.AtribuicaoMunicipioEstado;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AtribuicaoMunicipioEstadoDetalhesPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement obrigacoes;
	
	@FindBy(xpath = "//span[contains(text(),\"Atribuição de Municípios por Estado\")]")
	public WebElement atribuicaoMunicipio;
	

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

	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement codigoUFD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement descricaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement codigoMunicipioD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement codigoIBGED;
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement ativoD;


	@FindBy(xpath = "//span[@id=\"ufIbge\"]")
	public WebElement codigoUFV;
	@FindBy(xpath = "//span[@id=\"descriptionIbge\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"codeIbge\"]")
	public WebElement codigoIBGEV;
	@FindBy(xpath = "//span[@id=\"municipalCodeIbge\"]")
	public WebElement codigoMunicipioV;
	@FindBy(xpath = "//span[@id=\"active\"]")
	public WebElement ativoV;
	

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	public AtribuicaoMunicipioEstadoDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {
		
		sleep(2000);
		obrigacoes.click();
		sleep(2000);
		atribuicaoMunicipio.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("AtribuicaoMunicipioEstado");

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
		String descricaoD1 = descricaoD.getText();
		String codigoIBGED1 = codigoIBGED.getText();
		String codigoMunicipioD1 = codigoMunicipioD.getText();
		String ativoD1 = ativoD.getText();
		
		System.out.println(codigoUFD1);
		System.out.println(descricaoD1);
		System.out.println(codigoIBGED1);
		System.out.println(codigoMunicipioD1);
		System.out.println(ativoD1);
		
		sleep(2000);
		fechar.click();


		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String codigoUFV1 = codigoUFV.getText();
		String descricaoV1 = descricaoV.getText();
		String codigoIBGEV1 = codigoIBGEV.getText();
		String codigoMunicipioV1 = codigoMunicipioV.getText();
		String ativoV1 = ativoV.getText();
		
		System.out.println(codigoUFV1);
		System.out.println(descricaoV1);
		System.out.println(codigoIBGEV1);
		System.out.println(codigoMunicipioV1);
		System.out.println(ativoV1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(codigoUFV1.contains(codigoUFD1));
		sucesso.add(descricaoV1.contains(descricaoD1));
		sucesso.add(codigoIBGEV1.contains(codigoIBGED1));
		sucesso.add(codigoMunicipioV1.contains(codigoMunicipioD1));
		sucesso.add(ativoV1.contains(ativoD1));
		
		System.out.println(sucesso);
		
		return sucesso;
		


	}

}
