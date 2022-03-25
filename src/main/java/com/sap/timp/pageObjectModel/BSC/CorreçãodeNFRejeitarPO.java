package com.sap.timp.pageObjectModel.BSC;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class CorreçãodeNFRejeitarPO extends TestBaseMassiel{

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

	@FindBy(xpath = "//div[@id=\"table-data-wrapper\"]/div[3]/div[5]/div[2]/a")
	public WebElement docNum2;

	@FindBy(xpath = "//span[contains(@class,\"pendingdocs\")]")
	public WebElement rejeitar;

	@FindBy(xpath = "//input[@placeholder=\"Preencher Justificativa\"]")
	public WebElement justificar;

	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;

	@FindBy(xpath = "//span[text()=\"Rejeitado\"]")
	public WebElement rejeitado;

	public CorreçãodeNFRejeitarPO() {

		PageFactory.initElements(driver, this);
	}


	public ArrayList<Boolean> Rejeitar(){

		AcessarBSCPO acessarBSC;
		acessarBSC = new AcessarBSCPO();

		String url = driver.getCurrentUrl();
		System.out.println(url);

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
		sleep(3000);


		executarE.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

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

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

		System.out.println("Número de Id Primer dato Enviado: "+ idRegistro1);

		String idNotaFiscal1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[4]/div")).getText();

		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check1.click();
		sleep(1000);

		boolean sucesso2 = (valor1.equals(idNotaFiscal1));
		sucesso2 = (valor1.equals(idNotaFiscal1));
		System.out.println(" El valor de Número de Documento es igual a Nota Fiscal de los dos Datos : "+ sucesso2);

		rejeitar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		String enviar = "Test Massiel";
		justificar.clear();

		sleep(1000);
		justificar.sendKeys(enviar);
		sleep(1000);


		aceitar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		sleep(3000);
		sleep(3000);

		rejeitado.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);


		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);

		//-------------------- Dato 1

		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		String idRegistro1R = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[3]/div")).getText();

		System.out.println("Número de Id Primer dato Enviado: "+ idRegistro1R);
		
		ArrayList<Boolean> sucesso3 = new ArrayList<Boolean>();
		sucesso3.add(idRegistro1R.equals(idRegistro1));
		System.out.println("Datos Pendientes Iguales a Rejeitado: "+ sucesso3);
		
		return sucesso3;

	}
}
