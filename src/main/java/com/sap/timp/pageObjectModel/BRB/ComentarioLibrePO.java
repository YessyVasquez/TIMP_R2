package com.sap.timp.pageObjectModel.BRB;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class ComentarioLibrePO extends TestBaseSteven{
	
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
	public WebElement comentarioLibre;
	
	@FindBy(xpath = "//*[@id=\"basePopover-wrapper\"]/div/div/div/ul/li[7]")
	public WebElement cambiarNombre;
	
	@FindBy(xpath = "//*[@id=\"basePopover-wrapper\"]/div/div/div/ul/li[6]")
	public WebElement adicionarCom;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement aplicar;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/div/ul/li[1]/button")
	public WebElement gravar;
	
	@FindBy(xpath = "//*[@id=\"editor-toolbar\"]/div/ul/li[3]/button")
	public WebElement execucao;
	@FindBy(xpath = "//*[@id=\"right\"]/div[2]/div[1]/div/div/ul/li[1]/button")
	public WebElement executar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[1]")
	public WebElement comentario2;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[1]")
	public WebElement comentario1;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[1]")
	public WebElement usuario1;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div[2]/div[1]")
	public WebElement usuario2;
	@FindBy(xpath = "//*[@id=\"username\"]")
	public WebElement usuarioLogueado;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/div[2]/div[2]")
	public WebElement data2;
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/div[2]/div[2]")
	public WebElement data1;
	
	@FindBy(xpath = "//button[text()=\"Não\"]")
	public WebElement nao;
	
	
	
	@FindBy(xpath = "//div[@id=\"table-data-wrapper\"]/div[2]/div[16]/div[2]/button")
					//*[@id="table-data-wrapper"]/div[2]/div[16]/div[2]/button
	public WebElement boton;
	
	
	public ComentarioLibrePO() {

		PageFactory.initElements(driver, this);
	}
	
	
	public ArrayList<Boolean> aplicarComentarioLibre() {

		Actions actions = new Actions(driver);
		waitExpectXpath("//*[@id=\"acc-reports\"]/ul/li[3]");

		ferramenta.sendKeys("Prueba Automatizada");
		ferramenta.sendKeys(Keys.ENTER);

		waitExpectElement(menu);
		sleep(menuT);

		menu.click();

		opcao.click();

		waitExpectXpath("//*[@id=\"accordion\"]/ul/li");
		
		agregar.click();
		

		actionsMoveToElementElement(agregar);
		sleep(7000);
		nombre.click();
		
		cambiarNombre.click();
		comentarioLibre.sendKeys("ComentarioLibre");
		
		nombre.click();
		adicionarCom.click();
		
	
		sleep(1000);
		aplicar.click();
		
		sleep(2000);
		
		actions.dragAndDrop(driver.findElement(By.xpath("//li[@column-name=\"ComentarioLibre\"]")), driver.findElement(By.xpath("//*[@id=\"draggable-126\"]"))).perform();
		sleep(2000);
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
		//waitExpectXpath("//*[@id=\"variant-toolbar\"]/div/ul/li[6]/button");
		sleep(2000);
		
		executar.click();
		
		sleep(6000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");
		
		String usuarioLog = usuarioLogueado.getText();
		
		actionsMoveToElementXpath("//div[contains(@aria-label,\"Item-docnum\") and not(@data-path)]");
		
		String dataColumn = driver.findElement(By.xpath("//div[contains(@aria-label,\"ComentarioLibre\")]")).getAttribute("data-column");
		System.out.println(dataColumn);
		
		
		
		WebElement comentarioTexto = driver.findElement(By.xpath("//div[@data-column=\""+dataColumn+"\" and contains(@aria-label, \"Linha: 1-\")]/div/div/div/div/input"));
		actions.doubleClick(comentarioTexto).perform();
		sleep(2000);
		comentarioTexto.sendKeys("Teste 1");
		sleep(1000);
		comentarioTexto.sendKeys(Keys.ENTER);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");
		sleep(2000);
		
		
		actionsMoveToElementXpath("//div[contains(@aria-label,\"Item-docnum\") and not(@data-path)]");
		sleep(1000);
		WebElement comentarioTexto2 = driver.findElement(By.xpath("//div[@data-column=\""+dataColumn+"\" and contains(@aria-label, \"Linha: 1-\")]/div/div/div/div/input"));
		
		sleep(1000);
		actions.doubleClick(comentarioTexto2).perform();
		sleep(2000);
		for (int i = 0; i < 7; i++) {
			comentarioTexto2.sendKeys(Keys.BACK_SPACE);
		}
		sleep(1000);
		comentarioTexto2.sendKeys("Teste 2");
		sleep(1000);
		comentarioTexto2.sendKeys(Keys.ENTER);
		sleep(4000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");
		sleep(6000);
		comentarioTexto2.click();
		

		sleep(5000);
		//driver.findElement(By.xpath("//div[@data-column=\""+dataColumn+"\" and contains(@aria-label, \"Linha: 1-\")]/div/button")).click();
		
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		//waitExpectXpath("//*[@id=\"table-fixed-wrapper\"]/div[2]/div[1]/span[1]/label");
		sleep(2000);

		//waitExpectXpath("/html/body/div[3]/div/div[3]/button");
		sleep(4000);
		
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		
		 boton.click();
		 sleep(4000);
		 invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		 sleep(4000);
		 
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		String dateS = String.valueOf(sdf.format(date));
		
		//comentario 2
		String comentario2S = comentario2.getText();
		sucesso.add(comentario2S.contains("Teste 2"));
		
		String usuario2S = usuario2.getText();
		sucesso.add(usuario2S.contains(usuarioLog));
		
		String data2S = data2.getText();
		data2S = data2S.substring(0, 10);
		sucesso.add(data2S.equals(dateS));
		//comentario 1
		
		String comentario1S = comentario1.getText();
		sucesso.add(comentario1S.contains("Teste 1"));
		
		String usuario1S = usuario1.getText();
		sucesso.add(usuario1S.contains(usuarioLog));
		
		String data1S = data1.getText();
		data1S = data1S.substring(0, 10);
		sucesso.add(data1S.equals(dateS));
		
		System.out.println(sucesso);	
		
		return sucesso;
		
		
		
		
		

		
		
		
	}

}
