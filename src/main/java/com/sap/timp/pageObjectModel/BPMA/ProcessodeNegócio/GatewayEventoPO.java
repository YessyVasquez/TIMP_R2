package com.sap.timp.pageObjectModel.BPMA.ProcessodeNegócio;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class GatewayEventoPO extends TestBaseSteven {


	

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
	
	@FindBy(xpath = "//label[@for=\"rdProcessPeriodicity\"]/span")
	public WebElement periodoFiscal;
	
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
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement no;
	
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
	
	@FindBy(xpath = "//li[text()=\"Tarefa de Usuário\"]")
	public WebElement tipoTSeleOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"SelecionarComponente\"]")
	public WebElement componente;
	
	@FindBy(xpath = "//li[text()=\"BRB\"]")
	public WebElement componeteOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"SelecionarTarefa\"]")
	public WebElement tarefaSele;
	
	@FindBy(xpath = "//li[text()=\"Analisar Relátorio\"]")
	public WebElement tarefaSeleOpc;
	
	@FindBy(xpath = "//span[text()=\"Entrada\"]")
	public WebElement entrada;
	
	@FindBy(xpath = "//span[text()=\"BRB::Variant\"]")
	public WebElement variant;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[3]/div/div[1]/ul/li/ul/li/div/div/span")
	public WebElement opacao;
	
	@FindBy(xpath = "//span[text()=\"Selecionar Entrada\"]")
	public WebElement inputEntrada;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div[6]/div[1]/label/span")
	public WebElement flag;
	
	@FindBy(xpath = "//button[text()=\"Confirmar\"]")
	public WebElement confirmar;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div/div/ul[2]/ul/ul/li[4]/div")
	public WebElement gatewayEvento;
	
	@FindBy(xpath = "//div[@class=\"flow-chart-container\"]//*[name()=\"foreignObject\" and @class=\"edit-btn\"]")
	public WebElement gatewayEventoEdit;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div/button[2]/span[2]")
	public WebElement seleccionarTodo;
	
	@FindBy(xpath = "//*[@id=\"createGatewayDialog\"]/div/div[1]/div[1]/div[2]/div/div/input")
	public WebElement nameGateway;
	
	@FindBy(xpath = "//*[@id=\"createGatewayDialog\"]/div/div[1]/div[2]/div[2]/div/div/input")
	public WebElement descripcionGateway;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[1]/*/*[2]")
	public WebElement puntoCirculo;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[2]/*[9]")
	public WebElement puntoEvento;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[2]/*[7]")
	public WebElement puntoEvento2;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[1]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[3]/*/*[5]")
	public WebElement puntotarefa;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[2]/*/*/span[@aria-label=\"Editar\"]")
	public WebElement editar1;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[2]/*[10]/body/span")
	public WebElement editar;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[3]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[2]/*[10]/body/span")
	public WebElement editar2;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[3]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[1]/*/*[2]")
	public WebElement puntoCirculo4;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[3]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[2]/*[9]")
	public WebElement puntoEvento6;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[3]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[2]/*[7]")
	public WebElement puntoEvento7;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[3]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[3]/*/*[6]")
	public WebElement puntoTarefa;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[2]/div/button[2]/span[2]")
	public WebElement seleccionarTodo2;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[3]/div/button[2]/span[2]")
	public WebElement seleccionarTodo3;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[1]/*/*[2]")
	public WebElement puntoCirculo3;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[2]/*[9]")
	public WebElement puntoEvento4;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[2]/*[7]")
	public WebElement puntoEvento5;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[3]/*/*[5]")
	public WebElement puntoActividad;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[3]/*/*[4]")
	public WebElement puntoActividad2;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[4]/*/*[3]")
	public WebElement puntoFin;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[3]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[3]/*/*[5]")
	public WebElement puntoTarefa2;
	
	@FindBy(xpath = "//div[@id=\"tabs-container\"]/div/div[2]/div/div[3]/div/div[2]/div/div/div/div/div/*[1]/*[name()=\"g\" and @id=\"artifacts\"]/*[4]/*/*[4]")
	public WebElement puntoFin2;
	
	public GatewayEventoPO() {

		PageFactory.initElements(driver, this);
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
		
		periodoFiscal.click();
		sleep(1000);
		criar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		
		System.out.println("--------- Primer Figura--------------"); 
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(gatewayEvento, driver.findElement(By.xpath("//div[@id=\"canvas\"]/div[1]/div[1]")));
		sleep(2000);
		
		seleccionarTodo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement btnEditar = driver.findElement(By.xpath("//*[@class=\"edit-btn\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].setAttribute('style', 'display:none')", btnEliminar);
		js.executeScript("arguments[0].setAttribute('x', '12')", btnEditar);
		js.executeScript("arguments[0].setAttribute('y', '-30')", btnEditar);
		sleep(4000);
		gatewayEventoEdit.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		cancelar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		seleccionarTodo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement btnEditar1 = driver.findElement(By.xpath("//*[@class=\"edit-btn\"]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].setAttribute('style', 'display:none')", btnEliminar);
		js.executeScript("arguments[0].setAttribute('x', '12')", btnEditar1);
		js.executeScript("arguments[0].setAttribute('y', '-30')", btnEditar1);
		sleep(1000);
		
		gatewayEventoEdit.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		nameGateway.sendKeys("Gateway evento");
		sleep(1000);
		descripcionGateway.sendKeys("Descripcion Teste QA");
		sleep(1000);
		aplicar.click();
		sleep(1000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(puntoCirculo, puntoEvento);
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(operacao, driver.findElement(By.xpath("//div[@id=\"canvas\"]/div[1]/div[1]")));
		sleep(2000);

		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(fin, driver.findElement(By.xpath("//div[@id=\"canvas\"]/div[1]/div[1]")));
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(puntoEvento2, puntotarefa);
		sleep(2000);
		
		
			
		dobleClickElement(NovoOperacao);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println("--------- segunda Figura--------------"); 
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(gatewayEvento, driver.findElement(By.xpath("//div[@id=\"Operation\"]/div/div/div/div/div")));
		sleep(4000);
		
		seleccionarTodo2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
	
		actionsMoveToElementElement(editar);
		sleep(2000);
		
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		
		cancelar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		seleccionarTodo2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		actionsMoveToElementElement(editar);
		sleep(2000);
		
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		nameGateway.sendKeys("Gateway evento");
		sleep(1000);
		
		descripcionGateway.sendKeys("Descripcion Teste QA");
		sleep(1000);
		
		aplicar.click();
		sleep(4000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(puntoCirculo3, puntoEvento4);
		sleep(2000);
		
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(actividad, driver.findElement(By.xpath("//div[@id=\"Operation\"]/div/div/div/div/div")));
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(puntoEvento5, puntoActividad);
		sleep(2000);
		

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(fin, driver.findElement(By.xpath("//div[@id=\"Operation\"]/div/div/div/div/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement( puntoActividad2, puntoFin);
		sleep(2000);
		
		System.out.println("--------- tercera Figura--------------"); 
		
		dobleClickElement(NovoActividad);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(gatewayEvento, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(4000);
		
		seleccionarTodo3.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
	
		actionsMoveToElementElement(editar2);
		sleep(2000);
		
		editar2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		cancelar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		seleccionarTodo3.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		actionsMoveToElementElement(editar2);
		sleep(2000);
		
		editar2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		nameGateway.sendKeys("Gateway evento");
		sleep(1000);
		
		descripcionGateway.sendKeys("Descripcion Teste QA");
		sleep(1000);
		
		aplicar.click();
		sleep(4000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(puntoCirculo4, puntoEvento6);
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(tarefa, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement( puntoEvento7 , puntoTarefa);
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(fin, driver.findElement(By.xpath("//div[@id=\"Activity\"]/div/div/div/div/div")));
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement( puntoTarefa2,puntoFin2);
		sleep(2000);
		

		sleep(4000);
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		no.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
				
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//sim.click();
		sleep(3000);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

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
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
		
		
	}

}

	

