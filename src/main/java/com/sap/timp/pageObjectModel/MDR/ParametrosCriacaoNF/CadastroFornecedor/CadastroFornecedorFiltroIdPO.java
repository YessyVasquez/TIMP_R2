
package com.sap.timp.pageObjectModel.MDR.ParametrosCriacaoNF.CadastroFornecedor;

import java.util.ArrayList;

import org.apache.maven.profiles.AlwaysOnActivation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.NewSessionPayload;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class CadastroFornecedorFiltroIdPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Parâmetros de Criação de Nota Fiscal\"]")
	public WebElement parametrosCriacaoNotaFiscal;

	@FindBy(xpath = "//span[text()=\"Cadastro de Fornecedor\"]")
	public WebElement cadastroFornecedor;

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;

	@FindBy(xpath = "//div[@id=\"company\"]/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Data Inicial\")]")
	public WebElement dataInicial;
	
	@FindBy(xpath = "")
	public WebElement dataFinal;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement empresaO;

	@FindBy(xpath = "//button/span[text()=\"Aplicar filtros\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	

	public CadastroFornecedorFiltroIdPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> filtroEmpresa() {

		sleep(2000);
		parametrosCriacaoNotaFiscal.click();
		sleep(2000);
		cadastroFornecedor.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		empresa.click();
		sleep(1000);
		String empresaText = empresaO.getText();
		empresaO.click();
		sleep(1000);
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroEmpresa = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[4]/div"))
					.getText();
			System.out.println(textFiltroEmpresa + " empresa Filtro");
			sucesso.add(empresaText.equals(textFiltroEmpresa));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;

	}

	public ArrayList<Boolean> filtroDataInicial() {

		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String dataInicialTexto = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[8]/div")).getText();
		System.out.println(dataInicialTexto + " Data Registro");
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(dataInicial);
		dataInicial.sendKeys(dataInicialTexto);
		//sleep(1000);
		//dataInicial.sendKeys(Keys.ENTER);
		sleep(1000);
		//dataInicial.sendKeys(Keys.ENTER);

		//driver.findElement(By.xpath("//body")).click();
		//sleep(1000);
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroDataInicial = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows+ "]/div[8]/div")).getText();
			System.out.println(textFiltroDataInicial + " data inicial");
		
			sucesso.add(dataInicialTexto.equals(textFiltroDataInicial));
			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;

	}
	
	public ArrayList<Boolean> filtroDataFinal() {

		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("CadastroFornecedor");
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String dataFinalTexto = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[9]/div")).getText();
	
		System.out.println(dataFinalTexto + " Data Registro");
		
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		dataFinal.sendKeys(dataFinalTexto);
		sleep(1000);
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroDataFinal = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows+ "]/div[9]/div")).getText();
			System.out.println(textFiltroDataFinal + " data final");
		
			sucesso.add(dataFinalTexto.equals(textFiltroDataFinal));
			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
		
}


