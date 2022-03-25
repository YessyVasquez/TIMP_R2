package com.sap.timp.pageObjectModel.MDR.RepresentantesLegais;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RepresentantesLegaisCriarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Representantes Legais\"]")
	public WebElement representanteslegais;
	

	
	@FindBy(xpath = "//span[text()=\"Novo Representante Legal\"]")
	public WebElement novorepresentantelegal;
	
	@FindBy(xpath = "//input[@placeholder=\"Introduzir o nome de Representante Legal\"]")
	public WebElement nome;
	
	@FindBy(xpath = "//input[@placeholder=\"Introduzir o CEP\"]")
	public WebElement cep;
	
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"TIPO_REPRESENTANTE\"]/div/div/div[2]")
	public WebElement tipoderepresentante;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaotipoderepresentante;
	

	@FindBy(xpath = "//input[@placeholder=\"Introduzir o cargo\"]")
	public WebElement cargo;
	
	@FindBy(xpath = "//input[@placeholder=\"Introduzir o CPF\"]")
	public WebElement cpf;
	
	@FindBy(xpath = "//input[@placeholder=\"Introduzir o RG\"]")
	public WebElement rg;
	
	@FindBy(xpath = "//input[@placeholder=\"Introduzir o e-mail\"]")
	public WebElement email;
	
	@FindBy(xpath = "//input[@placeholder=\"Introduzir o DDD\"]")
	public WebElement ddd;
	
	@FindBy(xpath = "//input[@placeholder=\"Introduzir o número de telefone\"]")
	public WebElement numerodetelefone;
	
	@FindBy(xpath = "//span[text()=\"Atribuições\"]")
	public WebElement atribuicoes;
	
	@FindBy(xpath = "//div[@id=\"atribuicoesEmpresa\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@id=\"iniVigenciaRepresentante\"]/div[1]/div/input")
	public WebElement representacao;
	
	@FindBy(xpath = "//div[@id=\"iniVigenciaRepresentante\"]/div[2]/div/input")
	public WebElement representacao1;
	
	@FindBy(xpath = "//div[@id=\"iniVigenciaProcuracao\"]/div[1]/div/input")
	public WebElement procuracao;
	
	@FindBy(xpath = "//div[@id=\"iniVigenciaProcuracao\"]/div[2]/div/input")
	public WebElement procuracao1;
	
	@FindBy(xpath = "//div[@id=\"validity\"]/div/div/input")
	public WebElement dataincial;
	
	@FindBy(xpath = "//span[text()=\"Adicionar\"]")
	public WebElement adicionar;
	
	@FindBy(xpath = "//div[@id=\"atribuicoesUF\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]")
	public WebElement opcaouf;
	
	@FindBy(xpath = "//div[@id=\"atribuicoesFilial\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public RepresentantesLegaisCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		representanteslegais.click();
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		novorepresentantelegal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado qa");
		
		sleep(2000);
	
		cep.sendKeys("26385030");
		
		
		tipoderepresentante.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tipoderepresentante.click();
	
		sleep(2000);
		
		opcaotipoderepresentante.click();
		
		sleep(2000);
		
		cargo.sendKeys("Tester");
		
		sleep(2000);
		
		
		rg.sendKeys("263850507");
		
		sleep(2000);
		cpf.sendKeys("7777777777");
		
		sleep(2000);
		
		email.sendKeys("teste@teste.com");
		
		sleep(2000);
		
		ddd.sendKeys("021");
		
		sleep(2000);
		numerodetelefone.sendKeys("9770070077");
		
		sleep(2000);
		
		String data=fechaActual();
		dataincial.sendKeys(data);
		
		sleep(2000);
		
		atribuicoes.click();
		
		sleep(2000);
		
		empresa.click();
		
		sleep(2000);
		
		opcaoempresa.click();
		sleep(2000);
		
		closeSelectTypeCheckbox(empresa);
		sleep(2000);
		
		uf.click();
		
		sleep(2000);
		
		opcaouf.click();
		
		sleep(2000);
		
		closeSelectTypeCheckbox(uf);
		sleep(2000);
		
		filial.click();
		
		sleep(2000);
		
		opcaofilial.click();
		
		sleep(2000);
		
		closeSelectTypeCheckbox(filial);
		sleep(2000);
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).build().perform();
		action.sendKeys(Keys.ESCAPE).build().perform();
		
		sleep(2000);
		
		representacao.sendKeys(data);
		//representacao1.sendKeys(data);
		sleep(2000);
		procuracao.sendKeys(data);
		//procuracao1.sendKeys(data);
		sleep(2000);
		
		adicionar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir("RepresentantesLegais",id2);
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
		
		
		System.out.println(sucesso);
		return sucesso;
		
	}	

}
