package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaMunicipiosIBGE;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaMunicipioIBGEVisualizarPO extends TestBaseSteven {

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

	@FindBy(xpath = "//input[contains(@placeholder,\"Código UF\")]")
	public WebElement codigoUFE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Código IBGE\")]")
	public WebElement codigoIBGEE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Descrição do Município\")]")
	public WebElement descricaoMunicipioIBGEE;

	

	@FindBy(xpath = "//span[@id=\"ufIbge\"]")
	public WebElement codigoUFV;
	@FindBy(xpath = "//span[@id=\"codeIbge\"]")
	public WebElement codigoIBGEV;
	@FindBy(xpath = "//span[@id=\"descriptionIbge\"]")
	public WebElement descricaoMunicipioIBGEV;

	

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	public TabelaMunicipioIBGEVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

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
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);

		String codigoUFV1 = codigoUFV.getText();
		String codigoIBGEV1 = codigoIBGEV.getText();
		String drescricaoMunicipioIBGEV1 = descricaoMunicipioIBGEV.getText();



		System.out.println(codigoUFV1);
		System.out.println(codigoIBGEV1);
		System.out.println(drescricaoMunicipioIBGEV1);

		

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
		attributoNotToBeEmptyElement(codigoIBGEE, "value");
		sleep(2000);
		

		String codigoUFE1 = codigoUFE.getAttribute("value");
		String codigoIBGEE1 = codigoIBGEE.getAttribute("value");
		String descricaoMunicipioIBGEE1 = descricaoMunicipioIBGEE.getAttribute("value");




		System.out.println(codigoUFE1);
		System.out.println(codigoIBGEE1);
		System.out.println(descricaoMunicipioIBGEE1);




		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(codigoUFE1.contains(codigoUFV1));
		sucesso.add(codigoIBGEE1.contains(codigoIBGEV1));
		sucesso.add(descricaoMunicipioIBGEE1.contains(drescricaoMunicipioIBGEV1));



		System.out.println(sucesso);
		return sucesso;

	}

}
