package com.sap.timp.pageObjectModel.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseMassiel;

public class ConfiguraçãDeTipoTaxaDeAtualizaçãoCriarPO extends TestBaseMassiel{		
	@FindBy(xpath = "//li[@identifier=\"accordion-item-updateRates\"]")
	public WebElement taxasDeActualizacao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-updateRateConfiguration\"]")
	public WebElement configuracaoDeTipoTaxa;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//span[text()=\"Novo Configuração de Tipo Taxa de Atualização\"]")
	public WebElement btnNovoConfiguracao;
	
	@FindBy(xpath = "//div[contains(@class, \"indexCode\")]/div/div[2]/div/div/div[2]/input")
	public WebElement codigoNoIndice;
	
	@FindBy(xpath = "//div[contains(@class, \"indexName\")]/div/div[2]/div/div/div[2]/input")
	public WebElement nomeDoIndice;
	
	@FindBy(xpath = "//div[contains(@class, \"indexDescription\")]/div/div[2]/div/div/div[2]/input")
	public WebElement descricaoDoIndice;
	
	@FindBy(xpath = "//div[contains(@class, \"indexType\")]/div/div[2]/div/div/div[2]/input")
	public WebElement tipoIndice;
	
	@FindBy(xpath = "//div[contains(@class, \"coinIndex\")]/div/div[2]/div/div/div[2]/input")
	public WebElement moedaIndice;
	
	@FindBy(xpath = "//div[contains(@class, \"indexStartDate\")]/div/div/input")
	public WebElement dataInicioVigencia;
	
	@FindBy(xpath = "//div[contains(@class, \"indexEndDate \")]/div/div/input")
	public WebElement dataFimVigencia;
	
	public ConfiguraçãDeTipoTaxaDeAtualizaçãoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		taxasDeActualizacao.click();
		
		sleep(1000);
		configuracaoDeTipoTaxa.click();
		
		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//conta o numero de linhas	
		
			
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(idRegistro);		
		
		btnNovoConfiguracao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		codigoNoIndice.click();
		sleep(1000);
		codigoNoIndice.sendKeys("555001");
		sleep(2000);
		
		nomeDoIndice.click();
		sleep(1000);
		nomeDoIndice.sendKeys("Tester5");
		sleep(2000);
		
		descricaoDoIndice.click();
		sleep(1000);
		descricaoDoIndice.sendKeys("Automatizacao tester5");
		sleep(2000);
		
		tipoIndice.click();
		sleep(1000);
		tipoIndice.sendKeys("1");
		sleep(2000);
		
		moedaIndice.click();
		sleep(1000);
		moedaIndice.sendKeys("Lps");
		sleep(2000);
		
		dataInicioVigencia.click();
		sleep(1000);
		dataInicioVigencia.sendKeys(fechaActual());
		sleep(2000);
		
		dataFimVigencia.click();
		sleep(1000);
		dataFimVigencia.sendKeys(fechaActual());
		sleep(2000);
		
		btnGravar.click();
		sleep(2000);
		
		waitExpectElement(btnSim);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);		
		btnBiblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = false;
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[3]/div")).getText();
		  
		
		idInserir("configuracaodetipotaxadeatualizacao", idB);
		  
		sleep(2000); 
		System.out.println(idRegistro); 
		System.out.println(idB);
		  
		double idD = Integer.valueOf(idRegistro); 
		double idBD = Integer.valueOf(idB);
		  
		//compara pra ver se o novo id criado é realmente o ultimo
		  
		if (idBD > idD) { 
			sucesso = true; 
		}else { 
			sucesso = false; 
		}
		  
		return sucesso;		
	}
	

}
