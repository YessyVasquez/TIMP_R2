package com.sap.timp.pageObjectModel.ADM.Configuração.Usuarios;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class UsuáriosVisualizarPO extends TestBaseSteven {
	@FindBy(xpath = "//div[@class=\"baseTabs-bar boxes\"]/div/div[4]")
	public WebElement usuarios;
	
	@FindBy(xpath = "//span[text()=\"Usuários\"]")
	public WebElement subUsuarios;
	
	@FindBy(xpath = "//span[text()=\"Configuração de Tributo X Tributo Grupo\"]")
	public WebElement ConfiguraçãodeTributosXTributo;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement btnPrimeraPagina;

	@FindBy(xpath = "//input[@placeholder=\"Preencher Cargo do Usuário\"]")
	public WebElement cargo;
	
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[1]/div[2]/span/span")
	public WebElement next;
	
	@FindBy(xpath = "//*[@id=\"search-input\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement pesquisar;
	

	
	public UsuáriosVisualizarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> Visualizar() {

		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		next.click();
		sleep(3000);
		
		usuarios.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		subUsuarios.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		pesquisar.sendKeys("TESTEAUTOMATIZADO");
		sleep(2000);
		pesquisar.sendKeys(Keys. ENTER);
		sleep(6000);
		
			
		String nombre = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id][1]/div[3]/div")).getText();
		String usuarioHana = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id][1]/div[4]/div")).getText();
		String dataCreacion = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id][1]/div[7]/div")).getText();
		
		System.out.println("---------------Informação no Biblioteca-----------------");
		System.out.println(nombre);
		System.out.println(usuarioHana);
		System.out.println(dataCreacion);

		
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/span[1]"));
		WebElement açao = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[2]/span[2]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		String nombreV = driver.findElement(By.xpath("//span[@id=\"first-name\"]")).getText();
		String usuarioHanaV = driver.findElement(By.xpath("//span[@id=\"hana-user\"]")).getText();
		
		
		System.out.println("---------------Informação na Visualizar-----------------");
		System.out.println(nombreV);
		System.out.println(usuarioHanaV);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		//sucesso.add(nombre.equals(nombreV));
		sucesso.add(usuarioHana.equals(usuarioHanaV));

		
		return sucesso;
	}

}
