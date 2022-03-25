package com.sap.timp.pageObjectModel.BSC;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class CorreçãodeNFEditarPO extends TestBaseMassiel{
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

	@FindBy(xpath = "//div[@id=\"fields-container\"]/div[1]/div[2]/div/div[1]/input[1]")
	public WebElement datoEditar;

	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;

	@FindBy(xpath = "//div[@id=\"fields-container\"]/div[1]/div[2]/div/div[1]/input[1]")
	public WebElement cSTPIS1;

	@FindBy(xpath = "//div[@id=\"fields-container\"]/div[1]/div[3]/div/div[1]/input[1]")
	public WebElement cSTPIS2;

	@FindBy(xpath = "//div[@id=\"fields-container\"]/div[2]/div[2]/div/div[1]/input[1]")
	public WebElement bCPIS1;

	@FindBy(xpath = "//div[@id=\"fields-container\"]/div[2]/div[3]/div/div[1]/input[1]")
	public WebElement bCPIS2;

	@FindBy(xpath = "//div[@id=\"fields-container\"]/div[3]/div[2]/div/div[1]/input[1]")
	public WebElement alíquotaPIS1;

	@FindBy(xpath = "//div[@id=\"fields-container\"]/div[3]/div[3]/div/div[1]/input[1]")
	public WebElement  alíquotaPIS2;

	@FindBy(xpath = "//div[@id=\"fields-container\"]/div[4]/div[2]/div/div[1]/input[1]")
	public WebElement valorPIS1;

	@FindBy(xpath = "//div[@id=\"fields-container\"]/div[4]/div[3]/div/div[1]/input[1]")
	public WebElement valorPIS2;

	public CorreçãodeNFEditarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean>  Executar() {

		AcessarBSCPO acessarBSC;
		acessarBSC = new AcessarBSCPO();


		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

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
		String textId = "";

		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		if (tq1 == true) {
			textId = "8004766";

		}else if (tc2 == true) {
			textId = "2123";

		}else {

			textId = "1769";

		}



		System.out.println(textId);

		pesquisar.sendKeys(textId);
		pesquisar.sendKeys(Keys.ENTER);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		String idBusqueda = textId;
		System.out.println(idBusqueda + " Id Busqueda");

		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		ArrayList<Boolean> sucesso1 = new ArrayList<Boolean>();

		sucesso1.add(textId.equals(idBusqueda));

		System.out.println(sucesso1);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+textId+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+textId+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Executar\"]"));
		actionsMoveToElementElement(menu);

		sleep(4000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		executar2.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);

		check1.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);

		String valor = docNum.getText();
		System.out.println(valor);

		enviar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);



		home.click();
		sleep(3000);
		waitExpectElement(nao);
		nao.click();
		sleep(3000);
		waitExpectElement(flecha);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

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
		sleep(2000);

		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and @data-id]")).size();

		String idBSC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();

		String idNotaFiscal = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[4]/div")).getText();

		System.out.println(idNotaFiscal);

		boolean sucesso2 = (valor.equals(idNotaFiscal));
		System.out.println(" El valor de Numero de Documento es igual a Nota Fiscal");
		System.out.println(sucesso2);


		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idBSC+"\"]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[@data-id=\""+idBSC+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		actionsMoveToElementElement(menu1);
		sleep(4000);

		menu1.click();
		sleep(1000);
		editar1.click();
		sleep(3000);

		String enviar = "11";

		sleep(1000);
		
		attributoNotToBeEmptyElement(datoEditar, "value");
		sleep(2000);
		datoEditar.clear();

		sleep(1000);
		datoEditar.sendKeys(enviar);
		sleep(1000);
		
		String textocSTPIS1 = cSTPIS1.getAttribute("value");
		String textocSTPIS2 = cSTPIS2.getAttribute("value");
		String textobCPIS1 = bCPIS1.getAttribute("value");
		String textobCPIS2 = bCPIS2.getAttribute("value");
		String textoalíquotaPIS1 = alíquotaPIS1.getAttribute("value");
		String textoalíquotaPIS2 = alíquotaPIS2.getAttribute("value");
		String textovalorPIS1 = valorPIS1.getAttribute("value");
		String textovalorPIS2 = valorPIS2.getAttribute("value");

		boolean sucesso3 = textocSTPIS1.equals(enviar);
		System.out.println("El valor editado es igual al enviado ");
		System.out.println(sucesso3);

		System.out.println("CST PIS: " + textocSTPIS1);
		System.out.println("CST PIS 1: " + textocSTPIS2);
		System.out.println("BC PIS: " + textobCPIS1);
		System.out.println("BC PIS 1: " + textobCPIS2);
		System.out.println("Alíquota PIS: " + textoalíquotaPIS1);
		System.out.println("Alíquota PIS 1: " + textoalíquotaPIS2);
		System.out.println("Valor PIS: " + textovalorPIS1);
		System.out.println("Valor PIS 1: " + textovalorPIS2);

		aceitar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		driver.navigate().refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		notaFiscal.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		pendente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		WebElement menu2 = driver.findElement(By.xpath("//div[@data-id=\""+idBSC+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idBSC+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		actionsMoveToElementElement(menu2);
		sleep(4000);

		menu2.click();
		sleep(1000);
		visualizar.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		attributoNotToBeEmptyElement(cSTPIS1, "value");
		String textocSTPIS1V = cSTPIS1.getAttribute("value");
		String textocSTPIS2V = cSTPIS2.getAttribute("value");
		String textobCPIS1V = bCPIS1.getAttribute("value");
		String textobCPIS2V = bCPIS2.getAttribute("value");
		String textoalíquotaPIS1V = alíquotaPIS1.getAttribute("value");
		String textoalíquotaPIS2V = alíquotaPIS2.getAttribute("value");
		String textovalorPIS1V = valorPIS1.getAttribute("value");
		String textovalorPIS2V = valorPIS2.getAttribute("value");

		System.out.println("-------------------------------------------");
		System.out.println("CST PIS: " + textocSTPIS1V);
		System.out.println("CST PIS 1: " + textocSTPIS2V);
		System.out.println("BC PIS: " + textobCPIS1V);
		System.out.println("BC PIS 1: " + textobCPIS2V);
		System.out.println("Alíquota PIS: " + textoalíquotaPIS1V);
		System.out.println("Alíquota PIS 1: " + textoalíquotaPIS2V);
		System.out.println("Valor PIS: " + textovalorPIS1V);
		System.out.println("Valor PIS 1: " + textovalorPIS2V);


		ArrayList<Boolean> sucesso4 = new ArrayList<Boolean>();
		sucesso4.add(textocSTPIS1V .equals(textocSTPIS1));
		sucesso4.add(textocSTPIS2V.equals(textocSTPIS2));
		sucesso4.add(textobCPIS1V .equals(textobCPIS1));
		sucesso4.add(textobCPIS2V .equals(textobCPIS2));
		sucesso4.add(textoalíquotaPIS1V .equals(textoalíquotaPIS1));
		sucesso4.add(textoalíquotaPIS2V .equals(textoalíquotaPIS2));
		sucesso4.add(textovalorPIS1V .equals(textovalorPIS1));
		sucesso4.add(textovalorPIS2V .equals(textovalorPIS2));

		return sucesso4;
	}



}

