package com.timp.test.MDR.ValorAdicionado.Municipio;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.ValorAdicionado.Municipio.MunicipioEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class MunicipioEditar extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO accesarMDRPO;
	MunicipioEditarPO municipioEditarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		accesarMDRPO = new AcessarMDRPO();
		loginTC = new LoginTC();
		municipioEditarPO = new MunicipioEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void editar() {

		loginTC.login();
		accesarMDRPO.acessarMDR();

		boolean sucesso = municipioEditarPO.Editar();
		assertTrue(sucesso, Editar);

	}
}
