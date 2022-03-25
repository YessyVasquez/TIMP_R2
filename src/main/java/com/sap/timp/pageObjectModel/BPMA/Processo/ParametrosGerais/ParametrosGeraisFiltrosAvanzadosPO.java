package com.sap.timp.pageObjectModel.BPMA.Processo.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ParametrosGeraisFiltrosAvanzadosPO extends TestBaseKenssy {
	@FindBy(xpath = "//span[text()=\"Processo de negócio\"]")
	public WebElement procesoNegocio;
	
	@FindBy(xpath = "//span[text()=\"Processos de Negocio\"]")
	public WebElement procesos;
	
	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;
	
	@FindBy(xpath = "//button/span[text()=\"Aplicar filtros\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	//FILTROS
	@FindBy(xpath = "//div[@id=\"creationUser\"]/div/div/div[2]")
	public WebElement usuarioCriacao;
	@FindBy(xpath = "//div[@id=\"modificationUser\"]/div/div/div[2]")
	public WebElement usuarioModificao;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][1]")
	public WebElement opc;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and string()][2]")
	public WebElement opc1;
	@FindBy(xpath = "//*[@id=\"creationDate\"]/div/div[1]/input")
	public WebElement filtroDataCriacao;
	@FindBy(xpath = "//*[@id=\"modificationDate\"]/div/div[1]/input")
	public WebElement filtroDataModificao;
	
	@FindBy(xpath="//body")
	public WebElement clickFuera;
	
	public ParametrosGeraisFiltrosAvanzadosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtrosUsuarioCriacao() {
		sleep(2000);
		procesos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		usuarioCriacao.click();
		sleep(1000);
		String usuarioCriacaoText = opc.getText();
		opc.click();
		sleep(1000);
		//String empresaText = opcEmpresa.getText();
		System.out.println("USUARIO CRIACAO: "+ usuarioCriacaoText);
		

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroUsuarioCriacao = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[9]/div"))
					.getText();
			System.out.println(textFiltroUsuarioCriacao + " Usuario Criacao Filtro");
			sucesso.add(usuarioCriacaoText.contains(textFiltroUsuarioCriacao));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
		
	public ArrayList<Boolean> filtrosUsuarioModificao() {
		
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		usuarioModificao.click();
		sleep(1000);
		String usuarioModificaoText = opc1.getText();
		usuarioModificaoText = usuarioModificaoText.replace(" ","");
		opc1.click();
		sleep(1000);
		//String empresaText = opcEmpresa.getText();
		System.out.println("USUARIO MODIFICAO: "+ usuarioModificaoText);
		

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroUsuarioModificao = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[11]/div"))
					.getText();
			System.out.println(textFiltroUsuarioModificao + " Usuario Modificado Filtro");
			sucesso.add(usuarioModificaoText.contains(textFiltroUsuarioModificao));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}

	public ArrayList<Boolean> filtroDataCriacao() {
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
//		sleep(2000);
//		procesos.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		filtros.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		

		
		String dataV = dataanterior();
		filtroDataCriacao.sendKeys(fechaActual());
		sleep(1000);
		
		String dataText = filtroDataCriacao.getAttribute("value");
		System.out.println("filtro a buscar fecha: "+dataText);
		filtroDataCriacao.sendKeys(Keys.ENTER);
		sleep(2000);
		//opcEmpresa.click();
		clickFuera.click();
		sleep(2000);
		//aplicar.click();
//		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroData = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[10]/div"))
					.getText();
			System.out.println(textFiltroData + " data Filtro");
			sucesso.add(dataText.equals(textFiltroData));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}

	public ArrayList<Boolean> filtroDataModificao() {
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		String dataV = dataanterior();
		filtroDataModificao.sendKeys(fechaActual());
		sleep(1000);
		
		String dataText = filtroDataModificao.getAttribute("value");
		System.out.println("filtro a buscar fecha: "+dataText);
		//opcEmpresa.click();
		filtroDataModificao.sendKeys(Keys.ENTER);
		sleep(2000);
		//opcEmpresa.click();
		clickFuera.click();
		sleep(2000);
//		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroData = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[12]/div"))
					.getText();
			System.out.println(textFiltroData + " data Filtro");
			sucesso.add(dataText.contains(textFiltroData));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}

		
}
