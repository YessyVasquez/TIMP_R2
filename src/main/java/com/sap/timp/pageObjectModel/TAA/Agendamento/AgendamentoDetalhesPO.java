package com.sap.timp.pageObjectModel.TAA.Agendamento;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class AgendamentoDetalhesPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Agendamento\"]")
	public WebElement abaAgendamento;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-s_tax_00\"]")
	public WebElement menuIcms;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnFecharPanel;
	
	public AgendamentoDetalhesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		abaAgendamento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menuIcms.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		 
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String idRegistro = idObter("Agendamento");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos de Detalhes
		String empresaString = driver.findElement(By.xpath("//div[@id=\"detail-description\"][1]/div[2]/div")).getText().trim();
		String ufString = driver.findElement(By.xpath("//div[@id=\"detail-description\"][2]/div[2]/div")).getText().trim();
		String filialString = driver.findElement(By.xpath("//div[@id=\"detail-description\"][3]/div[2]/div")).getText().trim();
		String tributoString = driver.findElement(By.xpath("//div[@id=\"detail-description\"][4]/div[2]/div")).getText().trim();
		String nomeString = driver.findElement(By.xpath("//div[@id=\"detail-description\"][5]/div[2]/div")).getText().trim();
		String statuString = driver.findElement(By.xpath("//div[@id=\"detail-description\"][7]/div[2]/div")).getText().trim();
		String tipoAgendamentoString = driver.findElement(By.xpath("//div[@id=\"detail-description\"][8]/div[2]/div")).getText().trim();
		
		System.out.println("Datos de Detalhes");
		System.out.println("Empresa: " + empresaString);
		System.out.println("UF: " + ufString);
		System.out.println("Filial: " + filialString);
		System.out.println("Tributo: " + tributoString);
		System.out.println("Nome: " + nomeString);
		System.out.println("Status: " + statuString);
		System.out.println("Tipo de Agemdamento: " + tipoAgendamentoString);
		System.out.println("");
		
		sleep(2000);
		btnFecharPanel.click();
		sleep(1000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos de visualizar
		String empresaString1 = driver.findElement(By.xpath("//div[@id=\"company\"]/div/div/div/input")).getAttribute("value").trim();
		String ufString1 = driver.findElement(By.xpath("//div[@id=\"uf\"]/div/div/div/input")).getAttribute("value").trim();
		String filialString1 = driver.findElement(By.xpath("//div[@id=\"branch\"]/div/div/div/input")).getAttribute("value").trim();
		String tributoString1 = driver.findElement(By.xpath("//div[@id=\"tax\"]/div/div/div/input")).getAttribute("value").trim();
		String nomeString1 = driver.findElement(By.xpath("//div[@id=\"name\"]/div/div/input")).getAttribute("value").trim();
		String statuString1 = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @tabindex=\"0\" and @data-id]/div[6]/div")).getText().trim();
		String tipoAgendamentoString1 = driver.findElement(By.xpath("//div[@id=\"scheduling-type\"]/div/div/input")).getAttribute("value").trim();
		
		System.out.println("Datos de Ver");
		System.out.println("Empresa: " + empresaString1);
		System.out.println("UF: " + ufString1);
		System.out.println("Filial: " + filialString1);
		System.out.println("Tributo: " + tributoString1);
		System.out.println("Nome: " + nomeString1);
		System.out.println("Status: " + statuString1);
		System.out.println("Tipo de Agemdamento: " + tipoAgendamentoString1);
		System.out.println("");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaString1.equals(empresaString));
		sucesso.add(ufString1.equals(ufString));
		sucesso.add(filialString1.equals(filialString));
		sucesso.add(tributoString1.equals(tributoString));
		sucesso.add(nomeString1.equals(nomeString));
		sucesso.add(statuString1.equals(statuString));
		sucesso.add(tipoAgendamentoString1.equals(tipoAgendamentoString));
		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}
}
