package com.sap.timp.pageObjectModel.MDR.ValorAdicionado.Municipio;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MunicipioVisualizarPO extends TestBaseSteven {

	
	@FindBy(xpath = "//span[text()=\"Valor Adicionado\"]")
	public WebElement valorAdicionado;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-valueAddedTax\"]/ul/li/div/span[text()=\"Municípios\"]")
	public WebElement municipios;

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

	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/input")
	public WebElement ufE;
	@FindBy(xpath = "//div[@id=\"municipio\"]/div/div/input")
	public WebElement municipioE;
	@FindBy(xpath = "//div[@id=\"codMunicipio\"]/div/div/input")
	public WebElement codigoMunicipioE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Valor\")]")
	public WebElement valorE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Populacão\")]")
	public WebElement populacaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Coeficiente\")]")
	public WebElement coeficienteE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\")]")
	public WebElement dataVigenciaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Mês\")]")
	public WebElement mesCreditoE;



	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"municipio\"]")
	public WebElement municipioV;
	@FindBy(xpath = "//span[@id=\"codMunicipio\"]")
	public WebElement codigoMunicipioV;
	@FindBy(xpath = "//span[@id=\"valorPorcentualInformado\"]")
	public WebElement valorV;
	@FindBy(xpath = "//span[@id=\"population\"]")
	public WebElement populacaoV;
	@FindBy(xpath = "//span[@id=\"participationCoefficient\"]")
	public WebElement coeficienteV;
	@FindBy(xpath = "//span[@id=\"validity\"]")
	public WebElement dataVigenciaV;
	@FindBy(xpath = "//span[@id=\"creditMonth\"]")
	public WebElement mesCreditoV;


	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	public MunicipioVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		sleep(2000);
		valorAdicionado.click();
		sleep(2000);
		municipios.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		;
		String idRegistro = idObter("municipio");

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


		String ufV1 = ufV.getText();
		String municipioV1 = municipioV.getText();
		String codigoMunicipioV1 = codigoMunicipioV.getText();
		String valorV1 = valorV.getText();
		String populacaoV1 = populacaoV.getText();
		String coeficioenteV1 = coeficienteV.getText();
		String dataVigenciaV1  = dataVigenciaV.getText();
		String mesCreditoV1 = mesCreditoV.getText();



		System.out.println(ufV1);
		System.out.println(municipioV1);
		System.out.println(codigoMunicipioV1);
		System.out.println(valorV1);
		System.out.println(populacaoV1);
		System.out.println(coeficioenteV1);
		System.out.println(dataVigenciaV1);
		System.out.println(mesCreditoV1);


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

		attributoNotToBeEmptyElement(municipioE, "value");

		sleep(5000);


		String ufE1 = ufE.getAttribute("value");
		String municipioE1 = municipioE.getAttribute("value");
		String codigoMunicipioE1 = codigoMunicipioE.getAttribute("value");
		String valorE1 = valorE.getAttribute("value");
		String populacaoE1 = populacaoE.getAttribute("value");
		String coeficienteE1 = coeficienteE.getAttribute("value");
		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");
		String mesCreditoE1 = mesCreditoE.getAttribute("value");



		System.out.println(ufE1);
		System.out.println(municipioE1);
		System.out.println(codigoMunicipioE1);
		System.out.println(valorE1);
		System.out.println(populacaoE1);
		System.out.println(coeficienteE1);
		System.out.println(dataVigenciaE1);
		System.out.println(mesCreditoE1);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();


		sucesso.add(ufE1.contains(ufV1));
		sucesso.add(municipioE1.contains(municipioV1));
		sucesso.add(codigoMunicipioE1.contains(codigoMunicipioV1));
		sucesso.add(valorE1.contains(valorV1));
		sucesso.add(populacaoE1.contains(populacaoV1));
		sucesso.add(coeficienteE1.contains(coeficioenteV1));
		sucesso.add(dataVigenciaE1.contains(dataVigenciaV1));
		sucesso.add(mesCreditoE1.contains(mesCreditoV1));


		System.out.println(sucesso);
		return sucesso;

	}

}
