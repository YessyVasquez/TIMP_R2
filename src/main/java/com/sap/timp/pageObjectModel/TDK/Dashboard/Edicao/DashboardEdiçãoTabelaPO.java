package com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class DashboardEdiçãoTabelaPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Dashboards Públicos\"]")
	public WebElement dashboardspublicos;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;

	@FindBy(xpath = "//div[@class=\"dashboardEditor-right-content\"]/div/div/div/ul/li[4]")
	public WebElement adicionar;

	@FindBy(xpath = "//div[@id=\"right\"]/div/div/div[1]/div/ul/li[2]/button/span")
	public WebElement flecha;

	@FindBy(xpath = "//table[@class=\"createWidgetTable\"]/tbody/tr/td/button[@widgetop=\"5\"]")
	public WebElement tabela;
	
	@FindBy(xpath = "//div[@class=\"dialog-buttons\"]/button[2]")
	public WebElement criar;
	
	@FindBy(xpath = "//div[@id=\"header-name\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//div[@class=\"container\"]/div[3]/div[2]/div/div/div[2]")
	public WebElement tipoTabela;
	
	@FindBy(xpath = "//div[@class=\"container\"]/div[4]/div[2]/div/div[2]")
	public WebElement grupoEstructura;
	
	@FindBy(xpath = "//div[@class=\"container\"]/div[5]/div[2]/div/div[2]")
	public WebElement estructuraDatos;
	
	@FindBy(xpath = "//span[text()=\"Conteúdo\"]")
	public WebElement condeudo;
	
	@FindBy(xpath = "//div[@class=\"dialog-content wide\"]/div/div/div/div[2]/div/div[2]/div/div[9]/div[1]/div/div[2]/div/div/div[1]/div[2]")
	public WebElement tipoColumna;
	
	@FindBy(xpath = "//li[@id=\"option-2\"]")
	public WebElement tipoColumnaOPC;
	
	@FindBy(xpath = "//div[@class=\"dialog-content wide\"]/div/div/div/div[2]/div/div[2]/div/div[9]/div[1]/div/div[5]/div/div/div[2]")
	public WebElement camposEstructura;
	

	
	@FindBy(xpath = "//div[@id=\"dropdown-icon\"]")
	public WebElement despliegue;
	
	@FindBy(xpath = "//div[@id=\"add-icon\"]")
	public WebElement adicionar1;
	
	@FindBy(xpath = "//div[@class=\"dialog-content wide\"]/div/div/div/div[2]/div/div[2]/div/div[9]/div[2]/div/div[2]/div/div/div[1]/div[2]")
	public WebElement tipoColumna1;
	

	@FindBy(xpath = "//div[@class=\"dialog-content wide\"]/div/div/div/div[2]/div/div[2]/div/div[9]/div[2]/div/div[5]/div/div/div[2]")
	public WebElement camposEstructura1;
	
	@FindBy(xpath = "//li[@id=\"option-16\"]")
	public WebElement camposEstructura1OPC;
	
	@FindBy(xpath = "//span[text()=\"Filtros\"]")
	public WebElement filtros;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Filtro\"]")
	public WebElement adicionarFiltros;
	
	@FindBy(xpath = "//div[@id=\"field-select-container\"]/div/div[2]")
	public WebElement tipoFiltros;
	
	@FindBy(xpath = "//li[@id=\"option-4\"]")
	public WebElement tipoFiltrosOPC;
	
	@FindBy(xpath = "//button[@id=\"lock-btn\"]")
	public WebElement candado;
	
	@FindBy(xpath = "//div[@class=\"layout-cell value-holder\"]/div/div/input")
	public WebElement insiraFiltro;
	
	@FindBy(xpath = "//div[@class=\"base-dialog   big ui-draggable\"]/div[3]/button[2]")
	public WebElement aceitar1;
	
	@FindBy(xpath = "//div[@class=\"base-dialog   wide ui-draggable\"]/div[3]/button[2]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@class=\"tableTitle handler\"]")
	public WebElement gra;
	
	@FindBy(xpath = "//div[@class=\"grid-stack-item-content\"]/div/div[1]/button")
	public WebElement gra1;
	
	@FindBy(xpath = "//div[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\"]")
	public WebElement flechita;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//div[@class=\"reportContainer\"]")
	public WebElement mostrar1;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//div[@class=\"edit-icon\"]/span[@class=\"icon icon-font-Formatting-and-Tool icon-pensil\"][1]")
	public WebElement lapiz;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Filtro\"]")
	public WebElement adicionarFiltro;
	
	@FindBy(xpath = "//div[@class=\"filter\"][2]/div[1]/div[2]/div[1]/button")
	public WebElement candado2;
	
	@FindBy(xpath = "//div[@class=\"filter\"][2]/div[1]/div[2]/div[2]/div/div[1]/div[2]")
	public WebElement operador;
	
	@FindBy(xpath = "//li[@id=\"option-3\"]")
	public WebElement operadorOPC;
	
	@FindBy(xpath = "//div[@class=\"filter\"][2]/div[1]/div[2]/div[4]/div/div/input")
	public WebElement insiraFiltro2;
	

	boolean sucesso;
	
	public DashboardEdiçãoTabelaPO() {
		PageFactory.initElements(driver, this);
	}

	public void Editar() {
		
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
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		dashboardspublicos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		System.out.println("---------- Editar --------- " );
		String idRegistro =idObter("dashboardsCriar");

		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(4000);
		sleep(4000);

		while (!adicionar.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);

		adicionar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tabela.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		criar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		nome.sendKeys("Test Massiel1");
		nome.sendKeys(Keys.ENTER);
		sleep(2000);
		
		tipoTabela.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			WebElement tipoTabelaOPC = driver.findElement(By.xpath("//li[@id=\"option-2\"]"));

			tipoTabelaOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tc2==true) {

			WebElement tipoTabelaOPC = driver.findElement(By.xpath("//li[@id=\"option-2\"]"));

			tipoTabelaOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else {

			WebElement tipoTabelaOPC = driver.findElement(By.xpath("//li[@id=\"option-2\"]"));

			tipoTabelaOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}

		grupoEstructura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[@id=\"476\"]"));

			grupoEstructuraOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tc2==true) {

			//WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[@id=\"option-7\"]"));
			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[@id][text()=\"Ajuste\"]"));
			
			
			grupoEstructuraOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else {

			WebElement grupoEstructuraOPC = driver.findElement(By.xpath("//li[@id=\"option-2\"]"));

			grupoEstructuraOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}
		
		estructuraDatos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			WebElement estructuraDatosOPC = driver.findElement(By.xpath("//li[@id=\"1834805491\"]"));

			estructuraDatosOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tc2==true) {

			WebElement estructuraDatosOPC = driver.findElement(By.xpath("//li[@id=\"option-1\"]"));

			estructuraDatosOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else {

			WebElement estructuraDatosOPC = driver.findElement(By.xpath("//li[@id=\"option-1\"]"));

			estructuraDatosOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}
		
		condeudo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tipoColumna.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tipoColumnaOPC.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		camposEstructura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		
		if (tq1 == true) {

			WebElement camposEstructuraOPC = driver.findElement(By.xpath("//li[@id=\"306\"]"));

			camposEstructuraOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tc2==true) {

			WebElement camposEstructuraOPC = driver.findElement(By.xpath("//li[@id=\"option-4\"]"));

			camposEstructuraOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else {

			WebElement camposEstructuraOPC = driver.findElement(By.xpath("//li[@id=\"option-4\"]"));

			camposEstructuraOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}
		
		
		despliegue.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionar1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tipoColumna1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tipoColumnaOPC.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		camposEstructura1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			WebElement camposEstructuraOPC = driver.findElement(By.xpath("//li[@id=\"140\"]"));

			camposEstructuraOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tc2==true) {

			WebElement camposEstructuraOPC = driver.findElement(By.xpath("//li[@id=\"option-16\"]"));

			camposEstructuraOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else {

			WebElement camposEstructuraOPC = driver.findElement(By.xpath("//li[@id=\"option-16\"]"));

			camposEstructuraOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}
		
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tipoFiltros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {

			WebElement tipoFiltrosOPC = driver.findElement(By.xpath("//li[@id=\"306\"]"));

			tipoFiltrosOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else if (tc2==true) {

			WebElement tipoFiltrosOPC = driver.findElement(By.xpath("//li[@id=\"option-4\"]"));

			tipoFiltrosOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}else {

			WebElement tipoFiltrosOPC = driver.findElement(By.xpath("//li[@id=\"option-4\"]"));

			tipoFiltrosOPC.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}
		
		candado.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		insiraFiltro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		insiraFiltro.sendKeys("12");
		insiraFiltro.sendKeys(Keys.ENTER);
		sleep(2000);
		
		adicionarFiltro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		candado2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		operador.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		operadorOPC.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		insiraFiltro2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		insiraFiltro2.sendKeys("0");
		insiraFiltro2.sendKeys(Keys.ENTER);
		sleep(2000);
		
		aceitar1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		aceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		actionsMoveToElementElement(gra);
		
		sleep(2000);
		moveToElement(flechita, driver.findElement(By.xpath("//div[@class=\"main-footer\"]/div[1]/div[3]")));
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		dashboardspublicos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		System.out.println("---------- Editar --------- " );

		sleep(2000);
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		editar1.click();
		sleep(4000);
		sleep(4000);
		
		sucesso = mostrar1.isDisplayed();
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		
		
	}

}
