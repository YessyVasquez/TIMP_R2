package com.sap.timp.pageObjectModel.MDR.CEP.Municipio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class MunicipioExcluirMassaPO extends TestBaseFernando{
	@FindBy(xpath = "//li/div/span[text()=\"cep\"]")
	public WebElement cep;
	
	@FindBy(xpath = "//li/div/span[text()=\"CEP\"]")
	public WebElement cep2;
	
	@FindBy(xpath = "//li/div/span[text()=\"Município\"]")
	public WebElement municipio;
	
	@FindBy(xpath = "//button/span[text()=\"Nova Cidade\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Número de localização\")]")
	public WebElement numero;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome de localização\")]")
	public WebElement nome;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"UF\")]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[contains(@class,\"cep_0_3\")]/div/div[2]/div/div/div[2]/input")
	public WebElement cepN;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Loc in sit\")]")
	public WebElement locS;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Loc in tipo\")]")
	public WebElement locT;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[3]/div")
	public WebElement localiza;
	
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
	
	@FindBy(xpath = "//span[text()=\"Salvar e Novo\"]")
	public WebElement salvarENovo;
	
	// Variable que controla si se crean con exito los registro, si no se crean con exito no se pasa al metodo de Excluir em Massa
	Boolean creado = true;
	
	public MunicipioExcluirMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void llenarDatos1() {
		sleep(1000);
		numero.clear();
		numero.sendKeys("99999998");
		
		llenarDatos();
	}
	
	public void llenarDatos2() {
		sleep(1000);
		numero.clear();
		numero.sendKeys("99999999");
		
		llenarDatos();
	}
	
	public void llenarDatos() {		
		sleep(1000);
		nome.clear();
		nome.sendKeys("Teste Municipio");
		
		sleep(1000);
		uf.clear();
		uf.sendKeys("SP");
		
		sleep(1000);
		cepN.clear();
		cepN.sendKeys("11112222");
		
		sleep(1000);
		locS.clear();
		locS.sendKeys("1");
		
		sleep(1000);
		locT.clear();
		locT.sendKeys("1");
	}
	
	public boolean criar() {
		String url = driver.getCurrentUrl();
		
		if (url.contains("tq1")) {
			cep2.click();
			sleep(1000);

		} else {
			cep2.click();

			sleep(1000);
		}
		
		
		sleep(2000);
		municipio.click();
		
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
		llenarDatos1();
		
		salvarENovo.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		// Crear segundo registro
		// Se llenan los datos
		llenarDatos2();
		
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
			idInserir("Municipio",idUltimoRegistro);
			
		}else {
			creado = false;			
		}
		
		System.out.println("Se crearon los registros: " + creado);
		
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
		
		int idUltimoRegistro = convertToInt(idObter("Municipio"));
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
