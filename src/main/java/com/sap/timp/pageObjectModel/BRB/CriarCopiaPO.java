package com.sap.timp.pageObjectModel.BRB;



import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class CriarCopiaPO extends TestBaseSteven{
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[4]/button")
	public WebElement biblioteca;
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[5]")
	public WebElement copiar;
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement gravar;
	@FindBy(xpath = "//li[@id=\"draggable-28\"]/div/div/div/div[3]/span")
	public WebElement filtroE;
	@FindBy(xpath = "//li[@id=\"draggable-193\"]/div/div/div/div[3]/span")
	public WebElement filtroUF;
	@FindBy(xpath = "//li[@id=\"draggable-30\"]/div/div/div/div[3]/span")
	public WebElement filtroF;
	@FindBy(xpath = "//li[@id=\"draggable-21\"]/div/div/div/div[3]/span")
	public WebElement filtroDa;
	@FindBy(xpath = "//*[@id=\"draggable-28\"]")
	public WebElement empresa;
	@FindBy(xpath = "//*[@id=\"draggable-193\"]")
	public WebElement ufFilial;
	@FindBy(xpath = "//*[@id=\"draggable-30\"]")
	public WebElement filial;
	@FindBy(xpath = "//*[@id=\"draggable-21\"]")
	public WebElement dataLan;
	@FindBy(xpath = "//*[@id=\"draggable-31\"]")
	public WebElement docnum;
	@FindBy(xpath = "//*[@id=\"draggable-8\"]")
	public WebElement categoria;
	@FindBy(xpath = "//*[@id=\"draggable-79\"]")
	public WebElement valor;
	@FindBy(xpath = "//*[@id=\"draggable-129\"]")
	public WebElement cod;
	@FindBy(xpath = "//*[@id=\"draggable-115\"]")
	public WebElement cfop;
	@FindBy(xpath = "//*[@id=\"draggable-117\"]")
	public WebElement cst;
	@FindBy(xpath = "//*[@id=\"draggable-5\"]")
	public WebElement bc;
	@FindBy(xpath = "//*[@id=\"draggable-171\"]")
	public WebElement aliquota;
	@FindBy(xpath = "//*[@id=\"draggable-66\"]")
	public WebElement valorICMS;
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement pesquisar;
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[2]/label/span")
	public WebElement check;
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[1]/div/div/ul/li[4]/button")
	public WebElement eliminar;
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement sim;
	@FindBy(xpath = "//*[@id=\"acc-reports\"]/ul/li[8]")
	public WebElement lixeira;
	
	
	@FindBy(xpath = "//span[text()=\"Relatórios\"]")
	public WebElement relatorios;
	
	
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	public CriarCopiaPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public ArrayList<Boolean> copiar() {
		
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//waitExpectElement(menu);
		//sleep(menuT);

		menu.click();
		sleep(1000);
		opcao.click();

		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		sleep(3000);
	
		biblioteca.click();
		
		
		invisibilityOfElementOverlay();
		sleep(2000);
		
		relatorios.click();
		
		invisibilityOfElementOverlay();

		WebElement menu = driver.findElement(By.xpath("//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div"));
		menu.click();
		
		copiar.click();
		
		waitExpectXpath("//*[@id=\"create-copy\"]/div/div[1]/input");
		
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(filtroE.isDisplayed());		
		sucesso.add(filtroUF.isDisplayed());	
		sucesso.add(filtroF.isDisplayed());
		sucesso.add(filtroDa.isDisplayed());	
		sucesso.add(empresa.isDisplayed());
		sucesso.add(ufFilial.isDisplayed());
		sucesso.add(filial.isDisplayed());
		sucesso.add(dataLan.isDisplayed());
		sucesso.add(docnum.isDisplayed());
		sucesso.add(categoria.isDisplayed());
		sucesso.add(valor.isDisplayed());
		sucesso.add(cod.isDisplayed());
		sucesso.add(cfop.isDisplayed());
		//sucesso.add(cst.isDisplayed());
		sucesso.add(bc.isDisplayed());
		sucesso.add(aliquota.isDisplayed());
		sucesso.add(valorICMS.isDisplayed());
		
			
		sleep(2000);
		
		
		return sucesso;		

	}
	
	public void eliminarCopia() {
		
		biblioteca.click();
		
		invisibilityOfElementOverlay();
		
		sleep(2000);
		
		relatorios.click();
		
		invisibilityOfElementOverlay();
		
		
		String id = driver.findElement(By.xpath("//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[6]")).getText();
		System.out.println(id);
		
		
		pesquisar.clear();
		pesquisar.sendKeys("Cópia de "+id);
		pesquisar.sendKeys(Keys.ENTER);
	
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		check.click();
		
		eliminar.click();
		
		waitExpectElement(sim);
		sleep(3000);
		sim.click();
				
		invisibilityOfElementOverlay();
		
		fecharMensagens("//*[@id=\"toast-wrapper\"]/ul/li[2]/div/span[3]", "//*[@id=\"toast-wrapper\"]/ul/li[2]/div/span[3]");	
	
		sleep(5000);
	
		lixeira.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[2]");
		//waitExpectXpath("//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[4]/span");

	
		lixeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//sleep(7000);
		
		
	
		pesquisar.sendKeys("Cópia de "+id);
		pesquisar.sendKeys(Keys.ENTER);
		ferramenta.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[2]");
		//waitExpectXpath("//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[1]/div");
		//sleep(menuT);
		
		check.click();
		
		eliminar.click();
		waitExpectElement(sim);
		sleep(3000);
		
		sim.click();
		//sleep(menuT);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	}
	

}
