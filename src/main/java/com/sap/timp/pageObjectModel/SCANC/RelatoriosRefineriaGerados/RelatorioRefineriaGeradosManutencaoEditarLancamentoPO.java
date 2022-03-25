package com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RelatorioRefineriaGeradosManutencaoEditarLancamentoPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Relatórios Refinaria Gerados\"]")
	public WebElement relatorioRefineriaGerados;
	
	@FindBy(xpath = "//span[text()=\" Criar/Editar Lançamento\"]")
	public WebElement abaCriarEditarLancamento;
	
	@FindBy(xpath = "//span[text()=\"Lançamentos Realizados\"]")
	public WebElement abaLancamentoo;
	
	@FindBy(xpath = "//span[text()=\" Cancelar\"]")
	public WebElement btnCancelar;
	
	@FindBy(xpath = "//div[@id=\"communique\"]/div/div/input")
	public WebElement inputComunicado;
	
	@FindBy(xpath = "//span[text()=\" Gravar\"]")
	public WebElement btnGravar;
	
	public RelatorioRefineriaGeradosManutencaoEditarLancamentoPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean manutencaoEditarLancamento() {
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		relatorioRefineriaGerados.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String url = driver.getCurrentUrl();
		
		String idRegistro = "0";
		
		if(url.contains("tq1")) {
			idRegistro = "24";
		}
		
		if(url.contains("tc2")) {
			idRegistro = "9";
		}
		
		System.out.println("ID registro do ambiente: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acoe = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Manutenção \"]"));
		String periodo = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[7]/div")).getText();
		System.out.println("Periodo: " + periodo);
		
		menu.click();
		sleep(1000);
		acoe.click();
		sleep(3000);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		abaLancamentoo.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		menu = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[1]/div/div/span[2]"));
		acoe = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		acoe.click();
		sleep(3000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		actionsMoveToElementElement(btnCancelar);
		btnCancelar.click();
		sleep(2000);
		
		abaLancamentoo.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);
		
		menu = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[1]/div/div/span[2]"));
		acoe = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		acoe.click();
		sleep(3000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String comunicadoOriginalString = inputComunicado.getAttribute("value");
		System.out.println("Comunicado original: " + comunicadoOriginalString);
		
		String comunicadoNuevoString = "Teste Automatizado nuevo";
		System.out.println("Comunicado nuevo: " + comunicadoNuevoString);
		
		sleep(1000);
		inputComunicado.clear();
		sleep(1000);
		inputComunicado.sendKeys(comunicadoNuevoString);
		sleep(1000);
		
		btnGravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(abaLancamentoo);
		abaLancamentoo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		menu = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[1]/div/div/span[2]"));
		acoe = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		acoe.click();
		sleep(3000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String comunicadoModificado = inputComunicado.getAttribute("value");
		System.out.println("Comunicado modificado: " + comunicadoModificado);
		
		boolean sucesso = false;
		
		if(comunicadoModificado.equals(comunicadoNuevoString)) {
			sucesso = true;
			System.out.println("Datos confirmados...");
		}else {
			System.out.println("No se edito el registro...");
			sucesso = false;			
		}
		
		return sucesso;
	}
}
