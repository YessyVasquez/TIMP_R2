package com.sap.timp.pageObjectModel.MDR.CenariosCorrecao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.sap.timp.base.TestBaseSteven;

public class CenariosCorrecaoCriarPO extends TestBaseSteven{
	@FindBy(xpath = "//li/div/span[text()=\"Cenários de Correção\"]")
	public WebElement cenarios;
		
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement novo;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//*[@id=\"tax\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement tributo;
	
	@FindBy(xpath = "//*[@id=\"correction-object\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement objetoCorrecao;
	
	@FindBy(xpath = "//div[@class=\"list-item\"]/div[text()=\"NF\"]")
	public WebElement opcObjetoCorrecao;
	
	@FindBy(xpath = "//*[@id=\"web-service\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement servicoWeb;
	@FindBy(xpath = "//div[@class=\"list-item\"]/div[text()=\"TMFNotaFiscalCorrectionsSyncIn\"]")
	public WebElement opcServicoWeb;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//*[@id=\"add-field-button\"]")
	public WebElement btnAgregarCampo;
	
	@FindBy(xpath = "//*[@id=\"field-1\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement campo;
	
	@FindBy(xpath = "//*[@id=\"valid-from\"]/div/div[1]/input")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opc;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement confirmacionGravar;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/ul/li[3]/button")
	public WebElement btnRegresar;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[11]/div[3]/div")	
	public WebElement idC;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição de Cenário\"]")
	public WebElement descricaocenario;
	
	public CenariosCorrecaoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean cenariosCorrecaoCriar() {
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
		
		cenarios.click();
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);	
			
		siguiente.click();
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Integer filas= driver.findElements(By.xpath("//div[contains(@class,\"body\")]/div[@class=\"tr\"]")).size();

	
		String id = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div["+filas+"]/div[3]/div")).getText();
		
		waitExpectElement(novo);
		novo.sendKeys(Keys.ENTER);		
		
		waitExpectElement(btnGravar);
		waitExpectElement(tributo);
		tributo.click();
		sleep(1000);
		opc.click();
		
		objetoCorrecao.click();
		sleep(1000);
		opcObjetoCorrecao.click();
		sleep(1000);
		
		servicoWeb.click();
		sleep(1000);
		opcServicoWeb.click();
		sleep(3000);
		waitExpectElement(btnAgregarCampo);
		btnAgregarCampo.sendKeys(Keys.ENTER);
		sleep(1000);
		campo.click();
		sleep(1000);
		opc.click();
		
		descricaocenario.sendKeys("Teste automatizado cenário");
		sleep(2000);
		dataVigencia.sendKeys(fechaActual());


		
		btnGravar.sendKeys(Keys.ENTER);
		
		waitExpectElement(confirmacionGravar);
		confirmacionGravar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnRegresar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
			
		siguiente.click();
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Integer filas2= driver.findElements(By.xpath("//div[contains(@class,\"body\")]/div[@class=\"tr\"]")).size();

		String id2 = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div["+filas2+"]/div[3]/div")).getText();
		idInserir("CenariosCorrecao",id2);
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
