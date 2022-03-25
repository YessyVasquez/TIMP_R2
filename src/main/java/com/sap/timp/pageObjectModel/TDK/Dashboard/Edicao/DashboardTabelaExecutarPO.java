package com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DashboardTabelaExecutarPO extends TestBaseSteven {
	
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
	
	@FindBy(xpath = "//div[@id=\"subtitle-check\"]/div")
	public WebElement subtitulo;
	
	@FindBy(xpath = "//div[@class=\"edit-icon\"]/span")
	public WebElement icone;

	@FindBy(xpath = "//div[@class=\"edit-options\"]/ul/li/span[@class=\"symbol icon-font-Formatting-and-Tool icon-pensil\"]")
	public WebElement iconeeditar;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement Aceitar;
	
	@FindBy(xpath = "//div[@id=\"indicator-card-container\"]/div/pre")
	public WebElement textocartao;
	
	@FindBy(xpath = "//input[@placeholder=\"Etiqueta\"]")
	public WebElement etiqueta;
	
	public DashboardTabelaExecutarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean TabelaExecutar() {
		
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
		
		execucao.click();
		
		sleep(2000);
		waitExpectElement(tabela);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		fechar.click();
		sleep(2000);
		executar.click();
		sleep(2000);
		waitExpectElement(aliquota);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		fechar.click();
		sleep(2000);
		
		String aliquotaicms = aliquota.getText();
		String bcicms=bc.getText();
	
		System.out.println(aliquotaicms);
		System.out.println(bcicms);
		double valoraliquota = convertToDouble(aliquotaicms);
		double valorbc = convertToDouble(bcicms);
		
		System.out.println(valoraliquota);
		System.out.println(valorbc);
		boolean sucesso=false;
		if(valoraliquota == 12 && valorbc > 0)
		{
			sucesso=true;
		}else {
			sucesso=false;
		}
		
		System.out.println(sucesso);
		return sucesso;
	}

}
