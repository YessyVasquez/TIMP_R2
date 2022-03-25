package com.sap.timp.pageObjectModel.MDR.Centralizacao.FatorCreditamento;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class FatorCreditamentoDetalhesPO extends TestBaseSteven {

	@FindBy(xpath = "//li/div/span[text()=\"Centralização\"]")
	public WebElement centralização;
	@FindBy(xpath = "//li/div/span[text()=\"Fator de Creditamento do CIAP\"]")
	public WebElement fatorCrecimento;

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
	public WebElement empresaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement ufFilialD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div[1]")
	public WebElement filialD1;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div[2]")
	public WebElement filialD2;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement filialCentralizadoraD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement ativoD;
	

	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"ufBranch\"]")
	public WebElement ufFilialV;
	@FindBy(xpath = "//span[@id=\"branches\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"centralizeBranch\"]")
	public WebElement filialCentralizadoV;
	@FindBy(xpath = "//span[@id=\"active\"]")
	public WebElement ativoV;



	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	public FatorCreditamentoDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {

		centralização.click();
		sleep(1000);
		fatorCrecimento.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("FatorCreditamentoCIAP");

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
		String ufFilialD1 = ufFilialD.getText();
		String filialD11 = filialD1.getText();
		String filialD22 = filialD2.getText();
		String filialCentralizadoraD1 = filialCentralizadoraD.getText();
		String ativoD1 = ativoD.getText();


		System.out.println(empresaD1);
		System.out.println(ufFilialD1);
		System.out.println(filialD11);
		System.out.println(filialD22);
		System.out.println(filialCentralizadoraD1);
		System.out.println(ativoD1);

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
		attributoNotToBeEmptyElement(empresaV, "textContent");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String empresaV1 = empresaV.getText();
		String ufFilialV1 = ufFilialV.getText();
		String filialV1 = filialV.getText();
		String filialCentralizadoV1 = filialCentralizadoV.getText();
		String ativoV1 = ativoV.getText();


		System.out.println(empresaV1);
		System.out.println(ufFilialV1);
		System.out.println(filialV1);
		System.out.println(filialCentralizadoV1);
		System.out.println(ativoV1);



		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(empresaV1.contains(empresaD1));
		sucesso.add(ufFilialV1.contains(ufFilialD1));
		sucesso.add(filialV1.contains(filialD11));
		sucesso.add(filialV1.contains(filialD22));
		sucesso.add(filialCentralizadoV1.contains(filialCentralizadoraD1));
		sucesso.add(ativoV1.contains(ativoD1));



		System.out.println(sucesso);

		return sucesso;

	}

}
