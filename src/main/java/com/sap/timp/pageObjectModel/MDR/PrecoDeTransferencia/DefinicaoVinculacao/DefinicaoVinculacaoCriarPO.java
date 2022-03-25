package com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.DefinicaoVinculacao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DefinicaoVinculacaoCriarPO extends TestBaseSteven{
	@FindBy(xpath = "//li/div/span[text()=\"Preço de Transferência\"]")
	public WebElement precoTransferencia;
	@FindBy(xpath = "//span[text()=\" Definição de Vinculação\"]")
	public WebElement definicao;

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[contains(@id,\"company\")]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//*[@id=\"type\"]")
	public WebElement tipo;
	
	@FindBy(xpath = "//*[@id=\"add-codes\"]")
	public WebElement filtroCodigo;
	
	@FindBy(xpath = "//*[@id=\"1\"]")
	public WebElement opcCheck;
	
	@FindBy(xpath = "//*[@id=\"inputDescription\"]/div/div/input")
	public WebElement inputCheck;
	
	@FindBy(xpath = "//div[@id=\"code\"]/div/div[1]/div[2]")
	public WebElement comboCodigo;
		
	@FindBy(xpath = "//*[@id=\"vinculation\"]")
	public WebElement vinculacao;
	
	@FindBy(xpath = "//*[@placeholder=\"Selecionar  Tipo Vinculação\"]")
	public WebElement tipoVinculacao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicial\")]")
	public WebElement data;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")	
	public WebElement opcao;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	public DefinicaoVinculacaoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
public boolean criar() {

		
		precoTransferencia.click();
		sleep(1000);
		definicao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		opcao.click();
		
		
		tipo.click();
		sleep(1000);
		opcao.click();
	
		
		filtroCodigo.click();
		sleep(1000);
		inputCheck.sendKeys("1");
		sim.click();	
		sleep(30000);
		
		comboCodigo.click();
		sleep(1000);
		opcao.click();
		
		vinculacao.click();
		sleep(500);
		opcao.click();
		
		tipoVinculacao.click();
		sleep(500);
		opcao.click();
		
		data.sendKeys(fechaActual());
		
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
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		idInserir("DefinicaoVinculacao",idB);
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
