package com.sap.timp.pageObjectModel.BCB.Demais.HierarquiaConfiguracao;


import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class DemaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte1PO extends TestBaseKenssy  {
	//TSTNG-2230
	//NUEVA CONFIGURACION HIERARQUIA
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][1]")
		public WebElement hierarquias;
		@FindBy(xpath = "//span[text()=\"Hierarquia de Configuração\"]")
		public WebElement hierarquiaConfiguracao;
		@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
		public WebElement ultimo;

	//NUEVA HIERARQUIA
		@FindBy(xpath = "//span[contains(text(),\"Nova\")]")
		public WebElement nova;
		
		@FindBy(xpath = "//input[contains(@placeholder,\"nome de Hierarquia\")]")
		public WebElement nomeDeHierarquia;
	
		@FindBy(xpath = "//input[contains(@placeholder,\"Nome da Aba\")]")
		public WebElement nomeDaAba;
		
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
		
		@FindBy(xpath = "//button[text()=\"Prosseguir\"]")
		public WebElement proseguir;
		
		@FindBy(xpath = "//div[@id=\"justification\"]/div/textarea")
		public WebElement justi;
		
		@FindBy(xpath = "//button[text()=\"Sim\"]")
		public WebElement sim;
		
		@FindBy(xpath = "//button[text()=\"Não\"]")
		public WebElement nao;
		
		@FindBy(xpath = "//textarea[@placeholder=\"Preencher Justificativa\"]")
		public WebElement justificativa;
		
		@FindBy(xpath = "//button[text()=\"Aplicar\"]")
		public WebElement aplicarJustificativa;

		@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
		public WebElement biblioteca;
	
	// NUEVA CONFIGURACAO
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
		
		@FindBy(xpath = "//html/body/div[4]/div/div[3]/button[1]")
		public WebElement fecharEM;
		
		@FindBy(xpath = "//html/body/div[4]/div/div[3]/button[1]")
		public WebElement fecharEM2;
		
		@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
		public WebElement pesquisar;
		
		
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
	
	//VER CAMPOS DE SAIDA
		@FindBy(xpath = "//span[contains(@class,\"icon-plussign\")]")
		public WebElement verCamposSaida;
		@FindBy(xpath = "//button[text()=\"Adicionar campo de saída\"]")
		public WebElement adicionarCamposSaida;
		@FindBy(xpath = "//div[@id=\"create-tab\"]/div/div/div[2]")
		public WebElement camposSaidaAba;
		
		@FindBy(xpath = "//div[@id=\"create-hierarchy\"]/div/div/div[2]")
		public WebElement camposSaidaHieraquia;
		
		@FindBy(xpath = "//div[@id=\"create-group\"]/div/div/div[2]")
		public WebElement camposSaidaGrupo;
		
		@FindBy(xpath = "//div[@id=\"create-sublevel\"]/div/div/div[2]")
		public WebElement camposSaidaSubNivel;
		
		@FindBy(xpath = "//div[@id=\"create-line-field\"]/div/div/div[2]")
		public WebElement camposSaidaCampoLinha;
		
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
		public WebElement camposSaidaValor;
		@FindBy(xpath = "//div[@id=\"create-name\"]/div/div/input")
		public WebElement camposSaidaNome;
		@FindBy(xpath = "//button[contains(text(),\"Criar\")]")
		public WebElement criarAdicionarCamposSaida;
		
		
	//EXECUTAR
		@FindBy(xpath = "//span[text()=\"Executar\"]")
		public WebElement executar;
		
		@FindBy(xpath = "//span[text()=\"Executar\"]")
		public WebElement executarM;
		
		@FindBy(xpath = "//span[contains(@class,\"icon-calendar\")]")
		public WebElement periodo;
		
		@FindBy(xpath = "//div[contains(@class,\"icon-leftmenu\")]")
		public WebElement paginaAnterior;
		
		@FindBy(xpath = "//div[contains(@class,\"icon-rightmenu\")]")
		public WebElement paginaSiguiente;
		
		@FindBy(xpath = "//div[text()=\"2016\"]")
		public WebElement ano2016;
		
		@FindBy(xpath = "//div[text()=\"2019\"]")
		public WebElement ano2019;
		
		@FindBy(xpath = "//div[text()=\"Jan\"]")
		public WebElement jan;
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
		
		@FindBy(xpath = "//div/span[contains(@class,\"icon-pensil\")]")
		public WebElement editarEntradaManual;
		
		@FindBy(xpath = "//div[@id=\"value\"]/div/div/input")
		public WebElement editarValorEntradaManual;
		
		@FindBy(xpath = "//button[text()=\"Gravar\"]")
		public WebElement gravarD;
		
	//HIERARQUIA 2
		@FindBy(xpath = "//div[@id=\"tabs\"]/div/div[@id=\"add-icon\"]")
		public WebElement adicionarAba;
		
	//RELACIONAMIENTO
		@FindBy(xpath = "//span[contains(@class,\"icon-columns\")]")
		public WebElement relacao;
		
		@FindBy(xpath = "//button[contains(text(),\"Adicionar Configuração da Relação\")]")
		public WebElement adicionarConfiguracaoRelacao;
		
		@FindBy(xpath = "//div[@id=\"main-tab\"]/div/div/div[2]")
		public WebElement abaPrincialRelacao;
		@FindBy(xpath = "//div[@id=\"main-hierarchy\"]/div/div/div[2]")
		public WebElement hierarquiaPrincipalRelacao;
		
		@FindBy(xpath = "//div[contains(@class,\"hierarchy-selection\")  and @tabkey=\"2_\"]/div/div/div[2]")
		public WebElement hierarquia2Relacao;
		@FindBy(xpath = "//div[contains(@tabkey,\"2\")  and @class=\"group-selection\"]/div/div/div[2]")
		public WebElement grupo2Relacao;
		
		
		@FindBy(xpath = "//div[contains(@class,\"hierarchy-selection\")  and @tabkey=\"3_\"]/div/div/div[2]")
		public WebElement hierarquia3Relacao;
		@FindBy(xpath = "//div[contains(@tabkey,\"3\")  and @class=\"group-selection\"]/div/div/div[2]")
		public WebElement grupo3Relacao;
		
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
		public WebElement opcRelacao;
		
		
		@FindBy(xpath = "//button[contains(text(),\"Cancelar\")]")
		public WebElement cancelar;
	
	// Relacionamento + Totalizadores + Subperíodo Fixo + Replicar subnível	
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper \")][1]/div/div/div/div[2]/div/label/span")
		public WebElement subperiodoFixo;
		
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper \")][1]/div/div/div/div[3]/div/div/div[2]")
		public WebElement mesSubperiodoFixo;
		
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and text()=\"Janeiro\"]")
		public WebElement mesSubperiodoFixo1;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and text()=\"Novembro\"]")
		public WebElement mesSubperiodoFixo2;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinhaR1;
		@FindBy(xpath = "//li[text()=\"Campos de Saída BCB\"]")
		public WebElement campoLinhaRO1;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"report\"]/div/div/div[2]")
		public WebElement selectConfiguracaoConsolidacao;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][1]/div/div[@id=\"value\"]/div[@class=\"base-autocomplete required\"]/div[2]")
		public WebElement camposSaida;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
		public WebElement opcCamposSaida;
		
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][1]/div/div[2]/div/div[4]/div/div[@class=\"subLevels\"][1]/div[1]/div[1]/div[2]")
		public WebElement replicarSubnivel;
		
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][1]/div/div[2]/div/div[2]/div/div[@class=\"subLevels\"][1]/div[1]/div[1]/div[2]")
		public WebElement replicarSubnivelTQ1;
						
						//div[contains(@class,"baseTabs-view -view-wrapper")][1]/div/div[2]/div/div[2]/div/div[@class="subLevels"][1]/div[1]/div[1]/div[2]
		
		//SEGUNDO SUBNIVEL
		@FindBy(xpath = "//div[@class=\"page-number icon-btn trans btn\" and text()=\"2\"]")
		public WebElement segundoNivel;
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][1]/div/div[2]/div/div[4]/div/div[5]/div/div[@class=\"page-number icon-btn trans btn\" and text()=\"2\"]")
		public WebElement segundoNivelTC2;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"configuration\"]/div/div[2]")
		public WebElement campolinhaR2;
		@FindBy(xpath = "//li[text()=\"Campos de Saída BCB\"]")
		public WebElement campoLinhaRO2;
		//div[contains(@class,"baseTabs-view -view-wrapper")][2]/div/div[2]/div/div[4]/div/div[@class="subLevels"][1]/div[1]/div[1]/div[5]/div/div/div/input
		@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"report\"]/div/div/div[2]")
		public WebElement selectConfiguracaoConsolidacao2;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div[@id=\"value\"]/div[@class=\"base-autocomplete required\"]/div[2]")
		public WebElement camposSaida2;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
		public WebElement opcCamposSaida2;
		
		@FindBy(xpath = "//div[@class=\"subLevel\"][2]/div/div/div[@id=\"totalize\"]/div/label/span")
		public WebElement totalizar2;
		
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][1]/div/div[2]/div/div[4]/div/div[@class=\"subLevels\"][1]/div[2]/div[1]/div[2]")
		public WebElement replicarSubnivel2;
		
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][1]/div/div[2]/div/div[2]/div/div[@class=\"subLevels\"][1]/div[2]/div[1]/div[2]")
		public WebElement replicarSubnivel2TQ1;
		

	//ABA 2
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][2]/div/div[2]/div/div[4]/div/div[5]/div/div[@class=\"page-number icon-btn trans btn\" and text()=\"1\"]")
		public WebElement primerNivelAba2;
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][2]/div/div[2]/div/div[4]/div/div[5]/div/div[@class=\"page-number icon-btn trans btn\" and text()=\"2\"]")
		public WebElement segundoNivelAba2;
		
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][2]/div/div[2]/div/div[2]/div/div[3]/div/div[@class=\"page-number icon-btn trans btn\" and text()=\"1\"]")
		public WebElement primerNivelAba2TQ1;
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][2]/div/div[2]/div/div[2]/div/div[3]/div/div[@class=\"page-number icon-btn trans btn\" and text()=\"2\"]")
		public WebElement segundoNivelAba2TQ1;
		
		
		
		@FindBy(xpath = "//div[@class=\"container-tabs\"]/div[2]/span/span[2]")
		public WebElement aba2;
		
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper \")][1]/div/div/div/div[2]/div/label/span")
		public WebElement subperiodoFixo2;
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper \")][1]/div/div/div/div[3]/div/div/div[2]")
		public WebElement mesSubperiodoFixoAba2;
		
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and text()=\"Fevereiro\"]")
		public WebElement mesSubperiodoFixo1Aba2;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and text()=\"Dezembro\"]")
		public WebElement mesSubperiodoFixo2Aba2;
		
	//subnivelMudado
		@FindBy(xpath = "//div[@class=\"show-copied-results p-20\"]/ul/li[1]")
		public WebElement subnivelMudado1;
		@FindBy(xpath = "//div[@class=\"show-copied-results p-20\"]/ul/li[2]")
		public WebElement subnivelMudado2;
		
	//CAMPOS ABA2 SUBNIVEL 1
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][2]/div/div[2]/div/div[4]/div/div[@class=\"subLevels\"][1]/div[1]/div[1]/div[@id=\"configuration\"]/div/div/input")
	public WebElement camposBCBAba2Subnivel1;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][2]/div/div[2]/div/div[2]/div/div[@class=\"subLevels\"][1]/div[1]/div[1]/div[@id=\"configuration\"]/div/div/input")
	public WebElement camposBCBAba2Subnivel1TQ1;
	
		
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][2]/div/div[2]/div/div[4]/div/div[@class=\"subLevels\"][1]/div[1]/div[1]/div[@id=\"report\"]/div/div/div/input")
	public WebElement campoConfiguracaoAba2Subnivel1;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][2]/div/div[2]/div/div[2]/div/div[@class=\"subLevels\"][1]/div[1]/div[1]/div[@id=\"report\"]/div/div/div/input")
	public WebElement campoConfiguracaoAba2Subnivel1TQ1;
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][2]/div/div[2]/div/div[4]/div/div[@class=\"subLevels\"][1]/div[1]/div[1]/div[@id=\"value\"]/div/div/input")
	public WebElement camposSaidaAba2Subnivel1;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][2]/div/div[2]/div/div[2]/div/div[@class=\"subLevels\"][1]/div[1]/div[1]/div[@id=\"value\"]/div/div/input")
	public WebElement camposSaidaAba2Subnivel1TQ1;
	
	//CAMPOS ABA2 SUBNIVEL 2
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][2]/div/div[2]/div/div[4]/div/div[@class=\"subLevels\"][1]/div[2]/div[1]/div[@id=\"configuration\"]/div/div/input")
	public WebElement camposBCBAba2Subnivel2;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][2]/div/div[2]/div/div[2]/div/div[@class=\"subLevels\"][1]/div[2]/div[1]/div[@id=\"configuration\"]/div/div/input")
	public WebElement camposBCBAba2Subnivel2TQ1;	
	
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][2]/div/div[2]/div/div[4]/div/div[@class=\"subLevels\"][1]/div[2]/div[1]/div[@id=\"report\"]/div/div/div/input")
	public WebElement campoConfiguracaoAba2Subnivel2;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][2]/div/div[2]/div/div[2]/div/div[@class=\"subLevels\"][1]/div[2]/div[1]/div[@id=\"report\"]/div/div/div/input")
	public WebElement campoConfiguracaoAba2Subnivel2TQ1;
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][2]/div/div[2]/div/div[4]/div/div[@class=\"subLevels\"][1]/div[2]/div[1]/div[@id=\"value\"]/div/div/input")
	public WebElement camposSaidaAba2Subnivel2;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][2]/div/div[2]/div/div[2]/div/div[@class=\"subLevels\"][1]/div[2]/div[1]/div[@id=\"value\"]/div/div/input")
	public WebElement camposSaidaAba2Subnivel2TQ1;
	
	
	//ABA 3
		@FindBy(xpath = "//div[@class=\"container-tabs\"]/div[3]/span/span[2]")
		public WebElement aba3;
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[2]/div/div[4]/div/div[5]/div/div[@class=\"page-number icon-btn trans btn\" and text()=\"1\"]")
		public WebElement primerNivelAba3;
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[2]/div/div[4]/div/div[5]/div/div[@class=\"page-number icon-btn trans btn\" and text()=\"2\"]")
		public WebElement segundoNivelAba3;
		
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[2]/div/div[2]/div/div[3]/div/div[@class=\"page-number icon-btn trans btn\" and text()=\"1\"]")
		public WebElement primerNivelAba3TQ1;
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[2]/div/div[2]/div/div[3]/div/div[@class=\"page-number icon-btn trans btn\" and text()=\"2\"]")
		public WebElement segundoNivelAba3TQ1;
		
		
		
		//CAMPOS ABA3 SUBNIVEL 1
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[2]/div/div[4]/div/div[@class=\"subLevels\"][1]/div[1]/div[1]/div[@id=\"configuration\"]/div/div/input")
		public WebElement camposBCBAba3Subnivel1;
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[2]/div/div[2]/div/div[@class=\"subLevels\"][1]/div[1]/div[1]/div[@id=\"configuration\"]/div/div/input")
		public WebElement camposBCBAba3Subnivel1TQ1;
		
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[2]/div/div[4]/div/div[@class=\"subLevels\"][1]/div[1]/div[1]/div[@id=\"report\"]/div/div/div/input")
		public WebElement campoConfiguracaoAba3Subnivel1;
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[2]/div/div[2]/div/div[@class=\"subLevels\"][1]/div[1]/div[1]/div[@id=\"report\"]/div/div/div/input")
		public WebElement campoConfiguracaoAba3Subnivel1TQ1;
		
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[2]/div/div[4]/div/div[@class=\"subLevels\"][1]/div[1]/div[1]/div[@id=\"value\"]/div/div/input")
		public WebElement camposSaidaAba3Subnivel1;
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[2]/div/div[2]/div/div[@class=\"subLevels\"][1]/div[1]/div[1]/div[@id=\"value\"]/div/div/input")
		public WebElement camposSaidaAba3Subnivel1TQ1;
		
		//CAMPOS ABA3 SUBNIVEL 2
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[2]/div/div[4]/div/div[@class=\"subLevels\"][1]/div[2]/div[1]/div[@id=\"configuration\"]/div/div/input")
		public WebElement camposBCBAba3Subnivel2;	
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[2]/div/div[2]/div/div[@class=\"subLevels\"][1]/div[2]/div[1]/div[@id=\"configuration\"]/div/div/input")
		public WebElement camposBCBAba3Subnivel2TQ1;
		
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[2]/div/div[4]/div/div[@class=\"subLevels\"][1]/div[2]/div[1]/div[@id=\"report\"]/div/div/div/input")
		public WebElement campoConfiguracaoAba3Subnivel2;
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[2]/div/div[2]/div/div[@class=\"subLevels\"][1]/div[2]/div[1]/div[@id=\"report\"]/div/div/div/input")
		public WebElement campoConfiguracaoAba3Subnivel2TQ1;
		
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[2]/div/div[4]/div/div[@class=\"subLevels\"][1]/div[2]/div[1]/div[@id=\"value\"]/div/div/input")
		public WebElement camposSaidaAba3Subnivel2;
		@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[2]/div/div[2]/div/div[@class=\"subLevels\"][1]/div[2]/div[1]/div[@id=\"value\"]/div/div/input")
		public WebElement camposSaidaAba3Subnivel2TQ1;
	
	//RESULTADO FINAL
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
		public WebElement camposSaidaSubnivel2;
		@FindBy(xpath = "//div[@id=\"name\"]/div/div/input")
		public WebElement nomedoResultado;
		
		@FindBy(xpath = "//div[@class=\"column-wrapper first\"]/div/div[contains(text(),\"Campos de Saída\")]")
		public WebElement camposSaidaBCB;
		
		@FindBy(xpath = "//div[text()=\"Aba 1\"]")
		public WebElement selectCampoSaidaAba1OPC1;
		
		@FindBy(xpath = "//div[text()=\"Subnivel 2(Aba 1)\"]")
		public WebElement selectCampoSaidaAba1OPC2;
		
		@FindBy(xpath = "//div[@id=\"formula-Box\"]/div/textarea")
		public WebElement caixaFormula;
		
	//RESULTADO DO ABA
		@FindBy(xpath = "//span[contains(text(),\"Configurações do Resultado da Abas\")]")
		public WebElement resultadodDoAba;
		
		@FindBy(xpath = "//div[contains(@class,\"adjustments\")]/div/div/div[2]/div/div[1]/div/div/button")
		public WebElement adicionarAbas;
		
		
		@FindBy(xpath = "//div[@id=\"source-tab\"]/div/div/div[2]")
		public WebElement configuracaoAba;
		
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
		public WebElement opcAba2;
		
		
	//VERIFICAR INFORMACION DE SUBNIVELES
		@FindBy(xpath = "//div[contains(@class,\"lvl-0\")][1]/div/div[1]/div[1]/div[1]")
		public WebElement abrirHierarquia1;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-1\")]/div[2]/div[1]/div[1]/div[1]")
		public WebElement abrirGrupo1;
		
	
	//DATOS ABA 1
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")]/div[2]/div[1]/div[1]/div[2]/div/div[1]")
		public WebElement verSub1Aba1;
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")][1]/div[2]/div[1]/div[2]/table/tbody/tr[2]/td/span")
		public WebElement verCampoSaida1Sub1Aba1;
		
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")]/div[2]/div[2]/div[1]/div[2]/div/div[1]")
		public WebElement verSub2Aba1;
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")]/div[2]/div[2]/div[2]/table/tbody/tr[2]/td/span")
		public WebElement verCampoSaida1Sub2Aba1;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-1\")]/div[2]/div[1]/div[1]/div[2]")
		public WebElement verTotalizadorGrupo1Aba1;
		

	//DATOS ABA 2
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")]/div[2]/div[1]/div[1]/div[3]/div/div[1]")
		public WebElement verSub1Aba2;
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")][1]/div[2]/div[1]/div[3]/table/tbody/tr[2]/td/span")
		public WebElement verCampoSaida1Sub1Aba2;
		
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")]/div[2]/div[2]/div[1]/div[3]/div/div[1]")
		public WebElement verSub2Aba2;
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")][1]/div[2]/div[1]/div[3]/table/tbody/tr[2]/td/span")
		public WebElement verCampoSaida1Sub2Aba2;
		
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-1\")]/div[2]/div[1]/div[1]/div[3]")
		public WebElement verTotalizadorGrupo1Aba2;
		
	//DATOS ABA 3
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")]/div[2]/div[1]/div[1]/div[4]/div/div[1]")
		public WebElement verSub1Aba3;
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")][1]/div[2]/div[1]/div[4]/table/tbody/tr[2]/td/span")
		public WebElement verCampoSaida1Sub1Aba3;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")]/div[2]/div[2]/div[1]/div[4]/div/div[1]")
		public WebElement verSub2Aba3;
		@FindBy(xpath = "//div[contains(@class,\"lvl-2\")][1]/div[2]/div[2]/div[4]/table/tbody/tr[2]/td/span")
		public WebElement verCampoSaida1Sub2Aba3;
		
		@FindBy(xpath = "//div[contains(@class,\"lvl-1\")]/div[2]/div[1]/div[1]/div[4]")
		public WebElement verTotalizadorGrupo1Aba3;
	
	//DATOS RESULTADO FINAL
		@FindBy(xpath = "//div[contains(@class,\"lvl-0\")][2]/div/div[2]")
		public WebElement verResultadoFinal;
	
		@FindBy(xpath = "//div[contains(@class,\"lvl-0\")]/div[1]/div[3]/div[2]")
		public WebElement totalizadorAba2;	
		
		
	//EXCLUIR
		@FindBy(xpath = "//button[text()=\"Sim\"]")
		public WebElement simLexeira;
		@FindBy(xpath = "//li[@identifier=\"accordion-item-inactiveExecutions\"]")
		public WebElement pastaLexeira;
		
		@FindBy(xpath = "//button[text()=\"Sim\"]")
		public WebElement simExcluir;
		@FindBy(xpath = "//li[@identifier=\"accordion-item-inactiveConfigurations\"]")
		public WebElement pastaLexeiraC;
		@FindBy(xpath = "//li[@identifier=\"accordion-item-inactiveHierarchies\"]")
		public WebElement pastaLexeiraH;
		@FindBy(xpath = "//button[text()=\"Aceitar\"]")
		public WebElement aceitar;
	
				
	public DemaisHierarquiaConfiguracaoTodasAsFuncionalidadesParte1PO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criarConfiguracaoHierarquia() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		//IR A HIERARQUIA CONFIGURACAO
		sleep(2000);
		hierarquias.click();
		sleep(1000);
		hierarquiaConfiguracao.click();
		sleep(2000);
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
		sleep(2000);
		waitExpectElement(nomeDeHierarquia);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		nomeDeHierarquia.sendKeys("Prueba Automatizada de Hierarquia QA PRUEBA 1");
		sleep(1000);

		nomeDaAba.sendKeys("Aba 1");
		sleep(1000);
		
		actionsMoveToElementElement(nomeDoCampoDeLinha);
		sleep(1000);
		nomeDaHierarquia.sendKeys("Hierarquia 1");
		sleep(1000);
		listaNomeDaAba.click();
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(1000);

		nomeDoGrupo.sendKeys("Grupo 1");
		sleep(1000);
		listaNomeDoHierarquia.click();
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(1000);

