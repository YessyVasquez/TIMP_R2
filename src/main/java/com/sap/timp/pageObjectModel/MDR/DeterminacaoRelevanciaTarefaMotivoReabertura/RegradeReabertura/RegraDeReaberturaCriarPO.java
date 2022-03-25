package com.sap.timp.pageObjectModel.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegradeReabertura;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class RegraDeReaberturaCriarPO extends TestBaseMassiel{

	
	@FindBy(xpath = "//span[text()=\"Determinação de Relevância de Tarefa por Motivo de Reabertura\"]")
	public WebElement dRTPMR;
	
	//submenu
	@FindBy(xpath = "//span[text()=\"Regra de Reabertura\"]")
	public WebElement RDR;
	
	@FindBy(xpath ="//*[@id=\"list\"]/div/div[1]")
	public WebElement menuAjustes;
	
	@FindBy(xpath ="//*[@id=\"container\"]/div[1]/div/div/ul/li[1]/button" )
	public WebElement nRegla;
	
	@FindBy(xpath ="//*[@id=\"ruleCode\"]/div/div/input")
	public WebElement codigo;
	
	@FindBy(xpath ="//*[@id=\"description\"]/div/div/input")
	public WebElement descripcion;
	
	@FindBy(xpath="//*[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement fecha;
	
	@FindBy(xpath = "//body")
	public WebElement clickfuera;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement grabar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	public RegraDeReaberturaCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	

	public boolean Criar() {
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		   sleep(5000);
		   dRTPMR.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
		   
		   sleep(5000);
		   RDR.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		   
		   //ultimo id de la tablas
		   int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();		
			String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println(id);			
			sleep(2000);
			
		   sleep(5000);
		   nRegla.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		   
		   
		   
		 
		   codigo.sendKeys("TestQA 91");
		   codigo.sendKeys(Keys.ENTER);
		   
		   descripcion.sendKeys("Automatizado9");
		   descripcion.sendKeys(Keys.ENTER);
		   
		   fecha.sendKeys(fechaActual());
		   fecha.sendKeys(Keys.ENTER);
		   
		   
		   clickfuera.click();invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
			
			grabar.click();
			
			sim.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
			
			biblioteca.click();
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]"); 
			sleep(5000);
			
			//revisando si fue le ultimo que se creo 
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000); 
			rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
			  
			boolean sucesso = false;
			  
			if(rows == 0) {
				return sucesso = true; 
			}
			  
			String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
			idInserir("DeterminacaoDeReabertura",idB);
			  
			sleep(2000); 
			System.out.println(id); 
			System.out.println(idB);
			  
			double idD = Integer.valueOf(id); 
			double idBD = Integer.valueOf(idB);
			
			if (idBD > idD) { 
				sucesso = true; 
			}else { 
				sucesso = false; 
			}
			  
			return sucesso;	
		}
		    
		
	
}
