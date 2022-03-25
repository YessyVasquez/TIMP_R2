package com.sap.timp.pageObjectModel.TCC.BancodeCréditoTributário.PainelPerDcomp.ConfiguraçãodeLayoutdePainel;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguraçãodeLayoutdePainelVisualizarPO extends TestBaseSteven {
	

	@FindBy(xpath = "//span[text()=\"Banco de Crédito Tributário\"]")
	public WebElement BancoCréditoTributário;
	
	@FindBy(xpath = "//*[@id=\"left-content\"]/div[2]/ul/li[11]/ul/li[2]/div/span[2]")
	public WebElement Painel;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Layout de Painel\"]")
	public WebElement configuracionPainel;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button")
	public WebElement btnFechar;
	
	
	public ConfiguraçãodeLayoutdePainelVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> ver(){

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		BancoCréditoTributário.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Painel.click();
		sleep(2000);
		
		configuracionPainel.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	

		
		String idRegistro = idObter("idBCT-PainelPERDCOMP-ConfiguracaoDeLayoutPainel");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(39000);
		
		// Datos de visualizar
		String empresaString = driver.findElement(By.xpath("//div[@id=\"company\"]/div/div/div/div/div/div[@class=\"componentName\"]")).getText();
		String ufString = driver.findElement(By.xpath("//div[@id=\"uf\"]/div/div/div/div/div/div[@class=\"componentName\"]")).getText();
		String filialString = driver.findElement(By.xpath("//div[@id=\"branch\"]/div/div/div/div/div/div[@class=\"componentName\"]")).getText();
		String tributoString = driver.findElement(By.xpath("//div[@id=\"tax\"]/div/div/div/input")).getAttribute("value").trim();
		String impostoString = driver.findElement(By.xpath("//div[@id=\"taxType\"]/div/div/div/input")).getAttribute("value").trim();
		String detalheString = driver.findElement(By.xpath("//div[@id=\"taxTypeDetail\"]/div/div/div/input")).getAttribute("value").trim();
		String leiauteString = driver.findElement(By.xpath("//div[@id=\"layout\"]/div/div/input")).getAttribute("value").trim();
		String componenteString = driver.findElement(By.xpath("//div[@id=\"component\"]/div/div/div/input")).getAttribute("value").trim();
		
		
		System.out.println("Datos de Ver");
		System.out.println("Empresa: " + empresaString);
		System.out.println("UF: " + ufString);
		System.out.println("Filial: " + filialString);
		System.out.println("Tributo: " + tributoString);
		System.out.println("Tipo de Impost: " + impostoString);
		System.out.println("Detalhe Tipo Tributo: " + detalheString);
		System.out.println("Leiaute: " + leiauteString);
		System.out.println("Componente: " + componenteString);

		System.out.println("");
		
		sleep(2000);
		btnFechar.click();
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
		sleep(30000);
		
		// Datos de Editar
		String empresaString1 = driver.findElement(By.xpath("//div[@id=\"company\"]/div/div/div/div/div/div[@class=\"componentName\"]")).getText();
		String ufString1 = driver.findElement(By.xpath("//div[@id=\"uf\"]/div/div/div/div/div/div[@class=\"componentName\"]")).getText();
		String filialString1 = driver.findElement(By.xpath("//div[@id=\"branch\"]/div/div/div/div/div/div[@class=\"componentName\"]")).getText();
		String tributoString1 = driver.findElement(By.xpath("//div[@id=\"tax\"]/div/div/div/input")).getAttribute("value").trim();
		String impostoString1 = driver.findElement(By.xpath("//div[@id=\"taxType\"]/div/div/div/input")).getAttribute("value").trim();
		String detalheString1 = driver.findElement(By.xpath("//div[@id=\"taxTypeDetail\"]/div/div/div/input")).getAttribute("value").trim();
		String leiauteString1 = driver.findElement(By.xpath("//div[@id=\"layout\"]/div/div/input")).getAttribute("value").trim();
		String componenteString1 = driver.findElement(By.xpath("//div[@id=\"component\"]/div/div/div/input")).getAttribute("value").trim();
		
		System.out.println("Datos de Editar");
		System.out.println("Empresa: " + empresaString1);
		System.out.println("UF: " + ufString1);
		System.out.println("Filial: " + filialString1);
		System.out.println("Tributo: " + tributoString1);
		System.out.println("Tipo de Impost: " + impostoString1);
		System.out.println("Detalhe Tipo Tributo: " + detalheString1);
		System.out.println("Leiaute: " + leiauteString1);
		System.out.println("Componente: " + componenteString1);
		System.out.println("");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaString1.equals(empresaString));
		sucesso.add(ufString1.equals(ufString));
		sucesso.add(filialString1.equals(filialString));
		sucesso.add(tributoString1.equals(tributoString));
		sucesso.add(impostoString1.equals(impostoString));
		sucesso.add(detalheString1.equals(detalheString));
		sucesso.add(leiauteString1.equals(leiauteString));
		sucesso.add(componenteString1.equals(componenteString));

		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}

}
