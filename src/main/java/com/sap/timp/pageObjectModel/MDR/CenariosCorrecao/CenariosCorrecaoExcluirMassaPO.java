package com.sap.timp.pageObjectModel.MDR.CenariosCorrecao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class CenariosCorrecaoExcluirMassaPO extends TestBaseFernando{
	@FindBy(xpath = "//li/div/span[text()=\"Cenários de Correção\"]")
	public WebElement cenarios;
		
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement novo;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//*[@id=\"tax\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement tributo;
	
	@FindBy(xpath = "//*[@id=\"correction-object\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement objetoCorrecao;
	@FindBy(xpath = "//div[@class=\"list-item\"]/div[text()=\"NF\"]")
	public WebElement opcObjetoCorrecao;
	
	@FindBy(xpath = "//*[@id=\"web-service\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement servicoWeb;
	@FindBy(xpath = "//div[@class=\"list-item\"]/div[text()=\"TMFNotaFiscalCorrectionsSyncIn\"]")
	public WebElement opcServicoWeb;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//*[@id=\"add-field-button\"]")
	public WebElement btnAgregarCampo;
	
	@FindBy(xpath = "//*[@id=\"field-1\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement campo;
	
	@FindBy(xpath = "//*[@id=\"valid-from\"]/div/div[1]/input")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opc;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement confirmacionGravar;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/ul/li[3]/button")
	public WebElement btnRegresar;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[11]/div[3]/div")	
	public WebElement idC;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição de Cenário\"]")
	public WebElement descricaocenario;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[@class = \"button-icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement btnExcluirMassa;
	
	// Variable que controla si se crean con exito los registro, si no se crean con exito no se pasa al metodo de Excluir em Massa
	Boolean creado = true;
	
	public CenariosCorrecaoExcluirMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void llenarDatos() {
		waitExpectElement(tributo);
		tributo.click();
		sleep(1000);
		opc.click();
		
		objetoCorrecao.click();
		sleep(1000);
		opcObjetoCorrecao.click();
		sleep(1000);
		
		servicoWeb.click();
		sleep(1000);
		opcServicoWeb.click();

		sleep(3000);
		waitExpectElement(btnAgregarCampo);
		btnAgregarCampo.sendKeys(Keys.ENTER);
		sleep(1000);
		campo.click();
		sleep(1000);
		opc.click();
		
		descricaocenario.sendKeys("Teste automatizado cenário");
		sleep(2000);
		dataVigencia.sendKeys(fechaActual());
	}
	
	public boolean criar() {
		sleep(2000);
		cenarios.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Ultimo ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println(id);
		}
		
		// Crear primer registro
		novo.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Se llenan los datos
		llenarDatos();
		
		btnGravar.click();
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
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Crear segundo registro
		novo.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Se llenan los datos
		llenarDatos();
		
		btnGravar.click();
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
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		boolean sucesso = false;
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		
		// Se obtiene el ultimo registro de la tabla
		String idUltimoRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		if(convertToInt(idUltimoRegistro) > convertToInt(id)) {

			idInserir("CenariosCorrecao",idUltimoRegistro);
		}else {
			creado = false;
			System.out.println("Se crearon los registros: " + creado);
		}
		
		
		int idPenultimoRegistro= convertToInt(idUltimoRegistro) - 1; // Este seria el penultimo registro, equivalente al primer registro que se crea cone sta automatizacion
		  
		sleep(2000); 
		
		  
		int idRegistroAntesDeCrearRegistroNuevo = Integer.valueOf(id); 
		int idUltimoRegistroDespuesDeCrear = Integer.valueOf(idUltimoRegistro);
		
		System.out.println("");
		System.out.println("Ultimo registro antes de registrar los nuevos: " + idRegistroAntesDeCrearRegistroNuevo); 
		System.out.println("Ultimo registro despues de crear los nuevos: " + idUltimoRegistroDespuesDeCrear);
		System.out.println("Ultimo penultimo despues de crear los nuevos: " + idPenultimoRegistro);
		System.out.println("");
		  
		//compara pra ver se o novo id criado é realmente o ultimo		  
		if ((idUltimoRegistroDespuesDeCrear > idRegistroAntesDeCrearRegistroNuevo) && (idPenultimoRegistro > idRegistroAntesDeCrearRegistroNuevo)) { 
			sucesso = true; 
		}
		  
		return sucesso;
	} 
	
	public boolean exluirMassa() {
		if(!creado) {
			return false;
		}
		
		sleep(1000);
		if(!novo.isDisplayed()) {
			return false;
		}
		sleep(2000);
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		int idUltimoRegistro = convertToInt(idObter("CenariosCorrecao"));
		WebElement marcarCheckbox = driver.findElement(By.xpath("//div[@data-id=\""+idUltimoRegistro+"\"]/div[2]/label/span"));
		System.out.println("Id Ultimo registro: " + idUltimoRegistro); // Ultimo registro que es el que se crea con la automatizacion
		
		sleep(2000);
		marcarCheckbox.click();
		sleep(2000);
		
		int idPenultimoUltimoRegistro = idUltimoRegistro - 1;
		marcarCheckbox = driver.findElement(By.xpath("//div[@data-id=\""+idPenultimoUltimoRegistro+"\"]/div[2]/label/span"));
		System.out.println("Id Penultimo registro: " + idPenultimoUltimoRegistro); // Penultimo registro que es el que se crea con la automatizacion
		
		sleep(2000);
		marcarCheckbox.click();
		sleep(2000);
		
		btnExcluirMassa.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idUltimoRegistroDespuesDeEliminar = "0";
		
		if(rows > 0) {
			idUltimoRegistroDespuesDeEliminar = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		}
		
		int id1 = convertToInt(idUltimoRegistroDespuesDeEliminar);
		int id2 = idUltimoRegistro;
		int id3 = idPenultimoUltimoRegistro;
		
		System.out.println("Ultimo registro al eliminar en massa: " + id1); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
		System.out.println("Ultimo registro: " + id2);
		System.out.println("Penultimo registro:" + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1 != id3) {
			sucesso= true;
		}
		System.out.println(sucesso);
		return sucesso;
	}
}
