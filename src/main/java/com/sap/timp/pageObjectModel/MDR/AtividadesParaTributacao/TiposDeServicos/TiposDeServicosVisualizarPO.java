package com.sap.timp.pageObjectModel.MDR.AtividadesParaTributacao.TiposDeServicos;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TiposDeServicosVisualizarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Atividades para tributação\"]")
	public WebElement atividadesparatributacao;
	
	@FindBy(xpath = "//span[text()=\"Tipos de Serviços\"]")
	public WebElement tiposdeservicos;
	
	@FindBy(xpath = "//span[text()=\"Novo Tipos de Serviços\"]")
	public WebElement novo;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código de País\"]")
	public WebElement codigopais;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Atividade para tributação\"]")
	public WebElement atividade;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Grupo Atividade de Tributação\"]")
	public WebElement grupo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição Atividade para Tributação\"]")
	public WebElement descricao;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	
	@FindBy(xpath = "//span[@id=\"countryCode\"]")
	public WebElement codigovi;
	
	@FindBy(xpath = "//span[@id=\"taxActivity\"]")
	public WebElement atividadevi;
	
	@FindBy(xpath = "//span[@id=\"groupTaxActivity\"]")
	public WebElement grupovi;
	
	@FindBy(xpath = "//span[@id=\"descriptionTaxActivity\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	public TiposDeServicosVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		atividadesparatributacao.click();
		sleep(2000);
		
		tiposdeservicos.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("TiposDeServicio");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		//visualizar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//visualizar
		
		
		String codigovisualizar = codigovi.getText();
		String atividadevisualizar = atividadevi.getText();
		String grupovisualizar = grupovi.getText();
		String descricaovisualizar = descricaovi.getText();
	
		
		
	
		System.out.println(codigovisualizar);
		System.out.println(atividadevisualizar);
		System.out.println(grupovisualizar);
		System.out.println(descricaovisualizar);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("TiposDeServicio");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//editar
		
		
		String codigoeditar=codigopais.getAttribute("value");
		String atividadeeditar = atividade.getAttribute("value");
		String grupoeditar = grupo.getAttribute("value");
		String descricaoeditar = descricao.getAttribute("value");
	
		
		System.out.println( codigoeditar);
		System.out.println(atividadeeditar);
		System.out.println(grupoeditar);
		System.out.println(descricaoeditar);
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		
		sucesso.add(codigovisualizar.equals(codigoeditar));
		sucesso.add(atividadevisualizar.equals(atividadeeditar));
		sucesso.add(grupovisualizar.equals(grupoeditar));
		sucesso.add(descricaovisualizar.equals(descricaoeditar));
	
		return sucesso;	

	
	}	

}
