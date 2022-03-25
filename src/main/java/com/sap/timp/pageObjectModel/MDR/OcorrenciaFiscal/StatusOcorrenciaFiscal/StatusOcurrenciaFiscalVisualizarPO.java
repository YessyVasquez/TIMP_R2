package com.sap.timp.pageObjectModel.MDR.OcorrenciaFiscal.StatusOcorrenciaFiscal;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class StatusOcurrenciaFiscalVisualizarPO extends TestBaseFernando{
	@FindBy(xpath = "//span[text()=\"Ocorrência Fiscal\"]")
	public WebElement ocorrenciaFiscal;
	
	@FindBy(xpath = "//span[text()=\"Status de Ocorrência Fiscal\"]")
	public WebElement statusOcorrencia;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement btnUltimaPagina;	
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	public StatusOcurrenciaFiscalVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		ocorrenciaFiscal.click();
		
		sleep(2000);
		statusOcorrencia.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("StatusOcorrenciaFiscal");
		System.out.println("ID Registro: " + idRegistro);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement opc = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		opc.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		// Datos de Visualizar
		String empresa = driver.findElement(By.xpath("//span[@id=\"company\"]")).getText().trim();
		String uf = driver.findElement(By.xpath("//span[@id=\"state\"]")).getText().trim();
		String filial = driver.findElement(By.xpath("//span[@id=\"branch\"]")).getText().trim().replace("_", " - ");
		String descricao = driver.findElement(By.xpath("//span[@id=\"description\"]")).getText().trim();
		String dataInicial = driver.findElement(By.xpath("//span[@id=\"startDate\"]")).getText().trim();
		
		System.out.println("----------------DATOS DE VISUALIZAR--------------");
		System.out.println("Empresa: " + empresa);
		System.out.println("UF: " + uf);
		System.out.println("Filial: " + filial);
		System.out.println("Descricao: " + descricao);
		System.out.println("Data inicial: " + dataInicial);
		
		btnBiblioteca.click();
		
		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		btnUltimaPagina.click();
		
		sleep(2000);		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		opc = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		opc.click();
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		// Datos de Editar
		String empresa1 = driver.findElement(By.xpath("//div[@id=\"company\"]/div/div[2]/div/div/div/div/div[1]")).getText().trim();
		String uf1 = driver.findElement(By.xpath("//div[@id=\"state\"]/div/div[2]/div/div/div/div/div[1]")).getText().trim();
		String filial1 = driver.findElement(By.xpath("//div[@id=\"branch\"]/div/div[2]/div/div/div/div/div[1]")).getText().trim();
		String descricao1 = driver.findElement(By.xpath("//div[@id=\"description\"]/div/textarea")).getAttribute("value").trim();
		String dataInicial1 = driver.findElement(By.xpath("//div[@id=\"startDate\"]/div/div/input")).getAttribute("value").trim();
		
		System.out.println("----------------DATOS DE EDITAR--------------");
		System.out.println("Empresa: " + empresa1);
		System.out.println("UF: " + uf1);
		System.out.println("Filial: " + filial1);
		System.out.println("Descricao: " + descricao1);
		System.out.println("Data inicial: " + dataInicial1);		
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresa1.equals(empresa));
		sucesso.add(uf1.equals(uf));
		sucesso.add(filial1.equals(filial));
		sucesso.add(descricao1.equals(descricao));
		sucesso.add(dataInicial1.equals(dataInicial));
		
		System.out.println(sucesso);
		
		return sucesso;
	}
}
