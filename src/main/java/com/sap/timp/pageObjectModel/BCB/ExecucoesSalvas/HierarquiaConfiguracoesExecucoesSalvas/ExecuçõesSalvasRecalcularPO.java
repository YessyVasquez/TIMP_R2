package com.sap.timp.pageObjectModel.BCB.ExecucoesSalvas.HierarquiaConfiguracoesExecucoesSalvas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ExecuçõesSalvasRecalcularPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Execuções\"]")
	public WebElement execucoes;
	
	@FindBy(xpath = "//span[text()=\"Execução da Consolidação\"]")
	public WebElement cosolidacaoExecucoes;

	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;

	@FindBy(xpath = "//div[@id=\"companyFilter\"]/div/div/div[2]")
	public WebElement empresa;

	@FindBy(xpath = "//div[@id=\"companyFilter\"]/div/div/div/input")
	public WebElement empresaOPC;

	@FindBy(xpath = "//div[@id=\"ufFilter\"]/div/div/div[2]")
	public WebElement uf;

	@FindBy(xpath = "//div[@id=\"ufFilter\"]/div/div/div/input")
	public WebElement ufOPC;

	@FindBy(xpath = "//div[@id=\"branchFilter\"]/div/div/div[2]")
	public WebElement filial;

	@FindBy(xpath = "//div[@id=\"branchFilter\"]/div/div/div/input")
	public WebElement filialOPC;

	@FindBy(xpath = "//span[text()=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//div[@id=\"search-input\"]/div/div/input")
	public WebElement pesquisarID;

	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement limpiar;
	
	@FindBy(xpath = "//*[@id=\"main-content\"]/div/div/div/div/div[1]/div/div[1]/div/div/ul/li[12]/button")
	public WebElement recalcular;

	String textEmpresa = "";
	String textUf = "";
	String textFilial = "";

	public ExecuçõesSalvasRecalcularPO() {

		PageFactory.initElements(driver, this);
	}

	public Boolean Filtros() {


		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;
		boolean tq2  = false;
		
		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}else if(url.contains("tq2")){
			tq2 = true;
		}
		
		execucoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		cosolidacaoExecucoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		if (tq1==true) {
			pesquisarID.sendKeys("2986");
			sleep(1000);
			
			pesquisarID.sendKeys(Keys.ENTER);
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}else if (tp1==true) {
			pesquisarID.sendKeys("1283");
			sleep(1000);
			
			pesquisarID.sendKeys(Keys.ENTER);
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}else if (tc2==true) {
			pesquisarID.sendKeys("925");
			sleep(1000);
			
			pesquisarID.sendKeys(Keys.ENTER);
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}else {
			pesquisarID.sendKeys("2986");
			sleep(1000);
			
			pesquisarID.sendKeys(Keys.ENTER);
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		String rows =  driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[4]")).getText();
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+rows+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+rows+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		 
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);
		
		recalcular.click();
		sleep(4000);
		Boolean sucesso= true;
		
		System.out.println(sucesso);
		return sucesso;
		
		

	}

}
