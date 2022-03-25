package com.sap.timp.pageObjectModel.DFG.Arquivos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class FuncionalidadesPO extends TestBaseFernando{
	@FindBy(xpath = "//div[contains(@class, \"baseTabs-view -view-wrapper  selected\")]/div/div/div/div/div/div/div[@class=\"folder-collapsed icon icon-font-File-and-Folders icon-Closedfolder\"]")
	public WebElement btnRaiz;
	
	@FindBy(xpath = "//div[contains(@class, \"baseTabs-view -view-wrapper  selected\")]/div/div/div/div[1]/div/div/div[@class=\"folder-collapsed icon icon-font-File-and-Folders icon-Closedfolder\"]")
	public WebElement btnRaiz2;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Leiaute\"]")
	public WebElement btnNovoLeiaute;
	
	@FindBy(xpath = "//div[@id=\"inputTextFileName\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement cboTipo;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"ALTER E-SOCIAL S1200\"]")
	public WebElement opcionTipo;
	
	@FindBy(xpath = "//div[@id=\"inputStructureParent\"]/div/div/div[2]")
	public WebElement cboGrupoDeEstrutura;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"Ajuste\"][1]")
	public WebElement opcionGrupoDeEstrutura;
	
	@FindBy(xpath = "//div[@id=\"inputStructureChild\"]/div/div/div[2]")
	public WebElement cboEstrutura;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"Ajustes Fiscais\"]")
	public WebElement opcionEstrutura;
	
	@FindBy(xpath = "//div[@id=\"inputValidFrom\"]/div/div/input")
	public WebElement dataInicioVigencia;
	
	@FindBy(xpath = "//div[@id=\"inputLayoutVersion\"]/div/div/input")
	public WebElement versionLeiaute;
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement btnSalvar;
	
	@FindBy(xpath = "//div[@id=\"toolbarSecund\"]/div/ul/li/button/span[@class=\"icon icon-font-Sign-and-Symbols icon-rightmenu\"]")
	public WebElement btnSiguiente;
	
	@FindBy(xpath = "//div[@id=\"toolbarSecund\"]/div/div/ul/li/button/span[text()=\"Separadores\"]")
	public WebElement btnSeparadores;
	
	@FindBy(xpath = "//div[@id=\"inputSeparator\"]/div/div/input")
	public WebElement inputSeparador;
	
	@FindBy(xpath = "//div[@id=\"chkBol\"]/div/label/span")
	public WebElement chkIncluirInicioDeLinha;
	
	@FindBy(xpath = "//div[@id=\"chkEol\"]/div/label/span")
	public WebElement chkIncluirNoFimDeLinha;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement btnAplicar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement btnNO;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement btnJustificativa;
	
	@FindBy(xpath = "//div[@id=\"justification\"]/div/textarea")
	public WebElement inputJustificativa;
	
	@FindBy(xpath = "//span[text()=\"Adicionar bloco\"]")
	public WebElement btnAdicionarBloco;
	
	@FindBy(xpath = "//button[text()=\"Adicionar registro\"]")
	public WebElement btnAdicionarRegistro;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Nome do Bloco\"]")
	public WebElement nomeBloco;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Nome do Registro\"]")
	public WebElement nomeRegistro;
	
	@FindBy(xpath = "//span[text()=\"Ajustes Fiscais\"][1]")
	public WebElement btnAjustesFiscais;
	
	@FindBy(xpath = "//span[text()=\"Ajustes\"]")
	public WebElement btnAjustes;
	
	@FindBy(xpath = "//span[contains(text(), \"Código da empresa\")]")
	public WebElement codigoEmpresa;
	
	@FindBy(xpath = "//span[contains(text(), \"Código da filial\")]")
	public WebElement codigoDaFilial;
	
	@FindBy(xpath = "//span[contains(text(), \"Data de lançamento\")]")
	public WebElement dataDeLancamento;
	
	@FindBy(xpath = "//span[contains(text(), \"Valor do ajuste\")]")
	public WebElement valorDeAjuste;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//span[@class=\"icon icon-font-File-and-Folders icon-docversion padding-right \"]")
	public WebElement btnArquivos;
	
	@FindBy(xpath = "//span[@class=\"icon icon-font-Display-and-Setting icon-setting padding-right \"]")
	public WebElement abaConfiguracoes;
	
	@FindBy(xpath = "//span[text()=\"Nova Configuração\"]")
	public WebElement btnNovaConfiguracao;
	
	@FindBy(xpath = "//div[@id=\"inputTextFileName\"]/div/div/input")
	public WebElement nomeConfiguracao;
	
	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement cboLeiaute;
	
	@FindBy(xpath = "//div[@id=\"inputTimpVersion\"]/div/div/div[2]")
	public WebElement cboLVersaoLeiaute;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"1.0\"]")
	public WebElement opcionVersaoLeiaute;
	
	@FindBy(xpath = "//div[@id=\"inputSelectTax\"]/div/div/div[2]")
	public WebElement cboTributo;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"ICMS\"]")
	public WebElement opcionTributo;
	
	@FindBy(xpath = "//div[@id=\"inputSelectCompany\"]/div/div/div[2]")
	public WebElement cboEmpresa;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"1000\"]")
	public WebElement opcionEmpresas;
	
	@FindBy(xpath = "//div[@id=\"inputSelectState\"]/div/div/div[2]")
	public WebElement cboUf;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"SP\"]")
	public WebElement opcionUf;
	
	@FindBy(xpath = "//div[@id=\"inputSelectFilial\"]/div/div/div[2]")
	public WebElement cboFilial;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"1000 - SP - 0001\"]")
	public WebElement opcionFilial;
	
	@FindBy(xpath = "//div[@id=\"inputValidFrom\"]/div/div/input")
	public WebElement inputDataInicioVigencia;
	
	@FindBy(xpath = "//div[@id=\"inputState\"]/div/div/div[2]")
	public WebElement cboEstado;

	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"SP\"]")
	public WebElement opcionEstado;

	@FindBy(xpath = "//div[@id=\"subPeriodPic\"]/div/div/span")
	public WebElement inputSubperiodo;

	@FindBy(xpath = "//div[@id=\"settings-execute\"]/button/span[text()=\"Executar\"]")
	public WebElement btnExecutar;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-public-digitalFile\"]")
	public WebElement btnArquivosPublicos;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-my-digitalFile\"]")
	public WebElement btnMeusArquivos;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-my-layout\"]")
	public WebElement btnMeusArquivos2;
	
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-favorite-digitalFile\"]")
	public WebElement btnMeusFavoritoss;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement inputPesquisar;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnFecharPanel;
	
	@FindBy(xpath = "//span[text()=\"Oficializar Arquivo\"]")
	public WebElement btnOficializarArquivo;
	
	@FindBy(xpath = "//button[@class=\"btn icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement btnFecharPanelConfiguracoes;
	
	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement btnFiltrosAvancados;
	
	@FindBy(xpath = "//div[@id=\"advancedSearch2\"]/div/div[1]/div/div/input")
	public WebElement inputPesquisarId;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement PesquisarId;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash-setting\"]")
	public WebElement pastaLixeira;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash-layout\"]")
	public WebElement pastaLixeiraLeiaute;
	
	@FindBy(xpath = "//span[@class=\"icon icon-font-File-and-Folders icon-layout padding-right \"]")
	public WebElement abaLeiautes;
	
	String URL = driver.getCurrentUrl();
	String idUltimoRegistro = "0";
	String idRegistroNuevo = "0";
	String idRegistroArquivo = "0";
	
	public FuncionalidadesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criarLeiaute() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnRaiz.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		this.idUltimoRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id]["+ rows +"]/div[5]/div")).getText();
		
		System.out.println("Id Ultimo Registro: " + this.idUltimoRegistro);
		System.out.println("");
		
		btnNovoLeiaute.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(nome);
		nome.sendKeys("TESTE AUTOMATIZADO");
		sleep(1000);
		
		cboTipo.click();
		sleep(1000);
		opcionTipo.click();
		sleep(1000);
		
		cboGrupoDeEstrutura.click();
		sleep(1000);
		
		if(URL.contains("tp1")) {
			opcionGrupoDeEstrutura = driver.findElement(By.xpath("//li[@tabindex=\"0\" and @class=\"list-item\" and @id and text()=\"Ajustes\"][1]"));
		}
		opcionGrupoDeEstrutura.click();
		sleep(3000);
		
		cboEstrutura.click();
		sleep(1000);
		opcionEstrutura.click();
		closeSelectTypeCheckbox(cboEstrutura);
		sleep(1000);
		
		dataInicioVigencia.sendKeys("01/01/2013");
		sleep(1000);
		
		versionLeiaute.sendKeys("1");
		sleep(1000);
		
		btnSalvar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnSiguiente.click();
		sleep(2000);
		
		btnSeparadores.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(inputSeparador);
		inputSeparador.sendKeys("|");
		sleep(1000);
		
		chkIncluirInicioDeLinha.click();
		sleep(1000);
		
		chkIncluirNoFimDeLinha.click();
		sleep(1000);
		
		btnAplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnJustificativa.click();
		sleep(1000);
		
		waitExpectElement(inputJustificativa);
		inputJustificativa.sendKeys("TESTE AUTOMATIZADO JUSTIFICATIVA");
		sleep(1000);
		btnAplicar.click();
		sleep(1000);
		
		btnGravar.click();
		sleep(1000);
		
		waitExpectElement(btnSim);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String verificar = "O Leiaute foi atualizado com sucesso.";
		String verificado = driver.findElement(By.xpath("//div[@id=\"toast-wrapper\"]/ul/li/div/span[2]/span")).getText().trim();
		
		System.out.println("");
		System.out.println(verificado);
		
		boolean sucesso = false;
		
		if(verificado.equals(verificar)){
			sucesso = true;
		}
		
		return sucesso;
	}
	
	public boolean registros() {
		btnAdicionarBloco.click();
		sleep(2000);
		
		waitExpectElement(btnAdicionarRegistro);
		btnAdicionarRegistro.click();
		sleep(2000);
		
		nomeBloco.sendKeys("Bloco 1");
		sleep(1000);
		
		nomeRegistro.sendKeys("Registro 1");
		sleep(1000);
		
		btnAjustesFiscais.click();
		sleep(1000);
		
		btnAjustes.click();
		sleep(1000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		moveToElement(codigoEmpresa, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(1000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		moveToElement(codigoDaFilial, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(1000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		moveToElement(dataDeLancamento, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(1000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		moveToElement(valorDeAjuste, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(1000);
		
		btnGravar.click();
		sleep(1000);
		
		waitExpectElement(btnSim);
		btnSim.click();
		sleep(1000);
		
		btnAplicar.click();
		sleep(1000);
		
		btnGravar.click();
		sleep(1000);
		
		waitExpectElement(btnSim);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnBiblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnRaiz.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		this.idRegistroNuevo = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id]["+ rows +"]/div[5]/div")).getText();
		
		int id1 = convertToInt(this.idUltimoRegistro);
		int id2 = convertToInt(this.idRegistroNuevo);
		
		System.out.println("");
		System.out.println("Id Ultimo Registro: " + id1);
		System.out.println("Id Registro nuevo: " + id2);
		
		boolean sucesso = false;
		
		if(id2 > id1) {
			sucesso = true;
			System.out.println("Registro creado...");
		}else {
			System.out.println("No se creo el registro...");
		}
		
		return sucesso;
	}
	
	public boolean criarConfiguracao() {
		btnArquivos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnRaiz.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		this.idRegistroArquivo = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id]["+ rows +"]/div[5]/div")).getText();
		
		System.out.println("");
		System.out.println("Id Registro Arquivo: " + this.idRegistroArquivo);
		
		sleep(2000);
		abaConfiguracoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnRaiz.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		String idRegistroConfiguracoes = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id]["+ rows +"]/div[5]/div")).getText();
		
		System.out.println("");
		System.out.println("Id Registro Configuracoes: " + idRegistroConfiguracoes);
		
		sleep(1000);
		
		btnNovaConfiguracao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(nomeConfiguracao);
		nomeConfiguracao.sendKeys("TESTE AUTOMATIZADO");
		sleep(1000);
		
		cboLeiaute.click();
		sleep(1000);
		
		WebElement opcionLeiaute = driver.findElement(By.xpath("//li[@tabindex=\"0\" and @class=\"list-item\" and @id and contains(text(), \""+this.idRegistroNuevo+"\")]"));
		opcionLeiaute.click();
		sleep(9000);
		
	//	attributeToBeXpath("//div[@id=\"inputTimpVersion\"]/div", "class", "base-select required");
		cboLVersaoLeiaute.click();
		sleep(3000);
		opcionVersaoLeiaute.click();
		sleep(1000);
		
		actionsMoveToElementElement(dataInicioVigencia);
		cboTributo.click();
		sleep(3000);
		opcionTributo.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"inputSelectCompany\"]/div", "class", "base-MultipleSelect3 required");
		cboEmpresa.click();
		sleep(1000);
		opcionEmpresas.click();
		closeSelectTypeCheckbox(cboEmpresa);
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"inputSelectState\"]/div", "class", "base-MultipleSelect3 required");
		cboUf.click();
		sleep(1000);
		opcionUf.click();
		closeSelectTypeCheckbox(cboUf);
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"inputSelectFilial\"]/div", "class", "base-MultipleSelect3 required");
		cboFilial.click();		
		sleep(1000);
		opcionFilial.click();
		closeSelectTypeCheckbox(cboFilial);
		sleep(1000);
		
		dataInicioVigencia.sendKeys("01/01/2013");
		sleep(1000);
		
		btnSalvar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		abaConfiguracoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnRaiz.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		String idUltimoRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id]["+ rows +"]/div[5]/div")).getText();
		
		System.out.println("");
		System.out.println("Id Ultimo Registro Configuracoes: " + idUltimoRegistro);
		
		int id1 = convertToInt(idRegistroConfiguracoes);
		int id2 = convertToInt(idUltimoRegistro);
		
		System.out.println("");
		System.out.println("Id Ultimo Registro Configuracoes: " + id1);
		System.out.println("Id Registro nuevo Configuracoes: " + id2);
		
		boolean sucesso = false;
		
		if(id2 > id1) {
			sucesso = true;
			idInserir4(idUltimoRegistro);
			System.out.println("Registro creado...");
		}else {
			System.out.println("No se creo el registro...");
		}
		
		return sucesso;
	}
	
	public boolean executar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		abaConfiguracoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnRaiz.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		String idRegistro = idObter4();
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acoe = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));

		menu.click();
		sleep(1000);
		acoe.click();
		sleep(3000);
		
		waitExpectElement(cboEstado);
		cboEstado.click();
		sleep(1000);
		opcionEstado.click();
		sleep(2000);
		closeSelectTypeCheckbox(cboEstado);
		sleep(1000);

		actionsMoveToElementElement(inputSubperiodo);

		inputSubperiodo.click();
		sleep(2000);

		WebElement flechaAtrasCalendario = driver.findElement(By.xpath("//div[@tabindex=\"0\" and @class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]"));
		flechaAtrasCalendario.click();

		String anio = "2016";

		WebElement anioCalendar = driver.findElement(By.xpath("//div[@tabindex=\"0\" and contains(@class, \"year\") and text()=\"" + anio + "\"]"));
		anioCalendar.click();
		sleep(3000);

		WebElement monthCalendar = driver.findElement(By.xpath("//div[@tabindex=\"0\" and contains(@class, \"month\") and text()=\"Jan\"]"));
		monthCalendar.click();
		sleep(5000);

		WebElement subperiodoCalendar = driver.findElement(By.xpath("//span[@class=\"subperiod-text\" and text()=\"1M\"]"));
		subperiodoCalendar.click();
		sleep(3000);

		WebElement cbkCentralizacaoDeMovimento = driver.findElement(By.xpath("//div[contains(@class, \"movementCentralization\")][2]/label/span"));
		cbkCentralizacaoDeMovimento.click();
		sleep(2000);

		btnExecutar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
			
		invisibilityOfElement("//div[@class=\"dialog-indicator\"]");
		sleep(12000);
		
		btnGravar.click();
		sleep(1000);
		
		
		 btnNO.click();
		sleep(14000);
		
		// Verificar si es guardado con exito, si no se va quedar esperando por el
		// waitExpectXpath
		//waitExpectXpath("//li[@class=\"base-toast  toast-success   \"]");
		String mensajeSucesso = driver.findElement(By.xpath("//li[@class=\"base-toast  toast-success   \"]/div/span[2]/span")).getText();
		invisibilityOfElement("//li[@class=\"base-toast  toast-success   \"]");
		sleep(2000);

		String valorSucessoString = "Arquivo emitido com sucesso";

		if (mensajeSucesso.contains(valorSucessoString)) {
			System.out.println("");
			System.out.println("Registro de execucao guardado...");
		}
		
		btnBiblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnArquivos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnRaiz.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		String idUltimoRegistroNuevoArquivo = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id]["+ rows +"]/div[5]/div")).getText();
		
		System.out.println("");
		System.out.println("Id Registro Arquivo: " + idUltimoRegistroNuevoArquivo);
		
		boolean sucesso = false;
		
		if(convertToInt(idUltimoRegistroNuevoArquivo) > convertToInt(this.idRegistroArquivo)) {
			sucesso = true;
			idInserir1(idUltimoRegistroNuevoArquivo);
			System.out.println("");
			System.out.println("Registro de arquivo confirmado...");
		}else {
			System.out.println("");
			System.out.println("No se confirmo el registro en arquivos...");
		}
		
		return sucesso;
	}
	
	public boolean idPublicoPrivado() {
		btnArquivos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnRaiz.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter1();
		System.out.println("");
		System.out.println("ID Registro Arquivo: " + idRegistro);
		
		WebElement btnPrivado = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[4]/span"));
		
		btnPrivado.click();
		sleep(2000);
		
		waitExpectElement(btnAplicar);
		btnAplicar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnArquivosPublicos.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @data-id and @tabindex=\"0\"]")).size();
		String idRegistroPublico = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id]["+rows+"]/div[5]/div")).getText();
		
		System.out.println("");
		System.out.println("ID Arquivo Registro publico: " + idRegistroPublico);
		
		boolean sucesso = false;
		
		if(idRegistroPublico.equals(idRegistro)) {
			sucesso = true;
			idInserir2(idRegistroPublico);
			System.out.println("");
			System.out.println("Registro publico creado...");
		}else {
			System.out.println("");
			System.out.println("Registro publico no fue creado...");
		}
		
		
		return sucesso;
	}
	
	public boolean favorito() {
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnArquivos.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnArquivosPublicos.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter2();
		System.out.println("---");
		System.out.println("Id Registro Arquivo publico: " + idRegistro);
		
		WebElement favorito = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id=\""+idRegistro+"\"]/div[3]/span"));
		
		favorito.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		
		if(URL.contains("tp1")) {
			btnMeusArquivos = driver.findElement(By.xpath("//li[@identifier=\"accordion-item-my-digitalFile\"]"));
		}
		
		btnMeusArquivos.click();
		sleep(2000);
		
		sleep(3000);
		
		
		if(URL.contains("tp1")) {
			btnMeusFavoritoss = driver.findElement(By.xpath("//li[@identifier=\"accordion-item-favorite-digitalFile\"]"));
		}
		btnMeusFavoritoss.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		inputPesquisar.clear();
		inputPesquisar.sendKeys(idRegistro);
		inputPesquisar.sendKeys(Keys.ENTER);
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @data-id and @tabindex=\"0\"]")).size();
		
		boolean sucesso = false;
		
		if(rows > 0) {
			sucesso = true;
			idInserir3(idRegistro);
			System.out.println("");
			System.out.println("Pesquisar favoritos satisfactoriamente...");
		}else {
			System.out.println("");
			System.out.println("No se encontro favorito al pesquisar...");
		}
		
		return sucesso;
	}
	
	public ArrayList<Boolean> informacao() {		
		String idRegistro = idObter3();		
		System.out.println("ID REGISTRO: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement informacao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Informação\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		informacao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresa = driver.findElement(By.xpath("//div[@id=\"detail-description\"][3]/div[2]/div")).getText().trim();
		String estadoUF = driver.findElement(By.xpath("//div[@id=\"detail-description\"][4]/div[2]/div")).getText().trim();
		String filial = driver.findElement(By.xpath("//div[@id=\"detail-description\"][5]/div[2]/div")).getText().trim();
		
		String empresa1 = "1000";
		String estadoUF1 = "SP";
		String filial1 = "0001";
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresa.equals(empresa1));
		sucesso.add(estadoUF.equals(estadoUF1));
		sucesso.add(filial.equals(filial1));
		
		System.out.println("");
		System.out.println(sucesso);
		
		btnFecharPanel.click();

		return sucesso;
	}
	
	public boolean oficializarArquivo() {
		String idRegistro = idObter3();		
		System.out.println("ID REGISTRO: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnOficializarArquivo.click();
		sleep(3000);
		
		btnFecharPanelConfiguracoes.click();
		sleep(2000);
		
		btnBiblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		//String idRegistro1 = idObter4();	
		WebElement status = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[6]/span[@class=\"icon-font-Sign-and-Symbols icon-check-44\" and @tabindex=\"0\"]"));
		
		boolean sucesso = false;
		
		if(status.isDisplayed()) {
			sucesso = true;
			System.out.println("");
			System.out.println("Status comprobado...");
		}else {
			System.out.println("");
			System.out.println("Status no comprobado...");
		}
		
		return sucesso;
	}
	
	public ArrayList<Boolean> lixeira() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		abaConfiguracoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if(URL.contains("tp1")) {
			btnRaiz2.click();
		}
		
		if(URL.contains("tq1") || URL.contains("tc2")|| URL.contains("tq2")) {
			btnRaiz.click();
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String idRegistro = idObter4();	
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(1000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if(rows == 0) {
			System.out.println("");
			System.out.println("No se encontraron resultados...");
			sucesso.add(false);
		}else {
			sucesso.add(true);
		}
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement lixeira = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		lixeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pastaLixeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		excluir.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		abaLeiautes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if(URL.contains("tp1")) {
			btnRaiz2 = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper selected\")]/div/div/div/div/div/div/div[@class=\"folder-collapsed icon icon-font-File-and-Folders icon-Closedfolder\"]"));
			btnRaiz2.click();
		}
		
		if(URL.contains("tq1") || URL.contains("tc2")|| URL.contains("tq2")) {
			btnRaiz = driver.findElement(By.xpath("//div[contains(@class, \"baseTabs-view -view-wrapper selected\")]/div/div/div/div/div/div/div[@class=\"folder-collapsed icon icon-font-File-and-Folders icon-Closedfolder\"]"));
			btnRaiz.click();
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistroLeiaute = this.idRegistroNuevo;	
		inputPesquisar.clear();
		inputPesquisar.sendKeys(idRegistroLeiaute);
		inputPesquisar.sendKeys(Keys.ENTER);
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
				
		if(rows == 0) {
			System.out.println("");
			System.out.println("No se encontraron resultados...");
			sucesso.add(false);
		}else {
			sucesso.add(true);
		}
		
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroLeiaute+"\"]/div[1]/div"));
		lixeira = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroLeiaute+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		lixeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pastaLixeiraLeiaute.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id and @tabindex=\"0\"]")).size();
		String id = driver.findElement(By.xpath("//div[@class=\"tr\" and @tabindex=\"0\" and @data-id]["+rows+"]/div[5]/div")).getText();
		
		sucesso.add(id.equals(idRegistroLeiaute));
		System.out.println("");
		System.out.println(sucesso);
		return sucesso;
	}
}
