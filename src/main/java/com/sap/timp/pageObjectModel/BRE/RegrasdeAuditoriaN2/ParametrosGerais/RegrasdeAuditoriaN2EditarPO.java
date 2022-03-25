package com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RegrasdeAuditoriaN2EditarPO extends TestBaseFernando{	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N2\"]")
	public WebElement AN2;
	
	@FindBy(xpath = "//div[@class=\"graph\"]//*[name()=\"g\"]//*[name()=\"g\"][1]")
	public WebElement CFOP;
	
	@FindBy(xpath = "//div[@class=\"select-three\"]/div/div/div[2]/div/div[2]")
	public WebElement cboOperador;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\" and text()=\"<\"]")
	public WebElement opcionOperador;
	
	@FindBy(xpath = "//span[text()=\"Dados\"]")
	public WebElement dados;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//input[@placeholder=\"Código\"]")
	public WebElement inputCodigo;	
	
	@FindBy(xpath = "//div[@class=\"value-one\"]/div/div[2]")
	public WebElement cboNomeDoValor2;
	
	@FindBy(xpath = "//li[contains(@class, \"list-item\") and @tabindex=\"0\" and @id and text()=\"BC ICMS (ED)\"]")
	public WebElement opcionNomeDoValor2;
	
	@FindBy(xpath = "//div[@class=\"graph\"]//*[name()=\"g\"]//*[name()=\"g\"][5]")
	public WebElement CFOP2;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Remover\"]")
	public WebElement btnRemover;
	
	@FindBy(xpath = "//button[text()=\"Salvar como Cópia\"]")
	public WebElement btnSalvarComCopia;
	
	@FindBy(xpath = "//button[text()=\"Modificar\"]")
	public WebElement btnMotificar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement btnNao;
	
	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement btnConfiguracoes;
	
	@FindBy(xpath = "//td[@class=\"title-field\"]/div/div/input")
	public WebElement inputNome;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement btnAplicar;
		
	public RegrasdeAuditoriaN2EditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> editar() {

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		AN2.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		//String idRegistro = idObter3();
		String idRegistro = idObter("An2");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		waitExpectElement(CFOP);
		sleep(8000);
		CFOP.click();
		sleep(5000);
		
		cboOperador.click();
		sleep(1000);
		opcionOperador.click();
		sleep(1000);
		
		String valorOperador1 = driver.findElement(By.xpath("//div[@class=\"select-three\"]/div/div/div[2]/div/div/div[2]/input")).getAttribute("value").trim();
		System.out.println("");
		System.out.println("Valor operador editado: " + valorOperador1);
		
		sleep(4000);
		
		btnMotificar.click();
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		waitExpectElement(btnNao);
		btnNao.click();
		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		CFOP2.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		
		waitExpectElement(cboOperador);
		sleep(2000);
		attributoNotToBeEmptyXpath("//div[@class=\"select-three\"]/div/div/div[2]/div/div/div[2]/input", "value");
		sleep(2000);
		String valorOperador = driver.findElement(By.xpath("//div[@class=\"select-three\"]/div/div/div[2]/div/div/div[2]/input")).getAttribute("value").trim();
		System.out.println("");
		System.out.println("Valor operador editado: " + valorOperador);
		
		String valorEnviado = "<";
		System.out.println("");
		System.out.println("Valor operador enviado: " + valorEnviado);
		sleep(1000);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(valorOperador.equals(valorEnviado));
		
		inputCodigo.clear();
		inputCodigo.sendKeys("r4");
		sleep(1000);
		
		cboNomeDoValor2.click();
		sleep(1000);
		opcionNomeDoValor2.click();
		sleep(1000);
		
		btnSalvarComCopia.click();
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		waitExpectElement(btnNao);
		btnNao.click();
		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println("");
		
		if(CFOP2.isDisplayed()) {
			sucesso.add(true);
			System.out.println("caminho salvado com copia...");
		}else {
			System.out.println("No se creo la copia del caminho");
			sucesso.add(false);
		}
		
		
		// Si no se crea el camino con copia esto no va a funcionar
		CFOP2.click();
		sleep(2000);
		
		waitExpectElement(btnRemover);
		btnRemover.click();
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		waitExpectElement(btnNao);
		btnNao.click();
		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		// Evaluamos la cantidad de cuadros por caminho, cada camino contiene 4 cuadros
		int cantCaminhos = driver.findElements(By.xpath("//div[@class=\"graph\"]//*[name()=\"g\"]//*[name()=\"g\"]")).size();
		System.out.println("Cantidad camninhos: " + cantCaminhos);
		
		// Si hay mas de 4 cuadros significa que no ha sido removido y si hay solamente 4 cuadros, significa que solo esta el camino original
//		if(cantCaminhos <= 4) {
//			System.out.println("Copia removida...");
//			sucesso.add(true);
//		}else {
//			System.out.println("La copia del caminho no se pudo remover...");
//			sucesso.add(false);
//		}
		
		sleep(2000);
		
		btnConfiguracoes.click();
		sleep(2000);
		
		waitExpectElement(inputNome);
		attributoNotToBeEmptyElement(inputNome, "value");
		
		String nomeValorEnviar = "TA QA01A - ALTERADO";
		System.out.println("");
		System.out.println("Nome valor a enviar: " + nomeValorEnviar);
		inputNome.clear();
		inputNome.sendKeys(nomeValorEnviar);
		sleep(5000);
		
		btnAplicar.click();
		sleep(7000);
		
		btnGravar.click();
		sleep(2000);
		waitExpectElement(btnNao);
		btnNao.click();
		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		btnConfiguracoes.click();
		sleep(2000);
		
		waitExpectElement(inputNome);
		attributoNotToBeEmptyElement(inputNome, "value");
		String nomeEditado = inputNome.getAttribute("value");
		System.out.println("");
		System.out.println("Nome valor editado: " + nomeEditado);
		
		if(nomeEditado.equals(nomeValorEnviar)) {
			System.out.println("Nome editado correctamente...");
			sucesso.add(true);
		}else {
			System.out.println("Nome no se pudeo editar...");
			sucesso.add(false);
		}
		
		System.out.println("");
		System.out.println(sucesso);
		return sucesso;
	}

}
