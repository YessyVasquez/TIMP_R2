package com.sap.timp.pageObjectModel.MDR.CadastroDerex.InstituicaoFinanceira;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;

	public class InstituicaoExcluirMasasPO extends TestBaseMassiel {
	
		
		@FindBy(xpath = "//li/div/span[text()=\"Cadastro DEREX\"]")
		public WebElement derex;
		
		@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
		public WebElement siguiente;
		
		@FindBy(xpath = "//div[@class=\"thead\"]/div/div[3]")
		public WebElement idC;
		
		@FindBy(xpath = "//li/div/span[text()=\"Instituição Financeira\"]")
		public WebElement instituicaoF;
		
		@FindBy(xpath = "//button/span[text()=\"Nova Instituição Financeira\"]")
		public WebElement nova;
		
		@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/input")
		public WebElement empresa;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id]")
		public WebElement empresaO;
		
		@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/input")
		public WebElement filial;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id]")
		public WebElement filialO;
		
		@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div[2]")
		public WebElement tributo;
		@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
		public WebElement tributoO;
		
		@FindBy(xpath = "//div[@id=\"financialInstitution\"]/div/div/input")
		public WebElement instituicao;
		
		@FindBy(xpath = "//div[@id=\"country\"]/div/div[2]")
		public WebElement pais;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id]")
		public WebElement paisO;
		
		@FindBy(xpath = "//div[@id=\"options\"]/div/div/div[2]")
		public WebElement moedaOrdem;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id]")
		public WebElement moedaOrdemO;
		
		@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div/input")
		public WebElement validF;
		
		@FindBy(xpath = "//div[@id=\"coin\"]/div/div[2]")
		public WebElement moeda;
		@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id]")
		public WebElement moedaO;
		
		@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
		public WebElement gravar;
		
		@FindBy(xpath = "//button[text()=\"Sim\"]")
		public WebElement sim;
		
		@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
		public WebElement biblioteca;
		/*
		@FindBy(xpath = "")
		public WebElement ;
		*/
		/*
		@FindBy(xpath = "")
		public WebElement ;
		@FindBy(xpath = "")
		public WebElement ;
		@FindBy(xpath = "")
		public WebElement ;
		@FindBy(xpath = "")
		public WebElement ;
		@FindBy(xpath = "")
		public WebElement ;
		*/
		
		@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
		public WebElement ultimaPagina;
		
		//BOTON EXCLUIR EN MASA
		@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
		public WebElement excluirMassa;
			
		@FindBy(xpath = "//button[text()=\"Sim\"]")
		public WebElement aceitar;
			
		public InstituicaoExcluirMasasPO() {

			PageFactory.initElements(driver, this);
		}
		

		public boolean criar() {
			
			derex.click();
			sleep(1000);
			instituicaoF.click();
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			siguiente.click();
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
			
			String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			sleep(2000);
			
			nova.click();
			sleep(2000);
			attributeToBeXpath("//div[@id=\"company\"]/div", "class", "base-select required");
			//waitExpectElement(biblioteca);
			//waitExpectXpath("//*[@id=\"Editcontainer\"]/div[4]/div/div/div/img");
			sleep(2000);
			empresa.click();
			sleep(1000);
			empresaO.click();
			
			attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-select required");
			sleep(1000);
			filial.click();
			sleep(1000);
			filialO.click();
			
			sleep(2000);
			tributo.click();
			sleep(2000);
			tributoO.click();
			tributoO.sendKeys(Keys.ESCAPE);
			
			sleep(1000);
			
			instituicao.sendKeys("TA Instituição Financeira");
			
			sleep(1000);
			
			pais.click();
			sleep(1000);
			paisO.click();
			sleep(1000);
			
			actionsMoveToElementXpath("//input[@placeholder=\"Selecionar Validade Até\"]");
			
			moedaOrdem.click();
			sleep(1000);
			moedaOrdemO.click();
			sleep(1000);
			attributeToBeXpath("//div[@id=\"coin\"]/div", "class", "base-autocomplete required");
			
			sleep(2000);
			moeda.click();
			sleep(1000);
			actionsMoveToElementElement(moedaO);
			moedaO.click();
			
			
			String validFrom = fechaActual();
			
			validF.sendKeys(validFrom);
			
			sleep(2000);
			
			gravar.click();
			sleep(2000);
			waitExpectElement(sim);
			sleep(2000);
			sim.click();
			sleep(2000);
			waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			biblioteca.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			nova.click();
			sleep(2000);
			attributeToBeXpath("//div[@id=\"company\"]/div", "class", "base-select required");
			//waitExpectElement(biblioteca);
			//waitExpectXpath("//*[@id=\"Editcontainer\"]/div[4]/div/div/div/img");
			sleep(2000);
			empresa.click();
			sleep(1000);
			empresaO.click();
			
		//	attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-select required");
			sleep(5000);
			filial.click();
			sleep(1000);
			filialO.click();
			
			sleep(2000);
			tributo.click();
			sleep(2000);
			tributoO.click();
			tributoO.sendKeys(Keys.ESCAPE);
			
			sleep(1000);
			
			instituicao.sendKeys("TA Instituição Financeira");
			
			sleep(1000);
			
			pais.click();
			sleep(1000);
			paisO.click();
			sleep(1000);
			
			actionsMoveToElementXpath("//input[@placeholder=\"Selecionar Validade Até\"]");
			
			moedaOrdem.click();
			sleep(1000);
			moedaOrdemO.click();
			sleep(1000);
			attributeToBeXpath("//div[@id=\"coin\"]/div", "class", "base-autocomplete required");
			
			sleep(2000);
			moeda.click();
			sleep(1000);
			actionsMoveToElementElement(moedaO);
			moedaO.click();
			
			
			String validFrom1 = fechaActual();
			
			validF.sendKeys(validFrom1);
			
			sleep(2000);
			
			gravar.click();
			sleep(2000);
			waitExpectElement(sim);
			sleep(2000);
			sim.click();
			sleep(2000);
			waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			biblioteca.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			siguiente.click();
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(6000);
			

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

		public boolean InstituicaoExcluirMasas() {
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
			waitExpectElement(ultimaPagina);
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			ultimaPagina.click();
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
