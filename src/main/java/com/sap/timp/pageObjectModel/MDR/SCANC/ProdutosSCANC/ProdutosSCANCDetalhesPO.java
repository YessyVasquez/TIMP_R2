package com.sap.timp.pageObjectModel.MDR.SCANC.ProdutosSCANC;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ProdutosSCANCDetalhesPO extends TestBaseSteven {

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

	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement GRScancD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement mercadoriaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement materialD;


	@FindBy(xpath = "//span[@id=\"grScanc\"]")
	public WebElement GRScancV;
	@FindBy(xpath = "//span[@id=\"grMerchandise\"]")
	public WebElement mecadoriaV;
	@FindBy(xpath = "//span[@id=\"material\"]")
	public WebElement materialV;

	

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	public ProdutosSCANCDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {
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
		WebElement açao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);

		String GRScancD1 = GRScancD.getText();
		String mercadoriaD1 = mercadoriaD.getText();
		
		
		mercadoriaD1 = ordenar(mercadoriaD1);
		mercadoriaD1.replace(", ", "").trim();
		String materialD1 = materialD.getText();

		
		System.out.println(GRScancD1);
		System.out.println(mercadoriaD1);
		System.out.println(materialD1);

		
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
		visibilityOfElementXpath("//span[@id=\"grScanc\"]");
		sleep(3000);

		String GRScancV1 = GRScancV.getText();
		String mercadoriaV1 = mecadoriaV.getText();
		
		mercadoriaV1 = ordenar(mercadoriaV1);
		mercadoriaV1.replace(", ", "").trim();
	
		String materialV1 = materialV.getText();


		System.out.println(GRScancV1);
		System.out.println(mercadoriaV1);
		System.out.println(materialV1);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(GRScancV1.contains(GRScancD1));
		sucesso.add(mercadoriaV1.contains(mercadoriaD1));
		sucesso.add(materialV1.contains(materialD1));

		
		System.out.println(sucesso);
		
		return sucesso;
		


	}

}
