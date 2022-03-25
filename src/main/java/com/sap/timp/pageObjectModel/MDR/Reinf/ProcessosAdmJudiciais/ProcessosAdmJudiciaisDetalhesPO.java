package com.sap.timp.pageObjectModel.MDR.Reinf.ProcessosAdmJudiciais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ProcessosAdmJudiciaisDetalhesPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Reinf\"]")
	public WebElement reinf;
	
	@FindBy(xpath = "//span[text()=\"R1070 - Processos Adm. / Judiciais\"]")
	public WebElement processosadmjudiciais;
	

	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement empresa;
	
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement tipodoprocesso;

	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement numerodoprocesso;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement data1;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement data2;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[7]/div/div")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[8]/div/div")
	public WebElement codigomunicipio;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[9]/div/div")
	public WebElement varajudicial;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[10]/div/div")
	public WebElement tipodeautoria;
	
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
	
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
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//span[@id=\"processType\"]")
	public WebElement tipodoprocessovi;
	
	@FindBy(xpath = "//span[@id=\"processNumber\"]")
	public WebElement numerodoprocessovi;
	
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufvi;
	
	@FindBy(xpath = "//span[@id=\"validFrom\"]")
	public WebElement data1vi;
	
	@FindBy(xpath = "//span[@id=\"validTo\"]")
	public WebElement data2vi;
	
	@FindBy(xpath = "//span[@id=\"countyCode\"]")
	public WebElement codigomunicipiovi;
	
	@FindBy(xpath = "//span[@id=\"jurisdiction\"]")
	public WebElement varajudicialvi;
	
	@FindBy(xpath = "//span[@id=\"authorshipType\"]")
	public WebElement tipodeautoriavi;
	

	
	
	public ProcessosAdmJudiciaisDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		reinf.click();
		sleep(2000);
		
		processosadmjudiciais.click();
		
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("ProcessosAdmJudiciais");
		
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
		String tipodoprocessodetalhes = tipodoprocesso.getText();
		String numerodoprocessodetalhes = numerodoprocesso.getText();
		String ufdetalhes = uf.getText();
		String data1detalhes = data1.getText();
		String data2detalhes = data2.getText();
		String codigomunicipiodetalhes = codigomunicipio.getText();
		String varajudicialdetalhes = varajudicial.getText();
		String tipodeautoriadetalhes = tipodeautoria.getText();
		
		
		System.out.println( empresadetalhes);
		System.out.println(tipodoprocessodetalhes);
		System.out.println(numerodoprocessodetalhes);
		System.out.println(ufdetalhes);
		System.out.println(data1detalhes);
		System.out.println(data2detalhes);
		System.out.println(codigomunicipiodetalhes);
		System.out.println(varajudicialdetalhes);
		System.out.println(tipodeautoriadetalhes);
		
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("ProcessosAdmJudiciais");
		
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
		String tipodoprocessvisualizar = tipodoprocessovi.getText();
		String numerodoprocessovisualizar = numerodoprocessovi.getText();
		String ufvisualizar = ufvi.getText();
		String data1visualizar = data1vi.getText();
		String data2visualizar = data2vi.getText();
		String codigomunicipiovisualizar = codigomunicipiovi.getText();
		String varajudicialvisualizar = varajudicialvi.getText();
		String tipodeautoriavisualizar = tipodeautoriavi.getText();
		

		System.out.println( empresavisualizar);
		System.out.println(tipodoprocessvisualizar);
		System.out.println(numerodoprocessovisualizar);
		System.out.println(ufvisualizar);
		System.out.println(data1visualizar);
		System.out.println(data2visualizar);
		System.out.println(codigomunicipiovisualizar);
		System.out.println(varajudicialvisualizar);
		System.out.println(tipodeautoriavisualizar);
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresavisualizar.equals(empresadetalhes));
		sucesso.add(tipodoprocessvisualizar.equals(tipodoprocessodetalhes));
		sucesso.add(numerodoprocessovisualizar.equals(numerodoprocessodetalhes));
		sucesso.add(ufvisualizar.equals(ufdetalhes));
		sucesso.add(data1visualizar.equals(data1detalhes));
		sucesso.add(data2visualizar.equals(data2detalhes));
		sucesso.add(codigomunicipiovisualizar.equals(codigomunicipiodetalhes));
		sucesso.add(varajudicialvisualizar.equals(varajudicialdetalhes));
		sucesso.add(tipodeautoriavisualizar.equals(tipodeautoriadetalhes));
		
		return sucesso;
	}
}
