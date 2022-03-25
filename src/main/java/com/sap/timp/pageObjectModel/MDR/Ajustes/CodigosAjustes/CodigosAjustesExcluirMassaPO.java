package com.sap.timp.pageObjectModel.MDR.Ajustes.CodigosAjustes;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigosAjustesExcluirMassaPO extends TestBaseSteven {
	
	
	
	@FindBy(xpath = "//span[text()=\"Ajustes\"]")
	public WebElement ajustes;
	
	@FindBy(xpath = "//span[text()=\"Códigos de Ajustes\"]")
	public WebElement codigo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	
	@FindBy(xpath = "//div[@id=\"companyCode\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement empresaO;
	
	@FindBy(xpath = "//div[@id=\"adjustmentType\"]/div/div/div[2]")
	public WebElement tipoAjuste;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and  @id][1]")
	public WebElement opcion;
	
	@FindBy(xpath = "//div[@id=\"releaseType\"]/div/div/div[2]")
	public WebElement tipoLan;
	@FindBy(xpath = "//textarea[contains(@placeholder,\"Descrição Padrão\")]")
	public WebElement descriçao;
	@FindBy(xpath = "//div[@id=\"adjustmentTribute\"]/div/div/div[2]")
	
	public WebElement tributo;
	@FindBy(xpath = "//li[text()=\"ICMS\"]")
	public WebElement tributoO;
	
	@FindBy(xpath = "//div[@id=\"tributeType\"]/div/div/div[2]")
	public WebElement tipoTributo;
	
	
	@FindBy(xpath = "//div[@id=\"tributeTypeDetail\"]/div/div/div/div[2]")
	public WebElement detalheTributo;
	@FindBy(xpath = "//div[@class=\"list-option\"][1]")
	public WebElement detalheTributoO;
	
	
	@FindBy(xpath = "//div[@id=\"accountingType\"]/div/div[2]")
	public WebElement codigoConta;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and  @id][1]")
	public WebElement codigoContaO;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\")]")
	public WebElement validade;
	

	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Justificativa\"]")
	public WebElement justificativa;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	
	//BOTON EXCLUIR EN MASA
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Salvar e Novo\"]")
	public WebElement gravareNovo;
	
	
	public CodigosAjustesExcluirMassaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
	String url = driver.getCurrentUrl();
		
		if (url.contains("tc2")==true || url.contains("tp1")==true) {
			sleep(1000);
			codigo.click();
		}else {
			ajustes.click();
			sleep(1000);
			codigo.click();
		}
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);
		
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		attributeToBeXpath("//div[@id=\"companyCode\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		empresaO.click();
		empresaO.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		tipoAjuste.click();
		opcion.click();
		sleep(1000);
		
		tipoLan.click();
		opcion.click();
		sleep(1000);
		
		descriçao.sendKeys("Código Ajuste de Teste QA 1");
		sleep(1000);
		actionsMoveToElementElement(codigoConta);
		sleep(1000);
		tributo.click();
		sleep(1000);
		
		tributoO.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"tributeType\"]/div", "class", "base-select required");
		sleep(1000);
		tipoTributo.click();
		sleep(1000);
		opcion.click();

		sleep(6000);
		detalheTributo.click();
		sleep(1000);
		detalheTributoO.click();
		
		codigoConta.click();
		sleep(1000);
		codigoContaO.click();
		sleep(1000);
		
		validade.sendKeys(fechaActual());
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		justificativa.sendKeys("Teste");
		sleep(1000);
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		biblioteca.click();
		
		
		//SEGUNDA CREACION
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		attributeToBeXpath("//div[@id=\"companyCode\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		empresa.click();
		sleep(2000);
		empresaO.click();
		empresaO.sendKeys(Keys.ESCAPE);
		sleep(2000);

		
		tipoAjuste.click();
		opcion.click();
		sleep(1000);
		
		tipoLan.click();
		opcion.click();
		sleep(1000);
		
		descriçao.sendKeys("Código Ajuste de Teste QA 2");
		sleep(1000);
		actionsMoveToElementElement(codigoConta);
		sleep(1000);
		tributo.click();
		sleep(1000);
		
		tributoO.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"tributeType\"]/div", "class", "base-select required");
		sleep(1000);
		tipoTributo.click();
		sleep(1000);
		opcion.click();
		sleep(1000);
		attributeToBeXpath("//div[@id=\"tributeTypeDetail\"]/div/div/div/div[1]", "class", "input-wrapper base-input  required");
		sleep(2000);
		detalheTributo.click();
		sleep(1000);
		detalheTributoO.click();
		
		codigoConta.click();
		sleep(1000);
		codigoContaO.click();
		sleep(1000);
		
		validade.sendKeys(fechaActual());
		gravar.click();
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		justificativa.sendKeys("Teste");
		sleep(1000);
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		
		int botaoNao = rows("//button[text()=\"Não\"]");
		
		if (botaoNao > 0) {
			nao.click();
		}
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		
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
	
	public boolean ExcluirEmMassa() {
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
		waitExpectElement(aceitar);
		sleep(1000);
		aceitar.click();
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
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println(id);
		}
			
		int id1 = convertToInt(id);
		int id2 = convertToInt(idRegistro1);
		int id3 = convertToInt(idRegistro2);
		
		System.out.println("Id Ultimo Registro: "+ id1);
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
