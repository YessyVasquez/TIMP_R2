package com.sap.timp.pageObjectModel.MDR.Empresas;

import java.util.ArrayList;

//import org.apache.poi.hssf.record.TextObjectRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class EmpresasViasualizarPO extends TestBaseSteven{
	

	//@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[21]")
	@FindBy(xpath = "//li/div/span[text()=\"Empresas\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	
	 @FindBy(xpath = "//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[2]")
	 public WebElement visualizar;
	
	 @FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;
		

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//li[@class=\"item\"]/span[text()=\"Editar\"]")
	public WebElement editar;
	
	@FindBy(xpath = "//span[@id=\"codEmpresa\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//span[@id=\"razaoSocial\"]")
	public WebElement razaosocialvi;
	
	@FindBy(xpath = "//span[@id=\"municipio\"]")
	public WebElement municipiovi;
	
	@FindBy(xpath = "//div[@id=\"codigo\"]/div/div/input")
	public WebElement empresaed;
	
	@FindBy(xpath = "//div[@id=\"razaoSocial\"]/div/div/input")
	public WebElement razaosocialed;
	
	@FindBy(xpath = "//div[@id=\"municipio\"]/div/div/input")
	public WebElement municipioed;
	
	public EmpresasViasualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> visualizar() {
		
		empresa.click();
		sleep(2000);
		waitExpectXpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div");

		sleep(2000);
		
		menu.click();
		visualizar.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//visualizar
		
		String empresavisualizar = empresavi.getText();
		String razaosocialvisualizar = razaosocialvi.getText();
		String municipiovisualizar = municipiovi.getText();
		
		
		System.out.println(empresavisualizar);
		System.out.println(razaosocialvisualizar);
		System.out.println(municipiovisualizar);
		
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//editar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresaeditar=empresaed.getAttribute("value");
		String razaosocialeditar=razaosocialed.getAttribute("value");
		String municipioeditar=municipioed.getAttribute("value");
		
	
		System.out.println( empresaeditar);
		System.out.println(razaosocialeditar);
		System.out.println(municipioeditar);
	
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add( empresaeditar.equals( empresavisualizar));
		sucesso.add(razaosocialeditar.equals(razaosocialvisualizar));
		sucesso.add(municipioeditar.equals(municipiovisualizar));
		
		//waitExpectXpath("//label[text()=\"Razão Social:\"]");
		
		//String sucesso = driver.findElement(By.xpath("//*[@id=\"show\"]/table[1]")).getAttribute("class");
		
		return sucesso;
	}
	
	

}
