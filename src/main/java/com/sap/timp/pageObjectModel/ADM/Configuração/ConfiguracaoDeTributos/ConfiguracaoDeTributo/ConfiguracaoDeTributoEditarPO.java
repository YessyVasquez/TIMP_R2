package com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguracaoDeTributos.ConfiguracaoDeTributo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguracaoDeTributoEditarPO extends TestBaseSteven {

	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;

	@FindBy(xpath = "//span[text()=\"Configuração de Tributos\"]")
	public WebElement configuracaotributos;

	@FindBy(xpath = "//span[text()=\"Configuração de tributo\"]")
	public WebElement configuracaotributo;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar2;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;

	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar; 

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;

	@FindBy(xpath = "//div[@id=\"country\"]/div/div[2]")
	public WebElement pais;

	@FindBy(xpath = "//input[@placeholder=\"Preencher Código tributo\"]")
	public WebElement codigotributo;

	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição código tributo label\"]")
	public WebElement descricao;

	@FindBy(xpath = "//div[@id=\"active\"]/div/label/span")
	public WebElement ativo;

	@FindBy(xpath = "//div[@id=\"classification\"]/div/div[2]")
	public WebElement classificacao;

	@FindBy(xpath = "//li[@id][2]")
	public WebElement opcao;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar País \"]")
	public WebElement pais1;

	@FindBy(xpath = "//input[@placeholder=\"Preencher Código tributo\"]")
	public WebElement codigotributo1;

	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição código tributo label\"]")
	public WebElement descricao1;

	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição código tributo\"]")
	public WebElement descricaocodigotributo1;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Classificação \"]")
	public WebElement classificacao1;

	public ConfiguracaoDeTributoEditarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> editar() {

		String url = driver.getCurrentUrl();

		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		if (url.contains("tc2")) {
			tc2 = true;
		} else if (url.contains("tp1")) {
			tp1 = true;
		} else {
			tq1 = true;
		}

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		Configuração.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaotributos.click();
		sleep(2000);
		configuracaotributo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		primeira.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("ConfiguracaoDeTributo");
		System.out.println("ID Registro: " + idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		pais.click();
		sleep(1000);
		attributeToBeXpath("//div[@id=\"country\"]/div", "class", "base-autocomplete active");
		opcao.click();
		sleep(1000);
		codigotributo.clear();
		sleep(2000);
		codigotributo.sendKeys("2");

		sleep(1000);
		descricao.clear();
		sleep(2000);
		descricao.sendKeys("Teste descricao");

		sleep(1000);

		classificacao.click();
		sleep(2000);
		opcao.click();
		sleep(2000);

		String paiseditar = pais1.getAttribute("value");
		String codigotributoeditar = codigotributo1.getAttribute("value");
		String descricaocodigotributoeditar = descricaocodigotributo1.getAttribute("value");
		String descricaoeditar = descricao1.getAttribute("value");
		String classificacaoeditar = classificacao1.getAttribute("value");
		
		System.out.println(paiseditar);
		System.out.println(codigotributoeditar);
		System.out.println(descricaocodigotributoeditar);
		System.out.println(descricaoeditar);
		System.out.println(classificacaoeditar);

		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		waitExpectElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String paisString = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id][1]/div[9]/div")).getText();
		String codigotributoString = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id][1]/div[4]/div"))
				.getText();
		String descricaocodigotributotring = driver
				.findElement(By.xpath("//div[@class=\"tr\" and @data-id][1]/div[5]/div")).getText();
		String descricaoString = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id][1]/div[6]/div"))
				.getText();
		String classificacaoString = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id][1]/div[8]/div"))
				.getText();
		
		System.out.println(paisString);
		System.out.println(codigotributoString);
		System.out.println(descricaocodigotributotring);
		System.out.println(descricaoString);
		System.out.println(classificacaoString);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(paisString.contains(paiseditar));
		sucesso.add(codigotributoString.contains(codigotributoeditar));
		sucesso.add(descricaocodigotributotring.contains(descricaocodigotributoeditar));
		sucesso.add(descricaoString.contains(descricaoeditar));
		sucesso.add(classificacaoString.contains(classificacaoeditar));
		
		
		//System.out.println(sucesso);

		return sucesso;

	}

}
