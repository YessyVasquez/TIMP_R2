 package com.sap.timp.pageObjectModel.MDR.Reinf.ProcessosAdmJudiciais;

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

public class ProcessosAdmJudiciaisExcluirEmMassaPO extends TestBaseSteven{
	
	
	
	@FindBy(xpath = "//span[text()=\"Reinf\"]")
	public WebElement reinf;
	
	@FindBy(xpath = "//span[text()=\"R1070 - Processos Adm. / Judiciais\"]")
	public WebElement processosadmjudiciais;
	
	@FindBy(xpath = "//span[text()=\"Novo Processo Reinf Adm/Judicial\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"field-element company\"]/div/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"]/div/div[text()][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"field-element branch\"]/div/div[2]/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"field-element processType\"]/div/div/div/div[2]")
	public WebElement tipodoprocesso;
	
	@FindBy(xpath = "//div[@id=\"option-2\"]/div")
	public WebElement opcao2;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Numero do Processo\"]")
	public WebElement numerodoprocesso;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement data1;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade Até\"]")
	public WebElement data2;
	
	@FindBy(xpath = "//div[@class=\"field-element uf\"]/div/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@class=\"field-element countyCode\"]/div/div/div/div[2]")
	public WebElement codigomunicipio;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Vara Judicial\"]")
	public WebElement varajudicial;
	
	@FindBy(xpath = "//div[@class=\"field-element authorshipType\"]/div/div/div/div[2]")
	public WebElement tipodeautoria;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	

	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	public ProcessosAdmJudiciaisExcluirEmMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		
		reinf.click();
		sleep(2000);
		processosadmjudiciais.click();
	
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
		
		sleep(2000);
		
		tipodoprocesso.click();
		
		sleep(2000);
		
		opcao2.click();
		
		sleep(2000);
		numerodoprocesso.sendKeys("777");
		sleep(2000);
		 
		
		String data ="10/2020";
		
		data1.sendKeys(data);
		
		data2.sendKeys(data);
		
		
		sleep(2000);
		
		uf.click();
		
		sleep(2000);
		opcao.click();
		
		sleep(1000);
		actionsMoveToElementElement(tipodeautoria);
		sleep(1000);
		
		filial.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		
		//attributoNotToBeEmptyXpath("//div[@class=\"field-element inscriptionNumber\"]/div/div[2]/div/div/div[2]/input", "textContent");
		//System.out.println("paso de aqui");
		attributeToBeXpath("//div[@class=\"field-element countyCode\"]/div", "class", "input-element-wrapper");
		sleep(4000);
		
		codigomunicipio.click();
		
		sleep(2000);
		
		opcao2.click();
		
		sleep(2000);
		
		varajudicial.sendKeys("Vara");
		
		sleep(2000);
		
		tipodeautoria.click();
		
		sleep(2000);
		
		opcao2.click();
		
		sleep(2000);

		gravar.click();
		sleep(2000);
		sim.click();
		
		refresh();
		
		waitExpectElement(empresa);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		
		sleep(2000);
		
		opcao.click();
		
		sleep(2000);
		
		tipodoprocesso.click();
		
		sleep(2000);
		
		opcao2.click();
		
		sleep(2000);
		numerodoprocesso.sendKeys("777");
		sleep(2000);
		 
		
		data ="11/2020";
		
		data1.sendKeys(data);
		
		data2.sendKeys(data);
		
		
		sleep(2000);
		
		uf.click();
		
		sleep(2000);
		opcao.click();
		
		sleep(1000);
		actionsMoveToElementElement(tipodeautoria);
		sleep(1000);
		
		filial.click();
		sleep(2000);
		opcao.click();
		sleep(2000);
		
		
		//attributoNotToBeEmptyXpath("//div[@class=\"field-element inscriptionNumber\"]/div/div[2]/div/div/div[2]/input", "value");
		//System.out.println("paso de aqui");
		attributeToBeXpath("//div[@class=\"field-element countyCode\"]/div", "class", "input-element-wrapper");
		sleep(4000);
		
		codigomunicipio.click();
		
		sleep(2000);
		
		opcao2.click();
		
		sleep(2000);
		
		varajudicial.sendKeys("Vara");
		
		sleep(2000);
		
		tipodeautoria.click();
		
		sleep(2000);
		
		opcao2.click();
		
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
		
		


		idInserir("ProcessosAdmJudiciaisExcluirEmMassa",id2);

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
		
		System.out.println("Ids Excluidos com sucesso: " +sucesso);
	
		return sucesso;
		
	}
	
	

}
