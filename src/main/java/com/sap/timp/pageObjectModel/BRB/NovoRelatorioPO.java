package com.sap.timp.pageObjectModel.BRB;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class NovoRelatorioPO extends TestBaseSteven{
	
	
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[1]/div/div/ul/li[1]/button")
	public WebElement novo;
	@FindBy(xpath = "//*[@id=\"create-name\"]/div/div/input")
	public WebElement nome;
	@FindBy(xpath = "//*[@id=\"select\"]/div[1]/input")
	public WebElement tipo;
	@FindBy(xpath = "//*[@id=\"option-3\"]")
	public WebElement tipoO;
	@FindBy(xpath = "//*[@id=\"create-tribute\"]/div/div[1]/div[1]/div[2]/input")
	public WebElement tributo;
	@FindBy(xpath = "//*[@id=\"00\"]/div[2]")
	public WebElement tributoO;
	@FindBy(xpath = "//*[@id=\"create-structure\"]/div/div[1]/input")
	public WebElement grupo;
	@FindBy(xpath = "//*[@id=\"create-sub-structure\"]/div/div[1]/input")
	public WebElement estrutura;
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement gravar;
	@FindBy(xpath = "//*[@id=\"accordion\"]/ul/li")
	public WebElement mostrado;
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[4]/button")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[4]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement editar;
	@FindBy(xpath = "//*[@id=\"report-search\"]/div/div/input")
	public WebElement buscarCampo;
	@FindBy(xpath = "//div[@data-id=\"28\"]")
	public WebElement empresa;
	@FindBy(xpath = "//div[@data-id=\"193\"]")
	public WebElement ufFilial;
	@FindBy(xpath = "//div[@data-id=\"30\"]")
	public WebElement filial;
	@FindBy(xpath = "//div[@data-id=\"21\"]")
	public WebElement docFiscal;
	@FindBy(xpath = "//div[@data-id=\"31\"]")
	public WebElement docnum;
	
	@FindBy(xpath = "//div[@data-id=\"8\"]")
	public WebElement categoria;
	@FindBy(xpath = "//div[@data-id=\"79\"]")
	public WebElement valor;
	@FindBy(xpath = "//div[@data-id=\"129\"]")
	public WebElement codMaterial;
	@FindBy(xpath = "//div[@data-id=\"115\"]")
	public WebElement cfop;
	@FindBy(xpath = "//div[@data-id=\"117\"]")
	public WebElement cts;
	@FindBy(xpath = "//div[@data-id=\"5\"]")
	public WebElement bc;
	@FindBy(xpath = "//div[@data-id=\"171\"]")
	public WebElement aliquota;
	@FindBy(xpath = "//div[@data-id=\"66\"]")
	public WebElement valorICMS;
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravarE;
	
	@FindBy(xpath = "//*[@id=\"draggable-28\"]")
	public WebElement empresaC;
	@FindBy(xpath = "//*[@id=\"draggable-193\"]")
	public WebElement UfFilialC;
	@FindBy(xpath = "//*[@id=\"draggable-30\"]")
	public WebElement filialC;
	@FindBy(xpath = "//*[@id=\"draggable-21\"]")
	public WebElement dataC;
	@FindBy(xpath = "//*[@id=\"draggable-31\"]")
	public WebElement docnumC;
	@FindBy(xpath = "//*[@id=\"draggable-8\"]")
	public WebElement categoriaC;
	@FindBy(xpath = "//*[@id=\"draggable-79\"]")
	public WebElement valorC;
	@FindBy(xpath = "//*[@id=\"draggable-129\"]")
	public WebElement codMaterialC;
	@FindBy(xpath = "//*[@id=\"draggable-115\"]")
	public WebElement cfopC;
	@FindBy(xpath = "//*[@id=\"draggable-117\"]")
	public WebElement cstC;
	@FindBy(xpath = "//*[@id=\"draggable-5\"]")
	public WebElement bcC;
	@FindBy(xpath = "//*[@id=\"draggable-171\"]")
	public WebElement aliquotaC;
	@FindBy(xpath = "//*[@id=\"draggable-66\"]")
	public WebElement valorICMSC;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement pesquisar;
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/span[1]")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-output\"]")
	public WebElement cadastro;
	
	
	public NovoRelatorioPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean criar() {
		
		String url = driver.getCurrentUrl();
		
		boolean td1 = false;
		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		boolean tq2 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else if (url.contains("tq2")) {
			tq2 = true;
		}else {
			td1 = true;
		}
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cadastro.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		novo.click();
		
		attributeToBeXpath("//*[@id=\"create-structure\"]/div", "class", "base-autocomplete required");
		sleep(3000);
		nome.sendKeys("Prueba Automatizada");
		
		tipo.click();
		
		tipoO.click();
		sleep(1000);
		
		tributo.click();
		
		tributoO.click();
		sleep(1000);
		tributo.sendKeys(Keys.ESCAPE);
	
		sleep(1000);
		
		
		if (tc2 == true) {
			grupo.sendKeys("Notas Fiscais - v2.0");
			grupo.sendKeys(Keys.ENTER);
		}else if (tp1 == true) {
			grupo.sendKeys("NF Nova");
			grupo.sendKeys(Keys.ENTER);
		}else if (tq1==true) {
			grupo.sendKeys("Nota Fiscal - Nova");
			grupo.sendKeys(Keys.ENTER);
		}else if (tq2==true) {
			grupo.sendKeys("Nota Fiscal - Nova");
			grupo.sendKeys(Keys.ENTER);
		}else {
			grupo.sendKeys("Nota Fiscal Teste Automatizado");
			grupo.sendKeys(Keys.ENTER);
		}
	
		sleep(1000);
		estrutura.sendKeys("Nota Fiscal (Itens com Impostos) + Empresa/Filial");
		estrutura.sendKeys(Keys.ENTER);

		sleep(1000);
		
		gravar.click();
		waitExpectElement(mostrado);

		sleep(5000);
		
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys("Prueba Automatizada");
		ferramenta.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		String texto = driver.findElement(By.xpath("//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[7]")).getText();
		System.out.println(texto);

		boolean sucesso = texto.contains("Prueba Automatizada");
		
		return sucesso;
		
		
	}
	
	
	
	
	
	
	

}
