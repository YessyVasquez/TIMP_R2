package com.sap.timp.pageObjectModel.BCB;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;


public class HierarquiaExecucoesTodasAsFuncionalidadesPO extends TestBaseKenssy{
	
	//CRIAR CONFIGURACION
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][3]")
	public WebElement execucoes;
	
	@FindBy(xpath = "//span[text()=\"Execução da Consolidação\"]")
	public WebElement execucacoConsolidacao;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimo;
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][1]")
	public WebElement hierarquias;

	@FindBy(xpath = "//span[text()=\"Hierarquia de Configuração\"]")
	public WebElement hierarquiaConfiguracao;

	//NUEVA HIERARQUIA
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
	@FindBy(xpath = "//div[contains(@id,\"DF\")]/div/label/span")
	public WebElement ufO2;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	@FindBy(xpath = "//div[contains(@id,\"1000_SP_0001\")]/div/label/span")
	public WebElement filialO;
	@FindBy(xpath = "//div[contains(@id,\"1000_DF_0019\")]/div/label/span")
	//@FindBy(xpath = "//div[contains(@id,\"1000_SP_0001\")]/div/label/span")
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
	
	
	//ENTRADA MANUAL
	@FindBy(xpath = "//span[contains(@class,\"icon-textandtext\")]")
	public WebElement entrada;
	
	@FindBy(xpath = "//button[text()=\"Adicionar Entrada Manual\"]")
	public WebElement adicionarEntrada;
	
	@FindBy(xpath = "//div[@id=\"create-name\"]/div/div/input")
	public WebElement entradaManualNome;
	
	@FindBy(xpath = "//div[@id=\"create-value\"]/div/div/input")
	public WebElement entradaManualValor;
	
	@FindBy(xpath = "//button[contains(text(),\"Criar\")]")
	public WebElement criarAdicionarEntradaManual;
	
	
	// primer subnivel
	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"configuration\"]/div/div[2]")
	public WebElement campolinha1;
	@FindBy(xpath = "//li[text()=\"Entrada Manual\"]")
	public WebElement campoLinhaO1;
	
	@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"report\"]/div/div/div[2]")
	public WebElement entradaManual1;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement entradaManualO1;
	
	//EXECUTAR
	@FindBy(xpath = "//span[text()=\"Executar\"]")
	public WebElement executar;
	
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
	
	@FindBy(xpath = "//div[text()=\"2019\"]")
	public WebElement ano2019;
	
	@FindBy(xpath = "//div[text()=\"Nov\"]")
	public WebElement nov;
	
	
	@FindBy(xpath = "//span[text()=\"1M\"]")
	public WebElement m1;
	
	@FindBy(xpath = "//span[text()=\"1Y\"]")
	public WebElement y1;
	
	@FindBy(xpath = "//div[contains(@class,\"execution-type\")]/div[2]/label/span")
	public WebElement execucaoAnalitica;
	
	@FindBy(xpath = "//button[text()=\"Executar\"]")
	public WebElement executarB;
	
	@FindBy(xpath = "//button[text()=\"Salvar Execução\"]")
	public WebElement salvarExecucoes;
	
	@FindBy(xpath = "//span[text()=\"Finalizar\"]")
	public WebElement finalizarExecucoes;
	
	@FindBy(xpath = "//button[text()=\"Confirma\"]")
	public WebElement confirmarExecucoes;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	//LEXERIA + RESTAURAR
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement simLexeira;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-inactiveExecutions\"]")
	public WebElement pastaLexeira;
	
	
	//DATOS DEL VISUALIZAR
		@FindBy(xpath = "//div[@class=\"empresa\"]")
		public WebElement empresaV;
		@FindBy(xpath = "//div[@class=\"uf\"]")
		public WebElement ufV;
		@FindBy(xpath = "//div[@class=\"filial\"]")
		public WebElement filialV;
		@FindBy(xpath = "//div[@class=\"tributo\"]")
		public WebElement tributoV;
		@FindBy(xpath = "//div[@class=\"sub-periodo\"]")
		public WebElement subperiodoV;

	//DATOS DEL EDITAR
		@FindBy(xpath = "//div[@class=\"empresa\"]")
		public WebElement empresaE;
		@FindBy(xpath = "//div[@class=\"uf\"]")
		public WebElement ufE;
		@FindBy(xpath = "//div[@class=\"filial\"]")
		public WebElement filialE;
		@FindBy(xpath = "//div[@class=\"tributo\"]")
		public WebElement tributoE;
		@FindBy(xpath = "//div[@class=\"sub-periodo\"]")
		public WebElement subperiodoE;
	
	
	//editar+EditarEntradaManual+Imprimir+Exportar
	@FindBy(xpath = "//div/span[contains(@class,\"icon-pensil\")]")
	public WebElement editarEditarEntradaManual;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Valor\"]")
	public WebElement editarValorEntradaManual;
	
	@FindBy(xpath = "//div[@class=\"hdr hdr-0\"]")
	public WebElement aba1;
	@FindBy(xpath = "//div[@class=\"hdr hdr-1\"]")
	public WebElement hierarquia1;
	@FindBy(xpath = "//div[@class=\"hdr hdr-2\"]")
	public WebElement grupo1;
	@FindBy(xpath = "//div[@class=\"hdr hdr-3\"]")
	public WebElement subnivel1;
	
	@FindBy(xpath = "//tr[@class=\"cell hdr-4\"]/td[4]/span")
	public WebElement valorEntradaManual1;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-Printer\")]")
	public WebElement imprimir;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Modo de impressão\"]")
	public WebElement modoImpresion;
	@FindBy(xpath = "//li[text()=\"Detalhe\"]")
	public WebElement opcModoImpresion;

	
	@FindBy(xpath = "//span[contains(@class,\"icon-download\")]")
	public WebElement exportar;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Modo de exportação\"]")
	public WebElement modoExportacion;
	@FindBy(xpath = "//li[text()=\"Detalhe\"]")
	public WebElement opcModoExportacion;
	@FindBy(xpath = "//input[@placeholder=\"Preencher Nome do arquivo\"]")
	public WebElement nombreArchivoExportacion;
	
	@FindBy(xpath = "//button[text()=\"Exportar para Excel\"]")
	public WebElement exportarParaExcell;
	
	@FindBy(xpath = "//html/body/div[4]/div/div[2]/div")
	public WebElement clickFuera;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravarD;
	
	
	//EXCLUIR
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement simExcluir;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-inactiveConfigurations\"]")
	public WebElement pastaLexeiraC;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-inactiveHierarchies\"]")
	public WebElement pastaLexeiraH;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	
	
	
	public HierarquiaExecucoesTodasAsFuncionalidadesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criarConfiguracaoExecucoes() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		execucoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		execucacoConsolidacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//GUARDO EL ULTIMO ID DE LA ULTIMA PAGINA DE EXECUCOES
		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String id = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[4]/div"))
				.getText();
		idInserir4(id);
		System.out.println("Ultimo ID de Execucoes: "+id);
		System.out.println("");
		System.out.println("*************************");
		
		//IR A HIERARQUIA CONFIGURACAO
		sleep(2000);
		hierarquias.click();
		sleep(2000);
		hierarquiaConfiguracao.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rowsH = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String idH = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rowsH + "]/div[4]/div"))
				.getText();
		System.out.println("Ultimo ID de Hierarquia Configuracao: "+idH);
		
		
		nova.click();
		sleep(3000);
		waitExpectElement(nomeDeHierarquia);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		nomeDeHierarquia.sendKeys("teste automatizado hierar");
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

		for (int i = 0; i < 1; i++) {
			adicionar.click();
			sleep(1000);
		}

		int subniveisAdicionados = driver.findElements(By.xpath("//div[@id=\"sublevels\"]/div")).size();
		System.out.println(subniveisAdicionados);

		String subniveisAdicionadosS = String.valueOf(subniveisAdicionados);

		//sucesso.add(subniveisAdicionadosS.equals("1"));
		sucesso.add(subniveisAdicionadosS.equals("2"));
		int f = 1;
		for (int i = 0; i < 1; i++) {

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

		sucesso.add(nome.contains("teste automatizado"));

		idInserir1(id2);
		idInserir6(id2);
		int id1I = convertToInt(idH);
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
	
	public void ingresarDeUnSolo() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		String teste=idObter6();
		System.out.println("Id Após a teste: " + teste);
		sleep(2000);
		configuracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaoDaConsolidacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		pesquisar.sendKeys("1033");
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"1033\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"1033\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		sleep(2000);
	
	
		menu.click();
		sleep(1000);
		editar.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(calculator);
		sleep(2000);
		
		
	}
	
	public boolean criarConfiguracao() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		String teste=idObter6();
		System.out.println("Id Após a teste: " + teste);
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
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and@data-id]")).size();
		
		
		String id = driver.findElement(By.xpath("//div[@class=\"tr\" and@data-id]["+rows+"]/div[4]/div")).getText();
		System.out.println("Id Configurações antes da criação: "+ id);
		idInserir3(id); //antes de crear herarquia configuracao
		
		nova.click();
		sleep(3000);

		attributeToBeXpath("//div[@id=\"hierarchy-name\"]/div", "class", "base-autocomplete required");
		sleep(2000);

		nomeHirarquia.sendKeys("teste automatizado hierar");
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
		if (tc2==true) {
			ufO2.click();
			ufO2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else {
			ufO.click();
			ufO.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
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
		
		
		System.out.println("");
		System.out.println("***********");
		System.out.println("CONFIFURACOES");
		System.out.println("ID ANTES: " +id);
		System.out.println("ID DESPUES: "+ idApos);
		System.out.println("***********");
		System.out.println("");
		
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
		String teste=idObter6();
		System.out.println("Id Após a teste: " + teste);
//		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter2()+"\"]/div[1]/div"));
//		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter2()+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
//		sleep(2000);
		//DESCOMENTAR DESPUES, ACORDATE
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter2()+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter2()+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		sleep(2000);
//	
//	
		menu.click();
		sleep(1000);
		editar.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		///waitExpectElement(calculator);
		sleep(7000);
		
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
		waitExpectElement(nao);
		sleep(2000);
		nao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//span[@id=\"textLabel\"]");
		sleep(2000);
		
		
		entrada.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarEntrada.click();
		sleep(3000);
		waitExpectElement(criarAdicionarEntradaManual);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		entradaManualNome.sendKeys("Teste Entrada Manual");
		sleep(1000);
		
		entradaManualValor.sendKeys("1000");
		sleep(1000);
		
		
		criarAdicionarEntradaManual.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		fechar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		campolinha1.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(2000);
		
		entradaManual1.click();
		sleep(1000);
		entradaManualO1.click();
		sleep(2000);
		
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	}
	
	public boolean executar() {
			
		boolean tc2 = false;
		boolean tp1 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}
		String teste=idObter6();
		System.out.println("Id Após a teste: " + teste);
		sleep(1000);
		executar.click();
		sleep(3000);
		waitExpectElement(executarM);
		sleep(2000);
		executarM.click();
		
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		if(tc2 == true)
		{
			periodo.click();
			sleep(3000);
			paginaAnterior.click();
			sleep(2000);
			ano2019.click();
			sleep(1000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			nov.click();
			sleep(1000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			m1.click();
			
		}else {
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
		m1.click();
		}
		/*
		if (tc2) {
			y1.click(); //OJO CORREGIR PARA TC2
		}else {
			m1.click();
		}*/
		
		sleep(2000);
		execucaoAnalitica.click();
		sleep(1000);
		
		executarB.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		nao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		salvarExecucoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		aceitar.click();
		sleep(3000);
		fechar.click();
		sleep(3000);
		
		finalizarExecucoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		confirmarExecucoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		execucoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		execucacoConsolidacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rowsE = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String idE = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rowsE + "]/div[4]/div"))
				.getText();
		System.out.println("Ultimo ID de Execucoes Configuracao: "+idE);
		
		idInserir5(idE);
		
		
		int idExecucoesA = Integer.valueOf(idObter4());
		
		int idExecucoesB = Integer.valueOf(idE);
		//idInserir6(idExecucoesB);
		
		
		//idObter3(idExecucoesB);
		
		
		System.out.println("");
		System.out.println("***********");
		System.out.println("EXECUTAR");
		System.out.println("ID ANTES: " +idExecucoesA);
		System.out.println("ID DESPUES: "+ idExecucoesB);
		System.out.println("***********");
		System.out.println("");
		
		boolean sucesso = false;
		
		if (idExecucoesB > idExecucoesA) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		System.out.println(sucesso);
		return sucesso;
		
	}	
	
	public ArrayList<Boolean> lixeiraYRestaurar() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		String teste=idObter6();
		String teste1=idObter1();
		String teste2=idObter2();
		String teste3=idObter3();
		String teste4=idObter4();
		String teste5=idObter5();
		System.out.println("Id Após a teste: " + teste);
		System.out.println("Id Após a teste idobter1: " + teste1);
		System.out.println("Id Após a teste idobter2: " + teste2);
		System.out.println("Id Após a teste idobter3: " + teste3);
		System.out.println("Id Após a teste idobter4: " + teste4);
		System.out.println("Id Após a teste idobter5: " + teste5);
		sleep(2000);
		execucoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		execucacoConsolidacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menusito = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter5()+"\"]/div[1]/div"));
		System.out.println("id de lexeira: "+menusito);
		
