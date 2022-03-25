package com.sap.timp.pageObjectModel.MDR.CadastroDerex.InstituicaoFinanceira;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class InstituicaoDetalhesPO extends TestBaseSteven {

	@FindBy(xpath = "//li/div/span[text()=\"Cadastro DEREX\"]")
	public WebElement derex;
	@FindBy(xpath = "//li/div/span[text()=\"Instituição Financeira\"]")
	public WebElement instituicaoF;

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
	public WebElement filialD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement tributoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement instituicaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement paisD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][7]/div[2]/div")
	public WebElement moedaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][8]/div[2]/div")
	public WebElement ativoD;

	@FindBy(xpath = "//span[@id=\"companyCode\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"branchCode\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"taxFinancial\"]")
	public WebElement tributoV;
	@FindBy(xpath = "//span[@id=\"financialInstitution\"]")
	public WebElement instituicaoV;
	@FindBy(xpath = "//span[@id=\"countryCode\"]")
	public WebElement paisV;
	@FindBy(xpath = "//span[@id=\"coinCode\"]")
	public WebElement moedaV;
	@FindBy(xpath = "//span[@id=\"active\"]")
	public WebElement ativoV;


	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	public InstituicaoDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {

		derex.click();
		sleep(2000);
		instituicaoF.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("InstituicaoFinanceira");

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
		String filialD1 = filialD.getText();
		String tributoD1 = tributoD.getText();
		String instituicaoD1 = instituicaoD.getText();
		String paisD1 = paisD.getText();
		String moedaD1 = moedaD.getText();
		String ativoD1 = ativoD.getText();

		System.out.println(empresaD1);
		System.out.println(filialD1);
		System.out.println(tributoD1);
		System.out.println(instituicaoD1);
		System.out.println(paisD1);
		System.out.println(moedaD1);
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
		String filialV1 = filialV.getText();
		String tributoV1 = tributoV.getText();
		String instituicaoV1 = instituicaoV.getText();
		String paisV1 = paisV.getText();
		String moedaV1 = moedaV.getText();
		String ativoV1 = ativoV.getText();


		System.out.println("*********************");
		System.out.println();
		
		System.out.println(empresaV1);
		System.out.println(filialV1);
		System.out.println(tributoV1);
		System.out.println(instituicaoV1);
		System.out.println(paisV1);
		System.out.println(moedaV1);
		System.out.println(ativoV1);


		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(empresaV1.contains(empresaD1));
		sucesso.add(filialV1.contains(filialD1));
		sucesso.add(tributoV1.contains(tributoD1));
		sucesso.add(instituicaoV1.contains(instituicaoD1));
		sucesso.add(paisV1.contains(paisD1));
		sucesso.add(moedaD1.contains(moedaV1));
		sucesso.add(ativoV1.contains(ativoD1));


		System.out.println(sucesso);

		return sucesso;

	}

}
