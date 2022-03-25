package com.sap.timp.pageObjectModel.MDR.Siscoserv.PaisMoeda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class PaisMoedaEditarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Siscoserv\"]")
	public WebElement siscoserv;
	
	@FindBy(xpath = "//span[text()=\"País/Moeda\"]")
	public WebElement paismoeda;
	
	@FindBy(xpath = "//span[text()=\"Novo Configuração de Pais/Moeda\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"country\"]/div/div[2]")
	public WebElement pais;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	
	@FindBy(xpath = "//div[@id=\"coin\"]/div/div[2]")
	public WebElement moeda;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Código de País\"]")
	public WebElement codigodepais;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Código de Moeda\"]")
	public WebElement codigodemoeda;
	
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
	
	public PaisMoedaEditarPO() {

		PageFactory.initElements(driver, this);
	}

	
	public boolean editar() {
		sleep(2000);
		siscoserv.click();
		sleep(2000);
		
		paismoeda.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("PaisMoeda");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		
		attributeToBeXpath("//div[@id=\"country\"]/div", "class", "base-autocomplete required");
		sleep(3000);
		
		//attributoNotToBeEmptyXpath("//input[@placeholder=\"Selecionar Código de País\"]", "value");
		//sleep(2000);
		
		
		String valor = codigodepais.getAttribute("value");

		String enviar = "888";

		codigodepais.clear();
		sleep(2000);
		codigodepais.sendKeys(enviar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(mensagem);
		sleep(2000);

		driver.navigate().refresh();
		
		
		attributeToBeXpath("//div[@id=\"country\"]/div", "class", "base-autocomplete required");
		sleep(3000);
			
		//attributoNotToBeEmptyXpath("//input[@placeholder=\"Selecionar Código de País\"]", "value");
		//sleep(2000);

		String novoTexto=codigodepais.getAttribute("value");
		
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);
		
		codigodepais.clear();

		sleep(2000);
		codigodepais.sendKeys(valor);
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		waitExpectElement(mensagem);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		return sucesso;
	}	

}
