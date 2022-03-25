package com.sap.timp.pageObjectModel.BCB.ParametrosGeraisHierarquia.Hierarquia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class ParametrosGeraisHierarquiaDetalhePO extends TestBaseFernando {
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][1]")
	public WebElement hierarquias;

	@FindBy(xpath = "//span[text()=\"Hierarquia de Configuração\"]")
	public WebElement hierarquiaConfiguracao;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnFecharPanel;

	public ParametrosGeraisHierarquiaDetalhePO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean hierarquiaDetalhe() {
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		hierarquias.click();
		sleep(1100);
		
		hierarquiaConfiguracao.click();
		
		sleep(5000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter1();
		System.out.println("Id Registro: " + idRegistro);
		System.out.println("");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement opca = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		opca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos de Detalhe
		String nomeHierarquia = driver.findElement(By.xpath("//div[@id=\"detail-description\"][1]/div/div")).getText().trim();
		System.out.println("------------------- DATOS DE DETALHE ------------------------");
		System.out.println("Nome Hierarquia: " + nomeHierarquia);
		System.out.println("");
		
		btnFecharPanel.click();
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		opca = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		opca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		// Datos de Visualizar
		String nomeHierarquia1 = driver.findElement(By.xpath("//div[@id=\"hierarchy-name\"]/div/div/input")).getAttribute("value").trim();
		System.out.println("------------------- DATOS DE VISUALIZAR ------------------------");
		System.out.println("Nome Hierarquia: " + nomeHierarquia);
		System.out.println("");
		
		boolean sucesso = false;
		
		if(nomeHierarquia1.equals(nomeHierarquia)) {
			sucesso = true;
			System.out.println("Nomes de hierarquia iguales...");
		} else {
			System.out.println("Nomes de hierarquia no son iguales...");
		}
		
		System.out.println(sucesso);
		return true;
	}
}
