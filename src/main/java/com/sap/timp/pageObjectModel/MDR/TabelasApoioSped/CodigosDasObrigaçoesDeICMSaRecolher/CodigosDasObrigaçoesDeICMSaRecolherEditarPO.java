package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigosDasObrigaçoesDeICMSaRecolher;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigosDasObrigaçoesDeICMSaRecolherEditarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"5.4 Códigos das Obrigações de ICMS a Recolher\"]")
	public WebElement codigosdasobrigaçoesdeicmsarecolher;
	
	@FindBy(xpath = "//span[text()=\"Novo Código de Obrigações de ICMS a Recolher\"]")
	public WebElement novocodigodeobrigaçoes;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Código de Obrigações de ICMS\"]")
	public WebElement codigodeobrigaçoesdeicms;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher a descrição do Código das Obrigações de ICMS a Recolher\"]")
	public WebElement descricao;
	

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
	
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy (xpath = "//span[@id=\"descricao\" and @class=\"infoField\"]")
	public WebElement campo;
	
	public CodigosDasObrigaçoesDeICMSaRecolherEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		
		codigosdasobrigaçoesdeicmsarecolher.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("codigosdasobrigacoesdeicmsarecolher");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//ediçao
		attributeToBeXpath("//div[@class=\"base-input  required type4 success\"]", "class", "base-input  required type4 success");
		sleep(2000);
		String descriçao = "Teste";
		
		descricao.clear();
		
		sleep(2000);
		
		descricao.sendKeys(descriçao);
		
		
		
		sleep(2000);
		gravar.click();
		sleep(2000);
	
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		sleep(2000);
		
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 =idObter("codigosdasobrigacoesdeicmsarecolher");;
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement Editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		Editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		//String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		
		boolean sucesso = descriçao.contains(descricao.getAttribute("value"));
		System.out.println(sucesso);	
		return sucesso;
		
	}
	
	

}
