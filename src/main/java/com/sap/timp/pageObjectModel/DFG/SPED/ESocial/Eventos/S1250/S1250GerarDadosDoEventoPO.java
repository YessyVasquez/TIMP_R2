package com.sap.timp.pageObjectModel.DFG.SPED.ESocial.Eventos.S1250;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;

public class S1250GerarDadosDoEventoPO extends TestBaseFernando{
	@FindBy(xpath = "//span[@class=\"icon icon-font-File-and-Folders icon-gooddoc padding-right \"]")
	public WebElement sped;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-e-social\"]")
	public WebElement eSocial;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-events\"]")
	public WebElement eventos;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-s1250\"]")
	public WebElement s12150AcquisitionOfRuralProduction;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-s1250\"]/ul/li[@identifier=\"accordion-item-scanc-calculationBlocks\"]/div/span[text()=\"Gerar Dados do Evento\"]")
	public WebElement gerarDadosDoEvento;

	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;

	@FindBy(xpath = "//span[text()=\"Novo Evento S1250\"]")
	public WebElement btnNovoEvento;

	@FindBy(xpath = "//div[contains(@class, \"name-input\")]/div/div/input")
	public WebElement nome;

	@FindBy(xpath = "//div[@id=\"textareaDescription\"]/div/textarea")
	public WebElement descricao;

	@FindBy(xpath = "//div[contains(@class,\"layout-select\")]/div/div[2]")
	public WebElement cboLeiaute;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and contains(@class, \"list-item\") and text()=\"ID7673-E-SOCIAL(GERAR S1250) - TA - NÃO MEXER\"]")
	public WebElement opcionLeiaute;

	@FindBy(xpath = "//div[contains(@class,\"version-select\")]/div/div/div[2]")
	public WebElement cboVersaoLeiaute;

	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcionCombo;

	@FindBy(xpath = "//div[contains(@class,\"tax-select\")]/div/div[2]")
	public WebElement cboTributo;

	@FindBy(xpath = "//li[@tabindex=\"0\" and @class=\"list-item visible\" and text()=\"ICMS\"]")
	public WebElement opcionTributo;

	@FindBy(xpath = "//div[contains(@class, \"company-select\")]/div/div/div[2]")
	public WebElement cboEmpresa;

	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"1000\"]")
	public WebElement opcionEmpresa;

	@FindBy(xpath = "//div[contains(@class, \"uf-select\")]/div/div/div[2]")
	public WebElement cboUf;

	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"SP\"]")
	public WebElement opcionUf;

	@FindBy(xpath = "//div[contains(@class, \"branch-select\")]/div/div/div[2]")
	public WebElement cboFilial;

	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"1000 - 0001\"]")
	public WebElement opcionFilial;

	@FindBy(xpath = "//div[contains(@class,\"valid-from-select\")]/div/div/input")
	public WebElement inputDataInicioVigencia;

	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement btnSalvar;

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrarPanelInformacao;

	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement btnFechar;

	@FindBy(xpath = "//button[text()=\"Editar\"]")
	public WebElement btnEditar;

	@FindBy(xpath = "//div[@id=\"inputState\"]/div/div/div[2]")
	public WebElement cboEstado;

	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"SP\"]")
	public WebElement opcionEstado;

	@FindBy(xpath = "//div[@id=\"subPeriodPic\"]/div/div/span")
	public WebElement inputSubperiodo;

	@FindBy(xpath = "//div[@id=\"settings-execute\"]/button/span[text()=\"Executar\"]")
	public WebElement btnExecutar;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;

	@FindBy(xpath = "//span[text()=\"Atualizar Estrutura\"]")
	public WebElement btnAtualizarEstrutura;

	@FindBy(xpath = "//span[text()=\"Visualizar AN3\"]")
	public WebElement btnVisualizarN3;

	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome de Arquivo\"]")
	public WebElement nomeArquivoAN3;

	@FindBy(xpath = "//div[@class=\"rule-input\"]/div/div/div[2]")
	public WebElement cboRegras;

	@FindBy(xpath = "//div[@class=\"list-option\"]/div[@class=\"list-item\"]/div[@class=\"list-item-text\"]")
	public WebElement opcionRegras;

	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement btnCriar;

	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;

	@FindBy(xpath = "//div[@class=\"table-container\"]/div/div[2]/div/div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPaginaAtualizacoes;

	String horaExecucao = "";

	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement btnHome;

	@FindBy(xpath = "//span[@class=\"icon icon-font-File-and-Folders icon-docversion padding-right \"]")
	public WebElement btnArquivos;

	@FindBy(xpath = "//div[@class=\"baseTabs-view -view-wrapper  selected\"]/div/div/div/div")
	public WebElement btnRaiz;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-s1250-insert\"]")
	public WebElement s1250Insert;
	
	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement btnFiltrosAvanzados;
	
	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement btnLimpiarFiltros;

	String nomeString1 = "";
	String descricaoString1 = "";
	String empresaString1 = "";
	String ufString1 = "";
	String filialString1 = "";

	public S1250GerarDadosDoEventoPO() {
		PageFactory.initElements(driver, this);
	}

	public boolean criarNovoEvento() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sped.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		eSocial.click();
		sleep(1000);
		eventos.click();
		sleep(1000);
		s12150AcquisitionOfRuralProduction.click();
		sleep(1000);
		actionsMoveToElementElement(gerarDadosDoEvento);
		gerarDadosDoEvento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		// conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = "0";

		if (rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["	+ rows + "]/div[3]/div")).getText();
		}

		System.out.println("ID: " + id);
		sleep(2000);

		btnNovoEvento.click();
		sleep(1000);

		waitExpectElement(nome);
		nome.sendKeys("TESTE AUTOMATIZADO");
		sleep(1000);

		descricao.sendKeys("TESTE AUTOMATIZADO");
		sleep(1000);

		cboLeiaute.click();
		sleep(1000);
		opcionLeiaute.click();
		sleep(1000);

		cboVersaoLeiaute.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);

		actionsMoveToElementElement(inputDataInicioVigencia);
		cboTributo.click();
		sleep(1000);
		opcionTributo.click();
		sleep(1000);

		attributeToBeXpath("//div[contains(@class, \"company-select\")]/div", "class", "base-MultipleSelect3 required");
		cboEmpresa.click();
		sleep(1000);
		opcionEmpresa.click();
		closeSelectTypeCheckbox(cboEmpresa);
		sleep(1000);

		attributeToBeXpath("//div[contains(@class, \"uf-select\")]/div", "class", "base-MultipleSelect3 required");
		cboUf.click();
		sleep(1000);
		opcionUf.click();
		closeSelectTypeCheckbox(cboUf);
		sleep(1000);

		attributeToBeXpath("//div[contains(@class, \"branch-select\")]/div", "class", "base-MultipleSelect3 required");
		cboFilial.click();
		sleep(1000);
		opcionFilial.click();
		closeSelectTypeCheckbox(cboFilial);
		sleep(1000);

		inputDataInicioVigencia.click();
		inputDataInicioVigencia.sendKeys("01/01/2013");
		sleep(1000);

		btnSalvar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		boolean sucesso = false;

		if (rows == 0) {
			return sucesso = true;
		}

		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[3]/div")).getText();
		idInserir4(idB);

		sleep(2000);
		System.out.println("ID Primer registro: " + id);
		System.out.println("ID Ultimo registro: " + idB);

		double idD = Integer.valueOf(id);
		double idBD = Integer.valueOf(idB);

		// compara pra ver se o novo id criado é realmente o ultimo

		if (idBD > idD) {
			sucesso = true;
		} else {
			sucesso = false;
		}

		return sucesso;
	}

	public ArrayList<Boolean> informacao() {
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter4();
		System.out.println("");
		System.out.println("Id Registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Informação\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		// Datos informacao
		String nomeInformacao = driver.findElement(By.xpath("//div[@id=\"detail-description\"][2]/div[2]/div")).getText();
		String descricaoInformacao = driver.findElement(By.xpath("//div[@id=\"detail-description\"][3]/div[2]/div")).getText();

		System.out.println("");
		System.out.println("----DATOS INFORMACAO");
		System.out.println("Nome: " + nomeInformacao);
		System.out.println("Descricao: " + descricaoInformacao);

		sleep(1000);
		btnCerrarPanelInformacao.click();
		sleep(1000);

		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		// Datos Visualizar
		String nomeVisualizar = nome.getAttribute("value");
		String descricacoVisualizar = descricao.getAttribute("value");

		System.out.println("");
		System.out.println("----DATOS VISUALIZAR");
		System.out.println("Nome: " + nomeVisualizar);
		System.out.println("Descricao: " + descricacoVisualizar);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(nomeVisualizar.equals(nomeInformacao));
		sucesso.add(descricacoVisualizar.equals(descricaoInformacao));

		btnFechar.click();

		return sucesso;
	}

	public boolean editar() {
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter4();
		System.out.println("");
		System.out.println("Id Registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		attributoNotToBeEmptyElement(nome, "value");
		nome.clear();
		sleep(2000);

		String valorNuevo = "TESTE AUTOMATIZADO I";
		nome.sendKeys(valorNuevo);

		btnEditar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

//		WebElement btnCerrarMensaje = driver.findElement(By.xpath("//span[@class=\"close icon icon-font-Sign-and-Symbols icon-persign\"]"));
//		if(btnCerrarMensaje.isDisplayed()) {
//			btnCerrarMensaje.click();
//		}		

		actionsMoveToElementElement(gerarDadosDoEvento);
		gerarDadosDoEvento.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		attributoNotToBeEmptyElement(nome, "value");
		String valorEditado = nome.getAttribute("value");

		// Agarro los valores para compararlos con en graarAN3
		this.nomeString1 = nome.getAttribute("value");
		this.descricaoString1 = descricao.getAttribute("value");
		this.empresaString1 = driver.findElement(By.xpath("//div[contains(@class, \"company-select\")]/div/div/div/div/div/div[1]")).getText();
		this.ufString1 = driver.findElement(By.xpath("//div[contains(@class, \"uf-select\")]/div/div/div/div/div/div[1]")).getText();
		this.filialString1 = driver.findElement(By.xpath("//div[contains(@class, \"branch-select\")]/div/div/div/div/div/div[1]")).getText();

		boolean sucesso = false;

		if (valorEditado.equals(valorNuevo)) {
			sucesso = true;
		}

		btnFechar.click();

		return sucesso;
	}

	public ArrayList<Boolean> visualizar() {
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter4();
		System.out.println("");
		System.out.println("Id Registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		// Datos Visualizar
		String nomeString = nome.getAttribute("value");
		String descricaoString = descricao.getAttribute("value");
		String leiauteString = driver.findElement(By.xpath("//div[contains(@class, \"layout-select\")]/div/div/input")).getAttribute("value");
		String versaoLeiauteString = driver.findElement(By.xpath("//div[contains(@class, \"version-select\")]/div/div/div/input")).getAttribute("value");
		String tributoString = driver.findElement(By.xpath("//div[contains(@class, \"tax-select\")]/div/div/input")).getAttribute("value");
		String empresaString = driver.findElement(By.xpath("//div[contains(@class, \"company-select\")]/div/div/div/div/div/div[1]")).getText();
		String ufString = driver.findElement(By.xpath("//div[contains(@class, \"uf-select\")]/div/div/div/div/div/div[1]")).getText();
		String filialString = driver.findElement(By.xpath("//div[contains(@class, \"branch-select\")]/div/div/div/div/div/div[1]")).getText();
		String dataInicioVigenciaString = driver.findElement(By.xpath("//div[contains(@class, \"valid-from-select\")]/div/div/input")).getAttribute("value");

		System.out.println("");
		System.out.println("----DATOS VISUALIZAR");
		System.out.println("Nome: " + nomeString);
		System.out.println("Descricao: " + descricaoString);
		System.out.println("Leiaute: " + leiauteString);
		System.out.println("Versao Leiaute: " + versaoLeiauteString);
		System.out.println("Tributo: " + tributoString);
		System.out.println("Empresa: " + empresaString);
		System.out.println("UF: " + ufString);
		System.out.println("Filial: " + filialString);
		System.out.println("Data dee inicio de vigencia: " + dataInicioVigenciaString);

		sleep(2000);
		btnFechar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		// Datos Editar
		String nomeString1 = nome.getAttribute("value");
		String descricaoString1 = descricao.getAttribute("value");
		String leiauteString1 = driver.findElement(By.xpath("//div[contains(@class, \"layout-select\")]/div/div/input")).getAttribute("value");
		String versaoLeiauteString1 = driver.findElement(By.xpath("//div[contains(@class, \"version-select\")]/div/div/div/input")).getAttribute("value");
		String tributoString1 = driver.findElement(By.xpath("//div[contains(@class, \"tax-select\")]/div/div/input")).getAttribute("value");
		String empresaString1 = driver.findElement(By.xpath("//div[contains(@class, \"company-select\")]/div/div/div/div/div/div[1]")).getText();
		String ufString1 = driver.findElement(By.xpath("//div[contains(@class, \"uf-select\")]/div/div/div/div/div/div[1]")).getText();
		String filialString1 = driver.findElement(By.xpath("//div[contains(@class, \"branch-select\")]/div/div/div/div/div/div[1]")).getText();
		String dataInicioVigenciaString1 = driver.findElement(By.xpath("//div[contains(@class, \"valid-from-select\")]/div/div/input")).getAttribute("value");

		System.out.println("");
		System.out.println("----DATOS EDITAR");
		System.out.println("Nome: " + nomeString1);
		System.out.println("Descricao: " + descricaoString1);
		System.out.println("Leiaute: " + leiauteString1);
		System.out.println("Versao Leiaute: " + versaoLeiauteString1);
		System.out.println("Tributo: " + tributoString1);
		System.out.println("Empresa: " + empresaString1);
		System.out.println("UF: " + ufString1);
		System.out.println("Filial: " + filialString1);
		System.out.println("Data dee inicio de vigencia: " + dataInicioVigenciaString1);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(nomeString1.equals(nomeString1));
		sucesso.add(descricaoString1.equals(descricaoString));
		sucesso.add(leiauteString1.equals(leiauteString));
		sucesso.add(versaoLeiauteString1.equals(versaoLeiauteString));
		sucesso.add(tributoString1.equals(tributoString));
		sucesso.add(empresaString1.equals(empresaString));
		sucesso.add(ufString1.equals(ufString));
		sucesso.add(filialString1.equals(filialString));
		sucesso.add(dataInicioVigenciaString1.equals(dataInicioVigenciaString));

		System.out.println("");
		System.out.println(sucesso);

		btnFechar.click();

		return sucesso;
	}

	public void execucao() {
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter4();
		System.out.println("");
		System.out.println("Id Registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

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
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		WebElement monthCalendar = driver.findElement(By.xpath("//div[@tabindex=\"0\" and contains(@class, \"month\") and text()=\"Jan\"]"));
		monthCalendar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		WebElement subperiodoCalendar = driver.findElement(By.xpath("//span[@class=\"subperiod-text\" and text()=\"1M\"]"));
		subperiodoCalendar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		WebElement cbkCentralizacaoDeMovimento = driver.findElement(By.xpath("//div[contains(@class, \"movementCentralization\")][2]/label/span"));
		cbkCentralizacaoDeMovimento.click();
		sleep(2000);

		btnExecutar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(3000);
		waitExpectXpath("//div[@class=\"dialog-indicator\"]");
		invisibilityOfElement("//div[@class=\"dialog-indicator\"]");
		sleep(2000);
	}

	public boolean gravar() {
		btnGravar.click();
		sleep(3000);
		// Verificar si es guardado con exito, si no se va quedar esperando por el
		// waitExpectXpath
		waitExpectXpath("//li[@class=\"base-toast  toast-success   \"]");
		String mensajeSucesso = driver.findElement(By.xpath("//li[@class=\"base-toast  toast-success   \"]/div/span[2]/span")).getText();
		invisibilityOfElement("//li[@class=\"base-toast  toast-success   \"]");
		sleep(2000);

		String valorSucessoString = "Arquivo emitido com sucesso";

		boolean sucesso = false;

		if (mensajeSucesso.contains(valorSucessoString)) {
			sucesso = true;
		}

		return sucesso;
	}

	public boolean atualizarEstructuras() {
		btnAtualizarEstrutura.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		LocalDateTime locaDate = LocalDateTime.now();

		int hours = locaDate.getHour();
		int minutes = locaDate.getMinute();

		if (hours > 12) {
			hours = hours - 12;
		}

		System.out.println("Hora actual: " + hours + ":" + minutes);
		this.horaExecucao = hours + ":" + minutes;

		sleep(2000);

		// Verificar si es actulizado con exito, si no se va quedar esperando por el
		// waitExpectXpath
		sleep(3000);
		waitExpectXpath("//li[@class=\"base-toast  toast-success         \"]");
		String mensajeSucesso = driver.findElement(By.xpath("//li[@class=\"base-toast  toast-success         \"]/div/span[2]/span")).getText();
		invisibilityOfElement("//li[@class=\"base-toast  toast-success         \"]");
		sleep(2000);

		String valorSucessoString = "Submetido com sucesso";

		boolean sucesso = false;

		if (mensajeSucesso.contains(valorSucessoString)) {
			sucesso = true;
		}

		return sucesso;
	}

	public boolean visualizarCriarAN3() {
		btnVisualizarN3.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		nomeArquivoAN3.sendKeys("TESTE AUTOMATIZADO");
		sleep(1000);

		cboRegras.click();
		sleep(1000);
		opcionRegras.click();
		closeSelectTypeCheckbox(cboRegras);
		sleep(1000);

		btnCriar.click();

		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		boolean regrasExecutroElement = driver.findElement(By.xpath("//div[@class=\"executor-wrapperan3\"]")).isDisplayed();
		boolean sucesso = false;

		if (regrasExecutroElement) {
			sucesso = true;
		}

		sleep(2000);
		btnBiblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		return sucesso;
	}

	public boolean visualizarActualizacoes() {
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		WebElement btnUltimaPagina = driver.findElement(By.xpath("//div[contains(@class,\"icon-right\")][2]"));
		btnUltimaPagina.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter4();
		System.out.println("");
		System.out.println("Id Registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar Atualizações\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPaginaAtualizacoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver.findElements(By.xpath("//div[@class=\"export-sped-files-dialog\"]/div[@class=\"table-container\"]/div/div/div/div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @data-id and @tabindex=\"0\"]")).size();
		System.out.println("");
		System.out.println("Rows visualizar Atualizacoes: " + rows);

		String horaExecucaoString = driver.findElement(By.xpath("//div[@class=\"export-sped-files-dialog\"]/div[@class=\"table-container\"]/div/div/div/div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @data-id and @tabindex=\"0\"]["	+ rows + "]/div[9]/div")).getText();
		System.out.println("Hora execucao ultimo registro de atualizacoes: " + horaExecucaoString);

		boolean sucesso = false;

		if (horaExecucaoString.contains(this.horaExecucao)) {
			sucesso = true;
		}

		btnFechar.click();

		return sucesso;
	}

	public ArrayList<Boolean> gravarAN3() {
		sleep(2000);
		btnHome.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		AcessarDFGPO acessarDFGPO = new AcessarDFGPO();
		acessarDFGPO.acessarDFG();

		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnArquivos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnRaiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver.findElements(By.xpath("//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @data-id and @tabindex=\"0\"]")).size();

		String nomeString = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[7]/div")).getText();
		String descricaoString = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[8]/div")).getText();
		String empresaString = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+ rows + "]/div[10]/div")).getText();
		String ufString = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[11]/div")).getText();
		String filialString = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[12]/div")).getText();

		System.out.println("");
		System.out.println("DATOS RAIZ");
		System.out.println("Nome: " + nomeString);
		System.out.println("Descricao: " + descricaoString);
		System.out.println("Empresa: " + empresaString);
		System.out.println("UF: " + ufString);
		System.out.println("Filial: " + filialString);

		System.out.println("");
		System.out.println("DATOS DEL REGISTRO");
		System.out.println("Nome: " + this.nomeString1);
		System.out.println("Descricao: " + this.descricaoString1);
		System.out.println("Empresa: " + this.empresaString1);
		System.out.println("UF: " + this.ufString1);
		System.out.println("Filial: " + this.filialString1);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(nomeString.contains(this.nomeString1));
		sucesso.add(descricaoString.equals(this.descricaoString1));
		sucesso.add(empresaString.equals(this.empresaString1));
		sucesso.add(ufString.equals(this.ufString1));
		sucesso.add(this.filialString1.contains(filialString));

		System.out.println("");
		System.out.println(sucesso);

		return sucesso;
	}

	public ArrayList<Boolean> informacao2() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sped.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		eSocial.click();
		sleep(1000);
		eventos.click();
		sleep(1000);
		s12150AcquisitionOfRuralProduction.click();
		sleep(1000);
		actionsMoveToElementElement(s1250Insert);
		s1250Insert.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnFiltrosAvanzados.click();
		sleep(2000);
		btnLimpiarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String id = "12";
		String eventID = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"" + id + "\"]/div[4]/div")).getText();

		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"" + id + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"" + id + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Informação\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idInformacao = driver.findElement(By.xpath("//div[@id=\"detail-description\"][1]/div[2]/div")).getText();
		String idEvento = driver.findElement(By.xpath("//div[@id=\"detail-description\"][2]/div[2]/div")).getText();

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(idInformacao.equals(id));
		sucesso.add(idEvento.equals(eventID));

		System.out.println("");
		System.out.println(sucesso);

		btnCerrarPanelInformacao.click();

		return sucesso;
	}

	public boolean enviarSeleccionado() {
		String id = "12";
		WebElement checkbox = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\"" + id + "\"]/div[2]/label/span"));

		checkbox.click();

		WebElement btnEnviarSeleccionado = driver.findElement(By.xpath("//span[text()=\"Enviar selecionado\"]"));
		btnEnviarSeleccionado.click();

		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String verificadoSucesso = "Arquivos Enviados";

		waitExpectXpath("//ul[@class=\"base-toast-list\"]/li/div/span[2]/span");
		String mensajeResultado = driver.findElement(By.xpath("//ul[@class=\"base-toast-list\"]/li/div/span[2]/span")).getText();

		boolean sucesso = false;

		if (mensajeResultado.contains(verificadoSucesso)) {
			sucesso = true;
		}

		sleep(3000);

		return sucesso;
	}

	public boolean enviarPendencias() {
		WebElement btnEnviarSeleccionado = driver.findElement(By.xpath("//span[text()=\"Enviar pendências\"]"));
		btnEnviarSeleccionado.click();

		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String verificadoSucesso = "Arquivos Enviados";

		waitExpectXpath("//ul[@class=\"base-toast-list\"]/li/div/span[2]/span");
		String mensajeResultado = driver.findElement(By.xpath("//ul[@class=\"base-toast-list\"]/li/div/span[2]/span")).getText();

		boolean sucesso = false;

		if (mensajeResultado.contains(verificadoSucesso)) {
			sucesso = true;
		}

		sleep(3000);

		return sucesso;
	}
}
