package com.sap.timp.pageObjectModel.TBD.ArmazenagemDeArquivos.AprovacaoDeDocumentos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AprovacaoDeDocumentosExecutarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Armazenagem de Arquivos\"]")
	public WebElement armazenagemdearquivos;
	
	
	@FindBy(xpath = "//span[text()=\"Aprovação de Documentos\"]")
	public WebElement aprovacaodocumentos;
	
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//div[@id=\"status\"]/div/div/div[2]")
	public WebElement status;
	
	@FindBy(xpath = "//li[@id][text()=\"Aprovado\"]")
	public WebElement opcaostatus;
	
	public AprovacaoDeDocumentosExecutarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean executar() {
		
		sleep(2000);
		
		armazenagemdearquivos.click();
		
		sleep(2000);
		
		aprovacaodocumentos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("AprovacaoDeDocumentosCriar");
		
		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement executar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		executar.click();
		sleep(2000);
		
	
		waitExpectElement(status);
		sleep(2000);
		String enviar = "Aprovado";
		status.click();
		sleep(000);
		opcaostatus.click();
		sleep(1000);
	
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String statusaprovado = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[7]/div")).getText();
		

		boolean sucesso = statusaprovado.equals(enviar);
		System.out.println(sucesso);
		
		return sucesso;
	}


}
