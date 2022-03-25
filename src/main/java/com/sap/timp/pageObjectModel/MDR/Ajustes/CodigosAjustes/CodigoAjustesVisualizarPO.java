package com.sap.timp.pageObjectModel.MDR.Ajustes.CodigosAjustes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigoAjustesVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Ajustes\"]")
	public WebElement ajustes;

	@FindBy(xpath = "//span[text()=\"Códigos de Ajustes\"]")
	public WebElement codigo;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	

	@FindBy(xpath = "//input[contains(@placeholder,\"Tipo de Lançamento\") and @disabled]")
	public WebElement codigoE;
	@FindBy(xpath = "//textarea[contains(@placeholder,\"Descrição Padrão\")]")
	public WebElement descricaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Código Contabilização\")]")
	public WebElement codigoContE;
	@FindBy(xpath = "//div[contains(@id,\"multipleControlerId\")]")
	public WebElement empresaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecionar Tributo\")]")
	public WebElement tributoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecionar Tipo de Tributo\")]")
	public WebElement tipoImpuestoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\") ]")
	public WebElement dataVigenciaE;

	@FindBy(xpath = "//span[@id=\"AdjCode\"]")
	public WebElement codigoAV;
	@FindBy(xpath = "//span[@id=\"AdjDescription\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"AdjAccountingType\"]")
	public WebElement codigoContV;
	@FindBy(xpath = "//span[@id=\"companyCode\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"AdjTribute\"]")
	public WebElement tributoV;
	@FindBy(xpath = "//span[@id=\"AdjTributeType\"]")
	public WebElement tipoTributoV;
	@FindBy(xpath = "//span[@id=\"validityFrom\"]")
	public WebElement dataVigenciaV;



	public CodigoAjustesVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		String url = driver.getCurrentUrl();

		if (url.contains("tc2") == true || url.contains("tp1") == true) {
			sleep(1000);
			codigo.click();
		} else {
			ajustes.click();
			sleep(1000);
			codigo.click();
		}

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("CodigoAjuste");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		

		String codigoV1 = codigoAV.getText();
		String descricaoV1 = descricaoV.getText();
		String codigoContV1 = codigoContV.getText();
		String empresaV1 = empresaV.getText();
		String tributoV1 = tributoV.getText();
		String tipoImpuestoV1 = tipoTributoV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();
		sleep(2000);
		
		System.out.println(codigoV1);
		System.out.println(descricaoV1);
		System.out.println(codigoContV1);
		System.out.println(empresaV1);
		System.out.println(tributoV1);
		System.out.println(tipoImpuestoV1);
		System.out.println(dataVigenciaV1);

		biblioteca.click();
		sleep(3000);
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
		attributeToBeXpath("//div[@id=\"tributeTypeDetail\"]/div/div/div/div[1]", "class", "input-wrapper base-input  required");
		sleep(2000);

		String codigoD = codigoE.getAttribute("value");
		String descricaoD = descricaoE.getAttribute("value");
		String codigoContD = codigoContE.getAttribute("value");
		String empresaD = empresaE.getText();
		String tributoD = tributoE.getAttribute("value");
		String tipoImpuestoD = tipoImpuestoE.getAttribute("value");
		String dataVigenciaD = dataVigenciaE.getAttribute("value");
		
		System.out.println(codigoD);
		System.out.println(descricaoD);
		System.out.println(codigoContD);
		System.out.println(empresaD);
		System.out.println(tributoD);
		System.out.println(tipoImpuestoD);
		System.out.println(dataVigenciaD);
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(codigoD.contains(codigoV1));
		sucesso.add(descricaoD.contains(descricaoV1));
		sucesso.add(codigoContV1.contains(codigoContD));
		sucesso.add(empresaD.contains(empresaV1));
		sucesso.add(tributoD.contains(tributoV1));
		sucesso.add(tipoImpuestoD.contains(tipoImpuestoV1));
		sucesso.add(dataVigenciaD.contains(dataVigenciaV1));

		System.out.println(sucesso);
		
		return sucesso;
	

	}

}
