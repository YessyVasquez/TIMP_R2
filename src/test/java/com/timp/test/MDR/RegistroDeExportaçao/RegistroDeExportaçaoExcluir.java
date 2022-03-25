package com.timp.test.MDR.RegistroDeExportaçao;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.RegistroDeExportaçao.RegistroDeExportaçaoExcluirPO;

public class RegistroDeExportaçaoExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	RegistroDeExportaçaoExcluirPO registroDeExportaçaoExcluirPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		registroDeExportaçaoExcluirPO = new RegistroDeExportaçaoExcluirPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	@Test()
	public void Excluir() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = registroDeExportaçaoExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);
	}
}
