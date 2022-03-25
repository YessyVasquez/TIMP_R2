package com.timp.test.MDR.SequenciaAcesso;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SequenciaAcesso.SequenciaCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class SequenciaCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SequenciaCriarPO sequenciaCriarPO;

	@BeforeClass
	public void beforeClass() {


		driver = initialization();

		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		sequenciaCriarPO = new SequenciaCriarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean text = sequenciaCriarPO.criar();

		assertTrue(text, Criar);
		// Teste pra conferir se conseguiu acesssar o sistema
		assertTrue(sequenciaCriarPO.mostrar.isDisplayed(), semAcesso);

	}

}
