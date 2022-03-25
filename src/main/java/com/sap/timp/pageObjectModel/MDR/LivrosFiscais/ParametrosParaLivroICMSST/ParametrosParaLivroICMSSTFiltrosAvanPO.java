package com.sap.timp.pageObjectModel.MDR.LivrosFiscais.ParametrosParaLivroICMSST;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ParametrosParaLivroICMSSTFiltrosAvanPO extends TestBaseKenssy {
	@FindBy(xpath = "//span[text()=\"Livros Fiscais\"]")
	public WebElement livrosfiscais;
	
	@FindBy(xpath = "//span[text()=\"Parâmetros para Livro ICMS ST\"]")
	public WebElement parametrosparalivroicmsst;
	
	
	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;
	
	@FindBy(xpath = "//button/span[text()=\"Aplicar filtros\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	//FILTROS
	@FindBy(xpath = "//div[@id=\"created-by\"]/div/div/div/div[2]")
	public WebElement filtroUsuarioCriacao;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div[2]")
	public WebElement opc;
	
	@FindBy(xpath = "//*[@id=\"creation-date\"]/div/div[1]/input")
	public WebElement filtroDataCriacao;
	
	@FindBy(xpath = "//div[@id=\"modified-by\"]/div/div/div/div[2]")
	public WebElement filtroUsuarioModifica;
	
	@FindBy(xpath = "//*[@id=\"modification-date\"]/div/div[1]/input")
	public WebElement filtroDataModificao;
	
	@FindBy(xpath = "//div[(@tabindex=\"0\" and @class=\"date\") or (@tabindex=\"0\" and @class=\"date weekend today\")]")
	public WebElement fechita;
	
	@FindBy(xpath = "//html/body/div[4]/div[2]/div[3]/div[2]/button[2]")
	public WebElement aceptar;

	
	@FindBy(xpath="//body")
	public WebElement clickFuera;
	
	
	public ParametrosParaLivroICMSSTFiltrosAvanPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtroUsuarioCriacao() {
		sleep(2000);
		livrosfiscais.click();
		sleep(2000);
		
		parametrosparalivroicmsst.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		
		filtroUsuarioCriacao.click();
		sleep(2000);
		opc.click();
		sleep(2000);
		String usuarioCriacaoText = opc.getText();
		System.out.println("VIENE EN EL SELECT: "+ usuarioCriacaoText);
		
		
		clickFuera.click();
		sleep(1000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroUsuarioCriacao = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[11]/div"))
					.getText();
			System.out.println(textFiltroUsuarioCriacao + " empresa Filtro");
			sucesso.add(usuarioCriacaoText.equals(textFiltroUsuarioCriacao));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
		
	}
	
	public ArrayList<Boolean> filtroDataCriacao() {
//		sleep(2000);
//		livrosfiscais.click();
//		sleep(2000);
//		
//		parametrosparalivroicmsst.click();
//		
//		sleep(2000);
//		
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		filtros.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		filtroDataCriacao.click();
		sleep(2000);
		fechita.click();
		sleep(2000);
		aceptar.click();
		sleep(2000);
		
		
		//filtroDataCriacao.sendKeys("02/11/2020");
		String dataText = filtroDataCriacao.getAttribute("value");
		System.out.println("data criacao"+dataText);
		String[] arrayFecha = dataText.split("-");
		System.out.println("");
		System.out.println("Array Fecha: "+arrayFecha[0]);
		System.out.println("");
		//opcEmpresa.click();
		sleep(2000);
		//aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroDataCriacao = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[12]/div"))
					.getText();
			System.out.println(textFiltroDataCriacao + " data criacao Filtro");
			sucesso.add(textFiltroDataCriacao.contains(dataText));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
		
	}
	
	public ArrayList<Boolean> filtroUsuarioModificao() {
//		sleep(2000);
//		livrosfiscais.click();
//		sleep(2000);
//		
//		parametrosparalivroicmsst.click();
//		
//		sleep(2000);
//		
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		filtros.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtroUsuarioModifica.click();
		sleep(2000);
		opc.click();
		sleep(2000);
		String usuarioModificaoText = opc.getText();
		System.out.println("VIENE EN EL SELECT: "+ usuarioModificaoText);
		
		
		clickFuera.click();
		sleep(1000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroUsuarioModificao = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[13]/div"))
					.getText();
			System.out.println(textFiltroUsuarioModificao + " empresa Filtro");
			sucesso.add(usuarioModificaoText.equals(textFiltroUsuarioModificao));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
		
	}
	
	
	
	public ArrayList<Boolean> filtroDataModificao() {
//		sleep(2000);
//		livrosfiscais.click();
//		sleep(2000);
//		
//		parametrosparalivroicmsst.click();
//		
//		sleep(2000);
//		
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
//		filtros.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		filtroDataModificao.click();
		sleep(2000);
		fechita.click();
		sleep(2000);
		aceptar.click();
		sleep(2000);
		//filtroDataCriacao.sendKeys("02/11/2020");
		String dataText = filtroDataModificao.getAttribute("value");
		System.out.println("data criacao"+dataText);
		//opcEmpresa.click();
		sleep(2000);
		//aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroDataCriacao = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[12]/div"))
					.getText();
			System.out.println(textFiltroDataCriacao + " data criacao Filtro");
			sucesso.add(dataText.equals(textFiltroDataCriacao));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
		
	}
	
	
	
	
}
