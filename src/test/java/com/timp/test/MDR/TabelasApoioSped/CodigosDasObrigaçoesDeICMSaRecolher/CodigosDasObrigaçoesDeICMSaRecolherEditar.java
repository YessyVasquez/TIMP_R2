package com.timp.test.MDR.TabelasApoioSped.CodigosDasObrigaçoesDeICMSaRecolher;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo.ContasDefaultParaExtemporaneoEditarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigosDasObrigaçoesDeICMSaRecolher.CodigosDasObrigaçoesDeICMSaRecolherEditarPO;

public class CodigosDasObrigaçoesDeICMSaRecolherEditar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigosDasObrigaçoesDeICMSaRecolherEditarPO codigosDasObrigaçoesDeICMSaRecolherEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigosDasObrigaçoesDeICMSaRecolherEditarPO = new CodigosDasObrigaçoesDeICMSaRecolherEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = codigosDasObrigaçoesDeICMSaRecolherEditarPO.editar();

		assertTrue(sucesso, Editar);
	}

}
