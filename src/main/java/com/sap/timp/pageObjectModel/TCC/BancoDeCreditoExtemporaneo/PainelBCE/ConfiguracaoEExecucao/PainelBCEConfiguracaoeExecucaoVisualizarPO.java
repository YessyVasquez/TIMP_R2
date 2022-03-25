package com.sap.timp.pageObjectModel.TCC.BancoDeCreditoExtemporaneo.PainelBCE.ConfiguracaoEExecucao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class PainelBCEConfiguracaoeExecucaoVisualizarPO extends TestBaseKenssy {
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bce\"]")
	public WebElement bancoCreditoExtemporaneo;

	@FindBy(xpath = "//li[@identifier=\"accordion-item-bcePanel\"]")
	public WebElement painelBCE;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-bcePanelConfiguration\"]")
	public WebElement subPastaConfiguracaoDeExecucao;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	
	//DATOS VISUALIZAR
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div")
	public WebElement empresaV;
	@FindBy(xpath = "//div[@id=\"branch\"][1]/div/div/div/div/div/div[1]")
	public WebElement filialV;
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div/input")
	public WebElement tributoV;
	@FindBy(xpath = "//div[@id=\"layout\"]/div/div/input")
	public WebElement leiauteV;
	@FindBy(xpath = "//div[@id=\"component\"]/div/div/div/input")
	public WebElement componenteV;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	//DATOS DEL EDITAR
	@FindBy(xpath = "//div[@id=\"company\"]/div/div/div/div/div/div")
	public WebElement empresaE;
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div/div/div/div/div")
	public WebElement filialE;
	@FindBy(xpath = "//div[@id=\"tax\"]/div/div/div/input")
	public WebElement tributoE;
	@FindBy(xpath = "//div[@id=\"layout\"]/div/div/input")
	public WebElement leiauteE;
	@FindBy(xpath = "//div[@id=\"component\"]/div/div/div/input")
	public WebElement componenteE;
	
	
	public PainelBCEConfiguracaoeExecucaoVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		bancoCreditoExtemporaneo.click();
		sleep(2000);
		painelBCE.click();
		sleep(2000);
		subPastaConfiguracaoDeExecucao.click();
		invisibilityOfElementOverlay();
		
		siguiente.click();
		invisibilityOfElementOverlay();
		
		//String idRegistro = idObter1();
		String idRegistro = idObter("idBCEPainelBCEConfiguracaoEExecucaco");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));
		
		menu.click();
		sleep(1000);
		visualizar.click();
		invisibilityOfElementOverlay();

		sleep(16000);

		
		String empresaV1 = empresaV.getText();
		String filialV1 = filialV.getText();
		String tributoV1 = tributoV.getText();
		String leiauteV1 = leiauteV.getText();
		String componenteV1 = componenteV.getText();
		
		System.out.println("--------- DATOS DEL VISUALIZAR ------");
		System.out.println("Empresa:"+ empresaV1);
		System.out.println("Filial:"+ filialV1);
		System.out.println("Tributo:"+ tributoV1);
		System.out.println("Leiaute:"+ leiauteV1);
		System.out.println("Componente:"+ componenteV1);
		
		fechar.click();
		sleep(2000);
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu1.click();
		sleep(1000);
		editar1.click();
		invisibilityOfElementOverlay();

		sleep(9000);

		
		String empresaE1 = empresaE.getText();
		String filialE1 = filialE.getText();
		String tributoE1 = tributoE.getText();
		String leiauteE1 = leiauteE.getText();
		String componenteE1 = componenteE.getText();
		
		System.out.println("");
		System.out.println("--------- DATOS DEL EDITAR ------");
		System.out.println("Empresa:"+ empresaE1);
		System.out.println("Filial:"+ filialE1);
		System.out.println("Tributo:"+ tributoE1);
		System.out.println("Leiaute:"+ leiauteE1);
		System.out.println("Componente:"+ componenteE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			sucesso.add(empresaV1.contains(empresaE1));
			sucesso.add(filialV1.contains(filialE1));
			sucesso.add(tributoV1.contains(tributoE1));
			sucesso.add(leiauteV1.contains(leiauteE1));
			sucesso.add(componenteV1.contains(componenteE1));
		System.out.println(sucesso);

		return sucesso;		
	}
}
