package com.sap.timp.pageObjectModel.TCC.BancoDeOcorrencias.ConfiguracaoEExecucao;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguracaoEExecucaoCriarPO extends TestBaseSteven {

	@FindBy(xpath = "//li[@identifier=\"accordion-item-boc\"]")
	public WebElement bancoOcorrencia;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-bocConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//div[@class=\"tr\" and @data-id][1]/div[2]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//span[contains(text(),\"Nov\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div[2]/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[text()=\"ICMS\"]")
	public WebElement tributoO;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[2]/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//label[@for=\"check-1000\"]/span")
	public WebElement empresaO;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[2]/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//label[@for=\"check-SP\"]/span")
	public WebElement ufOTQ1;
	
	@FindBy(xpath = "//label[@for=\"check-BA\"]/span")
	public WebElement ufOTC2;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[2]/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//label[@for=\"check-1000_SP_0001\"]/span")
	public WebElement filialOTQ1;
	
	@FindBy(xpath = "//label[@for=\"check-1000_BA_0143\"]/span")
	public WebElement filialOTC2;
	
	@FindBy(xpath = "//div[@id=\"occurrence-type\"]/div/div[2]/div/div[2]")
	public WebElement tipoOcorrencia;
	
	@FindBy(xpath = "//div[text()=\"Auto de infração\"]")
	public WebElement tipoOcorreciaOTQ1;
	
	@FindBy(xpath = "//div[text()=\"Cobrança em fronteira\"]")
	public WebElement tipoOcorrenciaOTC2;
	
	@FindBy(xpath = "//div[@id=\"object-type\"]/div/div[2]/div/div[2]")
	public WebElement tipoObjeto;
	
	@FindBy(xpath = "//div[text()=\"ICMS\"]")
	public WebElement tipoObjetoTQ1;
	
	@FindBy(xpath = "//div[text()=\"DIFAL\"]")
	public WebElement tipoObjetoTC2;
	
	@FindBy(xpath = "//div[@id=\"objectTypeFiscalOccurrenceRegister\"]/div/div[2]/div/div[2]")
	public WebElement idTipoObjeto;
	
	@FindBy(xpath = "//div[text()=\"110 - Auto de infração\"]")
	public WebElement idTipoObjetoTQ1;
	

	@FindBy(xpath = "//div[text()=\"2 - Controle Interno\"]")
	public WebElement idTipoObjetoTC2;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Observação\"]")
	public WebElement observacao;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[@id=\"credit-adjustment-code-button\"]")
	public WebElement associaçãoCódigoAjusteCrédito;
	
	@FindBy(xpath = "//button[@id=\"debit-adjustment-code-button\"]")
	public WebElement associaçãoCódigoAjusteDébito;
	
	@FindBy(xpath = "//button[@id=\"pagamento-adjustment-code-button\"]")
	public WebElement associaçãoCódigoAjustePagamento;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id][\"1\"]/div")
	public WebElement idS;
	
	@FindBy(xpath = "//button[text()=\"Selecionar\"]")
	public WebElement seleccionar;
	
	public ConfiguracaoEExecucaoCriarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean criar() {

		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}
		boolean tq1 = false;
		
		if (url.contains("tq1")) {
			tq1 = true;
		}
		
		bancoOcorrencia.click();
		sleep(2000);
		configuracaoEExecucao.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[2]/div")).getText();
		System.out.println("Id ultimo registro: " +idRegistro);
		
		novo.click();
		
		waitExpectElement(tributo);
		invisibilityOfElementOverlay();
		
		tributo.click();
		sleep(1000);
		tributoO.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"company\"]/div", "class", "input-element-wrapper");
		sleep(1000);
		
		empresa.click();
		sleep(1000);
		empresaO.click();
		sleep(1000);
		closeSelectTypeCheckbox(empresa);
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "input-element-wrapper");
		sleep(1000);
		
		uf.click();
		
		if (tc2==true) {
			ufOTC2.click();
			sleep(1000);
			closeSelectTypeCheckbox(uf);
			sleep(1000);
		}else {
			ufOTQ1.click();
			sleep(1000);
			closeSelectTypeCheckbox(uf);
			sleep(1000);
		}
		
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "input-element-wrapper");
		sleep(1000);
		
		filial.click();
		
		if (tc2==true) {
			filialOTC2.click();
			sleep(1000);
			closeSelectTypeCheckbox(filial);
			sleep(1000);
		}else {
			filialOTQ1.click();
			sleep(1000);
			closeSelectTypeCheckbox(filial);
			sleep(1000);
		}
		
		
		tipoOcorrencia.click();
		
		if (tc2==true) {
			tipoOcorrenciaOTC2.click();
		}else {
			tipoOcorreciaOTQ1.click();
		}
		
		
		tipoObjeto.click();
		
		if (tc2==true) {
			
			tipoObjetoTC2.click();
			sleep(1000);
			closeSelectTypeCheckbox(tipoObjeto);
			sleep(1000);
			
		}else {
			
			tipoObjetoTQ1.click();
			sleep(1000);
			closeSelectTypeCheckbox(tipoObjeto);
			sleep(3000);
		}
		
		
		idTipoObjeto.click();
		
		if (tc2==true) {
			idTipoObjetoTC2.click();
		}else if(tq1 == true) {
			idTipoObjetoTQ1.click();
		}else {
			idTipoObjetoTC2.click();
		}
		
		invisibilityOfElementOverlay();
		
		
		associaçãoCódigoAjusteCrédito.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		idS.click();
		sleep(2000);
		
		seleccionar.click();
		sleep(2000);
		
		associaçãoCódigoAjusteDébito.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		idS.click();
		sleep(2000);
		
		seleccionar.click();
		sleep(2000);
		
		
		
		associaçãoCódigoAjustePagamento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		idS.click();
		sleep(2000);
		
		seleccionar.click();
		sleep(2000);
		
		
		
		observacao.sendKeys("Teste Automatizado");
		sleep(2000);
		
		sleep(2000);
		gravar.click();
		sleep(3000);
		waitExpectElement(sim);
		sim.click();
		sleep(6000);
		
		

		sleep(3000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(8000);

		sleep(3000);
		waitExpectElement(biblioteca);
		sleep(3000);
		biblioteca.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		
		//idInserir3(id2);
		
		idInserir("idBOConfiguracaoEExecucaco",id2);
		
		int idD = convertToInt(idRegistro);
		int id2D = convertToInt(id2);
		
		System.out.println(idD);
		System.out.println("Registro Creado: "+id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
		
		System.out.println(sucesso);
		
		return sucesso;

	}

}
