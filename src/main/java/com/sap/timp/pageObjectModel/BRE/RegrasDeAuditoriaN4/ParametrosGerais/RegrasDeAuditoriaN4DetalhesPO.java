package com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN4.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegrasDeAuditoriaN4DetalhesPO extends TestBaseSteven{
	

	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N4\"]")
	public WebElement regraAuditoriaN4;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div[1]/span[2]")
	public WebElement campo1;
	
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div[2]/span[2]")
	public WebElement campo2;
	
	@FindBy(xpath = "//div[@class=\"icon icon-font-Sign-and-Symbols icon-persign\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]/*/*[1]")
	public WebElement campo1vi;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[1]/*/*[2]")
	public WebElement campo2vi;
	
	
	@FindBy(xpath = "//div[@id=\"main-title\"]")
	public WebElement nomevi;
	
	@FindBy(xpath = "//div[@class=\"detail-label\"]")
	public WebElement nomede;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[3]/*/*[1]")
	public WebElement r1vi;
	
	
	public RegrasDeAuditoriaN4DetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalhes() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regraAuditoriaN4.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("idAn4");
		//String idRegistro = idObter2();
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalhe = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));
		
	
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		detalhe.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//detalhes
		String nomedetalhes = nomede.getText();
		String campo1detalhes = campo1.getText();
		String campo2detalhes = campo2.getText();

		System.out.println(nomedetalhes);
		System.out.println(campo1detalhes);
		System.out.println( campo2detalhes);
		
	
		
		
		fechar.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(ultimapagina);
		sleep(2000);
		
		ultimapagina.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//pega o ultimo id que foi gerado no criar

		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualização\"]"));
		
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(r1vi);
		sleep(2000);
		//visualizar
		
		String nomevisualizar = nomevi.getText();
		String primeirocampo1 = campo1vi.getText();
		String segundocampo1 = campo2vi.getText();
		
		
		System.out.println(nomevisualizar);
		System.out.println(primeirocampo1);
		System.out.println(segundocampo1);
		
		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(nomevisualizar.contains(nomedetalhes));
		
		sucesso.add(primeirocampo1.contains(campo1detalhes));
		sucesso.add(campo2detalhes.contains(segundocampo1));
		
		
		System.out.println(sucesso);
	
		return sucesso;
	}

}
