package com.sap.timp.pageObjectModel.BRB;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.text.StyledEditorKit.BoldAction;

//import org.apache.logging.log4j.core.appender.rolling.action.IfAccumulatedFileCount;
//import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Global;

public class ListaSuspensaPO extends TestBaseSteven{
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/div/div/input")
	public WebElement ferramenta;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"right\"]/div/div[5]/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement opcao;
	
	@FindBy(xpath = "//li[contains(@class,\"add-column\")]/div/div/div")
	public WebElement agregar;
	
	@FindBy(xpath = "//li[contains(@column-name, \"Nova Coluna\")]/div/div/div")
	public WebElement nombre;
	
	@FindBy(xpath = "//li[contains(@column-name, \"Nova Coluna\")]/div/div/div/div/div/div/div[2]/input")
	public WebElement listaSuspensa;
	
	@FindBy(xpath = "//li/div/span[text()=\"Editar nome do campo\"]")
	public WebElement cambiarNombre;
	
	@FindBy(xpath = "//li/div/span[text()=\"Adicionar campo de comentários\"]")
	public WebElement adicionarCom;
	
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[1]/div/div/input")
	public WebElement valor1;
	
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[2]/button")
	public WebElement adicionar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravar;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[3]/button")
	public WebElement execucao;
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button")
	public WebElement executar;
	
	
	@FindBy(xpath = "//li[text()=\"Teste 1\"]")
	public WebElement teste1;
	
	@FindBy(xpath = "//li[text()=\"Teste 2\"]")
	public WebElement teste2;
	
	@FindBy(xpath = "//div[contains(@class,\"comment\") and contains(@aria-label, \"Linha: 1-\")]/div/button")
	public WebElement info;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[1]")
	public WebElement comentario2;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[1]")
	public WebElement comentario1;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[2]/div[1]")
	public WebElement usuario1;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[1]")
	public WebElement usuario2;
	@FindBy(xpath = "//*[@id=\"username\"]")
	public WebElement usuarioLogueado;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[2]/div[2]")
	public WebElement data2;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[2]")
	public WebElement data1;
					 
	//@FindBy(xpath = "//div[@data-column=\"n2\" and contains(@aria-label, \"Linha: 1.\")]/div/div/div/div[contains(@class,\"downmenu\")]")
	//public WebElement menulistaTd1;
	@FindBy(xpath = "//div[contains(@class,\"comment\") and contains(@aria-label, \"Linha: 1-\")]/div/div/div/div[contains(@class,\"downmenu\")]")
	public WebElement menulistaTd1;
	@FindBy(xpath = "//div[contains(@data-column,\"n\") and contains(@aria-label, \"Linha: 1-\")]/div/div/div/div[2]")
	public WebElement menuListaTc2;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	
	
	
	
	public ListaSuspensaPO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> comentarioLista() {
		
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);

		waitExpectElement(menu);
		sleep(menuT);

		menu.click();

		opcao.click();

		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		
		agregar.click();
		sleep(1000);

		actionsMoveToElementElement(agregar);
		sleep(5000);
		nombre.click();
		sleep(3000);
		cambiarNombre.click();
		sleep(3000);
		listaSuspensa.sendKeys("ListaSuspensa");
		sleep(1000);
		nombre.click();
		
		adicionarCom.click();
		sleep(1000);
		sleep(3000);
		valor1.sendKeys("Teste 1");
		adicionar.click();
		
		valor1.sendKeys("Teste 2");
		adicionar.click();
		sleep(1000);
		aplicar.click();
		sleep(2000);
		
		Actions actions = new Actions(driver);
		
		
		actions.dragAndDrop(driver.findElement(By.xpath("//li[@column-name=\"ListaSuspensa\"]")), driver.findElement(By.xpath("//*[@id=\"draggable-126\"]"))).perform();
		actions.release();
		
		//String dataId = driver.findElement(By.xpath("//li[@column-name=\"ListaSuspensa\"]")).getAttribute("column-id");
		//System.out.println(dataId);
		
		
		gravar.click();
		sleep(2000);
		waitExpectElement(nao);
		sleep(1000);
		nao.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		execucao.click();
		
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(4000);
		//waitExpectXpath("//*[@id=\"variant-toolbar\"]/div/ul/li[6]/button");
		
		
		executar.click();
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);


		
		actionsMoveToElementXpath("//*[@data-column=\"126\"]");
		String usuarioLog = usuarioLogueado.getText();
		
		String url = driver.getCurrentUrl();
		
		boolean amb = false;
		
		if (url.contains("tc2") || url.contains("tp1")) {
			amb = true;
		}else {
			amb =false;
		}
		
		if (amb== false) {
			menulistaTd1.click();
			sleep(5000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			//sleep(10000);
		}else {
			menuListaTc2.click();
			sleep(5000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(7000);
			//sleep(10000);
		}


		
		teste1.click();

		//waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(70000);
		//sleep(5000);
		if (amb== false) {
			menulistaTd1.click();
			sleep(5000);
		}else {
			menuListaTc2.click();
			sleep(5000);
		}
		sleep(9000);
		teste2.click();
		
		sleep(5000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(5000);
		//waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");
		//sleep(5000);
		if (amb== false) {
			menulistaTd1.click();
			sleep(2000);
		}else {
			sleep(2000);
			menuListaTc2.click();
			sleep(3000);
			
		}
		sleep(9000);
		teste2.click();
		sleep(5000);
		info.click();
		
		waitExpectXpath("/html/body/div[3]/div/div[3]/button");
		sleep(3000);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		

		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		String dateS = String.valueOf(sdf.format(date));
		
		//comentario 2
		String comentario2S = comentario2.getText();
		sucesso.add(comentario2S.equals("Teste 2"));
		
		String usuario2S = usuario2.getText();
		sucesso.add(usuario2S.contains(usuarioLog));
		
		String data2S = data2.getText();
		data2S = data2S.substring(0, 10);
		sucesso.add(data2S.equals(dateS));
		
		//comentario 1
		
		String comentario1S = comentario1.getText();
		sucesso.add(comentario1S.equals("Teste 1"));
		
		String usuario1S = usuario1.getText();
		sucesso.add(usuario1S.contains(usuarioLog));
		String data1S = data1.getText();
		data1S = data1S.substring(0, 10);
		sucesso.add(data1S.equals(dateS));
		
		
		return sucesso;
		
		
	
		
	}
	
	

}
