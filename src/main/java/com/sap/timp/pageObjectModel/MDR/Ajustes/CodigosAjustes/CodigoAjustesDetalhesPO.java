package com.sap.timp.pageObjectModel.MDR.Ajustes.CodigosAjustes;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigoAjustesDetalhesPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Ajustes\"]")
	public WebElement ajustes;

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

	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div")
	public WebElement id;

	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement codigoA;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement descricao;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement codigoCont;
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement empresa;
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement tributo;
	@FindBy(xpath = "//div[@id=\"detail-description\"][7]/div[2]/div")
	public WebElement tipoImpuesto;
	@FindBy(xpath = "//div[@id=\"detail-description\"][12]/div[2]/div")
	public WebElement dataVigencia;

	@FindBy(xpath = "//span[@id=\"id\"]")
	public WebElement idV;
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

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;


	public CodigoAjustesDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {

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
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);

		String idD = id.getText();
		String codigoD = codigoA.getText();
		String descricaoD = descricao.getText();
		String codigoContD = codigoCont.getText();
		String empresaD = empresa.getText();
		String tributoD = tributo.getText();
		String tipoImpuestoD = tipoImpuesto.getText();
		String dataVigenciaD = dataVigencia.getText();
		sleep(2000);
		fechar.click();

		actionsMoveToElementElement(menu);


		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idV1 = idV.getText();
		String codigoV1 = codigoAV.getText();
		String descricaoV1 = descricaoV.getText();
		String codigoContV1 = codigoContV.getText();
		String empresaV1 = empresaV.getText();
		String tributoV1 = tributoV.getText();
		String tipoImpuestoV1 = tipoTributoV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(idD.contains(idV1));
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
