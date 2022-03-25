package com.sap.timp.pageObjectModel.BRB;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class GruposAvanzadosPO extends TestBaseSteven{

	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[4]")
	public WebElement opcao;

	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;

	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;

	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button")
	public WebElement executar;
	
	@FindBy(xpath = "//div[@data-column=\"115\" and contains(@aria-label ,\"Linha: 1-\")]/div[2]")
	public WebElement cfop;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/ul/li[3]/button")
	public WebElement edicao;
	
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[1]")
	public WebElement nao1;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[3]/button")
	public WebElement grupoAvanzado;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[2]/div[2]/div/div/input")
	public WebElement nome;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement aplicar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[1]/div/div[1]/input")
	public WebElement coluna;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/button")
	public WebElement adicionar;
	
	@FindBy(xpath = "//*[@id=\"filters-pool\"]/div/div/div/div[1]/div/div[4]/div/div/input")
	public WebElement valor;
	
	@FindBy(xpath = "//*[@id=\"option-14\"]")
	public WebElement diferenteO;
	
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]")
	public WebElement diferenteC;
	
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravar;
	
	
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[3]/button")
	public WebElement execucao;

	@FindBy(xpath = "//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/div[1]/span[4]")
	public WebElement igual;
	

	@FindBy(xpath = "//*[@id=\"table-fixed-wrapper\"]/div[3]/div[1]/div[1]/span[4]")
	public WebElement diferente;
	
	
	@FindBy(xpath = "//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/div[1]/span[3]")
	public WebElement igualC;
	
	
	@FindBy(xpath = "//div[@_vgrb=\"0\" and contains(@class,\"rule-row group\")]/div/div/div[2]")
	public WebElement eliminar;
	
	/*
	@FindBy(xpath = "//div[@data-column=\"115\" and contains(@aria-label ,\"Linha: 1.\")]/div[2]")
	public WebElement cfop;
	
	*//*
	@FindBy(xpath = "//div[@data-column=\"115\" and contains(@aria-label ,\"Linha: 1.\")]/div[2]")
	public WebElement cfop;
	
	*//*
	@FindBy(xpath = "//div[@data-column=\"115\" and contains(@aria-label ,\"Linha: 1.\")]/div[2]")
	public WebElement cfop;
	
	*//*
	@FindBy(xpath = "//div[@data-column=\"115\" and contains(@aria-label ,\"Linha: 1.\")]/div[2]")
	public WebElement cfop;
	
	*/
	

	public GruposAvanzadosPO() {

		PageFactory.initElements(driver, this);
	}
	String cfopG = "";
	public void gruposAvanzadosAplicar() {
	
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectElement(menu);
		//sleep(menuT);

		menu.click();

		opcao.click();

		waitExpectXpath("//*[@id=\"variant-toolbar\"]/div/ul/li[6]/button");
	
		executar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(7000);
		//waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");
	
	
		String cfopS = cfop.getText();
		int col = 1;
		while(cfopS.isEmpty()==true){
			cfopS = driver.findElement(By.xpath("//div[@data-column =\"115\" and contains(@aria-label , \"Linha: "+col+"-\")]/div[2]")).getText();
			col = col+1;
		}
		cfopG = cfopS;

		
		edicao.click();
		sleep(3000);
	//	nao1.click();
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		
		grupoAvanzado.click();
		
		waitExpectXpath("//*[@id=\"add-filter-btn\"]/button");
		
		nome.sendKeys("Igual a: "+cfopS);
		
		adicionar.click();
		
		coluna.sendKeys("CFOP");
		coluna.sendKeys(Keys.ESCAPE);
		
		valor.sendKeys(cfopS);
		sleep(2000);
		aplicar.click();
		
		sleep(3000);
		
		grupoAvanzado.click();
		
		waitExpectXpath("//*[@id=\"add-filter-btn\"]/button");
		
		nome.sendKeys("Diferente a: "+cfopS);
		
		adicionar.click();
		
		coluna.sendKeys("CFOP");
		coluna.sendKeys(Keys.ESCAPE);
		
		diferenteC.click();
		diferenteO.click();
		
		valor.sendKeys(cfopS);
		
		aplicar.click();
		sleep(2000);
		gravar.click();
		sleep(2000);
		waitExpectElement(nao1);
		sleep(1000);
		nao1.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(6000);
		
		execucao.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectXpath("//*[@id=\"variant-toolbar\"]/div/ul/li[6]/button");
		//sleep(2000);
		executar.click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectXpath("//*[@data-group=\"0\"]/div/div/span[4]");
			
		//sleep(15000);
		igual.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);

		//waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		//sleep(40000);
		

		
	}
	
	public ArrayList<Boolean> igual() {
		System.out.println(cfopG);
		int rows = driver.findElements(By.xpath("//div[@data-column =\"115\" and contains(@aria-label , \"Linha: \") and contains(@aria-label , \"CFOP: "+cfopG+"\")]/div[2]")).size();
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		int j=1;
		for (int i = 0; i < rows; i++) {
			
			String cfop = driver.findElement(By.xpath("//div[@data-column =\"115\" and contains(@aria-label , \"Linha: "+j+"-\")]/div[2]")).getText();
			System.out.println(cfop + " Igual a " + cfopG);
			sucesso.add(cfop.equals(cfopG));
			j= j+1;

		}

		System.out.println(sucesso);
		return sucesso;
		
	}
	public ArrayList<Boolean> diferente() {
		sleep(7000);
		igualC.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//sleep(15000);
		diferente.click();

		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectXpath("//*[@id=\"toast-wrapper\"]/ul/li/div/span[3]");
		//sleep(40000);
		
		int rows = driver.findElements(By.xpath("//div[@class=\"data\" and @id=\"table-data-wrapper\"]/div[3]/div[2]/div[@class=\"row visible\"]")).size();
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		//String cfop3 = driver.findElement(By.xpath("//div[@class=\"data\" and @id=\"table-data-wrapper\"]/div[3]/div[2]/div[3]/div[@data-column =\"115\" and contains(@aria-label , \"Linha: 2-\")]/div[2]")).getText();
		//System.out.println(cfop3 + " Prueba");
		int j=1;
		int k=2;
		sleep(10000);
			
		for (int i = 0; i < rows; i++) {
			
			String cfop = driver.findElement(By.xpath("//div[@class=\"data\" and @id=\"table-data-wrapper\"]/div[3]/div[2]/div["+k+"]/div[@data-column =\"115\" and contains(@aria-label , \"Linha: "+j+"-\")]/div[2]")).getText();
			System.out.println(cfop + " Diferente a "+cfopG);
			sucesso.add(cfop.equals(cfopG));
			j= j+1;
			k= k+1;

		}
		
		System.out.println(sucesso);
		return sucesso;
		
	}
	
	public boolean eliminar() {

		edicao.click();
		
		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		
		eliminar.click();
		sleep(1000);
		eliminar.click();
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		driver.navigate().refresh();
		

		waitExpectXpath("//*[@id=\"accordion\"]/ul/li/div/div");
		
		List<WebElement> removidoIgual = driver.findElements(By.xpath("//div[@_vgrb=\"0\" and contains(@class,\"rule-row group\")]/div/div/div[2]"));
		List<WebElement> removidoDiferente = driver.findElements(By.xpath("//div[@_vgrb=\"1\" and contains(@class,\"rule-row group\")]/div/div/div[2]"));
		
		boolean sucesso = false;
		
		if (removidoIgual.size()==0 && removidoDiferente.size()==0) {
			sucesso = true;
		}
		
		
		return sucesso;
		
	}
	
}
