package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.Registro1200;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class Registro1200EditarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS\"]")
	public WebElement gestaocreditopis;
	

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisRegister1200\"]")
	public WebElement registro1200;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement validaDe;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//div[@id=\"natContRec\"]/div/div[2]")
	public WebElement naturaleza;
	
	@FindBy(xpath = "//div[@id=\"natContRec\"]/div/div/input")
	public WebElement naturalezaValor;
	
	@FindBy(xpath = "//*[@id=\"02\"]")
	public WebElement naturalezaOTQ1;
	
	@FindBy(xpath = "//*[@id=\"option-2\"]")
	public WebElement naturalezaOTC2;
	
	@FindBy(xpath = "//*[@id=\"option-2\"]")
	public WebElement naturalezaOTP1;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	
	public Registro1200EditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Editar() {
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		if (url.contains("tc2")) {
			tc2 = true;
		}if (url.contains("tq1")) {
			tq1 = true;
		} if (url.contains("tp1")) {
			tp1 = true;
		}
		
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		gestaocreditopis.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registro1200.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("GestaoCréditoTributárioPISRegistro1200");
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		waitExpectElement(naturaleza);
		sleep(16000);
		
		
		
		
		
		String enviar= "";
		if (tq1 == true) {
			naturaleza.click();
			sleep(3000);
			
			naturalezaOTQ1.click();
			String valor = naturalezaOTQ1.getText();
			//String valor = filialE.getAttribute("value");
			System.out.println("Valor: "+valor);
			enviar = valor;
			
		}else if (tp1== true) {
			naturaleza.click();
			sleep(3000);
			
			naturalezaOTP1.click();
			String valor = naturalezaOTP1.getText();
			//String valor = filialE.getAttribute("value");
			System.out.println("Valor: "+valor);
			 enviar = valor;
		}else if (tc2== true) {
			naturaleza.click();
			sleep(3000);
			
			naturalezaOTC2.click();
			String valor = naturalezaOTC2.getText();
			//String valor = filialE.getAttribute("value");
			System.out.println("Valor: "+valor);
			 enviar = valor;
		}

		
		btnGravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	    
		driver.navigate().refresh();
		waitExpectElement(naturaleza);
		sleep(6000);
	  	
	  	String nuevoTexto = naturalezaValor.getAttribute("value");
	  	System.out.println("Enviado: "+enviar);
		System.out.println("Nuevo:" + nuevoTexto);
		
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
