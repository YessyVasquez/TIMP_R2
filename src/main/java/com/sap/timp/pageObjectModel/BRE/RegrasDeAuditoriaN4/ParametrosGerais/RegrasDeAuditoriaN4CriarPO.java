package com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN4.ParametrosGerais;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegrasDeAuditoriaN4CriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N4\"]")
	public WebElement regraAuditoriaN4;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Nova Regra\"]")
	public WebElement novaRegra;
	
	@FindBy(xpath = "//td[contains(@class, \"title-field\")]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//td[contains(@class, \"ruletype-field\")]/div/div/div[2]")
	public WebElement tipoDeRegra;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Auditoria Nvl 4\"][1]")
	public WebElement opcaotipoderegra;
	
	@FindBy(xpath = "//td[contains(@class, \"component-field\")]/div/div[2]")
	public WebElement componente;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div[2]")
	public WebElement componentetp1;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"DFG\"][1]")
	public WebElement opcaocomponente;
	
	@FindBy(xpath = "//td[contains(@class, \"tribute-field\")]/div/div/div[2]")
	public WebElement tipoTributo;
	
	@FindBy(xpath = "//div[@class=\"list-option\"]/div/div[text()=\"ICMS\"]")
	public WebElement opcaotipotributo;
	
	@FindBy(xpath = "//td[@class=\"datastructureCategoryReference-field\"]/div/div/div[2]")
	public WebElement grupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajuste\"][1]")
	public WebElement opcaogrupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes\"][1]")
	public WebElement opcaogrupodeestruturatp1;
	
	
	@FindBy(xpath = "//td[@class=\"datastructureReference-field\"]/div/div/div[2]")
	public WebElement estruturadedados;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Ajustes Fiscais\"][1]")
	public WebElement opcaoestruturadedados;
	
	@FindBy(xpath = "//td[@class=\"datastructureCategoryComparison-field\"]/div/div/div[2]")
	public WebElement grupodeestruturacomparacao;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajuste\"][1]")
	public WebElement opcaogrupodeestruturacomparacao;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes\"][1]")
	public WebElement opcaogrupodeestruturacomparacaotp1;
	
	@FindBy(xpath = "//td[@class=\"datastructureComparison-field\"]/div/div/div[2]")
	public WebElement estruturadedadoscomparacao;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes Fiscais\"]")
	public WebElement opcaoestruturadedadoscomparacao;
	
	@FindBy(xpath = "//td[@class=\"layoutReference-field\"]/div/div/div[2]")
	public WebElement leiautereferencia;
	
	@FindBy(xpath = "//li[@id][text()=\"7519 - TA-TESTE (Complemento BRE - N4) - 1\"]")
	public WebElement opcaoleiautereferenciatq1;
	
	@FindBy(xpath = "//li[@id][text()=\"347 - TA-TESTE (Complemento BRE - N4) - 1\"]")
	public WebElement opcaoleiautereferenciatp1;
	
	@FindBy(xpath = "//li[@id][text()=\"141 - TA-TESTE (Complemento BRE - N4) - 1\"]")
	public WebElement opcaoleiautereferenciatc2;
	
	@FindBy(xpath = "//td[@class=\"layoutVersionReference-field\"]/div/div/div[2]")
	public WebElement versaodoleiautereferencia;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"1.0\"][1]")
	public WebElement opcaoversaodoleiautereferencia;
	
	@FindBy(xpath = "//td[@class=\"layoutComparison-field\"]/div/div/div[2]")
	public WebElement leiautecomparacao;
	
	@FindBy(xpath = "//li[@id][text()=\"7520 - TA-TESTE  (Complemento BRE - N4) - 2\"]")
	public WebElement opcaoleiautecomparacaotq1;
	
	@FindBy(xpath = "//li[@id][text()=\"575 - TA-TESTE  (Complemento BRE - N4) - 2\"]")
	public WebElement opcaoleiautecomparacaotp1;
	
	@FindBy(xpath = "//li[@id][text()=\"143 - TA-TESTE (Complemento BRE - N4) - 2\"]")
	public WebElement opcaoleiautecomparacaotc2;
	
	@FindBy(xpath = "//td[@class=\"layoutVersionComparison-field\"]/div/div/div[2]")
	public WebElement versaoleiautecomparacao;
	
	@FindBy(xpath = "//li[@id][text()=\"1.0\"]")
	public WebElement opcaoversaoleiautecomparacao;

	@FindBy(xpath = "//td[contains(@class, \"specialReference-field\")]/div/div/div[2]")
	public WebElement caracteristicaespecial;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Toda a Obrigação\"][1]")
	public WebElement opcaocaracteristicaespecial;
	
	@FindBy(xpath = "//td[contains(@class, \"specialComparison-field\")]/div/div/div[2]")
	public WebElement caracteristicaespecialcomparacao;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"Toda a Obrigação\"][1]")
	public WebElement opcaocaracteristicaespecialcomparacao;
	
	@FindBy(xpath = "//td[contains(@class, \"regulation-field\")]/div/div/div[2]")
	public WebElement regulamento;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id and text()=\"TA-TESTE\"][1]")
	public WebElement opcaoregulamento;
	
	@FindBy(xpath = "//td[contains(@class, \"EffectiveDateFrom\")]/div/div/input")
	public WebElement dataValidadeDe;
		
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//div[@class=\"left-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/div/div/div[1]")
	public WebElement registro1esquerda;
	
	@FindBy(xpath = "//div[@class=\"right-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/div/div/div[1]")
	public WebElement registro1direita;

	@FindBy(xpath = "//div[@class=\"left-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/ul/li[1]/div/div/div/span[2]")
	public WebElement codigoempresaesquerda;
	
	@FindBy(xpath = "//div[@class=\"right-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/ul/li[1]/div/div/div/span[2]")
	public WebElement codigoempresadireita;

	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarCaminho;
	
	@FindBy(xpath = "//div[@class=\"operator field-condition\"]/div/div/div[2]")
	public WebElement operador;
	
	@FindBy(xpath = "//li[@id][text()=\"=\"]")
	public WebElement opcaooperdaor;
	
	@FindBy(xpath = "//input[@placeholder=\"Mensagem\"]")
	public WebElement mensagem;
	
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
	
	@FindBy(xpath = "//div[@class=\"action-section\"]/div/div/div/div/input")
	public WebElement acoes;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement Nao;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement Aceitar;
	
	@FindBy(xpath = "//div[@id=\"graph\"]")
	public WebElement regla;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public RegrasDeAuditoriaN4CriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
	
		regraAuditoriaN4.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println("Ultimo registro: " + id);
		
		novaRegra.click();
		sleep(2000);
		waitExpectElement(nome);
		sleep(2000);
		
		nome.click();
		sleep(1000);

		nome.sendKeys("TESTEAUTOMATIZADO N4 QAA - NÃO MEXER ");
		sleep(1000);
		
		tipoDeRegra.click();
		sleep(1000);
		opcaotipoderegra.click();
		sleep(1000);
		String URL = driver.getCurrentUrl();
		
		if(URL.contains("tp1") || URL.contains("tc2")) {
			componentetp1.click();
			sleep(1000);
		}else {
			componente.click();
			sleep(1000);
		}	 
		
		opcaocomponente.click();
		sleep(1000);
		
		tipoTributo.click();
		sleep(1000);
		opcaotipotributo.click();
		closeSelectTypeCheckbox(tipoTributo);
		sleep(1000);
		
		grupodeestrutura.click();
		sleep(1000);
		
		
		if(URL.contains("tp1")) {
			opcaogrupodeestruturatp1.click();
			sleep(1000);
		}else {
			opcaogrupodeestrutura.click();
			sleep(1000);
		}	
				
		actionsMoveToElementXpath("//td[contains(@class,\"EffectiveDateTo\")]/div/div/input");
		estruturadedados.click();
		sleep(1000);
		opcaoestruturadedados.click();
		sleep(1000);
		
		grupodeestruturacomparacao.click();
		sleep(1000);
		
		if(URL.contains("tp1")) {
			opcaogrupodeestruturacomparacaotp1.click();
			sleep(1000);
		}else {
			opcaogrupodeestruturacomparacao.click();
			sleep(1000);
		}
		
		estruturadedadoscomparacao.click();
		sleep(1000);
		opcaoestruturadedadoscomparacao.click();
		sleep(1000);
		
		waitExpectElement(leiautereferencia);
		leiautereferencia.click();
		sleep(1000);
		
		if(URL.contains("tc2")) {
			// opcao para TC2
			
			actionsMoveToElementElement(opcaoleiautereferenciatc2);
			opcaoleiautereferenciatc2.click();
			sleep(1000);
		}
		
		// Opcao para TQ1
		if(URL.contains("tq1")) {
			opcaoleiautereferenciatq1.click();
			sleep(1000);
		}
		
		// Opcao para TQ2
		if(URL.contains("tq2")) {
			opcaoleiautereferenciatq1.click();
			sleep(1000);
		}
		
		// Opcao para TP1
		if(URL.contains("tp1")) {
			opcaoleiautereferenciatp1.click();
			sleep(1000);
		}
		
		//attributeToBeXpath("//td[contains(@class, \"layoutVersion-field\")]/div", "class", "base-select required");
		versaodoleiautereferencia.click();
		sleep(1000);
		opcaoversaodoleiautereferencia.click();
		sleep(5000);
		
		leiautecomparacao.click();
		sleep(1000);
		
		if(URL.contains("tc2")) {
			// opcao para TC2
			
			opcaoleiautecomparacaotc2.click();
			sleep(1000);
		}
		
		// Opcao para TQ1
		if(URL.contains("tq1")) {
			opcaoleiautecomparacaotq1.click();
			sleep(1000);
		}
		
		// Opcao para TP1
		if(URL.contains("tp1")) {
			opcaoleiautecomparacaotp1.click();
			sleep(1000);
		}
		
		if(URL.contains("tq2")) {
			opcaoleiautecomparacaotq1.click();
			sleep(1000);
		}
		
		sleep(1000);
		versaoleiautecomparacao.click();
		sleep(1000);
		opcaoversaoleiautecomparacao.click();
		sleep(1000);
		caracteristicaespecial.click();
		sleep(1000);
		opcaocaracteristicaespecial.click();
		sleep(1000);
		caracteristicaespecialcomparacao.click();
		sleep(1000);
		opcaocaracteristicaespecialcomparacao.click();
		sleep(1000);
		actionsMoveToElementXpath("//td[contains(@class, \"EffectiveDateTo\")]/div/div/input");
		regulamento.click();
		sleep(1000);
		opcaoregulamento.click();
		sleep(1000);
		
		sleep(1000);
		dataValidadeDe.sendKeys("01/01/2013");
		sleep(1000);		
		
		aplicar.click();
		sleep(2000);
		waitExpectElement(adicionarCaminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		adicionarCaminho.click();
		sleep(2000);
		registro1esquerda.click();
		sleep(1000);
		
		dobleClickElement(codigoempresaesquerda);
		
		sleep(1000);
		
		operador.click();
		sleep(1000);
		opcaooperdaor.click();
		sleep(1000);
		
		registro1direita.click();
		sleep(1000);
		
		dobleClickElement(codigoempresadireita);
		
		sleep(1000);
		
		mensagem.sendKeys("Teste automatizado");
		
		sleep(1000);
		waitExpectElement(Gravar);
		sleep(2000);
		Gravar.click();
		sleep(1000);
		waitExpectElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(1000);
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
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("idAn4",idB);
		//idInserir2(idB);

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
		System.out.println(sucesso);
		return sucesso;
	}

}
