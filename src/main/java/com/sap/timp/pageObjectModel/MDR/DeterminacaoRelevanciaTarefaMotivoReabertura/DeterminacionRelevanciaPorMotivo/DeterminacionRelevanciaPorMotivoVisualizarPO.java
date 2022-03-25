package com.sap.timp.pageObjectModel.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.DeterminacionRelevanciaPorMotivo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DeterminacionRelevanciaPorMotivoVisualizarPO extends TestBaseSteven {
	

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//span[text()=\"Determinação de Relevância de Tarefa por Motivo de Reabertura\"]")
	public WebElement determinacaoRelevancia;
	
	@FindBy(xpath = "//span[text()=\"Determinação de Relevância por Motivo\"]")
	public WebElement motivoReabertura;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresa;	
	
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement uf;
	
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//span[@id=\"motiveCode\"]")
	public WebElement codMotivo;
	
	@FindBy(xpath = "//span[@id=\"motiveCodeDescription\"]")
	public WebElement codMotivoDesc;
	
	@FindBy(xpath = "//span[@id=\"ruleCode\"]")
	public WebElement regla;
	
	@FindBy(xpath = "//span[@id=\"ruleCodeDescription\"]")
	public WebElement reglaDesc;
	
	@FindBy(xpath = "//span[@id=\"output\"]")
	public WebElement llave;
	

	@FindBy(xpath = "//*[@id=\"company\"]/div")
	public WebElement empresaE;
	
	@FindBy(xpath = "//*[@id=\"uf\"]/div")
	public WebElement ufE;

	@FindBy(xpath = "//*[@id=\"branch\"]/div/div[1]/div[1]/div[2]/input")
	public WebElement filialE;
	
	@FindBy(xpath = "//*[@id=\"tax\"]/div/div[1]/div[1]/div[2]/input")
	public WebElement tributoE;
	
	@FindBy(xpath = "//*[@id=\"motiveCode\"]/div")
	public WebElement codMotivoE;
	
	@FindBy(xpath = "//*[@id=\"motiveCodeDescription\"]/div/div/input")
	public WebElement codMotivoDescE;
	
	@FindBy(xpath = "//*[@id=\"ruleCode\"]/div")
	public WebElement reglaE;
	
	@FindBy(xpath = "//*[@id=\"ruleCodeDescription\"]/div/div/input")
	public WebElement reglaDescE;
	
	
	@FindBy(xpath = "//*[@id=\"output\"]/div")
	public WebElement llaveE;
	
	
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public DeterminacionRelevanciaPorMotivoVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		determinacaoRelevancia.click();
		sleep(2000);
		motivoReabertura.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("DeterminacaoRelevanciaPorMotivo");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
//		
//		sleep(2000);
//		menu.click();
//		sleep(1000);
//		
//		açao.click();
//		sleep(2000);
//		
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		String empresaTexto = empresa.getText();
//		String ufTexto = uf.getText();
//		String filialTexto = filial.getText();
//		String tributoTexto = tributo.getText();
//		String codMotivoTexto = codMotivo.getText();
//		String codMotivoDescTexto = codMotivoDesc.getText();
//		String reglaTexto = regla.getText();
//		String reglaDescTexto = reglaDesc.getText();
//		String llaveTexto = llave.getText();
//		
//		
//		System.out.println(empresaTexto);
//		System.out.println(ufTexto);
//		System.out.println(filialTexto);
//		System.out.println(tributoTexto);
//		System.out.println(codMotivoTexto);
//		System.out.println(codMotivoDescTexto);
//		System.out.println(reglaTexto);
//		System.out.println(reglaDescTexto);
//		System.out.println(llaveTexto);
		

		
//		String codigoV1 = codigoV.getText();
//		String descricaoV1 = descricaoV.getText();
//		String dataVigenciaV1 = dataVigenciaV.getText();
//		
//		System.out.println(codigoV1);
//		System.out.println(descricaoV1);
//		System.out.println(dataVigenciaV1);
		
//		biblioteca.click();
//		
//		sleep(3000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		siguiente.click();
//		sleep(2000);
//		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		sleep(2000);
//		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);
		
		String empresaTextoE = empresaE.getAttribute("value");
		String ufTextoE = ufE.getAttribute("value");
		String filialTextoE = filialE.getAttribute("value");
		String tributoTextoE = tributoE.getAttribute("value");
		String codMotivoTextoE = codMotivoE.getAttribute("value");
		String codMotivoDescTextoE = codMotivoDescE.getAttribute("value");
		String reglaTextoE = reglaE.getAttribute("value");
		String reglaDescTextoE = reglaDescE.getAttribute("value");
		String llaveTextoE = llaveE.getAttribute("value");
		
		System.out.println(empresaTextoE);
		System.out.println(ufTextoE);
		System.out.println(filialTextoE);
		System.out.println(tributoTextoE);
		System.out.println(codMotivoTextoE);
		System.out.println(codMotivoDescTextoE);
		System.out.println(reglaTextoE);
		System.out.println(reglaDescTextoE);
		System.out.println(llaveTextoE);
		
//		String codigoE1 = codigoE.getAttribute("value");
//		String descricaoE1 = descricaoE.getAttribute("value");
//		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");
//
//		
//		
//		System.out.println(codigoE1);
//		System.out.println(descricaoE1);
//		System.out.println(dataVigenciaE1);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		
//		sucesso.add(empresaTexto.contains(empresaTextoE));
//		sucesso.add(ufTexto.contains(ufTextoE));
//		sucesso.add(filialTexto.contains(filialTextoE));
//		sucesso.add(tributoTexto.contains(tributoTextoE));
//		sucesso.add(codMotivoTexto.contains(codMotivoTextoE));
//		sucesso.add(codMotivoDescTexto.contains(codMotivoDescTextoE));
//		sucesso.add(reglaTexto.contains(reglaTextoE));
//		sucesso.add(reglaDescTexto.contains(reglaDescTextoE));
//		sucesso.add(llaveTexto.contains(llaveTextoE));
		
//		sucesso.add(descricaoV1.contains(descricaoE1));
//		sucesso.add(dataVigenciaV1.contains(dataVigenciaE1));

		
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}

}
