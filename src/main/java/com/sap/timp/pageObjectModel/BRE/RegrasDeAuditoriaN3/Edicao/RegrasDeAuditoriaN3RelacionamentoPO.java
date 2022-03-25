package com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN3.Edicao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegrasDeAuditoriaN3RelacionamentoPO extends TestBaseSteven{
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-a_rules\"]/div/span[text()=\"Regras de Auditoria N3\"]")
	public WebElement regraAuditoriaN3;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Selecionar Relacionamento\"]")
	public WebElement relacionamento;
	
	@FindBy(xpath = "//div[@class=\"structure-relation-select\"]/div/div/div[2]")
	public WebElement relacionamentoestrutura;
	
	@FindBy(xpath = "//div[@id=\"50\"]/div[2]")
	public WebElement opcaorelacionamentotq1;
	
	@FindBy(xpath = "//div[@id=\"14\"]/div[2]")
	public WebElement opcaorelacionamentotp1;
	
	@FindBy(xpath = "//div[@id=\"39\"]/div[2]")
	public WebElement opcaorelacionamentotc2;

		
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarcaminho;
	
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement Justificactiva;
	
	@FindBy(xpath = "//div[@id=\"justification\"]/div/textarea")
	public WebElement justificativa;
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@id=\"graph\"]")
	public WebElement regla;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	public RegrasDeAuditoriaN3RelacionamentoPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean relacionamento() {
		
		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regraAuditoriaN3.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = false;
		
		//String idRegistro = idObter2();
		String idRegistro = idObter("An3");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectElement(adicionarcaminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		relacionamento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(relacionamentoestrutura);
		sleep(2000);
		relacionamentoestrutura.click();
		sleep(2000);
		if(tq1== true)
		{
			opcaorelacionamentotq1.click();
			sleep(2000);
			closeSelectTypeCheckbox(relacionamentoestrutura);
			
			
		}else if(tp1 == true)
		{
			opcaorelacionamentotp1.click();
			sleep(2000);
			closeSelectTypeCheckbox(relacionamentoestrutura);
			
		}else {
			opcaorelacionamentotc2.click();
			sleep(2000);
			closeSelectTypeCheckbox(relacionamentoestrutura);
			
		}
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		nao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);

		menu1.click();
		sleep(1000);
		editar1.click();
		sleep(2000);
		waitExpectElement(adicionarcaminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		relacionamento.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(relacionamentoestrutura);
		sleep(19000);
		
		
		if(tq1== true)
		{
			int relacionamentoestrutura1 = driver.findElements(By.xpath("//div[@id=\"multipleControlerId-50\"]")).size();
			if(relacionamentoestrutura1 == 0)
			{
				System.out.println("Não consta");
				sucesso = false;
			}else {
				System.out.println("Sim está associado");
				sucesso = true;
			}
			
		}else if(tp1 == true)
		{
			int relacionamentoestrutura1 = driver.findElements(By.xpath("//div[@id=\"multipleControlerId-14\"]")).size();
			if(relacionamentoestrutura1 == 0)
			{
				System.out.println("Não consta");
				sucesso = false;
			}else {
				System.out.println("Sim está associado");
				sucesso = true;
			}
		}else {
			int relacionamentoestrutura1 = driver.findElements(By.xpath("//div[@id=\"multipleControlerId-39\"]")).size();
			if(relacionamentoestrutura1 == 0)
			{
				System.out.println("Não consta");
				sucesso = false;
			}else {
				System.out.println("Sim está associado");
				sucesso = true;
			}
		}
				
		System.out.println(sucesso);
		return sucesso;
	}
}
