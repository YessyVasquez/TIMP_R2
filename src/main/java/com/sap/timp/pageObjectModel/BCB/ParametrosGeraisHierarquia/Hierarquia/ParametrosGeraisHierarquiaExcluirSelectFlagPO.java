package com.sap.timp.pageObjectModel.BCB.ParametrosGeraisHierarquia.Hierarquia;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ParametrosGeraisHierarquiaExcluirSelectFlagPO extends TestBaseKenssy {
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][1]")
	public WebElement hierarquias;

	@FindBy(xpath = "//span[text()=\"Hierarquia de Configuração\"]")
	public WebElement hierarquiaConfiguracao;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//button/span[contains(@class,\"icon-trash\")]")
	public WebElement iconLixeira;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement simLexeira;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimo;
	
	public ParametrosGeraisHierarquiaExcluirSelectFlagPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean excluirSeleccionandoFlag() {
		
		sleep(2000);
		hierarquias.click();
		sleep(1100);
		hierarquiaConfiguracao.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		String idRegistro = idObter1();

		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
//		pesquisar.sendKeys(idRegistro);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
		System.out.println("Registro que cree: "+idRegistro);

		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id="+idRegistro+"]/div[2]/label/span"));
															//div[@class="tr" and @data-id="433"]/div[2]/label/span
		check1.click();
		sleep(1000);
		
		iconLixeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		simLexeira.click();
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	//	waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		sleep(5000);
		
		driver.navigate().refresh();
		waitExpectElement(hierarquiaConfiguracao);
		sleep(10000);
		
		ultimo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		int rows = driver.findElements(By.xpath("//div[@class=\"tr\" and@data-id]")).size();
		
		
		String id2 = driver.findElement(By.xpath("//div[@class=\"tr\" and@data-id]["+rows+"]/div[4]/div")).getText();
//		pesquisar.sendKeys(idRegistro);
//		pesquisar.sendKeys(Keys.ENTER);
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
		
//		String id2 = driver.findElement(By.xpath("//div[@class=\"tr-no-data\"]/div[@class=\"td\"]")).getText();
		System.out.println(id2);
		
		boolean sucesso = false;
		//cadena1.equals(cadena2)
		if (id2 != idRegistro ) {
			sucesso= true;
		}else {
			sucesso= false;
		}
		
		return sucesso;
		
	}
}
