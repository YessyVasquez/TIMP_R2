package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.UnidadeDeMedida;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseSteven;

public class UnidadeDeMedidaVisualizarPO extends TestBaseSteven {
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoio;
	
	@FindBy(xpath = "//span[text()=\"Unidade de Medida\"]")
	public WebElement unidadeDeMedida;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	

	@FindBy(xpath = "//td[@id=\"codeMeasurementUnit\"]/span")
	public WebElement unidadeV;
	@FindBy(xpath = "//td[@id=\"description\"]/span")
	public WebElement descriçãoV;
	@FindBy(xpath = "//td[@id=\"effectiveDateFrom\"]/span")
	public WebElement dataVigenciaV;
	
	

	@FindBy(xpath = "//input[contains(@placeholder,\"Unidade\")]")
	public WebElement unidadeE;
	@FindBy(xpath = "//textarea[contains(@placeholder,\"Preencher Descrição\")]")
	public WebElement descricaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\")]")
	public WebElement dataVigenciaE;
	
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	public UnidadeDeMedidaVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		tabelaApoio.click();
		sleep(2000);
		unidadeDeMedida.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("UnidadeDeMedida");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		
		açao.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String unidadeV1 = unidadeV.getText();
		String descricaoV1 = descriçãoV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();
		
		System.out.println(unidadeV1);
		System.out.println(descricaoV1);
		System.out.println(dataVigenciaV1);
		
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String unidadeE1 = unidadeE.getAttribute("value");
		String descricaoE1 = descricaoE.getAttribute("value");
		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");


		System.out.println(unidadeE1);
		System.out.println(descricaoE1);
		System.out.println(dataVigenciaE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(unidadeV1.contains(unidadeE1));
		sucesso.add(descricaoV1.contains(descricaoE1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaE1));

		
		
		
		System.out.println(sucesso);
		
		return sucesso;
	}

}
