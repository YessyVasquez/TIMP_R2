package com.sap.timp.pageObjectModel.TDK.Kpis.Edicao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class KpisTabelasPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement kpis;
	
	@FindBy(xpath = "//span[text()=\"KPI's Públicos\"]")
	public WebElement kpispublicos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Widget\"]")
	public WebElement adicionarwidget;
	
	@FindBy(xpath = "//button[text()=\"Criar Widget\"]")
	public WebElement criarwidget;
	
	@FindBy(xpath = "//div[text()=\"Tabela\"]")
	public WebElement tabela;
	
	@FindBy(xpath = "//input[@placeholder=\"Cabeçalho\"]")
	public WebElement cabecalho;
	
	@FindBy(xpath = "//div[@id=\"select-type\"]/div/div/div[2]")
	public WebElement tipotabela;
	
	@FindBy(xpath = "//li[@id][text()=\"Tabela com campos da estrutura\"]")
	public WebElement opcaotipotabela;
	
	@FindBy(xpath = "//div[@id=\"select-group\"]/div/div[2]")
	public WebElement grupoestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajuste\"][1]")
	public WebElement opcaogrupo;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes\"][1]")
	public WebElement opcaogrupotp1;
	
	@FindBy(xpath = "//div[@id=\"select-structure\"]/div/div[2]")
	public WebElement estruturadedados;
	@FindBy(xpath = "//li[@id][text()=\"Ajustes Fiscais\"]")
	public WebElement opcaoestrutura;
	
	

	@FindBy(xpath = "//div[@id=\"tabs\"]/div/div[2]/div/div[2]/div/div[9]/div/div/div[2]/div/div/div[1]/div[2]")
	public WebElement colunas;
	
	@FindBy(xpath = "//li[@id][text()=\"Campos\"]")
	public WebElement opcaocolunas;
	
	@FindBy(xpath = "//span[@class=\"icon icon-font-Sign-and-Symbols icon-collapsedown icon-btn btn flat trans\"]")
	public WebElement iconeopcao;
	
	@FindBy(xpath = "//span[text()=\"Adicionar\"]")
	public WebElement adicionar;
	
	@FindBy(xpath = "//div[@id=\"tabs\"]/div/div[2]/div/div[2]/div/div[9]/div[2]/div/div[2]/div/div/div[1]/div[2]")
	public WebElement coluna2;
	
	@FindBy(xpath = "//div[@id=\"tabs\"]/div/div[2]/div/div[2]/div/div[9]/div[2]/div/div[5]/div/div/div[2]")
	public WebElement campos2;
	
	@FindBy(xpath = "//li[@id][text()=\"BC ICMS\"]")
	public WebElement opcaocampos2;
	
	@FindBy(xpath = "//span[text()=\"Filtros\"]")
	public WebElement filtros;
	
	
	@FindBy(xpath = " //span[text()=\"Adicionar Filtro\"]")
	public WebElement adicionarfiltro;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div/div/div/div[1]/div[1]/div[1]/div/div/div[2]")
	public WebElement tipodefiltro1;
	
	@FindBy(xpath = "//li[@id][text()=\"Alíquota ICMS\"]")
	public WebElement opcaotipodefiltro1;

	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[1]/div/div/div[1]/div[1]/div[2]/div[4]/div/div/input")
	public WebElement insirafiltros1;
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[1]/div/div/div[1]/div[1]/div[2]/div[1]/button")
	public WebElement cadeado1;
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[1]/div/div/div[1]/div[1]/div[2]/div[2]/div/div/div[2]")
	public WebElement operador1;
	@FindBy(xpath = "//li[@id][text()=\"=\"]")
	public WebElement opcaooperador1;
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div/div/div/div[2]/div[1]/div[1]/div/div/div[2]")
	public WebElement tipodefiltro2;
	@FindBy(xpath = "//li[@id][text()=\"BC ICMS\"]")
	public WebElement opcaotipodefiltro2;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[1]/div/div/div[2]/div[1]/div[2]/div[4]/div/div/input")
	public WebElement insirafiltros2;
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/button")
	public WebElement cadeado2;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/div[1]/div/div/div[2]/div/div[2]/div[2]/div/div/div[2]")
	public WebElement operador2;
	
	@FindBy(xpath = "//li[@id][text()=\">\"]")
	public WebElement opcaooperador2;
	@FindBy(xpath = "//span[text()=\"Conteúdo\"]")
	public WebElement conteudo;
	
	@FindBy(xpath = "//div[@id=\"tabs\"]/div/div[2]/div/div[2]/div/div[9]/div/div/div[5]/div/div/div[2]")
	public WebElement campos;
	
	@FindBy(xpath = "//li[@id][text()=\"Alíquota ICMS\"]")
	public WebElement opcaocampos;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement Aceitar;
	
	@FindBy(xpath = "//div[@class=\"base-dialog credit-trans-newAdjusment  big ui-draggable\"]/div[3]/button[2]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@class=\"base-dialog   big ui-draggable\"]/div[3]/button[2]")
	public WebElement aceitar1;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagemsalvo;
	
	//@FindBy(xpath = "//div[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\"]")
	//@FindBy(xpath = "//div[@data-gs-width=\"7\"]/div[2]")
	//@FindBy(xpath = "//div[@id=\"right\"]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div/div[3]/div[2]")
	@FindBy(xpath = "//div[@id=\"right\"]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div/div[1]/div[2]")
	public WebElement flechita;
	
	@FindBy(xpath = "//span[text()=\"Execução\"]")
	public WebElement execucao;
	
	@FindBy(xpath = "//button[@class=\"btn icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//button[@class=\"library-toolbar-button btn trans highlighted\"]")
	public WebElement executarElement;
	
	@FindBy(xpath = "//div[@class=\"quick-links-list\"]/div/div/span[2]")
	public WebElement textolink;
	
	@FindBy(xpath = "//div[@class=\"tableReportsWrapper\"]")
	public WebElement tabelafeita;
	public KpisTabelasPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean tabelas() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		kpis.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		kpispublicos.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("KpisCriar");
		
		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectElement(Gravar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarwidget.click();
		
		waitExpectElement(tabela);
		sleep(2000);
		tabela.click();
		sleep(2000);
		
		
		criarwidget.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(cabecalho);
		sleep(2000);
		cabecalho.sendKeys("Cabecalho");
		sleep(2000);
		
		tipotabela.click();
		sleep(2000);
		opcaotipotabela.click();
		sleep(2000);
		grupoestrutura.click();
		sleep(2000);
		opcaogrupo.click();
		sleep(2000);
		attributeToBeXpath("//div[@id=\"select-structure\"]/div", "class", "base-autocomplete required");
		sleep(4000);
		estruturadedados.click();
		sleep(2000);
		opcaoestrutura.click();
		sleep(2000);
		
		String URL = driver.getCurrentUrl();
		
		waitExpectElement(conteudo);
		sleep(2000);
		
		conteudo.click();
		sleep(2000);
		colunas.click();
		sleep(2000);
		opcaocolunas.click();
		sleep(2000);
		campos.click();
		sleep(2000);
		opcaocampos.click();
		sleep(2000);
		
		iconeopcao.click();
		sleep(2000);
		adicionar.click();
		sleep(2000);
		coluna2.click();
		sleep(2000);
		opcaocolunas.click();
		sleep(2000);
		campos2.click();
		sleep(2000);
		opcaocampos2.click();
		sleep(2000);
		filtros.click();
		sleep(2000);
		adicionarfiltro.click();
		sleep(2000);
	
		tipodefiltro1.click();
		sleep(2000);
		opcaotipodefiltro1.click();
		
		sleep(2000);
		
		cadeado1.click();
		sleep(2000);
		operador1.click();
		sleep(2000);
		opcaooperador1.click();
		sleep(2000);
		insirafiltros1.sendKeys("12");
		sleep(2000);
		adicionarfiltro.click();
		sleep(2000);
		cadeado2.click();
		sleep(2000);
		operador2.click();
		sleep(2000);
		opcaooperador2.click();
		sleep(2000);
		insirafiltros2.sendKeys("0");
		sleep(2000);
		
		aceitar1.click();
		sleep(2000);
		Aceitar.click();
		sleep(2000);
		
		sleep(2000);
		waitExpectElement(tabelafeita);
		sleep(2000);
		new Actions(driver).moveToElement(tabelafeita).click().perform();
		sleep(2000);
		moveToElement(flechita, driver.findElement(By.xpath("//div[@class=\"main-footer\"]/div[1]/div[3]")));
		sleep(2000);
		Gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		kpispublicos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);

		menu1.click();
		sleep(1000);
		editar1.click();
		sleep(2000);
		waitExpectElement(Gravar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		boolean sucesso = false;
		
		int tabelafeita1 = driver.findElements(By.xpath("//div[@class=\"tableReportsWrapper\"]")).size();
		
		if(tabelafeita1 == 0)
		{
			System.out.println("Tabela não presente");
			sucesso=false;
		}else {
			System.out.println("Tabela consta na pagina de edicao");
			sucesso=true;
		}
		
		
		System.out.println(sucesso);
		return sucesso;
	}


}
