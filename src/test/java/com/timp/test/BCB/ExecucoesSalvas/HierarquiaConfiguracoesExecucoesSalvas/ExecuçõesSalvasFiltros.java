package com.timp.test.BCB.ExecucoesSalvas.HierarquiaConfiguracoesExecucoesSalvas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ExecucoesSalvas.HierarquiaConfiguracoesExecucoesSalvas.ExecuçõesSalvasFiltrosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ExecuçõesSalvasFiltros extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ExecuçõesSalvasFiltrosPO execuçõesSalvasFiltrosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		execuçõesSalvasFiltrosPO = new ExecuçõesSalvasFiltrosPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
		
	}

	@Test(priority = 0)
	public void login() {
		loginTC.login();

	}

	@Test(priority = 1)
	public void acessarTCC() {

		boolean sucesso = acessarBCBPO.acessar();
		System.out.println(sucesso);
		assertTrue(sucesso,Acessar);

	}

	@Test(priority = 2)
	public void filtrosAvancados() {

		execuçõesSalvasFiltrosPO.Filtros();

		ArrayList<Boolean> empresa = execuçõesSalvasFiltrosPO.filtroHierarquia();
		for (int i = 0; i < empresa.size(); i++) {
			assertTrue(empresa.get(i), Filtros);
		}
		
		ArrayList<Boolean> empresa1 = execuçõesSalvasFiltrosPO.filtroEmpresa();
		for (int i = 0; i < empresa1.size(); i++) {
			assertTrue(empresa1.get(i), Filtros);
		}
	}


}
