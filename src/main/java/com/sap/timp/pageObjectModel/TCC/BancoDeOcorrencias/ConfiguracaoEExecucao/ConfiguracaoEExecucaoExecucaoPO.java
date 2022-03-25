package com.sap.timp.pageObjectModel.TCC.BancoDeOcorrencias.ConfiguracaoEExecucao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguracaoEExecucaoExecucaoPO extends TestBaseSteven {
	

	@FindBy(xpath = "//li[@identifier=\"accordion-item-boc\"]")
	public WebElement bancoOcorrencia;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-bocConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//*[@id=\"left-content\"]/div[2]/ul/li[9]/ul/li[2]/div/span[2]")
	public WebElement executados;


	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//input[@placeholder=\"Preencher Observação\"]")
	public WebElement campo;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button/span[2]")
	public WebElement executar;

	
	@FindBy(xpath = "//*[@id=\"subInput\"]/div/div[1]/span")
	public WebElement calendario;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[1]/div[1]")
	public WebElement atrasCalendario;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[3]/div[8]")
	public WebElement anio;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[2]/div[2]")
	public WebElement enero;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[1]/div/div[1]")
	public WebElement M1;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement btmExecutar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public ConfiguracaoEExecucaoExecucaoPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean executar() {
		String url = driver.getCurrentUrl();
		bancoOcorrencia.click();
		sleep(2000);
	
		
		executados.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		
		String id = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[2]/div")).getText();
		System.out.println("Id ultimo registro: " +id);
		
		configuracaoEExecucao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		String idRegistro = idObter("idBOConfiguracaoEExecucaco");
	
		siguiente.click();
	//	waitExpectXpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(28000);
	
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));

		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		waitExpectElement(executar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		executar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		calendario.click();
		sleep(4000);
		
		atrasCalendario.click();
		sleep(4000);
	
		anio.click();
		sleep(3000);
		
		enero.click();
		sleep(3000);
		
		M1.click();
		sleep(2000);
		
		btmExecutar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(17000);
		
		btnGravar.click();
		sleep(1000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(13000);
		
		biblioteca.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		bancoOcorrencia.click();
		sleep(2000);
		
		executados.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		rows = rows("//div[@class=\"tr\" and @data-id]");
		
		boolean sucesso = false;
		  
		String id2 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[2]/div")).getText();
		System.out.println("ID Ultimo Nuevo Registro Executados: " +id2);
		
		idInserir("idBOConfiguracaoEExecucacoExecutados",id2);
		
		int id1 = convertToInt(id);
		int id21 = convertToInt(id2);
		
		//compara pra ver se o novo id criado é realmente o ultimo		  
		if (id21 > id1) { 
			sucesso = true; 
			System.out.println("Registro creado...");
		}
		
		return sucesso;

	}

}
