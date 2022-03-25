package com.sap.timp.pageObjectModel.MDR.LimiteCompetencia;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class LimiteCompetenciaDetalhesPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Limite de Competência\"]")
	public WebElement limiteCompetencia;

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
	public WebElement empresaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement ufD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement filialD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement tributoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement tipoImpostoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement tipoProcessoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][7]/div[2]/div")
	public WebElement caracteristicaAprovacaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][8]/div[2]/div")
	public WebElement nivelAprovacaoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][9]/div[2]/div")
	public WebElement valorDED;
	@FindBy(xpath = "//div[@id=\"detail-description\"][10]/div[2]/div")
	public WebElement valorAteD;
	
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement companyV;
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributoV;
	@FindBy(xpath = "//span[@id=\"taxType\"]")
	public WebElement tipoImpostoV;
	@FindBy(xpath = "//span[@id=\"process-type\"]")
	public WebElement tipoProcessoV;
	@FindBy(xpath = "//span[@id=\"approval-characteristic\"]")
	public WebElement caracteristicaAprovacaoV;
	@FindBy(xpath = "//span[@id=\"approval-level\"]")
	public WebElement nivelAprovacaoV;
	@FindBy(xpath = "//span[@id=\"value-from\"]")
	public WebElement valorDeV;
	@FindBy(xpath = "//span[@id=\"value-to\"]")
	public WebElement valorAteV;

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;


	public LimiteCompetenciaDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {

		limiteCompetencia.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("LimiteCompetencia");

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));

		sleep(2000);
		menu.click();
		sleep(1000);

		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(11000);

		String empresaD1 = empresaD.getText();
		String ufD1 = ufD.getText();
		String filialD1 = filialD.getText();

		 String tributoD1 = tributoD.getText();
	//	 String tipoImpostoD1 = tipoImpostoD.getText();
		 String tipoProcessoD1 = tipoProcessoD.getText();
		 String caracteristicaAprovacaoD1 = caracteristicaAprovacaoD.getText();
		 String nivelAprovacaoD1 = nivelAprovacaoD.getText();
		 String valorDED1 = valorDED.getText();
		 String valorAteD1 = valorAteD.getText();
		 
		 System.out.println(empresaD1);
		 System.out.println(ufD1);
		 System.out.println(filialD1);
		 System.out.println(tributoD1);
	//	 System.out.println(tipoImpostoD1);
		 System.out.println(tipoProcessoD1);
		 System.out.println(caracteristicaAprovacaoD1);
		 System.out.println(nivelAprovacaoD1);
		 System.out.println(valorDED1);
		 System.out.println(valorAteD1);
		 
		sleep(2000);
		fechar.click();

		actionsMoveToElementElement(menu);


		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		String empresaV1 = companyV.getText();

		String ufV1 = ufV.getText();

		String filialV1 = filialV.getText();

		String tributoV1 = tributoV.getText();

		String tipoImpostoV1 = tipoImpostoV.getText();

		String tipoProcessoV1 = tipoProcessoV.getText();

		String caracteristicaAprovacaoV1 = caracteristicaAprovacaoV.getText();

		String nivelAprovacaoV1 = nivelAprovacaoV.getText();

		String valorDeV1 = valorDeV.getText();
		valorDeV1 = valorDeV1.replace("R$ ", "").trim();
		
		String valorAteV1 = valorAteV.getText();
		valorAteV1 = valorAteV1.replace("R$ ", "").trim();
		
		System.out.println(empresaV1);
		 System.out.println(ufV1);
		 System.out.println(filialV1);
		 System.out.println(tributoV1);
		 System.out.println(tipoImpostoV1);
		 System.out.println(tipoProcessoV1);
		 System.out.println(caracteristicaAprovacaoV1);
		 System.out.println(nivelAprovacaoV1);
		 System.out.println(valorDeV1);
		 System.out.println(valorAteV1);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaV1.contains(empresaD1));
		sucesso.add(ufV1.contains(ufD1));
		sucesso.add(filialV1.contains(filialD1));
		sucesso.add(tributoV1.contains(tributoD1));
	//	sucesso.add(tipoImpostoV1.contains(tipoImpostoD1));
		sucesso.add(tipoProcessoV1.contains(tipoProcessoD1));
		sucesso.add(caracteristicaAprovacaoV1.contains(caracteristicaAprovacaoD1));
		sucesso.add(nivelAprovacaoV1.contains(nivelAprovacaoD1));
		sucesso.add(valorDeV1.contains(valorDED1));
		sucesso.add(valorAteV1.contains(valorAteD1));

		System.out.println(sucesso);
		
		return sucesso;
		
		

	}

}
