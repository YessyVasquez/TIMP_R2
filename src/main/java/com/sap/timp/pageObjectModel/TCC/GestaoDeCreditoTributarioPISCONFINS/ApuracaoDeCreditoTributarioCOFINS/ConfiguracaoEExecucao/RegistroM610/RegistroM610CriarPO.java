package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.RegistroM610;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class RegistroM610CriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário COFINS\"]")
	public WebElement apuracaocreditocofins;
	

	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisCalculationConfiguration\" and @tabindex=\"0\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM610\"]")
	public WebElement registroM610;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//div[@class=\"tr\" and @data-id][1]/div[2]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//span[contains(text(),\"Nov\")]")
	public WebElement novo;
	
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[2]")
	public WebElement empresa;

	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"codCont\"]/div/div[@id=\"main-icon\"]")
	public WebElement codigoContruicao;
	
	@FindBy(xpath = "//div[@id=\"vlRecBrt\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorReceitaBruta;
	
	@FindBy(xpath = "//div[@id=\"vlBcCont\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorBase;
	
	@FindBy(xpath = "//div[@id=\"vlContApur\"]/div/div[@id=\"main-icon\"]")
	public WebElement contribuicaoSocialApurada;
	
	@FindBy(xpath = "//div[@id=\"vlAjusAcres\"]/div/div[@id=\"main-icon\"]")
	public WebElement ajustesAcrescimo;
	
	@FindBy(xpath = "//div[@id=\"vlAjusReduc\"]/div/div[@id=\"main-icon\"]")
	public WebElement ajusteReducao;
	
	@FindBy(xpath = "//div[@id=\"vlContPer\"]/div/div[@id=\"main-icon\"]")
	public WebElement contribuicaoPeriodo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao2;
	
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
	
	public RegistroM610CriarPO() {

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
		registroM610.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
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
		sleep(2000);
		
		uf.click();
		sleep(1000);
		opcao2.click();
		closeSelectTypeCheckbox(uf);
		sleep(1000);
	
		
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		filial.click();
		sleep(1000);
		opcao2.click();
		closeSelectTypeCheckbox(filial);
		sleep(1000);
	
		codigoContruicao.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		
		valorReceitaBruta.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		
		valorBase.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		
		contribuicaoSocialApurada.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		
		ajustesAcrescimo.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		
		ajusteReducao.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		
		contribuicaoPeriodo.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		sim.click();
		sleep(17000);
	
		biblioteca.click();
		sleep(6000);
		
		int botaoNao = rows("//button[text()=\"Não\"]");
		
		if (botaoNao > 0) {
			nao.click();
		}
		
		//waitExpectElement(siguiente);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("GestaoCreditoTributarioCOFINSRegistroM610",id2);
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


