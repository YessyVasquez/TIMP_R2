package com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.TabelaDeApoioECF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class TabelaDeApoioECFCriarPO extends TestBaseFernando{	
	@FindBy(xpath = "//div[@class=\"accordion-container\"]/ul/li/div/span[text()=\"Cadastros IRPJ/CSLL\"]")
	public WebElement cadastroIRPJCSLL;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-supportParameterECF\"]")
	public WebElement tabelaDeApoioECF;
	
	@FindBy(xpath = "//div[contains(@class, \"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\")][1]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//li[contains(@class, \"leftButton\")]/button/span[text()=\"Tabela de Apoio ECF\"]")
	public WebElement btnNovo;
	
	@FindBy(xpath = "//div[@id=\"table-ecf\"]/div/div[2]")
	public WebElement cboTabelaECF;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//div[@id=\"description\"]/div/div/input")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[@id=\"layout-version\"]/div/div[2]")
	public WebElement cboVersaoLeiaute;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	public TabelaDeApoioECFCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(cadastroIRPJCSLL);
		cadastroIRPJCSLL.click();
		sleep(1000);
		
		tabelaDeApoioECF.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//conta o numero de linhas	
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		System.out.println(id);			
		sleep(2000);	
		
		btnNovo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboTabelaECF.click();
		sleep(1000);
		opcionCombo.click();
		sleep(3000);
		
		/*descricao.click();
		sleep(2000);
		descricao.sendKeys("Teste Automatizado 5");
		sleep(2000);*/
		
		cboVersaoLeiaute.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		
		btnGravar.click();
		sleep(1000);
		waitExpectElement(btnSim);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnBiblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimerPagina.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = false;
		
		//conta o numero de linhas	
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();		
	//	String[] idArray1 = idRegistro1.split("_");
		//String idB = idArray1[3];
		idInserir("TabelaDeApoioECF", idRegistro1);
		System.out.println(idRegistro1);			
		sleep(2000);
		  
		int idD = Integer.parseInt(id); 
		int idBD = Integer.parseInt(idRegistro1);
		
		System.out.println("-----------------------------");
		System.out.println(idD); 
		System.out.println(idBD);
		sleep(2000);
		//compara pra ver se o novo id criado é realmente o ultimo
		  
		if (idBD > idD) { 
			sucesso = true; 
		}else { 
			sucesso = false; 
		}
		  
		return sucesso;	
	}
}
