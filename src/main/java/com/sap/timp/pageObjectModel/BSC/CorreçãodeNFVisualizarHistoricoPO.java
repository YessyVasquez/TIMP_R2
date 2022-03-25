package com.sap.timp.pageObjectModel.BSC;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class CorreçãodeNFVisualizarHistoricoPO extends TestBaseMassiel{
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
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//span[text()=\"Corrigido\"]")
	public WebElement corrigido;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	

	public CorreçãodeNFVisualizarHistoricoPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> VisualizarHistorico() {

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
		String idNotaFiscal1 = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[4]/div")).getText();

		System.out.println("Número de Id : "+ idRegistro1);

		boolean sucesso1 = (valor1.equals(idNotaFiscal1));
		System.out.println(" El valor de Número de Documento es igual a Nota Fiscal de los dos Datos : "+ sucesso1);


		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);


		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement Visualizar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar Histórico da correção\"]"));

		menu1.click();
		sleep(1000);
		Visualizar1.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

	


		int rows1 = driver.findElements(By.xpath("//div[@class = \"tr\" and @data-id and @tabindex=\"0\"]")).size(); 
		//ArrayList<String> datos = new ArrayList<String>();
		ArrayList<Integer> datos = new ArrayList<Integer>();

		int n1 =1;


		for (int i = 0; i < rows1; i++) {
	
			String datos1 = driver.findElement(By.xpath("//div[@class = \"tr\" and @data-id and @tabindex=\"0\"]["+ n1+"]/div[1]/div")).getText();
			//datos1 = datos1.replace(".","");
			//datos1 = datos1.substring(0, datos1.length() - 1);
			
			int n1CD = new Integer(datos1);
			 datos.add(n1CD);
			n1 ++;
		}
		System.out.println("numeros"+ datos);
		
		aceitar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		corrigido.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int f = 1;
		for (int i = 0; i < datos.size(); i++) {
			
			 limpar.click();
			 sleep(3000);
			 invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			 sleep(5000);
			 
			 int menor = 0;
			  menor = datos.get(i);
			  
			
			
			pesquisar.sendKeys("" + menor);
			pesquisar.sendKeys(Keys.ENTER);
			
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(5000);
			
			String DatoArreglo = pesquisar.getAttribute("value");
			
			String textDatoTabla= driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div"))
					.getText();
			
			System.out.println(" dato Arreglo" + DatoArreglo );
			System.out.println(" dato Tabla" + textDatoTabla );
			
			sucesso.add(textDatoTabla.equals(DatoArreglo));
			
		}
		System.out.println(sucesso);
		return sucesso;
	}
}


