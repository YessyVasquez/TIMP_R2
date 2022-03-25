package com.sap.timp.pageObjectModel.TFP.Configurações.Bloqueios.SubPeriodo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class BloqueioSubPeriodoVerPO extends TestBaseSteven{
	
	@FindBy(xpath = "//div[contains(@class, \"baseTabs-box\")]/span/span[text()=\"Configurações\"]")
	public WebElement configuracoes;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-Bloqueios\"]")
	public WebElement bloqueios;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-PeriodDown\"]")
	public WebElement subperiodo;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public BloqueioSubPeriodoVerPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> ver() {
		
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
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		configuracoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		bloqueios.click();
		sleep(2000);
		
		subperiodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {
			String idRegistro = "15";
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
			WebElement ver = driver.findElement(
					By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));

			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			ver.click();

			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		} else if (tp1 == true) {
			String idRegistro = "8";

			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
			WebElement ver = driver.findElement(
					By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));

			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			ver.click();

			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		} else {
			String idRegistro = "10";

			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
			WebElement ver = driver.findElement(
					By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));

			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			ver.click();

			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		// Datos de Ver
		String statusString = driver.findElement(By.xpath("//div[@id=\"statusInput\"]/div/textarea")).getAttribute("value").trim();
		String empresaString = driver.findElement(By.xpath("//div[@id=\"companyInput\"]/div/textarea")).getAttribute("value").trim();
		String estadoString = driver.findElement(By.xpath("//div[@id=\"ufInput\"]/div/textarea")).getAttribute("value").trim();
		String filialString = driver.findElement(By.xpath("//div[@id=\"branchInput\"]/div/textarea")).getAttribute("value").trim();
		String tributoString=driver.findElement(By.xpath("//div[@id=\"taxInput\"]/div/textarea")).getAttribute("value").trim();
		String validadeDeString = driver.findElement(By.xpath("//div[@id=\"validFrom\"]/div/textarea")).getAttribute("value").trim();
		String validadeateString= driver.findElement(By.xpath("//div[@id=\"validTo\"]/div/textarea")).getAttribute("value").trim();
		String componenteBfbString = driver.findElement(By.xpath("//div[@class=\"app-name droppable-tile-name\"]")).getText().trim();
		
		System.out.println("Dados do menu Ver");
		System.out.println("-------------------------------------------------------");
		System.out.println("Status: " + statusString);
		System.out.println("Empresa: " + empresaString);
		System.out.println("Estado: " + estadoString);
		System.out.println("Filial: " + filialString);
		System.out.println("Tributo:"+tributoString);
		System.out.println("Validade De: " + validadeDeString);
		System.out.println("Validade Ate:"+validadeateString);
		System.out.println("Componente: " + componenteBfbString);
		System.out.println("");
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {
			String idRegistro = "15";
			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
			WebElement editar = driver.findElement(
					By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			editar.click();

			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		} else if (tp1 == true) {
			String idRegistro = "8";

			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
			WebElement editar = driver.findElement(
					By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			editar.click();

			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		} else {
			String idRegistro = "10";

			WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
			WebElement editar = driver.findElement(
					By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

			actionsMoveToElementElement(menu);
			sleep(2000);
			menu.click();
			sleep(2000);
			editar.click();

			sleep(2000);
			waitExpectElement(biblioteca);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		}
		
		// Datos de Editar
		String statusString1 = driver.findElement(By.xpath("//div[@id=\"statusInput\"]/div/div/div/div/div/div[1]")).getText().trim();
		String empresaString1 = driver.findElement(By.xpath("//div[@id=\"companyInput\"]/div/div/div/div/div/div[1]")).getText().trim();
		String estadoString1 = driver.findElement(By.xpath("//div[@id=\"ufInput\"]/div/div/div/div/div/div[1]")).getText().trim();
		String filialString1 = driver.findElement(By.xpath("//div[@id=\"branchInput\"]/div/div/div/div/div/div[1]")).getText().trim();
		String tributoString1=driver.findElement(By.xpath("//div[@id=\"taxInput\"]/div/div[1]/div[1]/div/div/div[1]")).getText().trim();
		String validadeDeString1 = driver.findElement(By.xpath("//input[@placeholder=\"Selecionar Validade De\"]")).getAttribute("value").trim();
		String validadeateString1= driver.findElement(By.xpath("//input[@placeholder=\"Selecionar Validade Até\"]")).getAttribute("value").trim();
		String componenteBfbString1 = driver.findElement(By.xpath("//div[@id=\"list-r-elements-wrapper\"]/div[1]/div/div[2]/div[1]")).getText().trim();

		System.out.println("Dados do menu Editar");
		System.out.println("-------------------------------------------------------");
		System.out.println("Status: " + statusString1);
		System.out.println("Empresa: " + empresaString1);
		System.out.println("Estado: " + estadoString1);
		System.out.println("Filial: " + filialString1);
		System.out.println("Tributo:"+tributoString);
		System.out.println("Validade De: " + validadeDeString1);
		System.out.println("Validade Ate:"+validadeateString1);
		System.out.println("Componente: " + componenteBfbString1);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(statusString1.contains(statusString));
		sucesso.add(empresaString1.equals(empresaString));
		sucesso.add(estadoString1.equals(estadoString));
		sucesso.add(filialString1.contains(filialString));
		sucesso.add(tributoString.contains(tributoString1));
		sucesso.add(validadeDeString1.equals(validadeDeString));
		sucesso.add(validadeateString.contains(validadeateString1));
		sucesso.add(componenteBfbString1.equals(componenteBfbString));
		
	
		System.out.println(sucesso);
		
		return sucesso;
	}

}
