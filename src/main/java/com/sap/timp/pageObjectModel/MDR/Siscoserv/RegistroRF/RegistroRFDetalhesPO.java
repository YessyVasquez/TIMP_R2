package com.sap.timp.pageObjectModel.MDR.Siscoserv.RegistroRF;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegistroRFDetalhesPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Siscoserv\"]")
	public WebElement siscoserv;

	@FindBy(xpath = "//span[text()=\"Registro RF\"]")
	public WebElement registrorp;

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
	public WebElement numeroServD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement periodoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement numeroRegistroD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement valorRecibidoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][7]/div[2]/div")
	public WebElement numeroDeclaracaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][14]/div[2]/div")
	public WebElement ativoD;

	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement companyV;
	@FindBy(xpath = "//span[@id=\"serviceSoldNumber\"]")
	public WebElement numeroServV;
	@FindBy(xpath = "//span[@id=\"period\"]")
	public WebElement periodV;
	@FindBy(xpath = "//span[@id=\"exportDeclarationNumber\"]")
	public WebElement numeroRegistroV;
	@FindBy(xpath = "//span[@id=\"exteriorValue\"]")
	public WebElement valorRecibidoV;
	@FindBy(xpath = "//span[@id=\"importDeclarationNumber\"]")
	public WebElement numeroDeclaracaoV;
	@FindBy(xpath = "//span[@id=\"active\"]")
	public WebElement ativoV;


	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	public RegistroRFDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {

		siscoserv.click();
		sleep(2000);
		registrorp.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("RegistroRF");

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
		String numeroServD1 = numeroServD.getText();
		String periodoD1 = periodoD.getText();
		String numeroRegistroD1 = numeroRegistroD.getText();
		numeroRegistroD1 = numeroRegistroD1.replace("R$ ", "").replace(".", "").replace(",", "");
		String valorRecibidoD1 = valorRecibidoD.getText().replace(".", "").replace(",", "");
		String numeroDeclaracaoD1 = numeroDeclaracaoD.getText();
		String ativoD1 = ativoD.getText();

		System.out.println(empresaD1);
		System.out.println(numeroServD1);
		System.out.println(periodoD1);
		System.out.println(numeroRegistroD1);
		System.out.println(valorRecibidoD1);
		System.out.println(numeroDeclaracaoD1);
		System.out.println(ativoD1);
		System.out.println("");


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

		String empresaV1 = companyV.getText();
		String numeroServV1 = numeroServV.getText();
		String periodoV1 = periodV.getText();
		String numeroRegistroV1 = numeroRegistroV.getText().replace(".", "").replace(",", "");
		String valorRecibidoV1 = valorRecibidoV.getText().replace(".", "").replace(",", "");
		valorRecibidoV1 = valorRecibidoV1.replace("R$ ", "");
		String numeroDeclaracaoV1 = numeroDeclaracaoV.getText();
		String ativoV1 = ativoV.getText();


		System.out.println(empresaV1);
		System.out.println(numeroServV1);
		System.out.println(periodoV1);
		System.out.println(numeroRegistroV1);
		System.out.println(valorRecibidoV1);
		System.out.println(numeroDeclaracaoV1);
		System.out.println(ativoV1);


		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(empresaV1.contains(empresaD1));
		sucesso.add(numeroServV1.contains(numeroServD1));
		sucesso.add(periodoV1.contains(periodoD1));
		sucesso.add(numeroRegistroD1.contains(numeroRegistroV1));
		sucesso.add(valorRecibidoV1.contains(valorRecibidoD1));
		sucesso.add(numeroDeclaracaoV1.contains(numeroDeclaracaoD1));
		sucesso.add(ativoV1.contains(ativoD1));


		System.out.println(sucesso);

		return sucesso;

	}

}
