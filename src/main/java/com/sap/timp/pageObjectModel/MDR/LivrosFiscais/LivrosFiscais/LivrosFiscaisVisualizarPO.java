package com.sap.timp.pageObjectModel.MDR.LivrosFiscais.LivrosFiscais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class LivrosFiscaisVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Livros Fiscais\"]")
	public WebElement livrosfiscais;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-fiscalBooks\"]")
	public WebElement livrosFiscaisO;

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
	
	
	@FindBy(xpath = "//span[@id=\"book-type\"]")
	public WebElement tipoLivroV;
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement companyV;
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"book-model\"]")
	public WebElement modeloV;
	@FindBy(xpath = "//span[@id=\"page-quantity\"]")
	public WebElement quantidadeV;
	@FindBy(xpath = "//span[@id=\"validity-from\"]")
	public WebElement datavigenciaV;
	
	
	@FindBy(xpath = "//div[@id=\"book-type\"]/div/div/div/input")
	public WebElement tipoLivroD;
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[contains(@id,\"multipleControlerId\")]")
	public WebElement empresaD;
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div/div/div/div[contains(@id,\"multipleControlerId\")]")
	public WebElement ufFilialD;
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div[contains(@id,\"multipleControlerId\")]")
	public WebElement filialD;
	@FindBy(xpath = "//div[@id=\"book-model\"]/div/div/div/input")
	public WebElement modeloD;
	@FindBy(xpath = "//div[@id=\"page-quantity\"]/div/div/input")
	public WebElement quantidadeD;
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicial\")]")
	public WebElement dataVigenciaD;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	

	
	

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	public LivrosFiscaisVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		sleep(2000);
		livrosfiscais.click();
		sleep(2000);

		livrosFiscaisO.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("LivrosFiscais");

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
		
		String tipoLivroV1 = tipoLivroV.getText();
		String empresaV1 = companyV.getText();
		String ufV1 = ufV.getText();
		String filialV1 = filialV.getText();
		
		filialV1 = filialV1.replace(",", " / ");
		String modeloV1 = modeloV.getText();
		String quantidadeV1 = quantidadeV.getText();
		String dataVigenciaV1 = datavigenciaV.getText();
		
		System.out.println(tipoLivroV1);
		System.out.println(ufV1);
		System.out.println(filialV1);
		System.out.println(modeloV1);
		System.out.println(quantidadeV1);
		System.out.println(dataVigenciaV1);
		
		sleep(2000);

		
		biblioteca.click();
		
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
		sleep(2000);
		
		String tipoLivroD1 = tipoLivroD.getAttribute("value");
		String ufD1 = ufFilialD.getText();
		String filialD1 = filialD.getText();
		String modeloD1 = modeloD.getAttribute("value");
		String quantidadeD1 = quantidadeD.getAttribute("value");
		String dataVigenciaD1 = dataVigenciaD.getAttribute("value"); 
		
		
		System.out.println(tipoLivroD1);
		System.out.println(ufD1);
		System.out.println(filialD1);
		System.out.println(modeloD1);
		System.out.println(quantidadeD1);
		System.out.println(dataVigenciaD1);
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(tipoLivroV1.contains(tipoLivroD1));
		sucesso.add(ufV1.contains(ufD1));
		sucesso.add(filialD1.contains(filialV1));
		sucesso.add(modeloV1.contains(modeloD1));
		sucesso.add(quantidadeV1.contains(quantidadeD1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaD1));
		
		System.out.println(sucesso);
		
		return sucesso;
		


	}

}
