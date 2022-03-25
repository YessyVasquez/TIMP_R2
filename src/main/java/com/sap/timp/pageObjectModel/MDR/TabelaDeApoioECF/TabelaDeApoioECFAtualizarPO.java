package com.sap.timp.pageObjectModel.MDR.TabelaDeApoioECF;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaDeApoioECFAtualizarPO extends TestBaseSteven {


	@FindBy(xpath = "//ul/li[contains(@identifier,\"supportParameterECF\") and @tabindex=\"0\"]")
	public WebElement tabelaecf;


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

	public TabelaDeApoioECFAtualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> autalizar() {
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sleep(2000);
		tabelaecf.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		recarregar.click();
		
		sleep(3000);
		
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
		
		
		return sucesso;

	}

}
