package com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPCI;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ValoresParaMetodoPCIDetalhesPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Preço de Transferência\"]")
	public WebElement precodetransferencia;
	
	@FindBy(xpath = "//span[text()=\" Valores para Métodos\"]")
	public WebElement valoresparametodos;
	
	@FindBy(xpath = "//span[text()=\" Valores para Método PCI\"]")
	public WebElement valorespci;
	
	@FindBy(xpath = "//span[text()=\"Novo  Valores para Método PCI\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement id;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement material;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement modelo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement tipo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement quantidade;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement precopraticado;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[8]/div/div")
	public WebElement dataimportacao;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[9]/div/div")
	public WebElement precopraticadoajustado;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[10]/div/div")
	public WebElement precoparametro;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[11]/div/div")
	public WebElement variacaocambial;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[12]/div/div")
	public WebElement precoparametroajustado;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[13]/div/div")
	public WebElement datainicial;
	
	
	@FindBy(xpath = "//span[@id=\"id\"]")
	public WebElement idvi;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//span[@id=\"material\"]")
	public WebElement materialvi;
	
	@FindBy(xpath = "//span[@id=\"model\"]")
	public WebElement modelovi;
	
	@FindBy(xpath = "//span[@id=\"type\"]")
	public WebElement tipovi;
	
	@FindBy(xpath = "//span[@id=\"importedQuantity\"]")
	public WebElement quantidadevi;
	
	@FindBy(xpath = "//span[@id=\"priceCharged\"]")
	public WebElement precopraticadovi;
	
	@FindBy(xpath = "//span[@id=\"importDate\"]")
	public WebElement dataimportacaovi;
	
	@FindBy(xpath = "//span[@id=\"adjustedPriceCharged\"]")
	public WebElement precopraticadoajustadovi;
	
	@FindBy(xpath = "//span[@id=\"priceParameter\"]")
	public WebElement precoparametrovi;
	
	@FindBy(xpath = "//span[@id=\"exchangeVariation\"]")
	public WebElement variacaocambialvi;
	
	@FindBy(xpath = "//span[@id=\"adjustedPriceParameter\"]")
	public WebElement precoparametroajustadovi;
	
	
	@FindBy(xpath = "//span[@id=\"startDate\"]")
	public WebElement datavi;
	
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	public ValoresParaMetodoPCIDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		precodetransferencia.click();
		sleep(2000);
		
		valoresparametodos.click();
		
		sleep(2000);
		
		valorespci.click();
		
		sleep(2000);
		
	
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primeira);
		sleep(2000);
		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("ValoresParaMetodoPCI");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhes = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhes.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//detalhes
		String iddetalhes = id.getText();
		String empresadetalhes = empresa.getText();
		String modelodetalhes = modelo.getText();
		String tipodetalhes = tipo.getText();
		String materialdetalhes = material.getText();
		String quantidadedetalhes = quantidade.getText();
		String precopraticadodetalhes = precopraticado.getText();
		String dataimportacaodetalhes = dataimportacao.getText();
		String precopraticadoajustadodetalhes = precopraticadoajustado.getText();
		String precoparametrodetalhes = precoparametro.getText();
		String variacaocambialdetalhes = variacaocambial.getText();
		String precoparametroajustadodetalhes = precoparametroajustado.getText();
		String datadetalhes = datainicial.getText();
		
		System.out.println( iddetalhes);
		System.out.println(empresadetalhes);
		System.out.println( modelodetalhes);
		System.out.println(tipodetalhes);
		System.out.println(materialdetalhes);
		System.out.println(quantidadedetalhes);
		System.out.println(precopraticadodetalhes);
		System.out.println(dataimportacaodetalhes);
		System.out.println(precopraticadoajustadodetalhes);
		System.out.println(precoparametrodetalhes);
		System.out.println(variacaocambialdetalhes);
		System.out.println(precoparametroajustadodetalhes);
		System.out.println(datadetalhes);
		
	
		
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primeira);
		sleep(2000);
		
		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("ValoresParaMetodoPCI");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		//visualizar
		
		String idvisualizar = idvi.getText();
		String empresavisualizar = empresavi.getText();
		String modelovisualizar = modelovi.getText();
		String tipovisualizar = tipovi.getText();
		String materialvisualizar = materialvi.getText();
		String quantidadevisualizar = quantidadevi.getText();
		String precopraticadovisualizar = precopraticadovi.getText();
		String dataimportacaovisualizar = dataimportacaovi.getText();
		String precopraticadoajustadovisualizar = precopraticadoajustadovi.getText();
		String precoparametrovisualizar = precoparametrovi.getText();
		String variacaocambialvisualizar = variacaocambialvi.getText();
		String precoparametroajustadovisualizar = precoparametroajustadovi.getText();
		String datavisualizar = datavi.getText();
		variacaocambialvisualizar=variacaocambialvisualizar.replace(".", ",");
		
		System.out.println( idvisualizar);
		System.out.println(empresavisualizar);
		System.out.println(modelovisualizar);
		System.out.println(tipovisualizar);
		System.out.println(materialvisualizar);
		System.out.println(quantidadevisualizar);
		System.out.println(precopraticadovisualizar);
		System.out.println(dataimportacaovisualizar);
		System.out.println(precopraticadoajustadovisualizar);
		System.out.println(precoparametrovisualizar);
		System.out.println(variacaocambialvisualizar);
		System.out.println(precoparametroajustadovisualizar);
		System.out.println(datavisualizar);
		
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(idvisualizar.equals(iddetalhes));
		sucesso.add(empresavisualizar.equals(empresadetalhes));
		sucesso.add(modelovisualizar.equals(modelodetalhes));
		sucesso.add( tipovisualizar.equals(tipodetalhes));
		sucesso.add( materialvisualizar.equals(materialdetalhes));
		sucesso.add( quantidadevisualizar.equals(quantidadedetalhes));
		sucesso.add( precopraticadovisualizar.equals(precopraticadodetalhes));
		sucesso.add( dataimportacaovisualizar.equals(dataimportacaodetalhes));
		sucesso.add( precopraticadoajustadovisualizar.equals(precopraticadoajustadodetalhes));
		sucesso.add( precoparametrovisualizar.equals(precoparametrodetalhes));
		sucesso.add(variacaocambialvisualizar.equals(variacaocambialdetalhes));
		sucesso.add(precoparametroajustadovisualizar.equals(precoparametroajustadodetalhes));
		sucesso.add( datavisualizar.equals(datadetalhes));
		
	
		return sucesso;
	}

}
