package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.ClassificaçaoDeContribuintesDoIPI;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ClassificaçaoDeContribuintesDoIPIFiltrosAvançadosPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"4.5.5 Classificação de Contribuintes do IPI\"]")
	public WebElement classificacaodecontribuintes;
	
	
	@FindBy(xpath = "//span[text()=\"Novo Classificação de contribuintes do IPI\"]")
	public WebElement novoclassificacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o código do Tipo de atividade\"]")
	public WebElement tipodeatividade;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Código de Valores Declaratórios\"]")
	public WebElement codigodevalores;
	
	
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Data de Inicio de Vigência\"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//*[@id=\"advanced-filters-btn\"]/span[2]")
	public WebElement filtrosavancados;
	
	@FindBy(xpath = "//div[@class=\"library-advanced-filter-item\"][1]/div/div/div/div[2]")
	public WebElement filtrousuario;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]/div/label/span")
	public WebElement opcaofiltrousuario;
	
	@FindBy(xpath = " Filtrar por Data Inicial")
	public WebElement filtrarpordata;
	
	
	public ClassificaçaoDeContribuintesDoIPIFiltrosAvançadosPO() {

		PageFactory.initElements(driver, this);
	}	
	
	
	
	
	public ArrayList<Boolean> filtros() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		classificacaodecontribuintes.click();
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtrosavancados.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtrousuario.click();
		
		opcaofiltrousuario.click();
		
		sleep(2000);
		dobleClickElement(filtrousuario);
		//filtrousuario.sendKeys(Keys.ESCAPE);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		for (int i = 0; i < rows; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[8]/div")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String tipoatividade = "";
		j=1;
		for (int i = 0; i < rows; i++) {
			tipoatividade = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[8]/div")).getText();
			sucesso.add(data.get(0).equals(tipoatividade));
			j=j+1;
		}
		
		return sucesso;
		
		
	}
	
	
	
	
	
	

}
