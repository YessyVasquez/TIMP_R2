package com.sap.timp.pageObjectModel.MDR.ValorAdicionado.Municipio;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;

public class MunicipioCriarPO extends TestBaseMassiel{

	
	@FindBy(xpath = "//span[text()=\"Valor Adicionado\"]")
	public WebElement valorAdicionado;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-valueAddedTax\"]/ul/li/div/span[text()=\"Municípios\"]")
	public WebElement municipios;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"municipio\"]/div/div[2]")
	public WebElement municipio;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Valor\")]")
	public WebElement valor;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Populacão\")]")
	public WebElement pupulacao;

	@FindBy(xpath = "//input[contains(@placeholder,\"Coeficiente\")]")
	public WebElement coeficiente;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\")]")
	public WebElement dataVigencia;

	@FindBy(xpath = "//div[@id=\"creditMonth\"]/div/div[2]")
	public WebElement mesCredito;

	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcao;
	
	
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	/*
	@FindBy(xpath = "")
	public WebElement ;
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	
	public MunicipioCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		valorAdicionado.click();
		sleep(2000);
		municipios.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		uf.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"municipio\"]/div", "class", "base-autocomplete required");
		sleep(1000);
		municipio.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		
		valor.sendKeys("15");
		pupulacao.sendKeys("1300");
		coeficiente.sendKeys("30");
		dataVigencia.sendKeys(fechaActual());
		mesCredito.click();
		sleep(1000);
		opcao.click();

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
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("municipio", idB);
		sleep(2000);
		System.out.println(id);
		System.out.println(idB);
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;
		
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		return sucesso;
		
		
	}	
}
