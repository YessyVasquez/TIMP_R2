package com.sap.timp.pageObjectModel.TDK.Execucoes.Lixeira;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class LixeiraExcluirEmMassaPO extends TestBaseKenssy{

	@FindBy(xpath = "//span[text()=\"Execuções\"]")
	public WebElement execucoes;
	
	@FindBy(xpath = "//div[@class=\"tabs-wrapper\"]/div/div[2]/div/div[3]/div/div[3]/ul/li[3]")
	public WebElement Lixeira;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	//ExcluirEmMassa
	@FindBy(xpath = "//button/span[contains(@class,\"icon-persign\")]")
	public WebElement excluirMassa;
			
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	public LixeiraExcluirEmMassaPO() {
		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> lixeiraExcluirEmMassa() {
		
		execucoes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		Lixeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro1 =idObter("idRegistroL1");
		String idRegistro2 =idObter("idRegistroL2");
		
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistro11 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		
		rows = rows-1;
		String idRegistro22 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[5]/div")).getText();
		
		sleep(2000);
		System.out.println("--- Id de Lixeria--");
		System.out.println(idRegistro11);
		System.out.println(idRegistro22);
		
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		double idRegistroD11 = convertToDouble(idRegistro11);
		double idRegistroD22 = convertToDouble(idRegistro22);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (idRegistroD1 == idRegistroD11 && idRegistroD2 == idRegistroD22) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[2]/label/span"));
		check1.click();
		
		rows2 = rows2 - 1;
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[2]/label/span"));
		check2.click();
		
		excluirMassa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows3 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistro111 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows3+"]/div[5]/div")).getText();
		
		rows3 = rows3-1;
		String idRegistro222 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows3+"]/div[5]/div")).getText();
		
		System.out.println("--- Registros que quedan despues de eliminar --");
		System.out.println(idRegistro111);
		System.out.println(idRegistro222);
		
		double idRegistroD1111 = convertToDouble(idRegistro111);
		double idRegistroD2222 = convertToDouble(idRegistro222);
		
		if (idRegistroD1111 != idRegistroD1  && idRegistroD2222 != idRegistroD2 ) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		
		System.out.println(sucesso);
		return sucesso;	
	}
}
