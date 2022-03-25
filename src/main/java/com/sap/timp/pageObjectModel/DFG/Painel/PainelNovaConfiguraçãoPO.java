package com.sap.timp.pageObjectModel.DFG.Painel;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class PainelNovaConfiguraçãoPO extends TestBaseSteven{
	@FindBy(xpath = "//div[@class=\"base-pagination-wrapper\"]/div[contains(@class,\"icon-right\") and @tabindex=\"0\"][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//div[@class=\"base-pagination-wrapper\"]/div[contains(@class,\"icon-left\") and @tabindex=\"0\"][1]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[@class=\"icon icon-font-Finance-and-Office icon-trendup padding-right \"][1]")
	public WebElement painel;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-setting-panel-panel\"][1]")
	public WebElement configuracao;
	
	@FindBy(xpath = "//span[contains(text(),\"Nova Configuração\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"envolve maior\"][1]/div[2]/div/div/div[2]")
	public WebElement tipoObrigado;
	
	@FindBy(xpath = "//div[@class=\"envolve maior\"][4]/div[2]/div/div/div[2]")
	public WebElement componente;
	
	@FindBy(xpath = "//div[@class=\"envolve maior\"][5]/div[2]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement opc;
	
	@FindBy(xpath = "//div[text()=\"COFINS\"]")
	public WebElement opc1;
	
	@FindBy(xpath = "//input[@placeholder=\"Link\"]")
	public WebElement link;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement criar;
	
	public PainelNovaConfiguraçãoPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public	ArrayList<Boolean> criar() {
		
		painel.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Último Id antes da criação do registro DFG : " + ultimoIdAC);
		
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tipoObrigado.click();
		sleep(3000);
		
		opc.click();
		sleep(3000);
		
		link.sendKeys("www.google.com");
		sleep(1000);
		
		componente.click();
		sleep(3000);
		
		opc.click();
		sleep(3000);
		
		tributo.click();
		sleep(3000);
		
		opc1.click();
		sleep(3000);
		
		closeSelectTypeCheckbox(tributo);
		sleep(3000);
		
		criar.click();
		sleep(6000);

		configuracao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String ultimoIdDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		System.out.println("Último Id após da criação do registro : " + ultimoIdDC);
		
		

		int ultimoIdDCD = Integer.valueOf(ultimoIdDC);
		int ultimoIdACD = Integer.valueOf(ultimoIdAC);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (ultimoIdACD < ultimoIdDCD) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		return sucesso;
	}
}
