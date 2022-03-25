package com.sap.timp.pageObjectModel.MDR.ConfiguracoesFundoSocial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguracoesDeFundoSocialExcluirEmMassaPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Configurações de Fundo Social\"]")
	public WebElement configuracoesFundoSocial;
	
	@FindBy(xpath = "//span[contains(text(),\"Nova\")]")
	public WebElement nova;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"COMPANY\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"UF_BRANCH\"]/div/div/div[2]")
	public WebElement ufFilial;
	
	@FindBy(xpath = "//div[@id=\"BRANCH\"]/div/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"TRIBUTE\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"FUND_NAME\"]/div/div/div[2]")
	public WebElement nomeFundo;
	
	@FindBy(xpath = "//div[@id=\"TRIBUTE_TYPE_DETAIL\"]/div/div[2]")
	public WebElement detalheTipoTributo;
	
	@FindBy(xpath = "//div[@id=\"ADJUSTMENT_TRIBUTE_TYPE\"]/div/div/div[2]")
	public WebElement tipoTributo;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Vigência de\")]")
	public WebElement dataVigenca;
	
	@FindBy(xpath = "//div[@id=\"CALCULATION_BASE_TYPE\"]/div/div[2]")
	public WebElement tipoBaseCalculo;
	
	@FindBy(xpath = "//div[@id=\"VB_VALUE_LIMIT\"]/div/div[2]")
	public WebElement limite;
	
	@FindBy(xpath = "//div[@id=\"SPED_REGISTRY_CODE\"]/div/div/div[2]")
	public WebElement codigoRegistroSped;
	
	@FindBy(xpath = "//div[@id=\"REPORT_MODEL\"]/div/div[2]")
	public WebElement modeloRelatorio;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcao2;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
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
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;

	@FindBy(xpath = "//div[@class=\" toast-inner\"]")
	public WebElement mensagem;
	
	
	
	public ConfiguracoesDeFundoSocialExcluirEmMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		configuracoesFundoSocial.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		nova.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//Primeiro Registro
		
		empresa.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"UF_BRANCH\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		ufFilial.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"BRANCH\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		
		filial.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(3000);
		
		tributo.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		nomeFundo.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		detalheTipoTributo.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"ADJUSTMENT_TRIBUTE_TYPE\"]/div", "class", "base-select required");
		sleep(3000);
		
		tipoTributo.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		dataVigenca.sendKeys(fechaActual());
		
		
		tipoBaseCalculo.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		limite.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		codigoRegistroSped.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		modeloRelatorio.click();
		sleep(2000);
		opcao2.click();
		

		sleep(2000);
		novo.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		driver.navigate().refresh();
		sleep(2000);
		waitExpectElement(empresa);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//Segundo Registro
		
		empresa.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"UF_BRANCH\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		ufFilial.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"BRANCH\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		
		filial.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(3000);
		
		tributo.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		nomeFundo.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		detalheTipoTributo.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"ADJUSTMENT_TRIBUTE_TYPE\"]/div", "class", "base-select required");
		sleep(3000);
		
		tipoTributo.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		dataVigenca.sendKeys(fechaActual());
		
		
		tipoBaseCalculo.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		limite.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		codigoRegistroSped.click();
		sleep(2000);
		opcao2.click();
		sleep(1000);
		
		modeloRelatorio.click();
		sleep(2000);
		opcao2.click();
		
		
		sleep(2000);
		novo.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		
		
	
		sleep(2000);
		System.out.println(id);
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(id);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		boolean sucesso = false;
		
		if (idRegistroD1 > idD && idRegistroD2 > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		
		
		return sucesso;
		
		
	}	
	
	
	public boolean excluir() {
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();

		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check1.click();
		sleep(1000);
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check2.click();
		
		sleep(1000);
		
		excluirMassa.click();
		sleep(1000);
		waitExpectElement(sim);
		sleep(1000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		
		driver.navigate().refresh();
		waitExpectElement(siguiente);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro1);
		int id3 = convertToInt(idRegistro2);
		
		System.out.println(" Id Ultimo Registro: "+ id1);
		System.out.println("Id Excluir Registro 1: " + id2);
		System.out.println("Id Excluir Registro 2: " + id3);
		
		boolean sucesso = false;
		
		if (id1 != id2 && id1!=id3) {
			sucesso = true;
		}else {
			sucesso=false;
		}
		
		
		
		return sucesso;
	}


}
