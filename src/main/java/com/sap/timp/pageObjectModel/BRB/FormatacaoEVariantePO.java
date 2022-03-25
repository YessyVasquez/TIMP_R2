package com.sap.timp.pageObjectModel.BRB;

import java.util.ArrayList;

//import org.omg.PortableInterceptor.SUCCESSFUL;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class FormatacaoEVariantePO extends TestBaseSteven {

	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravar;

	@FindBy(xpath = "//*[@id=\"draggable-66\"]/div/div/div/div[4]/span[contains(@class, \"output\")]")
	public WebElement mostrado;

	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[4]")
	public WebElement opcao;

	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;

	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;

	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button")
	public WebElement executar;


	// aumentar
	@FindBy(xpath = "//div[@data-column=\"28\" and contains(@aria-label, \"Linha: 1-\")]/div[2]")
	public WebElement empresa1;
	@FindBy(xpath = "//*[@id=\"variant-toolbar\"]/div/ul/li[4]/button")
	public WebElement aumentar;
	// disminuir
	@FindBy(xpath = "//div[@data-column=\"193\" and contains(@aria-label, \"Linha: 1-\")]/div[2]")
	public WebElement ufFilial1;
	@FindBy(xpath = "//*[@id=\"variant-toolbar\"]/div/ul/li[5]/button")
	public WebElement diminuir;
	// negrita
	@FindBy(xpath = "//div[@data-column=\"30\" and contains(@aria-label, \"Linha: 1-\")]/div[2]")
	public WebElement filial1;
	@FindBy(xpath = "//*[@id=\"variant-toolbar\"]/div/ul/li[6]/button")
	public WebElement negrita;
	// italica
	@FindBy(xpath = "//div[@data-column=\"21\" and contains(@aria-label, \"Linha: 1-\")]/div[2]")
	public WebElement dataLan1;
	@FindBy(xpath = "//*[@id=\"variant-toolbar\"]/div/ul/li[7]/button")
	public WebElement italica;
	// Tachado
	@FindBy(xpath = "//div[@data-column=\"8\" and contains(@aria-label, \"Linha: 1-\")]/div[2]")
	public WebElement categoria1;
	@FindBy(xpath = "//*[@id=\"variant-toolbar\"]/div/ul/li[8]/button")
	public WebElement tachado;

	// texto esquerda
	@FindBy(xpath = "//div[@data-column=\"79\" and contains(@aria-label, \"Linha: 1-\")]/div[2]")
	public WebElement valor1;
	@FindBy(xpath = "//*[@id=\"variant-toolbar\"]/div/ul/li[9]/button")
	public WebElement esquerda;

	// texto centro
	@FindBy(xpath = "//div[@data-column=\"28\" and contains(@aria-label, \"Linha: 2-\")]/div[2]")
	public WebElement empresa2;
	@FindBy(xpath = "//*[@id=\"variant-toolbar\"]/div/ul/li[10]/button")
	public WebElement centro;

	// texto centro
	@FindBy(xpath = "//div[@data-column=\"193\" and contains(@aria-label, \"Linha: 2-\")]/div[2]")
	public WebElement ufFilial2;
	@FindBy(xpath = "//*[@id=\"variant-toolbar\"]/div/ul/li[11]/button")
	public WebElement dereita;

	// texto centro
	@FindBy(xpath = "//div[@data-column=\"30\" and contains(@aria-label, \"Linha: 2-\")]/div[2]")
	public WebElement filial2;
	@FindBy(xpath = "//*[@id=\"variant-toolbar\"]/div/ul/li[13]/button")
	public WebElement destaque;

	@FindBy(xpath = "//div[@data-column=\"21\" and contains(@aria-label, \"Linha: 2-\")]/div[2]")
	public WebElement dataLan2;
	@FindBy(xpath = "//*[@id=\"variant-toolbar\"]/div/ul/li[15]/button")
	public WebElement limpar;

	@FindBy(xpath ="//*[@id=\"variant-toolbar\"]/div/div/ul/li[2]/button")
	public WebElement salvar;
	  
	@FindBy(xpath ="//*[@id=\"create-name\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath ="/html/body/div[3]/div/div[3]/button[2]")
	public WebElement aplicar;
	
	
	@FindBy(xpath ="/html/body/div[1]/div/div[2]/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/input")
	public WebElement visualizar;
	

	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement visualizacao;
	
	
	@FindBy(xpath = "//*[@id=\"variant-toolbar\"]/div/div/ul/li[3]/button")
	public WebElement excluir;
	

	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement sim;
	
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath ="//li[@class=\"list-item no-result\"]")
	 public WebElement noResult;

	public FormatacaoEVariantePO() {

		PageFactory.initElements(driver, this);
	}
	double aumentarV = 0;
	double diminuirV = 0;
	double negritaV = 0;
	
	public ArrayList<Boolean> formatacaoEVariante() {


		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectElement(menu);
		//sleep(menuT);

		menu.click();

		opcao.click();

		waitExpectXpath("//*[@id=\"variant-toolbar\"]/div/ul/li[6]/button");
		sleep(10000);
		executar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		// Aumentar
		empresa1.click();
		String aAumentarString = empresa1.getCssValue("font-size");
		aAumentarString = aAumentarString.replace("px", "");

		aumentar.click();
		String dAumentarString = empresa1.getCssValue("font-size");
		dAumentarString = dAumentarString.replace("px", "");

		Double aAumentarDouble = Double.valueOf(aAumentarString);
		Double dAumentarDouble = Double.valueOf(dAumentarString);
		
		aumentarV = dAumentarDouble;

		if (aAumentarDouble < dAumentarDouble) {
			sucesso.add(true);
		} else {
			sucesso.add(false);
		}

		// Diminuir
		ufFilial1.click();
		String aDiminuirString = ufFilial1.getCssValue("font-size");
		aDiminuirString = aDiminuirString.replace("px", "");

		diminuir.click();
		String dDiminuirString = ufFilial1.getCssValue("font-size");
		dDiminuirString = dDiminuirString.replace("px", "");

		Double aDiminuirDouble = Double.valueOf(aDiminuirString);
		Double dDiminuirDouble = Double.valueOf(dDiminuirString);
		diminuirV = dDiminuirDouble;

		if (aDiminuirDouble > dDiminuirDouble) {
			sucesso.add(true);
		} else {
			sucesso.add(false);
		}

		// Negrita
		filial1.click();
		String aNegritaString = filial1.getCssValue("font-weight");

		negrita.click();
		String dNegritaString = filial1.getCssValue("font-weight");

		Double aNegritaDouble = Double.valueOf(aNegritaString);
		Double dNegritarDouble = Double.valueOf(dNegritaString);
		negritaV = dNegritarDouble;

		if (aNegritaDouble < dNegritarDouble) {
			sucesso.add(true);
		} else {
			sucesso.add(false);
		}

		// italica
		dataLan1.click();
		italica.click();
		String dItalica = dataLan1.getCssValue("font-style");
		sucesso.add(dItalica.equals("italic"));

		// tachado
		actionsMoveToElementElement(categoria1);
		categoria1.click();
		tachado.click();
		String dTachadoString = categoria1.getCssValue("text-decoration");
		dTachadoString = dTachadoString.substring(0, 12);
		sucesso.add(dTachadoString.equals("line-through"));

		// esquerda
		actionsMoveToElementElement(valor1);
		valor1.click();
		esquerda.click();
		String dEsquerdaString = categoria1.getCssValue("text-align");
		sucesso.add(dEsquerdaString.equals("left"));

		// centro
		actionsMoveToElementElement(empresa2);
		empresa2.click();
		centro.click();
		String dCentroString = empresa2.getCssValue("text-align");
		sucesso.add(dCentroString.equals("center"));

		// dereita
		ufFilial2.click();
		dereita.click();
		String dDereitaString = ufFilial2.getCssValue("text-align");
		sucesso.add(dDereitaString.equals("right"));

		// destaque
		filial2.click();
		destaque.click();
		String dDestaqueString = filial2.getCssValue("background-color");
		sucesso.add(dDestaqueString.equals("rgba(0, 0, 0, 1)"));


		// limpar
		dataLan2.click();
		italica.click();
		sleep(1000);
		limpar.click();
		String limpo = dataLan2.getCssValue("font-style");
		sucesso.add(limpo.equals("normal"));
		sleep(000);
		
		
		return sucesso;

	}
	
	
	public ArrayList<Boolean> salvarVariante() {
		
		
		salvar.click();
		sleep(4000);
		nome.sendKeys("Visualizacão de teste");
		aplicar.click();
		sleep(3000);
		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		driver.navigate().refresh();

		waitExpectXpath("//*[@id=\"variant-toolbar\"]/div/ul/li[6]/button");
		attributeToBeXpath("//div[@id=\"variant-select\"]/div", "class", "base-select ");
		sleep(2000);
		visualizar.click();
		sleep(1000);
		visualizacao.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");
		
		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		// Aumentar

		String dAumentarString = empresa1.getCssValue("font-size");
		dAumentarString = dAumentarString.replace("px", "");
		Double dAumentarDouble = Double.valueOf(dAumentarString);
		

		if (dAumentarDouble == aumentarV) {
			sucesso.add(true);
		} else {
			sucesso.add(false);
		}

		// Diminuir
		String dDiminuirString = ufFilial1.getCssValue("font-size");
		dDiminuirString = dDiminuirString.replace("px", "");

		Double dDiminuirDouble = Double.valueOf(dDiminuirString);

		if (dDiminuirDouble == diminuirV) {
			sucesso.add(true);
		} else {
			sucesso.add(false);
		}

		// Negrita

		negrita.click();
		String dNegritaString = filial1.getCssValue("font-weight");
		Double dNegritarDouble = Double.valueOf(dNegritaString);

		if (dNegritarDouble == negritaV) {
			sucesso.add(true);
		} else {
			sucesso.add(false);
		}

		// italica
		String dItalica = dataLan1.getCssValue("font-style");
		sucesso.add(dItalica.equals("italic"));

		// tachado
		actionsMoveToElementElement(categoria1);
		String dTachadoString = categoria1.getCssValue("text-decoration");
		dTachadoString = dTachadoString.substring(0, 12);
		sucesso.add(dTachadoString.equals("line-through"));

		// esquerda
		actionsMoveToElementElement(valor1);
		String dEsquerdaString = categoria1.getCssValue("text-align");
		sucesso.add(dEsquerdaString.equals("left"));

		// centro
		actionsMoveToElementElement(empresa2);
		String dCentroString = empresa2.getCssValue("text-align");
		sucesso.add(dCentroString.equals("center"));

		// dereita
		String dDereitaString = ufFilial2.getCssValue("text-align");
		sucesso.add(dDereitaString.equals("right"));

		// destaque
		String dDestaqueString = filial2.getCssValue("background-color");
		sucesso.add(dDestaqueString.equals("rgba(0, 0, 0, 1)"));


		// limpar
		String limpo = dataLan2.getCssValue("font-style");
		sucesso.add(limpo.equals("normal"));
		
		
		return sucesso;
		
	}
	
	
	public boolean excluirVariantes() {
		
		excluir.click();
		sleep(3000);
		sim.click();
		sleep(5000);
		
		driver.navigate().refresh();
		
		waitExpectXpath("//*[@id=\"variant-toolbar\"]/div/ul/li[6]/button");
		attributeToBeXpath("//div[@id=\"variant-select\"]/div", "class", "base-select ");
		sleep(2000);
		visualizar.click();
		sleep(2000);
		boolean excluido = false;
		
		excluido = noResult.isDisplayed(); 
		
		
		return excluido;
		
	}
	

}
