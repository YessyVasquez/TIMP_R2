package com.timp.test.TFP.Periodos.Periodos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Periodos.Periodos.PeriodosAlterarStatusSubPeriodoAvulsoPO;
import com.sap.timp.pageObjectModel.TFP.Periodos.Periodos.PeriodosAlterarPeriodosEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class PeriodosAlterarPeriodosEmMassa extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	PeriodosAlterarPeriodosEmMassaPO periodosAlterarPeriodosEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		periodosAlterarPeriodosEmMassaPO = new PeriodosAlterarPeriodosEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void alterarPeriodoEmMassa() {

		loginTC.login();

		acessarTFPPO.acessarTFP();

		//periodosAlterarPeriodosEmMassaPO.alterarPeriodoEmMassa();		
		ArrayList<Boolean> sucesso = periodosAlterarPeriodosEmMassaPO.alterarPeriodoEmMassa();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), filtros);
		}

	}
}
