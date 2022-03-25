package com.sap.timp.pageObjectModel.BRE.RegrasDeNegocio.ParametrosGerais;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegrasdeNegócioExcluirdefinitivamentePO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Regras de Negócio\"]")
	public WebElement rNegocio;
	
	@FindBy(xpath = "//span[text()=\"Lixeira\"]")
	public WebElement lexeiraBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnAceitar;
	
	
	
	@FindBy(xpath = "//button/span[contains(text(),\"Nova Regra\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//td[@colspan=\"6\" and @class=\"title-field\"]/div[1]/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar o tipo da Regra\"]")
	public WebElement tipoDeRegra;
	@FindBy(xpath = "//li[text()=\"Negócio\"]")
	public WebElement opcTipoDeRegra;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div[2]")
	public WebElement componente;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div[2]")
	public WebElement componente2;
	
	@FindBy(xpath = "//li[text()=\"TAA\"]")
	public WebElement opcComponente;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar o Tributo\"]")
	public WebElement tipoTributo;
	@FindBy(xpath = "//*[@id=\"00\"]/div[1]/label/span")
	public WebElement opcionTipoTributo;	

	@FindBy(xpath = "//input[@placeholder=\" selecionar o grupo de Estruturas de Dados\"]")
	public WebElement grupo;
	@FindBy(xpath = "//li[text()=\"TAA Estruturas\"]")
	public WebElement opcGrupo;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Estrutura de Dados\"]")
	public WebElement estructura;
	@FindBy(xpath = "//li[text()=\"Definição de Campos por Tab\"]")
	public WebElement opcEstructura;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Característica Especial \"]")
	public WebElement caracteristicas;
	@FindBy(xpath = "//li[text()=\"Abas\"]")
	public WebElement opcCaracteristicas;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Aba\"]")
	public WebElement abas;
	
	@FindBy(xpath = "	//tr[28]/td[2]/div/div/div[2]")
	public WebElement abas1;

	
	@FindBy(xpath = "//*[@id=\"31\"]/div[1]/label/span")
	public WebElement opcAbas;
	
	@FindBy(xpath = "//div[@id=\"1\"]/div[1]/label/span")
	public WebElement opcAbas1;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar Data\"]")
	public WebElement validade;
	
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement justi;
	
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div/div/div[1]/div/div[1]/input")
	public WebElement condicoes;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Operador\"]")
	public WebElement operador;
	
	@FindBy(xpath = "//div[@id=\"option-2\"]")
	public WebElement opcOperador;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]/div/div/div[5]/div/div[1]/input")
	public WebElement condicoes2;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[4]/div[2]/div[1]/div/div[1]/div[1]/div[2]/input")
	public WebElement acoes;
	@FindBy(xpath = "//*[@id=\"T31\"]/div[1]/label/span")
	public WebElement opcAcoes;
	
	@FindBy(xpath = "//*[@id=\"T1\"]/div[1]/label/span")
	public WebElement opcAcoes1;
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//*[@id=\"justification\"]/div/textarea")
	public WebElement agg;
	
	@FindBy(xpath = "//input[@placeholder=\"Descrição\"]")
	public WebElement body;
	
	@FindBy(xpath = "//td[@class=\"component-field\"]/div/div[2]")
	public WebElement componenteTQ2;
	
	public RegrasdeNegócioExcluirdefinitivamentePO() {

		PageFactory.initElements(driver, this);
	}
	
