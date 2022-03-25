package com.timp.test.MDR.TabelasApoioSped.ClassificaçaoDeContribuintesDoIPI;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.ClassificaçaoDeContribuintesDoIPI.ClassificaçaoDeContribuintesDoIPIFiltrosAvançadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class ClassificaçaoDeContribuintesDoIPIFiltrosAvançados extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ClassificaçaoDeContribuintesDoIPIFiltrosAvançadosPO classificaçaoDeContribuintesDoIPIFiltrosAvançadosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		classificaçaoDeContribuintesDoIPIFiltrosAvançadosPO = new ClassificaçaoDeContribuintesDoIPIFiltrosAvançadosPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	@Test()
	public void filtros() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		// classificaçaoDeContribuintesDoIPIFiltrosAvançadosPO.filtros();

		ArrayList<Boolean> sucesso = classificaçaoDeContribuintesDoIPIFiltrosAvançadosPO.filtros();
		// sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The results in the filter aren't equal");
		}

	}

}
