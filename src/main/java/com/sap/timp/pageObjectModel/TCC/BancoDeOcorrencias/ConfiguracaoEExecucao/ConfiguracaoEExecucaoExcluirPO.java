package com.sap.timp.pageObjectModel.TCC.BancoDeOcorrencias.ConfiguracaoEExecucao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguracaoEExecucaoExcluirPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-boc\"]")
	public WebElement bancoOcorrencia;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-bocConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[text()=\"Nenhum resultado\"]")
	public WebElement nenhumResult;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public ConfiguracaoEExecucaoExcluirPO() {

		PageFactory.initElements(driver, this);
	}
	
	public Boolean excluir() {
		
		
		String url = driver.getCurrentUrl();
		bancoOcorrencia.click();
		sleep(2000);
		configuracaoEExecucao.click();
		
		invisibilityOfElementOverlay();
		
		String idRegistro = idObter("idBOConfiguracaoEExecucaco");
		
		siguiente.click();
		invisibilityOfElementOverlay();
		waitExpectXpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div");
		sleep(2000);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		excluir.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		driver.navigate().refresh();
		waitExpectElement(siguiente);
		invisibilityOfElementOverlay();
		
		bancoOcorrencia.click();
		sleep(2000);
		configuracaoEExecucao.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro);
		System.out.println(id1);
		System.out.println(id2);
		
		boolean sucesso = false;
		
		if (id1 != id2) {
			sucesso= true;
		}
		System.out.println( sucesso);
		return sucesso;

		
		
		
	}
	

}
