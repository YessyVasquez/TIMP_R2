package com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.AtividadeFiscal;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class AtividadeVisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Detalhes Do Tipo De Tributo\"]")
	public WebElement detalhe;

	@FindBy(xpath = "//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]/div/div")
	public WebElement menu;

	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//li/span[text()=\"Visualizar\"]")
	public WebElement visualizar;
	
	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[4]")
	public WebElement atividades1;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[4]/ul/li[3]")
	public WebElement atividadesO1;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[3]")
	public WebElement atividades2;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[3]/ul/li[3]")
	public WebElement atividadesO2;
	
	@FindBy(xpath = "//li[@tabindex=\"0\"]/div[@class=\"title\"]/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividades;
	
	@FindBy(xpath = "//ul[@class=\"accordion\" and @style]/li/div/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividadesO;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	

	@FindBy(xpath = "//span[@id=\"activity-name\"]")
	public WebElement nomeV;
	@FindBy(xpath = "//span[@id=\"activity-description\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"atividadeFiscal\"]")
	public WebElement atividadeFiscalV;
	@FindBy(xpath = "//span[@id=\"activity-validity-begin\"]")
	public WebElement dataInicioV;


	@FindBy(xpath = "//input[contains(@placeholder,\"Nome\")]")
	public WebElement nomeE;
	@FindBy(xpath = "//textarea[contains(@placeholder,\"Descrição\")]")
	public WebElement descricaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Atividade\")]")
	public WebElement atividadeFiscalE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Data Inicial\")]")
	public WebElement dataInicioE;

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	public AtividadeVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		String url = driver.getCurrentUrl();

		atividades.click();
		sleep(2000);
		atividadesO.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(2000);

		siguiente.click();

		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");

		sleep(2000);

		String idRegistro = idObter("AtividadeFiscal");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
	
		
		menu.click();
		sleep(1000);
		açao.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		

		String nomeV1 = nomeV.getText();
		String descricaoV1 = descricaoV.getText();
		String atividadeFiscalV1 = atividadeFiscalV.getText();
		String dataInicioV1 = dataInicioV.getText();
		

		System.out.println(nomeV1);
		System.out.println(descricaoV1);;
		System.out.println(atividadeFiscalV1);
		System.out.println(dataInicioV1);

		
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
		

		String nomeE1 = nomeE.getAttribute("value");
		String descricaoE1 = descricaoE.getAttribute("value");
		String atividadeFiscalE1 = atividadeFiscalE.getAttribute("value");
		String dataInicioE1 = dataInicioE.getAttribute("value");

	
		System.out.println(nomeE1);
		System.out.println(descricaoE1);
		System.out.println(atividadeFiscalE1);
		System.out.println(dataInicioE1);

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		

		sucesso.add(nomeV1.contains(nomeE1));
		sucesso.add(descricaoV1.contains(descricaoE1));
		sucesso.add(atividadeFiscalV1.contains(atividadeFiscalE1));
		sucesso.add(dataInicioV1.contains(dataInicioE1));

		
		System.out.println(sucesso);
		


		return sucesso;

	}

}
