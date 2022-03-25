package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.RegistroM410;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegistroM410EditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário PIS\"]")
	public WebElement apuracaocreditopis;
	

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[3]/ul/li[1]/div/span[2]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM410\"]")
	public WebElement registrom410;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Indicador de natureza da retenção na Fonte \"]")
	public WebElement indicador1;
	
	@FindBy(xpath = "//div[@id=\"indNatRet\"]/div/div[2]")
	public WebElement indicador;
	

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	

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

	
	@FindBy(xpath = "//div[@id=\"natRec\"]/div/div[2]")
	public WebElement natureza;	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Natureza da receita \"]")
	public WebElement natureza1;
	
	public RegistroM410EditarPO() {

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
		apuracaocreditopis.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registrom410.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("ApuraçãodeCréditoTributárioPISRegistroM410");
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
			sleep(2000);
			
			natureza.click();
			sleep(2000);
			opcao.click();
			sleep(2000);
			String naturezatexto = natureza1.getAttribute("value");
			System.out.println("Natureza antes de atualizar:" + naturezatexto);


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
			waitExpectElement(filial1);
			sleep(2000);

			String naturezaatualizada = natureza1.getAttribute("value");
			System.out.println(" Natureza pós atualizar:" + naturezaatualizada);
			boolean sucesso = false;
			sucesso = naturezatexto.contains(naturezaatualizada);
			
			System.out.println(sucesso);

			return sucesso;

		} else {
			
				waitExpectElement(uf1);
				sleep(2000);
				waitExpectElement(filialtc2);
				sleep(2000);

				
				natureza.click();
				sleep(2000);
				opcao.click();
				sleep(2000);
				String naturezatexto = natureza1.getAttribute("value");
				System.out.println("Natureza antes de atualizar:" + naturezatexto);


				
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
				waitExpectElement(filialtc2);
				sleep(2000);

				String naturezaatualizada = natureza1.getAttribute("value");
				System.out.println(" Natureza pós atualizar:" + naturezaatualizada);
				boolean sucesso = false;
				sucesso = naturezatexto.contains(naturezaatualizada);
				
				System.out.println(sucesso);

				return sucesso;
			
		}
	}


}
