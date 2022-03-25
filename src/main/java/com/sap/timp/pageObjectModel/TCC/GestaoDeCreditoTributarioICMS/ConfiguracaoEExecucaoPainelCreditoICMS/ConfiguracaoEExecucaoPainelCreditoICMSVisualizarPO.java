package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoPainelCreditoICMS;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ConfiguracaoEExecucaoPainelCreditoICMSVisualizarPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário ICMS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"]/div/span[text()=\"Configuração e Execução\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-creditPanelIcmsConfiguration\"]")
	public WebElement painelCréditoICMS;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div[1]/div/div/div[1]/div")
	public WebElement filialInput;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[1]/div[1]")
	public WebElement empresaInput;
	
	@FindBy(xpath = "//div[@id=\"component\"]/div/div[1]/div/input")
	public WebElement componenteInput;
	
	@FindBy(xpath = "//div[@id=\"layout\"]/div/div/input")
	public WebElement LeiuteInput;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/input")
	public WebElement tributoInput;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	public ConfiguracaoEExecucaoPainelCreditoICMSVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean>  visualizar() {
		
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
		sleep(4000);
		
		String idRegistro = idObter("id-GCT-ICMS-PainelCreditoICMSConfiguracaoEExecucaco");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(2000);
		waitExpectElement(componenteInput);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);
		
		
		String empresaV = empresaInput.getText();
		String filialV = filialInput.getText();
		String tributoV =tributoInput.getAttribute("value");
		String LeiuteV =LeiuteInput.getAttribute("value");
		String componenteV =componenteInput.getAttribute("value");
		
		System.out.println("---------------Informação no Visualizar-----------------");
		System.out.println(empresaV);
		System.out.println(filialV);
		System.out.println(tributoV);
		System.out.println(LeiuteV);
		System.out.println(componenteV);
		
		fechar.click();
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu1.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectElement(componenteInput);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(10000);
		
		String empresaE = empresaInput.getText();
		String filialE = filialInput.getText();
		String tributoE =tributoInput.getAttribute("value");
		String LeiuteE =LeiuteInput.getAttribute("value");
		String componenteE =componenteInput.getAttribute("value");
		
		System.out.println("---------------Informação Editar-----------------");
		System.out.println(empresaE);
		System.out.println(filialE);
		System.out.println(tributoE);
		System.out.println(LeiuteE);
		System.out.println(componenteE);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		

		sucesso.add(empresaE.equals(empresaV));
		sucesso.add(filialE.equals(filialV));
		sucesso.add(tributoE.equals(tributoV));
		sucesso.add(LeiuteE.equals(LeiuteV));
		sucesso.add(componenteE.equals(componenteV));
		
		System.out.println(sucesso);
		return sucesso;
	}
}
