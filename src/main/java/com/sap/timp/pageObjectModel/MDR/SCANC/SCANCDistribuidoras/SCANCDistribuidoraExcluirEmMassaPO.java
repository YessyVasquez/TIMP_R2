package com.sap.timp.pageObjectModel.MDR.SCANC.SCANCDistribuidoras;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.errorprone.annotations.FormatMethod;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;

public class SCANCDistribuidoraExcluirEmMassaPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"SCANC Distribuidoras\"]")
	public WebElement scancDistribuidoras;
	
	@FindBy(xpath = "//span[contains(text(),\"Nova\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[contains(@class,\"company\")]/div/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[contains(@class,\"uf\")]/div/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome\")]")
	public WebElement nome;
	
	@FindBy(xpath = "//button[@id=\"filterButtonStr\"]")
	public WebElement filtro;
	@FindBy(xpath = "//div[@id=\"rbtCode\"]/div/label/span")
	public WebElement opcoes;
	@FindBy(xpath = "//input[contains(@placeholder,\"Código\")]")
	public WebElement descricao;

	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\")]")
	public WebElement dataVigencia;
	

	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	
	
	public SCANCDistribuidoraExcluirEmMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		scanc.click();
		sleep(2000);
		
		scancDistribuidoras.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		novo.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	
		
		empresa.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		attributeToBeXpath("//div[contains(@class,\"uf\")]/div", "class", "input-element-wrapper");
		sleep(2000);
		
		uf.click();
		sleep(2000);
		opcao.click();
		sleep(1000);
		
		
		driver.findElement(By.xpath("//body")).click();
		sleep(2000);
		
		
		nome.sendKeys("Teste Distribuidora");
		
		sleep(1000);
		
		filtro.click();
		sleep(1000);
		waitExpectElement(opcoes);
		sleep(1000);
		opcoes.click();
		sleep(1000);
		descricao.sendKeys("1");
		sim.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		


		dataVigencia.sendKeys(fechaActual());
		
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		sim.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		refresh();
		
		waitExpectElement(empresa);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		empresa.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		attributeToBeXpath("//div[contains(@class,\"uf\")]/div", "class", "input-element-wrapper");
		sleep(2000);
		
		uf.click();
		sleep(2000);
		opcao.click();
		sleep(1000);
		
		
		driver.findElement(By.xpath("//body")).click();
		sleep(2000);
		
		
		nome.sendKeys("Teste Distribuidora");
		
		sleep(1000);
		
		filtro.click();
		sleep(1000);
		waitExpectElement(opcoes);
		sleep(1000);
		opcoes.click();
		sleep(1000);
		descricao.sendKeys("1");
		sim.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		


		dataVigencia.sendKeys(fechaActual());
		
		
		sleep(2000);
		gravar.click();
		sleep(2000);
		sim.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		rows = rows -1;
		String id3 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		

		idInserir("SCANCDistribuidoraExcluirEmMassa",id2);

		int idD = Integer.valueOf(id);
		int id2D = Integer.valueOf(id2);
		int id3D = Integer.valueOf(id3);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D && idD < id3D ) {
			sucesso = true;
		}
		
		
		System.out.println(sucesso);
		
		return sucesso;
	}		
	
	
	public boolean excluirMassa() {
		
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
		
		System.out.println("Ids Excluidos com sucesso: " +sucesso);
	
		return sucesso;
		
	}
	
	

}
