package com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.MapeamentoSubstituicaoContaEstoqueCenariosCorrecoes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizarPO extends TestBaseSteven {
 
	@FindBy(xpath = "//span[text()=\"Parâmetros de Contabilização\"]")
	public WebElement parametro;
	
	@FindBy(xpath = "//li/div/span[contains(text(),\"Mapeamento para Substituição\")]")
	public WebElement contabil;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//textarea[contains(@placeholder,\"Descrição Padrão\")]")
	public WebElement campo;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[1]")
	public WebElement empresaE;
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div[1]")
	public WebElement filialE;
	@FindBy(xpath = "//input[contains(@placeholder,\"IVA\")]")
	public WebElement ivaE;
	

	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[1]")
	public WebElement empresaV;
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div[1]")
	public WebElement filialV;
	@FindBy(xpath = "//input[contains(@placeholder,\"IVA\")]")
	public WebElement ivaV;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	public MapeamentoSubstituicaoContaEstoqueCenariosCorrecoesVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		sleep(2000);
		parametro.click();
		sleep(1000);
		contabil.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("MapeamentoSubstituicaoContaEstoqueCenariosCorrecoes");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);

		String empresaV1 = empresaV.getText();
		String filialV1 = filialV.getText();
		String ivaV1 = ivaV.getAttribute("value");


		System.out.println(empresaV1);
		System.out.println(filialV1);
		System.out.println(ivaV1);
	

		sleep(2000);

		biblioteca.click();

		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(5000);

		String empresaE1 = empresaE.getText();
		String filialE1 = filialE.getText();
		String ivaE1 = ivaE.getAttribute("value");


		System.out.println(empresaE1);
		System.out.println(filialE1);
		System.out.println(ivaE1);


		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(empresaE1.contains(empresaV1));
		sucesso.add(filialE1.contains(filialV1));
		sucesso.add(ivaE1.contains(ivaV1));


		System.out.println(sucesso);
		return sucesso;

	}

}
