package com.sap.timp.pageObjectModel.BCB.ParametrosGeraisConfiguracao.Configuracao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ParametrosGeraisConfiguraçãoConfiguraçãoDetalhesPO extends TestBaseKenssy {

	// Configuracao
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][2]")
	public WebElement configuracoes;

	@FindBy(xpath = "//span[text()=\"Configuração da Consolidação\"]")
	public WebElement configuracaoDaConsolidacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	//DATOS DEL DETALHE
	@FindBy(xpath = "//div[@id=\"detail-description\"][1]/div[2]/div")
	public WebElement empresaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement ufD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement filialD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement tributoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement tipoApuracaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement nomeHierarquiaD;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fecharPanel;

	
	//DATOS DEL VISUALIZAR
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/label")
	public WebElement nombreHierarquiaV;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div/div/div[2]/div/div[4]/div/div[2]/label")
	public WebElement nombreHierarquiaVTC2;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[2]/div/div/div/div[2]/div/div[4]/div/div[2]/label")
	public WebElement nombreHierarquiaVTP1;
	
//	@FindBy(xpath = "//span[@id=\"id\"]")
//	public WebElement empresaV;
//	@FindBy(xpath = "//span[@id=\"id\"]")
//	public WebElement ufV;
//	@FindBy(xpath = "//span[@id=\"id\"]")
//	public WebElement filialV;
//	@FindBy(xpath = "//span[@id=\"id\"]")
//	public WebElement tributoV;
//	@FindBy(xpath = "//span[@id=\"id\"]")
//	public WebElement tipoApuracaoV;
//	@FindBy(xpath = "//span[@id=\"id\"]")
//	public WebElement nomeHierarquiaV;
	
	public ParametrosGeraisConfiguraçãoConfiguraçãoDetalhesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> parametrosGeraisDetalhes() {
		String url = driver.getCurrentUrl();
		
		sleep(2000);
		configuracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		configuracaoDaConsolidacao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter3();
		
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		System.out.println("Registro que cree:"+idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		//OBTENER VALORES DEL DETALLE
		String empresaDValor = empresaD.getText();
		String ufDValor = ufD.getText();
		String filialDValor = filialD.getText();
		String tributoDValor = tributoD.getText();
		String tipoApuracaoDValor = tipoApuracaoD.getText();
		String nomeHierarquiaDValor = nomeHierarquiaD.getText();
		
		//IMPRIMIR VALORES DEL DETALLE
		System.out.println("****Datos del detalle*********");
		System.out.println("Empresa:" + empresaDValor);
		System.out.println("UF: " + ufDValor);
		System.out.println("Filial: " + filialDValor);
		System.out.println("Tributo: " + tributoDValor);
		System.out.println("Tipo Apuracao: " + tipoApuracaoDValor);
		System.out.println("Nome de Hierarquia: " + nomeHierarquiaDValor);

		fecharPanel.click();
		sleep(3000);

		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		
		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectElement(nombreHierarquiaV);
		sleep(3000);
		
		String hierarquiaV = "";
		
		if (url.contains("tq1")) {
			hierarquiaV = nombreHierarquiaV.getText();
			System.out.println("Visualizar");
			System.out.println("Nome de Hierarquia: " + hierarquiaV);
			System.err.println("");
		} else if (url.contains("tc2")) {
			
			hierarquiaV = nombreHierarquiaVTC2.getText();
			System.out.println("Visualizar");
			System.out.println("Nome de Hierarquia: " + hierarquiaV);
			System.err.println("");
		}else {
			hierarquiaV = nombreHierarquiaVTC2.getText();
			System.out.println("Visualizar");
			System.out.println("Nome de Hierarquia: " + hierarquiaV);
			System.err.println("");
		}
		
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(nomeHierarquiaDValor.contains(hierarquiaV));
		System.out.println(sucesso);
		return sucesso;
		
//		System.out.println("***************--------------------------------------------*******************");
//		System.out.println("NO HAY DATOS EN VISUALIZAR PARA PODER COMPARAR CON DETALHES, BUG YA REPORTADO");
//		System.out.println("***************--------------------------------------------*******************");
	}
}
