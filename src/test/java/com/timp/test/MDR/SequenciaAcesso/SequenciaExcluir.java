package com.timp.test.MDR.SequenciaAcesso;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SequenciaAcesso.SequenciaExcluirPO;
import com.sap.timp.pageObjectModel.MDR.SequenciaAcesso.SequenciaVisualizarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class SequenciaExcluir extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	SequenciaExcluirPO sequenciaExcluirPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		sequenciaExcluirPO = new SequenciaExcluirPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void Excluir() {

		loginTC.login();
		acessarMDRPO.acessarMDR();

		boolean sucesso = sequenciaExcluirPO.excluir();
		assertTrue(sucesso, Eliminado);

	}

}
