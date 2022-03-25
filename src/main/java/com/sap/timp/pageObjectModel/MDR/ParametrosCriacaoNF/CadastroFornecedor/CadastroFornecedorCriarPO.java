package com.sap.timp.pageObjectModel.MDR.ParametrosCriacaoNF.CadastroFornecedor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CadastroFornecedorCriarPO extends TestBaseSteven{

	
	@FindBy(xpath = "//span[text()=\"Parâmetros de Criação de Nota Fiscal\"]")
	public WebElement parametrosCriacaoNotaFiscal;
	
	@FindBy(xpath = "//span[text()=\"Cadastro de Fornecedor\"]")
	public WebElement cadastroFornecedor;
	
	@FindBy(xpath = "//span[contains(text(),\"Nova\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[contains(@id,\"company\")]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[contains(@id,\"uf\")]/div/div/div[2]")
	public WebElement estado;
	
	@FindBy(xpath = "//div[contains(@id,\"branch\")]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[contains(@id,\"provider\")]/div/div[2]")
	public WebElement fornecedor;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicial\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Final\")]")
	public WebElement dataFinal;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcaoF;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	
	
	public CadastroFornecedorCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
			
		sleep(2000);
		parametrosCriacaoNotaFiscal.click();
		sleep(2000);
		cadastroFornecedor.click();
		sleep(2000);


		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		//siguiente.click();
		
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//sleep(2000);
		
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		attributeToBeXpath("//div[contains(@id,\"uf\")]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);

		estado.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);

		sleep(1000);
		
		attributeToBeXpath("//div[contains(@id,\"branch\")]/div", "class", "base-MultipleSelect3 required");
		sleep(1000);
		
		filial.click();
		sleep(1000);
		opcao.click();
		body.click();

		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		fornecedor.click();
		sleep(1000);
		opcaoF.click();
		sleep(1000);
		
		dataVigencia.sendKeys(fechaActual());
		dataFinal.sendKeys(fechaManana());
		
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		//siguiente.click();
		
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//sleep(2000);

		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		idInserir("CadastroFornecedor",idB);
		
		sleep(2000);
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
		
		
		return sucesso;
		
		
	}	
}
