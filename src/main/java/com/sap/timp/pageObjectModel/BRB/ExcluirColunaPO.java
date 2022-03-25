package com.sap.timp.pageObjectModel.BRB;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class ExcluirColunaPO extends TestBaseSteven{

	
	@FindBy(xpath = "//*[@id=\"draggable-117\"]")
	public WebElement excluir;
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravar;
	@FindBy(xpath = "//*[@id=\"report-search\"]/div/div/input")
	public WebElement coluna;
	@FindBy(xpath = "//div[@data-id=\"117\"]")
	public WebElement cst;
	
	@FindBy(xpath = "//li[@id = \"draggable-117\"]/div/div/div[@id=\"chead\"]")
	public WebElement menuC;
	@FindBy(xpath = "//*[@id=\"basePopover-wrapper\"]/div/div/div/ul/li[6]")
	public WebElement opcionC;
	
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	
	public ExcluirColunaPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	
	public ArrayList<Boolean> DragNDrop() {
		
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		menu.click();
		sleep(100);
		opcao.click();

		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		sleep(3000);
System.out.println("paso 1");	
		Actions actions = new Actions(driver);
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		
		actions.moveToElement(excluir).perform();		
		actions.dragAndDropBy(excluir, 0, 320).perform();
		
		sleep(1000);
		
		gravar.click();
		
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		
		driver.navigate().refresh();
		
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		sleep(3000);
		List<WebElement> removido = driver.findElements(By.xpath("//*[@id=\"draggable-117\"]"));
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		if(removido.size()==0){
			sucesso.add(true);
		}
	

		sleep(1000);
		System.out.println("paso 2");	
		coluna.sendKeys("CST ICMS");

		sleep(4000);

		coluna.sendKeys("ICMS");

		
		//actions.doubleClick(cst).perform();
	
		gravar.click();
		
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		sleep(2000);
		
		System.out.println("paso3");
		List<WebElement> agregado = driver.findElements(By.xpath("//*[@id=\"draggable-117\"]"));
		
		if (agregado.size()>0) {
			sucesso.add(true);
		}
		
		sleep(2000);

		System.out.println(sucesso);
		return sucesso;
		
		
		
		
	}
	
	
	public ArrayList<Boolean> ExcluirColuna() {		

		
		Actions actions = new Actions(driver);
		
		
		actions.moveToElement(excluir).perform();
		
		sleep(1000);
	
		menuC.click();
		sleep(1000);
		
		opcionC.click();
		sleep(1000);
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		
		driver.navigate().refresh();
		
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		
		List<WebElement> removido = driver.findElements(By.xpath("//*[@id=\"draggable-117\"]"));
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		if(removido.size()==0){
			sucesso.add(true);
		}
	
		sleep(1000);

		coluna.sendKeys("ICMS");
		
		actions.doubleClick(cst).perform();
	
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		driver.navigate().refresh();
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		sleep(1000);
		List<WebElement> agregado = driver.findElements(By.xpath("//*[@id=\"draggable-117\"]"));
		
		if (agregado.size()>0) {
			sucesso.add(true);
		}
		
		sleep(2000);

		
		return sucesso;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
