package com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorreçao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class HierarquiaDeCenariosDeCorreçaoVisualizarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Hierarquias de Cenários de Correção\"]")
	public WebElement hiearquiasdecenariosdecorrecao;
	
	
	@FindBy(xpath = "//span[text()=\"Nova Hierarquia de Cenários de Correção\"]")
	public WebElement novahierarquia;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Objeto de Correção\"]")
	public WebElement objetodecorrecao;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]")
	public WebElement opcaoobjetodecorrecao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher a descrição do Código da Situação Tributária referente ao PIS/PASEP e COFINS\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código de Hierarquia\"]")
	public WebElement codigohierarquia;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement datadeiniciodevigencia;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Cenário de Correção\"]")
	public WebElement adicionacenariodecorreçao;
	
	@FindBy(xpath = "//div[@class=\"field element-2\" and @id=\"scenario-2\"]/div/div/div/div[2]")
	public WebElement cenariodecorrecao;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]")
	public WebElement opcaocenariodecorrecao;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributovi;
	
	@FindBy(xpath = "//span[@id=\"code\"]")
	public WebElement codigohierarquiavi;
	
	@FindBy(xpath = "//span[@id=\"valid-from\"]")
	public WebElement datavi;
	
	@FindBy(xpath = "//span[@id=\"correction-object\"]")
	public WebElement objetocorrecaovi;
	public HierarquiaDeCenariosDeCorreçaoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		hiearquiasdecenariosdecorrecao.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("HierarquiaDeCenariosDeCorreçao");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String hierarquiavisualizar = codigohierarquiavi.getText();
		String tributovisualizar =tributovi.getText();
		String datavisualizar =datavi.getText();
		String objetocorrecaovisualizar = objetocorrecaovi.getText();
		
		
		
		System.out.println(hierarquiavisualizar);
		System.out.println(tributovisualizar);
		System.out.println(datavisualizar);
		System.out.println(objetocorrecaovisualizar);
		
		
		
		
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("HierarquiaDeCenariosDeCorreçao");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
			
		//editar
		
		
		String tributoeditar=tributo.getAttribute("value");
		String objetocorrecaoeditar = objetodecorrecao.getAttribute("value");
		String hierarquiaeditar=codigohierarquia.getAttribute("value");
		String dataeditar = datavigencia.getAttribute("value");
		
		System.out.println( tributoeditar);
		System.out.println(objetocorrecaoeditar);
		System.out.println( hierarquiaeditar);
		System.out.println(dataeditar);
	
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(tributoeditar.equals(tributovisualizar));
		sucesso.add(objetocorrecaoeditar.equals(objetocorrecaovisualizar));
		sucesso.add(hierarquiaeditar.equals(hierarquiavisualizar));
		sucesso.add(dataeditar.equals(datavisualizar));
		
		System.out.println(sucesso);
		return sucesso;	
		/*
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter1();
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		
		String sucesso = driver.findElement(By.xpath("//div[@class=\"baseTabs-view-wrapper\"]")).getAttribute("class");
		//System.out.println(sucesso);	
		return sucesso;	
		*/
	
	}

}