//		for (int i = 0; i < 4; i++) {
//			adicionar.click();
//			sleep(1000);
//		}

		int subniveisAdicionados = driver.findElements(By.xpath("//div[@id=\"sublevels\"]/div")).size();
		System.out.println(subniveisAdicionados);

		String subniveisAdicionadosS = String.valueOf(subniveisAdicionados);

		sucesso.add(subniveisAdicionadosS.equals("1"));

		int f = 1;
		for (int i = 0; i < 1; i++) {

		}
		
		
		for (int i = 0; i < subniveisAdicionados; i++) {
			WebElement nomeDoSubnivel = driver
					.findElement(By.xpath("//div[@id=\"sublevels\"]/div[" + f + "]/div[3]/div/div/input"));
			WebElement listoDoNomeDoGrupo = driver.findElement(By.xpath("//div[@id=\"sublevels\"]/div[" + f
					+ "]/div[@id=\"belongsTo\" and @class=\"field\"]/div/div/div[2]"));

			nomeDoSubnivel.sendKeys("Subnivel " + f);
			sleep(1000);
			listoDoNomeDoGrupo.click();
			opcao.click();
			opcao.sendKeys(Keys.ESCAPE);
			sleep(1000);

			f = f + 1;
		}

		nomeDoCampoDeLinha.sendKeys("Campo linha 1");
		sleep(1000);
		listanomeDoSubnivel.click();
		opcaoTodos.click();
		opcaoTodos.sendKeys(Keys.ESCAPE);

		sleep(1000);
		gravar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		nao.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		justificativa.sendKeys("Justificativa TESTE AUTOMATIZADO");
