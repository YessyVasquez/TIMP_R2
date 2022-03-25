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

public class ParametrosGeraisCriarRaizIDPúblicoPrivadoEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz;

	@FindBy(xpath = "//div[@class=\"actions\"]")
	public WebElement menu;

	@FindBy(xpath = "//span[text()=\"Editar\"]")
	public WebElement editar;

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

	

	public ParametrosGeraisCriarRaizIDPúblicoPrivadoEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean editar() {
		
		leiautePublico.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys(idObter1());
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		
		sleep(3000);
		waitExpectElement(bloco);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		bloco.click();
		sleep(2000);
		nome.sendKeys("Teste Automatizado");
		sleep(1000);
		
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		
		sleep(3000);
		waitExpectElement(bloco);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		int blocoM = driver.findElements(By.xpath("//div[@class=\"block-wrapper\"]")).size();
		boolean sucesso = false;
		
		if (blocoM > 0) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		
		return sucesso;
		
	}
	
	
}
