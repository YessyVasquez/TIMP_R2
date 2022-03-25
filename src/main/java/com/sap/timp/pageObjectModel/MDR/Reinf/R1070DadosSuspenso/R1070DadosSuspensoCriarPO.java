package com.sap.timp.pageObjectModel.MDR.Reinf.R1070DadosSuspenso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class R1070DadosSuspensoCriarPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Reinf\"]")
	public WebElement Reinf;
	
	@FindBy(xpath = "//span[text()=\"R1070 - Dados de Suspensão\"]")
	public WebElement R1070DadosSuspenso;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[text()=\"Novo Reinf Dados de Suspensão\"]")
	public WebElement Novo;
	
	@FindBy(xpath = "//div[@class=\"field-element company\"]/div/div[2]/div/div[2]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div")
	public WebElement opc;
	
	@FindBy(xpath = "//div[@class=\"field-element branch\"]/div/div[2]/div/div[2]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][2]/div/div")
	public WebElement opc2;
	
	@FindBy(xpath = "//div[@class=\"field-element processType\"]/div/div[2]/div/div[2]")
	public WebElement tipoProcesso;
	
	@FindBy(xpath = "//div[@class=\"field-element processNumber\"]/div/div[2]/div/div[2]")
	public WebElement numeroProceso;
	
	@FindBy(xpath = "//div[@class=\"field-element suspensionCode\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement COD_SUSP;
	
	@FindBy(xpath = "//div[@class=\"field-element validFrom\"]/div/div[2]/div/div[2]")
	public WebElement ValidadeDe;
	
	@FindBy(xpath = "//div[@class=\"field-element suspensionIndicator\"]/div/div[2]/div/div[2]")
	public WebElement IndicadorSuspenso;
	
	@FindBy(xpath = "//div[@class=\"field-element wholeDepositIndicator\"]/div/div[2]/div/div[2]")
	public WebElement IndicativoDepósitoIntegral;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement butaosim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	public R1070DadosSuspensoCriarPO() {
		
		PageFactory.initElements(driver, this);
	
	}

	public boolean Criar() {
		
		sleep(2000);
		
		Reinf.click();
		sleep(4000);
		R1070DadosSuspenso.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			
		System.out.println(id);
			
		sleep(2000);
				//criaçao
		Novo.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		empresa.click();
		sleep(2000);
		
		opc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tipoProcesso.click();
		sleep(2000);
	
		opc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		numeroProceso.click();
		sleep(3000);
	
		opc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		COD_SUSP.sendKeys("1");
		sleep(2000);
	
		ValidadeDe.click();
		sleep(3000);
	
		opc.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		IndicadorSuspenso.click();
		sleep(3000);
	
		opc2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		IndicativoDepósitoIntegral.click();
		sleep(3000);
	
		opc2.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gravar.click();
		sleep(2000);
		
		butaosim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//Pega o ultimo id depois do preenchimento
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("DatosSuspensoCriar",idB);
		System.out.println(id);
		System.out.println(idB);
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;
		
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		System.out.println( sucesso);
		return sucesso;
		
	}
}
