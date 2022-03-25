package com.sap.timp.pageObjectModel.BCB;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



import com.sap.timp.base.TestBaseSteven;

import sun.reflect.generics.tree.Tree;

public class HierarquiaConfiguracaoTodasAsFuncionalidadesPO extends TestBaseSteven {

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
	@FindBy(xpath = "//div[contains(@id,\"1000_SP_0121\")]/div/label/span")
	public WebElement filialTc2;

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

	// segundo subnivel

	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha2;

	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"report\"]/div/div/input")
	public WebElement relatorio2;

	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"value\"]/div/div/div[2]")
	public WebElement valor2;

	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div[2]/div[3]/div[1]/div/label/span")
	public WebElement subPeriodosAcumulados;

	@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div[2]/div[3]/div[2]/div/div/div[2]")
	public WebElement periodosSubAcumulados;

	@FindBy(xpath = "//li[text()=\"2\"]")
	public WebElement periodosSubAcumuladosO;

	// tercer Subnivel

	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha3;

	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"report\"]/div/div/input")
	public WebElement relatorio3;

	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div/div[@id=\"value\"]/div/div/div[2]")
	public WebElement valor3;

	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div[2]/div[3]/div[3]/div/label/span")
	public WebElement subPeriodosAnteriores;

	@FindBy(xpath = "//div[@class=\"subLevel\"][3]/div[2]/div[3]/div[4]/div/div/div[2]")
	public WebElement periodosSubAnteriores;

	@FindBy(xpath = "//li[text()=\"1\"]")
	public WebElement periodosSubAnterioresO;

	// Cuarto Subnivel

	@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha4;

	@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div/div[@id=\"report\"]/div/div/input")
	public WebElement relatorio4;

	@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div/div[@id=\"value\"]/div/div/div[2]")
	public WebElement valor4;

	@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div[2]/div[4]/div[1]/div/label/span")
	public WebElement filtroPorDatae;

	@FindBy(xpath = "//div[@class=\"subLevel\"][4]/div[2]/div[4]/div[2]/div/div/div[2]")
	public WebElement listaFiltroPorDatae;

	@FindBy(xpath = "//li[text()=\"Data lançamento doc. fiscal\"]")
	public WebElement listaFiltroPorDataOe;

	// Quinto Subnivel

	@FindBy(xpath = "//div[@class=\"subLevel\"][5]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha5;

	@FindBy(xpath = "//div[@class=\"subLevel\"][5]/div/div[@id=\"report\"]/div/div/input")
	public WebElement relatorio5;

	@FindBy(xpath = "//div[@class=\"subLevel\"][5]/div/div[@id=\"value\"]/div/div/div[2]")
	public WebElement valor5;

	@FindBy(xpath = "//div[@class=\"subLevel\"][5]/div[3]/div/div[2]/div/div[2]")
	public WebElement campoLinha5;

	@FindBy(xpath = "//li[text()=\"CFOP\"]")
	public WebElement campoLinhaO5;

	
	
	// Sexto Subnivel

	@FindBy(xpath = "//div[@class=\"subLevel\"][6]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha6;

	@FindBy(xpath = "//div[@class=\"subLevel\"][6]/div/div[@id=\"report\"]/div/div/input")
	public WebElement relatorio6;

	@FindBy(xpath = "//div[@class=\"subLevel\"][6]/div/div[@id=\"value\"]/div/div/div[2]")
	public WebElement valor6;

	@FindBy(xpath = "//div[@class=\"subLevel\"][6]/div[3]/div/div[2]/div/div[2]")
	public WebElement campoLinha6;

	@FindBy(xpath = "//li[text()=\"CFOP\"]")
	public WebElement campoLinhaO6;

	@FindBy(xpath = "//div[@class=\"subLevel\"][6]/div[4]/div[2]/div[1]/div/div[2]/div/div[2]")
	public WebElement ordenacao6;

	@FindBy(xpath = "//div[text()=\"Crescente\"]")
	public WebElement ordenacaoO6;

	@FindBy(xpath = "//div[@class=\"subLevel\"][6]/div[4]/div[2]/div[2]/div/div[2]/div/div[2]")
	public WebElement campoOrdenacao6;
	@FindBy(xpath = "//div[text()=\"CFOP\"]")
	public WebElement campoOrdenacaoO6;
	
	
	
	// Septimo Subnivel

		@FindBy(xpath = "//div[@class=\"subLevel\"][7]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha7;

		@FindBy(xpath = "//div[@class=\"subLevel\"][7]/div/div[@id=\"report\"]/div/div/input")
		public WebElement relatorio7;

		@FindBy(xpath = "//div[@class=\"subLevel\"][7]/div/div[@id=\"value\"]/div/div/div[2]")
		public WebElement valor7;

		@FindBy(xpath = "//div[@class=\"subLevel\"][7]/div[3]/div/div[2]/div/div[2]")
		public WebElement campoLinha7;

		@FindBy(xpath = "//li[text()=\"CFOP\"]")
		public WebElement campoLinhaO7;

		@FindBy(xpath = "//div[@class=\"subLevel\"][7]/div[4]/div[2]/div[1]/div/div[2]/div/div[2]")
		public WebElement ordenacao7;

		@FindBy(xpath = "//div[text()=\"Decrescente\"]")
		public WebElement ordenacaoO7;

		@FindBy(xpath = "//div[@class=\"subLevel\"][7]/div[4]/div[2]/div[2]/div/div[2]/div/div[2]")
		public WebElement campoOrdenacao7;
		@FindBy(xpath = "//div[text()=\"CFOP\"]")
		public WebElement campoOrdenacaoO7;
		
		
		// Octavo Subnivel

		@FindBy(xpath = "//div[@class=\"subLevel\"][8]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha8;

		@FindBy(xpath = "//div[@class=\"subLevel\"][8]/div/div[@id=\"report\"]/div/div/input")
		public WebElement relatorio8;

		@FindBy(xpath = "//div[@class=\"subLevel\"][8]/div/div[@id=\"value\"]/div/div/div[2]")
		public WebElement valor8;

		@FindBy(xpath = "//div[@class=\"subLevel\"][8]/div[2]/div[5]/div[1]/div/label/span")
		public WebElement agrupamento8;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][8]/div[2]/div[5]/div[2]/div/div/div[2]")
		public WebElement listaAgrupamento8;
		
		@FindBy(xpath = "//div[@id=\"250\"]/div/label/span")
		public WebElement listaAgrupamentoO8;
		
		
		
		// Noveno Subnivel

		@FindBy(xpath = "//div[@class=\"subLevel\"][9]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinha9;

		@FindBy(xpath = "//div[@class=\"subLevel\"][9]/div/div[@id=\"report\"]/div/div/input")
		public WebElement relatorio9;

		@FindBy(xpath = "//div[@class=\"subLevel\"][9]/div/div[@id=\"value\"]/div/div/div[2]")
		public WebElement valor9;

		@FindBy(xpath = "//div[@class=\"subLevel\"][9]/div[2]/div[5]/div[1]/div/label/span")
		public WebElement agrupamento9;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][9]/div[2]/div[5]/div[2]/div/div/div[2]")
		public WebElement listaAgrupamento9;
		
		@FindBy(xpath = "//div[@id=\"250\"]/div/label/span")
		public WebElement listaAgrupamentoO9;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][9]/div[2]/div[6]/div[1]/div/label/span")
		public WebElement subAgrupamento9;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][9]/div[2]/div[6]/div[2]/div/div/div[2]")
		public WebElement listaSubAgrupamento9;
		
		@FindBy(xpath = "//div[@id=\"156\"]/div/label/span")
		public WebElement listaSubAgrupamentoO9;
		
		
		
		//Execução
		
		@FindBy(xpath = "//span[text()=\"Executar\"]")
		public WebElement executar;
		
		@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
		public WebElement pesquisar;
		
		@FindBy(xpath = "//div[@data-id and @class=\"tr\"]/div/div[1]/div/span[1]")
		public WebElement menu;
		
		@FindBy(xpath = "//span[text()=\"Executar\"]")
		public WebElement executarM;

		@FindBy(xpath = "//span[contains(@class,\"icon-calendar\")]")
		public WebElement periodo;
		
		@FindBy(xpath = "//div[contains(@class,\"icon-leftmenu\")]")
		public WebElement paginaAnterior;
		
		@FindBy(xpath = "//div[text()=\"2016\"]")
		public WebElement ano2016;
		
		@FindBy(xpath = "//div[text()=\"Jan\"]")
		public WebElement jan;
		
		@FindBy(xpath = "//span[text()=\"1M\"]")
		public WebElement m1;
		
		@FindBy(xpath = "//span[text()=\"1Y\"]")
		public WebElement y1;
		
		@FindBy(xpath = "//div[contains(@class,\"execution-type\")]/div[2]/label/span")
		public WebElement execucaoAnalitica;
		
		@FindBy(xpath = "//button[text()=\"Executar\"]")
		public WebElement executarB;
		
		
		//subNivel1
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-0\")]/div/div/div/div")
		public WebElement aba1;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-1\")]/div[1]/div[1]/div[1]/div[1]")
		public WebElement hierarquia1;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")]/div[1]/div[1]/div[1]/div[1]")
		public WebElement grupo1;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][1]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel1;
		
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[1]/div[1]/div[1]/div[2]/a")
		public WebElement verNoBRB1;
		
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[1]/div[1]/div[2]")
		public WebElement valorAjusteTotalBCB1;
		
		@FindBy(xpath = "//span[text()=\"Configurações\"]")
		public WebElement configuracoesBRB;
		
		@FindBy(xpath = "//div[contains(@filter-key,\"ID_COMPANY\")]/div/div[4]/input")
		public WebElement empresaBRB;
		
		@FindBy(xpath = "//div[contains(@filter-key,\"ID_BRANCH\")]/div/div[4]/input")
		public WebElement filialBRB;
		
		@FindBy(xpath = "//div[contains(@filter-key,\"DT_LANC\")]/div[2]/div[4]/input")
		public WebElement dataLancamento1BRB;
		
		@FindBy(xpath = "//div[contains(@filter-key,\"DT_LANC\")]/div[3]/div[4]/input")
		public WebElement dataLancamento2BRB;
		
		@FindBy(xpath = "//div[contains(@filter-key,\"AJUSTE_VALUE\")][1]/div[2]/div[4]/input")
		public WebElement valorDoAjuste1BRB;
		
		@FindBy(xpath = "//div[contains(@filter-key,\"AJUSTE_VALUE\")][2]/div[2]/div[4]/input")
		public WebElement valorDoAjuste2BRB;
		
		@FindBy(xpath = "//div[contains(@filter-key,\"UF_FILIAL\")]/div[2]/div[4]/input")
		public WebElement ufFilialBRB;
		
		
		@FindBy(xpath = "//div[contains(@filter-key,\"ID_COMPANY\")]/div/div[2]/div")
		public WebElement empresaOperador;
		
		@FindBy(xpath = "//div[contains(@filter-key,\"ID_BRANCH\")]/div/div[2]/div")
		public WebElement filialOperador;
		
		@FindBy(xpath = "//div[contains(@filter-key,\"DT_LANC\")]/div[2]/div[2]/div")
		public WebElement dataLancamento1Operador;
		
		@FindBy(xpath = "//div[contains(@filter-key,\"DT_LANC\")]/div[3]/div[2]/div")
		public WebElement dataLancamento2Operador;
		
		@FindBy(xpath = "//div[contains(@filter-key,\"AJUSTE_VALUE\")][1]/div[2]/div[2]/div")
		public WebElement valorDoAjuste1Operador;
		
		@FindBy(xpath = "//div[contains(@filter-key,\"AJUSTE_VALUE\")][2]/div[2]/div[2]/div")
		public WebElement valorDoAjuste2Operador;
		
		@FindBy(xpath = "//div[contains(@filter-key,\"UF_FILIAL\")]/div[2]/div[2]/div")
		public WebElement ufFilialOperador;
		
		@FindBy(xpath = "//div[@data-column=\"14\" and not(@data-path or @aria-label)]/div")
		public WebElement valorAjusteTotalBRB;
		
		
		
		//Subnivel 2
	
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][2]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel2;
		
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[2]/div[1]/div[1]/div[2]/a")
		public WebElement verNoBRB2;
		
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[2]/div[1]/div[1]/div[2]/div")
		public WebElement tempoBCB;
		
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[2]/div[1]/div[2]")
		public WebElement valorAjusteTotalBCB2;
		
		
		
		
		//Subnivel 3
	
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][3]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel3;
		
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[3]/div[1]/div[1]/div[2]/a")
		public WebElement verNoBRB3;
		
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[3]/div[1]/div[1]/div[2]/div")
		public WebElement subPeriodoBCB3;
		
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[3]/div[1]/div[2]")
		public WebElement valorAjusteTotalBCB3;


		//Subnivel 4
	
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][4]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel4;
		
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[4]/div[1]/div[1]/div[2]/a")
		public WebElement verNoBRB4;
		
		
		@FindBy(xpath = "//div[contains(@class,\"ctn ctn-3\")]/div[4]/div[1]/div[2]")
		public WebElement valorAjusteTotalBCB4;
		
		//Subnivel 5
	
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][5]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel5;
		
		@FindBy(xpath = "//div[@id=\"1_1_1_5\"]/div[2]/div/table/tbody/tr/th[1]/span")
		public WebElement cfop5;
		
		//Subnivel 6
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][6]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel6;
		
		
		//Subnivel 7
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][7]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel7;
		
		
		//Subnivel 8
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][8]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel8;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][8]/div[2]/div/table/tbody/tr/th[2]/span")
		public WebElement colunaCFOP;

		
		//Subnivel 9
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][9]/div[1]/div[1]/div[1]/div[1]")
		public WebElement subnivel9;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-3\")][9]/div[2]/div/table/tbody/tr[2]/td[1]/div/span")
		public WebElement flecha9;
		
		@FindBy(xpath = "//button[text()=\"Sim\"]")
		public WebElement sim;
		
		@FindBy(xpath = "//li[@identifier=\"accordion-item-inactiveConfigurations\"]")
		public WebElement lixeira;
		
		@FindBy(xpath = "//button[text()=\"Não\"]")
		public WebElement nao;
		
	public HierarquiaConfiguracaoTodasAsFuncionalidadesPO() {
		PageFactory.initElements(driver, this);
	}
	String valorBCBG = "";
	String parentG = "";
	
	public ArrayList<Boolean> criarConfiguracaoHierariquia() {
		
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sleep(2000);
		hierarquias.click();
		sleep(1000);
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
		waitExpectElement(nomeDeHierarquia);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);

		//nomeDeHierarquia.sendKeys("Prueba Automatizada de Hierarquia QA PREUBA 2");
		nomeDeHierarquia.sendKeys("Teste Automatizado de Hierar");
		sleep(1000);

		nomeDaAba.sendKeys("Teste Automatizado");
		sleep(1000);

		actionsMoveToElementElement(nomeDoCampoDeLinha);
		sleep(1000);
		nomeDaHierarquia.sendKeys("Teste Automatizado");
		sleep(1000);
		listaNomeDaAba.click();
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(1000);

		nomeDoGrupo.sendKeys("Teste Automatizado");
		sleep(1000);
		listaNomeDoHierarquia.click();
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(1000);

		for (int i = 0; i < 8; i++) {
			adicionar.click();
			sleep(1000);
		}

		int subniveisAdicionados = driver.findElements(By.xpath("//div[@id=\"sublevels\"]/div")).size();
		System.out.println(subniveisAdicionados);

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

		nomeDoCampoDeLinha.sendKeys("Teste Automatizado");
		sleep(1000);
		listanomeDoSubnivel.click();
		opcaoTodos.click();
		opcaoTodos.sendKeys(Keys.ESCAPE);

		sleep(1000);
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		nao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");

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

		sucesso.add(nome.contains("Teste Automatizado"));

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

	public boolean criarConfiguracao() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		sleep(2000);
		waitExpectElement(configuracoes);
		sleep(2000);
		configuracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaoDaConsolidacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and@data-id]")).size();
		
		
		String id = driver.findElement(By.xpath("//div[@class=\"tr\" and@data-id]["+rows+"]/div[4]/div")).getText();
		System.out.println("Id Configurações antes da criação: "+ id);
		
		nova.click();
		sleep(8000);

		attributeToBeXpath("//div[@id=\"hierarchy-name\"]/div", "class", "base-autocomplete required");
		sleep(2000);

		nomeHirarquia.sendKeys("Teste Automatizado de Hierar");
		sleep(1000);
		nomeHirarquia.sendKeys(Keys.ENTER);
		sleep(1000);

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
		if (tc2==true) {
			filialTc2.click();
			filialTc2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else {
			filialO.click();
			filialO.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}


		tipoApuracao.click();
		sleep(1000);
		tipoApuracaoO.click();
		sleep(1000);

		dataVigencia.sendKeys("01/01/2013");
		sleep(1000);

		gravarC.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		biblioteca.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(3000);
		
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and@data-id]")).size();
		
		
		String idApos = driver.findElement(By.xpath("//div[@class=\"tr\" and@data-id]["+rows+"]/div[4]/div")).getText();
		idInserir2(idApos);
		System.out.println("Id Configurações apos da criação: "+ idApos);
		
		
		int idI = convertToInt(id);
		int idAposI = convertToInt(idApos);
		
		boolean sucesso = false;
		
		if (idAposI > idI) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		System.out.println(sucesso);
		return sucesso;

	}
	
	public void configurarConfiguracao() {
		
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter2()+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter2()+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		sleep(2000);
	
		menu.click();
		sleep(1000);
		editar.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(calculator);
		sleep(2000);
		
		calculator.click();
		sleep(1000);
		waitExpectElement(resultadoFinal);
		sleep(2000);
		resultadoFinal.click();
		sleep(1000);

		adicionarConfiguracao.click();
		sleep(1000);
		waitExpectElement(condicao);
		sleep(2000);
		condicao.click();
		sleep(1000);
		condacaoO.click();
		sleep(1000);

		criar.click();
		sleep(2000);
		fechar.click();
		sleep(2000);

		gravar.click();
		sleep(3000);
		//pediu justificar tc2 em 27/01/2021
		waitExpectElement(nao);
		nao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);

		campolinha1.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(2000);


		
		String relatorioUsar = "";
		if (url.contains("tq1")) {
			relatorioUsar = "8004728";
		}else if (url.contains("tc2")) {
			relatorioUsar = "2099";
		}else if (url.contains("tq2")) {
			relatorioUsar = "8004728";
		}else{
			relatorioUsar = "1766";
		}

	
		relatorio1.sendKeys(relatorioUsar);
		sleep(1000);
		relatorio1.sendKeys(Keys.ENTER);
		sleep(2000);

		valor1.click();
		sleep(1000);
		opcao2.click();
		sleep(1000);

		filtros1.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		adicionarFiltro.click();
		sleep(2000);

		listaValorDoAjuste1.click();
		sleep(1000);
		listaValorAjusteO1.click();
		sleep(1000);

		operador1.click();
		sleep(1000);
		operadorO1.click();
		sleep(1000);

		valorFiltro1.sendKeys("5000");
		sleep(1000);

		aplicar.click();

		sleep(2000);

		gravar.click();
		sleep(3000);
		/*Não está pedindo para justificar em TC2.27/01/2021
		waitExpectElement(nao);
		nao.click();
		*/invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		actionsMoveToElementElement(campolinha2);
		sleep(2000);

		// Segundo Subnivel

		campolinha2.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(1000);
			
		relatorio2.sendKeys(relatorioUsar);
		sleep(1000);
		relatorio2.sendKeys(Keys.ENTER);
		sleep(1000);

		valor2.click();
		sleep(1000);
		opcao2.click();
		sleep(1000);

		subPeriodosAcumulados.click();

		sleep(1000);

		periodosSubAcumulados.click();
		sleep(1000);
		periodosSubAcumuladosO.click();

		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		actionsMoveToElementElement(campolinha3);
		sleep(1000);

		// tercer Subnivel

		campolinha3.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(1000);


		relatorio3.sendKeys(relatorioUsar);
		sleep(1000);
		relatorio3.sendKeys(Keys.ENTER);
		sleep(1000);

		valor3.click();
		sleep(1000);
		opcao2.click();
		sleep(1000);

		subPeriodosAnteriores.click();

		sleep(1000);

		periodosSubAnteriores.click();
		sleep(1000);
		periodosSubAnterioresO.click();

		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);

		actionsMoveToElementElement(campolinha4);
		sleep(1000);

		// Quarto Subnivel

		campolinha4.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(1000);

		relatorio4.sendKeys(relatorioUsar);
		sleep(1000);
		relatorio4.sendKeys(Keys.ENTER);
		sleep(1000);

		valor4.click();
		sleep(1000);
		opcao2.click();
		sleep(1000);

		filtroPorDatae.click();

		sleep(1000);

		listaFiltroPorDatae.click();
		sleep(1000);
		listaFiltroPorDataOe.click();
		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		actionsMoveToElementElement(campolinha5);
		sleep(1000);

		// Quinto Subnivel

		campolinha5.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(1000);


		relatorio5.sendKeys(relatorioUsar);
		sleep(1000);
		relatorio5.sendKeys(Keys.ENTER);
		sleep(1000);

		valor5.click();
		sleep(1000);
		opcao2.click();
		sleep(1000);

		actionsMoveToElementElement(siguiente);
		sleep(1000);

		campoLinha5.click();

		sleep(1000);
		campoLinhaO5.click();

		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		actionsMoveToElementElement(campolinha6);
		sleep(1000);

		// Sexto Subnivel

		campolinha6.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(1000);


		relatorio6.sendKeys(relatorioUsar);
		sleep(1000);
		relatorio6.sendKeys(Keys.ENTER);
		sleep(1000);

		valor6.click();
		sleep(1000);
		opcao2.click();
		sleep(1000);

		actionsMoveToElementElement(siguiente);
		sleep(1000);

		campoLinha6.click();
		sleep(1000);
		campoLinhaO6.click();

		sleep(1000);

		ordenacao6.click();
		sleep(1000);
		ordenacaoO6.click();
		sleep(1000);

		campoOrdenacao6.click();
		sleep(1000);
		campoOrdenacaoO6.click();

		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		actionsMoveToElementElement(campolinha7);
		sleep(1000);
		
		
		
		// Septimo Subnivel

		campolinha7.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(1000);


		relatorio7.sendKeys(relatorioUsar);
		sleep(1000);
		relatorio7.sendKeys(Keys.ENTER);
		sleep(1000);

		valor7.click();
		sleep(1000);
		opcao2.click();
		sleep(1000);

		actionsMoveToElementElement(siguiente);
		sleep(1000);

		campoLinha7.click();

		sleep(1000);
		campoLinhaO7.click();

		sleep(1000);

		ordenacao7.click();
		sleep(1000);
		ordenacaoO7.click();
		sleep(1000);

		campoOrdenacao7.click();
		sleep(1000);
		campoOrdenacaoO7.click();

		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(9000);
		waitExpectXpath("//button[text()=\"Sim\"]");
		WebElement btnSeguirBloqueo = driver.findElement(By.xpath("//button[text()=\"Sim\"]"));
		sleep(1000);
		btnSeguirBloqueo.click();
		sleep(2000);

		siguiente.click();
		sleep(2000);
		actionsMoveToElementElement(campolinha8);
		sleep(3000);
