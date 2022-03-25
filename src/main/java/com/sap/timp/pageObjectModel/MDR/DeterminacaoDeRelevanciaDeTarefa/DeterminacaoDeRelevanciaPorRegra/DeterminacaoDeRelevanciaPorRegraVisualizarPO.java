package com.sap.timp.pageObjectModel.MDR.DeterminacaoDeRelevanciaDeTarefa.DeterminacaoDeRelevanciaPorRegra;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class DeterminacaoDeRelevanciaPorRegraVisualizarPO extends TestBaseSteven {
	
	
	@FindBy(xpath = "//span[text()=\"Determinação de Relevância de Tarefa\"]")
	public WebElement determinacaoderelevanciadetarefa;
	
	@FindBy(xpath = "//span[text()=\"Determinação de Relevância por Regra\"]")
	public WebElement determinacaoderelevanciaporregra;
	
	@FindBy(xpath = "//span[text()=\"Nova Determinação de Relevância por Regra\"]")
	public WebElement novo;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000\"]")
	public WebElement empresa;
	
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-SP\"]")
	public WebElement uf;
	

	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000_SP_0001\"]")
	public WebElement filial;
	
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-1000_SP_0014\"]")
	public WebElement filialtc2;
	
	@FindBy(xpath = "//div[@id=\"multipleControlerId-00\"]")
	public WebElement tributo;
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Código de Regra\"]")
	public WebElement codigoderegra;
	
	
	@FindBy(xpath = "//input[@placeholder=\"Selecionar Saida\"]")
	public WebElement saida;
	
	@FindBy(xpath = "//div[@id=\"validFrom\"]/div/div[1]/input")
	public WebElement datainiciovigencia;
	
	@FindBy(xpath = "//div[@class=\"btn icon-btn trans icon icon-font-Sign-and-Symbols icon-right\"]")
	public WebElement siguiente;

	
	@FindBy(xpath = "//button/span[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//button[text()=\"Sim\"]")
	public WebElement sim;
	
	@FindBy(xpath = "//button/span[text()=\"Biblioteca\"]")
	public WebElement biblioteca;
	
	@FindBy(xpath = "//span[@id=\"company\"]")
	public WebElement empresavi;
	
	@FindBy(xpath = "//span[@id=\"uf\"]")
	public WebElement ufvi;
	
	@FindBy(xpath = "//span[@id=\"branch\"]")
	public WebElement filialvi;
	
	@FindBy(xpath = "//span[@id=\"tax\"]")
	public WebElement tributovi;
	
	@FindBy(xpath = "//span[@id=\"ruleCode\"]")
	public WebElement codigoderegravi;
	
	@FindBy(xpath = "//span[@id=\"ruleCodeDescription\"]")
	public WebElement descricaodecodigoderegravi;
	
	@FindBy(xpath = "//span[@id=\"output\"]")
	public WebElement saidavi;
	
	@FindBy(xpath = "//span[@id=\"validFrom\"]")
	public WebElement datainiciovigenciavi;
	
	public DeterminacaoDeRelevanciaPorRegraVisualizarPO() {

		PageFactory.initElements(driver, this);
	}
	
