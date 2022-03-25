package com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoFiltrosAvançadosPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;

public class CodigoTipoCreditoFiltrosAvançados extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoTipoCreditoFiltrosAvançadosPO codigoTipoCreditoFiltrosAvançadosPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoTipoCreditoFiltrosAvançadosPO = new CodigoTipoCreditoFiltrosAvançadosPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void filtros() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		// codigoTipoCreditoFiltrosAvançadosPO.filtros();

		ArrayList<Boolean> sucesso = codigoTipoCreditoFiltrosAvançadosPO.filtros();
		sleep(2000);
		for (int i = 0; i < sucesso.size(); i++) {
			assertTrue(sucesso.get(i), "The results in the filter aren't equal");
		}

	}

}
