package com.sap.timp.pageObjectModel.ADM.Configuração.Usuarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class UsuariosEditarPO extends TestBaseSteven{
	
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
	
	@FindBy(xpath = "//span[text()=\"Privilégios Organizacionais\"]")
	public WebElement privilegios;
	
	@FindBy(xpath = "//*[@id=\"1000\"]")
	public WebElement empresa1000;
	
	@FindBy(xpath = "//*[@id=\"search\"]/div/div[2]/div/div[1]/div[2]/input")
	public WebElement pesquisarPrivilegio;
	
	@FindBy(xpath = "//*[@id=\"table\"]/div/div/div/div[2]/div[1]/div[1]/label/span")
	public WebElement flag0001;
	
	@FindBy(xpath = "//*[@id=\"baseTabs-wrapper\"]/div[1]/div[3]/div/div[3]/span/span[2]")
	public WebElement grupoUsuario;
	
	@FindBy(xpath = "//*[@id=\"82\"]")
	public WebElement teste;
	
	@FindBy(xpath = "//span[text()=\"Aplicativos do Usuário\"]")
	public WebElement appUsuarios;
	
	@FindBy(xpath = "//*[@id=\"4\"]")
	public WebElement BRE;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Pacotes do Usuário\"]")
	public WebElement pacotes;
	
	@FindBy(xpath = "//div[@class=\"user-packages-editor-wrapper\"]/div/div/div/div[@id=\"element-list\"]/div[@id=\"10\"]")
	public WebElement pacotesUsuarios;
	
	@FindBy(xpath = "//span[text()=\"Privilégios de impostos\"]")
	public WebElement privilegioImposto;
	
	public UsuariosEditarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean editar() {

		
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
		WebElement açao = driver.findElement(By.xpath("//*[@id=\"list\"]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]/span[2]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		
		String valorDescricao = "TESTER";
	
		
		cargo.clear();
		cargo.sendKeys(valorDescricao);
		sleep(1000);
		
		privilegios.click();
		sleep(2000);
		
		sleep(1000);
		moveToElement(empresa1000, driver.findElement(By.xpath("//*[@id=\"privileges-container\"]/div/div[2]/div[1]")));
		sleep(4000);
		
		flag0001.click();
		sleep(2000);
		
		aplicar.click();
		sleep(3000);
		grupoUsuario.click();
		
		sleep(3000);
		moveToElement(empresa1000, driver.findElement(By.xpath("//*[@id=\"groups-container\"]/div/div[2]/div[1]")));
		sleep(4000);
		appUsuarios.click();
		sleep(4000);
		
		moveToElement(BRE, driver.findElement(By.xpath("//*[@id=\"apps-container\"]/div/div[2]/div[1]")));
		sleep(4000);
		
		aplicar.click();
		sleep(3000);
		
		pacotes.click();
		sleep(2000);
		
		sleep(4000);
		moveToElement(pacotesUsuarios, driver.findElement(By.xpath("//*[@id=\"packages-container\"]/div/div[2]/div[1]")));
		sleep(4000);
		
		btnGravar.click();
		sleep(2000);
		
		btnSim.click();
		sleep(2000);
		
		driver.navigate().refresh();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		
		
		System.out.println("");
	
		  
		boolean sucesso = false;
	
		sucesso = true;
		
		
		return sucesso;
	}

}
