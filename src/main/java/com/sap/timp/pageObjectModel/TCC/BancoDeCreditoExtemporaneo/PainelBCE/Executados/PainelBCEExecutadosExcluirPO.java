package com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.PainelBCE.Executados;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class PainelBCEExecutadosExcluirPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bce\"]")
	public WebElement bancoCreditoExtemporaneo;

	@FindBy(xpath = "//span[text()=\"Painel BCE\"]")
	public WebElement painelbce;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement ultimaPagina;
	
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bcePanelExecution\"]")
	public WebElement executados;
	String URL = driver.getCurrentUrl();
	
	public PainelBCEExecutadosExcluirPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> excluir() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		bancoCreditoExtemporaneo.click();
		sleep(2000);
		painelbce.click();
		sleep(2000);
		executados.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("idBCEPainelBCEConfiguracaoEExecucacoExecutados");
		System.out.println("ID Registro: " + idRegistro);
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
		
		String id="0";
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
			System.out.println("ID Ultimo Registro: " + id);
		}
		//ultimo id
		//String 
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		if(id2 == id1) {
			System.out.println("Sim, são iguais");
			sucesso.add(true);
		}else {
			System.out.println("Não são iguais");
			sucesso.add(false);
		}
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		excluir.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		 rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		 String idultimo="0";
			if(rows > 0) {
				idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
				System.out.println("ID Ultimo Registro: " + id);
			}
		//String 
		
		int idc = convertToInt(idultimo);
		int idb = convertToInt(idRegistro);
			if(idc!= idb) {
			System.out.println("Sim são diferente");
			sucesso.add(true);
		}else {
			System.out.println("Não, são iguais");
			sucesso.add(false);
		}
		System.out.println(sucesso);
		return sucesso;
	}


}
