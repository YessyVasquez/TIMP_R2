package com.sap.timp.pageObjectModel.MDR.SCANC.SCANCDistribuidoras;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class SCANCDistribuidoraVisualizarPO extends TestBaseSteven {


	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"SCANC Distribuidoras\"]")
	public WebElement scancDistribuidoras;

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

	@FindBy(xpath = "//div[contains(@class,\"company\")]/div/div/div/div/div/div[@id]")
	public WebElement empresaE;
	@FindBy(xpath = "//div[contains(@class,\"uf\")]/div/div/div/div/div/div[@id]")
	public WebElement ufE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome\")]")
	public WebElement nomeE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecionar CNPJ\")]")
	public WebElement cnpjE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\")]")
	public WebElement dataVigenciaE;


	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement companyV;
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"name\"]")
	public WebElement nomeV;
	@FindBy(xpath = "//span[@id=\"cnpj\"]")
	public WebElement cnpjV;
	@FindBy(xpath = "//span[@id=\"effectiveDateFrom\"]")
	public WebElement dataVigenciaV;


	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	public SCANCDistribuidoraVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		sleep(2000);
		scanc.click();
		sleep(2000);
		scancDistribuidoras.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		;
		String idRegistro = idObter("SCANCDistribuidora");

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
		String nomeV1 = nomeV.getText();
		String cnpjV1 = cnpjV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();


		System.out.println(empresaV1);
		System.out.println(ufV1);
		System.out.println(nomeV1);
		System.out.println(cnpjV1);
		System.out.println(dataVigenciaV1);


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
		sleep(8000);

		String empresaE1 = empresaE.getText();
		String ufE1 = ufE.getText();
		String nomeE1 = nomeE.getAttribute("value");
		String cnpjE1 = cnpjE.getAttribute("value");
		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");


		System.out.println(empresaE1);
		System.out.println(ufE1);
		System.out.println(nomeE1);
		System.out.println(cnpjE1);
		System.out.println(dataVigenciaE1);


		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(empresaE1.contains(empresaV1));
		sucesso.add(ufE1.contains(ufV1));
		sucesso.add(nomeE1.contains(nomeV1));
		sucesso.add(cnpjE1.contains(cnpjV1));
		sucesso.add(dataVigenciaE1.contains(dataVigenciaV1));

		System.out.println(sucesso);
		return sucesso;

	}

}
