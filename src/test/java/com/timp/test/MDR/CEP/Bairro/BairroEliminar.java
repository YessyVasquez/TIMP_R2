package com.timp.test.MDR.CEP.Bairro;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sap.timp.base.TestBaseSteven;
import com.sap.timp.pageObjectModel.ADM.LoginTC;
import com.sap.timp.pageObjectModel.MDR.AcessarMDRPO;
import com.sap.timp.pageObjectModel.MDR.CEP.Bairro.BairroEliminarPO;

public class BairroEliminar extends TestBaseSteven {
	LoginTC loginTC;
	AcessarMDRPO acessarMDRPO;
	BairroEliminarPO bairroEliminarPO;

	@BeforeClass
	public void beforeClass() {

		driver = initialization();
		loginTC = new LoginTC();
		acessarMDRPO = new AcessarMDRPO();
		bairroEliminarPO = new BairroEliminarPO();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


	@Test()
	public void eliminar() {
		
		loginTC.login();

		acessarMDRPO.acessarMDR();
		
		boolean sucesso = bairroEliminarPO.eliminar();

		assertTrue(sucesso, Eliminado);
		sleep(2000);
	}
}
