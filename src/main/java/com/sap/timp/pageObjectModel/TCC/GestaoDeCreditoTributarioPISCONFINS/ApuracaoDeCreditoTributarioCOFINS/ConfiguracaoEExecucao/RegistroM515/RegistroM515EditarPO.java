package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.RegistroM515;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;


public class RegistroM515EditarPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário COFINS\"]")
	public WebElement apuracaocreditocofins;

	@FindBy(xpath = "//div[@class=\"left\"]/div/div[2]/ul/li[6]/ul/li[4]/ul/li[1]/div/span[2]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM515\"]")
	public WebElement registrom515;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"dtOperAj\"]/div/div[1]/input")
	public WebElement fecha;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[1]/input")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[1]/div[1]/div/div[1]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div[1]/div[1]/input")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"reg\"]/div/div[1]/input")
	public WebElement registro;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	public RegistroM515EditarPO() {

		PageFactory.initElements(driver, this);
	}

	public  ArrayList<Boolean> Editar() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(4000);
		apuracaocreditocofins.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registrom515.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("id-GCTPISCOFINS-ACTCOFINSConfiguracaoEExecucacoRegistroM515");
		System.out.println("ID Registro: " + idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(32000);
		
		String empresa1 = empresa.getAttribute("value");
		String uf1 = uf.getText();
		String filial1 = filial.getText();
		String fecha1 = fecha.getAttribute("value");
		String tributo1 = tributo.getAttribute("value");
		String registro1 = registro.getAttribute("value");
		
		boolean sucesso1 = false;
		boolean sucesso2 = false;
		
		
		System.out.println(empresa1);
		System.out.println(uf1);
		System.out.println(filial1);
		System.out.println(tributo1);
		System.out.println(registro1);
		System.out.println(fecha1);

		
		sucesso1 = validarFecha(fecha1);
		
		System.out.println(sucesso1);
		
		
		
		driver.navigate().refresh();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(35000);
		
		
		String empresa11 = empresa.getAttribute("value");
		String uf11 = uf.getText();
		String filial11 = filial.getText();
		String fecha11 = fecha.getAttribute("value");
		String tributo11 = tributo.getAttribute("value");
		String registro11 = registro.getAttribute("value");
		

		
		
		System.out.println(empresa11);
		System.out.println(uf11);
		System.out.println(filial11);
		System.out.println(tributo11);
		System.out.println(registro11);
		System.out.println(fecha11);

	
		
		sucesso2 = validarFecha(fecha11);
		
		System.out.println(sucesso2);
		
	
		
		 ArrayList<Boolean>  sucesso = new ArrayList<Boolean>(); 
	        sucesso.add(sucesso1);
	        sucesso.add(sucesso2);
	        sucesso.add(empresa11.equals(empresa1));
	        sucesso.add(uf11.equals(uf1));
	        sucesso.add(filial11.equals(filial1));
	        sucesso.add(fecha11.equals(fecha1));
	        sucesso.add(tributo11.equals(tributo1));
	        sucesso.add(registro11.equals(registro1));
	        
	      System.out.println(sucesso);
	      return sucesso;
	}
}
