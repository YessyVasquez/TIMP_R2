package com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.GrupoAtividadeFiscal;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import com.sap.timp.base.TestBaseKenssy;

public class GrupoAtividadeFiltrosAvancadosPO extends TestBaseKenssy{

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Filtros Avançados\"]")
	public WebElement filtros;
	
	@FindBy(xpath = "//li[@tabindex=\"0\"]/div[@class=\"title\"]/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividades;
	
	@FindBy(xpath = "//ul[@class=\"accordion\" and @style]/li/div/span[text()=\"Grupos de Atividades Fiscais\"]")
	public WebElement gruposAtividades;
	
	@FindBy(xpath = "//div[@id=\"grupoAtividade\"]/div/div/div[2]")
	public WebElement grupo;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div[2]")
	public WebElement grupoOPC;
	
	@FindBy(xpath = "//div[@id=\"descricao\"]/div/div/div[2]")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div[2]")
	public WebElement descricaoOPC;
	
	@FindBy(xpath = "//button/span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	String Grupo = "";
	String Descricao = "";
	
	public GrupoAtividadeFiltrosAvancadosPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> filtroGrupo() {
		
		atividades.click();
		sleep(2000);
		gruposAtividades.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		filtros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		grupo.click();
		sleep(1000);
		String grupoText = grupoOPC.getText();
		grupoOPC.click();
		sleep(1000);
		closeSelectTypeCheckbox(grupo);
		//String empresaText = opcEmpresa.getText();
		System.out.println("VIENE EN EL SELECT GRUPO: "+ grupoText);
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroGrupo = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[4]/div"))
					.getText();
			System.out.println(textFiltroGrupo + " empresa Filtro");
			sucesso.add(grupoText.equals(textFiltroGrupo));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
		
	}
	
	public  ArrayList<Boolean> filtroDescricao() {
		
		sleep(2000);
		limpar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		descricao.click();
		sleep(1000);
		String descricaoText = descricaoOPC.getText();
		descricaoOPC.click();
		sleep(1000);
		closeSelectTypeCheckbox(descricao);
		//String empresaText = opcEmpresa.getText();
		System.out.println("VIENE EN EL SELECT DESCRICAO: "+ descricaoText);
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		int f = 1;
		for (int i = 0; i < rows; i++) {

			String textFiltroDescricao = driver
					.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["
							+ rows + "]/div[5]/div"))
					.getText();
			System.out.println(textFiltroDescricao + " data Filtro");
			sucesso.add(descricaoText.equals(textFiltroDescricao));

			f = f + 1;
		}
		System.out.println(sucesso);

		return sucesso;
	}
}
