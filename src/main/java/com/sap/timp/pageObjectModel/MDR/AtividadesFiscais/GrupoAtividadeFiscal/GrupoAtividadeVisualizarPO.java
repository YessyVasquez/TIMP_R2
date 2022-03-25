package com.sap.timp.pageObjectModel.MDR.AtividadesFiscais.GrupoAtividadeFiscal;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class GrupoAtividadeVisualizarPO extends TestBaseSteven{
	
	
	@FindBy(xpath = "//div/div/span[text()=\"Id\"]")
	public WebElement idC;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[4]")
	public WebElement atividades1;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[4]/ul/li[3]")
	public WebElement atividadesO1;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[3]")
	public WebElement atividades2;

	@FindBy(xpath = "//*[@id=\"left-content\"]/div/ul/li[3]/ul/li[3]")
	public WebElement atividadesO2;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//li[@tabindex=\"0\"]/div[@class=\"title\"]/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividades;
	
	@FindBy(xpath = "//ul[@class=\"accordion\" and @style]/li/div/span[text()=\"Grupos de Atividades Fiscais\"]")
	public WebElement gruposAtividades;
	
	
	@FindBy(xpath = "//span[@id=\"grupoAtividade\"]")
	public WebElement grupoAtividadeV;
	@FindBy(xpath = "//span[@id=\"descricao\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"dataVigenciaInicio\"]")
	public WebElement dataVigenciaV;



	@FindBy(xpath = "//input[contains(@placeholder,\"Grupo\")]")
	public WebElement grupoAtividadeE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Descrição\")]")
	public WebElement descricaoE;


	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	
	public GrupoAtividadeVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

	

		atividades.click();
		sleep(2000);
		gruposAtividades.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("GrupoAtividadeFiscal");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		actionsMoveToElementElement(menu);
		sleep(4000);
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String grupoAtividadeV1 = grupoAtividadeV.getText();
		String descricaoV1 = descricaoV.getText();

		System.out.println(grupoAtividadeV1);
		System.out.println(descricaoV1);
		
		
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
		

		String grupoAtividadeE1 = grupoAtividadeE.getAttribute("value");
		String descricaoE1 = descricaoE.getAttribute("value");

		System.out.println(grupoAtividadeE1);
		System.out.println(descricaoE1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();

		sucesso.add(grupoAtividadeV1.contains(grupoAtividadeE1));
		sucesso.add(descricaoV1.contains(descricaoE1));


		System.out.println(sucesso);
	
	

		return sucesso;

	}

}