//		waitExpectXpath("//button[text()=\"Sim\"]");
//		WebElement btnSeguirBloqueo = driver.findElement(By.xpath("//button[text()=\"Sim\"]"));
//		sleep(1000);
//		btnSeguirBloqueo.click();
		//sleep(2000);
		
		
		
		// Octavo Subnivel
		
		

		campolinha8.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(1000);


		relatorio8.sendKeys(relatorioUsar);
		sleep(1000);
		relatorio8.sendKeys(Keys.ENTER);
		sleep(2000);
		
		

		valor8.click();
		sleep(1000);
		opcao2.click();
		sleep(1000);

		agrupamento8.click();
		sleep(1000);
		
		listaAgrupamento8.click();
		sleep(1000);
		listaAgrupamentoO8.click();
		listaAgrupamentoO8.sendKeys(Keys.ESCAPE);
		

		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		actionsMoveToElementElement(campolinha9);
		sleep(1000);
		
		
		
		
		// Octavo Subnivel

		campolinha9.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(1000);

	
		relatorio9.sendKeys(relatorioUsar);
		sleep(1000);
		relatorio9.sendKeys(Keys.ENTER);
		sleep(1000);

		valor9.click();
		sleep(1000);
		opcao2.click();
		sleep(1000);

		agrupamento9.click();
		sleep(1000);
		
		listaAgrupamento9.click();
		sleep(1000);
		listaAgrupamentoO9.click();
		listaAgrupamentoO9.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		subAgrupamento9.click();
		sleep(1000);
		listaSubAgrupamento9.click();
		sleep(1000);
		listaSubAgrupamentoO9.click();
		listaSubAgrupamentoO9.sendKeys(Keys.ESCAPE);

		sleep(2000);

		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectXpath("//span[@id=\"textLabel\"]");

		//waitExpectElement(executar);
		sleep(12000);
		System.out.println("cheguei aqui");
		sleep(6000);
		executar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectXpath("//input[@placeholder=\"Selecionar Subperíodo\"]");
		sleep(3000);
		
		
	}
	
	public void executar() {
		
		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1=false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else {
			tq1=true;
		}
		
		sleep(1000);
		executar.click();
		sleep(3000);
		waitExpectElement(executarM);
		sleep(2000);
		executarM.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		periodo.click();
		sleep(3000);
		paginaAnterior.click();
		sleep(2000);
		ano2016.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		jan.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		if (tc2 == true || tp1== true) {
			y1.click();
		}else {
			m1.click();
		}
		
		sleep(2000);
		execucaoAnalitica.click();
		sleep(1000);
		executarB.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[contains(@class,\"base-dialog\")]");
		sleep(5000);
		aba1.click();
		sleep(1000);
		hierarquia1.click();
		sleep(1000);
		grupo1.click();
		sleep(1000);		
	}
	
	public ArrayList<Boolean> subnivel1() {
		boolean tc2 = false;
		boolean tp1 = false;
		
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sleep(1000);
		subnivel1.click();
		sleep(1000);
		valorBCBG = valorAjusteTotalBCB1.getText();
		System.out.println(valorBCBG);
		String parent = driver.getWindowHandle();
		parentG = parent;
		
		System.out.println("Parent Window Id: " + parent);
	
		verNoBRB1.click();
		sleep(2000);
		
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("Total Windows: "+count);
		
		for (String child : allWindows) {
			if (!parent.equals(child)) {
				driver.switchTo().window(child);
			}
		}
		
		waitExpectXpath("//li[contains(@class,\"alignRight\")]");
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println("--------------------------------------Subnivel 1------------------------------------");
		
		configuracoesBRB.click();
		sleep(3000);
		
		
		//valor total
		String valorAjusteTotalBRBS = valorAjusteTotalBRB.getText();
		valorAjusteTotalBRBS = formatear(valorAjusteTotalBRBS);
		double valorAjusteTotalBRBD = convertToDouble(valorAjusteTotalBRBS);
		System.out.println("Valor Ajuste Total BRB: " + valorAjusteTotalBRBS);
		
		String valorAjusteTotalBCB = valorBCBG;
		valorAjusteTotalBCB = formatear(valorAjusteTotalBCB);
		double valorAjusteTotalBCBD = convertToDouble(valorAjusteTotalBCB);
		System.out.println("Valor Ajuste Total BCB: " + valorAjusteTotalBCB);
		
		System.out.println(igualDobule(valorAjusteTotalBRBD, valorAjusteTotalBCBD));
		sucesso.add(igualDobule(valorAjusteTotalBRBD, valorAjusteTotalBCBD));
		
		
		//empresa
		
		String empresaBRBS= empresaBRB.getAttribute("value");
		String empresaOpradorS= empresaOperador.getText();
		System.out.println("Empresa: " + empresaBRBS);
		System.out.println("Operador: " + empresaOpradorS);
		
		
		System.out.println(empresaBRBS.equals("1000"));
		sucesso.add(empresaBRBS.equals("1000"));
		sucesso.add(empresaOpradorS.equals("="));
		
		//valor de ajuste
		
		String valorAjuste1BRBS = valorDoAjuste1BRB.getAttribute("value");
		String valorAjuste1OperadorS = valorDoAjuste1Operador.getText();
		System.out.println("Valor Ajuste 1: "+ valorAjuste1BRBS);
		System.out.println("Valor Ajuste Operador 1: "+ valorAjuste1OperadorS);
		System.out.println(valorAjuste1BRBS.equals("5000"));
		sucesso.add(valorAjuste1BRBS.equals("5000"));
		sucesso.add(valorAjuste1OperadorS.equals(">"));
		
		
		
		String valorAjuste2BRBS = valorDoAjuste2BRB.getAttribute("value");
		String valorAjuste2OperadorS = valorDoAjuste2Operador.getText();
		System.out.println("Valor Ajuste 2:" +valorAjuste2BRBS  );
		System.out.println("Valor Ajuste 2: "+valorAjuste2OperadorS);
		System.out.println(valorAjuste2BRBS.equals("0"));
		sucesso.add(valorAjuste2BRBS.equals("0"));
		sucesso.add(valorAjuste2OperadorS.equals(">"));

		
		
		//filial
		
		String filialBRBS = filialBRB.getAttribute("value");
		String filialOperadorS = filialOperador.getText();
		System.out.println("Filial: "+filialBRBS);
		System.out.println("Filial Operador: " +filialOperadorS);
		
		if (tc2==true) {
			System.out.println(filialBRBS.equals("0121"));
			sucesso.add(filialBRBS.equals("0121"));
			sucesso.add(filialOperadorS.equals("="));
		}else {
			System.out.println(filialBRBS.equals("0001"));
			sucesso.add(filialBRBS.equals("0001"));
			sucesso.add(filialOperadorS.equals("="));
		}
		
		

		//data lancamento
		String datalancamento1BRBS = dataLancamento1BRB.getAttribute("value");
		String datalancamento1OperadorS = dataLancamento1Operador.getText();
		System.out.println("Data Lançamento 1: "+datalancamento1BRBS);
		System.out.println("Data Lançamento 1: " +datalancamento1OperadorS);
		

		System.out.println(datalancamento1BRBS.equals("01/01/2016"));
		sucesso.add(datalancamento1BRBS.equals("01/01/2016"));

		
		String datalancamento2BRBS = dataLancamento2BRB.getAttribute("value");
		String datalancamento2OpradorS = dataLancamento2Operador.getText();
		System.out.println("Data Lançamento 2: "+ datalancamento2BRBS);
		System.out.println("Data Lançamento 2: "+ datalancamento2OpradorS);
		
		if (tc2==true || tp1 == true) {
			System.out.println(datalancamento2BRBS.equals("31/12/2016"));
			sucesso.add(datalancamento2BRBS.equals("31/12/2016"));
		}else {
			System.out.println(datalancamento2BRBS.equals("31/01/2016"));
			sucesso.add(datalancamento2BRBS.equals("31/01/2016"));
		}

		
		
		//Uf filial
		String ufFilialBRBS = ufFilialBRB.getAttribute("value");
		String ufFilialOperadorS = ufFilialOperador.getText();
		System.out.println("UF da Filial: "+ufFilialBRBS);
		System.out.println("UF da Filial: "+ufFilialOperadorS);
		System.out.println(ufFilialBRBS.equals("SP"));
		sucesso.add(ufFilialBRBS.equals("SP"));
		sucesso.add(ufFilialOperadorS.equals("="));

		
		System.out.println(sucesso);
		driver.close();
		
		driver.switchTo().window(parentG);
		
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> subNivel2() {
		
		boolean tc2 = false;
		boolean tp1 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}
		
		System.out.println("--------------------------------------------SubNivel 2-------------------------------------");
		sleep(1000);
		subnivel1.click();
		sleep(1000);
		subnivel2.click();
		sleep(1000);
		valorBCBG = valorAjusteTotalBCB2.getText();
		String tempoBCBS = tempoBCB.getText();
		
		verNoBRB2.click();
		sleep(2000);
		
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("Total Windows: "+count);
		
		for (String child : allWindows) {
			if (!parentG.equals(child)) {
				driver.switchTo().window(child);
			}
		}
		
	
		waitExpectXpath("//li[contains(@class,\"alignRight\")]");
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracoesBRB.click();
		sleep(3000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (tp1==true || tc2==true) {
			
			sucesso.add(tempoBCBS.equals("(01/01/2015 - 31/12/2016)"));
		}else {
			sucesso.add(tempoBCBS.equals("(01/12/2015 - 31/01/2016)"));
		}
		
		
		//valor de Ajusto Total
		String valorAjusteTotalBRBS = valorAjusteTotalBRB.getText();
		valorAjusteTotalBRBS = formatear(valorAjusteTotalBRBS);
		double valorAjusteTotalBRBD = convertToDouble(valorAjusteTotalBRBS);
		System.out.println("Valor Ajuste Total BRB: " + valorAjusteTotalBRBS);
		
		String valorAjusteTotalBCB = valorBCBG;
		valorAjusteTotalBCB = formatear(valorAjusteTotalBCB);
		double valorAjusteTotalBCBD = convertToDouble(valorAjusteTotalBCB);
		System.out.println("Valor Ajuste Total BCB: " + valorAjusteTotalBCB);
		
		System.out.println(igualDobule(valorAjusteTotalBRBD, valorAjusteTotalBCBD));
		sucesso.add(igualDobule(valorAjusteTotalBRBD, valorAjusteTotalBCBD));
		
		
		//Empresa
		
		String empresaBRBS= empresaBRB.getAttribute("value");
		String empresaOpradorS= empresaOperador.getText();
		System.out.println("Empresa: " + empresaBRBS);
		System.out.println("Operador: " + empresaOpradorS);
		
		System.out.println(empresaBRBS.equals("1000"));
		sucesso.add(empresaBRBS.equals("1000"));
		sucesso.add(empresaOpradorS.equals("="));
		
		//Valor de Ajuste
		
		String valorAjuste1BRBS = valorDoAjuste1BRB.getAttribute("value");
		String valorAjuste1OperadorS = valorDoAjuste1Operador.getText();
		System.out.println("Valor Ajuste: "+ valorAjuste1BRBS);
		System.out.println("Valor Ajuste Operador: "+ valorAjuste1OperadorS);
		System.out.println(valorAjuste1BRBS.equals("0"));
		sucesso.add(valorAjuste1BRBS.equals("0"));
		sucesso.add(valorAjuste1OperadorS.equals(">"));

		
		//Filial
		
		String filialBRBS = filialBRB.getAttribute("value");
		String filialOperadorS = filialOperador.getText();
		System.out.println("Filial: "+filialBRBS);
		System.out.println("Filial Operador: " +filialOperadorS);
		
		if (tc2==true) {

			System.out.println(filialBRBS.equals("0001"));
			sucesso.add(filialBRBS.equals("0121"));
		}else {
			System.out.println(filialBRBS.equals("0001"));
			sucesso.add(filialBRBS.equals("0001"));
		}


		sucesso.add(filialOperadorS.equals("="));
		

		//Data Lancamento
		String datalancamento1BRBS = dataLancamento1BRB.getAttribute("value");
		String datalancamento1OperadorS = dataLancamento1Operador.getText();
		System.out.println("Data Lançamento 1: "+datalancamento1BRBS);
		System.out.println("Data Lançamento 1: " +datalancamento1OperadorS);

		if (tp1==true || tc2==true) {

			System.out.println(datalancamento1BRBS.equals("01/01/2015"));
			sucesso.add(datalancamento1BRBS.equals("01/01/2015"));
		}else {
			System.out.println(datalancamento1BRBS.equals("01/12/2015"));
			sucesso.add(datalancamento1BRBS.equals("01/12/2015"));
		}


		
		String datalancamento2BRBS = dataLancamento2BRB.getAttribute("value");
		String datalancamento2OpradorS = dataLancamento2Operador.getText();
		System.out.println("Data Lançamento 2: "+ datalancamento2BRBS);
		System.out.println("Data Lançamento 2: "+ datalancamento2OpradorS);
		
		if (tp1==true || tc2==true) {
			System.out.println(datalancamento2BRBS.equals("31/12/2016"));
			sucesso.add(datalancamento2BRBS.equals("31/12/2016"));
		}else {
			System.out.println(datalancamento2BRBS.equals("31/01/2016"));
			sucesso.add(datalancamento2BRBS.equals("31/01/2016"));
		}
		

		
		
		//Filial
		String ufFilialBRBS = ufFilialBRB.getAttribute("value");
		String ufFilialOperadorS = ufFilialOperador.getText();
		System.out.println("UF da Filial: "+ufFilialBRBS);
		System.out.println("UF da Filial: "+ufFilialOperadorS);
		System.out.println(ufFilialBRBS.equals("SP"));
		sucesso.add(ufFilialBRBS.equals("SP"));
		sucesso.add(ufFilialOperadorS.equals("="));

		
		System.out.println(sucesso);
		driver.close();
		
		driver.switchTo().window(parentG);
		
		
		
		return sucesso;
		

	}
	
	public ArrayList<Boolean> subNivel3() {
		
		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else {
			tq1 = true;
		}
		System.out.println("--------------------------------------------SubNivel 3-------------------------------------");
		sleep(1000);
		subnivel2.click();
		sleep(1000);
		subnivel3.click();
		sleep(1000);
		valorBCBG = valorAjusteTotalBCB3.getText();
		String subPeriodoBCBS = subPeriodoBCB3.getText();
		
		verNoBRB3.click();
		sleep(2000);
		
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("Total Windows: "+count);
		
		for (String child : allWindows) {
			if (!parentG.equals(child)) {
				driver.switchTo().window(child);
			}
		}
		
		
		waitExpectXpath("//li[contains(@class,\"alignRight\")]");
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracoesBRB.click();
		sleep(3000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (tp1 == true || tc2==true) {
			sucesso.add(subPeriodoBCBS.equals("(Subperíodo 01/2015 - 1Y)"));
		}else {
			sucesso.add(subPeriodoBCBS.equals("(Subperíodo 12/2015 - 1M)"));
		}
		
		
		//valor de Ajusto Total
		String valorAjusteTotalBRBS = valorAjusteTotalBRB.getText();
		valorAjusteTotalBRBS = formatear(valorAjusteTotalBRBS);
		double valorAjusteTotalBRBD = convertToDouble(valorAjusteTotalBRBS);
		System.out.println("Valor Ajuste Total BRB: " + valorAjusteTotalBRBS);
		
		String valorAjusteTotalBCB = valorBCBG;
		valorAjusteTotalBCB = formatear(valorAjusteTotalBCB);
		double valorAjusteTotalBCBD = convertToDouble(valorAjusteTotalBCB);
		System.out.println("Valor Ajuste Total BCB: " + valorAjusteTotalBCB);
		
		System.out.println(igualDobule(valorAjusteTotalBRBD, valorAjusteTotalBCBD));
		sucesso.add(igualDobule(valorAjusteTotalBRBD, valorAjusteTotalBCBD));
		
		
		//Empresa
		
		String empresaBRBS= empresaBRB.getAttribute("value");
		String empresaOpradorS= empresaOperador.getText();
		System.out.println("Empresa: " + empresaBRBS);
		System.out.println("Operador: " + empresaOpradorS);
		
		System.out.println(empresaBRBS.equals("1000"));
		sucesso.add(empresaBRBS.equals("1000"));
		sucesso.add(empresaOpradorS.equals("="));
		
		//Valor de Ajuste
		
		String valorAjuste1BRBS = valorDoAjuste1BRB.getAttribute("value");
		String valorAjuste1OperadorS = valorDoAjuste1Operador.getText();
		System.out.println("Valor Ajuste: "+ valorAjuste1BRBS);
		System.out.println("Valor Ajuste Operador: "+ valorAjuste1OperadorS);
		System.out.println(valorAjuste1BRBS.equals("0"));
		sucesso.add(valorAjuste1BRBS.equals("0"));
		sucesso.add(valorAjuste1OperadorS.equals(">"));

		
		//Filial
		
		String filialBRBS = filialBRB.getAttribute("value");
		String filialOperadorS = filialOperador.getText();
		System.out.println("Filial: "+filialBRBS);
		System.out.println("Filial Operador: " +filialOperadorS);
		if (tc2==true) {
			System.out.println(filialBRBS.equals("0121"));
			sucesso.add(filialBRBS.equals("0121"));
		}else{
			System.out.println(filialBRBS.equals("0001"));
			sucesso.add(filialBRBS.equals("0001"));
		}
		
		sucesso.add(filialOperadorS.equals("="));
		

		//Data Lancamento
		String datalancamento1BRBS = dataLancamento1BRB.getAttribute("value");
		String datalancamento1OperadorS = dataLancamento1Operador.getText();
		System.out.println("Data Lançamento 1: "+datalancamento1BRBS);
		System.out.println("Data Lançamento 1: " +datalancamento1OperadorS);
		
		if (tc2==true|| tq1==true) {
			
			System.out.println(datalancamento1BRBS.equals("01/12/2015"));
			sucesso.add(datalancamento1BRBS.equals("01/12/2015"));
		}else{
			
			System.out.println(datalancamento1BRBS.equals("01/01/2016"));
			sucesso.add(datalancamento1BRBS.equals("01/01/2016"));
		}

		String datalancamento2BRBS = dataLancamento2BRB.getAttribute("value");
		String datalancamento2OpradorS = dataLancamento2Operador.getText();
		System.out.println("Data Lançamento 2: "+ datalancamento2BRBS);
		System.out.println("Data Lançamento 2: "+ datalancamento2OpradorS);
		
		System.out.println(datalancamento2BRBS.equals("31/12/2015"));
		sucesso.add(datalancamento2BRBS.equals("31/12/2015"));


		
		
		//Filial
		String ufFilialBRBS = ufFilialBRB.getAttribute("value");
		String ufFilialOperadorS = ufFilialOperador.getText();
		System.out.println("UF da Filial: "+ufFilialBRBS);
		System.out.println("UF da Filial: "+ufFilialOperadorS);
		System.out.println(ufFilialBRBS.equals("SP"));
		sucesso.add(ufFilialBRBS.equals("SP"));
		sucesso.add(ufFilialOperadorS.equals("="));

		
		System.out.println(sucesso);
		driver.close();
		
		driver.switchTo().window(parentG);
		
		
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> subNivel4() {
		
		boolean tc2 = false;
		boolean tp1 = false;
		
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1=true;
		}
		System.out.println("--------------------------------------------SubNivel 4-------------------------------------");
		sleep(1000);
		subnivel3.click();
		sleep(1000);
		subnivel4.click();
		sleep(1000);

		verNoBRB4.click();
		sleep(2000);
		
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		System.out.println("Total Windows: "+count);
		
		for (String child : allWindows) {
			if (!parentG.equals(child)) {
				driver.switchTo().window(child);
			}
		}
		
		
		waitExpectXpath("//li[contains(@class,\"alignRight\")]");
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracoesBRB.click();
		sleep(3000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		
		//Empresa
		
		String empresaBRBS= empresaBRB.getAttribute("value");
		String empresaOpradorS= empresaOperador.getText();
		System.out.println("Empresa: " + empresaBRBS);
		System.out.println("Operador: " + empresaOpradorS);
		
		System.out.println(empresaBRBS.equals("1000"));
		sucesso.add(empresaBRBS.equals("1000"));
		sucesso.add(empresaOpradorS.equals("="));
		
		//Valor de Ajuste
		
		String valorAjuste1BRBS = valorDoAjuste1BRB.getAttribute("value");
		String valorAjuste1OperadorS = valorDoAjuste1Operador.getText();
		System.out.println("Valor Ajuste: "+ valorAjuste1BRBS);
		System.out.println("Valor Ajuste Operador: "+ valorAjuste1OperadorS);
		System.out.println(valorAjuste1BRBS.equals("0"));
		sucesso.add(valorAjuste1BRBS.equals("0"));
		sucesso.add(valorAjuste1OperadorS.equals(">"));

		
		//Filial
		
		String filialBRBS = filialBRB.getAttribute("value");
		String filialOperadorS = filialOperador.getText();
		System.out.println("Filial: "+filialBRBS);
		System.out.println("Filial Operador: " +filialOperadorS);
		if (tc2==true) {
			System.out.println(filialBRBS.equals("0121"));
			sucesso.add(filialBRBS.equals("0121"));
		}else{
			System.out.println(filialBRBS.equals("0001"));
			sucesso.add(filialBRBS.equals("0001"));
		}
		sucesso.add(filialOperadorS.equals("="));
		

		//Data Lancamento
		String datalancamento1BRBS = dataLancamento1BRB.getAttribute("value");
		String datalancamento1OperadorS = dataLancamento1Operador.getText();
		System.out.println("Data Lançamento 1: "+datalancamento1BRBS);
		System.out.println("Data Lançamento 1: " +datalancamento1OperadorS);
		
		System.out.println(datalancamento1BRBS.equals("01/01/2016"));
		sucesso.add(datalancamento1BRBS.equals("01/01/2016"));



		
		String datalancamento2BRBS = dataLancamento2BRB.getAttribute("value");
		String datalancamento2OpradorS = dataLancamento2Operador.getText();
		System.out.println("Data Lançamento 2: "+ datalancamento2BRBS);
		System.out.println("Data Lançamento 2: "+ datalancamento2OpradorS);
		
		if (tc2==true || tp1 == true) {
			System.out.println(datalancamento2BRBS.equals("31/12/2016"));
			sucesso.add(datalancamento2BRBS.equals("31/12/2016"));
		}else {
			System.out.println(datalancamento2BRBS.equals("31/01/2016"));
			sucesso.add(datalancamento2BRBS.equals("31/01/2016"));
		}
		

		
		
		//UFFilial
		String ufFilialBRBS = ufFilialBRB.getAttribute("value");
		String ufFilialOperadorS = ufFilialOperador.getText();
		System.out.println("UF da Filial: "+ufFilialBRBS);
		System.out.println("UF da Filial: "+ufFilialOperadorS);
		System.out.println(ufFilialBRBS.equals("SP"));
		sucesso.add(ufFilialBRBS.equals("SP"));
		sucesso.add(ufFilialOperadorS.equals("="));

		
		System.out.println(sucesso);
		driver.close();
		
		driver.switchTo().window(parentG);
		
		
		return sucesso;
		
	}

	public boolean subNivel5() {
		
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		System.out.println("--------------------------------------------SubNivel 5-------------------------------------");
		sleep(1000);
		subnivel4.click();
		sleep(1000);
		subnivel5.click();
		sleep(1000);
		
		boolean sucesso = cfop5.isDisplayed();
		
		System.out.println(sucesso);
		return sucesso;
		
		
	}
	
	public ArrayList<Boolean> subNivel6() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		System.out.println("--------------------------------------------SubNivel 6-------------------------------------");
		sleep(1000);
		subnivel5.click();
		sleep(1000);
		subnivel6.click();
		sleep(1000);
		
		int rows = driver.findElements(By.xpath("//div[@id=\"1_1_1_6\"]/div[2]/div/table/tbody/tr[not(contains(@style,\"rgb\"))]/td[1]/span")).size();
		
		ArrayList<Integer> cfopList = new ArrayList<Integer>();

		String anterior ="";
		String anteriorNumeros = "";
		int f=1;
		for (int i = 0; i < rows; i++) {
			
			String cfop = driver.findElement(By.xpath("//div[@id=\"1_1_1_6\"]/div[2]/div/table/tbody/tr[not(contains(@style,\"rgb\"))]["+f+"]/td[1]/span")).getText();
			String cfopNumeros ="";
			if (!cfop.isEmpty()) {
				if (!cfop.equals(anterior)) {
					String[] cfopSplit = cfop.split("/");
					cfop = cfopSplit[0];
					boolean numero = isNum(cfop);
					if (numero == true) {
						cfopNumeros = cfop;
					}
						
					if (!cfopNumeros.equals(anteriorNumeros)) {
						int cfopI = Integer.valueOf(cfopNumeros);
						cfopList.add(cfopI);
					}
					

				}
			}
			
			anterior = cfop;
			anteriorNumeros = cfopNumeros;
			
			f = f+1;
		}
		
		System.out.println(cfopList);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		for (int i = 0; i < cfopList.size()-1; i++) {
			
			int menor = 0;
			int j = i+1;
			System.out.println("Comparacion: "+j);	
				menor = cfopList.get(i).compareTo(cfopList.get(j));
				System.out.println("Registro  "+ i + "  "+ cfopList.get(i));	
				System.out.println("Registro  "+ j + "  "+ cfopList.get(j));		
				if (menor <  0) {
					sucesso.add(true);
				}else {
					
					sucesso.add(false);
				}
			System.out.println(sucesso.get(i));
			
		}
		

		System.out.println(sucesso);
		
		return sucesso;
		
	}
		
	public ArrayList<Boolean> subNivel7() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		System.out.println("--------------------------------------------SubNivel 7-------------------------------------");
		sleep(1000);
		subnivel6.click();
		sleep(1000);
		subnivel7.click();
		sleep(1000);
		
		int rows = driver.findElements(By.xpath("//div[@id=\"1_1_1_7\"]/div[2]/div/table/tbody/tr[not(contains(@style,\"rgb\"))]/td[1]/span")).size();
		
		ArrayList<Integer> cfopList = new ArrayList<Integer>();

		String anterior ="";
		String anteriorNumeros = "";
		int f=1;
		for (int i = 0; i < rows; i++) {
			
			String cfop = driver.findElement(By.xpath("//div[@id=\"1_1_1_7\"]/div[2]/div/table/tbody/tr[not(contains(@style,\"rgb\"))]["+f+"]/td[1]/span")).getText();
			String cfopNumeros ="";
			if (!cfop.isEmpty()) {
				if (!cfop.equals(anterior)) {
					String[] cfopSplit = cfop.split("/");
					cfop = cfopSplit[0];
					boolean numero = isNum(cfop);
					if (numero == true) {
						cfopNumeros = cfop;
					}
						
					if (!cfopNumeros.equals(anteriorNumeros)) {
						int cfopI = Integer.valueOf(cfopNumeros);
						cfopList.add(cfopI);
					}
					

				}
			}
			
			anterior = cfop;
			anteriorNumeros = cfopNumeros;
			
			f = f+1;
		}
		
		System.out.println(cfopList);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		for (int i = 0; i < cfopList.size()-1; i++) {
			
			int menor = 0;
			int j = i+1;
			System.out.println("Comparacion: "+j);	
				menor = cfopList.get(i).compareTo(cfopList.get(j));
				System.out.println("Registro  "+ i + "  "+ cfopList.get(i));	
				System.out.println("Registro  "+ j + "  "+ cfopList.get(j));		
				if (menor >  0) {
					sucesso.add(true);
				}else {
					
					sucesso.add(false);
				}
			System.out.println(sucesso.get(i));
			
		}
		

		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> subNivel8() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		System.out.println("--------------------------------------------SubNivel 8-------------------------------------");
		sleep(1000);
		subnivel7.click();
		sleep(1000);
		subnivel8.click();
		sleep(1000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"lvl-3\")][8]/div[2]/div/table/tbody/tr[not(contains(@class,\"header\")) and @class]")).size();
		
		int f = 1; 
		for (int i = 0; i < rows; i++) {
			
			String numeroColuna = driver.findElement(By.xpath("//div[contains(@class,\"lvl-3\")][8]/div[2]/div/table/tbody/tr[not(contains(@class,\"header\")) and @class]["+f+"]/td/div/div")).getText();
			System.out.println(numeroColuna);
			
			int numeroColunaI = convertToInt(numeroColuna);
			
			if (numeroColunaI == f) {
				sucesso.add(true);
			}else {
				sucesso.add(false);
			}
			

			f = f+1;
			
		}
		
		System.out.println(sucesso);
		return sucesso;
		
	}
	
	public ArrayList<Boolean> subNivel9() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		System.out.println("--------------------------------------------SubNivel 9-------------------------------------");
		sleep(1000);
		subnivel8.click();
		sleep(1000);
		subnivel9.click();
		sleep(1000);
		
		String cfopTabla = driver.findElement(By.xpath("//div[contains(@class,\"lvl-3\")][9]/div[2]/div/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(cfopTabla);
		
		flecha9.click();
		sleep(1000);
		
	
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"lvl-3\")][9]/div[2]/div/table/tbody/tr[3]/td/table/tbody/tr[contains(@class,\"detail\")]")).size();
		
		int f = 1; 
		for (int i = 0; i < rows; i++) {
			
			String cfopRegistro = driver.findElement(By.xpath("//div[contains(@class,\"lvl-3\")][9]/div[2]/div/table/tbody/tr[3]/td/table/tbody/tr[contains(@class,\"detail\")]["+rows+"]/td[2]/span")).getText();
			System.out.println(cfopRegistro);
			
			if (cfopRegistro.equals(cfopTabla)) {
				sucesso.add(true);
			}else {
				sucesso.add(false);
			}
			
			

			f = f+1;
			
		}
		
		String colunaData = driver.findElement(By.xpath("//div[contains(@class,\"lvl-3\")][9]/div[2]/div/table/tbody/tr[3]/td/table/tbody/tr/th[3]/span")).getText();
		
		System.out.println("Valor da Coluna: "+ colunaData.equals("Data lançamento doc. fiscal"));
		sucesso.add(colunaData.equals("Data lançamento doc. fiscal"));
		
		
		System.out.println(sucesso);
		return sucesso;
		
	}

	public ArrayList<Boolean> excluirConfiguracao() {
		
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		String idConfiguracao = idObter2();
		
		pesquisar.sendKeys(idConfiguracao);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div"));
		WebElement lixeiraO = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		menu.click();
		sleep(1000);
		lixeiraO.click();
		sleep(3000);
		waitExpectElement(sim);
		sleep(1000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		
		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"A Configuração de Hierarquia foi enviada para a Lixeira\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (exclucao>0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		lixeira.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys(idConfiguracao);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div"));
		WebElement excluirL = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		excluirL.click();
		sleep(3000);
		waitExpectElement(sim);
		sleep(1000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		/*
		int exclucao2 = driver.findElements(By.xpath("//span[contains(text(),\"A configuração do builder foi excluída com sucesso\")]")).size();
		
		if (exclucao2>1) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		*/
		
		return sucesso;
	}
	
	public ArrayList<Boolean> excluirHierarquia() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		hierarquias.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idHierarquia = idObter1();
		
		siguiente.click();
		sleep(2000);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia+"\"]/div[1]/div"));
		WebElement lixeiraO = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		menu.click();
		sleep(1000);
		lixeiraO.click();
		sleep(3000);
		waitExpectElement(sim);
		sleep(1000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(3000);
		
		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"A Configuração de Hierarquia foi enviada para a Lixeira\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (exclucao>0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		WebElement lixeiraH = driver.findElement(By.xpath("//li[@identifier=\"accordion-item-inactiveHierarchies\"]"));
		lixeiraH.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia+"\"]/div[1]/div"));
		WebElement excluirL = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		excluirL.click();
		sleep(3000);
		waitExpectElement(sim);
		sleep(1000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		/*
		int exclucao2 = driver.findElements(By.xpath("//span[contains(text(),\"A configuração do builder foi excluída com sucesso\")]")).size();
		
		if (exclucao2>1) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		*/
		return sucesso;
	}
	
	
	
}
