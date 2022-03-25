package com.sap.timp.pageObjectModel.Calendar.Tarefas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TarefasNAGatewayPortaMultiplaPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[@class=\"btn icon icon-font-Sign-and-Symbols icon-persign closeButton\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//*[@id=\"input-filter\"]/div/div/input")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//*[@id=\"month-wrapper\"]/div/div[1]/div[1]")
	public WebElement atras;
	
	@FindBy(xpath = "//span[text()=\"Calendário de Usuários\"]")
	public WebElement UsuariosCalendario;
	
	@FindBy(xpath = "//div[text()=\"943457\"]")
	public WebElement verificar1;
	
	@FindBy(xpath = "//div[text()=\"943458\"]")
	public WebElement verificar2;
	
	@FindBy(xpath = "//span[text()=\"Abrir Calendário\"]")
	public WebElement AbrirCalendario;
	
	@FindBy(xpath = "//*[@id=\"month-wrapper\"]/div/div[2]/div[1]/div[2]/div[23]")
	public WebElement dia22;
	
	@FindBy(xpath = "//*[@id=\"table\"]/div/div[1]/div/div[2]/div[1]/div[1]/label/span")
	public WebElement flag;
	
	@FindBy(xpath = "//div[@class=\"title\"]")
	public WebElement titulo;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//span[text()=\"Fechar Calendário\"]")
	public WebElement fecharCalendario;
	
	
	public TarefasNAGatewayPortaMultiplaPO() {

		PageFactory.initElements(driver, this);
	}

	
	public ArrayList<Boolean> Calendario() {
		
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		fechar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		AbrirCalendario.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		WebElement setaesquerda = driver
				.findElement(By.xpath("//div[@class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]"));
		
		boolean calendarMonthString = true;	
		
		while (calendarMonthString)  {
			if(titulo.getText().contentEquals("Fevereiro, 2021")  ) {
				calendarMonthString = false;
			}else {
				setaesquerda.click();
				sleep(2000);
				invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
				sleep(2000);
			}
		}
		dia22.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		fecharCalendario.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		Boolean existeElemento1;
		Boolean existeElemento2;
		if (tq1==true) {
			if (existeElemento1 = driver.findElements(By.xpath("//div[text()=\"943472\"]")).size() != 0) {
				System.out.println("EXISTE 1");
				sucesso.add(true);
			}else {
				System.out.println("NO EXISTE 1");
				sucesso.add(false); 
			}
			
			if (existeElemento2 = driver.findElements(By.xpath("//div[text()=\"943473\"]")).size() != 0) {
				System.out.println("EXISTE 2");
				sucesso.add(true);
			}else {
				System.out.println("NO EXISTE 2");
				sucesso.add(false); 
			}			
		}else if (tp1 == true) {
			
			if (existeElemento1 = driver.findElements(By.xpath("//div[text()=\"73073\"]")).size() != 0) {
				System.out.println("EXISTE 1");
				sucesso.add(true);
			}else {
				System.out.println("NO EXISTE 1");
				sucesso.add(false); 
			}
			
			if (existeElemento2 = driver.findElements(By.xpath("//div[text()=\"73074\"]")).size() != 0) {
				System.out.println("EXISTE 2");
				sucesso.add(true);
			}else {
				System.out.println("NO EXISTE 2");
				sucesso.add(false); 
			}	
			
		}else {
			
			if (existeElemento1 = driver.findElements(By.xpath("//div[text()=\"6479\"]")).size() != 0) {
				System.out.println("EXISTE 1");
				sucesso.add(true);
			}else {
				System.out.println("NO EXISTE 1");
				sucesso.add(false); 
			}
			
			if (existeElemento2 = driver.findElements(By.xpath("//div[text()=\"6480\"]")).size() != 0) {
				System.out.println("EXISTE 2");
				sucesso.add(true);
			}else {
				System.out.println("NO EXISTE 2");
				sucesso.add(false); 
			}	
			
		}	
		

		
		
		System.out.println(sucesso);
		return sucesso;
	}

}
