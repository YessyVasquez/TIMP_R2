package com.timp.test.MDR.TabelasApoioSped.AjusteEInformaçoesDeValores;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.AjusteEInformaçoesDeValores.AjusteEInformaçoesDeValoresCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.InformaçoesAdicionais.InformaçoesAdicionaisCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class AjusteEInformaçoesDeValoresCriar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AjusteEInformaçoesDeValoresCriarPO ajusteEInformaçoesDeValoresCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ajusteEInformaçoesDeValoresCriarPO = new AjusteEInformaçoesDeValoresCriarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		// ajusteEInformaçoesDeValoresCriarPO.criar();

		boolean sucesso = ajusteEInformaçoesDeValoresCriarPO.criar();

		assertTrue(sucesso, semAcesso);

	}

}