//		aplicarJustificativa.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rowsH2 = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String iH2 = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rowsH2 + "]/div[4]/div"))
				.getText();
		String nome = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rowsH2 + "]/div[5]/div"))
				.getText();
		System.out.println(nome);

		sucesso.add(nome.contains("Prueba Automatizada de Hierarq"));

		idInserir2(iH2);
		System.out.println("Id ultimo de Hierarquia 1 a excluir: " + iH2);

		int id1I = convertToInt(idH);
		int id2I = convertToInt(iH2);

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
	
	public boolean criarConfiguracionConfiguracao() {
		
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		sleep(2000);
		configuracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaoDaConsolidacao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and@data-id]")).size();
		String id = driver.findElement(By.xpath("//div[@class=\"tr\" and@data-id]["+rows+"]/div[4]/div")).getText();
		System.out.println("Id Configurações antes da criação: "+ id);
		//idInserir2(id); //antes de crear herarquia configuracao
		
		nova.click();
		sleep(2000);

		//attributeToBeXpath("//div[@id=\"hierarchy-name\"]/div", "class", "base-autocomplete required");
		sleep(5000);

		nomeHirarquia.sendKeys("Prueba Automatizada de Hierarq");
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
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and@data-id]")).size();
		String idApos = driver.findElement(By.xpath("//div[@class=\"tr\" and@data-id]["+rows+"]/div[4]/div")).getText();
		
		idInserir3(idApos);
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
		
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> configurarConfiguracao() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
			
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter3()+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter3()+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(calculator);
		sleep(12000);
		
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
		sleep(2000);
	//	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nao.click();
		sleep(2000);
//	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		//corregir mensaje al parecer
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi salva\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
	
	public ArrayList<Boolean> entradaManual() {
		sleep(3000);
		System.out.println("***********");
		System.out.println("Entrada Manual");
		System.out.println("***********");
		entrada.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarEntrada.click();
		sleep(2000);
		waitExpectElement(criarAdicionarEntradaManual);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		entradaManualNome.sendKeys("Entrada Manual 1");
		sleep(1000);
		
		entradaManualValor.sendKeys("1.000,00");
		sleep(1000);
		
		
		criarAdicionarEntradaManual.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//corregir mensaje al parecer
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"Entrada manual inserido com sucesso\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		
		
		fechar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		campolinha1.click();
		sleep(1000);
		campoLinhaO1.click();
		sleep(2000);
		
		entradaManual1.click();
		sleep(1000);
		entradaManualO1.click();
		sleep(12000);
		
		gravar.click();
		sleep(2000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nao.click();
		sleep(8000);
		
		//corregir mensaje al parecer
		mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi salva\")]")).size();
		
		sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}	
		
		return sucesso;
	}
	
	public ArrayList<Boolean> campoOutput() {
		System.out.println("***********");
		System.out.println("campo Output");
		System.out.println("***********");
		sleep(3000);
		verCamposSaida.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarCamposSaida.click();
		sleep(2000);
		waitExpectElement(criarAdicionarEntradaManual);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		camposSaidaAba.click();
		sleep(2000);
		camposSaidaValor.click();
		sleep(2000);
		
		
		camposSaidaHieraquia.click();
		sleep(2000);
		camposSaidaValor.click();
		sleep(2000);
		
		camposSaidaGrupo.click();
		sleep(2000);
		camposSaidaValor.click();
		sleep(2000);
		
		camposSaidaSubNivel.click();
		sleep(2000);
		camposSaidaValor.click();
		sleep(2000);
		
//		camposSaidaCampoLinha.click();
//		sleep(2000);
//		camposSaidaValor.click();
//		sleep(2000);
		
		camposSaidaNome.sendKeys("Campo Saida 11");
		sleep(2000);
		
		criarAdicionarCamposSaida.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"Campo de saída criado com sucesso\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		fecharEM.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		fechar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nao.click();
		sleep(8000);
		
		
		return sucesso;
	}
	
	public ArrayList<Boolean> executar1() {
		
		boolean tc2 = false;
		boolean tp1 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}
		//COMENTAR DESPUES PORFAVOR
