package com.timp.test.TFP.Periodos.SubPeriodoPeriodicidade;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Periodos.SubPeriodoPeriodicidade.SubPeriodoPeriodicidadeAlterarStatusSubperiodoAvulsoPO;
import com.sap.timp.pageObjectModel.TFP.Periodos.SubPeriodoPeriodicidade.SubPeriodoPeriodicidadeFiltroPorIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class SubPeriodoPeriodicidadeAlterarStatusSubperiodoAvulso extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	SubPeriodoPeriodicidadeAlterarStatusSubperiodoAvulsoPO subPeriodoPeriodicidadeAlterarStatusSubperiodoAvulsoPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		subPeriodoPeriodicidadeAlterarStatusSubperiodoAvulsoPO = new SubPeriodoPeriodicidadeAlterarStatusSubperiodoAvulsoPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void filtro() {

		loginTC.login();

		acessarTFPPO.acessarTFP();

		ArrayList<Boolean> sucesso = subPeriodoPeriodicidadeAlterarStatusSubperiodoAvulsoPO.alterarStatusSubperiodoAvulso();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), filtros);
		}

	}

}
