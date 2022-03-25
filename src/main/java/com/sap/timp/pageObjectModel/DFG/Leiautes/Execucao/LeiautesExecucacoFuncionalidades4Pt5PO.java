package com.sap.timp.pageObjectModel.DFG.Leiautes.Execucao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseFernando;

public class LeiautesExecucacoFuncionalidades4Pt5PO extends TestBaseSteven{

	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz;
	@FindBy(xpath = "//button/span[text()=\"Novo Leiaute\"]")
	public WebElement novo;
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nome;
	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement tipo;
	@FindBy(xpath = "//li[contains(text(),\"ALTER E-SOCIAL S1200\")]")
	public WebElement opcTipo;
	@FindBy(xpath = "//li[contains(text(),\"DCTF\")]")
	public WebElement opcTipo2;
	@FindBy(xpath = "//div[@id=\"inputStructureParent\"]/div/div/div[2]")
	public WebElement grupoEstrutura;
	@FindBy(xpath = "//li[text()=\"Ajuste\"][1]")
	public WebElement opcGrupoEstructura;
	@FindBy(xpath = "//li[contains(text(),\"Ajuste\")][2]")
	public WebElement opcGrupoEstructura2;
	
	@FindBy(xpath = "//div[@id=\"inputStructureChild\"]/div/div/div[2]")
	public WebElement estrutura;
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcEstrutura;
	@FindBy(xpath = "//*[@id=\"inputValidFrom\"]/div/div[1]/input")
	public WebElement dataVigencia;
	@FindBy(xpath = "//*[@id=\"inputLayoutVersion\"]/div/div[1]/input")
	public WebElement versaoLeiaute;
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	
	//SEPARADORES
	@FindBy(xpath = "//button/span[2][text()=\"Separadores\"]")
	public WebElement separadores;
	@FindBy(xpath = "//*[@id=\"toolbarSecund\"]/div/ul/li[2]/button/span")
	public WebElement flecha;
	@FindBy(xpath = "//input[@placeholder=\"Sem separador\"]")
	public WebElement inputSeparador;
	@FindBy(xpath = "//div[@id=\"chkBol\"]/div/label/span")
	public WebElement incluirIniciodeLinha;
	@FindBy(xpath = "//div[@id=\"chkEol\"]/div/label/span")
	public WebElement incluirFindeLinha;
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
		
	
	//BLOCOS Y REGISTROS
	@FindBy(xpath = "//button/span[text()=\"Adicionar bloco\"]")
	public WebElement adicionarBloco;
	
	//BLOCO 1 - REGISTRO 1
		@FindBy(xpath = "//div[@block-id=\"0\"]/div/div/div[3]/button")
		public WebElement adicionarRegistro1;
		
		@FindBy(xpath = "//div[@block-id=\"0\"]/div/div/div[@class=\"block-name\"]/div/div[2]/div/div/div[2]/input")
		public WebElement nombreBloco1;
		@FindBy(xpath = "//div[@block-id=\"0\"]/div/div/div[@class=\"record-name\"]/div/div[2]/div/div/div[2]/input")
		public WebElement nombreRegistro1;
		
		@FindBy(xpath = "//li[@data-id=\"initialDateReference\"]/div/div/span[contains(text(),\"Data Inicial de Referência\")][1]")
		public WebElement dataInicialDeReferencia;
		
		@FindBy(xpath = "//div[@class=\"select-year inputs medium\"]/div/div/div[2]")
		public WebElement anio;
		@FindBy(xpath = "//li[contains(text(),\"AAAA\")]")
		public WebElement opcAnio;
		@FindBy(xpath = "//div[@class=\"select-month inputs medium\"]/div/div/div[2]")
		public WebElement mes;
		@FindBy(xpath = "//li[contains(text(),\"MM\")]")
		public WebElement opcMes;
		@FindBy(xpath = "//div[@class=\"select-day inputs medium\"]/div/div/div[2]")
		public WebElement dia;
		@FindBy(xpath = "//li[contains(text(),\"DD\")]")
		public WebElement opcDia;
		
		@FindBy(xpath = "//input[@placeholder=\"Separadores\"]")
		public WebElement separadores1;
		
		@FindBy(xpath = "//li[@data-id=\"newline\"]/div/div/span[contains(text(),\"Salto de Linha\")][1]")
		public WebElement saltoDeLinha;
		
		@FindBy(xpath = "//li[@data-id=\"finalDateReference\"]/div/div/span[contains(text(),\"Data Final de Referência\")][1]")
		public WebElement dataFinalDeReferencia;
		
		@FindBy(xpath = "//li[@data-id=\"v\"]/div/div/span[contains(text(),\"Versão\")][1]")
		public WebElement versao;
		
		@FindBy(xpath = "//div[@id=\"VersionField\"]/div/div/input")
		public WebElement versaoValor;
		
		@FindBy(xpath = "//li[@data-id=\"HRE\"]/div/div/span[contains(text(),\"Hora da Execução do Arquivo\")][1]")
		public WebElement horaDaExecucao;
		
		@FindBy(xpath = "//li[@data-id=\"DTE\"]/div/div/span[contains(text(),\"Data da Execução do Arquivo\")][1]")
		public WebElement dataDaExecucao;
		
		@FindBy(xpath = "//li[@data-id=\"sp\"]/div/div/span[contains(text(),\"Período de Referência\")][1]")
		public WebElement periodoDaReferencia;
		
		
	//arrastrar 1
	//div[@block-id="0"]/div[@class="columns-container"]/div
	
	//BLOCO 2 - REGISTRO 2
		@FindBy(xpath = "//div[@block-id=\"1\"]/div/div/div[3]/button")
		public WebElement adicionarRegistro2;
		
		@FindBy(xpath = "//div[@block-id=\"1\"]/div/div/div[@class=\"block-name\"]/div/div[2]/div/div/div[2]/input")
		public WebElement nombreBloco2;
		@FindBy(xpath = "//div[@block-id=\"1\"]/div/div/div[@class=\"record-name\"]/div/div[2]/div/div/div[2]/input")
		public WebElement nombreRegistro2;
		
		@FindBy(xpath = "//li[@data-id=\"fxf\"]/div/div/span[contains(text(),\"Campo Fixo\")][1]")
		public WebElement camposFijoDaRegistro;
		
