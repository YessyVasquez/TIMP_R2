package com.timp.test.MDR.TabelasApoioSped.ClassificaçaoDeContribuintesDoIPI;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.ClassificaçaoDeContribuintesDoIPI.ClassificaçaoDeContribuintesDoIPICriarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ClassificaçaoDeContribuintesDoIPICriar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ClassificaçaoDeContribuintesDoIPICriarPO classificaçaoDeContribuintesDoIPICriarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		classificaçaoDeContribuintesDoIPICriarPO = new ClassificaçaoDeContribuintesDoIPICriarPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = classificaçaoDeContribuintesDoIPICriarPO.criar();
		assertTrue(sucesso, semAcesso);

	}

}
