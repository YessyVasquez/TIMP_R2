package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioPIS.ConfiguracaoEExecucao.RegistroM300;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class RegistroM300VisualizarPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário PIS\"]")
	public WebElement apuraçãoCrédito;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisCalculationConfiguration\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM300\"]")
	public WebElement registroM300;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//div[@id=\"company\"]/div/div[1]/div[1]/input")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div[1]/div[1]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div[1]/div[1]")
	public WebElement filial;
	
	@FindBy(xpath = "//div[@id=\"codCont\"]/div/div/input")
	public WebElement códigoContribuiçãoSocialDiferidaPeríodosAnteriores;
	
	@FindBy(xpath = "//div[@id=\"vlContApurDifer\"]/div/div/input")
	public WebElement valorContribuiçãoApurada;
	
	@FindBy(xpath = "//div[@id=\"vlContDiferAnt\"]/div/div/input")
	public WebElement valorContribuiçãoRecolherDiferidaPeríodosAnteriores;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement no;
	
	public RegistroM300VisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> Visualizar() {
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(4000);
		apuraçãoCrédito.click();
		sleep(4000);
		configuracaoEExecucao.click();
		sleep(4000);
		registroM300.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		siguiente.click();
		sleep(2000);
		
		String idRegistro = idObter("ApuraçãodeCréditoTributárioPISRegistroM300");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		
		
		
		String empresaVisualizar = empresa.getAttribute("value");
		String ufVisualizar = uf.getText();
		String filialVisualizar = filial.getText();
		String códigoContribuiçãoSocialDiferidaPeríodosAnterioresVisualizar = códigoContribuiçãoSocialDiferidaPeríodosAnteriores.getAttribute("value");
		String valorContribuiçãoApuradaVisualizar = valorContribuiçãoApurada.getAttribute("value");
		String valorContribuiçãoRecolherDiferidaPeríodosAnterioresVisualizar = valorContribuiçãoRecolherDiferidaPeríodosAnteriores.getAttribute("value");
		
		System.out.println(" empresa"+empresaVisualizar);
		System.out.println(ufVisualizar);
		System.out.println(filialVisualizar);
		System.out.println(códigoContribuiçãoSocialDiferidaPeríodosAnterioresVisualizar);
		System.out.println(valorContribuiçãoApuradaVisualizar);
		System.out.println(valorContribuiçãoRecolherDiferidaPeríodosAnterioresVisualizar);
		
		biblioteca.click();
		sleep(4000);
	
		
		sleep(4000);
		waitExpectElement(siguiente);
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu1.click();
		sleep(1000);
		editar.click();
		sleep(6000);
		
		
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		
		String empresaEditar = empresa.getAttribute("value");
		String ufEditar = uf.getText();
		String filialEditar = filial.getText();
		String códigoContribuiçãoSocialDiferidaPeríodosAnterioresEditar = códigoContribuiçãoSocialDiferidaPeríodosAnteriores.getAttribute("value");
		String valorContribuiçãoApuradaEditar = valorContribuiçãoApurada.getAttribute("value");
		String valorContribuiçãoRecolherDiferidaPeríodosAnterioresEditar = valorContribuiçãoRecolherDiferidaPeríodosAnteriores.getAttribute("value");
		
		System.out.println("------------------------------");
		
		System.out.println(empresaEditar);
		System.out.println(ufEditar);
		System.out.println(filialEditar);
		System.out.println(códigoContribuiçãoSocialDiferidaPeríodosAnterioresEditar);
		System.out.println(valorContribuiçãoApuradaEditar );
		System.out.println(valorContribuiçãoRecolherDiferidaPeríodosAnterioresEditar);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaEditar.contains(empresaVisualizar));
		sucesso.add(ufEditar.contains(ufVisualizar));
		sucesso.add(filialEditar.contains(filialVisualizar));
		sucesso.add(códigoContribuiçãoSocialDiferidaPeríodosAnterioresEditar.contains(códigoContribuiçãoSocialDiferidaPeríodosAnterioresVisualizar));
		sucesso.add(valorContribuiçãoApuradaEditar.contains(valorContribuiçãoApuradaVisualizar));
		sucesso.add(valorContribuiçãoRecolherDiferidaPeríodosAnterioresEditar.contains(valorContribuiçãoRecolherDiferidaPeríodosAnterioresVisualizar));
		
		System.out.println(sucesso);
		return sucesso;
	}
}
