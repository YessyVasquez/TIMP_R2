package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela27;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseSteven;

public class CodigosDeLotacaoVisualizarPO extends TestBaseSteven {
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 27 - Códigos de Lotação\"]")
	public WebElement tabela27;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	

	@FindBy(xpath = "//td[@id=\"company\"]/span")
	public WebElement empresaV;
	@FindBy(xpath = "//td[@id=\"companySocialReason\"]/span")
	public WebElement razaoV;
	@FindBy(xpath = "//td[@id=\"lotacaoCode\"]/span")
	public WebElement codigoV;
	@FindBy(xpath = "//td[@id=\"effectiveDateFrom\"]/span")
	public WebElement dataVigenciaV;

	@FindBy(xpath = "//input[contains(@placeholder,\"Empresas\")]")
	public WebElement empresaE;
	@FindBy(xpath = "//div[contains(@class,\"companySocialReason\")]/div/div/div/div/div/input")
	public WebElement razaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Preencher Código para a lotação trib.\")]")
	public WebElement codigoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\")]")
	public WebElement dataVigenciaE;
	
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;


	

	
	
	public CodigosDeLotacaoVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		tabelaApoio.click();
		sleep(2000);
		tabela27.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("CodigosDeLotacao");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		
		açao.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresaV1 = empresaV.getText();
		String razaoV1 = razaoV.getText();
		String codigoV1 = codigoV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();
		
		System.out.println(empresaV1);
		System.out.println(razaoV1);
		System.out.println(codigoV1);
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
		String razaoE1 = razaoE.getAttribute("value"); 
		String codigoE1 = codigoE.getAttribute("value");
		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");


		System.out.println(empresaE1);
		System.out.println(razaoE1);
		System.out.println(codigoE1);
		System.out.println(dataVigenciaE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaV1.contains(empresaE1));
		sucesso.add(razaoV1.contains(razaoE1));
		sucesso.add(codigoV1.contains(codigoE1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaE1));

		
		
		
		System.out.println(sucesso);
		
		return sucesso;
	}

}
