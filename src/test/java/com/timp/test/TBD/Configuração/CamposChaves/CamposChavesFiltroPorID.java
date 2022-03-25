package com.timp.test.TBD.Configuração.CamposChaves;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.Configuracao.CamposChaves.CamposChavesFiltroPorIDPO;

public class CamposChavesFiltroPorID extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	CamposChavesFiltroPorIDPO camposChavesFiltroPorIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		camposChavesFiltroPorIDPO = new CamposChavesFiltroPorIDPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void filtro() {
		loginTC.login();
		acessarTBDPO.acessarTBD();
		boolean sucesso = camposChavesFiltroPorIDPO.filtro();
		assertTrue(sucesso, Filtros);
		sleep(3000);
	}

}
