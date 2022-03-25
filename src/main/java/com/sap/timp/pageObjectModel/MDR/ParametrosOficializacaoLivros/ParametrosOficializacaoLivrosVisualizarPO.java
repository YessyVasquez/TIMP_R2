package com.sap.timp.pageObjectModel.MDR.ParametrosOficializacaoLivros;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParametrosOficializacaoLivrosVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Parâmetros de Oficialização de Livros\"]")
	public WebElement parametrosOficializacaoLivros;

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

	
	@FindBy(xpath = "//input[contains(@placeholder,\"Tipo do Livro\")]")
	public WebElement tipoLivroE;
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[@id]")
	public WebElement empresaE;
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div/div/div/div/div[@id]")
	public WebElement ufE;
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div[@id]")
	public WebElement filialE;
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div/div/div/div[@id]")
	public WebElement tributoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Layout\")]")
	public WebElement layoutTFBE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Configuração\")]")
	public WebElement configuracaoTFBE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicial\")]")
	public WebElement dataVigenciaE;


	
	@FindBy(xpath = "//span[@id=\"bookType\"]")
	public WebElement tipoLivroV;
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributoV;
	@FindBy(xpath = "//span[@id=\"tfbLayout\"]")
	public WebElement layoutTFBV;
	@FindBy(xpath = "//span[@id=\"tfbConfiguration\"]")
	public WebElement configuracaoTFBV;
	@FindBy(xpath = "//span[@id=\"effectiveDateFrom\"]")
	public WebElement dataVigenciaV;


	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	public ParametrosOficializacaoLivrosVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		sleep(2000);
		parametrosOficializacaoLivros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("ParametrosOficializacaoLivros");

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
		attributoNotToBeEmptyElement(tipoLivroV, "textContent");
		sleep(1000);
		
		String tipoLivroV1 = tipoLivroV.getText();
		String empresaV1 = empresaV.getText();
		String ufV1 = ufV.getText();
		String filialV1 = filialV.getText();
		String tributoV1 = tributoV.getText();
		String layoutTFBV1 = layoutTFBV.getText();
		String configuracaoTFBV1 = configuracaoTFBV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();
		tipoLivroV1=tipoLivroV1.replace(" ", "");
		
		System.out.println(tipoLivroV1);
		System.out.println(empresaV1);
		System.out.println(ufV1);
		System.out.println(filialV1);
		System.out.println(tributoV1);
		System.out.println(layoutTFBV1);
		System.out.println(configuracaoTFBV1);
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

		attributeToBeXpath("//div[@id=\"uf\"]/div", "class", "base-MultipleSelect3 required");
		
		sleep(1000);
		
		
		String tipoLivroE1 = tipoLivroE.getAttribute("value");
		String empresaE1 = empresaE.getAttribute("textContent");
		String ufE1 = ufE.getAttribute("textContent");
		String filialE1 = filialE.getAttribute("textContent");
		String tributoE1 = tributoE.getAttribute("textContent");
		String layoutTFBE1 = layoutTFBE.getAttribute("value");
		String configuracaoTFBE1 = configuracaoTFBE.getAttribute("value");
		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");
		filialE1=filialE1.replace(" ", "");
		tipoLivroE1=tipoLivroE1.replace(" ", "");
		System.out.println(tipoLivroE1);
		System.out.println(empresaE1);
		System.out.println(ufE1);
		System.out.println(filialE1);
		System.out.println(tributoE1);
		System.out.println(layoutTFBE1);
		System.out.println(configuracaoTFBE1);
		System.out.println(dataVigenciaE1);


		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(tipoLivroE1.contains(tipoLivroV1));
		sucesso.add(empresaE1.contains(empresaV1));
		sucesso.add(ufE1.contains(ufV1));
		sucesso.add(filialE1.contains(filialV1));
		sucesso.add(tributoE1.contains(tributoV1));
		sucesso.add(layoutTFBE1.contains(layoutTFBV1));
		sucesso.add(configuracaoTFBE1.contains(configuracaoTFBV1));
		sucesso.add(dataVigenciaE1.contains(dataVigenciaV1));


		System.out.println(sucesso);
		return sucesso;

	}

}
