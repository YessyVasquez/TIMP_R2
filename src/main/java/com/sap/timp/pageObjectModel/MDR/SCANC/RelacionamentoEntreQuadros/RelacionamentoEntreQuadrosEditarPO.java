package com.sap.timp.pageObjectModel.MDR.SCANC.RelacionamentoEntreQuadros;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RelacionamentoEntreQuadrosEditarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"Relacionamento entre Quadros\"]")
	public WebElement relacionamentoentrequadros;
	
	@FindBy(xpath = "//span[text()=\"Novo Relacionamento entre Quadros\"]")
	public WebElement novorelacionamento;
	
	@FindBy(xpath = "//div[@id=\"company-relationships\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement opcaoempresa;
	
	
	@FindBy(xpath = "//div[@id=\"tax-relationships\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id][text()=\"ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@id=\"tax-type-relationships\"]/div/div/div[2]")
	public WebElement tipodetributo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"operacao-relationships\"]/div/div/div[2]")
	public WebElement operacao;
	
	@FindBy(xpath = "//div[@id=\"annexe-relationships\"]/div/div/div[2]")
	public WebElement anexo;
	
	
	@FindBy(xpath = "//div[@id=\"square-relationships\"]/div/div/div[2]")
	public WebElement quadro;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data de Início de Vigência\"]")
	public WebElement datainicial;
	
	
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
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	
	
	public RelacionamentoEntreQuadrosEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean editar() {
		sleep(2000);
		scanc.click();
		sleep(2000);
		
		relacionamentoentrequadros.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("RelacionamentoEntreQuadros");
		
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
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		attributeToBeXpath("//div[@id=\"tax-type-relationships\"]/div", "class", "base-select required");
		sleep(2000);
		attributoNotToBeEmptyElement(datainicial, "value");
		String valor = datainicial.getAttribute("value");

		String enviar = fechaActual();
		System.out.println(enviar);
		
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
		
		
		attributeToBeXpath("//div[@id=\"tax-type-relationships\"]/div", "class", "base-select required");
		sleep(6000);
		
		waitExpectElement(datainicial);
		
		sleep(6000);
		String novoTexto=datainicial.getAttribute("value");
		
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);
		
	
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
