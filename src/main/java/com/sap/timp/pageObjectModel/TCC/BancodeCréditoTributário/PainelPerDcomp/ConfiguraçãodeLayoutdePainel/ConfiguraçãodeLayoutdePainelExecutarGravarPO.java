package com.sap.timp.pageObjectModel.TCC.BancodeCréditoTributário.PainelPerDcomp.ConfiguraçãodeLayoutdePainel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguraçãodeLayoutdePainelExecutarGravarPO extends TestBaseSteven {

	

	@FindBy(xpath = "//span[text()=\"Banco de Crédito Tributário\"]")
	public WebElement BancoCréditoTributário;
	
	@FindBy(xpath = "//*[@id=\"left-content\"]/div[2]/ul/li[11]/ul/li[2]/div/span[2]")
	public WebElement Painel;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Layout de Painel\"]")
	public WebElement configuracionPainel;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;

	@FindBy(xpath = "//*[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement validaDe;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement btnExecuta;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement cboEmpresa;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcionEmpresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar UF\"]")
	public WebElement cboUf;
	
	@FindBy(xpath = "//*[@id=\"SP\"]/div[1]/label/span")
	public WebElement opcionUf;
	
	@FindBy(xpath = "//*[@id=\"AL\"]/div[1]/label/span")
	public WebElement opcionUfTC2;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Filial\"]")
	public WebElement cboFilial;
	
	@FindBy(xpath = "//*[@id=\"1000_SP_0001\"]/div[1]/label/span")
	public WebElement opcionFilial;
	
	
	@FindBy(xpath = "//*[@id=\"subInput\"]/div/div[1]/span")
	public WebElement calendario;
	
	@FindBy(xpath = "//input[@placeholder=\"Subperiodo\"]")
	public WebElement subPeriodo1;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[1]/div[1]")
	public WebElement atras;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[3]/div[8]")
	public WebElement J2016;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[2]/div[2]")
	public WebElement enero;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[1]/div/div[1]")
	public WebElement m;
	
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement executa;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public ConfiguraçãodeLayoutdePainelExecutarGravarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean executarGravar() {

		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		BancoCréditoTributário.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Painel.click();
		sleep(2000);
		
		configuracionPainel.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		String idRegistro = idObter("idBCT-PainelPERDCOMP-ConfiguracaoDeLayoutPainel");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		btnExecuta.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboEmpresa.click();
		sleep(2000);
		opcionEmpresa.click();
		sleep(2000);

		
		cboUf.click();
		sleep(2000);
		opcionUf.click();
		sleep(2000);
		opcionUf.sendKeys(Keys. ESCAPE);
		sleep(7000);
		
		
//		cboFilial.click();
//		sleep(2000);
//		opcionFilial.click();
//		sleep(2000);
//		opcionFilial.sendKeys(Keys. ESCAPE);
//		sleep(2000);
		
		calendario.click();
		sleep(3000);
		
		atras.click();
		sleep(3000);
		
		J2016.click();
		sleep(3000);
		
		enero.click();
		sleep(3000);
		
		m.click();
		sleep(3000);
		sleep(3000);
		
		executa.click();
	
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		
		biblioteca.click();
		sleep(7000);
		
	//	BancoCréditoTributário.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
	//	Painel.click();
		sleep(2000);
		
		configuracionPainel.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu2.click();
		sleep(2000);
		açao2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(24000);
		
		attributoNotToBeEmptyElement(validaDe, "value");
		String valorDescricaoGuardado = validaDe.getAttribute("value");
		System.out.println("");
		System.out.println("Descricao valor guardado: " + valorDescricaoGuardado);
		  
		boolean sucesso = false;
		
	/*	if(valorDescricaoGuardado.equals(valorDescricao)) {
	 		System.out.println("");
			System.out.println("Valor editado satisfactoriamente...");
			sucesso = true;
		}else {
			System.out.println("");
			System.out.println("Error al prencher descricao...");
		}*/
		
		return sucesso;
	}
	
}
