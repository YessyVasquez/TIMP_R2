package com.sap.timp.pageObjectModel.MDR.Centralizacao.EstornoCredito;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.sap.timp.base.TestBaseSteven;


public class EstornoCreditoVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Centralização\"]")
	public WebElement centralizacao;

	@FindBy(xpath = "//span[text()=\"Estorno de Crédito de Insumos\"]")
	public WebElement estornocredito;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]/div")
	public WebElement idC;

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement setafinal;

	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;

	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[1]/div")
	public WebElement engrenagem;

	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresavi;

	@FindBy(xpath = "//span[@id=\"ufBranch\"]")
	public WebElement uffilialvi;

	@FindBy(xpath = "//span[@id=\"branches\"]")
	public WebElement filiaisvi;

	@FindBy(xpath = "//span[@id=\"centralizeBranch\"]")
	public WebElement filialcentralizadoravi;

	@FindBy(xpath = "//span[@id=\"initDate\"]")
	public WebElement datavi;

	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[1]")
	public WebElement empresa;

	@FindBy(xpath = "//div[@id=\"UF\"]/div/div/div/div/div/div[1]")
	public WebElement uffilial;

	@FindBy(xpath = "//div[@id=\"branches\"]/div/div/div/div/div[1]/div[1]")
	public WebElement filiais1;

	@FindBy(xpath = "//div[@id=\"branches\"]/div/div/div/div/div[1]/div[1]")
	public WebElement filiais2;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Filial Centralizadora\"]")
	public WebElement filialcentralizadora;

	@FindBy(xpath = "//div[@id=\"validity\"]/div/div/input")
	public WebElement data;

	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	public EstornoCreditoVisualizarPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		// Actions action = new Actions(driver);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		centralizacao.click();
		sleep(2000);
		estornocredito.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		setafinal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		// pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("EstornoCredito");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
 
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);

		visualizar.click();
		sleep(2000);
		// visualizar
		waitExpectElement(empresavi);
		sleep(2000);

		String empresavisualuzar = empresavi.getText();
		String uffilialvisualizar = uffilialvi.getText();
		String filiaisvisualizar = filiaisvi.getText();
		String filialcentralizadoravisualizar = filialcentralizadoravi.getText();
		String datavisualizar = datavi.getText();

		System.out.println(empresavisualuzar);
		System.out.println(uffilialvisualizar);
		System.out.println(filiaisvisualizar);
		System.out.println(filialcentralizadoravisualizar);
		System.out.println(datavisualizar);

		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(setafinal);
		sleep(2000);
		setafinal.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		// pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("EstornoCredito");

		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);

		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(empresa);
		sleep(2000);

		// editar

		String empresaeditar = empresa.getText();
		String uffilialeditar = uffilial.getText();
		String filial1editar = filiais1.getText();
		String filia2editar = filiais2.getText();
		String filialcentralizadoraeditar = filialcentralizadora.getAttribute("value");
		String dataeditar = data.getAttribute("value");

		System.out.println(empresaeditar);
		System.out.println(uffilialeditar);
		System.out.println(filial1editar);
		System.out.println(filia2editar);
		System.out.println(filialcentralizadoraeditar);
		System.out.println(dataeditar);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaeditar.equals(empresavisualuzar));
		sucesso.add(uffilialvisualizar.equals(uffilialeditar));
		sucesso.add(filiaisvisualizar.contains(filial1editar));
		sucesso.add(filiaisvisualizar.contains(filia2editar));
		sucesso.add(filialcentralizadoravisualizar.equals(filialcentralizadoraeditar));
		sucesso.add(datavisualizar.equals(dataeditar));
		System.out.println(sucesso);
		return sucesso;
		/*
		 * idC.click(); dobleClickElement(idC); sleep(2000);
		 * 
		 * invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		 * 
		 * opcao.click();
		 * 
		 * engrenagem.click(); sleep(1000); visualizar.click();
		 * 
		 * invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		 * 
		 * String sucesso =
		 * driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class"
		 * ); //System.out.println(sucesso); return sucesso;
		 */
	}

}
