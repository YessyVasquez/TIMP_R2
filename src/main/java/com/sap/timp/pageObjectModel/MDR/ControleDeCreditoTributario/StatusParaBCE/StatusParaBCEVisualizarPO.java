package com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.StatusParaBCE;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class StatusParaBCEVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Controle de Crédito Tributário\"]")
	public WebElement obrigacoes;

	@FindBy(xpath = "//span[text()=\"Status para BCE\"]")
	public WebElement tabelaMunicipios;


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

	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[1]")
	public WebElement empresaD;
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div/div/div/div[1]")
	public WebElement ufD;
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div[1]")
	public WebElement filialD;
	@FindBy(xpath = "//textarea")
	public WebElement descricaoD;
	@FindBy(xpath = "//input[contains(@placeholder,\"Início\")]")
	public WebElement dataVigenciaD;

	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"valid-from\"]")
	public WebElement dataVigenciaV;

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	public StatusParaBCEVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		sleep(2000);
		obrigacoes.click();
		sleep(2000);
		tabelaMunicipios.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("StatusParaBCE");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String empresaV1 = empresaV.getText();
		String ufV1 = ufV.getText();
		String filialV1 = filialV.getText();
		String descricaoV1 = descricaoV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();

		System.out.println(empresaV1);
		System.out.println(ufV1);
		System.out.println(filialV1);
		System.out.println(descricaoV1);
		System.out.println(dataVigenciaV1);
		
		sleep(1000);
		
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
		sleep(2000);
		
		String empresaD1 = empresaD.getText();
		String ufD1 = ufD.getText();
		String filialD1 = filialD.getText();
		String descricaoD1 = descricaoD.getAttribute("value");
		String dataVigenciaD1 = dataVigenciaD.getAttribute("value");

		System.out.println(empresaD1);
		System.out.println(ufD1);
		System.out.println(filialD1);
		System.out.println(descricaoD1);
		System.out.println(dataVigenciaD1);



		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(empresaV1.contains(empresaD1));
		sucesso.add(ufV1.contains(ufD1));
		sucesso.add(filialD1.equals(filialV1));
		sucesso.add(descricaoV1.contains(descricaoD1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaD1));

		System.out.println(sucesso);

		return sucesso;

	}

}
