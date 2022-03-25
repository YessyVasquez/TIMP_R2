package com.sap.timp.pageObjectModel.BCB.ParametrosGeraisHierarquia.Hierarquia;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParametrosGeraisHierarquiaVisualizarPO extends TestBaseSteven {
	

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[contains(@class,\"baseTabs-box\")][1]")
	public WebElement hierarquias;

	@FindBy(xpath = "//span[text()=\"Hierarquia de Configuração\"]")
	public WebElement hierarquiaConfiguracao;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher o nome de Hierarquia\"]")
	public WebElement nomeHerarquia;
	
	@FindBy(xpath = "//input[@placeholder=\"Nome da Aba\"]")
	public WebElement aba;
	
	@FindBy(xpath = "//input[@placeholder=\"Nome da Hierarquia\"]")
	public WebElement nomeHerarquia1;
	
	@FindBy(xpath = "//input[@placeholder=\"Nome do Grupo\"]")
	public WebElement grupo;
	
	@FindBy(xpath = "//span[text()=\"9\"]")
	public WebElement ultimoSubnivel;
	
	
	@FindBy(xpath = "//td[@id=\"effectiveDateFrom\"]/span")
	public WebElement dataVigenciaV;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Código\")]")
	public WebElement codigoE;
	@FindBy(xpath = "//*[contains(@placeholder,\"Descrição\")]")
	public WebElement descricaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Validade De\")]")
	public WebElement dataVigenciaE;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	
	
	public ParametrosGeraisHierarquiaVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> visualizar() {
		
		sleep(2000);
		hierarquias.click();
		sleep(2000);
		hierarquiaConfiguracao.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter1();

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		sleep(2000);
		menu.click();
		sleep(1000);
		
		açao.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		String nomeHerarquiaText = nomeHerarquia.getAttribute("value");
		String abaText = aba.getAttribute("value");
		String nomeHerarquia1Text = nomeHerarquia1.getAttribute("value");
		String grupoText = grupo.getAttribute("value");
		String u1timoSText = ultimoSubnivel.getText();
		
		System.out.println("Visualizar");
		System.out.println(nomeHerarquiaText);
		System.out.println(abaText);
		System.out.println(nomeHerarquia1Text);
		System.out.println(grupoText);
		System.out.println(u1timoSText);
		System.out.println("-------------------------");
		biblioteca.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		menu.click();
		sleep(2000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String nomeHerarquiaTextE = nomeHerarquia.getAttribute("value");
		String abaTextE = aba.getAttribute("value");
		String nomeHerarquia1TextE = nomeHerarquia1.getAttribute("value");
		String grupoTextE = grupo.getAttribute("value");
		String u1timoSTextE = ultimoSubnivel.getText();
		
		System.out.println("Editar");
		System.out.println(nomeHerarquiaTextE);
		System.out.println(abaTextE);
		System.out.println(nomeHerarquia1TextE);
		System.out.println(grupoTextE);
		System.out.println(u1timoSTextE);
		System.out.println("-------------------------");

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(nomeHerarquiaText.contains(nomeHerarquiaTextE));
		sucesso.add(abaText.contains(abaTextE));
		sucesso.add(nomeHerarquia1Text.contains(nomeHerarquia1TextE));
		sucesso.add(grupoText.contains(grupoTextE));
		sucesso.add(u1timoSText.contains(u1timoSTextE));

		
		
		
		System.out.println(sucesso);
		
		return sucesso;
		
	}

}
