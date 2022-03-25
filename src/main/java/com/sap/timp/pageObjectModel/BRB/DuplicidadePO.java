package com.sap.timp.pageObjectModel.BRB;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DuplicidadePO extends TestBaseSteven {
	
	@FindBy(xpath = "//*[@id=\"draggable-28\"]")				
	public WebElement mover;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")				
	public WebElement gravar;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[6]/button/span")				
	public WebElement btnDuplicidade;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[1]")				
	public WebElement btnCancelar;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Campo de Período\"]")				
	public WebElement inputPerido;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")				
	public WebElement opcPeriodo;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[2]/div/div/label/span")				
	public WebElement flag;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[3]/div[2]/div/div[1]/span")				
	public WebElement calendario;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/div[2]/div[1]/div[3]/div[13]")				
	public WebElement seleccionCalendario;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/button[2]")				
	public WebElement aplicar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")				
	public WebElement aplicar2;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Coluna do relatório\"]")				
	public WebElement campos;
	
	@FindBy(xpath = "//*[@id=\"COD_NAT\"]/div[1]/label/span")				
	public WebElement opcCampos;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[3]/button/span[2]")				
	public WebElement btnExecucao;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button/span[2]")				
	public WebElement btnExecutar;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/ul/li[3]/button/span[2]")				
	public WebElement btnEdicao;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div/label/span")				
	public WebElement flagExcluir;
	
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement e;
	
	public DuplicidadePO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean editar() {
		
		String url = driver.getCurrentUrl();
		
		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		if (tc2==true) {
			waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");
			ferramenta.sendKeys("2278");
			ferramenta.sendKeys(Keys.ENTER);
			
		}else if (tq1==true) {
			waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");
			ferramenta.sendKeys("8005134");
			ferramenta.sendKeys(Keys.ENTER);
			
		}else {
			waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");
			ferramenta.sendKeys("1745");
			ferramenta.sendKeys(Keys.ENTER);
			
		}
		
		
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//waitExpectElement(menu);
		//sleep(menuT);

		menu.click();

		opcao.click();

		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		btnDuplicidade.click();
		sleep(2000);
		
		btnCancelar.click();
		sleep(3000);
		
		btnDuplicidade.click();
		sleep(2000);
		
		inputPerido.click();
		sleep(2000);
		
		opcPeriodo.click();
		sleep(2000);
		
		flag.click();
		sleep(2000);
		
//		calendario.click();
//		sleep(2000);
//		
//		seleccionCalendario.click();
//		sleep(2000);
//		
//		aplicar.click();
//		sleep(1000);
		
		campos.click();
		sleep(2000);
		
		opcCampos.click();
		sleep(2000);
		
		opcCampos.sendKeys(Keys. ESCAPE);
		sleep(2000);
		
		aplicar2.click();
		sleep(1000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnExecucao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		btnExecutar.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		btnEdicao.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		btnDuplicidade.click();
		sleep(2000);
		
		waitExpectElement(flagExcluir);
		
		flagExcluir.click();
		sleep(2000);
		
		aplicar2.click();
		sleep(4000);
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		boolean sucesso = true;
		
		
		return sucesso;
		
		
		
		
	}

}
