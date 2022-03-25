package com.sap.timp.pageObjectModel.MDR.DeterminacaoRelevanciaTarefaMotivoReabertura.RegradeReabertura;

import java.security.PublicKey;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class RegradeReaberturaDetallesPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Determinação de Relevância de Tarefa por Motivo de Reabertura\"]")
	public WebElement dRTPMR;

	//submenu
	@FindBy(xpath = "//span[text()=\"Regra de Reabertura\"]")
	public WebElement RDR;

	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;

	@FindBy(xpath = "//div[@class=\"action-button\"]")
	public WebElement botonMenu;
	

	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement codigo;

	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement descripcion;

	@FindBy(xpath="//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement fecha;
	
	@FindBy(xpath ="//span[@id=\"ruleCode\"]")
	public WebElement codigo1;
	
	@FindBy(xpath ="//span[@id=\"description\"]")
	public WebElement descripcion1;
	
	@FindBy(xpath="//span[@id=\"validFrom\"]")
	public WebElement fecha1;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement cerrar;
	
	public RegradeReaberturaDetallesPO() {
		PageFactory.initElements(driver, this);
		
	}
	
	public ArrayList<Boolean>  Detalle() {
		
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
		System.out.println(idRegistro);
		
		sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement detalle = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));

		menu.click();
		sleep(1000);
		detalle.click();
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
		cerrar.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		sleep(2000);
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		visualizar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoCodigo1 =  codigo1.getText();
		String textoDescripcion1 = descripcion1.getText();
		String textoFecha1 = fecha1.getText();
		
		System.out.println("-------------------------------------------");
		System.out.println("Código de Regra: " + textoCodigo1);
		System.out.println("Descrição: " + textoDescripcion1);
		System.out.println("Data de Inicio de Vigência: " + textoFecha1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textoCodigo1.equals(textoCodigo));
		sucesso.add(textoDescripcion1.equals(textoDescripcion));
		sucesso.add(textoFecha1.contains(textoFecha));
		
		return sucesso;
		
	}


}