//		WebElement menusito2 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter()+"\"]/div[1]/div"));
//		System.out.println("id de lexeira: "+menusito2);
		
//		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter4()+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
//		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter5()+"\"]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter5()+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		sleep(2000);

		menu1.click();
		sleep(1000);
		editar1.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(simLexeira);
		sleep(2000);
		
		simLexeira.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectElement(pastaLexeira);
		sleep(5000);
		
//		sleep(3000);
//		waitExpectElement(pastaLexeira);
//		sleep(3000);
		
		pastaLexeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys(idObter5());
		//pesquisar.sendKeys("2271");
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		
		menu1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter5()+"\"]/div[1]/div"));
		editar1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter5()+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Restaurar\"]"));
		sleep(2000);
		
//		menu1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"2271\"]/div[1]/div"));
//		editar1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"2271\"]/div[1]/div/div[2]/ul/li/span[text()=\"Restaurar\"]"));
//		sleep(2000);
		
		menu1.click();
		sleep(1000);
		editar1.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//sleep(2000);
		execucacoConsolidacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys(idObter5());
		//pesquisar.sendKeys("2271");
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter5()+"\"]/div[1]/div"));
		editar1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter5()+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		sleep(2000);
		
//		menu1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"2271\"]/div[1]/div"));
//		editar1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"2271\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
//		sleep(2000);
		
		menu1.click();
		sleep(1000);
		editar1.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresaValor = empresaV.getText();
		String ufValor = ufV.getText();
		String filialValor = filialV.getText();
		String tributoValor = tributoV.getText();
		String subperiodoValor = subperiodoV.getText();
		//IMPRIMIR VALORES DE VISUALIZAR
		System.out.println("******Datos del Visualizar******");
		System.out.println("Empresa: "+  empresaValor);
		System.out.println("UF: "+ ufValor );
		System.out.println("Filial: "+ filialValor );
		System.out.println("Tributo:"+ tributoValor);
		System.out.println("Subperiodo: "+ subperiodoValor);
		System.out.println("");
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		menu1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter5()+"\"]/div[1]/div"));
		editar1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter5()+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		sleep(2000);
		
