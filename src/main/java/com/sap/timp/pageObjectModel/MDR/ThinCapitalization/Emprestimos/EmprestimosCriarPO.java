package com.sap.timp.pageObjectModel.MDR.ThinCapitalization.Emprestimos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class EmprestimosCriarPO extends TestBaseKenssy {
	@FindBy(xpath = "//span[text()=\"Thin Capitalization\"]")
	public WebElement thinCapitalization;
	
	@FindBy(xpath = "//span[text()=\"Empréstimos\"]")
	public WebElement emprestimos;
	
	@FindBy(xpath = "//span[text()=\"Novo Empréstimo\"]")
	public WebElement novoEmprestimo;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	
	//DATOS DE NUEVO EMPRESTIMO
	@FindBy(xpath="//div[@id=\"companies\"]/div/div/div[2]")
	public WebElement empresa;
		@FindBy(xpath="//div[text()=\"1000\"]")
		public WebElement opcEmpresa;
		
	@FindBy(xpath="//div[@id=\"uf\"]/div/div/div[2]")
	public WebElement ufFilial;
		@FindBy(xpath="//diV[text()=\"AL\"]")
		public WebElement opcUfFilial;
	
	@FindBy(xpath="//div[@id=\"branches\"]/div/div/div[2]")
	public WebElement filial;
		@FindBy(xpath="//div[text()=\"1000-AL-0008\"]")
		public WebElement opcFilial;
		
	@FindBy(xpath="//*[@id=\"loanDate\"]/div/div[1]/input")
	public WebElement datadoEmprestimo;
		
	@FindBy(xpath="//div[@id=\"capitalizationRules\"]/div/div/div[2]")
	public WebElement reglas;
		@FindBy(xpath="//li[@id][2]")
		public WebElement opcReglas;
	
	@FindBy(xpath="//div[@id=\"lender\"]/div/div/div[2]")
	public WebElement tipoDeCredor;
		@FindBy(xpath="//li[@id][1]")
		public WebElement opcTipoDeCredor;
	
	@FindBy(xpath="//*[@id=\"ratio\"]/div/div[1]/input")
	public WebElement dividaCapital;

	@FindBy(xpath="//*[@id=\"contractNo\"]/div/div[1]/input")
	public WebElement numContrato;
	
	@FindBy(xpath="//*[@id=\"rate\"]/div/div[1]/input")
	public WebElement taxa;
	
	@FindBy(xpath="//*[@id=\"term\"]/div/div[1]/input")
	public WebElement prazo;
	
	@FindBy(xpath="//*[@id=\"lenderCountry\"]/div/div[1]/input")
	public WebElement paisDoCredor;

	@FindBy(xpath="//*[@id=\"lenderCity\"]/div/div[1]/input")
	public WebElement CidadedoCredor;	
	
	@FindBy(xpath="//*[@id=\"lenderName\"]/div/div[1]/input")
	public WebElement nomeCredor;
	
	@FindBy(xpath="//*[@id=\"originalValue\"]/div/div[1]/input")
	public WebElement valorOriginal;
	
	@FindBy(xpath="//*[@id=\"startDate\"]/div/div[1]/input")
	public WebElement dataInicial;

	@FindBy(xpath="//*[@id=\"endDate\"]/div/div[1]/input")
	public WebElement dataFinal;
	
	@FindBy(xpath="//*[@id=\"loanType\"]/div/div[1]/input")
	public WebElement tipoEmprestimo;
	
	
	//GRAVAR DATOS	
	@FindBy(xpath="//body")
	public WebElement clickFuera;

	@FindBy(xpath="//span[text()=\"Gravar\"]")
	public WebElement gravar;	
	
	@FindBy(xpath="//button[text()=\"Sim\"]")
	public WebElement simGravar;
	
	@FindBy(xpath="//button[text()=\"Não\"]")
	public WebElement no;
	
	@FindBy(xpath="//span[text()=\"Biblioteca\"]")
	public WebElement irBiblioteca;
	
	@FindBy(xpath="//div[contains(@class,\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\")][2]")
	public WebElement irFinalPagina;	
		
	public EmprestimosCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean CriarEmprestimos() {
		sleep(2000);
		thinCapitalization.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		emprestimos.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		irFinalPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = "0";
		
		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println(id);
		}	
		
//		
//		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
//		System.out.println("cantidad de rows: " + rows);
//		
//		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
//		System.out.println(id);
		
		
		novoEmprestimo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		empresa.click();
		sleep(2000);
		opcEmpresa.click();
		closeSelectTypeCheckbox(empresa);
		sleep(2000);
		
		//attributeToBeXpath("//div[@id=\"uf\"]/div","class", "base-select required");
		sleep(8000);
		
		ufFilial.click();
		opcUfFilial.click();
		closeSelectTypeCheckbox(ufFilial);
		sleep(2000);
		
	//	attributeToBeXpath("//div[@id=\"branches\"]/div","class", "base-select required");
		sleep(8000);
		
		filial.click();
		opcFilial.click();
		closeSelectTypeCheckbox(filial);
		sleep(8000);
		
		String fecha = fechaActual();
		datadoEmprestimo.sendKeys(fecha);
		sleep(2000);
		
		reglas.click();
		opcReglas.click();
		opcReglas.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		tipoDeCredor.click();
		opcTipoDeCredor.click();
		opcTipoDeCredor.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		
//		String dividaCapitalText = dividaCapital.getAttribute("value");
//		System.out.println("DiviadaCapital: "+dividaCapitalText);
//		sleep(2000);
		
		numContrato.sendKeys("110");
		sleep(2000);
		
		taxa.sendKeys("10");
		sleep(2000);
		
		String fechaPrazo = fechaActual();
		prazo.sendKeys("01/12/2020");
		sleep(2000);
		
		paisDoCredor.sendKeys("CRISTHIAN");
		sleep(2000);
		
		CidadedoCredor.sendKeys("MEDINA");
		sleep(2000);
		
		nomeCredor.sendKeys("KENSSY");
		sleep(2000);
		
		valorOriginal.sendKeys("1000");
		sleep(2000);
		
		
		dataInicial.sendKeys("01/11/2020");
		sleep(2000);
		
		dataFinal.sendKeys("03/11/2020");
		sleep(2000);
		
		tipoEmprestimo.sendKeys("KENSSY");
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		simGravar.click();
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		irBiblioteca.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		no.click();
		sleep(2000);
		
		irFinalPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("emprestimos", idB);
		System.out.println(id);
		System.out.println(idB);
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;
		
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		System.out.println( sucesso);
		return sucesso;
	}
}
