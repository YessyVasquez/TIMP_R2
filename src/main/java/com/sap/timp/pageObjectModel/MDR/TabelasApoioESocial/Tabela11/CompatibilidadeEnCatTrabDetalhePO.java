package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela11;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CompatibilidadeEnCatTrabDetalhePO extends TestBaseSteven {
	

	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;

	@FindBy(xpath = "//span[text()=\"Tabela 11 - Compatibilidade en Cat. Trab.\"]")
	public WebElement tabela11;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	

	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement codigo;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement classificacao;

	@FindBy(xpath = "//div[@id=\"detail-description\"][17]/div[2]/div")
	public WebElement fecha;


	@FindBy(xpath = "//td[@id=\"code\"]/span")
	public WebElement codigoV;
	@FindBy(xpath = "//td[@id=\"classificationTax\"]/span")
	public WebElement classificacaoV;

	@FindBy(xpath = "//td[@id=\"effectiveDateFrom\"]/span")
	public WebElement fechaV;

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	public CompatibilidadeEnCatTrabDetalhePO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {

		sleep(2000);
		tabelaApoio.click();
		sleep(2000);

		tabela11.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("CompatibilidadeEnCatTrab");

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

		String empresaD1 = classificacao.getText();
		String razaoD1 = codigo.getText();
		String codigoD1 = fecha.getText();


		
		System.out.println(empresaD1);
		System.out.println(razaoD1);
		System.out.println(codigoD1);


	
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

		String empresaV1 = classificacaoV.getText();
		String razaoV1 = codigoV.getText();
		String codigoV1 = fechaV.getText();



		System.out.println(empresaV1);
		System.out.println(razaoV1);
		System.out.println(codigoV1);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaV1.contains(empresaD1));
		sucesso.add(razaoV1.contains(razaoD1));
		sucesso.add(codigoV1.contains(codigoD1));


		
		System.out.println(sucesso);
		
		return sucesso;
		


	}

}
