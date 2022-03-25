package com.sap.timp.pageObjectModel.DFG.Configuracoes;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;

public class ConfiguracoesCriarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz1;
	
	@FindBy(xpath = "//div[@class=\"settingFolders-wrapper\"]/div/div[1]")
	public WebElement raiz2;

	@FindBy(xpath = "//button/span[text()=\"Novo Leiaute\"]")
	public WebElement novo;

	@FindBy(xpath = "//button/span[text()=\"Nova Configuração\"]")
	public WebElement nova;

	
	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nome;

	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement tipo;	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcaoTipo;

	@FindBy(xpath = "//div[@id=\"inputStructureParent\"]/div/div/div[2]")
	public WebElement grupoEstrutura;
	
	@FindBy(xpath = "//li[text()=\"Ajustes\"][1]")
	public WebElement opcaoGrupoEstruturaTP1;


	@FindBy(xpath = "//li[text()=\"Ajuste\"][1]")
	public WebElement opcaoGrupoEstrutura;
	
	@FindBy(xpath = "//div[@id=\"inputStructureChild\"]/div/div/div[2]")
	public WebElement estrutura;
	@FindBy(xpath = "//div[@id=\"18\"]/div/label/span")
	public WebElement opcaoEstrutura;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Versão\")]")
	public WebElement versaoLeiaute;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-public-layout\"]")
	public WebElement leiautePublico;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-public-setting\"]")
	public WebElement leiautePublicoC;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao2;
	
	@FindBy(xpath = "//button[contains(text(),\"Adicionar registro\")]")
	public WebElement adicionarRegistro;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Nome do Registro\")]")
	public WebElement nomeRegistro;
	
	@FindBy(xpath = "//li[@data-id=\"f\"]")
	public WebElement campoEstatico;
	
	@FindBy(xpath = "//div[@id=\"dfg-Filler\"]/div[1]/div/div/div/input")
	public WebElement nomeCampoEstatico;
	@FindBy(xpath = "//div[@id=\"dfg-Filler\"]/div[2]/div/div/div/input")
	public WebElement conteudo;
	
	@FindBy(xpath = "//div[@class=\"container-tabs\"]/div[2]")
	public WebElement configuracoes;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	@FindBy(xpath = "//li[@tabindex=\"0\"]/div[@class=\"title\"]/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividades;
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	
	@FindBy(xpath = "//div[@id=\"accordion\"]/div/div/div/div/div/input")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;

	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;

	@FindBy(xpath = "//span[text()=\"Adicionar bloco\"]")
	public WebElement bloco;

	@FindBy(xpath = "//input[contains(@placeholder,\"Nome\")]")
	public WebElement nomeBloco;
	
	
	@FindBy(xpath = "//li[contains(text(),\"Teste Automatizado\")]")
	public WebElement leiaute;
	
	@FindBy(xpath = "//div[@id=\"inputSelectTax\"]/div/div/div[2]")
	public WebElement tributo;
	@FindBy(xpath = "//li[text() =\"ICMS\" and @id]")
	public WebElement tributoO;
	
	@FindBy(xpath = "//div[@id=\"inputTimpVersion\"]/div/div/div[2]")
	public WebElement versao;
	@FindBy(xpath = "//li[text() =\"1.0\" and @id]")
	public WebElement versaoO;
	
	@FindBy(xpath = "//div[@id=\"inputSelectCompany\"]/div/div/div[2]")
	public WebElement empresa;
	@FindBy(xpath = "//div[@id=\"1000\"]/div/label/span")
	public WebElement empresaO;
	
	@FindBy(xpath = "//div[@id=\"inputSelectState\"]/div/div/div[2]")
	public WebElement uf;
	@FindBy(xpath = "//div[@id=\"SP\"]/div/label/span")
	public WebElement ufO;
	
	@FindBy(xpath = "//div[@id=\"inputSelectFilial\"]/div/div/div[2]")
	public WebElement filial;
	@FindBy(xpath = "//div[@id=\"1000SP0001\"]/div/label/span")
	public WebElement filialO;
	
	@FindBy(xpath = "//div[@id=\"inputTimpVersion\"]/div/div/div[2]")
	public WebElement versaoC;
	

	public ConfiguracoesCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> criar() {
		
		String url = driver.getCurrentUrl();
		boolean tp1 = false;
		if (url.contains("tp1")) {
			tp1 = true;
		}
		
		waitExpectElement(raiz1);
		raiz1.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"]")).size();
		
		String idLeiaute = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[5]/div")).getText();

		System.out.println(idObter1() + " id Leiaute");
		
		leiautePublico.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		novo.click();
		sleep(3000);
		waitExpectElement(nome);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado Massiel");
		sleep(1000);
		
		tipo.click();
		sleep(1000);
		opcaoTipo.click();
		String tipoT = opcao.getText();
		System.out.println(tipoT);
		sleep(1000);
		actionsMoveToElementElement(versaoLeiaute);
		sleep(1000);
		
		grupoEstrutura.click();
		sleep(1000);
		if (tp1 == false) {

			actionsMoveToElementElement(opcaoGrupoEstrutura);
		}else {
			actionsMoveToElementElement(opcaoGrupoEstruturaTP1);
		}
		
		sleep(1000);
		
		if (tp1 == false) {

			opcaoGrupoEstrutura.click();
		}else {
			opcaoGrupoEstruturaTP1.click();
		}
		
		sleep(1000);
		
		estrutura.click();
		sleep(1000);
		opcaoEstrutura.click();
		sleep(1000);
		opcaoEstrutura.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		dataVigencia.sendKeys("01/01/2013");
		
		sleep(1000);
		
		versaoLeiaute.sendKeys("1");
		sleep(1000);
		
		salvar.click();
		
		sleep(3000);
		waitExpectElement(gravar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		bloco.click();
		sleep(2000);
		nomeBloco.sendKeys("Bloco 1");
		sleep(1000);
		adicionarRegistro.click();
		sleep(2000);
		nomeRegistro.sendKeys("Registro 1");
		sleep(1000);
		
		pesquisar.sendKeys("Campo Estático");
		pesquisar.sendKeys(Keys.ENTER);
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		moveToElement(campoEstatico, driver.findElement(By.xpath("//div[@class=\"columns-wrapper ui-sortable ui-droppable\"]")));
		sleep(2000);
		nomeCampoEstatico.sendKeys("Campo Estático 1");
		sleep(1000);
		conteudo.sendKeys("1000");
		sleep(1000);
		aplicar.click();
		sleep(3000);
		
		gravar.click();
		sleep(3000);
		waitExpectElement(nao);
		sleep(2000);
		nao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();
		sleep(3000);
		//invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		raiz1.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"]")).size();
		
		String idLeiauteT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[5]/div")).getText();
		System.out.println("Id nuevo: " +idLeiauteT);
		idInserir3(idLeiauteT);
		String versaoT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[6]/div")).getText();
		String nomeT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[7]/div")).getText();
		String tipoTE = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[9]/div")).getText();
		
		
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int idLeiauteIA = convertToInt(idLeiaute);
		int idLeiauteID= convertToInt(idLeiauteT);
		
		if (idLeiauteID > idLeiauteIA) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		}
		System.out.println("IdLeiaute: " + idLeiauteT );
		idInserir1(idLeiauteT);
		System.out.println("Versão: " + versaoT.equals("1.0"));
		System.out.println("Nome: " + nomeT.equals("Teste Automatizado Massiel"));
		System.out.println("Tipo: " + tipoTE.equals(tipoT));
		
		sucesso.add(versaoT.equals("1.0"));
		sucesso.add(nomeT.equals("Teste Automatizado Massiel"));
		sucesso.add(tipoTE.equals(tipoT));
		
		configuracoes.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		raiz2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"]")).size();
		
		String idConfiguracao = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[5]/div")).getText();
		System.out.println("++++++++++++++++++++++");
		System.out.println("ID Configuracao: " + idConfiguracao);
		leiautePublicoC.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nova.click();
		
		sleep(3000);
		waitExpectElement(nome);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.sendKeys("Teste Automatizado Massiel");
		
		sleep(1000);
		
		tipo.click();
		sleep(1000);
		
		String idRegistro = idObter3();
		
		actionsMoveToElementXpath("//li[contains(text(),\""+idRegistro+"\")]");
		sleep(2000);

		WebElement Opc6 = driver.findElement(By.xpath("//li[contains(text(),\""+idRegistro+"\")]"));

		Opc6 .click();
		sleep(4000);
		
		attributeToBeXpath("//div[@id=\"inputTimpVersion\"]/div", "class", "base-select required");
		sleep(2000);
		
		versaoC.click();
		sleep(1000);
		opcao.click();
		
		
		sleep(2000);
		actionsMoveToElementElement(dataVigencia);
		sleep(1000);
		

		
		
		
		
		tributo.click();
		sleep(1000);
		actionsMoveToElementElement(tributoO);
		sleep(1000);
		tributoO.click();
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"inputSelectCompany\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		empresa.click();
		sleep(1000);
		empresaO.click();
		sleep(1000);
		empresaO.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		attributeToBeXpath("//div[@id=\"inputSelectState\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		uf.click();
		sleep(1000);
		ufO.click();
		sleep(1000);
		ufO.sendKeys(Keys.ESCAPE);
		sleep(1000);
		attributeToBeXpath("//div[@id=\"inputSelectFilial\"]/div", "class", "base-MultipleSelect3 required");
		sleep(2000);
		
		filial.click();
		sleep(1000);
		filialO.click();
		sleep(1000);
		filialO.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		dataVigencia.sendKeys("01/01/2013");
		sleep(1000);
		salvar.click();
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(10000);
		
		raiz2.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		rows = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"]")).size();
		
		String idConfiguracaoTC = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[5]/div")).getText();
		idInserir2(idConfiguracaoTC);
		String nomeC = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[6]/div")).getText();
		String empresaC = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[9]/div/li")).getText();
		String ufC = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[10]/div/li")).getText();
		String filialC = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[11]/div/li")).getText();
		String tributoC = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[12]/div/li")).getText();
		
		
		int idConfiguracaoCA = convertToInt(idConfiguracao);
		int idConfiguracaoCD= convertToInt(idConfiguracaoTC);
		
		if (idConfiguracaoCD > idConfiguracaoCA) {
			sucesso.add(true);
		}else {
			sucesso.add(false);
		
		}
		
		System.out.println("++++++++++++++++++++++");
		
		System.out.println("ID Configuracao Nueva: " + idConfiguracaoTC);
		System.out.println("Nome: " + nomeC);
		System.out.println("Empresa: "+ empresaC);
		System.out.println("UF: " + ufC);
		System.out.println("Filial: "+ filialC);
		System.out.println("Tributo: "+tributoC);
		
		sucesso.add(nomeC.equals("Teste Automatizado Massiel"));
		sucesso.add(empresaC.equals("1000"));
		sucesso.add(ufC.equals("SP"));
		sucesso.add(filialC.equals("0001"));
		sucesso.add(tributoC.equals("ICMS"));

		
		
		
		
		
		System.out.println(sucesso);
		return sucesso;
		
	}
	
	
}
