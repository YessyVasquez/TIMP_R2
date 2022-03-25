package com.sap.timp.pageObjectModel.MDR.CodigoReceita;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigoReceitaDetalhesPO extends TestBaseSteven {

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


	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div/div")
	public WebElement esferaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div/div")
	public WebElement ufOrigemD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div/div")
	public WebElement codigoRD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div/div")
	public WebElement descricaoD;



	@FindBy(xpath = "//span[@id=\"sphere\"]")
	public WebElement esferaV;
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufOrigemV;
	@FindBy(xpath = "//span[@id=\"revenueCode\"]")
	public WebElement codigoRV;
	@FindBy(xpath = "//span[@id=\"revenueDescription\"]")
	public WebElement descricaoV;

	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;


	public CodigoReceitaDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {

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
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		String codigoD1 = codigoRD.getText();
		String esferaD1 = esferaD.getText();
		String ufOrigemD1 = ufOrigemD.getText();
		String descricaoD1 = descricaoD.getText();
		
		System.out.println(codigoD1);
		System.out.println(esferaD1);
		System.out.println(ufOrigemD1);
		System.out.println(descricaoD1);
		sleep(2000);
		fechar.click();
		
		sleep(3000);

		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String codigoV1 = codigoRV.getText();
		String esferaV1 = esferaV.getText();
		String ufOrigemV1 = ufOrigemV.getText();
		String descricaoV1 = descricaoV.getText();
		
		System.out.println(codigoV1);
		System.out.println(esferaD1);
		System.out.println(ufOrigemD1);
		System.out.println(descricaoD1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(codigoD1.contains(codigoV1));
		sucesso.add(esferaV1.contains(esferaD1));
		sucesso.add(ufOrigemV1.contains(ufOrigemD1));
		sucesso.add(descricaoV1.contains(descricaoD1));
		
		
		System.out.println(sucesso);
		
		return sucesso;

		

	}

}
