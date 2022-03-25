package com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParametrosGeraisConfiguraçãoConfiguraçãoCriarPO extends TestBaseSteven {
	
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

	@FindBy(xpath = "//input[contains(@placeholder,\"nome de Hierarquia\")]")
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
	
	// Configuracao

	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][2]")
	public WebElement configuracoes;

	@FindBy(xpath = "//span[text()=\"Configuração da Consolidação\"]")
	public WebElement configuracaoDaConsolidacao;

	@FindBy(xpath = "//input[contains(@placeholder,\"nome de Hierarquia\")]")
	public WebElement nomeHirarquia;
	@FindBy(xpath = "//div[contains(@id,\"00\")]/div/label/span")
	public WebElement nomeHirarquiaO;

	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	@FindBy(xpath = "//div[contains(@id,\"00\")]/div/label/span")
	public WebElement tributoO;

	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	@FindBy(xpath = "//div[contains(@id,\"1000\")]/div/label/span")
	public WebElement empresaO;

	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement uf;
	@FindBy(xpath = "//div[contains(@id,\"SP\")]/div/label/span")
	public WebElement ufO;

	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	@FindBy(xpath = "//div[contains(@id,\"1000_SP_0001\")]/div/label/span")
	public WebElement filialO;

	@FindBy(xpath = "//div[@id=\"calculation-type\"]/div/div/div[2]")
	public WebElement tipoApuracao;
	@FindBy(xpath = "//li[text()=\"3 - Outros\"]")
	public WebElement tipoApuracaoO;

	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravarC;

	@FindBy(xpath = "//span[contains(@class,\"icon-Calculator\")]")
	public WebElement calculator;

	@FindBy(xpath = "//span[contains(text(),\"Configuração do Resultado Final\")]")
	public WebElement resultadoFinal;

	@FindBy(xpath = "//div[contains(@class,\"adjustments\")]/div/div/div[2]/div/div[2]/div/div/button")
	public WebElement adicionarConfiguracao;

	@FindBy(xpath = "//div[@id=\"condition\"]/div/div/div[2]")
	public WebElement condicao;
	@FindBy(xpath = "//li[text()=\"Não Exibir\"]")
	public WebElement condacaoO;

	@FindBy(xpath = "//button[contains(text(),\"Criar\")]")
	public WebElement criar;

	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	// primer subnivel

	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha1;
	@FindBy(xpath = "//li[text()=\"Relatório\"]")
	public WebElement campoLinhaO1;

	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"report\"]/div/div/input")
	public WebElement relatorio1;

	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcao2;

	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"value\"]/div/div/div[2]")
	public WebElement valor1;

	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"filters-button-container\"]/button")
	public WebElement filtros1;

	@FindBy(xpath = "//span[text()=\"Adicionar Filtro\"]")
	public WebElement adicionarFiltro;

	@FindBy(xpath = "//div[@id=\"field-select-container\"]/div/div[2]")
	public WebElement listaValorDoAjuste1;

	@FindBy(xpath = "//li[text()=\"Valor do ajuste\"]")
	public WebElement listaValorAjusteO1;

	@FindBy(xpath = "//*[@id=\"filters-pool\"]/div/div/div/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]")
	public WebElement operador1;
	@FindBy(xpath = "//div[text()=\">\"]")
	public WebElement operadorO1;

	@FindBy(xpath = "//*[@id=\"filters-pool\"]/div/div/div/div[1]/div[2]/div[3]/div/div/input")
	public WebElement valorFiltro1;

	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	public ParametrosGeraisConfiguraçãoConfiguraçãoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criarConfiguracao() {

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sleep(2000);
		configuracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaoDaConsolidacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		nova.click();
		sleep(3000);
		attributeToBeXpath("//div[@id=\"hierarchy-name\"]/div", "class", "base-autocomplete required");
		sleep(2000);
		
		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String id = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[4]/div"))
				.getText();

		
		nomeHirarquia.sendKeys("Teste QA PREUBA 007");

		sleep(1000);
		nomeHirarquia.sendKeys(Keys.ENTER);
		sleep(1000);
		
//		nomeHirarquia.click();
//		sleep(1000);
//		nomeHirarquiaO.click();
//		nomeHirarquiaO.sendKeys(Keys.ESCAPE);
//		sleep(1000);

		tributo.click();
		sleep(1000);
		tributoO.click();
		tributoO.sendKeys(Keys.ESCAPE);
		sleep(1000);

		attributeToBeXpath("//div[@id=\"company\"]/div", "class", "base-MultipleSelect3 required");
		sleep(1000);

		empresa.click();
		sleep(1000);
		empresaO.click();
		empresaO.sendKeys(Keys.ESCAPE);
		sleep(1000);

		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		sleep(1000);

		uf.click();
		sleep(1000);
		ufO.click();
		ufO.sendKeys(Keys.ESCAPE);
		sleep(1000);

		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(1000);

		filial.click();
		sleep(1000);
		filialO.click();
		filialO.sendKeys(Keys.ESCAPE);
		sleep(1000);

		tipoApuracao.click();
		sleep(1000);
		tipoApuracaoO.click();
		sleep(1000);

		dataVigencia.sendKeys("01/01/2014");
		sleep(1000);

		gravarC.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

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

		//sucesso.add(nome.contains("Prueba Automatizada de Hierarq"));
		sucesso.add(nome.contains("Teste QA PREUBA 007"));
		idInserir3(id2);

		int id1I = convertToInt(id);
		int id2I = convertToInt(id2);

		System.out.println("***********");
		System.out.println("Hierarquia");
		System.out.println("Id antes da criação: " + id1I);
		System.out.println("Id Após a criação: " + id2I);
		System.out.println("");
		System.out.println("***********");

		if (id2I > id1I) {
			sucesso.add(true);
		} else {
			sucesso.add(false);
		}

		return sucesso;

	}
}
