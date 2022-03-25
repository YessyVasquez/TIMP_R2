package com.sap.timp.pageObjectModel.MDR.CadastroCondiçao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CadastroCondicaoVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Cadastro da Condição\"]")
	public WebElement cadastrocondicao;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
		
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]/div")
	public WebElement idC;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement idR;
	

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement setafinal;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement setafinaltc2;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@id=\"companyCode\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"ufCode\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"branchCode\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"taxFinancial\"]")
	public WebElement tributoV;
	@FindBy(xpath = "//span[@id=\"accessCode\"]")
	public WebElement sequenciaV;
	@FindBy(xpath = "//span[@id=\"validFrom\"]")
	public WebElement dataVigenciaV;
	
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[1]")
	public WebElement empresaE;
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div/div/div/div[1]")
	public WebElement ufE;
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div[1]")
	public WebElement filialE;
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div/div/div/div[1]")
	public WebElement tributoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Sequência\")]")
	public WebElement sequenciaE;
	@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div/input")
	public WebElement dataVigenciaE;
	
	
	public CadastroCondicaoVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
public ArrayList<Boolean> visualizar() {
		
		
		//Actions action = new Actions(driver);

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		cadastrocondicao.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//Pega o ultimo id
		setafinal.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("CadastroCondicao");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu);
		sleep(4000);
		
		menu.click();
		sleep(2000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresaV1 = empresaV.getText();
		String ufV1 = ufV.getText();
		String filialV1 = filialV.getText();
		String tributoV1 = tributoV.getText();
		String sequenciaV1 = sequenciaV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();
		
		System.out.println(empresaV1);
		System.out.println(ufV1);
		System.out.println(filialV1);
		System.out.println(tributoV1);
		System.out.println(sequenciaV1);
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
		sleep(1000);
		attributeToBeXpath("//div[@id=\"company\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		
		String empresaE1 = empresaE.getText();
		String ufE1 = ufE.getText();
		String filialE1 = filialE.getText();
		String tributoE1 = tributoE.getText();
		String sequenciaE1 = sequenciaE.getAttribute("value");
		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");
		
		System.out.println(empresaE1);
		System.out.println(ufE1);
		System.out.println(filialE1);
		System.out.println(tributoE1);
		System.out.println(sequenciaE1);
		System.out.println(dataVigenciaE1);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaV1.contains(empresaE1));
		sucesso.add(ufV1.contains(ufE1));
		sucesso.add(filialE1.contains(filialV1));
		sucesso.add(tributoV1.contains(tributoE1));
		sucesso.add(sequenciaE1.contains(sequenciaV1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaE1));


		System.out.println(sucesso);	
		return sucesso;
	}
}
