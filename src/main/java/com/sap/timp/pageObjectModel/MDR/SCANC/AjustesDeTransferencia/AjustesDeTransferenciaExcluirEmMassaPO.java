package com.sap.timp.pageObjectModel.MDR.SCANC.AjustesDeTransferencia;

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

public class AjustesDeTransferenciaExcluirEmMassaPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"Ajustes de Transferência\"]")
	public WebElement ajusteTransferencia;
	
	@FindBy(xpath = "//span[contains(text(),\"Nov\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement no;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao2;
	
	@FindBy(xpath = "//div[contains(@id,\"company\")]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[contains(@id,\"tax-transfers\")]/div/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[contains(@id,\"tax-type-transfers\")]/div/div/div[2]")
	public WebElement tipoImposto;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecionar Data de Início de Vigência\")]")
	public WebElement dataVigencia;
	
	
	@FindBy(xpath = "//div[@id=\"origin-table\"]/div/div[1]/div[2]/div/div[2]")
	public WebElement detalheTipoTributoO;
	@FindBy(xpath = "//div[@id=\"origin-table\"]/div/div[2]/div[2]/div/div[2]")
	public WebElement anexoO;
	@FindBy(xpath = "//div[@id=\"origin-table\"]/div/div[3]/div[2]/div/div[2]")
	public WebElement quadroO;
	@FindBy(xpath = "//div[@id=\"origin-table\"]/div/div[4]/div[2]/div/div[2]")
	public WebElement limiteO;
	
	@FindBy(xpath = "//div[@id=\"destiny-table\"]/div/div[1]/div[2]/div/div[2]")
	public WebElement detalheTipoTributoD;
	@FindBy(xpath = "//div[@id=\"destiny-table\"]/div/div[2]/div[2]/div/div[2]")
	public WebElement anexoD;
	@FindBy(xpath = "//div[@id=\"destiny-table\"]/div/div[3]/div[2]/div/div[2]")
	public WebElement quadroD;
	@FindBy(xpath = "//div[@id=\"destiny-table\"]/div/div[4]/div[2]/div/div[2]")
	public WebElement limiteD;


	

	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
	
	
	
	public AjustesDeTransferenciaExcluirEmMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		
		sleep(2000);
		scanc.click();
		sleep(2000);
		
		ajusteTransferencia.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = "0"; // Ultimo ID antes de crear un registro
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			//System.out.println(id);
		}
		//String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		System.out.println(id);
		
		sleep(2000);
		//criaçao
		novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(empresa);
		sleep(2000);
		
	
		
		empresa.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(2000);
		

		
		tributo.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"tax-type-transfers\"]/div", "class", "base-select required");
		sleep(2000);
		
		tipoImposto.click();
		sleep(2000);
		opcao2.click();
		sleep(8000);
		

		dataVigencia.sendKeys(fechaActual());
		sleep(2000);
		
		
		detalheTipoTributoO.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);
		
		anexoO.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);
		
		quadroO.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);
		
		limiteO.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);
		
		detalheTipoTributoD.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);
		
		anexoD.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);
		
		quadroD.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);
		
		limiteD.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);


		sleep(2000);
		gravar.click();
		sleep(2000);
		sim.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		driver.navigate(); refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");	
		waitExpectElement(empresa);
		sleep(60000);
		System.out.println("llege antes del segundo registro");
		sleep(12000);
		empresa.click();
		sleep(2000);
		opcao.click();
		opcao.sendKeys(Keys.ESCAPE);
		sleep(2000);
	
		tributo.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);
		
		attributeToBeXpath("//div[@id=\"tax-type-transfers\"]/div", "class", "base-select required");
		sleep(2000);
		
		tipoImposto.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);
		

		dataVigencia.sendKeys(fechaActual());
		
		
		
		detalheTipoTributoO.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);
		
		anexoO.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);
		
		quadroO.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);
		
		limiteO.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);
		
		detalheTipoTributoD.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);
		
		anexoD.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);
		
		quadroD.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);
		
		limiteD.click();
		sleep(2000);
		opcao2.click();
		sleep(2000);

		
		
//		sleep(2000);
//		gravar.click();
//		sleep(2000);
//		sim.click();
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[3]/div")).getText();
		
		rows1 = rows1 -1;
		String id3 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[3]/div")).getText();
		
		

		idInserir("SaldoInicialDiferidoExcluirMassa",id2);

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
		sleep(2000);
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[2]/label/span"));
		check2.click();
		
		sleep(2000);
		
		excluirMassa.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
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
