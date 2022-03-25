package com.timp.test.MDR.TabelasApoioSped.ClassificaçaoDeContribuintesDoIPI;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.ClassificaçaoDeContribuintesDoIPI.ClassificaçaoDeContribuintesDoIPIExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class ClassificaçaoDeContribuintesDoIPIExcluirMassa extends TestBaseFernando {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ClassificaçaoDeContribuintesDoIPIExcluirMassaPO classificaçaoDeContribuintesDoIPIExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		classificaçaoDeContribuintesDoIPIExcluirMassaPO = new ClassificaçaoDeContribuintesDoIPIExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = classificaçaoDeContribuintesDoIPIExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);
	}

	@Test(dependsOnMethods = "criar")
	public void excluirMassa() {
		boolean sucesso = classificaçaoDeContribuintesDoIPIExcluirMassaPO.exluirMassa();
		assertTrue(sucesso, Eliminado);

	}

}
