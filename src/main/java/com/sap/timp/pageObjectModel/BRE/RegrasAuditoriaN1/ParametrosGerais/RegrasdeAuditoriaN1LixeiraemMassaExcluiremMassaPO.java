package com.sap.timp.pageObjectModel.BRE.RegrasAuditoriaN1.ParametrosGerais;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegrasdeAuditoriaN1LixeiraemMassaExcluiremMassaPO extends TestBaseSteven{
	
	
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N1\"]")
	public WebElement regrasdeauditorian1;
	
	@FindBy(xpath = "//span[text()=\"Nova Regra\"]")
	public WebElement novaregra;
	
	@FindBy(xpath = "//td[@class=\"title-field\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//td[@class=\"ruletype-field\"]/div/div/div[2]")
	public WebElement tiporegra;
	
	@FindBy(xpath = "//li[@id][text()=\"Auditoria Nvl 1\"]")
	public WebElement opcaotiporegra;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div/div[2]")
	public WebElement componente;
	
	@FindBy(xpath = "//li[@id][text()=\"TAA\"]")
	public WebElement opcaocomponente;
	
	@FindBy(xpath = "//td[@class=\"tribute-field\"]/div/div/div[2]")
	public WebElement tipotributo;
	
	@FindBy(xpath = "//div[@id=\"00\"]/div/label/span")
	public WebElement opcaotipotributo;
	
	@FindBy(xpath = "//td[@class=\"datastructureCategory-field\"]/div/div/div[2]")
	public WebElement grupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajuste\"][1]")
	public WebElement opcaogrupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes\"][1]")
	public WebElement opcaogrupodeestruturatp1;
	
	@FindBy(xpath = "//td[@class=\"datastructure-field\"]/div/div/div[2]")
	public WebElement estruturadedados;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes Fiscais\"]")
	public WebElement opcaoestruturadedados;
	
	@FindBy(xpath = "//td[@class=\"special-field\"]/div/div/div[2]")
	public WebElement caracteristicaespecial;
	
	@FindBy(xpath = "//li[@id][text()=\"Abas\"]")
	public WebElement opcaocaracteristicaespecial;
	
	@FindBy(xpath = "//td[@class=\"tab-field\"]/div/div/div[2]")
	public WebElement abas;
	
	@FindBy(xpath = "//div[@class=\"list-option selectAll\"]/div/div/label/span")
	public WebElement opcaoabas;
	
	@FindBy(xpath = "//td[@class=\"regulation-field\"]/div/div/div[2]")
	public WebElement regulamento;
	
	@FindBy(xpath = "//li[@id][text()=\"TA-TESTE\"]")
	public WebElement opcaoRegulamento;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Data\"]")
	public WebElement dataValidadeDe;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement justi;
	
	
	
	
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	@FindBy(xpath = "//span[text()=\"Lixeira\"]")
	public WebElement lexeiraBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement Não;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//*[@id=\"justification\"]/div/textarea")
	public WebElement agg;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public RegrasdeAuditoriaN1LixeiraemMassaExcluiremMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean excluirMassa() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		Regras.click();
		sleep(2000);
		regrasdeauditorian1.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println("prueba 1");

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		sleep(2000);
		System.out.println(id);
		//---------------------CREACION----------------------
		//-----------PRIMERO----------------
		System.out.println("prueba 2");
		novaregra.click();
		sleep(2000);
		waitExpectElement(nome);
		sleep(2000);
		
		nome.click();
		sleep(1000);
		nome.sendKeys("TESTE QA 111");
		sleep(1000);
		
		tiporegra.click();
		sleep(1000);
		opcaotiporegra.click();
		sleep(1000);
		
		tipotributo.click();
		sleep(1000);
		opcaotipotributo.click();
		closeSelectTypeCheckbox(tipotributo);
		sleep(1000);
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		boolean tq2 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else if (url.contains("tq2")) {
			tq2 = true;
		}else {
			td1 = true;
		}
		if(tp1 == true) {
		grupodeestrutura.click();
		sleep(1000);
		opcaogrupodeestruturatp1.click();
		sleep(1000);
		}else {
			grupodeestrutura.click();
			sleep(1000);
			opcaogrupodeestrutura.click();
			sleep(1000);
		}
		
		
		
		actionsMoveToElementXpath("//td[contains(@class,\"EffectiveDateTo\")]/div/div/input");
		estruturadedados.click();
		sleep(1000);
		opcaoestruturadedados.click();
		sleep(1000);
		
		regulamento.click();
		sleep(1000);
		opcaoRegulamento.click();
		sleep(1000);
		//dataValidadeDe.click();
		sleep(1000);
		dataValidadeDe.sendKeys("01/01/2013");
		sleep(1000);
		
		sleep(2000);
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		justi.click();
//		sleep(3000);
//		agg.sendKeys("Teste Criação");
//		sleep(2000);
		

		sleep(2000);
		waitExpectElement(biblioteca);
		biblioteca.click();
	
		sleep(2000);
		waitExpectElement(regrasdeauditorian1);
		sleep(4000);
		regrasdeauditorian1.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		//-----------SEGUNDO----------------
		novaregra.click();
		sleep(2000);
		waitExpectElement(nome);
		sleep(2000);
		
		nome.click();
		sleep(1000);
		nome.sendKeys("TESTE QAA 222");
		sleep(1000);
		
		tiporegra.click();
		sleep(1000);
		opcaotiporegra.click();
		sleep(1000);
		
		tipotributo.click();
		sleep(1000);
		opcaotipotributo.click();
		closeSelectTypeCheckbox(tipotributo);
		sleep(1000);
		
		
