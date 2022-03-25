package com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegraDeCampos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RegraDeCamposVerPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Atribuições de Regras\"]")
	public WebElement abaAtribucoesDeRegras;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-00\"]")
	public WebElement icms;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-rulesLvl2_00\"]")
	public WebElement regrasDeCampos;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement btnFechar;
	
	public RegraDeCamposVerPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> ver() {
		invisibilityOfElementOverlay();
		abaAtribucoesDeRegras.click(); 
		invisibilityOfElementOverlay();
		
		icms.click();
		sleep(2000);
		
		regrasDeCampos.click();
		invisibilityOfElementOverlay();
		
		btnUltimaPagina.click();
		invisibilityOfElementOverlay();
		
		String idRegistro = idObter("RegraDeCampos");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		String URL = driver.getCurrentUrl();
		
		// Datoss de Ver
		waitExpectXpath("//div[@id=\"rule-type\"]/div/div/div/input");
		attributoNotToBeEmptyXpath("//div[@id=\"rule-type\"]/div/div/div/input", "value");
		String tipoDeRegraString = driver.findElement(By.xpath("//div[@id=\"rule-type\"]/div/div/div/input")).getAttribute("value").trim();
		String tributoString = driver.findElement(By.xpath("//div[@id=\"rule-tax\"]/div/div/div/input")).getAttribute("value").trim();
		String empresaString = driver.findElement(By.xpath("//div[@id=\"rule-company\"]/div/div/div/div/div/div[1]")).getText().trim();
		String ufString = driver.findElement(By.xpath("//div[@id=\"rule-state\"]/div/div/div/div/div/div[1]")).getText().trim();
		String filialString = driver.findElement(By.xpath("//div[@id=\"rule-branch\"]/div/div/div/div/div/div[1]")).getText().trim();
		String regraDeAbasString = driver.findElement(By.xpath("//div[@id=\"rule-type-1-container\"]/div/div/div/div/input")).getAttribute("value").trim();
		String regraString = "";
		
		if(URL.contains("tp1")) {
			regraString = driver.findElement(By.xpath("//div[@id=\"rule-rule\"]/div/div/div/input")).getAttribute("value").trim();
		}else {
			regraString = driver.findElement(By.xpath("//div[@id=\"rule-rule\"]/div/div/input")).getAttribute("value").trim();
		}
		
		
		System.out.println("Datos de ver");
		System.out.println("Tipo de Regra: " + tipoDeRegraString);
		System.out.println("Tributo: " + tributoString);
		System.out.println("Empresa: " + empresaString);
		System.out.println("UF: " + ufString);
		System.out.println("Filial: " + filialString);
		System.out.println("Regra de Abas: " + regraDeAbasString);
		System.out.println("Regra: " + regraString);
		
		sleep(1000);
		btnFechar.click();
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);
		
		// Datoss de Editar
		waitExpectXpath("//div[@id=\"rule-type\"]/div/div/div/input");
		attributoNotToBeEmptyXpath("//div[@id=\"rule-type\"]/div/div/div/input", "value");
		String tipoDeRegraString1 = driver.findElement(By.xpath("//div[@id=\"rule-type\"]/div/div/div/input")).getAttribute("value").trim();
		String tributoString1 = driver.findElement(By.xpath("//div[@id=\"rule-tax\"]/div/div/div/input")).getAttribute("value").trim();
		String empresaString1 = driver.findElement(By.xpath("//div[@id=\"rule-company\"]/div/div/div/div/div/div[1]")).getText().trim();
		String ufString1 = driver.findElement(By.xpath("//div[@id=\"rule-state\"]/div/div/div/div/div/div[1]")).getText().trim();
		String filialString1 = driver.findElement(By.xpath("//div[@id=\"rule-branch\"]/div/div/div/div/div/div[1]")).getText().trim();
		String regraDeAbasString1 = driver.findElement(By.xpath("//div[@id=\"rule-type-1-container\"]/div/div/div/div/input")).getAttribute("value").trim();
		String regraString1 = "";
		
		if(URL.contains("tp1")) {
			regraString1 = driver.findElement(By.xpath("//div[@id=\"rule-rule\"]/div/div/div/input")).getAttribute("value").trim();
		}else {
			regraString1 = driver.findElement(By.xpath("//div[@id=\"rule-rule\"]/div/div/input")).getAttribute("value").trim();
		}
		
		System.out.println("");
		System.out.println("Datos de Editar");
		System.out.println("Tipo de Regra: " + tipoDeRegraString1);
		System.out.println("Tributo: " + tributoString1);
		System.out.println("Empresa: " + empresaString1);
		System.out.println("UF: " + ufString1);
		System.out.println("Filial: " + filialString1);
		System.out.println("Regra de Abas: " + regraDeAbasString1);
		System.out.println("Regra: " + regraString1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(tipoDeRegraString1.equals(tipoDeRegraString));
		sucesso.add(tributoString1.equals(tributoString));
		sucesso.add(empresaString1.equals(empresaString));
		sucesso.add(ufString1.equals(ufString));
		sucesso.add(filialString1.equals(filialString));
		sucesso.add(regraDeAbasString1.equals(regraDeAbasString));
		sucesso.add(regraString1.equals(regraString));
		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}
}
