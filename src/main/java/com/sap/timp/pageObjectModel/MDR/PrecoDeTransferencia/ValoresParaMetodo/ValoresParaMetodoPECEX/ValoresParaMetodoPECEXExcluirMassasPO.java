package com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPECEX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ValoresParaMetodoPECEXExcluirMassasPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Preço de Transferência\"]")
	public WebElement precodetransferencia;
	
	@FindBy(xpath = "//span[text()=\" Valores para Métodos\"]")
	public WebElement valoresparametodos;
	
	@FindBy(xpath = "//span[text()=\" Valores para Método PECEX\"]")
	public WebElement valorespecex;
	
	@FindBy(xpath = "//span[text()=\"Novo  Valores para Método PECEX\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"material\"]/div/div/div[2]")
	public WebElement material;
	
	@FindBy(xpath = "//div[@id=\"model\"]/div/div/div[2]")
	public WebElement modelo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Preço Praticado\"]")
	public WebElement precopraticado;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Data Exportação\"]")
	public WebElement dataexportacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Preço Praticado Ajustado\"]")
	public WebElement precopraticadoajustado;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Preço Parâmetro\"]")
	public WebElement precoparametro;

	@FindBy(xpath = "//input[@placeholder=\"Preencher  Variação Cambial\"]")
	public WebElement variacaocambial;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Preço Parâmetro Ajustado\"]")
	public WebElement precoparametroajustado;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Data Inicial\"]")
	public WebElement dataincial;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	@FindBy(xpath = "//button[@id=\"add-materials\"]")
	public WebElement addmateriais;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement salvarENovo;
	
	@FindBy(xpath = "//span[@class = \"button-icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement btnExcluirMassa;
	
	public ValoresParaMetodoPECEXExcluirMassasPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
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
		precodetransferencia.click();
		sleep(2000);
		
		valoresparametodos.click();
		
		sleep(2000);
		
		valorespecex.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Primer ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
			System.out.println(id);
		}
		
		novo.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();		
		sleep(2000);
		
		opcao.click();		
		sleep(2000);
		
		addmateriais.click();		
		sleep(2000);
		
		if(tc2 == true){
		descricao.sendKeys("GASOLINA PB PODIUM C");
		}else if(tp1 == true) {
		descricao.sendKeys("GASOLINA PB PODIUM C");
		}else if(tq1 == true){
			descricao.sendKeys("Mercadorias,PD,Bought-In");
		}else {
			descricao.sendKeys("Material Teste Inventário");
		}
		sleep(2000);
		
		sim.click();		
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"material\"]/div", "class", "base-select required");
		sleep(2000);
		
		material.click();		
		sleep(2000);
		
		opcao.click();		
		sleep(2000);
		modelo.click();
		
		sleep(2000);		
		opcao.click();
		
		sleep(2000);		
		precopraticado.sendKeys("1000");
		
		sleep(2000);		
		precopraticadoajustado.sendKeys("1000");
		
		sleep(2000);		
		precoparametro.sendKeys("10000");
		
		sleep(2000);		
		variacaocambial.sendKeys("1000");
		
		sleep(2000);		
		precoparametroajustado.sendKeys("1000");
		
		sleep(2000);		
		String data = fechaActual();
		dataincial.sendKeys(data);
		
		sleep(2000);		
		dataexportacao.sendKeys(data);
		
		salvarENovo.click();
		sleep(2000);
		
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();		
		sleep(2000);
		
		opcao.click();		
		sleep(2000);
		
		addmateriais.click();		
		sleep(2000);
		
		descricao.clear();
		
		if(tc2 == true){
		descricao.sendKeys("GASOLINA PB PODIUM C");
		}else if(tp1 == true) {
		descricao.sendKeys("GASOLINA PB PODIUM C");
		}else if(tq1 == true){
			descricao.sendKeys("Mercadorias,PD,Bought-In");
		}else {
			descricao.sendKeys("Material Teste Inventário");
		}
		sleep(2000);
		
		sim.click();		
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"material\"]/div", "class", "base-select required");
		sleep(2000);
		
		material.click();		
		sleep(2000);
		
		opcao.click();		
		sleep(2000);
		modelo.click();
		
		sleep(2000);		
		opcao.click();
		
		sleep(2000);		
		precopraticado.clear();
		precopraticado.sendKeys("1000");
		
		sleep(2000);		
		precopraticadoajustado.clear();
		precopraticadoajustado.sendKeys("1000");
		
		sleep(2000);		
		precoparametro.clear();
		precoparametro.sendKeys("10000");
		
		sleep(2000);	
		variacaocambial.clear();
		variacaocambial.sendKeys("1000");
		
		sleep(2000);	
		precoparametroajustado.clear();
		precoparametroajustado.sendKeys("1000");
		
		sleep(2000);	
		dataincial.clear();
		dataincial.sendKeys(data);
		
		sleep(2000);
		dataexportacao.clear();
		dataexportacao.sendKeys(data);
		
		salvarENovo.click();
		sleep(2000);
		
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnPrimeraPagina.click();
		
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

		idInserir("ValoresParaMetodoPECEXExcluirMassas",idPrimerRegistro);

		
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
		if(!novo.isDisplayed()) {
			return false;
		}
		sleep(2000);
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		

		int idPrimerRegistro = convertToInt(idObter("ValoresParaMetodoPECEXExcluirMassas"));

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
		
		btnPrimeraPagina.click();
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
