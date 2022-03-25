package com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRF;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegistroRFVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Siscoserv\"]")
	public WebElement siscoserv;
	
	@FindBy(xpath = "//span[text()=\"Registro RF\"]")
	public WebElement registrorp;

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

	@FindBy(xpath = "//input[contains(@placeholder,\"Empresa\")]")
	public WebElement empresaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Serv\")]")
	public WebElement numeroServE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Período\")]")
	public WebElement periodoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Registro\")]")
	public WebElement numeroRegistroE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Valor Recebido\")]")
	public WebElement valorRecibidoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Declaração\")]")
	public WebElement numeroDeclaracaoE;


	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"serviceSoldNumber\"]")
	public WebElement numeroServV;
	@FindBy(xpath = "//span[@id=\"period\"]")
	public WebElement periodV;
	@FindBy(xpath = "//span[@id=\"exportDeclarationNumber\"]")
	public WebElement numeroRegistroV;
	@FindBy(xpath = "//span[@id=\"exteriorValue\"]")
	public WebElement valorRecibidoV;
	@FindBy(xpath = "//span[@id=\"importDeclarationNumber\"]")
	public WebElement numeroDeclaracaoV;


	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	public RegistroRFVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {
		
		siscoserv.click();
		sleep(2000);
		registrorp.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		;
		String idRegistro = idObter("RegistroRF");

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

		String empresaV1 = empresaV.getText();
		String numeroServV1 = numeroServV.getText();
		String periodoV1 = periodV.getText();
//		String numeroRegistroV1 = numeroRegistroV.getText();
//		String valorRecibidoV1 = valorRecibidoV.getText();
		String numeroDeclaracaoV1 = numeroDeclaracaoV.getText();



		System.out.println(empresaV1);
		System.out.println(numeroServV1);
		System.out.println(periodoV1);
//		System.out.println(numeroRegistroV1);
//		System.out.println(valorRecibidoV1);
		System.out.println(numeroDeclaracaoV1);



		sleep(2000);

		biblioteca.click();

		sleep(5000);
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


		String empresaE1 = empresaE.getAttribute("value");
		String numeroServE1 = numeroServE.getAttribute("value");
		String periodoE1 = periodoE.getAttribute("value");
//		String numeroRegistroE1 = numeroRegistroE.getAttribute("value");
//		String valorRecibidoE1 = valorRecibidoE.getAttribute("value");
		String numeroDeclaracaoE1 = numeroDeclaracaoE.getAttribute("value");


		System.out.println(empresaE1);
		System.out.println(numeroServE1);
		System.out.println(periodoE1);
//		System.out.println(numeroRegistroE1);
//		System.out.println(valorRecibidoE1);
		System.out.println(numeroDeclaracaoE1);


		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(empresaE1.contains(empresaV1));
		sucesso.add(numeroServV1.contains(numeroServV1));
		sucesso.add(periodoE1.contains(periodoV1));
//		sucesso.add(numeroRegistroE1.contains(numeroRegistroV1));
//		sucesso.add(valorRecibidoV1.contains(valorRecibidoE1));
		sucesso.add(numeroDeclaracaoE1.contains(numeroDeclaracaoV1));


		System.out.println(sucesso);
		return sucesso;

	}

}
