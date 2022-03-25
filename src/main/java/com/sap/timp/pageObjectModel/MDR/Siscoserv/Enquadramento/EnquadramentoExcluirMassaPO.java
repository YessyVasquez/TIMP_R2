package com.sap.timp.pageObjectModel.MDR.Siscoserv.Enquadramento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class EnquadramentoExcluirMassaPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Siscoserv\"]")
	public WebElement siscoserv;
	
	@FindBy(xpath = "//span[text()=\"Enquadramento\"]")
	public WebElement enquadramento;
	
	@FindBy(xpath = "//span[text()=\"Novo Configuração de Enquadramento\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código de Enquadramento\"]")
	public WebElement codigodeenquadramento;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"nbsCode\"]/div/div[2]")
	public WebElement codigonbs;
	
	@FindBy(xpath = "//div[@id=\"indicator\"]/div/div/div[2]")
	public WebElement indicatorrc;
	
	@FindBy(xpath = "//div[@id=\"salesModule\"]/div/div/div[2]")
	public WebElement modulovenda;
	
	@FindBy(xpath = "//div[@id=\"acquisitionModule\"]/div/div/div[2]")
	public WebElement moduloaquisicao;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\" toast-inner\"]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement salvarENovo;
	
	@FindBy(xpath = "//span[@class = \"button-icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement btnExcluirMassa;
	
	public EnquadramentoExcluirMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		siscoserv.click();
		
		sleep(2000);
		enquadramento.click();
		
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
		
		novo.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		codigodeenquadramento.sendKeys("7");		
		sleep(2000);
		
		descricao.sendKeys("descricao");		
		sleep(2000);
		
		codigonbs.click();		
		sleep(2000);
		
		opcao.click();		
		sleep(2000);
		
		indicatorrc.click();		
		sleep(2000);
		
		opcao.click();	
		sleep(2000);
		
		modulovenda.click();
		sleep(2000);
		
		opcao.click();		
		sleep(2000);
		
		moduloaquisicao.click();		
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
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader\"]");
		sleep(2000);
		
		codigodeenquadramento.sendKeys("8");		
		sleep(2000);
		
		descricao.sendKeys("descricao 8");		
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"nbsCode\"]/div", "class", "base-autocomplete required");
		codigonbs.click();		
		sleep(2000);
		
		opcao.click();		
		sleep(2000);
		
		indicatorrc.click();		
		sleep(2000);
		
		opcao.click();	
		sleep(2000);
		
		modulovenda.click();
		sleep(2000);
		
		opcao.click();		
		sleep(2000);
		
		moduloaquisicao.click();		
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
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader\"]");
		sleep(2000);
		
		biblioteca.click();
		
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
		idInserir("idUltimoRegistroEnquadramento",idUltimoRegistro);
		
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
		if(!novo.isDisplayed()) {
			return false;
		}
		sleep(2000);
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		int idUltimoRegistro = convertToInt(idObter("idUltimoRegistroEnquadramento"));
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
