package com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.GrupoAtividadeFiscal;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class GrupoAtividadeFiscalDetallePO extends TestBaseMassiel{

	@FindBy(xpath = "//span[text()=\"Atividades Fiscais\"]")
	public WebElement actividad;

	//submenu
	@FindBy(xpath = "//span[text()=\"Grupos de Atividades Fiscais\"]")
	public WebElement grupo;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement ultimaPagina;

	@FindBy(xpath = "//div[@class=\"action-button\"]")
	public WebElement botonMenu;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement grupoActividad;

	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement descripcion;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement fechavalidade;
	
	@FindBy(xpath ="//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement fechavalidadeAte;
	
	@FindBy(xpath ="//span[@id=\"grupoAtividade\"]")
	public WebElement grupoActividad1;

	@FindBy(xpath ="//span[@id=\"descricao\"]")
	public WebElement descripcion1;
	
	@FindBy(xpath ="//span[@id=\"dataVigenciaInicio\"]")
	public WebElement fechavalidade1;
	
	@FindBy(xpath ="//span[@id=\"dataVigenciaFim\"]")
	public WebElement fechavalidadeAte1;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement cerrar;
	
	public GrupoAtividadeFiscalDetallePO(){
		PageFactory.initElements(driver, this);
		
	}
	
	public ArrayList<Boolean> Detalle() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		actividad.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		grupo.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro =idObter("GrupoAtividadeFiscal");
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
		
		String textoGrupoActividad = grupoActividad.getText();
		String textoDescripcion = descripcion.getText();
		String textoFechaValidadeDe = fechavalidade.getText();
		String textoFechaValidadeAte = fechavalidadeAte.getText();
		
		System.out.println("Grupo Actividad: " + textoGrupoActividad);
		System.out.println("Descrição: " + textoDescripcion);
		System.out.println("Validade De: " + textoFechaValidadeDe);
		System.out.println("Validade Ate: " + textoFechaValidadeAte);
		
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
		
		String textoGrupoActividad1 = grupoActividad1.getText();
		String textoDescripcion1 = descripcion1.getText();
		String textoFechaValidadeDe1 = fechavalidade1.getText();
		String textoFechaValidadeAte1 = fechavalidadeAte1.getText();
		
		System.out.println("-------------------------------------------");
		System.out.println("Grupo Actividad: " + textoGrupoActividad1);
		System.out.println("Descrição: " + textoDescripcion1);
		System.out.println("Validade De: " + textoFechaValidadeDe1);
		System.out.println("Validade Ate: " + textoFechaValidadeAte1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(textoGrupoActividad1.equals(textoGrupoActividad));
		sucesso.add(textoDescripcion1.equals(textoDescripcion));
		sucesso.add(textoFechaValidadeDe1.contains(textoFechaValidadeDe));
		//sucesso.add(textoFechaValidadeAte1.contains(textoFechaValidadeAte));
		System.out.println(sucesso);
		return sucesso;
	}
	
}
