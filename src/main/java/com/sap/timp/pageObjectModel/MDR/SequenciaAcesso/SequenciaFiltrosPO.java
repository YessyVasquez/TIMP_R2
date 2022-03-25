package com.sap.timp.pageObjectModel.MDR.SequenciaAcesso;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class SequenciaFiltrosPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//li/div/span[text()=\"Sequência de Acesso\"]")
	public WebElement sequencia;
		
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div/div[3]/div")
	public WebElement id;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div/div[4]/div")
	public WebElement nome;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div/div[5]/div")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div/div[6]/div")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div/div[7]/div")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div/div[8]/div")
	public WebElement grupo;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div/div[9]/div")
	public WebElement estrutura;
	
	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div/div[10]/div")
	public WebElement ativo;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	public SequenciaFiltrosPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> id() {
		
		sequencia.click();
		sleep(1000);
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[1]/div");
		invisibilityOfElement("//*[@id=\"list\"]/div[1]/div/div/div/img");
		String idRegistro = id.getText();

		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[2]/label/span");
		invisibilityOfElement("//*[@id=\"list\"]/div[1]/div/div/div/img");
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@aria-label,\"Row\") and @class=\"tr\"]")).size();
		
		System.out.println(rows);
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		int ln = 1;
		for (int i = 0; i < rows; i++) {
			
			String idBusqueda = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@aria-label,\"Row\") and @class=\"tr\"]["+ln+"]/div[3]/div")).getText();
			String nomeBusqueda = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@aria-label,\"Row\") and @class=\"tr\"]["+ln+"]/div[4]/div")).getText();
			String descricaoBusqueda = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@aria-label,\"Row\") and @class=\"tr\"]["+ln+"]/div[5]/div")).getText();
			String empresaBusqueda = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@aria-label,\"Row\") and @class=\"tr\"]["+ln+"]/div[6]/div")).getText();
			String tributoBusqueda = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@aria-label,\"Row\") and @class=\"tr\"]["+ln+"]/div[7]/div")).getText();
			String grupoBusqueda = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@aria-label,\"Row\") and @class=\"tr\"]["+ln+"]/div[8]/div")).getText();
			String estruturaBusqueda = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@aria-label,\"Row\") and @class=\"tr\"]["+ln+"]/div[9]/div")).getText();
			String ativoBusqueda = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@aria-label,\"Row\") and @class=\"tr\"]["+ln+"]/div[10]/div")).getText();
			
			if (idBusqueda.contains(idRegistro) ||nomeBusqueda.contains(idRegistro) || descricaoBusqueda.contains(idRegistro) 
					|| empresaBusqueda.contains(idRegistro) || tributoBusqueda.contains(idRegistro) ||grupoBusqueda.contains(idRegistro) 
					|| estruturaBusqueda.contains(idRegistro) || ativoBusqueda.contains(idRegistro))
				{
					sucesso.add(true);
				}else {
					sucesso.add(false);
				}
			

			System.out.println("----------------------------------------Prueba: "+ln+"--------------------------------------------");
			System.out.println(idBusqueda + " "+idBusqueda.contains(idRegistro));
			System.out.println(nomeBusqueda +  " "+nomeBusqueda.contains(idRegistro));
			System.out.println(descricaoBusqueda +  " "+descricaoBusqueda.contains(idRegistro));
			System.out.println(empresaBusqueda + " "+ empresaBusqueda.contains(idRegistro));
			System.out.println(tributoBusqueda +  " "+tributoBusqueda.contains(idRegistro));
			System.out.println(grupoBusqueda +  " "+grupoBusqueda.contains(idRegistro));
			System.out.println(estruturaBusqueda +  " "+estruturaBusqueda.contains(idRegistro));
			System.out.println(ativoBusqueda +  " "+ativoBusqueda.contains(idRegistro));
			System.out.println("---------------------------------------------------------------------------------------------------");
			
			
			ln= ln+1;
		}
		
		return sucesso;

	}
	

			

}
