package com.sap.timp.pageObjectModel.MDR.Centralizacao.Saldos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class SaldosCriarPO extends TestBaseKenssy{
	
	@FindBy(xpath = "//span[text()=\"Centralização\"]")
	public WebElement centralizacao;
	
	@FindBy(xpath = "//span[text()=\"Saldos\"]")
	public WebElement saldos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[text()=\"Nova Centralização de Saldos\"]")
	public WebElement novoSaldo;
	
	@FindBy(xpath = "//*[@id=\"company\"]/div/div[1]/div[1]")
	public WebElement empresa;
	
		@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
		public WebElement opcempresa;
	
	@FindBy(xpath ="//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement selecionarUmaUfFilial; 
	
		@FindBy(xpath ="//div[@class=\"list-item\" and @id=\"SP\"]/div/label/span")
		public WebElement opcselecionarUmaUfFilial; 
	
	@FindBy(xpath = "//div[@id=\"filials\"]/div/div/div[2]")
	public WebElement filial;
	
		@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
		public WebElement opcfilial;
		@FindBy(xpath ="//div[@class=\"list-option\"][2]/div/div/label/span")
		public WebElement opcfilial2; 
		@FindBy(xpath ="//div[@class=\"list-option\"][3]/div/div/label/span")
		public WebElement opcfilial3; 
		
	@FindBy(xpath="//div[@id=\"centralizadora\"]/div/div[2]")
	public WebElement filialcentralizadora;
		
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcfilialCentralizadora;
		
		
	@FindBy(xpath="//div[@id=\"tribute\"]/div/div/div[2]")
	public WebElement tributo;
			
		@FindBy(xpath="//li[text()=\"ICMS\"]")
		public WebElement opcTributo;
		
	
	@FindBy(xpath="//div[@id=\"webServiceId\"]/div/div/div[2]")
	public WebElement servicioWeb;
			
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcServicioWeb;

	@FindBy(xpath="//div[@id=\"nfCreationParameterId\"]/div/div/div[2]")
	public WebElement nf;
			
		@FindBy(xpath="//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
		public WebElement opcNf;
		
	@FindBy(xpath="//div[@id=\"ufOrigem\"]/div/div/div[2]")
	public WebElement ufOrigen;
			
		@FindBy(xpath="//div[@id=\"SP\"]/div/label/span")
		public WebElement opcUfOrigen;
		@FindBy(xpath="//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
		public WebElement opcUfOrigenTC2;
	
	@FindBy(xpath="//div[@id=\"iniVigencia\"]/div/div/span")
	public WebElement fechaIniVigencia;
	
//	@FindBy(xpath="//div[@class=\"date today\" and @tabindex=\"0\"]")
//	public WebElement diaHoy;
	
	@FindBy(xpath="//div[@class=\"calendar-wrapper\"]/div[@class=\"dates-wrapper\"]/div[contains(@class,\"today\") and @tabindex=\"0\"]")
	public WebElement diaHoy;

	
		
	@FindBy(xpath="//body")
	public WebElement clickFuera;
	
	
	//PARTE DE AJUSTE
		@FindBy(xpath="//span[text()=\"Ajuste\"]")
		public WebElement botonAjuste;
		
		@FindBy(xpath="//span[text()=\"Novo Ajuste\"]")
		public WebElement novoAjuste;
		
		@FindBy(xpath="//div[@id=\"tribute\" and @class=\"add-form\"]/div/div/div[2]")
		public WebElement tributoA;
			@FindBy(xpath="//li[@id][1]")
			public WebElement opcTributoA;
			
		@FindBy(xpath="//div[@id=\"tributeType\" and @class=\"add-form\"]/div/div/div[2]")
		public WebElement tipoTributoA;
		@FindBy(xpath="//li[text()=\"PRÓPRIO\"]")
		public WebElement opcTipoTributoA;
		
		@FindBy(xpath="//div[@id=\"saldo\" and @class=\"add-form\"]/div/div/div[2]")
		public WebElement saldoA;
			@FindBy(xpath="//li[@id][1]")
			public WebElement opcSaldoA;
		
		@FindBy(xpath="//div[@id=\"detailOrigin\" and @class=\"add-form\"]/div/div/div[2]")
		public WebElement detalheOrigemA;
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcDetalheOrigemA;
		
		
		@FindBy(xpath="//div[@id=\"detailDestination\" and @class=\"add-form\"]/div/div/div[2]")
		public WebElement detalheDestinoA;
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcDetalheDestinoA;
		
		
		@FindBy(xpath="//div[@id=\"adjustBranches\" and @class=\"add-form\"]/div/div/div/div[2]")
		public WebElement filialsA;
		@FindBy(xpath="//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
		public WebElement opcfilialsA;
		
		
		@FindBy(xpath="//div[@id=\"documentType\" and @class=\"add-form\"]/div/div/div[2]")
		public WebElement tipoDocumentoA;
		@FindBy(xpath="//li[@id][1]")
		public WebElement opctipoDocumentoA;
		
		
		@FindBy(xpath="//div[@id=\"document\" and @class=\"add-form\"]/div/div/div[2]")
		public WebElement documentoA;
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcdocumentoA;
		
		
		@FindBy(xpath="//div[@id=\"output\" and @class=\"add-form\"]/div/div/div[2]")
		public WebElement campoSaidaA;
		@FindBy(xpath="//li[@id][1]")
		public WebElement opccampoSaidaA;
	
	@FindBy(xpath="//button[text()=\"Novo\"]")
	public WebElement guardarNovoAjuste;
	
	//PARTE DE REGRAS DE TRANFERENCIA
		@FindBy(xpath="//span[text()=\"Regras Transferência e Tratamento\"]")
		public WebElement botonRegra;
		
		@FindBy(xpath="//button/span[text()=\"Nova Regra\"]")
		public WebElement novaRegra;
		
		@FindBy(xpath="//div[@id=\"tribute\" and @class=\"add-form\"]/div/div/div[2]")
		public WebElement tributoR;
			@FindBy(xpath="//li[@id][1]")
			public WebElement opcTributoR;
	
		@FindBy(xpath="//div[@id=\"tributeType\" and @class=\"add-form\"]/div/div/div[2]")
		public WebElement tipoTributoR;
		@FindBy(xpath="//li[text()=\"PRÓPRIO\"]")
		public WebElement opcTipoTributoR;
			
		@FindBy(xpath="//div[@id=\"limit\" and @class=\"add-form\"]/div/div/div[2]")
		public WebElement limiteR;
		@FindBy(xpath="//li[contains(text(),\"Saldo Credor\")]")
		public WebElement opclimiteR;
		
		
		@FindBy(xpath="//div[@id=\"firstHierarchy\" and @class=\"add-form\"]/div/div/div[2]")
		public WebElement hierarquiaSequenciamiento1R;
		@FindBy(xpath="//li[contains(text(),\"Saldo Credor\")]")
		public WebElement opcHierarquiaSequenciamiento1R;
		
		@FindBy(xpath="//div[@id=\"firstHierarchy\" and @class=\"add-form\"]/div[2]/div/div[2]")
		public WebElement typeHierarquiaSequenciamiento1R;
		@FindBy(xpath="//li[@id][1]")
		public WebElement opctypeHierarquiaSequenciamiento1R;
		
		
		@FindBy(xpath="//div[@id=\"secondHierarchy\" and @class=\"add-form\"]/div/div/div[2]")
		public WebElement hierarquiaSequenciamiento2R;
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcHierarquiaSequenciamiento2R;
		
		@FindBy(xpath="//div[@id=\"secondHierarchy\" and @class=\"add-form\"]/div[2]/div/div[2]")
		public WebElement typeHierarquiaSequenciamiento2R;
		@FindBy(xpath="//li[@id][1]")
		public WebElement opctypeHierarquiaSequenciamiento2R;
		
		@FindBy(xpath="//button[text()=\"Novo\"]")
		public WebElement guardarNovaRegra;
	
		
	//PARTE DE OBRIGACAO
		@FindBy(xpath="//span[text()=\"Obrigação\"]")
		public WebElement botonObrigacao;
		
		@FindBy(xpath="//button/span[text()=\"Nova Obrigação\"]")
		public WebElement novaObrigacao;
		
		@FindBy(xpath="//div[@id=\"obrigation\" and @class=\"add-form\"]/div/div/div/div[2]")
		public WebElement obrigacao;
		@FindBy(xpath="//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
		public WebElement opcobrigacao;

		@FindBy(xpath="//button[text()=\"Gravar\"]")
		public WebElement gravarObrigacao;
		
	@FindBy(xpath="//button/span[text()=\"Gravar\"]")
	public WebElement gravar;	
	
	@FindBy(xpath="//button[text()=\"Não\"]")
	public WebElement  nao;
	
	@FindBy(xpath="//button[text()=\"Sim\"]")
	public WebElement  sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public SaldosCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean CriarSaldo() {
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
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		centralizacao.click();
		sleep(2000);
		saldos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);
		
		novoSaldo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//PROCEDIMIENTO DE LLENAR LOS DATOS
		empresa.click();
		sleep(1000);
		opcempresa.click();
		sleep(1000);
		closeSelectTypeCheckbox(empresa);
		sleep(2000);
		
		selecionarUmaUfFilial.click();
		sleep(2000);
		opcselecionarUmaUfFilial.click();
		sleep(1000);
		closeSelectTypeCheckbox(selecionarUmaUfFilial);
		sleep(1000);
		
	
			filial.click();
			sleep(2000);
				opcfilial.click();
				sleep(1000);
				opcfilial2.click();
				sleep(1000);
				opcfilial3.click();
				sleep(2000);
			closeSelectTypeCheckbox(filial);
			sleep(1000);

		
		
		
		
		filialcentralizadora.click();
		sleep(2000);
		opcfilialCentralizadora.click();
		opcfilialCentralizadora.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		
		tributo.click();
		actionsMoveToElementElement(opcTributo);
		sleep(2000);
		opcTributo.click();
		opcTributo.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		servicioWeb.click();
		opcServicioWeb.click();
		sleep(2000);
		//clickFuera.click();
		
//		nf.click();
//		sleep(2000);
//		opcNf.click();
//		sleep(2000);
//		closeSelectTypeCheckbox(nf);
//		sleep(2000);		
		
		actionsMoveToElementElement(fechaIniVigencia);
		sleep(2000);
		
		ufOrigen.click();
		sleep(2000);
		opcUfOrigen.click();
		sleep(2000);
		closeSelectTypeCheckbox(ufOrigen);
		sleep(2000);

		fechaIniVigencia.click();
		sleep(2000);
		diaHoy.click();
		sleep(2000);
		
		
		//PROCEDIMIENTO PARA NUEVO AJUSTE
		
		botonAjuste.click();
		waitExpectElement(novoAjuste);
		sleep(2000);
		novoAjuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tributoA.click();
		sleep(1000);
		opcTributoA.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"tributeType\" and @class=\"add-form\"]/div/div","class", "base-autocomplete required");
		sleep(2000);
		
		tipoTributoA.click();
		sleep(1000);
		opcTipoTributoA.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"saldo\" and @class=\"add-form\"]/div/div","class", "base-autocomplete required");
		sleep(2000);
		
		saldoA.click();
		sleep(1000);
		opcSaldoA.click();
		sleep(1000);
		
		detalheOrigemA.click();
		sleep(1000);
		opcDetalheOrigemA.click();
		sleep(1000);
		
		detalheDestinoA.click();
		sleep(1000);
		opcDetalheDestinoA.click();
		sleep(1000);
		
		sleep(1000);
		actionsMoveToElementElement(documentoA);
		sleep(1000);
		
		filialsA.click();
		sleep(1000);
		opcfilialsA.click();
		sleep(1000);
		closeSelectTypeCheckbox(filialsA);
		sleep(1000);
		
		tipoDocumentoA.click();
		sleep(1000);
		opctipoDocumentoA.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"document\" and @class=\"add-form\"]/div/div","class", "base-autocomplete required");
		sleep(2000);
		
		documentoA.click();
		sleep(1000);
		opcdocumentoA.click();
		sleep(1000);
		
		campoSaidaA.click();
		sleep(1000);
		opccampoSaidaA.click();
		sleep(1000);
		
		guardarNovoAjuste.click();
		sleep(1000);
		
		//PARTE DE REGRA DE TRANSFERENCIA
		

		botonRegra.click();
		waitExpectElement(novaRegra);
		sleep(2000);
		novaRegra.click();
		sleep(1000);
		
		tributoR.click();
		sleep(1000);
		opcTributoR.click();
		sleep(3000);
		
		attributeToBeXpath("//div[@id=\"tributeType\" and @class=\"add-form\"]/div/div","class", "base-autocomplete required");
		sleep(2000);
		
		tipoTributoR.click();
		sleep(1000);
		opcTipoTributoR.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"limit\" and @class=\"add-form\"]/div/div","class", "base-autocomplete required");
		sleep(2000);
		
		
		limiteR.click();
		sleep(1000);
		opclimiteR.click();
		sleep(1000);
		
		hierarquiaSequenciamiento1R.click();
		sleep(1000);
		opcHierarquiaSequenciamiento1R.click();
		sleep(1000);
		
		typeHierarquiaSequenciamiento1R.click();
		sleep(1000);
		opctypeHierarquiaSequenciamiento1R.click();
		sleep(1000);
		
		hierarquiaSequenciamiento2R.click();
		sleep(1000);
		opcHierarquiaSequenciamiento2R.click();
		sleep(1000);
		
		typeHierarquiaSequenciamiento2R.click();
		sleep(1000);
		opctypeHierarquiaSequenciamiento2R.click();
		sleep(1000);
		
		guardarNovaRegra.click();
		sleep(1000);
		
		
		//PARTE DE OBRIGACAO
		botonObrigacao.click();
		sleep(2000);
		waitExpectElement(novaObrigacao);
		sleep(2000);
		
		novaObrigacao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		obrigacao.click();
		sleep(1000);		
		opcobrigacao.click();
		sleep(1000);
		closeSelectTypeCheckbox(obrigacao);
		sleep(1000);
		
		gravarObrigacao.click();
		sleep(2000);
		
		/////
		
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		nao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
	
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("idCentralizacaoSaldos",id2);
		
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
		System.out.println("Antes da criação: " +idD);
		System.out.println("Apos da criação: " +id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
	
		return sucesso;
	}

}

