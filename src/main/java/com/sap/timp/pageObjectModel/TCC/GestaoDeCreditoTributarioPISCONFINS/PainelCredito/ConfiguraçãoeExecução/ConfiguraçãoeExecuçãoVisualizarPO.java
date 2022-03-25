package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.PainelCredito.ConfiguraçãoeExecução;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguraçãoeExecuçãoVisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Painel Crédito\"]")
	public WebElement painelCredito;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div[2]/ul/li[6]/ul/li[5]/ul/li[1]/div/span[2]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement ultimaPagina;
	
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;

	
	@FindBy(xpath = "//*[@id=\"company\"]/div/div[1]/div[1]/div[2]/input")
	public WebElement empresa;
	
	@FindBy(xpath = "//*[@id=\"select\"]/div[1]/input")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement tributoOPC;
	
	@FindBy(xpath = "//*[@id=\"branch\"]/div/div[1]/div[1]/div[2]/input")
	public WebElement filial;
	
	@FindBy(xpath = "//*[@id=\"1000_RJ_0001\"]/div[1]/label/span")
	public WebElement filialOPC;
	
	@FindBy(xpath = "//*[@id=\"layout\"]/div/div[1]/input")
	public WebElement leiaute;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement leiauteOpc;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Componente\"]")
	public WebElement componente;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement componenteOpc;
	
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//div[@id=\"componentToSearchId-1000_SP_0014\"]")
	public WebElement filialtc2;

	

	
	public ConfiguraçãoeExecuçãoVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		String url = driver.getCurrentUrl();

		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		if (url.contains("tc2")) {
			tc2 = true;
		} else if (url.contains("tp1")) {
			tp1 = true;
		} else {
			tq1 = true;
		}
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		actionsMoveToElementElement(gestaoCredito);
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		painelCredito.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("idPainelCreditoConfiguracaoEExecucaco");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		
		String empresavisualizar = empresa.getAttribute("value");
		String filialvisualizar = filial.getAttribute("value");
		String tributovisualizar = tributo.getAttribute("value");
		String registrovisualizar = leiaute.getAttribute("value");
		String datavisualizar = componente.getAttribute("value");

		
		System.out.println(empresavisualizar);

		System.out.println(filialvisualizar);
		System.out.println(tributovisualizar);
		System.out.println(registrovisualizar);
		System.out.println(datavisualizar);
	
		fechar.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		
		String empresaeditar = empresa.getAttribute("value");
		String filialeditar = filial.getAttribute("value");
		String tributoeditar = tributo.getAttribute("value");
		String registroeditar = leiaute.getAttribute("value");
		String dataeditar = componente.getAttribute("value");

		System.out.println("==============================");
		System.out.println(empresaeditar);
		System.out.println(filialeditar);
		System.out.println(tributoeditar);
		System.out.println(registroeditar);
		System.out.println(dataeditar);


		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		
		sucesso.add(empresaeditar.contains(empresavisualizar));
		sucesso.add(filialeditar.contains(filialvisualizar));
		sucesso.add(tributoeditar.contains(tributovisualizar));
		sucesso.add(registroeditar.contains(registrovisualizar));
		sucesso.add(dataeditar.contains(datavisualizar));

		System.out.println(sucesso);
		return sucesso;
	}

	}

