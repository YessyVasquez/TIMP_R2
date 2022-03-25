package com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.PainelBCE.ConfiguracaoEExecucao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class PainelBCEConfiguracaoeExecucaoEditarPO extends TestBaseKenssy{
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bce\"]")
	public WebElement bancoCreditoExtemporaneo;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-bcePanel\"]")
	public WebElement painelBCE;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bcePanelConfiguration\"]")
	public WebElement subPastaConfiguracaoDeExecucao;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"component\"]/div/div/div[2]")
	public WebElement componente;
	@FindBy(xpath = "//li[text()=\"MDR\"]")
	public WebElement opcComponente;
	
	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//button[text()=\"Editar\"]")
	public WebElement guardarEditar;
	
	@FindBy(xpath = "//div[@id=\"component\"]/div/div/div/input")
	public WebElement opcComponenteDE;
	
	public PainelBCEConfiguracaoeExecucaoEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
		sleep(2000);
		bancoCreditoExtemporaneo.click();
		sleep(2000);
		painelBCE.click();
		sleep(2000);
		subPastaConfiguracaoDeExecucao.click();
		invisibilityOfElementOverlay();
		
		siguiente.click();
		invisibilityOfElementOverlay();
		
		String idRegistro = idObter("idBCEPainelBCEConfiguracaoEExecucaco");
		//String idRegistro = idObter1();

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		editar.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		
		componente.click();
		sleep(2000);
		opcComponente.click();
		String valorEditado = opcComponente.getText();
		System.out.println("Valor a editar: "+valorEditado);
		sleep(2000);
		
		guardarEditar.click();
		invisibilityOfElementOverlay();
			
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu1.click();
		sleep(1000);
		editar1.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		
		String valorDespues = opcComponenteDE.getAttribute("value");
		System.out.println("Valor a despues de: "+valorDespues);
		sleep(2000);
		
		
		boolean sucesso = valorDespues.equals(valorEditado);
			System.out.println(sucesso);
		
		return sucesso;
	}
}
