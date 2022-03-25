package com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.CommoditieParaTP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class CommoditieParaTPCriarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Preço de Transferência\"]")
	public WebElement Preco;
	
	@FindBy(xpath = "//span[text()=\"Commoditie para TP\"]")
	public WebElement comoditie;
	
	@FindBy(xpath = "//span[text()=\"Nova Commoditie\"]")
	public WebElement NuevoCommo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement Empresa ;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement NumeroEmpresa ;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Commoditie\"]")
    public WebElement commodine;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Tipo\"]")
	public WebElement tipo;
	
	@FindBy(xpath = "//button[@id=\"add-materials\"]")
	public WebElement filtro;
	
	@FindBy(xpath = "//div[@id=\"rbtCode\"]/div/label/span")
	public WebElement radio;
	
	@FindBy(xpath = "//div[@id=\"inputCode\"]/div/div/input")
	public WebElement codigo;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement filtrar;
	
	@FindBy(xpath = "//div[@id=\"materialID\"]")
	public WebElement materia;
	
	@FindBy(xpath = "//li[@id=\"option-1\"]")
	public WebElement numeromateria;
	
	@FindBy(xpath = "//div[@id=\"beginningOfValid\"]/div/div/input")
	public WebElement fecha;
	
	@FindBy (xpath = "//span[text()=\"Gravar\"]")
	public WebElement nuevo;
	
	@FindBy (xpath = "//button[text()=\"Sim\"]")
	public WebElement si;
	
	@FindBy (xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public CommoditieParaTPCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean Criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		Preco.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		comoditie.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
		
		String idRegistro = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();
		System.out.println(idRegistro);			
		sleep(2000);
		
		sleep(2000);
		NuevoCommo.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
		
		sleep(2000);
		Empresa.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(2000);
		NumeroEmpresa.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		commodine.sendKeys("98676216");invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		tipo.sendKeys("33726667");invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		filtro.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		radio.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
	    sleep(2000);
	    codigo.sendKeys("H17");invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	    
	    sleep(2000);
	    filtrar.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	    
	    sleep(10000);
	    materia.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
	    sleep(2000);
	    numeromateria.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	    
	    sleep(2000);
	    fecha.sendKeys(fechaActual());
	    
	    sleep(2000);
	    nuevo.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	    
	    sleep(2000);
	    si.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	    
	    sleep(2000);
	    biblioteca.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	    
	    boolean sucesso = false;
		
		//primer dato de la tabla
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[3]/div")).getText();		
		idInserir("CommoditieParaTP",String.valueOf(Integer.parseInt(idRegistro1)));
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
	
	
	
