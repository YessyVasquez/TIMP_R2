package com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.graph.AbstractNetwork;
import com.sap.timp.base.TestBaseSteven;

public class RegrasdeAuditoriaN2VisualizarPO extends TestBaseSteven {

	

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N2\"]")
	public WebElement AN2;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"graph\"]//*[name()=\"g\"]//*[name()=\"g\"][1]")
	public WebElement CFOPVisualizar;
	
	@FindBy(xpath = "//div[@class=\"graph\"]//*[name()=\"g\"]//*[name()=\"g\"][1]")
	public WebElement CFOPEditar;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Código\")]")
	public WebElement codigoE;
	@FindBy(xpath = "//*[contains(@placeholder,\"Descrição\")]")
	public WebElement descricaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\")]")
	public WebElement dataVigenciaE;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public RegrasdeAuditoriaN2VisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		AN2.click();
	
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//String idRegistro = idObter3();
		String idRegistro = idObter("An2");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualização\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		
		açao.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(20000);

		
		String CFOPV1 = CFOPVisualizar.getText();

		
		System.out.println(CFOPV1);

		
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
		sleep(18000);
		
		String CFOPE1 = CFOPEditar.getText();


		
		
		System.out.println(CFOPE1);


		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(CFOPV1.contains(CFOPE1));
	
		
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}
}
