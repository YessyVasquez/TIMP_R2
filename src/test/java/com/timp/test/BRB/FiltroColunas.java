package com.timp.test.BRB;


import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BRB.AcessarBrbPO;
import com.sap.timp.pageObjectModel.BRB.FiltroColunasPO;

public class FiltroColunas extends TestBaseSteven {

	LoginTC loginTC;
	AcessarBrbPO acessarBrbPO;
	FiltroColunasPO filtroColunasPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBrbPO = new AcessarBrbPO();
		filtroColunasPO = new FiltroColunasPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void filtroConFerramenta1() {
		
		loginTC.login();
		
		acessarBrbPO.acessar();
		

		boolean sucesso = false;
		sucesso = filtroColunasPO.filtroFerramenta();

		assertTrue(sucesso, aplicaçãoFiltros);
		System.out.println(sucesso);

		ArrayList<Boolean> sucesso2 = new ArrayList<Boolean>();
		sucesso2 = filtroColunasPO.aplicar();
		System.out.println(sucesso2);
		for (int i = 0; i < sucesso2.size(); i++) {
			assertTrue(sucesso2.get(i), filtros);
		}

	}

	@Test()
	public void filtroConFerramenta2() {

		boolean sucesso = false;
		sucesso = filtroColunasPO.filtroFerramenta2();

		assertTrue(sucesso, filtros);
		System.out.println(sucesso);
		ArrayList<Boolean> sucesso2 = new ArrayList<Boolean>();
		sucesso2 = filtroColunasPO.aplicar2();
		System.out.println(sucesso2);
		for (int i = 0; i < sucesso2.size(); i++) {
			assertTrue(sucesso2.get(i), filtros);
		}

	}

}
