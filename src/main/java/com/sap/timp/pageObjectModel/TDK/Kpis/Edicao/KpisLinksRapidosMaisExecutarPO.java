package com.sap.timp.pageObjectModel.TDK.Kpis.Edicao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class KpisLinksRapidosMaisExecutarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement kpis;
	
	@FindBy(xpath = "//span[text()=\"KPI's Públicos\"]")
	public WebElement kpispublicos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Widget\"]")
	public WebElement adicionarwidget;
	
	@FindBy(xpath = "//button[text()=\"Criar Widget\"]")
	public WebElement criarwidget;
	
	@FindBy(xpath = "//div[text()=\"Links Rápidos\"]")
	public WebElement linksrapidos;
	
	@FindBy(xpath = "//input[@placeholder=\"Cabeçalho\"]")
	public WebElement cabecalho;
	
	@FindBy(xpath = "//span[@id=\"linkOptionsChooseLinkElement\"]/span")
	public WebElement pesquisa;
	
	@FindBy(xpath = "//label[@for=\"cb_3\"]/span")
	public WebElement id3;
	
	@FindBy(xpath = "//div[@id=\"filterTypeInput\"]/div/div/div[2]")
	public WebElement semfiltro;
	
	@FindBy(xpath = "//li[@id][text()=\"id\"]")
	public WebElement opcaosemfiltro;
	
	@FindBy(xpath = "//input[@placeholder=\"Valor do Filtro\"]")
	public WebElement valorfiltro;
	
	
	@FindBy(xpath = "//span[text()=\"Conteúdo\"]")
	public WebElement conteudo;
	
	@FindBy(xpath = "//div[@id=\"quick-links-container\"]")
	public WebElement link;
	
	@FindBy(xpath = "//li[@id][text()=\"Campos\"]")
	public WebElement opcaocolunas;
	
	@FindBy(xpath = "//div[@id=\"fields\"]/div/div[2]")
	public WebElement campos;
	
	@FindBy(xpath = "//li[@id][text()=\"Alíquota ICMS\"]")
	public WebElement opcaocampos;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement Aceitar;
	
	@FindBy(xpath = "//div[@class=\"base-dialog credit-trans-newAdjusment  big ui-draggable\"]/div[3]/button[2]")
	public WebElement aceitar;
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
	
	//@FindBy(xpath = "//div[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\"]")
	//@FindBy(xpath = "//div[@data-gs-width=\"7\"]/div[2]")
	//@FindBy(xpath = "//div[@id=\"right\"]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div/div[3]/div[2]")
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
	
	@FindBy(xpath = "//button[@id=\"home-icon\"]")
	public WebElement home;
	public KpisLinksRapidosMaisExecutarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> linksrapidos() {
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
		
		adicionarwidget.click();
		
		waitExpectElement(linksrapidos);
		sleep(2000);
		linksrapidos.click();
		sleep(2000);
		
		
		criarwidget.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(cabecalho);
		sleep(2000);
		cabecalho.sendKeys("Cabecalho");
		sleep(2000);
		String URL = driver.getCurrentUrl();
		
		
		conteudo.click();
		sleep(2000);
		pesquisa.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		id3.click();
		sleep(2000);
		waitExpectElement(aceitar);
		sleep(2000);
		aceitar.click();
		sleep(2000);
		semfiltro.click();
		sleep(2000);
		opcaosemfiltro.click();
		
		if((URL.contains("tq1"))){
			valorfiltro.sendKeys("8005139");
			sleep(2000);
		}else if(URL.contains("tp1")) {
			valorfiltro.sendKeys("1747");
			sleep(2000);
		}else {
			valorfiltro.sendKeys("2285");
			sleep(2000);
		}
		waitExpectElement(Aceitar);
		sleep(2000);
		Aceitar.click();
		sleep(2000);
		waitExpectElement(link);
		sleep(2000);
		new Actions(driver).moveToElement(link).click().perform();
		sleep(2000);
		moveToElement(flechita, driver.findElement(By.xpath("//div[@class=\"main-footer\"]/div[1]/div[3]")));
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
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int link1 = driver.findElements(By.xpath("//div[@id=\"quick-links-container\"]")).size();
		
		if(link1 == 0)
		{
			System.out.println("Link rapido foi removido");
			sucesso.add(false);
		}else {
			System.out.println("Link rapido consta na pagina de edicao");
			sucesso.add(true);
		}
		
		execucao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(link);
		sleep(2000);
		fechar.click();
		sleep(2000);
		executarElement.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		fechar.click();
		sleep(2000);
		textolink.click();
		sleep(2000);
		//Aqui vai pra outra aba
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		waitExpectElement(home);
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		WebElement totalElement= driver.findElement(By.xpath("//div[@id=\"table-report-wrapper\"]/div/div[3]/div[2]/div"));
		if(totalElement.isDisplayed()) {
			System.out.println("Link executado com sucesso");
			sucesso.add(true);
		}else {
			System.out.println("Link não executado com sucesso");
			sucesso.add(false);
		}
		System.out.println(sucesso);
		return sucesso;
	}


}