public ArrayList<Boolean> visualizar() {
	
	
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
		
		sleep(2000);
		determinacaoderelevanciadetarefa.click();
		sleep(2000);
		
		determinacaoderelevanciaporregra.click();
		
		sleep(2000);
		
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro = idObter("DeterminacaoDeRelevanciaPorRegra");
		
		WebElement menu = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div"));
		WebElement visualizar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Visualizar\"]"));
		
		actionsMoveToElementElement(menu);
		sleep(2000);
		menu.click();
		sleep(1000);
		
		visualizar.click();
		sleep(2000);
		//visualizar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		//visualizar
		if(tc2==true) {
		String empresvisualizar = empresavi.getText();
		String ufvisualizar = ufvi.getText();
		String filialvisualizar = filialvi.getText();
		String tributovisualizar = tributovi.getText();
		String codigoderegravisualizar = codigoderegravi.getText();
		String saidavisualizar = saidavi.getText();
		String datavisualizar = datainiciovigenciavi.getText();
		
		
		
		System.out.println(empresvisualizar);
		System.out.println(ufvisualizar);
		System.out.println(filialvisualizar);
		System.out.println(tributovisualizar);
		System.out.println(codigoderegravisualizar);
		System.out.println(saidavisualizar);
		System.out.println(datavisualizar);
	
		
		biblioteca.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		waitExpectElement(siguiente);
		sleep(2000);
		siguiente.click();
		
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		//pega o ultimo id que foi gerado no criar
		String idRegistro1 = idObter("DeterminacaoDeRelevanciaPorRegra");
		
		WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
		WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
		actionsMoveToElementElement(menu1);
		sleep(2000);
		menu1.click();
		sleep(1000);
		
		editar.click();
		sleep(2000);
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		
		//editar
		invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
		sleep(2000);
		
		String empreseditar=empresa.getText();
		String ufeditar=uf.getText();
		String filialeditar = filialtc2.getText();
		String tributoeditar = tributo.getText();
		String codigoderegraeditar = codigoderegra.getAttribute("value");
		String saidaeditar = saida.getAttribute("value");
		String dataeditar=datainiciovigencia.getAttribute("value");
	
		System.out.println( empreseditar);
		System.out.println( ufeditar);
		System.out.println(filialeditar);
		System.out.println(tributoeditar);
		System.out.println(codigoderegraeditar);
		System.out.println(saidaeditar);
		System.out.println(dataeditar);
	
		
		ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
		sucesso.add(empresvisualizar.equals(empreseditar));
		sucesso.add(ufvisualizar.equals(ufeditar));
		sucesso.add(filialvisualizar.equals(filialeditar));
		sucesso.add(tributovisualizar.equals(tributoeditar));
		sucesso.add(codigoderegraeditar.contains(codigoderegravisualizar));
		sucesso.add(saidavisualizar.equals(saidaeditar));
		sucesso.add(datavisualizar.equals(dataeditar));
		
		return sucesso;	
		}else {
			
			
			
			//visualizar
			String empresvisualizar = empresavi.getText();
			String ufvisualizar = ufvi.getText();
			String filialvisualizar = filialvi.getText();
			String tributovisualizar = tributovi.getText();
			String codigoderegravisualizar = codigoderegravi.getText();
			String saidavisualizar = saidavi.getText();
			String datavisualizar = datainiciovigenciavi.getText();
			
			
			
			System.out.println(empresvisualizar);
			System.out.println(ufvisualizar);
			System.out.println(filialvisualizar);
			System.out.println(tributovisualizar);
			System.out.println(codigoderegravisualizar);
			System.out.println(saidavisualizar);
			System.out.println(datavisualizar);
		
			
			biblioteca.click();
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			waitExpectElement(siguiente);
			sleep(2000);
			siguiente.click();
			
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			//pega o ultimo id que foi gerado no criar
			String idRegistro1 = idObter("DeterminacaoDeRelevanciaPorRegra");
			
			WebElement menu1 = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div"));
			WebElement editar = driver.findElement(By.xpath("//div[@data-id=\""+idRegistro1+"\"]/div[1]/div/div[2]/ul/li/span[text()=\"Editar\"]"));
			actionsMoveToElementElement(menu1);
			sleep(2000);
			menu1.click();
			sleep(1000);
			
			editar.click();
			sleep(2000);
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			
			//editar
			invisibilityOfElement("//div[@class=\"overlay loader dark\"]");
			sleep(2000);
			
			String empreseditar=empresa.getText();
			String ufeditar=uf.getText();
			String filialeditar = filial.getText();
			String tributoeditar = tributo.getText();
			String codigoderegraeditar = codigoderegra.getAttribute("value");
			String saidaeditar = saida.getAttribute("value");
			String dataeditar=datainiciovigencia.getAttribute("value");
		
			System.out.println( empreseditar);
			System.out.println( ufeditar);
			System.out.println(filialeditar);
			System.out.println(tributoeditar);
			System.out.println(codigoderegraeditar);
			System.out.println(saidaeditar);
			System.out.println(dataeditar);
		
			
			ArrayList<Boolean>  sucesso = new ArrayList<Boolean>();
			sucesso.add(empresvisualizar.equals(empreseditar));
			sucesso.add(ufvisualizar.equals(ufeditar));
			sucesso.add(filialvisualizar.equals(filialeditar));
			sucesso.add(tributovisualizar.equals(tributoeditar));
			sucesso.add(codigoderegraeditar.contains(codigoderegravisualizar));
			sucesso.add(saidavisualizar.equals(saidaeditar));
			sucesso.add(datavisualizar.equals(dataeditar));
			
			return sucesso;	
		}
	
	}	


}
