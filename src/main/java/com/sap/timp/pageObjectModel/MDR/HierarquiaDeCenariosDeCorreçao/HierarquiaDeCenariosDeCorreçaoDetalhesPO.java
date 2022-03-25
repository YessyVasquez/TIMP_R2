package com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorreçao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import com.sap.timp.base.TestBaseSteven;

public class HierarquiaDeCenariosDeCorreçaoDetalhesPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Hierarquias de Cenários de Correção\"]")
	public WebElement hiearquiasdecenariosdecorrecao;
	
	
	@FindBy(xpath = "//span[text()=\"Nova Hierarquia de Cenários de Correção\"]")
	public WebElement novahierarquia;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//div[@class=\"field\" and @id=\"correction-object\"]/div/div/div/div[2]")
	public WebElement objetodecorrecao;
	
	@FindBy(xpath = "//div[@class=\"list-item\" and @id=\"option-1\"]")
	public WebElement opcaoobjetodecorrecao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher a descrição do Código da Situação Tributária referente ao PIS/PASEP e COFINS\"]")
	public WebElement descricao;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement data;
	
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
	
	@FindBy(xpath = "//div[@id=\"detail-name\"]/div")
	public WebElement codigohierarquia;
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributovi;
	
	@FindBy(xpath = "//span[@id=\"code\"]")
	public WebElement codigohierarquiavi;
	
	@FindBy(xpath = "//span[@id=\"valid-from\"]")
	public WebElement datavi;
	
	public HierarquiaDeCenariosDeCorreçaoDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
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
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);
		
		//detalhes
		
			String hierarquiadetalhes = codigohierarquia.getText();
			String tributodetalhes =tributo.getText();
			String datadetalhes =data.getText();
		
			
			System.out.println(hierarquiadetalhes);
			System.out.println(tributodetalhes);
			System.out.println(datadetalhes);
			
			
			fechar.click();
			
			
			waitExpectElement(siguiente);
			sleep(2000);
			
			siguiente.click();
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			//pega o ultimo id que foi gerado no criar
			String idRegistro1 = idObter("HierarquiaDeCenariosDeCorreçao");
			
			WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
			WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
			actionsMoveToElementElement(menu1);
			sleep(2000);
			menu1.click();
			sleep(1000);
			
			visualizar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			
			//visualizar
			
			String hierarquiavisualizar = codigohierarquiavi.getText();
			String tributovisualizar =tributovi.getText();
			String datavisualizar =datavi.getText();
		
			
			
			
			System.out.println(hierarquiavisualizar);
			System.out.println(tributovisualizar);
			System.out.println(datavisualizar);
			
			
			
			
			
			ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
			sucesso.add(hierarquiavisualizar.equals(hierarquiadetalhes));
			sucesso.add(tributovisualizar.equals(tributodetalhes));
			sucesso.add(datavisualizar.equals(datadetalhes));
			
			System.out.println(sucesso);
			return sucesso;
		/*
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter1();
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		String sucesso = driver.findElement(By.xpath("//table[@class=\"edit\"]")).getAttribute("class");
		System.out.println(sucesso);	
		return sucesso;	
		*/
	}
	

}
