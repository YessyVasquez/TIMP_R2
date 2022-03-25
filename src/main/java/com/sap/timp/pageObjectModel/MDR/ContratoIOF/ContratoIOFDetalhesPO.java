package com.sap.timp.pageObjectModel.MDR.ContratoIOF;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ContratoIOFDetalhesPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Contrato IOF \"]")
	public WebElement contratoiof;
	
	@FindBy(xpath = "//span[text()=\"Novo Código de Crédito\"]")
	public WebElement novocodigo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement contratoNoD;
	
	@FindBy(xpath = "//span[@id=\"contractNumber\"]")
	public WebElement contratoNoV;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[8]/div/div")
	public WebElement contratoReD;
	
	@FindBy(xpath = "//span[@id=\"revenueCode\"]")
	public WebElement contratoReV;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement tipoPessD;
	
	@FindBy(xpath = "//span[@id=\"personType\"]")
	public WebElement tipoPessV;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[9]/div/div")
	public WebElement descripcionD;
	
	@FindBy(xpath = "//span[@id=\"docDescription\"]")
	public WebElement descripcionV;
	
	
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
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//span[@id=\"TAX\"]")
	public WebElement tributovi;
	
	@FindBy(xpath = "//span[@id=\"creditCode\"]")
	public WebElement codigovi;

	@FindBy(xpath = "//span[@id=\"creditCodeDescription\"]")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//span[@id=\"validityOf\"]")
	public WebElement datavi;
	
	public ContratoIOFDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		contratoiof.click();
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("ContratoIOF");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//detalhes
		String contratoNDText = contratoNoD.getText();
		String codigoResDText = contratoReD.getText();
		String tipoPessDText = tipoPessD.getText();
		String descripcionDText = descripcionD.getText();
		
		
		System.out.println(contratoNDText);
		System.out.println(codigoResDText);
		System.out.println(tipoPessDText);
		System.out.println(descripcionDText);
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(siguiente);
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("ContratoIOF");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//visualizar
		//attributeToBeXpath("//table[@class=\"edit\"]", "class", "edit");
		//sleep(2000);
		waitExpectElement(contratoNoV);
		sleep(2000);
		
		String contratoNVText = contratoNoV.getText();
		String codigoResVText = contratoReV.getText();
		String tipoPessVText = tipoPessV.getText();
		String descripcionVText = descripcionV.getText();
		
		
		System.out.println(contratoNVText);
		System.out.println(codigoResVText);
		System.out.println(tipoPessVText);
		System.out.println(descripcionVText);
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(contratoNVText.equals(contratoNDText));
		sucesso.add(codigoResVText.equals(codigoResDText));
		sucesso.add(tipoPessVText.equals(tipoPessDText));
		sucesso.add(descripcionVText.contains(descripcionDText));
		System.out.println(sucesso);
		return sucesso;
	}

}
