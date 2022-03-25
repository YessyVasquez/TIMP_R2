package com.sap.timp.pageObjectModel.MDR.AtividadesParaTributacao.AtividadeTributacaoXFornecedor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;

public class AtividadeDeTributacaoXFornecedorCriarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Atividades para tributação\"]")
	public WebElement atividadesTributacao;
	@FindBy(xpath = "//span[text()=\"Atividade de Tributação x Fornecedor\"]")
	public WebElement atividadeTributacaoXFornecedor;
	
	@FindBy(xpath = "//span[text()=\"Novo Atividade de Tributação x Fornecedor\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"taxActivity\"]/div/div/div[2]")
	public WebElement atividadesparatributacao;
	
	@FindBy(xpath = "//li[@id][2]")
	public WebElement opcaoatividade;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	
	@FindBy(xpath = "//div[@id=\"supplier\"]/div/div/div[2]")
	public WebElement contafornecedor;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Centro\"]")
	public WebElement centro;
	
	@FindBy(xpath = "//div[@id=\"providedInMunicipality\"]/div/div/div[2]")
	public WebElement prestado;
	
	@FindBy(xpath = "//div[@id=\"fiscalNoteCategory\"]/div/div/div[2]")
	public WebElement notafiscal;
	
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
	
	public AtividadeDeTributacaoXFornecedorCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		atividadesTributacao.click();
		sleep(1000);
		atividadeTributacaoXFornecedor.click();
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
		
		atividadesparatributacao.click();
		
		sleep(2000);
		
		opcaoatividade.click();
		
		sleep(2000);
		contafornecedor.click();;
		
		sleep(2000);
		opcao.click();
		
		sleep(2000);
		
		centro.sendKeys("07");
		
		sleep(2000);
		
		prestado.click();
		
		sleep(2000);
		
		opcaoatividade.click();
		
		
		sleep(2000);
		
		notafiscal.click();
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		
		sim.click();
		
		sleep(2000);
		
		//biblioteca.click();
		
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
		
		
		idInserir("AtividadeDeTributacaoXFornecedor",id2);
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
