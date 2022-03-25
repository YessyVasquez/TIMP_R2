package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaCodigoDaSituaçaoTributariaExcluirPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"4.3.3 Tabela Código da Situação Tributária referente ao PIS/PASEP e COFINS\"]")
	public WebElement tabelacodigo;
	
	@FindBy(xpath = "//span[text()=\"Novo Código da Situação Tributária referente ao PIS/PASEP e COFINS\"]")
	public WebElement novocodigo;
	
	@FindBy(xpath = "//div[@id=\"select\" and @class=\"base-select-wrapper\"]/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Código CST\"]")
	public WebElement codigocst;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher a descrição do Código da Situação Tributária referente ao PIS/PASEP e COFINS\"]")
	public WebElement descricao;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
	public WebElement datadeiniciodevigencia;
	
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
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	public TabelaCodigoDaSituaçaoTributariaExcluirPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean excluir() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		
		tabelacodigo.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("tabelacodigodasituacaotributaria");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		excluir.click();
		sleep(2000);
		waitExpectElement(aceitar);
		aceitar.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		boolean sucesso = false;
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idinserido = idObter1();
		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
	
		if(idinserido != idultimo) {
			
			sucesso = true;
		}else {
			sucesso =false;
		}
		return sucesso;
	}
}
