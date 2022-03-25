package com.sap.timp.pageObjectModel.DFG.Leiautes;

import java.rmi.server.Skeleton;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParametrosGeraisCriarRaizIDPúblicoPrivadoVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz;

	@FindBy(xpath = "//div[@class=\"actions\"]")
	public WebElement menu;

	@FindBy(xpath = "//span[text()=\"Editar\"]")
	public WebElement editar;
	
	@FindBy(xpath = "//span[text()=\"Visualizar\"]")
	public WebElement visualizar;

	@FindBy(xpath = "//span[text()=\"Adicionar bloco\"]")
	public WebElement bloco;

	@FindBy(xpath = "//input[contains(@placeholder,\"Nome\")]")
	public WebElement nome;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-public-layout\"]")
	public WebElement leiautePublico;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	

	public ParametrosGeraisCriarRaizIDPúblicoPrivadoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean visualizar() {
		
		leiautePublico.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys(idObter1());
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		
		sleep(3000);
		waitExpectElement(bloco);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	
		String nomeE = nome.getAttribute("value");
		System.out.println("Nome Editar: " + nomeE);
		sleep(1000);
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys(idObter1());
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String nomeV = nome.getAttribute("value");
		System.out.println("Nome Visualizar: " + nomeV);
		
		boolean sucesso = false;
		
		sucesso = nomeV.contains(nomeE);
		System.out.println(sucesso);
		return sucesso;
		
	}
	
	
}
