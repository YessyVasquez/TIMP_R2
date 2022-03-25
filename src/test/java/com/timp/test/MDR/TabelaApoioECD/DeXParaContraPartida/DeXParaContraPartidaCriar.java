package com.timp.test.MDR.TabelaApoioECD.DeXParaContraPartida;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseFernando;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelaApoioECD.DeXParaContraPartida.DeXParaContraPartidaCriarPO;

public class DeXParaContraPartidaCriar extends TestBaseFernando{
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	DeXParaContraPartidaCriarPO deXParaContraPartidaCriarPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationF();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		deXParaContraPartidaCriarPO = new DeXParaContraPartidaCriarPO();
	}

	@AfterClass
	public void afterClass() {
	//	driver.close();
	}

	@Test()
	public void criar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		boolean sucesso = deXParaContraPartidaCriarPO.criar();
		assertTrue(sucesso, Criar);
	}
}
