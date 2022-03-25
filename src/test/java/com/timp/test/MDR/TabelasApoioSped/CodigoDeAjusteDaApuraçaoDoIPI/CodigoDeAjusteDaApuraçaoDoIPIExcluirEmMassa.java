package com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApuraçaoDoIPI;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoDeAjusteDaApuraçaoDoIPI.CodigoDeAjusteDaApuraçaoDoIPIExcluirEmMassaPO;

public class CodigoDeAjusteDaApuraçaoDoIPIExcluirEmMassa extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoDeAjusteDaApuraçaoDoIPIExcluirEmMassaPO codigoDeAjusteDaApuraçaoDoIPIExcluirEmMassaPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoDeAjusteDaApuraçaoDoIPIExcluirEmMassaPO = new CodigoDeAjusteDaApuraçaoDoIPIExcluirEmMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = codigoDeAjusteDaApuraçaoDoIPIExcluirEmMassaPO.criar();
		assertTrue(sucesso, Criar);
		sleep(1000);
		boolean sucesso2 = codigoDeAjusteDaApuraçaoDoIPIExcluirEmMassaPO.excluir();
		assertTrue(sucesso2, Eliminado);

	}

}
