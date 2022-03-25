package com.sap.timp.pageObjectModel.TCC.BancodeCréditoTributário.ConfiguraçãodeBancodeCréditoTributário;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ConfiguraçãodeBancodeCréditoTributárioEditarPO extends TestBaseMassiel {

	@FindBy(xpath = "//span[text()=\"Banco de Crédito Tributário\"]")
	public WebElement BancoCréditoTributário;

	
	@FindBy(xpath = "//span[text()=\"Configuração de Banco de Crédito Tributário\"]")
	public WebElement configuracion;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement validaDe;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//input[@placeholder=\"Tributo Destino\"]")
	public WebElement cboTributoDestino;
	
	@FindBy(xpath = "//li[text()=\"COFINS\"]")
	public WebElement opcionTributoDestinoTC2;
	
	@FindBy(xpath = "//div[@id=\"targetAdjustment\"]/div/div[1]/div[2]")
	public WebElement cboAjuste;
	@FindBy(xpath = "//li[text()=\"427 - A0205\"]")
	public WebElement opcionAjusteTC2;
	@FindBy(xpath = "//li[text()=\"433 - P0039\"]")
	public WebElement opcionAjusteTQ1;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement btnNo;

	
	public ConfiguraçãodeBancodeCréditoTributárioEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Editar() {
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		BancoCréditoTributário.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracion.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("idBCT-ConfiguracaoDeBancoDeCreditoTributario");
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
	//	attributeToBeXpath("//div[@id=\"revenueCode\"]/div","class", "base-select ");
		sleep(74000);
	  	
	  	
//		attributeToBeXpath("//div[@id=\"revenueCode\"]/div","class", "base-select  disabled");
//		sleep(2000);
	
		String valor = validaDe.getAttribute("value");
		System.out.println(valor);
		String enviar = fechaActual();
		
		sleep(1000);
		validaDe.clear();

		sleep(1000);
		validaDe.sendKeys(enviar);
		sleep(6000);
		
		cboTributoDestino.click();
		sleep(1000);
		opcionTributoDestinoTC2.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(110000);
		
		actionsMoveToElementElement(cboAjuste);
		if ( tq1 == true) {
			cboAjuste.click();
			sleep(1000);
			opcionAjusteTQ1.click();
			sleep(7000);
		}else if (tc2 == true) {
			cboAjuste.click();
			sleep(1000);
			opcionAjusteTC2.click();
			sleep(9000);
		}
		sleep(68000);
		btnGravar.click();
		sleep(2000);
		

		int botaoNao = rows("//button[text()=\"Não\"]");
		
		if (botaoNao > 0) {
			btnNo.click();
		}

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(2000);
		editar1.click();
		sleep(2000);
	//	attributeToBeXpath("//div[@id=\"revenueCode\"]/div","class", "base-select ");
		sleep(12000);
	  	
	  	String nuevoTexto = validaDe.getAttribute("value");
	  	System.out.println(enviar);
		System.out.println(nuevoTexto);
		
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);
	  	
		return sucesso;
	}
}
