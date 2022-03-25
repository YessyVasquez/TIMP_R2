package com.sap.timp.pageObjectModel.TFP.Configurações.Status.SubPeriodo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;


public class ConfiguracoesStatusSubPeriodoEditarPO extends TestBaseSteven{
	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement configuracoes;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-Status\"]/div/span[2]")
	public WebElement status;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-SubPeriodStatusList\"]")
	public WebElement subperiodo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data inicial\"]")
	public WebElement datainicial;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data inicial\"]")
	public WebElement validadede;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data final\"]")
	public WebElement validadeate;
	

	@FindBy(xpath="//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public ConfiguracoesStatusSubPeriodoEditarPO() {
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
		
		configuracoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		status.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		subperiodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {
			String idRegistro = "74";
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
			String idRegistro = "30";

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
			String idRegistro = "20";

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
		String validadedeantes = validadede.getAttribute("value");
		String validadeateantes= validadeate.getAttribute("value");
		System.out.println("Validade de antes de atualizar:"+validadedeantes);
		System.out.println("Validade ate antes de atualizar:"+validadeateantes);
		
		String enviar = "01/01/1973";
		String enviar1 = "31/12/1974";
		
		validadede.clear();
		validadeate.clear();
		sleep(2000);
		validadede.sendKeys(enviar);
		validadeate.sendKeys(enviar1);
		sleep(2000);
		
		
		
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		
		subperiodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		if (tq1 == true) {
			String idRegistro = "74";
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
			String idRegistro = "30";

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
			String idRegistro = "20";

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
		
		String validadededepois = validadede.getAttribute("value");
		String validadeatedepois= validadeate.getAttribute("value");
		System.out.println("Validade de depois de atualizar:"+validadededepois);
		System.out.println("Validade ate depois de atualizar:"+validadeatedepois);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(validadededepois.contains(enviar));
		sucesso.add(validadeatedepois.contains(enviar1));
		
		validadede.clear();
		validadeate.clear();
		sleep(2000);
		validadede.sendKeys(validadedeantes);
		validadeate.sendKeys(validadeateantes);
		sleep(2000);
		gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		System.out.println(sucesso);
		return sucesso;
		
		
	}

}
