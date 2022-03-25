package com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseMassiel;

public class DescriçãoDeNatDeLesãoCriarPO extends TestBaseMassiel{
	@FindBy(xpath = "//span[text()=\"Tabelas de Apoio e-Social\"]")
	public WebElement tabelaApoioESocial;
	
	@FindBy(xpath = "//span[text()=\"Tabela 17 - Descrição de Nat. de Lesão\"]")
	public WebElement submenudescricaoNatLesao;
	
	@FindBy(xpath = "//div[contains(@class, \"icon-right\")][2]")
	public WebElement btnUltimaPagina;
	
	@FindBy(xpath = "//span[text()=\"Nova Descrição da Nat. da Lesão\"]")
	public WebElement btnNovaDescricao;
	
	@FindBy(xpath = "//div[contains(@class, \"code_0_0\")]/div/div/div/div/div[2]/input")
	public WebElement codigo;
	
	@FindBy(xpath = "//div[contains(@class, \"description_0_1\")]/div/textarea")
	public WebElement descricao;
	
	@FindBy(xpath = "//div[contains(@class, \"effectiveDateFrom_0_2\")]/div/div/input")
	public WebElement inputValidadeDe;
	
	@FindBy(xpath = "//div[contains(@class, \"effectiveDateTo_0_3\")]/div/div/input")
	public WebElement inputValidadeAte;
	
	@FindBy(xpath = "//span[text()=\"Gravar\"]")
	public WebElement btnGravar;
	
	@FindBy(xpath = "//span[text()=\"Biblioteca\"]")
	public WebElement btnBiblioteca;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement btnSim;
	
	public DescriçãoDeNatDeLesãoCriarPO() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean criar() {
		sleep(2000);
		tabelaApoioESocial.click();
		
		sleep(2000);
		submenudescricaoNatLesao.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		btnUltimaPagina.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//conta o numero de linhas
		int rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		
		String id = "0";

		if(rows > 0) {
			id = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText();
			System.out.println(id);
		}	
		
		sleep(2000);
		btnNovaDescricao.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		codigo.click();
		codigo.sendKeys("5555");
		sleep(1000);
		
		descricao.click();
		descricao.sendKeys("Prueba de teste5");
		sleep(1000);
		
		inputValidadeDe.click();
		inputValidadeDe.sendKeys(fechaActual());
		sleep(1000);
		
		inputValidadeAte.click();
		inputValidadeAte.sendKeys(fechaActual());
		sleep(1000);
		
		btnGravar.click();
		sleep(2000);
		
		waitExpectElement(btnSim);
		btnSim.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);		
		btnBiblioteca.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		btnUltimaPagina.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000); 
		
		rows = driver.findElements(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]")).size();
		  
		boolean sucesso = false;
		  
		if(rows == 0) {
			return sucesso = true; 
		}
		  
		String idB = driver.findElement(By.xpath("//div[contains(@class,\"tbody\")]/div[contains(@class,\"tr\") and @data-id]["+rows+"]/div[3]/div")).getText(); 
		idInserir("DescriçãoDeNatDeLesão",idB);
		  
		sleep(2000); 
		System.out.println(id); 
		System.out.println(idB);
		  
		double idD = Integer.valueOf(id); 
		double idBD = Integer.valueOf(idB);
		  
		//compara pra ver se o novo id criado é realmente o ultimo
		  
		if (idBD > idD) { 
			sucesso = true; 
		}else { 
			sucesso = false; 
		}
		  
		return sucesso;
	}
}
