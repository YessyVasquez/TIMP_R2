package com.timp.test.TFP.Configurações.Bloqueios.Periodo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configurações.Bloqueios.Periodo.PeriodoFiltroIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class PeriodoFiltroId extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	PeriodoFiltroIdPO periodoFiltroIdPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		periodoFiltroIdPO = new PeriodoFiltroIdPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Filtro() {
		loginTC.login();
		acessarTFPPO.acessarTFP();
		ArrayList<Boolean> sucesso = periodoFiltroIdPO.filtro();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}

		sleep(3000);
	}

}
