package com.sap.timp.pageObjectModel.BCB.ParametrosGeraisHierarquia.Hierarquia;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class ParametrosGeraisHierarquiaRaizPO extends TestBaseKenssy{
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][1]")
	public WebElement hierarquias;

	@FindBy(xpath = "//*[@id=\"nav-hierarchies-folders-wrapper\"]/div/div/div[1]")
	public WebElement hierarquiaRaiz;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	//USUARIO DE CREACION DEL DETALLE
	@FindBy(xpath = "//span[@id=\"username\"]")
	public WebElement usuarioLogueado;
	
	@FindBy(xpath = "//div[@id=\"detail-history\"][1]/div[2]/div[1]")
	public WebElement usuario;
	
	public ParametrosGeraisHierarquiaRaizPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean raizHierarquia() {
		
		sleep(2000);
		hierarquias.click();
		sleep(1100);
		hierarquiaRaiz.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter1();
		
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhe\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		//CAPTURO USUARIO LOGUEADO
			String usuarioLogueadoValor = usuarioLogueado.getText();
		//IMPRIMIR USUARIO DE CREACION DEL DETALLE
			System.out.println("****USUARIO LOGUEADO*********");
			System.out.println("Usuario Logueado:" + usuarioLogueadoValor);
		
		
		//CAPTURAR USUARIO DE CREACION DEL DETALLE
			String usuarioCreacionDValor = usuario.getText();
		//IMPRIMIR USUARIO DE CREACION DEL DETALLE
			System.out.println("****USUARIO CRIACAO DETALHE*********");
			System.out.println("Usuario Criacao:" + usuarioCreacionDValor);
		
		System.out.println("Registro que cree:"+idRegistro);
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id="+idRegistro+"]/div[4]/div")).getText();
		System.out.println(idRegistro1);
		
		boolean sucesso = false;
		
		if (usuarioCreacionDValor.contains(usuarioLogueadoValor)) {
			sucesso = true;
			System.out.println("soy true");
		}else {
			sucesso=false;
			System.out.println("soy false");
		}
	
		return sucesso;
		
	}

}
