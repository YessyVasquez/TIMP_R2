package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.Registro1101;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class Registro1101EditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS\"]")
	public WebElement gestaocreditopis;
	

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//*[@id=\"left-content\"]/div[2]/ul/li[6]/ul/li[1]/ul/li[1]/ul/li[2]")
	public WebElement registro1101;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement validaDe;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//*[@id=\"componentToSearchId-1000_SP_0001\"]/div[2]")
	public WebElement Efilial;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div[1]")
	public WebElement filialE;
	
	
	
	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div/label/span")
	public WebElement filialO;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	
	public Registro1101EditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Editar() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		gestaocreditopis.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registro1101.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("GestaoCréditoTributárioPISRegistro1101");
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(3000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		
		waitExpectElement(filial);
		sleep(19000);
		String valor = filialE.getText();
		//String valor = filialE.getAttribute("value");
		System.out.println(valor);
		String enviar = valor;
		
		
		/*Efilial.click();
		sleep(3000);*/
		filial.click();
		sleep(1000);
		filialO.click();
		sleep(1000);
		closeSelectTypeCheckbox(filial);
		sleep(1000);
		
		btnGravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	    
		driver.navigate().refresh();
		waitExpectElement(filial);
		sleep(19000);
	  	
	  	String nuevoTexto = filialE.getText();
	  	System.out.println(enviar);
		System.out.println(nuevoTexto);
		
		if (enviar != nuevoTexto) {
			boolean sucesso = true;
			System.out.println("editado con exito: "+sucesso);
			return sucesso;
		}else {
			boolean sucesso = false;
			System.out.println(sucesso);
			return sucesso;
		}
		
		
	  	
		
	}

}
