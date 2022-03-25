package com.sap.timp.pageObjectModel.MDR.AtivaçaoParaMunicipio;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AtivaçaoParaMunicipioVisualizarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Ativação para Município\"]")
	public WebElement ativaçaoparamunicipio;
	
	@FindBy(xpath = "//span[text()=\"Novo\"]")
	public WebElement novomunicipio;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"company\"]/div/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaoempresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Razão Social\"]")
	public WebElement razaosocial;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"uf\"]/div/div/div[2]")
	public WebElement uf;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaouf;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"centralizing-branch\"]/div/div/div[2]")
	public WebElement filialcentralizadora;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaofilial;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"county\"]/div/div[2]")
	public WebElement municipio;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaomunicipio;
	
	@FindBy(xpath = "//div[@class=\"field3\" and @id=\"centralized-branches\"]/div/div/div[2]")
	public WebElement filiaiscentralizadora;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcaofiliais;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;

	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"corporateName\"]")
	public WebElement razaoV;
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"county\"]")
	public WebElement municipioV;
	@FindBy(xpath = "//span[@id=\"centralizingBranch\"]")
	public WebElement filialCentralizadoraV;
	@FindBy(xpath = "//span[@id=\"centralizedBranch\"]")
	public WebElement filialCentralizadaV;
	@FindBy(xpath = "//span[@id=\"fantasyName\"]")
	public WebElement fantasiaV;
	@FindBy(xpath = "//span[@id=\"cnpj\"]")
	public WebElement cnpjV;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Empresa\")]")
	public WebElement empresaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Razão\")]")
	public WebElement razaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"UF\")]")
	public WebElement ufE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecionar Município \")]")
	public WebElement municipioE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Centralizadora\")]")
	public WebElement FilialCentralizadoraE;
	@FindBy(xpath = "//div[contains(@id,\"multipleControlerId\")]")
	public WebElement filialCentralizadaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Fantasia\")]")
	public WebElement fantasiaE;
	@FindBy(xpath = "//div[@id=\"cnpj\"]/div/div/input")
	public WebElement cnpjE;
	
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public AtivaçaoParaMunicipioVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		ativaçaoparamunicipio.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("AtivacaoParaMunicipio");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		açao.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresaV1 = empresaV.getText();
		String razaoV1 = razaoV.getText();
		String ufV1 = ufV.getText();
		String municipioV1 = municipioV.getText();
		String filialCentralizadoraV1 = filialCentralizadoraV.getText();
		String filialCentralizadaV1 = filialCentralizadaV.getText();
		String fantasiaV1 = fantasiaV.getText();
		String cnpjV1 = cnpjV.getText();
		
	
		System.out.println(empresaV1);
		System.out.println(razaoV1);
		System.out.println(ufV1);
		System.out.println(municipioV1);
		System.out.println(filialCentralizadoraV1);
		System.out.println(filialCentralizadaV1);
		System.out.println(fantasiaV1);
		System.out.println(cnpjV1);
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("AtivacaoParaMunicipio");
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		

		sleep(2000);
		menu.click();
		sleep(1000);
		
		açao.click();
		sleep(2000);
		waitExpectElement(empresaE);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);


		
	
		String empresaE1 = empresaE.getAttribute("value");
		String razaoE1 = razaoE.getAttribute("value");
		String ufE1 = ufE.getAttribute("value");
		String municipioE1 = municipioE.getAttribute("value");
		String filialCentralizadoraE1 = FilialCentralizadoraE.getAttribute("value");
		String filialCentralizadaE1 = filialCentralizadaE.getText();
		String fantasiaE1 = fantasiaE.getAttribute("value");
		String cnpjE1 = cnpjE.getAttribute("value");
		
		cnpjE1 = cnpjV1.replace(".", "");
		cnpjE1 = cnpjV1.replace("/", "");
		cnpjE1 = cnpjV1.replace("-", "");
		
		System.out.println(empresaE1);
		System.out.println(ufE1);
		System.out.println(municipioE1);
		System.out.println(filialCentralizadoraE1);
		System.out.println(filialCentralizadaE1);
		System.out.println(fantasiaE1);
		System.out.println(cnpjE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaV1.contains(empresaE1));
		sucesso.add(razaoV1.contains(razaoE1));
		sucesso.add(ufV1.contains(ufE1));
		sucesso.add(municipioE1.contains(municipioV1));
		sucesso.add(filialCentralizadoraV1.contains(filialCentralizadoraE1));
		sucesso.add(filialCentralizadaV1.contains(filialCentralizadaE1));
		sucesso.add(fantasiaV1.contains(fantasiaE1));
		sucesso.add(cnpjV1.contains(cnpjE1));
		
		System.out.println(sucesso);

	
		
		return sucesso;
	}
	

}
