package com.sap.timp.pageObjectModel.MDR.SCANC.MovimentoSCANC;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class MovimentoSCANCAtualizarPO extends TestBaseKenssy{
	@FindBy(xpath = "//span[text()=\"SCANC\"]")
	public WebElement scanc;
	
	@FindBy(xpath = "//span[text()=\"Movimento SCANC\"]")
	public WebElement movimentoScanc;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
	public WebElement idC;

	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primera;

	@FindBy(xpath = "//button[not(contains(@class,\"highlighted\"))]/span[contains(@class,\"reload\")]")
	public WebElement recarregar;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	public MovimentoSCANCAtualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> atualizar() {
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		boolean tc2 = false;
		boolean tq1 = false;
		boolean tp1 = false;
		String url = driver.getCurrentUrl();
		
		
		sleep(2000);
		scanc.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		movimentoScanc.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		recarregar.click();
		
		if (url.contains("tc2")) {
			sleep(1000);
		}else if(url.contains("tp1")){
			sleep(1000);
		}else {
			sleep(1000);
		}
		
		
		int visible = driver.findElements(By.xpath("//div[@class=\"overlay loader dark\"]")).size();
		System.out.println(visible + " após clicar no botão");
		
		if (visible >0) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int visible2 = driver.findElements(By.xpath("//div[@class=\"overlay loader dark\"]")).size();
		System.out.println(visible2 + " após deixar de recarregar");
		
		if (visible2 == 0) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		System.out.println(sucesso);
		return sucesso;
		
	}
	

}
