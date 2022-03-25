package com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.Edicao;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegradeNegócioEdiçãoValoresCalculadosPO extends TestBaseSteven{


	@FindBy(xpath = "//span[text()=\"Regras de Negócio\"]")
	public WebElement regrasdenegocio;
	
	@FindBy(xpath = "//span[text()=\"Valores Calculados\"]")
	public WebElement vCalculados;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement camino;
	
	@FindBy(xpath = "//button[text()=\"Criar Valor Calculado\"]")
	public WebElement criarvCalculados;
	
	@FindBy(xpath = "//input[@placeholder=\"Nome\"]")
	public WebElement nomeVCalculado;
	
	@FindBy(xpath = "//textarea[@aria-label=\"Insira a fórmula\"]")
	public WebElement formula;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione uma tabela\"]")
	public WebElement inputSeleccionTabela;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"]")
	public WebElement seleccionTabela;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecione um campo \"]")
	public WebElement campo;
	
	@FindBy(xpath = "//*[@id=\"main-icon\"]")
	public WebElement estrutura;
	
	@FindBy(xpath = "//li[text()=\"Apresent. Treinamento 4\"]")
	public WebElement selectEstrutura;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div/div/div[1]/div/div[1]/input")
	public WebElement condicoes;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Operador\"]")
	public WebElement operador;
	
	@FindBy(xpath = "//div[@id=\"option-1\"]")
	public WebElement opcOperador;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div/div/div[5]/div/div[1]/input")
	public WebElement condicoes2;
	
	@FindBy(xpath = "//li[text()=\"Código Registro SPED- (aba:Dados Lançamento) (ED)\"]")
	public WebElement opcCondicoes2;
	
	@FindBy(xpath = "//div[@id=\"graph\"]//*[name()=\"g\"][5]")
	public WebElement CFOP;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Ok\"]")
	public WebElement ok;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement grabar;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button[text()=\"Remover\"]")
	public WebElement remover;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//div[@class=\"object-list-field\"][3]/button[@id=\"edit-button\"]")
	public WebElement editVCalculado;
	
	@FindBy(xpath = "//div[@class=\"object-list-field\"][3]/button[@id=\"delete-button\"]")
	public WebElement excluirVCalculado;
	
	@FindBy(xpath = "//button[@id=\"delete-button\"]")
	public WebElement excluirTabela;
	
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Fechar\"]")
	public WebElement fechar;
	
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnAceitar;
	
	
	
	@FindBy(xpath = "//div[@class=\"select-one\"]/div/div/input")
	public WebElement Condicoes;
	
	@FindBy(xpath = "//li[@id][text()=\"Tributo- (aba:Dados Lançamento) (ED)\"]")
	public WebElement opcaoCondicoes;
	
	@FindBy(xpath = "//div[@class=\"select-three\"]/div/div/div[2]/div/div[2]")
	public WebElement Operador;
	
	@FindBy(xpath = "//div[@id]/div[text()=\"=\"]")
	public WebElement opcaoOperador;
	
	//@FindBy(xpath = "//div[@class=\"value-one\"]/div/div[2]")
	@FindBy(xpath = "//div[@class=\"value-one\"]/div/div/input")
	public WebElement NomeDoValor;
	
	@FindBy(xpath = "//li[@id][text()=\"BC ICMS (ED)\"]")
	public WebElement opcaoNomeDoValor;
	
	@FindBy(xpath = "//div[@class=\"action-section\"]/div/div/div/div/div[2]")
	public WebElement acoes;
	
	//@FindBy(xpath = "//div[@id=\"T1\"]/div/label/span")
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"Dados Lançamento\"]")
	public WebElement opcaoacoes;
	
	//@FindBy(xpath = "//div[@id=\"T2\"]/div/label/span")
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"Registro E111\"]")
	public WebElement opcaoacoesr2;
	
	//@FindBy(xpath = "//div[@id=\"T3\"]/div/label/span")
	@FindBy(xpath = "//div[@class=\"list-item-text\"][text()=\"Registro C197 ou D197\"]")
	public WebElement opcaoacoesr3;
	
	@FindBy(xpath = "//div[@class=\"tabAction-enable\"]/div/label/span")
	public WebElement habilitar;
	
	@FindBy(xpath = "//div[@class=\"tabAction-obligatory\"]/div/label/span")
	public WebElement preenchementoobrigatorio;
	
	
	public RegradeNegócioEdiçãoValoresCalculadosPO() {

		PageFactory.initElements(driver, this);
	}
	
