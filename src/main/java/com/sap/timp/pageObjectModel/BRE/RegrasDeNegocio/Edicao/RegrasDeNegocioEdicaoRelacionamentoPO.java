package com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.Edicao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RegrasDeNegocioEdicaoRelacionamentoPO extends TestBaseFernando{	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bus_rules\"]")
	public WebElement regrasDeNegocio;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Selecionar Relacionamento\"]")
	public WebElement btnSeleccionarRelacionamento;
	
	@FindBy(xpath = "//div[@class=\"structure-relation-select\"]/div/div/div[2]")
	public WebElement cboRelacionamentoElementoDeEstrutura;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement btnAplicar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement btnNao;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"ID 51-Definição Tab\"]")
	public WebElement opcion;
	
	@FindBy(xpath = "//div[@class=\"close icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement btnRemover;
	
	public RegrasDeNegocioEdicaoRelacionamentoPO() {
		PageFactory.initElements(driver, this);
	}	
	
	public boolean relacionamento() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		regrasDeNegocio.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("RegrasDeNegocioCriar");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(btnSeleccionarRelacionamento);
		btnSeleccionarRelacionamento.click();
		sleep(2000);
		
		waitExpectElement(cboRelacionamentoElementoDeEstrutura);
		cboRelacionamentoElementoDeEstrutura.click();
		sleep(1000);
		
		String URL = driver.getCurrentUrl();
		
		if(URL.contains("tc2")) {
			opcion = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and text()=\"ID 48-Definição Tab\"]"));
		}
		
		if(URL.contains("tp1")) {
			opcion = driver.findElement(By.xpath("//div[@class=\"list-item-text\" and text()=\"ID 15-Definição Tab\"]"));
		}
		
		sleep(2000);
		opcion.click();
		closeSelectTypeCheckbox(cboRelacionamentoElementoDeEstrutura);
		sleep(2000);
		
		String opcionSeleccionada = driver.findElement(By.xpath("//div[@class=\"structure-relation-select\"]/div/div/div/div/div/div[1]")).getText();
		System.out.println("");
		System.out.println("Opcion seleccionada de relacionamento: " + opcionSeleccionada);
		
		sleep(2000);
		btnAplicar.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		waitExpectElement(btnNao);
		btnNao.click();
		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnBiblioteca.click();
		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		regrasDeNegocio.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(btnSeleccionarRelacionamento);
		btnSeleccionarRelacionamento.click();
		sleep(2000);
		
		waitExpectElement(cboRelacionamentoElementoDeEstrutura);
		
		String opcionSeleccionadaEditada = driver.findElement(By.xpath("//div[@class=\"structure-relation-select\"]/div/div/div/div/div/div[1]")).getText();
		System.out.println("");
		System.out.println("Opcion Editada de relacionamento: " + opcionSeleccionadaEditada);
		
		boolean sucesso = false;
		
		if(opcionSeleccionadaEditada.equals(opcionSeleccionada)) {
			System.out.println("Relacionamento de estrutura editado satisfactoriamente...");
			sucesso = true;
		}else {
			System.out.println("No se puedo editar el Relacionamento de estrutura...");
		}
		
		sleep(2000);
		
		btnRemover.click();
		sleep(2000);
		btnAplicar.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		waitExpectElement(btnNao);
		btnNao.click();
		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnSeleccionarRelacionamento.click();
		sleep(2000);
		
		waitExpectElement(cboRelacionamentoElementoDeEstrutura);
		sleep(3000);
		
		String opcionRelacionamentoElementoDeEstrutura = driver.findElement(By.xpath("//div[@class=\"structure-relation-select\"]/div/div/div/div[2]/input")).getAttribute("value");
		System.out.println("");
		System.out.println("Opcion al eliminar de relacionamento: " + opcionRelacionamentoElementoDeEstrutura);
		
		if(!opcionRelacionamentoElementoDeEstrutura.equals(opcionSeleccionada)) {
			System.out.println("Relacionamento de estrutura removido satisfactoriamente...");
			sucesso = true;
		}else {
			System.out.println("No se puedo remover el Relacionamento de estrutura...");
		}
		
		return sucesso;
	}
}
