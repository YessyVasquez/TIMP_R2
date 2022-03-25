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

public class AdicionarColunasPO extends TestBaseSteven{
	
	
	
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
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
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
	
	public AdicionarColunasPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> colunas() {
		
	
	
		
		pesquisar.sendKeys("Prueba Automatizada");
		ferramenta.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);

		
	
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
	
		//waitExpectElement(menu);
		//sleep(menuT);

		menu.click();
		sleep(1000);
		editar.click();
		
		sleep(3000);
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		buscarCampo.sendKeys("Empresa");
		Actions actions = new Actions(driver);
		actions.moveToElement(empresa);
		sleep(15000);
		actions.doubleClick(empresa).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("UF da Filial");
		actions.moveToElement(ufFilial);
		sleep(3000);
		actions.doubleClick(ufFilial).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("Filial");
		actions.moveToElement(filial);
		sleep(3000);
		actions.doubleClick(filial).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("Data lançamento doc. fiscal");
		actions.moveToElement(docFiscal);
		sleep(3000);
		actions.doubleClick(docFiscal).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("Docnum");
		actions.moveToElement(docnum);
		sleep(3000);
		actions.doubleClick(docnum).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("Categoria nota fiscal");
		actions.moveToElement(categoria);
		sleep(3000);
		actions.doubleClick(categoria).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("Valor");
		actions.moveToElement(valor);
		sleep(3000);
		actions.doubleClick(valor).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("Cód. material");
		actions.moveToElement(codMaterial);
		sleep(3000);
		actions.doubleClick(codMaterial).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("CFOP");
		actions.moveToElement(cfop);
		sleep(3000);
		actions.doubleClick(cfop).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("ICMS");
		actions.moveToElement(cts);
		sleep(3000);
		actions.doubleClick(cts).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("BC ICMS");
		actions.moveToElement(bc);
		sleep(3000);
		actions.doubleClick(bc).perform();
		
	
		buscarCampo.clear();
		buscarCampo.sendKeys("Valor ICMS");
		actions.moveToElement(valorICMS);
		sleep(3000);
		actions.doubleClick(valorICMS).perform();
		
		buscarCampo.clear();
		buscarCampo.sendKeys("Alíquota ICMS");
		actions.moveToElement(aliquota);
		sleep(3000);
		actions.doubleClick(aliquota).perform();
		
		sleep(2000);
		
		gravarE.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		driver.navigate().refresh();
		
		sleep(3000);
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sucesso.add(empresaC.isDisplayed());
		sucesso.add(UfFilialC.isDisplayed());
		sucesso.add(filialC.isDisplayed());
		sucesso.add(dataC.isDisplayed());
		sucesso.add(docnumC.isDisplayed());
		sucesso.add(categoriaC.isDisplayed());
		sucesso.add(valorC.isDisplayed());
		sucesso.add(codMaterialC.isDisplayed());
		sucesso.add(cfopC.isDisplayed());
		sucesso.add(cstC.isDisplayed());
		sucesso.add(bcC.isDisplayed());
		sucesso.add(aliquotaC.isDisplayed());
		sucesso.add(valorICMSC.isDisplayed());
		
		return sucesso;
		
		
		
	}
	
	
	
	

}
