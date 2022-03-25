package com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.DEPARAContasContábeis;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class DEPARAContasContábeisCriarPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Cadastros IRPJ/CSLL\"]")
	public WebElement cadastro;
	
	//submenu
	@FindBy(xpath = "//span[text()=\" DE-PARA  Contas  Contábeis\"]")
	public WebElement subItem;
	
	@FindBy(xpath = "//span[text()=\"Nova  DE-PARA  Contas  Contábeis\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[2]")
	public WebElement botonempresa;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Plano de Contas\"]")
	public WebElement planoContais;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Código da Conta Origem\"]")
	public WebElement CodigoContaisOrigen;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher  Código da Conta Destino\"]")
	public WebElement CodigoContaisDestino;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Data Inicial\"]")
	public WebElement fecha;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement grabar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//body")
	public WebElement body;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	
	public DEPARAContasContábeisCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	   cadastro.click();
	   sleep(2000);
	   invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	   sleep(2000);
	   
	
	   subItem.click();
	   sleep(2000);
	   invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	   sleep(2000);
	   
	 //primer dato
	 	String idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
	 	System.out.println(idRegistro);			
	 	sleep(2000);
	 	
	   sleep(5000);
	   novo.click();
	   sleep(4000);
	   
	   botonempresa.click();
	   sleep(2000);
	   invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	   sleep(2000);
	   
	   empresa.click();
	   sleep(2000);
	   invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	   sleep(2000);
	   
	   planoContais.sendKeys("Test991");
	   planoContais.sendKeys(Keys.ENTER);
	   invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	   sleep(2000);
	   
	   CodigoContaisOrigen.sendKeys("992");
	   CodigoContaisOrigen.sendKeys(Keys.ENTER);
	   invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	   sleep(2000);
	   
	   CodigoContaisDestino.sendKeys("125");
	   CodigoContaisDestino.sendKeys(Keys.ENTER);
	   invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	   sleep(2000);
	   
	   fecha.sendKeys(fechaActual());
	   fecha.sendKeys(Keys.ENTER);
	   

		body.click();
		sleep(1000);
		
		sleep(1000);
		grabar.click();
		sleep(2000);
		
		sleep(1000);
		sim.click();
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);		

		boolean sucesso = false;
		
		//primer dato de la tabla
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);		
		idInserir("DePARAContasContabeis",idRegistro1);
		System.out.println(idRegistro1);			
		sleep(2000);
		  
		int idD = Integer.parseInt(idRegistro); 
		int idBD = Integer.parseInt(idRegistro1);
		
		System.out.println("-----------------------------");
		System.out.println(idD); 
		System.out.println(idBD);
		sleep(2000);

		if (idBD > idD) { 
			sucesso = true; 
		}else { 
			sucesso = false; 
		}
		  
		return sucesso;	
	}
	   
}
