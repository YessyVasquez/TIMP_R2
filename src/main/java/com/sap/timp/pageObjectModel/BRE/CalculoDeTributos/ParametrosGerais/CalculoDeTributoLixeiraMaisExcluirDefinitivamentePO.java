package com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CalculoDeTributoLixeiraMaisExcluirDefinitivamentePO extends TestBaseSteven {
	
	@FindBy(xpath = "//li[@class=\"base-accordion-li \"]/div/span[text()=\"Lixeira\"]")
	public WebElement lixeira;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Cálculo de Tributos\"]")
	public WebElement calculodetributos;
	
	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//li[@class=\"base-toast  toast-success   \"]/div")
	public WebElement mensagembloqueio;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	public CalculoDeTributoLixeiraMaisExcluirDefinitivamentePO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> excluir() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		calculodetributos.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("CalculoDeTributoCriar");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement lixeira1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		lixeira1.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(mensagembloqueio);
		sleep(2000);
		
		lixeira.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idregra2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		double id1 = convertToDouble(idregra2);
		double id2 = convertToDouble(idRegistro);
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		
		if(id1 == id2)
		{
			System.out.println("Sim, o ID é o mesmo que foi criado");
			
			
		}else {
			System.out.println("Não é o mesmo ID");
		
			
		}
		
		WebElement menu1= driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);

		menu1.click();
		sleep(1000);
		excluir.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(idRegistro);
		System.out.println(idB);
		double idD = convertToDouble(idRegistro);
		double idBD = convertToDouble(idB);
		
		boolean sucesso2 = false;
		if (idBD != idD) {
			sucesso2 = true;
			sucesso.add(sucesso2);
		}else {
			sucesso2 = false;
			sucesso.add(sucesso2);
		}
		
		System.out.println(sucesso);
		return sucesso;
	}

}
