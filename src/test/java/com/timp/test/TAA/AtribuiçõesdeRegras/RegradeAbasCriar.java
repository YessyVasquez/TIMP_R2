package com.timp.test.TAA.AtribuiçõesdeRegras;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TAA.AcessarTAAPO;
import com.sap.timp.pageObjectModel.TAA.Agendamento.AgendamentoCriarPO;
import com.sap.timp.pageObjectModel.TAA.AtribuiçõesdeRegras.RegradeAbasCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegradeAbasCriar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarTAAPO acessarTAAPO;
	RegradeAbasCriarPO regradeAbasCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarTAAPO = new AcessarTAAPO();
		regradeAbasCriarPO = new RegradeAbasCriarPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarTAAPO.acessarTAA();
		boolean sucesso = regradeAbasCriarPO.criar();
		assertTrue(sucesso, Criar);
		sleep(2000);
	}

}
