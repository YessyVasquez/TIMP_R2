package com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ParametrosParaTP;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParametrosParaTPFiltroIDPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Preço de Transferência\"]")
	public WebElement precodetransferencia;
	
	@FindBy(xpath = "//span[text()=\"Parâmetros para TP\"]")
	public WebElement parametrosparatp;

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")
	public WebElement id;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;

	public ParametrosParaTPFiltroIDPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean filtroID() {

		
		sleep(2000);
		precodetransferencia.click();
		sleep(2000);
		parametrosparatp.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		String idRegistro = id.getText();
		System.out.println(idRegistro + " Id Registro");
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idBusqueda = id.getText();
		System.out.println(idBusqueda + " Id Busqueda");

		boolean sucesso = idRegistro.equals(idBusqueda);
		System.out.println(sucesso);

		return sucesso;

	}
	

	public ArrayList<Boolean> filtroCodCliente() {

		
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		
		
		String codCliente = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[5]/div")).getText();

		pesquisar.sendKeys(codCliente);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textoCodCliente = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[5]/div"))
					.getText();
			System.out.println(textoCodCliente + " empresa Filtro");
			sucesso.add(codCliente.equals(textoCodCliente));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;

	}
}
