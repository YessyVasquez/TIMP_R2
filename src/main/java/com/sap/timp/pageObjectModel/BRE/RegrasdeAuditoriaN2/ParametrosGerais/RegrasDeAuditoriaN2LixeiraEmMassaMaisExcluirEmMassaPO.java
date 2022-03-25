package com.sap.timp.pageObjectModel.BRE.RegrasdeAuditoriaN2.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegrasDeAuditoriaN2LixeiraEmMassaMaisExcluirEmMassaPO extends TestBaseSteven{
	
	@FindBy(xpath = "//span[text()=\"Regras de Auditoria N2\"]")
	public WebElement AN2;
	
	@FindBy(xpath = "//span[contains(text(),\"Nova Regra\")]")
	public WebElement novo;
	
	@FindBy(xpath = "//td[@colspan=\"6\" and @class=\"title-field\"]/div[1]/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar o tipo da Regra\"]")
	public WebElement tipoDeRegra;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar o grupo de Estruturas de Dados\"]")
	public WebElement grupo;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar a Estrutura de Dados\"]")
	public WebElement estructura;
	
	@FindBy(xpath = "//li[@id=\"option-2\"]")
	public WebElement opcTipoDeRegra;
	
	@FindBy(xpath = "//li[text()=\"Ajustes\"][1]")
	public WebElement opcGrupo;
	
	@FindBy(xpath = "//li[text()=\"Ajustes Fiscais\"]")
	public WebElement opcEstructura;
	
	@FindBy(xpath = "//input[@placeholder=\" selecionar o Tributo\"]")
	public WebElement tipoTributo;
	
	@FindBy(xpath = "//*[@id=\"00\"]/div[1]/label/span")
	public WebElement opcionTipoTributo;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/table/tbody/tr[40]/td[2]/div/div[1]/input")
	public WebElement validade;
	
	@FindBy(xpath = "//div[@class=\"dialog-content big\"]/div/table/tbody/tr[31]/td[2]/div/div[1]/input")
	public WebElement validade1;
		
	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Justificativa\"]")
	public WebElement justi;
	
	@FindBy(xpath = "//span[text()=\"Lixeira\"]")
	public WebElement lixeira;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement Não;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"tr\" and @data-id]/div[4]/div")
	public WebElement motivo;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	
	@FindBy(xpath = "//button[text()=\"Aceitar\"]")
	public WebElement aceitar;
	
	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//li[@class=\"base-toast  toast-success   \"]/div")
	public WebElement mensagembloqueio;
	
	@FindBy(xpath = "//span[text()=\"Adicionar Caminho\"]")
	public WebElement adicionarCaminho;
	
	@FindBy(xpath = "//td[@class=\"datastructureCategory-field\"]/div/div/div[2]")
	public WebElement grupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajuste\"][1]")
	public WebElement opcaogrupodeestrutura;
	
	@FindBy(xpath = "//li[@id][text()=\"Ajustes\"][1]")
	public WebElement opcaogrupodeestruturatp1;
	
	public RegrasDeAuditoriaN2LixeiraEmMassaMaisExcluirEmMassaPO() {

		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criar() {
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		AN2.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		

		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		sleep(2000);
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		sleep(2000);
		System.out.println("Ultimo id Na biblioteca:"+id);
	
		novo.click();
		sleep(2000);
		
		
		//Primeiro registro
		waitExpectElement(nome);
		sleep(2000);
		nome.click();
		sleep(1000);
		nome.sendKeys("TESTE AUTOMATIZADO N2 RODADAS - 111");
		sleep(2000);
		
		
		tipoDeRegra.click();
		sleep(3000);
		opcTipoDeRegra.click();
		sleep(3000);
		
		tipoTributo.click();
		sleep(3000);
		opcionTipoTributo.click();
		sleep(1000);
		opcionTipoTributo.sendKeys(Keys.ESCAPE);
		sleep(3000);
		
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
		
		
		if(tp1 == true) {
		grupodeestrutura.click();
		sleep(1000);
		opcaogrupodeestruturatp1.click();
		sleep(1000);
		}else {
			grupodeestrutura.click();
			sleep(1000);
			opcaogrupodeestrutura.click();
			sleep(1000);
		}
		
		
		estructura.click();
		sleep(3000);
		opcEstructura.click();
		sleep(3000);
		
		if(tp1 == true) {
			validade1.sendKeys("01/01/2013");	
			
			sleep(2000);
			}else {
				validade.sendKeys("01/01/2013");	
				
				sleep(2000);
			}
		
		
		
		
		aplicar.click();
		sleep(2000);
		waitExpectElement(adicionarCaminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		
		biblioteca.click();
	
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(AN2);
		sleep(2000);
		
		AN2.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(3000);
		
		//-----------SEGUNDO----------------
		novo.click();
		sleep(2000);
		waitExpectElement(nome);
		sleep(2000);
		nome.click();
		sleep(1000);
		nome.sendKeys("TESTE AUTOMATIZADO N2 RODADAS - 222");
		sleep(1000);
		

		tipoDeRegra.click();
		sleep(3000);
		opcTipoDeRegra.click();
		sleep(3000);
		
		tipoTributo.click();
		sleep(3000);
		opcionTipoTributo.click();
		sleep(1000);
		opcionTipoTributo.sendKeys(Keys.ESCAPE);
		sleep(3000);
		
		if(tp1 == true) {
			grupodeestrutura.click();
			sleep(1000);
			opcaogrupodeestruturatp1.click();
			sleep(1000);
			}else {
				grupodeestrutura.click();
				sleep(1000);
				opcaogrupodeestrutura.click();
				sleep(1000);
			}
		
		estructura.click();
		sleep(3000);
		opcEstructura.click();
		sleep(3000);
		
		
		if(tp1 == true) {
			validade1.sendKeys("01/01/2013");	
			
			sleep(2000);
			}else {
				validade.sendKeys("01/01/2013");	
				
				sleep(2000);
			}
		
		sleep(2000);
		aplicar.click();
		sleep(2000);
		waitExpectElement(adicionarCaminho);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		biblioteca.click();

		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(AN2);
		sleep(2000);
		AN2.click();
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		rows = rows-1;
		
		String idRegistro2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		sleep(2000);
		System.out.println(id);
		System.out.println(idRegistro1);
		System.out.println(idRegistro2);
		
		double idD = convertToDouble(id);
		double idRegistroD1 = convertToDouble(idRegistro1);
		double idRegistroD2 = convertToDouble(idRegistro2);

		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		boolean sucesso1 =false;
		if (idRegistroD1 > idD && idRegistroD2 > idD) {
			System.out.println("Sim são os ids criados nesse teste");
			sucesso1 = true;
			sucesso.add(sucesso1);
		}else {
			System.out.println("Não são os ids criados nesse teste");
			sucesso1 = false;
			sucesso.add(sucesso1);
		}
		//Lixeira em massa
		
		int rows1 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		WebElement check1 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[2]/label/span"));
		check1.click();
		sleep(2000);
		
		rows1 = rows1-1;
		
		WebElement check2 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows1+"]/div[2]/label/span"));
		check2.click();
		sleep(2000);
		
		WebElement lixeiraemmassa = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Finance-and-Office icon-trash\"]"));
		lixeiraemmassa.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//--------------------------- excluir em massa ---------------------------------
		//waitExpectElement(mensagem);
		//sleep(2000);
	//	waitExpectElement(mensagembloqueio);
		sleep(2000);
		lixeira.click();
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		int rows2 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String idRegistro1lixeira = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[3]/div")).getText();
		
		rows2 = rows2-1;
		
		String idRegistro2lixeira = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows2+"]/div[3]/div")).getText();
		
		sleep(2000);
		System.out.println(idRegistro1lixeira);
		System.out.println(idRegistro2lixeira);
		
		double idRegistroD1lixeira = convertToDouble(idRegistro1lixeira);
		double idRegistroD2lixeira = convertToDouble(idRegistro2lixeira);

	
		boolean sucesso2 =false;
		if (idRegistroD1lixeira == idRegistroD1 && idRegistroD2lixeira == idRegistroD2) {
			System.out.println("São os mesmos id's que foram criado");
			sucesso2 = true;
			sucesso.add(sucesso2);
		}else {
			System.out.println("Não são os mesmos id's que foram criado");
			sucesso2 = false;
			sucesso.add(sucesso2);
		}
		
		int rows3 = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		WebElement check3 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows3+"]/div[2]/label/span"));
		check3.click();
		sleep(2000);
		
		rows3 = rows3-1;
		
		WebElement check4 = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows3+"]/div[2]/label/span"));
		check4.click();
		sleep(2000);
		
		WebElement excluirmassa = driver.findElement(By.xpath("//span[@class=\"button-icon icon-font-Sign-and-Symbols icon-persign\"]"));
		excluirmassa.click();
		
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectElement(mensagem);
		//sleep(2000);
		waitExpectElement(mensagembloqueio);
		sleep(2000);
		lixeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		int rows4=driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows4+"]/div[3]/div")).getText();

		sleep(2000);
		
		System.out.println("Id do último item na lixeira: "+idB);
		
		double idBD = convertToDouble(idB);
		//compara pra ver se o novo id criado é realmente o ultimo
		boolean sucesso3 = false;
		if (idBD != idRegistroD1lixeira && idBD!=idRegistroD2lixeira) {
			System.out.println("Os ids não constam na biblioteca");
			sucesso3 = true;
			sucesso.add(sucesso3);
		}else {
			System.out.println("Os ids constam na biblioteca");
			sucesso3=false;
			sucesso.add(sucesso3);
		}
		
		System.out.println(sucesso);
		return sucesso;
		
	}


}
