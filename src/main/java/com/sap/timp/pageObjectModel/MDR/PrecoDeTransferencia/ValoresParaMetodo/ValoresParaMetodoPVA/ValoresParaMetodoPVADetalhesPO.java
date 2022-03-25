package com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ValoresParaMetodo.ValoresParaMetodoPVA;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ValoresParaMetodoPVADetalhesPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Preço de Transferência\"]")
	public WebElement precodetransferencia;
	
	@FindBy(xpath = "//span[text()=\" Valores para Métodos\"]")
	public WebElement valoresparametodos;
	
	@FindBy(xpath = "//span[text()=\" Valores para Método PVA\"]")
	public WebElement valorespva;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	
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
	public WebElement precovendas;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement tributos;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[8]/div/div")
	public WebElement margemdelucro;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[9]/div/div")
	public WebElement precoparametro;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[10]/div/div")
	public WebElement quantidade;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[11]/div/div")
	public WebElement valorvenda;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[12]/div/div")
	public WebElement margemdivergencia;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[13]/div/div")
	public WebElement precopraticado;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[14]/div/div")
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
	
	@FindBy(xpath = "//span[@id=\"salesPrice\"]")
	public WebElement precovendasvi;
	
	@FindBy(xpath = "//span[@id=\"taxesIncluded\"]")
	public WebElement tributosvi;
	
	@FindBy(xpath = "//span[@id=\"profitMargin\"]")
	public WebElement margemdelucrovi;
	
	@FindBy(xpath = "//span[@id=\"priceParameter\"]")
	public WebElement precoparametrovi;
	
	@FindBy(xpath = "//span[@id=\"quantitySold\"]")
	public WebElement quantidadevi;
	
	@FindBy(xpath = "//span[@id=\"unitSalesValue\"]")
	public WebElement valorvendavi;
	
	@FindBy(xpath = "//span[@id=\"divergenceMargin\"]")
	public WebElement margemdivergenciavi;
	
	
	@FindBy(xpath = "//span[@id=\"priceCharged\"]")
	public WebElement precopraticadovi;
	
	@FindBy(xpath = "//span[@id=\"startDate\"]")
	public WebElement datavi;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	public ValoresParaMetodoPVADetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		precodetransferencia.click();
		sleep(2000);
		
		valoresparametodos.click();
		
		sleep(2000);
		
		valorespva.click();
		
		sleep(2000);
		
	
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primeira);
		sleep(2000);
		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("ValoresParaMetodoPVA");
		
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
		String precovendasdetalhes = precovendas.getText();
		String tributosdetalhes = tributos.getText();
		String margemdelucrodetalhes = margemdelucro.getText();
		String precoparametrodetalhes = precoparametro.getText();
		String quantidadedetalhes = quantidade.getText();
		String valorvendadetalhes = valorvenda.getText();
		String margemdivergenciadetalhes = margemdivergencia.getText();
		String precopraticadodetalhes = precopraticado.getText();
		String datadetalhes = datainicial.getText();
		
		System.out.println( iddetalhes);
		System.out.println(empresadetalhes);
		System.out.println( modelodetalhes);
		System.out.println(tipodetalhes);
		System.out.println(materialdetalhes);
		System.out.println(precovendasdetalhes);
		System.out.println(tributosdetalhes);
		System.out.println(margemdelucrodetalhes);
		System.out.println(precoparametrodetalhes);
		System.out.println(quantidadedetalhes);
		System.out.println(valorvendadetalhes);
		System.out.println(margemdivergenciadetalhes);
		System.out.println(precopraticadodetalhes);
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
		String idRegistro1 = idObter("ValoresParaMetodoPVA");
		
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
		String precovendasvisualizar = precovendasvi.getText();
		String tributosvisualizar = tributosvi.getText();
		String margemdelucrovisualizar = margemdelucrovi.getText();
		String precoparametrovisualizar = precoparametrovi.getText();
		String quantidadevisualizar = quantidadevi.getText();
		String valorvendavisualizar = valorvendavi.getText();
		String margemdivergenciavisualizar = margemdivergenciavi.getText();
		String precopraticadovisualizar = precopraticadovi.getText();
		String datavisualizar = datavi.getText();
		
		System.out.println( idvisualizar);
		System.out.println(empresavisualizar);
		System.out.println(modelovisualizar);
		System.out.println(tipovisualizar);
		System.out.println(materialvisualizar);
		System.out.println(precovendasvisualizar);
		System.out.println(tributosvisualizar);
		System.out.println(margemdelucrovisualizar);
		System.out.println(precoparametrovisualizar);
		System.out.println(quantidadevisualizar);
		System.out.println(valorvendavisualizar);
		System.out.println(margemdivergenciavisualizar);
		System.out.println(precopraticadovisualizar);
		System.out.println(datavisualizar);
		
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(idvisualizar.equals(iddetalhes));
		sucesso.add(empresavisualizar.equals(empresadetalhes));
		sucesso.add(modelovisualizar.equals(modelodetalhes));
		sucesso.add( tipovisualizar.equals(tipodetalhes));
		sucesso.add( materialvisualizar.equals(materialdetalhes));
		sucesso.add( precovendasvisualizar.equals(precovendasdetalhes));
		sucesso.add( tributosvisualizar.equals(tributosdetalhes));
		sucesso.add( margemdelucrovisualizar.equals(margemdelucrodetalhes));
		sucesso.add( precoparametrovisualizar.equals(precoparametrodetalhes));
		sucesso.add( quantidadevisualizar.equals(quantidadedetalhes));
		sucesso.add(valorvendavisualizar.equals(valorvendadetalhes));
		sucesso.add(margemdivergenciavisualizar.equals(margemdivergenciadetalhes));
		sucesso.add(precopraticadovisualizar.equals(precopraticadodetalhes));
		sucesso.add( datavisualizar.equals(datadetalhes));
		
	
		return sucesso;
	}
	

}
