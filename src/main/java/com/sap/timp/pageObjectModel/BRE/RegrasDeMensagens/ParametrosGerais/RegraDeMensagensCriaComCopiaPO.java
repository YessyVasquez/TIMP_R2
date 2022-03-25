package com.sap.timp.pageObjectModel.BRE.RegrasDeMensagens.ParametrosGerais;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class RegraDeMensagensCriaComCopiaPO extends TestBaseSteven {
	
	@FindBy(xpath = "//span[text()=\"Regras de Mensagens\"]")
	public WebElement regrasdemensagens;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement ultimapagina;
	
	@FindBy(xpath = "//button[text()=\"Aplicar\"]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//li[@identifier=\"accordion-item-trash_rules\"]")
	public WebElement lixeira;
	
	@FindBy(xpath = "//td[@class=\"title-field\"]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "//span[@id=\"textLabel\"]")
	public WebElement mensagem;
	
	@FindBy(xpath = "//li[@class=\"base-toast  toast-success   \"]/div")
	public WebElement mensagembloqueio;
	
	public RegraDeMensagensCriaComCopiaPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> criarComCopia() {
		

		String url = driver.getCurrentUrl();
		
		boolean tc2 = false;
		boolean td1 = false;
		boolean tp1 = false;
		boolean tq1 = false;
		boolean tq2 = false;
		if (url.contains("tc2")) {
			tc2 = true;
		}else if (url.contains("tp1")) {
			tp1 = true;
		}else if (url.contains("tq1")) {
			tq1 = true;
		}else if (url.contains("tq2")) {
			tq2 = true;
		}else {
			td1 = true;
		}
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		regrasdemensagens.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String idRegistro = idObter("RegraDeMensagens");
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Copiar\"]"));
		System.out.println("ID do registro criado: " + idRegistro);
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		nome.clear();
		nome.sendKeys("Testeautomatizado - Copia");
		waitExpectElement(aplicar);
		sleep(3000);
		aplicar.click();
		
		sleep(2000);
		waitExpectXpath("//div[@class=\"overlay loader transp\"]");
		invisibilityOfElement("//div[@class=\"overlay loader transp\"]");
		sleep(2000);	
		if(tp1 == true || tq1 == true || tq2 == true) {
		biblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
	
	
	
		
		waitExpectElement(mensagembloqueio);
		sleep(2000);
		regrasdemensagens.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistroCopia = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("ID Registro copia: " + idRegistroCopia);
		
		if(idRegistroCopia != idRegistro) {
			boolean sucesso1= true;
			System.out.println("Copia criada...");
			System.out.println("ID Registro: " + idRegistro);
			System.out.println("ID Registro copia: " + idRegistroCopia);	
			sucesso.add(sucesso1);
		}else {
			boolean sucesso1= false;
			System.out.println("Copia não criada");			
			sucesso.add(sucesso1);
		}
		
		
		
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopia+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopia+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
		
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		waitExpectElement(sim);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		waitExpectElement(lixeira);
		sleep(2000);
		
		
		sleep(10000);
		lixeira.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistroCopiaLixeira = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		System.out.println("ID Registro Copia na Lixeira: " + idRegistroCopiaLixeira);
		
		double idD = convertToDouble(idRegistroCopiaLixeira);
		double idBD = convertToDouble(idRegistroCopia);
		if(idD == idBD)
		{
			System.out.println("Sim o ID é o mesmo da Copia");
			boolean sucesso1=true;
			sucesso.add(sucesso1);
		}else {
			System.out.println("Não é o mesmo ID");
			boolean sucesso1 = false;
			sucesso.add(sucesso1);
		}
		menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopiaLixeira+"\"]/div[1]/div"));
		açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopiaLixeira+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
		menu.click();
		sleep(1000);
		açao.click();
		sleep(2000);
		waitExpectElement(sim);
		sleep(2000);
		sim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(mensagembloqueio);
		sleep(2000);
		
		lixeira.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		ultimapagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		String idRegistroLixeira = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
		
		if(idRegistroCopiaLixeira != idRegistroLixeira) {
			System.out.println("ID Registro Copia Lixeira: " + idRegistroCopiaLixeira);
			System.out.println("ID Registro ultimo após apagar o registro copia da lixeira: " + idRegistroLixeira);	
			boolean sucesso2 = true;
			sucesso.add(sucesso2);
		}else {
			System.out.println("Não existe a cópia na lixeira");			
			 boolean sucesso2 = false;
			 sucesso.add(sucesso2);
		}
		
		System.out.println(sucesso);
		return sucesso;
		}else {
			
			biblioteca.click();
			
			sleep(2000);
			//waitExpectElement(mensagembloqueio);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
		
		
		
			
		
			regrasdemensagens.click();
			
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			ultimapagina.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
			
			int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
			String idRegistroCopia = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("ID Registro copia: " + idRegistroCopia);
			
			if(idRegistroCopia != idRegistro) {
				boolean sucesso1= true;
				System.out.println("Copia criada...");
				System.out.println("ID Registro: " + idRegistro);
				System.out.println("ID Registro copia: " + idRegistroCopia);	
				sucesso.add(sucesso1);
			}else {
				boolean sucesso1= false;
				System.out.println("Copia não criada");			
				sucesso.add(sucesso1);
			}
			
			
			
			menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopia+"\"]/div[1]/div"));
			açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopia+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Lixeira\"]"));
			
			menu.click();
			sleep(1000);
			açao.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			waitExpectElement(sim);
			sim.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);

			
			lixeira.click();
			sleep(3000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			ultimapagina.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
			String idRegistroCopiaLixeira = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println("ID Registro Copia na Lixeira: " + idRegistroCopiaLixeira);
			
			double idD = convertToDouble(idRegistroCopiaLixeira);
			double idBD = convertToDouble(idRegistroCopia);
			if(idD == idBD)
			{
				System.out.println("Sim o ID é o mesmo da Copia");
				boolean sucesso1=true;
				sucesso.add(sucesso1);
			}else {
				System.out.println("Não é o mesmo ID");
				boolean sucesso1 = false;
				sucesso.add(sucesso1);
			}
			menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopiaLixeira+"\"]/div[1]/div"));
			açao = driver.findElement(By.xpath("//div[@data-id=\""+idRegistroCopiaLixeira+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Excluir\"]"));
			menu.click();
			sleep(1000);
			açao.click();
			sleep(2000);
			waitExpectElement(sim);
			sleep(2000);
			sim.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(3000);


			
			lixeira.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			ultimapagina.click();
			
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
			String idRegistroLixeira = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			
			if(idRegistroCopiaLixeira != idRegistroLixeira) {
				System.out.println("ID Registro Copia Lixeira: " + idRegistroCopiaLixeira);
				System.out.println("ID Ultimo registro  após apagar o registro copia da lixeira: " + idRegistroLixeira);	
				boolean sucesso2 = true;
				sucesso.add(sucesso2);
			}else {
				System.out.println("Não existe a cópia na lixeira");			
				 boolean sucesso2 = false;
				 sucesso.add(sucesso2);
			}
			
			System.out.println(sucesso);
			return sucesso;
			
		}
	}

}
