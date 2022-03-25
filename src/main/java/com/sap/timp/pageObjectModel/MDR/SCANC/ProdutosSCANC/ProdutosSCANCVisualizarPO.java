package com.sap.timp.pageObjectModel.MDR.SCANC.ProdutosSCANC;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ProdutosSCANCVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"Produtos SCANC\"]")
	public WebElement produtosScanc;

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


	@FindBy(xpath = "//input[contains(@placeholder,\"SCANC\")]")
	public WebElement GRScancE;
	@FindBy(xpath = "//div[@id=\"material-code-products\"]/div/div/div/div/div/div[1]")
	public WebElement materialE;
	@FindBy(xpath = "//input[contains(@placeholder,\"início\")]")
	public WebElement dataVigenciaE;


	@FindBy(xpath = "//span[@id=\"grScanc\"]")
	public WebElement GRScancV;
	@FindBy(xpath = "//span[@id=\"material\"]")
	public WebElement materialV;
	@FindBy(xpath = "//span[@id=\"validityFrom\"]")
	public WebElement dataVigenciaV;


	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	public ProdutosSCANCVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		scanc.click();
		sleep(2000);
		
		produtosScanc.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ProdutosSCANC");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);

		String GRScancV1 = GRScancV.getText();
		String materialV1 = materialV.getText();
		String dataViengiaV1 = dataVigenciaV.getText();
		
		
		System.out.println(GRScancV1);
		System.out.println(materialV1);
		System.out.println(dataViengiaV1);
		


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
		attributoNotToBeEmptyElement(dataVigenciaE, "value");
		sleep(5000);

		String GRScanE1 = GRScancE.getAttribute("value");
		String materialE1 = materialE.getText();
		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");
		


		System.out.println(GRScanE1);
		System.out.println(materialE1);
		System.out.println(dataVigenciaE1);

		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(GRScanE1.contains(GRScancV1));
		sucesso.add(materialE1.contains(materialV1));
		sucesso.add(dataVigenciaE1.contains(dataViengiaV1));

	

		System.out.println(sucesso);
		return sucesso;

	}

}