public boolean criar() {
		
	System.out.println("---------- Id Anterior --------- " );
	String url = driver.getCurrentUrl();

	boolean tp1  = false;
	boolean tc2  = false;
	boolean tq1  = false;
	boolean tq2  = false;
	if (url.contains("tq1")) {
		tq1 = true;
	}else if(url.contains("tc2")){
		tc2 = true;
	}else if(url.contains("tp1")){
		tp1 = true;
	}else if(url.contains("tq2")){
		tq2 = true;
	}
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//		Regras.click();
		sleep(2000);
		rNegocio.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		sleep(2000);
		System.out.println(id);
		
		novo.click();
		
	
		sleep(9000);
		
		nome.sendKeys("PRUEBA QA 007");
		sleep(2000);
		
		
		tipoDeRegra.click();
		sleep(3000);
		opcTipoDeRegra.click();
		sleep(3000);
		
		
		if (tq1 == true) {
			componente.click();
			sleep(1000);
			opcComponente.click();
			sleep(1000);

			

		}else if (tc2==true ) {
			componente2.click();
			sleep(1000);
			opcComponente.click();
			sleep(1000);
			
			
		}else if (tq2 == true) {
			componenteTQ2.click();
			sleep(1000);
			opcComponente.click();
			sleep(1000);
		
		}else {
			
			componente2.click();
			sleep(1000);
			opcComponente.click();
			sleep(1000);
			
		}
		
		tipoTributo.click();
		sleep(3000);
		opcionTipoTributo.click();
		sleep(1000);
		opcionTipoTributo.sendKeys(Keys.ESCAPE);
		sleep(3000);
		
		grupo.click();
		sleep(3000);
		opcGrupo.click();
		sleep(3000);
		
		estructura.click();
		sleep(3000);
		opcEstructura.click();
		sleep(3000);
		
		caracteristicas.click();
		sleep(3000);
		opcCaracteristicas.click();
		sleep(4000);
		
		
		
		if (tq1 == true) {
			abas.click();
			sleep(3000);
			opcAbas1.click();
			
			sleep(1000);
			opcAbas1.sendKeys(Keys.ESCAPE);
			sleep(3000);

			

		}else if (tc2==true ) {
			abas.click();
			sleep(3000);
			opcAbas.click();
			
			sleep(1000);
			opcAbas.sendKeys(Keys.ESCAPE);
			sleep(3000);

			
			
		}else if (tq2 == true) {
			abas.click();
			sleep(3000);
			opcAbas1.click();
			
			sleep(1000);
			opcAbas1.sendKeys(Keys.ESCAPE);
			sleep(3000);
		
		}else {
			
			abas.click();
			sleep(3000);
			opcAbas.click();
			
			sleep(1000);
			opcAbas.sendKeys(Keys.ESCAPE);
			sleep(3000);

		}
	
		sleep(1000);
		validade.sendKeys("01/01/2013");
		sleep(1000);
		
		sleep(2000);
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		waitExpectElement(adicionar);
		sleep(2000);
		adicionar.click();
		
		sleep(2000);
		condicoes.sendKeys("Alíquota ICMS- (aba:Registro C197 ou D197) (ED)");
		sleep(2000);
		condicoes.sendKeys(Keys.ENTER);
		sleep(2000);
		
		operador.click();
		sleep(2000);
		opcOperador.click();
		sleep(2000);
		
		condicoes2.sendKeys("Alíquota ICMS- (aba:Registro C197 ou D197) (ED)");
		sleep(2000);
		condicoes2.sendKeys(Keys.ESCAPE);
		sleep(2000);
		
		if (tq1 == true) {
			acoes.click();
			sleep(2000);
			opcAcoes1.click();
			sleep(2000);
			closeSelectTypeCheckbox(acoes);

			

		}else if (tc2==true ) {
			acoes.click();
			sleep(2000);
			opcAcoes.click();
			sleep(2000);
			closeSelectTypeCheckbox(acoes);
			
			
		}else if (tq2 == true) {
			acoes.click();
			sleep(2000);
			opcAcoes1.click();
			sleep(2000);
			closeSelectTypeCheckbox(acoes);
		}else {
			
			acoes.click();
			sleep(2000);
			opcAcoes.click();
			sleep(2000);
			closeSelectTypeCheckbox(acoes);

			
		}
		
		
		
		sleep(2000);
		aplicar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		justi.click();
		sleep(3000);
		agg.sendKeys("Teste Criação");
		sleep(2000);
		
		aceitar.click();

		sleep(19000);
		
		biblioteca.click();
		
		sleep(2000);
		//sim.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		sleep(2000);
		waitExpectElement(rNegocio);
		sleep(4000);
		rNegocio.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		idInserir("RegrasDeNegocioCriar1",idB);
		sleep(2000);
		System.out.println("ID: "+id);
		System.out.println("IDB: "+idB);
		
		double idD = convertToDouble(id);
		double idBD = convertToDouble(idB);
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso = false;
		
		if (idBD > idD) {
			sucesso = true;
		}else {
			sucesso = false;
		}
		
		
		return sucesso;
		
	}
	
public boolean lexeira() {
		
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//	Regras.click();
	sleep(2000);
	rNegocio.click();
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);

	btnUltimaPagina.click();
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	
	String idRegistro = idObter("RegrasDeNegocioCriar1");
	WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
	WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
	System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion
	
	menu.click();
	sleep(1000);
	açao.click();
	sleep(3000);
	waitExpectElement(btnAceitar);
	sleep(2000);
	btnAceitar.click();
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	
	// Recargo la pagina
	driver.navigate().refresh();
	sleep(2000);
	waitExpectXpath("//div[@class=\"overlay loader dark\"]");
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	
	btnUltimaPagina.click();
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	
	int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
	String idUltimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
	
	int id1 = convertToInt(idUltimo);
	int id2 = convertToInt(idRegistro);
	System.out.println(id1);
	System.out.println(id2);
	
	System.out.println(idUltimo); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
	
	boolean sucesso = false;
	
	if (id1 != id2) {
		sucesso= true;
	}
	System.out.println(sucesso);
	return sucesso;
}
		
public boolean excluirDefinitivo() {
	
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
//	Regras.click();
	sleep(2000);
	lexeiraBiblioteca.click();
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);

	btnUltimaPagina.click();
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	
	String idRegistro = idObter("RegrasDeNegocioCriar1");
	WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
	WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
	System.out.println(idRegistro); // Ultimo registro que es el que se crea con la automatizacion
	
	menu.click();
	sleep(1000);
	açao.click();
	sleep(3000);
	waitExpectElement(btnAceitar);
	sleep(2000);
	btnAceitar.click();
	sleep(2000);
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	
	// Recargo la pagina
	driver.navigate().refresh();
	sleep(2000);
	waitExpectXpath("//div[@class=\"overlay loader dark\"]");
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	
	btnUltimaPagina.click();
	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
	sleep(2000);
	
	int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
	String idUltimo = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
	
	int id1 = convertToInt(idUltimo);
	int id2 = convertToInt(idRegistro);
	System.out.println(id1);
	System.out.println(id2);
	
	System.out.println(idUltimo); // Ultimo registro despues de excluir el registro de la automatizacion y recargar
	
	boolean sucesso = false;
	
	if (id1 != id2) {
		sucesso= true;
	}
	System.out.println(sucesso);
	return sucesso;
}	

}
