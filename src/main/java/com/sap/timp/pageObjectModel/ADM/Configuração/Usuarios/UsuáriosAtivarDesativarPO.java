package com.sap.timp.pageObjectModel.ADM.Configuração.Usuarios;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class UsuáriosAtivarDesativarPO extends TestBaseSteven {
	
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

	private ArrayList<Boolean> sucesso;
	

	
	public UsuáriosAtivarDesativarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public Boolean ativar() {

		
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

		
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/span[1]"));
		WebElement açao = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[4]/span[2]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		menu = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/span[1]"));
		WebElement açao2 = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[4]/span[2]"));
		
		menu.click();
		sleep(4000);
		açao2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);

		Boolean sucesso = true;
		
	
		return sucesso;
	}
}
