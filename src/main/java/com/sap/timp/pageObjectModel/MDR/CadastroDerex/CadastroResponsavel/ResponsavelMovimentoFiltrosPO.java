package com.sap.timp.pageObjectModel.MDR.CadastroDerex.CadastroResponsavel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ResponsavelMovimentoFiltrosPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"Cadastro DEREX\"]")
	public WebElement derex;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-responsibleDerex\"]")
	public WebElement responsavelO;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"thead\"]/div/div[3]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")
	public WebElement idR;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	public ResponsavelMovimentoFiltrosPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean filtros() {
		

		derex.click();
		sleep(1000);
		responsavelO.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String id = idR.getText();
		System.out.println(id);
		
		pesquisar.sendKeys(id);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idB = idR.getText();
		System.out.println(idB);

		boolean sucesso = idB.contains(id);
		return sucesso;
		
		
	}
	

}
