package com.sap.timp.pageObjectModel.TDK.Dashboard.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DashboardCriarCopiaPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement kpis;

	@FindBy(xpath = "//span[text()=\"Dashboards Públicos\"]")
	public WebElement dashboardspublicos;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;

	@FindBy(xpath = "//span[text()=\"Adicionar Widget\"]")
	public WebElement adicionarwidget;

	@FindBy(xpath = "//button[text()=\"Criar Widget\"]")
	public WebElement criarwidget;

	@FindBy(xpath = "//div[text()=\"Cartão Indicador\"]")
	public WebElement cartaoindicador;

	@FindBy(xpath = "//input[@placeholder=\"Cabeçalho\"]")
	public WebElement cabecalho;

	@FindBy(xpath = "//div[@id=\"select-group\"]/div/div[2]")
	public WebElement grupoestrutura;

	@FindBy(xpath = "//li[@id][text()=\"Ajuste\"][1]")
	public WebElement opcaogrupo;

	@FindBy(xpath = "//div[@id=\"select-structure\"]/div/div[2]")
	public WebElement estruturadedados;
	@FindBy(xpath = "//li[@id][text()=\"Ajustes Fiscais\"]")
	public WebElement opcaoestrutura;

	@FindBy(xpath = "//span[text()=\"Conteúdo\"]")
	public WebElement conteudo;

	@FindBy(xpath = "//div[@id=\"type\"]/div/div/div[2]")
	public WebElement colunas;

	@FindBy(xpath = "//li[@id][text()=\"Campos\"]")
	public WebElement opcaocolunas;

	@FindBy(xpath = "//div[@id=\"fields\"]/div/div[2]")
	public WebElement campos;

	@FindBy(xpath = "//li[@id][text()=\"Alíquota ICMS\"]")
	public WebElement opcaocampos;

	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement Aceitar;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagemsalvo;

	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome de Dashboard\"]")
	public WebElement nome;

	@FindBy(xpath = "//div[@id=\"classification\"]/div/div/div[2]")
	public WebElement classificacao;

	@FindBy(xpath = "//li[@id][text()=\"Relatorios Gerenciais\"]")
	public WebElement opcaoclassificacao;

	@FindBy(xpath = "//div[@id=\"accessClassification\"]/div/div[2]")
	public WebElement classificacaoacesso;

	@FindBy(xpath = "//li[@id][text()=\"1 - Público\"]")
	public WebElement opcaoclassificacaoacesso;

	@FindBy(xpath = "//span[text()=\"Lixeira\"]")
	public WebElement Lixeira;
	public DashboardCriarCopiaPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> Copia() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		dashboardspublicos.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("dashboardsCriar");

		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement copiar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Copiar\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		copiar.click();
		sleep(2000);

		attributeToBeXpath("//div[@id=\"copyFrom\"]/div", "class", "base-autocomplete ");
		sleep(2000);
		waitExpectElement(nome);
		sleep(2000);
		nome.clear();

		sleep(2000);

		nome.sendKeys("Dashboard 1 - Copia");
		sleep(2000);
		classificacaoacesso.click();
		sleep(2000);
		opcaoclassificacaoacesso.click();
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(Gravar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		dashboardspublicos.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();

		String idB = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[5]/div"))
				.getText();

		System.out.println(idRegistro);
		System.out.println(idB);
		double idD = convertToDouble(idRegistro);
		double idBD = convertToDouble(idB);

		if (idBD > idD) {
			System.out.println("Sim, é o id criado nesse TA");
			sucesso.add(true);
		} else {
			System.out.println("Não é o id criado nesse TA");
			sucesso.add(false);
		}
		

		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idB + "\"]/div[1]/div"));
		WebElement lixeira = driver.findElement(By.xpath("//div[@data-id=\""+idB+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		lixeira.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(Lixeira);
		sleep(2000);
		Lixeira.click();
		
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

		String idlixeira = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[5]/div"))
				.getText();
		double idlixeiranumero = convertToDouble(idlixeira);
		double id = convertToDouble(idB);
		if (idlixeiranumero == id) {
			System.out.println("Sim, é o mesmo id que foi pra lixeira");
			sucesso.add(true);
		} else {
			System.out.println("Nao é o mesmo id");
			sucesso.add(false);

		}
		
		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idlixeira + "\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idlixeira+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		excluir.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(Lixeira);
		sleep(2000);
		Lixeira.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int exclusão = driver.findElements(By.xpath("//div[@data-id=\"" + idlixeira + "\"]/div[5]/div")).size();
		
		if(exclusão == 0)
		{
			System.out.println("Registro não consta na biblioteca");
			sucesso.add(true);
		}else {
			System.out.println("Registo consta na biblioteca");
			sucesso.add(false);
		}
		System.out.println(sucesso);
		return sucesso;
	}

}
