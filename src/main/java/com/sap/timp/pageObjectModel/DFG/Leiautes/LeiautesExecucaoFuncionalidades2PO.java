package com.sap.timp.pageObjectModel.DFG.Leiautes;

import java.rmi.server.Skeleton;
import java.util.ArrayList;

import javax.net.ssl.SSLKeyException;

import org.apache.commons.exec.ExecuteWatchdog;
import org.apache.maven.profiles.AlwaysOnActivation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;

public class LeiautesExecucaoFuncionalidades2PO extends TestBaseSteven{
	
	
	
	//Leiaute
	@FindBy(xpath = "//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]")
	public WebElement fecharMensagem;
	
	@FindBy(xpath = "//div[@class=\"layoutsFolders-wrapper\"]/div/div[@data-id=\"-1\"]")
	public WebElement raiz;
	
	@FindBy(xpath = "//div[@class=\"base-pagination-wrapper\"]/div[contains(@class,\"icon-right\") and @tabindex=\"0\"][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//div[@class=\"base-pagination-wrapper\"]/div[contains(@class,\"icon-left\") and @tabindex=\"0\"][1]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[contains(text(),\"Nov\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nome;

	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement tipo;

	@FindBy(xpath = "//li[text()=\"ALTER E-SOCIAL S1200\"]")
	public WebElement tipoO;
	
	@FindBy(xpath = "//div[@id=\"inputStructureParent\"]/div/div/div[2]")
	public WebElement grupoEstrutura;
	
	@FindBy(xpath = "//li[text()=\"Ajuste\"][1]")
	public WebElement grupoEstruturaO;
	
	@FindBy(xpath = "//li[text()=\"Ajustes\"][1]")
	public WebElement grupoEstruturaTP1O;
	
	@FindBy(xpath = "//div[@id=\"inputStructureChild\"]/div/div/div[2]")
	public WebElement estrutura;
	
	@FindBy(xpath = "//div[@id=\"18\"]/div/label/span")
	public WebElement estruturaO;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Versão do Leiaute\")]")
	public WebElement versao;
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//span[text()=\"Adicionar bloco\"]")
	public WebElement adicionarBloco;
	
