package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.ConfiguraçãoeExecução;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguraçãoeExecuçãoExecutarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Painel Crédito\"]")
	public WebElement painelCredito;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div[2]/ul/li[6]/ul/li[5]/ul/li[1]/div/span[2]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//*[@id=\"left-content\"]/div[2]/ul/li[6]/ul/li[5]/ul/li[2]/div/span[2]")
	public WebElement executados;
	
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement validaDe;
	
	@FindBy(xpath = "//button[text()=\"Editar\"]")
	public WebElement editarBtn;
	
	@FindBy(xpath = "//div[@id=\"component\"]/div/div/div/input")
	public WebElement componente;

	
	@FindBy(xpath = "//li[@id=\"option-2\"]")
	public WebElement componenteO;
	
	@FindBy(xpath = "//*[@id=\"02\"]")
	public WebElement naturalezaOTC2;
	
	@FindBy(xpath = "//*[@id=\"option-2\"]")
	public WebElement naturalezaOTP1;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button/span[2]")
	public WebElement ExecutarBtn;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement empresaOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar UF\"]")
	public WebElement estado;
	
	@FindBy(xpath = "//*[@id=\"SP\"]/div[1]/label/span")
	public WebElement estadoOpc;
	
	@FindBy(xpath = "//*[@id=\"RJ\"]/div[1]/label/span")
	public WebElement estadoOpcTC2;
	
	@FindBy(xpath = "//*[@id=\"subInput\"]/div/div[1]/span")
	public WebElement calendario;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[1]/div[1]")
	public WebElement atras;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[3]/div[8]")
	public WebElement anio;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[2]/div[2]")
	public WebElement mes;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[1]/div/div[1]")
	public WebElement sel;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement executar2;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement no;
	
	public ConfiguraçãoeExecuçãoExecutarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean executar() {
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		if (url.contains("tc2")) {
			tc2 = true;
		}if (url.contains("tq1")) {
			tq1 = true;
		} else {
			tp1 = true;
		}
		
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		actionsMoveToElementElement(gestaoCredito);
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		painelCredito.click();
		sleep(2000);
		
		executados.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id1= "0";
		
		if(rows > 0) {
			id1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
			System.out.println("ultimo idExecutados: " + id1);
		} 
		
		
		configuracaoEExecucao.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("idPainelCreditoConfiguracaoEExecucaco");
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement executar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		executar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		ExecutarBtn.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		empresaOpc.click();
		sleep(2000);
		
		estado.click();
		sleep(2000);
		if(tc2 == true) {
			estadoOpcTC2.click();
			sleep(4000);
			estadoOpcTC2.sendKeys(Keys. ESCAPE);
			sleep(2000);
		}else {
			estadoOpc.click();
			sleep(4000);
			estadoOpc.sendKeys(Keys. ESCAPE);
			sleep(2000);
		}
		
		calendario.click();
		sleep(2000);
		atras.click();
		sleep(4000);
		anio.click();
		sleep(4000);
		mes.click();
		sleep(4000);
		sel.click();
		sleep(4000);
		
		executar2.click();
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		executados.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2= "0";
		
		if(rows > 0) {
			id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
			System.out.println("ultimo idExecutados: " + id1);
		} 
		
		//String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		
		idInserir("idPainelCreditoConfiguracaoEExecucacoExecutados",id2);
		
		//idInserir1(id2);

		
		int idD = convertToInt(id1);
		int id2D = convertToInt(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (id2D > idD) {
			sucesso = true;
		}
		
		System.out.println(sucesso);
		
		return sucesso;
	
		
		
	  	
		
	}

}
