package com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN3.ParametrosGerais;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RegrasDeAuditoriaN3CriarMasCaminhoPO extends TestBaseFernando{	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-a_rules\"]/div/span[text()=\"Regras de Auditoria N3\"]")
	public WebElement regraAuditoriaN3;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Nova Regra\"]")
	public WebElement novaRegra;
	
	@FindBy(xpath = "//td[contains(@class, \"title-field\")]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//td[contains(@class, \"ruletype-field\")]/div/div/div[2]")
	public WebElement tipoDeRegra;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Auditoria Nvl 3\"][1]")
	public WebElement opcTipoDeRegra;
	
	@FindBy(xpath = "//td[contains(@class, \"component-field\")]/div/div[2]")
	public WebElement componenteTq1;
	
	@FindBy(xpath = "//td[contains(@class, \"component-field\")]/div/div[2]")
	public WebElement componente;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"DFG\"][1]")
	public WebElement opcionComponente;
	
	@FindBy(xpath = "//td[contains(@class, \"tribute-field\")]/div/div/div[2]")
	public WebElement tipoTributo;
	
	@FindBy(xpath = "//div[@class=\"list-option\"]/div/div[text()=\"ICMS\"]")
	public WebElement opcionTipoTributo;
	
	@FindBy(xpath = "//td[contains(@class, \"datastructureCategory-field\")]/div/div/div[2]")
	public WebElement grupoDeEstrutura;
	
	@FindBy(xpath = "//td[contains(@class, \"datastructure-field\")]/div/div/div[2]")
	public WebElement estruturaDeDatos;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Ajustes Fiscais\"][1]")
	public WebElement opcionEstruturaDeDatos;
	
	@FindBy(xpath = "//td[contains(@class, \"special-field\")]/div/div/div[2]")
	public WebElement caracteristicaEspecial;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Toda a Obrigação\"][1]")
	public WebElement opcionCaracteristicaEspecial;
	
	@FindBy(xpath = "//td[contains(@class, \"layout-field\")]/div/div/div[2]")
	public WebElement leiaute;
	
