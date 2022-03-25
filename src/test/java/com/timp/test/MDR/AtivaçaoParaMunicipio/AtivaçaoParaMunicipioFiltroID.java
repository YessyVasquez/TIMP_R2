package com.timp.test.MDR.AtivaçaoParaMunicipio;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.AtivaçaoParaMunicipio.AtivaçaoParaMunicipioFiltroIDPO;

public class AtivaçaoParaMunicipioFiltroID extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	AtivaçaoParaMunicipioFiltroIDPO ativaçaoParaMunicipioFiltroIDPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		ativaçaoParaMunicipioFiltroIDPO = new AtivaçaoParaMunicipioFiltroIDPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtro() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = ativaçaoParaMunicipioFiltroIDPO.filtro();

		assertTrue(sucesso, Filtros);
		sleep(2000);

	}
}
