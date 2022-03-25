package com.sap.timp.pageObjectModel.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ConfiguraçãoDeTipoTaxaDeAtualizaçãoVisualizarPO extends TestBaseMassiel{

	@FindBy(xpath = "//li[@identifier=\"accordion-item-updateRates\"]")
	public WebElement taxasDeActualizacao;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-updateRateConfiguration\"]")
	public WebElement configuracaoDeTipoTaxa;

	@FindBy(xpath = "//div[contains(@class, \"icon-left\")][2]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;

	@FindBy(xpath = "//span[@id=\"indexCode\"]")
	public WebElement codigoIndice;

	@FindBy(xpath = "//span[@id=\"indexName\"]")
	public WebElement nomedoÍndice;

	@FindBy(xpath = "//span[@id=\"indexDescription\"]")
	public WebElement descriçãodoÍndice;

	@FindBy(xpath = "//span[@id=\"indexType\"]")
	public WebElement tipoÍndice;

	@FindBy(xpath = "//span[@id=\"coinIndex\"]")
	public WebElement moedaÍndice;

	@FindBy(xpath = "//span[@id=\"indexStartDate\"]")
	public WebElement datadeIniciodeVigência;

	@FindBy(xpath = "//span[@id=\"indexEndDate\"]")
	public WebElement datadeFimdeVigência;

	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//div[contains(@class, \"indexCode\")]/div/div[2]/div/div/div[2]/input")
	public WebElement codigoIndice1;

	@FindBy(xpath = "//div[contains(@class, \"indexName\")]/div/div[2]/div/div/div[2]/input")
	public WebElement nomedoÍndice1;

	@FindBy(xpath = "//div[contains(@class, \"indexDescription\")]/div/div[2]/div/div/div[2]/input")
	public WebElement descriçãodoÍndice1;

	@FindBy(xpath = "//div[contains(@class, \"indexType\")]/div/div[2]/div/div/div[2]/input")
	public WebElement tipoÍndice1;

	@FindBy(xpath = "//div[contains(@class, \"coinIndex\")]/div/div[2]/div/div/div[2]/input")
	public WebElement moedaÍndice1;

	@FindBy(xpath = "//div[contains(@class, \"indexStartDate\")]/div/div/input")
	public WebElement datadeIniciodeVigência1;

	@FindBy(xpath = "//div[contains(@class, \"indexEndDate \")]/div/div/input")
	public WebElement datadeFimdeVigência1;

	public ConfiguraçãoDeTipoTaxaDeAtualizaçãoVisualizarPO() {
		PageFactory.initElements(driver, this);
	}


	public ArrayList<Boolean> Visualizar() {

		sleep(2000);
		taxasDeActualizacao.click();

		sleep(1000);
		configuracaoDeTipoTaxa.click();

		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
//		ultimaPagina.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		String idRegistro =idObter("configuracaodetipotaxadeatualizacao");
		
		System.out.println(idRegistro);
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);

		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String textoIndice = codigoIndice.getText();
		String textoNomeIndice = nomedoÍndice.getText();
		String textodescriçãodoÍndice = descriçãodoÍndice.getText();
		String textoNometipoÍndice = tipoÍndice.getText();
		String textoNomemoedaÍndice = moedaÍndice.getText();
		String textodatadeIniciodeVigência = datadeIniciodeVigência.getText();
		String textodatadeFimdeVigência = datadeFimdeVigência.getText();

		System.out.println("CodigoIndice: " + textoIndice);
		System.out.println("Nome do Índice: " + textoNomeIndice);
		System.out.println("DescriçãodoÍndice: " + textodescriçãodoÍndice);
		System.out.println("Tipo Índice: " + textoNometipoÍndice);
		System.out.println("Moeda Índice: " + textoNomemoedaÍndice);
		System.out.println("Data de Inicio de Vigênci: " + textodatadeIniciodeVigência);
		System.out.println("Data de Fim de Vigência: " + textodatadeFimdeVigência);

		sleep(2000);
		biblioteca.click();

		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//btnPrimerPagina.click();
		//sleep(2000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//sleep(2000);

		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu1.click();
		sleep(2000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String textoIndice1 = codigoIndice1.getAttribute("value");
		String textoNomeIndice1 = nomedoÍndice1.getAttribute("value");
		String textodescriçãodoÍndice1 = descriçãodoÍndice1.getAttribute("value");
		String textoNometipoÍndice1 = tipoÍndice1.getAttribute("value");
		String textoNomemoedaÍndice1 = moedaÍndice1.getAttribute("value");
		String textodatadeIniciodeVigência1 = datadeIniciodeVigência1.getAttribute("value");
		String textodatadeFimdeVigência1 = datadeFimdeVigência1.getAttribute("value");


		System.out.println("-------------------------------------------");
		System.out.println("CodigoIndice: " + textoIndice1);
		System.out.println("Nome do Índice: " + textoNomeIndice1);
		System.out.println("DescriçãodoÍndice: " + textodescriçãodoÍndice1);
		System.out.println("Tipo Índice: " + textoNometipoÍndice1);
		System.out.println("Moeda Índice: " + textoNomemoedaÍndice1);
		System.out.println("Data de Inicio de Vigênci: " + textodatadeIniciodeVigência1);
		System.out.println("Data de Fim de Vigência: " + textodatadeFimdeVigência1);


		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textoIndice1.equals(textoIndice));
		sucesso.add(textoNomeIndice1.equals(textoNomeIndice));
		sucesso.add(textodescriçãodoÍndice1.equals(textodescriçãodoÍndice));
		sucesso.add(textoNometipoÍndice1.equals(textoNometipoÍndice));
		sucesso.add(textoNomemoedaÍndice1.equals(textoNomemoedaÍndice));
		sucesso.add(textodatadeIniciodeVigência1.equals(textodatadeIniciodeVigência));
		sucesso.add(textodatadeFimdeVigência1.equals(textodatadeFimdeVigência));

		return sucesso;
	}

}
