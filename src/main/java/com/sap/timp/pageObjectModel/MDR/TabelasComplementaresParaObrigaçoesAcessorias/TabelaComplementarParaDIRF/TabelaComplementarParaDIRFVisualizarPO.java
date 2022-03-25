package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaComplementarParaDIRF;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaComplementarParaDIRFVisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement tabelacomplementares;
	
	@FindBy(xpath = "//span[text()=\"Tabela Complementar para DIRF\"]")
	public WebElement tabeladecomplementarparadirf;
	
	
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
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufvi;
	
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialvi;
	
	@FindBy(xpath = "//span[@id=\"cnpj\"]")
	public WebElement cnpjvi;
	
	@FindBy(xpath="//span[@id=\"name\"]")
	public WebElement nomevi;
	
	@FindBy(xpath = "//span[@id=\"ansRegister\"]")
	public WebElement ansvi;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-SP\"]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000_SP_0001\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o CNPJ\"]")
	public WebElement cnpj;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Nome\"]")
	public WebElement nome;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o Registro ANS\"]")
	public WebElement ans;
	
	
	public TabelaComplementarParaDIRFVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		tabelacomplementares.click();
		sleep(2000);
		
		tabeladecomplementarparadirf.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("TabelaComplementarParaDIRF");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		//visualizar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//visualizar
		

		String empresavisualizar = empresavi.getText();
		String ufvisualizar = ufvi.getText();
		String filialvisualizar = filialvi.getText();
		String cnpjvisualizar = cnpjvi.getText();
		String nomevisualizar = nomevi.getText();
		String ansvisualizar = ansvi.getText();
		
		
		
		System.out.println(empresavisualizar);
		System.out.println(ufvisualizar);
		System.out.println(filialvisualizar);
		System.out.println(cnpjvisualizar);
		System.out.println(nomevisualizar);
		System.out.println(ansvisualizar);
	
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar

		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//editar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		waitExpectElement(empresa);
		sleep(2000);
		
		String empresaeditar=empresa.getText();
		String ufeditar=uf.getText();
		String filialeditar = filial.getText();
		String cnpjeditar = cnpj.getAttribute("value");
		String nomeeditar = nome.getAttribute("value");
		String anseditar = ans.getAttribute("value");
		filialeditar=filialeditar.replace(" ", "");
		System.out.println(empresaeditar);
		System.out.println(ufeditar);
		System.out.println(filialeditar);
		System.out.println(cnpjeditar);
		System.out.println(nomeeditar);
		System.out.println(anseditar);
	
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresavisualizar.equals(empresaeditar));
		sucesso.add(ufvisualizar.equals(ufeditar));
		sucesso.add(filialvisualizar.contains(filialeditar));
		sucesso.add(cnpjvisualizar.equals(cnpjeditar));
		sucesso.add(nomevisualizar.equals(nomeeditar));
		sucesso.add(ansvisualizar.equals(anseditar));
		System.out.println(sucesso);
		return sucesso;	

	
	}	


}
