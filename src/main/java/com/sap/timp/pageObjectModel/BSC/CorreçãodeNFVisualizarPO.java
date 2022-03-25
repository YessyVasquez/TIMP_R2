package com.sap.timp.pageObjectModel.BSC;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.BRE.AcessarBREPO;

public class CorreçãodeNFVisualizarPO extends TestBaseMassiel  {
	
	@FindBy(xpath = "//div[@class=\"right-content\"]/div/div/div/ul/li/button/span[text()=\"Executar\"]")
	public WebElement executarE;

	@FindBy(xpath = "//div[@class=\"row visible\"][1]/div/span/label/span")
	public WebElement flagRegistro;

	@FindBy(xpath = "//div[@class=\"row visible\"][2]/div/span/label/span")
	public WebElement flagRegistro2;

	@FindBy(xpath = "//span[contains(@class,\"send\")]")
	public WebElement enviar;

	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;

	@FindBy(xpath = "//div[@class=\"dragger-pagination-right\"]")
	public WebElement flecha;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;

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

	@FindBy(xpath = "//span[text()=\"Relatórios de Outputs\"]")
	public WebElement relatorios;

	@FindBy(xpath = "//div[@id=\"table-data-wrapper\"]/div[2]/div[5]/div[2]/a")
	public WebElement docNum1;
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N2\"]")
	public WebElement regraN2;
	
	//para obterner el svg
	
	@FindBy(xpath = "//div[@id=\"graph\"]//*[name()=\"svg\"]/*[name()=\"g\"][1]/*[name()=\"g\"][1]")
	public WebElement regra;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div[2]/button")
	public WebElement mas;
	
	@FindBy(xpath = "//div[@class=\"scenario-container\"]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div/div/div[2]/input")
	public WebElement cstPIS;
	
	@FindBy(xpath = "//div[@class=\"scenario-container\"]/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/div/div[2]/input")
	public WebElement bcPIS;
	
	@FindBy(xpath = "//div[@class=\"scenario-container\"]/div[2]/div[3]/div[2]/div[1]/div/div/div[2]/div/div/div[2]/input")
	public WebElement alquotaPIS;
	
	@FindBy(xpath = "//div[@class=\"scenario-container\"]/div[2]/div[4]/div[2]/div[1]/div/div/div[2]/div/div/div[2]/input")
	public WebElement valorPIS;
	
	@FindBy(xpath = "/html/body/div[4]/div/div[3]/button[1]")
	public WebElement cancelar;
	
	@FindBy(xpath = "//div[@id=\"fields-container\"]/div[1]/div[3]/div/div/input")
	public WebElement cstPISV;
	
	@FindBy(xpath = "//div[@id=\"fields-container\"]/div[2]/div[3]/div/div/input")
	public WebElement bcPISV;
	
	@FindBy(xpath = "//div[@id=\"fields-container\"]/div[3]/div[3]/div/div/input")
	public WebElement alquotaPISV;
	
	@FindBy(xpath = "//div[@id=\"fields-container\"]/div[4]/div[3]/div/div/input")
	public WebElement valorPISV;
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar1;
	
	@FindBy(xpath = "//div[text()=\"BSC\"]")
	public WebElement bSC;

	public CorreçãodeNFVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> Visualizar() {
		
		
		
		AcessarBREPO acessarBREPO;
		acessarBREPO = new AcessarBREPO();

		AcessarBSCPO acessarBSC;
		acessarBSC = new AcessarBSCPO();
		
		String url = driver.getCurrentUrl();

		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		relatorios.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

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

		}else if (tc2 == true) {
			id = "2123";

		}else {

			id = "1769";

		}


		System.out.println("Id Buscando : "+ id);

		pesquisar.sendKeys(id);
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
		sleep(2000);


		executarE.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String valor1 = docNum1.getText();
		System.out.println("Número de Documento Dato 1: "+ valor1);

		flagRegistro.click();
		sleep(1000);
		
		
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
		sleep(2000);
		
		acessarBREPO.acessarBRE();
		
		regraN2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idR = "";
		pesquisar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		if (tq1 == true) {
			idR = "2049";
			System.out.println("Id Buscando : "+ idR);
			pesquisar.sendKeys(idR);

		}else if (tc2 == true) {
			idR = "1160";
			System.out.println("Id Buscando : "+ idR);
			pesquisar.sendKeys(idR);

		}else {

			idR = "1037";
			System.out.println("Id Buscando : "+ idR);

			pesquisar.sendKeys(idR);

		}

		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idR+"\"]/div[1]/div"));
		WebElement Editar = driver.findElement(By.xpath("//div[@data-id=\""+idR+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu1.click();
		sleep(1000);
		Editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regra.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		mas.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);		
		
		attributoNotToBeEmptyElement(cstPIS, "value");
		String cstPISBR = cstPIS.getAttribute("value");
		String bcPISBR = bcPIS.getAttribute("value");
		String alquotaPISBR = alquotaPIS.getAttribute("value");
		String valorPISBR = valorPIS.getAttribute("value");

		
		System.out.println("--------------------Datos BRE----------------------");
		System.out.println("CST PIS: "+ cstPISBR);
		System.out.println("BC PIS: "+ bcPISBR);
		System.out.println("ALIQUOTA PIS: "+ alquotaPISBR);
		System.out.println("VALOR PIS: "+ valorPISBR);

		cancelar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		cancelar1.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		home.click();
		sleep(3000);
		waitExpectElement(flecha);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
	
		acessarBSC.acessarBSC();
		
		
		notaFiscal.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		pendente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);


		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

		System.out.println("Número de Id : "+ idRegistro1);

		String idNotaFiscal = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[4]/div")).getText();
		
		boolean sucesso2 = (valor1.equals(idNotaFiscal));
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		

		WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement Visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu2.click();
		sleep(1000);
		Visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		

		
		String cstPISV2 = cstPISV.getAttribute("value");
		
		String  bcPISV2 = bcPISV.getAttribute("value");
		//eliminar comas por puntos
		bcPISV2 = bcPISV2.replace(",", ".");
		//eliminar puntos por nada
		bcPISV2 = bcPISV2.replaceAll("\\.","");
		//eliminar los dos ultimos elementos de la cadena 
		bcPISV2 = bcPISV2.substring(0, bcPISV2.length() - 2);
		
		String alquotaPISV2 = alquotaPISV.getAttribute("value");
		alquotaPISV2 = alquotaPISV2.replace(",", ".");
		
		String valorPISV2 = valorPISV.getAttribute("value");
		valorPISV2 = valorPISV2.replace(",", ".");
		valorPISV2 = valorPISV2.replaceAll("\\.","");
		valorPISV2 = valorPISV2.substring(0, bcPISV2.length() - 2);

	
		
		sleep(3000);
		
		System.out.println("--------------------Visualizados----------------------");
		System.out.println("CST PIS: "+ cstPISV2);
		System.out.println("BC PIS: "+ bcPISV2);
		System.out.println("Alíquota PIS: "+ alquotaPISV2);
		System.out.println("Valor PIS: "+ valorPISV2);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(cstPISBR .equals(cstPISV2));
		sucesso.add(bcPISBR.equals(bcPISV2));
		sucesso.add(alquotaPISBR.equals(alquotaPISV2));
		sucesso.add(valorPISBR.equals(valorPISV2));
		System.out.println(sucesso);
		return sucesso;

	}

}
