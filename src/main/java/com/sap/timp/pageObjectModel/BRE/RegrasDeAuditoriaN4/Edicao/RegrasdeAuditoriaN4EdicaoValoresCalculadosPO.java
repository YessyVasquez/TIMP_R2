package com.sap.timp.pageObjectModel.BRE.RegrasDeAuditoriaN4.Edicao;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class RegrasdeAuditoriaN4EdicaoValoresCalculadosPO extends TestBaseKenssy {

	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N4\"]")
	public WebElement regraAuditoriaN4;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	
	@FindBy(xpath = "//button/span[text()=\"Valor Calculado\"]")
	public WebElement valorCalculadoB;
	@FindBy(xpath = "//input[@placeholder=\"Nome\"]")
	public WebElement nomeVCalculado;
	
	@FindBy(xpath = "//div[@class=\"file-wrapper\"]/div/div/div[2]")
	public WebElement leiauteSelect;
	@FindBy(xpath = "//li[contains(text(),\"TA-TESTE (Complemento BRE - N4) - 1\")]")
	public WebElement opcLeiauteSelect;
	
	@FindBy(xpath = "//div[@class=\"block-wrapper\"]/div/div/div[2]")
	public WebElement blocoSelect;
	@FindBy(xpath = "//li[text()=\"Bloco 1\"]")
	public WebElement opcBlocoSelect;
	
	@FindBy(xpath = "//div[@class=\"record-wrapper\"]/div/div/div[2]")
	public WebElement registroSelect;
	@FindBy(xpath = "//li[text()=\"Registro 1\"]")
	public WebElement opcRegistroSelect;
	
	@FindBy(xpath = "//div[@class=\"column-wrapper first\"]/div/div[contains(text(),\"Arquivo\")]")
	public WebElement secoesArquivo;
	@FindBy(xpath = "//div[@class=\"column-wrapper second\"]/div/div/div/div[contains(text(),\"Valor do ajuste\")]")
	public WebElement opcSecoesArquivo;
	
	@FindBy(xpath = "//div[@class=\"column-wrapper first\"]/div/div[contains(text(),\"Operadores Matemáticos\")]")
	public WebElement secoesOperadores;
	@FindBy(xpath = "//div[@class=\"column-wrapper second\"]/div/div/div/div[contains(text(),\"* (Multiplicar)\")]")
	public WebElement opcSecoesOperadores;
	
	@FindBy(xpath = "//div[@class=\"textarea-wrapper\"]/div/textarea")
	public WebElement caixaFormula;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionar;
	
	
	
	@FindBy(xpath = "//div[@class=\"left-wrapper\"]/div/div/div/div[4]/div[2]/ul/li/div/div/span[1]")
	public WebElement valorCalculadoDerecha;
	@FindBy(xpath = "//div[@class=\"left-wrapper\"]/div/div/div/div[4]/div[2]/ul/li/ul/li/div")
	public WebElement valorCalculadoDerechaopcOTRO;
	@FindBy(xpath = "//div[@class=\"left-wrapper\"]/div/div/div/div[4]/div[2]/ul/li/ul/li/ul")
	public WebElement valorCalculadoDerechaopcotro;
	
	
	@FindBy(xpath = "//span[text()=\"0\"][1]")
	public WebElement valorCalculadoDerechaopc;
	
	@FindBy(xpath = "//*[@id=\"formula-accordion\"]/ul/li/ul/li/ul/li/div")
	public WebElement valorCalculadoDerechaopc1;
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div[2]/div[2]/div[1]")
	public WebElement caixaArrastrar;
	
	@FindBy(xpath = "//div[@class=\"conditionAN4\"][2]/div/div[2]/div/div/div[2]")
	public WebElement selectOperador;
	@FindBy(xpath = "//li[text()=\"<\"]")
	public WebElement selectOperadoropc;
	
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div/div[2]/div[1]/div/div/div/div")
	public WebElement cerrar;
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div/div[2]/div[1]")
	public WebElement caixaArrastrar2;
	
	
	@FindBy(xpath = "//div[@class=\"right-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/div/div/div[1]")
	public WebElement registro1direita;
	
	@FindBy(xpath = "//div[@class=\"right-wrapper\"]/div/div/div/div[4]/div/ul/li/ul/li/ul/li/div[@data-hananame=\"AJUSTE_VALUE\"]")
	public WebElement valorAjuste;
	
	
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div/div[2]/div[3]/div/div/div/div")
	public WebElement cerrar3;
	@FindBy(xpath = "//*[@id=\"block-list-wrapper\"]/div/div[2]/div[3]")
	public WebElement caixaArrastrar3;
	
	@FindBy(xpath = "//div[@class=\"conditionAN4\"][2]/div[3]/div/div/div/input")
	public WebElement mensagem;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement Gravar;
	
	public RegrasdeAuditoriaN4EdicaoValoresCalculadosPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> valoresCalculados() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
		regraAuditoriaN4.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		String idRegradeAuditoria = idObter("idAn4");
		//String idRegradeAuditoria = idObter2();
		//1304
		WebElement menu = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idRegradeAuditoria+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@class=\"tr\" and @data-id =\""+idRegradeAuditoria+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		sleep(2000);
		
		menu.click();
		sleep(1000);
		editar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(valorCalculadoB);
		valorCalculadoB.click();
		sleep(3000);
		
		nomeVCalculado.sendKeys("TA-TESTE");
		sleep(3000);
		
		leiauteSelect.click();
		sleep(2000);
		opcLeiauteSelect.click();
		sleep(2000);
		
		blocoSelect.click();
		sleep(2000);
		opcBlocoSelect.click();
		sleep(2000);
		
		registroSelect.click();
		sleep(2000);
		opcRegistroSelect.click();
		sleep(2000);
		
		actionsMoveToElementElement(secoesArquivo);
		sleep(2000);
		
		secoesArquivo.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		
		attributeToBeXpath("//div[@class=\"column-wrapper second\"]/div/div","class", "animation-wrapper show");
		sleep(2000);
		
		sleep(1000);
		dobleClickElement(opcSecoesArquivo);
		sleep(1000);
		
		
		sleep(2000);
		secoesOperadores.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		attributeToBeXpath("//div[@class=\"column-wrapper second\"]/div/div","class", "animation-wrapper show");
		sleep(2000);
		
		sleep(1000);
		dobleClickElement(opcSecoesOperadores);
		sleep(1000);
		
		
		caixaFormula.sendKeys("3");
		sleep(2000);
		
		aplicar.click();
		sleep(2000);
		
		waitExpectElement(adicionar);
		sleep(2000);
		adicionar.click();
		sleep(3000);
		
		
		//VALOR CALCULADO IZQUIERDA
		
		valorCalculadoDerecha.click();
		sleep(3000);
		valorCalculadoDerechaopc.click();
		sleep(3000);

		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(valorCalculadoDerechaopc1, driver.findElement(By.xpath("//div[@class=\"conditionAN4\"][2]/div[2]/div[1]")));
		sleep(2000);
		

		selectOperador.click();
		sleep(3000);
		selectOperadoropc.click();
		sleep(3000);
		
		registro1direita.click();
		sleep(3000);
		dobleClickElement(valorAjuste);
		sleep(3000);
		
		mensagem.sendKeys("Teste Automatizado");
		sleep(3000);
		
		Gravar.click();
		sleep(1000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		sleep(3000);
	
		waitExpectElement(mensagem);
		sleep(2000);
		
		//sleep(2000);
		
		String valorMensagenString = mensagem.getAttribute("value");
		System.out.println("-----Visualizar Mensage de Valor Calculado----------");
		System.out.println("Nome valor calculado: "+ valorMensagenString);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		sucesso.add(valorMensagenString.contains("Teste Automatizado"));
		System.out.println(sucesso);
		
		return sucesso;
		
	}
}
