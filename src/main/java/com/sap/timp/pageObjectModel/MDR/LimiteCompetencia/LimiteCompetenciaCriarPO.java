package com.sap.timp.pageObjectModel.MDR.LimiteCompetencia;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;

public class LimiteCompetenciaCriarPO extends TestBaseMassiel{
	
	
	
	@FindBy(xpath = "//span[text()=\"Limite de Competência\"]")
	public WebElement limiteCompetencia;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"3000\"]/div/label/span")
	public WebElement empresaO;
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement empresaOTC2;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[2]")
	public WebElement ufFilial;
	
	@FindBy(xpath = "//div[@id=\"BA\"]/div/label/span")
	public WebElement ufFilialO;
	
	@FindBy(xpath = "//div[@id=\"AL\"]/div/label/span")
	public WebElement ufFilialOTC2;
	
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[contains(@id,\"0031\")]/div/label/span")
	public WebElement filialO;
	
	@FindBy(xpath = "//div[contains(@id,\"1000_AL_0008\")]/div/label/span")
	public WebElement filialOTC2;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"00\"]/div/label/span")
	public WebElement tributoO;
	
	@FindBy(xpath = "//div[@id=\"tax-type\"]/div/div/div[2]")
	public WebElement tipoImposto;
	
	@FindBy(xpath = "//div[@id=\"process-type\"]/div/div/div[2]")
	public WebElement tipoProcesso;
	
	@FindBy(xpath = "//div[@id=\"approval-level\"]/div/div/div[2]")
	public WebElement nivelAprovacao;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @id][2]")
	public WebElement opcao2;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Valor de\")]")
	public WebElement valorDe;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Valor até\")]")
	public WebElement valorAte;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"início\")]")
	public WebElement validadeDe;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Cenário de Correção\"]")
	public WebElement adicionacenariodecorreçao;
	
	@FindBy(xpath = "//div[@class=\"field element-2\" and @id=\"scenario-2\"]/div/div/div/div[2]")
	public WebElement cenariodecorrecao;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]")
	public WebElement opcaocenariodecorrecao;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao;
	
	
	public LimiteCompetenciaCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		String url = driver.getCurrentUrl();
		boolean tc2 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}
		
		sleep(2000);
		limiteCompetencia.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
	
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);

		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		if (tc2== true) {
			empresaOTC2.click();
			empresaOTC2.sendKeys(Keys.ESCAPE);
		}else {
			empresaO.click();
			empresaO.sendKeys(Keys.ESCAPE);
		}

		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		
		ufFilial.click();
		sleep(2000);
		if (tc2== true) {
			ufFilialOTC2.click();
			ufFilialOTC2.sendKeys(Keys.ESCAPE);
		}else {
			ufFilialO.click();
			ufFilialO.sendKeys(Keys.ESCAPE);
		}
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		
		filial.click();
		sleep(2000);
		if (tc2== true) {
			filialOTC2.click();
			filialOTC2.sendKeys(Keys.ESCAPE);
		}else {
			filialO.click();
			filialO.sendKeys(Keys.ESCAPE);
		}
		sleep(3000);
		
		tributo.click();
		sleep(2000);
		tributoO.click();
		tributoO.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"tax-type\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		
		tipoImposto.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(3000);
		
		tipoProcesso.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		actionsMoveToElementElement(nivelAprovacao);
		sleep(2000);
		
		nivelAprovacao.click();
		sleep(2000);
		opcao2.click();
		sleep(3000);
		
		valorDe.sendKeys("4000");
		valorAte.sendKeys("7000");
		
		validadeDe.sendKeys(fechaActual());
		

		
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		sleep(2000);
		
		//nao.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/div")).getText();
		
		
		idInserir("LimiteCompetencia",id2);
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
		
		
		System.out.println(sucesso);
		return sucesso;
		
	}	
	

}
