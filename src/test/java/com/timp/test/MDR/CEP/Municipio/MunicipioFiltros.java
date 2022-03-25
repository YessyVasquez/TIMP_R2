package com.timp.test.MDR.CEP.Municipio;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Municipio.MunicipioFiltroPO;

public class MunicipioFiltros extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	MunicipioFiltroPO municipioFiltroPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		municipioFiltroPO = new MunicipioFiltroPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtros() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = municipioFiltroPO.filtro();

		assertTrue(sucesso, Editar);
		sleep(2000);
	}
}
