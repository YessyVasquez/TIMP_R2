package com.sap.timp.pageObjectModel.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DeterminacaoDeRelevanciaPorRegraDetalhesPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Determinação de Relevância de Tarefa\"]")
	public WebElement determinacaoderelevanciadetarefa;
	
	@FindBy(xpath = "//span[text()=\"Determinação de Relevância por Regra\"]")
	public WebElement determinacaoderelevanciaporregra;
	
	@FindBy(xpath = "//span[text()=\"Nova Determinação de Relevância por Regra\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement empresa;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement uf;
	

	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement filial;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement tributo;
	

	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement codigoderegra;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement descricaodecodigoderegra;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[8]/div/div")
	public WebElement saida;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[9]/div/div")
	public WebElement datainiciovigencia;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;

	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufvi;
	
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialvi;
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributovi;
	
	@FindBy(xpath = "//span[@id=\"ruleCode\"]")
	public WebElement codigoderegravi;
	
	@FindBy(xpath = "//span[@id=\"ruleCodeDescription\"]")
	public WebElement descricaodecodigoderegravi;
	
	@FindBy(xpath = "//span[@id=\"output\"]")
	public WebElement saidavi;
	
	@FindBy(xpath = "//span[@id=\"validFrom\"]")
	public WebElement datainiciovigenciavi;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	public DeterminacaoDeRelevanciaPorRegraDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		determinacaoderelevanciadetarefa.click();
		sleep(2000);
		
		determinacaoderelevanciaporregra.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("DeterminacaoDeRelevanciaPorRegra");
		
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
		String empresadetalhes = empresa.getText();
		String ufdetalhes = uf.getText();
		String filialdetalhes = filial.getText();
		String tributodetalhes = tributo.getText();
		String codigoderegradetalhes = codigoderegra.getText();
		String descricaodecodigoderegradetalhes = descricaodecodigoderegra.getText();
		String saidadetalhes = saida.getText();
		String datadetalhes = datainiciovigencia.getText();
		
		
		System.out.println(empresadetalhes);
		System.out.println(ufdetalhes);
		System.out.println(filialdetalhes);
		System.out.println(tributodetalhes);
		System.out.println(codigoderegradetalhes);
		System.out.println(descricaodecodigoderegradetalhes);
		System.out.println(saidadetalhes);
		System.out.println(datadetalhes);
		
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("DeterminacaoDeRelevanciaPorRegra");
		
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
		
		String empresvisualizar = empresavi.getText();
		String ufvisualizar = ufvi.getText();
		String filialvisualizar = filialvi.getText();
		String tributovisualizar = tributovi.getText();
		String codigoderegravisualizar = codigoderegravi.getText();
		String descricaodecodigoderegravisualizar = descricaodecodigoderegravi.getText();
		String saidavisualizar = saidavi.getText();
		String datavisualizar = datainiciovigenciavi.getText();
		
		filialvisualizar = filialvisualizar.replace(" ", "");
		
		System.out.println(empresvisualizar);
		System.out.println(ufvisualizar);
		System.out.println(filialvisualizar);
		System.out.println(tributovisualizar);
		System.out.println(codigoderegravisualizar);
		System.out.println(descricaodecodigoderegravisualizar);
		System.out.println(saidavisualizar);
		System.out.println(datavisualizar);
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresvisualizar.equals(empresadetalhes));
		sucesso.add(ufvisualizar.equals(ufdetalhes));
		sucesso.add(filialvisualizar.equals(filialdetalhes));
		sucesso.add(tributovisualizar.equals(tributodetalhes));
		sucesso.add(codigoderegravisualizar.equals(codigoderegradetalhes));
		sucesso.add(descricaodecodigoderegravisualizar.equals(descricaodecodigoderegradetalhes));
		sucesso.add(saidavisualizar.equals(saidadetalhes));
		sucesso.add(datavisualizar.equals(datadetalhes));
		
		return sucesso;
	}


}
