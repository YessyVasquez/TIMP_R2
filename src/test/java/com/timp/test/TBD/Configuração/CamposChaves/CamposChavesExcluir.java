package com.timp.test.TBD.Configuração.CamposChaves;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TBD.AcessarTBDPO;
import com.sap.timp.pageObjectModel.TBD.Configuracao.CamposChaves.CamposChavesExcluitPO;

public class CamposChavesExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTBDPO acessarTBDPO;
	CamposChavesExcluitPO camposChavesExcluitPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTBDPO = new AcessarTBDPO();
		camposChavesExcluitPO = new CamposChavesExcluitPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	

	@Test()
	public void excluir() {
		loginTC.login();
		acessarTBDPO.acessarTBD();
		boolean sucesso = camposChavesExcluitPO.excluir();
		assertTrue(sucesso, Eliminado);
		sleep(3000);
	}

}
