package com.sap.timp.pageObjectModel.DFG.Leiautes;

import java.rmi.server.Skeleton;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.base.TestBaseSteven;

public class ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarPO extends TestBaseMassiel{
	
	@FindBy(xpath = "//span[text()=\"Raiz\"]")
	public WebElement raiz;
 
	@FindBy(xpath = "//button/span[text()=\"Novo Leiaute\"]")
	public WebElement novo;

	@FindBy(xpath = "//input[contains(@placeholder,\"nome\")]")
	public WebElement nome;

	@FindBy(xpath = "//div[@id=\"inputSelectTypeFile\"]/div/div/div[2]")
	public WebElement tipo;

	@FindBy(xpath = "//div[@id=\"inputStructureParent\"]/div/div/div[2]")
	public WebElement grupoEstrutura;
	
	@FindBy(xpath = "//div[@id=\"inputStructureChild\"]/div/div/div[2]")
	public WebElement estrutura;

	@FindBy(xpath = "//input[contains(@placeholder,\"Inicio\")]")
	public WebElement dataVigencia;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"Versão\")]")
	public WebElement versaoLeiaute;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-public-layout\"]")
	public WebElement leiautePublico;
	
	@FindBy(xpath = "//li[contains(@class,\"list-item\") and @id][1]")
	public WebElement opcao;
	
	@FindBy(xpath = "//div[@class=\"list-option\"][1]/div/div/label/span")
	public WebElement opcao2;
	
	@FindBy(xpath = "//button[@id=\"advanced-filters-btn\"]")
	public WebElement filtrosAvanzados;
	
	@FindBy(xpath = "//div[@id=\"mes\"]/div/div/div[2]")
	public WebElement mes;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement mesO;
	
	@FindBy(xpath = "//div[@id=\"recorrenciaFeriado\"]/div/div/div[2]")
	public WebElement recorrencia;
	@FindBy(xpath = "//*[@id=\"option-1\"]")
	public WebElement recorrenciaO;
	
	@FindBy(xpath = "//*[@id=\"vigencia1-activities\"]/div/div[1]/input")
	public WebElement data;
	/*
	@FindBy(xpath = "")
	public WebElement ;
	*/
	
	@FindBy(xpath = "//li[@tabindex=\"0\"]/div[@class=\"title\"]/span[text()=\"Atividades Fiscais\"]")
	public WebElement atividades;
	
	@FindBy(xpath = "//button[text()=\"Salvar\"]")
	public WebElement salvar;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
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

	

	public ParametrosGeraisCriarRaizIDPúblicoPrivadoCriarPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> criar() {
		
		raiz.click();
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
		
		nome.sendKeys("Teste Automatizado");
		sleep(1000);
		
		tipo.click();
		sleep(1000);
		opcao.click();
		String tipoT = opcao.getText();
		System.out.println(tipoT);
		sleep(1000);
		actionsMoveToElementElement(versaoLeiaute);
		sleep(1000);
		grupoEstrutura.click();
		sleep(1000);
		opcao.click();
		sleep(1000);
		
		estrutura.click();
		sleep(1000);


		opcao2.click();
		sleep(1000);
		opcao2.sendKeys(Keys.ESCAPE);
		sleep(1000);
		
		dataVigencia.sendKeys(fechaActual());
		
		sleep(1000);
		
		versaoLeiaute.sendKeys("1");
		sleep(2000);
		
		salvar.click();
		
		sleep(3000);
		waitExpectElement(gravar);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
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
	//	invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		raiz.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"]")).size();
		
		String idLeiauteT = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[5]/div")).getText();
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
		
		System.out.println("Versão: " + versaoT.equals("1.0"));
		System.out.println("Nome: " + nomeT.equals("Teste Automatizado"));
		System.out.println("Tipo: " + tipoTE.equals(tipoT));
		
		sucesso.add(versaoT.equals("1.0"));
		sucesso.add(nomeT.equals("Teste Automatizado"));
		sucesso.add(tipoTE.equals(tipoT));
		
		System.out.println(sucesso);
		
		WebElement publico = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[4]/span"));
		
		publico.click();
		sleep(3000);
		aplicar.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(8000);
		
		leiautePublico.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		

		waitExpectElement(filtrosAvanzados);
		sleep(2000);
		
		pesquisar.sendKeys(idLeiauteT);
		pesquisar.sendKeys(Keys.ENTER);
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[@data-id and @class=\"tr\"][1]")).size();
		String idBusqueda = driver.findElement(By.xpath("//div[@data-id and @class=\"tr\"]["+rows+"]/div[5]/div")).getText();
		idInserir1(idBusqueda);
		sucesso.add(idBusqueda.equals(idLeiauteT));
		
		System.out.println(sucesso);
		return sucesso;
		
	}
	
	
}
