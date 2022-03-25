package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaReceitasCreditoFiscalAntecipado;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaReceitasCreditoFiscalAntecipadoVisalizarPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement tabelacomplementares;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Receitas (Credito Fiscal Antecipado)\"]")
	public WebElement tabelaReceitas;

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
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;

	@FindBy(xpath = "//input[contains(@placeholder,\"Obrigação\")]")
	public WebElement obrigacaoD;
	@FindBy(xpath = "//input[contains(@placeholder,\"Código\")]")
	public WebElement codigoD;
	@FindBy(xpath = "//input[contains(@placeholder,\"Descrição\")]")
	public WebElement descricaoD;
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicial\")]")
	public WebElement dataVigenciaD;



	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaoV;
	@FindBy(xpath = "//span[@id=\"fiscalCreditCode\"]")
	public WebElement codigoV;
	@FindBy(xpath = "//span[@id=\"fiscalCreditDescription\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"startDate\"]")
	public WebElement dataVigenciaV;

	

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	public TabelaReceitasCreditoFiscalAntecipadoVisalizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {

		sleep(2000);
		tabelacomplementares.click();
		sleep(2000);
		tabelaReceitas.click();
		sleep(2000);
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("TabelaReceitasCreditoFiscalAntecipado");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		attributoNotToBeEmptyElement(obrigacaoV, "textContent");
		
		

		String obrigacaoV1 = obrigacaoV.getText();
		String codigoV1 = codigoV.getText();
		String descricaoV1 = descricaoV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();


		System.out.println(obrigacaoV1);
		System.out.println(codigoV1);
		System.out.println(descricaoV1);
		System.out.println(dataVigenciaV1);
		
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		


		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(1000);

		String obrigacaoD1 = obrigacaoD.getAttribute("value");
		String codigoD1 = codigoD.getAttribute("value");
		String descricaoD1 = descricaoD.getAttribute("value");
		String dataVigenciaD1 = dataVigenciaD.getAttribute("value");


		
		System.out.println(obrigacaoD1);
		System.out.println(codigoD1);
		System.out.println(descricaoD1);
		System.out.println(dataVigenciaD1);


		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(obrigacaoV1.contains(obrigacaoD1));
		sucesso.add(codigoV1.contains(codigoD1));
		sucesso.add(descricaoV1.contains(descricaoD1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaD1));


		
		System.out.println(sucesso);
		
		return sucesso;
		


	}

}
