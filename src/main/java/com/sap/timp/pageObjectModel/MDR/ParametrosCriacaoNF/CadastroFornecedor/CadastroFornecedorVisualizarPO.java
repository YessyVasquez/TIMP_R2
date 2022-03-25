package com.sap.timp.pageObjectModel.MDR.ParametrosCriacaoNF.CadastroFornecedor;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CadastroFornecedorVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Parâmetros de Criação de Nota Fiscal\"]")
	public WebElement parametrosCriacaoNotaFiscal;
	
	@FindBy(xpath = "//span[text()=\"Cadastro de Fornecedor\"]")
	public WebElement cadastroFornecedor;

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

	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[@id]")
	public WebElement empresaE;
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div/div/div/div[@id]")
	public WebElement ufE;
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div[@id]")
	public WebElement filialE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Fornecedor\")]")
	public WebElement fornecedorE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicial\")]")
	public WebElement dataVigenciaE;


	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"provider\"]")
	public WebElement fornecedorV;
	@FindBy(xpath = "//span[@id=\"startDate\"]")
	public WebElement dataVigenciaV;


	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	public CadastroFornecedorVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {


		sleep(2000);
		parametrosCriacaoNotaFiscal.click();
		sleep(2000);
		cadastroFornecedor.click();
		sleep(2000);


		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		String idRegistro = idObter("CadastroFornecedor");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);

		String empresaV1 = empresaV.getText();
		String ufV1 = ufV.getText();
		String filialV1 = filialV.getText();
		filialV1 = filialV1.replace("_", "-");
		String fornecedorV1 = fornecedorV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();



		System.out.println(empresaV1);
		System.out.println(ufV1);
		System.out.println(filialV1);
		System.out.println(fornecedorV1);
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
		sleep(2000);

		String empresaE1 = empresaE.getText();
		String ufE1 = ufE.getText();
		String filialE1 = filialE.getText();
		filialE1 = filialE1.replace(" ", "");
		String fornecedorE1 = fornecedorE.getAttribute("value");
		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");


		System.out.println(empresaE1);
		System.out.println(ufE1);
		System.out.println(filialE1);
		System.out.println(fornecedorE1);
		System.out.println(dataVigenciaE1);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(empresaE1.contains(empresaV1));
		sucesso.add(ufE1.contains(ufV1));
		sucesso.add(filialE1.contains(filialV1));
		sucesso.add(fornecedorE1.contains(fornecedorV1));
		sucesso.add(dataVigenciaE1.contains(dataVigenciaV1));


		System.out.println(sucesso);
		return sucesso;

	}

}
