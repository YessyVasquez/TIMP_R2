package com.timp.test.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.PrecoDeTransferencia.ModeloDeApuracaoTP.ModeloDeApuracaoTPEditarPO;

public class ModeloDeApuracaoTPEditar extends TestBaseSteven {

	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	ModeloDeApuracaoTPEditarPO modeloDeApuracaoTPEditarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		modeloDeApuracaoTPEditarPO = new ModeloDeApuracaoTPEditarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@Test()
	public void editar() {
		loginTC.login();
		acessarMDRPO.acessarMDR();
		
		boolean sucesso = modeloDeApuracaoTPEditarPO.editar();
		assertTrue(sucesso, Editar);

	}

}
