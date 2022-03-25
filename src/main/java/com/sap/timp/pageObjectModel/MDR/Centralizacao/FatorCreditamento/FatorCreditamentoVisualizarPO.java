package com.sap.timp.pageObjectModel.MDR.Centralizacao.FatorCreditamento;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class FatorCreditamentoVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li/div/span[text()=\"Centralização\"]")
	public WebElement centralização;
	@FindBy(xpath = "//li/div/span[text()=\"Fator de Creditamento do CIAP\"]")
	public WebElement fatorCrecimento;
	
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
	
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"ufBranch\"]")
	public WebElement ufFilialV;
	@FindBy(xpath = "//span[@id=\"branches\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"centralizeBranch\"]")
	public WebElement filialCentralizadoraV;
	@FindBy(xpath = "//span[@id=\"initDate\"]")
	public WebElement dataVigenciaV;
	

	
	@FindBy(xpath = "//input[contains(@placeholder,\"empresa\")]")
	public WebElement empresaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"UF Filial\")]")
	public WebElement ufFilialE;
	@FindBy(xpath = "//div[@id=\"branches\"]/div/div/div/div[1]/div[1]/div[text()]")
	public WebElement filialE1;
	@FindBy(xpath = "//div[@id=\"branches\"]/div/div/div/div[1]/div[2]/div[text()]")
	public WebElement filialE2;
	@FindBy(xpath = "//input[contains(@placeholder,\"Centralizadora\")]")
	public WebElement centralizadoraE;
	@FindBy(xpath = "//div[@id=\"validity\"]/div/div/input")
	public WebElement dataVigenciaE;
	
	public FatorCreditamentoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {
		
		centralização.click();
		sleep(1000);
		fatorCrecimento.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("FatorCreditamentoCIAP");
		
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
		String ufFilialV1 = ufFilialV.getText();
		String filialV1 = filialV.getText();
		String filialCentralizadoraV1 = filialCentralizadoraV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();
		
		
		
		
		System.out.println(empresaV1);
		System.out.println(ufFilialV1);
		System.out.println(filialV1);
		System.out.println(filialCentralizadoraV1);
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
		String ufFilialE1 = ufFilialE.getAttribute("value");
		String filialE11 = filialE1.getText();
		String filialE22 = filialE2.getText();
		String filialCentralizadoraE1 = centralizadoraE.getAttribute("value");
		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");
		
		
		System.out.println(empresaE1);
		System.out.println(ufFilialE1);
		System.out.println(filialE11);
		System.out.println(filialE22);
		System.out.println(filialCentralizadoraE1);
		System.out.println(dataVigenciaE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaV1.contains(empresaE1));
		sucesso.add(ufFilialV1.contains(ufFilialE1));
		sucesso.add(filialV1.contains(filialE11));
		sucesso.add(filialV1.contains(filialE22));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaE1));
		System.out.println(sucesso);


		return sucesso;

	}

}
