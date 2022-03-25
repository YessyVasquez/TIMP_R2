package com.sap.timp.pageObjectModel.Calendar.Tarefas;

import java.rmi.server.Skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TarefasExecutarRelatorioBRBPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Calendário de Usuários\"]")
	public WebElement calendario;

	@FindBy(xpath = "//span[@class=\"btn icon icon-font-Sign-and-Symbols icon-persign closeButton\"]")
	public WebElement fechar;

	@FindBy(xpath = "//span[text()=\"Abrir Calendário\"]")
	public WebElement abrirCalendario;

	@FindBy(xpath = "//div[@class=\"title\"]")
	public WebElement titulo;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//textarea[@placeholder=\"Descrição\"]")
	public WebElement descricao;

	@FindBy(xpath = "//input[contains(@placeholder,\"início\")]")
	public WebElement inicio;

	@FindBy(xpath = "//input[contains(@placeholder,\"vencimento\")]")
	public WebElement vencimento;

	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//button[text()=\"Excluir\"]")
	public WebElement excluir;
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;
	
	@FindBy(xpath = "//span[text()=\"Fechar Calendário\"]")
	public WebElement fecharCalendario;

	public TarefasExecutarRelatorioBRBPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean abrirCalendario() {

		String url = driver.getCurrentUrl();

		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;

		if (url.contains("tc2")) {
			tc2 = true;
		} else if (url.contains("tp1")) {
			tp1 = true;
		} else if (url.contains("tq1")) {
			tq1 = true;
		} else {
			td1 = true;
		}

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		fechar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		abrirCalendario.click();
		sleep(3000);
		waitExpectXpath("//div[@class=\"day\"][1]");
		sleep(2000);



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

		String tituloS = titulo.getText();
		System.out.println("Titulo: " + tituloS);
		

		if (tq1 == true || tp1 == true) {
			WebElement dia16 = driver.findElement(By.xpath("//div[@month=\"1\" and @date=\"16\"]"));
			dia16.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		} else {

			WebElement dia16 = driver.findElement(By.xpath("//div[@month=\"1\" and @date=\"17\"]"));
			dia16.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

		}
		
		
		fecharCalendario.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		actionsMoveToElementElement(pesquisar);
		sleep(2000);
		
		if (tq1==true) {
			
			WebElement menu=driver.findElement(By.xpath("//div[contains(@aria-label,\"943245\")]/div[2]/div"));
			WebElement fazertarefa=driver.findElement(By.xpath("//div[contains(@aria-label,\"943245\")]/div[2]/div/div[2]/ul/li/span[text()=\"Fazer tarefa\"]"));
			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			fazertarefa.click();
			sleep(2000);
			
		}else if (tp1 ==true) {
			
			WebElement menu=driver.findElement(By.xpath("//div[contains(@aria-label,\"73058\")]/div[2]/div"));
			WebElement fazertarefa=driver.findElement(By.xpath("//div[contains(@aria-label,\"73058\")]/div[2]/div/div[2]/ul/li/span[text()=\"Fazer tarefa\"]"));
			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			fazertarefa.click();
			sleep(2000);
			
		}else {
			
			WebElement menu=driver.findElement(By.xpath("//div[contains(@aria-label,\"6464\")]/div[2]/div"));
			WebElement fazertarefa=driver.findElement(By.xpath("//div[contains(@aria-label,\"6464\")]/div[2]/div/div[2]/ul/li/span[text()=\"Fazer tarefa\"]"));
			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			fazertarefa.click();
			sleep(2000);
			
		}
		
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		waitExpectElement(home);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		boolean sucesso=false;
		WebElement totalElement= driver.findElement(By.xpath("//div[@id=\"table-report-wrapper\"]/div/div[2]/div[2]/div[2]/div[2]"));
		if(totalElement.isDisplayed()) {
			System.out.println("Executado com sucesso");
			sucesso=true;
		}else {
			System.out.println("Não executado com sucesso");
			sucesso=false;
		}
		System.out.println(sucesso);

		return sucesso;

	}

}
