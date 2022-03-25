package com.sap.timp.pageObjectModel.ATR.Estruturas.MapeamentoDeParametrosDeEntrada;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class MapeamentoDeParametrosDeEntradaCriarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Mapeamento de Parâmetros de Entrada\"]")
	public WebElement mapeamento;
	
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")

	public WebElement primerapagina;

	
	@FindBy(xpath = "//span[text()=\"Novo Mapeamento\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencha o nome do grupo\"]")
	public WebElement nomedogrupo;
	
	@FindBy(xpath = "//div[@class=\"input structureMap\"]/div/div[2]")
	public WebElement estruturadedados;
	
	@FindBy(xpath = "//li[@id][text()=\"1 - NFs Entrada\"]")
	public WebElement opcaoestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Alíquota ICMS\"]")
	public WebElement opcaodirecaomovimento;
	
	@FindBy(xpath = "//div[@id=\"rows\"]/div/div[3]/div/div[2]")
	public WebElement direcaomovimento;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Comentários\"]")
	public WebElement comentario;
	
	

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	public MapeamentoDeParametrosDeEntradaCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		mapeamento.click();
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primerapagina);
		sleep(2000);
		primerapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		

		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();

		
		System.out.println("Ultimo registro: " + id);
		
		novo.click();
		sleep(2000);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		
		estruturadedados.click();
		sleep(2000);
		opcaoestrutura.click();
		sleep(2000);
	
		sleep(2000);
		direcaomovimento.click();
		sleep(2000);
		opcaodirecaomovimento.click();
		sleep(2000);
		gravar.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		mapeamento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primerapagina);
		sleep(2000);
		primerapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();	
	//	System.out.println("Rows:" +rows);
		

		String idultimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div[3]/div")).getText();

		
		idInserir("MapeamentoDeParametrosDeEntradaCriar",idultimo);

		System.out.println(id);
		System.out.println(idultimo);
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idultimo);
		
		boolean sucesso = false;
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		System.out.println(sucesso);
		return sucesso;
	}


}
