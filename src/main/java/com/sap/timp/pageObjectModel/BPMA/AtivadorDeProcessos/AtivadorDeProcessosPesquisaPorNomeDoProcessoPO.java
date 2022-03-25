package com.sap.timp.pageObjectModel.BPMA.AtivadorDeProcessos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AtivadorDeProcessosPesquisaPorNomeDoProcessoPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[@class=\"icon icon-font-Sign-and-Symbols icon-checkbox\"]")
	public WebElement ativadordeprocessos;

	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;

	@FindBy(xpath = "//div[@id=\"company\"]/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Data Inicial\")]")
	public WebElement dataInicial;
	
	@FindBy(xpath = "")
	public WebElement dataFinal;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement empresaO;

	@FindBy(xpath = "//button/span[text()=\"Aplicar filtros\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	

	public AtivadorDeProcessosPesquisaPorNomeDoProcessoPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> PesquisaNome() {

		sleep(2000);
		ativadordeprocessos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String	nome = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][2]/div[6]/div")).getText();
		
		System.out.println("Nome do Registro:"+nome);
		pesquisar.sendKeys(nome);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int j = 1;
		for (int i = 0; i < rows; i++) {

			String Nomefiltro = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ j +"]/div[6]/div"))
					.getText();
			
			System.out.println("Nome Filtro:"+Nomefiltro);
			sucesso.add(nome.equals(Nomefiltro));

			j = j + 1;
		}
		System.out.println(sucesso);

		return sucesso;

	}

	


}
