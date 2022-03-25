package com.sap.timp.pageObjectModel.MDR.Antecipacao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class AntecipacaoCriarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\" Antecipação\"]")
	public WebElement antecipacao;

	@FindBy(xpath = "//*[@id=\"container\"]/div[1]/div/div/ul/li[1]/button")
	public WebElement novaAntecipacao;
	
	
	@FindBy(xpath = "//*[@id=\"content-list\"]/div[1]/div/div/div/input")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@id=\"empresa\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//*[@id=\"uf\"]/div/div/div[2]")
	public WebElement ufFilial;
	@FindBy(xpath = "//li[text()=\"SP\"]")
	public WebElement ufFilialO;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao2;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao1;
	
	
	
	@FindBy(xpath = "//*[@id=\"filial\"]/div/div/div[2]")
	public WebElement filial;

	@FindBy(xpath = "//*[@id=\"tributo\"]/div/div/div[2]")
	public WebElement tributo;

	@FindBy(xpath = "//*[@id=\"tipoTributo\"]/div/div/div[2]")
	public WebElement tipoTributo;

	@FindBy(xpath = "//*[@id=\"detalheTipoTributo\"]/div/div[2]")
	public WebElement detalhe;
	
	@FindBy(xpath = "//div[contains(@id,\"Antecipacao\")]/div/div/input")
	public WebElement antecipacaoC;
	
	@FindBy(xpath = "//div[@id=\"parcela\"]/div/div/input")
	public WebElement parcela;
	
	@FindBy(xpath = "//div[@id=\"baseAntecipacao\"]/div/div[2]")
	public WebElement base;

	
	
	@FindBy(xpath = "//div[@id=\"linhaDeducao\"]/div/div[2]")
	public WebElement linha;

	
	@FindBy(xpath = "//div[@id=\"codRegLancSped\"]/div/div/div[2]")
	public WebElement lancamento;

	@FindBy(xpath = "//div[@id=\"modRelatorio\"]/div/div/div[2]")
	public WebElement modelo;

	
	@FindBy(xpath = "//*[@id=\"dtInicio\"]/div/div[1]/input")
	public WebElement data;
	
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravar;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement sim;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/ul/li[3]/button")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
	public WebElement idC;
	
	
	
	
	

	public AntecipacaoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	

	public boolean criarAntecipacao() {
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		
		
		
		antecipacao.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);
		
		
		
		novaAntecipacao.click();
		sleep(2000);
		attributeToBeXpath("//div[@id=\"tributo\"]/div", "class", "base-select required");
		sleep(5000);
		
		empresa.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		opcao2.sendKeys(Keys.ESCAPE);
	
		
		
		attributeToBeXpath("//*[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		ufFilial.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		opcao2.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		
		
		attributeToBeXpath("//*[@id=\"filial\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		filial.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		opcao2.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		tributo.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		attributeToBeXpath("//*[@id=\"tipoTributo\"]/div", "class", "base-select required");
		sleep(2000);
		
		tipoTributo.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		detalhe.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		antecipacaoC.sendKeys("20");
		sleep(1000);
		parcela.sendKeys("12");
		sleep(2000);
		
		base.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		linha.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		lancamento.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		modelo.click();
		sleep(2000);
		opcao1.click();
		sleep(2000);
		
		String dataH = fechaActual();
		
		
		data.sendKeys(dataH);
		sleep(2000);
		gravar.click();
		sleep(3000);
		waitExpectElement(sim);
		sim.click();
		sleep(3000);
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("antecipacao",id2);
		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
		
		
		
		return sucesso;
		
	}
	
	
}
