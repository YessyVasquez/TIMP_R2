package com.sap.timp.pageObjectModel.Calendar.Tarefas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class TarefaManualPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[@class=\"btn icon icon-font-Sign-and-Symbols icon-persign closeButton\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//span[text()=\"Abrir Calendário\"]")
	public WebElement calendario;
	
	@FindBy(xpath = "//span[text()=\"Fechar Calendário\"]")
	public WebElement fecharCalendario;
	
	@FindBy(xpath = "//div[@class=\"title\"]")
	public WebElement titulo;
	
	public TarefaManualPO() {

		PageFactory.initElements(driver, this);
	}

	
	public ArrayList<Boolean> Manual() {
		
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
		
		calendario.click();
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
		
			WebElement dia22 = driver.findElement(By.xpath("//div[@month=\"1\" and @date=\"22\"]"));
			dia22.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			
			fecharCalendario.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(4000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (tq1 == true) {

			WebElement OPC1 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 943537\")]"));
			actionsMoveToElementElement(OPC1);
			
			WebElement status1 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 943537\")]/div[5]"));
			
			
			WebElement nome1 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 943537\")]/div[4]"));
		
			
			
			String Status11 = status1.getText();
		
			
			String Nome11 = nome1.getText();
			
			
			sucesso.add(Status11.equals("Aberta"));
			
			
			sucesso.add(Nome11.equals("Tarefa Manual"));
			
			sleep(4000);

		}else if (tc2 == true) {

			WebElement OPC1 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 6482\")]"));
			actionsMoveToElementElement(OPC1);
			
			WebElement status1 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 6482\")]/div[5]"));
			
			WebElement nome1 = driver.findElement(By.xpath("//div[contains(@aria-label, \" Id: 6482\")]/div[4]"));
	
			
			String Status11 = status1.getText();
		
			String Nome11 = nome1.getText();
			
			sucesso.add(Status11.equals("Aberta"));
			
			sucesso.add(Nome11.equals("Tarefa Manual"));
			
			
			sleep(4000);
		}else {
			
		}
		System.out.println(sucesso);
		return sucesso;
		
		
	}
	
}
