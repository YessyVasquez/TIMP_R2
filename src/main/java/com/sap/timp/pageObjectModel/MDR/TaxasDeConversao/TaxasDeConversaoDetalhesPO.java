package com.sap.timp.pageObjectModel.MDR.TaxasDeConversao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class TaxasDeConversaoDetalhesPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Taxas de Conversão \"]")
	public WebElement taxasdeconversao;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnFecharPanel;
	
	public TaxasDeConversaoDetalhesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		taxasdeconversao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");		
		sleep(2000);
		
		String idRegistro = idObter("taxasdeconversao");
		System.out.println("");
		System.out.println("ID Registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos detalhe
		String empresa = driver.findElement(By.xpath("//div[@id=\"detail-description\"][2]/div[2]/div")).getText().trim();
		String tipoDeTaxaDeAtualizacaoString = driver.findElement(By.xpath("//div[@id=\"detail-description\"][3]/div[2]/div")).getText().trim();
		String descricaoComplementarString = driver.findElement(By.xpath("//div[@id=\"detail-description\"][4]/div[2]/div")).getText().trim();
		String taxaString = driver.findElement(By.xpath("//div[@id=\"detail-description\"][6]/div[2]/div")).getText().trim();
		String dataDeInicioDeVigencia = driver.findElement(By.xpath("//div[@id=\"detail-description\"][7]/div[2]/div")).getText().trim();
		String ativoString = driver.findElement(By.xpath("//div[@id=\"detail-description\"][9]/div[2]/div")).getText().trim();
		
		System.out.println("");
		System.out.println("DATOS DE DETALHE");
		System.out.println("Empresa: " + empresa);
		System.out.println("Tipo de Taxa de Atualizacao: " + tipoDeTaxaDeAtualizacaoString);
		System.out.println("Descricao Complementar da Taxa de Atualizacao: " + descricaoComplementarString);
		System.out.println("Taxa: " + taxaString);
		System.out.println("Data de Inicio de Vigencia: " + dataDeInicioDeVigencia);
		System.out.println("Ativo: " + ativoString);
		
		sleep(2000);
		btnFecharPanel.click();
		sleep(1000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos detalhe
		String empresaString1 = driver.findElement(By.xpath("//span[@id=\"codCompany\"]")).getText().trim();
		String tipoDeTaxaDeAtualizacaoString1 = driver.findElement(By.xpath("//span[@id=\"rateType\"]")).getText().trim();
		String descricaoComplementarString1 = driver.findElement(By.xpath("//span[@id=\"rateDescription\"]")).getText().trim();
		String taxaString1 = driver.findElement(By.xpath("//span[@id=\"rate\"]")).getText().trim();
		String dataDeInicioDeVigencia1 = driver.findElement(By.xpath("//span[@id=\"validFrom\"]")).getText().trim();
		String ativoString1 = driver.findElement(By.xpath("//span[@id=\"active\"]")).getText().trim();
		
		System.out.println("");
		System.out.println("DATOS DE VISUALIZAR");
		System.out.println("Tipo de Taxa de Atualizacao: " + tipoDeTaxaDeAtualizacaoString1);
		System.out.println("Descricao Complementar da Taxa de Atualizacao: " + descricaoComplementarString1);
		System.out.println("Taxa: " + taxaString1);
		System.out.println("Data de Inicio de Vigencia: " + dataDeInicioDeVigencia1);
		System.out.println("Ativo: " + ativoString1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaString1.equals(empresa));
		sucesso.add(tipoDeTaxaDeAtualizacaoString1.equals(tipoDeTaxaDeAtualizacaoString));
		sucesso.add(descricaoComplementarString1.equals(descricaoComplementarString));
		sucesso.add(taxaString1.equals(taxaString));
		sucesso.add(dataDeInicioDeVigencia1.equals(dataDeInicioDeVigencia));
		sucesso.add(ativoString1.equals(ativoString));
		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}
}
