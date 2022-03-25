package com.sap.timp.pageObjectModel.TCC.BancodeCréditoTributário.PainelPerDcomp.ConfiguraçãodeLayoutdePainel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguraçãodeLayoutdePainelEditarPO extends TestBaseSteven {
	
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
	
	@FindBy(xpath = "//button[text()=\"Editar\"]")
	public WebElement btnEditar;
	
	public ConfiguraçãodeLayoutdePainelEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {

		
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
		
		//String idRegistro = idObter1();
		String idRegistro = idObter("idBCT-PainelPERDCOMP-ConfiguracaoDeLayoutPainel");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(18000);
		
		String valorDescricao = "13/01/2021";
		System.out.println("Fecha Nueva: " + valorDescricao);
		
		validaDe.clear();
		validaDe.sendKeys(valorDescricao);
		sleep(1000);
		
		btnEditar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);
		
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
		
		WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu2.click();
		sleep(1000);
		açao2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		attributoNotToBeEmptyElement(validaDe, "value");
		String valorDescricaoGuardado = validaDe.getAttribute("value");
		System.out.println("");
		System.out.println("Descricao valor guardado: " + valorDescricaoGuardado);
		  
		boolean sucesso = false;
		
		if(valorDescricaoGuardado.equals(valorDescricao)) {
			System.out.println("");
			System.out.println("Valor editado satisfactoriamente...");
			sucesso = true;
		}else {
			System.out.println("");
			System.out.println("Error al prencher descricao...");
		}
		
		return sucesso;
	}

}
