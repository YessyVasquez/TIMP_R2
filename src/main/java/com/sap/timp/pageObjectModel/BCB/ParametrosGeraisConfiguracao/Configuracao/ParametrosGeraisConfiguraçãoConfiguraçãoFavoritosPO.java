package com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ParametrosGeraisConfiguraçãoConfiguraçãoFavoritosPO extends TestBaseKenssy {
	// Configuracao
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][2]")
	public WebElement configuracoes;

	@FindBy(xpath = "//span[text()=\"Configuração da Consolidação\"]")
	public WebElement configuracaoDaConsolidacao;
	
	@FindBy(xpath = "//span[text()=\"Configurações Favoritas\"]")
	public WebElement configuracaoFavoritos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimo;
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-star\")]")
	public WebElement anadirAFavoritos;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	public ParametrosGeraisConfiguraçãoConfiguraçãoFavoritosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean favoritosConfiguracao() {
		
		sleep(2000);
		configuracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaoDaConsolidacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
//		ultimo.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		String idRegistro = idObter3();
		
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		
		System.out.println("Registro que cree:"+idRegistro);
		
		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id="+idRegistro+"]/div[2]/label/span"));
															//div[@class="tr" and @data-id="433"]/div[2]/label/span
		check1.click();
		sleep(1000);
		
		anadirAFavoritos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);
		
		configuracaoFavoritos.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id="+idRegistro+"]/div[4]/div")).getText();
		System.out.println("Registro favorito:"+idRegistro1);
		boolean sucesso = false;
		
	
		
		if (convertToInt(idRegistro1) == convertToInt(idRegistro)) {
			sucesso = true;
			System.out.println("soy true");
		}else {
			sucesso=false;
			System.out.println("soy false");
		}
	
		return sucesso;
	}

}
