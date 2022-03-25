package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioICMS.ConfiguracaoEExecucaoRegistro1200;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ConfiguracaoEExecucaoRegistro1200VisualizarPO extends TestBaseSteven {


	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário ICMS\"]")
	public WebElement gestaoCredito;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-taxCreditManagement\"]/div/span[text()=\"Configuração e Execução\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-register1200Configuration\"]")
	public WebElement registro1200;


	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	
	
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/input")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement filial;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Código de Crédito\"]")
	public WebElement controleCredito;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Descrição do Controle\"]")
	public WebElement descricaoControle;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione Código de Ajuste\"]")
	public WebElement associacao;
	

	@FindBy(xpath = "//div[@id=\"totalSuitableCreditInMonth\"]/div/div/div/input")
	public WebElement apropriadoMes;
	
	@FindBy(xpath = "//div[@id=\"totalCreditReceivedByTransfer\"]/div/div/div/input")
	public WebElement recebidosTransferencia;
	
	@FindBy(xpath = "//div[@id=\"totalCreditUsedInPeriod\"]/div/div/div/input")
	public WebElement utilizadosPeriodo;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	public ConfiguracaoEExecucaoRegistro1200VisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		
		gestaoCredito.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registro1200.click();
		
		invisibilityOfElementOverlay();
		
		siguiente.click();
		
		invisibilityOfElementOverlay();
		
		
		String idRegistro = idObter("id-GCT-ICMS-ConfiguracaoEExecucacoRegistro1200");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));


		menu.click();
		sleep(1000);
		acao.click();
		sleep(3000);
		waitExpectXpath("//div[@id=\"branch\"]/div/div[1]/div[1]/div[1]/div[1]/div[1]");
		sleep(2000);


		String empresaV = empresa.getText();
		String ufV = uf.getText();
		String filialV = filial.getText();
		String tributoV = tributo.getAttribute("value");
		String controleCreditoV = controleCredito.getAttribute("value");
		String descricaoControlev = descricaoControle.getAttribute("value");
		String associacaoV = associacao.getAttribute("value");
		String apropriadoMesV = apropriadoMes.getAttribute("value");
		String recebidosTransferenciaV = recebidosTransferencia.getAttribute("value");
		String utilizadosPeriodoV = utilizadosPeriodo.getAttribute("value");
		
		System.out.println("---------------Informação no Visualizar-----------------");
		System.out.println(empresaV);
		System.out.println(ufV);
		System.out.println(filialV);
		System.out.println(tributoV);
		System.out.println(controleCreditoV);
		System.out.println(descricaoControlev);
		System.out.println(associacaoV);
		System.out.println(apropriadoMesV);
		System.out.println(recebidosTransferenciaV);
		System.out.println(utilizadosPeriodoV);
		
		
		biblioteca.click();
		
		invisibilityOfElementOverlay();
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		acao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));


		menu.click();
		sleep(1000);
		acao.click();
		sleep(3000);
		waitExpectXpath("//div[@id=\"branch\"]/div/div[1]/div[1]/div[1]/div[1]/div[1]");
		sleep(2000);
		

		String empresaE = empresa.getText();
		String ufE = uf.getText();
		String filialE = filial.getText();
		String tributoE = tributo.getAttribute("value");
		String controleCreditoE = controleCredito.getAttribute("value");
		String descricaoControleE = descricaoControle.getAttribute("value");
		String associacaoE = associacao.getAttribute("value");
		String apropriadoMesE = apropriadoMes.getAttribute("value");
		String recebidosTransferenciaE = recebidosTransferencia.getAttribute("value");
		String utilizadosPeriodoE = utilizadosPeriodo.getAttribute("value");
		
		
		System.out.println("---------------Informação na Edição-----------------");
		System.out.println(empresaE);
		System.out.println(ufE);
		System.out.println(filialE);
		System.out.println(tributoE);
		System.out.println(controleCreditoE);
		System.out.println(descricaoControleE);
		System.out.println(associacaoE);
		System.out.println(apropriadoMesE);
		System.out.println(recebidosTransferenciaE);
		System.out.println(utilizadosPeriodoE);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		

		sucesso.add(empresaE.equals(empresaV));
		sucesso.add(ufE.equals(ufV));
		sucesso.add(filialE.equals(filialV));
		sucesso.add(tributoE.equals(tributoV));
		sucesso.add(controleCreditoE.equals(controleCreditoV));
		sucesso.add(descricaoControleE.equals(descricaoControlev));
		sucesso.add(associacaoE.equals(associacaoV));
		sucesso.add(apropriadoMesE.equals(apropriadoMesV));
		sucesso.add(recebidosTransferenciaE.equals(recebidosTransferenciaV));
		sucesso.add(utilizadosPeriodoE.equals(utilizadosPeriodoV));
		
		System.out.println(sucesso);
		return sucesso;

	}

}
