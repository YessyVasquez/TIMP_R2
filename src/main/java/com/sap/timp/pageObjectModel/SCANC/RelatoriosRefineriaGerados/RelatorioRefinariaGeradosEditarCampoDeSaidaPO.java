package com.sap.timp.pageObjectModel.SCANC.RelatoriosRefineriaGerados;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RelatorioRefinariaGeradosEditarCampoDeSaidaPO extends TestBaseFernando {
	@FindBy(xpath = "//span[text()=\"Relatórios Refinaria Gerados\"]")
	public WebElement relatorioRefineriaGerados;
	
	@FindBy(xpath = "//span[text()=\"Campos Saída \"]")
	public WebElement camposSaida;
	
	@FindBy(xpath = "//div[@id=\"create-description\"]/div/textarea")
	public WebElement descricao;
	
	@FindBy(xpath = "//button[text()=\" Criar\"]")
	public WebElement btnCriar;
	
	@FindBy(xpath = "//div[@class=\"base-dialog   big ui-draggable\"]/div[3]/button[text()=\"Fechar\"]")
	public WebElement btnFechar;
	
	public RelatorioRefinariaGeradosEditarCampoDeSaidaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {
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
		WebElement açao = driver.findElement(By.xpath("//div[@class=\"dialog-content wide\"]/div/div[2]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		actionsMoveToElementElement(descricao);
		
		String descricaoOriginalString = descricao.getAttribute("value");
		System.out.println("Descricaco Original: " + descricaoOriginalString);
		
		String descricaoNuevoString = "TESTE AUTOMATIZADO EDITADO";
		System.out.println("Descricaco Nuevo: " + descricaoNuevoString);
		
		sleep(1000);
		descricao.clear();
		sleep(1000);
		descricao.sendKeys(descricaoNuevoString);
		sleep(1000);
		
		btnCriar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		driver.navigate().refresh();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
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
		
		menu = driver.findElement(By.xpath("//div[@class=\"dialog-content wide\"]/div/div[2]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@class=\"dialog-content wide\"]/div/div[2]/div/div/div/div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		actionsMoveToElementElement(descricao);
		String descricaoModificadolString = descricao.getAttribute("value");
		System.out.println("Descricaco modificado: " + descricaoModificadolString);
		
		boolean sucesso = false;
		
		if(descricaoModificadolString.equals(descricaoNuevoString)){
			System.out.println("Registro editado...");
			sucesso = true;
		}else {
			System.out.println("Registro no se pudo editar...");
			sucesso = false;
		}
		
		btnFechar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		return sucesso;
	}
}
