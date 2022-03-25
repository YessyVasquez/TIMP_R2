package com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RRGConfiguracaoDeAjusteCriarComDiaEspecificoPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Relatórios Refinaria Gerados\"]")
	public WebElement relatoriosRefineriaGerados;
	
	@FindBy(xpath = "//span[text()=\"Ajuste\"]")
	public WebElement btnAjuste;
	
	@FindBy(xpath = "//button[text()=\"Criar Ajuste\"]")
	public WebElement btnCriarAjuste;
	
	@FindBy(xpath = "//div[@id=\"outputSelect\"]/div/div/div[2]")
	public WebElement cboCamposSaida;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcionCombo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Data de Lançamento\"]")
	public WebElement inputDataDeLancamento;
	
	@FindBy(xpath = "//button[@id=\"credit-adjustment-code-button\"]")
	public WebElement btnCodigoAjuste;
	
	@FindBy(xpath = "//button[text()=\"Selecionar\"]")
	public WebElement btnSeleccionar;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement btnCriar;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement btnFechar;
	
	public RRGConfiguracaoDeAjusteCriarComDiaEspecificoPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criarComDiaEspecifico() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		relatoriosRefineriaGerados.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnAjuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idPrimero = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id][1]/div[2]/div")).getText();
		System.out.println("Primer ID: " + idPrimero);
		
		waitExpectElement(btnCriarAjuste);
		btnCriarAjuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		cboCamposSaida.click();
		sleep(1000);
		opcionCombo.click();
		sleep(1000);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String fechaLancamentoString = fechaActual();
		inputDataDeLancamento.sendKeys(fechaLancamentoString);
		sleep(1000);
		
		actionsMoveToElementElement(btnCodigoAjuste);
		btnCodigoAjuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement flag = driver.findElement(By.xpath("//div[@class=\"adjustment-table-container\"]/div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id][1]/div[1]/label/span"));
		sleep(1000);
		
		flag.click();
		sleep(1000);
		btnSeleccionar.click();
		sleep(2000);
		
		btnCriar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(9000);
		relatoriosRefineriaGerados.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnAjuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idPrimeroNuevo = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id][1]/div[2]/div")).getText();
		System.out.println("Primer ID luego de agregar: " + idPrimeroNuevo);
		
		boolean sucesso = false;
		
		if(convertToInt(idPrimeroNuevo) > convertToInt(idPrimero)) {
			System.out.println("Registro creado...");
			sucesso = true;
		}else {
			System.out.println("No se pudo crear el registro...");
			sucesso = false;
		}
		
		WebElement menu = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div//div[@data-id=\""+idPrimeroNuevo+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div//div[@data-id=\""+idPrimeroNuevo+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		
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
		
		sleep(2000);
		relatoriosRefineriaGerados.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnAjuste.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String id= driver.findElement(By.xpath("//div[@id=\"adjustment-table\"]/div/div/div/div[@class=\"tbody\"]/div[@class=\"tr\" and @data-id][1]/div[2]/div")).getText();
		System.out.println("Primer ID luego de excluir: " + id);
		
		if(convertToInt(id) == convertToInt(idPrimero)) {
			System.out.println("El primer valor es el original antes de todo el proceso de registro...");
			sucesso =  true;
		}else {
			System.out.println("No es el valor original que al inicio...");
			sucesso = false;
		}
		
		sleep(1000);
		btnFechar.click();
		
		return sucesso;
	}
}
