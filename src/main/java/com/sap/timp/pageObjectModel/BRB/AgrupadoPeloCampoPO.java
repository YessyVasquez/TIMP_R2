package com.sap.timp.pageObjectModel.BRB;

import java.util.ArrayList;

import javax.naming.directory.DirContext;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.sap.timp.base.TestBaseSteven;

public class AgrupadoPeloCampoPO extends TestBaseSteven{
	
	
	
	@FindBy(xpath = "//*[@id=\"draggable-115\"]")				
	public WebElement valorICMS;
	@FindBy(xpath = "//*[@id=\"draggable-115\"]/div/div/div")				
	public WebElement menuC;
	@FindBy(xpath = "//*[@id=\"basePopover-wrapper\"]/div/div/div/ul/li[3]")				
	public WebElement agrupado;
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravar;
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[3]/button")				
	public WebElement execucao;
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button")				
	public WebElement executar;
	/*@FindBy(xpath = "//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/div[1]/span[4]")				
	public WebElement data1;*/
	
	@FindBy(xpath = "//*[@id=\"table-fixed-wrapper\"]/div[3]/div[1]/div[1]/span")				
	public WebElement data1;
	@FindBy(xpath = "//div[@data-group =\"1\"]")				
	public WebElement cfop;
	
	@FindBy(xpath = "//*[@id=\"table-fixed-wrapper\"]/div[3]/div[1]/div[1]/span[4]")				
	public WebElement data2;
	@FindBy(xpath = "//div[@data-group =\"2\"]")				
	public WebElement cfop1;
	
	@FindBy(xpath = "//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/div[1]/span[3]")				
	public WebElement data1C;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/ul/li[3]/button")				
	public WebElement edicao;
	@FindBy(xpath = "//div[text()=\"Deletar Grupo\"]")				
	public WebElement excluirGrupo;
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	
	
	public AgrupadoPeloCampoPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public void agrupar() {
		
	
		
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);

		waitExpectElement(menu);
		sleep(menuT);

		menu.click();

		opcao.click();

		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(valorICMS).perform();
		sleep(1000);
		
		menuC.click();
		sleep(1000);
		agrupado.click();
		sleep(3000);
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		execucao.click();
		sleep(8000);
		
		//waitExpectXpath("//*[@id=\"variant-toolbar\"]/div/ul/li[6]/button");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		executar.click();
		
		sleep(5000);
		//waitExpectXpath("//div[@data-group=\"1\"]/div/div[1]/span[1]/label");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		
		
		
	}
	
	public ArrayList<Boolean> sucesso() {
		
		data1.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		String cfopS = "";
		cfopS = cfop.getAttribute("data-value");
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[@data-column =\"115\" and contains(@aria-label , \"Linha: \") and contains(@aria-label , \"CFOP: "+cfopS+"\")]/div[2]")).size();
		
		int f = 1;
		for (int i = 0; i < rows; i++) {
			
			
			String cfopD = driver.findElement(By.xpath("//div[@data-column =\"115\" and contains(@aria-label , \"Linha: "+f+"\") and contains(@aria-label , \"CFOP: "+cfopS+"\")]/div[2]")).getText();
			sucesso.add(cfopS.equals(cfopD));
			System.out.println(cfopD);
			f = f+1;
		}
				
		//data1C.click();
		
		return sucesso;
		
		
		
	}
	
	public ArrayList<Boolean> sucesso2() {
		
		data2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		String cfopS = "";
		cfopS = cfop1.getAttribute("data-value");
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[@data-column =\"115\" and contains(@aria-label , \"Linha: \") and contains(@aria-label , \"CFOP: "+cfopS+"\")]/div[2]")).size();
		
		int f = 1;
		for (int i = 0; i < rows; i++) {
			
			String cfopD = driver.findElement(By.xpath("//div[@data-column =\"115\" and contains(@aria-label , \"Linha: "+f+"\") and contains(@aria-label , \"CFOP: "+cfopS+"\")]/div[2]")).getText();
			sucesso.add(cfopS.equals(cfopD));
			System.out.println(cfopD);
			
			f = f+1;
		}
				
		
		return sucesso;
		
		
		
	}
	
	public void excluirGrupo() {
		
		edicao.click();
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		excluirGrupo.click();
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");

		
		
		
	}


	
	
	
	

}
