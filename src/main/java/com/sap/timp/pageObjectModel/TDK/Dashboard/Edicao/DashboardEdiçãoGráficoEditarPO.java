package com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class DashboardEdiçãoGráficoEditarPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Dashboards Públicos\"]")
	public WebElement dashboardspublicos;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@id=\"tdk-Wrapper\"]/div/div[2]/div/div/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div/div[1]/div[1]/div")
	public WebElement grafico;
	
	@FindBy(xpath = "//div[@class=\"edit-icon\"]")
	public WebElement lapiz;
	
	@FindBy(xpath = "//span[text()=\" Editar\"]")
	public WebElement editar1;
	
	@FindBy(xpath = "//div[@id=\"title\"]/div[2]/div/div/input")
	public WebElement titulo;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitarFiltros;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	public DashboardEdiçãoGráficoEditarPO() {
		PageFactory.initElements(driver, this);
	}

	public boolean Editar() {

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


		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		dashboardspublicos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		System.out.println("---------- Editar --------- " );
		String idRegistro =idObter("dashboardsCriar");

		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(2000);
		editar.click();
		sleep(4000);
		sleep(4000);
		
		grafico.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		lapiz.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		editar1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		titulo.sendKeys("1");
		titulo.sendKeys(Keys.ENTER);
		sleep(4000);
		
		String valor = titulo.getAttribute("value");
		System.out.println(valor);
		
		aceitarFiltros.click();
		sleep(3000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		grafico.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		lapiz.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		editar1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String valor1 = titulo.getAttribute("value");
		System.out.println(valor1);
		
		boolean sucesso = valor1.equals(valor);
		System.out.println(sucesso);
	  	
		return sucesso;
		
	}
}
