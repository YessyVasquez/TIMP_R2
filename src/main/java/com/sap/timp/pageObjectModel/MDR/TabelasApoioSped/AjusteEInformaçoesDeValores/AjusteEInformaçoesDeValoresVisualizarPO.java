package com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.AjusteEInformaçoesDeValores;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AjusteEInformaçoesDeValoresVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio - SPED\"]")
	public WebElement tabelaApoioSped;
	
	@FindBy(xpath = "//span[text()=\"5.3 Ajustes e Informação de Valores Provenientes de Documento Fiscal\"]")
	public WebElement ajusteeinformacao;

	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	

	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//span[@id=\"Code\"]")
	public WebElement codigoV;
	@FindBy(xpath = "//span[@id=\"Origin\"]")
	public WebElement origemV;
	@FindBy(xpath = "//span[@id=\"UF\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"Sequence\"]")
	public WebElement sequenciaV;
	@FindBy(xpath = "//span[@id=\"ICMS\"]")
	public WebElement icmsV;
	@FindBy(xpath = "//span[@id=\"Description\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"Calculation\"]")
	public WebElement tipoApuracaoV;
	@FindBy(xpath = "//span[@id=\"Validity\"]")
	public WebElement dataVigenciaV;
	@FindBy(xpath = "//span[@id=\"Responsability\"]")
	public WebElement responsabilidadeV;
	@FindBy(xpath = "//span[@id=\"Pickup\"]")
	public WebElement influenciaV;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Código\")]")
	public WebElement codigoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"UF\")]")
	public WebElement ufE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Reflexo\")]")
	public WebElement icmsE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Tipo\")]")
	public WebElement tipoApuracaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Responsabilidade\")]")
	public WebElement responsabilidadeE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Influência\")]")
	public WebElement influenciaE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Origem\")]")
	public WebElement origemE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Sequência\")]")
	public WebElement sequenciaE;
	@FindBy(xpath = "//*[contains(@placeholder,\"descrição\")]")
	public WebElement descricaoE;
	@FindBy(xpath = "//div[@id=\"Validity\"]/div/div[1]/input")
	public WebElement dataVigenciaE;
	
	public AjusteEInformaçoesDeValoresVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		tabelaApoioSped.click();
		sleep(2000);
		
		ajusteeinformacao.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("ajusteeinformacoesdevalores");
		
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

		
		String codigoV1 = codigoV.getText();
		String origemV1 = origemV.getText();
		String ufV1 = ufV.getText();
		String sequenciaV1 = sequenciaV.getText();
		String icmsV1 = icmsV.getText();
		String descricaoV1 = descricaoV.getText();
		String tipoApuracaoV1 = tipoApuracaoV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();
		String responsabilidadeV1 = responsabilidadeV.getText();
		String influenciaV1 = influenciaV.getText();
		
		
		System.out.println(codigoV1);
		System.out.println(origemV1);
		System.out.println(ufV1);
		System.out.println(sequenciaV1);
		System.out.println(icmsV1);
		System.out.println(descricaoV1);
		System.out.println(tipoApuracaoV1);
		System.out.println(dataVigenciaV1);
		System.out.println(responsabilidadeV1);
		System.out.println(influenciaV1);
		
		
		
		
		biblioteca.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		
		//pega o ultimo id que foi gerado no criar



		String idRegistro1 = idObter("ajusteeinformacoesdevalores");

		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(12000);
		String codigoE1 = codigoE.getAttribute("value");
		String origemE1 = origemE.getAttribute("value");
		String ufE1 = ufE.getAttribute("value");
		String sequenciaE1 = sequenciaE.getAttribute("value");
		String icmsE1 = icmsE.getAttribute("value");
		String descricaoE1 = descricaoE.getAttribute("value");
		String tipoApuracaoE1 = tipoApuracaoE.getAttribute("value");
		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");
		String responsabilidadeE1 = responsabilidadeE.getAttribute("value");
		String influenciaE1 = influenciaE.getAttribute("value");

		
		
		System.out.println(codigoE1);
		System.out.println(origemE1);
		System.out.println(ufE1);
		System.out.println(sequenciaE1);
		System.out.println(icmsE1);
		System.out.println(descricaoE1);
		System.out.println(tipoApuracaoE1);
		System.out.println(dataVigenciaE1);
		System.out.println(responsabilidadeE1);
		System.out.println(influenciaE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(codigoV1.contains(codigoE1));
		sucesso.add(origemV1.contains(origemE1));
		sucesso.add(ufV1.contains(ufE1));
		sucesso.add(sequenciaV1.contains(sequenciaE1));
		sucesso.add(icmsV1.contains(icmsE1));
		sucesso.add(descricaoV1.contains(descricaoE1));
		sucesso.add(tipoApuracaoV1.contains(tipoApuracaoE1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaE1));
		sucesso.add(responsabilidadeV1.contains(responsabilidadeE1));
		sucesso.add(influenciaV1.contains(influenciaE1));
		
		System.out.println(sucesso);
		
		return sucesso;	
	}

}
