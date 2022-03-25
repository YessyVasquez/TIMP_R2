package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.TabelaCodigoDaSituaçaoTributaria;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaCodigoDaSituaçaoTributariaVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"4.3.3 Tabela Código da Situação Tributária referente ao PIS/PASEP e COFINS\"]")
	public WebElement tabelacodigo;
	
	@FindBy(xpath = "//span[text()=\"Novo Código da Situação Tributária referente ao PIS/PASEP e COFINS\"]")
	public WebElement novocodigo;
	
	@FindBy(xpath = "//div[@id=\"select\" and @class=\"base-select-wrapper\"]/div[2]")
	public WebElement tributo;
	
	@FindBy(xpath = "//li[@id][1]")
	public WebElement opcaotributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Código CST\"]")
	public WebElement codigocst;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher a descrição do Código da Situação Tributária referente ao PIS/PASEP e COFINS\"]")
	public WebElement descricao;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
	public WebElement datadeiniciodevigencia;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a Data de Inicio de Vigência \"]")
	public WebElement datavigencia;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributoV;
	@FindBy(xpath = "//span[@id=\"cstCode\"]")
	public WebElement codigoV;
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"validityFrom\"]")
	public WebElement dataVigenciaV;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Tributo\")]")
	public WebElement tributoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Código CST\")]")
	public WebElement codigoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"descrição\")]")
	public WebElement descricaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Selecione a Data de Início de Vigência \")]")
	public WebElement dataVigenciaE;

	
	public TabelaCodigoDaSituaçaoTributariaVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		
		tabelacodigo.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("tabelacodigodasituacaotributaria");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		açao.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String tributoV1 = tributoV.getText();
		String codigoV1 = codigoV.getText();
		String descricaoV1 = descricaoV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();

		
		System.out.println(tributoV1);
		System.out.println(codigoV1);
		System.out.println(descricaoV1);
		System.out.println(dataVigenciaV1);

		
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		String tributoE1 = tributoE.getAttribute("value");
		String codigoaE1 = codigoE.getAttribute("value");
		String descricaoE1 = descricaoE.getAttribute("value");
		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");

		
		System.out.println(tributoE1);
		System.out.println(codigoaE1);
		System.out.println(descricaoE1);
		System.out.println(dataVigenciaE1);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(tributoV1.contains(tributoE1));
		sucesso.add(codigoV1.contains(codigoaE1));
		sucesso.add(descricaoV1.contains(descricaoE1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaE1));
		
		System.out.println(sucesso);


		return sucesso;
	}
}
