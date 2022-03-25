package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.RegistroM620;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegistroM620VisualizarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário COFINS\"]")
	public WebElement apuracaocreditocofins;
	

	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisCalculationConfiguration\" and @tabindex=\"0\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM620\"]")
	public WebElement registroM620;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Indicador de natureza da retenção na Fonte \"]")
	public WebElement indicador1;
	
	@FindBy(xpath = "//div[@id=\"indNatRet\"]/div/div[2]")
	public WebElement indicador;
	

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	@FindBy(xpath = "//input[@placeholder=\"Selecionar Empresa\"]")
	public WebElement empresa;
	
	@FindBy(xpath = "//div[@id=\"uf\"]/div/div[1]/div/div/div/div[@class=\"componentName\"]")
	public WebElement uf;
	
	@FindBy(xpath = "//div[@id=\"branch\"]/div/div[1]/div/div/div/div[@class=\"componentName\"]")
	public WebElement filial;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Tributo\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//div[@id=\"reg\"]/div/div/input")
	public WebElement registro;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Indicador do Tipo de Ajuste \"]")
	public WebElement indicaroTipoAjuste;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Valor do ajuste \"]")
	public WebElement valorAjuste;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Código do ajuste \"]")
	public WebElement codigoAjuste;
	
	@FindBy(xpath = "//textarea")
	public WebElement descricao;
		
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//input[@placeholder=\"Preencher Código de Situação Tributária referente ao COFINS\"]")
	public WebElement codigosituacao;
	

	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	public RegistroM620VisualizarPO() {

		PageFactory.initElements(driver, this);
	}

	public ArrayList<Boolean> visualizar() {


		sleep(300);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		apuracaocreditocofins.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registroM620.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		String idRegistro = idObter("GestaoCreditoTributarioCOFINSRegistroM620");
		System.out.println("ID Registro: " + idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"visualizar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectXpath("//div[@id=\"branch\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		waitExpectXpath("//div[@id=\"uf\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empresaV = empresa.getAttribute("value");
		String ufV = uf.getText();
		String filialV = filial.getText();
		String tributoV = tributo.getAttribute("value");
		String registroV = registro.getAttribute("value");
		String indicaroTipoAjusteV = indicaroTipoAjuste.getAttribute("value");
		String valorAjusteV = valorAjuste.getAttribute("value");
		String codigoAjusteV = codigoAjuste.getAttribute("value");
		String descricaoV = descricao.getAttribute("value");

		
		System.out.println("-----------Visualizar------------");
		System.out.println(empresaV);
		System.out.println(ufV);
		System.out.println(filialV);
		System.out.println(tributoV);
		System.out.println(registroV);
		System.out.println(indicaroTipoAjusteV);
		System.out.println(valorAjusteV);
		System.out.println(codigoAjusteV);
		System.out.println(descricaoV);
		
		sleep(3000);
		
		biblioteca.click();
		
		sleep(6000);
		

		int botaoNao = rows("//button[text()=\"Não\"]");
		
		if (botaoNao > 0) {
			nao.click();
		}
		
		sleep(7000);
		//waitExpectElement(siguiente);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);


		menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		editar = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectXpath("//div[@id=\"branch\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		waitExpectXpath("//div[@id=\"uf\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		String empresaE = empresa.getAttribute("value");
		String ufE = uf.getText();
		String filialE = filial.getText();
		String tributoE = tributo.getAttribute("value");
		String registroE = registro.getAttribute("value");
		String indicaroTipoAjusteE = indicaroTipoAjuste.getAttribute("value");
		String valorAjusteE = valorAjuste.getAttribute("value");
		String codigoAjusteE = codigoAjuste.getAttribute("value");
		String descricaoE = descricao.getAttribute("value");

		System.out.println("-----------Detalhes------------");
		System.out.println(empresaE);
		System.out.println(ufE);
		System.out.println(filialE);
		System.out.println(tributoE);
		System.out.println(registroE);
		System.out.println(indicaroTipoAjusteE);
		System.out.println(valorAjusteE);
		System.out.println(codigoAjusteE);
		System.out.println(descricaoE);

		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(empresaE.equals(empresaV));
		sucesso.add(ufE.equals(ufV));
		sucesso.add(filialE.equals(filialV));
		sucesso.add(tributoE.equals(tributoV));
		sucesso.add(registroE.equals(registroV));
		sucesso.add(indicaroTipoAjusteE.equals(indicaroTipoAjusteV));
		sucesso.add(valorAjusteE.equals(valorAjusteV));
		sucesso.add(codigoAjusteE.equals(codigoAjusteV));
		sucesso.add(descricaoE.equals(descricaoV));

		System.out.println(sucesso);
		
		return sucesso;
		
	}

}
