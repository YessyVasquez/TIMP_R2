package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.SubItensValidos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class SubItensValidosDetalhesPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement tabelacomplementares;
	
	@FindBy(xpath = "//span[text()=\"SubItens Válidos\"]")
	public WebElement subitensvalidos;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	public SubItensValidosDetalhesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		tabelacomplementares.click();
		sleep(2000);
		
		subitensvalidos.click();
		
		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		
		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("SubItensValidos");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos de Detalhe
		String obrigacao = driver.findElement(By.xpath("//div[@id=\"detail-description\"][2]/div/div")).getText().trim();
		String codigoSubItem = driver.findElement(By.xpath("//div[@id=\"detail-description\"][3]/div/div")).getText().trim();
		String ocurrencia = driver.findElement(By.xpath("//div[@id=\"detail-description\"][4]/div/div")).getText().trim();
		String baseLegal = driver.findElement(By.xpath("//div[@id=\"detail-description\"][5]/div/div")).getText().trim();
		String operacao = driver.findElement(By.xpath("//div[@id=\"detail-description\"][6]/div/div")).getText().trim().replace("ó", "o").toUpperCase();
		String ativo = driver.findElement(By.xpath("//div[@id=\"detail-description\"][7]/div/div")).getText().trim();
		
		System.out.println("----------------DATOS DE DETALHE--------------");
		System.out.println("Obrigacao: " + obrigacao);
		System.out.println("COdigo SubItems: " + codigoSubItem);
		System.out.println("Ocurrencia: " + ocurrencia);
		System.out.println("Base legal: " + baseLegal);
		System.out.println("Operacao: " + operacao);
		System.out.println("Ativo: " + ativo);
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos de Visualizar
		String obrigacao1 = driver.findElement(By.xpath("//span[@id=\"obrigation\"]")).getText().trim();
		String codigoSubItem1 = driver.findElement(By.xpath("//span[@id=\"subItemCode\"]")).getText().trim();
		String ocurrencia1 = driver.findElement(By.xpath("//span[@id=\"occurrence\"]")).getText().trim();
		String baseLegal1 = driver.findElement(By.xpath("//span[@id=\"legalBase\"]")).getText().trim();
		String operacao1 = driver.findElement(By.xpath("//span[@id=\"operation\"]")).getText().trim();
		String ativo1 = driver.findElement(By.xpath("//span[@id=\"active\"]")).getText().trim();
		
		System.out.println("----------------DATOS DE VISUALIZAR--------------");
		System.out.println("Obrigacao: " + obrigacao1);
		System.out.println("COdigo SubItems: " + codigoSubItem1);
		System.out.println("Ocurrencia: " + ocurrencia1);
		System.out.println("Base legal: " + baseLegal1);
		System.out.println("Operacao: " + operacao1);
		System.out.println("Ativo: " + ativo1);
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(obrigacao1.equals(obrigacao));
		sucesso.add(codigoSubItem1.equals(codigoSubItem));
		sucesso.add(ocurrencia1.equals(ocurrencia));
		sucesso.add(baseLegal1.equals(baseLegal));
		sucesso.add(operacao1.equals(operacao));
		sucesso.add(ativo1.equals(ativo));
		
		System.out.println(sucesso);
		
		return sucesso;
	}
}
