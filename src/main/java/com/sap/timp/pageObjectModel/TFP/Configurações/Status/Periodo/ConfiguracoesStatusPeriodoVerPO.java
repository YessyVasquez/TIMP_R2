package com.sap.timp.pageObjectModel.TFP.Configurações.Status.Periodo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguracoesStatusPeriodoVerPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement configuracoes;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-Status\"]/div/span[2]")
	public WebElement status;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-PeriodStatusList\"]/div/span[text()=\"Período\"]")
	public WebElement periodo;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data inicial\"]")
	public WebElement datainicial;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[1]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"state\"]/div/div/div/div/div/div[1]")
	public WebElement estado;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div[1]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"input-100\"]")
	public WebElement aberto100V;

	@FindBy(xpath = "//div[@id=\"input-100\"]/div/div/div/div/div[1]/div[1]")
	public WebElement aberto100E;
	
	@FindBy(xpath = "//div[@id=\"input-200\"]")
	public WebElement aberto200V;

	@FindBy(xpath = "//div[@id=\"input-200\"]/div/div/div/div/div[1]/div[1]")
	public WebElement aberto200E;
	
	@FindBy(xpath = "//div[@id=\"input-300\"]")
	public WebElement aberto300V;

	@FindBy(xpath = "//div[@id=\"input-300\"]/div/div/div/div/div[1]/div[1]")
	public WebElement aberto300E;
	
	@FindBy(xpath = "//div[@id=\"input-400\"]")
	public WebElement aberto400V;

	@FindBy(xpath = "//div[@id=\"input-400\"]/div/div/div/div/div[1]/div[1]")
	public WebElement aberto400E;
	
	@FindBy(xpath = "//div[@id=\"input-500\"]")
	public WebElement aberto500V;

	@FindBy(xpath = "//div[@id=\"input-500\"]/div/div/div/div/div[1]/div[1]")
	public WebElement aberto500E;
	
	@FindBy(xpath = "//div[@id=\"input-600\"]")
	public WebElement aberto600V;

	@FindBy(xpath = "//div[@id=\"input-600\"]/div/div/div/div/div[1]/div[1]")
	public WebElement aberto600E;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data inicial\"]")
	public WebElement validadede;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data final\"]")
	public WebElement validadeate;
	
	public ConfiguracoesStatusPeriodoVerPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> ver() {

		String url = driver.getCurrentUrl();

		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;

		if (url.contains("tc2")) {
			tc2 = true;
		} else if (url.contains("tp1")) {
			tp1 = true;
		} else if (url.contains("tq1")) {
			tq1 = true;
		} else {
			td1 = true;
		}

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		status.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		periodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		if (tq1 == true) {
			String idRegistro = "73";
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
			WebElement ver = driver.findElement(
					By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));

			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			ver.click();

			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		} else if (tp1 == true) {
			String idRegistro = "29";

			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
			WebElement ver = driver.findElement(
					By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));

			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			ver.click();

			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		} else {
			String idRegistro = "19";

			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
			WebElement ver = driver.findElement(
					By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));

			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			ver.click();

			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		String empresaVi= empresa.getText();
		String estadoVi=estado.getText();
		String filiaalVi=filial.getText();
		String aberto100Vi=aberto100V.getText();
		String aberto200Vi=aberto200V.getText();
		String aberto300Vi=aberto300V.getText();
		String aberto400Vi=aberto400V.getText();
		String aberto500Vi=aberto500V.getText();
		String aberto600Vi=aberto600V.getText();
		String validadedeVi=validadede.getAttribute("value");
		String validadeateVi=validadeate.getAttribute("value");
		
		System.out.println("Dados do menu Ver");
		System.out.println("-------------------------------------------------------");
		System.out.println(empresaVi);
		System.out.println(estadoVi);
		System.out.println(filiaalVi);
		System.out.println(aberto100Vi);
		System.out.println(aberto200Vi);
		System.out.println(aberto300Vi);
		System.out.println(aberto400Vi);
		System.out.println(aberto500Vi);
		System.out.println(aberto600Vi);
		System.out.println(validadedeVi);
		System.out.println(validadeateVi);
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		if (tq1 == true) {
			String idRegistro = "73";
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
			WebElement editar = driver.findElement(
					By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			editar.click();

			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		} else if (tp1 == true) {
			String idRegistro = "29";

			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
			WebElement editar = driver.findElement(
					By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			editar.click();

			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		} else {
			String idRegistro = "19";

			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
			WebElement editar = driver.findElement(
					By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			editar.click();

			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		String empresaEd= empresa.getText();
		String estadoEd=estado.getText();
		String filiaalEd=filial.getText();
		String aberto100Ed=aberto100E.getText();
		String aberto200Ed=aberto200E.getText();
		String aberto300Ed=aberto300E.getText();
		String aberto400Ed=aberto400E.getText();
		String aberto500Ed=aberto500E.getText();
		String aberto600Ed=aberto600E.getText();
		String validadedeEd=validadede.getAttribute("value");
		String validadeateEd=validadeate.getAttribute("value");
		
		System.out.println("Dados do menu Editar");
		System.out.println("-------------------------------------------------------");
		System.out.println(empresaEd);
		System.out.println(estadoEd);
		System.out.println(filiaalEd);
		System.out.println(aberto100Ed);
		System.out.println(aberto200Ed);
		System.out.println(aberto300Ed);
		System.out.println(aberto400Ed);
		System.out.println(aberto500Ed);
		System.out.println(aberto600Ed);
		System.out.println(validadedeEd);
		System.out.println(validadeateEd);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(empresaEd.contains(empresaVi));
		sucesso.add(estadoEd.contains(estadoVi));
		sucesso.add(filiaalEd.contains(filiaalVi));
		sucesso.add(aberto100Vi.contains(aberto100Ed));
		sucesso.add(aberto200Vi.contains(aberto200Ed));
		sucesso.add(aberto300Ed.contains(aberto300Vi));
		sucesso.add(aberto400Ed.contains(aberto400Vi));
		sucesso.add(aberto500Ed.contains(aberto500Vi));
		sucesso.add(aberto600Ed.contains(aberto600Vi));
		sucesso.add(validadedeEd.contains(validadedeVi));
		sucesso.add(validadeateEd.contains(validadeateVi));
		System.out.println(sucesso);
		return sucesso;

	}

}
