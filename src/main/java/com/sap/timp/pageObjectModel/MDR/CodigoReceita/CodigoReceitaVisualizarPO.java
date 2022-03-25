package com.sap.timp.pageObjectModel.MDR.CodigoReceita;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigoReceitaVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Código da Receita\"]")
	public WebElement codigoReceita;
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

	@FindBy(xpath = "//input[contains(@placeholder,\"Tributo\")]")
	public WebElement tributoD;
	@FindBy(xpath = "//input[contains(@placeholder,\"Esfera\")]")
	public WebElement esferaD;
	@FindBy(xpath = "//div[@id=\"state\"]/div/div[1]/div[1]/input")
	public WebElement ufOrigemD;
	@FindBy(xpath = "//input[contains(@placeholder,\"Código da Receita\")]")
	public WebElement codigoRD;
	@FindBy(xpath = "//textarea[contains(@placeholder,\"Descrição Código da Receita\")]")
	public WebElement descricaoD;
	@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div/input")
	public WebElement dataVigenciaD;


	@FindBy(xpath = "//span[@id=\"TAX\"]")
	public WebElement tributoV;
	@FindBy(xpath = "//span[@id=\"sphere\"]")
	public WebElement esperfaV;
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufOrigemV;
	@FindBy(xpath = "//span[@id=\"revenueCode\"]")
	public WebElement codigoRV;
	@FindBy(xpath = "//span[@id=\"revenueDescription\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"validityFrom\"]")
	public WebElement dataVigenciaV;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;


	public CodigoReceitaVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		codigoReceita.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("CodigoReceita");

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
		
		String tributoV1 = tributoV.getText();
		String esferaV1 = esperfaV.getText();
		esferaV1 = esferaV1.toLowerCase();
		String ufOrigemV1 = ufOrigemV.getText();
		String codigoRV1 = codigoRV.getText();
		String descricaoV1 = descricaoV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();

		System.out.println(tributoV1);
		System.out.println(esferaV1);
		System.out.println(ufOrigemV1);
		System.out.println(codigoRV1);
		System.out.println(descricaoV1);
		System.out.println(dataVigenciaV1);

		

		sleep(2000);
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		String tributoD1 = tributoD.getAttribute("value");
		String esferaD1 = esferaD.getAttribute("value");
		esferaD1 = esferaD1.toLowerCase();
		String ufOrigemD1 = ufOrigemD.getAttribute("value");
		String codigoD1 = codigoRD.getAttribute("value");
		String descricaoD1 = descricaoD.getAttribute("value");
		String dataVigenciaD1 = dataVigenciaD.getAttribute("value");


		System.out.println(tributoD1);
		System.out.println(esferaD1);
		System.out.println(ufOrigemD1);
		System.out.println(codigoD1);
		System.out.println(descricaoD1);
		System.out.println(dataVigenciaD1);

		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(tributoV1.contains(tributoD1));
		sucesso.add(esferaV1.contains(esferaD1));
		sucesso.add(ufOrigemV1.contains(ufOrigemD1));
		sucesso.add(codigoRV1.contains(codigoD1));
		sucesso.add(descricaoV1.contains(descricaoD1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaD1));


		System.out.println(sucesso);

		return sucesso;

	}

}
