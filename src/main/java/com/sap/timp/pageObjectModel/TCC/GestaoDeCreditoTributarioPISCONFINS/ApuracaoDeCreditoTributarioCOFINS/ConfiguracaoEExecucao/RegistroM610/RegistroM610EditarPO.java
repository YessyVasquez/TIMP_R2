package com.sap.timp.pageObjectModel.TCC.GestaoDeCreditoTributarioPISCONFINS.ApuracaoDeCreditoTributarioCOFINS.ConfiguracaoEExecucao.RegistroM610;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegistroM610EditarPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Gestão de Crédito Tributário PIS/COFINS\"]")
	public WebElement gestaoCredito;
	
	@FindBy(xpath = "//span[text()=\"Apuração de Crédito Tributário COFINS\"]")
	public WebElement apuracaocreditocofins;
	

	@FindBy(xpath = "//li[@identifier=\"accordion-item-pisCalculationConfiguration\" and @tabindex=\"0\"]")
	public WebElement configuracaoEExecucao;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-registerM610\"]")
	public WebElement registroM610;
	
	@FindBy(xpath = "//div[@id=\"codCont\"]/div/div[@id=\"main-icon\"]")
	public WebElement campo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Código da Contribuição social apurada no periodo \"]")
	public WebElement campoTexto;
	
	@FindBy(xpath = "//li[@id][3]")
	public WebElement opcao;

	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;

	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;


	
	public RegistroM610EditarPO() {

		PageFactory.initElements(driver, this);
	}

	public boolean editar() {

		String url = driver.getCurrentUrl();
		
		boolean tp1 = false;
		
		if (url.contains("tp1")) {
			tp1= true;
		}
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		gestaoCredito.click();
		sleep(2000);
		apuracaocreditocofins.click();
		sleep(2000);
		configuracaoEExecucao.click();
		sleep(2000);
		registroM610.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(12000);

		String idRegistro = idObter("GestaoCreditoTributarioCOFINSRegistroM610");
		System.out.println("ID Registro: " + idRegistro);

		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\"" + idRegistro + "\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		editar.click();
		sleep(2000);
		waitExpectXpath("//div[@id=\"company\"]/div/div[1]/div[2]");
		waitExpectXpath("//div[@id=\"branch\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		waitExpectXpath("//div[@id=\"uf\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(18000);
		
		campo.click();
		sleep(1000);
		String opcaoT = opcao.getText();
		System.out.println("O texto da opção é: "+opcaoT);
		opcao.click();
		sleep(1000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		refresh();
		
		sleep(2000);
		waitExpectXpath("//div[@id=\"company\"]/div/div[1]/div[2]");
		waitExpectXpath("//div[@id=\"branch\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		waitExpectXpath("//div[@id=\"uf\"]/div/div[1]/div/div/div[@class=\"componentToSearch\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String textoCampoE = campoTexto.getAttribute("value");
		System.out.println("O texto do campo após a edição é: " + textoCampoE);
		
		boolean sucesso = opcaoT.contains(textoCampoE);
		
		System.out.println("O registro foi editado com sucesso: " +sucesso);
		

		return sucesso;	
	}

}
