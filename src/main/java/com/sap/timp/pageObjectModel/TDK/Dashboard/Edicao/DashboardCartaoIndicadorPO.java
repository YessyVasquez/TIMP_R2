package com.sap.timp.pageObjectModel.TDK.Dashboard.Edicao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseMassiel;

public class DashboardCartaoIndicadorPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement kpis;
	
	@FindBy(xpath = "//span[text()=\"Dashboards Públicos\"]")
	public WebElement dashboardspublicos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Widget\"]")
	public WebElement adicionarwidget;
	
	@FindBy(xpath = "//button[text()=\"Criar Widget\"]")
	public WebElement criarwidget;
	
	@FindBy(xpath = "//div[text()=\"Cartão Indicador\"]")
	public WebElement cartaoindicador;
	
	@FindBy(xpath = "//input[@placeholder=\"Cabeçalho\"]")
	public WebElement cabecalho;
	
	@FindBy(xpath = "//div[@id=\"select-group\"]/div/div[2]")
	public WebElement grupoestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajuste\"][1]")
	public WebElement opcaogrupo;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes\"][1]")
	public WebElement opcaogrupotp1;
	
	@FindBy(xpath = "//div[@id=\"select-structure\"]/div/div[2]")
	public WebElement estruturadedados;
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
	
	@FindBy(xpath = "//li[@id][text()=\"Alíquota ICMS\"]")
	public WebElement opcaocampos;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement Aceitar;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagemsalvo;
	public DashboardCartaoIndicadorPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> CartaoIndicador() {
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
		
		adicionarwidget.click();
		
		waitExpectElement(cartaoindicador);
		sleep(2000);
		cartaoindicador.click();
		sleep(2000);
		
		//waitExpectElement(criarwidget);
	//	sleep(20000);
		criarwidget.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(cabecalho);
		sleep(2000);
		cabecalho.sendKeys("Cabecalho");
		sleep(2000);
		String URL = driver.getCurrentUrl();
		
		grupoestrutura.click();
		sleep(2000);
		if((URL.contains("tp1"))){
			opcaogrupotp1.click();
			sleep(2000);
		}else {
			opcaogrupo.click();
			sleep(2000);
		}
		
		attributeToBeXpath("//div[@id=\"select-structure\"]/div", "class", "base-autocomplete required");
		sleep(4000);
		estruturadedados.click();
		sleep(2000);
		opcaoestrutura.click();
		sleep(2000);
		waitExpectElement(conteudo);
		sleep(2000);
		conteudo.click();
		sleep(2000);
		colunas.click();
		sleep(2000);
		opcaocolunas.click();
		sleep(2000);
		campos.click();
		sleep(2000);
		opcaocampos.click();
		sleep(2000);
		Aceitar.click();
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int cartaoindicador = driver.findElements(By.xpath("//div[@class=\"indicator-card base-card rounded all-border default-border-color default-card-color handler\"]")).size();
		
		if(cartaoindicador == 0)
		{
			System.out.println("Cartao indicador foi removido");
			sucesso.add(false);
		}else {
			System.out.println("Cartao indicador consta na pagina de edicao");
			sucesso.add(true);
		}
		Gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(mensagemsalvo);
		sleep(2000);
		if(mensagemsalvo.isDisplayed() && cartaoindicador > 0)
		{
			System.out.println("foi salva com sucesso e o cartao consta na pagina de edicao");
			sucesso.add(true);
		}else {
			System.out.println("Nao foi salva com sucesso e o cartao não consta na pagina de edicao");
			sucesso.add(false);
			
		}
		
		
		System.out.println(sucesso);
		return sucesso;
	}


}
