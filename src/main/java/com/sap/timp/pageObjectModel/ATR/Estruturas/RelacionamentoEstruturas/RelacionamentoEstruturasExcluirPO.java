package com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas;


import java.net.URL;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class RelacionamentoEstruturasExcluirPO extends TestBaseSteven{

					 
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
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	
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
	

	
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][3]/div/div[@id=\"delete-icon\"]")
	public WebElement excluir;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Fim\")]")
	public WebElement dataFim;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	public RelacionamentoEstruturasExcluirPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean excluir() {
		
		String idRegistro = idObter("RelacionamentoEstruturasCriar");
		
		relacionamentoEstruturas.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]/div/div/div/ul/li/span[text()=\"Excluir\"]"));
		
		
		menu.click();
		sleep(1000);
		acao.click();
		
		System.out.println("---------------------------Exclução do Registro-------------------------------------------");
		
		sleep(2000);
		waitExpectElement(aceitar);
		sleep(1000);
		aceitar.click();
		invisibilityOfElementOverlay();

		relacionamentoEstruturas.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
        int rows = rows("//div[@class=\"tr\" and @data-id=\""+idRegistro+"\"]");
		System.out.println(rows);
		
		boolean sucesso = false;
		
		if (rows == 0) {
			sucesso = true;
		} else {
			sucesso = false;
		}
		
		System.out.println("Registro Eliminado Com Sucesso: "+sucesso);
		return sucesso;
		
	}
	
	
	
	
	
}
