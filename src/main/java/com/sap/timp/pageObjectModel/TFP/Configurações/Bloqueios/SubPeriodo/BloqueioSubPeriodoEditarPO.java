package com.sap.timp.pageObjectModel.TFP.Configurações.Bloqueios.SubPeriodo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class BloqueioSubPeriodoEditarPO extends TestBaseSteven {
	
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
	
	@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div/input")
	public WebElement inputValidoDesde;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement validode;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade Até\"]")
	public WebElement validoate;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	public BloqueioSubPeriodoEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> editar() {
		
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
		
		
		String validodeantes = validode.getAttribute("value");
		String validoateantes = validoate.getAttribute("value");
		System.out.println("Valido de antes: " + validodeantes);
		System.out.println("Valido ate antes: " + validoateantes);
		
		String enviar = "01/01/1973";
		String enviar1 = "31/12/1974";
		
		validode.clear();
		validoate.clear();
		sleep(2000);
		validode.sendKeys(enviar);
		validoate.sendKeys(enviar1);
		sleep(1000);
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
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
		
		
		String validodedepois = validode.getAttribute("value");
		String validoatedepois= validoate.getAttribute("value");
		System.out.println("Valido de depois de atualizar:"+validodedepois);
		System.out.println("Valido ate depois de atualizar:"+validoatedepois);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(validodedepois.contains(enviar));
		sucesso.add(validoatedepois.contains(enviar1));
		
		validode.clear();
		validoate.clear();
		sleep(2000);
		validode.sendKeys(validodeantes);
		validoate.sendKeys(validoateantes);
		sleep(2000);
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		System.out.println(sucesso);
		return sucesso;
	}

}
