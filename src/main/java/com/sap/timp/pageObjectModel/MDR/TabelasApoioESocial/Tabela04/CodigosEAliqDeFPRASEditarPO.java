package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigosEAliqDeFPRASEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 04 - Códigos e Alíq. de FPAS\"]")
	public WebElement tabela04;
	
	@FindBy(xpath = "//span[text()=\"Novo Código e Alíq. de FPAS\"]")
	public WebElement novo;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Codigo FPAS\"]")
	public WebElement codigo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Base de cálculo \"]")
	public WebElement base;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Descrição das Atividades\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Entidade\"]")
	public WebElement entidade;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Situação do Contribuinte\"]")
	public WebElement contribuinte;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Combinação de dos Códigos de Terceiros\"]")
	public WebElement combinacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código de Terceiros\"]")
	public WebElement codigodeterceiros;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Alíquota\"]")
	public WebElement aliquota;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement datainicio;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	public CodigosEAliqDeFPRASEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		tabelaApoio.click();
		sleep(2000);
		
		tabela04.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("CodigosEAliqDeFPRAS");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		
		sleep(2000);
		waitExpectElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		String valor = datainicio.getAttribute("value");

		String enviar = fechaAyer();

		datainicio.clear();
		sleep(2000);
		datainicio.sendKeys(enviar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		

		driver.navigate().refresh();
		sleep(2000);
		waitExpectElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String novoTexto=datainicio.getAttribute("value");
		
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		datainicio.clear();

		sleep(2000);
		datainicio.sendKeys(valor);
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		return sucesso;
	}	

}