//		menu1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"2271\"]/div[1]/div"));
//		editar1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"2271\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
//		sleep(2000);
		
		menu1.click();
		sleep(1000);
		editar1.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String empresaValor1 = empresaE.getText();
		String ufValor1 = ufE.getText();
		String filialValor1 = filialE.getText();
		String tributoValor1 = tributoE.getText();
		String subperiodoValor1 = subperiodoE.getText();
		//IMPRIMIR VALORES DE EDITAR
		System.out.println("******Datos del Editar******");
		System.out.println("Empresa: "+  empresaValor1);
		System.out.println("UF: "+ ufValor1 );
		System.out.println("Filial: "+ filialValor1 );
		System.out.println("Tributo:"+ tributoValor1);
		System.out.println("Subperiodo: "+ subperiodoValor1);
		System.out.println("");
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaValor1.equals(empresaValor));
		sucesso.add(ufValor1.equals(ufValor));
		sucesso.add(filialValor1.equals(filialValor));
		sucesso.add(tributoValor1.equals(tributoValor));
		sucesso.add(subperiodoValor1.equals(subperiodoValor));
		
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	public ArrayList<Boolean> editarEditarEntradaManualImprimirExportar() {
//	//COMENTAR DE AQUI 
//		sleep(2000);
//		execucoes.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(3000);
//		execucacoConsolidacao.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(3000);
//		
//		pesquisar.sendKeys(idObter5());
//		//pesquisar.sendKeys("2271");
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
////		ultimo.click();
////		sleep(2000);
////		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
////		sleep(2000);
//		
//		WebElement menu1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter5()+"\"]/div[1]/div"));
//		WebElement editar1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter5()+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
//		sleep(2000);
//		
////		WebElement menu1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"2271\"]/div[1]/div"));
////		WebElement editar1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"2271\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
////		sleep(2000);
//		
//		menu1.click();
//		sleep(1000);
//		editar1.click();
//		sleep(6000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//	//HASTA AQUI
//		
//		
//		
		
		
		
		
		String teste=idObter6();
		System.out.println("Id Após a teste: " + teste);
		
		entrada.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(editarEditarEntradaManual);
		sleep(2000);
		
		editarEditarEntradaManual.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		editarValorEntradaManual.clear();
		sleep(2000);
		editarValorEntradaManual.sendKeys("2.000,00");
		//clickFuera.click();
		sleep(2000);
		editarValorEntradaManual.getAttribute("value");
		String valorEntradaManualPrimero = editarValorEntradaManual.getAttribute("value");
		System.out.println("valor de entrada manual: "+editarValorEntradaManual.getAttribute("value"));
		
		//new Actions(driver).moveToElement(gravarD).click().perform();
		//sleep(3000);
		gravarD.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		fechar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		aba1.click();
		sleep(2000);
		hierarquia1.click();
		sleep(2000);
		grupo1.click();
		sleep(2000);
		subnivel1.click();
		sleep(2000);
		String valorEntradaManualSegundo = valorEntradaManual1.getText();
		System.out.println("valorEntradaManual Editado"+ valorEntradaManualSegundo);
		
		
		
		
		imprimir.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		modoImpresion.click();
		sleep(2000);
		
		opcModoImpresion.click();
		sleep(2000);
		
		fechar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		exportar.click();
		sleep(3000);
		
		modoExportacion.click();
		sleep(3000);
		
		opcModoExportacion.click();
		sleep(3000);
		
		nombreArchivoExportacion.sendKeys("teste automatizado hierar");
		nombreArchivoExportacion.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		exportarParaExcell.click();
		sleep(3000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(valorEntradaManualSegundo.equals(valorEntradaManualPrimero));
		
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	public ArrayList<Boolean> excluirExecucoes() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		String teste=idObter6();
		System.out.println("Id Após a teste: " + teste);
		//EXCLUIR EXECUCOES
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String idExecucoes = idObter5();
		
		System.out.println("");
		System.out.println("*******EXCLUIR EXECUCOES********");
		System.out.println("OBTER 5:" + idExecucoes);
		System.out.println("");
		
		pesquisar.sendKeys(idExecucoes);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idExecucoes+"\"]/div[1]/div"));
		WebElement lixeiraC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idExecucoes+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		menu.click();
		sleep(1000);
		lixeiraC.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(simLexeira);
		sleep(2000);
		
		simLexeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		//waitExpectElement(pastaLexeira);
		waitExpectXpath("//span[contains(text(),\"A versão de execução do builder foi enviada para a lixeira\")]");
		sleep(2000);
		
		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"A versão de execução do builder foi enviada para a lixeira\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (exclucao>0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		pastaLexeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pesquisar.sendKeys(idObter4());
		pesquisar.sendKeys(idExecucoes);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idExecucoes+"\"]/div[1]/div"));
		WebElement excluirE = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idExecucoes+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		excluirE.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		simExcluir.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		System.out.println(sucesso);
		return sucesso;
		
	}
	
	public ArrayList<Boolean> excluirConfiguracoes() {
		//EXCLUIR CONFIGURACOES
		String teste=idObter6();
		System.out.println("Id Após a teste: " + teste);
		sleep(2000);
		configuracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaoDaConsolidacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idConfiguracao = idObter2();
		System.out.println("");
		System.out.println("*******EXCLUIR CONFIGURACOES************");
		System.out.println("OBTER 2:" + idConfiguracao);
		System.out.println("");
		
		
		pesquisar.sendKeys(idConfiguracao);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//idObter2();
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div"));
		WebElement lixeiraC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		
//		menu1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"2271\"]/div[1]/div"));
//		editar1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"2271\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
//		sleep(2000);
		
		menu.click();
		sleep(1000);
		lixeiraC.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(simLexeira);
		sleep(2000);
		
		simLexeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		waitExpectXpath("//span[contains(text(),\"A Configuração de Hierarquia foi enviada para a Lixeira\")]");
		sleep(2000);
		
		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"A Configuração de Hierarquia foi enviada para a Lixeira\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (exclucao>0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		pastaLexeiraC.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys(idConfiguracao);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div"));
		WebElement excluirC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		excluirC.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		simExcluir.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		System.out.println(sucesso);
		return sucesso;
	}
	
	public ArrayList<Boolean> excluirHierarquia() {
		//EXCLUIR HIERARQUIA
		String teste=idObter6();
		System.out.println("Id Após a teste: " + teste);
		sleep(2000);
		hierarquias.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		hierarquiaConfiguracao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String id2 = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[4]/div"))
				.getText();
		/*String idHierarquia = idObter1();
		String idHierarquia1 = idObter6();
		*/
		System.out.println("");
		System.out.println("*******EXCLUIR HIERARQUIA************");
	//	System.out.println("OBTER 1:" + idHierarquia);
		System.out.println("OBTER 1:"+id2);
		System.out.println("");
		
		
		pesquisar.sendKeys(id2);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+id2+"\"]/div[1]/div"));
		WebElement lixeiraH = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+id2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		menu.click();
		sleep(1000);
		lixeiraH.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(simLexeira);
		sleep(2000);
		
		simLexeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectElement(pastaLexeira);
		sleep(2000);
		waitExpectXpath("//span[contains(text(),\"A Configuração de Hierarquia foi enviada para a Lixeira\")]");
		sleep(2000);
		/*
		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"A Configuração de Hierarquia foi enviada para a Lixeira\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (exclucao>0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		*/
		
		
		pastaLexeiraH.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys(id2);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+id2+"\"]/div[1]/div"));
		WebElement excluirH = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+id2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		excluirH.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		simExcluir.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(2000);
		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"A configuração hierarquia foi excluída com sucesso\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (exclucao>0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		System.out.println(sucesso);
		return sucesso;
	}
	
	
}
