package com.sap.timp.pageObjectModel.MDR.ParametrosParaCategoriaDeIRF;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParametrosParaCategoriaDeIRFVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Parâmetros para Categoria de IRF \"]")
	public WebElement parametros;

	@FindBy(xpath = "//span[text()=\"Códigos de Ajustes\"]")
	public WebElement codigo;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//textarea[contains(@placeholder,\"Descrição Padrão\")]")
	public WebElement campo;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//span[@id=\"irf-category\"]")
	public WebElement companyV;
	@FindBy(xpath = "//span[@id=\"irf-code\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"irf-key\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"irf-description\"]")
	public WebElement quantidadeV;
	
	@FindBy(xpath = "//span[@id=\"structure\"]")
	public WebElement estructuraV;

	@FindBy(xpath = "//span[@id=\"values-fields\"]")
	public WebElement camposV;
	
	@FindBy(xpath = "//div[@id=\"irf-category\"]/div/div[1]/div[1]/input")
	public WebElement empresaD;
	
	@FindBy(xpath = "//div[@id=\"irf-code\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement ufD;
	
	@FindBy(xpath = "//div[@id=\"irf-key\"]/div/div[1]/div[1]/input")
	public WebElement filialD;
	
	@FindBy(xpath = "//div[@id=\"irf-description\"]/div/div[1]/input")
	public WebElement quantidadeD;
	
	@FindBy(xpath = "//div[@id=\"structure\"]/div/div[1]/input")
	public WebElement estructuraD;

	@FindBy(xpath = "//div[@id=\"values-fields\"]/div/div[1]/div[1]/input")
	public WebElement camposD;


	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement fechar;

	public ParametrosParaCategoriaDeIRFVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> Visualizar() {

		sleep(2000);
		parametros.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("ParametrosParaCategoriaDeIRF");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);

		String empresaV1 = companyV.getText();
		String ufV1 = ufV.getText();
		String filialV1 = filialV.getText();
		String quantidadeV1 = quantidadeV.getText();
		String estructuraV1 = estructuraV.getText();
		String camposV1 = camposV.getText();

		System.out.println(empresaV1);
		System.out.println(ufV1);
		System.out.println(filialV1);
		System.out.println(quantidadeV1);
		System.out.println(estructuraV1);
		System.out.println(camposV1);
		
		sleep(2000);
		fechar.click();
		sleep(2000);

		sleep(2000);
		parametros.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(20000);

		System.out.println("======================================");
		
		String empresaE1 = empresaD.getAttribute("value");
		String ufE1 = ufD.getText();
		String filialE1 = filialD.getAttribute("value");
		String quantidadeE1 = quantidadeD.getAttribute("value");
		String estructuraE1 = estructuraD.getAttribute("value");
		String camposE1 = camposD.getAttribute("value");

		System.out.println(empresaE1);
		System.out.println(ufE1);
		System.out.println(filialE1);
		System.out.println(quantidadeE1);
		System.out.println(estructuraE1);
		System.out.println(camposE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaE1.contains(empresaV1));
		sucesso.add(filialE1.contains(filialV1));
		sucesso.add(quantidadeE1.contains(quantidadeV1));
		sucesso.add(ufE1.contains(ufV1));
		sucesso.add(estructuraE1.contains(estructuraV1));
		sucesso.add(camposE1.contains(camposV1));
		
		System.out.println(sucesso);
		
		return sucesso;
		


	}

}
