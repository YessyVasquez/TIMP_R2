package com.timp.test.TFP.Configurações.Bloqueios.SubPeriodo;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TFP.AcessarTFPPO;
import com.sap.timp.pageObjectModel.TFP.Configurações.Bloqueios.SubPeriodo.BloqueioSubPeríodoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class BloqueioSubPeriodo extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTFPPO acessarTFPPO;
	BloqueioSubPeríodoCriarPO bloqueioSubPeríodoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarTFPPO = new AcessarTFPPO();
		bloqueioSubPeríodoCriarPO = new BloqueioSubPeríodoCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test()
	public void criar() {
		
		loginTC.login();
		acessarTFPPO.acessarTFP();

		ArrayList<Boolean> sucesso = bloqueioSubPeríodoCriarPO.criar();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Criar);
		}
		sleep(3000);

	}

}
