package com.sap.timp.pageObjectModel.MDR.ConfiguracoesFundoSocial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;

public class ConfiguracoesFundoSocialCriarPO extends TestBaseSteven{
	
	
	
	@FindBy(xpath = "//span[text()=\"Configurações de Fundo Social\"]")
	public WebElement configuracoesFundoSocial;
	
	@FindBy(xpath = "//span[contains(text(),\"Nova\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"COMPANY\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"UF_BRANCH\"]/div/div/div[2]")
	public WebElement ufFilial;
	
	@FindBy(xpath = "//div[@id=\"BRANCH\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"TRIBUTE\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"FUND_NAME\"]/div/div/div[2]")
	public WebElement nomeFundo;
	
	@FindBy(xpath = "//div[@id=\"TRIBUTE_TYPE_DETAIL\"]/div/div[2]")
	public WebElement detalheTipoTributo;
	
	@FindBy(xpath = "//div[@id=\"ADJUSTMENT_TRIBUTE_TYPE\"]/div/div/div[2]")
	public WebElement tipoTributo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Vigência de\")]")
	public WebElement dataVigenca;
	
	@FindBy(xpath = "//div[@id=\"CALCULATION_BASE_TYPE\"]/div/div[2]")
	public WebElement tipoBaseCalculo;
	
	@FindBy(xpath = "//div[@id=\"VB_VALUE_LIMIT\"]/div/div[2]")
	public WebElement limite;
	
	@FindBy(xpath = "//div[@id=\"SPED_REGISTRY_CODE\"]/div/div/div[2]")
	public WebElement codigoRegistroSped;
	
	@FindBy(xpath = "//div[@id=\"REPORT_MODEL\"]/div/div[2]")
	public WebElement modeloRelatorio;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcao2;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Cenário de Correção\"]")
	public WebElement adicionacenariodecorreçao;
	

	
	
	public ConfiguracoesFundoSocialCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		configuracoesFundoSocial.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]")).getText();
		
		System.out.println(id);
		
		sleep(2000);

		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"UF_BRANCH\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		ufFilial.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"BRANCH\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		
		filial.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(3000);
		
		tributo.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		nomeFundo.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		detalheTipoTributo.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"ADJUSTMENT_TRIBUTE_TYPE\"]/div", "class", "base-select required");
		sleep(3000);
		
		tipoTributo.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		dataVigenca.sendKeys(fechaActual());
		
		
		tipoBaseCalculo.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		limite.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		codigoRegistroSped.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		modeloRelatorio.click();
		sleep(2000);
		opcao2.click();
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]")).getText();
		
		
		idInserir("ConfiguracaoFundoSocial",id2);
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
