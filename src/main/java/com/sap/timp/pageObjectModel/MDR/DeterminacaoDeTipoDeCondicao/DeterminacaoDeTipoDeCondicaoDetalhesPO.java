package com.sap.timp.pageObjectModel.MDR.DeterminacaoDeTipoDeCondicao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DeterminacaoDeTipoDeCondicaoDetalhesPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Determinação de Tipo de Condição\"]")
	public WebElement determinacaodetipodecondicao;
	
	@FindBy(xpath = "//span[text()=\"Nova Determinação de Tipo de Condição\"]")
	public WebElement novodetermincao;
	
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
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement processo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement procedimento;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement imposto;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement detalhe;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement condicao;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[8]/div/div")
	public WebElement aliquota;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[9]/div/div")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[10]/div/div")
	public WebElement data;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//span[@id=\"process\"]")
	public WebElement processovi;
	
	@FindBy(xpath = "//span[@id=\"processPrice\"]")
	public WebElement procedimentovi;
	
	@FindBy(xpath = "//span[@id=\"taxType\"]")
	public WebElement impostovi;
	
	@FindBy(xpath = "//span[@id=\"taxTypeDetail\"]")
	public WebElement detalhevi;
	
	@FindBy(xpath = "//span[@id=\"bcTax\"]")
	public WebElement condicaovi;
	
	@FindBy(xpath = "//span[@id=\"taxRate\"]")
	public WebElement aliquotavi;
	
	@FindBy(xpath = "//span[@id=\"taxValue\"]")
	public WebElement tributovi;
	
	@FindBy(xpath = "//span[@id=\"validityFrom\"]")
	public WebElement datavi;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	
	public DeterminacaoDeTipoDeCondicaoDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		determinacaodetipodecondicao.click();
		sleep(2000);
		
		
	
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primeira);
		sleep(2000);
		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("DeterminacaoDeTipoDeCondicao");
		
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
		String empresade = empresa.getText();
		String processode = processo.getText();
		String procedimentode = procedimento.getText();
		String impostode = imposto.getText();
		String detalhede = detalhe.getText();
		String condicaode = condicao.getText();
		String aliquotade = aliquota.getText();
		String tributode = tributo.getText();
		String datade = data.getText();
		
		System.out.println( empresade);
		System.out.println(processode);
		System.out.println(procedimentode);
		System.out.println(impostode);
		System.out.println(detalhede);
		System.out.println(condicaode);
		System.out.println(aliquotade);
		System.out.println(tributode);
		System.out.println(datade);
	
		
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primeira);
		sleep(2000);
		
		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("DeterminacaoDeTipoDeCondicao");
		
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
		
		String empresavisualizar = empresavi.getText();
		String processovisualizar = processovi.getText();
		String procedimentovisualizar = procedimentovi.getText();
		String impostovisualizar = impostovi.getText();
		String detalhevisualizar = detalhevi.getText();
		String condicaovisualizar = condicaovi.getText();
		String aliquotavisualizar = aliquotavi.getText();
		String tributovisualizar = tributovi.getText();
		String datavisualizar = datavi.getText();
		
		System.out.println( empresavisualizar);
		System.out.println(processovisualizar);
		System.out.println(procedimentovisualizar);
		System.out.println(impostovisualizar);
		System.out.println(detalhevisualizar);
		System.out.println(condicaovisualizar);
		System.out.println(aliquotavisualizar);
		System.out.println(tributovisualizar);
		System.out.println(datavisualizar);
		
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresavisualizar.equals(empresade));
		sucesso.add(processovisualizar.equals(processode));
		sucesso.add(procedimentovisualizar.equals(procedimentode));
		sucesso.add( impostovisualizar.equals( impostode));
		sucesso.add(detalhevisualizar.equals(detalhede));
		sucesso.add(condicaovisualizar.equals(condicaode));
		sucesso.add( aliquotavisualizar.equals( aliquotade));
		sucesso.add(tributovisualizar.equals(tributode));
		sucesso.add(datavisualizar.equals(datade));
		
		return sucesso;
	}


}
