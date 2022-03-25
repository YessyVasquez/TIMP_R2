package com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas;


import java.net.URL;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class RelacionamentoEstruturasEditarPO extends TestBaseSteven{

					 
	@FindBy(xpath = "//span[text()=\"Relacionamentos de Estruturas\"]")
	public WebElement relacionamentoEstruturas;
	
	@FindBy(xpath = "//span[contains(text(),\"Nov\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"group1-select\"]/div/div/div[2]")
	public WebElement grupo1;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"][1]")
	public WebElement grupo1O;
	
	@FindBy(xpath = "//div[@class=\"structure1-select\"]/div/div/div[2]")
	public WebElement estrutura1;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"][1]")
	public WebElement estrutura1O;
	
	@FindBy(xpath = "//div[@class=\"field-wrapper field1\"]/div/div[2]")
	public WebElement campoEstrutura1;
	
	@FindBy(xpath = "//li[text()=\"Código da filial\"][1]")
	public WebElement campoEstrutura1O;
	
	
	
	//segunda
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//div[@class=\"group2-select\"]/div/div/div[2]")
	public WebElement grupo2;

	@FindBy(xpath = "//li[text()=\"Empresa/Filial 1\"][1]")
	public WebElement grupo2OTQ1;
	
	@FindBy(xpath = "//li[text()=\"Empresa Filial\"][1]")
	public WebElement grupo2O;
	
	@FindBy(xpath = "//div[@class=\"structure2-select\"]/div/div/div[2]")
	public WebElement estrutura2;
	
	@FindBy(xpath = "//li[text()=\"Dados de Empresa/Filial\"][1]")
	public WebElement estrutura2O;
	
	@FindBy(xpath = "//div[@class=\"field-wrapper field2\"]/div/div[2]")
	public WebElement campoEstrutura2;
	
	@FindBy(xpath = "//li[text()=\"Código da filial\"][1]")
	public WebElement campoEstrutura2O;
	
	
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
	
	public RelacionamentoEstruturasEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> editar() {
		
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
		
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div"));
	
		menu.click();
		sleep(2000);
		
		WebElement acao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div/div/ul/li/span[text()=\"Editar\"]"));
		acao.click();
		
		sleep(100000);
		sleep(34000);
		adicionar.click();
		sleep(2000);
		
		campoEstruturaE.click();
		sleep(1000);
		campoEstruturaO.click();
		sleep(1000);
		
		campoEstruturaE2.click();
		sleep(1000);
		campoEstruturaO.click();
		sleep(1000);
		
		dataVigencia.clear();
		dataVigencia.sendKeys("02/01/1977");
		sleep(1000);
		
		dataFim.clear();
		dataFim.sendKeys("31/12/1978");
		sleep(1000);
		
		gravar.click();
		
		sleep(7000);
		
		relacionamentoEstruturas.click();
		
		sleep(7000);
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div"));
		acao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div/div/ul/li/span[text()=\"Editar\"]"));
		
		
		menu.click();
		sleep(1000);
		acao.click();
		
		sleep(2000);
	//	waitExpectElement(grupo1);
	//	invisibilityOfElementOverlay();
		sleep(100000);
		sleep(80000);
		System.out.println("---------------------------Verificação das Informações-------------------------------------------");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		String campoEstrutura1S = campoEstruturaI1.getAttribute("value");
		String campoEstrutura2S = campoEstruturaI2.getAttribute("value");
		String dataVigenciaS = dataVigencia.getAttribute("value");
		String dataFimS = dataFim.getAttribute("value");
		
		System.out.println(campoEstrutura1S);
		System.out.println(campoEstrutura2S);
		System.out.println(dataVigenciaS);
		System.out.println(dataFimS);
		
		sucesso.add(campoEstrutura1S.equals("Código da empresa"));
		sucesso.add(campoEstrutura2S.equals("Código da empresa"));
		sucesso.add(dataVigenciaS.equals("02/01/1977"));
		sucesso.add(dataFimS.equals("31/12/1978"));
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
		
	}
	
	
	
	
	
}
