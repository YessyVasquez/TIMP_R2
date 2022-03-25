package com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.PainelBCE.ConfiguracaoEExecucao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class PainelBCEConfiguracaoeExecucaoExcluirPO extends TestBaseKenssy {
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bce\"]")
	public WebElement bancoCreditoExtemporaneo;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-bcePanel\"]")
	public WebElement painelBCE;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bcePanelConfiguration\"]")
	public WebElement subPastaConfiguracaoDeExecucao;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	public PainelBCEConfiguracaoeExecucaoExcluirPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> excluir() {
		sleep(2000);
		bancoCreditoExtemporaneo.click();
		sleep(2000);
		painelBCE.click();
		sleep(2000);
		subPastaConfiguracaoDeExecucao.click();
		invisibilityOfElementOverlay();
		
		siguiente.click();
		invisibilityOfElementOverlay();
		
		//String idRegistro = idObter1();
		String idRegistro = idObter("idBCEPainelBCEConfiguracaoEExecucaco");
		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();
		String idCongExecutadoText = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[2]/div"))
				.getText();
		System.out.println("1: "+idRegistro);
		System.out.println("2: "+idCongExecutadoText);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(idRegistro.equals(idCongExecutadoText));
		

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		excluir.click();
		invisibilityOfElementOverlay();
		sleep(2000);
		
		sim.click();
		invisibilityOfElementOverlay();
		
		int exclucao = driver.findElements(By.xpath("//span[contains(text(),\"Cadastro excluído com successo\")]")).size();
		System.out.println(exclucao);
		
		if (exclucao > 0) {
			sucesso.add(true);
			
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
}
