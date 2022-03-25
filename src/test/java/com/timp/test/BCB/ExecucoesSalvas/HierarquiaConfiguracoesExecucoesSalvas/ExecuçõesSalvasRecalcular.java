package com.timp.test.BCB.ExecucoesSalvas.HierarquiaConfiguracoesExecucoesSalvas;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.BCB.AcessarBCBPO;
import com.sap.timp.pageObjectModel.BCB.ExecucoesSalvas.HierarquiaConfiguracoesExecucoesSalvas.ExecuçõesSalvasRecalcularPO;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.CentralizaçãoDeTributos.CentralizaçãoDeTributosFiltroXIDPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ExecuçõesSalvasRecalcular extends TestBaseSteven {
	LoginTC loginTC;
	AcessarBCBPO acessarBCBPO;
	ExecuçõesSalvasRecalcularPO execuçõesSalvasRecalcularPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarBCBPO = new AcessarBCBPO();
		execuçõesSalvasRecalcularPO = new ExecuçõesSalvasRecalcularPO();
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
	public void Filtro() {

		
		
		boolean sucesso = execuçõesSalvasRecalcularPO.Filtros();
		assertTrue(sucesso, Criar);
		

	}

}
