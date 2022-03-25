package com.sap.timp.pageObjectModel.Calendar.Tarefas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TarefasNASolicitarEsclarecimentoPO extends TestBaseSteven {

	//ACCESAR A BPMA.
	
	@FindBy(xpath = "//div[text()=\"BPMA\"]")
	public WebElement bPMA;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;

	
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[3]/div/span[2]")
	public WebElement cadastro;
	
	@FindBy(xpath = "//div[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div/ul/li[1]")
	public WebElement mostrar;
	
	// CRIAR BPMA
	
	@FindBy(xpath = "//span[text()=\"Processo de negócio\"]")
	public WebElement procesoNegocio;
	
	@FindBy(xpath = "//span[text()=\"Processos de Negocio\"]")
	public WebElement procesos;
	
	@FindBy(xpath = "//span[text()=\"Novo Processo\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome de Processo\"]")
	public WebElement nombre;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher a descrição do Processo\"]")
	public WebElement descripcion;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement criar;
	
	@FindBy(xpath = "//div[text()=\"Ponto de Início\"]")
	public WebElement inicio;
	
	@FindBy(xpath = "//div[text()=\"Ponto Final\"]")
	public WebElement fin;
	
	@FindBy(xpath = "//div[text()=\"Operação\"]")
	public WebElement operacao;
	
	@FindBy(xpath = "//div[text()=\"Nova Operação\"][2]")
	public WebElement NovoOperacao;
	
	@FindBy(xpath = "//div[text()=\"Atividade\"]")
	public WebElement actividad;
	
	@FindBy(xpath = "//div[text()=\"Nova Atividade\"][2]")
	public WebElement NovoActividad;
	
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//span[text()=\"Processo de negócio\"]")
	public WebElement justi;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[text()=\"Tarefa\"]")
	public WebElement tarefa;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Justificativa\"]")
	public WebElement justificativa;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicarJustificativa;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[3]/div/button[2]/span[2]")
	public WebElement tarefaDiv;
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[2]/*/*[name()=\"foreignObject\" and @class=\"edit-btn\"]/body/span")
	public WebElement tarefaEdit;
	
	
	
	@FindBy(xpath = "//input[@placeholder=\"SelecionarTipo\"]")
	public WebElement tipoTSele;
	
	@FindBy(xpath = "//li[text()=\"Tarefa Automatizada\"]")
	public WebElement tipoTSeleOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"SelecionarComponente\"]")
	public WebElement componente;
	
	@FindBy(xpath = "//li[text()=\"BRB\"]")
	public WebElement componeteOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"SelecionarTarefa\"]")
	public WebElement tarefaSele;
	
	@FindBy(xpath = "//li[text()=\"Criar Relátorio Estático\"]")
	public WebElement tarefaSeleOpc;
	
	@FindBy(xpath = "//span[text()=\"Entrada\"]")
	public WebElement entrada;
	
	@FindBy(xpath = "//span[text()=\"BRB::Relatórios\"]")
	public WebElement variant;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[3]/div/div[1]/ul/li/ul/li/div/div/span")
	public WebElement opacao;
	
	@FindBy(xpath = "//span[text()=\"TFP::Sub Período Fiscal	\"]")
	public WebElement tfp;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[3]/div/div[1]/ul/li[2]/ul/li/div/div/span")
	public WebElement tfpopacao;
	
	@FindBy(xpath = "//span[text()=\"Selecionar Entrada\"]")
	public WebElement inputEntrada;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div[6]/div[1]/label/span")
	public WebElement flag;
	
	@FindBy(xpath = "//button[text()=\"Confirmar\"]")
	public WebElement confirmar;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//*[@id=\"createProcess\"]/div/div/div[4]/div[2]/div[2]/label/span")
	public WebElement periodoFiscalTP1;
	
	@FindBy(xpath = "//*[@id=\"createProcess\"]/div/div/div[5]/div[2]/div[2]/label/span")
	public WebElement periodoFiscalTQ1;
	

	//ATIVADOR DE PROCESO.
	
	@FindBy(xpath = "//span[@class=\"icon icon-font-Sign-and-Symbols icon-checkbox\"]")
	public WebElement ativadordeprocessos;

	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")
	public WebElement primeira;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//*[@id=\"activator-search\"]/div/div/input")
	public WebElement pesquisar2;

	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;

	@FindBy(xpath = "//div[@id=\"company\"]/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Data Inicial\")]")
	public WebElement dataInicial;
	
	@FindBy(xpath = "")
	public WebElement dataFinal;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement empresaO;

	@FindBy(xpath = "//button/span[text()=\"Aplicar filtros\"]")
	public WebElement aplicar2;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	@FindBy(xpath = "//button/span[text()=\"Nova Configuração de Processo\"]")
	public WebElement novoProceso;
	
	@FindBy(xpath = "//div[@data-id=\"1630process\"]/div/label/span")
	public WebElement flagProceso;
	
	@FindBy(xpath = "//button[text()=\"Próximo\"]")
	public WebElement proximo;
	
	@FindBy(xpath = "//tr[@class=\"days-tr\"]/td[2]/div/div/div/div[@class=\"icon icon-font-Sign-and-Symbols icon-downmenu\"]")
	public WebElement dias;
	
	@FindBy(xpath = "//li[text()=\"Dias Corridos\"]")
	public WebElement diasOpc;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div/table/tbody/tr[4]/td[2]/div/div/div/input")
	public WebElement diaInicio;
	
	@FindBy(xpath = "//input[@placeholder=\"Clique para selecionar Periodicidade\"]")
	public WebElement iniciarQuando;
	
	@FindBy(xpath = "//li[text()=\"100 - Aberto\"]")
	public WebElement iniciarQuandoOpc;
	
	@FindBy(xpath = "//span[text()=\"Selecione Configuração de Período Fiscal\"]")
	public WebElement confSubPeriodo;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por ID\"]")
	public WebElement filtrarSubPer;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[3]/div/div[1]/div/div[2]/div[1]/div[1]/label/span")
	public WebElement flagSubPer;
	
	@FindBy(xpath = "//button[text()=\"Confirmar\"]")
	public WebElement confirmarr;
	
	@FindBy(xpath = "//*[@id=\"user-process-search\"]/div/div/input")
	public WebElement userPesquisa;
	
	@FindBy(xpath = "//*[@id=\"user-operation-search\"]/div/div/input")
	public WebElement userPesquisa2;
	
	@FindBy(xpath = "//*[@id=\"user-activity-search\"]/div/div/input")
	public WebElement userPesquisa3;
	
	@FindBy(xpath = "//div[text()=\"TESTEAUTOMATIZADO\"][1]")
	public WebElement userArrastrar;
	
	@FindBy(xpath = "//*[@id=\"user-operation-list\"]/div[70]/div[2]/div[1]")
	public WebElement userArrastrar2;
	
	@FindBy(xpath = "//*[@id=\"user-activity-list\"]/div[70]/div[2]/div[1]")
	public WebElement userArrastrar3;
	
	@FindBy(xpath = "//button/span[text()=\"Ativar\"]")
	public WebElement ativar;
	
	@FindBy(xpath = "//*[@id=\"home-icon\"]")
	public WebElement home;
	
	//ACCESAR TFP
	
	@FindBy(xpath = "//div[text()=\"TFP\"]")
	public WebElement tFP;
	
	@FindBy(xpath = "//span[text()=\"Períodos\"]")
	public WebElement mostrar2;
	
	
	//TFP PROCESO
	
	@FindBy(xpath = "//span[@class=\"title-boxes \" and text()=\"Períodos\"]")
	public WebElement periodos;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div/ul/li[1]/div/span[2]")
	public WebElement periodosMenu;	
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisarPeriodo;
	
	@FindBy(xpath = "//div[@id=\"search-container\"]/div/div/input")
	public WebElement pesquisarID;
	
	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement limpiar;
	
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fecharTFP;
	
	
	
	//ACCESAR CALENDAR
	

	@FindBy(xpath = "//div[text()=\"CALENDAR\"]")
	public WebElement calendar;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement ar;
	
	@FindBy(xpath = "//span[text()=\"Calendário de Usuários\"]")
	public WebElement mostrar3;
	
	
	
	@FindBy(xpath = "//span[@class=\"btn icon icon-font-Sign-and-Symbols icon-persign closeButton\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//*[@id=\"input-filter\"]/div/div/input")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//*[@id=\"month-wrapper\"]/div/div[1]/div[1]")
	public WebElement atras;
	
	@FindBy(xpath = "//span[text()=\"Calendário de Usuários\"]")
	public WebElement UsuariosCalendario;
	
	@FindBy(xpath = "//div[text()=\"943457\"]")
	public WebElement verificar1;
	
	@FindBy(xpath = "//div[text()=\"943458\"]")
	public WebElement verificar2;
	
	@FindBy(xpath = "//span[text()=\"Abrir Calendário\"]")
	public WebElement AbrirCalendario;
	
	@FindBy(xpath = "//*[@id=\"month-wrapper\"]/div/div[2]/div[1]/div[2]/div[5]")
	public WebElement dia4;
	
	@FindBy(xpath = "//*[@id=\"toolbar-wrapper\"]/div/ul/li[6]/button/span[2]")
	public WebElement actualizar;
	
	@FindBy(xpath = "//*[@id=\"adv-filters-btn\"]/span[2]")
	public WebElement filtrosAvaCal;
	
	@FindBy(xpath = "//*[@id=\"status-filter\"]/div/div[1]/div[2]")
	public WebElement status;
	
	@FindBy(xpath = "//*[@id=\"1\"]/div[1]/label/span")
	public WebElement statusOpc;
	
	@FindBy(xpath = "//*[@id=\"10\"]/div[1]/label/span")
	public WebElement statusBloqueo;
	
	@FindBy(xpath = "//*[@id=\"apply-filters-btn\"]/span[2]")
	public WebElement filtrosAvaCalAplicar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement enviar;
	
	@FindBy(xpath = "//*[@id=\"message\"]")
	public WebElement message;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement seleccionarDesti;
	
	@FindBy(xpath = "//*[@id=\"clear-filters-btn\"]/span[2]")
	public WebElement limparFiltro;

	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//*[@id=\"toolbar-wrapper\"]/div/ul/li[3]/button/span[2]")
	public WebElement volverCalendario;
	
	@FindBy(xpath = "//*[@id=\"table\"]/div/div[1]/div/div[2]/div[1]/div[1]/label/span")
	public WebElement flagEsclarecimento;
	
	public TarefasNASolicitarEsclarecimentoPO() {

		PageFactory.initElements(driver, this);
	}
	public boolean acessarBPMA() {

		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!bPMA.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		bPMA.click();
		
		waitExpectElement(mostrar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar.isDisplayed();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		return sucesso;
		
	}
	
	
	public ArrayList<Boolean> criar() {
		
		procesos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		
		//ultimo id de la tablas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println(id); 
		
		sleep(2000);
		
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nombre.sendKeys("PRUEBA TESTEAUTOMATIZADO QA");
		nombre.sendKeys(Keys.ENTER);
		String txtnombre = nombre.getText();
		System.out.println(txtnombre);
		
		descripcion.sendKeys("PRUEBA TESTEAUTOMATIZADO CRISTHIAN");
		descripcion.sendKeys(Keys.ENTER);
		String txtdescripcion = nombre.getText();
		System.out.println(txtdescripcion);
		sleep(2000);
		
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
		if(tp1 == true || tc2 == true ) {
			periodoFiscalTP1.click();
			sleep(1000);
		}else {
			periodoFiscalTQ1.click();
			sleep(1000);;
		}
		
		
		
		criar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(operacao, driver.findElement(By.xpath("//div[@id=\"canvas\"]/div[1]/div[1]")));
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(inicio, driver.findElement(By.xpath("//div[@id=\"canvas\"]/div[1]/div[1]")));
		sleep(2000);
		
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(fin, driver.findElement(By.xpath("//div[@id=\"canvas\"]/div[1]/div[1]")));
		sleep(2000);
		
		
		dobleClickElement(NovoOperacao);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(actividad, driver.findElement(By.xpath("//div[@id=\"Operation\"]/div/div/div/div/div")));
		sleep(2000);
		

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(fin, driver.findElement(By.xpath("//div[@id=\"Operation\"]/div/div/div/div/div")));
		sleep(2000);
		
		dobleClickElement(NovoActividad);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(tarefa, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(fin, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(2000);
		
		tarefaDiv.click();
		sleep(3000);
		tarefaEdit.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		tipoTSele.click();
		sleep(3000);
		tipoTSeleOpc.click();
		sleep(3000);
		
		componente.click();
		sleep(3000);
		componeteOpc.click();
		sleep(3000);
		
		tarefaSele.click();
		sleep(3000);
		tarefaSeleOpc.click();
		sleep(3000);

		entrada.click();
		sleep(3000);
		
		variant.click();
		sleep(3000);
		
		waitExpectElement(opacao);
		opacao.click();
		sleep(3000);
		
		inputEntrada.click();
		sleep(3000);
		invisibilityOfElement("div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		flag.click();
		sleep(3000);
		
		confirmar.click();
		sleep(5000);
		
		
		
		tfp.click();
		sleep(3000);
		
		waitExpectElement(opacao);
		tfpopacao.click();
		sleep(3000);
		
		inputEntrada.click();
		sleep(3000);
		invisibilityOfElement("div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		flag.click();
		sleep(3000);
		
		confirmar.click();
		sleep(5000);
		
		aplicar.click();

		
		sleep(4000);
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		justificativa.sendKeys("JUSTIFICATIVA TESTE AUTOMATIZADO");
		sleep(2000);
		aplicarJustificativa.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		driver.navigate().refresh();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		
		dobleClickElement(NovoOperacao);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		dobleClickElement(NovoActividad);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		
		
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sim.click();
		sleep(3000);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
//		
		procesos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println(idB);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		double idD = Integer.valueOf(id); 
		double idBD = Integer.valueOf(idB);
		
		//boolean sucesso1 = (Boolean) null;
		if (idBD > idD) {
			idInserir1(idB);
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
		
	}

	
	
	public boolean ativadorProcesos() {

		sleep(2000);
		ativadordeprocessos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]")).getText();
		System.out.println(id);
		
		novoProceso.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter1();
		WebElement flagP = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"process\"]/div/label/span"));
		
		System.out.println("Numero do Registro:"+idRegistro);
		pesquisar2.sendKeys(idRegistro);
		pesquisar2.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		flagP.click();
		sleep(2000);
		
		proximo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(dias);
		sleep(2000);
		dias.click();
		sleep(2000);
		diasOpc.click();
		sleep(3000);
		
		iniciarQuando.click();
		sleep(2000);
		iniciarQuandoOpc.click();
		sleep(3000);
		
		diaInicio.sendKeys("04");
		sleep(2000);
		
		confSubPeriodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else {
			tq1 = true;
		}
		if(tq1 == true) {
			filtrarSubPer.sendKeys("702");
			sleep(1000);
			filtrarSubPer.sendKeys(Keys.ENTER);
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}else if ( tp1 == true ) {
			filtrarSubPer.sendKeys("131");
			sleep(1000);
			filtrarSubPer.sendKeys(Keys.ENTER);
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}else {
			filtrarSubPer.sendKeys("74");
			sleep(1000);
			filtrarSubPer.sendKeys(Keys.ENTER);
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		flagSubPer.click();
		sleep(3000);
		
		
		confirmarr.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		proximo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		aplicarJustificativa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(18000);
		
		userPesquisa.sendKeys("TESTEAUTOMATIZADO");
		sleep(3000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(userArrastrar, driver.findElement(By.xpath("//*[@id=\"activatorC-toolbar\"]/div/div/ul/li[4]/button")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(userArrastrar, driver.findElement(By.xpath("//*[@id=\"activatorC-toolbar\"]/div/div/ul/li[5]/button")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(userArrastrar, driver.findElement(By.xpath("//div[@id=\"canvas\"]/div[1]/div[1]")));
		sleep(6000);
		
		
		dobleClickElement(NovoOperacao);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(15000);
		
		sleep(2000);
		userPesquisa2.sendKeys("TESTEAUTOMATIZADO");
		sleep(3000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(userArrastrar2, driver.findElement(By.xpath("//*[@id=\"user-operation-droppable\"]")));
		sleep(6000);
		
		
		dobleClickElement(NovoActividad);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(15000);

		sleep(2000);
		userPesquisa3.sendKeys("TESTEAUTOMATIZADO");
		sleep(3000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(userArrastrar3, driver.findElement(By.xpath("//*[@id=\"user-activity-droppable\"]")));
		sleep(2000);
		
		ativar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		ativadordeprocessos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]")).getText();
		
		System.out.println(id);
		sleep(2000);
		idInserir2(id2);
		System.out.println(id2);
		
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(id2);
		
		boolean sucesso = false;
		
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		System.out.println(sucesso);
		
		
		return sucesso;

	}

	
	public boolean acessarTFP() {
		sleep(2000);
		home.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!tFP.isDisplayed()) {
			flecha.click();
		}
		sleep(1000);
		
		tFP.click();
		
		waitExpectElement(mostrar2);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar2.isDisplayed();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		System.out.println(sucesso);
		return sucesso;
		
	}


	public ArrayList<Boolean> filtroTFP() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);

		periodosMenu.click();
		sleep(3000);
		

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else {
			tq1 = true;
		}
		if(tq1 == true) {
			pesquisarPeriodo.sendKeys("144617");
			sleep(1000);
			pesquisarPeriodo.sendKeys(Keys.ENTER);
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(8000);
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"144617\"]/div[1]/div"));
			WebElement acoes = driver.findElement(By.xpath("//div[@data-id=\"144617\"]/div[1]/div/div[2]/ul/li/span[text()=\"Subperíodos Fiscais\"]"));
			
			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			acoes.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(12000);
			
			WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\"sub_5092\"]/div[1]/div"));
			WebElement acoes2 = driver.findElement(By.xpath("//div[@data-id=\"sub_5092\"]/div[1]/div/div[2]/ul/li/span[text()=\"200 - Pré-Fechamento\"]"));
			
	
			sleep(2000);
			menu2.click();
			sleep(2000);
			acoes2.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(12000);
			
			menu2 = driver.findElement(By.xpath("//div[@data-id=\"sub_5092\"]/div[1]/div"));
			WebElement acoes3 = driver.findElement(By.xpath("//div[@data-id=\"sub_5092\"]/div[1]/div/div[2]/ul/li/span[text()=\"100 - Aberto\"]"));
			
			sleep(2000);
			menu2.click();
			sleep(2000);
			acoes3.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(8000);
			
		  	
		}else if ( tp1 == true ) {
			pesquisarPeriodo.sendKeys("22661");
			sleep(1000);
			pesquisarPeriodo.sendKeys(Keys.ENTER);
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"22661\"]/div[1]/div"));
			WebElement acoes = driver.findElement(By.xpath("//div[@data-id=\"22661\"]/div[1]/div/div[2]/ul/li/span[text()=\"Subperíodos Fiscais\"]"));
			
			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			acoes.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(8000);
			
			WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\"sub_11913\"]/div[1]/div"));
			WebElement acoes2 = driver.findElement(By.xpath("//div[@data-id=\"sub_11913\"]/div[1]/div/div[2]/ul/li/span[text()=\"200 - Pré-Fechamento\"]"));
			
	
			sleep(2000);
			menu2.click();
			sleep(2000);
			acoes2.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(18000);
			
			WebElement acoes3 = driver.findElement(By.xpath("//div[@data-id=\"sub_11913\"]/div[1]/div/div[2]/ul/li/span[text()=\"100 - Aberto\"]"));
			
			sleep(2000);
			menu2.click();
			sleep(2000);
			acoes3.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(8000);
		}else {
			pesquisarPeriodo.sendKeys("22076");
			sleep(1000);
			pesquisarPeriodo.sendKeys(Keys.ENTER);
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"22076\"]/div[1]/div"));
			WebElement acoes = driver.findElement(By.xpath("//div[@data-id=\"22076\"]/div[1]/div/div[2]/ul/li/span[text()=\"Subperíodos Fiscais\"]"));
			
			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			acoes.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(8000);
			
			WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\"sub_392\"]/div[1]/div"));
			WebElement acoes2 = driver.findElement(By.xpath("//div[@data-id=\"sub_392\"]/div[1]/div/div[2]/ul/li/span[text()=\"200 - Pré-Fechamento\"]"));
			
	
			sleep(2000);
			menu2.click();
			sleep(2000);
			acoes2.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(18000);
			
			WebElement acoes3 = driver.findElement(By.xpath("//div[@data-id=\"sub_392\"]/div[1]/div/div[2]/ul/li/span[text()=\"100 - Aberto\"]"));
			
			sleep(2000);
			menu2.click();
			sleep(2000);
			acoes3.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(8000);
		}
		
		fecharTFP.click();
		sleep(3000);
		
		
		
		
		
		
		int rows2 = rows("//div[contains(@class,\"tr\") and @data-id]/div[3]/div");

		String textId = driver.findElement(By.xpath("//div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();
		
		
		System.out.println("ID obtenido: "+textId);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(true);
	
		System.out.println(sucesso);
		
		return sucesso;
		
	}


	public boolean acessarCalendar() {
		sleep(2000);
		home.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectXpath("//*[@id=\"home-icon\"]");
		sleep(1000);
		
		while (!calendar.isDisplayed()) {
			ar.click();
		}
		sleep(1000);
		
		calendar.click();
		
		waitExpectElement(mostrar3);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		boolean sucesso = mostrar3.isDisplayed();
		return sucesso;
		
		
	}

	
	public ArrayList<Boolean> Calendario() {
		
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
		
		fechar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		AbrirCalendario.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		dia4.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		actualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		filtrosAvaCal.click();
		sleep(3000);
		
		status.click();
		sleep(3000);
		statusOpc.click();
		sleep(3000);
		closeSelectTypeCheckbox(status);
		sleep(4000);
		
		filtrosAvaCalAplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"0\"]/div[2]/div"));
		WebElement acoes = driver.findElement(By.xpath("//div[@data-id=\"0\"]/div[2]/div/div[2]/ul/li/span[text()=\"Solicitar esclarecimento\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		acoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		enviar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		message.sendKeys("teste automatizado");
		sleep(3000);
		
		seleccionarDesti.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys("MGASP");
		sleep(4000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(2000);
		
		flagEsclarecimento.click();
		sleep(3000);
		
		enviar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(18000);
		
		
		
		UsuariosCalendario.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		pesquisar.sendKeys("MGASP");
		sleep(4000);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(2000);
		
		flagEsclarecimento.click();
		sleep(6000);
		
		aceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		limparFiltro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		dia4.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		
		status.click();
		sleep(3000);
		statusBloqueo.click();
		sleep(3000);
		closeSelectTypeCheckbox(status);
		sleep(4000);
		
		filtrosAvaCalAplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\"0\"]/div[2]/div"));
		WebElement acoesTarefa = driver.findElement(By.xpath("//div[@data-id=\"0\"]/div[2]/div/div[2]/ul/li/span[text()=\"Apropriar Tarefa\"]"));
		
		sleep(2000);
		menu.click();
		sleep(2000);
		acoesTarefa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		volverCalendario.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		
		menu = driver.findElement(By.xpath("//div[@data-id=\"0\"]/div[2]/div"));
		WebElement acoesEsclarecer = driver.findElement(By.xpath("//div[@data-id=\"0\"]/div[2]/div/div[2]/ul/li/span[text()=\"Esclarecer\"]"));
		
		sleep(2000);
		menu.click();
		sleep(2000);
		acoesEsclarecer.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		message.sendKeys("teste automatizado");
		sleep(3000);
		
		enviar.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		limparFiltro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		status.click();
		sleep(3000);
		statusOpc.click();
		sleep(3000);
		closeSelectTypeCheckbox(status);
		sleep(4000);
		
		filtrosAvaCalAplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		home.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		System.out.println(sucesso);
		return sucesso;
	}

	public ArrayList<Boolean> lexeiraProcesos() {
		
		procesos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		//ultimo id de la tablas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
				
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println(id); 
		String idRegistro = idObter1();
		sleep(000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acoes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		acoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println(idB);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		double idD = Integer.valueOf(id); 
		double idBD = Integer.valueOf(idB);
		
		//boolean sucesso1 = (Boolean) null;
		if (idBD < idD) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
	
	public ArrayList<Boolean> lexeiraAtivador() {
		
		sleep(2000);
		ativadordeprocessos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//ultimo id de la tablas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
				
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println(id); 
		String idRegistro = idObter2();
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acoes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Desativar Configuração\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		acoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acoesLexe = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		acoesLexe.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println(idB);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		double idD = Integer.valueOf(id); 
		double idBD = Integer.valueOf(idB);
		
		//boolean sucesso1 = (Boolean) null;
		if (idBD < idD) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
}