public boolean editar() {
	
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	regrasdenegocio.click();
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);

	btnUltimaPagina.click();
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	
	String idRegistro =idObter("RegrasDeNegocioCriar");
	WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
	WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
	System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion
	
	menu.click();
	sleep(1000);
	açao.click();
	sleep(3000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(4000);
	
	waitExpectElement(vCalculados);
	vCalculados.click();
	sleep(4000);
	criarvCalculados.click();
	sleep(3000);
	//primer Valor Calculado
	nomeVCalculado.sendKeys("TA-TESTE-Terceiro Caractere");
	sleep(5000);
	
	formula.sendKeys("MID(\"Código oficial- (aba:Dados Lançamento) (ED)\", 3, 1)");
	sleep(3000);
	
	aplicar.click();
	sleep(4000);
	
	fechar.click();
	sleep(2000);
	
	//segundo Valor Calculado
	
	vCalculados.click();
	sleep(4000);
	criarvCalculados.click();
	sleep(3000);
	
	nomeVCalculado.sendKeys("TA-TESTE-Quarto Caractere");
	sleep(4000);
	
	formula.sendKeys("MID(\"Código oficial- (aba:Dados Lançamento) (ED)\", 4, 1)");
	sleep(3000);
	
	aplicar.click();
	sleep(4000);
	
	
	//tercer Valor Calculado
	

	criarvCalculados.click();
	sleep(3000);
	
	nomeVCalculado.sendKeys("TA-TESTE-Editar/Excluir");
	sleep(3000);
	
	formula.sendKeys("MID(\"Código oficial- (aba:Dados Lançamento) (ED)\", 4, 1)");
	sleep(3000);
	
	aplicar.click();
	sleep(4000);
	
	editVCalculado.click();
	
	sleep(6000);
	formula.clear();
	sleep(3000);
	
	formula.sendKeys("MID(\"Código oficial- (aba:Dados Lançamento) (ED)\", 4, 2)");
	sleep(2000);

	
	aplicar.click();
	sleep(4000);
	
	excluirVCalculado.click();
	sleep(3000);
	aplicar.click();
	
	sleep(3000);
	fechar.click();
	sleep(3000);
	
	
	camino.click();
	sleep(2000);
	
	Condicoes.click();
	sleep(1000);
	Condicoes.sendKeys("Código Registro SPED- (aba:Dados Lançamento) (ED)");
	Condicoes.sendKeys(Keys.ENTER);
	sleep(1000);
	
	Operador.click();
	sleep(1000);
	opcaoOperador.click();
	sleep(1000);
	
	NomeDoValor.click();
	sleep(1000);
	NomeDoValor.sendKeys("Código Registro SPED- (aba:Dados Lançamento) (ED)");
	NomeDoValor.sendKeys(Keys.ESCAPE);
	
	sleep(1000);
	
	acoes.click();
	sleep(1000);
	opcaoacoes.click();
	closeSelectTypeCheckbox(acoes);
	sleep(1000);
	habilitar.click();
	sleep(1000);
	preenchementoobrigatorio.click();
	sleep(1000);
	aplicar.click();
	sleep(2000);
	
	
	grabar.click();
	sleep(2000);
	
	waitExpectElement(sim);
	sim.click();
	sleep(3000);
	
	aceitar.click();
	sleep(24000);
	
	biblioteca.click();
	sleep(3000);
	
	sim.click();
	sleep(3000);
	
	
	
	
	boolean sucesso = false;
	
	if (CFOP != null) {
		sucesso= true;
	}
	System.out.println(sucesso);
	return sucesso;
}

	
}
