package com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import com.sap.timp.base.TestBaseKenssy;

public class ParametrosGeraisConfiguraçãoConfiguraçãoRaizPO extends TestBaseKenssy{

	// Configuracao
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][2]")
	public WebElement configuracoes;

	@FindBy(xpath = "//span[text()=\"Configuração da Consolidação\"]")
	public WebElement configuracaoDaConsolidacao;

	@FindBy(xpath = "//*[@id=\"nav-configurations-folders-wrapper\"]/div/div/div[1]")
	public WebElement configuracaoRaiz;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimo;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	public ParametrosGeraisConfiguraçãoConfiguraçãoRaizPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean raizConfiguracao() {
		sleep(2000);
		configuracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracaoRaiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter3();
	
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		System.out.println("Registro que cree:"+idRegistro);
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id="+idRegistro+"]/div[4]/div")).getText();
		System.out.println(idRegistro1);
		
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
