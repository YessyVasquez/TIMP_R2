package com.sap.timp.pageObjectModel.MDR.CenariosCorrecao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CenariosCorrecaoExcluirPO extends TestBaseSteven{
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
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//*[@id=\"valid-from\"]/div/div[1]/input")
	public WebElement campo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[2]/div/div[6]")
	public WebElement siguienteTC2;
	
	@FindBy(xpath = "//*[@id=\"option-2\"]")
	public WebElement opc;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement confirmacionGravar;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/ul/li[3]/button")
	public WebElement btnRegresar;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[11]/div[3]/div")	
	public WebElement idC;
	
	@FindBy(xpath = "//div[@class=\"actions\"]")
	public WebElement menu;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[12]/div[1]/div/div[2]/ul/li[4]")
	public WebElement eliminar;
	
	@FindBy(xpath = "//div[text()=\"Nenhum resultado\"]")
	public WebElement nenhumResult;
	
		
	public CenariosCorrecaoExcluirPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean cenariosCorrecaoExcluir() {
		cenarios.click();
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);	
			
		siguiente.click();
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("CenariosCorrecao");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		actionsMoveToElementElement(menu);
		sleep(4000);
	
		menu.click();
		sleep(1000);
		excluir.click();
		sleep(3000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		driver.navigate().refresh();
		waitExpectElement(siguiente);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		double id1 = convertToInt(id);
		double id2 = convertToInt(idRegistro);
		System.out.println(id1);
		System.out.println(id2);
		
		boolean sucesso = false;
		
		if (id1 != id2) {
			sucesso= true;
		}
		System.out.println(sucesso);

		
		//boolean sucesso = nenhumResult.isDisplayed();
		return sucesso;
		
	}
}
