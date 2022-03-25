package com.sap.timp.pageObjectModel.MDR.IncentivosFiscais;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseMassiel;

public class IncentivosFiscaisCriarPO extends TestBaseMassiel {

	@FindBy(xpath = "//ul[@class=\"accordion\"]/li[contains(@identifier,\"accordion-item-incentivosFiscais\")]/div/span[2]")
	public WebElement incentivosFiscais;

	@FindBy(xpath = "//ul[@class=\"accordion\"]/li[contains(@identifier,\"accordion-item-cadastroIncentivosFiscais\")]/div/span[2]")
	public WebElement subIncentivosFiscais;

	@FindBy(xpath = "//span[text()=\"Novo Incentivo Fiscal\"]")
	public WebElement novoIncentivo;

	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	//SELECT SIN CHECKBOX

	@FindBy(xpath="//div[@id=\"tribute\"]/div/div/div[2]")
	public WebElement tributo;

	@FindBy(xpath="//li[@id][1]")
	public WebElement opcTributo;

	//SELECT CON CHECKBOX	

	@FindBy(xpath = "//*[@id=\"company\"]/div/div[1]/div[1]")
	public WebElement empresa;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
	public WebElement opcempresa;

	@FindBy(xpath ="//*[@id=\"uf\"]/div/div[1]/div[1]")
	public WebElement selecionarUfFilial; 

	@FindBy(xpath ="//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
	public WebElement opcselecionarUfFilial; 

	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div[1]")
	public WebElement filial;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[@class]/label/span")
	public WebElement opcfilial;	


	//SELECT NORMAL	
	@FindBy(xpath="//div[@id=\"taxType\"]/div/div/div[2]")
	public WebElement seleccionarTipoImposto;

	@FindBy(xpath="//li[@id][1]")
	public WebElement opcTipoImposto;

	@FindBy(xpath="//div[@id=\"taxTypeDetail\"]/div/div/div[2]")
	public WebElement seleccionarDetalheTipoTributo;

	@FindBy(xpath="//li[@id][1]")
	public WebElement opcDetalheTipoTributo;	


	@FindBy(xpath="//div[@id=\"beneficio\"]/div/div/div[2]")
	public WebElement seleccionarNomeDoBeneficio;

	@FindBy(xpath="//li[@id][1]")
	public WebElement opcNomeDoBeneficio;	


	@FindBy(xpath="//div[@id=\"baseCalculo\"]/div/div/div[2]")
	public WebElement seleccionarBaseCalculo;

	@FindBy(xpath="//li[@id][1]")
	public WebElement opcBaseCalculo;

	@FindBy(xpath="//div[@id=\"iniBeneficio\"]/div/div/input")
	public WebElement inicioBeneficio;


	@FindBy(xpath="//div[@id=\"fimBeneficio\"]/div/div/input")
	public WebElement fimBeneficio;


	@FindBy(xpath="//span[text()=\"Gravar\"]")
	public WebElement gravar;


	@FindBy(xpath="//button[text()=\"Sim\"]")
	public WebElement simGravar;


	@FindBy(xpath="//span[text()=\"Biblioteca\"]")
	public WebElement irBiblioteca;


	@FindBy(xpath="//*[@id=\"table\"]/div/div[2]/div/div[6]")
	public WebElement irFinalPagina;



	@FindBy(xpath="//body")
	public WebElement clickFuera;





	public IncentivosFiscaisCriarPO() {

		PageFactory.initElements(driver, this);
	}


	public Boolean CriarIncentivosFiscais() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		incentivosFiscais.click();
		sleep(2000);

		subIncentivosFiscais.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		System.out.println("soy rows: "+rows);
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println(id);



		novoIncentivo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		tributo.click();
		opcTributo.click();
		opcTributo.sendKeys(Keys.ESCAPE);


		empresa.click();
		sleep(2000);
		opcempresa.click();
		sleep(2000);
		clickFuera.click();



		selecionarUfFilial.click();
		sleep(2000);
		opcselecionarUfFilial.click();
		sleep(2000);
		clickFuera.click();


		filial.click();
		sleep(2000);
		opcfilial.click();
		sleep(2000);
		clickFuera.click();


		//seleccionarTipoImposto.click();
		//sleep(2000);
		//opcTipoImposto.click();
		//sleep(2000);
		//		opcTipoImposto.sendKeys(Keys.ESCAPE);
		//		sleep(2000);

		//ojoooo
		//sleep(15000);
		//attributeToBeXpath("//div[@id=\"taxTypeDetail\"]/div", "class", "base-select ");

		//actionsMoveToElementXpath("//div[@id=\"taxTypeDetail\"]/div/div");
		//sleep(2000);
		//attributeToBeXpath("//div[@id=\"taxTypeDetail\"]/div/div", "aria-label", "Clique/Aperte Enter  para Selecionar Detalhe de Tipo de Tributo; Menu Suspenso");
		//sleep(2000);


		//seleccionarDetalheTipoTributo.click();
		//sleep(2000);
		//opcDetalheTipoTributo.click();
		//sleep(2000);
		//		BENEE 
		//		
		//		
		seleccionarNomeDoBeneficio.click();
		sleep(2000);
		opcNomeDoBeneficio.click();
		sleep(2000);

		System.out.println(opcNomeDoBeneficio);
			
		seleccionarBaseCalculo.click();
		sleep(2000);
		opcBaseCalculo.click();
		sleep(2000);
		//		opcBaseCalculo.sendKeys(Keys.ESCAPE);
		//		sleep(2000);



		inicioBeneficio.sendKeys("10/2020");
		clickFuera.click();
		sleep(2000);


		fimBeneficio.sendKeys("11/2020");
		clickFuera.click();
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

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		irFinalPagina.click();


		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		idInserir("IncentivosFiscais",idB);
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
