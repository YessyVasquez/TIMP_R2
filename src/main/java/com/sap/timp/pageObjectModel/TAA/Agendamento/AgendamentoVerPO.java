package com.sap.timp.pageObjectModel.TAA.Agendamento;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class AgendamentoVerPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Agendamento\"]")
	public WebElement abaAgendamento;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-s_tax_00\"]")
	public WebElement menuIcms;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	public AgendamentoVerPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> ver(){
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
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos de visualizar
		String empresaString = driver.findElement(By.xpath("//div[@id=\"company\"]/div/div/div/input")).getAttribute("value").trim();
		String ufString = driver.findElement(By.xpath("//div[@id=\"uf\"]/div/div/div/input")).getAttribute("value").trim();
		String filialString = driver.findElement(By.xpath("//div[@id=\"branch\"]/div/div/div/input")).getAttribute("value").trim();
		String tributoString = driver.findElement(By.xpath("//div[@id=\"tax\"]/div/div/div/input")).getAttribute("value").trim();
		String nomeString = driver.findElement(By.xpath("//div[@id=\"name\"]/div/div/input")).getAttribute("value").trim();
		String tipoAgendamentoString = driver.findElement(By.xpath("//div[@id=\"scheduling-type\"]/div/div/input")).getAttribute("value").trim();
		String idAjusteOrigemString = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @tabindex=\"0\" and @data-id]/div[2]/div")).getText().trim();
		String codigoAjusteString = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @tabindex=\"0\" and @data-id]/div[3]/div")).getText().trim();
		String valorAjusteString = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @tabindex=\"0\" and @data-id]/div[4]/div")).getText().trim();
		String subPeriodoString = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @tabindex=\"0\" and @data-id]/div[5]/div")).getText().trim();
		String statuString = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @tabindex=\"0\" and @data-id]/div[6]/div")).getText().trim();
		
		
		System.out.println("Datos de Ver");
		System.out.println("Empresa: " + empresaString);
		System.out.println("UF: " + ufString);
		System.out.println("Filial: " + filialString);
		System.out.println("Tributo: " + tributoString);
		System.out.println("Nome: " + nomeString);
		System.out.println("Tipo de Agemdamento: " + tipoAgendamentoString);
		System.out.println("Id Ajuste Origem: " + idAjusteOrigemString);
		System.out.println("Codigo de Ajuste: " + codigoAjusteString);
		System.out.println("Valor Ajuste: " + valorAjusteString);
		System.out.println("Subperiodo: " + subPeriodoString);
		System.out.println("Status: " + statuString);
		System.out.println("");
		
		sleep(2000);
		btnBiblioteca.click();
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
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos de Editar
		String empresaString1 = driver.findElement(By.xpath("//div[@id=\"company\"]/div/div/div/input")).getAttribute("value").trim();
		String ufString1 = driver.findElement(By.xpath("//div[@id=\"uf\"]/div/div/div/input")).getAttribute("value").trim();
		String filialString1 = driver.findElement(By.xpath("//div[@id=\"branch\"]/div/div/div/input")).getAttribute("value").trim();
		String tributoString1 = driver.findElement(By.xpath("//div[@id=\"tax\"]/div/div/div/input")).getAttribute("value").trim();
		String nomeString1 = driver.findElement(By.xpath("//div[@id=\"name\"]/div/div/input")).getAttribute("value").trim();
		String tipoAgendamentoString1 = driver.findElement(By.xpath("//div[@id=\"scheduling-type\"]/div/div/input")).getAttribute("value").trim();
		String idAjusteOrigemString1 = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @tabindex=\"0\" and @data-id]/div[2]/div")).getText().trim();
		String codigoAjusteString1 = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @tabindex=\"0\" and @data-id]/div[3]/div")).getText().trim();
		String valorAjusteString1 = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @tabindex=\"0\" and @data-id]/div[4]/div")).getText().trim();
		String subPeriodoString1 = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @tabindex=\"0\" and @data-id]/div[5]/div")).getText().trim();
		String statuString1 = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[@class=\"tr\" and @tabindex=\"0\" and @data-id]/div[6]/div")).getText().trim();
		
		
		System.out.println("Datos de Editar");
		System.out.println("Empresa: " + empresaString1);
		System.out.println("UF: " + ufString1);
		System.out.println("Filial: " + filialString1);
		System.out.println("Tributo: " + tributoString1);
		System.out.println("Nome: " + nomeString1);
		System.out.println("Tipo de Agemdamento: " + tipoAgendamentoString1);
		System.out.println("Id Ajuste Origem: " + idAjusteOrigemString1);
		System.out.println("Codigo de Ajuste: " + codigoAjusteString1);
		System.out.println("Valor Ajuste: " + valorAjusteString1);
		System.out.println("Subperiodo: " + subPeriodoString1);
		System.out.println("Status: " + statuString1);
		System.out.println("");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaString1.equals(empresaString));
		sucesso.add(ufString1.equals(ufString));
		sucesso.add(filialString1.equals(filialString));
		sucesso.add(tributoString1.equals(tributoString));
		sucesso.add(nomeString1.equals(nomeString));
		sucesso.add(tipoAgendamentoString1.equals(tipoAgendamentoString));
		sucesso.add(idAjusteOrigemString1.equals(idAjusteOrigemString));
		sucesso.add(codigoAjusteString1.equals(codigoAjusteString));
		sucesso.add(valorAjusteString1.equals(valorAjusteString));
		sucesso.add(subPeriodoString1.equals(subPeriodoString));
		sucesso.add(statuString1.equals(statuString));
		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}
}
