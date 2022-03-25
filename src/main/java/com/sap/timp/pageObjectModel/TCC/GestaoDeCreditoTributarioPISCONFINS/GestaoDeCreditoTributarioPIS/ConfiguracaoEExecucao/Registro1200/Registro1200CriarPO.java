package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.Registro1200;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class Registro1200CriarPO extends TestBaseSteven{

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS\"]")
	public WebElement gestaocreditopis;
	

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisRegister1200\"]")
	public WebElement registro1200;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//div[@class=\"tr\" and @data-id][1]/div[2]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//span[text()=\"Novo Registro 1200\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div[2]/div/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[text()=\"ICMS\"]")
	public WebElement tributoO;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//label[@for=\"check-1000\"]/span")
	public WebElement empresaO;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//label[@for=\"check-SP\"]/span")
	public WebElement ufO;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement filialO;
	
	
	@FindBy(xpath = "//div[@id=\"natContRec\"]/div/div[@id=\"main-icon\"]")
	public WebElement naturaleza;
	
	@FindBy(xpath = "//*[@id=\"01\"]")
	public WebElement naturalezaOTQ1;
	
	@FindBy(xpath = "//*[@id=\"01\"]")
	public WebElement naturalezaOTC2;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement naturalezaOTP1;
	
	@FindBy(xpath = "//div[@id=\"vlContApur\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorApurada;
	
	@FindBy(xpath = "//div[@id=\"vlCredPisDesc\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorPis;
	
	@FindBy(xpath = "//div[@id=\"vlContDev\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorSocialDevida;
	
	@FindBy(xpath = "//div[@id=\"vlOutDed\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorSocialDeduções;
	
	@FindBy(xpath = "//div[@id=\"vlContExt\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorSocialAPagar;
	
	@FindBy(xpath = "//div[@id=\"vlMul\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorMulta;
	
	@FindBy(xpath = "//div[@id=\"vlJur\"]/div/div[@id=\"main-icon\"]")
	public WebElement valorJuros;
	
	
	@FindBy(xpath = "//li[text()=\"Zerado\"]")
	public WebElement opcionesValores;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Data de Recolhimento\"]")
	public WebElement data;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao;
	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar2;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	public Registro1200CriarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean criar() {

		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		if (url.contains("tc2")) {
			tc2 = true;
		}if (url.contains("tq1")) {
			tq1 = true;
		} else {
			tp1 = true;
		}
		

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		gestaocreditopis.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registro1200.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");

		String idRegistro = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id ultimo registro: " +idRegistro);
		
		novo.click();
		sleep(2000);
		waitExpectElement(empresa);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		
		
		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		
		uf.click();
		sleep(1000);
		ufO.click();
		sleep(1000);
		closeSelectTypeCheckbox(uf);
		sleep(1000);
	
		
		attributeToBeXpath("//div[@id=\"branch\"]/div", "class", "base-MultipleSelect3 required");
		sleep(3000);
		
		filial.click();
		sleep(1000);
		filialO.click();
		sleep(1000);
		closeSelectTypeCheckbox(filial);
		sleep(1000);
		
		naturaleza.click();
		sleep(2000);
		
		if (tq1 == true) {
			naturalezaOTQ1.click();
			sleep(2000);
		}else if (tp1== true) {
			naturalezaOTP1.click();
			sleep(2000);
		}else {
			naturalezaOTC2.click();
			sleep(2000);
		}
		
		
		valorApurada.click();
		sleep(2000);
		opcionesValores.click();
		sleep(2000);
		
		valorPis.click();
		sleep(2000);
		opcionesValores.click();
		sleep(2000);
		
		
		valorSocialDevida.click();
		sleep(2000);
		opcionesValores.click();
		sleep(2000);
		
		valorSocialDeduções.click();
		sleep(2000);
		opcionesValores.click();
		sleep(2000);
		
		valorSocialAPagar.click();
		sleep(2000);
		opcionesValores.click();
		sleep(2000);
		
		valorMulta.click();
		sleep(2000);
		opcionesValores.click();
		sleep(2000);
		
		valorJuros.click();
		sleep(2000);
		opcionesValores.click();
		sleep(2000);
		
		
		data.sendKeys(fechaActual());
		sleep(1000);
		
	
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(biblioteca);
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		int naobotao= driver.findElements(By.xpath("//button[text()=\"Não\"]")).size();
		if(naobotao>0) {
		waitExpectElement(nao);
		sleep(2000);
		nao.click();
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("GestaoCréditoTributárioPISRegistro1200",id2);
		int idD = convertToInt(idRegistro);
		int id2D = convertToInt(id2);
		
		System.out.println(idD);
		System.out.println(id2D);
		
		boolean sucesso = false;
		if (idD < id2D) {
			sucesso = true;
		}
		
		System.out.println(sucesso);
		
		return sucesso;
		}else {
			
			waitExpectElement(siguiente);
			sleep(2000);
			siguiente.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			
			rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
			String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			
			idInserir("GestaoCréditoTributárioPISRegistro1200",id2);
			int idD = convertToInt(idRegistro);
			int id2D = convertToInt(id2);
			
			System.out.println(idD);
			System.out.println(id2D);
			
			boolean sucesso = false;
			if (idD < id2D) {
				sucesso = true;
			}
			
			System.out.println(sucesso);
			
			return sucesso;
			
		}
	}
	
}
