package com.sap.timp.pageObjectModel.ATR.Estruturas.RelacionamentoEstruturas;


import java.net.URL;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;

public class RelacionamentoEstruturasCriarPO extends TestBaseSteven{

					 
	@FindBy(xpath = "//span[text()=\"Relacionamentos de Estruturas\"]")
	public WebElement relacionamentoEstruturas;
	
	@FindBy(xpath = "//span[contains(text(),\"Nov\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@class=\"group1-select\"]/div/div/div[2]")
	public WebElement grupo1;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"][1]")
	public WebElement grupo1O;
	
	@FindBy(xpath = "//div[@class=\"structure1-select\"]/div/div/div[2]")
	public WebElement estrutura1;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"][1]")
	public WebElement estrutura1O;
	
	@FindBy(xpath = "//div[@class=\"field-wrapper field1\"]/div/div[2]")
	public WebElement campoEstrutura1;
	
	@FindBy(xpath = "//li[text()=\"Código da filial\"][1]")
	public WebElement campoEstrutura1O;
	
	
	
	//segunda
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//div[@class=\"group2-select\"]/div/div/div[2]")
	public WebElement grupo2;

	@FindBy(xpath = "//li[text()=\"Empresa/Filial 1\"][1]")
	public WebElement grupo2OTQ1;
	
	@FindBy(xpath = "//li[text()=\"Empresa Filial\"][1]")
	public WebElement grupo2O;
	
	@FindBy(xpath = "//div[@class=\"structure2-select\"]/div/div/div[2]")
	public WebElement estrutura2;
	
	@FindBy(xpath = "//li[text()=\"Dados de Empresa/Filial\"][1]")
	public WebElement estrutura2O;
	
	@FindBy(xpath = "//div[@class=\"field-wrapper field2\"]/div/div[2]")
	public WebElement campoEstrutura2;
	
	@FindBy(xpath = "//li[text()=\"Código da filial\"][1]")
	public WebElement campoEstrutura2O;
	
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][2]/div/div[1]/div/div[2]")
	public WebElement campoEstrutura3;
	
	@FindBy(xpath = "//li[text()=\"UF da filial\"][1]")
	public WebElement campoEstrutura3O;
	
	@FindBy(xpath = "//div[@class=\"fieldRow-wrapper\"][2]/div/div[2]/div/div[2]")
	public WebElement campoEstrutura4;
	
	@FindBy(xpath = "//li[text()=\"UF da filial\"][1]")
	public WebElement campoEstrutura4O;
	
	
	@FindBy(xpath = "//div[@id=\"add-icon\"]")
	public WebElement adicionar;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Fim\")]")
	public WebElement dataFim;
	
	public RelacionamentoEstruturasCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> criar() {
		
		String url = driver.getCurrentUrl();
		
		boolean tq1 = false;
		
		if (url.contains("tq1")) {
			tq1 = true;
		}
		
		relacionamentoEstruturas.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		int rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idAC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id antes da criação: " + idAC);
	
		
		novo.click();
		
	
	
		//waitExpectElement(grupo1);
		sleep(28000);
	
		grupo1.click();
		sleep(1000);
		grupo1O.click();
		sleep(3000);
		
		estrutura1.click();
		sleep(1000);
		estrutura1O.click();
		sleep(6000);
		
		campoEstrutura1.click();
		sleep(1000);
		campoEstrutura1O.click();
		sleep(1000);
		
		
		grupo2.click();
		if (tq1==true) {
			grupo2OTQ1.click();
			
		}else {
			grupo2O.click();
		}
		
		sleep(1000);
		
		estrutura2.click();
		sleep(1000);
		estrutura2O.click();
		sleep(3000);
		
		campoEstrutura2.click();
		sleep(1000);
		campoEstrutura2O.click();
		sleep(1000);
		
		
		adicionar.click();
		sleep(2000);
		
		campoEstrutura3.click();
		sleep(1000);
		campoEstrutura3O.click();
		sleep(1000);
		
		campoEstrutura4.click();
		sleep(1000);
		campoEstrutura4O.click();
		sleep(1000);
		
		dataVigencia.sendKeys("02/01/1978");
		sleep(1000);
		
		dataFim.sendKeys("31/12/1979");
		sleep(1000);
		
		gravar.click();
		
		invisibilityOfElementOverlay();
		
		relacionamentoEstruturas.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		rows = rows("//div[@class=\"tr\" and @data-id]");
		
		String idDC = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("Id após da criação: " + idDC);
		idInserir("RelacionamentoEstruturasCriar",idDC);
		
		int idACI = convertToInt(idAC);
		int idADI = convertToInt(idDC);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		if (idACI < idADI) {
			sucesso.add(true);
		} else {
			sucesso.add(false);
		}
		
		System.out.println("Id criado com sucesso: " +sucesso.get(0));
		
		System.out.println("---------------------------Verificação das Informações-------------------------------------------");
		
		String estrutura1S =driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[4]/div")).getText();
		String estrutura2S =driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[5]/div")).getText();
		String dataVigenciaS =driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[6]/div")).getText();
		String dataFimS =driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]["+rows+"]/div[7]/div")).getText();
		
		System.out.println(estrutura1S);
		System.out.println(estrutura2S);
		System.out.println(dataVigenciaS);
		System.out.println(dataFimS);
		
		sucesso.add(estrutura1S.equals("Ajustes Fiscais"));
		sucesso.add(estrutura2S.equals("Dados de Empresa/Filial"));
		sucesso.add(dataVigenciaS.equals("02/01/1978"));
		sucesso.add(dataFimS.equals("31/12/1979"));
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
		
	}
	
	
	
	
	
}