//		sleep(2000);
//		configuracoes.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		configuracaoDaConsolidacao.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		
//		pesquisar.sendKeys("336");
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		
//		
//		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"336\"]/div[1]/div"));
//		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"336\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
//		sleep(2000);
//		
//		menu.click();
//		sleep(1000);
//		editar.click();
//		sleep(6000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		waitExpectElement(calculator);
//		sleep(2000);
	//HASTA AQUI
		
		sleep(1000);
		executar.click();
		sleep(5000);
		waitExpectElement(executarM);
		sleep(5000);
		executarM.click();
		
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		periodo.click();
		sleep(2000);
		paginaAnterior.click();
		sleep(2000);
		
		if (tc2) {
			ano2019.click();
			sleep(1000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			nov.click();
			sleep(1000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			m1.click(); //OJO CORREGIR PARA TC2
		}else {
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

		sleep(2000);
	//	execucaoAnalitica.click();
		sleep(2000);
		
		executarB.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(10000);
		
		gravar.click();
		sleep(2000);
		
		
		proseguir.click();
		sleep(2000);
		
		justi.sendKeys("Ciclo TA ");
		sleep(1000);
		
		aplicarJustificativa.click();
		sleep(3000);
		salvarExecucoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cancelar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"Número de Versão 1 de Execução do Builder foi criada com sucesso\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		//if (mensaje > 0) {
			sucesso.add(true);
			
//		}else {
//			sucesso.add(false);
//		}
//		
		return sucesso;
	}
	
	public void executar2() {
		
		boolean tc2 = false;
		boolean tp1 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}
		
		sleep(8000);
	//	aceitar.click();
		sleep(3000);
//		waitExpectElement(executarM);
		
		
		sleep(18000);
		executarM.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		periodo.click();
		sleep(2000);
		paginaSiguiente.click();
		sleep(3000);
		
		if (tc2) {
			m1.click();
		}else {
			m1.click();
		}
		
		sleep(2000);
	///	execucaoAnalitica.click();
		sleep(2000);
		
		executarB.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	}
	
	public ArrayList<Boolean> adicionarEntradaManual2() {
		sleep(2000);
		entrada.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		editarEntradaManual.click();
		sleep(2000);
		editarValorEntradaManual.clear();
		sleep(2000);
		editarValorEntradaManual.sendKeys("2.000,00");
		sleep(2000);
		
		gravarD.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"Recalculado com sucesso\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		fechar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		salvarExecucoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		cancelar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		return sucesso;
		
			
	}

	//si funciona
	public ArrayList<Boolean>  criarConfiguracaoHierarquia2() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		//IR A HIERARQUIA CONFIGURACAO
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
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rowsH3 = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String idH3 = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rowsH3 + "]/div[4]/div"))
				.getText();
		System.out.println("Ultimo ID de Hierarquia Configuracao 2: "+rowsH3);
		
		
		nova.click();
		sleep(3000);
		waitExpectElement(nomeDeHierarquia);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		nomeDeHierarquia.sendKeys("Prueba Automat Hierarquia 2");
		sleep(1000);

		for (int i = 0; i < 2; i++) {
			adicionarAba.click();
			sleep(1000);
		}

		int abaAdicionados = driver.findElements(By.xpath("//div[@id=\"tabs\"]/div[@class=\"tab\"]")).size();
		System.out.println("Abas totales: "+abaAdicionados);

		String abaAdicionadosS = String.valueOf(abaAdicionados);

		sucesso.add(abaAdicionadosS.equals("3"));

		int g = 1;
		for (int i = 0; i < 1; i++) {

		}
		
		for (int i = 0; i < abaAdicionados; i++) {
			WebElement nomeDoAba = driver
					.findElement(By.xpath("//div[@id=\"tabs\"]/div[" + g + "]/div[3]/div/div/input"));

			nomeDoAba.sendKeys("Aba " + g);
			sleep(1000);

			g = g + 1;
		}
		
		actionsMoveToElementElement(nomeDoCampoDeLinha);
		sleep(1000);
		nomeDaHierarquia.sendKeys("Hierarquia 1");
		sleep(1000);
		listaNomeDaAba.click();
		opcaoTodos.click();
		opcaoTodos.sendKeys(Keys.ESCAPE);
		sleep(1000);

		nomeDoGrupo.sendKeys("Grupo 1");
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

		sucesso.add(subniveisAdicionadosS.equals("2"));

		int f = 1;
		for (int i = 0; i < 1; i++) {

		}
		
		for (int i = 0; i < subniveisAdicionados; i++) {
			WebElement nomeDoSubnivel = driver
					.findElement(By.xpath("//div[@id=\"sublevels\"]/div[" + f + "]/div[3]/div/div/input"));
			WebElement listoDoNomeDoGrupo = driver.findElement(By.xpath("//div[@id=\"sublevels\"]/div[" + f
					+ "]/div[@id=\"belongsTo\" and @class=\"field\"]/div/div/div[2]"));

			nomeDoSubnivel.sendKeys("Subnivel " + f);
			sleep(1000);
			listoDoNomeDoGrupo.click();
			opcao.click();
			opcao.sendKeys(Keys.ESCAPE);
			sleep(1000);

			f = f + 1;
		}

		nomeDoCampoDeLinha.sendKeys("Campo linha 1");
		sleep(1000);
		listanomeDoSubnivel.click();
		opcaoTodos.click();
		opcaoTodos.sendKeys(Keys.ESCAPE);

		sleep(1000);
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		justificativa.sendKeys("Justificativa TESTE AUTOMATIZADO");
//		aplicarJustificativa.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		hierarquiaConfiguracao.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rowsH4 = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String idH4 = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rowsH4 + "]/div[4]/div"))
				.getText();
		String nome = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rowsH4 + "]/div[5]/div"))
				.getText();
		System.out.println(nome);

		sucesso.add(nome.contains("Prueba Automat Hierarquia 2"));

		System.out.println("InserId 4, segunda hierarquia a excluir: "+idH4);
		idInserir4(idH4);

		int id1I = convertToInt(idH3);
		int id2I = convertToInt(idH4);

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
	
	public boolean criarConfiguracionConfiguracao2() {
		
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		sleep(2000);
		driver.navigate().refresh();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(configuracoes);
		sleep(8000);
		
		sleep(2000);
		configuracoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaoDaConsolidacao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rowsC2 = driver.findElements(By.xpath("//div[@class=\"tr\" and@data-id]")).size();
		String idC2 = driver.findElement(By.xpath("//div[@class=\"tr\" and@data-id]["+rowsC2+"]/div[4]/div")).getText();
		System.out.println("Id Configurações antes da criação: "+ idC2);
		//idInserir2(id); //antes de crear herarquia configuracao
		
		nova.click();
		sleep(3000);

		attributeToBeXpath("//div[@id=\"hierarchy-name\"]/div", "class", "base-autocomplete required");
		sleep(2000);

		nomeHirarquia.sendKeys("Prueba Automat Hierarquia 2");
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
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rowsC2 = driver.findElements(By.xpath("//div[@class=\"tr\" and@data-id]")).size();
		String idAposC2 = driver.findElement(By.xpath("//div[@class=\"tr\" and@data-id]["+rowsC2+"]/div[4]/div")).getText();
		
		idInserir5(idAposC2);
		System.out.println("Id Configurações apos da criação: "+ idAposC2);
		
		
		System.out.println("");
		System.out.println("***********");
		System.out.println("CONFIFURACOES");
		System.out.println("ID ANTES: " +idC2);
		System.out.println("ID DESPUES: "+ idAposC2);
		System.out.println("***********");
		System.out.println("");
		
		int idI = convertToInt(idC2);
		int idAposI = convertToInt(idAposC2);
		
		boolean sucesso = false;
		
		if (idAposI > idI) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> configurarConfiguracaoRelacionamiento() {
		boolean tc2 = false;
		String url = driver.getCurrentUrl();
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		//COMENTAR DESPUES PORFAVOR
//			sleep(2000);
//			configuracoes.click();
//			sleep(2000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
//			configuracaoDaConsolidacao.click();
//			sleep(2000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
//			
//			pesquisar.sendKeys("475");
//			//pesquisar.sendKeys("1171");
//			pesquisar.sendKeys(Keys.ENTER);
//			sleep(3000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
//			
//			//351 para tp1
//			
//			WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"475\"]/div[1]/div"));
//			WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"475\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
//			sleep(2000);
		//HASTA AQUI
			
		sleep(6000);

		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter5()+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter5()+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		sleep(2000);
			
		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(relacao);
		sleep(2000);
		
		relacao.click();
		sleep(1000);
		waitExpectElement(adicionarConfiguracaoRelacao);
		sleep(2000);

		adicionarConfiguracaoRelacao.click();
		sleep(1000);
		waitExpectElement(abaPrincialRelacao);
		sleep(2000);
		abaPrincialRelacao.click();
		sleep(1000);
		opcRelacao.click();
		sleep(1000);
		
		
		hierarquiaPrincipalRelacao.click();
		sleep(1000);
		opcRelacao.click();
		sleep(1000);
		
		hierarquia2Relacao.click();
		sleep(1000);
		opcRelacao.click();
		sleep(1000);
		grupo2Relacao.click();
		sleep(1000);
		opcRelacao.click();
		sleep(1000);
		
		
		hierarquia3Relacao.click();
		sleep(1000);
		opcRelacao.click();
		sleep(1000);
		grupo3Relacao.click();
		sleep(1000);
		opcRelacao.click();
		sleep(1000);
		
		criar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//corregir mensaje al parecer
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"Configuração relação inserido com sucesso\")]")).size();
		//int mensaje = 1;
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		cancelar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		return sucesso;
	}
	
	//si funciona
	public ArrayList<Boolean> relacionamentoTotalizadorSubperiodoFixoReplicar() {
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
		System.out.println("_________________________________________________________________");
		System.out.println("------------------------*** Primera Aba ***----------------------");
		System.out.println("_________________________________________________________________");
		System.out.println("---------------*********Primer Subnivel*******----------------");
		System.out.println("---------------*********Relacionamento *******---------------");
		System.out.println("");
		
		subperiodoFixo.click();
		sleep(1000);
		
		mesSubperiodoFixo.click();
		sleep(1000);
		
		if (tc2==true) {
			mesSubperiodoFixo2.click();
			sleep(1000);
		}else {
			mesSubperiodoFixo1.click();
			sleep(1000);
		}
		
		//sleep(2000);
		campolinhaR1.click();
		sleep(2000);
		campoLinhaRO1.click();
		String campo1 = campoLinhaRO1.getText();
		sleep(2000);
		
		
		
		attributeToBeXpath("//div[@id=\"report\"]/div", "class", "base-select required");
		sleep(3000);
		
		selectConfiguracaoConsolidacao.click();
		sleep(4000);
		
		WebElement opcConfiguracaoConsolidacao = driver.findElement(By.xpath("//li[contains(text(),\""+idObter3()+"\")]"));
		//WebElement opcConfiguracaoConsolidacao = driver.findElement(By.xpath("//li[contains(text(),\"1170\")]"));
		//WebElement opcConfiguracaoConsolidacao = driver.findElement(By.xpath("//li[contains(text(),\"350\")]")); //tp1
		//WebElement opcConfiguracaoConsolidacao = driver.findElement(By.xpath("//li[contains(text(),\"474\")]")); //tC2
		System.out.println("Primera Configuracion creada: "+ opcConfiguracaoConsolidacao);		
		
		//li[@id="7754"]
		waitExpectElement(opcConfiguracaoConsolidacao);
		opcConfiguracaoConsolidacao.click();
		String campo2 = opcConfiguracaoConsolidacao.getText();
		sleep(6000);
		
		
		
		camposSaida.click();
		sleep(2000);
		opcCamposSaida.click();
		String campo3 = opcCamposSaida.getText();
		sleep(2000);
		
		System.out.println("-------------Primer Subnivel-----------------------");
		System.out.println("Campo linha 1:" +campo1 );
		System.out.println("Campo Configuracao 1:" +campo2 );
		System.out.println("Campo Saida 1:" +campo3 );
		System.out.println("");
		sleep(2000);
		
		if (tp1) {
			replicarSubnivel.click();
			sleep(2000);
		}else if (tq1) {
			replicarSubnivelTQ1.click();
			sleep(2000);
		}else {
			replicarSubnivel.click();
			sleep(2000);
		}
		
//		replicarSubnivel.click();
//		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(2000);
		
		String subNivelMudado1 = subnivelMudado1.getText();
		String subNivelMudado2 = subnivelMudado2.getText();
		System.out.println("SUBNIVELES MUDADOS 1");
		System.out.println("subnivelMudado1: "+subNivelMudado1 );
		System.out.println("subnivelMudado2: "+subNivelMudado2 );

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			sucesso.add(subNivelMudado1.contains("2_1_1_1"));
			sucesso.add(subNivelMudado2.contains("3_1_1_1"));
		
		fechar.click();
		sleep(2000);
		
		
		System.out.println("---------------*********Segundo Subnivel*******----------------");
		System.out.println("");
		
		
		
		if (tc2==true) {
			segundoNivelTC2.click();
			sleep(2000);
		}else {
			segundoNivel.click();
			sleep(2000);
		}
		
		//sleep(2000);
		campolinhaR2.click();
		sleep(2000);
		campoLinhaRO2.click();
		String campo12 = campoLinhaRO2.getText();
		sleep(2000);
				
		selectConfiguracaoConsolidacao2.click();
		sleep(2000);
		
		WebElement opcConfiguracaoConsolidacao2 = driver.findElement(By.xpath("//li[contains(text(),\""+idObter3()+"\")]"));
		//WebElement opcConfiguracaoConsolidacao2 = driver.findElement(By.xpath("//li[contains(text(),\"1170\")]")); //tq1
		//WebElement opcConfiguracaoConsolidacao2 = driver.findElement(By.xpath("//li[contains(text(),\"350\")]")); //tp1
		//WebElement opcConfiguracaoConsolidacao2 = driver.findElement(By.xpath("//li[contains(text(),\"474\")]")); //tC2
		System.out.println("Primera Configuracion creada: "+ opcConfiguracaoConsolidacao2);		
		
		//li[@id="7754"]
		waitExpectElement(opcConfiguracaoConsolidacao2);
		opcConfiguracaoConsolidacao2.click();
		String campo22 = opcConfiguracaoConsolidacao2.getText();
		sleep(2000);
		
		camposSaida2.click();
		sleep(2000);
		opcCamposSaida2.click();
		String campo23 = opcCamposSaida2.getText();
		sleep(2000);
		
		
		totalizar2.click();
		sleep(2000);
		
		
		System.out.println("-------------Segundo Subnivel-----------------------");
		System.out.println("Campo linha 2:" +campo12 );
		System.out.println("Campo Configuracao 2:" +campo22 );
		System.out.println("Campo Saida 2:" +campo23 );
		System.out.println("");
		sleep(2000);
		
		
		if (tp1) {
			replicarSubnivel2.click();
			sleep(2000);
		}else if (tq1) {
			replicarSubnivel2TQ1.click();
			sleep(2000);
		}else {
			replicarSubnivel2.click();
			sleep(2000);
		}
		
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(2000);
		
		String subNivelMudado12 = subnivelMudado1.getText();
		String subNivelMudado22 = subnivelMudado2.getText();
		System.out.println("SUBNIVELES MUDADOS 2");
		System.out.println("subnivelMudado1: "+subNivelMudado12 );
		System.out.println("subnivelMudado2: "+subNivelMudado22 );

		sucesso = new ArrayList<Boolean>();
			sucesso.add(subNivelMudado12.contains("2_1_1_2"));
			sucesso.add(subNivelMudado22.contains("3_1_1_2"));

		fechar.click();
		sleep(2000);
		
		System.out.println("_________________________________________________________________");
		System.out.println("------------------------*** Segunda Aba ***----------------------");
		System.out.println("_________________________________________________________________");
		System.out.println("---------------*********Primer Subnivel*******----------------");
		System.out.println("---------------*********Relacionamento *******---------------");
		System.out.println("");
		
		aba2.click();
		sleep(1000);
		
		subperiodoFixo2.click();
		sleep(1000);
		
		mesSubperiodoFixoAba2.click();
		sleep(1000);
		
		if (tc2==true) {
			mesSubperiodoFixo2Aba2.click();
			sleep(1000);
		}else {
			mesSubperiodoFixo1Aba2.click();
			sleep(1000);
		}
		
		if (tp1) {
			primerNivelAba2.click();
			sleep(1000);
		}else if (tq1) {
			primerNivelAba2TQ1.click();
			sleep(1000);
		}
		
		
		if (tp1) {
			System.out.println("OBTENGO DATOS DE ABA 2 - SUBNIVEL 1");
			String campoBCBAba2Sunivel1 = camposBCBAba2Subnivel1.getAttribute("value");
			String campoConfiguracaoAba2Sunivel1 = campoConfiguracaoAba2Subnivel1.getAttribute("value");
			String campoSaidaAba2Sunivel1 = camposSaidaAba2Subnivel1.getAttribute("value");
			
			System.out.println("VALORES ABA2 SUBNIVEL 1");
			System.out.println("CampoBCBAba2Sunivel1: "+ campoBCBAba2Sunivel1);
			System.out.println("CampoConfiguracaoAba2Sunivel1: "+ campoConfiguracaoAba2Sunivel1);
			System.out.println("CampoSaidaAba2Sunivel1: "+ campoSaidaAba2Sunivel1);
			
			sucesso = new ArrayList<Boolean>();
				sucesso.add(campoBCBAba2Sunivel1.contains(campo1));
				sucesso.add(campoConfiguracaoAba2Sunivel1.contains(campo2));
				sucesso.add(campoSaidaAba2Sunivel1.contains(campo3));
				
		}else if (tq1) {
			System.out.println("OBTENGO DATOS DE ABA 2 - SUBNIVEL 1");
			String campoBCBAba2Sunivel1 = camposBCBAba2Subnivel1TQ1.getAttribute("value");
			String campoConfiguracaoAba2Sunivel1 = campoConfiguracaoAba2Subnivel1TQ1.getAttribute("value");
			String campoSaidaAba2Sunivel1 = camposSaidaAba2Subnivel1TQ1.getAttribute("value");
			
			System.out.println("VALORES ABA2 SUBNIVEL 1");
			System.out.println("CampoBCBAba2Sunivel1: "+ campoBCBAba2Sunivel1);
			System.out.println("CampoConfiguracaoAba2Sunivel1: "+ campoConfiguracaoAba2Sunivel1);
			System.out.println("CampoSaidaAba2Sunivel1: "+ campoSaidaAba2Sunivel1);
			
			sucesso = new ArrayList<Boolean>();
				sucesso.add(campoBCBAba2Sunivel1.contains(campo1));
				sucesso.add(campoConfiguracaoAba2Sunivel1.contains(campo2));
				sucesso.add(campoSaidaAba2Sunivel1.contains(campo3));
		}else {
			System.out.println("OBTENGO DATOS DE ABA 2 - SUBNIVEL 1");
			String campoBCBAba2Sunivel1 = camposBCBAba2Subnivel1.getAttribute("value");
			String campoConfiguracaoAba2Sunivel1 = campoConfiguracaoAba2Subnivel1.getAttribute("value");
			String campoSaidaAba2Sunivel1 = camposSaidaAba2Subnivel1.getAttribute("value");
			
			System.out.println("VALORES ABA2 SUBNIVEL 1");
			System.out.println("CampoBCBAba2Sunivel1: "+ campoBCBAba2Sunivel1);
			System.out.println("CampoConfiguracaoAba2Sunivel1: "+ campoConfiguracaoAba2Sunivel1);
			System.out.println("CampoSaidaAba2Sunivel1: "+ campoSaidaAba2Sunivel1);
			
			sucesso = new ArrayList<Boolean>();
				sucesso.add(campoBCBAba2Sunivel1.contains(campo1));
				sucesso.add(campoConfiguracaoAba2Sunivel1.contains(campo2));
				sucesso.add(campoSaidaAba2Sunivel1.contains(campo3));
		}
		
		
		
		
		
		if (tp1) {
			segundoNivelAba2.click();
			sleep(1000);
		}else if (tq1) {
			segundoNivelAba2TQ1.click();
			sleep(1000);
		}
		
		
		System.out.println("");
		
		if (tp1) {
			System.out.println("OBTENGO DATOS DE ABA 2 - SUBNIVEL 2");
			String campoBCBAba2Sunivel2 = camposBCBAba2Subnivel2.getAttribute("value");
			String campoConfiguracaoAba2Sunivel2 = campoConfiguracaoAba2Subnivel2.getAttribute("value");
			String campoSaidaAba2Sunivel2 = camposSaidaAba2Subnivel2.getAttribute("value");
			
			System.out.println("VALORES ABA2 - SUBNIVEL 2");
			System.out.println("CampoBCBAba2Sunivel2: "+ campoBCBAba2Sunivel2);
			System.out.println("CampoConfiguracaoAba2Sunivel2: "+ campoConfiguracaoAba2Sunivel2);
			System.out.println("CampoSaidaAba2Sunivel2: "+ campoSaidaAba2Sunivel2);
			
			
			sucesso = new ArrayList<Boolean>();
				sucesso.add(campoBCBAba2Sunivel2.contains(campo1));
				sucesso.add(campoConfiguracaoAba2Sunivel2.contains(campo2));
				sucesso.add(campoSaidaAba2Sunivel2.contains(campo3));
		}else if (tq1) {
			System.out.println("OBTENGO DATOS DE ABA 2 - SUBNIVEL 2");
			String campoBCBAba2Sunivel2 = camposBCBAba2Subnivel2TQ1.getAttribute("value");
			String campoConfiguracaoAba2Sunivel2 = campoConfiguracaoAba2Subnivel2TQ1.getAttribute("value");
			String campoSaidaAba2Sunivel2 = camposSaidaAba2Subnivel2TQ1.getAttribute("value");
			
			System.out.println("VALORES ABA2 - SUBNIVEL 2");
			System.out.println("CampoBCBAba2Sunivel2: "+ campoBCBAba2Sunivel2);
			System.out.println("CampoConfiguracaoAba2Sunivel2: "+ campoConfiguracaoAba2Sunivel2);
			System.out.println("CampoSaidaAba2Sunivel2: "+ campoSaidaAba2Sunivel2);
			
			
			sucesso = new ArrayList<Boolean>();
				sucesso.add(campoBCBAba2Sunivel2.contains(campo1));
				sucesso.add(campoConfiguracaoAba2Sunivel2.contains(campo2));
				sucesso.add(campoSaidaAba2Sunivel2.contains(campo3));
		}else {
			System.out.println("OBTENGO DATOS DE ABA 2 - SUBNIVEL 2");
			String campoBCBAba2Sunivel2 = camposBCBAba2Subnivel2.getAttribute("value");
			String campoConfiguracaoAba2Sunivel2 = campoConfiguracaoAba2Subnivel2.getAttribute("value");
			String campoSaidaAba2Sunivel2 = camposSaidaAba2Subnivel2.getAttribute("value");
			
			System.out.println("VALORES ABA2 - SUBNIVEL 2");
			System.out.println("CampoBCBAba2Sunivel2: "+ campoBCBAba2Sunivel2);
			System.out.println("CampoConfiguracaoAba2Sunivel2: "+ campoConfiguracaoAba2Sunivel2);
			System.out.println("CampoSaidaAba2Sunivel2: "+ campoSaidaAba2Sunivel2);
			
			
			sucesso = new ArrayList<Boolean>();
				sucesso.add(campoBCBAba2Sunivel2.contains(campo1));
				sucesso.add(campoConfiguracaoAba2Sunivel2.contains(campo2));
				sucesso.add(campoSaidaAba2Sunivel2.contains(campo3));
		}
		
		
		
		
		System.out.println("_________________________________________________________________");
		System.out.println("------------------------*** Terceira Aba ***----------------------");
		System.out.println("_________________________________________________________________");
		System.out.println("---------------*********Primer Subnivel*******----------------");
		System.out.println("---------------*********Relacionamento *******---------------");
		System.out.println("");
			
			
		aba3.click();
		sleep(1000);
		
		if (tp1) {
			primerNivelAba3.click();
			sleep(1000);
		}else if (tq1) {
			primerNivelAba3TQ1.click();
			sleep(1000);
		}
		
		
		if (tp1) {
			System.out.println("OBTENGO DATOS DE ABA 2 - SUBNIVEL 1");
			String campoBCBAba3Sunivel1 = camposBCBAba3Subnivel1.getAttribute("value");
			String campoConfiguracaoAba3Sunivel1 = campoConfiguracaoAba3Subnivel1.getAttribute("value");
			String campoSaidaAba3Sunivel1 = camposSaidaAba3Subnivel1.getAttribute("value");
			
			System.out.println("VALORES ABA3 - SUBNIVEL 1");
			System.out.println("CampoBCBAba3Sunivel1: "+ campoBCBAba3Sunivel1);
			System.out.println("CampoConfiguracaoAba3Sunivel1: "+ campoConfiguracaoAba3Sunivel1);
			System.out.println("CampoSaidaAba3Sunivel1: "+ campoSaidaAba3Sunivel1);
			
			sucesso = new ArrayList<Boolean>();
				sucesso.add(campoBCBAba3Sunivel1.contains(campo1));
				sucesso.add(campoConfiguracaoAba3Sunivel1.contains(campo2));
				sucesso.add(campoSaidaAba3Sunivel1.contains(campo3));
		}else if (tq1) {
			System.out.println("OBTENGO DATOS DE ABA 2 - SUBNIVEL 1");
			String campoBCBAba3Sunivel1 = camposBCBAba3Subnivel1TQ1.getAttribute("value");
			String campoConfiguracaoAba3Sunivel1 = campoConfiguracaoAba3Subnivel1TQ1.getAttribute("value");
			String campoSaidaAba3Sunivel1 = camposSaidaAba3Subnivel1TQ1.getAttribute("value");
			
			System.out.println("VALORES ABA3 - SUBNIVEL 1");
			System.out.println("CampoBCBAba3Sunivel1: "+ campoBCBAba3Sunivel1);
			System.out.println("CampoConfiguracaoAba3Sunivel1: "+ campoConfiguracaoAba3Sunivel1);
			System.out.println("CampoSaidaAba3Sunivel1: "+ campoSaidaAba3Sunivel1);
			
			sucesso = new ArrayList<Boolean>();
				sucesso.add(campoBCBAba3Sunivel1.contains(campo1));
				sucesso.add(campoConfiguracaoAba3Sunivel1.contains(campo2));
				sucesso.add(campoSaidaAba3Sunivel1.contains(campo3));
		}else {
			System.out.println("OBTENGO DATOS DE ABA 2 - SUBNIVEL 1");
			String campoBCBAba3Sunivel1 = camposBCBAba3Subnivel1.getAttribute("value");
			String campoConfiguracaoAba3Sunivel1 = campoConfiguracaoAba3Subnivel1.getAttribute("value");
			String campoSaidaAba3Sunivel1 = camposSaidaAba3Subnivel1.getAttribute("value");
			
			System.out.println("VALORES ABA3 - SUBNIVEL 1");
			System.out.println("CampoBCBAba3Sunivel1: "+ campoBCBAba3Sunivel1);
			System.out.println("CampoConfiguracaoAba3Sunivel1: "+ campoConfiguracaoAba3Sunivel1);
			System.out.println("CampoSaidaAba3Sunivel1: "+ campoSaidaAba3Sunivel1);
			
			sucesso = new ArrayList<Boolean>();
				sucesso.add(campoBCBAba3Sunivel1.contains(campo1));
				sucesso.add(campoConfiguracaoAba3Sunivel1.contains(campo2));
				sucesso.add(campoSaidaAba3Sunivel1.contains(campo3));
		}
		
		
		
		if (tp1) {
			segundoNivelAba3.click();
			sleep(1000);
		}else if (tq1) {
			segundoNivelAba3TQ1.click();
			sleep(1000);
		}
		
		
		System.out.println("");
		
		if (tp1) {
			System.out.println("OBTENGO DATOS DE ABA 3 - SUBNIVEL 2");
			String campoBCBAba3Sunivel2 = camposBCBAba3Subnivel2.getAttribute("value");
			String campoConfiguracaoAba3Sunivel2 = campoConfiguracaoAba3Subnivel2.getAttribute("value");
			String campoSaidaAba3Sunivel2 = camposSaidaAba3Subnivel2.getAttribute("value");
			
			System.out.println("VALORES ABA3 - SUBNIVEL 2");
			System.out.println("CampoBCBAba3Sunivel2: "+ campoBCBAba3Sunivel2);
			System.out.println("CampoConfiguracaoAba3Sunivel2: "+ campoConfiguracaoAba3Sunivel2);
			System.out.println("CampoSaidaAba3Sunivel2: "+ campoSaidaAba3Sunivel2);
			
			
			sucesso = new ArrayList<Boolean>();
				sucesso.add(campoBCBAba3Sunivel2.contains(campo12));
				sucesso.add(campoConfiguracaoAba3Sunivel2.contains(campo22));
				sucesso.add(campoSaidaAba3Sunivel2.contains(campo23));
		}else if (tq1) {
			System.out.println("OBTENGO DATOS DE ABA 3 - SUBNIVEL 2");
			String campoBCBAba3Sunivel2 = camposBCBAba3Subnivel2TQ1.getAttribute("value");
			String campoConfiguracaoAba3Sunivel2 = campoConfiguracaoAba3Subnivel2TQ1.getAttribute("value");
			String campoSaidaAba3Sunivel2 = camposSaidaAba3Subnivel2TQ1.getAttribute("value");
			
			System.out.println("VALORES ABA3 - SUBNIVEL 2");
			System.out.println("CampoBCBAba3Sunivel2: "+ campoBCBAba3Sunivel2);
			System.out.println("CampoConfiguracaoAba3Sunivel2: "+ campoConfiguracaoAba3Sunivel2);
			System.out.println("CampoSaidaAba3Sunivel2: "+ campoSaidaAba3Sunivel2);
			
			
			sucesso = new ArrayList<Boolean>();
				sucesso.add(campoBCBAba3Sunivel2.contains(campo12));
				sucesso.add(campoConfiguracaoAba3Sunivel2.contains(campo22));
				sucesso.add(campoSaidaAba3Sunivel2.contains(campo23));
		}else {
			System.out.println("OBTENGO DATOS DE ABA 3 - SUBNIVEL 2");
			String campoBCBAba3Sunivel2 = camposBCBAba3Subnivel2.getAttribute("value");
			String campoConfiguracaoAba3Sunivel2 = campoConfiguracaoAba3Subnivel2.getAttribute("value");
			String campoSaidaAba3Sunivel2 = camposSaidaAba3Subnivel2.getAttribute("value");
			
			System.out.println("VALORES ABA3 - SUBNIVEL 2");
			System.out.println("CampoBCBAba3Sunivel2: "+ campoBCBAba3Sunivel2);
			System.out.println("CampoConfiguracaoAba3Sunivel2: "+ campoConfiguracaoAba3Sunivel2);
			System.out.println("CampoSaidaAba3Sunivel2: "+ campoSaidaAba3Sunivel2);
			
			
			sucesso = new ArrayList<Boolean>();
				sucesso.add(campoBCBAba3Sunivel2.contains(campo12));
				sucesso.add(campoConfiguracaoAba3Sunivel2.contains(campo22));
				sucesso.add(campoSaidaAba3Sunivel2.contains(campo23));
		}
			
		System.out.println(sucesso);
		
		return sucesso;
	}

	public ArrayList<Boolean> resultadoFinalParte1() {
		sleep(3000);
		verCamposSaida.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarCamposSaida.click();
		sleep(3000);
		waitExpectElement(criarAdicionarCamposSaida);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		camposSaidaAba.click();
		sleep(2000);
		camposSaidaValor.click();
		sleep(2000);
		
		camposSaidaAba.click();
		sleep(2000);
		camposSaidaValor.click();
		sleep(2000);
		
		camposSaidaNome.sendKeys("Aba 1");
		sleep(2000);
		
		criarAdicionarCamposSaida.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"Campo de saída criado com sucesso\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		fecharEM2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarCamposSaida.click();
		sleep(3000);
		waitExpectElement(criarAdicionarCamposSaida);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		camposSaidaAba.click();
		sleep(2000);
		camposSaidaValor.click();
		sleep(2000);
		
		camposSaidaHieraquia.click();
		sleep(2000);
		camposSaidaValor.click();
		sleep(2000);
		
		camposSaidaGrupo.click();
		sleep(2000);
		camposSaidaValor.click();
		sleep(2000);
		
		camposSaidaSubNivel.click();
		sleep(2000);
		camposSaidaSubnivel2.click();
		sleep(2000);
		
		camposSaidaNome.sendKeys("Subnivel 2(Aba 1)");
		sleep(2000);
		
		criarAdicionarCamposSaida.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		mensaje = driver.findElements(By.xpath("//span[contains(text(),\"Campo de saída criado com sucesso\")]")).size();
		
		sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		fecharEM2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		fechar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		return sucesso;
	}
	
	public ArrayList<Boolean> resultadoFinalParte2() {
		
		calculator.click();
		sleep(3000);
		waitExpectElement(resultadoFinal);
		sleep(6000);
	//	waitExpectXpath("//button[text()=\"Sim\"]");
	//	WebElement btnSeguirBloqueo = driver.findElement(By.xpath("//button[text()=\"Sim\"]"));
		sleep(1000);
	//	btnSeguirBloqueo.click();
		sleep(2000);
		resultadoFinal.click();
		sleep(9000);

		adicionarConfiguracao.click();
		sleep(3000);
		
		nomedoResultado.sendKeys("Resultado Final 1");
		sleep(3000);
		
		
		actionsMoveToElementElement(camposSaidaBCB);
		sleep(3000);
		
		camposSaidaBCB.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
//		sleep(2000);
//		camposSaidaBCB.click();
//		sleep(2000);
		
		attributeToBeXpath("//div[@class=\"column-wrapper second\"]/div/div","class", "animation-wrapper show");
		sleep(4000);
		
		dobleClickElement(selectCampoSaidaAba1OPC1);
		sleep(3000);
	
		caixaFormula.sendKeys("+");
		sleep(9000);
		
		dobleClickElement(selectCampoSaidaAba1OPC2);
		sleep(3000);
		
		criar.click();
		sleep(5000);
		
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"Configuração de Resultado inserido com sucesso\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		sleep(9000);
		fechar.click();
		sleep(2000);
		
		return sucesso;
	}
	//si funciona AQUI MUESTRA EL CUADRO DE EXTENDER TIEMPO
	public ArrayList<Boolean>  resultadoDoAbaParte1() {
		calculator.click();
		sleep(1000);
		waitExpectElement(resultadodDoAba);
		sleep(2000);
		resultadodDoAba.click();
		sleep(1000);
		
		
		adicionarAbas.click();
		sleep(1000);
		
		configuracaoAba.click();
		sleep(1000);
		opcAba2.click();
		sleep(1000);
		
		
		actionsMoveToElementElement(camposSaidaBCB);
		sleep(2000);
		
		camposSaidaBCB.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		camposSaidaBCB.click();
		sleep(2000);
		
		attributeToBeXpath("//div[@class=\"column-wrapper second\"]/div/div","class", "animation-wrapper show");
		sleep(2000);
		
		dobleClickElement(selectCampoSaidaAba1OPC1);
		sleep(1000);
	
		caixaFormula.sendKeys("*");
		sleep(2000);
		
		dobleClickElement(selectCampoSaidaAba1OPC2);
		sleep(1000);
		
		sleep(5000);
		criar.click();
		sleep(4000);
		
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"Configuração de Resultado inserido com sucesso\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		sleep(9000);
		fechar.click();
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		nao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(executar);
		sleep(4000);
		
		mensaje = driver.findElements(By.xpath("//span[contains(text(),\"A configuração de hierarquia foi salva\")]")).size();
		
		sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}
	
