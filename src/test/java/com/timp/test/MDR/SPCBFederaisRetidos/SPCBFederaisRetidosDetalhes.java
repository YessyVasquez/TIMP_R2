package com.timp.test.MDR.SPCBFederaisRetidos;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseKenssy;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.SPCBFederaisRetidos.SPCBFederaisRetidosDetalhesPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class SPCBFederaisRetidosDetalhes extends TestBaseKenssy {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	SPCBFederaisRetidosDetalhesPO sPCBFederaisRetidosDetalhesPO;

	@BeforeClass
	public void beforeClass() {
		driver = initializationKen();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		sPCBFederaisRetidosDetalhesPO = new SPCBFederaisRetidosDetalhesPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void detalhe() {

		loginTC.login();

		acesarMDRPO.acessarMDR();

		ArrayList<Boolean> sucesso = sPCBFederaisRetidosDetalhesPO.detalhe();

		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), Detalhes);
		}
	}

}
