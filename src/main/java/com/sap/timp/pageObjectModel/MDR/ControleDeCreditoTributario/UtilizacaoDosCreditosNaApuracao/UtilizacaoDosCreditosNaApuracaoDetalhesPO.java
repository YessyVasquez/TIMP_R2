package com.sap.timp.pageObjectModel.MDR.ControleDeCreditoTributario.UtilizacaoDosCreditosNaApuracao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class UtilizacaoDosCreditosNaApuracaoDetalhesPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Controle de Crédito Tributário\"]")
	public WebElement controledecreditotributario;
	
	@FindBy(xpath = "//span[text()=\"Utilização dos Créditos na Apuração\"]")
	public WebElement utilizacaodoscreditosnaapuracao;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement utilizacao;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement inddesccred;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//span[@id=\"companyCode\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialvi;
	
	@FindBy(xpath = "//span[@id=\"TAX\"]")
	public WebElement tributovi;
	
	@FindBy(xpath = "//span[@id=\"utilization\"]")
	public WebElement utilizacaovi;
	
	@FindBy(xpath = "//span[@id=\"indDescCred\"]")
	public WebElement indesccredvi;
	
	@FindBy(xpath = "//span[@id=\"validityOf\"]")
	public WebElement datavi;
	
	public UtilizacaoDosCreditosNaApuracaoDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		controledecreditotributario.click();
		sleep(2000);
		
		utilizacaodoscreditosnaapuracao.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("UtilizacaoDosCreditosNaApuracao");
		
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
		String empresadetalhes = empresa.getText();
		String tributodetalhes = tributo.getText();
		String utilizacaodetalhes = utilizacao.getText();
		String inddesccreddetalhes = inddesccred.getText();
		
		
		System.out.println(empresadetalhes);
		System.out.println(tributodetalhes);
		System.out.println(utilizacaodetalhes);
		System.out.println(inddesccreddetalhes);
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(siguiente);
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("UtilizacaoDosCreditosNaApuracao");
		
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
		waitExpectElement(empresavi);
		sleep(2000);
		
		String empresavisualizar = empresavi.getText();
		String tributovisualizar = tributovi.getText();
		String utilizacaovisualizar = utilizacaovi.getText();
		String inddesccredvisualizar = indesccredvi.getText();
		
		System.out.println(empresavisualizar);
		System.out.println(tributovisualizar);
		System.out.println(utilizacaovisualizar);
		System.out.println(inddesccredvisualizar);
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresavisualizar.equals(empresadetalhes));
		sucesso.add(tributovisualizar.equals(tributodetalhes));
		sucesso.add(inddesccredvisualizar.equals(inddesccreddetalhes));
		sucesso.add(utilizacaovisualizar.equals(utilizacaodetalhes));
		
		return sucesso;
	}
}
