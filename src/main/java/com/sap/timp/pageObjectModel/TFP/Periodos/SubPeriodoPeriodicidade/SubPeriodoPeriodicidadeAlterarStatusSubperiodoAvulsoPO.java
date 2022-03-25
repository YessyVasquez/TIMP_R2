package com.sap.timp.pageObjectModel.TFP.Periodos.SubPeriodoPeriodicidade;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class SubPeriodoPeriodicidadeAlterarStatusSubperiodoAvulsoPO extends TestBaseKenssy{

	@FindBy(xpath = "//li[@identifier=\"accordion-item-openedSubperiods\"]")
	public WebElement subPeriodoPeriodicidad;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	public SubPeriodoPeriodicidadeAlterarStatusSubperiodoAvulsoPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> alterarStatusSubperiodoAvulso() {
	
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}
		
		sleep(2000);
		subPeriodoPeriodicidad.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String idFiltro = "";
		if(tp1 == true) {
			idFiltro = "19547";
			pesquisar.sendKeys("19547");
			sleep(2000);
			pesquisar.sendKeys(Keys.ENTER);
			sleep(3000);
		}else if(tq1 == true) {
			idFiltro  = "38397";
			pesquisar.sendKeys("38397");
			sleep(2000);
			pesquisar.sendKeys(Keys.ENTER);
			sleep(3000);
		}else {
			idFiltro = "14416";
			pesquisar.sendKeys("14416");
			sleep(2000);
			pesquisar.sendKeys(Keys.ENTER);
			sleep(9000);
		}
		
		WebElement menuFiltradoTpf2 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltro+")]/div[1]/div"));
		sleep(2000);
		WebElement preFechamento1 = driver.findElement(
				By.xpath("//div[contains(@data-id,\"" + idFiltro + "\")]/div[1]/div/div[2]/ul/li/span[text()=\"200 - Pré-Fechamento\"]"));
		
		sleep(2000);
		menuFiltradoTpf2.click();
		sleep(2000);
		preFechamento1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		waitExpectXpath("//span[contains(text(),\"O status foi alterado com sucesso\")]");
		sleep(2000);
		
		String Codstatus1 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltro+")]/div[9]/div")).getText();
		String status1 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltro+")]/div[10]/div")).getText();
		System.out.println("CodStatus 1: "+Codstatus1);
		System.out.println("Status 1: "+status1);
		System.out.println(" ");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			sucesso.add(Codstatus1.contains("200"));
			sucesso.add(status1.contains("Pré-Fechamento"));
			
			
		menuFiltradoTpf2 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltro+")]/div[1]/div"));
		sleep(2000);
		WebElement preFechamento2 = driver.findElement(
				By.xpath("//div[contains(@data-id,\"" + idFiltro + "\")]/div[1]/div/div[2]/ul/li/span[text()=\"100 - Aberto\"]"));
		
		sleep(2000);
		menuFiltradoTpf2.click();
		sleep(2000);
		preFechamento2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		waitExpectXpath("//span[contains(text(),\"O status foi alterado com sucesso\")]");
		sleep(2000);
		
		String Codstatus2 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltro+")]/div[9]/div")).getText();
		String status2 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltro+")]/div[10]/div")).getText();
		System.out.println("CodStatus 2: "+Codstatus2);
		System.out.println("Status 2: "+status2);
		sleep(2000);
		
			sucesso.add(Codstatus2.contains("100"));
			sucesso.add(status2.contains("Aberto"));
		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
		
	}
}
