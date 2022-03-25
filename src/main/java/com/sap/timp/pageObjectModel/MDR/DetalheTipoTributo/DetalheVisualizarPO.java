package com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DetalheVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Detalhes Do Tipo De Tributo\"]")
	public WebElement detalhe;

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	public WebElement menu;

	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//li/span[text()=\"Visualizar\"]")
	public WebElement visualizar;

	@FindBy(xpath = "//span[@id=\"codEmpresa\"]")
	public WebElement codigoempresavi;
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributovi;
	
	@FindBy(xpath = "//span[@id=\"taxType\"]")
	public WebElement tipoimpostovi;
	
	@FindBy(xpath = "//span[@id=\"codDetalheTipoTributo\"]")
	public WebElement codigovi;
	
	@FindBy(xpath = "//span[@id=\"descricao\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//span[@id=\"dataIniVigencia\"]")
	public WebElement datavi;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000\"]")
	public WebElement codigoempresaed;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div/input")
	public WebElement tributoed;
	
	@FindBy(xpath = "//div[@id=\"taxType\"]/div/div/div/input")
	public WebElement tipoimpostoed;
	
	@FindBy(xpath = "//div[@id=\"codDetalheTipoTributo\"]/div/div/input")
	public WebElement codigoed;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Descrição\"]")
	public WebElement descricaoed;
	
	@FindBy(xpath = "//div[@id=\"validity\"]/div/div/input")
	public WebElement dataed;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public DetalheVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		detalhe.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("DetalheTipoTributo");

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
		
				String codigoempresavisualizar = codigoempresavi.getText();
				String tributovisualizar = tributovi.getText();
				String tipoimpostovisualizar = tipoimpostovi.getText();
				String codigovisualizar = codigovi.getText();
				String descricaovisualizar = descricaovi.getText();
				String datavisualizar = datavi.getText();
				
				System.out.println(codigoempresavisualizar);
				System.out.println(tributovisualizar);
				System.out.println(tipoimpostovisualizar);
				System.out.println(codigovisualizar);
				System.out.println(descricaovisualizar);
				System.out.println(datavisualizar);
			
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
				String idRegistro1 = idObter("DetalheTipoTributo");
				
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
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				sleep(2000);
				attributeToBeXpath("//div[@id=\"tax\"]/div", "class", "base-select required");
				sleep(1000);
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				sleep(2000);
				String codigoempresaeditar=codigoempresaed.getText();
				String tributoeditar=tributoed.getAttribute("value");
				String tipoimpostoeditar=tipoimpostoed.getAttribute("value");
				String codigoeditar=codigoed.getAttribute("value");
				String descricaoeditar = descricaoed.getAttribute("value");
				String dataeditar=dataed.getAttribute("value");
			
				System.out.println( codigoempresaeditar);
				System.out.println(tributoeditar);
				System.out.println(tipoimpostoeditar);
				System.out.println( codigoeditar);
				System.out.println(descricaoeditar);
				System.out.println(dataeditar);
			
				
				ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
				sucesso.add(codigoempresavisualizar.equals(codigoempresaeditar));
				sucesso.add(tributovisualizar.equals(tributoeditar));
				sucesso.add(tipoimpostovisualizar.equals(tipoimpostoeditar));
				sucesso.add(codigovisualizar.equals(codigoeditar));
				sucesso.add(descricaovisualizar.equals(descricaoeditar));
				sucesso.add(datavisualizar.equals(dataeditar));
		//String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");

		return sucesso;

	}

}
