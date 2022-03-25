package com.sap.timp.pageObjectModel.MDR.ParâmetrosParaEnvioDeMensagens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ParâmetrosParaEnvioDeMensagensExcluirMassaPO extends TestBaseFernando{
	@FindBy(xpath = "//div[contains(@class,\"accordion-container\")]/ul/li/div/span[text()=\"Parâmetros para Envio de Mensagens\"]")
	public WebElement menuParametrosParaEnvioDeMensagens;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-left\")][2]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement salvarENovo;
	
	@FindBy(xpath = "//span[@class = \"button-icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement btnExcluirMassa;
	
	@FindBy(xpath = "//span[text()=\"Novo\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	ParâmetrosParaEnvioDeMensagensCriarPO parâmetrosParaEnvioDeMensagensCriarPO;
	
	public ParâmetrosParaEnvioDeMensagensExcluirMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		menuParametrosParaEnvioDeMensagens.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Primer ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
			System.out.println(id);
		}
		
		btnNovo.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		parâmetrosParaEnvioDeMensagensCriarPO = new ParâmetrosParaEnvioDeMensagensCriarPO();
		
		// Lenamos los datos
		parâmetrosParaEnvioDeMensagensCriarPO.llenarDatos();
		
		salvarENovo.click();
		sleep(2000);
		
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(btnBiblioteca);
		btnBiblioteca.click();
		sleep(2000);
		
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnNovo.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Llenamos los datos
		parâmetrosParaEnvioDeMensagensCriarPO.llenarDatos();			
		
		salvarENovo.click();
		sleep(2000);
		
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnPrimerPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		boolean sucesso = false;
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		
		// Se obtiene el primer registro de la tabla
		String idPrimerRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText(); 

		idInserir("ParâmetrosParaEnvioDeMensagensExcluirMassa",idPrimerRegistro);

		
		int idSegundoRegistro = convertToInt(idPrimerRegistro) - 1; // Este seria el segundo registro, equivalente al primer registro que se crea cone sta automatizacion
		  
		sleep(2000); 
		
		  
		int idRegistroAntesDeCrearRegistroNuevo = Integer.valueOf(id); 
		int idPrimerRegistroDespuesDeCrear = Integer.valueOf(idPrimerRegistro);
		
		System.out.println("");
		System.out.println("Primer registro antes de registrar los nuevos: " + idRegistroAntesDeCrearRegistroNuevo); 
		System.out.println("Primer registro despues de crear los nuevos: " + idPrimerRegistroDespuesDeCrear);
		System.out.println("Segundo registro despues de crear los nuevos: " + idSegundoRegistro);
		System.out.println("");
		  
		//compara pra ver se o novo id criado é realmente o ultimo		  
		if (idPrimerRegistroDespuesDeCrear > idRegistroAntesDeCrearRegistroNuevo && idSegundoRegistro > idRegistroAntesDeCrearRegistroNuevo) { 
			sucesso = true; 
		}
		  
		return sucesso;
	}
	
	public boolean exluirMassa() {
		sleep(1000);
		if(!btnNovo.isDisplayed()) {
			return false;
		}
		sleep(2000);
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		

		int idPrimerRegistro = convertToInt(idObter("ParâmetrosParaEnvioDeMensagensExcluirMassa"));

		WebElement marcarCheckbox = driver.findElement(By.xpath("//div[@data-id=\""+idPrimerRegistro+"\"]/div[2]/label/span"));
		System.out.println("Id Primer registro: " + idPrimerRegistro); // Primer registro que es el que se crea con la automatizacion
		
		sleep(2000);
		marcarCheckbox.click();
		sleep(2000);
		
		int idSegundoUltimoRegistro = idPrimerRegistro - 1;
		marcarCheckbox = driver.findElement(By.xpath("//div[@data-id=\""+idSegundoUltimoRegistro+"\"]/div[2]/label/span"));
		System.out.println("Id Segundo registro: " + idSegundoUltimoRegistro); // Segundo registro que es el que se crea con la automatizacion
		
		sleep(2000);
		marcarCheckbox.click();
		sleep(2000);
		
		btnExcluirMassa.click();
		sleep(2000);
		waitExpectElement(btnAceitar);
		btnAceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idPrimerRegistroDespuesDeEliminar = "0";
		
		if(rows > 0) {
			idPrimerRegistroDespuesDeEliminar = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		}
		
		int id1 = convertToInt(idPrimerRegistroDespuesDeEliminar);
		int id2 = idPrimerRegistro;
		int id3 = idSegundoUltimoRegistro;
		
		System.out.println("Primer registro al eliminar en massa: " + id1); // Primer registro despues de excluir el registro de la automatizacion y recargar
		System.out.println("Primer registro: " + id2);
		System.out.println("Segundo registro:" + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1 != id3) {
			sucesso= true;
		}
		System.out.println(sucesso);
		return sucesso;
	}
}
