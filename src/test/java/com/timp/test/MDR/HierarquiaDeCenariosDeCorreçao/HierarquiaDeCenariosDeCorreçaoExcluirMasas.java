package com.timp.test.MDR.HierarquiaDeCenariosDeCorreçao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseMassiel;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.HierarquiaDeCenariosDeCorreçao.HierarquiaDeCenariosDeCorreçaoExcluirMasasPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class HierarquiaDeCenariosDeCorreçaoExcluirMasas extends TestBaseMassiel {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	HierarquiaDeCenariosDeCorreçaoExcluirMasasPO hierarquiaDeCenariosDeCorreçaoExcluirMasasPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationM();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		hierarquiaDeCenariosDeCorreçaoExcluirMasasPO = new HierarquiaDeCenariosDeCorreçaoExcluirMasasPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = hierarquiaDeCenariosDeCorreçaoExcluirMasasPO.criar();
		assertTrue(sucesso, Criar);

	}

	@Test(dependsOnMethods = "criar")
	public void excluir() {

		boolean sucesso2 = hierarquiaDeCenariosDeCorreçaoExcluirMasasPO.HierarquiaDeCenariosDeCorreçaoExcluirMasas();
		assertTrue(sucesso2, Eliminado);
	}

}
