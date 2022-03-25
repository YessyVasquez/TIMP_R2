package com.sap.timp.pageObjectModel.ADM.Configuração.ConfiguraçãoTributo.ConfiguraçãoTributoAgrupamento;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguraçãoTributoAgrupamentoVisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[2]")
	public WebElement Configuração;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Tributos\"]")
	public WebElement ConfiguraçãodeTributos;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Tributo Agrupamento\"]")
	public WebElement ConfiguraçãodeTributosAgrupamento;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Agrupamento\"]")
	public WebElement agrupamentoE;
	
	@FindBy(xpath = "//*[@id=\"grouping\"]")
	public WebElement agrupamentoV;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button")
	public WebElement btnFechar;
	
	
	public ConfiguraçãoTributoAgrupamentoVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> ver(){

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Configuração.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		ConfiguraçãodeTributos.click();
		sleep(3000);

		
		ConfiguraçãodeTributosAgrupamento.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ConfiguraçãoTributoAgrupamento");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		// Datos de visualizar
		String agrupamentoStringV = driver.findElement(By.xpath("//*[@id=\"grouping\"]")).getText();

		
		
		System.out.println("Datos de Ver");
		System.out.println("Agrupamento: " + agrupamentoStringV);

		System.out.println("");
		
		btnBiblioteca.click();
		sleep(2000);

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimeraPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		

		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		// Datos de Editar
		String agrupamentoStringE = driver.findElement(By.xpath("//input[@placeholder=\"Preencher Agrupamento\"]")).getAttribute("value").trim();


		
		System.out.println("Datos de Editar");
		System.out.println("Agrupamento: " + agrupamentoStringE);

		System.out.println("");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(agrupamentoStringV.equals(agrupamentoStringE));

		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}

}
