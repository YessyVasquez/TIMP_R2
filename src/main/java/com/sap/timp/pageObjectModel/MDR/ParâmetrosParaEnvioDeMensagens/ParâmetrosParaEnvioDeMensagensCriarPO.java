package com.sap.timp.pageObjectModel.MDR.ParâmetrosParaEnvioDeMensagens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ParâmetrosParaEnvioDeMensagensCriarPO extends TestBaseFernando{
	@FindBy(xpath = "//div[contains(@class,\"accordion-container\")]/ul/li/div/span[text()=\"Parâmetros para Envio de Mensagens\"]")
	public WebElement menuParametrosParaEnvioDeMensagens;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//span[text()=\"Novo\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-left\")][1]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[2]")
	public WebElement opcionCheckbox;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label[not(contains(@for,\"check-all\"))]/span")
	public WebElement opcionCheckboxDiferenteTodos;
	
	@FindBy(xpath = "//div[@id=\"registerType\"]/div/div/div[2]")
	public WebElement tipoDeRegistro;
	
	@FindBy(xpath = "//div[@id=\"description\"]/div/div/input")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"sourceEmailDefinition\"]/div/div/div[2]")
	public WebElement definicaoDoEmailOrigem;
	
	@FindBy(xpath = "//div[@id=\"destinyEmailDefinition\"]/div/div/div[2]")
	public WebElement definicaoDoEmailDestino;
	
	@FindBy(xpath = "//div[@id=\"subjectTypeDefinition\"]/div/div/div[2]")
	public WebElement definicaoDeTipoDeAssunto;
	
	@FindBy(xpath = "//div[@id=\"termDefinition\"]/div/div/div[2]")
	public WebElement definicaoDePrazo;
	
	@FindBy(xpath = "//div[@id=\"repetitionDefinition\"]/div/div/div[2]")
	public WebElement definicaoDeRepeticao;
	
	@FindBy(xpath = "//div[@id=\"emailText\"]/div/div/input")
	public WebElement mensagemDoEmail;
	
	@FindBy(xpath = "//div[@id=\"delegatedBy\"]/div/div/div[2]")
	public WebElement delegadoPor;
	
	@FindBy(xpath = "//div[@id=\"initialValidity\"]/div/div/input")
	public WebElement inicioDaValidade;
	
	@FindBy(xpath = "//div[@id=\"schedule\"]/div/div/div[2]")
	public WebElement horario;
	
	public ParâmetrosParaEnvioDeMensagensCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public void llenarDatos() {
		tipoDeRegistro.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		descricao.click();
		sleep(1000);
		descricao.sendKeys("Teste automatizado 701");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		closeSelectTypeCheckbox(empresa);
		sleep(2000);
		
		tributo.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		closeSelectTypeCheckbox(tributo);
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"uf\"]/div/div/div/div[2]/input", "class", "");
		uf.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		closeSelectTypeCheckbox(uf);
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"branch\"]/div/div/div/div[2]/input", "class", "");
		filial.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		closeSelectTypeCheckbox(filial);
		sleep(2000);
		
		definicaoDoEmailOrigem.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		definicaoDoEmailDestino.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		definicaoDeTipoDeAssunto.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		definicaoDePrazo.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		definicaoDeRepeticao.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		mensagemDoEmail.click();
		sleep(1000);
		mensagemDoEmail.sendKeys("Email do Teste Automatizado");
		sleep(2000);
		
		delegadoPor.click();
		sleep(1000);
		opcionCheckboxDiferenteTodos.click();
		sleep(1000);
		closeSelectTypeCheckbox(delegadoPor);
		sleep(2000);
		
		inicioDaValidade.click();
		sleep(1000);
		inicioDaValidade.sendKeys(fechaActual());
		sleep(2000);
		
		horario.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
	}
	
	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menuParametrosParaEnvioDeMensagens.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//conta o numero de linhas	
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		System.out.println("Id Primer Registro: " + id);			
		sleep(2000);	
		
		btnNovo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		llenarDatos();
		
		btnGravar.click();
		sleep(1000);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(btnBiblioteca);
		btnBiblioteca.click();
		sleep(2000);
		
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = false;
		
		//conta o numero de linhas	
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		String idB = idRegistro1;
		idInserir("ParâmetrosParaEnvioDeMensagens",String.valueOf(Integer.parseInt(idB)));
		System.out.println(idB);			
		sleep(2000);
		  
		int idD = Integer.parseInt(id); 
		int idBD = Integer.parseInt(idB);
		
		System.out.println("-----------------------------");
		System.out.println(idD); 
		System.out.println(idBD);
		sleep(2000);
		//compara pra ver se o novo id criado é realmente o ultimo
		  
		if (idBD > idD) { 
			sucesso = true; 
		}else { 
			sucesso = false; 
		}
		  
		return sucesso;
	}
}
