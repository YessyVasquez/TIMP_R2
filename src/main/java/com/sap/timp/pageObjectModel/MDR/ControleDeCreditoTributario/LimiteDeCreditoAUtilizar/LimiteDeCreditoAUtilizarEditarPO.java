package com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.LimiteDeCreditoAUtilizar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class LimiteDeCreditoAUtilizarEditarPO extends TestBaseSteven{

	@FindBy(xpath = "//span[text()=\"Controle de Crédito Tributário\"]")
	public WebElement controledecreditotributario;
	
	@FindBy(xpath = "//span[text()=\"Limite de Crédito a Utilizar\"]")
	public WebElement limitedecreditoautilizar;
	
	@FindBy(xpath = "//span[text()=\"Novo Limite de Crédito a Utilizar\"]")
	public WebElement novolimitedecreditoautilizar;
	
	@FindBy(xpath = "//div[@class=\"field\" and @id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoempresa;
	

	@FindBy(xpath = "//div[@class=\"field\" and @id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//div[@class=\"field\" and @id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Limite de Utilização do Crédito\"]")
	public WebElement limitedeutilizacaodecredito;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement dataincial;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public LimiteDeCreditoAUtilizarEditarPO() {

		PageFactory.initElements(driver, this);
	}
		
	public boolean editar() {
		sleep(2000);
		controledecreditotributario.click();
		sleep(2000);
		
		limitedecreditoautilizar.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("LimiteDeCreditoAUtilizar");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);

		String valor = limitedeutilizacaodecredito.getAttribute("value");

		String enviar = "8";

		limitedeutilizacaodecredito.clear();
		sleep(2000);
		limitedeutilizacaodecredito.sendKeys(enviar);
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
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
			
		waitExpectElement(limitedeutilizacaodecredito);
		
		sleep(8000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String novoTexto=limitedeutilizacaodecredito.getAttribute("value");
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		limitedeutilizacaodecredito.clear();

		sleep(2000);
		limitedeutilizacaodecredito.sendKeys(valor);
		
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
