package com.sap.timp.pageObjectModel.MDR.TabelasComplementaresParaObrigaçoesAcessorias.TabelaCodigoReceitas;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TabelaCodigoReceitasDetalhesPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Tabelas Complementares para Obrigações Acessórias\"]")
	public WebElement obrigacoes;
	
	@FindBy(xpath = "//span[text()=\"Tabela de Código da Receitas\"]")
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

	@FindBy(xpath = "//div[@id=\"detail-description\"][2]/div[2]/div")
	public WebElement codigoUFD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement obrigacaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement codigoReceitaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement descricaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement ativoD;


	@FindBy(xpath = "//span[@id=\"ufIbge\"]")
	public WebElement codigoUFV;
	@FindBy(xpath = "//span[@id=\"obrigation\"]")
	public WebElement obrigacaoV;
	@FindBy(xpath = "//span[@id=\"revenueCode\"]")
	public WebElement codigoReceitaV;
	@FindBy(xpath = "//span[@id=\"revenueDescription\"]")
	public WebElement descricaoV;
	@FindBy(xpath = "//span[@id=\"active\"]")
	public WebElement ativoV;
	

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	public TabelaCodigoReceitasDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {
		
		
		sleep(2000);
		obrigacoes.click();
		sleep(2000);
		rabelacodigoReceita.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter1();

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);

		String codigoUFD1 = codigoUFD.getText();
		String obrigacaoD1 = obrigacaoD.getText();
		String codigoReceitaD1 = codigoReceitaD.getText();
		String descricaoD1 = descricaoD.getText();
		String ativoD1 = ativoD.getText();
		
		System.out.println(codigoUFD1);
		System.out.println(obrigacaoD1);
		System.out.println(codigoReceitaD1);
		System.out.println(descricaoD1);
		System.out.println(ativoD1);
		
		sleep(2000);
		fechar.click();


		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String codigoUFV1 = codigoUFV.getText();
		String obrigacaoV1 = obrigacaoV.getText();
		String codigoReceitaV1 = codigoReceitaV.getText();
		String descricaoV1 = descricaoV.getText();
		String ativoV1 = ativoV.getText();
		
		System.out.println(codigoUFV1);
		System.out.println(obrigacaoV1);
		System.out.println(codigoReceitaV1);
		System.out.println(descricaoV1);
		System.out.println(ativoV1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(codigoUFV1.contains(codigoUFD1));
		sucesso.add(codigoReceitaV1.contains(codigoReceitaD1));
		sucesso.add(descricaoV1.contains(descricaoD1));
		sucesso.add(obrigacaoV1.contains(obrigacaoD1));
		sucesso.add(ativoV1.contains(ativoD1));
		
		System.out.println(sucesso);
		
		return sucesso;
		


	}

}
