package com.sap.timp.pageObjectModel.BRB;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class FiltroColunasPO  extends TestBaseSteven{
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[4]")
	public WebElement opcao;

	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;

	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;

	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button")
	public WebElement executar;
	
	
	@FindBy(xpath ="//*[@id=\"table-report-container\"]/div[1]/div[10]/span")
	 public WebElement colunaOpcao;

	@FindBy(xpath ="//div[@class=\"column-filter visible\"]/input")
	 public WebElement cfop;

	@FindBy(xpath ="//*[@id=\"basePopover-wrapper\"]/div/div/div/div[6]/div/div/div/input")
	 public WebElement pesquisar;

	@FindBy(xpath ="//div[@data-shcolumn=\"115\" and @class =\"option option-filters\"]/div/input")
	 public WebElement resultado;
	
	
	
	

	@FindBy(xpath ="//div[@data-shcolumn=\"115\" and @class =\"option option-select-all\"]/div/label/span")
	 public WebElement desmarcar;

	@FindBy(xpath ="//div[@data-shcolumn=\"115\" and @class =\"option option-filters\"]/div[@class=\"column-filter visible\"]/label/span")
	 public WebElement selecionar;

	@FindBy(xpath ="//*[@id=\"column-filters-apply\"]")
	 public WebElement aplicar;

	@FindBy(xpath ="//div[@data-shcolumn=\"115\" and @class =\"option option-filters\"]/div[2]/input")
	 public WebElement resultado2;

	@FindBy(xpath ="//div[@class=\"column-filter visible\"][2]/input")
	 public WebElement cfop2;
/*
	@FindBy(xpath ="//*[@id=\"table-report-container\"]/div[1]/div[10]/span")
	 public WebElement colunaOpcao;

	@FindBy(xpath ="//*[@id=\"table-report-container\"]/div[1]/div[10]/span")
	 public WebElement colunaOpcao;

	*/
	
	
	
	
	public FiltroColunasPO() {

		PageFactory.initElements(driver, this);
	}
	
	//cenario 1
	String cfopG = "";
	public boolean filtroFerramenta() {
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		//waitExpectElement(menu);
		//sleep(menuT);

		menu.click();

		opcao.click();

		waitExpectXpath("//*[@id=\"variant-toolbar\"]/div/ul/li[6]/button");
	
		executar.click();
		sleep(8000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");
		
		//actionsMoveToElementXpath("//div[@data-column=\"5\" and not(@data-path)]");
		colunaOpcao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String cfopV = (cfop.getAttribute("value"));
		System.out.println(cfopV + " Valor Obtenido");
		desmarcar.click();
		sleep(1000);
		pesquisar.sendKeys(cfopV);
		pesquisar.sendKeys(Keys.ENTER);
		
		String resultadoS = "";
		resultadoS = resultado.getAttribute("value");
		cfopG = resultadoS;
		System.out.println(cfopG + " Resultado Búsqueda");

		boolean sucesso = false;
		sucesso = resultadoS.equals(cfopV);
		System.out.println(sucesso + "Filtro Coluna");
		
		
		
		return sucesso;
		
		
	
	}
	
	
	public ArrayList<Boolean> aplicar() {
		
		selecionar.click();
		sleep(1000);
		aplicar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");

		int rows = driver.findElements(By.xpath("//div[@id =\"table-data-wrapper\"]/div[@class=\"row visible\"]")).size();
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		for (int i = 0; i < rows; i++) {
			
			
			String cfop = (driver.findElement(By.xpath("//div[@id=\"table-data-wrapper\"]/div[@class=\"row visible\"]/div[@data-column=\"115\" and contains(@aria-label, \"Linha: 1-\")]/div[contains(@style,\"text-overflow\")]")).getText());

			sucesso.add(cfop.equals(cfopG));
			
		}
		return sucesso;
		
	
	}
	
	//cenario 2
	
	
	public boolean filtroFerramenta2() {
		actionsMoveToElementXpath("//div[@data-column=\"5\" and not(@data-path)]");
		
		colunaOpcao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		selecionar.click();
		String cfopV = (cfop2.getAttribute("value"));
		System.out.println(cfopV + " Valor Obtenido");
		sleep(1000);
		pesquisar.sendKeys(cfopV);
		pesquisar.sendKeys(Keys.ENTER);
		
		String resultadoS = "";
		resultadoS = resultado2.getAttribute("value");
		System.out.println(resultadoS + " Resultado Búsqueda");
		cfopG = resultadoS;

		boolean sucesso = false;
		sucesso = resultadoS.equals(cfopV);
		System.out.println(sucesso);
		
		
		return sucesso;
		
		
	
	}

	
	public ArrayList<Boolean> aplicar2() {
		
	
		sleep(3000);
		selecionar.click();
		sleep(3000);
		aplicar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");

		int rows = driver.findElements(By.xpath("//div[@id =\"table-data-wrapper\"]/div[@class=\"row visible\"]")).size();
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		for (int i = 0; i < rows; i++) {
			
			String cfop = (driver.findElement(By.xpath("//div[@id=\"table-data-wrapper\"]/div[@class=\"row visible\"]/div[@data-column=\"115\" and contains(@aria-label, \"Linha: 1-\")]/div[contains(@style,\"text-overflow\")]")).getText());
			sucesso.add(cfop.equals(cfopG));
			
		}
		return sucesso;
		
	
	}
	
	
	
	
	

	
	
}
