package com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.ParametrosGerais;

import java.util.ArrayList;

import javax.swing.text.Position.Bias;

//import org.omg.DynamicAny.NameDynAnyPair;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RegrasDeEscrituraçãoVisualizarPO extends TestBaseFernando {
	@FindBy(xpath = "//li[@identifier=\"accordion-item-b_rules\"]")
	public WebElement regraDeEscrituracao;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;

	@FindBy(xpath = "//*[name()=\"g\" and contains(@class,\"path\")][1]/*/*")
	public WebElement caminho1V;

	@FindBy(xpath = "//*[name()=\"g\" and contains(@class,\"path\")][2]/*/*")
	public WebElement caminho2V;

	@FindBy(xpath = "//*[name()=\"g\"][3]/*/*")
	public WebElement caminho3V;

	@FindBy(xpath = "//*[name()=\"g\"][4]/*/*")
	public WebElement caminho4V;

	@FindBy(xpath = "//*[name()=\"g\" and contains(@class,\"path\")][1]/*/*")
	public WebElement caminho1E;

	@FindBy(xpath = "//*[name()=\"g\" and contains(@class,\"path\")][2]/*/*")
	public WebElement caminho2E;

	@FindBy(xpath = "//*[name()=\"g\"][3]/*/*")
	public WebElement caminho3E;

	@FindBy(xpath = "//*[name()=\"g\"][4]/*/*")
	public WebElement caminho4E;

	
	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement configuracoes;


	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	public RegrasDeEscrituraçãoVisualizarPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		String url = driver.getCurrentUrl();

		boolean tp1 = false;

		if (url.contains("tp1")) {
			tp1 = true;
		}

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(2000);
		regraDeEscrituracao.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("RegraDeEscrituracao");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement acao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualização\"]"));

		menu.click();
		sleep(1000);
		acao.click();
		sleep(6000);
		waitExpectElement(configuracoes);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		
		String caminho1V1 = caminho1V.getText();
		String caminho2V1 = caminho2V.getText();
		String caminho3V1 = caminho3V.getText();
		String caminho4V1 = caminho4V.getText();
		System.out.println("--------------Visualização------------------");
		System.out.println(caminho1V1);
		System.out.println(caminho2V1);
		System.out.println(caminho3V1);
		System.out.println(caminho4V1);
		
		biblioteca.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		regraDeEscrituracao.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		acao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		acao.click();
		sleep(6000);
		waitExpectElement(configuracoes);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String caminho1D1 = caminho1E.getText();
		String caminho2D1 = caminho2E.getText();
		String caminho3D1 = caminho3E.getText();
		String caminho4D1 = caminho4E.getText();
		
		System.out.println("--------------Edição------------------");
		System.out.println(caminho1D1);
		System.out.println(caminho2D1);
		System.out.println(caminho3D1);
		System.out.println(caminho4D1);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(caminho1V1.equals(caminho1D1));
		sucesso.add(caminho2V1.equals(caminho2D1));
		sucesso.add(caminho3V1.equals(caminho3D1));
		sucesso.add(caminho4V1.equals(caminho4D1));
		
		System.out.println(sucesso);
		return sucesso;

	}

}
