package com.sap.timp.pageObjectModel.Calendar.Tarefas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.IFactoryAnnotation;

import com.sap.timp.base.TestBaseKenssy;

public class TarefasMultiplasEstagiosPO extends TestBaseKenssy  {

	@FindBy(xpath = "//span[text()=\"Processo de negócio\"]")
	public WebElement procesoNegocio;

	@FindBy(xpath = "//span[text()=\"Processos de Negocio\"]")
	public WebElement procesos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	//NUEVO PROCESO DE NEGOCIO
	@FindBy(xpath = "//span[text()=\"Novo Processo\"]")
	public WebElement novo;
	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome de Processo\"]")
	public WebElement nome;
	@FindBy(xpath = "//div[contains(@class,\"rdProcessPeriodicity\")]/label/span")
	public WebElement tipoProceso;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement criar;
	
	//FORMAS
	@FindBy(xpath = "//div[text()=\"Ponto de Início\"]")
	public WebElement inicio;
	@FindBy(xpath = "//li[contains(@class,\"end-point\")]")
	public WebElement fin;
	@FindBy(xpath = "//div[text()=\"Operação\"]")
	public WebElement operacao;
	@FindBy(xpath = "//div[text()=\"Nova Operação\"][2]")
	public WebElement NovoOperacao;
	@FindBy(xpath = "//li[contains(@class,\"activity\")]")
	public WebElement actividad;
	@FindBy(xpath = "//div[text()=\"Nova Atividade\"][2]")
	public WebElement NovoActividad;
	@FindBy(xpath = "//div[text()=\"Porta Múltiple\"]")
	public WebElement portaMultipla;
	@FindBy(xpath = "//div[text()=\"Tarefa\"]")
	public WebElement tarefa;
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[3]/*/*/*/*/div[2]")
	public WebElement nomeTarefa1;
	
	////*[@id="start"]/circle[2]
	
	//div[contains(@class,"baseTabs-view -view-wrapper")][3]/div/div[@id="Activity"]/div/div/div/div/div/*[1]/*[name()="g" and @id="artifacts"][1]/*/*/*[2]
	
	
	
	@FindBy(xpath = "//div/div[@id=\"canvas\"]/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*/*[name()=\"g\" and @id=\"start\"]")
	public WebElement finito;
	
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*/*[name()=\"g\" and @class=\"artifact startpoint\"]/*[2]")
	public WebElement puntoInicio1;
	
	//**************cruz 1******************

	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[name()=\"g\" and @class=\"artifact parallel\" and @id=\"0\"]/*[3]")
	public WebElement puntoCruz1;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[name()=\"g\" and @class=\"artifact parallel\" and @id=\"0\"]/*[7]")
	public WebElement puntoCruz11;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[name()=\"g\" and @class=\"artifact parallel\" and @id=\"0\"]/*[5]")
	public WebElement puntoCruz111;
	
	//************Tarefa 1****************
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[3]/*[name()=\"g\" and @class=\"artifact block task\" and @id=\"1\"]/*[7]")
	public WebElement puntoTarefa1;

	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[3]/*[name()=\"g\" and @class=\"artifact block task\" and @id=\"1\"]/*[5]")
	public WebElement puntoTarefa11;
	
	//**************cruz 2******************
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[name()=\"g\" and @class=\"artifact parallel\" and @id=\"3\"]/*[9]")
	public WebElement puntoCruz2;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[name()=\"g\" and @class=\"artifact parallel\" and @id=\"3\"]/*[7]")
	public WebElement puntoCruz22;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[name()=\"g\" and @class=\"artifact parallel\" and @id=\"3\"]/*[3]")
	public WebElement puntoCruz222;
	
	//***********final**********
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*/*[name()=\"g\" and @class=\"artifact endpoint\"]/*[4]")
	public WebElement puntoFinal1;
	
	//**************Tarefa 2************
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*/*[name()=\"g\" and @class=\"artifact block task\" and @id=\"2\"]/*[5]")
	public WebElement puntoTarefa2;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*/*[name()=\"g\" and @class=\"artifact block task\" and @id=\"2\"]/*[7]")
	public WebElement puntoTarefa22;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*/*[name()=\"g\" and @class=\"artifact block task\" and @id=\"2\"]/*[8]")
	public WebElement puntoTarefa222;
	
	//********Adicionar Estagio******
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[2]/button[@id=\"add-column\"]")
	public WebElement addEstagio;
	
	
	
	//******Editar Tarefa 1*******
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*/*[name()=\"g\" and @class=\"artifact block task\" and @id=\"1\"]/*[name()=\"foreignObject\" and @class=\"edit-btn\"]/body/span")
	public WebElement editarTarefa1;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*/*[name()=\"g\" and @class=\"artifact block task\" and @id=\"2\"]/*[name()=\"foreignObject\" and @class=\"edit-btn\"]/body/span")
	public WebElement editarTarefa2;
	
	@FindBy(xpath = "//input[@placeholder=\"Nome\"]")
	public WebElement nombreT1;
	@FindBy(xpath = "//input[@placeholder=\"Nome\"]")
	public WebElement nombreT2;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar; 
	
	//*********Gravar forma****************
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	//*********Ativador de Procesos**********
	@FindBy(xpath = "//li[1]/div/span[text()=\"Ativador de Processos\"]")
	public WebElement ativadorProcesos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")
	public WebElement primeira;
	
	//NUEVO ATIVADOR DE PROCESO
	@FindBy(xpath = "//span[text()=\"Nova Configuração de Processo\"]")
	public WebElement novoActivador;
		
	@FindBy(xpath = "//div[contains(@id,\"activator-search\")]/div/div/input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button[text()=\"Próximo\"]")
	public WebElement proximo;
	
	@FindBy(xpath = "//input[@placeholder=\"Clique para selecionar Dias\"]")
	public WebElement diasSelect; 
	@FindBy(xpath = "//li[text()=\"Dias Corridos\"]")
	public WebElement opcdiasSelect; 
	
	@FindBy(xpath = "//tr[@class=\"days-tr\"][2]/td[2]/div/div/div/input")
	public WebElement diasInicio; 
	
	@FindBy(xpath = "//input[@placeholder=\"Clique para selecionar Periodicidade\"]")
	public WebElement iniciarCuando; 
	@FindBy(xpath = "//li[text()=\"100 - Aberto\"]")
	public WebElement opcIniciarCuando; 
	
	@FindBy(xpath = "//button[@id=\"selectPeriodicity\"]")
	public WebElement periodicidad; 
	
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por ID\"]")
	public WebElement filtrarId;
	
	
	@FindBy(xpath = "//button[text()=\"Confirmar\"]")
	public WebElement confirmar;
	
	@FindBy(xpath = "//div[@id=\"user-process-search\"]/div/div/input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar2;
	
	@FindBy(xpath = "//div[@id=\"user-operation-search\"]/div/div/input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisarOperacao;
	
	@FindBy(xpath = "//div[@id=\"user-activity-search\"]/div/div/input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisarActividade;
	
	@FindBy(xpath = "//*[@id=\"user-process-list\"]/div[70]/div[2]/div[1]")
	public WebElement usuario;
	
	//bueno
	@FindBy(xpath = "//div[@id=\"user-operation-list\"]//div[contains(@class,\"user-name draggable-tile-name\") and text()=\"TESTEAUTOMATIZADO\"]")
	public WebElement usuarioOperacao;
	
	@FindBy(xpath = "//div[@id=\"user-activity-list\"]//div[contains(@class,\"user-name draggable-tile-name\") and text()=\"TESTEAUTOMATIZADO\"]")
	public WebElement usuarioActividade;
	
	//bueno
	@FindBy(xpath = "//div[@id=\"user-process-list\"]//div[contains(@class,\"user-name draggable-tile-name\") and text()=\"TESTEAUTOMATIZADO\"]")
	public WebElement usuarioProceso;
	
	@FindBy(xpath = "//span[text()=\"Ativar\"]")
	public WebElement ativar;
	
	
	
	
	//************** IR TFP ****************
	@FindBy(xpath = "//*[@id=\"home-icon\"]")
	public WebElement menu;
	
	@FindBy(xpath = "//span[@class=\"title-boxes \" and text()=\"Períodos\"]")
	public WebElement periodos;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-period\"]")
	public WebElement periodosMenu;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisarTFP;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fecharSub;
	
	
	//*******************Calendar************
	
	@FindBy(xpath = "//span[contains(@class,\"closeButton\")]")
	public WebElement fecharPanel;
	
	@FindBy(xpath = "//span[text()=\"Abrir Calendário\"]")
	public WebElement abrirCalendario;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisarBPMA;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	public TarefasMultiplasEstagiosPO() {
		PageFactory.initElements(driver, this);
	}
	
	String idB;
	public ArrayList<Boolean> criarProceso() {
		
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
		
		
		procesos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//ultimo id de la tablas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println(id); 
		sleep(2000);
		
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("PRUEBA TESTEAUTOMATIZADO TAREFA-CALENDAR");
		nome.sendKeys(Keys.ENTER);
		String txtnombre = nome.getText();
		System.out.println(txtnombre);
		
		tipoProceso.click();
		sleep(2000);
		
		criar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(operacao);
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(operacao, driver.findElement(By.xpath("//div[@id=\"canvas\"]/div[1]/div[1]")));
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(fin, driver.findElement(By.xpath("//div[@id=\"canvas\"]/div[1]/div[1]")));
		sleep(2000);
		
		//OPERACAO
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
		
		//ACTIVIDAD
		dobleClickElement(NovoActividad);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(inicio, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(portaMultipla, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(tarefa, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(tarefa, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(portaMultipla, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(fin, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(2000);
		
		
		
		//**********************UNIR PUNTO PARA FORMAR FIGURA************************
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			moveToElement(puntoInicio1, puntoCruz1);
			sleep(2000);
			
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			moveToElement(puntoCruz11, puntoTarefa1);
			sleep(2000);
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			moveToElement(puntoTarefa11, puntoCruz2);
			sleep(2000);
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			moveToElement(puntoCruz22, puntoFinal1);
			sleep(2000);
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			moveToElement(puntoCruz111, puntoTarefa22);
			sleep(2000);
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			moveToElement(puntoTarefa2, puntoCruz222);
			sleep(2000);
		//*********CAMBIAR NOMBRE A TAREFAS***************
		sleep(2000);
		editarTarefa1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nombreT1.clear();
		nombreT1.sendKeys("TAREFA 1");
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		editarTarefa2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nombreT2.clear();
		nombreT2.sendKeys("TAREFA 2");
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		addEstagio.click();
		sleep(2000);
	
		
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		procesos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("ID CREADO PROCESO NEGOCIO: "+idB);
		
		idInserir("idProcesoNegocio",idB);
		
		ativadorProcesos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//********Obtener 1 de la primera Linea
		String idAtivadorProcesos = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[5]/div")).getText();
		System.out.println(idAtivadorProcesos); 
		sleep(2000);
		
		novoActivador.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys(idB);
		WebElement idPesquisado = driver.findElement(By.xpath("//div[contains(@data-id,"+idB+")]/div[contains(@class,\"checkbox\")]/label/span"));
		
		idPesquisado.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		proximo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(diasSelect);
		sleep(3000);
		
		
		diasSelect.click();
		sleep(2000);
		opcdiasSelect.click();
		sleep(2000);
		
		
		diasInicio.sendKeys(diaActual());
		sleep(2000);
		
		iniciarCuando.click();
		sleep(2000);
		opcIniciarCuando.click();
		sleep(2000);
		
		periodicidad.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idFiltro = "";
		if(tp1 == true) {
			idFiltro = "131";
			filtrarId.sendKeys("131");
			sleep(2000);
			filtrarId.sendKeys(Keys.ENTER);
			sleep(3000);
		}else if(tq1 == true) {
			idFiltro  = "702";
			filtrarId.sendKeys("702");
			sleep(2000);
			filtrarId.sendKeys(Keys.ENTER);
			sleep(3000);
		}else {
			idFiltro = "74";
			filtrarId.sendKeys("74");
			sleep(2000);
			filtrarId.sendKeys(Keys.ENTER);
			sleep(3000);
		}
		
		sleep(2000);
		WebElement resultFiltrado = driver.findElement(By.xpath("//div[@data-id="+idFiltro+"]/div[contains(@class,\"checkbox\")]/label/span"));
		sleep(2000);
		resultFiltrado.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		confirmar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		proximo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		/////AQUIIIIIIIIIIII
		aplicar.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(usuarioProceso);
		sleep(4000);
		
		pesquisar2.sendKeys("TESTEAUTOMATIZADO");
		sleep(2000);
		
		//*********** ----------halar USUARIO---------- ***********
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			moveToElement(usuarioProceso, driver.findElement(By.xpath("//span[text()=\"Usuário de reabertura\"]")));
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			moveToElement(usuarioProceso, driver.findElement(By.xpath("//span[text()=\"Usuário de aprovação\"]")));
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			moveToElement(usuarioProceso, driver.findElement(By.xpath("//div[@id=\"user-process-droppable\"]/div/div/div/div/div")));
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		
		
		//***************************
		dobleClickElement(NovoOperacao);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		
		
		
		pesquisarOperacao.sendKeys("TESTEAUTOMATIZADO");
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(usuarioOperacao, driver.findElement(By.xpath("//div[@id=\"user-operation-droppable\"]/div/div/div/div/div")));
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//*********************
		dobleClickElement(NovoActividad);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		pesquisarActividade.sendKeys("TESTEAUTOMATIZADO");
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(usuarioActividade, driver.findElement(By.xpath("//div[@id=\"user-activity-droppable\"]/div/div/div/div/div")));
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
			
		System.out.println("arrastre teste automatizado");
		
		ativar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectElement(ativadorProcesos);
		sleep(8000);
		
		ativadorProcesos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println("arrastre teste automatizado2");
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//********Obtener 1 de la primera Linea
		String idB2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]/div")).getText();
		System.out.println("ID CREADO ATIVADOR PROCESO: "+idB2);
		idInserir("idAtivadorProceso",idB2);
		
		String nomeAtivadorProcesos2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[6]/div")).getText();
		String procesoNegocioAtivadorProcesos2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[8]/div")).getText();
		String periodoAtivadorProcesos2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[9]/div")).getText();

		System.out.println("Nombre Ativador: "+nomeAtivadorProcesos2); 
		System.out.println("Proceso Negocio: "+procesoNegocioAtivadorProcesos2); 
		System.out.println("Periodo: "+periodoAtivadorProcesos2);
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			sucesso.add(nomeAtivadorProcesos2.contains("PRUEBA TESTEAUTOMATIZADO TAREFA-CALENDAR"));
			sucesso.add(procesoNegocioAtivadorProcesos2.contains("PRUEBA TESTEAUTOMATIZADO TAREFA-CALENDAR"));
			sucesso.add(periodoAtivadorProcesos2.contains("Período Fiscal"));
		
		
		sleep(2000);
		menu.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		return sucesso;	
	}
	
	public ArrayList<Boolean> irTFP() {
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
		
		sleep(2000);
		periodosMenu.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idFiltroTFP = "";
		if(tp1 == true) {
			idFiltroTFP = "22661";
			pesquisarTFP.sendKeys("22661");
			sleep(2000);
			pesquisarTFP.sendKeys(Keys.ENTER);
			sleep(2000);
		}else if(tq1 == true) {
			idFiltroTFP  = "144617";
			pesquisarTFP.sendKeys("144617");
			sleep(2000);
			pesquisarTFP.sendKeys(Keys.ENTER);
			sleep(2000);
		}else {
			idFiltroTFP = "22076";
			pesquisarTFP.sendKeys("22076");
			sleep(2000);
			pesquisarTFP.sendKeys(Keys.ENTER);
			sleep(2000);
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		WebElement menuFiltradoTpf = driver.findElement(By.xpath("//div[@data-id="+idFiltroTFP+"]/div[1]/div"));
		WebElement subperiodoFiscais = driver.findElement(
				By.xpath("//div[@data-id=\"" + idFiltroTFP + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Subperíodos Fiscais\"]"));

		menuFiltradoTpf.click();
		sleep(2000);
		subperiodoFiscais.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String idFiltroTFPSubperiodoFiscais = "";
		if(tp1 == true) {
			idFiltroTFPSubperiodoFiscais = "11913";
			sleep(2000);
		}else if(tq1 == true) {
			idFiltroTFPSubperiodoFiscais  = "5092";
			sleep(2000);
		}else {
			idFiltroTFPSubperiodoFiscais = "392";
			sleep(2000);
		}
		
		sleep(2000);
		WebElement menuFiltradoTpf2 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltroTFPSubperiodoFiscais+")]/div[1]/div"));
		sleep(2000);
		WebElement preFechamento1 = driver.findElement(
				By.xpath("//div[contains(@data-id,\"" + idFiltroTFPSubperiodoFiscais + "\")]/div[1]/div/div[2]/ul/li/span[text()=\"200 - Pré-Fechamento\"]"));
		
		sleep(2000);
		menuFiltradoTpf2.click();
		sleep(2000);
		preFechamento1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int mensagem = driver.findElements(By.xpath("//span[contains(text(),\"O status foi alterado com sucesso\")]")).size();
		System.out.println(mensagem);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensagem > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		sleep(2000);
		WebElement menuFiltradoTpf3 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltroTFPSubperiodoFiscais+")]/div[1]/div"));
		sleep(2000);
		WebElement preFechamento2 = driver.findElement(
				By.xpath("//div[contains(@data-id,\""+idFiltroTFPSubperiodoFiscais+"\")]/div[1]/div/div[2]/ul/li/span[text()=\"100 - Aberto\"]"));
		
		
		sleep(2000);
		menuFiltradoTpf3.click();
		sleep(2000);
		preFechamento2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		mensagem = driver.findElements(By.xpath("//span[contains(text(),\"O status foi alterado com sucesso\")]")).size();
		System.out.println(mensagem);
		
		
		sucesso = new ArrayList<Boolean>();
		
		if (mensagem > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		fecharSub.click();
		
		sleep(2000);
		menu.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		return sucesso;		
		
	}
	
	public void irCalendario() {
		sleep(2000);
		fecharPanel.click();
		sleep(2000);
		
		abrirCalendario.click();
		sleep(3000);
		waitExpectXpath("//div[@class=\"day\"][1]");
		sleep(2000);
		
		String diaTarefa = diaActual();
		System.out.println("Dia creada Tarefa: "+diaTarefa);
		WebElement diaTarefaCalendario = driver.findElement(
				By.xpath("//div[contains(@date,\""+diaTarefa+"\")]"));

		diaTarefaCalendario.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String diaDespuesTarefa = diaDespues();
		System.out.println("Dia despues Tarefa: "+diaDespuesTarefa);
		
		WebElement diaDespuesTarefaCalendario = driver.findElement(
				By.xpath("//div[contains(@date,\""+diaDespuesTarefa+"\")]"));
		
		sleep(2000);
		diaDespuesTarefaCalendario.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		sleep(2000);
		menu.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	}
	
	public ArrayList<Boolean> lixeiraProcesoNegocio() {
		
		//****************************   Enviar a Lixeira Proceso Negocio ************************

		sleep(2000);
		procesos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println("aqui1");
		
		String idRProcesoNegocio = idObter("idProcesoNegocio");
		System.out.println("idPN:"+ idRProcesoNegocio );
		pesquisarBPMA.sendKeys(idRProcesoNegocio);
		sleep(2000);
		pesquisarBPMA.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println("aqui2");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRProcesoNegocio+"\"]/div[1]/div"));
		WebElement lixeira = driver.findElement(By.xpath("//div[@data-id=\""+idRProcesoNegocio+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		sleep(2000);
		menu.click();
		sleep(2000);
		lixeira.click();
		sleep(3000);
		waitExpectElement(sim);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		System.out.println("aqui3");
		
		//****************************   Enviar a Lixeira Ativador de Procesos ************************
		ativadorProcesos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		String idRAtivadorProceso = idObter("idAtivadorProceso");
		System.out.println("idAN:"+ idRAtivadorProceso );
		pesquisarBPMA.sendKeys(idRAtivadorProceso);
		sleep(2000);
		pesquisarBPMA.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+idRAtivadorProceso+"\"]/div[1]/div"));
		WebElement desactivar = driver.findElement(By.xpath("//div[@data-id=\""+idRAtivadorProceso+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Desativar Configuração\"]"));
		
		
		menu2.click();
		sleep(1000);
		desactivar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		int mensagem = driver.findElements(By.xpath("//span[contains(text(),\"Configuração de processo desativada com sucesso\")]")).size();
		System.out.println(mensagem);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (mensagem > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		sleep(3000);
		WebElement menu3 = driver.findElement(By.xpath("//div[@data-id=\""+idRAtivadorProceso+"\"]/div[1]/div"));
		sleep(3000);
		WebElement lixeiraAP = driver.findElement(By.xpath("//div[@data-id=\""+idRAtivadorProceso+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		sleep(3000);

		
		menu3.click();
		sleep(3000);
		lixeiraAP.click();
		sleep(3000);
		waitExpectElement(sim);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		return sucesso;
	}
}
