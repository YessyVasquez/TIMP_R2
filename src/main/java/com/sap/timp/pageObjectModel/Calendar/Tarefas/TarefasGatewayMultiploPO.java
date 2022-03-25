package com.sap.timp.pageObjectModel.Calendar.Tarefas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class TarefasGatewayMultiploPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Processo de negócio\"]")
	public WebElement procesoNegocio;

	@FindBy(xpath = "//span[text()=\"Processos de Negocio\"]")
	public WebElement procesos;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;


	//NUEVO PROCESO DE NEGOCIO
	@FindBy(xpath = "//span[text()=\"Novo Processo\"]")
	public WebElement novo;

	@FindBy(xpath = "//div[@class=\"processName-field\"]/div/div/input")
	public WebElement nome;

	@FindBy(xpath = "//div[contains(@class,\"rdProcessPeriodicity\")]/label/span")
	public WebElement tipoProceso;

	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement criar;

	//Elementos Para realizar figura
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
	@FindBy(xpath = "//div[text()=\"Gateway Múltiplo\"]")
	public WebElement Gateway;
	@FindBy(xpath = "//div[text()=\"Tarefa\"]")
	public WebElement tarefa;
	@FindBy(xpath = "//div[text()=\"Porta Múltiple\"]")
	public WebElement portaMultipla;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[3]/*/*[9]")
	public WebElement editarTarefa;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[4]/*/*[9]")
	public WebElement editarTarefa1;
	@FindBy(xpath = "//div[@class=\"layout-cell input-cell operationName-field\"]/div/div/input")
	public WebElement nomeTarefa;

	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[2]/*[10]/*/*")
	public WebElement editarGateway;

	@FindBy(xpath = "//div[@class=\"layout-cell input-cell gatewayName-field\"]/div/div/input")
	public WebElement nomeGateway;

	@FindBy(xpath = "//div[@class=\"rowsContainer\"]/div[1]/div[2]/div/div/input")
	public WebElement rota1;
	@FindBy(xpath = "//div[@class=\"rowsContainer\"]/div[2]/div[2]/div/div/input")
	public WebElement rota2;

	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar; 

	//unir los puntos en la  figura

	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[1]/*/*[2]")
	public WebElement inicioPunto;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[2]/*[9]")
	public WebElement gatewayPunto1;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[2]/*[5]")
	public WebElement gatewayPunto2;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[2]/*[7]")
	public WebElement gatewayPunto3;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[3]/*/*[7]")
	public WebElement tarefaPunto1;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[4]/*/*[6]")
	public WebElement tarefa2Punto1;

	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[3]/*/*[8]")
	public WebElement tarefaPunto2;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[4]/*/*[5]")
	public WebElement tarefa2Punto2;

	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[5]/*[5]")
	public WebElement portaMultipla1;
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[5]/*[3]")
	public WebElement portaMultipla2;

	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[5]/*[7]")
	public WebElement portaMultipla3;

	@FindBy(xpath = "//div[contains(@class,\"baseTabs-view -view-wrapper\")][3]/div/div[@id=\"Activity\"]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"][1]/*[6]/*/*[4]")
	public WebElement final1;

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

	@FindBy(xpath = "//button[@id=\"selectPeriodicity\"]")
	public WebElement periodicidad; 

	@FindBy(xpath = "//tr[@class=\"days-tr\"][2]/td[2]/div/div/div/input")
	public WebElement diasInicio; 

	@FindBy(xpath = "//input[@placeholder=\"Clique para selecionar Periodicidade\"]")
	public WebElement iniciarCuando; 
	@FindBy(xpath = "//li[text()=\"100 - Aberto\"]")
	public WebElement opcIniciarCuando; 


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

	//despues de aplicar
	@FindBy(xpath = "//div[@id=\"user-process-list\"]//div[contains(@class,\"user-name draggable-tile-name\") and text()=\"TESTEAUTOMATIZADO\"]")
	public WebElement usuarioProceso;

	@FindBy(xpath = "//span[text()=\"Ativar\"]")
	public WebElement ativar;

	//para utilizar despues de pesquisar
	@FindBy(xpath = "//div[@id=\"user-operation-list\"]//div[contains(@class,\"user-name draggable-tile-name\") and text()=\"TESTEAUTOMATIZADO\"]")
	public WebElement usuarioOperacao;

	@FindBy(xpath = "//div[@id=\"user-activity-list\"]//div[contains(@class,\"user-name draggable-tile-name\") and text()=\"TESTEAUTOMATIZADO\"]")
	public WebElement usuarioActividade;

	@FindBy(xpath = "//*[@id=\"home-icon\"]")
	public WebElement menu;
	
	//************** IR TFP ****************


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

	@FindBy(xpath = "//div[@class=\"base-checkbox\"][1]/label/span")
	public WebElement flag1;

	@FindBy(xpath = "//button[text()=\"Concluir\"]")
	public WebElement concluir;

	@FindBy(xpath = "//span[text()=\"Fechar Calendário\"]")
	public WebElement fecharCalendario;


	//*******************LIXERIA************
	
	@FindBy(xpath = "//span[text()=\"Lixeira\"]")
	public WebElement lixeria;
	
	@FindBy(xpath = "//span[text()=\"Lixeira de Processos\"]")
	public WebElement lixeriaProceso;

	public TarefasGatewayMultiploPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean>  criarProceso() {
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

		//NO ESTA TERMINADO, FAVOR DE NO EJECUTAR

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
		System.out.println("Ultimo Id Creado "+id); 
		sleep(2000);

		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		nome.sendKeys("PRUEBA TESTEAUTOMATIZADO TAREFAS GATEWAY AUTOMATICO MASSIEL VASQUEZ 2");
		sleep(2000);

		String txtnombre = nome.getText();
		System.out.println(txtnombre);
		sleep(4000);

		tipoProceso.click();
		sleep(2000);

		criar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(6000);

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
		moveToElement(Gateway, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(tarefa, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(2000);

		editarTarefa.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		nomeTarefa.clear();
		sleep(2000);

		nomeTarefa.sendKeys("Tarefa 1 massiel");
		sleep(2000);

		aplicar.click();
		sleep(3000);


		moveToElement(tarefa, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(2000);

		editarTarefa1.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		nomeTarefa.clear();
		sleep(2000);

		nomeTarefa.sendKeys("Tarefa 2 massiel");
		sleep(2000);

		aplicar.click();
		sleep(3000);

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
		moveToElement(inicioPunto, gatewayPunto1);
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(gatewayPunto2, tarefaPunto1);
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(gatewayPunto3, tarefa2Punto1);
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(tarefaPunto2, portaMultipla1);
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(tarefa2Punto2, portaMultipla2);
		sleep(2000);


		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(portaMultipla3, final1);
		sleep(2000);

		editarGateway.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		nomeGateway.sendKeys("1 ou 2? massiel 6");
		sleep(2000);

		rota1.sendKeys("1");
		sleep(2000);

		rota2.sendKeys("2");
		sleep(2000);

		aplicar.click();
		sleep(3000);

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

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("ID CREADO PROCESO NEGOCIO: "+idB);

		idInserir("idProcesoNegocio",idB);

		double idD = Integer.valueOf(id); 
		double idBD = Integer.valueOf(idB);

		//compara pra ver se o novo id criado é realmente o ultimo

		if (idBD > idD) { 
			sucesso.add(true); 
		}else { 
			sucesso.add(false); 
		}

		String nomeProceso = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[6]/div")).getText();

		System.out.println("Nombre de Proceso: "+nomeProceso); 
		sleep(2000);

		sucesso.add(nomeProceso.contains("PRUEBA TESTEAUTOMATIZADO TAREFAS GATEWAY AUTOMATICO MASSIEL"));

		System.out.println(sucesso); 

		ativadorProcesos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		//********Obtener 1 de la primera Linea
		String idAtivadorProcesos = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]/div")).getText();
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
		sleep(5000);

		pesquisarActividade.sendKeys("TESTEAUTOMATIZADO");
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(usuarioActividade, driver.findElement(By.xpath("//div[@id=\"user-activity-droppable\"]/div/div/div/div/div")));
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ativar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");


		//waitExpectElement(ativadorProcesos);
		sleep(8000);

		ativadorProcesos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idAtivadorProcesosNuevo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]/div")).getText();
		System.out.println( idAtivadorProcesosNuevo); 
		idInserir("idAtivadorProcesosNuevo",idAtivadorProcesosNuevo);

		double idDD = Integer.valueOf(idAtivadorProcesos); 
		double idBDD = Integer.valueOf(idAtivadorProcesosNuevo);

		//compara pra ver se o novo id criado é realmente o ultimo

		if (idBDD > idDD) { 
			sucesso.add(true); 
		}else { 
			sucesso.add(false); 
		}

		String nomeAtivadorProcesos2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[6]/div")).getText();
		String procesoNegocioAtivadorProcesos2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[8]/div")).getText();
		String periodoAtivadorProcesos2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[9]/div")).getText();

		System.out.println("Nombre Ativador: "+nomeAtivadorProcesos2); 
		System.out.println("Proceso Negocio: "+procesoNegocioAtivadorProcesos2); 
		System.out.println("Periodo: "+periodoAtivadorProcesos2);
		sleep(2000);


		sucesso.add(nomeAtivadorProcesos2.contains("PRUEBA TESTEAUTOMATIZADO TAREFAS GATEWAY AUTOMATICO MASSIEL "));
		sucesso.add(procesoNegocioAtivadorProcesos2.contains("PRUEBA TESTEAUTOMATIZADO TAREFAS GATEWAY AUTOMATICO MASSIEL"));
		sucesso.add(periodoAtivadorProcesos2.contains("Período Fiscal"));

		sleep(2000);
		menu.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		System.out.println(sucesso);
		return sucesso;	
	}
	
	public ArrayList<Boolean> irTFP() {
		
		System.out.println("---------- TFP ---------");
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
		
		System.out.println(sucesso);
		return sucesso;		

	}



	public  ArrayList<Boolean> irCalendario() {
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		System.out.println("----------CALENDARIO ---------");
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
				By.xpath("//div[@class=\"dates-wrapper\"]/div[@date=\""+diaTarefa+"\"][1]"));
	
	
		diaTarefaCalendario.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		
		fecharCalendario.click();
		sleep(4000);
		
		actionsMoveToElementElement(pesquisarBPMA);
		sleep(4000);
		
		pesquisarBPMA.sendKeys("1 ou 2? massiel 6");
		sleep(2000);
		pesquisarBPMA.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		String nombreProce1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[21]/div")).getText();
		System.out.println("Nombre de Proceso : "+nombreProce1);
	
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		System.out.println("1 o 2: "+id2);
		
		String nome1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]/div")).getText();
		System.out.println("Nome 1:  "+ nome1); 
		
		String status1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[5]/div")).getText();
		System.out.println("Status 1:  "+ status1); 
		
		sucesso.add(nombreProce1.contains("PRUEBA TESTEAUTOMATIZADO TAREFAS GATEWAY AUTOMATICO MASSIEL VASQUEZ 2"));
		sucesso.add(nome1.equals("1 ou 2? massiel 6"));
		sucesso.add(status1.equals("Aberta"));
		sleep(2000);
	
		pesquisarBPMA.clear();
		sleep(2000);
		
		pesquisarBPMA.sendKeys("Tarefa 1 massiel");
		sleep(2000);
		pesquisarBPMA.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println("---- Comparar segundo Dato Dato--------");
		
		
		
		String nombreProce2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[21]/div")).getText();
		System.out.println("Nombre de Proceso: "+nombreProce2);
		
		String id1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		System.out.println("Tarefa 1: "+id1);
		
		String nome2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]/div")).getText();
		System.out.println("Nome 2:  "+ nome2);
		
		String status2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[5]/div")).getText();
		System.out.println("Status 2:  "+ status2); 
		
		sucesso.add(nombreProce2.contains("PRUEBA TESTEAUTOMATIZADO TAREFAS GATEWAY AUTOMATICO MASSIEL VASQUEZ 2"));
		sucesso.add(nome2.equals("Tarefa 1 massiel"));
		sucesso.add(status2.equals("Em Fila"));
		
		
		System.out.println("---- Comparar tercer  Dato--------");
		
		
		pesquisarBPMA.clear();
		sleep(2000);
		
		pesquisarBPMA.sendKeys("Tarefa 2 massiel");
		sleep(2000);
		pesquisarBPMA.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String nombreProce3 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[21]/div")).getText();
		System.out.println("Nombre de Proceso: "+nombreProce3); 
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		System.out.println("Tarefa 2: "+id); 
		
		String nome3 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]/div")).getText();
		System.out.println("Nome 3 "+ nome3);
		
		String status3 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[5]/div")).getText();
		System.out.println("Status 3 "+ status3);
		
		sucesso.add(nombreProce3.contains("PRUEBA TESTEAUTOMATIZADO TAREFAS GATEWAY AUTOMATICO MASSIEL VASQUEZ 2"));
		sucesso.add(nome3.equals("Tarefa 2 massiel"));
		sucesso.add(status3.equals("Em Fila"));
		sleep(2000);
		
		System.out.println("---- concluir primer dato--------");
		
		
		pesquisarBPMA.clear();
		sleep(2000);
		
		pesquisarBPMA.sendKeys("1 ou 2? massiel 6");
		sleep(2000);
		pesquisarBPMA.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		WebElement menu1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div"));
		
		WebElement concluir1 = driver.findElement(By.xpath("//div[@data-id][1]/div[2]/div/div[2]/ul/li/span[text()=\"Concluir\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(4000);

		menu1.click(); 
		sleep(1000);
		
		concluir1.click();
		sleep(3000);
		
		flag1.click();
		sleep(2000);
		
		concluir.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
	
		
		
		System.out.println("---- verificar status--------");
		
		
		pesquisarBPMA.clear();
		sleep(4000);
		
		pesquisarBPMA.sendKeys("1 ou 2? massiel 6");
		sleep(2000);
		
		pesquisarBPMA.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	
		
		String status11 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[5]/div")).getText();
		System.out.println("1 ou 2? massiel 6"+ status11);
	
		sucesso.add(status11.equals("Concluida"));
		sleep(2000);
		
		System.out.println("---- verificar status Tarefa 1--------");
		
		
		pesquisarBPMA.clear();
		sleep(2000);
		
		pesquisarBPMA.sendKeys("Tarefa 1 massiel");
		sleep(2000);
		pesquisarBPMA.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
	
		
		String status22 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[5]/div")).getText();
		System.out.println("Status 1 "+ status22); 
		sucesso.add(status22.equals("Aberta"));
		sleep(2000);
		
		
		System.out.println("---- verificar  Tarefa 2--------");
		
		
		pesquisarBPMA.clear();
		sleep(2000);
		pesquisarBPMA.sendKeys("Tarefa 2 massiel");
		sleep(2000);
		
		pesquisarBPMA.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows6 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		System.out.println(rows6);
		
		if (rows6 == 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		sleep(2000);
		menu.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println(sucesso);
		return sucesso;		
	}
	
	public ArrayList<Boolean>  BPMA() {
	

		procesos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		pesquisarBPMA.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("idProcesoNegocio");
		
		pesquisarBPMA.sendKeys(idRegistro);
		sleep(2000);
		pesquisarBPMA.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(4000);

		menu.click();
		sleep(1000);
		excluir.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		sim.click();
		sleep(3000);
		
		procesos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		

		
		//verificando que fue a lixeria
		
		lixeria.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rowsl = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idl = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rowsl+"]/div[5]/div")).getText();
		
		int idll = convertToInt(idl);
		int id2 = convertToInt(idRegistro);

		if (idll == id2) {
			sucesso.add(true);
		}
		
		System.out.println( sucesso);
		
		System.out.println("ACTIVADOR DE PROCESO");
	
		ativadorProcesos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro2 = idObter("idAtivadorProcesosNuevo");
		
		pesquisarBPMA.sendKeys(idRegistro2);
		sleep(2000);
		pesquisarBPMA.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idPro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[5]/div")).getText();
		System.out.println(idPro);

		WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro2+"\"]/div[1]/div"));
		WebElement excluir2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Desativar Configuração\"]"));
		
		
				
		actionsMoveToElementElement(menu2);
		sleep(4000);

		menu2.click();
		sleep(1000);
		
		excluir2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		WebElement menu3 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro2+"\"]/div[1]/div"));
		WebElement excluir3 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
	
		actionsMoveToElementElement(menu3);
		sleep(4000);

		menu3.click();
		sleep(1000);
		
		excluir3.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		sim.click();
		sleep(4000);
		
		waitExpectElement(pesquisarBPMA);
		sleep(4000);
		
		lixeriaProceso.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idAtivadorProcesosl = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]/div")).getText();
		System.out.println( idAtivadorProcesosl);
		
		
		int id1l = convertToInt(idAtivadorProcesosl);
		int id2l = convertToInt(idPro);
		System.out.println(id1l);
		System.out.println(id2l);
		
		if (id1l == id2l) {
			sucesso.add(true);
		}
		

		//verificando que fue a lixeria
		
		System.out.println( sucesso);
		return sucesso;
	}

	

	
	
	
}
