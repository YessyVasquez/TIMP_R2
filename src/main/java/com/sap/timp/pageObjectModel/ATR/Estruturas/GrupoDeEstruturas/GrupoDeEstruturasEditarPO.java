package com.sap.timp.pageObjectModel.ATR.Estruturas.GrupoDeEstruturas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class GrupoDeEstruturasEditarPO extends TestBaseSteven{
	

	@FindBy(xpath = "//span[text()=\"Grupo de Estruturas\"]")
	public WebElement grupodeestrutura;
	
	@FindBy(xpath = "//div[@class=\"select\"]/div/div[2]")
	public WebElement estruturadedados;
	
	@FindBy(xpath = "//li[@id][text()=\"4.2.2 - CFOP\"]")
	public WebElement opcaoestrutura2;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha o nome do grupo\"]")
	public WebElement nomedogrupo;
	

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	
	
	
	public GrupoDeEstruturasEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> editar() {
		sleep(2000);
		
		grupodeestrutura.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("GrupoDeEstruturasCriar");
		
		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		
		sleep(11000);
		waitExpectElement(nomedogrupo);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		estruturadedados.click();
		sleep(2000);
		opcaoestrutura2.click();
		sleep(2000);
		String enviar = "Teste ATR Editar";
		nomedogrupo.clear();
		sleep(2000);
		nomedogrupo.sendKeys(enviar);
		sleep(1000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		grupodeestrutura.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		 menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		 editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		String nomedogrupo1 = nomedogrupo.getAttribute("value");
		System.out.println(nomedogrupo1);
		sucesso.add(nomedogrupo1.equals(enviar));
		
		int cfop = driver.findElements(By.xpath("//div[@aria-label=\"Row; Nome: 4.2.2 - CFOP\"]/div[2]/div")).size();

		if (cfop == 0) {
			System.out.println("4.2.2 - CFOP não consta na página de Edição");
			sucesso.add(false);
			
		} else {
			System.out.println("4.2.2 - CFOP consta na página de Edição");
			sucesso.add(true);
		}
		System.out.println(sucesso);
		
		return sucesso;
	}


}
