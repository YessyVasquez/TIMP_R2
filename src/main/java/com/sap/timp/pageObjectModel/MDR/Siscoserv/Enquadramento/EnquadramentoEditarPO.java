package com.sap.timp.pageObjectModel.MDR.Siscoserv.Enquadramento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class EnquadramentoEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Siscoserv\"]")
	public WebElement siscoserv;
	
	@FindBy(xpath = "//span[text()=\"Enquadramento\"]")
	public WebElement enquadramento;
	
	@FindBy(xpath = "//span[text()=\"Novo Configuração de Enquadramento\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código de Enquadramento\"]")
	public WebElement codigodeenquadramento;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"nbsCode\"]/div/div[2]")
	public WebElement codigonbs;
	
	@FindBy(xpath = "//div[@id=\"indicator\"]/div/div/div[2]")
	public WebElement indicatorrc;
	
	@FindBy(xpath = "//div[@id=\"salesModule\"]/div/div/div[2]")
	public WebElement modulovenda;
	
	@FindBy(xpath = "//div[@id=\"acquisitionModule\"]/div/div/div[2]")
	public WebElement moduloaquisicao;
	
	
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
	
	public EnquadramentoEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		siscoserv.click();
		sleep(2000);
		
		enquadramento.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("Enquadramento");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		
		sleep(2000);
		waitExpectElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		String valor = codigodeenquadramento.getAttribute("value");

		String enviar = "8";

		codigodeenquadramento.clear();
		sleep(2000);
		codigodeenquadramento.sendKeys(enviar);
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		
		waitExpectElement(mensagem);
		sleep(2000);

		driver.navigate().refresh();
		sleep(2000);
		waitExpectElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String novoTexto=codigodeenquadramento.getAttribute("value");
		
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		codigodeenquadramento.clear();

		sleep(2000);
		codigodeenquadramento.sendKeys(valor);
		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		waitExpectElement(mensagem);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		System.out.println(sucesso);
		
		return sucesso;
	}	

}
