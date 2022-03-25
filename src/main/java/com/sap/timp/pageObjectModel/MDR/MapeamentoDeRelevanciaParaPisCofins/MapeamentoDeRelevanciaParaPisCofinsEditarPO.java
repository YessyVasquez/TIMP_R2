package com.sap.timp.pageObjectModel.MDR.MapeamentoDeRelevanciaParaPisCofins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentoDeRelevanciaParaPisCofinsEditarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Mapeamento de Relevância para PIS/COFINS\"]")
	public WebElement mapeamentoderelevancia;
	
	@FindBy(xpath = "//span[text()=\"Novo Mapeamento de Relevância para PIS/COFINS\"]")
	public WebElement novomapeamentoderelevancia;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id][text()=\"PIS/COFINS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Relevância\"]")
	public WebElement relevancia;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código da Conta\"]")
	public WebElement codigoconta;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Data de Inicio de Vigência\"]")
	public WebElement dataincio;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Data de Fim de Vigência\"]")
	public WebElement datafinal;
	
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
	
	
	
	public MapeamentoDeRelevanciaParaPisCofinsEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		mapeamentoderelevancia.click();
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("MapeamentoDeRelevanciaParaPisCofins");

		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(4000);
		menu.click();
		sleep(2000);
		editar.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		String valor = codigoconta.getAttribute("value");

		String enviar = "12345";

		codigoconta.clear();
		sleep(2000);
		codigoconta.sendKeys(enviar);
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
			
		waitExpectElement(codigoconta);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String novoTexto=codigoconta.getAttribute("value");
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		codigoconta.clear();

		sleep(2000);
		codigoconta.sendKeys(valor);
		
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
