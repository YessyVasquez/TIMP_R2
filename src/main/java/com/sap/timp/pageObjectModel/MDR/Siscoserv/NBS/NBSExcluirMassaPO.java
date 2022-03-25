package com.sap.timp.pageObjectModel.MDR.Siscoserv.NBS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class NBSExcluirMassaPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Siscoserv\"]")
	public WebElement siscoserv;
	
	@FindBy(xpath = "//span[text()=\"NBS\"]")
	public WebElement nbs;
	
	@FindBy(xpath = "//span[text()=\"Novo Configuração NBS\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"code\"]/div/div[2]")
	public WebElement codigo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricaodocodigo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Capítulo\"]")
	public WebElement capitulo;
	
	@FindBy(xpath = "//div[@id=\"codeCta\"]/div/div[2]")
	public WebElement contacontabil;
		
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\" toast-inner\"]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement salvarENovo;
	
	@FindBy(xpath = "//span[@class = \"button-icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement btnExcluirMassa;
	
	public NBSExcluirMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		siscoserv.click();
		
		sleep(2000);		
		nbs.click();
		
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
		
		codigo.click();		
		sleep(2000);
		
		opcao.click();		
		sleep(2000);
		
		descricaodocodigo.sendKeys("descrição");		
		sleep(2000);
		
		capitulo.sendKeys("7");		
		sleep(2000);
		
		contacontabil.click();		
		sleep(2000);
		
		opcao.click();
		sleep(2000);
		
		salvarENovo.click();
		sleep(2000);
		
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"code\"]/div", "class", "base-autocomplete required");
		codigo.click();		
		sleep(2000);
		
		opcao.click();		
		sleep(2000);
		
		descricaodocodigo.sendKeys("descrição 8");		
		sleep(2000);
		
		capitulo.sendKeys("8");		
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"codeCta\"]/div", "class", "base-autocomplete required");
		contacontabil.click();		
		sleep(2000);
		
		opcao.click();
		sleep(2000);
		
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
		idInserir("idPrimerRegistroNBS",idPrimerRegistro);
		
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
		
		int idPrimerRegistro = convertToInt(idObter("idPrimerRegistroNBS"));
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
