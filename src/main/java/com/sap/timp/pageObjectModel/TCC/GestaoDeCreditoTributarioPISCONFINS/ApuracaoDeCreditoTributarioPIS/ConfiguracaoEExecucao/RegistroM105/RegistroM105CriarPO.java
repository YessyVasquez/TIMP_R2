package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.RegistroM105;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class RegistroM105CriarPO  extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário PIS\"]")
	public WebElement apuraçãoCrédito;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisCalculationConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM105\"]")
	public WebElement registroM105;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[text()=\"Novo Registro M105\"]")
	public WebElement nuevo;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement empresaoPC;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"SP\"]")
	public WebElement ufOPC;
	
	@FindBy(xpath = "//div[@id=\"AL\"]")
	public WebElement ufOPC1;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"1000_SP_0001\"]")
	public WebElement filialOPC;
	
	@FindBy(xpath = "//div[@id=\"1000_AL_0008\"]")
	public WebElement filialOPC1;
	
	@FindBy(xpath = "//div[@id=\"natBcCred\"]/div/div[2]")
	public WebElement CódigoBaseCálculoCréditoApuradoPeríodo;
	
	@FindBy(xpath = "//div[@id=\"cstPis\"]/div/div/input")
	public WebElement CódigoSituaçãoTributáriaReferenteAOPIS;
	
	@FindBy(xpath = "//div[@id=\"vlBcPisTot\"]/div/div[2]")
	public WebElement ValorTotalBaseCálculoEscrituradaDocumentosOperações;
	
	@FindBy(xpath = "//div[@id=\"vlBcPisCum\"]/div/div[2]")
	public WebElement ParcelaValorTotalBaseCálculoInformada;
	
	@FindBy(xpath = "//div[@id=\"vlBcPisNc\"]/div/div[2]")
	public WebElement ValorTotalBaseCálculoCréditoVinculadaReceitasIncidênciaCumulativa;
	
	@FindBy(xpath = "//div[@id=\"vlBcPis\"]/div/div[2]")
	public WebElement ValorBaseCálculoCréditoVinculadaTipoCreditoEscrituraM500;
	
	@FindBy(xpath = "//div[@id=\"quantBcPisTot\"]/div/div[2]")
	public WebElement QuantidadeTotalBaseCálculoCréditoApuradoUnidadeMedidaProduto;
	
	@FindBy(xpath = "//div[@id=\"quantBcPis\"]/div/div[2]")
	public WebElement ParcelaBaseCálculoCréditoQuantidadeVinculadaTipoCréditoEscrituradoM500;
	
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement OPC11;
	
	@FindBy(xpath = "//li[@id=\"1\"]")
	public WebElement OPC1;
	
	@FindBy(xpath = "//li[@id=\"01\"]")
	public WebElement OPC;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//Span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement no;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	public RegistroM105CriarPO() {

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
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		apuraçãoCrédito.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registroM105.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id ultimo registro: " +idRegistro);
		
		nuevo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresaoPC.click();
		sleep(14000);
		
		uf.click();
		sleep(3000);
		
		if (tc2 == true) {


			ufOPC1.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(uf);
			sleep(2000);

		}else{
			ufOPC.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(uf);
			sleep(2000);
			
		}
		
		
		sleep(9000);
		filial.click();
		sleep(2000);
		
		if (tc2 == true) {


			filialOPC1.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(filial);
			sleep(2000);

		}else {
			filialOPC.click();
			sleep(2000);
			
			closeSelectTypeCheckbox(filial);
			sleep(2000);
			
		}
		
		CódigoBaseCálculoCréditoApuradoPeríodo.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		CódigoSituaçãoTributáriaReferenteAOPIS.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		CódigoSituaçãoTributáriaReferenteAOPIS.sendKeys("23");
		CódigoSituaçãoTributáriaReferenteAOPIS.sendKeys(Keys.ENTER);
		sleep(4000);
		
		ValorTotalBaseCálculoEscrituradaDocumentosOperações.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC1.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		ParcelaValorTotalBaseCálculoInformada.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC1.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		ValorTotalBaseCálculoCréditoVinculadaReceitasIncidênciaCumulativa.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC1.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		ValorBaseCálculoCréditoVinculadaTipoCreditoEscrituraM500.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC1.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		QuantidadeTotalBaseCálculoCréditoApuradoUnidadeMedidaProduto.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC1.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		ParcelaBaseCálculoCréditoQuantidadeVinculadaTipoCréditoEscrituradoM500.click();
		sleep(2000);
		
		if (tc2 == true) {


			OPC11.click();
			sleep(2000);

		}else if (tq1==true ) {
			OPC1.click();
			sleep(2000);
			
		}else {
			OPC11.click();
			sleep(2000);
		}
		
		gravar.click();
		sleep(2000);
		
		sim.click();
		sleep(10000);		
		waitExpectElement(biblioteca);
		sleep(8000);
		
		biblioteca.click();
		sleep(4000);
		
		int botaoNao = rows("//button[text()=\"Não\"]");
		
		if (botaoNao > 0) {
			nao.click();
		}
		
		sleep(12000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("ApuraçãodeCréditoTributárioPISRegistroM105",id2);
		int idD = convertToInt(idRegistro);
		int id2D = convertToInt(id2);
		
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
