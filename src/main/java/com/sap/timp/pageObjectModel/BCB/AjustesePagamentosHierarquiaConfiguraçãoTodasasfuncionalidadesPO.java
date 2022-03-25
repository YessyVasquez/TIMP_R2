package com.sap.timp.pageObjectModel.BCB;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AjustesePagamentosHierarquiaConfiguraçãoTodasasfuncionalidadesPO extends TestBaseSteven {
	//TSTNG-2265
	
	// TAA	
	@FindBy(xpath = "//div[text()=\"TAA\"]")
	public WebElement taa;
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]")
	public WebElement mostrar;
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[1]")
	public WebElement ajuste;
	@FindBy(xpath = "//div[@class=\"adjustment-accordion accordion-adjustments\"]/ul/li[7]")
	public WebElement iCMS;
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	
	//Accesar TPC	
	@FindBy(xpath = "//div[text()=\"TPC\"]")
	public WebElement tpc;	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement ar;	
	@FindBy(xpath = "//*[@id=\"home-icon\"]")
	public WebElement home;	
	@FindBy(xpath = "//*[@id=\"left-content\"]/div[2]/ul/li[13]")
	public WebElement IRPJ;
	
	//BCB
	@FindBy(xpath = "//div[text()=\"BCB\"]")
	public WebElement bcb;
	@FindBy(xpath = "//*[@id=\"login-btn\"]")
	public WebElement botao;
	
	
		//nova Herarquia
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
		
		@FindBy(xpath = "//input[contains(@placeholder,\"Preencher Nome\")]")
		public WebElement nomeDaAba2;
	
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
		
		
		// Configuracao

		@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][2]")
		public WebElement configuracoes;
		@FindBy(xpath = "//span[text()=\"Configuração da Consolidação\"]")
		public WebElement configuracaoDaConsolidacao;
		@FindBy(xpath = "//input[contains(@placeholder,\"nome de Hierarquia\")]")
		public WebElement nomeHirarquia;
		@FindBy(xpath = "//div[contains(@id,\"00\")]/div/label/span")
		public WebElement nomeHirarquiaO;
		@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo\"]")
		public WebElement tributo;
		@FindBy(xpath = "//*[@id=\"12\"]/div[1]/label/span")
		public WebElement tributoO;
		@FindBy(xpath = "//*[@id=\"overlay\"]/div/div[6]")
		public WebElement tributoMove;
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
		@FindBy(xpath = "//button[contains(text(),\"Cancelar\")]")
		public WebElement cancelar;
		@FindBy(xpath = "//button[text()=\"Fechar\"]")
		public WebElement fechar;
		@FindBy(xpath = "/html/body/div[4]/div/div[3]/button[1]")
		public WebElement fechar2;
		
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
		
		//editar configuracao
		
		@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
		public WebElement idC;
		@FindBy(xpath = "//div[@id=\"calculation-type\"]/div/div/div/input")
		public WebElement campo;
		@FindBy(xpath = "//*[@id=\"main-content\"]/div/div/div[1]/div/div[1]/div/div/div/ul/li[10]/button/span")
		public WebElement confResultado;
		@FindBy(xpath = "//span[text()=\"Configuração do Resultado Final\"]")
		public WebElement confResultadoSpan;
		@FindBy(xpath = "//div[@class=\"baseTabs-view -view-wrapper  selected\"]/div/div/button")
		public WebElement confResultadoAdd;
		@FindBy(xpath = "//input[@placeholder=\"Preencher Nome do resultado\"]")
		public WebElement nomeResult;
		@FindBy(xpath = "//div[@class=\"form-field\"]/div[@id=\"condition\"]/div/div/div/input[@placeholder=\"Selecionar Condição\"]")
		public WebElement condicaoo;
		@FindBy(xpath = "//li[text()=\"Não Exibir\"]")
		public WebElement condicaoOpc;
		
		@FindBy(xpath = "//*[@id=\"main-content\"]/div/div/div[1]/div/div[1]/div/div/div/ul/li[7]/button/span")
		public WebElement plus;
		@FindBy(xpath = "//button[text()=\"Adicionar campo de saída\"]")
		public WebElement campoSaidaAdd;
		
		@FindBy(xpath = "//input[@placeholder=\"Selecionar Aba\"]")
		public WebElement aba;
		@FindBy(xpath = "//li[text()=\"Teste QA PREUBA 007\"]")
		public WebElement abaOpc;
	
		@FindBy(xpath = "//input[@placeholder=\"Preencher Nome\"]")
		public WebElement nomeSaida;
		
		
		@FindBy(xpath = "//input[@placeholder=\"Selecionar Campo de Linha \"]")
		public WebElement campoLinha;
		@FindBy(xpath = "//li[text()=\"Relatório\"]")
		public WebElement campoLinhaOpc;
		
		@FindBy(xpath = "//input[@placeholder=\"Selecionar Relatório \"]")
		public WebElement relatorio;
		@FindBy(xpath = "//li[text()=\"8005216 - TA - BCB(Ajustes e Pagamentos) - NÃO MEXER\"]")
		public WebElement relatorioOpc;
		
		@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor\"]")
		public WebElement valorAjuste;
		@FindBy(xpath = "//li[text()=\"BC IPI\"]")
		public WebElement valorAjusteOpc;
		
		@FindBy(xpath = "//li[text()=\"Valor do ajuste\"]")
		public WebElement valorAjusteSeleccion;
		
		@FindBy(xpath = "//*[@id=\"main-content\"]/div/div/div[1]/div/div[1]/div/div/div/ul/li[9]/button/span")
		public WebElement verAjuste;
		
		@FindBy(xpath = "//*[@id=\"add-button\"]")
		public WebElement addConfAjuste;
		
		@FindBy(xpath = "//input[@placeholder=\"Selecionar Tipo de Ajuste\"]")
		public WebElement tipoAjuste;
		@FindBy(xpath = "//li[text()=\"Automático\"]")
		public WebElement tipoAjusteOpc;
		
		@FindBy(xpath = "//div[@id=\"purpose\"]/div/div/div/input")
		public WebElement proposito;
		@FindBy(xpath = "//li[text()=\"Ajuste de credito\"]")
		public WebElement propositoOpc;
		@FindBy(xpath = "//li[text()=\"Ajuste de pagamento\"]")
		public WebElement propositoOpc2;
		
		@FindBy(xpath = "//*[@id=\"output-field-value\"]/div/div[@id=\"main-icon\"]")
		public WebElement valorCampo;
		@FindBy(xpath = "//li[text()=\"TESTE QA\"]")
		public WebElement valorCampoOpc;
		
		@FindBy(xpath = "//input[@placeholder=\" Selecionar Guia de pagamento\"]")
		public WebElement guiaPagamento;
		@FindBy(xpath = "//li[text()=\"171-teste\"]")
		public WebElement guiaPagamentoOpc;
		
		@FindBy(xpath = "//input[@placeholder=\"Selecionar Data de Lançamento do Ajuste\"]")
		public WebElement data;
		
		@FindBy(xpath = "//*[@id=\"search-input\"]/div/div/input")
		public WebElement pesquisarAjuste;
		
		@FindBy(xpath = "//*[@id=\"adjustment-table\"]/div/div[1]/div/div[2]/div[1]/div[2]/label/span")
		public WebElement flag;
		
		@FindBy(xpath = "//*[@id=\"main-content\"]/div/div/div[1]/div/div[1]/div/div/ul/li[4]/button/span[2]")
		public WebElement executar;
		
		@FindBy(xpath = "//*[@id=\"main-content\"]/div/div/div/div/div[1]/div/div[1]/div/div/ul/li[1]/button/span[2]")
		public WebElement executar2;
		
		@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
		public WebElement empresaExe;
		
		
		@FindBy(xpath = "//*[@id=\"subInput\"]/div/div[1]/span")
		public WebElement calendario;
		
		@FindBy(xpath = "/html/body/div[5]/div[2]/div[1]/div[1]")
		public WebElement atras;
		
		@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[3]/div[8]")
		public WebElement anio2016;
		
		@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[2]/div[2]")
		public WebElement enero;
		
		@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[3]/div[8]")
		public WebElement a1;
		
		
		
		@FindBy(xpath = "//button[text()=\"Sim\"]")
		public WebElement sim;	
		@FindBy(xpath = "/html/body/div[3]")
		public WebElement cuerpo;
	
	public AjustesePagamentosHierarquiaConfiguraçãoTodasasfuncionalidadesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean accesarTaa() {
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(2000);
		
		while (!taa.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		taa.click();

		waitExpectElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);

		boolean sucesso = mostrar.isDisplayed();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		
		ajuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		
		if (tq1 == true) {
			
			//actionsMoveToElementXpath("//*[@id=\"left-content\"]/div[2]/ul/li[13]/div/span[2]");
			WebElement icms = driver.findElement(By.xpath("//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div/ul/li[13]/div/span[2]"));
			
			icms.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		
		}else if (tp1==true ) {
			
			WebElement icms = driver.findElement(By.xpath("//div[@class=\"adjustment-accordion accordion-adjustments\"]/ul/li[15]"));
			
			icms.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		}else {
			
			WebElement icms = driver.findElement(By.xpath("//div[@class=\"adjustment-accordion accordion-adjustments\"]/ul/li[7]"));
			
			icms.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		
		}
		
		
		waitExpectElement(primeira);
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idTAA = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		
		System.out.println("ID Primer Registro TAA: "+idTAA);
		
		home.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		return sucesso;	
		
	}
	
	public boolean accesarTpc() {
		
		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!tpc.isDisplayed()) {
			flecha.click();		
		}
		sleep(1000);
		
		tpc.click();

		waitExpectElement(primeira);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);

		IRPJ.click();
		sleep(2000);

		waitExpectElement(primeira);
		sleep(8000);

		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);

		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		String idTPC = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();

		System.out.println("ID Primer Registro TPC: "+idTPC);
		

		boolean sucesso = primeira.isDisplayed();
		
		return sucesso;
	}

	public boolean accesarBCB() {
	
		home.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(3000);
		
		while(bcb.isDisplayed() == false) {
			ar.click();
		}		
	
		bcb.click();
		waitExpectXpath("//span[text()=\"Hierarquia de Configuração\"]");
		waitExpectXpath("//div[contains(@class,\"icon-right\")][2]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = mostrar.isDisplayed();
		
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> criarHerarquia(){
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

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[4]/div")).getText();
		String nome = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[5]/div")).getText();
		System.out.println(nome);

		sucesso.add(nome.equals("Teste QA PREUBA 007"));

		idInserir2(id2);

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
		sleep(2000);
		tributo.sendKeys("IRPJ");
		//actionsMoveToElementElement(tributoMove);
		sleep(3000);
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

//		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
//		sleep(1000);
//
//		uf.click();
//		sleep(1000);
//		ufO.click();
//		ufO.sendKeys(Keys.ESCAPE);
//		sleep(1000);
//
//		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
//		sleep(1000);
//
//		filial.click();
//		sleep(1000);
//		filialO.click();
//		filialO.sendKeys(Keys.ESCAPE);
//		sleep(1000);
//
//		tipoApuracao.click();
//		sleep(1000);
//		tipoApuracaoO.click();
//		sleep(1000);

		dataVigencia.sendKeys("01/01/2010");
		sleep(1000);

		gravarC.click();
		sleep(3000);
	//	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(20000);
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectXpath("//span[@id=\"textLabel\"]");
		//sleep(2000);
		
//		ultimo.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
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
		System.out.println("none: "+nome);

		sucesso.add(nome.contains("Teste QA PREUBA 007"));

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

	public boolean editarConfiguracao() {
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
		sleep(2000);
		String idRegistro = idObter1();
		System.out.println(idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(4000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//attributoNotToBeEmptyElement(campo, "value");
		//sleep(2000);
		confResultado.click();
		sleep(3000);
		confResultadoSpan.click();
		sleep(4000);
		confResultadoAdd.click();
		sleep(3000);
		
		condicaoo.click();
		sleep(2000);
		condicaoOpc.click();
		sleep(2000);
		
		criar.click();
		sleep(5000);
		fechar.click();
		sleep(2000);
		
		plus.click();
		sleep(4000);
		
		campoSaidaAdd.click();
		sleep(4000);
		
		aba.click();
		sleep(2000);
		abaOpc.click();
		sleep(2000);
		
		nomeDaAba2.sendKeys("TESTE QA");
		sleep(2000);
		
		criar.click();
		sleep(4000);
		
		fechar2.click();
		sleep(4000);
		fechar.click();
		sleep(2000);
		
		campoLinha.click();
		sleep(2000);
		campoLinha.sendKeys("Relatório");
		sleep(2000);
		campoLinhaOpc.click();
		sleep(12000);
		
		relatorio.click();
		sleep(2000);
		relatorio.sendKeys("8005216 - TA - BCB(Ajustes e Pagamentos) - NÃO");
		sleep(2000);
		relatorio.sendKeys(Keys. ENTER);
		sleep(5000);
		
		valorAjuste.click();
		sleep(2000);
		valorAjusteSeleccion.click();
		sleep(4000);

		verAjuste.click();
		sleep(4000);
		
		addConfAjuste.click();
		sleep(4000);
		
		tipoAjuste.click();
		sleep(2000);
		tipoAjusteOpc.click();
		sleep(2000);
		
		proposito.click();
		sleep(2000);
		propositoOpc.click();
		sleep(5000);
		
		valorCampo.click();
		sleep(2000);
		valorCampoOpc.click();
		sleep(2000);
		
		data.sendKeys("16/02/2021");
		sleep(3000);
		
		pesquisarAjuste.sendKeys("925");
		sleep(6000);
		
		flag.click();
		sleep(2000);
		
		criar.click();
		sleep(2000);
		
		cancelar.click();
		sleep(2000);
		

		
		addConfAjuste.click();
		sleep(2000);
		
		tipoAjuste.click();
		sleep(2000);
		tipoAjusteOpc.click();
		sleep(2000);
		
		proposito.click();
		sleep(2000);
		propositoOpc2.click();
		sleep(5000);
		
		data.sendKeys("16/02/2021");
		sleep(3000);
		
		criar.click();
		sleep(2000);
		cancelar.click();
		sleep(2000);
		
		fechar.click();
		sleep(3000);
		

		gravar.click();
		sleep(3000);
		nao.click();
		sleep(3000);

		executar.click();
		sleep(2000);
		executar2.click();
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		attributoNotToBeEmptyElement(campo, "value");
		
		sleep(2000);

		String nuevoTexto = campo.getAttribute("value");

		System.out.println(nuevoTexto);
		boolean sucesso = nuevoTexto.equals(campo);
		System.out.println(sucesso);
		

		
		return sucesso;
	}
	
}
