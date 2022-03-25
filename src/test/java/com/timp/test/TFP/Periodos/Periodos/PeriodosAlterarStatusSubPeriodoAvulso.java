package com.timp.test.TFP.Periodos.Periodos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Periodos.Periodos.PeriodosAlterarStatusSubPeriodoAvulsoPO;
import com.sap.timp.pageObjectModel.TFP.Periodos.Periodos.PeriodoFiltroPorIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class PeriodosAlterarStatusSubPeriodoAvulso extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	PeriodosAlterarStatusSubPeriodoAvulsoPO periodoAlterarStatusSubPeriodoAvulsoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		periodoAlterarStatusSubPeriodoAvulsoPO = new PeriodosAlterarStatusSubPeriodoAvulsoPO();
	}

	@AfterClass
	public void afterClass() {
		//Sdriver.close();
	}

	@Test()
	public void alterarStatusSubPeriodo() {

		loginTC.login();

		acessarTFPPO.acessarTFP();

		//periodoAlterarStatusSubPeriodoAvulsoPO.periodoAlterar();
		
		ArrayList<Boolean> sucesso = periodoAlterarStatusSubPeriodoAvulsoPO.alterarStatusSubPeriodo();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), filtros);
		}

	}

}
