package com.sap.timp.pageObjectModel.MDR.SCANC.ProdutosSCANC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sap.timp.base.TestBaseSteven;


public class ProdutosSCANCCriarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"Produtos SCANC\"]")
	public WebElement produtosScanc;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement dataincial;
	
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
	
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcao;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao2;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Empresa\")]")
	public WebElement empresa;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"anexo\")]")
	public WebElement anexo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"SCANC\")]")
	public WebElement GRScanc;
	
	@FindBy(xpath = "//div[@class=\"list-option selectAll\"]/div/div/label/span")
	public WebElement mercadoriaO;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"mercadoria\")]")
	public WebElement mercadoria;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"material\")]")
	public WebElement material;

	
	@FindBy(xpath = "//input[contains(@placeholder,\"início\")]")
	public WebElement dataVigencia;
	
	
	
	
	public ProdutosSCANCCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		scanc.click();
		sleep(2000);
		
		produtosScanc.click();
		
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
		
		sleep(2000);
		//criaçao
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	
		
		empresa.click();
		sleep(1000);
		opcao.click();
		sleep(2000);
		
		anexo.click();
		sleep(1000);
		opcao.click();
		sleep(2000);	
		
		GRScanc.sendKeys(Keys.ENTER);
		sleep(1000);
		opcao.click();
		sleep(2000);
		

		
		mercadoria.click();
		sleep(1000);
		mercadoriaO.click();
		mercadoriaO.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"material-code-products\"]/div", "class", "base-MultipleSelect3 ");
		sleep(2000);
		
		material.click();
		sleep(1000);
		opcao2.click();
		opcao2.sendKeys(Keys.ESCAPE);
		sleep(2000);

		
		dataVigencia.sendKeys("01/01/2020");
		
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		siguiente.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir("ProdutosSCANC",id2);
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
