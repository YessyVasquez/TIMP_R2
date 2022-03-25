package com.sap.timp.pageObjectModel.MDR.TabelaDeApoioECF;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class TabelaDeApoioECFVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//ul/li[contains(@identifier,\"supportParameterECF\") and @tabindex=\"0\"]")
	public WebElement tabelaecf;
	
	@FindBy(xpath = "//button[@class=\"library-toolbar-button btn trans highlighted\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tabela ECF \"]")
	public WebElement tabelaE;
	@FindBy(xpath = "//textarea[@placeholder=\"Descrição da Tabela ECF\"]")
	public WebElement descricaoTabelaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Descrição\")]")
	public WebElement descricaoE;
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Versão Leiaute \"]")
	public WebElement versaoLeiauteE;
	

	@FindBy(xpath = "//span[@id=\"table-ecf\"]")
	public WebElement tabelaV;
	@FindBy(xpath = "//span[@id=\"description-ecf\"]")
	public WebElement descricaoTabelaV;
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"idLayout\"]")
	public WebElement versaoLeiauteV;
	
	
	public TabelaDeApoioECFVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		tabelaecf.click();
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("TabelaDeApoioECF");
		
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
		waitExpectElement(tabelaV);
		sleep(2000);
		//visualizar
		
		String tabelaV1= tabelaV.getText();
		String descricaTabelaV1 = descricaoTabelaV.getText();
		String descricaoV1 = descricaoV.getText();
		String versaoLeiauteV1 = versaoLeiauteV.getText();
	
		
		
		System.out.println( tabelaV1);
		System.out.println(descricaTabelaV1);
		System.out.println(descricaoV1);
		System.out.println(versaoLeiauteV1);
	
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primeira);
		sleep(2000);
		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("TabelaDeApoioECF");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		attributoNotToBeEmptyXpath("//input[contains(@placeholder,\"Descrição\")]", "value");
		
		String tabelaE1 = tabelaE.getAttribute("value");
		String descricaoTabelaE1=descricaoTabelaE.getAttribute("value");
		String descricaoE1 = descricaoE.getAttribute("value");
		String versaoLeiauteE1=versaoLeiauteE.getAttribute("value");
		
	
		System.out.println( tabelaE1);
		System.out.println(descricaoTabelaE1);
		System.out.println(descricaoE1);
		System.out.println(versaoLeiauteE1);
	
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(tabelaV1.equals(tabelaE1));
		sucesso.add(descricaTabelaV1.equals(descricaoTabelaE1));
		sucesso.add(descricaoV1.equals(descricaoE1));
		sucesso.add(versaoLeiauteV1.equals(versaoLeiauteE1));

		return sucesso;	

	
	}	
	

}
