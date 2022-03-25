package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoDeAjusteDaApuraçaoDoIPI;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class CodigoDeAjusteDaApuraçaoDoIPIVisualizarPO extends TestBaseSteven{
	
	
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"4.5.4 Código de Ajuste da Apuração do IPI\"]")
	public WebElement codigodeajuste;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	

	
	@FindBy(xpath = "//span[@id=\"codeAjusteIPI\"]")
	public WebElement codigoV;
	
	@FindBy(xpath = "//span[@id=\"codeAjusteIndicador\"]")
	public WebElement indicadorV;
	
	@FindBy(xpath = "//span[@id=\"descricao\"]")
	public WebElement descricaoV;
	
	@FindBy(xpath = "//span[@id=\"dataIniVigencia\"]")
	public WebElement vigenciaV;
	
	
	@FindBy(xpath = "//div[@id=\"codeAjusteIPI\"]/div/div/input")
	public WebElement codigoE;
	
	@FindBy(xpath = "//div[@id=\"codeAjusteIndicador\"]/div/div/div/input")
	public WebElement indicadorE;
	
	@FindBy(xpath = "//div[@id=\"descricao\"]/div/textarea")
	public WebElement descricaoE;
	
	@FindBy(xpath = "//div[@id=\"validity\"]/div/div/input")
	public WebElement vigenciaE;
		
	
	public CodigoDeAjusteDaApuraçaoDoIPIVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		

		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		
		codigodeajuste.click();
		sleep(2000);

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("codigodeajustedaapuracaodoipi");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String codigoV1 = codigoV.getText();
		String indicadorV1 = indicadorV.getText();
		String descricaoV1 = descricaoV.getText();
		String vigenciaV1 = vigenciaV.getText();
		
		System.err.println(codigoV1);
		System.err.println(indicadorV1);
		System.out.println(descricaoV1);
		System.err.println(vigenciaV1);
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(indicadorE);
		sleep(2000);
		

		String codigoE1 = codigoE.getAttribute("value");
		String indcadorE1 = indicadorE.getAttribute("value");
		String descricaoE1 = descricaoE.getAttribute("value");
		String vigenciaE1 = vigenciaE.getAttribute("value");
		
		System.out.println(codigoE1);
		System.out.println(indcadorE1);
		System.out.println(descricaoE1);
		System.out.println(vigenciaE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		
		sucesso.add(codigoE1.equals(codigoV1));
		sucesso.add(indcadorE1.equals(indicadorV1));
		sucesso.add(descricaoE1.equals(descricaoV1));
		sucesso.add(vigenciaE1.equals(vigenciaV1));
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
		
		
		
		
		

	}	
	
	

}
