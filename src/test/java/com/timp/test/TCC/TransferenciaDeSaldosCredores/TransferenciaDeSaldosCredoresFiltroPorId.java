package com.timp.test.TCC.TransferenciaDeSaldosCredores;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;
import com.sap.timp.pageObjectModel.TCC.TransferenciaDeSaldosCredores.TransferenciaDeSaldosCredoresFiltroPorIdPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class TransferenciaDeSaldosCredoresFiltroPorId extends TestBaseKenssy{
	LoginTC loginTC;
	AcessarTCCPO acessarTCCPO;
	TransferenciaDeSaldosCredoresFiltroPorIdPO transferenciaDeSaldosCredoresFiltroPorIdPO;

	@BeforeClass
	public void beforeClass() {

		driver = initializationKen();
		loginTC = new LoginTC();
		acessarTCCPO = new AcessarTCCPO();
		transferenciaDeSaldosCredoresFiltroPorIdPO = new TransferenciaDeSaldosCredoresFiltroPorIdPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}



	@Test
	public void filtroPorId() {
		loginTC.login();
		acessarTCCPO.acessarTCC();
		boolean sucesso = transferenciaDeSaldosCredoresFiltroPorIdPO.filtroPorId();
		assertTrue(sucesso, Filtros);
	}
}
