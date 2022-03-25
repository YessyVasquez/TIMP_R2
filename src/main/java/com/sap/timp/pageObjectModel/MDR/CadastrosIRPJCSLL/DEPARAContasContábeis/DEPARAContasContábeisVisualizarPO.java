package com.sap.timp.pageObjectModel.MDR.CadastrosIRPJCSLL.DEPARAContasContábeis;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class DEPARAContasContábeisVisualizarPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Cadastros IRPJ/CSLL\"]")
	public WebElement cadastro;
	
	//submenu
	@FindBy(xpath = "//span[text()=\" DE-PARA  Contas  Contábeis\"]")
	public WebElement subItem;

	@FindBy(xpath = "//div[@class=\"edit tabs\"]/table/tbody/tr[2]/td/span[1]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@class=\"edit tabs\"]/table/tbody/tr[2]/td/span[2]")
	public WebElement planoContas;
	
	@FindBy(xpath = "//div[@class=\"edit tabs\"]/table/tbody/tr[3]/td/span[1]")
	public WebElement codigoOrigen;
	
	@FindBy(xpath = "//div[@class=\"edit tabs\"]/table/tbody/tr[4]/td/span[1]")
	public WebElement codigoDestino;
	
	@FindBy(xpath = "//div[@class=\"edit tabs\"]/table/tbody/tr[5]/td/span[1]")
	public WebElement dataInicial;
	
	@FindBy(xpath = "//div[@class=\"edit tabs\"]/table/tbody/tr[5]/td/span[2]")
	public WebElement dataFinal;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;
	
	//-----------editar
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div[1]/input")
	public WebElement empresa1;
	
	@FindBy(xpath = "//div[@id=\"chartOfAccounts\"]/div/div/input")
	public WebElement planoContas1;
	
	@FindBy(xpath = "//div[@id=\"originAccountCode\"]/div/div/input")
	public WebElement codigoOrigen1;
	
	@FindBy(xpath = "//div[@id=\"destinationAccountCode\"]/div/div/input")
	public WebElement codigoDestino1;
	
	@FindBy(xpath = "//div[@id=\"effectiveDateFrom\"]/div/div/input")
	public WebElement dataInicial1;
	
	@FindBy(xpath = "//div[@id=\"effectiveDateTo\"]/div/div/input")
	public WebElement dataFinal1;
	
	public DEPARAContasContábeisVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean>  visualizar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		cadastro.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		subItem.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

	
		String idRegistro =idObter("DePARAContasContabeis");

		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String textoEmpresa = empresa.getText();
		String textoPlanoContais = planoContas.getText();
		String textoCodigoOrigen = codigoOrigen.getText();
		String textoCodigoDestino = codigoOrigen.getText();
		String textoDataInicio = dataInicial.getText();

		
		System.out.println("Empresa: " + textoEmpresa);
		System.out.println("Plano Contais: " + textoPlanoContais);
		System.out.println("Codigo Origen: " + textoCodigoOrigen);
		System.out.println("Codigo Destino: " + textoCodigoDestino);
		System.out.println("Data Inicio: " + textoDataInicio);

		
		sleep(2000);
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);

		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		sleep(2000);
		menu1.click();
		sleep(2000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoEmpresa1 = empresa1.getAttribute("value");
		String textoPlanoContais1 = planoContas1.getAttribute("value");
		String textoCodigoOrigen1 = codigoOrigen1.getAttribute("value");
		String textoCodigoDestino1 = codigoOrigen1.getAttribute("value");
		String textoDataInicio1 = dataInicial1.getAttribute("value");

		System.out.println("-------------------------------------------");
		System.out.println("Empresa: " + textoEmpresa1);
		System.out.println("Plano Contais: " + textoPlanoContais1);
		System.out.println("Codigo Origen: " + textoCodigoOrigen1);
		System.out.println("Codigo Destino: " + textoCodigoDestino1);
		System.out.println("Data Inicio: " + textoDataInicio1);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textoEmpresa1.equals(textoEmpresa));
		sucesso.add(textoPlanoContais1.equals(textoPlanoContais1));
		sucesso.add(textoCodigoOrigen1.equals(textoCodigoOrigen));
		sucesso.add(textoCodigoDestino1.equals( textoCodigoDestino));
		sucesso.add(textoDataInicio1.equals(textoDataInicio));

		
		System.out.println(sucesso);
		return sucesso;

	}
}
