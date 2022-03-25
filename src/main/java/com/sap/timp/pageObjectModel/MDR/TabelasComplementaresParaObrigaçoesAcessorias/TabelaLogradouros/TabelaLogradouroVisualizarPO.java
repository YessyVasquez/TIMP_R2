package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaLogradouros;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaLogradouroVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement obrigacoes;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Logradouros\"]")
	public WebElement tabelaLogradouros;

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
	@FindBy(xpath = "//input[contains(@placeholder,\"Obrigação\")]")
	public WebElement obrigacaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Código de Logradouro\")]")
	public WebElement codigoLogadouroE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Descrição da Logradouro\")]")
	public WebElement descricaoLogradouroE;

	

	@FindBy(xpath = "//span[@id=\"ufIbge\"]")
	public WebElement codigoUFV;
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaoV;
	@FindBy(xpath = "//span[@id=\"streetsCodeAdditional\"]")
	public WebElement codigoLogradouroV;
	@FindBy(xpath = "//span[@id=\"streetsDescriptionAdditional\"]")
	public WebElement descricaoLogradouroV;

	

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	public TabelaLogradouroVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		sleep(2000);
		obrigacoes.click();
		sleep(2000);
		tabelaLogradouros.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("TabelaLogradouro");

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
		String obrigacaoV1 = obrigacaoV.getText();
		String codigoLogradouroV1 = codigoLogradouroV.getText();
		String drescricaoLogradouroV1 = descricaoLogradouroV.getText();



		System.out.println(codigoUFV1);
		System.out.println(obrigacaoV1);
		System.out.println(codigoLogradouroV1);
		System.out.println(drescricaoLogradouroV1);

		

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
		attributoNotToBeEmptyElement(codigoLogadouroE, "value");
		sleep(2000);
		

		String codigoUFE1 = codigoUFE.getAttribute("value");
		String obrigacaoE1 = obrigacaoE.getAttribute("value");
		String codigoLogradouroE1 = codigoLogadouroE.getAttribute("value");
		String descricaoLogradouroE1 = descricaoLogradouroE.getAttribute("value");




		System.out.println(codigoUFE1);
		System.out.println(obrigacaoE1);
		System.out.println(codigoLogradouroE1);
		System.out.println(descricaoLogradouroE1);




		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(codigoUFE1.contains(codigoUFV1));
		sucesso.add(obrigacaoE1.contains(obrigacaoV1));
		sucesso.add(codigoLogradouroE1.contains(codigoLogradouroV1));
		sucesso.add(descricaoLogradouroE1.contains(drescricaoLogradouroV1));



		System.out.println(sucesso);
		return sucesso;

	}

}
