package com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ContasDefaultParaExtemporaneoDetalhesPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Parâmetros de Contabilização\"]")
	public WebElement parametrosdecontabilizacao;
	
	
	@FindBy(xpath = "//span[text()=\"Contas Default para Extemporâneo\"]")
	public WebElement contasdefaultparaextemporaneo;
	
	@FindBy(xpath = "//span[text()=\"Nova Contas Default para Extemporâneo\"]")
	public WebElement novacontadefaultparaextemporaneo;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement empresaD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement filialD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement codigoAjusteD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement descricaoD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement tipoAjusteD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][7]/div[2]/div")
	public WebElement tributoD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][8]/div[2]/div")
	public WebElement tipoImpostoD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][9]/div[2]/div")
	public WebElement detalheTipoTributoD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][10]/div[2]/div")
	public WebElement utilizacaoD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][11]/div[2]/div")
	public WebElement linhaLivroD;
	
	@FindBy(xpath = "//div[@id=\"detail-description\"][12]/div[2]/div")
	public WebElement detalheLinhaLivroD;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresaV;
	
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialV;
	
	@FindBy(xpath = "//span[@id=\"adjustmentCode\"]")
	public WebElement codigoAjusteV;
	
	@FindBy(xpath = "//span[@id=\"description\"]")
	public WebElement descricaoV;
	
	@FindBy(xpath = "//span[@id=\"adjustmentType\"]")
	public WebElement tipoAjusteV;
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributoV;
	
	@FindBy(xpath = "//span[@id=\"taxType\"]")
	public WebElement tipoImpostoV;
	
	@FindBy(xpath = "//span[@id=\"taxTypeDetail\"]")
	public WebElement detalheTipoTributoV;
	
	@FindBy(xpath = "//span[@id=\"utilization\"]")
	public WebElement utilizacaoV;
	
	@FindBy(xpath = "//span[@id=\"bookLine\"]")
	public WebElement linhaLivroV;
	
	@FindBy(xpath = "//span[@id=\"bookLineDetail\"]")
	public WebElement detalheLinhaLivroV;
	
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione a data de início de vigência\"]")
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
	
	public ContasDefaultParaExtemporaneoDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		parametrosdecontabilizacao.click();
		sleep(2000);
		contasdefaultparaextemporaneo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("ContasDefaultParaExtemporaneo");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresaD1 = empresaD.getText();
		String filialD1 = filialD.getText();
		filialD1 = filialD1.replace(" - ", "_");
		String codigoAjusteD1 = codigoAjusteD.getText();
		String descricaoD1 = descricaoD.getText();
		String tipoAjusteD1 = tipoAjusteD.getText();
		String tributoD1 = tributoD.getText();
		String tipoImpostoD1 = tipoImpostoD.getText();
		String detalheTipoTributoD1 = detalheTipoTributoD.getText();
		String utilizacaoD1 = utilizacaoD.getText();
		String linhaLivroD1 = linhaLivroD.getText();
		String detalheLinhaLivroD1 = detalheLinhaLivroD.getText();
		
		System.out.println(empresaD1);
		System.out.println(filialD1);
		System.out.println(codigoAjusteD1);
		System.out.println(descricaoD1);
		System.out.println(tipoAjusteD1);
		System.out.println(tributoD1);
		System.out.println(tipoImpostoD1);
		System.out.println(detalheTipoTributoD1);
		System.out.println(utilizacaoD1);
		System.out.println(linhaLivroD1);
		System.out.println(detalheLinhaLivroD1);
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresaV1 = empresaV.getText();
		String filialV1 = filialV.getText();
		String codigoAjusteV1 = codigoAjusteV.getText();
		String descricaoV1 = descricaoV.getText();
		String tipoAjusteV1 = tipoAjusteV.getText();
		String tributoV1 = tributoV.getText();
		String tipoImpostoV1 = tipoImpostoV.getText();
		String detalheTipoTributoV1 = detalheTipoTributoV.getText();
		String utilizacaoV1 = utilizacaoV.getText();
		String linhaLivroV1 = linhaLivroV.getText();
		String detalheLinhaLivroV1 = detalheLinhaLivroV.getText();
		
		System.out.println(empresaV1);
		System.out.println(filialV1);
		System.out.println(codigoAjusteV1);
		System.out.println(descricaoV1);
		System.out.println(tipoAjusteV1);
		System.out.println(tributoV1);
		System.out.println(tipoImpostoV1);
		System.out.println(detalheTipoTributoV1);
		System.out.println(utilizacaoV1);
		System.out.println(linhaLivroV1);
		System.out.println(detalheLinhaLivroV1);
		
	
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaV1.contains(empresaD1));
		sucesso.add(filialD1.contains(filialV1));
		sucesso.add(codigoAjusteV1.contains(codigoAjusteD1));
		sucesso.add(descricaoV1.contains(descricaoD1));
		sucesso.add(tipoAjusteV1.contains(tipoAjusteD1));
		sucesso.add(tributoV1.contains(tributoD1));
		sucesso.add(tipoImpostoV1.contains(tipoImpostoD1));
		sucesso.add(detalheTipoTributoV1.contains(detalheTipoTributoD1));
		sucesso.add(utilizacaoV1.contains(utilizacaoD1));
		sucesso.add(linhaLivroV1.contains(linhaLivroD1));
		sucesso.add(detalheLinhaLivroV1.contains(detalheLinhaLivroD1));

		System.out.println(sucesso);	
		return sucesso;	
		
	}

}
