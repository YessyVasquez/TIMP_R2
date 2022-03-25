package com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.Edicao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegrasdeAuditoriaN2CorreçãoPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N2\"]")
	public WebElement AN2;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Hierarquia\"]")
	public WebElement hererarquia;
	
	@FindBy(xpath = "//div[text()=\"HCNF0110 - TA-1871 - NÃO MEXER\"]")
	public WebElement seleccionHererarquiaTQ1;
	
	@FindBy(xpath = "//div[text()=\"HCNF0051 - TA-1871 - NÃO MEXER\"]")
	public WebElement seleccionHererarquiaTP1;
	
	@FindBy(xpath = "//div[text()=\"HCNF0125 - TA-1871 NÃO MEXER\"]")
	public WebElement seleccionHererarquiaTC2;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Cenário\"]")
	public WebElement cenario;
	
	@FindBy(xpath = "//div[@class=\"dialog-content bienpinchewide wide\"]/div/div[2]/div[2]/div/div[3]/div/div[2]/div[1]/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement valor1;
	
	@FindBy(xpath = "//div[@class=\"dialog-content bienpinchewide wide\"]/div/div[2]/div[2]/div/div[3]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement valor2;
	
	@FindBy(xpath = "//div[@class=\"dialog-content bienpinchewide wide\"]/div/div[2]/div[2]/div/div[3]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement valor3;
	
	
	@FindBy(xpath = "//button[@class=\"add-btn btn icon icon-font-Sign-and-Symbols icon-plussign\"]")
	public WebElement adicionarAcoes;
	
	@FindBy(xpath = "//button[@class=\"filter-btn btn trans icon icon-font-Sign-and-Symbols icon-plussign\"]")
	public WebElement adicionarCorrecoes;
	
	@FindBy(xpath = "//div[@class=\"graph\"]//*[name()=\"g\"]//*[name()=\"g\"][5]")
	public WebElement CFOP;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Ok\"]")
	public WebElement ok;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement grabar;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button[text()=\"Modificar\"]")
	public WebElement modificar;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button[@id=\"edit-button\"]")
	public WebElement editTabela;
	
	@FindBy(xpath = "//span[@class=\"icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement excluirCorrecoe;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnAceitar;
	
	public RegrasdeAuditoriaN2CorreçãoPO() {

		PageFactory.initElements(driver, this);
	}
	
public boolean editar() {
	
	String url = driver.getCurrentUrl();

	boolean tp1  = false;
	boolean tc2  = false;
	boolean tq1  = false;
	boolean tq2  = false;
	
	if (url.contains("tq1")) {
		tq1 = true;
	}else if(url.contains("tc2")){
		tc2 = true;
	}else if(url.contains("tp1")){
		tp1 = true;
	}else if(url.contains("tq2")){
		tq2 = true;
	}
	
	
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	AN2.click();
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);

	btnUltimaPagina.click();
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	
	//String idRegistro = idObter3();
	String idRegistro = idObter("An2");
	WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
	WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion
	
	menu.click();
	sleep(1000);
	açao.click();
	sleep(3000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(15000);
	
	waitExpectElement(CFOP);
	
	CFOP.click();
	sleep(4000);
	
	adicionarAcoes.click();
	sleep(3000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(8000);
	
	
	adicionarCorrecoes.click();
	sleep(3000);
	
	if (tq1 == true || tq2 == true) {
		hererarquia.sendKeys("HCNF0110 - TA-1871 - NÃO MEXER");
		sleep(3000);
		seleccionHererarquiaTQ1.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		cenario.sendKeys("CCNF0168 - TA-1871 - NÃO MEXER");
		sleep(3000);
		cenario.sendKeys(Keys.ENTER);
		sleep(3000);
	} else if (tp1) {
		hererarquia.sendKeys("HCNF0051 - TA-1871 - NÃO MEXER");
		sleep(3000);
		seleccionHererarquiaTP1.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		cenario.sendKeys("CCNF0084 - TA-1871 - NÃO MEXER");
		sleep(3000);
		cenario.sendKeys(Keys.ENTER);
		sleep(3000);
	}else {
		hererarquia.sendKeys("HCNF0001 - Excluir DIFAL");
		sleep(3000);
		seleccionHererarquiaTC2.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		cenario.sendKeys("HCNF0001 - Excluir DIFAL");
		sleep(3000);
		cenario.sendKeys(Keys.ENTER);
		sleep(3000);
	}
	
	
	
	valor1.sendKeys("1");
	sleep(3000);
	
	valor2.sendKeys("1");
	sleep(3000);
	
	
	if (tq1 == true || tq2 == true) {
		valor3.sendKeys("1");
		sleep(3000);
	}
	aplicar.click();
	sleep(3000);
	
	modificar.click();
	sleep(3000);
		
	grabar.click();
	sleep(2000);
	
	sim.click();
	sleep(3000);
	
	aceitar.click();
	sleep(9000);
	
	
	//----------------Entrando de nuevo a editar--------------------------
	
	CFOP.click();
	sleep(2000);
	
	adicionarAcoes.click();
	sleep(3000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(6000);
	
	excluirCorrecoe.click();
	sleep(3000);
	
	aplicar.click();
	sleep(3000);
	
	modificar.click();
	sleep(3000);
	
	grabar.click();
	sleep(3000);
	
//	sim.click();
//	sleep(3000);
//	
//	aceitar.click();
//	sleep(3000);
	
	
	boolean sucesso = false;
	
	if (CFOP != null) {
		sucesso= true;
	}
	System.out.println(sucesso);
	return sucesso;
}

}
