package com.sap.timp.pageObjectModel.MDR.Centralizacao.Saldos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class SaldosVisualizarPO  extends TestBaseKenssy{
	@FindBy(xpath = "//span[text()=\"Centralização\"]")
	public WebElement centralizacao;
	
	@FindBy(xpath = "//span[text()=\"Saldos\"]")
	public WebElement saldos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	//DATOS DEL VISUALIZAR
		@FindBy(xpath = "//span[@id=\"company\"]")
		public WebElement empresaV;
		@FindBy(xpath = "//span[@id=\"uf\"]")
		public WebElement ufFilialV;
		@FindBy(xpath = "//span[@id=\"filials\"]")
		public WebElement filialV;
		@FindBy(xpath = "//span[@id=\"centralizadora\"]")
		public WebElement filialCentralizadoV;
		@FindBy(xpath = "//span[@id=\"tribute\"]")
		public WebElement tributoV;
		@FindBy(xpath = "//span[@id=\"active\"]")
		public WebElement ativoV;
			
	//DATOS DEL EDITAR
		@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[1]")
		public WebElement empresaE;
		@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div/div/div/div[1]")
		public WebElement ufFilialE;
		@FindBy(xpath = "//div[@id=\"filials\"]/div/div/div/div/div[1]/div[1]")
		public WebElement filialE1;
		@FindBy(xpath = "//div[@id=\"filials\"]/div/div/div/div/div[2]/div[1]")
		public WebElement filialE2;
		@FindBy(xpath = "//div[@id=\"filials\"]/div/div/div/div/div[3]/div[1]")
		public WebElement filialE3;
		@FindBy(xpath = "//div[@id=\"centralizadora\"]/div/div/input")
		public WebElement centralizadoraE;
		@FindBy(xpath = "//div[@id=\"tribute\"]/div/div/div/input")
		public WebElement tributoE;
		
	public SaldosVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		centralizacao.click();
		sleep(2000);
		saldos.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("idCentralizacaoSaldos");
		
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
		String filialCentralizadoV1 = filialCentralizadoV.getText();
		String tributoV1 = tributoV.getText();
		String ativoV1 = ativoV.getText();

		System.out.println();
		System.out.println("*****DATOS DEL VISUALIZAR****");
		System.out.println(empresaV1);
		System.out.println(ufFilialV1);
		System.out.println(filialV1);
		System.out.println(filialCentralizadoV1);
		System.out.println(tributoV1);
		System.out.println(ativoV1);

		
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
		
		String empresaE1 = empresaE.getText();
		String ufFilialE1 = ufFilialE.getText();
		String filialE11 = filialE1.getText();
		String filialE22 = filialE2.getText();
		String filialE33 = filialE3.getText();
		String filialCentralizadoraE1 = centralizadoraE.getAttribute("value");
		String tributoE1 = tributoE.getAttribute("value");
		
		System.out.println("");
		System.out.println("**********DATOS DEL EDITAR*********");
		System.out.println(empresaE1);
		System.out.println(ufFilialE1);
		System.out.println(filialE11);
		System.out.println(filialE22);
		System.out.println(filialE33);
		System.out.println(filialCentralizadoraE1);
		System.out.println(tributoE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			sucesso.add(empresaV1.contains(empresaE1));
			sucesso.add(ufFilialV1.contains(ufFilialE1));
			sucesso.add(filialV1.contains(filialE11));
			sucesso.add(filialV1.contains(filialE22));
			sucesso.add(filialV1.contains(filialE33));
			sucesso.add(filialCentralizadoV1.contains(filialCentralizadoraE1));
			sucesso.add(tributoV1.contains(tributoE1));
		
		System.out.println(sucesso);
		return sucesso;	
	}
}
