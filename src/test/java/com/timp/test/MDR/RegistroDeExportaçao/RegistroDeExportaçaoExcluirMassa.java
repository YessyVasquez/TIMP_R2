package com.timp.test.MDR.RegistroDeExportaçao;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.DetalheTipoTributo.DetalheExcluirMassaPO;
import com.sap.timp.pageObjectModel.MDR.RegistroDeExportaçao.RegistroDeExportaçaoExcluirMassaPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class RegistroDeExportaçaoExcluirMassa extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroDeExportaçaoExcluirMassaPO registroDeExportaçaoExcluirMassaPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroDeExportaçaoExcluirMassaPO = new RegistroDeExportaçaoExcluirMassaPO();
	}

	@AfterClass
	public void afterClass() {
		// driver.close();
	}

	@Test()
	public void criar() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = registroDeExportaçaoExcluirMassaPO.criar();
		assertTrue(sucesso, Criar);

	}

	@Test(dependsOnMethods = "criar")
	public void Excluir() {

		boolean sucesso2 = registroDeExportaçaoExcluirMassaPO.exluirMassa();
		assertTrue(sucesso2, Eliminado);
	}

}
