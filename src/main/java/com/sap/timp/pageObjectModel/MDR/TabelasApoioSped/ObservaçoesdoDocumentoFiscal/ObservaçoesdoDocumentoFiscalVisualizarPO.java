package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.ObservaçoesdoDocumentoFiscal;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ObservaçoesdoDocumentoFiscalVisualizarPO extends TestBaseSteven{
	
	
	
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"Observações do Documento Fiscal - Registro 0460\"]")
	public WebElement observacoesdocumento;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	

	
	@FindBy(xpath = "//span[@id=\"UF\"]")
	public WebElement ufV;
	
	@FindBy(xpath = "//span[@id=\"Rule\"]")
	public WebElement codigoV;
	
	@FindBy(xpath = "//span[@id=\"Description\"]")
	public WebElement descricaoV;
	
	@FindBy(xpath = "//span[@id=\"Validity\"]")
	public WebElement vigenciaV;
	
	
	@FindBy(xpath = "//div[@id=\"UF\"]/div/div/div/input")
	public WebElement ufE;
	
	@FindBy(xpath = "//div[@id=\"Rule\"]/div/div/input")
	public WebElement codigoE;
	
	@FindBy(xpath = "//div[@id=\"divDescription\"]/div/textarea")
	public WebElement descricaoE;
	
	@FindBy(xpath = "//div[@id=\"Validity\"]/div/div/input")
	public WebElement vigenciaE;
		
	
	public ObservaçoesdoDocumentoFiscalVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		

		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		observacoesdocumento.click();
		sleep(2000);

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("obsercacoesdodocumentofiscal");

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
		
		String ufV1 = ufV.getText();
		String codigoV1 = codigoV.getText();
		String descricaoV1 = descricaoV.getText();
		String vigenciaV1 = vigenciaV.getText();
		
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
		waitExpectElement(ufE);
		sleep(2000);
		
		String ufE1 = ufE.getAttribute("value");
		String codigoE1 = codigoE.getAttribute("value");
		String descricaoE1 = descricaoE.getAttribute("value");
		String vigenciaE1 = vigenciaE.getAttribute("value");
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(ufE1.equals(ufV1));
		sucesso.add(codigoE1.equals(codigoV1));
		sucesso.add(descricaoE1.equals(descricaoV1));
		sucesso.add(vigenciaE1.equals(vigenciaV1));
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
		
		
		
		
		

	}	
	
	

}
