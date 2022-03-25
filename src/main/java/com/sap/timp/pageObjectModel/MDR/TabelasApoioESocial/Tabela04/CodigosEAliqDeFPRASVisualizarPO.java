package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela04;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class CodigosEAliqDeFPRASVisualizarPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Tabela 04 - Códigos e Alíq. de FPAS\"]")
	public WebElement tabela04;
	
	@FindBy(xpath = "//span[text()=\"Novo Código e Alíq. de FPAS\"]")
	public WebElement novo;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Codigo FPAS\"]")
	public WebElement codigo;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Base de Cálculo\"]")
	public WebElement base;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Descrição das Atividades\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Entidade\"]")
	public WebElement entidade;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Situação do Contribuinte\"]")
	public WebElement contribuinte;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Preencher Combinação de dos Códigos de Terceiros\"]")
	public WebElement combinacao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código de Terceiros\"]")
	public WebElement codigodeterceiros;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Alíquota\"]")
	public WebElement aliquota;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Validade De\"]")
	public WebElement datainicio;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//td[@id=\"fpasCode\"]/span")
	public WebElement codigovi;
	
	@FindBy(xpath = "//td[@id=\"calculationBase\"]/span")
	public WebElement basevi;
	
	@FindBy(xpath = "//td[@id=\"activityDescription\"]/span")
	public WebElement descricaovi;
	
	@FindBy(xpath = "//td[@id=\"entity\"]/span")
	public WebElement entidadevi;
	
	@FindBy(xpath = "//td[@id=\"contributorStatus\"]/span")
	public WebElement contribuintevi;
	
	@FindBy(xpath = "//td[@id=\"combinationCodes\"]/span")
	public WebElement combinacaovi;
	
	@FindBy(xpath = "//td[@id=\"thirdCodes\"]/span")
	public WebElement codigodeterceirosvi;
	
	@FindBy(xpath = "//td[@id=\"aliquota\"]/span")
	public WebElement aliquotavi;
	
	@FindBy(xpath = "//td[@id=\"effectiveDateFrom\"]/span")
	public WebElement datavi;
	
	
	public CodigosEAliqDeFPRASVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		tabelaApoio.click();
		sleep(2000);
		
		tabela04.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("CodigosEAliqDeFPRAS");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//visualizar
		String codigovisualizar =codigovi.getText();
		String descricaovisualizar =descricaovi.getText();
		String basevisualizar = basevi.getText();
		String entidadevisualizar = entidadevi.getText();
		String contribuintevisualizar = contribuintevi.getText();
		String combinacaovisualizar = combinacaovi.getText();
		String codigodeterceirosvisualizar = codigodeterceirosvi.getText();
		String aliquotavisualizar = aliquotavi.getText();
		String datavisualizar =datavi.getText();
		
		
		
		
		System.out.println(codigovisualizar);
		System.out.println(descricaovisualizar);
		System.out.println(basevisualizar);
		System.out.println(entidadevisualizar);
		System.out.println(contribuintevisualizar);
		System.out.println(combinacaovisualizar);
		System.out.println(codigodeterceirosvisualizar);
		System.out.println(aliquotavisualizar);
		System.out.println(datavisualizar);
		
		
		
		
		
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("CodigosEAliqDeFPRAS");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		waitExpectElement(biblioteca);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
			
		//editar
		
		
		String codigoeditar = codigo.getAttribute("value");
		String descricaoeditar=descricao.getAttribute("value");
		String baseeditar = base.getAttribute("value");
		String entidadeeditar = entidade.getAttribute("value");
		String contribuinteeditar = contribuinte.getAttribute("value");
		String combinacaoeditar = combinacao.getAttribute("value");
		String codigodeterceiroseditar = codigodeterceiros.getAttribute("value");
		String aliquotaeditar = aliquota.getAttribute("value");
		String dataeditar = datainicio.getAttribute("value");
		
		System.out.println(codigoeditar);
		System.out.println( descricaoeditar);
		System.out.println(baseeditar);
		System.out.println(entidadeeditar);
		System.out.println(contribuinteeditar);
		System.out.println(combinacaoeditar);
		System.out.println(codigodeterceiroseditar);
		System.out.println(aliquotaeditar);
		System.out.println(dataeditar);
		
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(codigoeditar.equals(codigovisualizar));
		sucesso.add(baseeditar.equals(basevisualizar));
		sucesso.add(entidadeeditar.equals(entidadevisualizar));
		sucesso.add(contribuinteeditar.equals(contribuintevisualizar));
		sucesso.add(combinacaoeditar.equals(combinacaovisualizar));
		sucesso.add(codigodeterceiroseditar.equals(codigodeterceirosvisualizar));
		sucesso.add(aliquotaeditar.equals(aliquotavisualizar));
		sucesso.add(descricaoeditar.equals(descricaovisualizar));
		sucesso.add(dataeditar.equals(datavisualizar));
		return sucesso;	

	
	}	


}
