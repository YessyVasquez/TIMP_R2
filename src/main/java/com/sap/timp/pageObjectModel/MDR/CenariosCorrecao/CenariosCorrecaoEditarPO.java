package com.sap.timp.pageObjectModel.MDR.CenariosCorrecao;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sap.timp.base.TestBaseSteven;

public class CenariosCorrecaoEditarPO extends TestBaseSteven{
	@FindBy(xpath = "//li/div/span[text()=\"Cenários de Correção\"]")
	public WebElement cenarios;
		
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement novo;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//*[@id=\"tax\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement tributo;
	
	@FindBy(xpath = "//*[@id=\"correction-object\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement objetoCorrecao;
	
	@FindBy(xpath = "//*[@id=\"web-service\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement servicoWeb;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//*[@id=\"valid-from\"]/div/div[1]/input")
	public WebElement campo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"option-2\"]")
	public WebElement opc;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement confirmacionGravar;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/ul/li[3]/button")
	public WebElement btnRegresar;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[11]/div[3]/div")	
	public WebElement idC;
	
		
	public CenariosCorrecaoEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean cenariosCorrecaoEditar() {
	
		
		cenarios.click();
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);	
			
		siguiente.click();
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("CenariosCorrecao");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(4000);
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		waitExpectElement(campo);
		campo.sendKeys(Keys.ENTER);
		String valor = campo.getAttribute("value");

		String enviar = "27/07/2020";
		
		campo.clear();
		sleep(1000);
		campo.sendKeys(enviar);
		campo.sendKeys(Keys.ENTER);
		//campo.sendKeys(Keys.ENTER);
		cuerpo.click();
		sleep(2000);
		btnGravar.click();
		sleep(3000);
		confirmacionGravar.click();
		sleep(2000);

		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");

		driver.navigate().refresh();

		attributeToBeXpath("//*[@id=\"description\"]/div/div[2]/div/div[1]", "class", "input-wrapper base-input ");

		sleep(2000);
		
		String nuevoTexto = campo.getAttribute("value");
		System.out.println(valor);
		System.out.println(nuevoTexto);
		boolean sucesso = nuevoTexto.equals(enviar);
		System.out.println(sucesso);

		sleep(3000);
		waitExpectElement(campo);
		campo.sendKeys(Keys.ENTER);
		campo.clear();

		sleep(1000);
		campo.sendKeys(valor);
		campo.sendKeys(Keys.ENTER);
		cuerpo.click();
		
		btnGravar.click();

		sleep(3000);
		confirmacionGravar.click();
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		
		return sucesso;
	}
}
