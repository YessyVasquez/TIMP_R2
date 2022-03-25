package com.sap.timp.pageObjectModel.MDR.SCANC.RelacionamentoEntreQuadros;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RelacionamentoEntreQuadrosExcluirMassaPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"Relacionamento entre Quadros\"]")
	public WebElement relacionamentoentrequadros;
	
	@FindBy(xpath = "//span[text()=\"Novo Relacionamento entre Quadros\"]")
	public WebElement novorelacionamento;
	
	

	@FindBy(xpath = "//div[@id=\"company-relationships\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement opcaoempresa;
	
	
	@FindBy(xpath = "//div[@id=\"tax-relationships\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id][text()=\"ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@id=\"tax-type-relationships\"]/div/div/div[2]")
	public WebElement tipodetributo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"operacao-relationships\"]/div/div/div[2]")
	public WebElement operacao;
	
	@FindBy(xpath = "//div[@id=\"annexe-relationships\"]/div/div/div[2]")
	public WebElement anexo;
	
	
	@FindBy(xpath = "//div[@id=\"square-relationships\"]/div/div/div[2]")
	public WebElement quadro;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data de Início de Vigência\"]")
	public WebElement datainicial;
	
	
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//span[contains(text(),\"Salvar e Novo\")]")
	public WebElement novo1;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	@FindBy(xpath = "//*[@id=\"company-relationships\"]/div/div[1]/div[1]/div[2]/input")
	public WebElement carga;
	
	public RelacionamentoEntreQuadrosExcluirMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	String id1G = "";
	String id2G = "";
	
public boolean criar() {
		
		sleep(2000);
		scanc.click();
		sleep(2000);
		
		relacionamentoentrequadros.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novorelacionamento.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//Primeiro Registro
		empresa.click();	
		sleep(2000);		
		opcaoempresa.click();
		sleep(2000);

		body.click();
		
		sleep(2000);	
		tributo.click();	
		sleep(2000);		
		opcaotributo.click();
		
		sleep(2000);
		attributeToBeXpath("//div[@id=\"tax-type-relationships\"]/div", "class", "base-select required");
		sleep(2000);
		
		tipodetributo.click();
		
		sleep(2000);
		opcao.click();	
		sleep(2000);
		operacao.click();
		sleep(2000);	
		opcao.click();		
		sleep(2000);		
		anexo.click();		
		sleep(2000);	
		opcao.click();	
		sleep(2000);	
		quadro.click();	
		sleep(2000);		
		opcao.click();	
		sleep(2000);	
		String data=fechaActual();
		datainicial.sendKeys(data);
		
		
		novo1.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		//Segundo Registro
		waitExpectElement(carga);
		sleep(2000);
		empresa.click();	
		sleep(2000);		
		opcaoempresa.click();
		sleep(2000);

		body.click();
		
		sleep(2000);	
		tributo.click();	
		sleep(2000);		
		opcaotributo.click();
		
		sleep(2000);
		attributeToBeXpath("//div[@id=\"tax-type-relationships\"]/div", "class", "base-select required");
		sleep(2000);
		
		tipodetributo.click();
		
		sleep(2000);
		opcao.click();	
		sleep(2000);
		operacao.click();
		sleep(2000);
		opcao.click();		
		sleep(2000);		
		anexo.click();		
		sleep(2000);	
		opcao.click();	
		sleep(2000);	
		quadro.click();	
		sleep(2000);		
		opcao.click();	
		sleep(2000);	
		String data2 =fechaActual();
		datainicial.sendKeys(data2);
		
		sleep(2000);
		novo1.click();
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
		id1G= idRegistro1;
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		id2G= idRegistro2;
		
		
	
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
		System.out.println("Rows Excluir");
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check1.click();
		sleep(1000);
		rows = rows-1;

		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check2.click();
		
		sleep(1000);
		System.out.println("Clico en los checks");
		
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
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		int id1 = convertToInt(id);
		int id2 = convertToInt(id1G);
		int id3 = convertToInt(id2G);
		
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
