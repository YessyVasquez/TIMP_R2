package com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorreçao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

import net.bytebuddy.asm.Advice.Enter;

public class HierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Hierarquias de Cenários de Correção\"]")
	public WebElement hiearquiasdecenariosdecorrecao;
	
	
	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;
	
	@FindBy(xpath = "//button/span[text()=\"Aplicar filtros\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	//FILTROS
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[contains(@class,\"list-item\") and string()][1]")
	public WebElement opcTributo;
	
	@FindBy(xpath = "//div[@id=\"created-by\"]/div/div/div/div[2]")
	public WebElement filtroUsuarioCriacao;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[2]")
	public WebElement opc;
		
	@FindBy(xpath = "//div[@id=\"created-by\"]/div/div/div/div[1]")
	public WebElement otra;
	
	
	@FindBy(xpath = "//*[@id=\"creation-date\"]/div/div[1]/input")
	public WebElement filtroDataCriacao;
	
	@FindBy(xpath = "//div[@id=\"modified-by\"]/div/div/div/div[2]")
	public WebElement filtroUsuarioModifica;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[2]")
	public WebElement opc2;
	
	@FindBy(xpath = "//div[@id=\"modified-by\"]/div/div/div/div[1]")
	public WebElement otra2;
	
	
	@FindBy(xpath = "//div[@id=\"modification-date\"]/div/div[1]/input")
	public WebElement filtroDataModificao;
	
	@FindBy(xpath = "//div[(@tabindex=\"0\" and @class=\"date\") or (@tabindex=\"0\" and @class=\"date weekend today\")]")
	public WebElement fechita;
	
	@FindBy(xpath = "//html/body/div[4]/div[2]/div[3]/div[2]/button[2]")
	public WebElement aceptar;
	
	
	public HierarquiaDeCenariosDeCorreçaoFiltrosAbansadosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean>  filtroTributo(){

		sleep(2000);
		hiearquiasdecenariosdecorrecao.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		waitExpectElement(tributo);
		sleep(2000);
		
		tributo.click();
		sleep(1000);
		String empresaText = opcTributo.getText();
		opcTributo.click();
		sleep(1000);
		
		//sleep(1000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[6]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " empresa Filtro");
			sucesso.add(empresaText.equals(textFiltroEmpresa));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}		
	
	
	
	
	public ArrayList<Boolean> filtroUsuarioCriacao() {

		
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);		
		
		filtroUsuarioCriacao.click();
		sleep(2000);
		opc.click();
		sleep(2000);

		String usuarioCriacaoText = opc.getText();
		System.out.println("VIENE EN EL SELECT: "+ usuarioCriacaoText);
		dobleClickElement(otra); 
		
//		clickFuera.click();
		sleep(1000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroUsuarioCriacao = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[9]/div"))
					.getText();
			System.out.println(textFiltroUsuarioCriacao + " empresa Filtro");
			sucesso.add(usuarioCriacaoText.equals(textFiltroUsuarioCriacao));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;		
		
	}
	
	public ArrayList<Boolean> filtroDataCriacao() {



		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
     	sleep(2000);	
				
		String diahoy = diaHoy();
		System.out.println("dia de  hoy : "+diahoy);
		
	//	String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		String dia = driver.findElement(By.xpath("//div[(@tabindex=\"0\" and @class=\"date\" and text()="+diahoy+") or (@tabindex=\"0\" and @class=\"date weekend today\")]")).getText();
		
		//div[@class="calendars"]/div[1]/div[3]/div[@tabindex="0" and @class="date" and text()=5]
		
		filtroDataCriacao.click();
		sleep(9000);
		
		WebElement dia1 = driver.findElement(By.xpath("//div[@class=\"calendars\"]/div[1]/div[3]/div[@tabindex=\"0\" and @class=\"date\" and text()="+diahoy+"]"));
		System.out.println("dia 1 : "+ dia1);
		
		waitExpectElement(dia1);
		dia1.click();
		sleep(2000);
		aceptar.click();
		sleep(2000);
		
		String dataText = filtroDataCriacao.getAttribute("value");
		System.out.println("data criacao"+dataText);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroDataCriacao = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[10]/div"))
					.getText();
			System.out.println(textFiltroDataCriacao + " data criacao Filtro");
			sucesso.add(textFiltroDataCriacao.contains(dataText));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}

	public ArrayList<Boolean> filtroUsuarioModificado() {
		

		
	    sleep(2000);
		limpar.click();
		sleep(2000);
	    invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);		
		
		filtroUsuarioModifica.click();
		sleep(2000);
		opc2.click();
		sleep(2000);

		String usuarioCriacaoText = opc.getText();
		System.out.println("VIENE EN EL SELECT: "+ usuarioCriacaoText);
		dobleClickElement(otra2); 
		
//		clickFuera.click();
		sleep(1000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroUsuarioCriacao = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[11]/div"))
					.getText();
			System.out.println(textFiltroUsuarioCriacao + " empresa Filtro");
			sucesso.add(usuarioCriacaoText.equals(textFiltroUsuarioCriacao));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;		
		
	}
	
	public ArrayList<Boolean> filtroDataModificado() {

		sleep(2000);
		hiearquiasdecenariosdecorrecao.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	 
		
		
		String diahoy = diaHoy();
		System.out.println("dia de  hoy : "+diahoy);
		
		//String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		//String dia = driver.findElement(By.xpath("//div[(@tabindex=\"0\" and @class=\"date\" and text()="+diahoy+") or (@tabindex=\"0\" and @class=\"date weekend today\")]")).getText();
		
		//div[@class="calendars"]/div[1]/div[3]/div[@tabindex="0" and @class="date" and text()=5]
		
		filtroDataModificao.click();
		sleep(2000);
		
		WebElement dia1 = driver.findElement(By.xpath("//div[@class=\"calendars\"]/div[1]/div[3]/div[@tabindex=\"0\" and @class=\"date\" and text()="+diahoy+"]"));
		System.out.println("dia 1 : "+ dia1);
		
		waitExpectElement(dia1);
		dia1.click();
		sleep(2000);
		aceptar.click();
		sleep(2000);
		
		String dataText = filtroDataModificao.getAttribute("value");
		System.out.println("data modificado"+dataText);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroDataModificado = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[12]/div"))
					.getText();
			System.out.println(textFiltroDataModificado + " data modificado Filtro");
			sucesso.add(textFiltroDataModificado.contains(dataText));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
	
	
}
