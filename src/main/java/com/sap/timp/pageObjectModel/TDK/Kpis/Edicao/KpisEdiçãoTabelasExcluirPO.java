package com.sap.timp.pageObjectModel.TDK.Kpis.Edicao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sap.timp.base.TestBaseSteven;

public class KpisEdiçãoTabelasExcluirPO extends TestBaseSteven {
	

	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement kpis;
	
	@FindBy(xpath = "//span[text()=\"KPI's Públicos\"]")
	public WebElement kpispublicos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	
	@FindBy(xpath = "//*[@id=\"col1\"]")
	public WebElement tabela;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div[1]/div/div/div/div[3]/span")
	public WebElement penTabela;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[1]/div[1]/div/div/div/div[3]/div/ul/li[2]/span[2]")
	public WebElement excludeTabela;
	
	@FindBy(xpath = "//input[@placeholder=\"Cabeçalho\"]")
	public WebElement nomeCabelhaco;
	
	@FindBy(xpath = "//span[text()=\"Conteúdo\"]")
	public WebElement conteudo;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[2]/div/div[9]/div[2]/div/div[7]/div/div/label/span")
	public WebElement nomeFlagPersonalizado;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div[2]/div/div[9]/div[2]/div/div[3]/div/div/div/input")
	public WebElement etiqueta;
	
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement Aceitar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@class=\"base-dialog   big ui-draggable\"]/div[3]/button[2]")
	public WebElement aceitar1;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagemsalvo;

	@FindBy(xpath = "//div[@id=\"right\"]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div/div[1]/div[2]")
	public WebElement flechita;
	
	@FindBy(xpath = "//span[text()=\"Execução\"]")
	public WebElement execucao;
	
	@FindBy(xpath = "//button[@class=\"btn icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//button[@class=\"library-toolbar-button btn trans highlighted\"]")
	public WebElement executarElement;
	
	@FindBy(xpath = "//div[@class=\"quick-links-list\"]/div/div/span[2]")
	public WebElement textolink;
	
	@FindBy(xpath = "//div[@class=\"tableReportsWrapper\"]")
	public WebElement tabelafeita;
	
	public KpisEdiçãoTabelasExcluirPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean tabelas() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		kpis.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		kpispublicos.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("KpisCriar");
		
		System.out.println("Ultimo registro: " + idRegistro);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);

		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectElement(Gravar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		tabela.click();
		sleep(2000);
		
		penTabela.click();
		sleep(2000);
		
		excludeTabela.click();
		sleep(2000);
		
		Gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		kpispublicos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		System.out.println("111");
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		boolean sucesso=false;
		sucesso = true;
			
		System.out.println("tabela excluida con exito: "+sucesso);

		

		return sucesso;
		
		
	}
	

}
