package com.sap.timp.pageObjectModel.ATR.Tributos.AgrupamentoDeTributos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AgrupamentoDeTributosCriarComCopiaPO extends TestBaseSteven {
	@FindBy(xpath = "//span[@class=\"title-boxes \"][text()=\"Tributos\"]")
	public WebElement tributos;
	
	@FindBy(xpath = "//span[text()=\"Agrupamento de Tributos\"]")
	public WebElement agrupamentodetributos;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome do Grupo\"]")
	public WebElement nome;

	
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"COFINS\"]")
	public WebElement opcaotributoaavaliar;
	
	
	@FindBy(xpath = "//div[@class=\"fieldMap taxes\"]/div/div/div[2]")
	public WebElement tributosaavaliar;
	
	@FindBy(xpath = "//div[@class=\"fieldMap taxSubset\"]/div/div/div[2]")
	public WebElement tributosaavaliar2;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;

	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência\"]")
	public WebElement datainicio;

	@FindBy(xpath = "//div[@class=\"fieldMap taxes\"]/div/div/div/div/div[1]/div[2]")
	public WebElement excluiricms;

	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Fim de Vigência\"]")
	public WebElement datafim;

	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@class=\"fieldMap taxes\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"COFINS\"]")
	public WebElement opcaotributo;
	
	public AgrupamentoDeTributosCriarComCopiaPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> criarcopia() {
		sleep(2000);
		tributos.click();
		
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		agrupamentodetributos.click();

		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("AgrupamentoDeTributosCriar");

		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement copia = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Cópia\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		copia.click();
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		nome.clear();
		sleep(2000);
		nome.sendKeys("Teste ATR Copia");
		sleep(5000);
		excluiricms.click();
		sleep(2000);
		
		tributo.click();
		sleep(2000);
		opcaotributo.click();
		sleep(2000);
		closeSelectTypeCheckbox(tributo);
		sleep(2000);
		
		tributosaavaliar.click();
		sleep(2000);
		opcaotributoaavaliar.click();
		sleep(2000);
		closeSelectTypeCheckbox(tributosaavaliar);
		
		tributosaavaliar2.click();
		sleep(2000);
		opcaotributoaavaliar.click();
		sleep(2000);
		closeSelectTypeCheckbox(tributosaavaliar2);
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		agrupamentodetributos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();

		String idultimo = driver.findElement(By.xpath(
				"//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[3]/div"))
				.getText();


		System.out.println(idRegistro);
		System.out.println(idultimo);
		double idD = convertToDouble(idRegistro);
		double idBD = convertToDouble(idultimo);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		if (idBD > idD) {
			System.out.println("É o id que foi criado");
			sucesso.add(true);
		} else {
			System.out.println("Não é o id criado");
			sucesso.add(false);
		}
		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idultimo + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idultimo + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();

		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		int icms = driver.findElements(By.xpath("//div[@class=\"fieldMap taxes\"]/div/div/div[1]/div[1]/div[1]/div[1][text()=\"ICMS\"]")).size();

		if (icms == 0) {
			System.out.println("ICMS não consta na edição");
			sucesso.add(true);
		} else {
			System.out.println("ICMS  consta na edição");
			sucesso.add(false);
		}
		
		cancelar.click();
		sleep(2000);
		
		sleep(2000);
		
		menu.click();
		sleep(1000);
		editar.click();

		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		
		int cofins = driver.findElements(By.xpath("//div[@class=\"fieldMap taxSubset\"]/div/div/div/div/div/div[1]")).size();

		if (cofins > 0) {
			System.out.println("Cofins  consta na edição");
			sucesso.add(true);
		} else {
			System.out.println("Cofins não consta na edição");
			sucesso.add(false);
		}

		cancelar.click();
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idultimo + "\"]/div[1]/div"));
		WebElement excluir = driver.findElement(
				By.xpath("//div[@data-id=\"" + idultimo + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		excluir.click();
		
		sleep(2000);
		waitExpectElement(aceitar);
		sleep(2000);
		aceitar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		agrupamentodetributos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int exclusão = driver.findElements(By.xpath("//div[@data-id=\"" + idultimo + "\"]/div[3]/div")).size();

		if (exclusão == 0) {
			System.out.println("Registro não consta na biblioteca");
			sucesso.add(true);
		} else {
			System.out.println("Registo consta na biblioteca");
			sucesso.add(false);
		}
		System.out.println(sucesso);

		return sucesso;
	}

}
