package com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RRGConfiguracaoDeAjusteExcluirPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Relatórios Refinaria Gerados\"]")
	public WebElement relatoriosRefineriaGerados;
	
	@FindBy(xpath = "//span[text()=\"Ajuste\"]")
	public WebElement btnAjuste;
	
	@FindBy(xpath = "//div[@id=\"adjustment-table\"]/div/div[2]/div/div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement btnFechar;

	public RRGConfiguracaoDeAjusteExcluirPO(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean excluir() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(1000);
		relatoriosRefineriaGerados.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnAjuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idPrimero = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id][1]/div[2]/div")).getText();
		System.out.println("Primer ID: " + idPrimero);
		
		String idRegistro = idObter4();
		System.out.println("ID a Eliminar: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
				
		driver.navigate().refresh();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(4000);
		relatoriosRefineriaGerados.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnAjuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnPrimeraPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String id = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id][1]/div[2]/div")).getText();
		System.out.println("Primer ID despues de excluir: " + id);
		
		boolean sucesso = false;
		
		if(convertToInt(id) != convertToInt(idPrimero)) {
			sucesso = !sucesso;
			System.out.println("Registro excluido satisfactoriamente...");
		}else {
			sucesso = false;
			System.out.println("El registro no fue excluido...");
		}
		
		sleep(2000);
		btnFechar.click();
		
		return sucesso;
	}
}
