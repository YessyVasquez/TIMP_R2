package com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class BREGerenciarRegulamentosCriarEditarExcluirPO extends TestBaseSteven {
	
	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div/div/div[2]/div[1]/div/div[1]/div/div/ul/li[3]/button")
	public WebElement gerenciar;
	
	@FindBy(xpath = "//button[text()=\"Criar Regulamento\"]")
	public WebElement novoRegulamento;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[2]/div/table/tbody/tr[1]/td[2]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//button[text()=\"Ok\"]")
	public WebElement ok;
	
	public BREGerenciarRegulamentosCriarEditarExcluirPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		gerenciar.click();


		sleep(9000);

		
		novoRegulamento.click();
		sleep(3000);
		

		nome.sendKeys("Hello");

		sleep(2000);
		
		aplicar.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(9000);

		
		int rows = driver.findElements(By.xpath("//div[@class=\"object-list-field\"]")).size();
		
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"object-list-field\"]["+rows+"]/button[@id=\"edit-button\"]"));
		
		System.out.println("cantidad1: "+rows);
		editar.click();

		waitExpectElement(nome);
		sleep(2000);

		sleep(8000);

		
		nome.clear();
		sleep(2000);
		nome.sendKeys("Massiel2");
		sleep(2000);
		
		aplicar.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(9000);

		
		fechar.click();
		sleep(2000);
		
		gerenciar.click();
		sleep(6000);
		
		int rows2 = driver.findElements(By.xpath("//div[@class=\"object-list-field\"]")).size();
		WebElement eliminar = driver.findElement(By.xpath("//div[@class=\"object-list-field\"]["+rows2+"]/button[@id=\"delete-button\"]"));
		
		eliminar.click();
		sleep(3000);
		

		ok.click();
		sleep(3000);

		
		ok.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		//int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		
		
		sleep(2000);
		int rows3 = driver.findElements(By.xpath("//div[@class=\"object-list-field\"]")).size();
		
		System.out.println("cantidad2: "+rows3);
		
		boolean sucesso = false;
		
		if (rows > rows3) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		return sucesso;
		
	}

}
