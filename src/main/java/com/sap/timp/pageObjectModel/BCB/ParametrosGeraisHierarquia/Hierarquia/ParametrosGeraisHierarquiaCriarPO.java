package com.sap.timp.pageObjectModel.BCB.ParametrosGeraisHierarquia.Hierarquia;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParametrosGeraisHierarquiaCriarPO extends TestBaseSteven {
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][1]")
	public WebElement hierarquias;

	@FindBy(xpath = "//span[text()=\"Hierarquia de Configuração\"]")
	public WebElement hierarquiaConfiguracao;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimo;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][1]")
	public WebElement siguiente;

	@FindBy(xpath = "//span[contains(text(),\"Nova\")]")
	public WebElement nova;

	@FindBy(xpath = "//input[contains(@placeholder,\"Preencher o nome de Hierarquia\")]")
	public WebElement nomeDeHierarquia;

	@FindBy(xpath = "//input[contains(@placeholder,\"Nome da Aba\")]")
	public WebElement nomeDaAba;

	// Nome da Hierarquia
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome da Hierarquia\")]")
	public WebElement nomeDaHierarquia;
	
	@FindBy(xpath = "//div[@id=\"hierarchies\"]/div/div[@id=\"belongsTo\" and @class=\"field\"]/div/div/div[2]")
	public WebElement listaNomeDaAba;

	// Nome do Grupo
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome do Grupo\")]")
	public WebElement nomeDoGrupo;
	@FindBy(xpath = "//div[@id=\"groups\"]/div/div[@id=\"belongsTo\" and @class=\"field\"]/div/div/div[2]")
	public WebElement listaNomeDoHierarquia;

	// Nome do Campo de Linha
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome do Campo de Linha\")]")
	public WebElement nomeDoCampoDeLinha;
	@FindBy(xpath = "//div[@id=\"fields\"]/div/div[@id=\"belongsTo\" and @class=\"field\"]/div/div/div[2]")
	public WebElement listanomeDoSubnivel;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao;

	@FindBy(xpath = "//div[@class=\"list-option selectAll\"][1]/div/div/label/span")
	public WebElement opcaoTodos;

	@FindBy(xpath = "//div[@id=\"sublevels\"]/div/div[@id=\"add-icon\"]")
	public WebElement adicionar;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	
	
	public ParametrosGeraisHierarquiaCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criarConfiguracaoHierariquia() {

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sleep(2000);
		hierarquias.click();
		sleep(1100);
		hierarquiaConfiguracao.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String id = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[4]/div"))
				.getText();
		System.out.println(id);

		nova.click();
		sleep(3000);
		//waitExpectElement(nomeDeHierarquia);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1100);

		nomeDeHierarquia.sendKeys("Teste QA PREUBA 007");
		sleep(1100);

		nomeDaAba.sendKeys("Teste QA PREUBA 007");
		sleep(1100);

		actionsMoveToElementElement(nomeDoCampoDeLinha);
		sleep(1100);
		nomeDaHierarquia.sendKeys("Teste QA PREUBA 007");
		sleep(1100);
		listaNomeDaAba.click();
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(1100);

		nomeDoGrupo.sendKeys("Teste QA PREUBA 007");
		sleep(1100);
		listaNomeDoHierarquia.click();
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(1100);

		for (int i = 0; i < 8; i++) {
			adicionar.click();
			sleep(1000);
		}

		int subniveisAdicionados = driver.findElements(By.xpath("//div[@id=\"sublevels\"]/div")).size();


		String subniveisAdicionadosS = String.valueOf(subniveisAdicionados);

		sucesso.add(subniveisAdicionadosS.equals("9"));

		int f = 1;
		for (int i = 0; i < 9; i++) {

		}

		for (int i = 0; i < subniveisAdicionados; i++) {
			WebElement nomeDoSubnivel = driver
					.findElement(By.xpath("//div[@id=\"sublevels\"]/div[" + f + "]/div[3]/div/div/input"));
			WebElement listoDoNomeDoGrupo = driver.findElement(By.xpath("//div[@id=\"sublevels\"]/div[" + f
					+ "]/div[@id=\"belongsTo\" and @class=\"field\"]/div/div/div[2]"));

			nomeDoSubnivel.sendKeys("Teste Automatizado " + f);
			sleep(1000);
			listoDoNomeDoGrupo.click();
			opcao.click();
			opcao.sendKeys(Keys.ESCAPE);
			sleep(1000);

			f = f + 1;
		}

		nomeDoCampoDeLinha.sendKeys("Teste QA PREUBA 007");
		sleep(1000);
		listanomeDoSubnivel.click();
		opcaoTodos.click();
		opcaoTodos.sendKeys(Keys.ESCAPE);

		sleep(1000);
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String id2 = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[4]/div"))
				.getText();
		String nome = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[5]/div"))
				.getText();
		System.out.println(nome);

		sucesso.add(nome.equals("Teste QA PREUBA 007"));

		idInserir1(id2);

		int id1I = convertToInt(id);
		int id2I = convertToInt(id2);

		System.out.println("Id antes da criação: " + id1I);
		System.out.println("Id Após a criação: " + id2I);

		if (id2I > id1I) {
			sucesso.add(true);
		} else {
			sucesso.add(false);
		}

		return sucesso;

	}

}
