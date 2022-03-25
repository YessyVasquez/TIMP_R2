package com.sap.timp.pageObjectModel.MDR.RepresentantesLegais;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RepresentantesLegaisEditarPO extends TestBaseSteven {
	
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
	
	@FindBy(xpath = "//li[@id][1]")
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
	
	@FindBy(xpath = "//li[@id][1]")
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
	
	public RepresentantesLegaisEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		representanteslegais.click();
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("RepresentantesLegais");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		String valor = rg.getAttribute("value");

		String enviar = "23988";

		rg.clear();
		sleep(2000);
		rg.sendKeys(enviar);
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
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
			
		waitExpectElement(rg);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String novoTexto=rg.getAttribute("value");
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		rg.clear();

		sleep(2000);
		rg.sendKeys(valor);
		
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
