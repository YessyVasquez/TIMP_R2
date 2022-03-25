package com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RegrasDeEscrituraçãoCriarMasCaminhoPO extends TestBaseFernando{
	@FindBy(xpath = "//li[@identifier=\"accordion-item-b_rules\"]")
	public WebElement regraDeEscrituracao;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Nova Regra\"]")
	public WebElement novaRegra;
	
	@FindBy(xpath = "//td[contains(@class, \"title-field\")]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//td[contains(@class, \"ruletype-field\")]/div/div/div[2]")
	public WebElement tipoDeRegra;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Escrituração\"][1]")
	public WebElement opcTipoDeRegra;
	
	@FindBy(xpath = "//td[contains(@class, \"tribute-field\")]/div/div/div[2]")
	public WebElement tipoTributo;
	
	@FindBy(xpath = "//div[@class=\"list-option\"]/div/div[text()=\"ICMS\"]")
	public WebElement opcionTipoTributo;
	
	@FindBy(xpath = "//td[contains(@class, \"datastructureCategory-field\")]/div/div/div[2]")
	public WebElement grupoDeEstrutura;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Ajuste\"][1]")
	public WebElement opcionGrupoDeEstrutura;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Ajustes\"][1]")
	public WebElement opcionGrupoDeEstruturatp1;

	
	@FindBy(xpath = "//td[contains(@class, \"datastructure-field\")]/div/div/div[2]")
	public WebElement estruturaDeDatos;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Ajustes Fiscais\"][1]")
	public WebElement opcionEstruturaDeDatos;
	
	@FindBy(xpath = "//td[contains(@class, \"regulation-field\")]/div/div/div[2]")
	public WebElement regulamento;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"TA-TESTE\"][1]")
	public WebElement opcionRegulamento;
	
	@FindBy(xpath = "//td[contains(@class, \"EffectiveDateFrom\")]/div/div/input")
	public WebElement dataValidadeDe;
		
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarCaminho;
	
	@FindBy(xpath = "//div[@class=\"select-one\"]/div/div[2]")
	public WebElement cboCondicoes;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Alíquota ICMS (ED)\"][1]")
	public WebElement opcionCondicoes;
	
	@FindBy(xpath = "//div[@class=\"select-three\"]/div/div/div[2]/div/div[2]")
	public WebElement cboCondicoesOperador;
	
	@FindBy(xpath = "//div[contains(@class,\"list-item\") and @id]/div[text()=\"<\"]")
	public WebElement opcionCondicoesOperador;
	
	@FindBy(xpath = "//div[@class=\"value-one\"]/div/div[2]")
	public WebElement cboNomeDoValor;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"BC ICMS (ED)\"][1]")
	public WebElement opcioncboNomeDoValor;
	
	@FindBy(xpath = "//div[@class=\"action-section\"]/div/div/div/div/input")
	public WebElement acoes;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement btnJustificactiva;
	
	@FindBy(xpath = "//div[@id=\"justification\"]/div/textarea")
	public WebElement justificativa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	@FindBy(xpath = "//div[@id=\"graph\"]")
	public WebElement regla;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	public RegrasDeEscrituraçãoCriarMasCaminhoPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean criar() {
		

		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}

		

		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		regraDeEscrituracao.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Ultimo ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("Ultimo registro: " + id);
		}
		
		novaRegra.click();
		sleep(2000);
		waitExpectElement(nome);
		sleep(2000);
		
		nome.click();
		sleep(1000);
		nome.sendKeys("TA-TESTE - NÃO MEXER QAA");
		sleep(1000);
		
		tipoDeRegra.click();
		sleep(1000);
		opcTipoDeRegra.click();
		sleep(1000);
		
		tipoTributo.click();
		sleep(1000);
		opcionTipoTributo.click();
		closeSelectTypeCheckbox(tipoTributo);
		sleep(1000);
		
		
		grupoDeEstrutura.click();
		sleep(1000);

		if(tp1 == true) {
			opcionGrupoDeEstruturatp1.click();
			sleep(1000);
		}else {
			opcionGrupoDeEstrutura.click();
			sleep(1000);
		}

	
		
		sleep(1000);
		

		actionsMoveToElementXpath("//td[contains(@class,\"EffectiveDateTo\")]/div/div/input");
		estruturaDeDatos.click();
		sleep(1000);
		opcionEstruturaDeDatos.click();
		sleep(1000);
		
		regulamento.click();
		sleep(1000);
		opcionRegulamento.click();
		sleep(1000);
		
		dataValidadeDe.click();
		sleep(1000);
		dataValidadeDe.sendKeys("01/01/2013");
		sleep(1000);		
		
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(btnJustificactiva);
		sleep(2000);
		
		btnJustificactiva.click();
		sleep(2000);
		
		waitExpectElement(justificativa);
		justificativa.sendKeys("TESTE AUTOMATIZADO");
		sleep(1000);
		btnAceitar.click();
		sleep(24000);
		
		adicionarCaminho.click();
		sleep(2000);
		waitExpectElement(cboCondicoes);
		cboCondicoes.click();
		sleep(1000);
		opcionCondicoes.click();
		sleep(1000);
		
		cboCondicoesOperador.click();
		sleep(1000);
		opcionCondicoesOperador.click();
		sleep(1000);

		
		cboNomeDoValor.click();
		sleep(1000);
		opcioncboNomeDoValor.click();
		sleep(1000);
		
		acoes.click();
		sleep(1000);
		acoes.sendKeys("Alíquota correta");
		acoes.sendKeys(Keys.ENTER);
		sleep(1000);
		
		aplicar.click();
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		nao.click();
		sleep(12000);
		
		driver.navigate().refresh();
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader transp\"]");
		invisibilityOfElement("//div[@class=\"overlay loader transp\"]");
		sleep(2000);		
		
		WebElement caminhoCreado = driver.findElement(By.xpath("//div[@id=\"graph\"]//*[name()=\"svg\"]/*[name()=\"g\"][1]"));
		
		if(caminhoCreado.isDisplayed()) {
			System.out.println("Caminho creado...");
		}	
		
		btnBiblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		regraDeEscrituracao.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("RegraDeEscrituracao",idB);

		System.out.println(id);
		System.out.println(idB);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		
		boolean sucesso = false;
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		return sucesso;
	}
}
