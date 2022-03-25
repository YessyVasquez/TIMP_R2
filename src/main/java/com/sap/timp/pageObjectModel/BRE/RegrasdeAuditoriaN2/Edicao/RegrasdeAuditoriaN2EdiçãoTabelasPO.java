package com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegrasdeAuditoriaN2EdiçãoTabelasPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N2\"]")
	public WebElement AN2;
	
	@FindBy(xpath = "//span[text()=\"Tabelas\"]")
	public WebElement tabelas;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement camino;
	
	@FindBy(xpath = "//button[text()=\"Associar Tabela\"]")
	public WebElement asociarTabela;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione uma tabela\"]")
	public WebElement inputSeleccionTabela;
	
	@FindBy(xpath = "//li[text()=\"CFOP\"]")
	public WebElement seleccionTabela;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um campo \"]")
	public WebElement campo;
	
	@FindBy(xpath = "//*[@id=\"main-icon\"]")
	public WebElement estrutura;
	
	@FindBy(xpath = "//li[text()=\"Apresent. Treinamento 4\"]")
	public WebElement selectEstrutura;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div/div/div[1]/div/div[1]/input")
	public WebElement condicoes;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Operador\"]")
	public WebElement operador;
	
	@FindBy(xpath = "//div[@id=\"option-1\"]")
	public WebElement opcOperador;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div/div/div[4]/div/div[1]/input")
	public WebElement condicoes2;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div[2]/div[1]/div/div[1]/input")
	public WebElement acoes;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement acoesOPC;
	
	@FindBy(xpath = "//div[@id=\"graph\"]//*[name()=\"g\"][5]")
	public WebElement CFOP;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Ok\"]")
	public WebElement ok;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement grabar;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button[text()=\"Remover\"]")
	public WebElement remover;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button[@id=\"edit-button\"]")
	public WebElement editTabela;
	
	@FindBy(xpath = "//button[@id=\"delete-button\"]")
	public WebElement excluirTabela;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnAceitar;
	
	public RegrasdeAuditoriaN2EdiçãoTabelasPO() {

		PageFactory.initElements(driver, this);
	}
	
public boolean editar() {
	
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
	
	waitExpectElement(tabelas);
	tabelas.click();
	sleep(4000);
	asociarTabela.click();
	sleep(3000);
	
	inputSeleccionTabela.click();
	sleep(3000);
	seleccionTabela.click();
	sleep(3000);
	sleep(3000);
	
	
	waitExpectElement(campo);
	campo.sendKeys("CFOP legal (ED)");
	sleep(2000);
	campo.sendKeys(Keys.ENTER);
	sleep(2000);
	
	aplicar.click();
	sleep(4000);
	
	fechar.click();
	sleep(2000);
	
	camino.click();
	sleep(2000);
	
	sleep(2000);
	condicoes.sendKeys("CFOP legal (ED)");
	sleep(2000);
	condicoes.sendKeys(Keys.ENTER);
	sleep(2000);
	
	operador.click();
	sleep(2000);
	opcOperador.click();
	sleep(2000);
	
	condicoes2.sendKeys("Apresent. Treinamento 4 - CFOP (VE)");
	sleep(2000);
	condicoes2.sendKeys(Keys.ENTER);
	sleep(5000);
	
//	actionsMoveToElementElement(acoes);
	sleep(2000);
	acoes.sendKeys("AL");
	sleep(2000);
	
	acoes.clear();
	sleep(2000);

	acoes.sendKeys("AL");
	sleep(2000);
	
	
	acoesOPC.click();
	sleep(2000);
	closeSelectTypeCheckbox(acoes);
	
	aplicar.click();
	sleep(4000);
	
	grabar.click();
	sleep(2000);
	
	sim.click();
	sleep(3000);
	
	aceitar.click();
	sleep(4000);
	
	biblioteca.click();
	sleep(3000);
	
	sim.click();
	sleep(3000);
	
	
	//----------------Entrando de nuevo a editar--------------------------
	
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(8000);
	AN2.click();
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(8000);

	btnUltimaPagina.click();
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(4000);
	
	String idRegistro1 = idObter("An2");
	WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
	WebElement açao1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion
	
	menu1.click();
	sleep(1000);
	açao1.click();
	sleep(3000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(4000);
	
	
	waitExpectElement(tabelas);
	tabelas.click();
	sleep(3000);
	
	editTabela.click();
	sleep(4000);
	
	campo.clear();
	sleep(2000);
	campo.sendKeys("Alíquota ICMS (ED)");
	sleep(2000);
	campo.sendKeys(Keys.ENTER);
	sleep(2000);
	
	aplicar.click();
	sleep(4000);
	
	fechar.click();
	sleep(4000);
	
	CFOP.click();
	sleep(4000);
	
	remover.click();
	sleep(4000);
	
	tabelas.click();
	sleep(4000);
	
	excluirTabela.click();
	sleep(3000);
	ok.click();
	sleep(3000);
	
	fechar.click();
	sleep(3000);
	
	grabar.click();
	sleep(2000);
	
	sim.click();
	sleep(3000);
	
	aceitar.click();
	sleep(4000);
	
	biblioteca.click();
	sleep(3000);
	
	sim.click();
	sleep(3000);
	
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(8000);
	AN2.click();
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(8000);
	
	btnUltimaPagina.click();
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(4000);
	
	
	
	String idRegistro2 = idObter("An2");
	WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro2+"\"]/div[1]/div"));
	WebElement açao2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion
	
	menu2.click();
	sleep(1000);
	açao2.click();
	sleep(3000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(4000);
	
	waitExpectElement(tabelas);
	sleep(5000);
	
	driver.navigate().refresh();
	sleep(6000);
	
	
	boolean sucesso = false;
	
	if (CFOP != null) {
		sucesso= true;
	}
	System.out.println(sucesso);
	return sucesso;
}
}
