package com.sap.timp.pageObjectModel.TBD.Configuracao.RangeDeNumeracao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RangeDeNumeracaoVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Configuração de TBD\"]")
	public WebElement configuracao;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Range de Numeração\"]")
	public WebElement configuracaodereangedenumeracao;
	
	@FindBy(xpath = "//span[text()=\"Nova Conta Default por Tributo\"]")
	public WebElement novacontadefaultportributo;

	
	
	
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
	
	

	@FindBy(xpath = "//span[@id=\"numericalRange\"]")
	public WebElement intervalonumericovi;
	@FindBy(xpath = "//span[@id=\"rangeFrom\"]")
	public WebElement rangedevi;
	@FindBy(xpath = "//span[@id=\"rangeUntil\"]")
	public WebElement rangeatevi;
	@FindBy(xpath = "//span[@id=\"currentNumbering\"]")
	public WebElement numeracaoatualvi;

	@FindBy(xpath = "//span[@id=\"validFrom\"]")
	public WebElement validadedevi;
	@FindBy(xpath = "//span[@id=\"validTo\"]")
	public WebElement validadeatevi;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Intervalo Numérico\"]")
	public WebElement intervalonumerico;
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Range De\"]")
	public WebElement rangede;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Range Até\"]")
	public WebElement rangeate;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Numeração Atual\"]")
	public WebElement numeracaoatual;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement validadede;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade Até\"]")
	public WebElement validadeate;
	

	
	
	public RangeDeNumeracaoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		configuracao.click();
		sleep(2000);
		configuracaodereangedenumeracao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter1();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String intervalonumericovisualizar = intervalonumericovi.getText();
		String rangedevisualizar = rangedevi.getText();
		String rangeatevisualizar = rangeatevi.getText();
		String numeracaoatualvisualizar=numeracaoatualvi.getText();
		String validadedevisualizar = validadedevi.getText();
		String validadeatevisualizar = validadeatevi.getText();
		

	
		System.out.println(intervalonumericovisualizar);
		System.out.println(rangedevisualizar);
		System.out.println(rangeatevisualizar);
		System.out.println(numeracaoatualvisualizar);
		System.out.println(validadedevisualizar);
		System.out.println(validadeatevisualizar);
		
		
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
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
	    sleep(2000);
	    
	    
		String intervalonumericoeditar = intervalonumerico.getAttribute("value");
		String rangedeeditar = rangede.getAttribute("value");
		String rangeateeditar = rangeate.getAttribute("value");
		String numeracaoatualeditar=numeracaoatual.getAttribute("value");
		String validadedeeditar = validadede.getAttribute("value");
		String validadeateeditar = validadeate.getAttribute("value");
		
	

		
		
		
		System.out.println(intervalonumericoeditar);
		System.out.println(rangedeeditar);
		System.out.println(rangeateeditar);
		System.out.println(numeracaoatualeditar);
		System.out.println(validadedeeditar);
		System.out.println(validadeateeditar);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(intervalonumericoeditar.contains(intervalonumericovisualizar));
		sucesso.add(rangedeeditar.contains(rangedevisualizar));
		sucesso.add(rangeateeditar.contains(rangeatevisualizar));
		sucesso.add(numeracaoatualeditar.contains(numeracaoatualvisualizar));
		sucesso.add(validadedeeditar.contains(validadedevisualizar));
		sucesso.add(validadeateeditar.contains(validadeatevisualizar));
		

		
		System.out.println(sucesso);
		
		
		return sucesso;
	
			
	}

}
