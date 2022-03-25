package com.sap.timp.pageObjectModel.MDR.CadastroDerex.CadastroResponsavel;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ResponsavelMovimentoVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"Cadastro DEREX\"]")
	public WebElement derex;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-responsibleDerex\"]")
	public WebElement responsavelO;
	
	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	public WebElement menu;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//span[@id=\"companyCode\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"branchCode\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"taxFinancial\"]")
	public WebElement tributoV;
	@FindBy(xpath = "//span[@id=\"financialInstitution\"]")
	public WebElement instituicaoV;
	@FindBy(xpath = "//span[@id=\"countryCode\"]")
	public WebElement paisV;
	@FindBy(xpath = "//span[@id=\"coinCode\"]")
	public WebElement moedaV;
	@FindBy(xpath = "//span[@id=\"name\"]")
	public WebElement nomeV;
	@FindBy(xpath = "//span[@id=\"completeAddress\"]")
	public WebElement direcaoV;
	@FindBy(xpath = "//span[@id=\"officialId\"]")
	public WebElement numeroIdentificacaoV;
	@FindBy(xpath = "//span[@id=\"documentType\"]")
	public WebElement tipoDocumentoV;
	@FindBy(xpath = "//span[@id=\"accountingId\"]")
	public WebElement identificacaoContaV;
	@FindBy(xpath = "//span[@id=\"validityFrom\"]")
	public WebElement dataVigenciaV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Empresa\")]")
	public WebElement empresaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Filial\")]")
	public WebElement filialE;
	@FindBy(xpath = "//div[contains(@id,\"multipleControlerId\")]")
	public WebElement tributoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Instituição\")]")
	public WebElement instituicaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"País\")]")
	public WebElement paisE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Moeda\")]")
	public WebElement moedaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome\")]")
	public WebElement nomeE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Endereço\")]")
	public WebElement direcaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Número\")]")
	public WebElement numeroIdentificacaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"documento\")]")
	public WebElement tipodocumentoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Identificação da Conta\")]")
	public WebElement identificacaoContaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\")]")
	public WebElement dataVigenciaE;
	
	public ResponsavelMovimentoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		derex.click();
		sleep(1000);
		responsavelO.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(2000);

		siguiente.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("ResponsavelMovimento");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresaV1 = empresaV.getText();
		String filialV1 = filialV.getText();
		String tributoV1 = tributoV.getText();
		String instituicaoV1 = instituicaoV.getText();
		String paisV1 = paisV.getText();
		String moedaV1 = moedaV.getText();
		String nomeV1 = nomeV.getText();
		String direcaoV1 = direcaoV.getText();
		String numeroIdentificacaoV1 = numeroIdentificacaoV.getText();
		String documentoV1 = tipoDocumentoV.getText();
		String identificacaoContaV1 = identificacaoContaV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();
		
		
		System.out.println(empresaV1);
		System.out.println(filialV1);
		System.out.println(tributoV1);
		System.out.println(instituicaoV1);
		System.out.println(paisV1);
		System.out.println(moedaV1);
		System.out.println(nomeV1);
		System.out.println(direcaoV1);
		System.out.println(numeroIdentificacaoV1);
		System.out.println(documentoV1);
		System.out.println(identificacaoContaV1);
		System.out.println(dataVigenciaV1);
		
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresaE1 = empresaE.getAttribute("value");
		String filialE1 = filialE.getAttribute("value");
		String tributoE1 = tributoE.getText();
		String instituicaoE1 = instituicaoE.getAttribute("value");
		String paisE1 = paisE.getAttribute("value");
		String moedaE1 = moedaE.getAttribute("value");
		String nomeE1 = nomeE.getAttribute("value");
		String direcaoE1 = direcaoE.getAttribute("value");
		String numeroIdentificacaoE1 = numeroIdentificacaoE.getAttribute("value");
		String documentoE1 = tipodocumentoE.getAttribute("value");
		String identificacaoContaE1 = identificacaoContaE.getAttribute("value");
		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");
		
		
		System.out.println(empresaE1);
		System.out.println(filialE1);
		System.out.println(tributoE1);
		System.out.println(instituicaoE1);
		System.out.println(paisE1);
		System.out.println(moedaE1);
		System.out.println(nomeE1);
		System.out.println(direcaoE1);
		System.out.println(numeroIdentificacaoE1);
		System.out.println(documentoE1);
		System.out.println(identificacaoContaE1);
		System.out.println(dataVigenciaE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaV1.contains(empresaE1));
		sucesso.add(filialV1.contains(filialE1));
		sucesso.add(tributoV1.contains(tributoE1));
		sucesso.add(paisV1.contains(paisE1));
		sucesso.add(moedaV1.contains(moedaE1));
		sucesso.add(nomeV1.contains(nomeE1));
		sucesso.add(direcaoV1.contains(direcaoE1));
		sucesso.add(numeroIdentificacaoV1.contains(numeroIdentificacaoE1));
		sucesso.add(documentoV1.contains(documentoE1));
		sucesso.add(identificacaoContaV1.contains(identificacaoContaE1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaE1));
		System.out.println(sucesso);


		return sucesso;

	}

}
