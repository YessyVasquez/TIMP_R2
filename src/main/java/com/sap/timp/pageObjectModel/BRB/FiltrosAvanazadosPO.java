package com.sap.timp.pageObjectModel.BRB;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.sap.timp.base.TestBaseSteven;

public class FiltrosAvanazadosPO extends TestBaseSteven {

	@FindBy(xpath = "//*[@id=\"advanced-filters-btn\"]")
	public WebElement filtro;
	
	@FindBy(xpath = "//input[contains(@placeholder, \"Tipo de Relatório\")]")
	public WebElement combo;
	
	@FindBy(xpath = "//li[text()=\"Relatórios Dinâmicos\"]")
	public WebElement opcao;
	

	
	
		
	
	
	public FiltrosAvanazadosPO() {
	
		PageFactory.initElements(driver, this);
	}
	
	
	public List<String> filtro() {
	

		filtro.click();

		sleep(8000);
		combo.click();
		

		opcao.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label,\"Row\")]")).size();


		List<String> verificar = new ArrayList<String>();
		
		for (int i = 1; i < rows; i++) {
			
			String relatorio = driver.findElement(By.xpath("//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div["+i+"]/div[11]/div")).getText();
			verificar.add(relatorio);
		
		}
		
		return verificar;

		
	}
	
	
	
	
	
	
	
}
