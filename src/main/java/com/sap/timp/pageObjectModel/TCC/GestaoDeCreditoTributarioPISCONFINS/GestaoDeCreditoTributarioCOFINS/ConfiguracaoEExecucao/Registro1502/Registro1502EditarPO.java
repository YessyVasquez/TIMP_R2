package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.GestaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.Registro1502;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class Registro1502EditarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário COFINS\"]")
	public WebElement gestaocreditocofins;

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[2]/ul/li[1]/div/span[2]")
	public WebElement configuracaoEExecucao;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-register1502\"]")
	public WebElement registro1502;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Origem do Crédito\"]")
	public WebElement origem1;

	@FindBy(xpath = "//div[@id=\"origCred\"]/div/div[1]/div[2]")
	public WebElement origem;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[2]")
	public WebElement filial;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement filialO;

	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div/label/span")
	public WebElement filialO1;

	@FindBy(xpath = "//li[@id][2]")
	public WebElement opcao;

	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcao1;

	@FindBy(xpath = "//li[@id][3]")
	public WebElement opcaotp1;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar2;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;

	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-SP\"]")
	public WebElement uf1;

	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[2]")
	public WebElement uftp1;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-BA\"]")
	public WebElement uftp12;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-3000_BA_0031\"]")
	public WebElement filialtp1;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-RJ\"]")
	public WebElement uftc2;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000_SP_0001\"]")
	public WebElement filial1;
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement empresa1;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-1010_SP_0003\"]")
	public WebElement filial2;

	@FindBy(xpath = "//div[@id=\"componentToSearchId-1000_SP_0014\"]")
	public WebElement filialtc2;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-1100_RJ_0001\"]")
	public WebElement filialtc21;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000_SP_0002\"]")
	public WebElement filialnova;

	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000_SP_0016\"]")
	public WebElement filialnovatc2;
	public Registro1502EditarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean editar() {

		String url = driver.getCurrentUrl();

		boolean tc2 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		if (url.contains("tc2")) {
			tc2 = true;
		} else if (url.contains("tp1")) {
			tp1 = true;
		} else {
			tq1 = true;
		}

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		gestaocreditocofins.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registro1502.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("GestaoCréditoTributárioCOFINSRegistro1502");
		System.out.println("ID Registro: " + idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(2000);
		if (tp1 == true || tq1 == true) {

			waitExpectElement(uf1);
			sleep(2000);
			waitExpectElement(filial1);
			filial.click();
			sleep(1000);
			filialO.click();
			sleep(2000);
			filialO1.click();
			sleep(1000);
			closeSelectTypeCheckbox(filial);
			sleep(2000);
			String filialtexto = filialnova.getText();
			System.out.println("Filial antes de atualizar:" + filialtexto);

			gravar.click();
			sleep(2000);
			waitExpectElement(sim);
			sim.click();
			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			driver.navigate().refresh();

			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			waitExpectElement(uf1);
			sleep(2000);
			waitExpectElement(filialnova);
			sleep(2000);

			String filialatualizada = filialnova.getText();
			System.out.println("Filial pós atualizar:" + filialatualizada);
			boolean sucesso = false;
			sucesso = filialatualizada.contains(filialtexto);
			
			filial.click();
			sleep(1000);
			filialO1.click();
			sleep(2000);
			filialO.click();
			sleep(1000);
			closeSelectTypeCheckbox(filial);
			sleep(2000);
			
			gravar.click();
			sleep(2000);
			waitExpectElement(sim);
			sim.click();
			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			System.out.println(sucesso);

			return sucesso;

		} else {

			waitExpectElement(uf1);
			sleep(2000);
			waitExpectElement(filialtc2);
			filial.click();
			sleep(1000);
			filialO.click();
			sleep(1000);
			filialO1.click();
			sleep(1000);
			closeSelectTypeCheckbox(filial);
			sleep(1000);
			String filialtexto = filialnovatc2.getText();
			System.out.println("Filial antes de atualizar:" + filialtexto);

			gravar.click();
			sleep(2000);
			waitExpectElement(sim);
			sim.click();
			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			driver.navigate().refresh();

			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			waitExpectElement(uf1);
			sleep(2000);
			waitExpectElement(filialnovatc2);
			sleep(2000);

			String filialatualizada = filialnovatc2.getText();
			System.out.println("filial pós atualizar:" + filialatualizada);
			boolean sucesso = false;
			sucesso = filialatualizada.contains(filialtexto);
			
			filial.click();
			sleep(1000);
			filialO1.click();
			sleep(2000);
			filialO.click();
			sleep(1000);
			closeSelectTypeCheckbox(filial);
			sleep(2000);
			
			gravar.click();
			sleep(2000);
			waitExpectElement(sim);
			sim.click();
			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			System.out.println(sucesso);

			return sucesso;

		}
	}

}
