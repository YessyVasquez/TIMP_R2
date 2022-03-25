package com.sap.timp.pageObjectModel.MDR.Siscoserv.NBS;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class NBSDetalhesPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Siscoserv\"]")
	public WebElement siscoserv;
	
	@FindBy(xpath = "//span[text()=\"NBS\"]")
	public WebElement nbs;
	
	@FindBy(xpath = "//span[text()=\"Novo Configuração NBS\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement codigo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement descricaodocodigo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement capitulo;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement contacontabil;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement ativo;
	
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
	

	@FindBy(xpath = "//span[@id=\"code\"]")
	public WebElement codigovi;
	
	@FindBy(xpath = "//span[@id=\"descriptionCode\"]")
	public WebElement descricaodocodigovi;
	
	@FindBy(xpath = "//span[@id=\"chapter\"]")
	public WebElement capitulovi;
	
	@FindBy(xpath = "//span[@id=\"accountingAccount\"]")
	public WebElement contacontabilvi;
	
	@FindBy(xpath = "//span[@id=\"active\"]")
	public WebElement ativovi;
	
	

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;
	
	public NBSDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		sleep(2000);
		siscoserv.click();
		sleep(2000);
		
		nbs.click();
		
		sleep(2000);
	
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primeira);
		sleep(2000);
		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("NBS");
		
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
		
		String codigodetalhes = codigo.getText();
		String descricaodocodigodetalhes = descricaodocodigo.getText();
		String capitulodetalhes = capitulo.getText();
		String contacontabildetalhes = contacontabil.getText();
		String ativodetalhes = ativo.getText();
		
		;
		System.out.println(codigodetalhes);
		System.out.println( descricaodocodigodetalhes);
		System.out.println(capitulodetalhes);
		System.out.println(contacontabildetalhes);
		System.out.println(ativodetalhes);
		
	
		
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(primeira);
		sleep(2000);
		
		primeira.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("NBS");
		
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
		
		waitExpectElement(codigovi);
		sleep(2000);
		
		String codigovisualizar = codigovi.getText();
		String descricaodocodigovisualizar = descricaodocodigovi.getText();
		String capitulovisualizar = capitulovi.getText();
		String contacontabilvisualizar = contacontabilvi.getText();
		String ativovisualizar = ativovi.getText();
		
		
		System.out.println(codigovisualizar);
		System.out.println(descricaodocodigovisualizar);
		System.out.println(capitulovisualizar);
		System.out.println(contacontabilvisualizar);
		System.out.println(ativovisualizar);
	
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		
		sucesso.add(codigovisualizar.equals(codigodetalhes));
		sucesso.add(descricaodocodigovisualizar.equals(descricaodocodigodetalhes));
		sucesso.add( capitulovisualizar.equals(capitulodetalhes));
		sucesso.add( contacontabilvisualizar.equals(contacontabildetalhes));
		sucesso.add( ativovisualizar.equals(ativodetalhes));
		
		
	
		return sucesso;
	}


}
