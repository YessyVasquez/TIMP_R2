package com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ValoresParaMetodoPVACriarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Preço de Transferência\"]")
	public WebElement precodetransferencia;
	
	@FindBy(xpath = "//span[text()=\" Valores para Métodos\"]")
	public WebElement valoresparametodos;
	
	@FindBy(xpath = "//span[text()=\" Valores para Método PVA\"]")
	public WebElement valorespva;
	
	@FindBy(xpath = "//span[text()=\"Novo  Valores para Método PVA\"]")
	public WebElement novo;
	
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
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"material\"]/div/div/div[2]")
	public WebElement material;
	
	@FindBy(xpath = "//div[@id=\"model\"]/div/div/div[2]")
	public WebElement modelo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Preço Vendas Merc Varejista Ext para PVA\"]")
	public WebElement precovendas;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Tributos Incluídos\"]")
	public WebElement tributos;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Margem de Lucro\"]")
	public WebElement margemdelucro;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Preço Parâmetro\"]")
	public WebElement precoparametro;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Quantidade Vendida\"]")
	public WebElement quantidade;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Valor Venda Unitária\"]")
	public WebElement valorvenda;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Preço Praticado\"]")
	public WebElement precopraticado;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Data Inicial\"]")
	public WebElement datainicial;
	
	
	@FindBy(xpath = "//button[@id=\"add-materials\"]")
	public WebElement addmateriais;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	
	public ValoresParaMetodoPVACriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		
		sleep(2000);
		precodetransferencia.click();
		sleep(2000);
		
		valoresparametodos.click();
		
		sleep(2000);
		
		valorespva.click();
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
		novo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		addmateriais.click();
		
		sleep(2000);
		if(tc2 == true){
		descricao.sendKeys("GASOLINA ESPECIAL RPBC");
		}else if(tp1 == true) {
		descricao.sendKeys("GASOLINA ESPECIAL RPBC");
		}else {
			descricao.sendKeys("Material Teste Inventário");
		}
		sleep(2000);
		
		sim.click();
		
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"material\"]/div", "class", "base-select required");
		sleep(3000);
		
		material.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		modelo.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		precovendas.sendKeys("1000");
		
		sleep(2000);
		
		tributos.sendKeys("1000");
		
		sleep(2000);
		
		margemdelucro.sendKeys("100");
		
		sleep(2000);
		
		precoparametro.sendKeys("10000");
		
		sleep(2000);
		
		quantidade.sendKeys("100");
		
		sleep(2000);
		
		valorvenda.sendKeys("10000");
		
		sleep(2000);
		
		precopraticado.sendKeys("1000");
		
		String data = fechaActual();
		datainicial.sendKeys(data);
		
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
		
		
		idInserir("ValoresParaMetodoPVA",id2);
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
