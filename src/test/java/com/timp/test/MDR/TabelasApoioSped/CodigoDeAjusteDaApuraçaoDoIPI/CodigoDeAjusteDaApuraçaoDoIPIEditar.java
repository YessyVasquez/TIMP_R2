package com.timp.test.MDR.TabelasApoioSped.CodigoDeAjusteDaApuraçaoDoIPI;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoDeAjusteDaApuraçaoDoIPI.CodigoDeAjusteDaApuraçaoDoIPIEditarPO;

public class CodigoDeAjusteDaApuraçaoDoIPIEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoDeAjusteDaApuraçaoDoIPIEditarPO codigoDeAjusteDaApuraçaoDoIPIEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoDeAjusteDaApuraçaoDoIPIEditarPO = new CodigoDeAjusteDaApuraçaoDoIPIEditarPO();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = codigoDeAjusteDaApuraçaoDoIPIEditarPO.editar();

		assertTrue(sucesso, Editar);
	}

}
