package com.sap.timp.pageObjectModel.MDR.ParametrosParaCategoriaDeIRF;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParametrosParaCategoriaDeIRFDetalhesPO extends TestBaseSteven {

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

	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement empresaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement filialD;

	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement quantidadeD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement ufD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement estructuraD;

	@FindBy(xpath = "//div[@id=\"detail-description\"][7]/div[2]/div")
	public WebElement camposD;
	
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

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	public ParametrosParaCategoriaDeIRFDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {

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
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);

		String empresaD1 = empresaD.getText();
		String filialD1 = filialD.getText();
		String quantidadeD1 = quantidadeD.getText();
		String ufD1 = ufD.getText();
		String estructuraD1 = estructuraD.getText();
		String camposD1 = camposD.getText();
		
		System.out.println(empresaD1);
		System.out.println(filialD1);
		System.out.println(quantidadeD1);
		System.out.println(ufD1);
		System.out.println(estructuraD1);
		System.out.println(camposD1);
		
		sleep(2000);
		fechar.click();


		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String empresaV1 = companyV.getText();
		String ufV1 = ufV.getText();
		String filialV1 = filialV.getText();
		String quantidadeV1 = quantidadeV.getText();
		String estructuraV1 = estructuraV.getText();
		String camposV1 = camposV.getText();
		
		System.out.println("======================================");

		System.out.println(empresaV1);
		System.out.println(ufV1);
		System.out.println(filialV1);
		System.out.println(quantidadeV1);
		System.out.println(estructuraV1);
		System.out.println(camposV1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaV1.contains(empresaD1));
		/*sucesso.add(ufV1.contains(ufD1));
		sucesso.add(filialV1.contains(filialD1));
		sucesso.add(quantidadeV1.contains(quantidadeD1));*/
		sucesso.add(estructuraV1.contains(estructuraD1));
		sucesso.add(camposV1.contains(camposD1));
		
		System.out.println(sucesso);
		
		return sucesso;
		


	}

}
