package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.ConfiguraçãoeExecução;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguraçãoeExecuçãoEditarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Painel Crédito\"]")
	public WebElement painelCredito;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div[2]/ul/li[6]/ul/li[5]/ul/li[1]/div/span[2]")
	public WebElement configuracaoEExecucao;
	
	
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
	
	
	public ConfiguraçãoeExecuçãoEditarPO() {
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
		} else {
			tp1 = true;
		}
		
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		actionsMoveToElementElement(gestaoCredito);
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		painelCredito.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("idPainelCreditoConfiguracaoEExecucaco");
		//String idRegistro =idObter1();
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		
		waitExpectElement(componente);
		sleep(19000);
		String valor = componente.getAttribute("value");
		//String valor = filialE.getAttribute("value");
		System.out.println(valor);
		String enviar = valor;
		
		
		componente.click();
		sleep(1000);
		
		componenteO.click();
		sleep(2000);
		

		
		editarBtn.click();
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	    
		driver.navigate().refresh();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		actionsMoveToElementElement(gestaoCredito);
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		painelCredito.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(2000);
		waitExpectElement(componente);
		sleep(6000);
	  	String nuevoTexto = componente.getAttribute("value");
	  	System.out.println("Antes: "+enviar);
		System.out.println("Despues: "+nuevoTexto);
		
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
