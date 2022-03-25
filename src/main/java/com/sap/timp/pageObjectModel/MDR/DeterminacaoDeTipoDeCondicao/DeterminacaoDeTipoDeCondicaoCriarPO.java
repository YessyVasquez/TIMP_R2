package com.sap.timp.pageObjectModel.MDR.DeterminacaoDeTipoDeCondicao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DeterminacaoDeTipoDeCondicaoCriarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Determinação de Tipo de Condição\"]")
	public WebElement determinacaodetipodecondicao;
	
	@FindBy(xpath = "//span[text()=\"Nova Determinação de Tipo de Condição\"]")
	public WebElement novodetermincao;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//div[@class=\"field-element company_0_0\"]/div/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@class=\"field-element process_0_0\"]/div/div/div/div[2]")
	public WebElement processo;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoprocesso;
	
	@FindBy(xpath = "//div[@class=\"field-element processPrice_0_1\"]/div/div/div/div[2]")
	public WebElement procedimento;
		
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoprocedimento;
	
	@FindBy(xpath = "//div[@class=\"field-element taxType_0_1\"]/div/div/div/div[2]")
	public WebElement imposto;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id]/div[text()=\"ICMS\"]")
	public WebElement opcaoimposto;
	
	@FindBy(xpath = "//div[@class=\"field-element taxTypeDetail_0_2\"]/div/div/div/div[2]")
	public WebElement detalhe;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaodetalhe;
	
	@FindBy(xpath = "//div[@class=\"field-element taxBc_0_2\"]/div/div/div/div[2]")
	public WebElement condicao;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaocondicao;
	
	@FindBy(xpath = "//div[@class=\"field-element taxRate_0_3\"]/div/div/div/div[2]")
	public WebElement aliquota;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoaliquota;
	
	@FindBy(xpath = "//div[@class=\"field-element taxValue_0_3\"]/div/div/div/div[2]")
	public WebElement valortributo;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaovalortributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Início de Vigência \"]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Tipo de tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Detalhe Tipo Tributo\"]")
	public WebElement detalhe1;
	
	public DeterminacaoDeTipoDeCondicaoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		determinacaodetipodecondicao.click();
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		novodetermincao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		
		opcaoempresa.click();
		
		sleep(2000);
		
		closeSelectTypeCheckbox(empresa);
		processo.click();
		
		sleep(2000);
		
		opcaoprocesso.click();
		
		sleep(2000);	
		
		procedimento.click();
		
		sleep(2000);
		opcaoprocedimento.click();
		sleep(2000);
		
		//attributeToBeXpath("//div[@class=\"overlay loader dark\"]", "class", "overlay loader dark");
		//sleep(2000);
		//visibilityElementXpath("//div[@class=\"overlay loader dark\"]");
		//sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(30000);
		
		imposto.click();
		
		sleep(2000);
		
		opcaoimposto.click();
		sleep(2000);
		//attributeToBeXpath("//div[@class=\"overlay loader dark\"]", "class", "overlay loader dark");
		//sleep(2000);
		//waitExpectElement(detalhe1);
		
		//visibilityElementXpath("//div[@class=\"overlay loader dark\"]");
		//sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(30000);
		
		
		detalhe.click();
		sleep(2000);
		
		opcaodetalhe.click();
		
		sleep(2000);
		
		condicao.click();
		
		sleep(2000);

		opcaocondicao.click();
		
		sleep(2000);
		
		aliquota.click();
		
		sleep(2000);
		
		opcaoaliquota.click();
		
		sleep(2000);
		
		valortributo.click();
		
		sleep(2000);
		
		opcaovalortributo.click();
		
		sleep(2000);
		
		String data = fechaActual();
		dataVigencia.sendKeys(data);
		
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		
		
		idInserir("DeterminacaoDeTipoDeCondicao",id2);
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
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