//	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"ID7403-TA-TESTE (Complemento BRE)\"][1]")
//	public WebElement opcionLeiaute;
	
	@FindBy(xpath = "//td[contains(@class, \"layoutVersion-field\")]/div/div/div[2]")
	public WebElement versaoDoLeiaute;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"1.0\"][1]")
	public WebElement opcionversaoDoLeiaute;
	
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
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Código da empresa(Bloco 1 Teste-Registro 1 Teste-18S2C0) (ED)\"][1]")
	public WebElement opcionCondicoes;
	
	@FindBy(xpath = "//div[@class=\"select-three\"]/div/div/div[2]/div/div[2]")
	public WebElement cboCondicoesOperador;
	
	@FindBy(xpath = "//div[contains(@class,\"list-item\") and @id]/div[text()=\"≠\"]")
	public WebElement opcionCondicoesOperador;
	
	@FindBy(xpath = "//div[@class=\"value-one\"]/div/div[2]")
	public WebElement cboNomeDoValor;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Código da filial(Bloco 1 Teste-Registro 1 Teste-18S3C0) (ED)\"][1]")
	public WebElement opcioncboNomeDoValor;
	
	@FindBy(xpath = "//div[@id=\"parameter-selection-input-1\"]/div/div/div/input")
	public WebElement acoes;
	
	@FindBy(xpath = "//div[@class=\"action-section\"]/div/div/div/div/input")
	public WebElement acoes2;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement btnNao;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement btnAceitar;
	
	@FindBy(xpath = "//div[@id=\"graph\"]")
	public WebElement regla;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	public RegrasDeAuditoriaN3CriarMasCaminhoPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() { 
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		regraAuditoriaN3.click();
		
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

		nome.sendKeys("TA-TESTE An3 1 - NÃO MEXER");

		sleep(1000);
		
		tipoDeRegra.click();
		sleep(1000);
		opcTipoDeRegra.click();
		sleep(1000);
		
		String URL = driver.getCurrentUrl();
		
		if(URL.contains("tq1") || URL.contains("tq2")) {
			componenteTq1.click();
		}else {
			componente.click();
		}
		
		sleep(1000);
		opcionComponente.click();
		sleep(1000);
		
		tipoTributo.click();
		sleep(1000);
		opcionTipoTributo.click();
		closeSelectTypeCheckbox(tipoTributo);
		sleep(1000);
		
		grupoDeEstrutura.click();
		sleep(1000);
		
		if(URL.contains("tp1")) {
			WebElement opcionGrupoDeEstrutura = driver.findElement(By.xpath("//li[contains(@class,\"list-item\") and @id and text()=\"Ajustes\"][1]"));
			opcionGrupoDeEstrutura.click();
			sleep(1000);
		}else {
			WebElement opcionGrupoDeEstrutura = driver.findElement(By.xpath("//li[contains(@class,\"list-item\") and @id and text()=\"Ajuste\"][1]"));
			opcionGrupoDeEstrutura.click();
			sleep(1000);
		}	
				
		actionsMoveToElementXpath("//td[contains(@class,\"EffectiveDateTo\")]/div/div/input");
		estruturaDeDatos.click();
		sleep(1000);
		opcionEstruturaDeDatos.click();
		sleep(9000);
		
		caracteristicaEspecial.click();
		sleep(1000);
		opcionCaracteristicaEspecial.click();
		sleep(1000);
		
		waitExpectElement(leiaute);
		leiaute.click();
		sleep(1000);
		
		if(URL.contains("tc2")) {
			// opcion para TC2
			WebElement opcionLeiaute = driver.findElement(By.xpath("//li[contains(@class,\"list-item\") and @id and text()=\"ID107-TA-TESTE (Complemento BRE)\"][1]"));
			opcionLeiaute.click();
			sleep(1000);
		}
		
		// Opcion para TQ1
		if(URL.contains("tq1")) {
			WebElement opcionLeiaute = driver.findElement(By.xpath("//li[contains(@class,\"list-item\") and @id and text()=\"ID7403-TA-TESTE (Complemento BRE)\"][1]"));
			opcionLeiaute.click();
			sleep(1000);
		}
		
		if(URL.contains("tq2")) {
			WebElement opcionLeiaute = driver.findElement(By.xpath("//li[contains(@class,\"list-item\") and @id and text()=\"ID7403-TA-TESTE (Complemento BRE)\"][1]"));
			opcionLeiaute.click();
			sleep(1000);
		}
		
		// Opcion para TP1
		if(URL.contains("tp1")) {
			WebElement opcionLeiaute = driver.findElement(By.xpath("//li[contains(@class,\"list-item\") and @id and text()=\"ID547-TA-TESTE (Complemento BRE)\"][1]"));
			opcionLeiaute.click();
			sleep(1000);
		}
		
		attributeToBeXpath("//td[contains(@class, \"layoutVersion-field\")]/div", "class", "base-select required");
		versaoDoLeiaute.click();
		sleep(1000);
		opcionversaoDoLeiaute.click();
		sleep(8000);
		
		actionsMoveToElementXpath("//td[contains(@class, \"EffectiveDateTo\")]/div/div/input");
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
		sleep(2000);
		
		sleep(2000);
		waitExpectElement(adicionarCaminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
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
		
		if(URL.contains("tq1")) {
			acoes.click();
			sleep(1000);
			acoes.sendKeys("Teste Auditoria N3");
			acoes.sendKeys(Keys.ENTER);
			sleep(1000);
		}
		
		if(URL.contains("tq2")) {
			acoes.click();
			sleep(1000);
			acoes.sendKeys("Teste Auditoria N3");
			acoes.sendKeys(Keys.ENTER);
			sleep(1000);
		}
		
		if(URL.contains("tp1") || URL.contains("tc2")) {
			acoes2.click();
			sleep(1000);
			acoes2.sendKeys("Teste Auditoria N3");
			acoes2.sendKeys(Keys.ENTER);
			sleep(1000);
		}
		
		aplicar.click();
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnNao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(24000);
		
		driver.navigate().refresh();
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader transp\"]");
		invisibilityOfElement("//div[@class=\"overlay loader transp\"]");
		sleep(2000);		
		
		WebElement caminhoCreado = driver.findElement(By.xpath("//div[@id=\"graph\"]//*[name()=\"svg\"]/*[name()=\"g\"][1]"));
		
		if(caminhoCreado.isDisplayed()) {
			System.out.println("Caminho creado...");
		}else {
			return false;
		}
		
		btnBiblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		regraAuditoriaN3.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		//idInserir2(idB);
		idInserir("An3",idB);
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
