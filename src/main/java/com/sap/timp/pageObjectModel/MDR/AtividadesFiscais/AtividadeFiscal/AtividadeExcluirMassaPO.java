package com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AtividadeFiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class AtividadeExcluirMassaPO extends TestBaseFernando{
	@FindBy(xpath = "//li[@tabindex=\"0\"]/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividades1;

	@FindBy(xpath = "//li[@tabindex=\"0\"][1]/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividadesO1;

	@FindBy(xpath = "//li[@tabindex=\"0\"]/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividades2;

	@FindBy(xpath = "//li[@tabindex=\"0\"][1]/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividadesO2;

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"thead\"]/div/div[3]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button/span[text()=\"Nova Atividade Fiscal\"]")
	public WebElement nova;
		
	@FindBy(xpath = "//div[@id=\"name-activities\"]/div/div/input")
	public WebElement name;
	
	@FindBy(xpath = "//div[@id=\"description-activities\"]/div/textarea")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"diaEspecifico\"]/div/div/div[2]")
	public WebElement diaE;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement diaO;
	
	@FindBy(xpath = "//div[@id=\"diaOrdinal\"]/div/div/div[2]")
	public WebElement diaOr;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement diaOrO;
	
	@FindBy(xpath = "//div[@id=\"mes\"]/div/div/div[2]")
	public WebElement mes;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement mesO;
	
	@FindBy(xpath = "//div[@id=\"recorrenciaFeriado\"]/div/div/div[2]")
	public WebElement recorrencia;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement recorrenciaO;
	
	@FindBy(xpath = "//*[@id=\"vigencia1-activities\"]/div/div[1]/input")
	public WebElement data;
	
	@FindBy(xpath = "//li[@tabindex=\"0\"]/div[@class=\"title\"]/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividades;
	
	@FindBy(xpath = "//ul[@class=\"accordion\" and @style]/li/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividadesO;
		
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;	
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[@class = \"button-icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement btnExcluirMassa;
	
	@FindBy(xpath = "//div[@id=\"municipio\"]/div/div/div[2]")
	public WebElement municipio;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement municipioOpc;
	
	// Variable que controla si se crean con exito los registro, si no se crean con exito no se pasa al metodo de Excluir em Massa
	Boolean creado = true;
	
	int idPenulRegistro = 0;
	
	public AtividadeExcluirMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void llenarDatos() {		
		
		municipio.click();
		sleep(1000);
		municipioOpc.click();
		diaE.click();
		sleep(1000);
		diaO.click();
		
		sleep(1000);
		diaOr.click();
		sleep(1000);
		diaOrO.click();
		
		sleep(1000);
		mes.click();
		sleep(1000);
		mesO.click();
		sleep(1000);
		
		recorrencia.click();
		sleep(1000);
		recorrenciaO.click();
		sleep(1000);
		
		String date = fechaActual();
		
		data.sendKeys(date);
		sleep(2000);
	}
	
	public boolean criar() {
		String url = driver.getCurrentUrl();

		if (url.contains("tc2") || url.contains("tp1")) {
			atividades2.click();
			sleep(2000);
			atividadesO2.click();
			sleep(2000);
		} else {
			atividades1.click();
			sleep(2000);
			atividadesO1.click();
			sleep(2000);
		}
		
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
		nova.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Se llenan los datos
		name.sendKeys("Teste Atividade2");
		sleep(1000);
		descricao.sendKeys("Teste de Atividade Fiscal 2");
		sleep(1000);
		
		llenarDatos();
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);	
		

	
		
		biblioteca.click();
		sleep(2000);
		waitExpectElement(sim);
		nao.click();
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
		
		// Se obtiene el ultimo registro de la tabla, que equivale al penultimo registro ya creado el segundo registro
		String idPenultimoRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		idPenulRegistro = convertToInt(idPenultimoRegistro);
		
		if(convertToInt(idPenultimoRegistro) > convertToInt(id)) {
			idInserir("AtividadeFiscal",idPenultimoRegistro);
		}else {
			creado = false;			
		}
		
		// Crear segundo registro
		nova.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		name.sendKeys("Teste Atividade3");
		sleep(1000);
		descricao.sendKeys("Teste de Atividade Fiscal 3");
		sleep(1000);
		
		llenarDatos();
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);		
		
		biblioteca.click();
		sleep(2000);
		waitExpectElement(sim);
		nao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		btnUltimaPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		
		// Se obtiene el ultimo registro de la tabla
		String idUltimoRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		if(convertToInt(idUltimoRegistro) > convertToInt(id)) {
			idInserir("AtividadeFiscal",idUltimoRegistro);
		}else {
			creado = false;			
		}
		
		System.out.println("Se crearon los registros: " + creado);
		  
		sleep(2000); 
		
		  
		int idRegistroAntesDeCrearRegistroNuevo = Integer.valueOf(id); 
		int idUltimoRegistroDespuesDeCrear = Integer.valueOf(idUltimoRegistro);
		
		System.out.println("");
		System.out.println("Ultimo registro antes de registrar los nuevos: " + idRegistroAntesDeCrearRegistroNuevo); 
		System.out.println("Ultimo registro despues de crear los nuevos: " + idUltimoRegistroDespuesDeCrear);
		System.out.println("Ultimo penultimo despues de crear los nuevos: " + idPenultimoRegistro);
		System.out.println("");
		  
		//compara pra ver se o novo id criado é realmente o ultimo		  
		if ((idUltimoRegistroDespuesDeCrear > idRegistroAntesDeCrearRegistroNuevo) && (convertToInt(idPenultimoRegistro) > idRegistroAntesDeCrearRegistroNuevo)) { 
			sucesso = true; 
		}
		  
		return sucesso;
	} 
	
	public boolean exluirMassa() {
		if(!creado) {
			return false;
		}
		
		sleep(1000);
		if(!nova.isDisplayed()) {
			return false;
		}
		sleep(2000);
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		int rows = rows("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]");
		
		String idUltimoRegistro = driver.findElement(By.xpath("//div[@data-id]["+rows+"]/div[3]/div")).getText();
		
		WebElement marcarCheckbox = driver.findElement(By.xpath("//div[@data-id]["+rows+"]/div[2]/label/span"));
		System.out.println("Id Ultimo registro: " + idUltimoRegistro); // Ultimo registro que es el que se crea con la automatizacion
		
		sleep(1000);
		marcarCheckbox.click();
		sleep(1000);
		
		rows = rows-1;
		
		String idPenultimoUltimoRegistro = driver.findElement(By.xpath("//div[@data-id]["+rows+"]/div[3]/div")).getText();
		marcarCheckbox = driver.findElement(By.xpath("//div[@data-id]["+rows+"]/div[2]/label/span"));
		System.out.println("Id Penultimo registro: " + idPenultimoUltimoRegistro); // Penultimo registro que es el que se crea con la automatizacion
		
		sleep(1000);
		marcarCheckbox.click();
		sleep(1000);
		
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
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idUltimoRegistroDespuesDeEliminar = "0";
		
		if(rows > 0) {
			idUltimoRegistroDespuesDeEliminar = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		}
		
		int id1 = convertToInt(idUltimoRegistroDespuesDeEliminar);
		int id2 = convertToInt(idUltimoRegistro);
		int id3 = convertToInt(idPenultimoUltimoRegistro);
		
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
