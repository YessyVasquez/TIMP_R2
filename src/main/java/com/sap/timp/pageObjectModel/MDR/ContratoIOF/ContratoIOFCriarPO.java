package com.sap.timp.pageObjectModel.MDR.ContratoIOF;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.j2objc.annotations.Weak;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;

public class ContratoIOFCriarPO extends TestBaseMassiel {

	@FindBy(xpath = "//span[text()=\"Contrato IOF \"]")
	public WebElement contratoiof;
		
	@FindBy(xpath = "//span[text()=\"Novo Contrato IOF \"]")
	public WebElement novocontratoiof;
	

	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Contrato No.\"]")
	public WebElement preenchercontrato;
	
	@FindBy(xpath ="//div[@id=\"revenueCode\"]/div/div/div[2]")
	public WebElement codigoreceita;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaocodigoreceita;
	
	@FindBy(xpath = "//div[@id=\"personType\"]/div/div/div[2]")
	public WebElement tipopessoa;
	
	@FindBy(xpath ="//li[@id][1]")
	public WebElement opcaotipopessoa;
	
	@FindBy(xpath ="//input[@placeholder=\"Preencher CPF\"]")
	public WebElement cpf;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Variação\"]")
	public WebElement variacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Razão Social\"]")
	public WebElement razaosocial;
	
	@FindBy(xpath = "//div[@id=\"periodicity\"]/div/div/div[2]")
	public WebElement periocidade;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoperiocidade;
	
	@FindBy(xpath = "//div[@id=\"coin\"]/div/div[2]")
	public WebElement moeda;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement opcaomoeda;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Valor do Contrato\"]")
	public WebElement valorcontrato;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement validadede;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath ="//*[@id=\"0001\"]/div[1]/label/span")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	//@FindBy(xpath ="//div[@id=\"00\"]/div/label/span")
	//@FindBy(xpath="//div[@id=\"14\"]/div/label/span")
	//@FindBy(xpath = "//div[@id=\"0\"]/div/label/span")
	@FindBy(xpath = "//div[@id=\"05\"]/div/label/span")
	public WebElement opcaotributo;
	
	//@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[2]/div/div[3]/div/span[1]")
	@FindBy(xpath = "//span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[text()=\"Adicionar\"]")
	public WebElement adicionar;
	
	
	public ContratoIOFCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean criar() {
		
		
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		contratoiof.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

		
		novocontratoiof.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		
		preenchercontrato.sendKeys("123");
		sleep(1000);
		//codigoreceita.click();
		sleep(1000);
		//opcaocodigoreceita.click();
		sleep(1000);
		
		tipopessoa.click();
		sleep(1000);
		waitExpectElement(opcaotipopessoa);
		sleep(2000);
		opcaotipopessoa.click();
		sleep(1000);
		
		cpf.sendKeys("13154614712");
		sleep(1000);
		actionsMoveToElementElement(validadede);
		sleep(1000);
		
		
		variacao.sendKeys("01");
		sleep(1000);
		razaosocial.sendKeys("Razão");
		sleep(1000);
		periocidade.click();
		sleep(1000);
		opcaoperiocidade.click();
		sleep(1000);
		waitExpectElement(moeda);
		sleep(14000);
		moeda.click();
		sleep(1000);
		opcaomoeda.click();
		sleep(1000);
		valorcontrato.sendKeys("1000");
		sleep(1000);
		String data= fechaActual();
		
		validadede.sendKeys(data);
		sleep(1000);
		actionsMoveToElementElement(adicionar);
		sleep(1000);
		
		empresa.click();
		sleep(1000);
		opcaoempresa.click();
		sleep(1000);
		
		waitExpectElement(filial);
		sleep(2000);
		
		filial.click();
		sleep(1000);
		opcaofilial.click();
		opcaofilial.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"tax\"]/div/div/div/div[2]", "class", "new-tag");
		sleep(3000);
		tributo.click();
		sleep(1000);
		opcaotributo.click();
		sleep(1000);
		opcaotributo.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		adicionar.click();
		sleep(1000);
		gravar.click();
		sleep(1000);
		waitExpectElement(butaosim);
		sleep(2000);
		butaosim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		idInserir("ContratoIOF",idB);
		System.out.println(id);
		System.out.println(idB);
				
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;
				
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
				
		System.out.println( sucesso);
		
		return sucesso;
		
	}



}
	
	

