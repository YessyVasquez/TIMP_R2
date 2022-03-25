package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1060AmbientesDeTrablho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class S1060AmbientesDeTrablhoCriarPO extends TestBaseSteven{
	
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
	
	
	
	public S1060AmbientesDeTrablhoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		eventosesocial.click();
		sleep(2000);
		
		s106ambientesdetrabalho.click();
		
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
		
		sleep(2000);
		//criaçao
		novoambiente.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tipoderegistro.click();
		
		sleep(2000);
		
		opcaotipoderegistro.click();
		
		sleep(2000);
		numeroderegistro.sendKeys("997");
		
		
		sleep(2000);
		
		tipodeambiente.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		descricaodeambiente.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		String data=fechaActual();
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
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		idInserir("S1060AmbientesDeTrablho",id2);
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
