package com.sap.timp.pageObjectModel.MDR.ThinCapitalization.Subcapitalizacao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class SubcapitalizacaoCriarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Thin Capitalization\"]")
	public WebElement thincapitalization;
	
	@FindBy(xpath = "//span[text()=\"Subcapitalização\"]")
	public WebElement subcapitalizacao;
	
	@FindBy(xpath = "//span[text()=\"Nova Subcapitalização\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"companies\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	
	@FindBy(xpath = "//li[@id][3]")
	public WebElement opcao1;
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement opcaouf;
	
	@FindBy(xpath = "//div[@id=\"1000-SP-0001\"]/div/label/span")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branches\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"lender\"]/div/div/div[2]")
	public WebElement tipodecredor;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Dívida/Capital na proporção da Lei\"]")
	public WebElement divida;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data Inicial\"]")
	public WebElement datainicio;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\" toast-inner\"]")
	public WebElement mensagem;
	
	public SubcapitalizacaoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		thincapitalization.click();
		sleep(2000);
		
		subcapitalizacao.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		
		//criaçao
		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		empresa.click();
		
		sleep(2000);
		
		//opcao.click();
		opcaoempresa.click();
		sleep(2000);
		closeSelectTypeCheckbox(empresa);
		sleep(2000);
		//attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-select required");
		//sleep(3000);
		uf.click();
		
		sleep(2000);
		
		//opcao.click();
		opcaouf.click();
		sleep(2000);
		closeSelectTypeCheckbox(uf);
		sleep(2000);
		//attributeToBeXpath("//div[@id=\"branches\"]/div", "class", "base-select required");
		//sleep(3000);
		
		filial.click();
		
		sleep(2000);
		opcaofilial.click();
		//opcao1.click();
		
		sleep(2000);
		closeSelectTypeCheckbox(filial);
		sleep(2000);
		tipodecredor.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		divida.sendKeys("1");
		
		sleep(2000);
		
		datainicio.sendKeys(fechaActual());
		
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
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir("subcapitalizacao", id2);
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
