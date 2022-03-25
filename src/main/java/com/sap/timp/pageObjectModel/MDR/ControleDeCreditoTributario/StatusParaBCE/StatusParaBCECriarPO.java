package com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.StatusParaBCE;
import java.rmi.server.Skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sap.timp.base.TestBaseSteven;

public class StatusParaBCECriarPO extends TestBaseSteven {



	@FindBy(xpath = "//span[text()=\"Controle de Crédito Tributário\"]")
	public WebElement obrigacoes;

	@FindBy(xpath = "//span[text()=\"Status para BCE\"]")
	public WebElement tabelaMunicipios;

	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;

	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[2]")
	public WebElement empresa;

	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement uf;

	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[2]")
	public WebElement filial;

	@FindBy(xpath = "//input[contains(@placeholder,\"Início\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div/label/span")
	public WebElement opcaoF;
	
	@FindBy(xpath = "//div[@id=\"initial-status\"]/div/div/div[2]")
	public WebElement statusInicial;
	
	@FindBy(xpath = "//div[@id=\"final-status\"]/div/div/div[2]")
	public WebElement statusFinal;
	
	@FindBy(xpath = "//textarea")
	public WebElement descricao;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//button[@id=\"status-button\"]")
	public WebElement status;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;




	public StatusParaBCECriarPO() {

			PageFactory.initElements(driver, this);
	}

	
	public boolean criar() {
		sleep(2000);
		obrigacoes.click();
		sleep(2000);
		tabelaMunicipios.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);

		novo.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		empresa.click();
		sleep(1000);
		opcaoF.click();
		opcaoF.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		uf.click();
		sleep(1000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		
		sleep(2000);
		filial.click();
		sleep(1000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		status.click();
		sleep(1000);
		waitExpectElement(aceitar);
		sleep(2000);
		
		statusInicial.click();
		sleep(1000);
		opcaoF.click();
		opcaoF.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		statusFinal.click();
		sleep(1000);
		opcaoF.click();
		opcaoF.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		aceitar.click();
		sleep(2000);
		
		descricao.sendKeys("Teste de Status para BCE 01");
		
		dataVigencia.sendKeys(fechaActual());


		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(2000);
		rows = driver
				.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]"))
				.size();

		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][" + rows + "]/div[3]/div")).getText();
		idInserir("StatusParaBCE",idB);
		sleep(2000);
		System.out.println(id);
		System.out.println(idB);

		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		// compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;

		if (idBD > idD) {
			sucesso = true;
		} else {
			sucesso = false;
		}

		return sucesso;

	}
}