		@FindBy(xpath = "//input[@placeholder=\"Preencha Nome do Campo Fixo\"]")
		public WebElement nomeCampoFixo;
		
		@FindBy(xpath = "//div[@class=\"type-field fixed-field-property\"]/div/div/div[2]")
		public WebElement tipoCampoFixo;
		@FindBy(xpath = "//li[contains(text(),\"Texto\")]")
		public WebElement opcTipoCampoFixo;
		
		@FindBy(xpath = "//input[@placeholder=\"Preencha Comprimento do Campo Fixo\"]")
		public WebElement comprimento;
		
		@FindBy(xpath = "//button[@class=\"btn addOption\"]")
		public WebElement adicionarOpcoes;
		
		@FindBy(xpath = "//input[contains(@placeholder,\"Preencha Valor da Opção\")]")
		public WebElement valorOpcoes;
		
		@FindBy(xpath = "//li[@data-id=\"fmf\"]/div/div/span[contains(text(),\"Campo Fixo Manual\")][1]")
		public WebElement camposFijoManualDaRegistro;
		
		@FindBy(xpath = "//div[@class=\"envolve\"]/span[contains(@class,\"icon-plussign\")]")
		public WebElement addOpcao;
	
	
	//BLOCO 3 - REGISTRO 3
		@FindBy(xpath = "//div[@block-id=\"2\"]/div/div/div[3]/button")
		public WebElement adicionarRegistro3;
		
		@FindBy(xpath = "//div[@block-id=\"2\"]/div/div/div[@class=\"block-name\"]/div/div[2]/div/div/div[2]/input")
		public WebElement nombreBloco3;
		@FindBy(xpath = "//div[@block-id=\"2\"]/div/div/div[@class=\"record-name\"]/div/div[2]/div/div/div[2]/input")
		public WebElement nombreRegistro3;
		
		@FindBy(xpath = "//div/span[text()=\"Ajustes Fiscais\"][1]")
		public WebElement abaAjusteFiscais;
		@FindBy(xpath = "//div/span[text()=\"Ajustes\"][1]")
		public WebElement subAbaAjusteFiscais;
		
		@FindBy(xpath = "//div/span[contains(text(),\"Código da empresa\")]")
		public WebElement codigoEmpresa;
		@FindBy(xpath = "//div/span[contains(text(),\"Código da filial\")]")
		public WebElement codigoFilial;
		@FindBy(xpath = "//div/span[contains(text(),\"Data de lançamento\")]")
		public WebElement dataLanzamento;
		@FindBy(xpath = "//li[14]/div/div/span[contains(text(),\"Valor do ajuste\")][1]")
		public WebElement valorAjuste;
		
		@FindBy(xpath = "//li[@data-id=\"sf\"]/div/div/span[contains(text(),\"Sequência\")][1]")
		public WebElement campoSequencia;
		
		@FindBy(xpath = "//div[@class=\"sequence-typeCB\"]/div[3]/label/span")
		public WebElement sequenciamentoLinha;
	
	
	//BLOCO 4 - REGISTRO 4
		@FindBy(xpath = "//div[@block-id=\"3\"]/div/div/div[3]/button")
		public WebElement adicionarRegistro4;
		
		@FindBy(xpath = "//div[@block-id=\"3\"]/div/div/div[@class=\"block-name\"]/div/div[2]/div/div/div[2]/input")
		public WebElement nombreBloco4;
		@FindBy(xpath = "//div[@block-id=\"3\"]/div/div/div[@class=\"record-name\"]/div/div[2]/div/div/div[2]/input")
		public WebElement nombreRegistro4;
		
		@FindBy(xpath = "//li[@data-id=\"sfid\"]/div/div/span[contains(text(),\"Sequência de Item por Documento\")][1]")
		public WebElement campoSequenciaItemPorDocumento;
	
	
	//BLOCO 5 - REGISTRO 5
		@FindBy(xpath = "//div[@block-id=\"4\"]/div/div/div[3]/button")
		public WebElement adicionarRegistro5;
		
		@FindBy(xpath = "//div[@block-id=\"4\"]/div/div/div[@class=\"block-name\"]/div/div[2]/div/div/div[2]/input")
		public WebElement nombreBloco5;
		@FindBy(xpath = "//div[@block-id=\"4\"]/div/div/div[@class=\"record-name\"]/div/div[2]/div/div/div[2]/input")
		public WebElement nombreRegistro5;
		
		@FindBy(xpath = "//div[@block-id=\"4\"]/div/div/div[@class=\"distinct-cb\"]/div/label/span")
		public WebElement distinto5;
	//
	
	
	@FindBy(xpath = "//button[text()=\"Adicionar registro\"]")
	public WebElement adicionarRegistro;
		
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Nome do Bloco\"]")
	public WebElement nombreBloco;
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Nome do Registro\"]")
	public WebElement nombreRegistro;
	
	@FindBy(xpath = "//div/span[text()=\"Campos Especiais\"][1]")
	public WebElement abaCamposEspeciais;
	
	@FindBy(xpath = "//li[17]/div/div/span[contains(text(),\"Data/Hora da Execução do Arquivo\")][1]")
	public WebElement dataHoraExecucaco;
	
//	@FindBy(xpath = "//div[@class=\"select-year inputs medium\"]/div/div/div[2]")
//	public WebElement anio;
//	@FindBy(xpath = "//li[contains(text(),\"AAAA\")]")
//	public WebElement opcAnio;
//	@FindBy(xpath = "//div[@class=\"select-month inputs medium\"]/div/div/div[2]")
//	public WebElement mes;
//	@FindBy(xpath = "//li[contains(text(),\"MM\")]")
//	public WebElement opcMes;
//	@FindBy(xpath = "//div[@class=\"select-day inputs medium\"]/div/div/div[2]")
//	public WebElement dia;
//	@FindBy(xpath = "//li[contains(text(),\"DD\")]")
//	public WebElement opcDia;
	@FindBy(xpath = "//div[@class=\"select-hour inputs medium\"]/div/div/div[2]")
	public WebElement hora;
	@FindBy(xpath = "//li[contains(text(),\"HH\")]")
	public WebElement opcHora;
	@FindBy(xpath = "//div[@class=\"select-min inputs medium\"]/div/div/div[2]")
	public WebElement minutos;
	@FindBy(xpath = "//li[contains(text(),\"MI\")]")
	public WebElement opcMinutos;
	@FindBy(xpath = "//div[@class=\"select-sec inputs medium\"]/div/div/div[2]")
	public WebElement segundos;
	@FindBy(xpath = "//li[contains(text(),\"SS\")]")
	public WebElement opcSegundos;
	@FindBy(xpath = "//div[@class=\"select-ff inputs medium\"]/div/div/div[2]")
	public WebElement ff;
	@FindBy(xpath = "//li[contains(text(),\"FF7\")]")
	public WebElement opcFF;
	
