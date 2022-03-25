package com.sap.timp.pageObjectModel.MDR.SequenciaAcesso;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class SequenciaVisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//li/div/span[text()=\"Sequência de Acesso\"]")
	public WebElement sequencia;
		
		
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[2]/div/div[3]/div/span[1]")
	public WebElement idC;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[3]/div")
	public WebElement idR;
	

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"tr first\" and @data-id][1]/div[2]/label/span")
	public WebElement opcao;
	
	
	@FindBy(xpath = "//span[@id=\"name\"]")
	public WebElement nomeV;
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributoV;
	@FindBy(xpath = "//span[@id=\"structureGroup\"]")
	public WebElement grupoEstruturaV;
	@FindBy(xpath = "//span[@id=\"structure\"]")
	public WebElement estruturaDadosV;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome\")]")
	public WebElement nomeE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Descrição\")]")
	public WebElement descricaoE;
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[1]")
	public WebElement empresaE;
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div/div/div/div[1]")
	public WebElement tributoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Grupo\")]")
	public WebElement grupoEstruturaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Estrutura de Dados\")]")
	public WebElement estruturaDadosE;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	public SequenciaVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public ArrayList<Boolean> visualizar() {
		
		
		//Actions action = new Actions(driver);

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sequencia.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("Sequencia");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		açao.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		visibilityOfElementXpath("//span[@id=\"name\"]");
		sleep(1000);
		
		String nomeV1 = nomeV.getText();
		String descricaoV1 = descricaoV.getText();
		String empresaV1 = empresaV.getText();
		String tributoV1 = tributoV.getText();
		String grupoEstruturaV1 = grupoEstruturaV.getText();
		String estruturaDadosV1 = estruturaDadosV.getText();

		
		
		System.out.println(nomeV1);
		System.out.println(descricaoV1);
		System.out.println(empresaV1);
		System.out.println(tributoV1);
		System.out.println(grupoEstruturaV1);
		System.out.println(estruturaDadosV1);

		
		
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
		
		String nomeE1 = nomeE.getAttribute("value");
		String descricaoE1 = descricaoE.getAttribute("value");
		String empresaE1 = empresaE.getText();
		String tributoE1 = tributoE.getText();
		String grupoEstruturaE1 = grupoEstruturaE.getAttribute("value");
		String estruturaDadosE1 = estruturaDadosE.getAttribute("value");

		
		
		System.out.println(nomeE1);
		System.out.println(descricaoE1);
		System.out.println(empresaE1);
		System.out.println(tributoE1);
		System.out.println(grupoEstruturaE1);
		System.out.println(estruturaDadosE1);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(nomeV1.contains(nomeE1));
		sucesso.add(descricaoV1.contains(descricaoE1));
		sucesso.add(empresaV1.contains(empresaE1));
		sucesso.add(grupoEstruturaV1.contains(grupoEstruturaE1));
		sucesso.add(estruturaDadosE1.contains(estruturaDadosV1));

		System.out.println(sucesso);


		return sucesso;
	}
	


}
