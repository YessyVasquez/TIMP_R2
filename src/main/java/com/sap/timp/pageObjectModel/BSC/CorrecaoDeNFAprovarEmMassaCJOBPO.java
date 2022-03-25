package com.sap.timp.pageObjectModel.BSC;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;

public class CorrecaoDeNFAprovarEmMassaCJOBPO extends TestBaseMassiel{
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
	
	@FindBy(xpath = "//div[@class=\"row visible\"][2]/div/span/label/span")
	public WebElement flagRegistro2;
	
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

	@FindBy(xpath = "//div[@id=\"fields-container\"]/div[1]/div[3]/div/div/input")
	public WebElement cstPIS;
	
	@FindBy(xpath = "//div[@id=\"fields-container\"]/div[2]/div[3]/div/div/input")
	public WebElement bcPIS;
	
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
	
	
	public CorrecaoDeNFAprovarEmMassaCJOBPO() {

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
			id = "8004876";
			pesquisar.sendKeys(id);
		}else if (tc2 == true) {
			id = "2131";
			pesquisar.sendKeys(id);
		}else {
			
			id = "1773";
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
		flagRegistro2.click();
		sleep(2000);
		
		String valor1 = docNum1.getText();
		System.out.println("Número de Documento Dato 1: "+ valor1);

		String valor2 = docNum2.getText();
		System.out.println("Número de Documento Dato 2: "+ valor2);
		
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

		String idNotaFiscal1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[4]/div")).getText();
		
		
		//-------------------- Dato 2
		rows = rows-1;

		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

		System.out.println("Número de Id Segundo  dato: "+ idRegistro2);

		String idNotaFiscal2 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[4]/div")).getText();
		
		boolean sucesso1 = (valor1.equals(idNotaFiscal2));
		sucesso1 = (valor2.equals(idNotaFiscal1));
		System.out.println(" El valor de Número de Documento es igual a Nota Fiscal de los dos Datos : "+ sucesso1);
		
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		

		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement Visualizar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu1.click();
		sleep(1000);
		Visualizar1.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String cstPISV2 = cstPIS.getAttribute("value");
		String  bcPISV2 = bcPIS.getAttribute("value");
		String alquotaPISV2 = alquotaPIS.getAttribute("value");
		String valorPISV2 = valorPIS.getAttribute("value");
		sleep(3000);
		
		System.out.println("--------------------SEGUNDO DATOS ENVIADO----------------------");
		System.out.println("CST PIS: "+ cstPISV2);
		System.out.println("BC PIS: "+ bcPISV2);
		System.out.println("Alíquota PIS: "+ alquotaPISV2);
		System.out.println("Valor PIS: "+ valorPISV2);


		fechar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		sleep(3000);
		
	
	
		WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro2+"\"]/div[1]/div"));
		WebElement Visualizar2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro2+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu2.click();
		sleep(1000);
		Visualizar2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String cstPISV1 = cstPIS.getAttribute("value");
		String  bcPISV1 = bcPIS.getAttribute("value");
		String alquotaPISV1 = alquotaPIS.getAttribute("value");
		String valorPISV1 = valorPIS.getAttribute("value");
		sleep(3000);
		
		System.out.println("--------------------PRIMER DATOS ENVIADO----------------------");
		System.out.println("CST PIS: "+ cstPISV1);
		System.out.println("BC PIS: "+ bcPISV1);
		System.out.println("Alíquota PIS: "+ alquotaPISV1);
		System.out.println("Valor PIS: "+ valorPISV1);

		fechar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		sleep(3000);
		
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
		
		
		
		String textocstPISExc2 =  cstPISExc2.getText();
		String textobcPISExc2 = bcPISExc2.getText();
		String textoalquotaPISExc2 = alquotaPISExc2.getText();
		String textovalorPISExc2 = valorPISExc2.getText();
		
		
		System.out.println("--------------------SEGUNDO DATO ENVIADO----------------------");
		System.out.println("CST PIS: "+ textocstPISExc2);
		System.out.println("BC PIS: "+ textobcPISExc2);
		System.out.println("Alíquota PIS: "+ textoalquotaPISExc2);
		System.out.println("Valor PIS: "+ textovalorPISExc2);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textocstPISExc2 .equals(cstPISV2));
		sucesso.add(textobcPISExc2.equals(bcPISV2));
		sucesso.add(textoalquotaPISExc2.contains(alquotaPISV2));
		sucesso.add(textovalorPISExc2.contains(valorPISV2));
		
		
		sucesso.add(textocstPISExc1 .equals(cstPISV1));
		sucesso.add(textobcPISExc1.equals(bcPISV1));
		sucesso.add(textoalquotaPISExc1.contains(alquotaPISV1));
		sucesso.add(textovalorPISExc1.contains(valorPISV1));
		System.out.println(sucesso);
		return sucesso;
	}

}
