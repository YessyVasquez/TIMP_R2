package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.Executados.PainelCreditoICMS;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class PainelCreditoICMSExcluirPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário ICMS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"]/div/span[text()=\"Executados\"]")
	public WebElement executados;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-creditPanelIcmsExecution\"]")
	public WebElement executadosPainelCréditoICMS;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	public PainelCreditoICMSExcluirPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> excluir() {
		gestaoCredito.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		executados.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		executadosPainelCréditoICMS.click();
		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();

		String idRegistro = idObter("id-GCT-ICMS-PainelCreditoICMSConfiguracaoEExecucacoExecutados");
		System.out.println("");
		System.out.println("ID Registro Excecutado: " + idRegistro);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
		//ultimo id
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		System.out.println("ID Ultimo Registro: " + id);
		
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
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		
		executadosPainelCréditoICMS.click();
		invisibilityOfElementOverlay();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		 rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
			//ultimo id
			String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
			System.out.println("ID Ultimo Registro: " + id);
			
			int idc = convertToInt(idultimo);
			int idb = convertToInt(idRegistro);
				if(idc!= idb) {
				System.out.println("Sim, são diferente");
				sucesso.add(true);
			}else {
				System.out.println("Não, são iguais");
				sucesso.add(false);
			}
			System.out.println(sucesso);
			return sucesso;
	}
}
