package com.sap.timp.pageObjectModel.Calendar.ParametrosGerais;



import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sap.timp.base.TestBaseSteven;

public class TarefasAbrirCalendarioPO extends TestBaseSteven{

	@FindBy(xpath = "//span[text()=\"Calendário de Usuários\"]")
	public WebElement calendario;
	
	@FindBy(xpath = "//span[text()=\"Mostrar Filtros\"]")
	public WebElement mostrarFiltros;
	
	@FindBy(xpath = "//span[text()=\"Abrir Calendário\"]")
	public WebElement abrirCalendario;
	
	@FindBy(xpath = "//div[@class=\"title\"]")
	public WebElement titulo;
	
	@FindBy(xpath = "//div[@id=\"month-wrapper\"]")
	public WebElement calendarioAberto;
	
	@FindBy(xpath = "//textarea[@placeholder=\"Descrição\"]")
	public WebElement descricao;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"início\")]")
	public WebElement inicio;
	
	@FindBy(xpath = "//input[contains(@placeholder,\"vencimento\")]")
	public WebElement vencimento;
	
	@FindBy(xpath = "//button[text()=\"Gravar\"]")
	public WebElement gravar;
	
	@FindBy(xpath = "//div[contains(@class,\"icon-right\")][2]")
	public WebElement siguiente;
	
	@FindBy(xpath = "//button[text()=\"Excluir\"]")
	public WebElement excluir;

	public TarefasAbrirCalendarioPO() {

		PageFactory.initElements(driver, this);
	}

	
	public boolean abrirCalendario() {
		
		mostrarFiltros.click();
		sleep(2000);
		abrirCalendario.click();
		sleep(3000);
		waitExpectXpath("//div[@class=\"day\"][1]");
		sleep(2000);
		
		String tituloS = titulo.getText();
		System.out.println("Titulo: "+ tituloS);
		
		String ano = fechaActual();
		
		String mesSplit[] = ano.split("/");

		
		int mesI = convertToInt(mesSplit[1]);
		String anoS = mesSplit[2];
		
		System.out.println("Mes Número: " + mesSplit[1]);
		
		String mesLetra ="";
		
		
		
		
		switch (mesI) {
		case 1:
			mesLetra = "Janeiro, " + anoS;
			break;
		case 2:
			mesLetra = "Fevereiro, " + anoS;
			break;
			
		case 3:
			mesLetra = "Março, " + anoS;
			break;
			
		case 4:
			mesLetra = "Abril, " + anoS;
			break;
			
		case 5:
			mesLetra = "Maio, " + anoS;
			break;
			
		case 6:
			mesLetra = "Junho, " + anoS;
			break;
			
		case 7:
			mesLetra = "Julho, " + anoS;
			break;
		
		case 8:
			mesLetra = "Agosto, " + anoS;
			break;
			
		case 9:
			mesLetra = "Setembro, " + anoS;
			break;
			
		case 10:
			mesLetra = "Outubro, " + anoS;
			break;
			
		case 11:
			mesLetra = "Novembro, " + anoS;
			break;
			
		case 12:
			mesLetra = "Dezembro, " + anoS;
			break;

		default:
			break;
		}

		System.out.println("Mes en Letras: " + mesLetra);
		
		System.out.println(mesLetra.equals(tituloS));
		boolean sucesso = mesLetra.equals(tituloS);
		return sucesso;
		
		
		
	}
	

	
}
