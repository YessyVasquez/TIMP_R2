package com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN4.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegrasDeAuditoriaN4EditarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N4\"]")
	public WebElement regraAuditoriaN4;
	
	
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
	
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[7]/*/*")
	public WebElement r2;
	
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
	
	@FindBy(xpath = "//div[@class=\"right-field field-condition ui-droppable\"]/div/div/div/div")
	public WebElement exclusao;
	
	@FindBy(xpath = "//div[@class=\"right-field field-condition ui-droppable\"]/div/div/div/span[2]")
	public WebElement codigoempresadireita;
	
	@FindBy(xpath = "//div[@class=\"right-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/div/div/div[1]")
	public WebElement registro1direita;

	@FindBy(xpath = "//div[@class=\"right-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/ul/li[1]/div/div/div/span[2]")
	public WebElement codigoempresadireita1;
	
	@FindBy(xpath = "//div[@class=\"right-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/ul/li[2]/div/div/div/span[2]")
	public WebElement codigofilialdireita;
	
	@FindBy(xpath = "//div[@class=\"operator field-condition\"]/div/div/div[2]")
	public WebElement operador;
	
	@FindBy(xpath = "//li[@id][text()=\"≠\"]")
	public WebElement opcaooperdaor;
	
	@FindBy(xpath = "//input[@placeholder=\"Mensagem\"]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//div[@class=\" toast-inner\"]")
	public WebElement mensagematualizado;
	
	public RegrasDeAuditoriaN4EditarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> editar() {

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regraAuditoriaN4.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		String idRegistro = idObter("idAn4");
		//String idRegistro = idObter2();
		
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
		
		new Actions(driver).moveToElement(codigoempresadireita).click().perform();
		exclusao.click();
		sleep(2000);
		registro1direita.click();
		sleep(2000);
		dobleClickElement(codigofilialdireita);
		sleep(2000);
		operador.click();
		sleep(2000);
		opcaooperdaor.click();
		sleep(2000);
		mensagem.clear();
		sleep(2000);
		mensagem.sendKeys("Teste");
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(mensagematualizado);
		sleep(2000);
		boolean sucesso1= false;
		if(mensagematualizado.isDisplayed()) {
			System.out.println("Regra atualizada com sucesso");
			sucesso1=true;
			sucesso.add(sucesso1);
		}else {
			System.out.println("Regra não atualizada com sucesso");
			sucesso1=false;
			sucesso.add(sucesso1);
		}
		System.out.println(sucesso);
		return sucesso;
		
		/*
		waitExpectElement(primeiracaixar1);
		sleep(1000);
		
		primeiracaixar1.click();
		sleep(1000);
		String enviar ="Alíquota correta N1";
		acoes.clear();
		acoes.sendKeys(enviar);
		acoes.sendKeys(Keys.ESCAPE);
		
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
		
		waitExpectElement(primeiracaixar1);
		sleep(1000);
		
		primeiracaixar1.click();
		String texto1 = acoes.getAttribute("value");
		
		sucesso.add(texto1.contains(enviar));
			
		sleep(1000);
		codigo.clear();
		sleep(1000);
		codigo.sendKeys("r2");
		sleep(1000);
		acoes.clear();
		acoes.sendKeys("Alíquota correta");
		acoes.sendKeys(Keys.ESCAPE);
		salvarcomocopia.click();
		/*
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
		*/
	//	int removerr2 = driver.findElements(By.xpath("//div[@id=\"graph\"]/*/*/*[7]/*/*")).size();
	/*	if(removerr2 == 0)
		{
			System.out.println("Caminho r2 foi removido");
			sucesso.add(true);
		}else {
			System.out.println("Caminho r2 não foi removido");
			sucesso.add(false);
		}
		
		configuracoes.click();
		sleep(1000);
		
		String nome1 = "TESTE  N1- NAO MEXER";
		
		nome.clear();
		sleep(1000);
		nome.sendKeys(nome1);
		waitExpectElement(aplicar);
		sleep(2000);
		aplicar.click();
		sleep(1000);
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
		*/
	

	}

}
