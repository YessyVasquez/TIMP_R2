package com.sap.timp.pageObjectModel.BRE.RegrasDeEscrituração.Edicao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;

public class RegrasDeEscrituraçãoEdiçãoValoresCalculadosPO extends TestBaseFernando{
	@FindBy(xpath = "//li[@identifier=\"accordion-item-b_rules\"]")
	public WebElement regraDeEscrituracao;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Valores Calculados\"]")
	public WebElement valoresCalculados;
	
	@FindBy(xpath = "//button[text()=\"Criar Valor Calculado\"]")
	public WebElement crearValorCalculado;
	
	@FindBy(xpath = "//input[@placeholder=\"Nome\"]")
	public WebElement nome;

	@FindBy(xpath = "//textarea")
	public WebElement formula;
	
	@FindBy(xpath = "//div[@id=\"main-icon\"]")
	public WebElement campo;
	
	@FindBy(xpath = "//li[text()=\"Alíquota ICMS (ED)\"]")
	public WebElement campoO;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarCaminho;
	
	@FindBy(xpath = "//div[@class=\"conditions-section\"]/div/div/div/div/div[1]/div/div/input")
	public WebElement nomeValor;
	
	@FindBy(xpath = "//li[text()=\"TA-TESTE (VC)\"]")
	public WebElement nomeValorO;
	
	@FindBy(xpath = "//div[@class=\"conditions-section\"]/div/div/div/div/div[4]/div/div/input")
	public WebElement nomeValor2;
	
	@FindBy(xpath = "//div[@class=\"action-section\"]/div/div/div/div/input")
	public WebElement acao;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	@FindBy(xpath = "//div[@id=\"add-icon\"]")
	public WebElement adicionar;
	
	@FindBy(xpath = "//div[@class=\"conditions-section\"]/div/div/div[2]/div/div[1]/div/div/input")
	public WebElement nomeValorL2;
	
	@FindBy(xpath = "//div[@class=\"conditions-section\"]/div/div/div[2]/div/div[4]/div/div/input")
	public WebElement nomeValorL22;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//textarea")
	public WebElement justificativa;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//div[@class=\"object-list-field\"][2]/button[1]")
	public WebElement editarSegundo;
	@FindBy(xpath = "//button[text()=\"Cancelar\"]")
	public WebElement cancelar;
	
	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement verificar;
	
	@FindBy(xpath = "//div[@id=\"graph\"]/*/*/*[7]/*/*[1]")
	public WebElement nomeEditado;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement justificativaB;
	
	public RegrasDeEscrituraçãoEdiçãoValoresCalculadosPO() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> Valores() {
	String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else {
			td1 = true;
		}

		

		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		regraDeEscrituracao.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("RegraDeEscrituracao");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion

		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		valoresCalculados.click();
		sleep(3000);
		crearValorCalculado.click();
		sleep(3000);
		
		nome.sendKeys("TA-TESTE");
		sleep(1000);
		formula.sendKeys("\"BC ICMS (ED)\"*(\"Alíquota ICMS (ED)\"/100)");
		sleep(1000);
	
		aplicar.click();
		sleep(3000);
		fechar.click();
		sleep(2000);
		
		adicionarCaminho.click();
		sleep(2000);
		
		nomeValor.sendKeys("TA-TESTE");
		sleep(1000);
		nomeValorO.click();
		sleep(1000);
		
		nomeValor2.sendKeys("0");
		nomeValor2.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		acao.sendKeys("Apresenta valor nulo");
		acao.sendKeys(Keys.ESCAPE);
		sleep(2000);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		aplicar.click();
		System.out.println("llegue hasta aqui");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int regra1v = driver.findElements(By.xpath("//div[@id=\"graph\"]/*/*/*[5]")).size();
		System.out.println(regra1v +" verficação regra adicionada N'1");
		
		if (regra1v > 0) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		System.out.println(sucesso + " Adição Regra");
		
		//regra 2
		
		valoresCalculados.click();
		sleep(3000);
		crearValorCalculado.click();
		sleep(3000);
		
		nome.sendKeys("TA-TESTE 2");
		sleep(1000);
		formula.sendKeys("MID(\"Cód. material (ED)\", 1, 2)");
		sleep(1000);
	
		aplicar.click();
		sleep(3000);
		fechar.click();
		sleep(2000);
		
		adicionarCaminho.click();
		sleep(2000);
		
		nomeValor.sendKeys("TA-TESTE 2");
		sleep(1000);
		nomeValor.sendKeys(Keys.ENTER);
		sleep(1000);
		
		nomeValor2.sendKeys("H1");
		nomeValor2.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		adicionar.click();
		sleep(2000);
		
		nomeValorL2.sendKeys("CFOP legal");
		sleep(1000);
		nomeValorL2.sendKeys(Keys.ENTER);
		sleep(1000);
		
		nomeValorL22.sendKeys("5012");
		nomeValorL22.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		acao.sendKeys("Teste Fórmula MID");
		acao.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		aplicar.click();
		sleep(2000);
		
		gravar.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);
		justificativa.clear();
		sleep(1000);
		justificativa.sendKeys("TESTE DE VALOR CALCULADO");
		sleep(1000);
		aceitar.click();
		sleep(2000);
		gravar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		biblioteca.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		invisibilityOfElement("//li[contains(@class,\"toast-success\")]/div/span[3]");
		sleep(1000);
		
		sleep(2000);
		regraDeEscrituracao.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(4000);

		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		waitExpectXpath("//span[text()=\"Adicionar Caminho\"]");
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		valoresCalculados.click();
		sleep(3000);
		editarSegundo.click();
		sleep(3000);
		nome.clear();
		sleep(1000);
		nome.sendKeys("TA-TESTE Editado");
		sleep(2000);
		
		
		aplicar.click();
		sleep(2000);
		fechar.click();
		sleep(2000);
		
		String nomeEditadoT = nomeEditado.getText();
		System.out.println(nomeEditadoT + " Nome Editado Pegado");
		System.out.println(nomeEditadoT.contains("TA-TESTE Editado") + " Verficação após edição");
		sucesso.add(nomeEditadoT.contains("TA-TESTE Editado"));
		
		
		System.out.println(sucesso + " Edição Nome");
		
		
		justificativaB.click();
		sleep(2000);
		
		String justificativaT = justificativa.getAttribute("value");
		System.out.println(justificativaT);
		System.out.println(justificativaT.equals("TESTE DE VALOR CALCULADO") + " Verficação após edição Justificativa");
		sucesso.add(justificativaT.equals("TESTE DE VALOR CALCULADO"));
		System.out.println(sucesso + " Edição Justificativa");
		cancelar.click();
		sleep(2000);
		gravar.click();

		sleep(2000);
		waitExpectElement(nao);
		sleep(2000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String verificarT = verificar.getText();
		System.out.println(verificarT + " Gravado com sucesso");
		System.out.println(verificarT.contains("Regra atualizada com sucesso"));
		
		sucesso.add(verificarT.contains("Regra atualizada com sucesso"));

		System.out.println(sucesso);
		
		return sucesso;
	}
}
