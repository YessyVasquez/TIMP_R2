package com.sap.timp.pageObjectModel.ATR.Arquivos.NotaFiscalEletronicaDeEntradaDeSaida;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class NotaFiscalEletronicaDeEntradaDeSaidaFiltroPorINFNFEPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Arquivos\"]")
	public WebElement arquivos;
	
	@FindBy(xpath = "//span[text()=\"Nota Fiscal Eletrônica de Entrada e Saída\"]")
	public WebElement notafiscal;
	
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]/div")
	public WebElement infnfe;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	

	public NotaFiscalEletronicaDeEntradaDeSaidaFiltroPorINFNFEPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> filtro() {

		sleep(2000);
		arquivos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		notafiscal.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		String infnfeRegistro = infnfe.getText();
		System.out.println(infnfeRegistro + " INFNFE Registro");
		pesquisar.sendKeys(infnfeRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String infnfeBusqueda = infnfe.getText();
		System.out.println(infnfeBusqueda + " INFNFE Busqueda");
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(infnfeRegistro.equals(infnfeBusqueda));
		waitExpectElement(limpar);
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		if (rows2 > rows1) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		
		System.out.println(sucesso);

		return sucesso;

	}


}
