package com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RRGConfiguracaoDeAjusteEditarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Relatórios Refinaria Gerados\"]")
	public WebElement relatoriosRefineriaGerados;
	
	@FindBy(xpath = "//span[text()=\"Ajuste\"]")
	public WebElement btnAjuste;
	
	@FindBy(xpath = "//div[@id=\"adjustment-table\"]/div/div[2]/div/div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;
	
	@FindBy(xpath = "//div[@id=\"outputSelect\"]/div/div/div[2]")
	public WebElement cboCamposSaida;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][2]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//div[@id=\"outputSelect\"]/div/div/div[1]/input")
	public WebElement inputCampoSaida;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement btnCriar;
	
	@FindBy(xpath = "//div[@class=\"base-dialog   big ui-draggable\"]/div[3]/button[text()=\"Fechar\"]")
	public WebElement btnFechar;

	public RRGConfiguracaoDeAjusteEditarPO(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
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
		
		String idRegistro = idObter4();
		WebElement menu = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String campoSaiStringOriginal = inputCampoSaida.getAttribute("value");
		System.out.println("Valor Campo Saida original: " + campoSaiStringOriginal);
		
		// Seleccionamos un nuevo valor
		cboCamposSaida.click();
		sleep(1000);
		opcionCombo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String campoSaiStringNuevo = inputCampoSaida.getAttribute("value");
		System.out.println("Valor Campo Saida Nuevo: " + campoSaiStringNuevo);
		btnCriar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
				
		driver.navigate().refresh();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(6000);
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
		
		menu = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String campoSaiStringOriginal2 = inputCampoSaida.getAttribute("value");
		System.out.println("Valor Campo Saida ya editado: " + campoSaiStringOriginal2);
		
		boolean sucesso = false;
		
		if(campoSaiStringOriginal2.equals(campoSaiStringNuevo)) {
			sucesso = !sucesso;
			System.out.println("Registro editado satisfactoriamente...");
		}else {
			sucesso = false;
			System.out.println("El registro no fue editado...");
		}
		
		sleep(2000);
		btnFechar.click();
		
		return sucesso;
	}
}
