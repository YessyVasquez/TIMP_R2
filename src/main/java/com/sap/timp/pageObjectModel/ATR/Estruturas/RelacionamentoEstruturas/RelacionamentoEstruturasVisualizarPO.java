package com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas;


import java.net.URL;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class RelacionamentoEstruturasVisualizarPO extends TestBaseSteven{

					 
	@FindBy(xpath = "//span[text()=\"Relacionamentos de Estruturas\"]")
	public WebElement relacionamentoEstruturas;
	
	@FindBy(xpath = "//span[contains(text(),\"Nov\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	//Primero
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Grupo 1\"]")
	public WebElement grupo1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Estrutura 1\"]")
	public WebElement estrutura1;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][1]/div/div[1]/div/div[1]/input")
	public WebElement campoEstrutura11;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][2]/div/div[1]/div/div[1]/input")
	public WebElement campoEstrutura12;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][3]/div/div[1]/div/div[1]/input")
	public WebElement campoEstrutura13;
	
	
	
	
	//segunda
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//input[@placeholder=\"Selecione Grupo 2\"]")
	public WebElement grupo2;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Estrutura 2\"]")
	public WebElement estrutura2;
	

	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][1]/div/div[2]/div/div[1]/input")
	public WebElement campoEstrutura21;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][2]/div/div[2]/div/div[1]/input")
	public WebElement campoEstrutura22;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][3]/div/div[2]/div/div[1]/input")
	public WebElement campoEstrutura23;
	
	
	
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][3]/div/div[1]/div/div[2]")
	public WebElement campoEstruturaE;
	
	@FindBy(xpath = "//li[text()=\"Código da empresa\"]")
	public WebElement campoEstruturaO;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][3]/div/div[2]/div/div[2]")
	public WebElement campoEstruturaE2;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][3]/div/div[1]/div/div[1]/input")
	public WebElement campoEstruturaI1;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][3]/div/div[2]/div/div[1]/input")
	public WebElement campoEstruturaI2;
	

	
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][2]/div/div[@id=\"add-icon\"]")
	public WebElement adicionar;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Fim\")]")
	public WebElement dataFim;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	public RelacionamentoEstruturasVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> visualizar() {
		
		String idRegistro = idObter("RelacionamentoEstruturasCriar");
		
		String url = driver.getCurrentUrl();
		
		boolean tq1 = false;
		
		if (url.contains("tq1")) {
			tq1 = true;
		}
		
		relacionamentoEstruturas.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div/div/ul/li/span[text()=\"Ver\"]"));
		
		
		menu.click();
		sleep(1000);
		acao.click();
		
		sleep(100000);
		sleep(100000);
		sleep(100000);
		waitExpectElement(grupo1);
//		invisibilityOfElementOverlay();
		
		String grupo1V = grupo1.getAttribute("value");
		String estrutura1V = estrutura1.getAttribute("value");
		String campoEstrutura11V = campoEstrutura11.getAttribute("value");
		String campoEstrutura12V = campoEstrutura12.getAttribute("value");
	//	String campoEstrutura13V = campoEstrutura13.getAttribute("value");
		String campoEstrutura21V = campoEstrutura21.getAttribute("value");
		String campoEstrutura22V = campoEstrutura22.getAttribute("value");
	//	String campoEstrutura23V = campoEstrutura23.getAttribute("value");
		String dataVigencia1V = dataVigencia.getAttribute("value");
		String dataFim1V = dataFim.getAttribute("value");
		
		System.out.println("--------Datos da Visualização-----------");
		System.out.println(grupo1V);
		System.out.println(estrutura1V);
		System.out.println(campoEstrutura11V);
		System.out.println(campoEstrutura12V);
		//System.out.println(campoEstrutura13V);
		System.out.println(campoEstrutura21V);
		System.out.println(campoEstrutura22V);
	//	System.out.println(campoEstrutura23V);
		System.out.println(dataVigencia1V);
		System.out.println(dataFim1V);
		
		aceitar.click();
		
		invisibilityOfElementOverlay();
		
		
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div"));
		acao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div/div/ul/li/span[text()=\"Editar\"]"));
		
		
		menu.click();
		sleep(1000);
		acao.click();
		
		sleep(180000);
	
		waitExpectElement(grupo1);
	//	invisibilityOfElementOverlay();

		
		System.out.println("---------------------------Datos Editar-------------------------------------------");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		String grupo1E = grupo1.getAttribute("value");
		String estrutura1E = estrutura1.getAttribute("value");
		String campoEstrutura11E = campoEstrutura11.getAttribute("value");
		String campoEstrutura12E = campoEstrutura12.getAttribute("value");
	//	String campoEstrutura13E = campoEstrutura13.getAttribute("value");
		String campoEstrutura21E = campoEstrutura21.getAttribute("value");
		String campoEstrutura22E = campoEstrutura22.getAttribute("value");
	//	String campoEstrutura23E = campoEstrutura23.getAttribute("value");
		String dataVigencia1E = dataVigencia.getAttribute("value");
		String dataFim1E = dataFim.getAttribute("value");
		
		System.out.println("--------Datos da Visualização-----------");
		System.out.println(grupo1E);
		System.out.println(estrutura1E);
		System.out.println(campoEstrutura11E);
		System.out.println(campoEstrutura12E);
	//	System.out.println(campoEstrutura13E);
		System.out.println(campoEstrutura21E);
		System.out.println(campoEstrutura22E);
	//	System.out.println(campoEstrutura23E);
		System.out.println(dataVigencia1E);
		System.out.println(dataFim1E);
		
		
		sucesso.add(grupo1V.equals(grupo1E));
		sucesso.add(estrutura1V.equals(estrutura1E));
		sucesso.add(campoEstrutura11V.equals(campoEstrutura11E));
		sucesso.add(campoEstrutura12V.equals(campoEstrutura12E));
	//	sucesso.add(campoEstrutura13V.equals(campoEstrutura13E));
		sucesso.add(campoEstrutura21V.equals(campoEstrutura21E));
		sucesso.add(campoEstrutura22V.equals(campoEstrutura22E));
	//	sucesso.add(campoEstrutura23V.equals(campoEstrutura23E));
		sucesso.add(dataVigencia1V.equals(dataVigencia1E));
		sucesso.add(dataFim1V.equals(dataFim1E));

		
		System.out.println(sucesso);
		
		return sucesso;
		
		
	}
	
	
	
	
	
}
