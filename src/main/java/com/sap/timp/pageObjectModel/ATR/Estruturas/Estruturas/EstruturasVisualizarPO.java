
package com.sap.timp.pageObjectModel.ATR.Estruturas.Estruturas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class EstruturasVisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/ul/li[1]/div/span[2]")
	public WebElement estruturas;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/ul/li[1]/div/div/div[2]/span[1]")
	public WebElement capa;
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/ul/li[2]/div/div/div[2]/span[1]")
	public WebElement item;
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/ul/li[3]/div/div/div[2]/span[1]")
	public WebElement oleo;
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/ul/li[4]/div/div/div[2]/span[1]")
	public WebElement campos;
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/div/div/div[2]/span[1]")
	public WebElement total;
	
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/ul/li[1]/div/div/div[2]/span[1]")
	public WebElement capaE;
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/ul/li[2]/div/div/div[2]/span[1]")
	public WebElement itemE;
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/ul/li[3]/div/div/div[2]/span[1]")
	public WebElement oleoE;
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/ul/li[4]/div/div/div[2]/span[1]")
	public WebElement camposE;
	
	@FindBy(xpath = "//*[@id=\"struc-cont\"]/ul/li/div/div/div[2]/span[1]")
	public WebElement totalE;
	
	
	
	
	public EstruturasVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		estruturas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/span[2]"));
		WebElement ver = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[2]/span[2]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		ver.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String capavisualizar = capa.getText();
		String itemvisualizar = item.getText();
		String oleovisualizar = oleo.getText();
		//String camposvisualizar = campos.getText();
		String totalvisualizar = total.getText();
		
		
		System.out.println(capavisualizar);
		System.out.println(itemvisualizar);
		System.out.println(oleovisualizar);
		//System.out.println(camposvisualizar);
		System.out.println(totalvisualizar);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		biblioteca.click();
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		//String idRegistro1 = idObter1();
		//int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		WebElement menu1 = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/span[2]"));
		WebElement editar = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]/span[2]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

	    sleep(8000);

	    
	    String capavisualizarE = capaE.getText();
		String itemvisualizarE = itemE.getText();
		String oleovisualizarE = oleoE.getText();
		//String camposvisualizarE = camposE.getText();
		String totalvisualizarE = totalE.getText();
		
		
		System.out.println(capavisualizarE);
		System.out.println(itemvisualizarE);
		System.out.println(oleovisualizarE);
		//System.out.println(camposvisualizarE);
		System.out.println(totalvisualizarE);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
	  
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(capavisualizarE.contains(capavisualizar));
		sucesso.add(itemvisualizarE.contains(itemvisualizar));
		sucesso.add(oleovisualizarE.contains(oleovisualizar));
		//sucesso.add(camposvisualizarE.contains(camposvisualizar));
		sucesso.add(totalvisualizarE.contains(totalvisualizar));
		

		
		System.out.println(sucesso);
		
		
		return sucesso;
	
			
	}

}

