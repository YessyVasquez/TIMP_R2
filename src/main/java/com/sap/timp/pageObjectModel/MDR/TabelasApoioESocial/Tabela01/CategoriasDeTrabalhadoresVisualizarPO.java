package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela01;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CategoriasDeTrabalhadoresVisualizarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 01 - Categorías de Trabalhadores\"]")
	public WebElement tabela01;
	
	@FindBy(xpath = "//span[text()=\"Nova Categoría de Trabalhador\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Grupo\"]")
	public WebElement grupo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código\"]")
	public WebElement codigo;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Descrição\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement datainicio;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//td[@id=\"group\"]/span")
	public WebElement grupovi;
	
	@FindBy(xpath = "//td[@id=\"code\"]/span")
	public WebElement codigovi;
	
	@FindBy(xpath = "//td[@id=\"description\"]/span")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//td[@id=\"effectiveDateFrom\"]/span")
	public WebElement datavi;
	
	public CategoriasDeTrabalhadoresVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	
public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		tabelaApoio.click();
		sleep(2000);
		
		tabela01.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro =  idObter("CategoriasDeTrabalhadores");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//visualizar
		String grupovisualizar = grupovi.getText();
		String codigovisualizar =codigovi.getText();
		String descricaovisualizar =descricaovi.getText();
		String datavisualizar =datavi.getText();
		
		
		
		
		System.out.println(grupovisualizar);
		System.out.println(codigovisualizar);
		System.out.println(descricaovisualizar);
		System.out.println(datavisualizar);
		
		
		
		
		
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 =  idObter("CategoriasDeTrabalhadores");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		waitExpectElement(grupo);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
			
		//editar
		
		
		String grupoeditar=grupo.getAttribute("value");
		String codigoeditar = codigo.getAttribute("value");
		String descricaoeditar=descricao.getAttribute("value");
		String dataeditar = datainicio.getAttribute("value");
		
		System.out.println( grupoeditar);
		System.out.println(codigoeditar);
		System.out.println( descricaoeditar);
		System.out.println(dataeditar);
		
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(grupoeditar.equals(grupovisualizar));
		sucesso.add(codigoeditar.equals(codigovisualizar));
		sucesso.add(descricaoeditar.equals(descricaovisualizar));
		sucesso.add(dataeditar.equals(datavisualizar));
		return sucesso;	

	
	}	


}
