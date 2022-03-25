package com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.ContasParteBLALUR;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ContasParteBLALURCriarPO extends TestBaseSteven{
	
	
	
	

	@FindBy(xpath = "//span[text()=\"Cadastros IRPJ/CSLL\"]")
	public WebElement cadastrosIRPJCSLL;
	
	@FindBy(xpath = "//span[text()=\"Contas Parte B LALUR/LACS\"]")
	public WebElement contasParteBLALURLACS;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][1]")
	public WebElement primeira;
	

	
	@FindBy(xpath = "//span[contains(text(),\"Nova\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"companyId\"]/div/div[2]")
	public WebElement empresa;
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecionar Conta Parte B\")]")
	public WebElement contaParteB;

	@FindBy(xpath = "//div[@id=\"register-code-m010\"]/div/div[2]")
	public WebElement codigoPadrao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Descrição Conta\")]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Início\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	

	
	
	public ContasParteBLALURCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public boolean criar() {
		sleep(2000);
		cadastrosIRPJCSLL.click();
		sleep(1000);
		contasParteBLALURLACS.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		

		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
		
		System.out.println(id);
		
		novo.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		
		contaParteB.sendKeys("0123456789");
		
		codigoPadrao.click();
		sleep(1000);
		opcao.click();
		sleep(1000);

		descricao.sendKeys("Teste Conta Parte B LALUR/LACS");
		dataVigencia.sendKeys(fechaActual());
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);

		waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
	
		
		String id2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id][1]/div[2]/div")).getText();
		
		System.out.println(id);
		sleep(2000);
		idInserir("ContasParteBLALUR",id2);
		System.out.println(id2);
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(id2);
		
		boolean sucesso = false;
		
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		System.out.println(sucesso);
		
		
		return sucesso;
		
		
	}
}
