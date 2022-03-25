package com.timp.test.MDR.TabelasApoioSped.CodigosDasObrigaçoesDeICMSaRecolher;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ParametrosContabilizacao.ContasDefaultParaExtemporaneo.ContasDefaultParaExtemporaneoExcluirPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigosDasObrigaçoesDeICMSaRecolher.CodigosDasObrigaçoesDeICMSaRecolherExcluirPO;

public class CodigosDasObrigaçoesDeICMSaRecolherExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigosDasObrigaçoesDeICMSaRecolherExcluirPO codigosDasObrigaçoesDeICMSaRecolherExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigosDasObrigaçoesDeICMSaRecolherExcluirPO = new CodigosDasObrigaçoesDeICMSaRecolherExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void excluir() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = codigosDasObrigaçoesDeICMSaRecolherExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
