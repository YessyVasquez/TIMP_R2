package com.sap.timp.pageObjectModel.MDR.EventosESocial.S1250AquisicaoDeProducaoRural.S1250DetAquisição;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class S1250DetAquisiçãoExcluirPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"S1250 - Aquisição de Produção Rural\"]")
	public WebElement s1250;
	
	@FindBy(xpath = "//span[text()=\"Eventos e-Social\"]")
	public WebElement eventosesocial;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[5]/span/span")
	public WebElement detAdquisicao;
	
	@FindBy(xpath = "//*[@id=\"acquisition-det-list\"]/div/div[2]/div/div[1]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement sim;
	
	public S1250DetAquisiçãoExcluirPO() {

		PageFactory.initElements(driver, this);
	}
	
	public Boolean excluir() {
		
		sleep(2000);
		eventosesocial.click();
		sleep(2000);
		
		s1250.click();
		
		sleep(2000);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		detAdquisicao.click();
		sleep(3000);
		
		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		String idRegistro2 = driver.findElement(By.xpath("//div[@id=\"acquisition-det-container\"]/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/div")).getAttribute("textContent");
		
		int idRegistro = convertToInt(idRegistro2);
		System.out.println("REGISTRO "+idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@id=\"acquisition-det-container\"]/div[2]/div/div[1]/div/div[3]/div[1]/div[1]/div"));
		WebElement excluir = driver.findElement(By.xpath("//*[@id=\"acquisition-det-list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[2]/span[2]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		excluir.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		driver.navigate().refresh();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(13000);
		
		detAdquisicao.click();
		sleep(3000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String id = driver.findElement(By.xpath("//div[@id=\"acquisition-det-container\"]/div[2]/div/div[1]/div/div[3]/div[1]/div[2]/div")).getText();
		
		int id1 = convertToInt(id);
		
		System.out.println(id1);
		System.out.println(idRegistro);
		
		boolean sucesso = false;
		
		if (id1 != idRegistro) {
			sucesso= true;
		}
		System.out.println( sucesso);
		return sucesso;

		
		
		
	}
	
}