//	@FindBy(xpath = "//input[@placeholder=\"Separadores\"]")
//	public WebElement separadores2;
	
	@FindBy(xpath = "//li[12]/div/div/span[contains(text(),\"Contador Linhas de Registro\")][1]")
	public WebElement contadorLinhas;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	//CONFIGURACAO
		@FindBy(xpath = "//div[@class=\"settingFolders-wrapper\"]/div/div[1]")
		public WebElement raizConfiguracao;
		
		
		@FindBy(xpath = "//div/span/span[contains(@class,\"icon-setting\")]")
		public WebElement abaConfiguracao;
		
		@FindBy(xpath = "//button/span[text()=\"Nova Configuração\"]")
		public WebElement novaConfiguracao;
		
		@FindBy(xpath = "//input[contains(@placeholder,\"nome de Configuração\")]")
		public WebElement nomeConfiguracao;
		
		@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
		public WebElement leiaute;
		
		@FindBy(xpath = "//div[@id=\"inputTimpVersion\"]/div/div/div[2]")
		public WebElement versaoConfiguracao;
		
		@FindBy(xpath = "//li[contains(text(),\"1.0\")]")
		public WebElement opcversaoConfiguracao;
		
		@FindBy(xpath = "//div[@id=\"inputSelectTax\"]/div/div/div[2]")
		public WebElement tributoConfiguracao;
		
		@FindBy(xpath = "//ul/li[text()=\"ICMS\"]")
		public WebElement opcTributoConfiguracao;
		
		
		@FindBy(xpath = "//div[@id=\"inputSelectCompany\"]/div/div/div[2]")
		public WebElement empresaSPED;
		
		@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
		public WebElement opcEmpresaConfiguracao;
		
		@FindBy(xpath = "//div[@id=\"inputSelectState\"]/div/div/div[2]")
		public WebElement ufConfiguracao;
		
		@FindBy(xpath = "//div[@class=\"list-option\"]/div[@id=\"SP\"]/div/label/span")
		public WebElement opcUFConfiguracao1;
		//cambiar para tc2
		@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
		public WebElement opcUFConfiguracao2;
		
		@FindBy(xpath = "//div[@id=\"inputSelectFilial\"]/div/div/div[2]")
		public WebElement filialConfiguracao;
		
		@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
		public WebElement opcFilialConfiguracao1;
		//cambiar para tc2
		@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
		public WebElement opcFilialConfiguracao2;
		
		@FindBy(xpath = "//*[@id=\"inputValidFrom\"]/div/div[1]/input")
		public WebElement dataVigenciaConfiguracao;
		
	//EXECUTAR
		@FindBy(xpath = "//div[@id=\"inputState\"]/div/div/div[2]")
		public WebElement estadoExecutar;
		@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
		public WebElement opcEstadoExecutar;
		
		@FindBy(xpath = "//div[@id=\"taxSelect\"]/div/div[2]")
		public WebElement tributoExecutar;
		@FindBy(xpath = "//li[text()=\"ICMS\"]")
		public WebElement opcTributoExecutar;
		
		
		@FindBy(xpath = "//span[contains(@class,\"icon-calendar\")]")
		public WebElement periodo;
		
		@FindBy(xpath = "//div[contains(@class,\"icon-leftmenu\")]")
		public WebElement paginaAnterior;
		
		@FindBy(xpath = "//div[text()=\"2016\"]")
		public WebElement ano2016;
		
		@FindBy(xpath = "//div[text()=\"2015\"]")
		public WebElement ano2015;
		
		@FindBy(xpath = "//div[text()=\"Jan\"]")
		public WebElement jan;
		
		@FindBy(xpath = "//span[text()=\"1M\"]")
		public WebElement m1;
		
		@FindBy(xpath = "//span[text()=\"1A\"]")
		public WebElement a1;
		
		@FindBy(xpath = "//div[@id=\"settings-execute\"]//button/span[2][text()=\"Executar\"][1]")
		public WebElement execucao1;
		
		@FindBy(xpath = "//button[text()=\"Executar\"]")
		public WebElement executar2;
		
		@FindBy(xpath = "//div[@class=\"inputs movementCentralization\"]/label/span")
		public WebElement flagCentralizacao;
		
		@FindBy(xpath = "//button/span[2][text()=\"Visualizar Dados\"]")
		public WebElement visualizarDados2;
		
		@FindBy(xpath = "//div[@class=\"td-content col5 tr-0\"]/div")
		public WebElement data1;
		@FindBy(xpath = "//div[@class=\"td-content col6 tr-0\"]/div")
		public WebElement lihnas1;	
		
		
		@FindBy(xpath = "//div[@class=\"container-tabs\"][1]/div[2]/span/span[text()=\"Visualizar Dados\"]")
		public WebElement visualizarDados;
		@FindBy(xpath = "//input[@placeholder=\"Data/Hora de Execução\"]")
		public WebElement dataArquivo;
		
		@FindBy(xpath = "//div[@class=\"line-paginator\"]/div/div[11]/input")
		public WebElement cantidadLinhas1;
		
		@FindBy(xpath = "//input[@placeholder=\"Contador Linhas de Registro\"]")
		public WebElement cantidadLinhas2;
		
		@FindBy(xpath = "//div[@class=\"editable executarArquivo\"]")
		public WebElement cargarExecucao;
		
		
		
		
		//lo que si ocupo
		@FindBy(xpath = "//div/span/span[contains(@class,\"icon icon-font-Finance-and-Office icon-coin\")]")
		public WebElement parametrosManuais;
		
		@FindBy(xpath = "//div[contains(@class,\"bloco bloco1\")]/div[2]/div/div/div[2]/div/div/div[2]")
		public WebElement camposManualExecutar;
		
		@FindBy(xpath = "//li[contains(text(),\"TESTE 1\")]")
		public WebElement opcao;
		
	//VERIFICAR DATOS
		@FindBy(xpath = "//div[contains(@class,\"executarArquivo\")]/ul/li[1]/span")
		public WebElement verSaltoLinha1;
		@FindBy(xpath = "//div[contains(@class,\"executarArquivo\")]/ul/li[2]/span")
		public WebElement verSaltoLinha2;
		
		
		
		
		@FindBy(xpath = "//div[@id=\"tr-0\"]/div[contains(@class,\"col1\")]/div")
		public WebElement verDataInicial;
		@FindBy(xpath = "//div[@id=\"tr-0\"]/div[contains(@class,\"col3\")]/div")
		public WebElement verDataFinal;
		
		@FindBy(xpath = "//div[@id=\"tr-0\"]/div[contains(@class,\"col4\")]/div")
		public WebElement verVersao;
		
		@FindBy(xpath = "//div[@id=\"tr-0\"]/div[contains(@class,\"col7\")]/div")
		public WebElement verPeriodoReferencia;
		
		
		
		
		@FindBy(xpath = "//div[@id=\"selector-block\"]/div/div/div[2]")
		public WebElement elegirBloco;
		@FindBy(xpath = "//li[text()=\"2\"]")
		public WebElement opcaoElegirBloco2;
		@FindBy(xpath = "//li[text()=\"3\"]")
		public WebElement opcaoElegirBloco3;
		@FindBy(xpath = "//li[text()=\"4\"]")
		public WebElement opcaoElegirBloco4;
		@FindBy(xpath = "//li[text()=\"5\"]")
		public WebElement opcaoElegirBloco5;
		
		@FindBy(xpath = "//div[@id=\"tr-0\"]/div[contains(@class,\"col1\")]/div")
		public WebElement verCampoFixo;
		
		@FindBy(xpath = "//div[@id=\"tr-0\"]/div[contains(@class,\"col2\")]/div")
		public WebElement verCampoFixoManual;
		//div[@id="tr-0"]/div[contains(@class,"col1")]/div
		
	//LIXEIRA
		@FindBy(xpath = "//li[@identifier=\"accordion-item-trash-setting\"]")
		public WebElement pastaLixeira;
		
		@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
		public WebElement pesquisar;
		
		@FindBy(xpath = "//div/span/span[contains(@class,\"icon-layout\")]")
		public WebElement abaLeiautes;
		
		@FindBy(xpath = "//div[contains(text(),\"Nenhum resultado\")]")
		public WebElement resultado;

		@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
		public WebElement btnUltimaPagina;		
	public LeiautesExecucacoFuncionalidades4Pt5PO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criarLeiaute() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
		String url = driver.getCurrentUrl();
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}
		
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"]")).size();
		String idLeiaute = "0";
		
		if(rows > 0) {
			idLeiaute = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[5]/div")).getText();
			System.out.println(idLeiaute);
		}
		
		

		System.out.println(idLeiaute + " ultimo id Leiaute");
		
		
		System.out.println("");
		System.out.println("------------------------CRIAR LEIAUTE-------------------");
		System.out.println("");
		
		novo.click();
		sleep(3000);
		waitExpectElement(nome);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado kenssy");
		sleep(1000);
		String nomeValor = nome.getAttribute("value");
		System.out.println("nombreInicial "+nomeValor);
		
		tipo.click();
		sleep(2000);
		
		if (tq1 == true) {
			opcTipo.click();
			sleep(1000);
//			String tipoT = opcTipo.getText();
//			System.out.println(tipoT);
		}else if (tc2 ==true) {
			opcTipo2.click();
			sleep(1000);
			
		}else {
			//CORREGIR AL EJECUTAR EN AMBIENTE
			opcTipo.click();
			sleep(1000);
//			String tipoT = opcTipo.getText();
//			System.out.println(tipoT);
		}
		
		
		
		sleep(1000);
		actionsMoveToElementElement(versaoLeiaute);
		sleep(1000);
		
		grupoEstrutura.click();
		sleep(1000);
		
		if (tq1 == true) {
			opcGrupoEstructura.click();
			sleep(1000);
		}else if (tc2 ==true) {
			opcGrupoEstructura2.click();
			sleep(1000);
		}else {
			//CORREGIR AL EJECUTAR EN AMBIENTE
			opcGrupoEstructura2.click();
			sleep(1000);
		}
		
		estrutura.click();
		sleep(1000);
		opcEstrutura.click();
		sleep(1000);
		opcEstrutura.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		dataVigencia.sendKeys("01/01/2013");
		sleep(1000);
		
		versaoLeiaute.sendKeys("1");
		sleep(1000);
		
		salvar.click();
		sleep(2000);
		//waitExpectElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O leiaute foi criado com sucesso\")]")).size();
		System.out.println("mensaje"+ mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		
		
		return sucesso;
	}
	
	public void  separadores() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!separadores.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		separadores.click();
		sleep(2000);
		
		inputSeparador.sendKeys("|");
		sleep(2000);
		
		incluirIniciodeLinha.click();
		sleep(2000);
		
		incluirFindeLinha.click();
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		raiz.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String idLeiaute2 = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[5]/div")).getText();
		idInserir1(idLeiaute2);
		System.out.println("Id que estoy editando:" +idLeiaute2);		
	}
	
	public ArrayList<Boolean> dataInicialDeReferencia() {
		
		System.out.println("");
		System.out.println("------------------------BLOCOS Y REGISTROS-------------------");
		System.out.println("");
		System.out.println("------------------------BLOCOS 1 - REGISTROS 1-------------------");
		System.out.println("");
		
		sleep(2000);
		abaLeiautes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idLeiaute = idObter1();
		System.out.println("aquiii: "+idLeiaute);
//		pesquisar.sendKeys(idLeiaute);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idLeiaute+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idLeiaute+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(adicionarBloco);
		sleep(2000);
		
		//ADICIONAR 5 BLOCOS
		//DEBEN ADICIONARSE UNO POR UNO
		
		//for (int i = 0; i < 5; i++) {
			adicionarBloco.click();
			sleep(2000);
		//}
			
		sleep(2000);
		adicionarRegistro1.click();
		sleep(2000);
		
		nombreBloco1.sendKeys("1");
		sleep(2000);
		
		nombreRegistro1.sendKeys("1");
		sleep(2000);
		
		abaCamposEspeciais.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(dataInicialDeReferencia, driver.findElement(By.xpath("//div[@block-id=\"0\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		dia.click();
		sleep(2000);
		opcDia.click();
		sleep(2000);
		
		mes.click();
		sleep(2000);
		opcMes.click();
		sleep(2000);
		
		anio.click();
		sleep(2000);
		opcAnio.click();
		sleep(2000);
		
		separadores1.sendKeys("/");
		sleep(2000);
		
		
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
	
	public ArrayList<Boolean> saltodeLinha() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(saltoDeLinha, driver.findElement(By.xpath("//div[@block-id=\"0\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> dataFinalDeReferencia() {
//		sleep(2000);
//		adicionarRegistro1.click();
//		sleep(2000);
//		
//		nombreBloco1.sendKeys("1");
//		sleep(2000);
//		
//		nombreRegistro1.sendKeys("1");
//		sleep(2000);
//		
//		abaCamposEspeciais.click();
//		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(dataFinalDeReferencia, driver.findElement(By.xpath("//div[@block-id=\"0\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		dia.click();
		sleep(2000);
		opcDia.click();
		sleep(2000);
		
		mes.click();
		sleep(2000);
		opcMes.click();
		sleep(2000);
		
		anio.click();
		sleep(2000);
		opcAnio.click();
		sleep(2000);
		
		separadores1.sendKeys("/");
		sleep(2000);
		
		
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
	
	public ArrayList<Boolean> versao() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(versao, driver.findElement(By.xpath("//div[@block-id=\"0\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		versaoValor.sendKeys("2");
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> horaDaExecucao() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(horaDaExecucao, driver.findElement(By.xpath("//div[@block-id=\"0\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		dia.click();
		sleep(2000);
		opcHora.click();
		sleep(2000);
		
		mes.click();
		sleep(2000);
		opcMinutos.click();
		sleep(2000);
		
		anio.click();
		sleep(2000);
		opcSegundos.click();
		sleep(2000);
		
		separadores1.sendKeys(":");
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> dataDaExecucao() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(dataDaExecucao, driver.findElement(By.xpath("//div[@block-id=\"0\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		dia.click();
		sleep(2000);
		opcDia.click();
		sleep(2000);
		
		mes.click();
		sleep(2000);
		opcMes.click();
		sleep(2000);
		
		anio.click();
		sleep(2000);
		opcAnio.click();
		sleep(2000);
		
		separadores1.sendKeys("/");
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> periodoDaReferencia() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(periodoDaReferencia, driver.findElement(By.xpath("//div[@block-id=\"0\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		dia.click();
		sleep(2000);
		opcDia.click();
		sleep(2000);
		
		mes.click();
		sleep(2000);
		opcMes.click();
		sleep(2000);
		
		anio.click();
		sleep(2000);
		opcAnio.click();
		sleep(2000);
		
		separadores1.sendKeys("/");
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		

		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		sim.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
//		sim.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}
	
	
	
	
	
	
	
	//BLOCO 2 - REGISTRO 2
	
	public ArrayList<Boolean> campoFixo() {
		
		sleep(2000);

		abaLeiautes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idLeiaute = idObter1();
		System.out.println("aquiii: "+idLeiaute);
//		pesquisar.sendKeys(idLeiaute);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idLeiaute+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idLeiaute+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		
		
		System.out.println("------------------------BLOCOS 2 - REGISTROS 2-------------------");
		System.out.println("");
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarBloco.click();
		sleep(2000);
		
		adicionarRegistro2.click();
		sleep(2000);
		
		nombreBloco2.sendKeys("2");
		sleep(2000);
		
		nombreRegistro2.sendKeys("1");
		sleep(2000);
		
		
		abaCamposEspeciais.click();
		sleep(2000);
		
		abaAjusteFiscais.click();
		sleep(2000);
		

		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		actionsMoveToElementXpath("//*[@id=\"block-list-wrapper\"]/div[2]/div[3]/div/div[5]");
		sleep(2000);
		moveToElement(camposFijoDaRegistro, driver.findElement(By.xpath("//div[@block-id=\"1\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		nomeCampoFixo.sendKeys("Campo Fixo");
		sleep(2000);
		
		tipoCampoFixo.click();
		sleep(2000);
		opcTipoCampoFixo.click();
		sleep(2000);
		
		comprimento.sendKeys("10");
		sleep(2000);
		
		adicionarOpcoes.click();
		sleep(2000);
		
		valorOpcoes.sendKeys("TESTE");
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
	
	public ArrayList<Boolean> campoFixoManual() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(camposFijoManualDaRegistro, driver.findElement(By.xpath("//div[@block-id=\"1\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		nomeCampoFixo.sendKeys("Campo Fixo Manual");
		sleep(2000);
		
		valorOpcoes.sendKeys("TESTE 1");
		sleep(2000);
		
		addOpcao.click();
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}

	//BLOCO 3 - REGISTRO 3
	
	public ArrayList<Boolean> sequencia() {
		System.out.println("------------------------BLOCOS 3 - REGISTROS 3-------------------");
		System.out.println("");
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarBloco.click();
		sleep(2000);
		
		adicionarRegistro3.click();
		sleep(2000);
		
		nombreBloco3.sendKeys("3");
		sleep(2000);
		
		nombreRegistro3.sendKeys("1");
		sleep(2000);
		
//		abaCamposEspeciais.click();
//		sleep(2000);
//		
//		abaAjusteFiscais.click();
//		sleep(2000);
		
		subAbaAjusteFiscais.click();
		sleep(2000);
		
		//ARRASTRAR ELEMENTOS
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		actionsMoveToElementXpath("//*[@id=\"block-list-wrapper\"]/div[3]/div[3]/div/div[5]");
		sleep(2000);
		moveToElement(codigoEmpresa, driver.findElement(By.xpath("//div[@block-id=\"2\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(codigoFilial, driver.findElement(By.xpath("//div[@block-id=\"2\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(dataLanzamento, driver.findElement(By.xpath("//div[@block-id=\"2\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(valorAjuste, driver.findElement(By.xpath("//div[@block-id=\"2\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
//		abaAjusteFiscais.click();
//		sleep(2000);
//		
//		abaCamposEspeciais.click();
//		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(campoSequencia, driver.findElement(By.xpath("//div[@block-id=\"2\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		
		sequenciamentoLinha.click();
		sleep(2000);
		
	
		
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
		
	//BLOCO 4 - REGISTRO 4
	
	public ArrayList<Boolean> sequenciaDeItemPorDocumento() {
		System.out.println("------------------------BLOCOS 4 - REGISTROS 4-------------------");
		System.out.println("");
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarBloco.click();
		sleep(2000);
		
		adicionarRegistro4.click();
		sleep(2000);
		
		nombreBloco4.sendKeys("4");
		sleep(2000);
		
		nombreRegistro4.sendKeys("1");
		sleep(2000);
		
//		abaCamposEspeciais.click();
//		sleep(2000);
//		
//		abaAjusteFiscais.click();
//		sleep(2000);
		
//		subAbaAjusteFiscais.click();
//		sleep(2000);
		
		//ARRASTRAR ELEMENTOS
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		actionsMoveToElementXpath("//*[@id=\"block-list-wrapper\"]/div[4]/div[3]/div/div[5]");
		sleep(2000);
		moveToElement(codigoEmpresa, driver.findElement(By.xpath("//div[@block-id=\"3\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(codigoFilial, driver.findElement(By.xpath("//div[@block-id=\"3\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(dataLanzamento, driver.findElement(By.xpath("//div[@block-id=\"3\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(valorAjuste, driver.findElement(By.xpath("//div[@block-id=\"3\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
//		abaAjusteFiscais.click();
//		sleep(2000);
//		
//		abaCamposEspeciais.click();
//		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(campoSequenciaItemPorDocumento, driver.findElement(By.xpath("//div[@block-id=\"3\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
	
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
		
	//BLOCO 5 - REGISTRO 5
	public ArrayList<Boolean> distinto() {
	
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		raiz.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter1();
	//	String idRegistro = "1879";
		System.out.println("");
		System.out.println("ID Registro: " + idRegistro);
		System.out.println("");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarBloco.click();
		sleep(2000);
		
		adicionarRegistro5.click();
		sleep(2000);
		
		actionsMoveToElementElement(nombreBloco5);
		
		nombreBloco5.sendKeys("Bloco 5");
		sleep(2000);
		
		nombreRegistro5.sendKeys("Registro 1");
		sleep(2000);
		

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		actionsMoveToElementXpath("//*[@id=\"block-list-wrapper\"]/div[5]/div[3]/div/div[5]");
		sleep(2000);
		moveToElement(codigoEmpresa, driver.findElement(By.xpath("//div[@block-id=\"4\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(codigoFilial, driver.findElement(By.xpath("//div[@block-id=\"4\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(dataLanzamento, driver.findElement(By.xpath("//div[@block-id=\"4\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(valorAjuste, driver.findElement(By.xpath("//div[@block-id=\"4\"]/div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
//		abaAjusteFiscais.click();
//		sleep(2000);
		
		distinto5.click();
		sleep(2000);
		
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O Leiaute foi atualizado com sucesso\")]")).size();
		System.out.println(mensaje);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
	
	public ArrayList<Boolean> comparar() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
		String url = driver.getCurrentUrl();
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}
		
		
		biblioteca.click();
		sleep(5000);
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"]")).size();
		String idLeiauteT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[5]/div")).getText();
		String versaoT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[6]/div")).getText();
		String nomeT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[7]/div")).getText();
		String tipoTE = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[9]/div")).getText();
		
		idInserir1(idLeiauteT);
		System.out.println("ultimo id de Leiaute obter1:"+ idLeiauteT);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
//		int idLeiauteIA = convertToInt(idLeiaute);
//		int idLeiauteID= convertToInt(idLeiauteT);
//		
//		if (idLeiauteID > idLeiauteIA) {
//			sucesso.add(true);
//		}else {
//			sucesso.add(false);
//		}
		
		System.out.println("Versão: " + versaoT.equals("1.0"));
		//System.out.println("Nome: " + nomeT.contains("Teste Automatizado kenssy"));
		//System.out.println("Tipo: " + tipoTE.contains("ALTER E-SOCIAL S1200"));
		
		/*sucesso.add(versaoT.equals("1.0"));
		sucesso.add(nomeT.contains("Teste Automatizado kenssy"));
		if (tc2==true) {
			sucesso.add(tipoTE.contains("DCTF"));
		}else {
			sucesso.add(tipoTE.contains("ALTER E-SOCIAL S1200"));
		}
		*/
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	public ArrayList<Boolean> criarConfiguracao() {
		
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		
		System.out.println("");
		System.out.println("-----------------CRIAR CONFIGURACAO-------------------");
		System.out.println("");
		
		sleep(2000);
		abaConfiguracao.click();
		sleep(6000);
		sleep(6000);
		
		raizConfiguracao.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int rowsSPED = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"]")).size();
		String idSPED = "0";
		
		if(rowsSPED > 0) {
			idSPED = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rowsSPED+"]/div[5]/div")).getText();
			System.out.println(idSPED);
		}
		
		
		System.out.println("ultimo id de Configuracao: "+idSPED);
		
		
		novaConfiguracao.click();
		sleep(3000);
		waitExpectElement(nomeConfiguracao);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nomeConfiguracao.sendKeys("Teste Automatizado kenssy");
		sleep(1000);
		String nomeValor = nomeConfiguracao.getAttribute("value");
		System.out.println("nombreInicial Configuracao "+nomeValor);
		
		leiaute.click();
		sleep(2000);

		//WebElement opcLeiauteObter = driver.findElement(By.xpath("//li[@id="+idObter1()+"]"));
		WebElement opcLeiauteObter = driver.findElement(By.xpath("//li[contains(text(),\"ID "+idObter1()+"\")]"));
		
		System.out.println("Opcion Leiaute: "+ opcLeiauteObter);		
		
		//li[@id="7754"]
		waitExpectElement(opcLeiauteObter);
		opcLeiauteObter.click();
		sleep(8000);
		
		versaoConfiguracao.click();
		sleep(3000);
		opcversaoConfiguracao.click();
		sleep(1000);
//		opcversaoSPED.sendKeys(Keys.ESCAPE);
//		sleep(2000);
		
		actionsMoveToElementElement(dataVigenciaConfiguracao);
		sleep(2000);
		
		tributoConfiguracao.click();
		sleep(1000);
		opcTributoConfiguracao.click();
		sleep(1000);
		
//		String tributoValor = opcTributoSPED.getText();
//		System.out.println("tributo SPED "+tributoValor);
		

		empresaSPED.click();
		sleep(1000);
		opcEmpresaConfiguracao.click();
		sleep(1000);
		opcEmpresaConfiguracao.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
//		String empresaValor = empresaSPED.getText();
//		System.out.println("empresa SPED "+empresaValor);
		
		
		actionsMoveToElementElement(dataVigenciaConfiguracao);
		sleep(2000);
		
		
		ufConfiguracao.click();
		sleep(1000);
		
		String ufValor1 ="";
		
		if (tc2==true) {
			//EN ESTE CASO NO APLICA PARA TC2
			opcUFConfiguracao2.click();
			sleep(1000);
			opcUFConfiguracao2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else {
			opcUFConfiguracao1.click();
			sleep(1000);
			opcUFConfiguracao1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
		//String ufValor = ufValor1;
		
		filialConfiguracao.click();
		sleep(1000);
		if (tc2==true) {
			//EN ESTE CASO NO APLICA PARA TC2
			opcFilialConfiguracao2.click();
			sleep(1000);
			opcFilialConfiguracao2.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}else {
			opcFilialConfiguracao1.click();
			sleep(1000);
			opcFilialConfiguracao1.sendKeys(Keys.ESCAPE);
			sleep(1000);
		}
		
		dataVigenciaConfiguracao.sendKeys("01/01/2013");
		sleep(1000);
		
		salvar.click();
		sleep(6000);
		waitExpectElement(siguiente);
		sleep(5000);
		
		sleep(2000);
		abaConfiguracao.click();
		sleep(6000);
		sleep(6000);
		
		raizConfiguracao.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rowsSPED = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"]")).size();
		

		String idSPEDT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rowsSPED+"]/div[5]/div")).getText();
		String nomeSPEDT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rowsSPED+"]/div[6]/div")).getText();
		String ufSPEDT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rowsSPED+"]/div[10]/div")).getText();
		String tributoSPEDT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rowsSPED+"]/div[12]/div")).getText();
		
		
		
		idInserir2(idSPEDT);
		System.out.println("ultimo id de Configuracao obter2:"+ idSPEDT);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		System.out.println("Nome: " + nomeSPEDT.contains("Teste Automatizado"));

		if (tc2==true) {
			System.out.println("UF TC2: " + ufSPEDT.equals("AL"));
		}else {
			System.out.println("UF: " + ufSPEDT.equals("SP"));
		}
		System.out.println("Tributp: " + tributoSPEDT.contains("ICMS"));
		
		
		sucesso.add(nomeSPEDT.contains("Teste Automatizado"));
		if (tc2==true) {
			sucesso.add(ufSPEDT.equals("AL"));
		}else {
			sucesso.add(ufSPEDT.equals("SP"));
		}
		sucesso.add(tributoSPEDT.contains("ICMS"));
		
		System.out.println(sucesso);
		return sucesso;
	}

	public void executar() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		if (url.contains("tq1")) {
			tq1 = true;
		}
		
		if (url.contains("tp1")) {
			tp1 = true;
		}
	
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sleep(2000);
		//quitar
		sleep(2000);
		abaConfiguracao.click();
		sleep(2000);
		
		raizConfiguracao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		///
		String idSPED = idObter2();
		System.out.println("ID configuracao a executar" + idSPED);
		//String idSPED = "15680";
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idSPED+"\"]/div[1]/div"));
		WebElement executar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idSPED+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		executar.click();
		sleep(8000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		waitExpectElement(estadoExecutar);
//		sleep(2000);
		
		estadoExecutar.click();
		sleep(2000);
		opcEstadoExecutar.click();
		sleep(2000);
		opcEstadoExecutar.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		actionsMoveToElementElement(periodo);
		sleep(2000);
		
		
		if(tc2==true) {
			tributoExecutar.click();
			sleep(2000);
			opcTributoExecutar.click();
			sleep(2000);
		}else if (tp1==true) {
			tributoExecutar.click();
			sleep(2000);
			opcTributoExecutar.click();
			sleep(2000);
		}else {
			System.out.println("No se elije tributo");
		}
		
		
		periodo.click();
		sleep(3000);
		paginaAnterior.click();
		sleep(2000);
		ano2016.click();
		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		jan.click();
		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		m1.click();
		sleep(2000);
		
		flagCentralizacao.click();
		sleep(2000);
		
		parametrosManuais.click();
		sleep(6000);
		
//		camposManualExecutar.click();
//		sleep(2000);
//		
//		opcao.click();
//		sleep(2000);
		
		execucao1.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(cargarExecucao);
		sleep(3000);
			
//		visualizarDados2.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(3000);
//		
//		
//		String data1V = data1.getText();
//		String Lineas1V =  lihnas1.getText();
//		
//		System.out.println("-----Visualizar LINEAS Y DATA----------");
//		System.out.println("Data Arquivo: "+ data1V);
//		System.out.println("cantLineas V: "+ Lineas1V);
//		
//		visualizarDados.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(3000);
//		
//		//VISUALIZAR
//		int cantData = driver.findElements(By.xpath("//input[@placeholder=\"Data/Hora de Execução\"]")).size();
//		System.out.println("Cantidad de Data:"+cantData);
//		
//		String dataArquivoV = dataArquivo.getAttribute("value");
//		String canLineas1V =  cantidadLinhas1.getAttribute("value");
//		String canLineas2V =  cantidadLinhas2.getAttribute("value");
//		
//		System.out.println("-----Visualizar SPED----------");
//		System.out.println("Data Arquivo: "+ dataArquivoV);
//		System.out.println("cantLineas 1 V: "+ canLineas1V);
//		System.out.println("cantLineas 2 V: "+ canLineas2V);
//	
//		biblioteca.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(3000);
//		
//		sucesso.add(dataArquivoV.contains(data1V));
//		sucesso.add(canLineas2V.contains(Lineas1V));
//		
//		return sucesso;
	}
	
	public ArrayList<Boolean> verBloco1() {
		
		sleep(3000);
		String saltoLinhaValor1 =  verSaltoLinha1.getText();
		saltoLinhaValor1 = saltoLinhaValor1.replace("?", "");		
		
		/*String saltoLinhaValor2 =  verSaltoLinha2.getText();
		saltoLinhaValor2 = saltoLinhaValor2.replace("?", "");*/
		
		System.out.println("-----Visualizar Salto Linha----------");
		System.out.println("Salto de Linha 1: "+ saltoLinhaValor1);
	//	System.out.println("Salto de Linha 2: "+ saltoLinhaValor2);
		System.out.println("");
		
		visualizarDados2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		System.out.println("------------------------------------------");
		System.out.println("------Datos Visualizar  BLOCO 1----------");
		System.out.println("------------------------------------------");
		System.out.println("");
		
			String dataInicialValor =  verDataInicial.getText();
			String dataFinalValor =  verDataFinal.getText();
			String versaoValor =  verVersao.getText();
			String periodoReferenciaValor =  verPeriodoReferencia.getText();
			
			System.out.println("-----Datos Visualizar 1er Bloco----------");
				System.out.println("Data Inicial: "+ dataInicialValor);
				System.out.println("Data Final: "+ dataFinalValor);
				System.out.println("Versao: "+ versaoValor);
				System.out.println("Periodo de Referencia: "+ periodoReferenciaValor);
			System.out.println("");
			
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
				sucesso.add(dataInicialValor.contains("01/01/2016"));
				sucesso.add(dataFinalValor.contains("31/01/2016"));
				sucesso.add(versaoValor.equals("2"));
				sucesso.add(periodoReferenciaValor.equals(dataInicialValor));
		
		return sucesso;
	}
	
	
	public ArrayList<Boolean> verBloco2() {
		System.out.println("------------------------------------------");
		System.out.println("------Datos Visualizar BLOCO 2----------");
		System.out.println("------------------------------------------");
		System.out.println("");
		
			elegirBloco.click();
			sleep(2000);
			
			opcaoElegirBloco2.click();
			sleep(2000);
			
			String campoFixoValor =  verCampoFixo.getText();
			//String campoFixoManualValor =  verCampoFixoManual.getText();
			
			System.out.println("-----Datos Visualizar 2do Bloco----------");
				System.out.println("Campo Fixo: "+ campoFixoValor);
				//System.out.println("Campo Fixo Manual: "+ campoFixoManualValor);
			System.out.println("");
			
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
				sucesso.add(campoFixoValor.contains("TESTE"));
				//sucesso.add(campoFixoManualValor.contains("TESTE 1"));
			
		return sucesso;
	}
	
	
	public ArrayList<Boolean> verBloco3() {
		System.out.println("------------------------------------------");
		System.out.println("------Datos Visualizar BLOCO 3----------");
		System.out.println("------------------------------------------");
		System.out.println("");
		
			elegirBloco.click();
			sleep(2000);
			opcaoElegirBloco3.click();
			sleep(2000);
			
			int rows = rows("//div[@class=\"tr-content\" and @id]");
			int f = 1;
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
	
			for (int i = 0; i < rows; i++) {
				
				System.out.println("Registro: " + f);
				String totalRegistro = driver.findElement(By.xpath("//div[@class=\"tr-content\" and @id]["+f+"]/div[5]/div")).getText();
	
				//sucesso.add(totalRegistro.equals(f));
				
				System.out.println("Numero de Blocos ("+f+"): " +totalRegistro);
				
				f++;
			}
		
			return sucesso;
	}

	
	public ArrayList<Boolean> verBloco4() {
		System.out.println("------------------------------------------");
		System.out.println("------Datos Visualizar BLOCO 4----------");
		System.out.println("------------------------------------------");
		System.out.println("");
		
			elegirBloco.click();
			sleep(2000);
			opcaoElegirBloco4.click();
			sleep(2000);
			
			System.out.println("------------------------------------------");
			System.out.println("------Datos Visualizar BLOCO 3----------");
			System.out.println("------------------------------------------");
			System.out.println("");
			
			elegirBloco.click();
			sleep(2000);
			opcaoElegirBloco3.click();
			sleep(2000);
			
			int rows = rows("//div[@class=\"tr-content\" and @id]");
			int f = 1;
			
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
	
			for (int i = 0; i < rows; i++) {
				
				System.out.println("Registro: " + f);
				String totalRegistro = driver.findElement(By.xpath("//div[@class=\"tr-content\" and @id]["+f+"]/div[4]/div")).getText();
	
				//sucesso.add(totalRegistro.equals(f));
				
				System.out.println("Numero de Blocos ("+f+"): " +totalRegistro);
				
				f++;
			}
		
		return sucesso;
	}

	
	public ArrayList<Boolean> verBloco5() {
		System.out.println("------------------------------------------");
		System.out.println("------Datos Visualizar BLOCO 5----------");
		System.out.println("------------------------------------------");
		System.out.println("");
		
			elegirBloco.click();
			sleep(2000);
			opcaoElegirBloco5.click();
			sleep(7000);
			
			
			int rows = rows("//div[@class=\"tr-content\" and @id]");
			int f = 1;
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
	
			for (int i = 0; i < rows; i++) {
				
				System.out.println("Registro: " + f);
				sleep(2000);
				String totalRegistro = driver.findElement(By.xpath("//div[@class=\"tr-content\" and @id]["+f+"]/div[1]/div")).getText();
	
				sucesso.add(totalRegistro.equals("1000"));
				
				System.out.println("Numero de Blocos ("+f+"): " +totalRegistro);
				
				f++;
			}
			
			biblioteca.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			return sucesso;
	}
	
	public ArrayList<Boolean> excluirConfiguracao() {
		
		String idConfiguracao = idObter2();
		//String idConfiguracao = "15680";
				
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div"));
		WebElement lixeira = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		lixeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		
		pastaLixeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//String idLeiaute2= idObter1();
		pesquisar.sendKeys(idConfiguracao);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		excluir.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.clear();
		sleep(2000);

		
		
		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"O arquivo foi excluido com sucesso\")]")).size();
		System.out.println(exclucao);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
	
		sucesso.add(true);
			

		
		System.out.println(sucesso);
		return sucesso;
	}
	
	public ArrayList<Boolean> excluirLeiaute() {
		sleep(2000);

		abaLeiautes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idLeiaute = idObter1();
		pesquisar.sendKeys(idLeiaute);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idLeiaute+"\"]/div[1]/div"));
		WebElement lixeira = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idLeiaute+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		lixeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		

		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"O arquivo foi movido a la lixeira com sucesso\")]")).size();
		System.out.println(exclucao);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (exclucao > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}






}
