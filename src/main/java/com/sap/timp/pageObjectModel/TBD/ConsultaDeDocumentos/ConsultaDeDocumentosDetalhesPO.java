package com.sap.timp.pageObjectModel.TBD.ConsultaDeDocumentos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseMassiel;

public class ConsultaDeDocumentosDetalhesPO extends TestBaseMassiel {
	
	
	@FindBy(xpath = "//span[text()=\"Consulta de Documentos\"]")
	public WebElement consultadedocumentos;
	
	@FindBy(xpath = "//input[@placeholder=\"Pesquisar\"]")
	public WebElement pesquisar;
	
	@FindBy(xpath = "//div[@class=\"right-panel visible\"]/div/div[2]/div[2]/div[1]/div[2]/div[10]")
	public WebElement comentarioFecha1;
	
	@FindBy(xpath = "//div[@class=\"right-panel visible\"]/div/div[2]/div[2]/div[1]/div[2]/div[11]")
	public WebElement comentarioFecha2;
	
	@FindBy(xpath = "//div[@class=\"right-panel visible\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]")
	public WebElement historicoFecha1;
	
	@FindBy(xpath = "//div[@class=\"right-panel visible\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]")
	public WebElement historicoFecha2;
	
	
	String idRegistro = "0";
	
	public ConsultaDeDocumentosDetalhesPO() {

		PageFactory.initElements(driver, this);
	}
	
	public static boolean validarFecha(String fecha) {
        try {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            formatoFecha.parse(fecha);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
	
	public   ArrayList<Boolean>  detalles() {
		String url = driver.getCurrentUrl();

		boolean tp1  = false;
		boolean tc2  = false;
		boolean tq1  = false;

		if (url.contains("tq1")) {
			tq1 = true;
		}else if(url.contains("tc2")){
			tc2 = true;
		}else if(url.contains("tp1")){
			tp1 = true;
		}
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		sleep(2000);
		consultadedocumentos.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		if (tq1 == true) {


			idRegistro = "89";

		}else if (tp1==true ) {
			
			idRegistro = "28";
		}else {
			
			idRegistro = "16";
		}
		
		
		
		System.out.println(idRegistro + " Id Registro");
		pesquisar.sendKeys(idRegistro);
		pesquisar.sendKeys(Keys.ENTER);
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id]/div[1]/div"));
		
		menu.click();
		sleep(1000);
		
		String Numero1 = comentarioFecha1.getText();
		
		String Numero2 = comentarioFecha2.getText();
		
		String Numero3 = historicoFecha1.getText();
		
		String Numero4 = historicoFecha2.getText();
		
		
		
		if (tc2 == true) {


			Numero1 = Numero1.replace("TESTEAUTOMATIZADO TESTEAUTOMATIZADO, ", "");
			Numero2 = Numero2.replace("Igor Pereira, ", "");
			
			Numero3 = Numero3.replace("Criado por —, ", "");
			
			Numero4 = Numero4.replace("Última edição por —, ", "");

		}else if (tq1 == true) {
			Numero1 = Numero1.replace("TESTE AUTOMATIZADO, ", "");
			Numero2 = Numero2.replace("Igor Pereira, ", "");
			
			Numero3 = Numero3.replace("Criado por Igor Pereira, ", "");
			
			Numero4 = Numero4.replace("Última edição por Igor Pereira, ", "");
			
		}else {
			Numero1 = Numero1.replace("TESTEAUTOMATIZADO TESTEAUTOMATIZADO, ", "");
			Numero2 = Numero2.replace("TESTEAUTOMATIZADO TESTEAUTOMATIZADO, ", "");
			
			Numero3 = Numero3.replace("Criado por TESTEAUTOMATIZADO TESTEAUTOMATIZADO, ", "");
			
			Numero4 = Numero4.replace("Última edição por TESTEAUTOMATIZADO TESTEAUTOMATIZADO, ", "");
		}
		
		
		
		boolean sucesso1 = false;
		boolean sucesso4 = false;
		boolean sucesso2 = false;
		boolean sucesso3 = false;
		
		System.out.println(Numero1);
		System.out.println(Numero2);
		System.out.println(Numero3);
		System.out.println(Numero4);
		
		sucesso4 = validarFecha(Numero1);
		sucesso1 = validarFecha(Numero2);
		sucesso2 = validarFecha(Numero3);
		sucesso3 = validarFecha(Numero4);
		
		
		
	        if(sucesso4==true && sucesso1 ==true && sucesso2 ==true && sucesso3 ==true){
	        	
	            System.out.println("Las fechas son  validas");
	            
	             }else {
	            	 
	                 System.out.println("Las fechas no son validas");
	        
	         }
	        
	        ArrayList<Boolean>  sucesso = new ArrayList<Boolean>(); 
	        sucesso.add(sucesso1);
	        sucesso.add(sucesso2);
	        sucesso.add(sucesso3);
	        sucesso.add(sucesso4);
	        System.out.println( sucesso);
	        
	        return sucesso;

	}
}
