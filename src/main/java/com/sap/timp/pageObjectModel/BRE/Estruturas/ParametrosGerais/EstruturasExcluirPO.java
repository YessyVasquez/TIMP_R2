package com.sap.timp.pageObjectModel.BRE.Estruturas.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class EstruturasExcluirPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[@class=\"baseTabs-title\"]/span[text()=\"Estruturas\"]")
	public WebElement estruturas;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//li[@class=\"base-accordion-li \"]/div/span[text()=\"Lixeira\"]")
	public WebElement lixeira;
	

	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N2\"]")
	public WebElement regradeauditorian2;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//li[@class=\"base-toast  toast-success   \"]/div")
	public WebElement mensagembloqueio;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//span[text()=\"Regras de Escrituração\"]")
	public WebElement regras;
	
	public EstruturasExcluirPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> excluir() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		estruturas.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"list-check_"+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\"list-check_"+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		excluir.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);


		driver.navigate().refresh();
		waitExpectElement(ultimapagina);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		estruturas.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		double id1 = convertToInt(id);
		double id2 = convertToInt(idRegistro);
		System.out.println(id1);
		System.out.println(id2);
		
		
		if (id1 != id2) {
			boolean sucesso1=true;
			sucesso.add(sucesso1);
		}
	
		
		System.out.println(sucesso);
		return sucesso;
	}

}
