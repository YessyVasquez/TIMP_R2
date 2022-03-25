package com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeEstruturas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentoDeEstruturasCriarComCopiaPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Mapeamento de Estruturas\"]")
	public WebElement mapeamentodeestruturas;

	@FindBy(xpath = "//div[@class=\"input taxMap\"]/div/div/div[2]")
	public WebElement tributo;

	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"COFINS\"]")
	public WebElement opcaotributo;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;

	@FindBy(xpath = "//input[@placeholder=\"Preencha o nome do grupo\"]")
	public WebElement nomedogrupo;

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

	@FindBy(xpath = "//div[@id=\"componentToSearchId-05\"]/div[2]")
	public WebElement excluircofins;

	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Fim de Vigência\"]")
	public WebElement datafim;

	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	public MapeamentoDeEstruturasCriarComCopiaPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> criarcopia() {
		sleep(2000);

		mapeamentodeestruturas.click();

		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("MapeamentoDeEstruturasCriar");

		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement copia = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Cópia\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		copia.click();
		sleep(5000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		actionsMoveToElementXpath("//input[@placeholder=\"Selecione a Data de Inicio de Vigência\"]");
//		excluircofins.click();
//		sleep(2000);

		datainicio.clear();
		sleep(2000);
		String enviar ="02/01/1976";
		String enviar1 = "01/01/1977";
		datainicio.sendKeys(enviar);
		sleep(1000);
		datafim.clear();
		sleep(2000);
		datafim.sendKeys(enviar1);
		sleep(2000);
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		mapeamentodeestruturas.click();
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
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(6000);


		String data  = datainicio.getAttribute("value");
		String data1 = datafim.getAttribute("value");
		
		
		System.out.println(data);
		System.out.println(data1);

		sucesso.add(data.equals(enviar));
		sucesso.add(data1.contains(enviar1));
		

		sleep(5000);
		
		int cofins = driver.findElements(By.xpath("//div[@id=\"multipleControlerId-05\"]")).size();

		if (cofins == 0) {
			System.out.println("Cofins não consta na edição");
			sucesso.add(true);
		} else {
			System.out.println("Cofins  consta na edição");
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
		
		mapeamentodeestruturas.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int exclusão = driver.findElements(By.xpath("//div[@data-id=\"" + idultimo + "\"]/div[2]/div")).size();

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
