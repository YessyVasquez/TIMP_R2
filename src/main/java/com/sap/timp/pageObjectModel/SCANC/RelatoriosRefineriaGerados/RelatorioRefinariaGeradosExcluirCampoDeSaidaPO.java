package com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RelatorioRefinariaGeradosExcluirCampoDeSaidaPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Relatórios Refinaria Gerados\"]")
	public WebElement relatorioRefineriaGerados;
	
	@FindBy(xpath = "//span[text()=\"Campos Saída \"]")
	public WebElement camposSaida;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement btnFechar;
	
	public RelatorioRefinariaGeradosExcluirCampoDeSaidaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean excluir() {
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		relatorioRefineriaGerados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		camposSaida.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String idRegistro = idObter4();
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"dialog-content wide\"]/div/div[2]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@class=\"dialog-content wide\"]/div/div[2]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
				
		driver.navigate().refresh();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		relatorioRefineriaGerados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		camposSaida.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"dialog-content wide\"]/div/div[2]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();

		String ultimoId = driver.findElement(By.xpath("//div[@class=\"dialog-content wide\"]/div/div[2]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]")).getAttribute("data-id");
		
		boolean sucesso = false;
		
		if(convertToInt(ultimoId) != convertToInt(idRegistro)) {
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
