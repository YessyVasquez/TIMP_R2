package com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DashboardTabelaExcluirPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement kpis;
	
	@FindBy(xpath = "//span[text()=\"Dashboards Públicos\"]")
	public WebElement dashboardspublicos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	
	@FindBy(xpath = "//span[text()=\"Execução\"]")
	public WebElement execucao;
	
	@FindBy(xpath = "//button[@class=\"library-toolbar-button btn trans highlighted\"]")
	public WebElement executar;
	
	@FindBy(xpath = "//div[@class=\"header-title\"][text()=\"Alíquota ICMS\"]")
	public WebElement tabela;
	
	@FindBy(xpath = "//button[@class=\"btn icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//div[@class=\"tableReportsWrapper\"]/div/div[2]/div[1]/div[1]/div")
	public WebElement aliquota;
	
	@FindBy(xpath = "//div[@class=\"tableReportsWrapper\"]/div/div[2]/div[1]/div[2]/div")
	public WebElement bc;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes Fiscais\"]")
	public WebElement opcaoestrutura;
	
	
	@FindBy(xpath = "//span[text()=\"Conteúdo\"]")
	public WebElement conteudo;
	
	@FindBy(xpath = "//div[@id=\"type\"]/div/div/div[2]")
	public WebElement colunas;
	
	@FindBy(xpath = "//li[@id][text()=\"Campos\"]")
	public WebElement opcaocolunas;
	
	@FindBy(xpath = "//div[@id=\"fields\"]/div/div[2]")
	public WebElement campos;
	
	@FindBy(xpath = "//li[@id][text()=\"Valor ICMS\"]")
	public WebElement opcaocampos;
	
	@FindBy(xpath = "//input[@placeholder=\"Campo de estrutura \"]")
	public WebElement campoestrutura;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	

	
	@FindBy(xpath = "//div[@class=\"edit-icon\"]/span")
	public WebElement icone;

	@FindBy(xpath = "//div[@class=\"edit-options\"]/ul/li/span[@class=\"symbol icon-font-Formatting-and-Tool icon-pensil\"]")
	public WebElement iconeeditar;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement Aceitar;
	
	@FindBy(xpath = "//div[@id=\"header-name\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//span[text()=\"Conteúdo\"]")
	public WebElement condeudo;
	
	@FindBy(xpath = "//div[@class=\"base-dialog   wide ui-draggable\"]/div[2]/div/div/div/div[2]/div/div[2]/div/div[9]/div[2]/div/div[7]/div/div/label/span")
	public WebElement nomepersonalizado;
	
	@FindBy(xpath = "//div[@id=\"tabs\"]/div/div[2]/div/div[2]/div/div[9]/div[2]/div/div[3]/div/div/div/input")
	public WebElement etiqueta2;
	
	@FindBy(xpath = "//div[@class=\"edit-options\"]/ul/li[2]/span[@class=\"symbol icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement iconeexcluir;
	
	public DashboardTabelaExcluirPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean TabelaExcluir() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		dashboardspublicos.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("dashboardsCriar");
		
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
		icone.click();
		sleep(2000);
		iconeexcluir.click();
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		Gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		dashboardspublicos.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
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
		waitExpectElement(Gravar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		boolean sucesso = false;
		int exclusaotabela=driver.findElements(By.xpath("//div[@class=\"header-title\"][text()=\"Alíquota ICMS\"]")).size();
		
		if(exclusaotabela == 0) {
			System.out.println("Tabela excluida");
			sucesso=true;
		}else {
			System.out.println("Tabela continua na edição");
			sucesso=false;
		}
		
		
		
		
		
		
		System.out.println(sucesso);
		return sucesso;
	}

}
