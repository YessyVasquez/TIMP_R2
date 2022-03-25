package com.timp.test.TFP.Periodos.Periodos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configurações.Configurações.Período.ConfiguraçõesPeríodoFiltroPorIdPO;
import com.sap.timp.pageObjectModel.TFP.Configurações.Status.SubPeriodo.SubPeriodoFiltroPorIdPO;
import com.sap.timp.pageObjectModel.TFP.Periodos.Periodos.PeriodoFiltroPorIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class PeriodosFiltroPorId extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	PeriodoFiltroPorIdPO periodoFiltroPorIdPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		periodoFiltroPorIdPO = new PeriodoFiltroPorIdPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtro() {

		loginTC.login();

		acessarTFPPO.acessarTFP();

		ArrayList<Boolean> sucesso = periodoFiltroPorIdPO.filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), filtros);
		}

	}

}
