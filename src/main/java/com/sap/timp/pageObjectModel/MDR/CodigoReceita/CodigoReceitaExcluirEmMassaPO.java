package com.sap.timp.pageObjectModel.MDR.CodigoReceita;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigoReceitaExcluirEmMassaPO extends TestBaseSteven{
	

	@FindBy(xpath = "//span[text()=\"Código da Receita\"]")
	public WebElement codigoReceita;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id][text()=\"ICMS\"]")
	public WebElement tributoO;
	
	@FindBy(xpath = "//li[text()=\"ICMS\"]")
	public WebElement tributoO2;
	
	@FindBy(xpath = "//li[@class=\"list-item\" and @id and string()][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//li[@id][2]")
	public WebElement opcao1;
	
	@FindBy(xpath = "//div[@id=\"state\"]/div/div/div[2]")
	public WebElement ufOrigem;

	
	@FindBy(xpath = "//input[contains(@placeholder,\"Código da Receita\")]")
	public WebElement codigoR;
	
	@FindBy(xpath = "//textarea[contains(@placeholder,\"Descrição Código da Receita\")]")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div/input")
	public WebElement validadeDe;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement btnJustificativa;
	
	@FindBy(xpath = "//div[@id=\"justification\"]/div/textarea")
	public WebElement inputJustificativa;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement btnAplicar;
	
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

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	public CodigoReceitaExcluirEmMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		codigoReceita.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);

		
		novo.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//Primeiro Registro
		tributo.click();
		sleep(2000);
		tributoO.click();

		attributeToBeXpath("//div[@id=\"state\"]/div", "class", "base-select required");
		sleep(2000);
		ufOrigem.click();
		sleep(2000);
		opcao.click();

		sleep(1000);
		
		codigoR.sendKeys("012");
		descricao.sendKeys("Teste de Código da Receita");
		
		validadeDe.sendKeys(fechaActual());

		
		
		sleep(2000);
		novo.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(1000);
		nao.click();
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay dark\"]");
		sleep(6000);

		//Segundo Registro
		
		tributo.click();
		sleep(2000);
		tributoO2.click();

		attributeToBeXpath("//div[@id=\"state\"]/div", "class", "base-select required");
		sleep(2000);
		ufOrigem.click();
		sleep(2000);
		opcao.click();

		sleep(1000);
		
		codigoR.sendKeys("0123");
		descricao.sendKeys("Teste de Código da Receita");
		
		validadeDe.sendKeys(fechaActual());		
		sleep(1000);

		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(1000);
		nao.click();
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		sleep(3000);
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
		System.out.println("Id antes da criação: "+id);
		System.out.println("Id após da criação: "+idRegistro1);
		System.out.println("Id após da criação: "+idRegistro2);
		
		double idD = convertToDouble(id);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		boolean sucesso = false;
		
		if (idRegistroD1 > idD && idRegistroD2 > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println("Registros Criados: "+sucesso);
		
		
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
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
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
