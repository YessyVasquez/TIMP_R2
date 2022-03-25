package com.sap.timp.pageObjectModel.TCC.BancodeCréditoTributário.ConfiguraçãodeBancodeCréditoTributário;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ConfiguraçãodeBancodeCréditoTributárioCriarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Banco de Crédito Tributário\"]")
	public WebElement BancoCréditoTributário;

	
	@FindBy(xpath = "//span[text()=\"Configuração de Banco de Crédito Tributário\"]")
	public WebElement configuracion;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Nova Configuração\"]")
	public WebElement btnNovo;
	
	
	
	
	@FindBy(xpath = "//input[@placeholder=\"Tributo\"]")
	public WebElement cboTributo;
	
	@FindBy(xpath = "//li[@tabindex=\"0\" and @id and @class=\"list-item\" and text()=\"COFINS\"]")
	public WebElement opcionTributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement cboEmpresa;
	
	@FindBy(xpath = "//li[text()=\"1000\"]")
	public WebElement opcionEmpresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Componente Origem\"]")
	public WebElement cboComponenteOrigen;
	
	@FindBy(xpath = "//li[text()=\"BCB\"]")
	public WebElement opcionComponenteOrigen;
	
	
	
	@FindBy(xpath = "//div[@id=\"originID\"]/div/div[1]/div[2]")
	public WebElement cboIDOrigen;
	
	@FindBy(xpath = "//li[text()=\"204 - Teste IRPJ\"]")
	public WebElement opcionIDOrigenTC2;
	
	@FindBy(xpath = "//li[text()=\"117 - Apuração PIS/COFINS\"]")
	public WebElement opcionIDOrigenTQ1;
	
	@FindBy(xpath = "//li[text()=\"306 - teste 02 /08/2019\"]")
	public WebElement opcionIDOrigenTP1;

	@FindBy(xpath = "//div[@id=\"outputField\"]/div/div[1]/div[2]")

	public WebElement cboSaida;
	
	@FindBy(xpath = "//li[text()=\"subn 1\"]")
	public WebElement opcionSaidaTC2;
	
	@FindBy(xpath = "//li[text()=\"t1\"]")
	public WebElement opcionSaidaTQ1;
	
	@FindBy(xpath = "//li[text()=\"SALARIO\"]")
	public WebElement opcionSaidaTP1;
	
	
	
	
	@FindBy(xpath = "//div[@id=\"creditType\"]/div/div/div[2]")
	public WebElement tipoCredito;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcionTipoCredito;
	
	
	@FindBy(xpath = "//div[@id=\"adjustmentOrigin\"]/div/div[1]/div[2]")
	public WebElement cboACredito;
	@FindBy(xpath = "//li[text()=\"427 - A0205\"]")
	public WebElement opcionACreditoTC2;
	@FindBy(xpath = "//li[text()=\"433 - P0039\"]")
	public WebElement opcionACreditoTQ1;
	
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Taxa de Atualização\"]")
	public WebElement cboTaxaAtualização;
	
	//@FindBy(xpath = "//li[text()=\"00001 - Tester\"]")
	@FindBy(xpath = "//li[@class=\"list-item\"][1]")
	public WebElement opcionTaxaAtualizaçãoTC2;
	@FindBy(xpath = "//li[text()=\"11 - SELIC\"]")
	public WebElement opcionTaxaAtualizaçãoTQ1;
	
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Classificação de Acesso\"]")
	public WebElement cboClassificaçãoAcesso;
	
	@FindBy(xpath = "//li[text()=\"Público\"]")
	public WebElement opcionClassificaçãoAcessoTC2;
	
	@FindBy(xpath = "//li[text()=\"Público\"]")
	public WebElement opcionClassificaçãoAcessoTQ1;
	
	
	
	@FindBy(xpath = "//*[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement validaDe;
	
	

	
	@FindBy(xpath = "//input[@placeholder=\"Tributo Destino\"]")
	public WebElement cboTributoDestino;
	
	@FindBy(xpath = "//li[text()=\"COFINS\"]")
	public WebElement opcionTributoDestinoTC2;
	
	@FindBy(xpath = "//li[text()=\"COFINS\"]")
	public WebElement opcionTributoDestinoTQ1;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tipo de Crédito\"]")
	public WebElement cboTipoCredito;
	@FindBy(xpath = "//li[@class=\"list-item\"][1]")
	public WebElement opcionTipoCreditoTC2;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Ajuste de Débito\"]")
	public WebElement cboAjuste;
	
	@FindBy(xpath = "//li[text()=\"427 - A0205\"]")
	public WebElement opcionAjusteTC2;
	
	@FindBy(xpath = "//li[text()=\"433 - P0039\"]")
	public WebElement opcionAjusteTQ1;
	

	
	
	
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement btnCriar;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement btnNo;
	
	@FindBy(xpath = "//*[@id=\"addRowButton\"]/span")
	public WebElement btnAgregar;
	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	public ConfiguraçãodeBancodeCréditoTributárioCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		BancoCréditoTributário.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracion.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String id = "0"; // Primer ID antes de crear un registro
		
		if(rows > 0) {

			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
			System.out.println("ID Primer Registro: " + id);
		}
		
		btnNovo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboEmpresa.click();
		sleep(1000);
		opcionEmpresa.click();
		sleep(1000);

		cboTributo.click();
		sleep(1000);
		opcionTributo.click();
		sleep(10000);
		
		cboComponenteOrigen.click();
		sleep(1000);
		opcionComponenteOrigen.click();
		sleep(18000);
		
		
		if ( tq1 == true) {
			
			cboIDOrigen.click();
			sleep(1000);
			opcionIDOrigenTQ1.click();
			sleep(10000);
			
			cboSaida.click();
			sleep(1000);
			opcionSaidaTQ1.click();
			sleep(10000);
			
			tipoCredito.click();
			sleep(2000);
			opcionTipoCredito.click();
			sleep(2000);
			
			sleep(2000);
			actionsMoveToElementElement(validaDe);
			sleep(2000);
			
			cboACredito.click();
			sleep(1000);
			opcionACreditoTQ1.click();
			sleep(10000);
			
			cboTaxaAtualização.click();
			sleep(1000);
			opcionTaxaAtualizaçãoTQ1.click();
			sleep(7000);
			
			cboClassificaçãoAcesso.click();
			sleep(1000);
			opcionClassificaçãoAcessoTQ1.click();
			sleep(10000);
			
			validaDe.sendKeys("11/01/2021");
			sleep(4000);
			
			cboTributoDestino.click();
			sleep(1000);
			opcionTributoDestinoTQ1.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			
			
			cboAjuste.click();
			sleep(1000);
			opcionAjusteTQ1.click();
			sleep(8000);


		}else if(tc2 == true ) {
			
			
			cboIDOrigen.click();
			sleep(1000);
			opcionIDOrigenTC2.click();

			sleep(24000);

			
			cboSaida.click();
			sleep(1000);
			opcionSaidaTC2.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(10000);
			
			tipoCredito.click();
			sleep(2000);
			opcionTipoCredito.click();
			sleep(2000);
			
			sleep(2000);
			actionsMoveToElementElement(validaDe);
			sleep(2000);
			
			cboTipoCredito.click();
			sleep(2000);
			opcionTipoCreditoTC2.click();
			sleep(70000);
			
			cboACredito.click();
			sleep(1000);
			opcionACreditoTC2.click();
			sleep(10000);
			
			cboTaxaAtualização.click();
			sleep(1000);
			opcionTaxaAtualizaçãoTC2.click();
			sleep(10000);
			
			cboClassificaçãoAcesso.click();
			sleep(1000);
			opcionClassificaçãoAcessoTC2.click();
			sleep(10000);
			
			validaDe.sendKeys("11/01/2021");
			sleep(4000);
			
			cboTributoDestino.click();
			sleep(1000);
			opcionTributoDestinoTC2.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			cboAjuste.click();
			sleep(1000);
			opcionAjusteTC2.click();
			sleep(7000);
			
		}else {
			cboIDOrigen.click();
			sleep(1000);
			opcionIDOrigenTP1.click();
			sleep(7000);
			
			cboSaida.click();
			sleep(1000);
			opcionSaidaTP1.click();
			sleep(7000);
			
			tipoCredito.click();
			sleep(2000);
			opcionTipoCredito.click();
			sleep(2000);
			
			sleep(2000);
			actionsMoveToElementElement(validaDe);
			sleep(2000);
			
			cboACredito.click();
			sleep(1000);
			opcionACreditoTQ1.click();
			sleep(7000);
			
			cboTaxaAtualização.click();
			sleep(1000);
			opcionTaxaAtualizaçãoTQ1.click();
			sleep(7000);
			
			cboClassificaçãoAcesso.click();
			sleep(1000);
			opcionClassificaçãoAcessoTQ1.click();
			sleep(7000);
			
			validaDe.sendKeys("11/01/2021");
			sleep(4000);
			
			cboTributoDestino.click();
			sleep(1000);
			opcionTributoDestinoTQ1.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			
			
			cboAjuste.click();
			sleep(1000);
			opcionAjusteTQ1.click();
			sleep(10000);
		}
		
		
		btnAgregar.click();
		sleep(2000);
	
		btnGravar.click();
		sleep(2000);
		
		btnNo.click();
		sleep(36000);
		
		ultimapagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		System.out.println("Rows:" +rows);
		
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		
		idInserir("idBCT-ConfiguracaoDeBancoDeCreditoTributario",idultimo);
		//idInserir1(idultimo);

		System.out.println(id);
		System.out.println(idultimo);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idultimo);
		
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
