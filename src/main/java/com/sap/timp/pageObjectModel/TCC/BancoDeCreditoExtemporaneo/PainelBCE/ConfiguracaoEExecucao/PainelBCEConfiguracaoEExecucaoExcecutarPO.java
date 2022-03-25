package com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.PainelBCE.ConfiguracaoEExecucao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseKenssy;

public class PainelBCEConfiguracaoEExecucaoExcecutarPO extends TestBaseKenssy {
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bce\"]")
	public WebElement bancoCreditoExtemporaneo;

	@FindBy(xpath = "//span[text()=\"Painel BCE\"]")
	public WebElement painelbce;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bcePanelConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement ultimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Executar\"]")
	public WebElement Executar;
	
	@FindBy(xpath = "//td[@id=\"companyInput\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//td[@id=\"stateInput\"]/div/div/div[2]")
	public WebElement estado;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[2]")
	public WebElement opcaoestado;
	
	@FindBy(xpath = "//td[@id=\"subInput\"]/div/div/span")
	public WebElement subperiodo;
	
	@FindBy(xpath = "//li[@id][text()=\"ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@id=\"layout\"]/div/div[2]")
	public WebElement leiaute;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoleiaute;
	
	@FindBy(xpath = "//div[@id=\"component\"]/div/div/div[2]")
	public WebElement componente;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaocomponente;
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\"title-wrapper\"]/div[@class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]")
	public WebElement arinicio;
	
	@FindBy(xpath = "//button[text()=\"Executar\"]")
	public WebElement executar1;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bcePanelExecution\"]")
	public WebElement executados;
	String URL = driver.getCurrentUrl();
	
	public PainelBCEConfiguracaoEExecucaoExcecutarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean executar() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		bancoCreditoExtemporaneo.click();
		sleep(2000);
		painelbce.click();
		sleep(2000);
		executados.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idexecutado = "0"; // Ultimo ID antes de crear un registro
		
		if(rows > 0) {
			idexecutado = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
			System.out.println("ID Ultimo Registro: " + idexecutado);
		}
		
//		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
//		//ultimo idexecutado
//		String idexecutado = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
//		System.out.println("ID Ultimo Registro em Executados: " + idexecutado);
		
		configuracaoEExecucao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//String idRegistro = idObter1();
		String idRegistro = idObter("idBCEPainelBCEConfiguracaoEExecucaco");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement executar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		executar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		Executar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(empresa);
		empresa.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		estado.click();
		sleep(1000);
		opcaoestado.click();
		closeSelectTypeCheckbox(estado);
		sleep(1000);
		
		subperiodo.click();
		sleep(1000);
		
		int element2018 = driver.findElements(By.xpath("//div[@class=\"content-wrapper\"]/div[3]/div[text()=\"2016\"]")).size();
		
		sleep(2000);
		
		if(element2018 == 0) {
			arinicio.click();
			sleep(2000);
		}		
		WebElement ano2016=  driver.findElement(By.xpath("//div[@class=\"content-wrapper\"]/div[3]/div[text()=\"2016\"]"));
		ano2016.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement mes2016 =  driver.findElement(By.xpath("//div[@class=\"content-wrapper\"]/div[2]/div[text()=\"Jan\"]"));
		mes2016.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		WebElement m1 =  driver.findElement(By.xpath("//div[@class=\"content-wrapper\"]/div/div/div[1]"));
		m1.click();
		
		executar1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Gravar.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(executados);
		sleep(3000);
	
		sleep(4000);
		executados.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		 rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		
		String idRegistronovo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
			System.out.println("ID Ultimo Registro despues de crear: " + idRegistronovo);
			idInserir("idBCEPainelBCEConfiguracaoEExecucacoExecutados",idRegistronovo);
		//idInserir2(idRegistronovo);
		
		boolean sucesso = false;
		
		int id1 = convertToInt(idexecutado);
		int id2 = convertToInt(idRegistronovo);
		
		if(id2 > id1) {
			System.out.println("Registro criado");
			sucesso = true;
		}else {
			System.out.println("Não pode criar o registro..");
			sucesso=false;
		}
		System.out.println(sucesso);
		return sucesso;
	}

}
