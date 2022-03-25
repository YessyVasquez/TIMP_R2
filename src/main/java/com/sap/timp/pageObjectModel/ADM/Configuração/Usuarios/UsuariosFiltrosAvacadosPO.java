package com.sap.timp.pageObjectModel.ADM.Configuração.Usuarios;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class UsuariosFiltrosAvacadosPO extends TestBaseSteven {
	
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[4]")
	public WebElement usuarios;
	
	@FindBy(xpath = "//span[text()=\"Usuários\"]")
	public WebElement subUsuarios;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;

	
	@FindBy(xpath = "//*[@id=\"advanced-filters-btn\"]/span[2]")
	public WebElement filtrosavancados;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por Usuário de Criação\"]")
	public WebElement usuarioCriacao;
	
	@FindBy(xpath = "//div[@id=\"option-4\"]/div[1]/label/span")
	public WebElement opcUsuarioCriacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por Usuário de Modificação\"]")
	public WebElement usuarioModificacao;
	
	@FindBy(xpath = "//*[@id=\"option-5\"]/div[1]/label/span")
	public WebElement opcUsuarioModificacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Filtrar por Status\"]")
	public WebElement status;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]/div[1]/label/span")
	public WebElement opcStatus;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[1]/div[2]/span/span")
	public WebElement next;
	
	
	public UsuariosFiltrosAvacadosPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> filtros() {
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}
	
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		next.click();
		sleep(3000);
		
		usuarios.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		subUsuarios.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		
		filtrosavancados.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		usuarioCriacao.click();
		sleep(2000);	
		opcUsuarioCriacao.click();
		sleep(2000);
		usuarioCriacao.sendKeys(Keys. ESCAPE);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		usuarioModificacao.click();
		sleep(2000);	
		opcUsuarioModificacao.click();
		sleep(2000);
		usuarioModificacao.sendKeys(Keys. ESCAPE);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		status.click();
		sleep(2000);	
		opcStatus.click();
		sleep(2000);
		status.sendKeys(Keys. ESCAPE);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();

		for (int i = 0; i < rows; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]["+j+"]/div[3]/div")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {
					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}
		
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String icms = "";
		j=1;
		for (int i = 0; i < rows; i++) {
			icms = driver.findElement(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")][1]/div[3]/div")).getText();
			sucesso.add(data.get(0).equals(icms));
		}
		
		return sucesso;
		
		
	}

}
