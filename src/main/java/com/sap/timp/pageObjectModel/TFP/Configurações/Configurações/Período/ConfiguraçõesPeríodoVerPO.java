package com.sap.timp.pageObjectModel.TFP.Configurações.Configurações.Período;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseMassiel;

public class ConfiguraçõesPeríodoVerPO extends TestBaseKenssy{
	
	@FindBy(xpath = "//span[text()=\"Configurações\"]")
	public WebElement configuracoe;
	
	@FindBy(xpath = "//span[text()=\"Período\"]")
	public WebElement periodo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-left\")][2]")
	public WebElement primeira;
	
	//DATOS VER
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[@id]")
	public WebElement empresa;
	@FindBy(xpath = "//div[@id=\"state\"]/div/div/div/div/div/div[@id]")
	public WebElement estado;
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div[@id]")
	public WebElement filial;
	@FindBy(xpath = "//div[@id=\"opening\"]/div/div/div/input")
	public WebElement abertura;
	@FindBy(xpath = "//div[@id=\"day-type\"]/div/div/div/input")
	public WebElement tipoDia;
	@FindBy(xpath = "//div[@id=\"day\"]/div/div/div/input")
	public WebElement dia;
	@FindBy(xpath = "//div[@id=\"valid-from\"]/div/div/input")
	public WebElement validadeDe;
	@FindBy(xpath = "//div[@id=\"valid-to\"]/div/div/input")
	public WebElement validadeAte;
	
	
	
	//DATOS EDITAR
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div[@id]")
	public WebElement empresaE;
	@FindBy(xpath = "//div[@id=\"state\"]/div/div/div/div/div/div[@id]")
	public WebElement estadoE;
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div[@id]")
	public WebElement filialE;
	@FindBy(xpath = "//div[@id=\"opening\"]/div/div/div/input")
	public WebElement aberturaE;
	@FindBy(xpath = "//div[@id=\"day-type\"]/div/div/div/input")
	public WebElement tipoDiaE;
	@FindBy(xpath = "//div[@id=\"day\"]/div/div/div/input")
	public WebElement diaE;
	@FindBy(xpath = "//div[@id=\"valid-from\"]/div/div/input")
	public WebElement validadeDeE;
	@FindBy(xpath = "//div[@id=\"valid-to\"]/div/div/input")
	public WebElement validadeAteE;
		
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	public ConfiguraçõesPeríodoVerPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> ver() {
		configuracoe.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		periodo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro =idObter("idConfiguracoesPeriodo");
		System.out.println(idRegistro);
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement ver = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Ver\"]"));

		menu.click();
		sleep(1000);
		ver.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//DATOS DEL VER
			String empresa1 = empresa.getText();
			String estado1 = estado.getText();
			String filial1 = filial.getText();
			String apertura1 = abertura.getAttribute("value");
			String tipoDia1 = tipoDia.getAttribute("value");
			String dia1 = dia.getAttribute("value");
			String validadeDe1 = validadeDe.getAttribute("value");
			String validadeAte1 = validadeAte.getAttribute("value");
			
			System.out.println("----------------------");
			System.out.println("*****Datos del Ver****");
			System.out.println("----------------------");
			System.out.println("Empresa: " +empresa1);
			System.out.println("Estado: " +estado1);
			System.out.println("Filial: " +filial1);
			System.out.println("Abertura: " +apertura1);
			System.out.println("Tipo Dia: " +tipoDia1);
			System.out.println("Dia: " +dia1);
			System.out.println("Validade De: " +validadeDe1);
			System.out.println("Validade Ate:" +validadeAte1);
		
		fechar.click();
		sleep(2000);
			
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//DATOS DEL VER
			String empresa2 = empresaE.getText();
			String estado2 = estadoE.getText();
			String filial2 = filialE.getText();
			String apertura2 = aberturaE.getAttribute("value");
			String tipoDia2 = tipoDiaE.getAttribute("value");
			String dia2 = diaE.getAttribute("value");
			String validadeDe2 = validadeDeE.getAttribute("value");
			String validadeAte2 = validadeAteE.getAttribute("value");
			
			System.out.println("----------------------");
			System.out.println("*****Datos del Ver****");
			System.out.println("----------------------");
			System.out.println("Empresa: " +empresa2);
			System.out.println("Estado: " +estado2);
			System.out.println("Filial: " +filial2);
			System.out.println("Abertura: " +apertura2);
			System.out.println("Tipo Dia: " +tipoDia2);
			System.out.println("Dia: " +dia2);
			System.out.println("Validade De: " +validadeDe2);
			System.out.println("Validade Ate:" +validadeAte2);
			
			
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			sucesso.add(empresa1.contains(empresa2));
			sucesso.add(estado1.contains(estado2));
			sucesso.add(filial1.contains(filial2));
			sucesso.add(apertura1.contains(apertura2));
			sucesso.add(tipoDia1.contains(tipoDia2));
			sucesso.add(dia1.contains(dia2));
			sucesso.add(validadeDe1.contains(validadeDe2));
			sucesso.add(validadeAte1.contains(validadeAte2));
		System.out.println(sucesso);
		
		return sucesso;
	}

}
