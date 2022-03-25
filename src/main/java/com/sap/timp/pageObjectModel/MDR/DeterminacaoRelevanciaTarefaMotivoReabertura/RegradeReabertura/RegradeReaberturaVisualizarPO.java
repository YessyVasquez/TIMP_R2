package com.sap.timp.pageObjectModel.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegradeReabertura;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class RegradeReaberturaVisualizarPO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Determinação de Relevância de Tarefa por Motivo de Reabertura\"]")
	public WebElement dRTPMR;

	//submenu
	@FindBy(xpath = "//span[text()=\"Regra de Reabertura\"]")
	public WebElement RDR;

	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;

	@FindBy(xpath = "//div[@class=\"action-button\"]")
	public WebElement botonMenu;

	@FindBy(xpath ="//span[@id=\"ruleCode\"]")
	public WebElement codigo;

	@FindBy(xpath ="//span[@id=\"description\"]")
	public WebElement descripcion;

	@FindBy(xpath="//span[@id=\"validFrom\"]")
	public WebElement fecha;

	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath ="//*[@id=\"ruleCode\"]/div/div/input")
	public WebElement codigo1;
	
	@FindBy(xpath ="//*[@id=\"description\"]/div/div/input")
	public WebElement descripcion1;
	
	@FindBy(xpath="//*[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement fecha1;

	public RegradeReaberturaVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	


	public ArrayList<Boolean> visualizar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		dRTPMR.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		RDR.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro =idObter("DeterminacaoDeReabertura");

		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String textoCodigo = codigo.getText();
		String textoDescripcion = descripcion.getText();
		String textoFecha = fecha.getText();

		System.out.println("Código de Regra: " + textoCodigo);
		System.out.println("Descrição: " + textoDescripcion);
		System.out.println("Data de Inicio de Vigência: " + textoFecha);

		sleep(2000);
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	
		menu1.click();
		sleep(2000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoCodigo1 =  codigo1.getAttribute("value");
		String textoDescripcion1 = descripcion1.getAttribute("value");
		String textoFecha1 = fecha1.getAttribute("value");
		
		System.out.println("-------------------------------------------");
		System.out.println("Código de Regra: " + textoCodigo1);
		System.out.println("Descrição: " + textoDescripcion1);
		System.out.println("Data de Inicio de Vigência: " + textoFecha1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textoCodigo1.equals(textoCodigo));
		sucesso.add(textoDescripcion1.contains(textoDescripcion));
		sucesso.add(textoFecha1.contains(textoFecha));
		
		return sucesso;
	}


	
	
}
