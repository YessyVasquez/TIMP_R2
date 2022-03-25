package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1060AmbientesDeTrablho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class S1060AmbientesDeTrablhoEditarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Eventos e-Social\"]")
	public WebElement eventosesocial;
	
	@FindBy(xpath = "//span[text()=\"S1060 - Ambientes de Trabalho\"]")
	public WebElement s106ambientesdetrabalho;
	
	@FindBy(xpath = "//span[text()=\"Novo Ambiente de Trabalho\"]")
	public WebElement novoambiente;
	
	@FindBy(xpath = "//div[@id=\"registerType\"]/div/div/div/div[2]")
	public WebElement tipoderegistro;
	
	@FindBy(xpath = "//div[@id=\"option-2\"]/div")
	public WebElement opcaotipoderegistro;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Numero de Registro\"]")
	public WebElement numeroderegistro;
	
	@FindBy(xpath = "//div[@id=\"environmentType\"]/div/div/div/div[2]")
	public WebElement tipodeambiente;
	
	@FindBy(xpath = "//div[@id=\"option-1\"]/div")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"environmentDescription\"]/div/div/div/div[2]")
	public WebElement descricaodeambiente;

	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
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
	
	
	
	public S1060AmbientesDeTrablhoEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		eventosesocial.click();
		sleep(2000);
		
		s106ambientesdetrabalho.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("S1060AmbientesDeTrablho");
		
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
		
		String valor = numeroderegistro.getAttribute("value");

		String enviar = "888";

		numeroderegistro.clear();
		sleep(2000);
		numeroderegistro.sendKeys(enviar);
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
			
		waitExpectElement(numeroderegistro);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String novoTexto=numeroderegistro.getAttribute("value");
		
		System.out.println(valor);
		System.out.println(novoTexto);
		boolean sucesso = novoTexto.equals(enviar);
		System.out.println(sucesso);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		numeroderegistro.clear();

		sleep(2000);
		numeroderegistro.sendKeys(valor);
		
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
