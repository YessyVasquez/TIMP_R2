package com.sap.timp.pageObjectModel.DFG.AN4;
import java.security.MessageDigest;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;
import com.sap.timp.pageObjectModel.DFG.AcessarDFGPO;

public class AN4FuncionalidadesPO 	extends TestBaseMassiel{
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view-wrapper\"]/div /div[1]/div/div[1]/div/div[1]")
	public WebElement raiz;
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view-wrapper\"]/div /div[1]/div/div[1]/div/div[1]")
	public WebElement raiz2;
	
	@FindBy(xpath = "//div[@class=\"base-pagination-wrapper\"]/div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[text()=\"Novo Leiaute\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[4]/div[2]/div/div/input")
	public WebElement nombre;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[6]/div[2]/div/div[1]/div[2]")
	public WebElement tipo;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[7]/div[2]/div/div[1]/div[2]")
	public WebElement grupoEstructura;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[8]/div[2]/div/div[1]/div[2]")
	public WebElement estructura;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[10]/div[2]/div/div/input")
	public WebElement fechainicioVigencia;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[10]/div[2]/div/div[1]/span")
	public WebElement fechainicioVigencia1;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[12]/div[2]/div/div/input")
	public WebElement versao;
	
	@FindBy(xpath = "//div[@class=\"dialog-buttons\"]/button[2]")
	public WebElement salvar;
	
	@FindBy(xpath = "//div[@id=\"toolbarSecund\"]/div/div/ul/li[6]/button")
	public WebElement separadorbutton;
	
	@FindBy(xpath = "//div[@id=\"toolbarSecund\"]/div/ul/li[2]")
	public WebElement flecha;
	
	@FindBy(xpath = "//div[@id=\"inputSeparator\"]/div/div/input")
	public WebElement separador;
	
	@FindBy(xpath = "//div[@id=\"chkBol\"]/div/label/span")
	public WebElement inicioLinha;
	
	@FindBy(xpath = "//div[@id=\"chkEol\"]/div/label/span")
	public WebElement fimLinha;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;

	@FindBy(xpath = "//span[text()=\"Adicionar bloco\"]")
	public WebElement adicionarBloco;
	
	@FindBy(xpath = "//button[text()=\"Adicionar registro\"]")
	public WebElement adicionarRegistro;
	
	@FindBy(xpath = "//div[@class=\"block-inner-header\"]/div[2]/div/div[2]/div/div/div[2]/input")
	public WebElement blocoNome;
	
	@FindBy(xpath = "//div[@class=\"record-inner-header\"]/div[2]/div/div[2]/div/div/div[2]/input")
	public WebElement registroNome;
	
	@FindBy(xpath = "//span[text()=\"Ajustes Fiscais\"][1]")
	public WebElement ajusteFiscal;
	
	@FindBy(xpath = "//span[text()=\"Ajustes\"]")
	public WebElement ajuste;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[2]/div[2]/ul/li[1]/div[2]/ul/li[2]")
	public WebElement codigoEmpresa;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[2]/div[2]/ul/li[1]/div[2]/ul/li[3]")
	public WebElement codigoFilial;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[2]/div[2]/ul/li[1]/div[2]/ul/li[5]")
	public WebElement dataLancamento;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[2]/div[2]/ul/li[1]/div[2]/ul/li[14]")
	public WebElement valorAjuste;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim2;
	
	@FindBy(xpath = "//div[@id=\"justification\"]/div/textarea")
	public WebElement justificar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement no;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	//-------------- BRE 
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N4\"]")
	public WebElement regra;
	
	@FindBy(xpath = "//span[text()=\"Nova Regra\"]")
	public WebElement novoRegra;
	
	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[2]/td[2]/div/div/input ")
	public WebElement nomeRegra;
	
	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[4]/td[2]/div/div/div[2] ")
	public WebElement tipoRegra;
	
	@FindBy(xpath = "//table[@class=\"create-rule-form\"]/tbody/tr[5]/td[2]/div/div[2] ")
	public WebElement componente;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div[2]")
	public WebElement componentetc2;
	
	
	@FindBy(xpath = "//div[@class=\"base-MultipleSelect3 required\"]/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//td[@class=\"datastructureCategoryReference-field\"]/div/div/div[2]")
	public WebElement grupoEstructuraReferencia;
	
	@FindBy(xpath = "//td[@class=\"datastructureReference-field\"]/div/div/div[2]")
	public WebElement EstructuraDatosReferencia;

	@FindBy(xpath = "//td[@class=\"datastructureCategoryComparison-field\"]/div/div/div[2]")
	public WebElement grupoEstructuraComparacao;
	
	@FindBy(xpath = "//td[@class=\"datastructureComparison-field\"]/div/div/div[2]")
	public WebElement EstructuraDatosComparacao;
	
	@FindBy(xpath = "//td[@class=\"layoutReference-field\"]/div/div/div[2]")
	public WebElement primeroLeiaute;
	
	@FindBy(xpath = "//td[@class=\"layoutVersionReference-field\"]/div/div/div[2]")
	public WebElement versaoLeiauteReferencia;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement versaoLeiauteOPC;

	@FindBy(xpath = "//td[@class=\"layoutComparison-field\"]/div/div/div[2]")
	public WebElement segundoLeiaute;
	
	@FindBy(xpath = "//td[@class=\"layoutVersionComparison-field\"]/div/div/div[2]")
	public WebElement versaoLeiauteComparacao;
	
	@FindBy(xpath = "//td[@class=\"specialReference-field\"]/div/div/div[2]")
	public WebElement caracteristicaEspacialReferencia;
	
	@FindBy(xpath = "//td[@class=\"specialComparison-field\"]/div/div/div[2]")
	public WebElement caracteristicaEspacialComparacao;
	
	@FindBy(xpath = "//li[@id=\"option-3\"]")
	public WebElement caracteristicasOPC;
	
	@FindBy(xpath = "//td[@class=\"EffectiveDateFrom\"]/div/div[1]/input")
	public WebElement validaDe;
	
	@FindBy(xpath = "//td[@class=\"EffectiveDateFrom\"]/div/div[1]/span")
	public WebElement validaDe1;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement camino;
	
	@FindBy(xpath = "//div[@class=\"main-content\"]/div/div[1]/div/div/div/div[4]/div[1]/ul/li/ul/li/div")
	public WebElement registroPrimerDato;

	@FindBy(xpath = "//div[@class=\"main-content\"]/div/div[3]/div/div/div/div[4]/div[1]/ul/li/ul/li/div")
	public WebElement registroSegundoDato;
	
	@FindBy(xpath = "//div[@class=\"main-content\"]/div/div[1]/div/div/div/div[4]/div[1]/ul/li/ul/li/ul/li[4]")
	public WebElement valorAjustePrimerDato;
	
	@FindBy(xpath = "//div[@class=\"main-content\"]/div/div[3]/div/div/div/div[4]/div[1]/ul/li/ul/li/ul/li[4]")
	public WebElement valorAjusteSegundoDato;
	
	@FindBy(xpath = "//div[@class=\"message-wrapper\"]/div/div/div/input")
	public WebElement mensaje;
	
	@FindBy(xpath = "//div[@class=\"areaCondition\"]/div[2]/div/div/div[2]")
	public WebElement operador;
	
	@FindBy(xpath = "//li[@id=\"option-2\"]")
	public WebElement operadorOPC;
	
	// DFG
	@FindBy(xpath = "//div[@class=\"container-tabs\"]/div[2]")
	public WebElement abaConfiguraciones;
	
	@FindBy(xpath = "//span[text()=\"Nova Configuração\"]")
	public WebElement novoConfiguracoe;
	
	@FindBy(xpath = "//div[@id=\"inputTextFileName\"]/div/div/input")
	public WebElement nomeConfiguracoe;
	
	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement primerLeiauteConfiguracoe;
	
	@FindBy(xpath = "//div[@id=\"inputTimpVersion\"]/div/div/div[2]")
	public WebElement versaoConfiguracoe;
	
	@FindBy(xpath = "//div[@id=\"inputSelectTax\"]/div/div/div[2]")
	public WebElement tributoConfiguracoe;
	
	@FindBy(xpath = "//li[@id=\"option-17\"]")
	public WebElement tributoConfiguracoeOPC;
	
	@FindBy(xpath = "//div[@id=\"inputSelectCompany\"]/div/div/div[2]")
	public WebElement empresaConfiguracoe;
	
	@FindBy(xpath = "//div[@id=\"1000\"]")
	public WebElement empresaConfiguracoeOPC;
	
	@FindBy(xpath = "//div[@id=\"inputSelectState\"]/div/div/div[2]")
	public WebElement ufConfiguracoe;
	
	@FindBy(xpath = "//div[@id=\"SP\"]")
	public WebElement ufConfiguracoeOPC;
	
	@FindBy(xpath = "//div[@id=\"inputSelectFilial\"]/div/div/div[2]")
	public WebElement filialConfiguracoe;
	
	@FindBy(xpath = "//div[@id=\"1000SP0001\"]")
	public WebElement filialConfiguracoeOPC;
	
	@FindBy(xpath = "//div[@id=\"inputValidFrom\"]/div/div[1]/input")
	public WebElement fechaConfiguracoe;
	
	@FindBy(xpath = "//div[@id=\"inputValidFrom\"]/div/div[1]/span")
	public WebElement fechaConfiguracoeSpan;
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvarConfiguracoe;
	
	// Executar
	
	@FindBy(xpath = "//div[@id=\"settings-execute\"]/button")
	public WebElement executarConfiguracao;
	
	@FindBy(xpath = "//div[@id=\"inputState\"]/div/div/div[2]")
	public WebElement estado;
	
	@FindBy(xpath = "//div[@id=\"inputState\"]/div/div/div/div/div/div[1]")
	public WebElement estadoInput;
	
	@FindBy(xpath = "//div[@id=\"SP\"]")
	public WebElement estadoOPC;
	
	@FindBy(xpath = "//div[@id=\"subPeriodPic\"]/div/div/span")
	public WebElement calendario;
	
	@FindBy(xpath = "//div[@id=\"subPeriodPic\"]/div/div/input")
	public WebElement calendarioInput;
	
	@FindBy(xpath = "//div[@class=\"title-wrapper\"]/div[1]")
	public WebElement flechacalendario;
	
	@FindBy(xpath = "//div[text()=\"2016\"]")
	public WebElement anio;
	
	@FindBy(xpath = "//div[text()=\"Jan\"]")
	public WebElement mes;
	
	@FindBy(xpath = "//div[@class=\"dates-wrapper\"]/div[1]/span")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[@class=\"inputs movementCentralization\"]/label/span")
	public WebElement movimiento;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravarExecutado;
	
	@FindBy(xpath = "//div[@class=\"container-tabs\"]/div[3]")
	public WebElement arquivos;
	
	@FindBy(xpath = "//div[@class=\"fileFolders-wrapper\"]/div/div")
	public WebElement raizArquivosTQ1;
	
	@FindBy(xpath = "//div[@class=\"fileFolders-wrapper\"]/div/div[1]")
	public WebElement raizArquivosTP1;
	
	@FindBy(xpath = "//div[@class=\"container-tabs\"]/div[6]")
	public WebElement aN4;
	
	@FindBy(xpath = "//button/span[text()=\"Novo AN4\"]")
	public WebElement nuevoAN4;
	
	@FindBy(xpath = "//div[@class=\"inputs inputs2 name-input\"]/div/div/input")
	public WebElement nomeAN4;
	
	@FindBy(xpath = "//div[@id=\"inputSelectTypeFileReference\"]/div/div[1]/div[2]")
	public WebElement referenciaAN4;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement AN4OPC;
	
	@FindBy(xpath = "//div[@class=\"inputs layout-dfg-selectReference\"]/div/div[1]/div[2]")
	public WebElement leiauteReferenciaAN4;
	
	@FindBy(xpath = "//div[@class=\"inputs version-selectReference\"]/div/div/div[2]")
	public WebElement versaoAN4;
	
	@FindBy(xpath = "//div[@class=\"inputs setting-dfg-selectReference\"]/div/div/div[2]")
	public WebElement configuracionReferenciaAN4;
	
	@FindBy(xpath = "//button[@class=\"link filter-btnReference\"]")
	public WebElement adicionarFiltroReferenciaAN4;
	
	@FindBy(xpath = "//div[@id=\"subPeriodPic\"]/div/div/span")
	public WebElement calendarioAN4;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicarAN4;
	
	@FindBy(xpath = "//div[@id=\"inputfileReference\"]/div/div/div[2]")
	public WebElement arquivoReferênciaAN4;
	
	@FindBy(xpath = "//div[@id=\"inputSelectTypeFileComparison\"]/div/div/div[2]")
	public WebElement comperacaoAN4;
	
	@FindBy(xpath = "//div[@class=\"inputs layout-dfg-selectComparison\"]/div/div/div[2]")
	public WebElement leiauteComperacaoAN4;
	
	@FindBy(xpath = "//li[@id=\"option-2\"]")
	public WebElement AN4OPC2;
	
	@FindBy(xpath = "//div[@class=\"inputs version-selectComparison\"]/div/div/div[2]")
	public WebElement versaoAN42;
	
	@FindBy(xpath = "//div[@class=\"inputs setting-dfg-selectComparison\"]/div/div/div[2]")
	public WebElement configuracaoComparacaoAN4;
	
	@FindBy(xpath = "//button[@class=\"link filter-btnComparison\"]")
	public WebElement adicionarFiltroComperacaoAN4;
	
	@FindBy(xpath = "//div[@id=\"inputfileComparison\"]/div/div/div[2]")
	public WebElement arquivoComparacaoAN4;
	
	@FindBy(xpath = "//div[@class=\"base-MultipleSelect3 required\"]/div/div[2]")
	public WebElement regraAN4;
	
	@FindBy(xpath = "//div[@class=\"dialog-buttons\"]/button[2]")
	public WebElement criarAN4;
	
	@FindBy(xpath = "//button[text()=\"Editar\"]")
	public WebElement EditarAN4;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fecharAN4;
	
	@FindBy(xpath = "//button/span[text()=\"Executar\"][1]")
	public WebElement executarAN4;
	
	@FindBy(xpath = "//tr[@line-id=\"168.168\"]/td[1]")
	public WebElement bloco1;
	
	@FindBy(xpath = "//tr[@line-id=\"168.168\"]/td[2]")
	public WebElement registro1;
	
	@FindBy(xpath = "//tr[@line-id=\"168.168\"]/td[8]")
	public WebElement bloco2;
	
	@FindBy(xpath = "//tr[@line-id=\"168.168\"]/td[9]")
	public WebElement registro2;
	
	//---------------
	
	@FindBy(xpath = "//tr[@line-id=\"62.135\"]/td[1]")
	public WebElement bloco1TP1;
	
	@FindBy(xpath = "//tr[@line-id=\"62.135\"]/td[2]")
	public WebElement registro1TP1;
	
	@FindBy(xpath = "//tr[@line-id=\"62.135\"]/td[8]")
	public WebElement bloco2TP1;
	
	@FindBy(xpath = "//tr[@line-id=\"62.135\"]/td[9]")
	public WebElement registro2TP1;
	//----------
	@FindBy(xpath = "//tr[@line-id=\"0.0\"]/td[1]")
	public WebElement bloco1T;
	
	@FindBy(xpath = "//tr[@line-id=\"0.0\"]/td[2]")
	public WebElement registro1T;
	
	@FindBy(xpath = "//tr[@line-id=\"0.0\"]/td[8]")
	public WebElement bloco2T;
	
	@FindBy(xpath = "//tr[@line-id=\"0.0\"]/td[9]")
	public WebElement registro2T;
	
	@FindBy(xpath = "//div[@class=\"tabAN4-wrapper\"]/ul/li[4]")
	public WebElement lixeria;
	
	String blocoReferencia ="";
	String blocoConfiguracoe ="";
	
	String registroReferencia  = "";
	
	String registroConfiguracoe = "";
	String nuevoTexto="";
	
	public AN4FuncionalidadesPO () {
		PageFactory.initElements(driver, this);
	}
	

	public void Id() {
		
		System.out.println("---------- Id Anterior --------- " );
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
		
		
		if (tq1 == true) {


			raiz.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true ) {
			raiz2.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		}else {
			raiz2.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		

		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String id = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id Antes en Raiz: " + id);
		idInserir1(id);
		
		
		
	}
	
	public boolean Criar() {
		
		System.out.println("---------- Criar --------- " );
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
		
		
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nombre.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		nombre.sendKeys("Test Massiel");
		nombre.sendKeys(Keys.ENTER);
		
		tipo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement tipoOPC = driver.findElement(By.xpath("//li[@id=\"option-1\"]"));


		tipoOPC .click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		grupoEstructura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {


			actionsMoveToElementXpath("//li[@id=\"option-8\"]");
			
			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"Ajuste\"]"));

			grupoEstructuraOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true) {

			actionsMoveToElementXpath("//li[@id=\"option-2\"]");
			
			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"Ajustes\"]"));

			grupoEstructuraOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}else {
			
			actionsMoveToElementXpath("//li[@id=\"option-6\"]");
			
			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"Ajuste\"]"));

			grupoEstructuraOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}

		estructura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		WebElement estructuraOPC = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and text()=\"Ajustes Fiscais\"]"));


		estructuraOPC .click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		closeSelectTypeCheckbox(estructura);


		
		fechainicioVigencia.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		fechainicioVigencia.sendKeys("01/01/2013");
		fechainicioVigencia.sendKeys(Keys.ENTER);
		
		closeSelectTypeCheckbox(fechainicioVigencia1);

		
		versao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		versao.sendKeys("1");
		versao.sendKeys(Keys.ENTER);
		
		salvar.click();
		sleep(2000);
	
		waitExpectElement(flecha);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		while (!separadorbutton.isDisplayed()) {
			flecha.click();
			
		}
		sleep(2000);
		
		separadorbutton.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		separador.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		separador.sendKeys("|");
		separador.sendKeys(Keys.ENTER);
		
		inicioLinha.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		fimLinha.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarBloco.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarRegistro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		blocoNome.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		blocoNome.sendKeys("Bloco 1");
		
		registroNome.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		registroNome.sendKeys("Registro 1");
		
		ajusteFiscal.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ajuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		moveToElement(codigoEmpresa, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(2000);
		
		moveToElement(codigoFilial, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(2000);
		
		moveToElement(dataLancamento, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(2000);
		
		moveToElement(valorAjuste, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		no.click();
		sleep(1000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String id =idObter1();

		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idNuevo = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id nuevo: " +idNuevo);
		idInserir2(idNuevo);



		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(idNuevo);

		System.out.println(idD);
		System.out.println(id2D);

		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}

		System.out.println(sucesso);
		return sucesso;
		
	}
	
	public boolean Criar2() {
		
		System.out.println("---------- Criar2 --------- " );
		String url = driver.getCurrentUrl();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

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
		
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nombre.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		nombre.sendKeys("Test Massiel2");
		nombre.sendKeys(Keys.ENTER);
		
		tipo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		WebElement tipoOPC = driver.findElement(By.xpath("//li[@id=\"option-2\"]"));

		tipoOPC .click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		grupoEstructura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			actionsMoveToElementXpath("//li[@id=\"option-14\"]");
			
			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"Ajuste\"]"));

			grupoEstructuraOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true) {

			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"Ajustes\"]"));

			grupoEstructuraOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}else {
			
			actionsMoveToElementXpath("//li[@id=\"option-6\"]");
			
			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"Ajuste\"]"));

			grupoEstructuraOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		estructura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement estructuraOPC = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and text()=\"Ajustes Fiscais\"]"));


		estructuraOPC .click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		closeSelectTypeCheckbox(estructura);

		
		fechainicioVigencia.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		fechainicioVigencia.sendKeys("01/01/2013");
		fechainicioVigencia.sendKeys(Keys.ENTER);
		
		closeSelectTypeCheckbox(fechainicioVigencia1);

		
		versao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		versao.sendKeys("1");
		versao.sendKeys(Keys.ENTER);
		
		salvar.click();
		sleep(2000);
	
		waitExpectElement(flecha);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		while (!separadorbutton.isDisplayed()) {
			flecha.click();
			
		}
		sleep(2000);
		
		separadorbutton.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		separador.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		separador.sendKeys("|");
		separador.sendKeys(Keys.ENTER);
		
		inicioLinha.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		fimLinha.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarBloco.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarRegistro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		blocoNome.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		blocoNome.sendKeys("Bloco 1");
		
		registroNome.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		registroNome.sendKeys("Registro 1");
		
		ajusteFiscal.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ajuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		moveToElement(codigoEmpresa, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(2000);
		
		moveToElement(codigoFilial, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(2000);
		
		moveToElement(dataLancamento, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(2000);
		
		moveToElement(valorAjuste, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		no.click();
		sleep(1000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String id =idObter1();
		String id2 =idObter2();

		int rows = rows("//div[@class=\"tr\" and @data-id]");
		String  idRegistro1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id nuevo: " +idRegistro1);
		idInserir3(idRegistro1);
		
		rows = rows-1;
		String  idRegistro2 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		sleep(2000);
		System.out.println(id);
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(id);
		double idD2 = convertToDouble(id2);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		boolean sucesso = false;
		
		if (idRegistroD1 > idD && idRegistroD2 > idD && idRegistroD2 == idD2) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		home.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	public void IdBRE() {
		
		System.out.println("---------- ID BRE --------- " );
		AcessarBREPO acessarBREPO;
		acessarBREPO = new AcessarBREPO();
		acessarBREPO.acessarBRE();
		
		regra.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idregra = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id Antes da Criação en Regra N4: " +idregra);
		idInserir4(idregra);
		
	}
	
	public boolean CriarRegra() {

		
		System.out.println("---------- Criar --------- " );
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
		
		novoRegra.click();
		sleep(2000);
		
		waitExpectElement(nomeRegra);
		sleep(2000);
		
		nomeRegra.click();
		sleep(2000);
		
		nomeRegra.sendKeys("Test Massiel regra");
		nomeRegra.sendKeys(Keys.ENTER);
		
		tipoRegra.click();
		sleep(2000);

		WebElement Opc = driver.findElement(By.xpath("//li[@id=\"option-4\"]"));

		Opc .click();
		sleep(6000);

		
		if (tq1 == true) {
			
			WebElement componente = driver.findElement(By.xpath("//div[@class=\"base-autocomplete required\"]/div[2]"));

			componente .click();
			sleep(2000);
			
			WebElement Opc1 = driver.findElement(By.xpath("//li[@id=\"7\"]"));

			Opc1 .click();
			sleep(2000);
			

		}else if (tp1==true) {
			
			componente.click();
			sleep(2000);

			WebElement Opc1 = driver.findElement(By.xpath("//li[@id=\"option-10\"]"));

			Opc1 .click();
			sleep(2000);
		}else {
			componentetc2.click();
			sleep(2000);

			WebElement Opc1 = driver.findElement(By.xpath("//li[@id=\"option-11\"]"));

			Opc1 .click();
			sleep(2000);
		}
		
		tributo.click();
		sleep(2000);
		
			
		actionsMoveToElementXpath("//div[@id=\"00\"]");
		sleep(2000);

		WebElement Opc2 = driver.findElement(By.xpath("//div[@id=\"00\"]"));

		Opc2 .click();
		sleep(2000);

		WebElement Opc9 = driver.findElement(By.xpath("//body"));
		

		Opc9.click();
		sleep(2000);
		
		grupoEstructuraReferencia.click();
		sleep(2000);
		
		if (tq1 == true) {
			
			WebElement Opc3 = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"Ajuste\"]"));

			Opc3 .click();
			sleep(2000);
		
		}else if (tp1==true) {

			WebElement Opc3 = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"Ajustes\"]"));

			Opc3 .click();
			sleep(2000);
		}else {
			WebElement Opc3 = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"Ajuste\"]"));

			Opc3 .click();
			sleep(2000);
		}
		
		EstructuraDatosReferencia.click();
		sleep(2000);

		WebElement Opc4 = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"Ajustes Fiscais\"]"));

		Opc4 .click();
		sleep(2000);

		
		grupoEstructuraComparacao.click();
		sleep(2000);
		
		if (tq1 == true) {
			
			actionsMoveToElementXpath("//li[@class=\"list-item\" and text()=\"Ajuste\"]");
			sleep(2000);
			
			WebElement Opc5 = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"Ajuste\"]"));

			Opc5 .click();
			sleep(2000);

		}else if (tp1==true) {
			actionsMoveToElementXpath("//li[@class=\"list-item\" and text()=\"Ajustes\"]");
			WebElement Opc5 = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"Ajustes\"]"));

			Opc5 .click();
			sleep(2000);
			
		}else {
			
			actionsMoveToElementXpath("//li[@class=\"list-item\" and text()=\"Ajuste\"]");
			WebElement Opc5 = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"Ajuste\"]"));

			Opc5 .click();
			sleep(2000);
		}
		
		EstructuraDatosComparacao.click();
		sleep(2000);
		
		WebElement Opc5 = driver.findElement(By.xpath("//li[@class=\"list-item\" and text()=\"Ajustes Fiscais\"]"));

		Opc5.click();
		sleep(2000);


		String idRegistro = idObter2();
		System.out.println(idRegistro);

		primeroLeiaute.click();
		sleep(2000);

		actionsMoveToElementXpath("//li[contains(text(),\""+idRegistro+"\")]");
		sleep(2000);

		WebElement Opc6 = driver.findElement(By.xpath("//li[contains(text(),\""+idRegistro+"\")]"));

		Opc6 .click();
		sleep(4000);

		versaoLeiauteReferencia.click();
		sleep(2000);
		versaoLeiauteOPC.click();
		sleep(8000);

		String idRegistro2 = idObter3();
		System.out.println(idRegistro2);


		segundoLeiaute.click();
		sleep(2000);

		actionsMoveToElementXpath("//li[contains(text(),\""+idRegistro2+"\")]");
		sleep(2000);

		WebElement Opc1 = driver.findElement(By.xpath("//li[contains(text(),\""+idRegistro2+"\")]"));

		Opc1 .click();
		sleep(6000);

		versaoLeiauteComparacao.click();
		sleep(2000);
		versaoLeiauteOPC.click();
		sleep(8000);
		
		caracteristicaEspacialReferencia.click();
		sleep(2000);
		
		caracteristicasOPC.click();
		sleep(2000);
		
		caracteristicaEspacialComparacao.click();
		sleep(2000);
		
		caracteristicasOPC.click();
		sleep(2000);
		
		validaDe.click();
		sleep(2000);
		
		
		validaDe.sendKeys("01/01/2013");
		validaDe.sendKeys(Keys.ENTER);
		
		closeSelectTypeCheckbox(validaDe1);
		
		aplicar.click();
		sleep(2000);
		
		waitExpectElement(camino);
		sleep(2000);
		
		camino.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		registroPrimerDato.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		moveToElement(valorAjustePrimerDato, driver.findElement(By.xpath("//div[@class=\"areaCondition\"]/div[1]")));
		sleep(2000);
		
		registroSegundoDato.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		moveToElement(valorAjusteSegundoDato, driver.findElement(By.xpath("//div[@class=\"areaCondition\"]/div[3]")));
		sleep(2000);
		
		mensaje.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		mensaje.sendKeys("test Massiel Aplicado");
		sleep(2000);
		
		operador.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		operadorOPC.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca .click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regra.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String id =idObter4();

		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idNuevo = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id nuevo: " +idNuevo);
		idInserir5(idNuevo);

		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(idNuevo);

		System.out.println(idD);
		System.out.println(id2D);

		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}

		home.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	public void IdDFG() {
		AcessarDFGPO acessarDFGPO;
		acessarDFGPO = new AcessarDFGPO();
		acessarDFGPO.acessarDFG();
		
		System.out.println("---------- Criar --------- " );
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
		sleep(2000);
		sleep(2000);
		
		waitExpectElement(abaConfiguraciones);
		sleep(2000);
		
		abaConfiguraciones.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			WebElement raizABA = driver.findElement(By.xpath("//div[@class=\"baseTabs-view-wrapper\"]/div/div[2]/div/div[1]/div/div[1]"));

			raizABA .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true) {
		
			WebElement raizABA = driver.findElement(By.xpath("//div[@class=\"baseTabs-view-wrapper\"]/div /div[2]/div/div[1]/div/div[1]"));

			raizABA .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}else {
			WebElement raizABA = driver.findElement(By.xpath("//div[@class=\"baseTabs-view-wrapper\"]/div /div[2]/div/div[1]/div/div[1]"));

			raizABA .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idraizAba = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id Antes da Criação en Raiz Configuracoe: " +idraizAba);
		idInserir6(idraizAba);
		
	}
	
	public boolean CriarConfiguracoe() {
		
		System.out.println("---------- Criar --------- " );
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
		
		novoConfiguracoe.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nomeConfiguracoe.click();
		sleep(2000);
		
		nomeConfiguracoe.sendKeys("Test Massiel configuracao");
		nomeConfiguracoe.sendKeys(Keys.ENTER);
		
		String idRegistro = idObter2();
		System.out.println(idRegistro);

		primerLeiauteConfiguracoe.click();
		sleep(2000);

		actionsMoveToElementXpath("//li[contains(text(),\""+idRegistro+"\")]");
		sleep(2000);

		WebElement Opc6 = driver.findElement(By.xpath("//li[contains(text(),\""+idRegistro+"\")]"));

		Opc6 .click();
		sleep(6000);

		versaoConfiguracoe.click();
		sleep(2000);

		versaoLeiauteOPC.click();
		sleep(2000);
		
		tributoConfiguracoe.click();
		sleep(2000);

		if (tq1 == true) {

			actionsMoveToElementXpath("//li[@id=\"option-17\"]");
		
			tributoConfiguracoeOPC.click();
			sleep(4000);
		}else if (tp1==true) {
			
			actionsMoveToElementXpath("//li[@id=\"option-17\"]");
			
			tributoConfiguracoeOPC.click();
			sleep(4000);
			
		}else {
			actionsMoveToElementXpath("//li[@id=\"option-7\"]");
			
			WebElement tributo = driver.findElement(By.xpath("//li[@id=\"option-7\"]"));

			tributo .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			
		}
		

		
		sleep(2000);
		empresaConfiguracoe.click();
		sleep(2000);

		empresaConfiguracoeOPC.click();
		sleep(2000);
		
		closeSelectTypeCheckbox(empresaConfiguracoe);
		
		ufConfiguracoe.click();
		sleep(2000);
		
		if (tq1 == true) {

			ufConfiguracoeOPC.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(ufConfiguracoe);

		}else if (tp1==true) {
			
			ufConfiguracoeOPC.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(ufConfiguracoe);
			
		}else {
			actionsMoveToElementXpath("//div[@id=\"AL\"]");
			WebElement UF = driver.findElement(By.xpath("//div[@id=\"AL\"]"));

			UF .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			closeSelectTypeCheckbox(ufConfiguracoe);
		}

		
		
		filialConfiguracoe.click();
		sleep(2000);

		if (tq1 == true) {

			filialConfiguracoeOPC.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(filialConfiguracoe);
			
		}else if (tp1==true) {
			
			filialConfiguracoeOPC.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(filialConfiguracoe);
			
		}else {
			actionsMoveToElementXpath("//div[@id=\"1000AL0008\"]");
			WebElement filial = driver.findElement(By.xpath("//div[@id=\"1000AL0008\"]"));

			filial .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			closeSelectTypeCheckbox(filialConfiguracoe);
		}

		
		
		fechaConfiguracoe.sendKeys("01/01/2013");
		fechaConfiguracoe.sendKeys(Keys.ENTER);
		
		closeSelectTypeCheckbox(fechaConfiguracoeSpan);
		sleep(4000);
		
		salvar.click();
		sleep(16000);
		
		waitExpectElement(siguiente);
		sleep(3000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String id =idObter6();

		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idNuevo = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id nuevo: " +idNuevo);
		idInserir7(idNuevo);

		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(idNuevo);

		System.out.println(idD);
		System.out.println(id2D);

		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}

		System.out.println(sucesso);
		return sucesso;
	}
	
	public boolean CriarConfiguracoe2() {
		
		System.out.println("---------- Criar --------- " );
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
		
		novoConfiguracoe.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nomeConfiguracoe.click();
		sleep(2000);
		
		nomeConfiguracoe.sendKeys("Test Massiel configuracao 2");
		nomeConfiguracoe.sendKeys(Keys.ENTER);
		
		String idRegistro = idObter3();
		System.out.println(idRegistro);

		primerLeiauteConfiguracoe.click();
		sleep(2000);

		actionsMoveToElementXpath("//li[contains(text(),\""+idRegistro+"\")]");
		sleep(2000);

		WebElement Opc6 = driver.findElement(By.xpath("//li[contains(text(),\""+idRegistro+"\")]"));

		Opc6 .click();
		sleep(6000);

		versaoConfiguracoe.click();
		sleep(6000);

		versaoLeiauteOPC.click();
		sleep(2000);
		
		tributoConfiguracoe.click();
		sleep(2000);


		if (tq1 == true) {

			actionsMoveToElementXpath("//li[@id=\"option-17\"]");
			
			tributoConfiguracoeOPC.click();
			sleep(2000);

		}else if (tp1==true) {
			
			actionsMoveToElementXpath("//li[@id=\"option-17\"]");
			
			tributoConfiguracoeOPC.click();
			sleep(2000);
			
		}else {
			
			actionsMoveToElementXpath("//li[@id=\"option-7\"]");
			
			WebElement tributo = driver.findElement(By.xpath("//li[@id=\"option-7\"]"));

			tributo .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		}
		
		
		
		
		empresaConfiguracoe.click();
		sleep(2000);

		empresaConfiguracoeOPC.click();
		sleep(2000);
		
		closeSelectTypeCheckbox(empresaConfiguracoe);
		
		ufConfiguracoe.click();
		sleep(2000);
		
		if (tq1 == true) {

			ufConfiguracoeOPC.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(ufConfiguracoe);

		}else if (tp1==true) {
			
			ufConfiguracoeOPC.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(ufConfiguracoe);
			
		}else {
			actionsMoveToElementXpath("//div[@id=\"AL\"]");
			WebElement UF = driver.findElement(By.xpath("//div[@id=\"AL\"]"));

			UF .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			closeSelectTypeCheckbox(ufConfiguracoe);
		}

		
		
		filialConfiguracoe.click();
		sleep(2000);

		if (tq1 == true) {

			filialConfiguracoeOPC.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(filialConfiguracoe);
			
		}else if (tp1==true) {
			
			filialConfiguracoeOPC.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(filialConfiguracoe);
			
		}else {
			actionsMoveToElementXpath("//div[@id=\"1000AL0008\"]");
			WebElement filial = driver.findElement(By.xpath("//div[@id=\"1000AL0008\"]"));

			filial .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			closeSelectTypeCheckbox(filialConfiguracoe);
		}

		
		
		fechaConfiguracoe.sendKeys("01/01/2013");
		fechaConfiguracoe.sendKeys(Keys.ENTER);
		
		closeSelectTypeCheckbox(fechaConfiguracoeSpan);
		sleep(4000);
		
		salvar.click();
		sleep(16000);
		
		waitExpectElement(siguiente);
		sleep(3000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String id =idObter6();
		String id2 =idObter7();

		int rows = rows("//div[@class=\"tr\" and @data-id]");
		String  idRegistro1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id nuevo: " +idRegistro1);
		idInserir8(idRegistro1);
		
		rows = rows-1;
		String  idRegistro2 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(id);
		double idD2 = convertToDouble(id2);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		boolean sucesso = false;
		
		if (idRegistroD1 > idD && idRegistroD2 > idD && idRegistroD2 == idD2) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		System.out.println(sucesso);
		return sucesso;
	}
	
	public ArrayList<Boolean> ExecutarConfiguracao() {
		System.out.println("---------- Executar Configuracao --------- " );
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
		
		
		String idRegistro =idObter7();
		
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement executar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		int rows1 = rows -1;
		String textNome = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows1 + "]/div[6]/div"))
				.getText();
		
		System.out.println("Nombre de la Primera Configuracion : " + textNome );
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		executar.click();
		sleep(2000);

		waitExpectElement(estado);
		sleep(3000);
		
		estado.click();
		sleep(3000);
		
		if (tq1 == true) {


			estadoOPC.click();
			sleep(3000);
		

		}else if (tp1==true) {
			estadoOPC.click();
			sleep(3000);
		
			
		}else {
			WebElement tributo = driver.findElement(By.xpath("//div[@id=\"AL\"]"));

			tributo .click();
			sleep(2000);
			
			

		}
		sleep(2000);
		closeSelectTypeCheckbox(estado);
		sleep(3000);
		
		String estado1 = estadoInput.getText();
		System.out.println(" Estado: "+ estado1);
		
		calendario.click();
		sleep(3000);
		
		flechacalendario.click();
		sleep(3000);
		
		anio.click();
		sleep(3000);
		
		mes.click();
		sleep(3000);
		
		periodo.click();
		sleep(3000);
		
		String calendario1 = calendarioInput.getAttribute("value");
		System.out.println(" Calendario: "+ calendario1);
		
		movimiento.click();
		sleep(3000);
		
		executarConfiguracao.click();
		sleep(3000);
		
		waitExpectXpath("//span[text()=\"Execução\"]");
		sleep(10000);
		
		gravarExecutado.click();
		sleep(4000);
		
		no.click();
		sleep(8000);
	
		biblioteca.click();
		sleep(2000);

		waitExpectElement(siguiente);
		sleep(10000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro2 =idObter8();
		
		sleep(2000);
		WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro2+"\"]/div[1]/div"));
		WebElement executar2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		String textNome2 = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[6]/div"))
				.getText();
		
		System.out.println("Nombre de la Segunda Configuracion : " + textNome2 );
		
		actionsMoveToElementElement(menu2);
		sleep(2000);
		menu2.click();
		sleep(2000);
		executar2.click();
		sleep(2000);
		
		waitExpectElement(estado);
		sleep(3000);
		
		estado.click();
		sleep(3000);
		
		if (tq1 == true) {


			estadoOPC.click();
			sleep(3000);
		
			closeSelectTypeCheckbox(estado);
			sleep(3000);

		}else if (tp1==true) {
			estadoOPC.click();
			sleep(3000);
		
			closeSelectTypeCheckbox(estado);
			sleep(3000);
			
		}else {
			WebElement tributo = driver.findElement(By.xpath("//div[@id=\"AL\"]"));

			tributo .click();
			sleep(2000);
			
			
			closeSelectTypeCheckbox(estado);
			sleep(3000);
		}
		
		
		String estado2 = estadoInput.getText();
		System.out.println(" Estado: "+ estado2);
		
		calendario.click();
		sleep(3000);
		
		flechacalendario.click();
		sleep(3000);
		
		anio.click();
		sleep(3000);
		
		mes.click();
		sleep(3000);
		
		periodo.click();
		sleep(3000);
		
		String calendario2 = calendarioInput.getAttribute("value");
		System.out.println(" Calendario: "+ calendario2);
		
		movimiento.click();
		sleep(3000);
		
		executarConfiguracao.click();
		sleep(3000);
		
		waitExpectXpath("//span[text()=\"Execução\"]");
		sleep(10000);
		
		gravarExecutado.click();
		sleep(2000);
	
		no.click();
		sleep(8000);
	
		
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		arquivos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		if (tq1 == true) {


			raizArquivosTQ1.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true) {
			raizArquivosTP1.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		}else {
			raizArquivosTP1.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		int rows2 = rows -1;
		
		String idArquivo = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows2 + "]/div[5]/div"))
				.getText();
		
		idInserir9(idArquivo);
		
		System.out.println("Id Primero Executado : " + idArquivo );
		
		String nomeArquivo = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows2 + "]/div[7]/div"))
				.getText();
		
		System.out.println("Nombre Primero Executado : " + nomeArquivo );
		
		String ufArquivo = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows2 + "]/div[11]/div"))
				.getText();
		
		System.out.println("UF  Primero Executado: " + ufArquivo );
		
		String anioArquivo = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows2 + "]/div[13]/div"))
				.getText();
		
		System.out.println("Año  Primero Executado: " +  anioArquivo );
		
		String periodoArquivo = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows2 + "]/div[15]/div"))
				.getText();
		
		System.out.println("Periodo  Primero Executado: " +  periodoArquivo );
		
		
		String idArquivo2 = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[5]/div"))
				.getText();
		
		idInserir10(idArquivo2);
		
		System.out.println("Id Segundo Executado : " + idArquivo2 );
		
		String nomeArquivo2 = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[7]/div"))
				.getText();
		
		System.out.println("Nombre Segundo Executado : " + nomeArquivo2 );
		
		String ufArquivo2 = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[11]/div"))
				.getText();
		
		System.out.println("UF  Segundo Executado: " + ufArquivo2 );
		
		String anioArquivo2 = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[13]/div"))
				.getText();
		
		System.out.println("Año  Segundo Executado: " +  anioArquivo2 );
		
		String periodoArquivo2 = driver
				.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
						+ rows + "]/div[15]/div"))
				.getText();
		
		System.out.println("Periodo  Segundo Executado: " +  periodoArquivo2 );
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(nomeArquivo .contains(textNome));
		sucesso.add(ufArquivo.equals(estado1));
		sucesso.add(calendario1.contains(anioArquivo));
		sucesso.add(calendario1.contains(periodoArquivo));
		sucesso.add(nomeArquivo2 .contains(textNome2));
		sucesso.add(ufArquivo2.equals(estado2));
		sucesso.add(calendario2.contains(anioArquivo2));
		sucesso.add(calendario2.contains(periodoArquivo2));
		System.out.println(sucesso);
		return sucesso;
		
	}
	
	public boolean RegraN4() {
		
		System.out.println("---------- Criar AN4 --------- " );
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
		
		aN4.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			WebElement raizAN4 = driver.findElement(By.xpath("//div[@class=\"an4Folders-wrapper\"]/div/div"));

			raizAN4.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true) {
		
			WebElement raizAN4 = driver.findElement(By.xpath("//div[@class=\"an4Folders-wrapper\"]/div/div[1]"));

			raizAN4 .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}else {
			WebElement raizAN4 = driver.findElement(By.xpath("//div[@class=\"an4Folders-wrapper\"]/div/div[1]"));

			raizAN4 .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		String idAN4 = "0";
		
		if(rows > 0) {
			idAN4 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		}
		
		System.out.println("Id Antes da Criação en AN4: " +idAN4);
		
		nuevoAN4.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nomeAN4.click();
		sleep(2000);
		
		
		nomeAN4.sendKeys("Test AN4 Massiel");
		nomeAN4.sendKeys(Keys.ENTER);
		
		referenciaAN4.click();
		sleep(2000);
		
		
		AN4OPC.click();
		sleep(6000);
	
		
		leiauteReferenciaAN4.click();
		sleep(3000);
		
		
		String idRegistro = idObter2();
		System.out.println("leiaute criado"+idRegistro);

		actionsMoveToElementXpath("//li[contains(text(),\""+idRegistro+"\")]");
		sleep(2000);

		WebElement Opc = driver.findElement(By.xpath("//li[contains(text(),\""+idRegistro+"\")]"));

		Opc .click();
		sleep(2000);
		
		versaoAN4.click();
		sleep(2000);
		
		
		AN4OPC.click();
		sleep(6000);
		
		
		configuracionReferenciaAN4.click();
		sleep(2000);
		
		
		String idRegistro1 = idObter7();
		System.out.println("Configuracion Referencia"+idRegistro1);

		actionsMoveToElementXpath("//li[contains(text(),\""+idRegistro1+"\")]");
		sleep(2000);

		WebElement Opc1 = driver.findElement(By.xpath("//li[contains(text(),\""+idRegistro1+"\")]"));

		Opc1.click();
		sleep(4000);
		
		actionsMoveToElementElement(adicionarFiltroReferenciaAN4);
		sleep(6000);
		
		adicionarFiltroReferenciaAN4.click();
		sleep(6000);
		
		
		if (tq1 == true) {

			WebElement flecha = driver.findElement(By.xpath("//div[@class=\"wrapper small\"]/div[1]/div[1]"));
			
			calendario.click();
			sleep(3000);
			
			flecha.click();
			sleep(3000);
			
			anio.click();
			sleep(3000);
			
			mes.click();
			sleep(3000);
			
			periodo.click();
			sleep(3000);
			
			

		}else if (tp1==true) {
		
			WebElement flecha = driver.findElement(By.xpath("//div[@class=\"wrapper small\"]/div[1]/div[1]"));

			calendario .click();
			sleep(5000);
			
			flecha .click();
			sleep(2000);
			
			anio.click();
			sleep(3000);
			
			mes.click();
			sleep(3000);
			
			periodo.click();
			sleep(3000);
			
		}else {
			WebElement flecha = driver.findElement(By.xpath("//div[@class=\"wrapper small\"]/div[1]/div[1]"));

			calendario .click();
			sleep(2000);
			
			flecha .click();
			sleep(2000);
			
			anio.click();
			sleep(3000);
			
			mes.click();
			sleep(4000);
			
			periodo.click();
			sleep(3000);
		}
		
		sleep(3000);
		aplicar.click();
		sleep(6000);
		

		arquivoReferênciaAN4.click();
		sleep(3000);

		
		
		String idRegistro2 = idObter9();
		System.out.println("Arquivo executado primero"+idRegistro2);

		actionsMoveToElementXpath("//li[contains(text(),\""+idRegistro2+"\")]");
		sleep(2000);

		WebElement Opc2 = driver.findElement(By.xpath("//li[contains(text(),\""+idRegistro2+"\")]"));

		Opc2.click();
		sleep(4000);
		System.out.println("-----------");
	
		comperacaoAN4.click();
		sleep(3000);
	
		
		AN4OPC2.click();
		sleep(3000);
		
		
		attributeToBeXpath("//div[contains(@class, \"layout-dfg-selectComparison\")]/div", "class", "base-select required");
		leiauteComperacaoAN4.click();
		sleep(3000);
		
		
		String idRegistro3 = idObter3();
		System.out.println("Leiaute Comparacao "+idRegistro3);

		actionsMoveToElementXpath("//li[contains(text(),\""+idRegistro3+"\")]");
		sleep(3000);

		WebElement Opc3 = driver.findElement(By.xpath("//li[contains(text(),\""+idRegistro3+"\")]"));

		Opc3.click();
		sleep(4000);
		
		attributeToBeXpath("//div[contains(@class, \"version-selectComparison\")]/div", "class", "base-select required");
		versaoAN42.click();
		sleep(3000);
		
		
		AN4OPC.click();
		sleep(6000);
		
		
		configuracaoComparacaoAN4.click();
		sleep(5000);
		
		
		String idRegistro4 = idObter8();
		System.out.println("Configuracao Comparacao"+idRegistro4);

		actionsMoveToElementXpath("//li[contains(text(),\""+idRegistro4+"\")]");
		sleep(2000);

		WebElement Opc4 = driver.findElement(By.xpath("//li[contains(text(),\""+idRegistro4+"\")]"));

		Opc4.click();
		sleep(8000);
		
		actionsMoveToElementElement(adicionarFiltroComperacaoAN4);
		sleep(2000);
		
		adicionarFiltroComperacaoAN4.click();
		sleep(6000);
	
		

		if (tq1 == true) {

			calendario.click();
			sleep(3000);
			
			flechacalendario.click();
			sleep(3000);
			
			anio.click();
			sleep(3000);
			
			mes.click();
			sleep(3000);
			
			periodo.click();
			sleep(3000);
			
			

		}else if (tp1==true) {
		
			WebElement flecha = driver.findElement(By.xpath("//div[@class=\"wrapper small\"]/div[1]/div[1]"));

			calendario .click();
			sleep(2000);
			
			flecha .click();
			sleep(2000);
			
			anio.click();
			sleep(3000);
			
			mes.click();
			sleep(3000);
			
			periodo.click();
			sleep(3000);
			
		}else {
			WebElement flecha = driver.findElement(By.xpath("//div[@class=\"wrapper small\"]/div[1]/div[1]"));

			calendario .click();
			sleep(2000);
			
			flecha .click();
			sleep(2000);
			
			anio.click();
			sleep(3000);
			
			mes.click();
			sleep(3000);
			
			periodo.click();
			sleep(3000);
			
		}
		
		aplicar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		arquivoComparacaoAN4.click();
		sleep(3000);
		
		
		String idRegistro5 = idObter10();
		System.out.println("Arquivo executado de Segundo"+idRegistro5);

		actionsMoveToElementXpath("//li[contains(text(),\""+idRegistro5+"\")]");
		sleep(2000);

		WebElement Opc5 = driver.findElement(By.xpath("//li[contains(text(),\""+idRegistro5+"\")]"));

		Opc5.click();
		sleep(4000);
		
		regraAN4.click();
		sleep(3000);
		
		
		String idRegistro6 = idObter5();
		System.out.println("Regra de An4"+idRegistro6);

		WebElement Opc6 = driver.findElement(By.xpath("//div[contains(text(),\""+idRegistro6+"\")]"));

		Opc6.click();
		sleep(4000);
		
		WebElement Opc7 = driver.findElement(By.xpath("//body"));
		
		Opc7.click();
		sleep(4000);
		
		criarAN4.click();
		sleep(3000);
		
		
		aN4.click();
		sleep(3000);
		
		
		if (tq1 == true) {

			WebElement raizAN4 = driver.findElement(By.xpath("//div[@class=\"an4Folders-wrapper\"]/div/div"));

			raizAN4.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true) {
		
			WebElement raizAN4 = driver.findElement(By.xpath("//div[@class=\"an4Folders-wrapper\"]/div/div[1]"));

			raizAN4 .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}else {
			WebElement raizAN4 = driver.findElement(By.xpath("//div[@class=\"an4Folders-wrapper\"]/div/div[1]"));

			raizAN4 .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(6000);
		}
		
		rows = rows("//div[@class=\"tr\" and @data-id]");

		String idNuevo = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id Nuevo: " +idNuevo);
		idInserir11(idNuevo);



		int idD = Integer.valueOf(idAN4);
		int id2D = Integer.valueOf(idNuevo);

		System.out.println(idD);
		System.out.println(id2D);

		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}

		System.out.println(sucesso);
		return sucesso;
		
	}
	
	public boolean EditarRegraN4() {
		
		System.out.println("---------- Editar AN4 --------- " );
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
		
		aN4.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			WebElement raizAN4 = driver.findElement(By.xpath("//div[@class=\"an4Folders-wrapper\"]/div/div"));

			raizAN4.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true) {
		
			WebElement raizAN4 = driver.findElement(By.xpath("//div[@class=\"an4Folders-wrapper\"]/div/div[1]"));

			raizAN4 .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}else {
			WebElement raizAN4 = driver.findElement(By.xpath("//div[@class=\"an4Folders-wrapper\"]/div/div[1]"));

			raizAN4 .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		String idRegistro = idObter11();
		System.out.println("Regra de An4: "+idRegistro);
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		
		attributoNotToBeEmptyElement(nomeAN4, "value");
	  	sleep(2000);
	  	
		String valor = nomeAN4.getAttribute("value");
		System.out.println(valor);
		String enviar = "Test AN4 Massiel Vasquez";
		
		sleep(1000);
		nomeAN4.clear();
		sleep(1000);
		
		nomeAN4.sendKeys(enviar);
		sleep(12000);
		
		EditarAN4.click();
		sleep(5000);
		
		sim.click();
		sleep(5000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		System.out.println("--------------");
		System.out.println("Regra de An4: "+idRegistro);
		
		sleep(2000);
		WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu2);
		sleep(2000);
		menu2.click();
		sleep(2000);
		editar2.click();
		sleep(6000);
		

		attributoNotToBeEmptyElement(nomeAN4, "value");
	  	sleep(8000);
	  	
		sleep(8000);
		this.nuevoTexto = nomeAN4.getAttribute("value");
		System.out.println(valor);
		System.out.println(this.nuevoTexto);

		sleep(5000);

		
		
		
		fecharAN4.click();
		sleep(5000);
		
		boolean sucesso = this.nuevoTexto.equals(enviar);
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	public ArrayList<Boolean> ExecutarRegraN4() {
		
		System.out.println("---------- Executar AN4 --------- " );
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
		
		aN4.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			WebElement raizAN4 = driver.findElement(By.xpath("//div[@class=\"an4Folders-wrapper\"]/div/div"));

			raizAN4.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true) {
		
			WebElement raizAN4 = driver.findElement(By.xpath("//div[@class=\"an4Folders-wrapper\"]/div/div[1]"));

			raizAN4 .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}else {
			WebElement raizAN4 = driver.findElement(By.xpath("//div[@class=\"an4Folders-wrapper\"]/div/div[1]"));

			raizAN4 .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		String idRegistro = idObter11();
		System.out.println("Regra de An4"+idRegistro);
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		
		waitExpectElement(executarAN4);
		sleep(10000);
		
		executarAN4.click();
		sleep(5000);
		
		
		
		if (tq1 == true) {
			
			waitExpectElement(bloco1);
			sleep(3000);

			this. blocoReferencia = bloco1.getText();
			System.out.println(blocoReferencia);
			
			this.registroReferencia  = registro1.getText();
			System.out.println(registroReferencia);
			
			this.blocoConfiguracoe = bloco2.getText();
			System.out.println(blocoConfiguracoe);
			
			this.registroConfiguracoe = registro2.getText();
			System.out.println(registroConfiguracoe);

		}else if (tp1==true) {
			waitExpectElement(bloco1TP1);
			sleep(3000);
		
			this.blocoReferencia = bloco1TP1.getText();
			System.out.println(blocoReferencia);
			
			this.registroReferencia  = registro1TP1.getText();
			System.out.println(registroReferencia);
			
			this.blocoConfiguracoe = bloco2TP1.getText();
			System.out.println(blocoConfiguracoe);
			
			this.registroConfiguracoe = registro2TP1.getText();
			System.out.println(registroConfiguracoe);
		}else {
			
			waitExpectElement(bloco1T);
			sleep(3000);
		
			this. blocoReferencia = bloco1T.getText();
			System.out.println(blocoReferencia);
			
			this.registroReferencia  = registro1T.getText();
			System.out.println(registroReferencia);
			
			this.blocoConfiguracoe = bloco2T.getText();
			System.out.println(blocoConfiguracoe);
			
			this.registroConfiguracoe = registro2T.getText();
			System.out.println(registroConfiguracoe);
		}
		
		
		String bloco = "Bloco 1";
		String registro = "Registro 1";
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(this.blocoReferencia.contains(bloco));
		sucesso.add(this.blocoConfiguracoe.contains(bloco));
		sucesso.add(this.registroReferencia.contains(registro));
		sucesso.add(this.registroConfiguracoe.contains(registro));
		
		biblioteca.click();
		sleep(5000);
		
		System.out.println(sucesso);
		return sucesso;
		
	}
	
	public boolean LixeriaRegraN4() {
		System.out.println("---------- Editar AN4 --------- " );
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
		
		aN4.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			WebElement raizAN4 = driver.findElement(By.xpath("//div[@class=\"an4Folders-wrapper\"]/div/div"));

			raizAN4.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true) {
		
			WebElement raizAN4 = driver.findElement(By.xpath("//div[@class=\"an4Folders-wrapper\"]/div/div[1]"));

			raizAN4 .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}else {
			WebElement raizAN4 = driver.findElement(By.xpath("//div[@class=\"an4Folders-wrapper\"]/div/div[1]"));

			raizAN4 .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		String idRegistro = idObter11();
		System.out.println("Regra de An4"+idRegistro);
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		
		lixeria.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);

		
		WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro +"\"]/div[1]/div"));
		WebElement restaurar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro +"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Restaurar\"]"));
		
		actionsMoveToElementElement(menu2);
		sleep(2000);
		menu2.click();
		sleep(2000);
		restaurar.click();
		sleep(2000);
		
		aN4.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			WebElement raizAN4 = driver.findElement(By.xpath("//div[@class=\"an4Folders-wrapper\"]/div/div"));

			raizAN4.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true) {
		
			WebElement raizAN4 = driver.findElement(By.xpath("//div[@class=\"an4Folders-wrapper\"]/div/div[1]"));

			raizAN4 .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}else {
			WebElement raizAN4 = driver.findElement(By.xpath("//div[@class=\"an4Folders-wrapper\"]/div/div[1]"));

			raizAN4 .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		String idrestaurado = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id restaurado: " +idrestaurado);
		
		int idD1 = Integer.valueOf(idRegistro);
		int id2D1 = Integer.valueOf(idrestaurado);
		
		boolean sucesso1 = false;
		if (idD1 == id2D1) {
			sucesso1 = true;
		}
		
		WebElement menu3 = driver.findElement(By.xpath("//div[@data-id=\""+idrestaurado+"\"]/div[1]/div"));
		WebElement editar3 = driver.findElement(By.xpath("//div[@data-id=\""+idrestaurado+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		actionsMoveToElementElement(menu3);
		sleep(2000);
		menu3.click();
		sleep(2000);
		editar3.click();
		sleep(2000);
		
		return sucesso1;
	}
	
}
