package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoPainelCreditoICMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ConfiguracaoEExecucaoPainelCreditoICMSEditarPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário ICMS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"]/div/span[text()=\"Configuração e Execução\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-creditPanelIcmsConfiguration\"]")
	public WebElement painelCréditoICMS;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"component\"]/div/div[1]/div[2]")
	public WebElement componente;
	
	@FindBy(xpath = "//div[@id=\"component\"]/div/div[1]/div/input")
	public WebElement componenteInput;
	
	@FindBy(xpath = "//li[@id=\"option-2\"]")
	public WebElement componenteOPC;
	
	@FindBy(xpath = "//button[text()=\"Editar\"]")
	public WebElement editarB;
	
	public ConfiguracaoEExecucaoPainelCreditoICMSEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean Editar() {
		gestaoCredito.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracaoEExecucao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		painelCréditoICMS.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("id-GCT-ICMS-PainelCreditoICMSConfiguracaoEExecucaco");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		waitExpectElement(componenteInput);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valor =componenteInput.getAttribute("value");
		System.out.println(valor);
		
		sleep(4000);
		componente.click();
		sleep(2000);
		
		componenteOPC.click();
		sleep(4000);
		
		String enviado =componenteInput.getAttribute("value");
		System.out.println(enviado);
		
		editarB.click();
		sleep(8000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(siguiente);
		sleep(4000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu1.click();
		sleep(1000);
		editar1.click();
		sleep(3000);
		waitExpectElement(componenteInput);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String nuevoTexto = componenteInput.getAttribute("value");
		System.out.println(valor);
		System.out.println(nuevoTexto);
		
		boolean sucesso = nuevoTexto.equals(enviado);
		System.out.println(sucesso);
		return sucesso;
	}
}
