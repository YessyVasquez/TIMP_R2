package com.sap.timp.pageObjectModel.BRE.CalculoDeTributos.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CalculoDeTributosDetalhesPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//span[text()=\"Cálculo de Tributos\"]")
	public WebElement calculodetributos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div[1]/span[2]")
	public WebElement campo1;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div[2]/span[2]")
	public WebElement campo2;
	
	@FindBy(xpath = "//div[@class=\"icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]/*/*")
	public WebElement campovi;
	
	@FindBy(xpath = "//div[@id=\"main-title\"]")
	public WebElement nomevi;
	
	@FindBy(xpath = "//div[@class=\"detail-label\"]")
	public WebElement nomede;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[3]/*/*")
	public WebElement r1;
	public CalculoDeTributosDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		calculodetributos.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	//	int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
	//	String	id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
	//	System.out.println("Ultimo registro: " + id);
		String idRegistro = idObter("CalculoDeTributoCriar");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhe = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));
		
	
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhe.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//detalhes
		String nomedetalhes = nomede.getText();
		String campo1detalhes = campo1.getText();
		String campo2detalhes = campo2.getText();
		
		System.out.println(nomedetalhes);
		System.out.println(campo1detalhes);
		System.out.println( campo2detalhes);
		
	
		
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		
		ultimapagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar

		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualização\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		//waitExpectXpath("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//visualizar
		
		waitExpectElement(campovi);
		sleep(2000);
		waitExpectElement(r1);
		sleep(2000);
		
		String nomevisualizar = nomevi.getText();
		String campovisualizar = campovi.getText();
		
		
		System.out.println(nomevisualizar);
		System.out.println(campovisualizar);
		
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(nomevisualizar.contains(nomedetalhes));
		sucesso.add(campovisualizar.contains(campo1detalhes));
		sucesso.add(campovisualizar.contains(campo2detalhes));
		
		
		System.out.println(sucesso);
	
		return sucesso;
	}


}
