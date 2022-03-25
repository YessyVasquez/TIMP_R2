package com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ValoresParaMetodoPVVEditarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Preço de Transferência\"]")
	public WebElement precodetransferencia;
	
	@FindBy(xpath = "//span[text()=\" Valores para Métodos\"]")
	public WebElement valoresparametodos;
	
	@FindBy(xpath = "//span[text()=\" Valores para Método PVV\"]")
	public WebElement valorespvv;
	
	@FindBy(xpath = "//span[text()=\"Novo  Valores para Método PVV\"]")
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
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Preço Vendas Merc Varejista Ext para PVV\"]")
	public WebElement preco;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Tributos Incluídos\"]")
	public WebElement tributos;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Margem de Lucro\"]")
	public WebElement margemdelucro;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Preço Parâmetro\"]")
	public WebElement precoparametro;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Quantidade Vendida\"]")
	public WebElement quantidadevendida;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Valor Venda Unitária\"]")
	public WebElement valorvenda;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Preço Praticado\"]")
	public WebElement precopraticado;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Data Inicial\"]")
	public WebElement datainicial;
	

	
	public ValoresParaMetodoPVVEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {

		sleep(2000);
		precodetransferencia.click();
		sleep(2000);
		
		valoresparametodos.click();
		
		sleep(2000);
		
		valorespvv.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ValoresParaMetodoPVV");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valor = datainicial.getAttribute("value");

		String enviar = fechaAyer();

		datainicial.clear();
		sleep(2000);
		datainicial.sendKeys(enviar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		

		driver.navigate().refresh();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(datainicial);
		sleep(20000);
		
		String novoTexto=datainicial.getAttribute("value");
		
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		datainicial.clear();

		sleep(2000);
		datainicial.sendKeys(valor);
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		return sucesso;
	}	

}
