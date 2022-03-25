package com.sap.timp.pageObjectModel.Calendar.Tarefas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TarefasNADelegarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[@class=\"btn icon icon-font-Sign-and-Symbols icon-persign closeButton\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//*[@id=\"input-filter\"]/div/div/input")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"baseTabs-view -view-wrapper  selected\"]/div/div/div[@id=\"input-filter\"]/div/div/input")
	public WebElement pesquisarDelegar;
	
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
	
	@FindBy(xpath = "//*[@id=\"month-wrapper\"]/div/div[2]/div[1]/div[2]/div[24]")
	public WebElement dia23;
	
	@FindBy(xpath = "//*[@id=\"table\"]/div/div[1]/div/div[2]/div[1]/div[1]/label/span")
	public WebElement flag;
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button[text()=\"Delegar\"]")
	public WebElement delegar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//span[text()=\"Fechar Calendário\"]")
	public WebElement fecharCalendario;
	
	@FindBy(xpath = "//div[@class=\"title\"]")
	public WebElement titulo;
	
	public TarefasNADelegarPO() {

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

		dia23.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		Boolean existeElemento1;
		Boolean existeElemento2;
		if (tc2==true) {
			if (existeElemento1 = driver.findElements(By.xpath("//div[text()=\"6479\"]")).size() != 0) {
				System.out.println("EXISTE 1");
				sucesso.add(true);
			}else {
				System.out.println("NO EXISTE 1");
				sucesso.add(false); 
			}
			
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"3\"]/div[2]/div/div/span"));
			WebElement açao = driver.findElement(By.xpath("//div[@data-id=\"3\"]/div[2]/div/div[2]/ul/li[4]/span[text()=\"Delegar\"]"));
			
			menu.click();
			sleep(1000);
			açao.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			pesquisarDelegar.sendKeys("MGASP");
			sleep(4000);
			pesquisarDelegar.sendKeys(Keys.ENTER);
			sleep(6000);
			
			flag.click();
			sleep(3000);
			
			delegar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);
			
			UsuariosCalendario.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);
			
			pesquisar.sendKeys("MGASP");
			sleep(4000);
			pesquisar.sendKeys(Keys.ENTER);
			sleep(6000);
			
			flag.click();
			sleep(3000);
			
			aceitar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);
			
			WebElement setaesquerda1 = driver
					.findElement(By.xpath("//div[@class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]"));
			
			boolean calendarMonthString1 = true;	
			
			while (calendarMonthString1)  {
				if(titulo.getText().contentEquals("Fevereiro, 2021")  ) {
					calendarMonthString = false;
				}else {
					setaesquerda1.click();
					sleep(2000);
					invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
					sleep(2000);
				}
			}
			dia23.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);
			
			
			
			if (existeElemento2 = driver.findElements(By.xpath("//div[text()=\"6479\"]")).size() != 0) {
				System.out.println("EXISTE 2");
				sucesso.add(true);
			}else {
				System.out.println("NO EXISTE 2");
				sucesso.add(false); 
			}			
			
			
			menu = driver.findElement(By.xpath("//div[@data-id=\"3\"]/div[2]/div/div/span"));
			WebElement açao2 = driver.findElement(By.xpath("//div[@data-id=\"3\"]/div[2]/div/div[2]/ul/li[3]/span[text()=\"Apropriar Tarefa\"]"));
			menu.click();
			sleep(1000);
			açao2.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			sim.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}else if (tq1 == true) {
			
			if (existeElemento1 = driver.findElements(By.xpath("//div[text()=\"943591\"]")).size() != 0) {
				System.out.println("EXISTE 1");
				sucesso.add(true);
			}else {
				System.out.println("NO EXISTE 1");
				sucesso.add(false); 
			}
			
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"12\"]/div[2]/div/div/span"));
			WebElement açao = driver.findElement(By.xpath("//div[@data-id=\"12\"]/div[2]/div/div[2]/ul/li[4]/span[text()=\"Delegar\"]"));
			
			menu.click();
			sleep(1000);
			açao.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			pesquisarDelegar.sendKeys("MGASP");
			sleep(4000);
			pesquisarDelegar.sendKeys(Keys.ENTER);
			sleep(6000);
			
			flag.click();
			sleep(3000);
			
			delegar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);
			
			UsuariosCalendario.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);
			
			pesquisar.sendKeys("MGASP");
			sleep(4000);
			pesquisar.sendKeys(Keys.ENTER);
			sleep(6000);
			
			flag.click();
			sleep(3000);
			
			aceitar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);
			
			WebElement setaesquerda2 = driver
					.findElement(By.xpath("//div[@class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]"));
			
			boolean calendarMonthString2 = true;	
			
			while (calendarMonthString2)  {
				if(titulo.getText().contentEquals("Fevereiro, 2021")  ) {
					calendarMonthString2 = false;
				}else {
					setaesquerda2.click();
					sleep(2000);
					invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
					sleep(2000);
				}
			}
			dia23.click(); 
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);
			
			
			
			if (existeElemento2 = driver.findElements(By.xpath("//div[text()=\"943591\"]")).size() != 0) {
				System.out.println("EXISTE 2");
				sucesso.add(true);
			}else {
				System.out.println("NO EXISTE 2");
				sucesso.add(false); 
			}
			
			menu = driver.findElement(By.xpath("//div[@data-id=\"0\"]/div[2]/div/div/span"));
			WebElement açao2 = driver.findElement(By.xpath("//div[@data-id=\"0\"]/div[2]/div/div[2]/ul/li[3]/span[text()=\"Apropriar Tarefa\"]"));
			menu.click();
			sleep(1000);
			açao2.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			sim.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		}else {
			
			if (existeElemento1 = driver.findElements(By.xpath("//div[text()=\"73073\"]")).size() != 0) {
				System.out.println("EXISTE 1");
				sucesso.add(true);
			}else {
				System.out.println("NO EXISTE 1");
				sucesso.add(false); 
			}
			
			
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"4\"]/div[2]/div/div/span"));
			WebElement açao = driver.findElement(By.xpath("//div[@data-id=\"4\"]/div[2]/div/div[2]/ul/li[4]/span[text()=\"Delegar\"]"));
			
			menu.click();
			sleep(1000);
			açao.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			pesquisarDelegar.sendKeys("MGASP");
			sleep(4000);
			pesquisarDelegar.sendKeys(Keys.ENTER);
			sleep(6000);
			
			flag.click();
			sleep(3000);
			
			delegar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);
			
			UsuariosCalendario.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);
			
			pesquisar.sendKeys("MGASP");
			sleep(4000);
			pesquisar.sendKeys(Keys.ENTER);
			sleep(2000);
			
			flag.click();
			sleep(6000);
			
			aceitar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);
			
			WebElement setaesquerda3 = driver
					.findElement(By.xpath("//div[@class=\"left-arrow icon icon-font-Sign-and-Symbols icon-leftmenu\"]"));
			
			boolean calendarMonthString3 = true;	
			
			while (calendarMonthString3)  {
				if(titulo.getText().contentEquals("Fevereiro, 2021")  ) {
					calendarMonthString3 = false;
				}else {
					setaesquerda3.click();
					sleep(2000);
					invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
					sleep(2000);
				}
			}
			dia23.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);
			
			
			
			if (existeElemento2 = driver.findElements(By.xpath("//div[text()=\"73073\"]")).size() != 0) {
				System.out.println("EXISTE 2");
				sucesso.add(true);
			}else {
				System.out.println("NO EXISTE 2");
				sucesso.add(false); 
			}
			
			
			menu = driver.findElement(By.xpath("//div[@data-id=\"4\"]/div[2]/div/div/span"));
			WebElement açao2 = driver.findElement(By.xpath("//div[@data-id=\"4\"]/div[2]/div/div[2]/ul/li[3]/span[text()=\"Apropriar Tarefa\"]"));
			menu.click();
			sleep(1000);
			açao2.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			sim.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
		}	
		
				
		System.out.println(sucesso);
		return sucesso;
	}

}
