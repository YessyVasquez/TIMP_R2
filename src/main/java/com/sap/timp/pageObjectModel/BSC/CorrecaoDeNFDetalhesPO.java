package com.sap.timp.pageObjectModel.BSC;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class CorrecaoDeNFDetalhesPO extends TestBaseMassiel{
	
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
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement idNota;

	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement idItem;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement status;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement razao;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement uF;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement filial;


	
	public CorrecaoDeNFDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean>  Detalhes(){
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
		
		//-------------------- Datos Biblioteca 

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

		System.out.println("Número de Id : "+ idRegistro1);

		String idNotaFiscalB = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[4]/div")).getText();
		String idItemB = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		String razaoCorrecaoB = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[6]/div")).getText();
		String statusB = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[7]/div")).getText();
		String uFB = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[9]/div")).getText();
		String filialB = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[10]/div")).getText();
		
		System.out.println("Nota Fiscal: "+ idNotaFiscalB);
		System.out.println("Número de Item: "+ idItemB);
		System.out.println("Razão de Correção: "+ razaoCorrecaoB);
		System.out.println("Status: "+ statusB);
		System.out.println("UF: "+ uFB);
		System.out.println("Filial: "+ filialB);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement Detalhe = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));
		
		menu1.click();
		sleep(1000);
		Detalhe.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String idNotaD = idNota.getText();
		String idItemD = idItem.getText();
		String statusD = status.getText();
		String razaoD = razao.getText();
		String ufD = uF.getText();
		String filialD = filial.getText();
		
		System.out.println("-----------------------------------------------");
		System.out.println("Nota Fiscal: "+ idNotaD);
		System.out.println("Número de Item: "+ idItemD);
		System.out.println("Razão de Correção: "+ razaoD);
		System.out.println("Status: "+ statusD);
		System.out.println("UF: "+ ufD);
		System.out.println("Filial: "+ filialD);
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(idNotaD.equals(idNotaFiscalB));
		sucesso.add(idItemD.equals(idItemB));
		sucesso.add(statusD.equals(statusB));
		sucesso.add(razaoD.equals(razaoCorrecaoB));
		sucesso.add(ufD.equals(uFB));
		sucesso.add(filialD.equals(filialB));	
		System.out.println( sucesso);
		return sucesso;
	}
	

}
