package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasPermitidas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaReceitasPermitidasVisualizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement obrigacoes;
	
	@FindBy(xpath = "//span[text()=\"Tabela da Receitas Permitidas\"]")
	public WebElement rabelacodigoReceita;

	@FindBy(xpath = "//span[text()=\"Códigos de Ajustes\"]")
	public WebElement codigo;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//textarea[contains(@placeholder,\"Descrição Padrão\")]")
	public WebElement campo;

	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;

	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaoV;
	@FindBy(xpath = "//span[@id=\"permittedRevenueCode\"]")
	public WebElement codigoV;
	@FindBy(xpath = "//span[@id=\"permittedRevenueDescription\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"startDate\"]")
	public WebElement dataVigenciaV;


	@FindBy(xpath = "//input[contains(@placeholder,\"Obrigação\")]")
	public WebElement obrigacaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Código\")]")
	public WebElement codigoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Descrição\")]")
	public WebElement descricaoE;
	@FindBy(xpath = "//input[contains(@placeholder,\"Data Inicial\")]")
	public WebElement dataVigenciaE;

	

	

	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	public TabelaReceitasPermitidasVisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		sleep(2000);
		obrigacoes.click();
		sleep(2000);
		rabelacodigoReceita.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("TabelaReceitasPermitidas");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		
		String obrigacaoV1 = obrigacaoV.getText();
		String codigoV1 = codigoV.getText();
		String descricaoV1 = descricaoV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();


		System.out.println(obrigacaoV1);
		System.out.println(codigoV1);
		System.out.println(descricaoV1);
		System.out.println(dataVigenciaV1);



		sleep(2000);

		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String obrigacaoE1 = obrigacaoE.getAttribute("value");
		String codigoE1 = codigoE.getAttribute("value");
		String descricaoE1 = descricaoE.getAttribute("value");
		String dataVigenciaE1 = dataVigenciaE.getAttribute("value");
		
		
		System.out.println(obrigacaoE1);
		System.out.println(codigoE1);
		System.out.println(descricaoE1);
		System.out.println(dataVigenciaE1);

		

		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(obrigacaoV1.contains(obrigacaoE1));
		sucesso.add(codigoV1.contains(codigoE1));
		sucesso.add(descricaoV1.contains(descricaoE1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaE1));

		
		System.out.println(sucesso);
		
		return sucesso;
		


	}

}
