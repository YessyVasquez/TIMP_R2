package com.timp.test.MDR.RegistroECAC;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.RegistroECAC.RegistroECACFiltrosAvanPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class RegistroECACFiltrosAvan extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroECACFiltrosAvanPO registroECACFiltrosAvanPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationKen();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroECACFiltrosAvanPO = new RegistroECACFiltrosAvanPO();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtrarAvanRegistroECAC() {
		loginTC.login();
		acessarMDRPO.acessarMDR();

		ArrayList<Boolean> empresa = registroECACFiltrosAvanPO.filtroEmpresa();
		for (int i = 0; i < empresa.size(); i++) {
			assertTrue(empresa.get(i), Filtros);
		}

		ArrayList<Boolean> filial = registroECACFiltrosAvanPO.filtroFilial();
		for (int i = 0; i < filial.size(); i++) {
			assertTrue(filial.get(i), Filtros);
		}

	}

}
