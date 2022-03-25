package com.sap.timp.pageObjectModel.MDR.CodigoContabilizacao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigoContabilizacaoVisualizarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Códigos de Contabilização\"]")
	public WebElement codigoscontabilizacao;
		

	@FindBy(xpath = "//span[text()=\"Id\"]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[text()=\"Novo Código de Contabilização\"]")
	public WebElement novocodigocontabilizacao;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement mostrar;
	

	@FindBy(xpath = "//div[@class=\"icon icon-font-Sign-and-Symbols icon-downmenu\"]")
	public WebElement empresa;
	
	//@FindBy(xpath = "//*[@id=\"1000\"]/div[1]/label/span")
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tipo de Lançamento \"]")
	public WebElement tipolancamento;
	
	@FindBy(xpath = "//li[@class=\"list-item selected visible\"]")
	public WebElement opcaotipolancamento;

	@FindBy(xpath = "//*[@id=\"standard-description\"]/div/div/input")
	public WebElement descricaopadrao;
	
	@FindBy(xpath = "//div[@class=\"icon main-icon icon-font-Sign-and-Symbols icon-downmenu\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[text()=\"ICMS\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//*[@id=\"start-date\"]/div/div[1]/input")
	public WebElement datainicio;
	
	@FindBy(xpath = "//div[@id=\"tax-type\"]/div/div[2]")
	public WebElement tipotributo;
	
	//@FindBy(xpath = "//div[@class=\"base-autocomplete-box show\"]/ul/li[2]")
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaotipotributo;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[1]/div")
	public WebElement engrenagem;
	
	@FindBy(xpath ="//*[@id=\"list\"]/div/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/ul/li[3]")
	public WebElement editar;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[3]/div[1]/div/div[2]/ul/li[2]/span[2]")
	public WebElement visualizar;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//span[@id=\"release\"]")
	public WebElement pagamentovi;
	
	
	@FindBy(xpath = "//span[@id=\"accounting\"]")
	public WebElement codigocontabilizacaovi;
	
	@FindBy(xpath = "//span[@id=\"padrao\"]")
	public WebElement descricaopadraovi;
	
	@FindBy(xpath = "//span[@id=\"tribute\"]")
	public WebElement tributovi;
	
	@FindBy(xpath = "//span[@id=\"typeTribute\"]")
	public WebElement tipotributovi;
	
	@FindBy(xpath = "//span[@id=\"validity\"]")
	public WebElement datavi;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000\"]")
	public WebElement empresaed;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tipo de Lançamento \"]")
	public WebElement pagamentoed;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Código Contabilização\"]")
	public WebElement codigocontabilizacaoed;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Descrição Padrão\"]")
	public WebElement descricaopadraoed;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo \"]")
	public WebElement tributoed;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tipo de Tributo \"]")
	public WebElement tipotributoed;
	
	@FindBy(xpath = "//div[@id=\"start-date\"]/div/div/input")
	public WebElement dataed;
	
	public CodigoContabilizacaoVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public ArrayList<Boolean> visualizar() {
		
		

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		codigoscontabilizacao.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		// Pega o ultimo id
		siguiente.click();
		// setafinal.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("CodigoContabilizacao");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		attributeToBeXpath("//table[@class=\"edit\"]", "class", "edit");
		
		//visualizar
		
				String empresavisualizar = empresavi.getText();
				String pagamentovisualizar = pagamentovi.getText();
				String codigocontabilizacaovisualizar = codigocontabilizacaovi.getText();
				String descricaovisualizar = descricaopadraovi.getText();
				String tributovisualizar = tributovi.getText();
				String tipotributovisualizar= tipotributovi.getText();
				String datavisualizar = datavi.getText();
						
				System.out.println(empresavisualizar);
				System.out.println(pagamentovisualizar);
				System.out.println(codigocontabilizacaovisualizar);
				System.out.println(descricaovisualizar);
				System.out.println(tributovisualizar);
				System.out.println(tipotributovisualizar);
				System.out.println(datavisualizar);
			
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				sleep(2000);
				biblioteca.click();
				
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				sleep(2000);
				waitExpectElement(siguiente);
				sleep(2000);
				siguiente.click();
				
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				sleep(2000);
				
				//pega o ultimo id que foi gerado no criar
				String idRegistro1 = idObter("CodigoContabilizacao");
				
				WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
				WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
				actionsMoveToElementElement(menu1);
				sleep(2000);
				menu1.click();
				sleep(1000);
				
				editar.click();
				sleep(2000);
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				sleep(9000);
				
				
				//editar
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				sleep(2000);
				attributeToBeXpath("//div[@id=\"tax-type\"]/div", "class", "base-autocomplete required");
				sleep(2000);
				
				String empresaeditar = empresaed.getText();
				String pagamentoeditar = pagamentoed.getAttribute("value");
				String codigocontabilizacaoeditar = codigocontabilizacaoed.getAttribute("value");
				String descricaoeditar = descricaopadraoed.getAttribute("value");
				String tributoeditar = tributoed.getAttribute("value");
				String tipotributoeditar= tipotributoed.getAttribute("value");
				String dataeditar = dataed.getAttribute("value");
						
				System.out.println(empresaeditar);
				System.out.println(pagamentoeditar);
				System.out.println(codigocontabilizacaoeditar);
				System.out.println(descricaoeditar);
				System.out.println(tributoeditar);
				System.out.println(tipotributoeditar);
				System.out.println(dataeditar);
			
				
				ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
				sucesso.add(empresaeditar.equals(empresavisualizar));
				sucesso.add(pagamentoeditar.equals(pagamentovisualizar));
				sucesso.add(codigocontabilizacaoeditar.equals(codigocontabilizacaovisualizar));
				sucesso.add(descricaoeditar.equals(descricaovisualizar));
				sucesso.add(tributoeditar.equals(tributovisualizar));
				sucesso.add(tipotributoeditar.contains(tipotributovisualizar));
				sucesso.add(datavisualizar.equals(dataeditar));
				
				System.out.println(sucesso);
				
		/*
		String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
			
		*/
		return sucesso;
		
    }

}
