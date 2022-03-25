package com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN3.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegrasDeAuditoriaN3EditarPO extends TestBaseSteven{
	@FindBy(xpath = "//li[@identifier=\"accordion-item-a_rules\"]/div/span[text()=\"Regras de Auditoria N3\"]")
	public WebElement regraAuditoriaN3;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//td[@class=\"title-field\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//td[@class=\"ruletype-field\"]/div/div/div[2]")
	public WebElement tiporegra;
	
	@FindBy(xpath = "//li[@id][text()=\"Mensagens\"]")
	public WebElement opcaotiporegra;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div/div[2]")
	public WebElement componente;
	
	@FindBy(xpath = "//li[@id][text()=\"TAA\"]")
	public WebElement opcaocomponente;
	
	@FindBy(xpath = "//td[@class=\"tribute-field\"]/div/div/div[2]")
	public WebElement tipotributo;
	
	@FindBy(xpath = "//div[@id=\"00\"]/div/label/span")
	public WebElement opcaotipotributo;
	
	@FindBy(xpath = "//td[@class=\"datastructureCategory-field\"]/div/div/div[2]")
	public WebElement grupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajuste\"][1]")
	public WebElement opcaogrupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes\"][1]")
	public WebElement opcaogrupodeestruturatp1;
	
	@FindBy(xpath = "//td[@class=\"datastructure-field\"]/div/div/div[2]")
	public WebElement estruturadedados;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes Fiscais\"]")
	public WebElement opcaoestruturadedados;
	
	@FindBy(xpath = "//td[@class=\"special-field\"]/div/div/div[2]")
	public WebElement caracteristicaespecial;
	
	@FindBy(xpath = "//li[@id][text()=\"Abas\"]")
	public WebElement opcaocaracteristicaespecial;
	
	@FindBy(xpath = "//td[@class=\"tab-field\"]/div/div/div[2]")
	public WebElement abas;
	
	@FindBy(xpath = "//div[@class=\"list-option selectAll\"]/div/div/label/span")
	public WebElement opcaoabas;
	
	@FindBy(xpath = "//td[@class=\"regulation-field\"]/div/div/div[2]")
	public WebElement regulamento;
	
	@FindBy(xpath = "//li[@id][text()=\"TA-TESTE\"]")
	public WebElement opcaoRegulamento;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Data\"]")
	public WebElement dataValidadeDe;
		
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarcaminho;
	
	
	
	//@FindBy(xpath = "//div[@class=\"value-one\"]/div/div[2]")
	@FindBy(xpath = "//div[@class=\"value-one\"]/div/div/input")
	public WebElement NomeDoValor;
	
	@FindBy(xpath = "//li[@id][text()=\"BC ICMS (ED)\"]")
	public WebElement opcaoNomeDoValor;
	
	//@FindBy(xpath = "//div[@class=\"action-section\"]/div/div/div/div/div[2]")
	@FindBy(xpath = "//div[@class=\"action-section\"]/div/div/div/div/input")
	public WebElement acoes;
	
	//@FindBy(xpath = "//div[@id=\"T1\"]/div/label/span")
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"Dados Lançamento\"]")
	public WebElement opcaoacoes;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement Justificactiva;
	
	@FindBy(xpath = "//div[@id=\"justification\"]/div/textarea")
	public WebElement justificativa;
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@id=\"graph\"]")
	public WebElement regla;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	//@FindBy(xpath = "//*[name()=\"g\"][@class=\"path-start path-hl\"]/*/*[name()=\"tspan\"]")
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]")
	public WebElement primeiracaixar1;
	
	@FindBy(xpath = "//*[name()=\"g\"][contains(@class,\"path-start\")]/*/*[name()=\"tspan\"][1]")
	public WebElement primeiracaixar1editado;
	
	@FindBy(xpath = "//button[text()=\"Modificar\"]")
	public WebElement modificar;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[2]/*/*")
	public WebElement campo2;
	
	@FindBy(xpath = "//*[name()=\"g\"][contains(@class,\"path-start\")]/*/*[name()=\"tspan\"][2]")
	public WebElement parte2string;

	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[2]/div[1]/div/div/input")
	public WebElement codigo;
	
	@FindBy(xpath = "//button[text()=\"Salvar como Cópia\"]")
	public WebElement salvarcomocopia;
	
	//@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[10]/*/*")
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[7]/*/*")
	public WebElement r2;
	//@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[4]")
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[5]")
	public WebElement primeiracaixar2;
	
	@FindBy(xpath = "//button[text()=\"Remover\"]")
	public WebElement remover;
	
	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement configuracoes;
	

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	public RegrasDeAuditoriaN3EditarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> editar() {

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regraAuditoriaN3.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		//String idRegistro = idObter2();
		String idRegistro = idObter("An3");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectElement(adicionarcaminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeiracaixar1.click();
		sleep(1000);
		String enviar ="Teste Automatizado Auditoria N3";
		acoes.clear();
		acoes.sendKeys(enviar);
		acoes.sendKeys(Keys.ENTER);
		
		modificar.click();
		sleep(1000);
		gravar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(2000);
		waitExpectElement(nao);
		sleep(2000);

		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		String texto1 = campo2.getText();
		
		sucesso.add(texto1.contains(enviar));
		waitExpectElement(primeiracaixar1);
		sleep(1000);
		primeiracaixar1.click();
		sleep(1000);
		codigo.clear();
		sleep(1000);
		codigo.sendKeys("r2");
		sleep(1000);
		acoes.clear();
		acoes.sendKeys("Teste Auditoria N3");
		acoes.sendKeys(Keys.ENTER);
		salvarcomocopia.click();
		
		waitExpectElement(r2);
		sleep(2000);
		if(r2.isDisplayed()) {
			System.out.println("O campo r2 está na página de edição");
			boolean sucesso3=true;
			sucesso.add(sucesso3);
		}
		
		sleep(1000);
		gravar.click();

		sleep(1000);
		waitExpectElement(nao);
		sleep(2000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeiracaixar2.click();
		sleep(1000);
		remover.click();
		sleep(1000);
		gravar.click();

		sleep(1000);
		waitExpectElement(nao);
		sleep(2000);
		
		nao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int removerr2 = driver.findElements(By.xpath("//div[@id=\"graph\"]/*/*/*[7]/*/*")).size();
		if(removerr2 == 0)
		{
			System.out.println("Caminho r2 foi removido");
			sucesso.add(true);
		}else {
			System.out.println("Caminho r2 não foi removido");
			sucesso.add(false);
		}
		
		sleep(9000);
		
		configuracoes.click();
		sleep(1000);
		
		String nome1 = "TESTE N3- NAO MEXER";
		waitExpectElement(nome);
		sleep(2000);
		nome.clear();
		sleep(1000);
		nome.sendKeys(nome1);
		waitExpectElement(aplicar);
		sleep(7000);
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gravar.click();

		sleep(1000);
		waitExpectElement(nao);
		sleep(2000);

		nao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracoes.click();
		sleep(1000);
		String verficarnome = nome.getAttribute("value");
		sucesso.add(verficarnome.contains(nome1));
		System.out.println(sucesso);
		return sucesso;

	}


}
