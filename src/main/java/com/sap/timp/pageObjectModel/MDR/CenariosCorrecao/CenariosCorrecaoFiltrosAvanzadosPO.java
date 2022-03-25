package com.sap.timp.pageObjectModel.MDR.CenariosCorrecao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ComboBoxEditor;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CenariosCorrecaoFiltrosAvanzadosPO extends TestBaseSteven{
	@FindBy(xpath = "//*[@id=\"advanced-filters-btn\"]")
	public WebElement filtro;
	
	@FindBy(xpath = "//*[@id=\"overlay\"]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//*[@id=\"tax\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement comboTributo;
	
	@FindBy(xpath = "//*[@id=\"created-by\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement comboUsuario;
	
	@FindBy(xpath = "//*[@id=\"creation-date\"]/div/div[1]/input")
	public WebElement fechaCreacion;
	
	@FindBy(xpath = "//*[@id=\"modified-by\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement comboUsuarioModificado;
	
	@FindBy(xpath = "//*[@id=\"modification-date\"]/div/div[1]/input")
	public WebElement comboFechaModificacion;
	
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement opcao1;
	
	@FindBy(xpath = "//li/div/span[text()=\"Cenários de Correção\"]")
	public WebElement cenarios;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[2]/div/div[8]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[text()=\"20\"]")
	public WebElement diaSe;
	
	@FindBy(xpath = "//*[@id=\"reset-filters-btn\"]")
	public WebElement limpiar;
	
	@FindBy(xpath = "//div[text()=\"Ontem\"]")
	public WebElement dia;
	
	@FindBy(xpath = "/html/body/div[5]/div[2]/div[3]/div[2]/button[2]")
	public WebElement btnAplicar;
	
	public CenariosCorrecaoFiltrosAvanzadosPO() {			
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> tributo(){
		sleep(2000);
		cenarios.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);	
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		
		for (int i = 1; i < rows; i++) {

			String tributo ="";
			tributo = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div["+i+"]/div[6]/div")).getText();
			
			if (data.size()==0) {
				
				if (tributo.isEmpty()==false) {					
					data.add(tributo);
				}
			}
			
			j = j+1;
		}
			
		while (data.size() == 0) {		
			sleep(4000);
			siguiente.sendKeys(Keys.ENTER);
			waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
			sleep(2000);
			j=1;
			
			rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
			
			for (int i = 1; i < rows; i++) {

				String tributo ="";
				tributo = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div["+i+"]/div[6]/div")).getText();
				
				if (data.size()==0) {
					
					if (tributo.isEmpty()==false) {					
						data.add(tributo);
					}
				}
				
				j = j+1;
			}
						
		}
		sleep(4000);
		filtro.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		attributeToBeXpath("//*[@id=\"tax\"]/div/div[2]/div", "class", "base-select-wrapper");
		sleep(8000);
	
		comboTributo.click();
		comboTributo.sendKeys(data.get(0));
		sleep(1000);
		opcao1.click();
		
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div");
		sleep(3000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String tributo = "";
		j=1;
		for (int i = 1; i < rows; i++) {
			tributo = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[6]/div")).getText();
			sucesso.add(data.get(0).equals(tributo));
		}
		System.out.println("paso usuario tributo");
		
		return sucesso;
		
	}
	
	public ArrayList<Boolean> usuario(){
		sleep(10000);
		limpiar.sendKeys(Keys.ENTER);
		//limpiar.click();
		
		//waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div");
		//attributeToBeXpath("//div[@class=\"pre-header\"]/div", "class", "pre-item show-hide-option");
		//sleep(5000);
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		
		for (int i = 1; i < rows; i++) {

			String usuario ="";
			usuario = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div["+ i +"]/div[9]/div")).getText();
			
			if (data.size()==0) {
				
				if (usuario.isEmpty()==false) {					
					data.add(usuario);
				}
			}
			
			j = j+1;
		}
			
		while (data.size() == 0) {		
			sleep(7000);
			siguiente.sendKeys(Keys.ENTER);
			waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
			sleep(2000);
			j=1;
			
			rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
			
			for (int i = 1; i < rows; i++) {

				String usuario ="";
				usuario = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div["+ i +"]/div[9]/div")).getText();
				
				if (data.size()==0) {
					
					if (usuario.isEmpty()==false) {					
						data.add(usuario);
					}
				}
				
				j = j+1;
			}
						
		}
		
		sleep(10000);
			
		
		comboUsuario.click();
		comboUsuario.sendKeys(data.get(0));
		sleep(1000);
		opcao1.click();
		cuerpo.click();
		
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div");
		sleep(3000);
		
		
		ArrayList<Boolean> sucesso2 = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String usuario = "";
		j=1;
		for (int i = 1; i < rows; i++) {
			usuario = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[9]/div")).getText();
			sucesso2.add(data.get(0).equals(usuario));
		}
		System.out.println("paso usuario criacao");
		return sucesso2;
		
		
	}
	
	
	public ArrayList<Boolean> usuarioModificado(){
//		sleep(2000);
//		cenarios.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		sleep(4000);
//		filtro.sendKeys(Keys.ENTER);
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		sleep(10000);
		limpiar.sendKeys(Keys.ENTER);
		sleep(10000);
		attributeToBeXpath("//div[contains(@class,\"tbody\")]", "class", "tbody hasShowHide");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		
		int j=1;
		ArrayList<String> data = new ArrayList<String>();
		
		for (int i = 1; i < rows; i++) {

			String usuario ="";
			usuario = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div["+ i +"]/div[11]/div")).getText();
			System.out.println(usuario);
			
			if (data.size()==0) {
				
				if (usuario.isEmpty()==false) {					
					data.add(usuario);
				}
			}
			
			j = j+1;
		}
			
		while (data.size() == 0) {		
			sleep(7000);
			siguiente.sendKeys(Keys.ENTER);
			waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
			sleep(2000);
			j=1;
			
			rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
			
			for (int i = 1; i < rows; i++) {

				String usuario ="";
				usuario = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div["+ i +"]/div[11]/div")).getText();
				
				if (data.size()==0) {
					
					if (usuario.isEmpty()==false) {					
						data.add(usuario);
					}
				}
				
				j = j+1;
			}
						
		}
		
		sleep(12000);
		
		comboUsuarioModificado.click();
		comboUsuarioModificado.sendKeys(data.get(0));
		sleep(2000);
		opcao1.click();
		cuerpo.click();
		
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div");
		sleep(3000);
		
		
		ArrayList<Boolean> sucesso4 = new ArrayList<Boolean>();
		rows = driver.findElements(By.xpath("//div[@class=\"tr\" and contains(@aria-label, \"Row\")]")).size();
		String usuario = "";
		j=1;
		for (int i = 1; i < rows; i++) {
			usuario = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[11]/div")).getText();
			sucesso4.add(data.get(0).equals(usuario));
		}
		
		return sucesso4;
		
	}
	
}
