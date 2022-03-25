package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela27;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigosDeLotacaoDetalhesPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;

	@FindBy(xpath = "//span[text()=\"Tabela 27 - Códigos de Lotação\"]")
	public WebElement tabela27;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement empresaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement razaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement codigoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][12]/div[2]/div")
	public WebElement dataVigenciaD;

	@FindBy(xpath = "//td[@id=\"company\"]/span")
	public WebElement empresaV;
	@FindBy(xpath = "//td[@id=\"companySocialReason\"]/span")
	public WebElement razaoV;
	@FindBy(xpath = "//td[@id=\"lotacaoCode\"]/span")
	public WebElement codigoV;
	@FindBy(xpath = "//td[@id=\"effectiveDateFrom\"]/span")
	public WebElement dataVigenciaV;

	

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	public CodigosDeLotacaoDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {

		sleep(2000);
		tabelaApoio.click();
		sleep(2000);

		tabela27.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("CodigosDeLotacao");

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

		String empresaD1 = empresaD.getText();
		String razaoD1 = razaoD.getText();
		String codigoD1 = codigoD.getText();
		String dataVigenciaD1 = dataVigenciaD.getText();
		

		
		System.out.println(empresaD1);
		System.out.println(razaoD1);
		System.out.println(codigoD1);
		System.out.println(dataVigenciaD1);

	
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

		String empresaV1 = empresaV.getText();
		String razaoV1 = razaoV.getText();
		String codigoV1 = codigoV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();


		System.out.println(empresaV1);
		System.out.println(razaoV1);
		System.out.println(codigoV1);
		System.out.println(dataVigenciaV1);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaV1.contains(empresaD1));
		sucesso.add(razaoV1.contains(razaoD1));
		sucesso.add(codigoV1.contains(codigoD1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaD1));


		
		System.out.println(sucesso);
		
		return sucesso;
		


	}

}
