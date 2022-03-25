package com.sap.timp.pageObjectModel.LOG.LogDeAções;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class LogDeAçõesDetalhesPO extends TestBaseMassiel{

	@FindBy(xpath = "//div[@class=\"left-content\"]/div[2]/ul/li[1]")
	public WebElement LogDeAções;
	
	@FindBy(xpath = "//div[@class=\"log\"]/div/div[2]/div[1]/table/tbody/tr[1]/td[2]")
	public WebElement idD;
	
	@FindBy(xpath = "//div[@class=\"log\"]/div/div[2]/div[1]/table/tbody/tr[2]/td[2]")
	public WebElement usuarioD;
	
	@FindBy(xpath = "//div[@class=\"log\"]/div/div[2]/div[1]/table/tbody/tr[3]/td[2]")
	public WebElement componenteD;
	
	@FindBy(xpath = "//div[@class=\"log\"]/div/div[2]/div[1]/table/tbody/tr[4]/td[2]")
	public WebElement dataD;
	
	@FindBy(xpath = "//div[@class=\"log\"]/div/div[2]/div[1]/table/tbody/tr[5]/td[2]")
	public WebElement horaD;
	
	@FindBy(xpath = "//div[@class=\"log\"]/div/div[2]/div[1]/table/tbody/tr[6]/td[2]")
	public WebElement codigoD;
	
	@FindBy(xpath = "//div[@class=\"log\"]/div/div[2]/div[1]/table/tbody/tr[10]/td[2]")
	public WebElement mensajeD;
	
	public LogDeAçõesDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> detalle() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		LogDeAções.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String id = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[2]/div")).getText();
		String usuario= driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[3]/div")).getText();
		String componente  = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[4]/div")).getText();
		String codigo = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[5]/div")).getText();
		String data = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[7]/div")).getText();
		String hora = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[8]/div")).getText();
		String mensaje = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[9]/div")).getText();
		
		System.out.println(id);
		System.out.println(usuario);
		System.out.println(componente);
		System.out.println(codigo);
		System.out.println(data);
		System.out.println(hora);
		System.out.println(mensaje);
		
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id]/div[1]/div"));
		
		menu.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idDetalle = idD.getText();
		String usuarioDetalle = usuarioD.getText();
		String componenteDetalle = componenteD.getText();
		String dataDetalle = dataD.getText();
		String horaDetalle = horaD.getText();
		String codigoDetalle = codigoD.getText();
		String mensajeDetalle = mensajeD.getText();
		
		System.out.println(idDetalle );
		System.out.println(usuarioDetalle);
		System.out.println(componenteDetalle);
		System.out.println(dataDetalle);
		System.out.println(horaDetalle);
		System.out.println(codigoDetalle);
		System.out.println(mensajeDetalle);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(idDetalle.equals(id));
		sucesso.add(usuarioDetalle.equals(usuario));
		sucesso.add(componenteDetalle.equals(componente));
		sucesso.add(dataDetalle.equals(data));
		sucesso.add(horaDetalle.contains(hora));
		sucesso.add(codigoDetalle.equals(codigo));
		sucesso.add(mensajeDetalle.contains(mensaje));
		
		System.out.println(sucesso);
		return sucesso;
	}
		
		

}
