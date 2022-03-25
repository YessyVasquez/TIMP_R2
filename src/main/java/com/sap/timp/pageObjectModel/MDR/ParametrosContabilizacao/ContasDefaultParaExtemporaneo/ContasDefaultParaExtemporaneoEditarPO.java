package com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ContasDefaultParaExtemporaneoEditarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Parâmetros de Contabilização\"]")
	public WebElement parametrosdecontabilizacao;
	
	@FindBy(xpath = "//span[text()=\"Contas Default para Extemporâneo\"]")
	public WebElement contasdefaultparaextemporaneo;
	
	@FindBy(xpath = "//div[@class=\"field item-2\" and @id=\"adjustmentCode\"]/div/div[2]")
	public WebElement codigodeajuste;
	
	@FindBy(xpath = "//div[@class=\"field item-2\"]/div/div[1]/input")
	public WebElement codigodeajuste1;
	
	@FindBy(xpath = "//li[@id=\"option-2\"]")
	public WebElement opcaocodigodeajuste;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//span[@id=\"adjustmentCode\"]")
	public WebElement campo;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	public ContasDefaultParaExtemporaneoEditarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		parametrosdecontabilizacao.click();
		sleep(2000);
		contasdefaultparaextemporaneo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("ContasDefaultParaExtemporaneo");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//ediçao
		 
		waitExpectElement(codigodeajuste);
		sleep(2000);
		
		codigodeajuste.click();
		sleep(2000);
		opcaocodigodeajuste.click();
		sleep(2000);
		sleep(2000);
		
		String opcaoTexto = codigodeajuste1.getAttribute("value");
		System.out.println("opção selecionada: " +opcaoTexto);
		
		sleep(4000);
		gravar.click();
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("ContasDefaultParaExtemporaneo");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String campoTexto = campo.getText();
		System.out.println("Texto no Visualizar: " +campoTexto);
		
		boolean sucesso = campoTexto.equals(opcaoTexto);
		
		return sucesso;
	}	

}
