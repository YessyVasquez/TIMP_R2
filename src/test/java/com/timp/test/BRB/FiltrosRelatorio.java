package com.timp.test.BRB;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.errorprone.annotations.Var;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.FiltrosPO;

public class FiltrosRelatorio extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	FiltrosPO filtrosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		filtrosPO = new FiltrosPO();

	}

	@AfterClass
	public void afterClass() {
	
	// driver.close();
	}



	@Test()
	public void AfiltrosEditor() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		

		String url = driver.getCurrentUrl();

		boolean amb = false;

		if (url.contains("tc2")) {
			amb = true;
		} else {
			amb = false;
		}
		

		boolean mostrado = false;
		mostrado = filtrosPO.AsignarFiltros();
		assertTrue(mostrado, "No está siendo mostrados");

		filtrosPO.aplicarEditor();

		ArrayList<String> empresas = new ArrayList<String>();
		empresas = (ArrayList<String>) filtrosPO.empresa();

		ArrayList<String> ufFiliais = new ArrayList<String>();
		ufFiliais = (ArrayList<String>) filtrosPO.ufFilial();

		ArrayList<String> filial = new ArrayList<String>();
		filial = (ArrayList<String>) filtrosPO.filial();

		ArrayList<Boolean> data = new ArrayList<Boolean>();
		data = (ArrayList<Boolean>) filtrosPO.data();

		if (amb == false) {
			for (int i = 0; i < empresas.size(); i++) {

				assertEquals(empresas.get(i), "1000");
				assertEquals(ufFiliais.get(i), "SP");
				assertEquals(filial.get(i), "0001");
				assertTrue(data.get(i), filtros);

			}

		} else {
			for (int i = 0; i < empresas.size(); i++) {

				assertEquals(empresas.get(i), "1000");
				assertEquals(ufFiliais.get(i), "BA");
				assertEquals(filial.get(i), "0143");
				assertTrue(data.get(i), filtros);

			}
		}

	}

	@Test(dependsOnMethods  = "AfiltrosEditor")

	public void BfiltrosBiblioteca() {

		String url = driver.getCurrentUrl();
		boolean amb = false;

		if (url.contains("tc2")) {
			amb = true;
		} else {
			amb = false;
		}

		filtrosPO.aplicarBiblioteca();

		ArrayList<String> empresas = new ArrayList<String>();
		empresas = (ArrayList<String>) filtrosPO.empresa();

		ArrayList<String> ufFiliais = new ArrayList<String>();
		ufFiliais = (ArrayList<String>) filtrosPO.ufFilial();

		ArrayList<String> filial = new ArrayList<String>();
		filial = (ArrayList<String>) filtrosPO.filial();

		ArrayList<Boolean> data = new ArrayList<Boolean>();
		data = (ArrayList<Boolean>) filtrosPO.data();

		if (amb == false) {
			for (int i = 0; i < empresas.size(); i++) {

				assertEquals(empresas.get(i), "1000");
				assertEquals(ufFiliais.get(i), "SP");
				assertEquals(filial.get(i), "0001");
				assertTrue(data.get(i), filtros);

			}

		} else {
			for (int i = 0; i < empresas.size(); i++) {

				assertEquals(empresas.get(i), "1000");
				assertEquals(ufFiliais.get(i), "BA");
				assertEquals(filial.get(i), "0143");
				assertTrue(data.get(i), filtros);

			}
		}

	}

	@Test(dependsOnMethods  = "BfiltrosBiblioteca" )
	public void CasignarValores() {

		filtrosPO.establecerValores();

	}

}
