package com.sap.timp.pageObjectModel.BRB;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class FormulaPO extends TestBaseSteven{

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//li[contains(@class,\"add-column\")]/div/div/div")
	public WebElement agregar;
	
	@FindBy(xpath = "//*[@id=\"basePopover-wrapper\"]/div/div/div/ul/li[3]")
	public WebElement campoCal;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[3]/div[2]/div/div[1]")	
	public WebElement tipoDado;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement decimal;
	@FindBy(xpath = "//div[contains(text(),\"Colunas\")]")
	public WebElement colunas;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[5]/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div/div/input")
	public WebElement pesquisa;
	
	
	@FindBy(xpath = "//div[text()=\"BC ICMS\"]")
	public WebElement bc;
	@FindBy(xpath = "//*[@id=\"formula-Box\"]/div/textarea")
	public WebElement caixa;
	
	@FindBy(xpath = "//div[text()=\"Valor ICMS\"]")
	public WebElement valor;
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//li[contains(@formula,\"BC ICMS\") and contains(@formula,\"Valor ICMS\")]/div/div/div[@id=\"chead\"]")
	public WebElement nombre;
	@FindBy(xpath = "//*[@id=\"basePopover-wrapper\"]/div/div/div/ul/li[4]")
	public WebElement cambiarNombre;
	@FindBy(xpath = "//li[contains(@formula,\"BC ICMS\") and contains(@formula,\"Valor ICMS\")]/div/div/div[@id=\"chead\"]/div/div/div/div/input")
	public WebElement suma1;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[5]/button")
	public WebElement agregarF;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div/div[1]/div[2]/div/div[1]/div[2]")
	public WebElement coluna;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement colunaO;
	
	@FindBy(xpath = "//li[contains(@column-name, \"Nova Coluna\")]/div/div/div")
	public WebElement nombre2;
	@FindBy(xpath = "//li[contains(@column-name, \"Nova Coluna\")]/div/div/div/div/div/div/div[2]/input")
	public WebElement suma2;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[3]/button")
	public WebElement execucao;
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button")
	public WebElement executar;
	

	@FindBy(xpath = "//*[@id=\"table-data-wrapper\"]")
	public WebElement tabla;
	
	
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravar;
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	
	public FormulaPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	
	public void formulaColuna() {

		
		
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

		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
	
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		
		actions.moveToElement(agregar).perform();
		
		agregar.click();
		
		List<WebElement> colunasL = driver.findElements(By.xpath("//li[contains(@id,\"draggable\")]"));
		int colunasC = contarWebElementsList(colunasL);
		
		
		WebElement formula = driver.findElement(By.xpath("//li[contains(@storage-index,\""+colunasC+"\")]/div/div/div"));

		js.executeScript("arguments[0].scrollIntoView();", formula);
		
		formula.click();
	
		campoCal.click();
		
		waitExpectXpath("//*[@id=\"browser-wrapper\"]/div/div[1]/div[2]/div[1]");
		

		tipoDado.click();
		
		decimal.click();
		
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"browser-wrapper\"]/div/div[1]/div[2]/div[3]")));
		
		colunas.click();
		
		sleep(3000);
		pesquisa.clear();
		bc.click();
		pesquisa.sendKeys("BC ICMS");
		sleep(3000);
		actions.doubleClick(bc).perform();
		caixa.sendKeys("+");
		
		pesquisa.clear();
		pesquisa.sendKeys("Valor ICMS");
		
		sleep(3000);
		
		actions.doubleClick(valor).perform();
	
		aplicar.click();
		
		sleep(2000);
	
		nombre.click();
		
		cambiarNombre.click();
		suma1.sendKeys("Suma1");
		
		
	}
	
	public void formulaBoton() {
		
		sleep(1500);

		Actions actions = new Actions(driver);
		
		
		actions.moveToElement(agregar).perform();
		
		agregar.click();
		
		agregarF.click();

		waitExpectXpath("//*[@id=\"browser-wrapper\"]/div/div[1]/div[2]/div[1]");
		
		coluna.click();
		
		colunaO.click();
		sleep(1000);
	
		tipoDado.click();
		
		decimal.click();
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id=\"browser-wrapper\"]/div/div[1]/div[2]/div[3]")));
		
		colunas.click();
		
		sleep(1000);
		
		pesquisa.sendKeys("BC ICMS");

		sleep(3000);
	
		actions.doubleClick(bc).perform();
		
		caixa.sendKeys("+");
		
		pesquisa.clear();
		pesquisa.sendKeys("Valor ICMS");
		
		sleep(3000);
		actions.doubleClick(valor).perform();
	
		aplicar.click();
		
		sleep(6000);
	
		nombre2.click();
		
		cambiarNombre.click();
		suma2.sendKeys("Suma2");

		sleep(1000);
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		execucao.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//waitExpectXpath("//*[@id=\"variant-toolbar\"]/div/ul/li[6]/button");
		
		
		executar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//sleep(2000);
		sleep(9000);
	//	waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");
		
	}
	
	
	public ArrayList<Boolean> sucesso() {
		
		
		//waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");
		sleep(3000);
		int rows = tabla.findElements(By.xpath("//div[@id =\"table-data-wrapper\"]/div[@class=\"row visible\"]")).size();
		
		int f = 1;

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		for (int i =1 ; i <= rows; i++) {
			
			
			String bc = (driver.findElement(By.xpath("//*[@id=\"table-data-wrapper\"]/div[@class=\"row visible\"]/div[@data-column=\"5\" and contains(@aria-label,\"Linha: "+f+"-\")]"))).getText();
			String bc2 = bc.replace(".", "");
			String bc3 = bc2.replace(",", ".");
			
			
			String valor = (driver.findElement(By.xpath("//*[@id=\"table-data-wrapper\"]/div[@class=\"row visible\"]/div[@data-column=\"66\" and contains(@aria-label,\"Linha: "+f+"-\")]/div[2]"))).getText();
			String valor2 = valor.replace(".", "");
			String valor3 = valor2.replace(",", ".");
			
			
			String suma1 = driver.findElement(By.xpath("//*[@id=\"table-data-wrapper\"]/div[@class=\"row visible\"]/div[contains(@aria-label,\"Linha: "+f+"-\") and contains(@aria-label,\"Suma1\")]/div[2]")).getText();
			String suma11 = suma1.replace(".", "");
			String suma12 = suma11.replace(",", ".");
			
			String suma2 = driver.findElement(By.xpath("//*[@id=\"table-data-wrapper\"]/div[@class=\"row visible\"]/div[contains(@aria-label,\"Linha: "+f+"-\") and contains(@aria-label,\"Suma2\")]/div[2]")).getText();
			String suma21 = suma2.replace(".", "");
			String suma22 = suma21.replace(",", ".");

			
			try {
				DecimalFormat df = new DecimalFormat("#.00");
				
				Double bcC = new Double(bc3);
				Double valorC = new Double(valor3);
				Double suma1C = new Double(suma12);
				Double suma2C = new Double(suma22);
				
				
				double resultado =bcC + valorC;
				
				sucesso.add(df.format(resultado).equals(df.format(suma1C)));
				sucesso.add(df.format(resultado).equals(df.format(suma2C)));
				
				 
			} catch (NumberFormatException ex) {
				System.err.println("NumberFormatException: " + ex.getMessage());
			}
						

			f = f+1;
			
			
		}
		
		return sucesso;
	
	}
		
	
}
