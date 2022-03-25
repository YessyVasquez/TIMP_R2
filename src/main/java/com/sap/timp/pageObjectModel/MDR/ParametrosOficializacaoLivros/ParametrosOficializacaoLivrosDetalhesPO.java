package com.sap.timp.pageObjectModel.MDR.ParametrosOficializacaoLivros;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ParametrosOficializacaoLivrosDetalhesPO extends TestBaseSteven {

	@FindBy(xpath = "//span[text()=\"Parâmetros de Oficialização de Livros\"]")
	public WebElement parametrosOficializacaoLivros;

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
	public WebElement tipoLivroD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][3]/div[2]/div")
	public WebElement empresaD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][4]/div[2]/div")
	public WebElement ufD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][5]/div[2]/div")
	public WebElement filialD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][6]/div[2]/div")
	public WebElement tributoD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][7]/div[2]/div")
	public WebElement layoutTFBD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][8]/div[2]/div")
	public WebElement configuracaoTFBD;
	@FindBy(xpath = "//div[@id=\"detail-description\"][9]/div[2]/div")
	public WebElement dataVigenciaD;
	
	
	@FindBy(xpath = "//span[@id=\"bookType\"]")
	public WebElement tipoLivroV;
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufV;
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributoV;
	@FindBy(xpath = "//span[@id=\"tfbLayout\"]")
	public WebElement layoutTFBV;
	@FindBy(xpath = "//span[@id=\"tfbConfiguration\"]")
	public WebElement configuracaoTFBV;
	@FindBy(xpath = "//span[@id=\"effectiveDateFrom\"]")
	public WebElement dataVigenciaV;

	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement fechar;

	public ParametrosOficializacaoLivrosDetalhesPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> detalhes() {

		sleep(2000);
		parametrosOficializacaoLivros.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		String idRegistro = idObter("ParametrosOficializacaoLivros");

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
		String tipoLivroD1 = tipoLivroD.getText();
		String empresaD1 = empresaD.getText();
		String ufD1 = ufD.getText();
		String filialD1 = filialD.getText();
		String tributoD1 = tributoD.getText();
		String layoutTFBD1 = layoutTFBD.getText();
		String configuracaoTFBD1 = configuracaoTFBD.getText();
		String dataVigenciaD1 = dataVigenciaD.getText();
		
		System.out.println(tipoLivroD1);
		System.out.println(empresaD1);
		System.out.println(ufD1);
		System.out.println(filialD1);
		System.out.println(tributoD1);
		System.out.println(layoutTFBD1);
		System.out.println(configuracaoTFBD1);
		System.out.println(dataVigenciaD1);

		sleep(2000);
		fechar.click();

		actionsMoveToElementElement(menu);

		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		açao = driver.findElement(
				By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		attributoNotToBeEmptyElement(tipoLivroV, "textContent");
		sleep(1000);
		
		String tipoLivroV1 = tipoLivroV.getText();
		String empresaV1 = empresaV.getText();
		String ufV1 = ufV.getText();
		String filialV1 = filialV.getText();
		String tributoV1 = tributoV.getText();
		String layoutTFBV1 = layoutTFBV.getText();
		String condfiguracaoTFBV1 = configuracaoTFBV.getText();
		String dataVigenciaV1 = dataVigenciaV.getText();


		System.out.println(empresaV1);
		System.out.println(ufV1);
		System.out.println(filialV1);
		System.out.println(tributoV1);
		System.out.println(tipoLivroV1);
		System.out.println(layoutTFBV1);
		System.out.println(condfiguracaoTFBV1);
		System.out.println(dataVigenciaV1);


		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(tipoLivroV1.contains(tipoLivroD1));
		sucesso.add(empresaV1.contains(empresaD1));
		sucesso.add(ufV1.contains(ufD1));
		sucesso.add(filialV1.contains(filialD1));
		sucesso.add(tributoV1.contains(tributoD1));
		sucesso.add(layoutTFBV1.contains(layoutTFBD1));
		sucesso.add(condfiguracaoTFBV1.contains(configuracaoTFBD1));
		sucesso.add(dataVigenciaV1.contains(dataVigenciaD1));

		System.out.println(sucesso);

		return sucesso;

	}

}
