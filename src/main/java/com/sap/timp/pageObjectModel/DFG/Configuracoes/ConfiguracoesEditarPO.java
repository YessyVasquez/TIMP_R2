package com.sap.timp.pageObjectModel.DFG.Configuracoes;

import java.rmi.server.Skeleton;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.ls.LSException;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguracoesEditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//div[@class=\"container-tabs\"]/div[2]")
	public WebElement configuracoes;
	
	@FindBy(xpath = "//div[@class=\"settingFolders-wrapper\"]/div/div[1]")
	public WebElement raiz2;
	
	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement filtrosAvanzados;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Pesquisar\")]")
	public WebElement procurar;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement no;
	
	
	@FindBy(xpath = "//div[@id=\"accordion\"]/div/div/div/div/div/input")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	
	

	public ConfiguracoesEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean editar() {
		

		waitExpectElement(configuracoes);
		sleep(1000);
		configuracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		raiz2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String id = idObter2();
		
		/*filtrosAvanzados.click();
		sleep(3000);*/
		waitExpectElement(filtrosAvanzados);
		sleep(2000);
		
		procurar.sendKeys(id);
		procurar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+id+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+id+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String valorAnterior = dataVigencia.getAttribute("value");
		dataVigencia.clear();
		String enviar = "02/01/2013";
		sleep(1000);
		dataVigencia.sendKeys(enviar);
		sleep(1000);
		
		salvar.click();
		
		sleep(3000);
		
		no.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(10000);
		
		raiz2.click();
		
		raiz2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(10000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		procurar.sendKeys(id);
		procurar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+id+"\"]/div[1]/div"));
		editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+id+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String valorNuevo = dataVigencia.getAttribute("value");
		
		System.out.println("Antes da Modificação: " +valorAnterior);
		System.out.println("Após a Modificação: " +valorNuevo);
		
		boolean sucesso = false;
		
		if (valorNuevo.equals(enviar)) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		System.out.println(sucesso);
		return sucesso;
		
	}
	
	
}