//	public void ejecutarFinal() {
//		boolean tc2 = false;
//		String url = driver.getCurrentUrl();
//		if (url.contains("tc2")) {
//			tc2 = true;
//		}
//		
//		//COMENTAR DESPUES PORFAVOR
//		sleep(2000);
//		configuracoes.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		configuracaoDaConsolidacao.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		String idConfiguracaoExecutar = idObter5();
//		
//		pesquisar.sendKeys(idConfiguracaoExecutar);
//		//pesquisar.sendKeys("1171");
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracaoExecutar+"\"]/div[1]/div"));
//		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracaoExecutar+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
//		sleep(2000);
//		
//		menu.click();
//		sleep(1000);
//		editar.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		waitExpectElement(executar);
//		sleep(2000);
//		
//	//HASTA AQUI
//
//		
//		sleep(2000);
//		executar.click();
//		sleep(3000);
//		waitExpectElement(executarM);
//		sleep(2000);
//		executarM.click();
//		
//		sleep(1000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		
//		periodo.click();
//		sleep(3000);
//		paginaAnterior.click();
//		sleep(2000);
//		
//		if (tc2) {
//			ano2019.click();
//			sleep(1000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
//			nov.click();
//			sleep(1000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
//			
//			m1.click(); //OJO CORREGIR PARA TC2
//		}else {
//			ano2016.click();
//			sleep(1000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
//			jan.click();
//			sleep(1000);
//			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//			sleep(2000);
//			m1.click();
//		}
//		
//		sleep(2000);
//		execucaoAnalitica.click();
//		sleep(1000);
//		
//		executarB.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		waitExpectElement(gravar);
//		sleep(3000);
//		
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(3000);
//		waitExpectElement(abrirHierarquia1);
//		sleep(3000);
//	}
//	
//	public ArrayList<Boolean> relacionamentoFinalyAbrirHierarquiaGrupo() {
//		boolean tc2 = false;
//		boolean tq1 = false;
//		boolean tp1 = false;
//		String url = driver.getCurrentUrl();
//		
//		if (url.contains("tc2")) {
//			tc2 = true;
//		}
//		if (url.contains("tq1")) {
//			tq1 = true;
//		}
//		if (url.contains("tp1")) {
//			tp1 = true;
//		}
//		
//		
//		abrirHierarquia1.click();
//		sleep(1000);
//		
//		abrirGrupo1.click();
//		sleep(1000);
//		
//		
//		System.out.println("_________________________________________________________________");
//		System.out.println("----------------------*** Primera Aba ***----------------------");
//		System.out.println("");
//		
//			verSub1Aba1.click();
//			sleep(1000);
//			
//			String campoSaida1Sub1Aba1 = verCampoSaida1Sub1Aba1.getText();
//			System.out.println("Subnivel 1 - Aba 1: ");
//			System.out.println("campo Saida1 Sub1 Aba1: "+campoSaida1Sub1Aba1 );
//			System.out.println("");
//			
//			verSub2Aba1.click();
//			sleep(1000);
//			
//			String campoSaida1Sub2Aba1 = verCampoSaida1Sub2Aba1.getText();
//			System.out.println("Subnivel 2 - Aba 1: ");
//			System.out.println("campo Saida1 Sub2 Aba1: "+campoSaida1Sub2Aba1 );
//		
//		
//			String totalizadorGrupo1Aba1 = verTotalizadorGrupo1Aba1.getText();
//			System.out.println("Totalizador: ");
//			System.out.println("Totalizador Grupo1 - Aba1: "+totalizadorGrupo1Aba1 );
//			System.out.println("");
//			
//			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
//				sucesso.add(campoSaida1Sub1Aba1.contains("1.000,00"));
//				sucesso.add(campoSaida1Sub2Aba1.contains("1.000,00"));
//				sucesso.add(totalizadorGrupo1Aba1.contains("1.000,00"));
//			
//			verSub1Aba1.click();
//			sleep(1000);
//			verSub2Aba1.click();
//			sleep(1000);
//			
//		System.out.println("_________________________________________________________________");
//		System.out.println("----------------------*** Segunda Aba ***----------------------");
//		System.out.println("");	
//		
//			verSub1Aba2.click();
//			sleep(1000);
//			
//			String campoSaida1Sub1Aba2 = verCampoSaida1Sub1Aba2.getText();
//			System.out.println("Subnivel 1 - Aba 2: ");
//			System.out.println("campo Saida1 Sub1 Aba2: "+campoSaida1Sub1Aba2 );
//			System.out.println("");
//			
//			verSub2Aba2.click();
//			sleep(1000);
//			
//			String campoSaida1Sub2Aba2 = verCampoSaida1Sub2Aba2.getText();
//			System.out.println("Subnivel 2 - Aba 2: ");
//			System.out.println("campo Saida1 Sub2 Aba2: "+campoSaida1Sub2Aba2 );
//		
//		
//			String totalizadorGrupo1Aba2 = verTotalizadorGrupo1Aba2.getText();
//			System.out.println("Totalizador: ");
//			System.out.println("Totalizador Grupo1 - Aba2: "+totalizadorGrupo1Aba2 );
//			System.out.println("");
//			
//			sucesso = new ArrayList<Boolean>();
//				sucesso.add(campoSaida1Sub1Aba2.contains("2.000,00"));
//				sucesso.add(campoSaida1Sub2Aba2.contains("2.000,00"));
//				sucesso.add(totalizadorGrupo1Aba2.contains("2.000,00"));
//			
//			verSub1Aba2.click();
//			sleep(1000);
//			verSub2Aba2.click();
//			sleep(1000);
//	
//		System.out.println("_________________________________________________________________");
//		System.out.println("----------------------*** Tercera Aba ***----------------------");
//		System.out.println("");	
//		
//			verSub1Aba3.click();
//			sleep(1000);
//			
//			String campoSaida1Sub1Aba3 = verCampoSaida1Sub1Aba3.getText();
//			System.out.println("Subnivel 1 - Aba 3: ");
//			System.out.println("campo Saida1 Sub1 Aba3: "+campoSaida1Sub1Aba3 );
//			System.out.println("");
//			
//			verSub2Aba3.click();
//			sleep(1000);
//			
//			String campoSaida1Sub2Aba3 = verCampoSaida1Sub2Aba3.getText();
//			System.out.println("Subnivel 2 - Aba 3: ");
//			System.out.println("campo Saida1 Sub2 Aba3: "+campoSaida1Sub2Aba3 );
//		
//		
//			String totalizadorGrupo1Aba3 = verTotalizadorGrupo1Aba3.getText();
//			System.out.println("Totalizador: ");
//			System.out.println("Totalizador Grupo1 - Aba3: "+totalizadorGrupo1Aba3 );
//			System.out.println("");
//			
//			sucesso = new ArrayList<Boolean>();
//				sucesso.add(campoSaida1Sub1Aba3.contains("1.000,00"));
//				sucesso.add(campoSaida1Sub2Aba3.contains("1.000,00"));
//				sucesso.add(totalizadorGrupo1Aba3.contains("1.000,00"));
//			
//			verSub1Aba3.click();
//			sleep(1000);
//			verSub2Aba3.click();
//			sleep(1000);
//		
//		
//		System.out.println("_________________________________________________________________");
//		System.out.println("----------------------*** RESULTADO FINAL 1***----------------------");
//		System.out.println("");
//			String verResultFinal = verResultadoFinal.getText();
//			System.out.println("Resultado Final ");
//			System.out.println("resultado Final 1: "+verResultFinal );
//			System.out.println("");
//		
//			sucesso = new ArrayList<Boolean>();
//				sucesso.add(verResultFinal.contains("2.000,00"));
//			
//				
//		System.out.println("_________________________________________________________________");
//		System.out.println("----------------------*** TOTALIZADOR ABA 2 ***----------------------");
//		System.out.println("");
//		
//			String verTotalizadorAba2 = totalizadorAba2.getText();
//			System.out.println("Totalizador Aba 2 ");
//			System.out.println("totalizador Aba2: "+verTotalizadorAba2 );
//			System.out.println("");
//		
//			sucesso = new ArrayList<Boolean>();
//				sucesso.add(verTotalizadorAba2.contains("1.000.000,00"));		
//		
//		System.out.println(sucesso);
//		
//		return sucesso;
//	}
//	
//	public ArrayList<Boolean> excluirConfiguracoes2() {
//		//EXCLUIR CONFIGURACOES
//
//		sleep(2000);
//		biblioteca.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		System.out.println("*******EXCLUIR CONFIGURACOES 2************");
//		System.out.println("");
//		
////		sleep(2000);
////		configuracoes.click();
////		sleep(3000);
////		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
////		sleep(2000);
////		configuracaoDaConsolidacao.click();
////		sleep(3000);
////		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
////		sleep(2000);
//		
//		
//		String idConfiguracao2 = idObter5();
//		System.out.println("");
//		System.out.println("*******EXCLUIR CONFIGURACOES************");
//		System.out.println("OBTER 5:" + idConfiguracao2);
//		System.out.println("");
//		
//		
//		pesquisar.sendKeys(idConfiguracao2);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao2+"\"]/div[1]/div"));
//		WebElement lixeiraC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
//		sleep(2000);
//		
//		menu.click();
//		sleep(1000);
//		lixeiraC.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		waitExpectElement(simLexeira);
//		sleep(2000);
//		
//		simLexeira.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
//		sleep(2000);
//		
//		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"A Configuração de Hierarquia foi enviada para a Lixeira\")]")).size();
//		System.out.println(exclucao);
//		
//		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
//		
//		if (exclucao > 0) {
//			sucesso.add(true);
//			
//		}else {
//			sucesso.add(false);
//		}
//		
//		pastaLexeiraC.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		pesquisar.sendKeys(idConfiguracao2);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(4000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao2+"\"]/div[1]/div"));
//		WebElement excluirC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
//		
//		menu.click();
//		sleep(1000);
//		excluirC.click();
//		sleep(6000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		simExcluir.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
//		sleep(2000);
//		
//		return sucesso;
//	}
//	
//	public ArrayList<Boolean> excluirHierarquia2() {
//		//EXCLUIR HIERARQUIA
//		System.out.println("*******EXCLUIR HIERARQUIA 2************");
//		System.out.println("");
//		
//		sleep(2000);
//		hierarquias.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		hierarquiaConfiguracao.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		String idHierarquia2 = idObter4();
//		//String idHierarquia = "1100";
//		System.out.println("");
//		System.out.println("*******EXCLUIR HIERARQUIA************");
//		System.out.println("OBTER 4:" + idHierarquia2);
//		System.out.println("");
//		
//		
//		pesquisar.sendKeys(idHierarquia2);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia2+"\"]/div[1]/div"));
//		WebElement lixeiraH = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
//		
//		menu.click();
//		sleep(1000);
//		lixeiraH.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		waitExpectElement(simLexeira);
//		sleep(2000);
//		
//		simLexeira.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
//		sleep(2000);
//		
//		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"A Configuração de Hierarquia foi enviada para a Lixeira\")]")).size();
//		System.out.println(exclucao);
//		
//		
//		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
//		
//		if (exclucao>0) {
//			sucesso.add(true);
//			
//		}else {
//			sucesso.add(false);
//		}
//		
//		
//		
//		pastaLexeiraH.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		pesquisar.sendKeys(idHierarquia2);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(4000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia2+"\"]/div[1]/div"));
//		WebElement excluirH = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
//		sleep(2000);
//		
//		menu.click();
//		sleep(1000);
//		excluirH.click();
//		sleep(6000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		simExcluir.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		//waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
//		sleep(2000);
//		
//		return sucesso;
//	}
//	
//	public ArrayList<Boolean> excluirConfiguracoes1() {
//		//EXCLUIR CONFIGURACOES
//		System.out.println("*******EXCLUIR CONFIGURACOES 1************");
//		System.out.println("");
//		
//		sleep(2000);
//		configuracoes.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		configuracaoDaConsolidacao.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		String idConfiguracao1 = idObter3();
//		System.out.println("");
//		System.out.println("*******EXCLUIR CONFIGURACOES************");
//		System.out.println("OBTER 3:" + idConfiguracao1);
//		System.out.println("");
//		
//		
//		pesquisar.sendKeys(idConfiguracao1);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao1+"\"]/div[1]/div"));
//		WebElement lixeiraC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
//		sleep(2000);
//		
//		menu.click();
//		sleep(1000);
//		lixeiraC.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		waitExpectElement(simLexeira);
//		sleep(2000);
//		
//		simLexeira.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
//		sleep(2000);
//		
//		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"A Configuração de Hierarquia foi enviada para a Lixeira\")]")).size();
//		System.out.println(exclucao);
//		
//		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
//		
//		if (exclucao > 0) {
//			sucesso.add(true);
//			
//		}else {
//			sucesso.add(false);
//		}
//		
//		pastaLexeiraC.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		pesquisar.sendKeys(idConfiguracao1);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(4000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao1+"\"]/div[1]/div"));
//		WebElement excluirC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idConfiguracao1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
//		
//		menu.click();
//		sleep(1000);
//		excluirC.click();
//		sleep(6000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		simExcluir.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
//		sleep(2000);
//		
//		return sucesso;
//	}
//	
//	public ArrayList<Boolean> excluirHierarquia1() {
//		//EXCLUIR HIERARQUIA
//		System.out.println("*******EXCLUIR HIERARQUIA 1************");
//		System.out.println("");
//		
//		sleep(2000);
//		hierarquias.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		hierarquiaConfiguracao.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		String idHierarquia1 = idObter2();
//		//String idHierarquia = "1100";
//		System.out.println("");
//		System.out.println("*******EXCLUIR HIERARQUIA************");
//		System.out.println("OBTER 1:" + idHierarquia1);
//		System.out.println("");
//		
//		
//		pesquisar.sendKeys(idHierarquia1);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//
//		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia1+"\"]/div[1]/div"));
//		WebElement lixeiraH = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
//		
//		menu.click();
//		sleep(1000);
//		lixeiraH.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		waitExpectElement(simLexeira);
//		sleep(2000);
//		
//		simLexeira.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
//		sleep(2000);
//		
//		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"A Configuração de Hierarquia foi enviada para a Lixeira\")]")).size();
//		System.out.println(exclucao);
//		
//		
//		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
//		
//		if (exclucao > 0) {
//			sucesso.add(true);
//			
//		}else {
//			sucesso.add(false);
//		}
//		
//		
//		
//		pastaLexeiraH.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		pesquisar.sendKeys(idHierarquia1);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(4000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia1+"\"]/div[1]/div"));
//		WebElement excluirH = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idHierarquia1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
//		sleep(2000);
//		
//		menu.click();
//		sleep(1000);
//		excluirH.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		simExcluir.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
//		sleep(2000);
//		
//		return sucesso;
//	}
//	

}
