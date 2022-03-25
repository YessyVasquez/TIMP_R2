package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1060AmbientesDeTrablho;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class S1060AmbientesDeTrablhoExcluirMassaPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Eventos e-Social\"]")
	public WebElement eventosesocial;
	
	@FindBy(xpath = "//span[text()=\"S1060 - Ambientes de Trabalho\"]")
	public WebElement s106ambientesdetrabalho;
	
	@FindBy(xpath = "//span[text()=\"Novo Ambiente de Trabalho\"]")
	public WebElement novoambiente;
	

	
	@FindBy(xpath = "//div[@id=\"registerType\"]/div/div/div/div[2]")
	public WebElement tipoderegistro;
	
	@FindBy(xpath = "//div[@id=\"option-2\"]/div")
	public WebElement opcaotipoderegistro;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Numero de Registro\"]")
	public WebElement numeroderegistro;
	
	@FindBy(xpath = "//div[@id=\"environmentType\"]/div/div/div/div[2]")
	public WebElement tipodeambiente;
	
	@FindBy(xpath = "//div[@id=\"option-1\"]/div")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@id=\"environmentDescription\"]/div/div/div/div[2]")
	public WebElement descricaodeambiente;

	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vig�ncia \"]")
	public WebElement datainicial;
	
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//span[contains(text(),\"Novo\")]")
	public WebElement novo1;
	
	public S1060AmbientesDeTrablhoExcluirMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		eventosesocial.click();
		sleep(2000);
		
		s106ambientesdetrabalho.click();
		
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
		
		novoambiente.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//Primeiro Registro
		tipoderegistro.click();
		sleep(2000);
		opcaotipoderegistro.click();
		
		sleep(2000);
		numeroderegistro.sendKeys("007");
		
		
		sleep(2000);
		tipodeambiente.click();
		sleep(2000);
		opcao.click();
		
		sleep(2000);
		descricaodeambiente.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		String data=fechaActual();
		datainicial.sendKeys(data);
		
		sleep(2000);
		novo1.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		//Segundo Registro
		
		tipoderegistro.click();
		sleep(2000);
		opcaotipoderegistro.click();
		
		sleep(2000);
		numeroderegistro.sendKeys("017");
		
		
		sleep(2000);
		tipodeambiente.click();
		sleep(2000);
		opcao.click();
		
		sleep(2000);
		descricaodeambiente.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		String data1=fechaActual();
		datainicial.sendKeys(data1);
		
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
