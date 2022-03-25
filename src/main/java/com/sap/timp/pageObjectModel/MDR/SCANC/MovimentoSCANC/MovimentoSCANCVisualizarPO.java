package com.sap.timp.pageObjectModel.MDR.SCANC.MovimentoSCANC;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MovimentoSCANCVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"Movimento SCANC\"]")
	public WebElement movimentoScanc;

	@FindBy(xpath = "//span[text()=\"Códigos de Ajustes\"]")
	public WebElement codigo;

	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][1]")
	public WebElement primeira;
	

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
	
	

	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement companyV;
	@FindBy(xpath = "//span[@id=\"ufBranch\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"branches\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"centralizedBranch\"]")
	public WebElement filialCentralizadoraV;
	@FindBy(xpath = "//span[@id=\"begin\"]")
	public WebElement datavigenciaV;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Empresa\")]")
	public WebElement empresaD;
	@FindBy(xpath = "//input[contains(@placeholder,\"UF\")]")
	public WebElement ufD;
	@FindBy(xpath = "//div[@id=\"branches\"]/div/div/div/div/div/div[1]")
	public WebElement filialD;
	@FindBy(xpath = "//input[contains(@placeholder,\"Filial Centralizadora\")]")
	public WebElement filialCentralizadoraD;
	@FindBy(xpath = "//div[@id=\"effectiveDate\"]/div/div/input")
	public WebElement dataVigenciaD;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	

	
	

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	public MovimentoSCANCVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		sleep(2000);
		scanc.click();
		sleep(2000);
		
		movimentoScanc.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("MovimentoSCANC");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

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
		String filialCentralizadoraV1 = filialCentralizadoraV.getText();
		String dataVigenciaV1 = datavigenciaV.getText();
		
		
		System.out.println(empresaV1);
		System.out.println(ufV1);
		System.out.println(filialV1);
		System.out.println(filialCentralizadoraV1);
		System.out.println(dataVigenciaV1);
		
		sleep(2000);

		
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		primeira.click();
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
		sleep(2000);
		
		String empresaD1 = empresaD.getAttribute("value");
		String ufD1 = ufD.getAttribute("value");
		String filialD1 = filialD.getText();
		String filialCentralizadoraD1 = filialCentralizadoraD.getAttribute("value");
		String dataVigenciaD1 = dataVigenciaD.getAttribute("value"); 
		
		
		System.out.println(empresaD1);
		System.out.println(ufD1);
		System.out.println(filialD1);
		System.out.println(filialCentralizadoraD1);
		System.out.println(dataVigenciaD1);
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaV1.contains(empresaD1));
		sucesso.add(ufV1.contains(ufD1));
		sucesso.add(filialD1.contains(filialV1));
		sucesso.add(filialCentralizadoraV1.contains(filialCentralizadoraD1));

		sucesso.add(dataVigenciaV1.contains(dataVigenciaD1));
		
		System.out.println(sucesso);
		
		return sucesso;
		


	}

}
