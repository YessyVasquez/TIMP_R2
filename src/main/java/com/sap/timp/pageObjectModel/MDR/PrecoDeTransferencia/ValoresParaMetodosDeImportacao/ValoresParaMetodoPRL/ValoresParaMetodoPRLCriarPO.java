package com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodosDeImportacao.ValoresParaMetodoPRL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ValoresParaMetodoPRLCriarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Preço de Transferência\"]")
	public WebElement precodetransferencia;
	
	@FindBy(xpath = "//span[text()=\" Valores para Métodos de Importação\"]")
	public WebElement valoresparametodosdeimportacao;
	
	@FindBy(xpath = "//span[text()=\" Valores para Método PRL\"]")
	public WebElement valoresprl;
	
	@FindBy(xpath = "//span[text()=\"Novo  Valores para Método PRL\"]")
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
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Quantidade Importada\"]")
	public WebElement quantidadeimportada;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Qtde Venda p/ Vinculada\"]")
	public WebElement qtdevendavinculada;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Qtde Venda p/ NV\"]")
	public WebElement qtdevendanv;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Qtde Venda p/ Exportação\"]")
	public WebElement qtdevendaexportacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Qtde Total Vendas\"]")
	public WebElement qtdetotalvendas;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Preço Revenda Médio\"]")
	public WebElement precorevendamedio;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Descontos Incondicionais\"]")
	public WebElement descontos;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  ICMS s/ Vendas\"]")
	public WebElement icms;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  PIS s/ Vendas\"]")
	public WebElement pis;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  COFINS s/ Vendas\"]")
	public WebElement cofins;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Juros Vendas a Prazo\"]")
	public WebElement jurosvendas;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Despesas c/ Comissões\"]")
	public WebElement despesas;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Tipo Margem Lucro\"]")
	public WebElement tipomargem;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Preço Praticado\"]")
	public WebElement precopraticado;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Data Inicial\"]")
	public WebElement datainicial;
	
	
	@FindBy(xpath = "//button[@id=\"add-materials\"]")
	public WebElement addmateriais;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	
	public ValoresParaMetodoPRLCriarPO() {

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
		
		valoresparametodosdeimportacao.click();
		
		sleep(2000);
		
		valoresprl.click();
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
		descricao.sendKeys("BCF-23");
		}else if(tp1 == true) {
		descricao.sendKeys("BCF-23");
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
		
		quantidadeimportada.sendKeys("10000");
		
		sleep(2000);
		
		qtdevendavinculada.sendKeys("1000");
		
		sleep(2000);
		
		qtdevendanv.sendKeys("1000");
		
		sleep(2000);
		
		qtdevendaexportacao.sendKeys("1000");
		
		sleep(2000);
		
		qtdetotalvendas.sendKeys("10000");
		
		sleep(2000);
		
		precorevendamedio.sendKeys("10000");
		
		sleep(2000);
		
		descontos.sendKeys("10000");
		
		sleep(2000);
		
		icms.sendKeys("1000");
		
		sleep(2000);
		
		pis.sendKeys("10000");
		
		sleep(2000);
		
		cofins.sendKeys("10000");
		
		sleep(2000);
		
		jurosvendas.sendKeys("10000");
		
		sleep(2000);
		
		despesas.sendKeys("1000");
		
		sleep(2000);
		
		tipomargem.sendKeys("100");
		
		sleep(2000);
		
		precopraticado.sendKeys("10000");
		
		sleep(2000);
		
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
		
		
		idInserir("ValoresParaMetodoPRL",id2);
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
