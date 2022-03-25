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

public class RegrasDeEscrituraçãoDetalhesPO extends TestBaseFernando {
	@FindBy(xpath = "//li[@identifier=\"accordion-item-b_rules\"]")
	public WebElement regraDeEscrituracao;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;

	@FindBy(xpath = "//*[name()=\"g\" and contains(@class,\"path\")][1]/*/*")
	public WebElement caminhoV;

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;


	@FindBy(xpath = "//button/span[text()=\"Configurações\"]")
	public WebElement configuracoes;

	public RegrasDeEscrituraçãoDetalhesPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {

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
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));

		menu.click();
		sleep(1000);
		acao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);

		String campo1D = driver.findElement(By.xpath("//div[@id=\"detail-fields\"]/div[2]/div[1]/span[not(@class)]")).getText();
		String campo2D = driver.findElement(By.xpath("//div[@id=\"detail-fields\"]/div[2]/div[2]/span[not(@class)]")).getText();

		System.out.println(campo1D);
		System.out.println(campo2D);
		
		fechar.click();
		sleep(2000);
		
		
		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		acao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualização\"]"));

		menu.click();
		sleep(1000);
		acao.click();
		sleep(3000);
		waitExpectElement(configuracoes);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(9000);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		String campo1V = caminhoV.getText();
		System.out.println("Texto Visualizar: " + campo1V);
		
		sucesso.add(campo1V.contains(campo1D));
		sucesso.add(campo1V.contains(campo2D));
		
		
		System.out.println(sucesso);
		
		
		return sucesso;

	}

}
