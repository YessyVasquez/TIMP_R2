package com.sap.timp.pageObjectModel.MDR.RegistroDeExportaçao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RegistroDeExportaçaoExcluirMassaPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Registro de Exportação\"]")
	public WebElement registroexportacao;
	
	@FindBy(xpath = "//li[@class=\"leftButton library-toolbar-item  first \"]/button/span[2]")
	public WebElement novoregistro;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[text()=\"3000\"]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//li[text()=\"3000\"]")
	public WebElement opcaoempresa2;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//li[text()=\"0031\"]")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//li[text()=\"0032\"]")
	public WebElement opcaofilial2;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Docnum SAP\"]")
	public WebElement docnum;

	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Chave da NFe\"]")
	public WebElement chavenfe;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Código do item\"]")
	public WebElement codigoitem;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Cod país destino\"]")
	public WebElement codpais;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Data lançamento\"]")
	public WebElement datalancamento;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Nº Declaração\"]")
	public WebElement numerodeclaracao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Data declaração\"]")
	public WebElement datadeclaracao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Tipo de doc. exportação\"]")
	public WebElement tipodocexportacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Natureza da exportação\"]")
	public WebElement naturezadaexportacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Data averbação decla. exp\"]")
	public WebElement dataaverbacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Tipo de conhec. embarque\"]")
	public WebElement tipodeconhecembarque;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Modelo\"]")
	public WebElement preenchamodelo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha a(o) Nº Nota fiscal\"]")
	public WebElement notafiscal;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um(a) Data emissão NF exportação\"]")
	public WebElement dataemissaonf;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
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
	
	public RegistroDeExportaçaoExcluirMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void llenarDatos1() {
		attributeToBeXpath("//div[@class=\"element\" and @id=\"company\"]/div", "class", "base-select required");
		empresa.click();
		
		sleep(2000);		
		opcaoempresa.click();
		
		sleep(2000);		
		filial.click();
		
		sleep(2000);		
		opcaofilial.click();
		
		llenarDatos();
	}
	
	public void llenarDatos2() {
		attributeToBeXpath("//div[@class=\"element\" and @id=\"company\"]/div", "class", "base-select required");
		empresa.click();
		
		sleep(2000);		
		opcaoempresa2.click();
		
		sleep(2000);		
		filial.click();
		
		sleep(2000);		
		opcaofilial2.click();
		
		llenarDatoss();
	}
	
	public void llenarDatoss() {	
		docnum.sendKeys("0123457777");
		
		chavenfe.sendKeys("12345");
		
		codigoitem.sendKeys("1234");
		
		codpais.sendKeys("001");
		
		String  data =fechaActual();
		
		datalancamento.sendKeys(data);
		
		numerodeclaracao.sendKeys("12");
		
		datadeclaracao.sendKeys(data);
		
		tipodocexportacao.sendKeys("1");
		
		naturezadaexportacao.sendKeys("2");
		
		dataaverbacao.sendKeys(data);
		
		tipodeconhecembarque.sendKeys("21");
		
		preenchamodelo.sendKeys("12");
		
		notafiscal.sendKeys("123456789");
		
		dataemissaonf.sendKeys(data);
	}
	
	public void llenarDatos() {	
		docnum.sendKeys("0123456789");
		
		chavenfe.sendKeys("12385");
		
		codigoitem.sendKeys("123488");
		
		codpais.sendKeys("002");
		
		String  data =fechaActual();
		
		datalancamento.sendKeys(data);
		
		numerodeclaracao.sendKeys("13");
		
		datadeclaracao.sendKeys(data);
		
		tipodocexportacao.sendKeys("1");
		
		naturezadaexportacao.sendKeys("3");
		
		dataaverbacao.sendKeys(data);
		
		tipodeconhecembarque.sendKeys("85");
		
		preenchamodelo.sendKeys("12");
		
		notafiscal.sendKeys("1234567777");
		
		dataemissaonf.sendKeys(data);
	}
	
	public boolean criar() {
		sleep(2000);
		registroexportacao.click();
		
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
			id = driver.findElement(By.xpath("//div[@data-id]["+rows+"]")).getAttribute("data-id");
			System.out.println(id);
		}
		
		// Crear primer registro
		novoregistro.click();
		
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
		String idUltimoRegistro = driver.findElement(By.xpath("//div[@data-id]["+rows+"]")).getAttribute("data-id");

		idInserir("RegistroDeExportaçaoExcluirMassa",idUltimoRegistro);

		
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
		if (idUltimoRegistroDespuesDeCrear > idRegistroAntesDeCrearRegistroNuevo && idPenultimoRegistro > idRegistroAntesDeCrearRegistroNuevo) { 
			sucesso = true; 
		}
		  
		return sucesso;
	} 
	
	public boolean exluirMassa() {
		sleep(1000);
		if(!novoregistro.isDisplayed()) {
			return false;
		}
		sleep(2000);
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 

		int idUltimoRegistro = convertToInt(idObter("RegistroDeExportaçaoExcluirMassa"));

		WebElement marcarCheckbox = driver.findElement(By.xpath("//div[@data-id=\""+idUltimoRegistro+"\"]/div[2]/label/span")); 
		System.out.println("Id Ultimo registro: " + idUltimoRegistro); // Ultimo registro que es el que se crea con la automatizacion

		marcarCheckbox.click();
		sleep(2000);
		
		int idPenultimoUltimoRegistro = idUltimoRegistro - 1;
		marcarCheckbox = driver.findElement(By.xpath("//div[@data-id=\""+idPenultimoUltimoRegistro+"\"]/div[2]/label/span"));
		System.out.println("Id Penultimo registro: " + idPenultimoUltimoRegistro); // Penultimo registro que es el que se crea con la automatizacion
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
		sleep(3000);
		waitExpectElement(btnUltimaPagina);
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
			idUltimoRegistroDespuesDeEliminar = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]")).getAttribute("data-id");
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
		
		
		
		int rows2 = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id and @tabindex=\"0\"]")).size();
		int f = 1;
		for (int i = 0; i < rows2; i++) {
			
			String idRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id and @tabindex=\"0\"]["+f+"]/div[1]/div")).getText();
			
			
			
			f++;
			i++;
			
		}	
		
		
		return sucesso;
		
		
		
	}
}
