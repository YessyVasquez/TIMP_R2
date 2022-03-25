package com.timp.test.TDK.Execucoes.Lixeira;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TDK.AcessarTDKPO;
import com.sap.timp.pageObjectModel.TDK.Execucoes.Lixeira.LixeiraExcluirEmMassaPO;
import com.sap.timp.pageObjectModel.TDK.Execucoes.Lixeira.LixeiraRestaurarEmMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class LixeiraExcluirEmMassa extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarTDKPO acessarTDKPO;
	LixeiraExcluirEmMassaPO lixeiraExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTDKPO = new AcessarTDKPO();
		lixeiraExcluirEmMassaPO = new LixeiraExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		 driver.close();
	}

	@Test()
	public void excluirEmMassa() {
		loginTC.login();
		acessarTDKPO.acessarTDK();

		ArrayList<Boolean> sucesso = lixeiraExcluirEmMassaPO.lixeiraExcluirEmMassa();
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), visualizaçar);
		}
	}
}
