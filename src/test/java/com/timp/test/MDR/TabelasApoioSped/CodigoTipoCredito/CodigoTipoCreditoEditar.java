package com.timp.test.MDR.TabelasApoioSped.CodigoTipoCredito;

import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;

import com.sap.timp.pageObjectModel.MDR.TabelasApoioSped.CodigoTipoCredito.CodigoTipoCreditoEditarPO;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;

public class CodigoTipoCreditoEditar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	CodigoTipoCreditoEditarPO codigoTipoCreditoEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		codigoTipoCreditoEditarPO = new CodigoTipoCreditoEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		// codigoTipoCreditoEditarPO.editar();

		boolean sucesso = codigoTipoCreditoEditarPO.editar();
		assertTrue(sucesso, Editar);
		// assertEquals(sucesso, "edit", visualizaçar);

	}
}