//		if (url.contains("tc2")) {
//			tc2 = true;
//		}else if (url.contains("tp1")) {
//			tp1 = true;
//		}else if (url.contains("tq1")) {
//			tq1 = true;
//		}else {
//			td1 = true;
//		}
		if(tp1 == true) {
		grupodeestrutura.click();
		sleep(1000);
		opcaogrupodeestruturatp1.click();
		sleep(1000);
		}else {
			grupodeestrutura.click();
			sleep(1000);
			opcaogrupodeestrutura.click();
			sleep(1000);
		}
		
		
		
		actionsMoveToElementXpath("//td[contains(@class,\"EffectiveDateTo\")]/div/div/input");
		estruturadedados.click();
		sleep(1000);
		opcaoestruturadedados.click();
		sleep(1000);
		
		regulamento.click();
		sleep(1000);
		opcaoRegulamento.click();
		sleep(1000);
		//dataValidadeDe.click();
		sleep(1000);
		dataValidadeDe.sendKeys("01/01/2013");
		sleep(1000);
		
		sleep(2000);
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		justi.click();
//		sleep(3000);
//		agg.sendKeys("Teste Criação");
//		sleep(2000);
		

		sleep(2000);
		waitExpectElement(biblioteca);
		biblioteca.click();

		sleep(2000);
		waitExpectElement(regrasdeauditorian1);
		sleep(4000);
		regrasdeauditorian1.click();
		
		//---------------------------eliminacion-------------------------------------------
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(8000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int fila1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int fila2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		fila2 = fila2 - 1; 
		
		WebElement selecccionuno = driver.findElement(By.xpath("//div[@data-id]["+fila1+"]/div[2]/label/span"));
		selecccionuno.click();
		WebElement selecccionDos = driver.findElement(By.xpath("//div[@data-id]["+fila2+"]/div[2]/label/span"));
		selecccionDos.click();
		
		WebElement excluirmassa = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Finance-and-Office icon-trash\"]"));
		excluirmassa.click();
		
		sleep(2000);
		waitExpectElement(Não);
		sleep(2000);
		
		Não.click();
		sleep(5000);
		
		WebElement excluirmassaa = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Finance-and-Office icon-trash\"]"));
		excluirmassaa.click();
		
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		
		//--------------------------- eliminacion definitiva ---------------------------------
		
		sleep(2000);
		lexeiraBiblioteca.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(8000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int lfila1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int lfila2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		fila2 = lfila2 - 1; 
		System.out.println("1: "+lfila1);
		System.out.println("2: "+fila2);
		WebElement lselecccionuno = driver.findElement(By.xpath("//div[@data-id]["+lfila1+"]/div[2]/label/span"));
		lselecccionuno.click();
		WebElement lselecccionDos = driver.findElement(By.xpath("//div[@data-id]["+fila2+"]/div[2]/label/span"));
		lselecccionDos.click();
		sleep(2000);
		WebElement lexcluirmassa = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Sign-and-Symbols icon-persign\"]"));
		lexcluirmassa.click();
		
		
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		
		
		
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir3(idB);
		sleep(2000);
		System.out.println("ID: "+id);
		System.out.println("IDB: "+idB);
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;
		
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		return sucesso;
		
	}

}
