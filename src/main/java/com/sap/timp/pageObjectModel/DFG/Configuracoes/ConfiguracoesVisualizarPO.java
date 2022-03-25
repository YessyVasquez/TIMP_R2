package com.sap.timp.pageObjectModel.DFG.Configuracoes;

import java.rmi.server.Skeleton;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.ls.LSException;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguracoesVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//div[@class=\"container-tabs\"]/div[2]")
	public WebElement configuracoes;
	
	
	@FindBy(xpath = "//div[@class=\"settingFolders-wrapper\"]/div/div[1]")
	public WebElement raiz2;
	
	@FindBy(xpath = "//span[text()=\"Filtros Avançados\"]")
	public WebElement filtrosAvanzados;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Pesquisar\")]")
	public WebElement procurar;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	@FindBy(xpath = "//div[@id=\"accordion\"]/div/div/div/div/div/input")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//span[text()=\"Limpar Filtros\"]")
	public WebElement limpar;
	
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement btnCancelar;

	public ConfiguracoesVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> editar() {		
		waitExpectElement(configuracoes);
		sleep(1000);
		configuracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("tq1")) {
			raiz2 = driver.findElement(By.xpath("//div[@class=\"baseTabs-view -view-wrapper  selected\"]/div/div/div/div/div/div[3]/div"));
		}
		
		System.out.println("aqui");
		raiz2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(siguiente);
		sleep(3000);
		
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		System.out.println("AQUI");
		String id = idObter2();
		System.out.println("Id Registro: " + id);
		System.out.println("");
		
	/*	filtrosAvanzados.click();
		sleep(3000);*/
		waitExpectElement(filtrosAvanzados);
		sleep(2000);
		
		procurar.sendKeys(id);
		procurar.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+id+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+id+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		// Datos de Visualizar
		String nome = driver.findElement(By.xpath("//div[@id=\"inputTextFileName\"]/div/div/input")).getAttribute("value").trim();
		String leiaute = driver.findElement(By.xpath("//div[@id=\"inputSelectTypeFile\"]/div/div/div/input")).getAttribute("value").trim();
		String versaoLeiaute = driver.findElement(By.xpath("//div[@id=\"inputTimpVersion\"]/div/div/div/input")).getAttribute("value").trim();
		String empresa = driver.findElement(By.xpath("//div[@id=\"inputSelectCompany\"]/div/div/div/div[1]/div/div[1]")).getText().trim();
		String uf = driver.findElement(By.xpath("//div[@id=\"inputSelectState\"]/div/div/div/div[1]/div/div[1]")).getText().trim();
		String filial = driver.findElement(By.xpath("//div[@id=\"inputSelectFilial\"]/div/div/div/div[1]/div/div[1]")).getText().trim();
		String tributo = driver.findElement(By.xpath("//div[@id=\"inputSelectTax\"]/div/div/div/input")).getAttribute("value").trim();
		String dataInicioVigencia = driver.findElement(By.xpath("//div[@id=\"inputValidFrom\"]/div/div/input")).getAttribute("value").trim();
		
		System.out.println("-----------------DATOS DE VISUALIZAR------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Leiaute: " + leiaute);
		System.out.println("Versaso leiaute: " + versaoLeiaute);
		System.out.println("Empresa: " + empresa);
		System.out.println("UF: " + uf);
		System.out.println("Filial: " + filial);
		System.out.println("Tributo: " + tributo);
		System.out.println("Data Inicio de Vigencia: " + dataInicioVigencia);
		System.out.println("");
		
		btnCancelar.click();
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+id+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id=\""+id+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		// Datos de Editar
		String nome1 = driver.findElement(By.xpath("//div[@id=\"inputTextFileName\"]/div/div/input")).getAttribute("value").trim();
		String leiaute1 = driver.findElement(By.xpath("//div[@id=\"inputSelectTypeFile\"]/div/div/div/input")).getAttribute("value").trim();
		String versaoLeiaute1 = driver.findElement(By.xpath("//div[@id=\"inputTimpVersion\"]/div/div/div/input")).getAttribute("value").trim();
		String empresa1 = driver.findElement(By.xpath("//div[@id=\"inputSelectCompany\"]/div/div/div/div[1]/div/div[1]")).getText().trim();
		String uf1 = driver.findElement(By.xpath("//div[@id=\"inputSelectState\"]/div/div/div/div[1]/div/div[1]")).getText().trim();
		String filial1 = driver.findElement(By.xpath("//div[@id=\"inputSelectFilial\"]/div/div/div/div[1]/div/div[1]")).getText().trim();
		String tributo1 = driver.findElement(By.xpath("//div[@id=\"inputSelectTax\"]/div/div/div/input")).getAttribute("value").trim();
		String dataInicioVigencia1 = driver.findElement(By.xpath("//div[@id=\"inputValidFrom\"]/div/div/input")).getAttribute("value").trim();
		
		System.out.println("-----------------DATOS DE EDITAR------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Leiaute: " + leiaute);
		System.out.println("Versaso leiaute: " + versaoLeiaute);
		System.out.println("Empresa: " + empresa);
		System.out.println("UF: " + uf);
		System.out.println("Filial: " + filial);
		System.out.println("Tributo: " + tributo);
		System.out.println("Data Inicio de Vigencia: " + dataInicioVigencia);
				
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(nome1.equals(nome));
		sucesso.add(leiaute1.equals(leiaute));
		sucesso.add(versaoLeiaute1.equals(versaoLeiaute));
		sucesso.add(empresa1.equals(empresa));
		sucesso.add(uf1.equals(uf));
		sucesso.add(filial1.equals(filial));
		sucesso.add(tributo1.equals(tributo));
		sucesso.add(dataInicioVigencia1.equals(dataInicioVigencia1));
		
		System.out.println(sucesso);
		return sucesso;		
	}	
}
