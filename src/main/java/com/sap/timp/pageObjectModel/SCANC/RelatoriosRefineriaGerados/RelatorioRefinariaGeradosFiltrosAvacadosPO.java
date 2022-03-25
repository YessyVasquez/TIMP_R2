package com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RelatorioRefinariaGeradosFiltrosAvacadosPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Relatórios Refinaria Gerados\"]")
	public WebElement relatorioRefineriaGerados;
	
	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement btnFiltrosAvanzados;
	
	@FindBy(xpath = "//div[@class=\"advanced-filters-container\"]/div/div/div/div/span")
	public WebElement filtroSubperiodo;
	
	@FindBy(xpath = "//div[@class=\"advanced-filters-container\"]/div[@class=\"field advanced-filter\"][2]/div/div/div[2]/div/div[2]")
	public WebElement cboFiltroEmpresa;
	
	@FindBy(xpath = "//div[@class=\"advanced-filters-container\"]/div[@class=\"field advanced-filter\"][3]/div/div/div[2]/div/div[2]")
	public WebElement cboFiltroStatus;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement btnAplicar;
	
	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement btnLimpiarFiltro;
	
	public RelatorioRefinariaGeradosFiltrosAvacadosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtrosAvanzados() {
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		relatorioRefineriaGerados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		btnFiltrosAvanzados.click();
		sleep(2000);
		
		String subperiodo = "01/2016";
		System.out.println("Subperiodo: " + subperiodo);
		
		filtroSubperiodo.click();
		sleep(1000);
		
		// Calendario 1
		WebElement tituloMesElement = driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][1]/div[1]/div[2]"));
		tituloMesElement.click();
		sleep(1000);
		
		WebElement tituloAniolement = driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][1]/div[1]/div[2]"));
		tituloAniolement.click();
		sleep(1000);
		
		WebElement flechaLeftElement = driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][1]/div[1]/div[1]"));
		flechaLeftElement.click();
		sleep(1000);
		
		WebElement anioElement = driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][1]/div[5]/div[@tabindex=\"0\" and contains(@class,\"year\") and text()=\"2016\"][1]"));
		anioElement.click();
		sleep(1000);
		
		WebElement mesElement = driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][1]/div[4]/div[@tabindex=\"0\" and contains(@class,\"month\") and text()=\"Jan\"][1]"));
		mesElement.click();
		sleep(1000);
		
		WebElement diaElement = driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][1]/div[3]/div[@tabindex=\"0\" and contains(@class,\"date\") and text()=\"1\"][1]"));
		diaElement.click();
		sleep(1000);
		
		// Calendario 2
		WebElement tituloMesElement2 = driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][2]/div[1]/div[2]"));
		tituloMesElement2.click();
		sleep(1000);
		
		WebElement tituloAniolement2 = driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][2]/div[1]/div[2]"));
		tituloAniolement2.click();
		sleep(1000);
		
		WebElement flechaLeftElement2 = driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][2]/div[1]/div[1]"));
		flechaLeftElement2.click();
		sleep(1000);
		
		WebElement anioElement2 = driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][2]/div[5]/div[@tabindex=\"0\" and contains(@class,\"year\") and text()=\"2016\"][1]"));
		anioElement2.click();
		sleep(1000);
		
		WebElement mesElement2 = driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][2]/div[4]/div[@tabindex=\"0\" and contains(@class,\"month\") and text()=\"Jan\"][1]"));
		mesElement2.click();
		sleep(1000);
		
		WebElement diaElement2 = driver.findElement(By.xpath("//div[@class=\"calendar-wrapper\"][2]/div[3]/div[@tabindex=\"0\" and contains(@class,\"date\") and text()=\"1\"][1]"));
		diaElement2.click();
		sleep(1000);
		
		btnAplicar.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		System.out.println("Rows Filtro Subperiodo: " + rows);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		String subperiodoResultString = "";
		
		for(int i = 0; i < rows; i++) {
			subperiodoResultString = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id][1]/div[7]/div")).getText();			
			sucesso.add(subperiodoResultString.contains(subperiodo));
		}
		
		btnLimpiarFiltro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboFiltroEmpresa.click();
		sleep(1000);
		
		String empresa = "1000";
		System.out.println("");
		System.out.println("Empresa filtro: " + empresa);
		
		WebElement opcionFiltroEmpresa = driver.findElement(By.xpath("//div[contains(@class, \"list-option\") and @tabindex=\"0\"]/div/div[text()=\""+empresa+"\"]"));
		opcionFiltroEmpresa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		System.out.println("Rows Filtro Empresa: " + rows);
		
		String empresaString = "";
		
		for(int i = 0; i < rows2; i++) {
			empresaString = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id][1]/div[6]/div")).getText();			
			sucesso.add(empresaString.contains(empresa));
		}
		
		btnLimpiarFiltro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		cboFiltroStatus.click();
		sleep(1000);
		String status = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id][1]/div[8]/div")).getText();
		System.out.println("");
		System.out.println("Status filtro: " + status);
		
		WebElement opcionFiltroStatus = driver.findElement(By.xpath("//div[contains(@class, \"list-option\") and @tabindex=\"0\"]/div/div[text()=\""+status+"\"]"));
		opcionFiltroStatus.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);		
				
		int rows3 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		System.out.println("Rows Filtro Status: " + rows3);
		
		String statusString = "";
		
		for(int i = 0; i < rows2; i++) {
			statusString = driver.findElement(By.xpath("//div[contains(@class, \"tbody\")]/div[contains(@class, \"tr\") and @data-id][1]/div[8]/div")).getText();			
			sucesso.add(statusString.contains(status));
		}
		
		btnLimpiarFiltro.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println(sucesso);
		
		return sucesso;
	}
}
