package com.sap.timp.pageObjectModel.DFG.LeiautesExecução;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class LeiautesExecuçãoFuncionalidades3PO extends TestBaseMassiel{
	@FindBy(xpath = "//div[@class=\"baseTabs-view-wrapper\"]/div /div[1]/div/div[1]")
	public WebElement raiz;
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view-wrapper\"]/div /div[1]/div/div[1]/div/div[1]")
	public WebElement raiz2;
	
	@FindBy(xpath = "//div[@class=\"base-pagination-wrapper\"]/div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	//----------criar Leiaute
	
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

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement no;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//span[text()=\"Adicionar bloco\"]")
	public WebElement adicionarBloco;
	
	@FindBy(xpath = "//div[@id=\"block-list-wrapper\"][1]/div[1]/div[1]/div/div[3]/button")
	public WebElement adicionarRegistro1;
	
	@FindBy(xpath = "//div[@id=\"block-list-wrapper\"][1]/div[2]/div[1]/div/div[3]/button")
	public WebElement adicionarRegistro2;
	
	@FindBy(xpath = "//div[@id=\"block-list-wrapper\"][1]/div[3]/div[1]/div/div[3]/button")
	public WebElement adicionarRegistro3;
	
	@FindBy(xpath = "//div[@id=\"block-list-wrapper\"][1]/div[4]/div[1]/div/div[3]/button")
	public WebElement adicionarRegistro4;
	
	@FindBy(xpath = "//div[@id=\"block-list-wrapper\"][1]/div[5]/div[1]/div/div[3]/button")
	public WebElement adicionarRegistro5;
	
	@FindBy(xpath = "//div[@id=\"block-list-wrapper\"][1]/div[6]/div[1]/div/div[3]/button")
	public WebElement adicionarRegistro6;
	
	@FindBy(xpath = "//div[@id=\"block-list-wrapper\"][1]/div[7]/div[1]/div/div[3]/button")
	public WebElement adicionarRegistro7;
	
	@FindBy(xpath = "//div[@id=\"block-list-wrapper\"][1]/div[1]/div[1]/div/div[2]/div/div[2]/div/div/div[2]/input")
	public WebElement nomeBloque1;
	
	@FindBy(xpath = "//div[@id=\"block-list-wrapper\"][1]/div[1]/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nomeRegistro1Bloque1;
	
	@FindBy(xpath = "//div[@id=\"block-list-wrapper\"][1]/div[1]/div[2]/div[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nomeRegistro2Bloque1;
	
	@FindBy(xpath = "//span[text()=\"Ajustes Fiscais\"][1]")
	public WebElement ajusteFiscal;
	
	@FindBy(xpath = "//span[text()=\"Ajustes\"]")
	public WebElement ajuste;

	@FindBy(xpath = "//span[text()=\"Campos Especiais\"][1]")
	public WebElement camposEspeciais;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[1]/div[2]/ul/li[2]")
	public WebElement idRegistro;
	
	@FindBy(xpath = "//div[@id=\"chkRegistro\"]/div/label/span")
	public WebElement idRegistroSeleccion;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement idRegistroAplicar;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[2]/div[2]/ul/li[1]/div[2]/ul/li[2]")
	public WebElement codigoEmpresa;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[2]/div[2]/ul/li[1]/div[2]/ul/li[5]")
	public WebElement dataLancamento;
	
	@FindBy(xpath = "//div[@id=\"block-list-wrapper\"][1]/div[7]/div[2]/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nomeRegistro7;
	
	@FindBy(xpath = "//span[text()=\"Relacionamentos\"]")
	public WebElement relacionamiento;
	
	@FindBy(xpath = "//div[@class=\"toolbar-top\"]/div/ul/li[2]/button")
	public WebElement flecharelacionamiento;

	@FindBy(xpath = "//div[@class=\"cb\"]/div/label/span")
	public WebElement hierarquia;
	
	@FindBy(xpath = "//div[@class=\"relation-wrapper\"]/div[1]/div[2]/span")
	public WebElement pai;
	
	@FindBy(xpath = "//div[@class=\"relation-wrapper\"]/div[1]/div[4]/span")
	public WebElement filho;
	
	@FindBy(xpath = "//div[@class=\"dialog-content medium\"]/div/div/div[1]/div/div/div/div[2]")
	public WebElement blocoPai;
	
	@FindBy(xpath = "//li[text()=\"Bloco 1(Relacionamiento)\"]")
	public WebElement blocoPaiOPC;
	
	@FindBy(xpath = "//div[@class=\"dialog-content medium\"]/div/div/div[2]/div/div/div/div[2]")
	public WebElement registroPai;
	
	@FindBy(xpath = "//li[text()=\"Registro 1\"]")
	public WebElement registroPaiOPC;
	
	@FindBy(xpath = "//div[@class=\"base-dialog   medium ui-draggable\"]/div[3]/button[2]")
	public WebElement aplicarBlocoRegistro;
	
	@FindBy(xpath = "//div[@class=\"list\"]/div/div/div[text()=\"Bloco 1(Relacionamiento)\"]")
	public WebElement blocoFilhoOPC;
	
	@FindBy(xpath = "//div[@class=\"list\"]/div/div/div[text()=\"Registro 2\"]")
	public WebElement registroFilhoOPC;
	
	@FindBy(xpath = "//div[@class=\"relation-wrapper\"]/div[4]/div/div[1]/div/div/div/div[2]")
	public WebElement definirCampoChave1;
	
	@FindBy(xpath = "//div[@class=\"relation-wrapper\"]/div[4]/div/div[2]/div/div/div/div[2]")
	public WebElement definirCampoChave2;
	
	@FindBy(xpath = "//li[@id=\"option-3\"]")
	public WebElement definirCampoChaveOPC;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[1]/div[2]/ul/li[9]")
	public WebElement totalRegistrosFilhos;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[1]/div[2]/ul/li[8]")
	public WebElement totalRegistrosFilhosTP1;
	
	@FindBy(xpath = "//div[@id=\"block-list-wrapper\"][1]/div[1]/div[2]/div[1]/div[2]/div/div[4]/div")
	public WebElement totalRegistrosFilhosRegistro1;
	
	@FindBy(xpath = "//div[@class=\"total-record-dialog\"]/div/div/div[2]/div/div[2]")
	public WebElement totalRegistrosFilhosOPC;
	
	@FindBy(xpath = "//div[@class=\"toolbar-top\"]/div/ul/li[1]/button")
	public WebElement flechagravar;
	
	@FindBy(xpath = "//div[@id=\"block-list-wrapper\"][1]/div[2]/div[1]/div/div[2]/div/div[2]/div/div/div[2]/input")
	public WebElement nomeBloque2;
	
	@FindBy(xpath = "//div[@id=\"block-list-wrapper\"][1]/div[2]/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nomeRegistroBloque2;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[1]/div[2]/ul/li[11]")
	public WebElement listarRegistros;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[1]/div[2]/ul/li[11]")
	public WebElement listarRegistrosRegistrosBloque2;
	
	//----------- Total 
	@FindBy(xpath = "//div[@id=\"block-list-wrapper\"][1]/div[3]/div[1]/div/div[2]/div/div[2]/div/div/div[2]/input")
	public WebElement nomeBloque3;
	
	@FindBy(xpath = "//div[@id=\"block-list-wrapper\"][1]/div[3]/div[2]/div[1]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement nomeRegistroBloque3;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[2]/div[2]/ul/li[1]/div[2]/ul/li[3]")
	public WebElement codigoFilial;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[2]/div[2]/ul/li[1]/div[2]/ul/li[14]")
	public WebElement valorAjuste;
	
	@FindBy(xpath = "//div[@id=\"toolbarSecund\"]/div/div/ul/li[2]/button")
	public WebElement agrupamiento;
	
	@FindBy(xpath = "//div[@id=\"toolbarSecund\"]/div/ul/li[1]")
	public WebElement felchaAgrupamiento;
	
	@FindBy(xpath = "//div[@class=\"selection-section\"]/div[1]/div[1]/div/div/div[1]/div[2]")
	public WebElement blocoAgrupamiento;
	
	@FindBy(xpath = "//li[@id=\"option-3\"]")
	public WebElement blocoAgrupamientoOPC;
	
	@FindBy(xpath = "//div[@class=\"selection-section\"]/div[1]/div[2]/div/div/div[1]/div[2]")
	public WebElement registroAgrupamiento;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement registroAgrupamientoOPC;
	
	@FindBy(xpath = "//div[@class=\"selection-section\"]/div[2]/div/div/div/div[2]")
	public WebElement estructuraAgrupamiento;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement estructuraAgrupamientoOPC;
	
	@FindBy(xpath = "//button[text()=\"Criar Agrupamento\"]")
	public WebElement criarAgrupamiento;
	
	@FindBy(xpath = "//div[@class=\"elements-panel\"]/div[1]/div[1]/div/div/input")
	public WebElement nomeAgrupamiento;
	
	@FindBy(xpath = "//div[@class=\"fields-panel-container\"]/div/div/div/div[3]/label")
	public WebElement dataLancamentoAgrupamiento;
	
	@FindBy(xpath = "//div[@class=\"fields-panel-container\"]/div/div/div/div[4]/label")
	public WebElement valorDoAjusteAgrupamiento;
	
	@FindBy(xpath = "//div[@class=\"base-dialog   wide ui-draggable\"]/div[3]/button[2]")
	public WebElement aplicarAgrupamiento;
	
	@FindBy(xpath = "//div[@class=\"element-wrapper\"]/ul/li[1]/div[2]/ul/li[25]")
	public WebElement totalDeLinhasAgrupadas;
	
	@FindBy(xpath = "//div[@class=\"grouped-lines-dialog-wrapper\"]/div[2]/div/div/div[2]/div/div[2]")
	public WebElement estructuraTotalDeLinhasAgrupadas;
	
	@FindBy(xpath = "//div[@id=\"option-1\"]")
	public WebElement estructuraTotalDeLinhasAgrupadasOPC;
	
	@FindBy(xpath = "//div[@id=\"option-1\"]")
	public WebElement agrupamientoTotalDeLinhasAgrupadasOPC;
	
	
	public LeiautesExecuçãoFuncionalidades3PO () {
		PageFactory.initElements(driver, this);
	}
	
	public void ID() {
		
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
	
	public ArrayList<Boolean>  Criar() {
		
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
			
			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[@id=\"option-8\"]"));

			grupoEstructuraOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tp1==true) {

			actionsMoveToElementXpath("//li[@id=\"option-2\"]");
			
			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[@id=\"option-2\"]"));

			grupoEstructuraOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}else {
			
			actionsMoveToElementXpath("//li[@id=\"option-12\"]");
			
			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[@id=\"option-12\"]"));

			grupoEstructuraOPC .click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}

		estructura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		WebElement estructuraOPC = driver.findElement(By.xpath("//div[@id=\"18\"]"));


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
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		no.click();
		sleep(2000);
		
		sim.click();
		sleep(4000);
	
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if(adicionarBloco.isDisplayed())
		{
			System.out.println("Leiaute Agregado");
			boolean sucesso1 = true;
			sucesso.add(sucesso1);
		}

		return sucesso;
		
	}
		
	public ArrayList<Boolean>  bloco() {
		
		System.out.println("---------- Adicionar Blocos --------- " );
		// bloco 1
		adicionarBloco.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarRegistro1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// bloco 2
		
		adicionarBloco.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarRegistro2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//bloco 3
		
		adicionarBloco.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarRegistro3.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// bloco 4
		adicionarBloco.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarRegistro4.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// bloco 5
		adicionarBloco.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarRegistro5.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//bloco 6
		adicionarBloco.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarRegistro6.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// bloco 7
		adicionarBloco.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarRegistro7.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		
		if(nomeRegistro7.isDisplayed())
		{
			System.out.println("blocos Adicionados");
			boolean sucesso1 = true;
			sucesso.add(sucesso1);
		}

		return sucesso;
	}
	
	public ArrayList<Boolean> Relacionamento() {
		
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
		
		
		System.out.println("---------- Relacionamento --------- " );
		
		nomeBloque1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nomeBloque1.sendKeys("Bloco 1(Relacionamiento)");
		sleep(2000);
		
		nomeRegistro1Bloque1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nomeRegistro1Bloque1.sendKeys("Registro 1");
		sleep(2000);
		
		camposEspeciais.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//mover a registro 1
		
		moveToElement(idRegistro, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[1]/div[2]/div[1]/div[2]/div")));
		sleep(2000);
		
		idRegistroSeleccion.click();
		sleep(2000);
	
		idRegistroAplicar.click();
		sleep(3000);
		
		
		ajusteFiscal.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ajuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		moveToElement(codigoEmpresa, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[1]/div[2]/div[1]/div[2]/div")));
		sleep(2000);
		
		moveToElement(dataLancamento, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[1]/div[2]/div[1]/div[2]/div")));
		sleep(2000);
		
		//--------- adicionar nuevo registro al bloque 1
		adicionarRegistro1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nomeRegistro2Bloque1.sendKeys("Registro 2");
		sleep(2000);
		
		
		//mover a registro 1
		
		moveToElement(idRegistro, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[1]/div[2]/div[2]/div[2]/div")));
		sleep(2000);
		
		idRegistroSeleccion.click();
		sleep(2000);
	
		idRegistroAplicar.click();
		sleep(3000);
		
		moveToElement(codigoEmpresa, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[1]/div[2]/div[2]/div[2]/div")));
		sleep(2000);
		
		moveToElement(dataLancamento, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[1]/div[2]/div[2]/div[2]/div")));
		sleep(2000);
		
		
		while (!relacionamiento.isDisplayed()) {
			flecharelacionamiento.click();
			
		}
		
		relacionamiento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		hierarquia.click();
		sleep(4000);
	
		pai.click();
		sleep(4000);
		
		blocoPai.click();
		sleep(4000);
		
		blocoPaiOPC.click();
		sleep(4000);
		
		registroPai.click();
		sleep(4000);
		
		registroPaiOPC.click();
		sleep(4000);
		
		aplicarBlocoRegistro.click();
		sleep(4000);
		
		filho.click();
		sleep(4000);
		
		blocoPai.click();
		sleep(4000);
		
		blocoFilhoOPC.click();
		sleep(4000);
		
		closeSelectTypeCheckbox(blocoPai);
		sleep(4000);
		
		registroPai.click();
		sleep(4000);
		
		registroFilhoOPC.click();
		sleep(4000);
		
		closeSelectTypeCheckbox(registroPai);
		sleep(4000);
		
		aplicarBlocoRegistro.click();
		sleep(4000);
		
		definirCampoChave1.click();
		sleep(4000);
		
		definirCampoChaveOPC.click();
		sleep(4000);
		
		definirCampoChave2.click();
		sleep(4000);
		
		definirCampoChaveOPC.click();
		sleep(4000);
		
		aplicar.click();
		sleep(4000);
		

		if (tq1 == true) {

			moveToElement(totalRegistrosFilhos, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[1]/div[2]/div[1]/div[2]/div")));
			sleep(2000);
			

		}else if (tp1==true ) {
			
			
			moveToElement(totalRegistrosFilhosTP1, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[1]/div[2]/div[1]/div[2]/div")));
			sleep(2000);
		}else {
			moveToElement(totalRegistrosFilhos, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[1]/div[2]/div[1]/div[2]/div")));
			sleep(2000);
		}
		
		
		totalRegistrosFilhosOPC.click();
		sleep(4000);
		
		registroFilhoOPC.click();
		sleep(4000);
		
		closeSelectTypeCheckbox(totalRegistrosFilhosOPC);
		sleep(4000);
		
		aplicar.click();
		sleep(4000);
		
		while (!gravar.isDisplayed()) {
			flechagravar.click();
			
		}
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		no.click();
		sleep(2000);
		
		sim.click();
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if(totalRegistrosFilhosRegistro1.isDisplayed())
		{
			System.out.println("Total de Filhos Agregado Correctamente ");
			boolean sucesso1 = true;
			sucesso.add(sucesso1);
		}

		return sucesso;
	}
	
	public ArrayList<Boolean> ListarRegistros() {
		
		System.out.println("---------- Listar registros --------- " );
		
		nomeBloque2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nomeBloque2.sendKeys("Bloco 2 (Listar registros)");
		sleep(2000);
		
		nomeRegistroBloque2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nomeRegistroBloque2.sendKeys("Registro 1");
		sleep(2000);
		
		// mover a registro en Bloque 3
		
		moveToElement(listarRegistros, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[2]/div[2]/div[1]/div[2]/div")));
		sleep(2000); 
		
		gravar.click();
		sleep(2000);

		sim.click();
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if(listarRegistrosRegistrosBloque2.isDisplayed())
		{
			System.out.println("Campo Listar Registros Agregado Correctamente ");
			boolean sucesso1 = true;
			sucesso.add(sucesso1);
		}

		return sucesso;
	}
	
	public void TotaldeLinhasAgrupadas() {
		System.out.println("---------- Total de linhas agrupadas --------- " );
		

		nomeBloque3.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nomeBloque3.sendKeys("Bloco 3 (Total de linhas agrupadas)");
		sleep(2000);
		
		nomeRegistroBloque3.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nomeRegistroBloque3.sendKeys("Registro 1");
		sleep(2000);
		
		//mover a registro 3
		
		moveToElement(codigoEmpresa, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[3]/div[2]/div[1]/div[2]/div")));
		sleep(2000);
		
		moveToElement(codigoFilial, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[3]/div[2]/div[1]/div[2]/div")));
		sleep(2000);
		
		moveToElement(dataLancamento, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[3]/div[2]/div[1]/div[2]/div")));
		sleep(2000);
		
		moveToElement(valorAjuste, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[3]/div[2]/div[1]/div[2]/div")));
		sleep(2000);
		
		while (!agrupamiento.isDisplayed()) {
			felchaAgrupamiento.click();
			
		}
		
		agrupamiento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		blocoAgrupamiento.click();
		sleep(2000);
		
		blocoAgrupamientoOPC.click();
		sleep(2000);
		
		registroAgrupamiento.click();
		sleep(2000);
		
		registroAgrupamientoOPC.click();
		sleep(2000);
		
		estructuraAgrupamiento.click();
		sleep(2000);
		
		estructuraAgrupamientoOPC.click();
		sleep(2000);
		
		criarAgrupamiento.click();
		sleep(2000);
		
		nomeAgrupamiento.click();
		sleep(2000);
		
		nomeAgrupamiento.sendKeys("Agrupamento 1");
		sleep(2000);
		
	
		// Add 5 seconds wait
		sleep(5000);
		 
		// Create object of actions class
		Actions act=new Actions(driver);
		 
		// find element which we need to drag
		WebElement drag=driver.findElement(By.xpath("//div[@class=\"fields-panel-container\"]/div/div/div/div[3]/label"));
		 
		// find element which we need to drop
		WebElement drop=driver.findElement(By.xpath("//div[@class=\"base-dialog   wide ui-draggable\"]/div[2]/div/div[2]/div[2]/div[1]/div"));
		 
		// this will drag element to destination
		act.dragAndDrop(drag, drop).build().perform();
		
		//mover a agrupadores
		
        
     /*   WebElement element = driver.findElement(By.xpath("//div[@class=\"fields-panel-container\"]/div/div/div/div[3]/label"));
        WebElement target = driver.findElement(By.xpath("//div[@class=\"base-dialog   wide ui-draggable\"]/div[2]/div/div[2]/div[2]/div[1]/div"));

       (new Actions(driver)).dragAndDrop(element, target).perform();*/
		
		/* Actions actions = new Actions(driver);
         WebElement srcElement = driver.findElement(By.xpath("//div[@class=\"fields-panel-container\"]/div/div/div/div[3]/label"));
         WebElement targetElement = driver.findElement(By.xpath("//div[@class=\"base-dialog   wide ui-draggable\"]/div[2]/div/div[2]/div[2]/div[1]/div"));
         actions.dragAndDrop(srcElement, targetElement); 
         actions.build().perform();
         System.out.println("Drag and Drom complated :");*/
        
		/*moveToElement(dataLancamentoAgrupamiento, driver.findElement(By.xpath("//div[@class=\"base-dialog   wide ui-draggable\"]/div[2]/div/div[2]/div[2]/div[1]/div")));
		sleep(2000);
		
		// mover a agrupados
		
		moveToElement(valorDoAjusteAgrupamiento, driver.findElement(By.xpath("//div[@id=\"group-container\"]/div[2]/div[2]/div[2]/div")));
		sleep(2000);*/
		
		/*aplicarAgrupamiento.click();
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		
		//mover a registro 1 en bloque 3
		
		moveToElement(totalDeLinhasAgrupadas, driver.findElement(By.xpath("//div[@id=\"block-list-wrapper\"][1]/div[3]/div[2]/div[1]/div[2]/div")));
		sleep(2000);*/
		
		
		
	}
}
