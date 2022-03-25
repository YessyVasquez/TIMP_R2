package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.DeParaLivroApuraçaoXSpedFiscal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DeParaLivroApuraçaoXSpedFiscalEditarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"DE-PARA Livro Apuração X SPED-Fiscal\"]")
	public WebElement livroapuracao;
	
	@FindBy(xpath = "//span[text()=\"Novo DE-PARA Livro Apuração X SPED-Fiscal\"]")
	public WebElement novolivroapuracao;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"tribute\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id][text()=\"ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"tipoTributo\"]/div/div/div[2]")
	public WebElement tipotributo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaotipotributo;
	
	@FindBy(xpath = "//div[@class=\"element\" and @id=\"line\"]/div/div/div[2]")
	public WebElement linha;

	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaolinha;
	

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Início de Vigência \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy (xpath = "//span[@id=\"dataIniVigencia\"]")
	public WebElement campo;
	
	public DeParaLivroApuraçaoXSpedFiscalEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		
		livroapuracao.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("deparalivroapuracaoxspedfiscal");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(19000);
		
		//ediçao
		//attributeToBeXpath("//div[@class=\"element\" and @id=\"tipoTributo\"]/div", "class", "base-select required");
		sleep(2000);
		tipotributo.click();
		sleep(3000);
		opcaotipotributo.click();
		sleep(2000);
		String data = "21/08/2020";
		
		datavigencia.clear();
		sleep(2000);
		datavigencia.sendKeys(data);
		 
		sleep(2000);
		gravar.click();
		sleep(2000);
	
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 =  idObter("deparalivroapuracaoxspedfiscal");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar1.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(8000);

		
		
		boolean sucesso = data.contains(datavigencia.getAttribute("value"));
		System.out.println(sucesso);	
		return sucesso;
		
	}
	

}
