package com.sap.timp.pageObjectModel.BSC;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;

public class CorreçãodeNFAprovarC_JOBPO extends TestBaseSteven {

	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//div[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button/span[2]")
	public WebElement executar2;

	@FindBy(xpath = "//div[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label/span")
	public WebElement check1;

	@FindBy(xpath = "//div[@id=\"table-data-wrapper\"]/div[2]/div[5]/div[2]/a")
	public WebElement docNum;

	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;

	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;

	@FindBy(xpath = "//span[text()=\"Nota Fiscal\"]")
	public WebElement notaFiscal;

	@FindBy(xpath = "//div[@class=\"accordion-main-wrapper\"]/div[3]/ul/li[1]/div[2]/ul/li[1]/div[1]/div[2]/span")
	public WebElement pendente;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//span[contains(@class,\"send\")]")
	public WebElement enviar;
	
	@FindBy(xpath = "//div[@class=\"row visible\"][1]/div/span/label/span")
	public WebElement flagRegistro;
	
	
	
	@FindBy(xpath = "//span[text()=\"Em Progresso\"]")
	public WebElement progresso;
	
	@FindBy(xpath = "//span[text()=\"Corrigido\"]")
	public WebElement Corrigido;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//div[@id=\"table-data-wrapper\"]/div[2]/div[5]/div[2]/a")
	public WebElement docNum1;

	@FindBy(xpath = "//div[@id=\"table-data-wrapper\"]/div[3]/div[5]/div[2]/a")
	public WebElement docNum2;

	
	@FindBy(xpath = "//div[@id=\"fields-container\"]/div[3]/div[3]/div/div/input")
	public WebElement alquotaPIS;
	
	@FindBy(xpath = "//div[@id=\"fields-container\"]/div[4]/div[3]/div/div/input")
	public WebElement valorPIS;
	
	@FindBy(xpath = "//div[@id=\"table-data-wrapper\"]/div[2]/div[9]/div[2]")
	public WebElement cstPISExc1;
	
	@FindBy(xpath = "//div[@id=\"table-data-wrapper\"]/div[3]/div[9]/div[2]")
	public WebElement cstPISExc2;
	
	@FindBy(xpath = "//div[@id=\"table-data-wrapper\"]/div[2]/div[10]/div[2]")
	public WebElement bcPISExc1;
	
	@FindBy(xpath = "//div[@id=\"table-data-wrapper\"]/div[3]/div[10]/div[2]")
	public WebElement bcPISExc2;
	
	@FindBy(xpath = "//div[@id=\"table-data-wrapper\"]/div[2]/div[11]/div[2]")
	public WebElement alquotaPISExc1;
	
	@FindBy(xpath = "//div[@id=\"table-data-wrapper\"]/div[3]/div[11]/div[2]")
	public WebElement alquotaPISExc2;
	
	@FindBy(xpath = "//div[@id=\"table-data-wrapper\"]/div[2]/div[12]/div[2]")
	public WebElement valorPISExc1;
	
	@FindBy(xpath = "//div[@id=\"table-data-wrapper\"]/div[3]/div[12]/div[2]")
	public WebElement valorPISExc2;
	
	
	public CorreçãodeNFAprovarC_JOBPO() {

		PageFactory.initElements(driver, this);
	}
	
	/**
	 * @return
	 */
	public ArrayList<Boolean> enviar() {
		
		AcessarBSCPO acessarBSC;
		acessarBSC = new AcessarBSCPO();
		
		AcessarBrbPO acessarBrbPO;
		 acessarBrbPO = new AcessarBrbPO();
		
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
			id = "8004767";
			pesquisar.sendKeys(id);
		}else if (tc2 == true) {
			id = "2124";
			pesquisar.sendKeys(id);
		}else {
			
			id = "1770";
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
		
		executar2.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		flagRegistro.click();
		sleep(1000);

		
		
		String valor1 = docNum1.getText();
		System.out.println("Número de Documento Dato 1: "+ valor1);

		
		enviar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		home.click();
		sleep(3000);
		waitExpectElement(nao);
		nao.click();
		sleep(3000);
		waitExpectElement(flecha);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		acessarBSC.acessarBSC();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		notaFiscal.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		progresso.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(68000);
		
		//------------ ESTO NO LO NECESITO EN TQ1

		//driver.navigate().refresh();
		//sleep(3000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//sleep(2000);
		//sleep(2000);
		//sleep(2000);
		//sleep(2000);
		//sleep(2000);
		
		
		//notaFiscal.click();
		//sleep(2000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//sleep(3000);
		
		//progresso.click();
		//sleep(3000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//sleep(68000);
		
		//Corrigido.click();
		//sleep(3000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//sleep(3000);
		//sleep(3000);
		
		
		Corrigido.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		sleep(3000);
		
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		
		//-------------------- Dato 1

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

		System.out.println("Número de Id Primer dato: "+ idRegistro1);

		
		
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		

		//---------------------------------------
		
		home.click();
		sleep(3000);
		waitExpectElement(flecha);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		acessarBrbPO.acessar();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
	
		pesquisar.sendKeys(id);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu3 = driver.findElement(By.xpath("//div[@data-id=\""+id+"\"]/div[1]/div"));
		WebElement executarB3 = driver.findElement(By.xpath("//div[@data-id=\""+id+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		
		menu3.click();
		sleep(1000);
		executarB3.click();
		sleep(3000);
		waitExpectXpath("//span[contains(@class,\"setting\")]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		executar2.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		
		String textocstPISExc1 =  cstPISExc1.getText();
		String textobcPISExc1 = bcPISExc1.getText();
		String textoalquotaPISExc1 = alquotaPISExc1.getText();
		String textovalorPISExc1 = valorPISExc1.getText();
		
		
		System.out.println("--------------------PRIMER DATO ENVIADO----------------------");
		System.out.println("CST PIS: "+ textocstPISExc1);
		System.out.println("BC PIS: "+ textobcPISExc1);
		System.out.println("Alíquota PIS: "+ textoalquotaPISExc1);
		System.out.println("Valor PIS: "+ textovalorPISExc1);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		System.out.println(sucesso);
		return sucesso;
	}
	
	
}
