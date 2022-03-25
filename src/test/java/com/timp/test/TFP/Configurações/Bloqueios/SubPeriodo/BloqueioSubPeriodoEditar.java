package com.timp.test.TFP.Configurações.Bloqueios.SubPeriodo;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configurações.Bloqueios.SubPeriodo.BloqueioSubPeriodoEditarPO;

public class BloqueioSubPeriodoEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	BloqueioSubPeriodoEditarPO bloqueioSubPeriodoEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		bloqueioSubPeriodoEditarPO = new BloqueioSubPeriodoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void editar() {
		
		loginTC.login();
		acessarTFPPO.acessarTFP();

		ArrayList<Boolean> sucesso = bloqueioSubPeriodoEditarPO.editar();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Editar);
		}
		sleep(3000);
	}
}
