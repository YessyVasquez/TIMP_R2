package com.sap.timp.pageObjectModel.TDK.Execucoes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ExecucoesIdPublicoePrivadoPO extends TestBaseKenssy{

	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div//span/span[text()=\"Dashboard\"]")
	public WebElement dashboard;
	
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;

	@FindBy(xpath = "//span[text()=\"Novo Dashboard\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"name\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@id=\"classification\"]/div/div/div[2]")
	public WebElement classificacao;

	@FindBy(xpath = "//li[@id][text()=\"Relatorios Gerenciais\"]")
	public WebElement opcaoclassificacao;

	@FindBy(xpath = "//div[@id=\"accessClassification\"]/div/div[2]")
	public WebElement classificacaoacesso;

	@FindBy(xpath = "//li[@id][text()=\"1 - Público\"]")
	public WebElement opcaoclassificacaoacesso;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-plussign\")]")
	public WebElement adicionarWidget;
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-clippeddoc\")]")
	public WebElement cartaoIndicador;
	
	@FindBy(xpath = "//button[text()=\"Criar Widget\"]")
	public WebElement criarWidget;
	
	
	
	@FindBy(xpath = "//div[@id=\"header-name\"]/div/div/input")
	public WebElement nomeCalbalho;
	
	@FindBy(xpath = "//div[@id=\"structure-group-container\"]/div/div/div[2]")
	public WebElement grupoEstruturas;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"structure-container\"]/div/div/div[2]")
	public WebElement estruturasDados;
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")]/span/span[text()=\"Conteúdo\"]")
	public WebElement conteudo;
	
	@FindBy(xpath = "//div[@id=\"type\"]/div/div/div[2]")
	public WebElement tipoColunna;
	
	@FindBy(xpath = "//div[@id=\"fields\"]/div/div[2]")
	public WebElement fields;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	
	
	public ExecucoesIdPublicoePrivadoPO() {
		PageFactory.initElements(driver, this);
	}

	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		dashboard.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		raiz.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String id = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[5]/div"))
				.getText();

		System.out.println("Ultimo registro: " + id);

		novo.click();
		sleep(2000);
		waitExpectElement(nome);
		sleep(2000);
		
		nome.sendKeys("Dashboard 1 - NÃO MEXER");
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"classification\"]/div", "class", "base-select required");
		sleep(4000);
		
		classificacao.click();
		sleep(1000);
		opcaoclassificacao.click();
		sleep(1000);
		
		classificacaoacesso.click();
		sleep(1000);
		opcaoclassificacaoacesso.click();
		sleep(1000);

		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(adicionarWidget);
		sleep(3000);
		
		
		adicionarWidget.click();
		waitExpectElement(cartaoIndicador);
		sleep(2000);
		
		cartaoIndicador.click();
		sleep(2000);
		
		criarWidget.click();
		sleep(2000);
		
		nomeCalbalho.sendKeys("Teste Automatizado 1");
		sleep(2000);
		
		grupoEstruturas.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"structure-container\"]/div/div", "class", "base-autocomplete required");
		sleep(4000);
		
		estruturasDados.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		waitExpectElement(conteudo);
		sleep(2000);
		
		conteudo.click();
		sleep(2000);
		
		tipoColunna.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		fields.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		aceitar.click();
		sleep(2000);
		
		Gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		raiz.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String idB = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[5]/div"))
				.getText();
		idInserir("execucoesIdPublico",idB);

		System.out.println(id);
		System.out.println(idB);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);

		boolean sucesso = false;
		if (idBD > idD) {
			sucesso = true;
		} else {
			sucesso = false;
		}
		System.out.println(sucesso);
		return sucesso;
		
	}
}
