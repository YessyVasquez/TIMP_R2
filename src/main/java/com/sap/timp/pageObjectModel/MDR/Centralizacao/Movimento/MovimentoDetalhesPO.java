package com.sap.timp.pageObjectModel.MDR.Centralizacao.Movimento;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseKenssy;

public class MovimentoDetalhesPO extends TestBaseKenssy {
	@FindBy(xpath = "//span[text()=\"Centralização\"]")
	public WebElement centralizacao;
	
	@FindBy(xpath = "//span[text()=\"Movimento\"]")
	public WebElement movimento;
	
	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[1]/div[1]/div")
	public WebElement menu;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[3]/div[1]/div[1]/div/div[2]/ul/li[3]")
	public WebElement editar;

	@FindBy(xpath = "//*[@id=\"list\"]/div/div/div[1]/div/div[2]/div/div[3]")
	public WebElement idC;
	//*[@id="list"]/div/div/div[1]/div/div[3]/div/div[3]
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-left\"]")
	public WebElement primeira;
	
	@FindBy(xpath = "//*[@id=\"validity\"]/div/div[1]/input")
	public WebElement campo;
	
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/div/ul/li[1]/button")
	public WebElement btnGravar;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[3]/button[2]")
	public WebElement confirmacionGravar;
		
	@FindBy(xpath = "//*[@id=\"toolbar\"]/div/ul/li[3]/button")
	public WebElement btnRegresar;
	
	@FindBy(xpath = "/html/body/div[3]")
	public WebElement cuerpo;
		
	@FindBy(xpath = "//li/span[text()=\"Detalhes\"]")
	public WebElement detalhe;
	
	
	//DATOS DEL DETALLE
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[1]/div/div")
	public WebElement empresaD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[2]/div/div")
	public WebElement ufFilialD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[3]/div/div")
	public WebElement filialD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[4]/div/div")
	public WebElement filialCentralizadoraD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[5]/div/div")
	public WebElement tributoD;
	@FindBy(xpath = "//div[@class=\"detail-data\"]/div[6]/div/div")
	public WebElement ativoD;
	
	@FindBy(xpath = "//div[@id=\"detail-close-button\"]")
	public WebElement btnCerrarDetalhe;
	
	
	//DATOS DEL VISUALIZAR
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresaV;
	@FindBy(xpath = "//span[@id=\"ufBranch\"]")
	public WebElement ufFilialV;
	@FindBy(xpath = "//span[@id=\"branches\"]")
	public WebElement filialV;
	@FindBy(xpath = "//span[@id=\"centralizedBranch\"]")
	public WebElement filialCentralizadoraV;
	@FindBy(xpath = "//span[@id=\"tribute\"]")
	public WebElement tributoV;
	@FindBy(xpath = "//span[@id=\"active\"]")
	public WebElement ativoV;
	
	
	public MovimentoDetalhesPO() {
		PageFactory.initElements(driver, this);
	}
	
	public ArrayList<Boolean> DetalheMovimento() {
		sleep(2000);
		centralizacao.click();
		sleep(2000);
		
		movimento.click();
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		primeira.click();
		
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id][1]/div[1]/div"));
		WebElement opcion = driver.findElement(By.xpath("//div[@data-id][1]/div[1]/div/div[2]/ul/li/span[text()=\"Detalhes\"]"));
		
		menu.click();
		sleep(1000);
		opcion.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//OBTENER CANTIDAD DE TRIBUTOS
			int rows = driver.findElements(By.xpath("//div[@class=\"detail-data\"]/div[5]/div/div")).size();
			System.out.println("cantidad de tributo"+ rows);
			System.out.println(" ");
			
			int f=1;
			String tributoVar = "";
			
			for (int i = 0; i < rows; i++) {
				//div[@class="detail-data"]/div[5]/div/div[3]
				String tributo = driver.findElement(By.xpath("//div[@class=\"detail-data\"]/div[5]/div/div["+f+"]")).getText();
				tributo = tributo + ", ";
				tributoVar = tributoVar + tributo; 
				
				f=f+1;
			}
			
			tributoVar = tributoVar.trim();
			System.out.println("VALORES DE TRIBUTO: "+tributoVar);
		//
		
		
		//OBTENER CANTIDAD DE FILIALES
			int filial = driver.findElements(By.xpath("//div[@class=\"detail-data\"]/div[3]/div/div")).size();
			System.out.println("cantidad de filiales: "+ filial);
			System.out.println(" ");
			
			int g=1;
			String filialVar = "";
			
			for (int i = 0; i < filial; i++) {
				
				String filialFor = driver.findElement(By.xpath("//div[@class=\"detail-data\"]/div[3]/div/div["+g+"]")).getText();
				filialFor = filialFor + ", ";
				filialVar = filialVar + filialFor; 
				
				g=g+1;
			}
			filialVar = filialVar.trim();
			System.out.println("VALORES DE Filial: "+filialVar);
		//
		
		
		//IMPRIMIR VALORES DEL DETALLE
		String empresaValor = empresaD.getText();
		String ufFilialDValor = ufFilialD.getText();
		
		String filial1Valor = filialD.getText();
		
		
		String filialCentralizadoraDValor = filialCentralizadoraD.getText();
		String tributoDValor = tributoD.getText();
		String ativoDValor = ativoD.getText();
		
		
		System.out.println("******DATOS DEL DETALHE******");
		System.out.println("Empresa:" + empresaValor);
		System.out.println("UF Filial:" + ufFilialDValor);
		System.out.println("Filials 1:" + filial1Valor);
		System.out.println("Filial Centralizadora:" + filialCentralizadoraDValor);
		System.out.println("Tributo:" + tributoDValor);
		System.out.println("Ativo:" + ativoDValor);
		
		sleep(2000);
		btnCerrarDetalhe.click();
		sleep(1000);
		
		
		menu = driver.findElement(By.xpath("//div[@data-id][1]/div[1]/div"));
		opcion = driver.findElement(By.xpath("//div[@data-id][1]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		menu.click();
		sleep(1000);
		opcion.click();
		sleep(3000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//IMPRIMIR VALORES DEL VISUALIZAR
		String empresaVValor = empresaV.getText();
		String ufFilialVValor = ufFilialV.getText();
		
		String filialVValor = filialV.getText();
		filialVValor = filialVValor + ", ";
		filialVValor = filialVValor.trim();
		//concatenar filiales
		
		
		String filialCentralizadoraVValor = filialCentralizadoraV.getText();
		String tributoVValor = tributoV.getText();
		tributoVValor = tributoVValor + ", ";
		tributoVValor = tributoVValor.trim();
		String ativoVValor = ativoV.getText();
		
		System.out.println(" ");
		System.out.println("******DATOS DEL VISUALIZAR******");
		System.out.println("Empresa:" + empresaVValor);
		System.out.println("UF Filial:" + ufFilialVValor);
		System.out.println("Filials 1:" + filialVValor);
		System.out.println("Filial Centralizadora:" + filialCentralizadoraVValor);
		System.out.println("Tributo:" + tributoVValor);
		System.out.println("Ativo:" + ativoDValor);
		
		ArrayList<Boolean> sucesso = new ArrayList<Boolean>();
		sucesso.add(empresaVValor.equals(empresaValor));
		sucesso.add(ufFilialVValor.equals(ufFilialDValor));
		sucesso.add(filialVValor.equals(filialVar));
		sucesso.add(filialCentralizadoraVValor.equals(filialCentralizadoraDValor));
		sucesso.add(tributoVValor.equals(tributoVar));
		sucesso.add(ativoVValor.equals(ativoDValor));
		
		System.out.println(sucesso);
		
		return sucesso;
	}
	
	

}
