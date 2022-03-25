package com.timp.test.MDR.TabelasApoioSped.CFOP;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CFOP.CFODetalhePO;
import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CFOP.CFOPFiltrosAvancadosPO;
import com.sap.timp.pageObjectModel.TCC.AcessarTCCPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CFOPFiltrosAvancados extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acesarMDRPO;
	CFOPFiltrosAvancadosPO cFOPFiltrosAvancadosPO;

	@BeforeClass
	public void beforeClass() {
		driver = initialization();
		loginTC = new LoginTC();
		acesarMDRPO = new AcessarMDRPO();
		cFOPFiltrosAvancadosPO = new CFOPFiltrosAvancadosPO();
	}

	@AfterClass
	public void afterClass() {
	}

	@Test(priority = 0)
	public void ingresar() {
		loginTC.login();
	}

	@Test(priority = 2)
	public void mdrEntrar() {
		acesarMDRPO.acessarMDR();
	}

	@Test(priority = 3)
	public void filtros() {

		// codigoTipoCreditoFiltrosAvançadosPO.filtros();

		ArrayList<Boolean> sucesso = cFOPFiltrosAvancadosPO.filtros();
		sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The results in the filter aren't equal");
		}

	}
}
