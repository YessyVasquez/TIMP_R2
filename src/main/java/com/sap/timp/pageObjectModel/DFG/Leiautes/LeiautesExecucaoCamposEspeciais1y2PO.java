package com.sap.timp.pageObjectModel.DFG.Leiautes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class LeiautesExecucaoCamposEspeciais1y2PO extends TestBaseKenssy {

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
	
	@FindBy(xpath = "//li[text()=\"Ajustes\"][1]")
	public WebElement opcGrupoEstructura1;
	
	@FindBy(xpath = "//li[contains(text(),\"Ajuste\")][1]")
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
	@FindBy(xpath = "//button[text()=\"Adicionar registro\"]")
	public WebElement adicionarRegistro;
		
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Nome do Bloco\"]")
	public WebElement nombreBloco;
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Nome do Registro\"]")
	public WebElement nombreRegistro;
	
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
	
	@FindBy(xpath = "//div/span[text()=\"Campos Especiais\"][1]")
	public WebElement abaCamposEspeciais;
	
	@FindBy(xpath = "//li[17]/div/div/span[contains(text(),\"Data/Hora da Execução do Arquivo\")][1]")
	public WebElement dataHoraExecucaco;
	
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
	
	@FindBy(xpath = "//input[@placeholder=\"Separadores\"]")
	public WebElement separadores2;
	
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
	@FindBy(xpath = "//div[@class=\"settingFolders-wrapper\"]")
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
	
	//LIXEIRA
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash-setting\"]")
	public WebElement pastaLixeira;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div/span/span[contains(@class,\"icon-layout\")]")
	public WebElement abaLeiautes;
	
	@FindBy(xpath = "//div[contains(text(),\"Nenhum resultado\")]")
	public WebElement resultado;
	
	public LeiautesExecucaoCamposEspeciais1y2PO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criarLeiaute() {
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
		boolean tq2 = false;
		String url = driver.getCurrentUrl();
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else if (url.contains("tq2")) {
			tq2 = true;
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
		
		if (tq1 == true ||tq2 == true) {
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
		
		if ((tq1 == true ||tq2 == true)) {
			opcGrupoEstructura.click();
			sleep(1000);
		}else if (tc2 ==true) {
			opcGrupoEstructura2.click();
			sleep(1000);
		}else {
			//CORREGIR AL EJECUTAR EN AMBIENTE
			opcGrupoEstructura1.click();
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
		sleep(2000);
		
		salvar.click();
		sleep(13000);
		
		
		if (tq1 == true && tc2 == true||tq2 == true) {
			sleep(3000);
			//waitExpectElement(gravar);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		int mensaje = driver.findElements(By.xpath("//span[contains(text(),\"O leiaute foi criado com sucesso\")]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensaje > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
	
	public ArrayList<Boolean>  separadores() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(20000);
		
		while (!separadores.isDisplayed()) {
			flecha.click();
		}
		sleep(50000);
		
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
		
		System.out.println("");
		System.out.println("------------------------BLOCOS Y REGISTROS-------------------");
		System.out.println("");
		
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		adicionarBloco.click();
		sleep(2000);
		
		adicionarRegistro.click();
		sleep(2000);
		
		nombreBloco.sendKeys("1");
		sleep(2000);
		
		nombreRegistro.sendKeys("1");
		sleep(2000);
		
		abaAjusteFiscais.click();
		sleep(2000);
		
		subAbaAjusteFiscais.click();
		sleep(2000);
		
		//ARRASTRAR ELEMENTOS
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(codigoEmpresa, driver.findElement(By.xpath("//div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(codigoFilial, driver.findElement(By.xpath("//div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(dataLanzamento, driver.findElement(By.xpath("//div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(valorAjuste, driver.findElement(By.xpath("//div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		
		abaCamposEspeciais.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(dataHoraExecucaco, driver.findElement(By.xpath("//div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		waitExpectElement(anio);
		sleep(2000);
		
		anio.click();
		sleep(2000);
		opcAnio.click();
		sleep(2000);
		
		mes.click();
		sleep(2000);
		opcMes.click();
		sleep(2000);
		
		dia.click();
		sleep(2000);
		opcDia.click();
		sleep(2000);
		
		hora.click();
		sleep(2000);
		opcHora.click();
		sleep(2000);
		
		minutos.click();
		sleep(2000);
		opcMinutos.click();
		sleep(2000);
		
		segundos.click();
		sleep(2000);
		opcSegundos.click();
		sleep(2000);
		
		ff.click();
		sleep(2000);
		opcFF.click();
		sleep(2000);
		
		separadores2.sendKeys(":");
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(contadorLinhas, driver.findElement(By.xpath("//div[@class=\"columns-container\"]/div")));
		sleep(2000);
		
		waitExpectElement(aplicar);
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
		sleep(3000);
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
		System.out.println("Nome: " + nomeT.contains("Teste Automatizado"));
		System.out.println("Tipo: " + tipoTE.contains("ALTER E-SOCIAL S1200"));
		
		sucesso.add(versaoT.equals("1.0"));
		sucesso.add(nomeT.contains("Teste Automatizado"));
		if (tc2==true) {
			sucesso.add(tipoTE.contains("DCTF"));
		}else {
			sucesso.add(tipoTE.contains("ALTER E-SOCIAL S1200"));
		}
		
		
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
		sleep(2000);
		
		raizConfiguracao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
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
		sleep(6000);
		
		versaoConfiguracao.click();
		sleep(1000);
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
			//FALTAN OPCIONES
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
			//COLOCAR XPATH CORRECTO
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
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(3000);
		
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

	public ArrayList<Boolean> executar() {
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
//		sleep(2000);
//		abaConfiguracao.click();
//		sleep(2000);
//		
//		raizConfiguracao.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		siguiente.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		///
		String idSPED = idObter2();
		//String idSPED = "15680";
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idSPED+"\"]/div[1]/div"));
		WebElement executar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idSPED+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		executar.click();
		sleep(3000);
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
		
		execucao1.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(cargarExecucao);
		sleep(3000);
		
		visualizarDados2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		
		String data1V = data1.getText();
		String Lineas1V =  lihnas1.getText();
		
		System.out.println("-----Visualizar LINEAS Y DATA----------");
		System.out.println("Data Arquivo: "+ data1V);
		System.out.println("cantLineas V: "+ Lineas1V);
		
		visualizarDados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		//VISUALIZAR
		int cantData = driver.findElements(By.xpath("//input[@placeholder=\"Data/Hora de Execução\"]")).size();
		System.out.println("Cantidad de Data:"+cantData);
		
		String dataArquivoV = dataArquivo.getAttribute("value");
		String canLineas1V =  cantidadLinhas1.getAttribute("value");
		String canLineas2V =  cantidadLinhas2.getAttribute("value");
		
		System.out.println("-----Visualizar SPED----------");
		System.out.println("Data Arquivo: "+ dataArquivoV);
		System.out.println("cantLineas 1 V: "+ canLineas1V);
		System.out.println("cantLineas 2 V: "+ canLineas2V);
	
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		sucesso.add(dataArquivoV.contains(data1V));
		sucesso.add(canLineas2V.contains(Lineas1V));
		
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
		sleep(2000);
		
		
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
		
		if (exclucao > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
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
		sleep(2000);
		
		

		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"O arquivo foi movido a la lixeira com sucesso\")]")).size();
		System.out.println(exclucao);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (exclucao > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		driver.navigate().refresh();
		sleep(3000);
		waitExpectElement(abaLeiautes);
		sleep(2000);
//		pesquisar.clear();
//		sleep(2000);
		
		abaLeiautes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		pesquisar.sendKeys(idLeiaute);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		
		if (resultado.isDisplayed()) {
			exclucao = driver.findElements(By.xpath("//div[@class=\"tr-no-data\"]/div[contains(text(),\"Nenhum resultado\")]")).size();
			//exclucao = driver.findElements(By.xpath("//div[@class=\"tr-no-data\"]/div[contains(text(),\"Nenhum resultado\")]")).size();
			//div[@class="tr-no-data" and not (@tabindex="0")]/div[contains(text(),"Nenhum resultado")]
		}
		
		System.out.println(exclucao);
		
		if (exclucao > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
	}
}
