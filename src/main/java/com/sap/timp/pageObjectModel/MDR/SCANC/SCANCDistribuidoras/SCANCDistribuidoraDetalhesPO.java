package com.sap.timp.pageObjectModel.MDR.SCANC.SCANCDistribuidoras;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class SCANCDistribuidoraDetalhesPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"SCANC Distribuidoras\"]")
	public WebElement scancDistribuidoras;
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

	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement empresaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement ufD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement nomeD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement cnpjD;

	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"name\"]")
	public WebElement nomeV;
	@FindBy(xpath = "//span[@id=\"cnpj\"]")
	public WebElement cnpjV;

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	public SCANCDistribuidoraDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {

		
		sleep(2000);
		scanc.click();
		sleep(2000);
		scancDistribuidoras.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("SCANCDistribuidora");

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
		String ufD1 = ufD.getText();
		String nomeD1 = nomeD.getText();
		String cnpjD1 = cnpjD.getText();

		System.out.println(empresaD1);
		System.out.println(ufD1);
		System.out.println(nomeD1);
		System.out.println(cnpjD1);

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

		String empresaV1 = empresaV.getText();
		String ufV1 = ufV.getText();
		String nomeV1 = nomeV.getText();
		String cnpjV1 = cnpjV.getText();

		System.out.println(empresaV1);
		System.out.println(ufV1);
		System.out.println(nomeV1);
		System.out.println(cnpjV1);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(empresaV1.contains(empresaD1));
		sucesso.add(ufV1.contains(ufD1));
		sucesso.add(nomeV1.contains(nomeD1));
		sucesso.add(cnpjV1.contains(cnpjD1));

		System.out.println(sucesso);

		return sucesso;

	}

}
