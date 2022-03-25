package com.timp.test.TBD.Configuração.CamposChaves;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.Configuracao.CamposChaves.CamposChavesCriarPO;

public class CamposChavesCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	CamposChavesCriarPO camposChavesCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		camposChavesCriarPO = new CamposChavesCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void criar() {
		loginTC.login();
		acessarTBDPO.acessarTBD();
		boolean sucesso = camposChavesCriarPO.criar();
		assertTrue(sucesso, Criar);
		sleep(3000);
	}
}
