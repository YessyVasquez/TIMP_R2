package com.sap.timp.pageObjectModel.TFP.Periodos.Periodos;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class PeriodosAlterarStatusSubPeriodoAvulsoPO extends TestBaseKenssy{

	@FindBy(xpath = "//span[@class=\"title-boxes \" and text()=\"Períodos\"]")
	public WebElement periodos;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-period\"]")
	public WebElement periodosMenu;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//*[@id=\"subPeriodTable1\"]/div/div/div/div/div/div[8]/div/span[text()]")
	public WebElement status;
	
	@FindBy(xpath = "//*[@id=\"subPeriodTable1\"]/div/div/div/div/div/div[8]/div/span[text()]")
	public WebElement menu;
	
	public PeriodosAlterarStatusSubPeriodoAvulsoPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> alterarStatusSubPeriodo() {
		
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
		periodosMenu.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idFiltro = "";
		if(tp1 == true) {
			idFiltro = "36020";
			pesquisar.sendKeys("36020");
			sleep(2000);
			pesquisar.sendKeys(Keys.ENTER);
			sleep(3000);
		}else if(tq1 == true) {
			idFiltro  = "159418";
			pesquisar.sendKeys("159418");
			sleep(2000);
			pesquisar.sendKeys(Keys.ENTER);
			sleep(3000);
		}else {
			idFiltro = "41095";
			pesquisar.sendKeys("41095");
			sleep(2000);
			pesquisar.sendKeys(Keys.ENTER);
			sleep(3000);
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		WebElement menuFiltradoTpf = driver.findElement(By.xpath("//div[@data-id="+idFiltro+"]/div[1]/div"));
		WebElement subperiodoFiscais = driver.findElement(
				By.xpath("//div[@data-id=\"" + idFiltro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Subperíodos Fiscais\"]"));

		menuFiltradoTpf.click();
		sleep(2000);
		subperiodoFiscais.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idFiltroTFPSubperiodoFiscais = "";
		if(tp1 == true) {
			idFiltroTFPSubperiodoFiscais = "19534";
			sleep(2000);
		}else if(tq1 == true) {
			idFiltroTFPSubperiodoFiscais  = "38257";
			sleep(2000);
		}else {
			idFiltroTFPSubperiodoFiscais = "14403";
			sleep(2000);
		}
		
		sleep(2000);
		String status1 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltroTFPSubperiodoFiscais+")]/div[8]/div")).getText();
		System.out.println("Status 1: "+status1);
		sleep(2000);
		
		WebElement menuFiltradoTpf2 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltroTFPSubperiodoFiscais+")]/div[1]/div"));
		sleep(2000);
		WebElement preFechamento1 = driver.findElement(
				By.xpath("//div[contains(@data-id,\"" + idFiltroTFPSubperiodoFiscais + "\")]/div[1]/div/div[2]/ul/li/span[text()=\"200 - Pré-Fechamento\"]"));
		
		sleep(2000);
		menuFiltradoTpf2.click();
		sleep(2000);
		preFechamento1.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		actionsMoveToElementElement(status);
		
		String status2 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltroTFPSubperiodoFiscais+")]/div[8]/div")).getText();
		System.out.println("Status 2: "+status2);
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			sucesso.add(status2.contains("200 - Pré-Fechamento"));
		
		
		menuFiltradoTpf2 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltroTFPSubperiodoFiscais+")]/div[1]/div"));
		sleep(2000);
		WebElement preFechamento2 = driver.findElement(
				By.xpath("//div[contains(@data-id,\"" + idFiltroTFPSubperiodoFiscais + "\")]/div[1]/div/div[2]/ul/li/span[text()=\"100 - Aberto\"]"));
		
		sleep(2000);
		menuFiltradoTpf2.click();
		sleep(2000);
		preFechamento2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		actionsMoveToElementElement(status);
		
		String status3 = driver.findElement(By.xpath("//div[contains(@data-id,"+idFiltroTFPSubperiodoFiscais+")]/div[8]/div")).getText();
		System.out.println("Status 3: "+status2);
		sleep(2000);
		
			sucesso.add(status3.contains("100 - Aberto"));
		
		System.out.println("");
		System.out.println(sucesso);
		
		return sucesso;
	}
	
}
