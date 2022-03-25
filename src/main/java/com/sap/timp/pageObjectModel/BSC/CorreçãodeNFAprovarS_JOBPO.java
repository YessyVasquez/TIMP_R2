package com.sap.timp.pageObjectModel.BSC;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CorreçãodeNFAprovarS_JOBPO extends TestBaseSteven{
	

	@FindBy(xpath = "//div[@class=\"right-content\"]/div/div/div/ul/li/button/span[text()=\"Executar\"]")
	public WebElement executarE;

	@FindBy(xpath = "//div[@class=\"row visible\"][1]/div/span/label/span")
	public WebElement flagRegistro;
	


	@FindBy(xpath = "//span[contains(@class,\"send\")]")
	public WebElement enviar;

	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;
	
	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//*[@id=\"create-name\"]/div/div/input")
	public WebElement nomeVariante;

	@FindBy(xpath = "//span[text()=\"Nota Fiscal\"]")
	public WebElement notaFiscal;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"accordion-main-wrapper\"]/div[3]/ul/li[1]/div[2]/ul/li[1]/div[1]/div[2]/span")
	public WebElement pendente;
	
	@FindBy(xpath = "//ul[@class=\"accordion\" and @style]/li/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividadesO;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	public CorreçãodeNFAprovarS_JOBPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> enviar() {
		AcessarBSCPO acessarBSC;
		acessarBSC = new AcessarBSCPO();
		
		String url = driver.getCurrentUrl();
		
		boolean tq1 = false;
		boolean tp1 = false;
		boolean tc2 = false;
		
		if (url.contains("tq1")) {
			tq1 = true;
		}else if (url.contains("tc2")) {
			tc2 = true;
		}else {
			tp1 = true;
		}
		String id = "";
		
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");
		
		if (tq1 == true) {
			id = "8004766";
			pesquisar.sendKeys(id);
		}else if (tc2 == true) {
			id = "2123";
			pesquisar.sendKeys(id);
		}else {
			
			id = "1769";
			pesquisar.sendKeys(id);
		}
		
		
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+id+"\"]/div[1]/div"));
		WebElement executarB = driver.findElement(By.xpath("//div[@data-id=\""+id+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		menu.click();
		sleep(1000);
		executarB.click();
		sleep(3000);
		waitExpectXpath("//span[contains(@class,\"setting\")]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		
		executarE.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		flagRegistro.click();
		sleep(1000);
	
		enviar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		home.click();
		sleep(3000);
		waitExpectElement(sim);
		sim.click();
		sleep(3000);
		nomeVariante.sendKeys("testeQA");
		sleep(3000);
		
		aplicar.click();
		sleep(1000);
		waitExpectElement(flecha);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		acessarBSC.acessarBSC();
		
		notaFiscal.click();
		sleep(2000);
		pendente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		//////////////
		WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+id+"\"]/div[1]/div"));
		WebElement aprovar = driver.findElement(By.xpath("//div[@data-id=\""+id+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		menu.click();
		sleep(1000);
		aprovar.click();
		sleep(3000);
		waitExpectXpath("//span[contains(@class,\"setting\")]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		aprovar.click();
		sleep(1000);
		
		
		
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		
		String idBSC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		
		String cenario = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[15]/div")).getText();
		String hierarquia = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[15]/div")).getText();
		
		System.out.println(idBSC);
		System.out.println(cenario);
		System.out.println(hierarquia);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(cenario.contains("NÃO MEXER"));
		sucesso.add(hierarquia.contains("NÃO MEXER"));
		
		System.out.println(sucesso);
		
		driver.navigate().refresh();
		sleep(3000);
		
		waitExpectElement(pesquisar);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		pesquisar.sendKeys(idBSC);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();
		String idBusqueda = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		
		sucesso.add(idBusqueda.equals(idBSC));
		
		System.out.println(sucesso);
		sleep(2000);

		return sucesso;

	}

}
