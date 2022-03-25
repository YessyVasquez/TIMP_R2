package com.sap.timp.pageObjectModel.TDK.Kpis.Edicao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class KpisCartaoIndicadorEditarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Kpi's\"]")
	public WebElement kpis;
	
	@FindBy(xpath = "//span[text()=\"KPI's Públicos\"]")
	public WebElement kpispublicos;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	
	@FindBy(xpath = "//div[@id=\"indicator-card-container\"]")
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
	
	public KpisCartaoIndicadorEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean CartaoIndicador() {
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
		
		cartaoindicador.click();
		
		sleep(2000);
		
		
		icone.click();
		sleep(2000);
		iconeeditar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(cabecalho);
		sleep(6000);
		
		conteudo.click();
		sleep(4000);
		campos.click();
		sleep(2000);
		opcaocampos.click();
		sleep(2000);
		String camposestruturaString=campoestrutura.getAttribute("value");
		System.out.println(camposestruturaString);
		sleep(2000);
		subtitulo.click();
		sleep(2000);
		Aceitar.click();
		sleep(2000);
		
	
		Gravar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String cartao = textocartao.getText();
		System.out.println(cartao);
		boolean sucesso = cartao.contains(camposestruturaString);
		System.out.println(sucesso);
		return sucesso;
	}


}
