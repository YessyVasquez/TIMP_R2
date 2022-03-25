package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.RegistroM600;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class RegistroM600CriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário COFINS\"]")
	public WebElement apuracaocreditocofins;
	

	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisCalculationConfiguration\" and @tabindex=\"0\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM600\"]")
	public WebElement registroM600;
	
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
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//label[@for=\"check-1000\"]/span")
	public WebElement empresaO;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement ufO;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement filialO;
	
	@FindBy(xpath = "//div[@id=\"vlTotContNcPer\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorTotalContribuicao;
	
	@FindBy(xpath = "//div[@id=\"vlTotCredDesc\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorApuradoPropioPeriodo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"vlTotCredDescAnt\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorApuradoPeriodoAnterior;
	
	@FindBy(xpath = "//div[@id=\"vlTotContNcDev\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorTotalContribuicaoNaoAcumulativa;
	
	@FindBy(xpath = "//div[@id=\"vlRetNc\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorRetidoNaFonteDeduzido;
	
	@FindBy(xpath = "//div[@id=\"vlOutDedNc\"]/div/div[@id=\"main-icon\"]")
	public WebElement outrasDeducoesNoPeriodo;
	
	@FindBy(xpath = "//div[@id=\"vlContNcRec\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorTotalContribuicaoNaoAcumulativaARecolher;
	
	@FindBy(xpath = "//div[@id=\"vlTotContCumPer\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorTotalContribuicaoCumulativa;
	
	@FindBy(xpath = "//div[@id=\"vlRetCum\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorRetidoNaFonteDeduzido2;
	
	@FindBy(xpath = "//div[@id=\"vlOutDedCum\"]/div/div[@id=\"main-icon\"]")
	public WebElement outrasDeducoesNoPeriodo2;
	
	@FindBy(xpath = "//div[@id=\"vlContCumRec\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorTotalContribuicaoCumulativaARecolher;
	
	@FindBy(xpath = "//div[@id=\"vlTotContRec\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorTotalContribuicaoARecolher;
	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar2;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	public RegistroM600CriarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean criar() {

		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		apuracaocreditocofins.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registroM600.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		String idRegistro="0";
		
		if(rows>0) {
		idRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id ultimo registro: " +idRegistro);
		}else {	
			System.out.println("Id ultimo registro: " +idRegistro);
		}
		
		novo.click();
		sleep(2000);
		waitExpectElement(empresa);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		
		
		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		
		uf.click();
		sleep(1000);
		ufO.click();
		sleep(1000);
		closeSelectTypeCheckbox(uf);
		sleep(4000);
	
		
	//	attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(9000);
		
		filial.click();
		sleep(1000);
		filialO.click();
		sleep(1000);
		closeSelectTypeCheckbox(filial);
		sleep(6000);
		
	
		valorTotalContribuicao.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		valorApuradoPropioPeriodo.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		valorApuradoPeriodoAnterior.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		actionsMoveToElementElement(valorTotalContribuicaoARecolher);
		
		valorTotalContribuicaoNaoAcumulativa.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		valorRetidoNaFonteDeduzido.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		outrasDeducoesNoPeriodo.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		valorTotalContribuicaoNaoAcumulativaARecolher.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		valorTotalContribuicaoCumulativa.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		valorRetidoNaFonteDeduzido2.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		outrasDeducoesNoPeriodo2.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		valorTotalContribuicaoCumulativaARecolher.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		valorTotalContribuicaoARecolher.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(biblioteca);
		sleep(2000);
		biblioteca.click();
		
		
		sleep(6000);
		

		int botaoNao = rows("//button[text()=\"Não\"]");
		
		if (botaoNao > 0) {
			nao.click();
		}
		
		
		sleep(6000);
		//waitExpectElement(siguiente);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("GestaoCreditoTributarioCOFINSRegistroM600",id2);
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


