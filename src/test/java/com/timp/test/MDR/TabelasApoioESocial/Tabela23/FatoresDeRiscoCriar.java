package com.timp.test.MDR.TabelasApoioESocial.Tabela23;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela16.SGDPCriarPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioESocial.Tabela23.FatoresDeRiscoCriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class FatoresDeRiscoCriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	FatoresDeRiscoCriarPO factoresDeRiscoCriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		factoresDeRiscoCriarPO = new FatoresDeRiscoCriarPO();
	}

	@AfterClass
	public void afterClass() {

		driver.close();

	}

	@Test()
	public void criar() {

		loginTC.login();

		acessarMDRPO.acessarMDR();

		boolean sucesso = factoresDeRiscoCriarPO.criar();

		assertTrue(sucesso, Criar);

	}
}
