package com.sap.timp.pageObjectModel.MDR.TaxasDeAtualização.ConfiguraçãoDeTipoTaxaDeAtualização;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ConfiguraçãoDeTipoTaxaDeAtualizaçãoDetallesPO extends TestBaseMassiel {
	
	@FindBy(xpath = "//span[text()=\"Taxas de Atualização\"]")
	public WebElement Taxas;
	
	//submenu
	@FindBy(xpath = "//span[text()=\"Configuração de Tipo Taxa de Atualização\"]")
	public WebElement Configuracao;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;

	@FindBy(xpath = "//div[@class=\"action-button\"]")
	public WebElement botonMenu;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement codigo;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement NomeIndice;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement Descripcao;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement TipoIndice;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement Moneda;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement InicioVigencia;

	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[8]/div/div")
	public WebElement FimVigencia;
	
	@FindBy(xpath ="//span[@id=\"indexCode\"]")
	public WebElement codigo1;
	
	@FindBy(xpath ="//span[@id=\"indexName\"]")
	public WebElement NomeIndice1;
	
	@FindBy(xpath ="//span[@id=\"indexDescription\"]")
	public WebElement Descripcao1;
	
	@FindBy(xpath ="//span[@id=\"indexType\"]")
	public WebElement TipoIndice1;
	
	@FindBy(xpath ="//span[@id=\"coinIndex\"]")
	public WebElement Moneda1;
	
	@FindBy(xpath ="//span[@id=\"indexStartDate\"]")
	public WebElement InicioVigencia1;

	@FindBy(xpath ="//span[@id=\"indexEndDate\"]")
	public WebElement FimVigencia1;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-left\")][2]")
	public WebElement btnPrimerPagina;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement cerrar;
	
	public ConfiguraçãoDeTipoTaxaDeAtualizaçãoDetallesPO() {
		PageFactory.initElements(driver, this);
		
	}
	
	public  ArrayList<Boolean> Detalle() {
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		Taxas.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		Configuracao.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro =idObter("configuracaodetipotaxadeatualizacao");
		System.out.println(idRegistro);
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalle = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		detalle.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String textoCodigo = codigo.getText();
		String textoNomeIndice = NomeIndice.getText();
		String textoDescripcao = Descripcao.getText();
		String textoTipoIndice = TipoIndice.getText();
		String textoMoneda = Moneda.getText();
		String textoInicioVigencia = InicioVigencia.getText();
		String textoFinVigencia = FimVigencia.getText();
		
		System.out.println("Código de Indice : " + textoCodigo);
		System.out.println("Nombre de Indice : " + textoNomeIndice);
		System.out.println("Descripcion de Indice : " + textoDescripcao);
		System.out.println("Tipo  de Indice:" + textoTipoIndice);
		System.out.println("Moneda:" + textoMoneda);
		System.out.println("Inicio Vigemcia:" + textoInicioVigencia);
		System.out.println("Fim Vigencia:" + textoFinVigencia);
		sleep(2000);
		cerrar.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		btnPrimerPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoCodigo1 = codigo1.getText();
		String textoNomeIndice1 = NomeIndice1.getText();
		String textoDescripcao1 = Descripcao1.getText();
		String textoTipoIndice1 = TipoIndice1.getText();
		String textoMoneda1 = Moneda1.getText();
		String textoInicioVigencia1 = InicioVigencia1.getText();
		String textoFinVigencia1 = FimVigencia1.getText();
		
		System.out.println("-------------------------------------------");
		System.out.println("Código de Indice : " + textoCodigo1);
		System.out.println("Nombre de Indice : " + textoNomeIndice1);
		System.out.println("Descripcion de Indice : " + textoDescripcao1);
		System.out.println("Tipo  de Indice:" + textoTipoIndice1);
		System.out.println("Moneda:" + textoMoneda1);
		System.out.println("Inicio Vigemcia:" + textoInicioVigencia1);
		System.out.println("Fim Vigencia:" + textoFinVigencia1);
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(textoCodigo1.equals(textoCodigo));
		sucesso.add(textoNomeIndice1.equals(textoNomeIndice));
		sucesso.add(textoDescripcao1 .equals(textoDescripcao));
		sucesso.add(textoTipoIndice1.equals(textoTipoIndice));
		sucesso.add(textoMoneda1.equals(textoMoneda));
		sucesso.add(textoInicioVigencia.equals(textoInicioVigencia1));
		sucesso.add(textoFinVigencia1.equals(textoFinVigencia));
		System.out.println(sucesso);

		return sucesso;
	
	}
	
}