	@FindBy(xpath = "//button[text()=\"Adicionar registro\"]")
	public WebElement adicionarRegistro;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\" and @tabindex=\"0\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//*[@id=\"toolbarSecund\"]/div/ul/li[2]/button")
	public WebElement buscarRegra;
	
	@FindBy(xpath = "//*[@id=\"toolbarSecund\"]/div/ul/li[1]/button")
	public WebElement buscarRegra2;
	
	@FindBy(xpath = "//span[text()=\"Regras de Negócio\"]")
	public WebElement regrasNegocioB;
	
	// Regra Negocio en DFG
	
	
	@FindBy(xpath = "//div[@class=\"block-select\"]/div/div/div[2]")
	public WebElement blocoR;
	
	@FindBy(xpath = "//li[text()=\"Bloco 1 (Regras de Negócio)\"]")
	public WebElement blocoRO;
	
	@FindBy(xpath = "//div[@class=\"record-select\"]/div/div/div[2]")
	public WebElement registroR;
	
	@FindBy(xpath = "//li[text()=\"Registro 1\"]")
	public WebElement registroRO;
	
	@FindBy(xpath = "//div[@class=\"field-select\"]/div/div/div[2]")
	public WebElement campo;
	
	@FindBy(xpath = "//li[text()=\"Parametro Manual 1\"]")
	public WebElement campoRO;
	
	@FindBy(xpath = "//div[@class=\"rule-select\"]/div/div/div[2]")
	public WebElement regraR;
	
	@FindBy(xpath = "//li[text()=\"Teste Automatizado Regra Leiaute\"]")
	public WebElement regraRO;

	
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome do Bloco\")]")
	public WebElement nomeBloco;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome do Registro\")]")
	public WebElement nomeRegistro;
	
	@FindBy(xpath = "//span[text()=\"Ajustes Fiscais\"][1]")
	public WebElement ajustesFiscais;
	
	@FindBy(xpath = "//span[text()=\"Campos Especiais\"][1]")
	public WebElement camposEspeciais;
	
	@FindBy(xpath = "//span[text()=\"Ajustes\"][1]")
	public WebElement ajustes;
	
	@FindBy(xpath = "//li[@data-hananame=\"AJUSTE_VALUE\"]")
	public WebElement valorAjuste;
	
	@FindBy(xpath = "//li[@data-columntype=\"ManualParamColumn\"]")
	public WebElement parametroManual;
	
	@FindBy(xpath = "//div[@id=\"dfg-ParamManual\"]/div[1]/div[2]/div/div/input")
	public WebElement nomeParametro;
	
	@FindBy(xpath = "//div[@class=\"length inputs\"]/div/div/input")
	public WebElement comprimento;
	

	
	@FindBy(xpath = "//span[text()=\"Mapeamento do SPED\"]")
	public WebElement mapeamentoSPED;
	
	@FindBy(xpath = "//div[@class=\"block-select\"]/div/div/div[2]")
	public WebElement selecionarBloco;
	
	@FindBy(xpath = "//li[text()=\"Bloco 1\"]")
	public WebElement selecionarBlocoO;
	
	@FindBy(xpath = "//div[@class=\"record-select\"]/div/div/div[2]")
	public WebElement selecionarRegistro;
	
	@FindBy(xpath = "//li[text()=\"1200\"]")
	public WebElement selecionarRegistroO;
	
	@FindBy(xpath = "//li[contains(text(),\"ajuste\")]")
	public WebElement selecionarValorAjuste;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	
	
	//BRE
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;
	
	@FindBy(xpath = "//span[text()=\"Regras de Negócio\"]")
	public WebElement regraNegocio;
	
	@FindBy(xpath = "//td[@class=\"title-field\"]/div/div/input")
	public WebElement nomeRegra;
	
	@FindBy(xpath = "//td[@class=\"ruletype-field\"]/div/div/div[2]")
	public WebElement tipoRegra;
	
	@FindBy(xpath = "//li[text()=\"Negócio\"]")
	public WebElement tipoRegraO;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div[2]")
	public WebElement componente;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div[2]")
	public WebElement componenteTC2;
	
	@FindBy(xpath = "//li[text()=\"DFG\"]")
	public WebElement componenteO;
	
	@FindBy(xpath = "//td[@class=\"tribute-field\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"00\"]/div/label/span")
	public WebElement tributoO;
	
	@FindBy(xpath = "//td[@class=\"datastructureCategory-field\"]/div/div/div[2]")
	public WebElement grupoEstruturaR;
	
	@FindBy(xpath = "//li[text()=\"Ajuste\"][1]")
	public WebElement grupoEstruturaRO;
	
	@FindBy(xpath = "//li[text()=\"Ajustes\"][1]")
	public WebElement grupoEstruturaROTP1;
	
	@FindBy(xpath = "//td[@class=\"datastructure-field\"]/div/div/div[2]")
	public WebElement estruturaR;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"][1]")
	public WebElement estruturaRO;
	
	@FindBy(xpath = "//td[@class=\"special-field\"]/div/div/div[2]")
	public WebElement caracteristica;
	
	@FindBy(xpath = "//li[text()=\"Toda a Obrigação\"]")
	public WebElement caracterisiticaO;
	
	@FindBy(xpath = "//td[@class=\"layout-field\"]/div/div/div[2]")
	public WebElement leiauteR;
	
	@FindBy(xpath = "//td[@class=\"layoutVersion-field\"]/div/div/div[2]")
	public WebElement versaoLeiauteR;
	
	@FindBy(xpath = "//li[text()=\"1.0\"]")
	public WebElement versaoLeiauteRO;
	
	@FindBy(xpath = "//td[@class=\"EffectiveDateFrom\"]/div/div/input")
	public WebElement dataVigenciaR;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarCaminho;
	
	@FindBy(xpath = "//input[@placeholder=\"Código\"]")
	public WebElement codigo;
	
	@FindBy(xpath = "//input[@placeholder=\"Embasamento\"]")
	public WebElement embasamento;
	
	@FindBy(xpath = "//div[@class=\"select-one\"]/div/div[2]")
	public WebElement condicao1;
	
	@FindBy(xpath = "//li[contains(text(),\"Valor\")]")
	public WebElement condicao1O;
	
	@FindBy(xpath = "//div[@class=\"select-three\"]/div/div/div/div/div[2]")
	public WebElement condicao2;
	
	@FindBy(xpath = "//div[contains(text(),\"<\")]")
	public WebElement condicao2O;
	
	@FindBy(xpath = "//div[@class=\"value-one\"]/div/div[1]/input")
	public WebElement condicao3;

	
	@FindBy(xpath = "//div[@class=\"action-section\"]/div[2]/div/div/div/input")
	public WebElement acoes;
	
	@FindBy(xpath = "//div[@class=\"action-section\"]/div[2]/div[2]/div/div[1]/div/div/div/div/div/input")
	public WebElement acoesTQ1;
	

	@FindBy(xpath = "//button[text()=\"Editar\"]")
	public WebElement editar;
	
	
	
	//DFG Edicao
	
	@FindBy(xpath = "//div[@block-id=\"1\" and @class=\"block-wrapper\"]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nomeBloco2;
	
	@FindBy(xpath = "//div[@block-id=\"2\" and @class=\"block-wrapper\"]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nomeBloco3;
	
	@FindBy(xpath = "//div[@block-id=\"3\" and @class=\"block-wrapper\"]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nomeBloco4;
	
	@FindBy(xpath = "//div[@block-id=\"4\" and @class=\"block-wrapper\"]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nomeBloco5;
	
	@FindBy(xpath = "//div[@block-id=\"5\" and @class=\"block-wrapper\"]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nomeBloco6;
	
	@FindBy(xpath = "//div[@block-id=\"6\" and @class=\"block-wrapper\"]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nomeBloco7;
	
	
	@FindBy(xpath = "//div[@block-id=\"1\" and @class=\"record-wrapper\"]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nomeRegistro2;
	
	@FindBy(xpath = "//div[@block-id=\"2\" and @class=\"record-wrapper\"]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nomeRegistro3;
	
	@FindBy(xpath = "//div[@block-id=\"3\" and @class=\"record-wrapper\"]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nomeRegistro4;
	
	@FindBy(xpath = "//div[@block-id=\"4\" and @class=\"record-wrapper\"]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nomeRegistro5;
	
	@FindBy(xpath = "//div[@block-id=\"5\" and @class=\"record-wrapper\"]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nomeRegistro6;
	
	@FindBy(xpath = "//div[@block-id=\"6\" and @class=\"record-wrapper\"]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nomeRegistro7;
	
	
	@FindBy(xpath = "//div[@block-id=\"1\" and @class=\"record-wrapper\"]/div[2]/div")
	public WebElement droppable2;
	
	@FindBy(xpath = "//div[@block-id=\"2\" and @class=\"record-wrapper\"]/div[2]/div")
	public WebElement droppable3;
	
	@FindBy(xpath = "//div[@block-id=\"3\" and @class=\"record-wrapper\"]/div[2]/div")
	public WebElement droppable4;
	
	@FindBy(xpath = "//div[@block-id=\"4\" and @class=\"record-wrapper\"]/div[2]/div")
	public WebElement droppable5;
	
	@FindBy(xpath = "//div[@block-id=\"5\" and @class=\"record-wrapper\"]/div[2]/div")
	public WebElement droppable6;
	
	@FindBy(xpath = "//div[@block-id=\"6\" and @class=\"record-wrapper\"]/div[2]/div")
	public WebElement droppable7;
	
	
	
	//Opções a arrastrar
	
	@FindBy(xpath = "//li[@data-hananame=\"DT_LANC\"]")
	public WebElement dataLancamento;
	
	@FindBy(xpath = "//li[@data-hananame=\"ID_COMPANY\"]")
	public WebElement codigoEmpresa;
	
	@FindBy(xpath = "//li[@data-hananame=\"ID_BRANCH\"]")
	public WebElement codigoFilial;
	
	@FindBy(xpath = "//li[@data-columntype=\"TotalAllColumn\"]")
	public WebElement totalDaForma;
	
	@FindBy(xpath = "//li[@data-columntype=\"RecordCounter\"]")
	public WebElement contadorDoRegistro;
	
	@FindBy(xpath = "//li[@data-columntype=\"BlockTotalColumn\"]")
	public WebElement totalDeBloco;
	
	@FindBy(xpath = "//li[@data-columntype=\"RecordTotalColumn\"]")
	public WebElement totalDeRegistro;
	
	

	
	
	
	//Regras Oculatação
	
	@FindBy(xpath = "//span[text()=\"Regra de Ocultação\"]")
	public WebElement regrasOcultacao;
	
	
	@FindBy(xpath = "//div[@id=\"blockSelect\"]/div/div[1]/div[2]")
	public WebElement blocoRegraOcultacao;
	
	@FindBy(xpath = "//li[contains(text(),\"Bloco 2\") and @id]")
	public WebElement blocoRegraOcultacaoO;
	
	@FindBy(xpath = "//div[@id=\"recordSelect\"]/div/div[1]/div[2]")
	public WebElement registroRegraOcultacao;
	
	@FindBy(xpath = "//li[contains(text(),\"Registro 1\") and @id]")
	public WebElement registroRegraOcultacaoO;
	
	@FindBy(xpath = "//div[@id=\"comboField\"]/div/div[1]/div[2]")
	public WebElement campoRegraOcultacao;
	
	@FindBy(xpath = "//li[contains(text(),\"Valor do ajuste\") and @id]")
	public WebElement campoRegraOcultacaoO;
	
	@FindBy(xpath = "//button[@id=\"filter-button\"]")
	public WebElement filtros;
	
	@FindBy(xpath = "//span[text()=\"Adicionar grupo\"]")
	public WebElement adicionarGrupo;
	
	@FindBy(xpath = "//div[@class=\"iconEdit\"]")
	public WebElement lapizEditar;
	
	@FindBy(xpath = "//input[@value=\"Nome grupo\"]")
	public WebElement nomeGrupo;
	
	@FindBy(xpath = "//li[@class=\"filter-group\"]/span")
	public WebElement expandirGrupo;
	
	@FindBy(xpath = "//li[@class=\"filter-group\"]/div[2]/div/div[1]/div[1]/div/div[2]")
	public WebElement campo1;
	
	@FindBy(xpath = "//li[contains(text(),\"Data de lançamento\")]")
	public WebElement campo1O;
	
	@FindBy(xpath = "//li[@class=\"filter-group\"]/div[2]/div/div[4]/div/div[3]/div/div/input")
	public WebElement campo2;
	
	@FindBy(xpath = "//div[@class=\"hide-value-cb\"]/div[1]/label/span")
	public WebElement esconderRegistro;
	
	@FindBy(xpath = "//div[contains(@class,\"ConditionBuilder\")]/div[3]/button[text()=\"Aplicar\"]")
	public WebElement aplicarRegraOcultacao;
	
	
	//Total de Bloco
	
	@FindBy(xpath = "//div[@class=\"block-select\"]/div/div[2]/div/div[2]")
	public WebElement registroTB;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][3]/div/div/label/span")
	public WebElement registroTBO;
	
	//Total de registro
	
	@FindBy(xpath = "//div[@class=\"base-select-wrapper\"]/div[2]")
	public WebElement registroTR;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][4]/div/div/label/span")
	public WebElement registroTRO;
	

	//Concatenação
	
	@FindBy(xpath = "//span[text()=\"Concatenação\"]")
	public WebElement concatenacao;
	
	@FindBy(xpath = "//li[contains(text(),\"Bloco 6\") and @id]")
	public WebElement blocoConcatenacaoO;
	
	@FindBy(xpath = "//li[contains(text(),\"Registro 1\") and @id]")
	public WebElement registroConcatenacaoO;

	@FindBy(xpath = "//li[contains(text(),\"Código da empresa\") and @id]")
	public WebElement campoConcatenacaoO;
	
	@FindBy(xpath = "//div[@class=\"list-fields\"]/div/div[1]/div/div[1]/div[2]")
	public WebElement campo2C;
	
	@FindBy(xpath = "//li[contains(text(),\"Código da filial\") and @id]")
	public WebElement campo2CO;
	
	@FindBy(xpath = "//div[@class=\"icon-add-concat\"]")
	public WebElement adicionarConcatenacao;
	
	
	
	
	
	
	

	@FindBy(xpath = "//span[contains(@class,\"icon-setting\")]")
	public WebElement configuracoes;
	
	@FindBy(xpath = "//div[@class=\"fileFolders-wrapper\"]/div/div[@data-id=\"-1\"]")
	public WebElement raizArquivos;
	
	@FindBy(xpath = "//div[@class=\"settingFolders-wrapper\"]/div/div[@data-id=\"-1\"]")
	public WebElement raizConfiguracoes;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-icmsipi-calculationBlocks\"]")
	public WebElement blocosApuracao;
	
	
	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement leiauteE;
	
	@FindBy(xpath = "//div[@id=\"inputTimpVersion\"]/div/div/div[2]")
	public WebElement versaoE;
	
	@FindBy(xpath = "//li[text()=\"1.0\"]")
	public WebElement versaoEO;
	
	@FindBy(xpath = "//div[@id=\"inputSelectTax\"]/div/div/div[2]")
	public WebElement tributoE;
	
	@FindBy(xpath = "//li[text()=\"ICMS\" and @id]")
	public WebElement tributoEO;
	
	@FindBy(xpath = "//div[@id=\"inputSelectCompany\"]/div/div/div[2]")
	public WebElement empresaE;
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement empresaEO;
	
	@FindBy(xpath = "//div[@id=\"inputSelectState\"]/div/div/div[2]")
	public WebElement ufE;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement ufEO;
	
	@FindBy(xpath = "//div[@id=\"inputSelectFilial\"]/div/div/div[2]")
	public WebElement filialE;
	
	@FindBy(xpath = "//div[contains(@id,\"0001\")]/div/label/span")
	public WebElement filialEO;

	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigenciaE;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fecharInformacoes;
	
	@FindBy(xpath = "//textarea")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div")
	public WebElement descricaoI;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nomeV;
	
	@FindBy(xpath = "//textarea")
	public WebElement descricaoV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecionar Leiaute\")]")
	public WebElement leiauteV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Versão Leiaute\")]")
	public WebElement versaoV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Tributo\")]")
	public WebElement tributoV;
	
	@FindBy(xpath = "//div[@class=\"inputs company-select\"]/div/div[1]/div/div[1]/div/div[1]")
	public WebElement empresaV;
	
	@FindBy(xpath = "//div[@class=\"inputs uf-select\"]/div/div[1]/div/div[1]/div/div[1]")
	public WebElement ufV;

	@FindBy(xpath = "//div[@class=\"inputs branch-select\"]/div/div[1]/div/div[1]/div/div[1]")
	public WebElement filialV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigenciaV;
	
	//DFG AN3
	
	@FindBy(xpath = "//div[@id=\"executarArquivo\"]/div[3]/div[1]/button")
	public WebElement executar;
	
	@FindBy(xpath = "//div[@id=\"inputState\"]/div/div[1]/div[2]")
	public WebElement ufFilialB;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement ufFilialBO;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-calendar\")]")
	public WebElement calendario;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-leftmenu\") and @tabindex=\"0\"][1]")
	public WebElement atras;
	
	@FindBy(xpath = "//div[text()=\"2016\"]")
	public WebElement ano2016;
	
	@FindBy(xpath = "//div[text()=\"Jan\"]")
	public WebElement jan;
	
	@FindBy(xpath = "//span[text()=\"1M\"]")
	public WebElement m1;
	
	@FindBy(xpath = "//div[@class=\"inputs movementCentralization\"]/label/span")
	public WebElement centralizacao;
	
	@FindBy(xpath = "//ul[@class=\"library-toolbar-items\"]/li[1]/button")
	public WebElement executarB;
	
	@FindBy(xpath = "//div[@id=\"settings-execute\"]/button")
	public WebElement executarConf;
	
	@FindBy(xpath = "//span[text()=\"Visualizar AN3\"]")
	public WebElement visualizarAN3;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement criar;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nomeR;
	
	@FindBy(xpath = "//div[@class=\"rule-input\"]/div/div/div[2]")
	public WebElement regra;
	
	@FindBy(xpath = "//span[text()=\"Atualizar\"]")
	public WebElement atualizar;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-docversion padding-right\")]")
	public WebElement arquivos;
	
	
	@FindBy(xpath = "//div[contains(@class,\"company\")]/div/div/div[2]")
	public WebElement empresaDFG;
	
	@FindBy(xpath = "//li[text()=\"1000\"]")
	public WebElement empresaDFGO;
	
	@FindBy(xpath = "//div[contains(@class,\"branch\")]/div/div/div[2]")
	public WebElement filialDFG;
	
	@FindBy(xpath = "//div[@id=\"0001\"]/div/label/span")
	public WebElement filialDFGO;
	
	
	@FindBy(xpath = "//div[@id=\"toolbarTop\"]/div/div/ul/li[1]/button")
	public WebElement executarDFG;
	
	@FindBy(xpath = "//span[text()=\"Visualizar Arquivos\"]")
	public WebElement visualizarArquivos;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash-layout\"]")
	public WebElement lixeiraDFG;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash_rules\"]")
	public WebElement lixeiraBRE;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash-setting\"]")
	public WebElement lixeiraDFGConf;
	
	
	
	//DFG AN3
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][5]")
	public WebElement dfgAN3;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome\")]")
	public WebElement nomeAN3;
	
	@FindBy(xpath = "//div[@class=\"an3Folders-wrapper\"]/div/div[@data-id=\"-1\"]")
	public WebElement dfgAN3Raiz;
	
	@FindBy(xpath = "//div[@class=\"inputs layout-dfg-select\"]/div/div/div[2]")
	public WebElement leiauteAN3;
	
	@FindBy(xpath = "//div[@class=\"inputs version-select\"]/div/div/div[2]")
	public WebElement versaoAN3;
	
	@FindBy(xpath = "//div[@class=\"inputs setting-dfg-select\"]/div/div/div[2]")
	public WebElement configuracaoAN3;
	
	@FindBy(xpath = "//div[@class=\"inputs rule-select\"]/div/div/div[2]")
	public WebElement regraAN3;
	
	@FindBy(xpath = "//div[@id=\"inputfile\"]/div/div/div[2]")
	public WebElement arquivoAN3;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-public-an3\"]")
	public WebElement publicosAN3;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-my-an3\"]")
	public WebElement meusAN3;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-favorite-an3\"]")
	public WebElement meusFavoritos;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-addfolder\")]")
	public WebElement criarPasta;
	
	@FindBy(xpath = "//div[@class=\"folder-name\"]/div/div/input")
	public WebElement nomePasta;

	@FindBy(xpath = "//div[@class=\"an3Folders-wrapper\"]/div/div/div/div[1]")
	public WebElement expandirPasta;
	
	@FindBy(xpath = "//span[text()=\"Pasta 2\"]")
	public WebElement pasta2;
	
	@FindBy(xpath = "//span[text()=\"Pasta 1\"]")
	public WebElement pasta1;
	
	
	@FindBy(xpath = "//span[@class=\"button-icon icon-font-File-and-Folders icon-folder\"]")
	public WebElement moverPasta;
	
	@FindBy(xpath = "//button[text()=\"Mover\"]")
	public WebElement mover;
	
	@FindBy(xpath = "//div[@class=\"folder-to\"]/div/div/div[2]")
	public WebElement moverPara;
	
	@FindBy(xpath = "//li[text()=\"Pasta 1\"]")
	public WebElement pasta1O;
	
	@FindBy(xpath = "//div[@class=\"an3Folders-wrapper\"]/div/div/div[2]/div/div[1]/div[1]")
	public WebElement expandirPasta1;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-foldersetting\")]")
	public WebElement gerenciarPasta;
	
	
	@FindBy(xpath = "//button[text()=\"Atualizar\"]")
	public WebElement atualizarB;
	
	@FindBy(xpath = "//button[text()=\"Excluir Pasta\"]")
	public WebElement excluirPasta;
	
	@FindBy(xpath = "//span[contains(@class,\"icon-layout\")]")
	public WebElement leiauteAba;
	
	@FindBy(xpath = "//li[text()=\"DCTF\"]")
	public WebElement tipoOTC2;
	
	//execuaçõa verificação dados
	
	@FindBy(xpath = "//span[text()=\"Visualizar Dados\"]")
	public WebElement visualizarDados;
	
	@FindBy(xpath = "//div[@id=\"selector-block\"]/div/div[1]/div[1]/input")
	public WebElement bloco;
	
	@FindBy(xpath = "//li[contains(text(),\"Bloco 1\")]")
	public WebElement blocoO1;
	
	@FindBy(xpath = "//li[contains(text(),\"Bloco 2\")]")
	public WebElement blocoO2;
	
	@FindBy(xpath = "//li[contains(text(),\"Bloco 3\")]")
	public WebElement blocoO3;
	
	@FindBy(xpath = "//li[contains(text(),\"Bloco 4\")]")
	public WebElement blocoO4;
	
	@FindBy(xpath = "//li[contains(text(),\"Bloco 5\")]")
	public WebElement blocoO5;
	
	@FindBy(xpath = "//li[contains(text(),\"Bloco 6\")]")
	public WebElement blocoO6;
	
	@FindBy(xpath = "//li[contains(text(),\"Bloco 7\")]")
	public WebElement blocoO7;
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")]/span/span[text()=\"Visualizar Dados\"]")
	public WebElement abaVisualizarDados;
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")]/span/span[text()=\"Exibir tabela\"]")
	public WebElement abaExibirTabela;
	
	
	@FindBy(xpath = "//div[text()=\"Bloco 3 (Total de Bloco)\"]")
	public WebElement bloco3V;
	
	@FindBy(xpath = "//div[text()=\"Bloco 4 (Total de Registros)\"]")
	public WebElement bloco4V;
	
	@FindBy(xpath = "//div[@class=\"line-paginator\"]/div/div/input")
	public WebElement numeroLinhasBloco3;
	
	@FindBy(xpath = "//div[@class=\"block-paginator\"]/div/div[contains(@class,\"icon-right\")][1]")
	public WebElement siguienteBloco;
	
	@FindBy(xpath = "//div[@class=\"block-paginator\"]/div/div[contains(@class,\"icon-left\")][1]")
	public WebElement primerBloco;
	
	
	public LeiautesExecucaoFuncionalidades2PO() {

		PageFactory.initElements(driver, this);
	}
	

	public ArrayList<Boolean> criar() {
		
		String url = driver.getCurrentUrl();
		
		boolean tp1  = false;
		boolean tc2 = false;
		
		if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tc2")) {
			tc2 = true;
		}
		
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Último Id antes da criação do registro DFG (Raiz): " + ultimoIdAC);

		
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado Leiaute 2");
		sleep(1000);
		actionsMoveToElementElement(versao);
		sleep(1000);
		tipo.click();
		sleep(1000);
		if (tc2 == true) {
			tipoOTC2.click();
		}else {
			tipoO.click();
		}
		
		sleep(1000);
		
		grupoEstrutura.click();
		sleep(1000);
		if (tp1 == true) {
			grupoEstruturaTP1O.click();
		}else {
			grupoEstruturaO.click();
		}
		
		sleep(1000);
		
		estrutura.click();
		sleep(1000);
		estruturaO.click();
		sleep(1000);
		estruturaO.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		dataVigencia.sendKeys("01/01/2013");
		sleep(1000);
		
		versao.sendKeys("1");
		sleep(1000);
		salvar.click();

		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(gravar);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		adicionarBloco.click();
		sleep(2000);
		waitExpectElement(adicionarRegistro);
		sleep(1000);
		adicionarRegistro.click();
		sleep(2000);
		
		nomeBloco.sendKeys("Bloco 1 (Regras de Negócio)");
		sleep(1000);
		nomeRegistro.sendKeys("Registro 1");
		sleep(1000);
		
		
		ajustesFiscais.click();
		sleep(2000);
		ajustes.click();
		sleep(2000);
		
		actionsMoveToElementElement(valorAjuste);
		moveToElement(valorAjuste,driver.findElement(By.xpath("//div[contains(@class,\"ui-droppable\")]")));
		sleep(1000);
		
		ajustesFiscais.click();
		sleep(2000);
		
		camposEspeciais.click();
		sleep(2000);
		
		
		
		actionsMoveToElementElement(parametroManual);
		moveToElement(parametroManual,driver.findElement(By.xpath("//div[contains(@class,\"ui-droppable\")]")));
		sleep(1000);
		
		waitExpectElement(nomeParametro);
		sleep(2000);
		
		nomeParametro.sendKeys("Parametro Manual 1");
		sleep(1000);
		
		comprimento.sendKeys("200");
		
		aplicar.click();
		sleep(3000);
		
		
		
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		
		biblioteca.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Último Id após da criação do registro (Raiz): " + ultimoIdDC);
		
		
		idInserir2(ultimoIdDC);

		int ultimoIdDCD = Integer.valueOf(ultimoIdDC);
		int ultimoIdACD = Integer.valueOf(ultimoIdAC);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (ultimoIdACD < ultimoIdDCD) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		System.out.println("Verificaçãõ da criação do registro: " +sucesso.get(0));
		
		String versao = driver.findElement(By.xpath("//div[@class= \"tr\" and @data-id=\""+idObter2()+"\"]/div[6]/div")).getText();
		String nome = driver.findElement(By.xpath("//div[@class= \"tr\" and @data-id=\""+idObter2()+"\"]/div[7]/div")).getText();;
		String tipoS = driver.findElement(By.xpath("//div[@class= \"tr\" and @data-id=\""+idObter2()+"\"]/div[9]/div")).getText();;
		
		System.out.println("----------------------Verficação das informações do registro ---------------------------");
		System.out.println("Versão: " +versao);
		System.out.println("Nome: " +nome);
		System.out.println("Tipo: " +tipoS);
		
		sucesso.add(versao.equals("1.0"));
		/*sucesso.add(nome.equals("Teste Automatizado kenssy"));
		if (tc2== true) {
			
			sucesso.add(tipoS.equals("DCTF"));
		} else {
			sucesso.add(tipoS.equals("ALTER E-SOCIAL S1200"));
		}
		*/
		
		System.out.println(sucesso);
		
		return sucesso;

		
	}
	
	
	
	public ArrayList<Boolean> BRE() {
		String url = driver.getCurrentUrl();
		
		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;
		
		if (url.contains("tp1")) {
			tp1 = true;
		}else if(url.contains("tc2")) {
			tc2 = true;
		}else {
			tq1 = true;
		}
		home.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		AcessarBREPO acessarBREPO;
		acessarBREPO = new AcessarBREPO();
		
		acessarBREPO.acessarBRE();
		
		regraNegocio.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Último Id antes da criação do registro (Regra Negocio): " + ultimoIdAC);
		idInserir1(ultimoIdAC);
		
		novo.click();
		sleep(3000);
		waitExpectElement(nomeRegra);
		sleep(2000);
		
		nomeRegra.sendKeys("Teste Automatizado Regra Leiaute ");
		sleep(1000);
		
		
		tipoRegra.click();
		sleep(1000);
		tipoRegraO.click();
		sleep(1000);
		
		if (tc2 ==true || tp1 == true) {
			componenteTC2.click();
		}else {
			componente.click();
		}
		
		sleep(1000);
		componenteO.click();
		sleep(1000);
		
		actionsMoveToElementElement(dataVigenciaR);
		
		sleep(1000);
		
		tributo.click();
		sleep(1000);
		tributoO.click();
		sleep(1000);
		tributoO.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		grupoEstruturaR.click();
		sleep(1000);
		if (tp1 == true) {
			grupoEstruturaROTP1.click();
		}else {
			grupoEstruturaRO.click();
		}
		
		
		sleep(1000);
		
		estruturaR.click();
		sleep(1000);
		estruturaRO.click();
		
		sleep(1000);
		actionsMoveToElementElement(dataVigenciaR);
		sleep(1000);
		
		//waitExpectElement(versaoLeiauteR);
		sleep(9000);
		leiauteR.click();
		sleep(1000);
		WebElement leiauteO = driver.findElement(By.xpath("//li[contains(text(),\""+idObter2()+"\")]"));
		leiauteO.click();
		sleep(2000);
		
		versaoLeiauteR.click();
		sleep(1000);
		versaoLeiauteRO.click();
		sleep(1000);
		
		dataVigenciaR.sendKeys("01/01/2013");
		sleep(1000);
		aplicar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(adicionarCaminho);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarCaminho.click();
		sleep(3000);
		waitExpectElement(codigo);
		sleep(2000);
		
		codigo.sendKeys("01");
		sleep(1000);


		condicao1.click();
		sleep(1000);
		condicao1O.click();
		sleep(1000);
		
		condicao2.click();
		sleep(1000);
		condicao2O.click();
		sleep(1000);
		
		condicao3.sendKeys("10000");
		condicao3.sendKeys(Keys.ENTER);
		sleep(1000);
		
		if (tq1 ==true) {
			acoesTQ1.sendKeys("Valor de Ajuste menor que 10.000,00");
			acoesTQ1.sendKeys(Keys.ENTER);
			sleep(1000);
		}else {
			acoes.sendKeys("Valor de Ajuste menor que 10.000,00");
			acoes.sendKeys(Keys.ENTER);
			sleep(1000);
		}

		
		aplicar.click();
		sleep(3000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regraNegocio.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Último Id após da criação do registro (BRE): " + ultimoIdDC);
		idInserir3(ultimoIdDC);
		
		int ultimoIdDCD = Integer.valueOf(ultimoIdDC);
		int ultimoIdACD = Integer.valueOf(ultimoIdAC);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (ultimoIdACD < ultimoIdDCD) {
			sucesso.add(true);
		}
		
		System.out.println("Verificaçãõ da criação do registro BRE: " +sucesso.get(0));
		
		String titulo = driver.findElement(By.xpath("//div[@class= \"tr\" and @data-id=\""+idObter3()+"\"]/div[4]/div")).getText();
		String tipoRegra = driver.findElement(By.xpath("//div[@class= \"tr\" and @data-id=\""+idObter3()+"\"]/div[6]/div")).getText();;
		String tributoS = driver.findElement(By.xpath("//div[@class= \"tr\" and @data-id=\""+idObter3()+"\"]/div[7]/div")).getText();;
		
		System.out.println("----------------------Verficação das informações do registro ---------------------------");
		System.out.println("Título: " +titulo);
		System.out.println("Tipo Regra: " +tipoRegra);
		System.out.println("Tributo: " +tributoS);
		
		sucesso.add(titulo.equals("Teste Automatizado Regra Leiaute"));
		sucesso.add(tipoRegra.equals("Business"));

		sucesso.add(tributoS.equals("ICMS"));
		
		System.out.println(sucesso);
		return sucesso;
		
		
		
	}
	
	
	
	public void DFGEditar() {
		
		String idLeiaute = idObter2();
		home.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		AcessarDFGPO acessarDFGPO;
		acessarDFGPO = new AcessarDFGPO();
		
		acessarDFGPO.acessarDFG();
		
		sleep(2000);

		raiz.click();
		
	
		invisibilityOfElementOverlay();

		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idLeiaute+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idLeiaute+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		
		menu.click();
		sleep(1000);
		acao.click();
		
		sleep(3000);
		waitExpectElement(gravar);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		while(!regrasNegocioB.isDisplayed()) {
			buscarRegra.click();
			sleep(500);
		}
		
		regrasNegocioB.click();
		sleep(3000);
		waitExpectElement(blocoR);
		sleep(2000);
		
		blocoR.click();
		sleep(1000);
		blocoRO.click();
		
		sleep(2000);
		
		registroR.click();
		sleep(1000);
		registroRO.click();
		sleep(1000);
		
		campo.click();
		sleep(1000);
		campoRO.click();
		sleep(1000);
		
		regraR.click();
		sleep(1000);
		regraRO.click();
		sleep(1000);
		
		aplicar.click();
		sleep(3000);
		
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		for (int i = 0; i < 6; i++) {
			adicionarBloco.click();
			sleep(1000);
			
		}
		
		int f = 1;
		for (int i = 0; i < 6; i++) {
			WebElement adicionarRegistroR = driver.findElement(By.xpath("//div[@block-id=\""+f+"\"]/div[1]/div/div[3]/button"));
			sleep(1000);
			adicionarRegistroR.click();
			
			f++;
			
		}
		
		
		
		
		
		
	}
	
	
	public void regrasDeOcultacao() {
		
		nomeBloco2.sendKeys("Bloco 2 (Regras de Ocultação)");
		sleep(1000);
		
		nomeRegistro2.sendKeys("Registro 1");
		sleep(1000);
		
		ajustesFiscais.click();
		sleep(2000);
		
		ajustes.click();
		sleep(2000);
		
		actionsMoveToElementXpath("//div[@block-id=\"1\" and @class=\"block-wrapper\"]/div[3]/div/div[1]");
		sleep(1000);
		
		actionsMoveToElementElement(dataLancamento);
		moveToElement(dataLancamento,droppable2);
		sleep(1000);
		moveToElement(valorAjuste,droppable2);
		sleep(1000);
		
		while(!regrasOcultacao.isDisplayed()) {
			buscarRegra.click();
			sleep(500);
		}
		
		regrasOcultacao.click();
		waitExpectElement(blocoRegraOcultacao);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		blocoRegraOcultacao.click();
		sleep(1000);
		blocoRegraOcultacaoO.click();
		sleep(1000);
		
		registroRegraOcultacao.click();
		sleep(1000);
		registroRegraOcultacaoO.click();
		sleep(1000);
		
		campoRegraOcultacao.click();
		sleep(1000);
		campoRegraOcultacaoO.click();
		sleep(1000);
		
		
		filtros.click();
		
		sleep(2000);
		waitExpectElement(adicionarGrupo);
		sleep(2000);
		
		adicionarGrupo.click();
		waitExpectElement(lapizEditar);
		sleep(2000);
		
		lapizEditar.click();
		sleep(1000);
		nomeGrupo.clear();
		sleep(1000);
		nomeGrupo.sendKeys("Valor de Ajuste Oculto");
		sleep(1000);
		
		expandirGrupo.click();
		sleep(3000);
		
		
		campo1.click();
		sleep(1000);
		campo1O.click();
		sleep(1000);
		
		campo2.sendKeys("20160101");
		
		aplicarRegraOcultacao.click();
		sleep(2000);
		
		esconderRegistro.click();
		sleep(1000);
		
		aplicar.click();
		sleep(3000);
		
	
	}

	
	public void totalDeBloco() {
		
		nomeBloco3.sendKeys("Bloco 3 (Total de Bloco)");
		sleep(1000);
		
		nomeRegistro3.sendKeys("Registro 1");
		sleep(1000);
		
		actionsMoveToElementXpath("//div[@block-id=\"2\" and @class=\"block-wrapper\"]/div[3]/div/div[1]");
		sleep(1000);
		
		actionsMoveToElementElement(dataLancamento);
		moveToElement(codigoEmpresa,droppable3);
		sleep(1000);
		moveToElement(codigoFilial,droppable3);
		sleep(1000);
		moveToElement(dataLancamento,droppable3);
		sleep(1000);
		moveToElement(valorAjuste,droppable3);
		sleep(1000);
		
		camposEspeciais.click();
		sleep(2000);
		
		moveToElement(totalDeBloco,droppable3);
		
		sleep(2000);
		waitExpectElement(aplicar);
		sleep(1000);
		
		registroTB.click();
		sleep(1000);
		registroTBO.click();
		sleep(1000);
		closeSelectTypeCheckbox(registroTB);
		sleep(1000);
		
		aplicar.click();
		
		
	
	}
	
	
	public void totalDeRegistro() {
		
		nomeBloco4.sendKeys("Bloco 4 (Total de Registros)");
		sleep(1000);
		
		nomeRegistro4.sendKeys("Registro 1");
		sleep(1000);

		actionsMoveToElementXpath("//div[@block-id=\"3\" and @class=\"block-wrapper\"]/div[3]/div/div[1]");
		sleep(1000);
		
		actionsMoveToElementElement(dataLancamento);
		moveToElement(codigoEmpresa,droppable4);
		sleep(1000);
		moveToElement(codigoFilial,droppable4);
		sleep(1000);
		moveToElement(dataLancamento,droppable4);
		sleep(1000);
		moveToElement(valorAjuste,droppable4);
		sleep(1000);

		
		moveToElement(totalDeRegistro,droppable4);
		
		sleep(2000);
		waitExpectElement(aplicar);
		sleep(1000);
		
		registroTR.click();
		sleep(1000);
		registroTRO.click();
		sleep(1000);
		closeSelectTypeCheckbox(registroTR);
		sleep(1000);
		
		aplicar.click();
		
		
	
	}
	
	
	public void totalDeForma() {
		
		sleep(1000);
		
		
		nomeBloco5.sendKeys("Bloco 5 (Total de Forma)");
		sleep(1000);
		
		nomeRegistro5.sendKeys("Registro 1");
		sleep(1000);

		actionsMoveToElementXpath("//div[@block-id=\"4\" and @class=\"block-wrapper\"]/div[3]/div/div[1]");
		sleep(1000);
	
		actionsMoveToElementElement(dataLancamento);
		moveToElement(totalDaForma,droppable5);
		sleep(1000);
		
		
	
	}
	
	
	public void concatenacao() {
		
		sleep(1000);
		
		
		nomeBloco6.sendKeys("Bloco 6 (Concatenação)");
		sleep(1000);
		
		nomeRegistro6.sendKeys("Registro 1");
		sleep(1000);

		actionsMoveToElementXpath("//div[@block-id=\"5\" and @class=\"block-wrapper\"]/div[3]/div/div[1]");
		sleep(1000);
		
		actionsMoveToElementElement(dataLancamento);
		moveToElement(codigoEmpresa,droppable6);
		sleep(1000);
		moveToElement(codigoFilial,droppable6);
		sleep(1000);
		
		
		while(!concatenacao.isDisplayed()) {
			buscarRegra2.click();
			sleep(500);
		}
		
		concatenacao.click();
		waitExpectElement(blocoRegraOcultacao);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		blocoRegraOcultacao.click();
		sleep(1000);
		blocoConcatenacaoO.click();
		sleep(1000);
		
		registroRegraOcultacao.click();
		sleep(1000);
		registroConcatenacaoO.click();
		sleep(1000);
		
		
		campoRegraOcultacao.click();
		sleep(1000);
		campoConcatenacaoO.click();
		sleep(1000);
		
		adicionarConcatenacao.click();
		sleep(1000);
		waitExpectElement(campo2C);
		sleep(1000);
		
		campo2C.click();
		sleep(1000);
		campo2CO.click();
		sleep(1000);
		
		aplicar.click();
		
		sleep(3000);
	
	}
	
	
	public void contadorRegistro() {
		
		sleep(1000);
		
		
		nomeBloco7.sendKeys("Bloco 7 (Contador de Registro)");
		sleep(1000);
		
		nomeRegistro7.sendKeys("Registro 1");
		sleep(1000);

		actionsMoveToElementXpath("//div[@block-id=\"6\" and @class=\"block-wrapper\"]/div[3]/div/div[1]");
		sleep(1000);
		
		actionsMoveToElementElement(contadorDoRegistro);
		moveToElement(contadorDoRegistro,droppable7);
		sleep(1000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		invisibilityOfElementOverlay();
	
	}
	
	
	
	public ArrayList<Boolean> configuracao() {
		

		
		configuracoes.click();
		
		invisibilityOfElementOverlay();
		
		raizConfiguracoes.click();
		
		invisibilityOfElementOverlay();
		
		primeira.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();

		invisibilityOfElementOverlay();
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String ultimoIdConfiguracoesAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id antes da criação (configuracoes): "+ ultimoIdConfiguracoesAC);

		
		novo.click();
		sleep(3000);
		waitExpectElement(nome);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		nome.sendKeys("Teste Automatizado Todas Funcionalidades 2");
		sleep(2000);
		
		leiauteE.click();
		sleep(1000);
		WebElement leiauteO = driver.findElement(By.xpath("//li[contains(text(),\""+idObter2()+"\")]"));
		leiauteO.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"inputTimpVersion\"]/div", "class", "base-select required");
		sleep(1000);
		
		versaoE.click();
		sleep(1000);
		versaoEO.click();
		sleep(1000);
		
		actionsMoveToElementXpath("//input[contains(@placeholder,\"Fim\")]");
		sleep(1000);
		
		tributoE.click();
		sleep(1000);
		tributoEO.click();
		sleep(1000);
		
		empresaE.click();
		sleep(1000);
		empresaEO.click();
		sleep(1000);
		empresaEO.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		ufE.click();
		sleep(1000);
		ufEO.click();
		sleep(1000);
		ufEO.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		filialE.click();
		sleep(1000);
		filialEO.click();
		sleep(1000);
		filialEO.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		dataVigenciaE.sendKeys("01/01/2013");
		sleep(1000);
		
		salvar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		raizConfiguracoes.click();
		
		invisibilityOfElementOverlay();
		
		primeira.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();

		invisibilityOfElementOverlay();
		
		rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String ultimoIdDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id após da criação (DFG Configuracoes): "+ ultimoIdDC);
		idInserir4(ultimoIdDC);
		
		int ultimoIdDCD = Integer.valueOf(ultimoIdDC);
		int ultimoIdACD = Integer.valueOf(ultimoIdConfiguracoesAC);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (ultimoIdACD < ultimoIdDCD) {
			sucesso.add(true);
		}
		
		System.out.println("Verificaçãõ da criação do registro BRE: " +sucesso.get(0));
		
		System.out.println("---------------------Verificações das Informações---------------------------------");
		String nome = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter4()+"\"]/div[6]/div")).getText();
		String empresa = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter4()+"\"]/div[9]/div/li")).getText();
		String uf = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter4()+"\"]/div[10]/div/li")).getText();
		String filial = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter4()+"\"]/div[11]/div/li")).getText();
		String tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter4()+"\"]/div[12]/div/li")).getText();
		String dataVigencia = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idObter4()+"\"]/div[13]/div")).getText();
		
		System.out.println(nome);
		System.out.println(empresa);
		System.out.println(uf);
		System.out.println(filial);
		System.out.println(tributo);
		System.out.println(dataVigencia);
		
		
		sucesso.add(nome.contains("Teste Automatizado"));
		sucesso.add(empresa.contains("1000"));
		sucesso.add(uf.contains("SP"));
		sucesso.add(filial.contains("0001"));
		sucesso.add(tributo.contains("ICMS"));
		sucesso.add(dataVigencia.contains("01/01/2013"));
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	
	public void execucao() {
		
		String idRegistro = idObter4();

		/*
		configuracoes.click();
		
		invisibilityOfElementOverlay();
		
		raizConfiguracoes.click();
		
		invisibilityOfElementOverlay();
		
		primeira.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();

		invisibilityOfElementOverlay();
		//hasta aqui
		*/
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		menu.click();
		sleep(1000);
		acao.click();
		sleep(3000);
		waitExpectElement(executar);
		sleep(2000);
		
		ufFilialB.click();
		sleep(1000);
		ufFilialBO.click();
		sleep(1000);
		ufFilialBO.sendKeys(Keys.ESCAPE);
		sleep(1000);
		centralizacao.click();
		sleep(1000);
		
		calendario.click();
		sleep(3000);
		sleep(2000);
		atras.click();
		sleep(1000);
		ano2016.click();
		sleep(2000);
		sleep(2000);
		jan.click();
		sleep(2000);sleep(2000);
		m1.click();
		sleep(3000);
		executarConf.click();
		sleep(3000);
		
		
		waitExpectXpath("//div[@class=\"base-dialog   medium ui-draggable\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"base-dialog   medium ui-draggable\"]");
		sleep(2000);
		invisibilityOfElementOverlay();
		int aparece = rows("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
		if (aparece > 0) {
			driver.findElement(By.xpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]")).click();
		}
		
		
		sleep(2000);
		
		
		visualizarDados.click();
		sleep(3000);
		waitExpectElement(bloco);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
	
	}
	
	
	public ArrayList<Boolean> verificaoDadosBloco1() {
		
		int rows = rows("//div[@class=\"tr-content\" and @id]");
		
		int f = 1;
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		System.out.println("--------------------------------------Regras de Negocio---------------------------");
		for (int i = 0; i < rows; i++) {
			
			System.out.println("Registro: " + f);
			String valorAjuste = driver.findElement(By.xpath("//div[@class=\"tr-content\" and @id]["+f+"]/div[1]/div")).getText();
			String mensagem = driver.findElement(By.xpath("//div[@class=\"tr-content\" and @id]["+f+"]/div[2]/div")).getText();
			
			System.out.println("Valor de Ajuste ("+f+"): " +valorAjuste);
			System.out.println("Mensagem ("+f+"): " +mensagem);
			
			double valorAjusteI = convertToDouble(valorAjuste);
			
			if (valorAjusteI < 10000) {
				sucesso.add(true);
			}else {
				sucesso.add(false);
			}
			
			sucesso.add(mensagem.equals("Valor de Ajuste menor que 10.000,00"));
			
			System.out.println("Valor menor que 10000: " +sucesso.get(i));
			System.out.println("mensagem igual a 'Valor de Ajuste menor que 10.000,00': " +sucesso.get(i+1));
			
			f++;
			
			
		}
		System.out.println(sucesso);
		return sucesso;
	}
	
	
	
	public ArrayList<Boolean> verificaoDadosBloco2() {
		sleep(6000);
		bloco.click();
		sleep(1000);
		blocoO2.click();
		
		invisibilityOfElementOverlay();
		
		int rows = rows("//div[@class=\"tr-content\" and @id]");
		
		int f = 1;
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		System.out.println("--------------------------------------Regras de Ocultação---------------------------");
		for (int i = 0; i < rows; i++) {
			
			System.err.println("Registro: " + f);
			String dataLancamento = driver.findElement(By.xpath("//div[@class=\"tr-content\" and @id]["+f+"]/div[1]/div")).getText();

			System.out.println("Data de Lançamento ("+f+"): " +dataLancamento);
			
			sucesso.add(dataLancamento.equals("20160101"));
			
			System.out.println("Data de Lançamento igual a '20160101': " +dataLancamento.equals("20160101"));
			
			f++;
			
			
		}
		System.out.println(sucesso);
		return sucesso;
	}
	
	public ArrayList<Boolean> verificaoDadosBloco3() {
		
		bloco.click();
		sleep(1000);
		blocoO3.click();
		
		invisibilityOfElementOverlay();
		
		abaVisualizarDados.click();
		
		invisibilityOfElementOverlay();
		
		bloco3V.click();
		
		invisibilityOfElementOverlay();
		System.out.println("--------------------------------------Total de Bloco---------------------------");
		String numeroBlocos = numeroLinhasBloco3.getAttribute("value");
		System.out.println("Número de linhas: " +numeroBlocos);
		
		abaExibirTabela.click();
		
		invisibilityOfElementOverlay();
		
		
		
		int rows = rows("//div[@class=\"tr-content\" and @id]");
		
		int f = 1;
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		
		for (int i = 0; i < rows; i++) {
			
			System.out.println("Registro: " + f);
			String totalBloco = driver.findElement(By.xpath("//div[@class=\"tr-content\" and @id]["+f+"]/div[5]/div")).getText();

			System.out.println("Numero de Blocos ("+f+"): " +totalBloco);
			
			sucesso.add(totalBloco.equals(numeroBlocos));
			
			System.out.println("Numero de Blocos igual a "+numeroBlocos+": " +totalBloco.equals(numeroBlocos));
			
			f++;
			
			
		}
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	
	public ArrayList<Boolean> verificaoDadosBloco4() {
		
		bloco.click();
		sleep(1000);
		blocoO4.click();
		
		invisibilityOfElementOverlay();
		
		abaVisualizarDados.click();
		
		invisibilityOfElementOverlay();
		
		bloco4V.click();
		
		invisibilityOfElementOverlay();
		System.out.println("--------------------------------------Total de Registro---------------------------");
		String numeroBlocos = numeroLinhasBloco3.getAttribute("value");
		System.out.println("Número de linhas: " +numeroBlocos);
		
		abaExibirTabela.click();
		
		invisibilityOfElementOverlay();
		
		
		
		int rows = rows("//div[@class=\"tr-content\" and @id]");
		
		int f = 1;
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		
		for (int i = 0; i < rows; i++) {
			
			System.out.println("Registro: " + f);
			String totalRegistro = driver.findElement(By.xpath("//div[@class=\"tr-content\" and @id]["+f+"]/div[5]/div")).getText();

			System.out.println("Numero de Blocos ("+f+"): " +totalRegistro);
			
			sucesso.add(totalRegistro.equals(numeroBlocos));
			
			System.out.println("Numero de Blocos igual a "+numeroBlocos+": " +totalRegistro.equals(numeroBlocos));
			
			f++;
			
			
		}
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	public boolean verificaoDadosBloco5() {
		
		bloco.click();
		sleep(1000);
		blocoO5.click();
		
		invisibilityOfElementOverlay();
		
		abaVisualizarDados.click();
		
		invisibilityOfElementOverlay();
		
		primerBloco.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		
		int totalLinhas = 0;
		int totalLinhasA = 0;
		
		System.out.println("--------------------------------------Total de Forma---------------------------");
		
		for (int i = 0; i < 7; i++) {
			
			totalLinhas = convertToInt(numeroLinhasBloco3.getAttribute("value"));
			
			System.out.println("Linhas no bloco("+i+"): " +totalLinhas);
			
			
			totalLinhasA += totalLinhas;
			
			siguienteBloco.click();
			
			sleep(1000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(1000);
			
		}
		
		
		System.out.println("Total de linhas em todos os blocos: " +totalLinhasA);
		
		
		abaExibirTabela.click();
		
		invisibilityOfElementOverlay();
		
		
		String total = driver.findElement(By.xpath("//div[@class=\"tr-content\" and @id]")).getText();
		System.out.println("Total de linhas na tabela: " + total);
		int totalI = convertToInt(total);
		
		boolean sucesso = false;
		
		if (totalI == totalLinhasA) {
			sucesso = true;
		}

		System.out.println("Total de linhas igual à visualizaçõa: " +sucesso);
		
		return sucesso;
	}
	
	
	public boolean verificaoDadosBloco6() {
		sleep(6000);
		bloco.click();
		sleep(1000);
		blocoO6.click();
		
		invisibilityOfElementOverlay();
		
		System.out.println("--------------------------------------Concatenação---------------------------");
		
		String concatenacao = driver.findElement(By.xpath("//div[@class=\"tr-content\" and @id]")).getText();
		System.out.println("Concatenção: " + concatenacao);
		
		boolean sucesso = concatenacao.equals("10000001");
		
		System.out.println("Concatenação é igual a '10000001': " +sucesso);
		
		return sucesso;
	}
	
	public boolean verificaoDadosBloco7() {
		
		bloco.click();
		sleep(1000);
		blocoO7.click();
		
		invisibilityOfElementOverlay();
		
		System.out.println("--------------------------------------Contador de Registros---------------------------");
		
		int totalRegistros = convertToInt(driver.findElement(By.xpath("//div[@class=\"tr-content\" and @id]")).getText());
		System.out.println("Total de Registros: " + totalRegistros);
		
		boolean sucesso = false;
		
		if (totalRegistros == 7) {
			sucesso = true;
		}
		
		System.out.println("O total de registros é igual a '7': " +sucesso);
		
		return sucesso;
	}
	
	
	public ArrayList<Boolean> excluirDFGConf() {
		
		String idRegistro = idObter4();
		
		biblioteca.click();
		
		invisibilityOfElementOverlay();
		
		configuracoes.click();
		
		invisibilityOfElementOverlay();
		
		
		raizConfiguracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div/div"));
		WebElement lixeira = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		
		menu.click();
		sleep(1000);
		lixeira.click();
		sleep(3000);
		invisibilityOfElement("//*[@id=\"toast-wrapper\"]/ul/li[2]/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		System.out.println("-----------------------------Exclusão Leiaute-----------------------------------");
		//int rows = rows("//div[@class=\"tr\" and @data-id]");
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String idDE = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		
		System.out.println("Ultimo Id após a Exclução: " +idDE);
		
		int idDEI = convertToInt(idDE);
		int idRegistroI = convertToInt(idRegistro);
		
		System.out.println("Id Excluido: " + idRegistroI);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (idDEI != idRegistroI) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		lixeiraDFGConf.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.clear();
		pesquisar.sendKeys(idRegistro);
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"actions\"]"));
		WebElement excluir = driver.findElement(By.xpath("//li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		excluir.click();
		sleep(3000);
		invisibilityOfElement("//*[@id=\"toast-wrapper\"]/ul/li[2]/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(3000);
		waitExpectElement(pesquisar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracoes.click();
		
		invisibilityOfElementOverlay();
		
		lixeiraDFGConf.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		
		int excluido = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]")).size();
		System.out.println(excluido);
		if (excluido == 0 ) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	
	public ArrayList<Boolean> excluirDFG() {
		
		String idRegistro = idObter2();
		
		
		leiauteAba.click();
		
		invisibilityOfElementOverlay();
		
		sleep(2000);
		
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys(idObter2());
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"actions\"]"));
		WebElement lixeira = driver.findElement(By.xpath("//li/span[text()=\"Lixeira\"]"));
		
		menu.click();
		sleep(1000);
		lixeira.click();
		sleep(3000);
		invisibilityOfElement("//*[@id=\"toast-wrapper\"]/ul/li[2]/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		System.out.println("-----------------------------Exclusão Leiaute-----------------------------------");
		//int rows = rows("//div[@class=\"tr\" and @data-id]");
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String idDE = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		
		System.out.println("Ultimo Id após a Exclução: " +idDE);
		
		int idDEI = convertToInt(idDE);
		int idRegistroI = convertToInt(idRegistro);
		
		System.out.println("Id Excluido: " + idRegistroI);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (idDEI != idRegistroI) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		lixeiraDFG.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.clear();
		pesquisar.sendKeys(idObter2());
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"actions\"]"));
		WebElement excluir = driver.findElement(By.xpath("//li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		excluir.click();
		sleep(3000);
		invisibilityOfElement("//*[@id=\"toast-wrapper\"]/ul/li[2]/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(3000);
		waitExpectElement(pesquisar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		lixeiraDFG.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.clear();
		pesquisar.sendKeys(idObter2());
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int excluido = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]")).size();
		System.out.println(excluido);
		if (excluido == 0 ) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	
	public ArrayList<Boolean> excluirBRE() {
		
		String idRegistro = idObter3();
		home.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		AcessarBREPO acessarBREPO;
		acessarBREPO = new AcessarBREPO();
		
		acessarBREPO.acessarBRE();
		
		sleep(2000);
		
		regraNegocio.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys(idObter3());
		sleep(1000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"actions\"]"));
		WebElement lixeira = driver.findElement(By.xpath("//li/span[text()=\"Lixeira\"]"));
		
		menu.click();
		sleep(1000);
		lixeira.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(1000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//*[@id=\"toast-wrapper\"]/ul/li[2]/div/span[3]");
		sleep(2000);
		System.out.println("-----------------------------Exclusão Leiaute-----------------------------------");
		//int rows = rows("//div[@class=\"tr\" and @data-id]");
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		String idDE = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println("Ultimo Id após a Exclução: " +idDE);
		
		int idDEI = convertToInt(idDE);
		int idRegistroI = convertToInt(idRegistro);
		
		System.out.println("Id Excluido: " + idRegistroI);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (idDEI != idRegistroI) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		lixeiraBRE.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		
		menu.click();
		sleep(1000);
		excluir.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(1000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//*[@id=\"toast-wrapper\"]/ul/li[2]/div/span[3]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(3000);
		waitExpectElement(pesquisar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		lixeiraBRE.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int excluido = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]")).size();
		System.out.println(excluido);
		if (excluido == 0 ) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	
	
	
	
	
	
	
	
}
