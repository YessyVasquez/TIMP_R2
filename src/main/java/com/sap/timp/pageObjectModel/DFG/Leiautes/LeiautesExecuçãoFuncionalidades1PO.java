package com.sap.timp.pageObjectModel.DFG.Leiautes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class LeiautesExecuçãoFuncionalidades1PO extends TestBaseSteven{
	@FindBy(xpath = "//span[@class=\"icon icon-font-File-and-Folders icon-gooddoc padding-right \"]")
	public WebElement sped;
	
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[2]/span/span")
	public WebElement configuracoes;
	
	@FindBy(xpath = "//span[text()=\"E-SOCIAL\"]")
	public WebElement ESocial;
	
	@FindBy(xpath = "//span[text()=\"Eventos\"]")
	public WebElement Evento;
	
	@FindBy(xpath = "//span[text()=\"S1200 Remuneração do Trabalhador Vinculado ao Regime Geral de Prev. Social\"]")
	public WebElement S1200;
	
	@FindBy(xpath = "//span[text()=\"Excluir Dados do Evento\"]")
	public WebElement ExcluirDadosEvento;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[4]/div/ul/li[5]/ul/li[2]/div/span[2]")
	public WebElement blocosApuracao;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[4]/div/ul/li[5]/ul/li[1]/div/span[2]")
	public WebElement R1070;
	
	@FindBy(xpath = "//span[text()=\"R1070 - Insert\"]")
	public WebElement R1070Insert;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"libraryview\"]/div/div[2]/div/div[1]")
	public WebElement antes;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][1]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[contains(text(),\"Nov\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nome;
	
	@FindBy(xpath = "//textarea[@id=\"textarea-id\"]")
	public WebElement descripcion;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar o Tipo de Leiaute\"]")
	public WebElement leiauteInput;
	
	@FindBy(xpath = "//li[text()=\"ALTER E-SOCIAL S1200\"]")
	public WebElement leiauteOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Grupo do Estrutura\"]")
	public WebElement grupo;
	
	@FindBy(xpath = "//li[text()=\"Ajuste\"][1]")
	public WebElement opcGrupo;
	
	@FindBy(xpath = "//li[@id=\"option-96\"]")
	public WebElement opcGrupo1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Estrutura de arquivo\"]")
	public WebElement estrutura;
	
	@FindBy(xpath = "//*[@id=\"18\"]/div[1]/label/span")
	public WebElement opcEstrutura;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Versão do Leiaute\"]")
	public WebElement versacao;
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement empresaOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"UF\"]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement ufOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Filial\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"1000_SP_0001\"]/div/label/span")
	public WebElement filialOpc;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//*[@id=\"create-file-dialog\"]/div[8]/div[2]/div/div[1]/div[1]/div[2]/input")
	public WebElement empresaV;
	
	
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Editar\"]")
	public WebElement editar;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div[1]")
	public WebElement nomeI;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div[1]")
	public WebElement descricaoI;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div[1]")
	public WebElement tipoI;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrarDetalhe;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Estado\"]")
	public WebElement estado;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement estadoOpc;
	
	@FindBy(xpath = "//span[@class=\"icon icon-font-Time-and-Date icon-calendar\"]")
	public WebElement calendar;
	
	@FindBy(xpath = "//div[@class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]")
	public WebElement atrasCalendar;
	
	@FindBy(xpath = "//div[text()=\"2016\"]")
	public WebElement calendar2016;
	
	@FindBy(xpath = "//div[text()=\"Jan\"]")
	public WebElement calendarEnero;
	
	@FindBy(xpath = "//span[text()=\"1M\"]")
	public WebElement calendar1M;
	
	@FindBy(xpath = "//*[@id=\"create-file-dialog\"]/div[8]/div[2]/label/span")
	public WebElement movimiento;
	
	@FindBy(xpath = "//*[@id=\"settings-execute\"]/button/span[2]")
	public WebElement executa;
	
	@FindBy(xpath = "//span[text()=\"Atualizar Estrutura\"]")
	public WebElement AEstrutura;
	
	@FindBy(xpath = "//span[text()=\"Visualizar AN3\"]")
	public WebElement AN3;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome de Arquivo\"]")
	public WebElement AN3nome;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Regras\"]")
	public WebElement AN3regras;
	
	@FindBy(xpath = "//div[@id=\"2364\"]/div/label/span")
	public WebElement AN3regrasOpc;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement criar;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;
	
	@FindBy(xpath = "//div[text()=\"DFG\"]")
	public WebElement dfg;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;

	
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div/ul/li[1]")
	public WebElement mostrar;
	
	
	@FindBy(xpath = "//span[@class=\"icon icon-font-File-and-Folders icon-layout padding-right \"]")
	public WebElement leiautess;
	//*[@id="baseTabs-wrapper"]/div[2]/div/div[2]/div/div[1]/div/div[1]/div[1]/div[2]/div[3]/span
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement arquivosRaiz;
	
	@FindBy(xpath = "//div[@class=\"tabSettings-wrapper\"]/div[1]/div/div/div[1]/div[3]")
	public WebElement configuracaoRaiz;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[3]/div/div[1]/div/div/div[1]/div/div[3]/span")
	public WebElement arquivosO;
	
	@FindBy(xpath = "//*[@id=\"libraryview\"]/div/div[1]/div/div[3]/div[4]/div[2]/label/span")
	public WebElement flagEnviar;
	
	@FindBy(xpath = "//span[text()=\"Enviar selecionado\"]")
	public WebElement enviarSeleccionado;
	
	@FindBy(xpath = "//span[text()=\"Enviar pendências\"]")
	public WebElement enviarPendencias;
	

	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div/div[3]/div[1]/button/span[1]")
	public WebElement adicionarBloco;
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[1]/div[1]/div/div[3]/button")
	public WebElement adicionarRegistro1;
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[2]/div[1]/div/div[3]/button")
	public WebElement adicionarRegistro2;
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[3]/div[1]/div/div[3]/button")
	public WebElement adicionarRegistro3;
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[4]/div[1]/div/div[3]/button")
	public WebElement adicionarRegistro4;
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[5]/div[1]/div/div[3]/button")
	public WebElement adicionarRegistro5;
	
	
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[1]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement inputbloco1;
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement inputbloco2;
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[3]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement inputbloco3;
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[4]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement inputbloco4;
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[5]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement inputbloco5;
	
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[1]/div[2]/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement inputregistro1;
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[2]/div[2]/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement inputregistro2;
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[3]/div[2]/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement inputregistro3;
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[4]/div[2]/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement inputregistro4;
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[5]/div[2]/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement inputregistro5;
	
	
	@FindBy(xpath = "//span[text()=\"Ajustes Fiscais\"]")
	public WebElement ajusteF;
	
	@FindBy(xpath = "//span[text()=\"Ajustes\"]")
	public WebElement ajuste;
	
	@FindBy(xpath = "//span[text()=\"Filtro\"]")
	public WebElement filtros;
	

	@FindBy(xpath = "//*[@id=\"toolbarSecund\"]/div/div/ul/li[2]/button/span[2]")
	public WebElement agrupamento;
	
	@FindBy(xpath = "//span[text()=\"Código da empresa\"]")
	public WebElement codigoDaEmpresa;
	
	@FindBy(xpath = "//span[text()=\"Valor do ajuste\"]")
	public WebElement valorDoAjuste;
	
	@FindBy(xpath = "//span[text()=\"Código da empresa (4)\"]")
	public WebElement codigoDaEmpresa2;
	
	@FindBy(xpath = "//span[text()=\"Valor do ajuste (34)\"]")
	public WebElement valorDoAjuste2;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Bloco\"]")
	public WebElement bloco;
	
	@FindBy(xpath = "//li[text()=\"B2\"]")
	public WebElement blocoInput;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Registro\"]")
	public WebElement registro;
	
	@FindBy(xpath = "//li[text()=\"Agrupamento\"]")
	public WebElement registroInput;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Estrutura de Dados\"]")
	public WebElement estruturas;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"]")
	public WebElement estruturasInput;
	
	@FindBy(xpath = "//button[text()=\"Criar Agrupamento\"]")
	public WebElement criarGrupo;
	
	
	//agrupamento
	
	@FindBy(xpath = "//div[@class=\"group-field\"][1]")
	public WebElement codigoDaEmpresaA;
	
	@FindBy(xpath = "//div[@class=\"group-field\"][2]")
	public WebElement valorDoAjusteA;
	
	//@FindBy(xpath = "//*[@id=\"group-container\"]/div[2]/div[2]/div[1]/div")
	@FindBy(xpath = "//*[@id=\"group-container\"]/div[2]/div[2]/div[1]/div")
	public WebElement cajaEmpresaA;
	
	//@FindBy(xpath = "//*[@id=\"group-container\"]/div[2]/div[2]/div[2]/div")
	@FindBy(xpath = "//*[@id=\"group-container\"]/div[2]/div[2]/div[2]/div")
	public WebElement cajaValorDoAjusteA;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Nome\"]")
	public WebElement nomeGrupo;
	
	@FindBy(xpath = "//span[text()=\"Descrição complementar (500)\"]")
	public WebElement descripcionCompletar;
	
	@FindBy(xpath = "//span[text()=\"Descrição complementar\"]")
	public WebElement descripcionCompletar2;
	
	@FindBy(xpath = "//span[text()=\"Ordenar\"]")
	public WebElement ordenar;
	
	@FindBy(xpath = "//span[text()=\"Adicionar registro\"]")
	public WebElement adicionarRegistroOrdenar;
	
	@FindBy(xpath = "//*[@id=\"dfg-sort-dialog\"]/div/ul/li/div[1]/div[1]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement bloboOrdenar;
	
	@FindBy(xpath = "//*[@id=\"option-3\"]/div")
	public WebElement bloboOrdenarInput;
	
	@FindBy(xpath = "//*[@id=\"dfg-sort-dialog\"]/div/ul/li/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement seleccionRegistroOrdenar;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]/div")
	public WebElement seleccionRegistroOrdenarInput;
	
	@FindBy(xpath = "//span[text()=\"Adicionar campo\"]")
	public WebElement adicionarCampoOrdenar;
	
	@FindBy(xpath = "//*[@id=\"dfg-sort-dialog\"]/div/ul/li/div[2]/li/div/div[1]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement seleccionCampoOrdenar;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]/div")
	public WebElement seleccionCampoOrdenarInput;
	
	//ordenar por
	@FindBy(xpath = "//span[text()=\"Data de lançamento (10)\"]")
	public WebElement dataLancamento;
	
	@FindBy(xpath = "//span[text()=\"Data de lançamento\"]")
	public WebElement dataLancamento2;
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[4]/div[2]/div/div[1]/div/div[3]/div[2]")
	public WebElement ordenarPor;
	
	@FindBy(xpath = "//div[@class=\"order-field-select fselect\"]/div/div[1]/div[2]")
	public WebElement seleccionCampoOrdenarPor;
	
	@FindBy(xpath = "//*[@id=\"14\"]/div[1]/label/span")
	public WebElement seleccionCampoOrdenarPorInput;
	
	@FindBy(xpath = "//*[@id=\"select\"]/div[1]/input")
	public WebElement seleccionOrdem;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement seleccionOrdemInput;
	
	
	//FORMATO
	@FindBy(xpath = "//*[@id=\"toolbarSecund\"]/div/div/ul/li[5]/button/span[2]")
	public WebElement formato;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Bloco\"]")
	public WebElement blocoFormato;
	
	@FindBy(xpath = "//li[text()=\"B5\"]")
	public WebElement blocoFormatoInput;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Registro\"]")
	public WebElement seleccionRegistroFormato;
	
	@FindBy(xpath = "//li[text()=\"formato\"]")
	public WebElement seleccionRegistroFormatoInput;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Campo\"]")
	public WebElement seleccionCampoFormato;
	
	@FindBy(xpath = "//*[@id=\"option-2\"]")
	public WebElement seleccionCampoFormatoInput;
	
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Dia\"]")
	public WebElement dd;
	
	@FindBy(xpath = "//*[@id=\"option-2\"]")
	public WebElement ddInput;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar mês\"]")
	public WebElement mm;
	
	@FindBy(xpath = "//*[@id=\"option-3\"]")
	public WebElement mmInput;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Ano\"]")
	public WebElement aaa;
	
	@FindBy(xpath = "//*[@id=\"option-5\"]")
	public WebElement aaaInput;
	
	@FindBy(xpath = "//input[@placeholder=\"Separadores\"]")
	public WebElement separadores;
	
	
	//SEPARADORES
	@FindBy(xpath = "//*[@id=\"toolbarSecund\"]/div/ul/li[2]/button/span")
	public WebElement next;
	
	@FindBy(xpath = "//*[@id=\"toolbarSecund\"]/div/div/ul/li[6]/button")
	public WebElement separadoresSpan;
	
	@FindBy(xpath = "//input[@placeholder=\"Sem separador\"]")
	public WebElement separadoresInput;
	
	@FindBy(xpath = "//div[@id=\"chkBol\"]/div/label/span")
	public WebElement inicioLinha;
	

	@FindBy(xpath = "//div[@id=\"chkEol\"]/div/label/span")
	public WebElement fimLinha;
	
	//copia bloco
	
	@FindBy(xpath = "//*[@id=\"toolbarSecund\"]/div/div/ul/li[10]/button/span[2]")
	public WebElement cBlocos;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar opção de cópia\"]")
	public WebElement blocoCopiaInput;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement blocoCopiaInputSelect;
	
	@FindBy(xpath = "//*[@id=\"option-2\"]")
	public WebElement registroCopiaInputSelect;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar bloco/registro\"]")
	public WebElement blocoRegistroCopiaInput;
	
	@FindBy(xpath = "//li[text()=\"B5\"]")
	public WebElement  blocoRegistroCopiaSelect;
	
	@FindBy(xpath = "//li[text()=\"B6 - Copiar Bloco/Registro\"]")
	public WebElement  blocoRegistroCopiaSelect2;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[3]/div/div[1]/div/label/span")
	public WebElement flagCampos;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[3]/div/div[2]/div/label/span")
	public WebElement flagFiltros;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[3]/div/div[3]/div/label/span")
	public WebElement flagFormatos;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[3]/div/div[4]/div/label/span")
	public WebElement flagAgrupamentos;
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[6]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement B6;
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[6]/div[2]/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement BRegistro6;

	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[6]/div[2]/div[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement BRegistro7;
	// primer Bloco

	@FindBy(xpath = "//span[text()=\"Ajustes Fiscais\"][1]")
	public WebElement ajusteFiscal;
	
	@FindBy(xpath = "//span[text()=\"Ajustes\"]")
	public WebElement ajuste1;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[2]/div[2]/ul/li[1]/div[2]/ul/li[14]")
	public WebElement valorAjuste;
	
	@FindBy(xpath = "//span[text()=\"Filtro\"]")
	public WebElement filtro;
	
	@FindBy(xpath = "//div[@id=\"comboBlocks\"]/div/div[1]/div[2]")
	public WebElement blocoO;
	
	@FindBy(xpath = "//li[text()=\"B1\"]")
	public WebElement blocoOPC;
	
	@FindBy(xpath = "//div[@id=\"comboRecords\"]/div/div[1]/div[2]")
	public WebElement registroO;
	
	@FindBy(xpath = "//li[text()=\"Filtro\"]")
	public WebElement registroOPC;
	
	@FindBy(xpath = "//div[@id=\"comboColumns\"]/div/div[1]/div[2]")
	public WebElement camposO;
	
	@FindBy(xpath = "//li[text()=\"Valor do ajuste (34)\"]")
	public WebElement camposOPC;
	
	@FindBy(xpath = "//li[text()=\"Valor do ajuste\"]")
	public WebElement camposOPC1;
	
	@FindBy(xpath = "//span[text()=\"Adicionar grupo\"]")
	public WebElement adicionar;
	
	@FindBy(xpath = "//div[@class=\"iconEdit\"]")
	public WebElement editarIcono;
	
	@FindBy(xpath = "//input[@class=\"nomeCase ativo\"]")
	public WebElement editarNombre;
	
	@FindBy(xpath = "//span[@class=\"icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement flechaExpancion;
	
	@FindBy(xpath = "//div[@class=\"satisfy\"]/div/div[1]/div[2]")
	public WebElement adicionarCampo;
	
	@FindBy(xpath = "//div[@class=\"inputOperator\"]/div/div[1]/div[2]/div/div[2]")
	public WebElement adicionarOperador;
	
	@FindBy(xpath = "//div[@id=\"option-3\"]")
	public WebElement adicionarOperadorOPC;
	
	@FindBy(xpath = "//div[@class=\"inputValue\"]/div/div/input")
	public WebElement adicionarCampo2;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicarB1;
	
	@FindBy(xpath = "//div[@class=\"name-input\"]/div/div/input")
	public WebElement nombreAgrupamiento;
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	@FindBy(xpath = "//div[@class=\"elements-panel\"]/div[2]/div[1]/div/div")
	public WebElement verificarBloco2;
	
	@FindBy(xpath = "//span[text()=\"Excluir campo\"]")
	public WebElement verificarBloco3;
	
	@FindBy(xpath = "//div[@class=\"order-field-select fselect\"]/div/div[1]/div[1]/div[1]/div")
	public WebElement verificarBloco4;
	
	public LeiautesExecuçãoFuncionalidades1PO() {

		PageFactory.initElements(driver, this);
	}

	/**
	 * @return
	 */
	public boolean criar() {
		
		String url = driver.getCurrentUrl();
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}	
		
		sleep(3000);
		leiautess.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		arquivosRaiz.click();
		sleep(3000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		System.out.println(rows);
		String ultimoIdAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Último Id antes da criação do registro (Raiz): " + ultimoIdAC);
		idInserir("ultimoIdAC",ultimoIdAC);
		
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado QA Cristhian 00");
		sleep(1000);
		
		descripcion.sendKeys("Descipcion Teste Automatizado QA 0001");
		sleep(2000);
		
		leiauteInput.click();
		sleep(2000);
		leiauteOpc.click();
		sleep(2000);
	
		grupo.click();
		sleep(2000);
		
		 if(tq1 == true) {
			 opcGrupo.click();
			 sleep(2000);
		 }else{
			 opcGrupo1.click();
			 sleep(2000);
		 }
		
		
		estrutura.click();
		sleep(2000);
		opcEstrutura.click();
		sleep(2000);
		opcEstrutura.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		dataVigencia.sendKeys("01/01/2013");
		sleep(1000);
		
		versacao.sendKeys("1");
		sleep(1000);
		
		salvar.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		waitExpectElement(adicionarBloco);
		sleep(80000);
		
		
		adicionarBloco.click();
		sleep(1000);
		
		adicionarBloco.click();
		sleep(1000);
		
		adicionarBloco.click();
		sleep(1000);
		
		adicionarBloco.click();
		sleep(1000);
		
		adicionarBloco.click();
		sleep(4000);

		boolean sucesso = false;
		
		if(inputbloco5.isDisplayed())
		{
			sucesso = true;
			System.out.println("Agregado");
			 
		}else {
			System.out.println("no esta Agregado");
			 sucesso = false;
		}

		return sucesso;
		
	}
	
	public Boolean  Filtro() {

		String url = driver.getCurrentUrl();
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}	

		sleep(3000);
		adicionarRegistro1.click();
		sleep(3000);
		inputbloco1.sendKeys("B1");
		sleep(3000);
		inputregistro1.sendKeys("Filtro");
		sleep(3000);
		
		
		ajusteFiscal.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ajuste1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		  if(tp1 == true) {
		  
			  moveToElement(dataLancamento2, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[1]/div[2]/div[1]/div[2]/div")));
				sleep(2000);
				
				
				moveToElement( valorDoAjuste, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[1]/div[2]/div[1]/div[2]/div")));
				sleep(2000);
		  
		  }else {
		  
			  moveToElement(dataLancamento, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[1]/div[2]/div[1]/div[2]/div")));
				sleep(2000);
				
				
				moveToElement(valorAjuste, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[1]/div[2]/div[1]/div[2]/div")));
				sleep(2000);										
		  }
	
		filtro.click();
		sleep(2000);
		
		blocoO.click();
		sleep(2000);
	
		blocoOPC.click();
		sleep(2000);
	
		registroO.click();
		sleep(2000);

		registroOPC.click();
		sleep(2000);
		
		camposO.click();
		sleep(2000);


		  if(tp1 == true) {
		  
				camposOPC1.click();
				sleep(2000);
		  
		  }else {
		  
				camposOPC.click();
				sleep(2000);										
		  }
		  
	
		
		
		
		adicionar.click();
		sleep(2000);
		
		editarIcono.click();
		sleep(2000);
		
		editarNombre.clear();
		sleep(2000);
		
		editarNombre.sendKeys("Valor de Ajuste Filtro");
		sleep(3000);
		
		flechaExpancion.click();
		sleep(2000);
		
		adicionarCampo.click();
		sleep(2000);
		
		 if(tp1 == true) {
			  
				camposOPC1.click();
				sleep(2000);
		  
		  }else {
		  
				camposOPC.click();
				sleep(2000);										
		  }
		 
	
		adicionarOperador.click();
		sleep(2000);

		adicionarOperadorOPC.click();
		sleep(2000);
		
		adicionarCampo2.sendKeys("0");
		sleep(3000);
		
		boolean sucesso = false;
		
		if(adicionarCampo2.isDisplayed())
		{
			sucesso = true;
			System.out.println("Listo");
			 
		}else {
			System.out.println("No esta Agregado");
			 sucesso = false;
		}


		aplicarB1.click();
		sleep(2000);
		
		
		return sucesso;	
	}	
	
	public void  Agrupamiento() {	
			
			String url = driver.getCurrentUrl();
			boolean tc2 = false;
			boolean td1 = false;
			boolean tp1 = false;
			boolean tq1 = false;
			
			if (url.contains("tc2")) {
				tc2 = true;
			}else if (url.contains("tp1")) {
				tp1 = true;
			}else if (url.contains("tq1")) {
				tq1 = true;
			}else {
				td1 = true;
			}		
		adicionarRegistro2.click();
		sleep(3000);
		inputbloco2.sendKeys("B2");
		sleep(3000);
		
		inputregistro2.sendKeys("Agrupamento"); 
		 sleep(3000);
		  
		
		actionsMoveToElementXpath("//div[@id=\"block-list-wrapper\"]/div[2]/div[3]/div/div[2]");
		sleep(2000);
		  //AGRUPAMIENTO
		  
		  if(tp1 == true) {
		  
		 invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); sleep(2000);
		  moveToElement(codigoDaEmpresa, driver.findElement(By.xpath( "//div[@id=\"block-list-wrapper\"]/div[2]/div[2]/div/div[2]")));
		  sleep(2000);
		  
		  
		  invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); sleep(2000);
		  moveToElement(valorDoAjuste, driver.findElement(By.xpath( "//div[@id=\"block-list-wrapper\"]/div[2]/div[2]/div/div[2]")));
		  sleep(2000);
		  
		  }else {
		  
		  invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		  sleep(2000); moveToElement(codigoDaEmpresa2, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"]/div[2]/div[2]/div/div[2]")));
		  sleep(2000);
		  
		  
		  invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); sleep(2000);
		  moveToElement(valorDoAjuste2, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"]/div[2]/div[2]/div/div[2]")));
		  sleep(2000); 
		  }
		  
		  
		/*
		  agrupamento.click(); 
		  sleep(3000);
		  
		  bloco.click(); 
		  sleep(3000); 
		  
		  blocoInput.click(); 
		  sleep(3000);
		  
		  registro.click(); 
		  sleep(3000); 
		  
		  registroInput.click(); 
		  sleep(3000);
		  
		  estruturas.click(); 
		  sleep(3000); 
		  
		  estruturasInput.click(); 
		  sleep(3000);
		  
		  
		  criarGrupo.click(); 
		  sleep(5000);
		  
		  
		  nombreAgrupamiento.sendKeys("Agrupamento Nombre");
			sleep(3000);

		  moveToElement(codigoDaEmpresaA, driver.findElement(By.xpath(  "//div[@class=\"elements-panel\"]/div[2]/div[1]/div")));
		  

		  moveToElement(valorDoAjusteA, driver.findElement(By.xpath("//div[@class=\"elements-panel\"]/div[2]/div[2]/div")));
		
		
			boolean sucesso = false;
			
			if(verificarBloco2.isDisplayed())
			{
				sucesso = true;
				System.out.println("Listo");
				 
			}else {
				System.out.println("No esta Agregado");
				 sucesso = false;
			}
			
		  cancelar.click(); 
	     	sleep(3000);
			  
		  
		  aplicar.click(); 
		  sleep(3000);
			return sucesso;	*/
		}
		
	public Boolean  Ordenar() {
		
		String url = driver.getCurrentUrl();
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
			
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		} 
		
		//Ordenar
		adicionarRegistro3.click();
		sleep(3000);
		inputbloco3.sendKeys("B3");
		sleep(3000);
		inputregistro3.sendKeys("ordenar");
		sleep(3000);
		
		actionsMoveToElementXpath("//div[@id=\"block-list-wrapper\"]/div[3]/div[3]/div/div[2]");
		sleep(2000);
		
		if(tp1 == true || tc2 == true) {
			  invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
			  sleep(2000);
			  
			  moveToElement(descripcionCompletar2, driver.findElement(By.xpath(
			  "//*[@id=\"block-list-wrapper\"]/div[3]/div[2]/div/div[2]/div")));
			  sleep(2000);
			  
			 
		   sleep(2000); 
		 }else {
			  invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
			  sleep(2000);
			  
			  moveToElement(descripcionCompletar, driver.findElement(By.xpath(
			  "//*[@id=\"block-list-wrapper\"]/div[3]/div[2]/div/div[2]/div")));
			  sleep(2000);
		 }
		
		ordenar.click();
		sleep(3000);
		
		adicionarRegistroOrdenar.click();
		sleep(3000);
		
		bloboOrdenar.click();
		sleep(3000);
		bloboOrdenarInput.click();
		sleep(3000);
		
		seleccionRegistroOrdenar.click();
		sleep(3000);
		seleccionRegistroOrdenarInput.click();
		sleep(3000);
		
		adicionarCampoOrdenar.click();
		sleep(3000);
		
		seleccionCampoOrdenar.click();
		sleep(3000);
		seleccionCampoOrdenarInput.click();
		sleep(3000);
		
		
		boolean sucesso = false;
		
		if(verificarBloco3.isDisplayed())
		{
			sucesso = true;
			
			System.out.println("Ordenar Èxito");
			 
		}else {
			
			System.out.println("Ordenar Fallo");
			 sucesso = false;
		}
		

		aplicar.click();
		sleep(3000);
	
		return sucesso;	
		
	}
	public Boolean OrdenarPor() {
		String url = driver.getCurrentUrl();
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
			
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		} 
			
		adicionarRegistro4.click();
		sleep(3000);
		inputbloco4.sendKeys("B4");
		sleep(3000);
		inputregistro4.sendKeys("ordenar por");
		sleep(3000);
		
		
		//Ordenar Por
		
		actionsMoveToElementXpath("//div[@id=\"block-list-wrapper\"]/div[4]/div[3]/div/div[2]");
		sleep(2000);
		if(tp1 == true || tc2 ==  true) {
			  invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
			  sleep(2000);
			  
			  moveToElement(valorDoAjuste, driver.findElement(By.xpath(
			  "//*[@id=\"block-list-wrapper\"]/div[4]/div[2]/div/div[2]/div")));
			  sleep(2000);
			  
			 
		   sleep(2000); 
		 }else {
			  invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
			  sleep(2000);
			  
			  moveToElement(valorDoAjuste2, driver.findElement(By.xpath(
			  "//*[@id=\"block-list-wrapper\"]/div[4]/div[2]/div/div[2]/div")));
			  sleep(2000);
		 }
		
		ordenarPor.click();
		sleep(3000);
		
		seleccionCampoOrdenarPor.click();
		sleep(1000);
		
		if(tp1 == true || tc2 ==  true) {
			seleccionCampoOrdenarPorInput.click();
			sleep(1000);
			  
			 
		   sleep(2000); 
		 }else {
			 seleccionCampoOrdenarPorInput.click();
				sleep(1000);
		 }
		
		closeSelectTypeCheckbox(seleccionCampoOrdenarPor);
		sleep(1000);
		
		seleccionOrdem.click();
		sleep(1000);
		seleccionOrdemInput.click();
		sleep(1000);
		
		

		
		boolean sucesso = false;
		
		if(verificarBloco4.isDisplayed())
		{
			sucesso = true;
			
			System.out.println("Ordenar Èxito");
			 
		}else {
			
			System.out.println("Ordenar Fallo");
			 sucesso = false;
		}
		

		aplicar.click();
		sleep(3000);
	
		return sucesso;	
		
		
	}
	public Boolean formato() {	
		//Formato
		
		String url = driver.getCurrentUrl();
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
			
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		
		adicionarRegistro5.click();
		sleep(3000);
		inputbloco5.sendKeys("B5");
		sleep(3000);
		inputregistro5.sendKeys("formato");
		sleep(3000);
		
		if(tp1 == true || tc2 ==  true) {
			
//			  Actions action = new Actions(driver);
//			  action.dragAndDrop(Sourcelocator, Destinationlocator).build().perform();
			
			  invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
			  sleep(2000);
			  
			  moveToElement(dataLancamento2, driver.findElement(By.xpath(
			  "//*[@id=\"block-list-wrapper\"]/div[5]/div[2]/div/div[2]/div")));
			  sleep(2000);
			  
			 
		   sleep(2000); 
		 }else {
			  invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
			  sleep(2000);
			  
			  moveToElement(dataLancamento, driver.findElement(By.xpath(
			  "//*[@id=\"block-list-wrapper\"]/div[5]/div[2]/div/div[2]/div")));
			  sleep(2000);
		 }
		
		
		formato.click();
		sleep(3000);
		
		blocoFormato.click();
		sleep(3000);
		blocoFormatoInput.click();
		sleep(3000);
		
		seleccionRegistroFormato.click();
		sleep(1000);
		seleccionRegistroFormatoInput.click();
		sleep(1000);
		
		
		seleccionCampoFormato.click();
		sleep(1000);
		seleccionCampoFormatoInput.click();
		sleep(1000);
		
		
		dd.click();
		sleep(1000);
		ddInput.click();
		sleep(1000);
		
		mm.click();
		sleep(1000);
		mmInput.click();
		sleep(1000);
		
		aaa.click();
		sleep(1000);
		aaaInput.click();
		sleep(1000);
		
		separadores.sendKeys("/");
		sleep(1000);
		
		boolean sucesso = false;
		
		if( separadores.isDisplayed())
		{
			sucesso = true;
			
			System.out.println("Ordenar Èxito");
			 
		}else {
			
			System.out.println("Ordenar Fallo");
			 sucesso = false;
		}
		

		aplicar.click();
		sleep(3000);
	
		return sucesso;	
		
		
	}
		
		
		
		
	
	public Boolean separadores() {	
		//SEPARADORES
		
		next.click();
		sleep(1000);
				
		separadoresSpan.click();
		sleep(1000);
				
		separadoresInput.sendKeys("|");;
		sleep(1000);
				
		inicioLinha.click();
		sleep(1000);
		
		fimLinha.click();
		sleep(1000);
		
		boolean sucesso = false;
		
		if( fimLinha.isDisplayed())
		{
			sucesso = true;
			
			System.out.println("Ordenar Èxito");
			 
		}else {
			
			System.out.println("Ordenar Fallo");
			 sucesso = false;
		}
		

		aplicar.click();
		sleep(3000);
	
		return sucesso;	
		
		
	}
	
	public Boolean CopiarBloco() {	
		next.click();
		sleep(3000);
		
		next.click();
		sleep(3000);
		
		next.click();
		sleep(3000);
		
		next.click();
		sleep(3000);
		
		next.click();
		sleep(3000);
		
		next.click();
		sleep(3000);
		
		next.click();
		sleep(3000);
		
		next.click();
		sleep(3000);
		
		cBlocos.click();
		sleep(1000);
		
		blocoCopiaInput.click();
		sleep(1000);
		
		blocoCopiaInputSelect.click();
		sleep(1000);
		
		blocoRegistroCopiaInput.click();
		sleep(1000);
		
		blocoRegistroCopiaSelect.click();
		sleep(1000);
		
		flagCampos.click();
		sleep(1000);
		
		flagFiltros.click();
		sleep(1000);
		
		flagFormatos.click();
		sleep(1000);
		
		flagAgrupamentos.click();
		sleep(1000);
		
		aplicar.click();
		sleep(3000);
		
		B6.clear();
		sleep(1000);
		
		B6.sendKeys("B6");
		
		BRegistro6.clear();
		sleep(1000);
		
		BRegistro6.sendKeys("Copiar Bloco/Registro");
		sleep(1000);
		
		//COPIA REGISTRO
	
		
		cBlocos.click();
		sleep(1000);
		
		blocoCopiaInput.click();
		sleep(1000);
		
		registroCopiaInputSelect.click();
		sleep(1000);
		
		blocoRegistroCopiaInput.click();
		sleep(1000);
		
		blocoRegistroCopiaSelect2.click();
		sleep(1000);
		
		flagCampos.click();
		sleep(1000);
		
		flagFiltros.click();
		sleep(1000);
		
		flagFormatos.click();
		sleep(1000);
		
		flagAgrupamentos.click();
		sleep(1000);
		

		aplicar.click();
		sleep(1000);
		
		BRegistro7.clear();
		sleep(1000);
		
	
		
		BRegistro7.sendKeys("Registro 2");
		sleep(2000);

		actionsMoveToElementXpath("//span[text()=\"Gravar\"]");
		sleep(2000);
		
		System.out.println("Se movio");
		
		gravar.click();
		sleep(1000);
		
		System.out.println("gravar");
		
		nao.click();
		sleep(1000);
		
		System.out.println("no");
		sim.click();
		sleep(7000);
		
		System.out.println("si");
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Último Id após da criação do registro Leiautes: " + ultimoIdDC);
		idInserir2(ultimoIdDC);
		
		String ultimoIdAC = idObter("ultimoIdAC");
				
		int ultimoIdDCD = Integer.valueOf(ultimoIdDC);
		int ultimoIdACD = Integer.valueOf(ultimoIdAC);
		boolean sucesso = false;
		
		if (ultimoIdACD < ultimoIdDCD) {
			sucesso = true;
		}
		
		return sucesso;
		
	}	
	
	public void criarConfiguracion() {	
		
		sleep(3000);
		configuracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracaoRaiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		

		
		String ultimoIdDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Último Id após da criação do registro Leiautes: " + ultimoIdDC);
		
		
		
		
		
		
		
	/*	int ultimoIdDCD = Integer.valueOf(ultimoIdDC);
		int ultimoIdACD = Integer.valueOf(ultimoIdAC);
		boolean sucesso = false;
		
		if (ultimoIdACD < ultimoIdDCD) {
			sucesso = true;
		}
		
		System.out.println(idObter2());
		System.out.println(idObter3());
		
		
		
	
		System.out.println(sucesso);
		
		driver.navigate().refresh();
		return sucesso;*/
	}
	
	

}
