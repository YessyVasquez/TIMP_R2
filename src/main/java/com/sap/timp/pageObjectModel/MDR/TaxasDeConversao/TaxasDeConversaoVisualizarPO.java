package com.sap.timp.pageObjectModel.MDR.TaxasDeConversao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TaxasDeConversaoVisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Taxas de Conversão \"]")
	public WebElement taxasdeconversao;
	
	@FindBy(xpath = "//span[text()=\"Nova Taxa de Conversão\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Tipo de Taxa de Atualização\"]")
	public WebElement tipo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher a descrição do Cadastro de Tipo de Taxa de Atualização\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inclusão \"]")
	public WebElement datainclusao;
	
	@FindBy(xpath = "//input[@placeholder=\"Prencher a Taxa\"]")
	public WebElement taxa;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Início de Vigência \"]")
	public WebElement datainicio;
	
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
	
	@FindBy(xpath = "//div[@class=\" toast-inner\"]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//span[@id=\"rateType\"]")
	public WebElement tipovi;
	
	@FindBy(xpath = "//span[@id=\"rateDescription\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inclusão \"]")
	public WebElement datainclusaovi;
	
	@FindBy(xpath = "//span[@id=\"rate\"]")
	public WebElement taxavi;
	
	@FindBy(xpath = "//span[@id=\"validFrom\"]")
	public WebElement datainiciovi;
	
	public TaxasDeConversaoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
public ArrayList<Boolean> visualizar() {
		
		
		sleep(2000);
		
		taxasdeconversao.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("taxasdeconversao");
		
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
		String tipovisualizar = tipovi.getText();
		String descricaovisualizar =descricaovi.getText();
		String taxavisualizar =taxavi.getText();
		String datavisualizar =datainiciovi.getText();
		
		
		
		System.out.println(tipovisualizar);
		System.out.println(descricaovisualizar);
		System.out.println(taxavisualizar);
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
		//String idRegistro1 = idObter1();
		String idRegistro1 = idObter("taxasdeconversao");
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
			
		//editar
		
		
		String tipoeditar=tipo.getAttribute("value");
		String descricaoeditar = descricao.getAttribute("value");
		String taxaeditar=taxa.getAttribute("value");
		String dataeditar = datainicio.getAttribute("value");
		
		
		System.out.println( tipoeditar);
		System.out.println(descricaoeditar);
		System.out.println( taxaeditar);
		System.out.println(dataeditar);
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(tipoeditar.equals(tipovisualizar));
		sucesso.add(descricaoeditar.equals(descricaovisualizar));
		sucesso.add(taxaeditar.equals(taxavisualizar));
		sucesso.add(dataeditar.equals(datavisualizar));
		
		return sucesso;	

	
	}	

	

}
