package com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ParametrosParaLivroICMSSTExcluirMasasPO extends TestBaseMassiel {
	@FindBy(xpath = "//span[text()=\"Livros Fiscais\"]")
	public WebElement livrosfiscais;

	@FindBy(xpath = "//span[text()=\"Parâmetros para Livro ICMS ST\"]")
	public WebElement parametrosparalivroicmsst;

	@FindBy(xpath = "//span[text()=\"Novos Parâmetros para Livro ICMS ST\"]")
	public WebElement novoparametros;



	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement dataincial;


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

	@FindBy(xpath = "//div[@class=\"field-element bookType_0_0\"]/div/div/div/div[2]")
	public WebElement tipodolivro;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaotipodolivro;

	@FindBy(xpath = "//div[@class=\"field-element companyId_0_0\"]/div/div/div/div[2]")
	public WebElement empresa;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoempresa;

	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div/label/span")
	public WebElement opcaoempresa2;
	
	@FindBy(xpath = "//div[@class=\"field-element stateId_0_1\"]/div/div/div/div[2]")
	public WebElement ufdafilial;

	@FindBy(xpath = "//div[@class=\"list-option\"]/div/div/label/span")
	public WebElement opcaoufdafilial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoufdafilial2;

	@FindBy(xpath = "//div[@class=\"field-element branchId_0_1\"]/div/div/div/div[2]")
	public WebElement filial;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaodafilial;

	@FindBy(xpath = "//div[@class=\"field-element taxCode_0_2\"]/div/div/div/div[2]")
	public WebElement tributo;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-2\"]/div")
	public WebElement opcaotributo;

	@FindBy(xpath = "//div[@class=\"field-element branchStructureHash_0_2\"]/div/div/div/div[2]")
	public WebElement informacaomdr;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoinformacaomdr;

	@FindBy(xpath = "//div[@class=\"field-element branchStateSt_0_3\"]/div/div/div/div[2]")
	public WebElement camposmdrufst;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaocamposmdrufst;

	@FindBy(xpath = "//div[@class=\"field-element branchState_0_3\"]/div/div/div/div[2]")
	public WebElement camposmdrfilial;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaocamposmdrfilial;

	@FindBy(xpath = "//div[@class=\"field-element companyStructure_0_4\"]/div/div/div/div[2]")
	public WebElement camposmdrempresa;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaocamposmdrempresa;

	@FindBy(xpath = "//div[@class=\"field-element filialStructure_0_4\"]/div/div/div/div[2]")
	public WebElement camposfilial;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaocamposfilial;

	@FindBy(xpath = "//div[@class=\"field-element stRegistrationStructureHash_0_5\"]/div/div/div/div[2]")
	public WebElement informacaomdrinscricao;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoinformacaomdrinscricao;


	@FindBy(xpath = "//div[@class=\"field-element stRegistrationFields_0_5\"]/div/div/div/div[2]")
	public WebElement camposinformacaomdrinscricao;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoinformacaomdrincricao;

	@FindBy(xpath = "//div[@class=\"field-element movementOriginStructureHash_0_6\"]/div/div/div/div[2]")
	public WebElement informacaoorigemdomovimento;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoinformacaoorigemdomovimento;

	@FindBy(xpath = "//div[@class=\"field-element movementOriginState_0_6\"]/div/div/div/div[2]")
	public WebElement camposinformacaoorigem;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaocamposinformacaoorigem;

	@FindBy(xpath = "//div[@class=\"field-element movementOriginBranch_0_7\"]/div/div/div/div[2]")
	public WebElement movimentoufdeparceiro;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaomovimentoufdeparceiro;

	@FindBy(xpath = "//div[@class=\"field-element movementOriginTax_0_7\"]/div/div/div/div[2]")
	public WebElement movimentotributo;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaomovimenttributo;

	@FindBy(xpath = "//div[@class=\"field-element adjustmentsStructureHash_0_8\"]/div/div/div/div[2]")
	public WebElement informacaodeajustes;

	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div")
	public WebElement opcaoinformacaodeajustes;

	@FindBy(xpath = "//div[@class=\"field-element adjustmentsFields_0_8\"]/div/div/div/div[2]")
	public WebElement camposinformacaodeajustes;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaocamposinformacaodeajustes;

	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;

	//BOTON EXCLUIR EN MASA
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement aceitar;
	
	public ParametrosParaLivroICMSSTExcluirMasasPO() {

		PageFactory.initElements(driver, this);
	}
	
	

	public boolean criar() {
		
		ParametrosParaLivroICMSSTCriarPO parametrosParaLivroICMSSTCriarPO;
		
		parametrosParaLivroICMSSTCriarPO = new ParametrosParaLivroICMSSTCriarPO();
		
		boolean sucesso = parametrosParaLivroICMSSTCriarPO.criar();
		
		return sucesso;

	}		
	
	public boolean ParametrosParaLivroICMSSTExcluirMasas() {
		String idRegistro = idObter("ParametrosParaLivroICMSST");


		WebElement excluir = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[2]/label/span"));
		
		
		excluir.click();
		sleep(2000);
		excluirMassa.click();
		sleep(3000);
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
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		double id1 = convertToInt(id);
		double id2 = convertToInt(idRegistro);
		System.out.println("Id antes da exlução: "+ id2);
		System.out.println("Id após a exclução: " +id1);
		
		
		boolean sucesso = false;
		
		if (id1 != id2) {
			sucesso= true;
		}

		System.out.println(sucesso);
		return sucesso;
	}
}

